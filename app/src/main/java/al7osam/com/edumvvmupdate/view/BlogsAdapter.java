package al7osam.com.edumvvmupdate.view;

import android.arch.lifecycle.MutableLiveData;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

import al7osam.com.edumvvmupdate.R;
//import al7osam.com.edumvvm.databinding.ItemBlogBinding;
import al7osam.com.edumvvmupdate.model.BlogDto;
import al7osam.com.edumvvmupdate.viewModel.BlogViewModel;
import de.hdodenhof.circleimageview.CircleImageView;

import static al7osam.com.edumvvmupdate.utils.Constants.Domain_Url;

/**
 * Created by eman.eraqi on 1/23/2019.
 */

public class BlogsAdapter extends RecyclerView.Adapter<BlogsAdapter.MyViewHolder> {
    MutableLiveData<List<BlogDto>> blogDtos;
    BlogViewModel viewModel;
    Context context;
    public BlogsAdapter(Context context ,BlogViewModel viewModel) {
        this.viewModel = viewModel;
        this.context = context;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

//        ItemBlogBinding  binding = DataBindingUtil.inflate(
//                LayoutInflater.from(viewGroup.getContext()), R.layout.item_blog, viewGroup, false);
//        View view = binding.getRoot();


        View itemBlog = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_blog, viewGroup, false);
        return new MyViewHolder(itemBlog);

    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {
        BlogDto blogDto =  viewModel.getSpeciesAt(i);
//        myViewHolder.BindBlog(blogDto);

        myViewHolder.label_name.setText(blogDto.getText());
        Glide.with(context).load(Domain_Url+blogDto.getUser().getAvatarFullPath()).into(myViewHolder.itemBlogimg);
        myViewHolder.label_phone.setText(blogDto.getUser().getName());
    }

    @Override
    public int getItemCount() {
        return viewModel.getBlogSize();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        View itemBlog;
        CircleImageView itemBlogimg;
        TextView label_name,label_phone;

        public MyViewHolder(View itemBlog) {
            super(itemBlog);
            this.itemBlog = itemBlog;
            itemBlogimg = itemBlog.findViewById(R.id.itemBlogimg);
            label_name = itemBlog.findViewById(R.id.label_name);
            label_phone = itemBlog.findViewById(R.id.label_phone);

        }

//        public void BindBlog(BlogDto blogDto) {
//            if (itemBlog.getUserViewModel() == null) {
//                itemBlog.setUserViewModel(new ItemBlogViewModel(blogDto, itemView.getContext()));
//            } else {
//                itemBlog.getUserViewModel();
//            }
//        }
    }
}
