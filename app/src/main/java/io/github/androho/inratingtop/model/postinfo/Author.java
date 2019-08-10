
package io.github.androho.inratingtop.model.postinfo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Author {

    @SerializedName("active_gift")
    private ActiveGift activeGift;
    @SerializedName("avatar_image")
    private AvatarImage avatarImage;
    @SerializedName("chat_main_lang")
    private String chatMainLang;
    @Expose
    private String comments;
    @SerializedName("contest_entry_instance")
    private Object contestEntryInstance;
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
    @SerializedName("is_voted")
    private Boolean isVoted;
    @SerializedName("last_online_timestamp")
    private Long lastOnlineTimestamp;
    @Expose
    private String lastname;
    @Expose
    private String name;
    @Expose
    private String nickname;
    @SerializedName("off_page")
    private Boolean offPage;
    @Expose
    private Rating rating;
    @Expose
    private String status;

    public ActiveGift getActiveGift() {
        return activeGift;
    }

    public void setActiveGift(ActiveGift activeGift) {
        this.activeGift = activeGift;
    }

    public AvatarImage getAvatarImage() {
        return avatarImage;
    }

    public void setAvatarImage(AvatarImage avatarImage) {
        this.avatarImage = avatarImage;
    }

    public String getChatMainLang() {
        return chatMainLang;
    }

    public void setChatMainLang(String chatMainLang) {
        this.chatMainLang = chatMainLang;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public Object getContestEntryInstance() {
        return contestEntryInstance;
    }

    public void setContestEntryInstance(Object contestEntryInstance) {
        this.contestEntryInstance = contestEntryInstance;
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

    public Boolean getIsVoted() {
        return isVoted;
    }

    public void setIsVoted(Boolean isVoted) {
        this.isVoted = isVoted;
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

    public Rating getRating() {
        return rating;
    }

    public void setRating(Rating rating) {
        this.rating = rating;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
