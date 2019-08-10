
package io.github.androho.inratingtop.model.commentators;

import com.google.gson.annotations.SerializedName;

public class AvatarImage {

    @SerializedName("id")
    private Long mId;
    @SerializedName("mentioned_users_count")
    private Long mMentionedUsersCount;
    @SerializedName("url")
    private String mUrl;
    @SerializedName("url_large")
    private String mUrlLarge;
    @SerializedName("url_large_origin")
    private String mUrlLargeOrigin;
    @SerializedName("url_medium")
    private String mUrlMedium;
    @SerializedName("url_medium_origin")
    private String mUrlMediumOrigin;
    @SerializedName("url_origin")
    private String mUrlOrigin;
    @SerializedName("url_small")
    private String mUrlSmall;
    @SerializedName("url_small_origin")
    private String mUrlSmallOrigin;

    public Long getId() {
        return mId;
    }

    public void setId(Long id) {
        mId = id;
    }

    public Long getMentionedUsersCount() {
        return mMentionedUsersCount;
    }

    public void setMentionedUsersCount(Long mentionedUsersCount) {
        mMentionedUsersCount = mentionedUsersCount;
    }

    public String getUrl() {
        return mUrl;
    }

    public void setUrl(String url) {
        mUrl = url;
    }

    public String getUrlLarge() {
        return mUrlLarge;
    }

    public void setUrlLarge(String urlLarge) {
        mUrlLarge = urlLarge;
    }

    public String getUrlLargeOrigin() {
        return mUrlLargeOrigin;
    }

    public void setUrlLargeOrigin(String urlLargeOrigin) {
        mUrlLargeOrigin = urlLargeOrigin;
    }

    public String getUrlMedium() {
        return mUrlMedium;
    }

    public void setUrlMedium(String urlMedium) {
        mUrlMedium = urlMedium;
    }

    public String getUrlMediumOrigin() {
        return mUrlMediumOrigin;
    }

    public void setUrlMediumOrigin(String urlMediumOrigin) {
        mUrlMediumOrigin = urlMediumOrigin;
    }

    public String getUrlOrigin() {
        return mUrlOrigin;
    }

    public void setUrlOrigin(String urlOrigin) {
        mUrlOrigin = urlOrigin;
    }

    public String getUrlSmall() {
        return mUrlSmall;
    }

    public void setUrlSmall(String urlSmall) {
        mUrlSmall = urlSmall;
    }

    public String getUrlSmallOrigin() {
        return mUrlSmallOrigin;
    }

    public void setUrlSmallOrigin(String urlSmallOrigin) {
        mUrlSmallOrigin = urlSmallOrigin;
    }

}
