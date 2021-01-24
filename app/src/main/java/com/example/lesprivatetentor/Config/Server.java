package com.example.lesprivatetentor.Config;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.converter.scalars.ScalarsConverterFactory;

import static android.provider.ContactsContract.CommonDataKinds.Website.URL;

public class Server {
    public static final String URL= "http://10.0.2.2:8000/api/";

    public static Retrofit RETROFIT = null;
    //public static OkHttpClient okHttpClient = UnsafeOkHttpClient.getUnsafeOkHttpClient();
    public static Retrofit getClient(){
        if(RETROFIT==null){
            OkHttpClient client = new OkHttpClient.Builder()
                    .addInterceptor(new LoggingInterceptor())
                    .build();
            RETROFIT = new Retrofit.Builder()
                    .baseUrl(URL)
                    .client(client)
                    .addConverterFactory(GsonConverterFactory.create())
                    .addConverterFactory(ScalarsConverterFactory.create())
                    .build();
        }

        return RETROFIT;
    }
}
