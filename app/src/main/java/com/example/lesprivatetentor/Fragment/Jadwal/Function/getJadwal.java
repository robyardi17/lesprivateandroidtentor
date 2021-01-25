package com.example.lesprivatetentor.Fragment.Jadwal.Function;

import android.app.Activity;
import android.app.ProgressDialog;
import android.app.Service;
import android.content.Context;

import com.example.lesprivatetentor.Config.ApiService;
import com.example.lesprivatetentor.Config.Server;
import com.example.lesprivatetentor.Fragment.Jadwal.Adapter.JadwalSekarangAdapter;
import com.example.lesprivatetentor.Fragment.Jadwal.Model.DDLHari;
import com.example.lesprivatetentor.Fragment.Jadwal.Model.JadwalModel;
import com.example.lesprivatetentor.Fragment.Jadwal.Model.ListJadwal;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class getJadwal {
    ProgressDialog progressDialog;
    private Activity activity;

    public getJadwal(Activity activity){
        this.activity = activity;
        this.progressDialog = new ProgressDialog(activity);

    }

    public void getJadwalSemua(String token, String idHari) {
        progressDialog.setTitle("Memuat data");
        progressDialog.setMessage("Tunggu Sebentar");
        progressDialog.show();

        ApiService apiService = Server.getClient().create(ApiService.class);
        Call<JadwalModel> call = apiService.getJadwalHariIni("Bearer " +token, idHari);
        call.enqueue(new Callback<JadwalModel>() {
            @Override
            public void onResponse(Call<JadwalModel> call, Response<JadwalModel> response) {
                JadwalModel jadwalModel = response.body();

                progressDialog.dismiss();
            }

            @Override
            public void onFailure(Call<JadwalModel> call, Throwable t) {

            }
        });
    }
}
