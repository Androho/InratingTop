
package io.github.androho.inratingtop.model.postinfo;

import com.google.gson.annotations.Expose;

public class AttachmentsOrder {

    @Expose
    private Long id;
    @Expose
    private String type;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}
