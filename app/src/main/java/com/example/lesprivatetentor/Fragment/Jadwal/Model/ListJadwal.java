package com.example.lesprivatetentor.Fragment.Jadwal.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ListJadwal {
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("updated_at")
    @Expose
    private String updatedAt;
    @SerializedName("id_bimbingan")
    @Expose
    private Integer idBimbingan;
    @SerializedName("hari")
    @Expose
    private Integer hari;
    @SerializedName("awal")
    @Expose
    private String awal;
    @SerializedName("akhir")
    @Expose
    private String akhir;
    @SerializedName("status")
    @Expose
    private Integer status;
    @SerializedName("deleted_at")
    @Expose
    private Object deletedAt;
    @SerializedName("bimbingan")
    @Expose
    private ListBimbingan bimbingan;

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

    public Integer getIdBimbingan() {
        return idBimbingan;
    }

    public void setIdBimbingan(Integer idBimbingan) {
        this.idBimbingan = idBimbingan;
    }

    public Integer getHari() {
        return hari;
    }

    public void setHari(Integer hari) {
        this.hari = hari;
    }

    public String getAwal() {
        return awal;
    }

    public void setAwal(String awal) {
        this.awal = awal;
    }

    public String getAkhir() {
        return akhir;
    }

    public void setAkhir(String akhir) {
        this.akhir = akhir;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Object getDeletedAt() {
        return deletedAt;
    }

    public void setDeletedAt(Object deletedAt) {
        this.deletedAt = deletedAt;
    }

    public ListBimbingan getBimbingan() {
        return bimbingan;
    }

    public void setBimbingan(ListBimbingan bimbingan) {
        this.bimbingan = bimbingan;
    }
}
