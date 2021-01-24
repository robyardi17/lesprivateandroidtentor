package com.example.lesprivatetentor.Fragment.Jadwal.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class JadwalModel {
    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("jadwal")
    @Expose
    private List<ListJadwal> jadwal = null;
    @SerializedName("days")
    @Expose
    private DDLHari days;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<ListJadwal> getJadwal() {
        return jadwal;
    }

    public void setJadwal(List<ListJadwal> jadwal) {
        this.jadwal = jadwal;
    }

    public List<DDLHari> getDays() {
        return (List<DDLHari>) days;
    }

    public void setDays(DDLHari days) {
        this.days = days;
    }

}
