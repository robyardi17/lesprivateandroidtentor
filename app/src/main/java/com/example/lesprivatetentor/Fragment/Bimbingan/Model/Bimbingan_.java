package com.example.lesprivatetentor.Fragment.Bimbingan.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Bimbingan_ {
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("updated_at")
    @Expose
    private String updatedAt;
    @SerializedName("id_siswa")
    @Expose
    private Integer idSiswa;
    @SerializedName("id_pembelajaran")
    @Expose
    private Integer idPembelajaran;
    @SerializedName("deleted_at")
    @Expose
    private Object deletedAt;
    @SerializedName("siswa")
    @Expose
    private Siswa siswa;

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

    public Integer getIdSiswa() {
        return idSiswa;
    }

    public void setIdSiswa(Integer idSiswa) {
        this.idSiswa = idSiswa;
    }

    public Integer getIdPembelajaran() {
        return idPembelajaran;
    }

    public void setIdPembelajaran(Integer idPembelajaran) {
        this.idPembelajaran = idPembelajaran;
    }

    public Object getDeletedAt() {
        return deletedAt;
    }

    public void setDeletedAt(Object deletedAt) {
        this.deletedAt = deletedAt;
    }

    public Siswa getSiswa() {
        return siswa;
    }

    public void setSiswa(Siswa siswa) {
        this.siswa = siswa;
    }
}
