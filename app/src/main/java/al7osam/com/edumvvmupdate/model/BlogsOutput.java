package al7osam.com.edumvvmupdate.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by eman.eraqi on 1/23/2019.
 */

public class BlogsOutput {
    @SerializedName("blogs")
    List<BlogDto> Blogs;

    @SerializedName("user")
    UserInfoDto CurrentUser;

    @SerializedName("error")
    String Error;

    @SerializedName("blogCount")
    int BlogCount;

    public List<BlogDto> getBlogs() {
        return Blogs;
    }

    public UserInfoDto getCurrentUser() {
        return CurrentUser;
    }

    public String getError() {
        return Error;
    }

    public int getBlogCount() {
        return BlogCount;
    }
}
