package com.example.lesprivatetentor.Fragment.Jadwal.Function;

import android.app.Activity;
import android.app.ProgressDialog;
import android.view.View;
import android.widget.LinearLayout;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.lesprivatetentor.Config.ApiService;
import com.example.lesprivatetentor.Config.Server;
import com.example.lesprivatetentor.Fragment.Jadwal.Adapter.JadwalSekarangAdapter;
import com.example.lesprivatetentor.Fragment.Jadwal.Model.JadwalSekarangModel;
import com.example.lesprivatetentor.Fragment.Jadwal.Model.ListJadwal;
import com.example.lesprivatetentor.Fragment.Jadwal.Model.ListJadwalSekarang;
import com.example.lesprivatetentor.R;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class getJadwalSkr {
    ProgressDialog progressDialog;
    private Activity activity;
    public String token;

    public getJadwalSkr(Activity activity){
        this.activity = activity;
        this.progressDialog = new ProgressDialog(activity);

    }

    public void getJadwalSekarang(final View view) {
        progressDialog.setTitle("Memuat data");
        progressDialog.setMessage("Tunggu Sebentar");
        progressDialog.show();

        ApiService apiService = Server.getClient().create(ApiService.class);
        Call<JadwalSekarangModel> call = apiService.getJadwalSkr("Bearer " +token);
        call.enqueue(new Callback<JadwalSekarangModel>() {
            @Override
            public void onResponse(Call<JadwalSekarangModel> call, Response<JadwalSekarangModel> response) {
                JadwalSekarangModel jadwalSekarangModel = response.body();
                List<ListJadwalSekarang> modelList = jadwalSekarangModel.getJadwal();
//                System.out.println(modelList);
                JadwalSekarangAdapter jadwalSekarangAdapter = new JadwalSekarangAdapter(activity, modelList);
                RecyclerView recyclerView = view.findViewById(R.id.recycle_today);
                LinearLayoutManager manager = new LinearLayoutManager(activity, LinearLayoutManager.VERTICAL, false);
                recyclerView.setLayoutManager(manager);
                recyclerView.hasFixedSize();
                recyclerView.setAdapter(jadwalSekarangAdapter);

                progressDialog.dismiss();

            }

            @Override
            public void onFailure(Call<JadwalSekarangModel> call, Throwable t) {

            }
        });
    }
}
