package com.example.lesprivatetentor.Fragment.Jadwal.Function;

import android.app.Activity;
import android.app.ProgressDialog;

import com.example.lesprivatetentor.Config.ApiService;
import com.example.lesprivatetentor.Config.Server;
import com.example.lesprivatetentor.Fragment.Jadwal.Model.JadwalSekarangModel;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class getJadwalSkr {
    ProgressDialog progressDialog;
    private Activity activity;

    public getJadwalSkr(Activity activity){
        this.activity = activity;
        this.progressDialog = new ProgressDialog(activity);

    }

    public void getJadwalSekarang(String token) {
        progressDialog.setTitle("Memuat data");
        progressDialog.setMessage("Tunggu Sebentar");
        progressDialog.show();

        ApiService apiService = Server.getClient().create(ApiService.class);
        Call<JadwalSekarangModel> call = apiService.getJadwalSkr("Bearer " +token);
        call.enqueue(new Callback<JadwalSekarangModel>() {
            @Override
            public void onResponse(Call<JadwalSekarangModel> call, Response<JadwalSekarangModel> response) {
                JadwalSekarangModel jadwalSekarangModel = response.body();
                System.out.println(jadwalSekarangModel);
                progressDialog.dismiss();

            }

            @Override
            public void onFailure(Call<JadwalSekarangModel> call, Throwable t) {

            }
        });
    }
}
