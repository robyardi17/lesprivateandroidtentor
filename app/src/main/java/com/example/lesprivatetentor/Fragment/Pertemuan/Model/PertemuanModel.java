package com.example.lesprivatetentor.Fragment.Pertemuan.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PertemuanModel {
    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("pertemuan")
    @Expose
    private Pertemuan pertemuan;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Pertemuan getPertemuan() {
        return pertemuan;
    }

    public void setPertemuan(Pertemuan pertemuan) {
        this.pertemuan = pertemuan;
    }
}
