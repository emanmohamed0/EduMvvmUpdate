package al7osam.com.edumvvmupdate.model;

import com.google.gson.annotations.SerializedName;

public class UserInfoDto {
    @SerializedName("id")
    long Id;
    @SerializedName("name")
    String Name;
    @SerializedName("avatar")
    String Avatar;
    @SerializedName("emailAddress")
    String EmailAddress;
    @SerializedName("avatarPath")
    String AvatarPath;
    @SerializedName("role")
    String Role;
    @SerializedName("phoneNumber")
    String PhoneNumber;

    @SerializedName("avatarFullPath")
    String AvatarFullPath;

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAvatar() {
        return Avatar;
    }

    public void setAvatar(String avatar) {
        Avatar = avatar;
    }

    public String getEmailAddress() {
        return EmailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        EmailAddress = emailAddress;
    }

    public String getAvatarPath() {
        return AvatarPath;
    }

    public void setAvatarPath(String avatarPath) {
        AvatarPath = avatarPath;
    }

    public String getRole() {
        return Role;
    }

    public void setRole(String role) {
        Role = role;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public String getAvatarFullPath() {
        return AvatarFullPath;
    }

    public void setAvatarFullPath(String avatarFullPath) {
        AvatarFullPath = avatarFullPath;
    }
}
