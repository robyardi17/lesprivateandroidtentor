package com.example.lesprivatetentor.Fragment.Pertemuan.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Pertemuan {
    @SerializedName("current_page")
    @Expose
    private Integer currentPage;
    @SerializedName("data")
    @Expose
    private List<ListPertemuan> data = null;

    public Integer getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    public List<ListPertemuan> getData() {
        return data;
    }

    public void setData(List<ListPertemuan> data) {
        this.data = data;
    }
}
