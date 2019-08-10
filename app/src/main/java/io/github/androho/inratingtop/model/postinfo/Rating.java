
package io.github.androho.inratingtop.model.postinfo;

import com.google.gson.annotations.Expose;

public class Rating {

    @Expose
    private String caption;
    @Expose
    private Long level;
    @Expose
    private Double proportion;
    @Expose
    private Long value;

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public Long getLevel() {
        return level;
    }

    public void setLevel(Long level) {
        this.level = level;
    }

    public Double getProportion() {
        return proportion;
    }

    public void setProportion(Double proportion) {
        this.proportion = proportion;
    }

    public Long getValue() {
        return value;
    }

    public void setValue(Long value) {
        this.value = value;
    }

}
