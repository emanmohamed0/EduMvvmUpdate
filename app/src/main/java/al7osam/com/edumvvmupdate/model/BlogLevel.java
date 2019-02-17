package al7osam.com.edumvvmupdate.model;

import com.google.gson.annotations.SerializedName;

public class BlogLevel {
    @SerializedName("id")
    long Id;
    @SerializedName("blogId")
    long BlogId;
    @SerializedName("levelId")
    int LevelId;
    @SerializedName("delete")
    Boolean Delete;
    @SerializedName("name")
    String Name;

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

    public int getLevelId() {
        return LevelId;
    }

    public void setLevelId(int levelId) {
        LevelId = levelId;
    }

    public Boolean getDelete() {
        return Delete;
    }

    public void setDelete(Boolean delete) {
        Delete = delete;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public BlogLevel(long id, long blogId, int levelId, Boolean delete) {
        Id = id;
        BlogId = blogId;
        LevelId = levelId;
        Delete = delete;
    }
}
