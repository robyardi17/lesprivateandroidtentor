package com.example.lesprivatetentor.Fragment.Jadwal.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.lesprivatetentor.Fragment.Jadwal.Model.JadwalModel;
import com.example.lesprivatetentor.Fragment.Jadwal.Model.ListJadwalSekarang;
import com.example.lesprivatetentor.R;

import java.util.List;

public class JadwalSekarangAdapter extends RecyclerView.Adapter<JadwalSekarangAdapter.JadwalHolder> {

    private Context context;
    private List<ListJadwalSekarang> listJadwal;

    public JadwalSekarangAdapter(Context context, List<ListJadwalSekarang> listJadwal) {
        this.context = context;
        this.listJadwal = listJadwal;
    }

    @NonNull
    @Override
    public JadwalSekarangAdapter.JadwalHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_jadwal_skr, null);
        JadwalHolder jadwalHolder = new JadwalHolder(view);
        return jadwalHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull JadwalSekarangAdapter.JadwalHolder holder, int position) {
        holder.init(listJadwal.get(position));

    }

    @Override
    public int getItemCount() {

        return listJadwal.size();
    }


    public class JadwalHolder extends RecyclerView.ViewHolder{

        private TextView tvNama, tvMatpel;
        public JadwalHolder(@NonNull View itemView) {
            super(itemView);
            tvNama = itemView.findViewById(R.id.tvNama);
            tvMatpel = itemView.findViewById(R.id.tvMataPelajaran);
        }

        public void init(ListJadwalSekarang jadwalList) {
            tvNama.setText(jadwalList.getBimbingan().getSiswa().getNama());
        }
    }
}
