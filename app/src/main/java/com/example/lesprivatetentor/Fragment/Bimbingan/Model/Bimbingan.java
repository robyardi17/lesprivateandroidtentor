package com.example.lesprivatetentor.Fragment.Bimbingan.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Bimbingan {
    @SerializedName("current_page")
    @Expose
    private Integer currentPage;
    @SerializedName("data")
    @Expose
    private List<ListBimbinganBerjalan> data = null;

    public Integer getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    public List<ListBimbinganBerjalan> getData() {
        return data;
    }

    public void setData(List<ListBimbinganBerjalan> data) {
        this.data = data;
    }
}
