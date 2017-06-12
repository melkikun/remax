
package com.example.it01.paicong.entities.customer;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CustMmbsId_ {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("mmbsId")
    @Expose
    private String mmbsId;
    @SerializedName("mmbsFirstName")
    @Expose
    private String mmbsFirstName;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMmbsId() {
        return mmbsId;
    }

    public void setMmbsId(String mmbsId) {
        this.mmbsId = mmbsId;
    }

    public String getMmbsFirstName() {
        return mmbsFirstName;
    }

    public void setMmbsFirstName(String mmbsFirstName) {
        this.mmbsFirstName = mmbsFirstName;
    }

}
