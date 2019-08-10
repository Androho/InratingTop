
package io.github.androho.inratingtop.model.commentators;

import com.google.gson.annotations.SerializedName;

public class Datum {

    @SerializedName("active_gift")
    private Object mActiveGift;
    @SerializedName("avatar_image")
    private AvatarImage mAvatarImage;
    @SerializedName("gender")
    private String mGender;
    @SerializedName("has_me_in_blacklist")
    private Boolean mHasMeInBlacklist;
    @SerializedName("id")
    private Long mId;
    @SerializedName("in_my_blacklist")
    private Boolean mInMyBlacklist;
    @SerializedName("is_online")
    private Boolean mIsOnline;
    @SerializedName("is_subscribed")
    private Boolean mIsSubscribed;
    @SerializedName("last_online_timestamp")
    private Long mLastOnlineTimestamp;
    @SerializedName("lastname")
    private String mLastname;
    @SerializedName("name")
    private String mName;
    @SerializedName("nickname")
    private String mNickname;
    @SerializedName("off_page")
    private Boolean mOffPage;
    @SerializedName("status")
    private String mStatus;

    public Object getActiveGift() {
        return mActiveGift;
    }

    public void setActiveGift(Object activeGift) {
        mActiveGift = activeGift;
    }

    public AvatarImage getAvatarImage() {
        return mAvatarImage;
    }

    public void setAvatarImage(AvatarImage avatarImage) {
        mAvatarImage = avatarImage;
    }

    public String getGender() {
        return mGender;
    }

    public void setGender(String gender) {
        mGender = gender;
    }

    public Boolean getHasMeInBlacklist() {
        return mHasMeInBlacklist;
    }

    public void setHasMeInBlacklist(Boolean hasMeInBlacklist) {
        mHasMeInBlacklist = hasMeInBlacklist;
    }

    public Long getId() {
        return mId;
    }

    public void setId(Long id) {
        mId = id;
    }

    public Boolean getInMyBlacklist() {
        return mInMyBlacklist;
    }

    public void setInMyBlacklist(Boolean inMyBlacklist) {
        mInMyBlacklist = inMyBlacklist;
    }

    public Boolean getIsOnline() {
        return mIsOnline;
    }

    public void setIsOnline(Boolean isOnline) {
        mIsOnline = isOnline;
    }

    public Boolean getIsSubscribed() {
        return mIsSubscribed;
    }

    public void setIsSubscribed(Boolean isSubscribed) {
        mIsSubscribed = isSubscribed;
    }

    public Long getLastOnlineTimestamp() {
        return mLastOnlineTimestamp;
    }

    public void setLastOnlineTimestamp(Long lastOnlineTimestamp) {
        mLastOnlineTimestamp = lastOnlineTimestamp;
    }

    public String getLastname() {
        return mLastname;
    }

    public void setLastname(String lastname) {
        mLastname = lastname;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public String getNickname() {
        return mNickname;
    }

    public void setNickname(String nickname) {
        mNickname = nickname;
    }

    public Boolean getOffPage() {
        return mOffPage;
    }

    public void setOffPage(Boolean offPage) {
        mOffPage = offPage;
    }

    public String getStatus() {
        return mStatus;
    }

    public void setStatus(String status) {
        mStatus = status;
    }

}
