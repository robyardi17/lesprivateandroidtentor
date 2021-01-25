package com.example.lesprivatetentor.Fragment.Bimbingan.Function;

import android.app.Activity;
import android.app.ProgressDialog;

import com.example.lesprivatetentor.Config.ApiService;
import com.example.lesprivatetentor.Config.Server;
import com.example.lesprivatetentor.Fragment.Bimbingan.Model.BimbinganBerjalanModel;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class getBimbinganBerjalan {
    ProgressDialog progressDialog;
    private Activity activity;

    public getBimbinganBerjalan(Activity activity){
        this.activity = activity;
        this.progressDialog = new ProgressDialog(activity);

    }

    public void getBimbinganBerjalan(String token, String search) {
        progressDialog.setTitle("Memuat data");
        progressDialog.setMessage("Tunggu Sebentar");
        progressDialog.show();

        ApiService apiService = Server.getClient().create(ApiService.class);
        Call<BimbinganBerjalanModel> call = apiService.getBimbinganBerjalan("Bearer " +token, search);
        call.enqueue(new Callback<BimbinganBerjalanModel>() {
            @Override
            public void onResponse(Call<BimbinganBerjalanModel> call, Response<BimbinganBerjalanModel> response) {
                BimbinganBerjalanModel bimbinganBerjalanModel = response.body();
                System.out.println(bimbinganBerjalanModel);
                progressDialog.dismiss();

            }

            @Override
            public void onFailure(Call<BimbinganBerjalanModel> call, Throwable t) {

            }
        });
    }
}
