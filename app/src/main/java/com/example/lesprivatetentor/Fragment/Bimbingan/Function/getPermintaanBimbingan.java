package com.example.lesprivatetentor.Fragment.Bimbingan.Function;

import android.app.Activity;
import android.app.ProgressDialog;

import com.example.lesprivatetentor.Config.ApiService;
import com.example.lesprivatetentor.Config.Server;
import com.example.lesprivatetentor.Fragment.Bimbingan.Model.PermintaanBimbinganModel;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class getPermintaanBimbingan {
    ProgressDialog progressDialog;
    private Activity activity;

    public getPermintaanBimbingan(Activity activity){
        this.activity = activity;
        this.progressDialog = new ProgressDialog(activity);

    }

    public void getPermintaanBimbingan(String token) {
        progressDialog.setTitle("Memuat data");
        progressDialog.setMessage("Tunggu Sebentar");
        progressDialog.show();

        ApiService apiService = Server.getClient().create(ApiService.class);
        Call<PermintaanBimbinganModel> call = apiService.getPermintaanBimbingan("Bearer " +token);
        call.enqueue(new Callback<PermintaanBimbinganModel>() {
            @Override
            public void onResponse(Call<PermintaanBimbinganModel> call, Response<PermintaanBimbinganModel> response) {
                PermintaanBimbinganModel permintaanBimbinganModel = response.body();
                System.out.println(permintaanBimbinganModel);
                progressDialog.dismiss();

            }

            @Override
            public void onFailure(Call<PermintaanBimbinganModel> call, Throwable t) {

            }
        });
    }
}
