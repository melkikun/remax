
package com.example.it01.paicong.entities.customer;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CustMmbsId {

    @SerializedName("maxLength")
    @Expose
    private String maxLength;
    @SerializedName("minLength")
    @Expose
    private String minLength;
    @SerializedName("width")
    @Expose
    private String width;
    @SerializedName("dataIndex")
    @Expose
    private String dataIndex;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("gridView")
    @Expose
    private String gridView;
    @SerializedName("public")
    @Expose
    private String _public;
    @SerializedName("editable")
    @Expose
    private String editable;
    @SerializedName("mandatory")
    @Expose
    private String mandatory;
    @SerializedName("dataType")
    @Expose
    private String dataType;
    @SerializedName("options")
    @Expose
    private Options options;

    public String getMaxLength() {
        return maxLength;
    }

    public void setMaxLength(String maxLength) {
        this.maxLength = maxLength;
    }

    public String getMinLength() {
        return minLength;
    }

    public void setMinLength(String minLength) {
        this.minLength = minLength;
    }

    public String getWidth() {
        return width;
    }

    public void setWidth(String width) {
        this.width = width;
    }

    public String getDataIndex() {
        return dataIndex;
    }

    public void setDataIndex(String dataIndex) {
        this.dataIndex = dataIndex;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGridView() {
        return gridView;
    }

    public void setGridView(String gridView) {
        this.gridView = gridView;
    }

    public String getPublic() {
        return _public;
    }

    public void setPublic(String _public) {
        this._public = _public;
    }

    public String getEditable() {
        return editable;
    }

    public void setEditable(String editable) {
        this.editable = editable;
    }

    public String getMandatory() {
        return mandatory;
    }

    public void setMandatory(String mandatory) {
        this.mandatory = mandatory;
    }

    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    public Options getOptions() {
        return options;
    }

    public void setOptions(Options options) {
        this.options = options;
    }

}
