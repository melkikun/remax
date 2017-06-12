
package com.example.it01.paicong.entities.customer;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Example {

    @SerializedName("fields")
    @Expose
    private Fields fields;
    @SerializedName("links")
    @Expose
    private Links links;
    @SerializedName("data")
    @Expose
    private List<Datum> data = null;
    @SerializedName("linked")
    @Expose
    private Linked linked;
    @SerializedName("status")
    @Expose
    private Status status;

    public Fields getFields() {
        return fields;
    }

    public void setFields(Fields fields) {
        this.fields = fields;
    }

    public Links getLinks() {
        return links;
    }

    public void setLinks(Links links) {
        this.links = links;
    }

    public List<Datum> getData() {
        return data;
    }

    public void setData(List<Datum> data) {
        this.data = data;
    }

    public Linked getLinked() {
        return linked;
    }

    public void setLinked(Linked linked) {
        this.linked = linked;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

}
