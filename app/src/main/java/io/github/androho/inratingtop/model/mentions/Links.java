
package io.github.androho.inratingtop.model.mentions;

import com.google.gson.annotations.Expose;

public class Links {

    @Expose
    private String first;
    @Expose
    private String last;
    @Expose
    private Object next;
    @Expose
    private Object prev;

    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public String getLast() {
        return last;
    }

    public void setLast(String last) {
        this.last = last;
    }

    public Object getNext() {
        return next;
    }

    public void setNext(Object next) {
        this.next = next;
    }

    public Object getPrev() {
        return prev;
    }

    public void setPrev(Object prev) {
        this.prev = prev;
    }

}
