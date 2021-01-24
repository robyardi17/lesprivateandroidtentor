package com.example.lesprivatetentor.Fragment.Jadwal.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class JadwalSekarangModel {
    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("jadwal")
    @Expose
    private List<ListJadwalSekarang> jadwal = null;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<ListJadwalSekarang> getJadwal() {
        return jadwal;
    }

    public void setJadwal(List<ListJadwalSekarang> jadwal) {
        this.jadwal = jadwal;
    }
}
