package com.example.lesprivatetentor.Fragment.Bimbingan.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class PermintaanBimbinganModel {
    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("bimbingan")
    @Expose
    private List<Bimbingan> bimbingan = null;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<Bimbingan> getBimbingan() {
        return bimbingan;
    }

    public void setBimbingan(List<Bimbingan> bimbingan) {
        this.bimbingan = bimbingan;
    }
}
