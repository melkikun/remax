
package com.example.it01.paicong.entities.customer;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Links_ {

    @SerializedName("custMmbsId")
    @Expose
    private String custMmbsId;

    public String getCustMmbsId() {
        return custMmbsId;
    }

    public void setCustMmbsId(String custMmbsId) {
        this.custMmbsId = custMmbsId;
    }

}
