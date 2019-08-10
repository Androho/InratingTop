package io.github.androho.inratingtop.model.likers;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Datum {

    @SerializedName("active_gift")
    private Object activeGift;
    @SerializedName("avatar_image")
    private AvatarImage avatarImage;
    @Expose
    private String gender;
    @SerializedName("has_me_in_blacklist")
    private Boolean hasMeInBlacklist;
    @Expose
    private Long id;
    @SerializedName("in_my_blacklist")
    private Boolean inMyBlacklist;
    @SerializedName("is_online")
    private Boolean isOnline;
    @SerializedName("is_subscribed")
    private Boolean isSubscribed;
    @SerializedName("last_online_timestamp")
    private Long lastOnlineTimestamp;
    @Expose
    private String lastname;
    @Expose
    private Long multiplier;
    @Expose
    private String name;
    @Expose
    private String nickname;
    @SerializedName("off_page")
    private Boolean offPage;
    @Expose
    private String status;

    public Object getActiveGift() {
        return activeGift;
    }

    public void setActiveGift(Object activeGift) {
        this.activeGift = activeGift;
    }

    public AvatarImage getAvatarImage() {
        return avatarImage;
    }

    public void setAvatarImage(AvatarImage avatarImage) {
        this.avatarImage = avatarImage;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Boolean getHasMeInBlacklist() {
        return hasMeInBlacklist;
    }

    public void setHasMeInBlacklist(Boolean hasMeInBlacklist) {
        this.hasMeInBlacklist = hasMeInBlacklist;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Boolean getInMyBlacklist() {
        return inMyBlacklist;
    }

    public void setInMyBlacklist(Boolean inMyBlacklist) {
        this.inMyBlacklist = inMyBlacklist;
    }

    public Boolean getIsOnline() {
        return isOnline;
    }

    public void setIsOnline(Boolean isOnline) {
        this.isOnline = isOnline;
    }

    public Boolean getIsSubscribed() {
        return isSubscribed;
    }

    public void setIsSubscribed(Boolean isSubscribed) {
        this.isSubscribed = isSubscribed;
    }

    public Long getLastOnlineTimestamp() {
        return lastOnlineTimestamp;
    }

    public void setLastOnlineTimestamp(Long lastOnlineTimestamp) {
        this.lastOnlineTimestamp = lastOnlineTimestamp;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Long getMultiplier() {
        return multiplier;
    }

    public void setMultiplier(Long multiplier) {
        this.multiplier = multiplier;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Boolean getOffPage() {
        return offPage;
    }

    public void setOffPage(Boolean offPage) {
        this.offPage = offPage;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
