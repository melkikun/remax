
package com.example.it01.paicong.entities.customer;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Options {

    @SerializedName("remote")
    @Expose
    private String remote;
    @SerializedName("href")
    @Expose
    private String href;
    @SerializedName("submit")
    @Expose
    private String submit;
    @SerializedName("show")
    @Expose
    private String show;

    public String getRemote() {
        return remote;
    }

    public void setRemote(String remote) {
        this.remote = remote;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public String getSubmit() {
        return submit;
    }

    public void setSubmit(String submit) {
        this.submit = submit;
    }

    public String getShow() {
        return show;
    }

    public void setShow(String show) {
        this.show = show;
    }

}
