
package io.github.androho.inratingtop.model.postinfo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AvatarImage {

    @Expose
    private Long id;
    @SerializedName("mentioned_users_count")
    private Long mentionedUsersCount;
    @Expose
    private String url;
    @SerializedName("url_large")
    private String urlLarge;
    @SerializedName("url_large_origin")
    private String urlLargeOrigin;
    @SerializedName("url_medium")
    private String urlMedium;
    @SerializedName("url_medium_origin")
    private String urlMediumOrigin;
    @SerializedName("url_origin")
    private String urlOrigin;
    @SerializedName("url_small")
    private String urlSmall;
    @SerializedName("url_small_origin")
    private String urlSmallOrigin;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getMentionedUsersCount() {
        return mentionedUsersCount;
    }

    public void setMentionedUsersCount(Long mentionedUsersCount) {
        this.mentionedUsersCount = mentionedUsersCount;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUrlLarge() {
        return urlLarge;
    }

    public void setUrlLarge(String urlLarge) {
        this.urlLarge = urlLarge;
    }

    public String getUrlLargeOrigin() {
        return urlLargeOrigin;
    }

    public void setUrlLargeOrigin(String urlLargeOrigin) {
        this.urlLargeOrigin = urlLargeOrigin;
    }

    public String getUrlMedium() {
        return urlMedium;
    }

    public void setUrlMedium(String urlMedium) {
        this.urlMedium = urlMedium;
    }

    public String getUrlMediumOrigin() {
        return urlMediumOrigin;
    }

    public void setUrlMediumOrigin(String urlMediumOrigin) {
        this.urlMediumOrigin = urlMediumOrigin;
    }

    public String getUrlOrigin() {
        return urlOrigin;
    }

    public void setUrlOrigin(String urlOrigin) {
        this.urlOrigin = urlOrigin;
    }

    public String getUrlSmall() {
        return urlSmall;
    }

    public void setUrlSmall(String urlSmall) {
        this.urlSmall = urlSmall;
    }

    public String getUrlSmallOrigin() {
        return urlSmallOrigin;
    }

    public void setUrlSmallOrigin(String urlSmallOrigin) {
        this.urlSmallOrigin = urlSmallOrigin;
    }

}
