package al7osam.com.edumvvmupdate.viewModel;

import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;
import android.content.Context;
import android.databinding.ObservableField;
import android.databinding.ObservableInt;
import android.os.StrictMode;
import android.view.View;

import java.util.HashMap;
import java.util.List;

import al7osam.com.edumvvmupdate.R;
import al7osam.com.edumvvmupdate.model.BlogDto;
import al7osam.com.edumvvmupdate.model.BlogsOutput;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import static al7osam.com.edumvvmupdate.App.AppController.create;

/**
 * Created by eman.eraqi on 1/23/2019.
 */

public class BlogViewModel extends ViewModel {
    public ObservableInt blogRecycler;
    public ObservableInt blogLabel;
    public ObservableField<String> messageLabel;
    Context context;
    MutableLiveData<List<BlogDto>> data;
    private CompositeDisposable compositeDisposable = new CompositeDisposable();

    public BlogViewModel(Context context) {
        this.context = context;
        data = new MutableLiveData<>();
        blogRecycler = new ObservableInt(View.VISIBLE);
        blogLabel = new ObservableInt(View.GONE);
        messageLabel = new ObservableField<>("default_message_loading_users");
        getAllBlogsServices();
    }

    public void getAllBlogsServices() {
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("generalBlogs", true);
        hashMap.put("start", 0);
        hashMap.put("length", 10);
        callService(hashMap);
    }

    private void callService(HashMap<String, Object> hashMap) {
        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);
        create(context).getAppServices().GetBlogsObserver(hashMap, "application/json", "en")
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<BlogsOutput>() {
                    @Override
                    public void accept(BlogsOutput userResponse) throws Exception {
                        onGetSuccess(userResponse.getBlogs());
                        blogLabel.set(View.GONE);
                        blogRecycler.set(View.VISIBLE);
                    }
                }, new Consumer<Throwable>() {
                    @Override
                    public void accept(Throwable throwable) throws Exception {

                        messageLabel.set(context.getString(R.string.error_message_loading_users));
                        blogLabel.set(View.VISIBLE);
                        blogRecycler.set(View.GONE);
                    }
                });
    }


    public void onGetSuccess(List<BlogDto> liveData) {
        data.setValue(liveData);
    }

    public int getBlogSize() {
        return data.getValue().size();
    }

    public BlogDto getSpeciesAt(int position) {
        if (position < getBlogSize()) {
            return data.getValue().get(position);
        } else
            return null;

    }


    public MutableLiveData<List<BlogDto>> getBlogs() {
        return data;
    }


    private void unSubscribeFromObservable() {
        if (compositeDisposable != null && !compositeDisposable.isDisposed()) {
            compositeDisposable.dispose();
        }
    }

    public void reset() {
        unSubscribeFromObservable();
        compositeDisposable = null;
        context = null;
    }

}
