package com.example.lesprivatetentor.Config;

import com.example.lesprivatetentor.Activity.Login.ResponsModel;
import com.example.lesprivatetentor.Fragment.Bimbingan.Model.BimbinganBerjalanModel;
import com.example.lesprivatetentor.Fragment.Bimbingan.Model.PermintaanBimbinganModel;
import com.example.lesprivatetentor.Fragment.Jadwal.Model.JadwalModel;
import com.example.lesprivatetentor.Fragment.Jadwal.Model.JadwalSekarangModel;
import com.example.lesprivatetentor.Fragment.Pertemuan.Model.PertemuanModel;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface ApiService {
    @FormUrlEncoded
    @POST("login")
    @Headers({
            "Accept: application/vnd.yourapi.v1.full+json",
            "User-Agent: Android = login"
    })
    Call<ResponsModel> getLogin(@Field("username") String username,
                                @Field("password") String password);

    // Jadwal Semua pilih hari
    @FormUrlEncoded
    @POST("tentor/jadwal")
    @Headers({
            "Accept: application/vnd.yourapi.v1.full+json",
            "User-Agent: Android =  jadwal"
    })
    Call<JadwalModel> getJadwalHariIni(@Header("Authorization") String token,
                                       @Field("day") String day);

    // Jadwal sekarang
    @POST("tentor/jadwalsekarang")
    @Headers({
            "Accept: application/vnd.yourapi.v1.full+json",
            "User-Agent: Android =  jadwal sekarang"
    })
    Call<JadwalSekarangModel> getJadwalSkr(@Header("Authorization") String token);

    // BimbinganBerjalan
    @FormUrlEncoded
    @POST("tentor/bimbinganberjalan")
    @Headers({
            "Accept: application/vnd.yourapi.v1.full+json",
            "User-Agent: Android =  bimbinganberjalan"
    })
    Call<BimbinganBerjalanModel> getBimbinganBerjalan(@Header("Authorization") String token,
                                                  @Field("search") String search);

    // Permintaan Bimbingan
    @POST("tentor/permintaanbimbingan")
    @Headers({
            "Accept: application/vnd.yourapi.v1.full+json",
            "User-Agent: Android =  jadwal sekarang"
    })
    Call<PermintaanBimbinganModel> getPermintaanBimbingan(@Header("Authorization") String token);

    // Pertemuan
    @FormUrlEncoded
    @POST("tentor/pertemuan")
    @Headers({
            "Accept: application/vnd.yourapi.v1.full+json",
            "User-Agent: Android =  Pertemuan"
    })
    Call<PertemuanModel> getPertemuan(@Header("Authorization") String token,
                                            @Field("date") String date);
}
