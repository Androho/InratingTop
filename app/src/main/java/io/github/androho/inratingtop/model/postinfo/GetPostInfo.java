
package io.github.androho.inratingtop.model.postinfo;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class GetPostInfo {

    @Expose
    private Boolean active;
    @SerializedName("allow_comments")
    private Boolean allowComments;
    @Expose
    private Attachments attachments;
    @SerializedName("attachments_order")
    private List<AttachmentsOrder> attachmentsOrder;
    @Expose
    private Author author;
    @SerializedName("bookmarks_count")
    private Long bookmarksCount;
    @SerializedName("comments_count")
    private Long commentsCount;
    @Expose
    private Object content;
    @SerializedName("created_at")
    private String createdAt;
    @SerializedName("created_at_timestamp")
    private Long createdAtTimestamp;
    @Expose
    private Object extra;
    @Expose
    private Long id;
    @Expose
    private List<Object> intags;
    @SerializedName("is_avatar")
    private Boolean isAvatar;
    @SerializedName("is_bookmarked")
    private Boolean isBookmarked;
    @SerializedName("is_liked")
    private Boolean isLiked;
    @SerializedName("is_repost")
    private Boolean isRepost;
    @SerializedName("is_reposted")
    private Boolean isReposted;
    @SerializedName("likes_count")
    private Long likesCount;
    @Expose
    private Object place;
    @SerializedName("reposts_count")
    private Long repostsCount;
    @SerializedName("site_link")
    private String siteLink;
    @Expose
    private String slug;
    @Expose
    private String title;
    @Expose
    private Long type;
    @SerializedName("views_count")
    private Long viewsCount;
    @Expose
    private String visibility;

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public Boolean getAllowComments() {
        return allowComments;
    }

    public void setAllowComments(Boolean allowComments) {
        this.allowComments = allowComments;
    }

    public Attachments getAttachments() {
        return attachments;
    }

    public void setAttachments(Attachments attachments) {
        this.attachments = attachments;
    }

    public List<AttachmentsOrder> getAttachmentsOrder() {
        return attachmentsOrder;
    }

    public void setAttachmentsOrder(List<AttachmentsOrder> attachmentsOrder) {
        this.attachmentsOrder = attachmentsOrder;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Long getBookmarksCount() {
        return bookmarksCount;
    }

    public void setBookmarksCount(Long bookmarksCount) {
        this.bookmarksCount = bookmarksCount;
    }

    public Long getCommentsCount() {
        return commentsCount;
    }

    public void setCommentsCount(Long commentsCount) {
        this.commentsCount = commentsCount;
    }

    public Object getContent() {
        return content;
    }

    public void setContent(Object content) {
        this.content = content;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public Long getCreatedAtTimestamp() {
        return createdAtTimestamp;
    }

    public void setCreatedAtTimestamp(Long createdAtTimestamp) {
        this.createdAtTimestamp = createdAtTimestamp;
    }

    public Object getExtra() {
        return extra;
    }

    public void setExtra(Object extra) {
        this.extra = extra;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Object> getIntags() {
        return intags;
    }

    public void setIntags(List<Object> intags) {
        this.intags = intags;
    }

    public Boolean getIsAvatar() {
        return isAvatar;
    }

    public void setIsAvatar(Boolean isAvatar) {
        this.isAvatar = isAvatar;
    }

    public Boolean getIsBookmarked() {
        return isBookmarked;
    }

    public void setIsBookmarked(Boolean isBookmarked) {
        this.isBookmarked = isBookmarked;
    }

    public Boolean getIsLiked() {
        return isLiked;
    }

    public void setIsLiked(Boolean isLiked) {
        this.isLiked = isLiked;
    }

    public Boolean getIsRepost() {
        return isRepost;
    }

    public void setIsRepost(Boolean isRepost) {
        this.isRepost = isRepost;
    }

    public Boolean getIsReposted() {
        return isReposted;
    }

    public void setIsReposted(Boolean isReposted) {
        this.isReposted = isReposted;
    }

    public Long getLikesCount() {
        return likesCount;
    }

    public void setLikesCount(Long likesCount) {
        this.likesCount = likesCount;
    }

    public Object getPlace() {
        return place;
    }

    public void setPlace(Object place) {
        this.place = place;
    }

    public Long getRepostsCount() {
        return repostsCount;
    }

    public void setRepostsCount(Long repostsCount) {
        this.repostsCount = repostsCount;
    }

    public String getSiteLink() {
        return siteLink;
    }

    public void setSiteLink(String siteLink) {
        this.siteLink = siteLink;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Long getType() {
        return type;
    }

    public void setType(Long type) {
        this.type = type;
    }

    public Long getViewsCount() {
        return viewsCount;
    }

    public void setViewsCount(Long viewsCount) {
        this.viewsCount = viewsCount;
    }

    public String getVisibility() {
        return visibility;
    }

    public void setVisibility(String visibility) {
        this.visibility = visibility;
    }

}
