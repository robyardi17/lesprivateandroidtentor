package com.example.lesprivatetentor.Fragment.Jadwal.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ListSiswa {
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("nama")
    @Expose
    private String nama;
    @SerializedName("biaya_tambahan")
    @Expose
    private Integer biayaTambahan;
    @SerializedName("sekolah")
    @Expose
    private String sekolah;
    @SerializedName("kelas")
    @Expose
    private Integer kelas;
    @SerializedName("alamat")
    @Expose
    private String alamat;
    @SerializedName("nohp")
    @Expose
    private String nohp;
    @SerializedName("jk")
    @Expose
    private Integer jk;
    @SerializedName("keterangan_alamat")
    @Expose
    private String keteranganAlamat;
    @SerializedName("nohp_ortu")
    @Expose
    private String nohpOrtu;
    @SerializedName("nama_ortu")
    @Expose
    private String namaOrtu;
    @SerializedName("pekerjaan_ortu")
    @Expose
    private String pekerjaanOrtu;
    @SerializedName("status")
    @Expose
    private Integer status;
    @SerializedName("id_user")
    @Expose
    private Integer idUser;
    @SerializedName("status_info")
    @Expose
    private String statusInfo;
    @SerializedName("jenis_kelamin")
    @Expose
    private String jenisKelamin;
    @SerializedName("kelas_info")
    @Expose
    private String kelasInfo;
    @SerializedName("biaya_tambahan_rupiah")
    @Expose
    private String biayaTambahanRupiah;
    @SerializedName("path_foto")
    @Expose
    private String pathFoto;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Integer getBiayaTambahan() {
        return biayaTambahan;
    }

    public void setBiayaTambahan(Integer biayaTambahan) {
        this.biayaTambahan = biayaTambahan;
    }

    public String getSekolah() {
        return sekolah;
    }

    public void setSekolah(String sekolah) {
        this.sekolah = sekolah;
    }

    public Integer getKelas() {
        return kelas;
    }

    public void setKelas(Integer kelas) {
        this.kelas = kelas;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getNohp() {
        return nohp;
    }

    public void setNohp(String nohp) {
        this.nohp = nohp;
    }

    public Integer getJk() {
        return jk;
    }

    public void setJk(Integer jk) {
        this.jk = jk;
    }

    public String getKeteranganAlamat() {
        return keteranganAlamat;
    }

    public void setKeteranganAlamat(String keteranganAlamat) {
        this.keteranganAlamat = keteranganAlamat;
    }

    public String getNohpOrtu() {
        return nohpOrtu;
    }

    public void setNohpOrtu(String nohpOrtu) {
        this.nohpOrtu = nohpOrtu;
    }

    public String getNamaOrtu() {
        return namaOrtu;
    }

    public void setNamaOrtu(String namaOrtu) {
        this.namaOrtu = namaOrtu;
    }

    public String getPekerjaanOrtu() {
        return pekerjaanOrtu;
    }

    public void setPekerjaanOrtu(String pekerjaanOrtu) {
        this.pekerjaanOrtu = pekerjaanOrtu;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getIdUser() {
        return idUser;
    }

    public void setIdUser(Integer idUser) {
        this.idUser = idUser;
    }

    public String getStatusInfo() {
        return statusInfo;
    }

    public void setStatusInfo(String statusInfo) {
        this.statusInfo = statusInfo;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public String getKelasInfo() {
        return kelasInfo;
    }

    public void setKelasInfo(String kelasInfo) {
        this.kelasInfo = kelasInfo;
    }

    public String getBiayaTambahanRupiah() {
        return biayaTambahanRupiah;
    }

    public void setBiayaTambahanRupiah(String biayaTambahanRupiah) {
        this.biayaTambahanRupiah = biayaTambahanRupiah;
    }

    public String getPathFoto() {
        return pathFoto;
    }

    public void setPathFoto(String pathFoto) {
        this.pathFoto = pathFoto;
    }
}
