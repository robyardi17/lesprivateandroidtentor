package com.example.lesprivatetentor.Activity.Login;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

import com.example.lesprivatetentor.Activity.MainActivity;
import com.example.lesprivatetentor.Config.ApiService;
import com.example.lesprivatetentor.Config.Server;
import com.example.lesprivatetentor.Config.Session.SessionClass;
import com.google.gson.JsonIOException;

import org.json.JSONException;
import org.json.JSONObject;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LoginHandler {
    private static final String TAG = LoginHandler.class.getSimpleName();
    private Activity activity;
    private ProgressDialog progressDialog;
    private SessionClass sessionClass;
    private JSONObject jsonObject;
    public String username, password;

    public LoginHandler(Activity activity) {
        this.activity = activity;
        this.jsonObject = new JSONObject();
        this.progressDialog = new ProgressDialog(activity);
        this.sessionClass = new SessionClass(activity);
    }

    public void login() {
        progressDialog.setTitle("Sedang Login...");
        progressDialog.setMessage("Tunggu Sebentar...");
        progressDialog.show();

        ApiService service = Server.getClient().create(ApiService.class);
        Call <ResponsModel> userModelCall = service.getLogin(username, password);
        userModelCall.enqueue(new Callback<ResponsModel>() {
            @Override
            public void onResponse(Call<ResponsModel> call, Response<ResponsModel> response) {
                try {
                    if (response.isSuccessful()) {
                        ResponsModel model = response.body();
                        ModelUser modelUser = model.getModelUser();
                        if (modelUser.getRole().equals(2)) {
                            Intent intent = new Intent(activity, MainActivity.class);
                            sessionClass.id = String.valueOf(modelUser.getId());
                            sessionClass.email = modelUser.getEmail();
                            sessionClass.emailverified = modelUser.getEmailVerifiedAt();
                            sessionClass.username = modelUser.getUsername();
                            sessionClass.role = String.valueOf(modelUser.getRole());
                            sessionClass.createAt = modelUser.getCreatedAt();
                            sessionClass.updateAt = modelUser.getUpdatedAt();
                            sessionClass.token = model.getToken();
                            activity.finish();
                            sessionClass.saveSession();
                            System.out.println("token" + model.getToken());
                            Toast.makeText(activity, "Selamat datang " + modelUser.getUsername(), Toast.LENGTH_LONG).show();
                            activity.startActivity(intent);
                            progressDialog.dismiss();
                        } else {
                            showDialog("Akun Yang Digunakan Bukan Tentor!");
                            progressDialog.dismiss();
                        }
                    } else {
                        showDialog("User Tentor tidak di temukan (Username/Password salah)");
                        progressDialog.dismiss();
                    }

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            @Override
            public void onFailure(Call<ResponsModel> call, Throwable t) {
                Log.e("error", t.getMessage());
                progressDialog.dismiss();
            }
        });
    }

    public void showDialog(String message) {
        AlertDialog alertDialog = new AlertDialog.Builder(activity).create();
        alertDialog.setTitle("Kesalahan Login");
        alertDialog.setMessage(message);
        alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "Coba Lagi",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });
        alertDialog.show();
    }
}
