package al7osam.com.edumvvmupdate.viewModel;

import android.content.Context;
import android.databinding.BaseObservable;

import al7osam.com.edumvvmupdate.model.BlogDto;
import al7osam.com.edumvvmupdate.model.BlogLevel;
import al7osam.com.edumvvmupdate.model.BlogSubject;

/**
 * Created by eman.eraqi on 1/23/2019.
 */

public class ItemBlogViewModel extends BaseObservable {
    BlogDto blogDto;
    Context context;


    public ItemBlogViewModel(BlogDto blogDto, Context context) {
        this.blogDto = blogDto;
        this.context = context;
    }

    public String getProfileThumb() {
        return blogDto.getUser().getAvatarFullPath();
    }

    public String getPostUsername() {
        return blogDto.user.getName();
    }

    public String getPostTime() {
        return blogDto.getUser().getName();
    }

    public String getPostAbout() {
        return blogDto.getText();
    }


    public String getTags() {
        String allLevel = "";
        for (BlogLevel blogLevel : blogDto.getBlogLevels()) {
            allLevel += "#" + blogLevel.getName() + " ";
        }
        for (BlogSubject blogSubject : blogDto.getBlogSubjects()) {
            allLevel += "#" + blogSubject.getName() + " ";
        }

        return allLevel;
    }


}
