
package com.example.it01.paicong.entities.customer;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Links {

    @SerializedName("data.custCityId")
    @Expose
    private DataCustCityId dataCustCityId;
    @SerializedName("data.custProvinceId")
    @Expose
    private DataCustProvinceId dataCustProvinceId;
    @SerializedName("data.custMaritalStatusId")
    @Expose
    private DataCustMaritalStatusId dataCustMaritalStatusId;
    @SerializedName("data.custMmbsId")
    @Expose
    private DataCustMmbsId dataCustMmbsId;
    @SerializedName("data.custFrofId")
    @Expose
    private DataCustFrofId dataCustFrofId;

    public DataCustCityId getDataCustCityId() {
        return dataCustCityId;
    }

    public void setDataCustCityId(DataCustCityId dataCustCityId) {
        this.dataCustCityId = dataCustCityId;
    }

    public DataCustProvinceId getDataCustProvinceId() {
        return dataCustProvinceId;
    }

    public void setDataCustProvinceId(DataCustProvinceId dataCustProvinceId) {
        this.dataCustProvinceId = dataCustProvinceId;
    }

    public DataCustMaritalStatusId getDataCustMaritalStatusId() {
        return dataCustMaritalStatusId;
    }

    public void setDataCustMaritalStatusId(DataCustMaritalStatusId dataCustMaritalStatusId) {
        this.dataCustMaritalStatusId = dataCustMaritalStatusId;
    }

    public DataCustMmbsId getDataCustMmbsId() {
        return dataCustMmbsId;
    }

    public void setDataCustMmbsId(DataCustMmbsId dataCustMmbsId) {
        this.dataCustMmbsId = dataCustMmbsId;
    }

    public DataCustFrofId getDataCustFrofId() {
        return dataCustFrofId;
    }

    public void setDataCustFrofId(DataCustFrofId dataCustFrofId) {
        this.dataCustFrofId = dataCustFrofId;
    }

}
