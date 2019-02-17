package al7osam.com.edumvvmupdate.model;

import com.google.gson.annotations.SerializedName;

public class BlogAttachment {
    @SerializedName("id")
    public long Id;
    @SerializedName("blogId")
    long BlogId;
    @SerializedName("attachName")
    String AttachName;

    @SerializedName("attachNamePath")
    String AttachNamePath;

    boolean isLoad;

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public long getBlogId() {
        return BlogId;
    }

    public void setBlogId(long blogId) {
        BlogId = blogId;
    }

    public String getAttachName() {
        return AttachName;
    }

    public void setAttachName(String attachName) {
        AttachName = attachName;
    }

    public String getAttachNamePath() {
        return AttachNamePath;
    }

    public void setAttachNamePath(String attachNamePath) {
        AttachNamePath = attachNamePath;
    }

    public boolean isLoad() {
        return isLoad;
    }

    public void setLoad(boolean load) {
        isLoad = load;
    }
}
