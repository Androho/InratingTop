
package io.github.androho.inratingtop.model.reposters;

import java.util.List;
import com.google.gson.annotations.Expose;

public class GetAllReposters {

    @Expose
    private List<Datum> data;
    @Expose
    private Links links;
    @Expose
    private Meta meta;

    public List<Datum> getData() {
        return data;
    }

    public void setData(List<Datum> data) {
        this.data = data;
    }

    public Links getLinks() {
        return links;
    }

    public void setLinks(Links links) {
        this.links = links;
    }

    public Meta getMeta() {
        return meta;
    }

    public void setMeta(Meta meta) {
        this.meta = meta;
    }

}
