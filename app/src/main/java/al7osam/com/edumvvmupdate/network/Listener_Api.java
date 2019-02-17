package al7osam.com.edumvvmupdate.network;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.content.Context;
import android.os.StrictMode;

import java.util.HashMap;
import java.util.List;

import al7osam.com.edumvvmupdate.R;
import al7osam.com.edumvvmupdate.model.BlogDto;
import al7osam.com.edumvvmupdate.model.BlogsOutput;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;

/**
 * Created by EmanEraky on 1/25/2019.
 */

public class Listener_Api {
    Context context;
    MutableLiveData<List<BlogDto>> dataService;


    public LiveData<List<BlogDto>> getBlogServices(HashMap<String, Object> params) {
        dataService = new MutableLiveData<>();
        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);
        ApiFactory.create().GetBlogsObserver(params, "application/json", "en")
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<BlogsOutput>() {
                    @Override
                    public void accept(BlogsOutput userResponse) throws Exception {
                        dataService.setValue(userResponse.getBlogs());
//                        result.onSuccess(dataService);
//                            setBlogs(dataService);
//                            blogLabel.set(View.GONE);
//                            blogRecycler.set(View.VISIBLE);
                    }
                }, new Consumer<Throwable>() {
                    @Override
                    public void accept(Throwable throwable) throws Exception {
                        dataService.setValue(null);
//                            messageLabel.set(context.getString(R.string.error_message_loading_users));
//                            blogLabel.set(View.VISIBLE);
//                            blogRecycler.set(View.GONE);
                    }
                });

//            compositeDisposable.add(disposable);
        return dataService;
    }
    //==========================================================================
    //        ApiFactory.create().GetBlogs(params,"application/json", "en").enqueue(new Callback<BlogsOutput>() {
//            @Override
//            public void onResponse(Call<BlogsOutput> call, Response<BlogsOutput> response) {
//                if (response.isSuccessful()){
//                    dataService.setValue(response.body().getBlogs());
//                    result.onSuccess(dataService);
//                }
//            }
//
//            @Override
//            public void onFailure(Call<BlogsOutput> call, Throwable t) {
//                dataService.setValue(null);
//            }
//        });


}

