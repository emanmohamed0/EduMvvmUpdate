package al7osam.com.edumvvmupdate.model;

import com.google.gson.annotations.SerializedName;

public class BlogSubject {
    @SerializedName("id")
    long Id;
    @SerializedName("blogId")
    long BlogId;
    @SerializedName("subjectId")
    int SubjectId;
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

    public int getSubjectId() {
        return SubjectId;
    }

    public void setSubjectId(int subjectId) {
        SubjectId = subjectId;
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

    public BlogSubject(long id, long blogId, int subjectId, Boolean delete) {
        Id = id;
        BlogId = blogId;
        SubjectId = subjectId;
        Delete = delete;
    }
}
