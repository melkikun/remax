
package com.example.it01.paicong.entities.customer;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Fields {

    @SerializedName("custName")
    @Expose
    private CustName custName;
    @SerializedName("custMmbsId")
    @Expose
    private CustMmbsId custMmbsId;

    public CustName getCustName() {
        return custName;
    }

    public void setCustName(CustName custName) {
        this.custName = custName;
    }

    public CustMmbsId getCustMmbsId() {
        return custMmbsId;
    }

    public void setCustMmbsId(CustMmbsId custMmbsId) {
        this.custMmbsId = custMmbsId;
    }

}
