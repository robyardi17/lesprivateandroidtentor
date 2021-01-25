package com.example.lesprivatetentor.Fragment.Pertemuan.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ListPertemuan {
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("updated_at")
    @Expose
    private String updatedAt;
    @SerializedName("status")
    @Expose
    private Integer status;
    @SerializedName("keterangan")
    @Expose
    private String keterangan;
    @SerializedName("upah")
    @Expose
    private Integer upah;
    @SerializedName("biaya")
    @Expose
    private Integer biaya;
    @SerializedName("id_upah_tentor")
    @Expose
    private Integer idUpahTentor;
    @SerializedName("id_biaya_bimbingan")
    @Expose
    private Integer idBiayaBimbingan;
    @SerializedName("id_jadwal_bimbingan")
    @Expose
    private Integer idJadwalBimbingan;
    @SerializedName("jadwal_bimbingan")
    @Expose
    private JadwalBimbingan jadwalBimbingan;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }

    public Integer getUpah() {
        return upah;
    }

    public void setUpah(Integer upah) {
        this.upah = upah;
    }

    public Integer getBiaya() {
        return biaya;
    }

    public void setBiaya(Integer biaya) {
        this.biaya = biaya;
    }

    public Integer getIdUpahTentor() {
        return idUpahTentor;
    }

    public void setIdUpahTentor(Integer idUpahTentor) {
        this.idUpahTentor = idUpahTentor;
    }

    public Integer getIdBiayaBimbingan() {
        return idBiayaBimbingan;
    }

    public void setIdBiayaBimbingan(Integer idBiayaBimbingan) {
        this.idBiayaBimbingan = idBiayaBimbingan;
    }

    public Integer getIdJadwalBimbingan() {
        return idJadwalBimbingan;
    }

    public void setIdJadwalBimbingan(Integer idJadwalBimbingan) {
        this.idJadwalBimbingan = idJadwalBimbingan;
    }

    public JadwalBimbingan getJadwalBimbingan() {
        return jadwalBimbingan;
    }

    public void setJadwalBimbingan(JadwalBimbingan jadwalBimbingan) {
        this.jadwalBimbingan = jadwalBimbingan;
    }
}
