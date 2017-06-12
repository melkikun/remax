
package com.example.it01.paicong.entities.customer;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Linked {

    @SerializedName("custCityId")
    @Expose
    private Object custCityId;
    @SerializedName("custProvinceId")
    @Expose
    private Object custProvinceId;
    @SerializedName("custMaritalStatusId")
    @Expose
    private Object custMaritalStatusId;
    @SerializedName("custMmbsId")
    @Expose
    private List<CustMmbsId_> custMmbsId = null;
    @SerializedName("custFrofId")
    @Expose
    private Object custFrofId;

    public Object getCustCityId() {
        return custCityId;
    }

    public void setCustCityId(Object custCityId) {
        this.custCityId = custCityId;
    }

    public Object getCustProvinceId() {
        return custProvinceId;
    }

    public void setCustProvinceId(Object custProvinceId) {
        this.custProvinceId = custProvinceId;
    }

    public Object getCustMaritalStatusId() {
        return custMaritalStatusId;
    }

    public void setCustMaritalStatusId(Object custMaritalStatusId) {
        this.custMaritalStatusId = custMaritalStatusId;
    }

    public List<CustMmbsId_> getCustMmbsId() {
        return custMmbsId;
    }

    public void setCustMmbsId(List<CustMmbsId_> custMmbsId) {
        this.custMmbsId = custMmbsId;
    }

    public Object getCustFrofId() {
        return custFrofId;
    }

    public void setCustFrofId(Object custFrofId) {
        this.custFrofId = custFrofId;
    }

}
