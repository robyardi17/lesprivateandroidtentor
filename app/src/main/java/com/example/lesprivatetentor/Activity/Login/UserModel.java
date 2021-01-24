package com.example.lesprivatetentor.Activity.Login;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class UserModel {
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("nama")
    @Expose
    private String nama;
    @SerializedName("token")
    @Expose
    private String token;
    @SerializedName("email")
    @Expose
    private String email;
    @SerializedName("no_hp")
    @Expose
    private String no_hp;
    @SerializedName("asal")
    @Expose
    private String asal;
    @SerializedName("domisili")
    @Expose
    private String domisili;
    @SerializedName("user")
    @Expose
    private String user;
    @SerializedName("role")
    @Expose
    private String role;
    @SerializedName("pend_terakhir")
    @Expose
    private String pend_terakhir;
    @SerializedName("pend_berjalan")
    @Expose
    private String pend_berjalan;
    @SerializedName("jeniskelamin")
    @Expose
    private String jeniskelamin;
    @SerializedName("peng_mengajar")
    @Expose
    private String peng_mengajar;
    @SerializedName("ringkasan")
    @Expose
    private String ringkasan;
    @SerializedName("foto")
    @Expose
    private String foto;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("success")
    @Expose
    private Boolean success;
    @SerializedName("message")
    @Expose
    private String msg;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNo_hp() {
        return no_hp;
    }

    public void setNo_hp(String no_hp) {
        this.no_hp = no_hp;
    }

    public String getAsal() {
        return asal;
    }

    public void setAsal(String asal) {
        this.asal = asal;
    }

    public String getDomisili() {
        return domisili;
    }

    public void setDomisili(String domisili) {
        this.domisili = domisili;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getPend_terakhir() {
        return pend_terakhir;
    }

    public void setPend_terakhir(String pend_terakhir) {
        this.pend_terakhir = pend_terakhir;
    }

    public String getPend_berjalan() {
        return pend_berjalan;
    }

    public void setPend_berjalan(String pend_berjalan) {
        this.pend_berjalan = pend_berjalan;
    }

    public String getJeniskelamin() {
        return jeniskelamin;
    }

    public void setJeniskelamin(String jeniskelamin) {
        this.jeniskelamin = jeniskelamin;
    }

    public String getPeng_mengajar() {
        return peng_mengajar;
    }

    public void setPeng_mengajar(String peng_mengajar) {
        this.peng_mengajar = peng_mengajar;
    }

    public String getRingkasan() {
        return ringkasan;
    }

    public void setRingkasan(String ringkasan) {
        this.ringkasan = ringkasan;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
