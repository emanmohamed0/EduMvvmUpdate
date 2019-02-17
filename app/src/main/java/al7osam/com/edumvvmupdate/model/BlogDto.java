package al7osam.com.edumvvmupdate.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class BlogDto {
    @SerializedName("id")
    public long Id;
    @SerializedName("text")
    String Text;
    @SerializedName("blogLevels")
    List<BlogLevel> BlogLevels;
    @SerializedName("blogSubjects")
    List<BlogSubject> BlogSubjects;
    @SerializedName("blogAttachments")
    List<BlogAttachment> BlogAttachments;

    @SerializedName("creatorUser")
    public UserInfoDto user;
    @SerializedName("creatorUserId")
    public long CreatorUserId;
    @SerializedName("fromNow")
    String fromNow;
    @SerializedName("commentsCount")
    int CommentsCount;
    @SerializedName("likedCount")
    int LikedCount;
    @SerializedName("isLiked")
    boolean IsLiked;

    boolean isLoad;

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getText() {
        return Text;
    }

    public void setText(String text) {
        Text = text;
    }

    public List<BlogLevel> getBlogLevels() {
        return BlogLevels;
    }

    public void setBlogLevels(List<BlogLevel> blogLevels) {
        BlogLevels = blogLevels;
    }

    public List<BlogSubject> getBlogSubjects() {
        return BlogSubjects;
    }

    public void setBlogSubjects(List<BlogSubject> blogSubjects) {
        BlogSubjects = blogSubjects;
    }

    public List<BlogAttachment> getBlogAttachments() {
        return BlogAttachments;
    }

    public void setBlogAttachments(List<BlogAttachment> blogAttachments) {
        BlogAttachments = blogAttachments;
    }


    public UserInfoDto getUser() {
        return user;
    }

    public void setUser(UserInfoDto user) {
        this.user = user;
    }

    public long getCreatorUserId() {
        return CreatorUserId;
    }

    public void setCreatorUserId(long creatorUserId) {
        CreatorUserId = creatorUserId;
    }

    public String getFromNow() {
        return fromNow;
    }

    public void setFromNow(String fromNow) {
        this.fromNow = fromNow;
    }

    public int getCommentsCount() {
        return CommentsCount;
    }

    public void setCommentsCount(int commentsCount) {
        CommentsCount = commentsCount;
    }

    public int getLikedCount() {
        return LikedCount;
    }

    public void setLikedCount(int likedCount) {
        LikedCount = likedCount;
    }

    public boolean isLiked() {
        return IsLiked;
    }

    public void setLiked(boolean liked) {
        IsLiked = liked;
    }

    public boolean isLoad() {
        return isLoad;
    }

    public void setLoad(boolean load) {
        isLoad = load;
    }
}
