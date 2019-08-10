
package io.github.androho.inratingtop.model.postinfo;

import java.util.List;
import com.google.gson.annotations.Expose;

public class Attachments {

    @Expose
    private List<Image> images;
    @Expose
    private Object posts;
    @Expose
    private Object videos;

    public List<Image> getImages() {
        return images;
    }

    public void setImages(List<Image> images) {
        this.images = images;
    }

    public Object getPosts() {
        return posts;
    }

    public void setPosts(Object posts) {
        this.posts = posts;
    }

    public Object getVideos() {
        return videos;
    }

    public void setVideos(Object videos) {
        this.videos = videos;
    }

}
