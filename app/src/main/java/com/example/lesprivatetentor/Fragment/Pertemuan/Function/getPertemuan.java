package com.example.lesprivatetentor.Fragment.Pertemuan.Function;

import android.app.Activity;
import android.app.ProgressDialog;

import com.example.lesprivatetentor.Config.ApiService;
import com.example.lesprivatetentor.Config.Server;
import com.example.lesprivatetentor.Fragment.Jadwal.Model.JadwalModel;
import com.example.lesprivatetentor.Fragment.Pertemuan.Model.PertemuanModel;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class getPertemuan {
    ProgressDialog progressDialog;
    private Activity activity;

    public getPertemuan(Activity activity){
        this.activity = activity;
        this.progressDialog = new ProgressDialog(activity);

    }

    public void getPertemuan(String token, String date) {
        progressDialog.setTitle("Memuat data");
        progressDialog.setMessage("Tunggu Sebentar");
        progressDialog.show();

        ApiService apiService = Server.getClient().create(ApiService.class);
        Call<PertemuanModel> call = apiService.getPertemuan("Bearer " +token, date);
        call.enqueue(new Callback<PertemuanModel>() {
            @Override
            public void onResponse(Call<PertemuanModel> call, Response<PertemuanModel> response) {
                PertemuanModel pertemuanModel = response.body();
                System.out.println(pertemuanModel);
                progressDialog.dismiss();

            }

            @Override
            public void onFailure(Call<PertemuanModel> call, Throwable t) {

            }
        });
    }
}
