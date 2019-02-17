package al7osam.com.edumvvmupdate.view;

import android.arch.lifecycle.ViewModelProviders;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import al7osam.com.edumvvmupdate.R;
import al7osam.com.edumvvmupdate.databinding.ActivityMainBinding;
import al7osam.com.edumvvmupdate.viewModel.BlogViewModel;
import al7osam.com.edumvvmupdate.viewModel.MyBlogViewModelFactory;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding activityMainBinding;
    BlogViewModel blogViewModel;
    BlogsAdapter userAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initDataBinding();
        attachObserver(activityMainBinding.recyclePosts);
    }

    private void initDataBinding() {
        activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        blogViewModel = ViewModelProviders.of(this, new MyBlogViewModelFactory(this)).get(BlogViewModel.class);
        activityMainBinding.setBlogViewModel(blogViewModel);
    }


    private void attachObserver(RecyclerView listUser) {
        blogViewModel.getBlogs().observe(this, observer -> {
            userAdapter = new BlogsAdapter(this,blogViewModel);
            listUser.setLayoutManager(new LinearLayoutManager(this));
            listUser.setAdapter(userAdapter);
            userAdapter.notifyDataSetChanged();
        });

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        blogViewModel.reset();
    }

}
