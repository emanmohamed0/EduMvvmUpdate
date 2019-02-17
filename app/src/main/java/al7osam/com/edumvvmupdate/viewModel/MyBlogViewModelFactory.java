package al7osam.com.edumvvmupdate.viewModel;

import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProvider;
import android.content.Context;
import android.support.annotation.NonNull;

/**
 * Created by EmanEraky on 1/26/2019.
 */

public class MyBlogViewModelFactory implements ViewModelProvider.Factory {
    private Context mApplication;


    public MyBlogViewModelFactory(Context application) {
        mApplication = application;

    }

    @NonNull
    @Override
    public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {
        return (T) new BlogViewModel(mApplication);
    }
}
