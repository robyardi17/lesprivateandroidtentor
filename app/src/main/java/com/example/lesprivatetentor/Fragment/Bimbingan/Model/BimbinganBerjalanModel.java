package com.example.lesprivatetentor.Fragment.Bimbingan.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class BimbinganBerjalanModel {
    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("bimbingan")
    @Expose
    private Bimbingan bimbingan;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Bimbingan getBimbingan() {
        return bimbingan;
    }

    public void setBimbingan(Bimbingan bimbingan) {
        this.bimbingan = bimbingan;
    }
}
