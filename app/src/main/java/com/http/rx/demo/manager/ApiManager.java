package com.http.rx.demo.manager;

import com.http.rx.demo.constants.HttpConstants;
import com.http.rx.demo.service.ApiService;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by hero on 2017/11/23.
 */

public class ApiManager {

  private Retrofit retrofit;
  private final int DEFUALT_TIMEOUT = 5;
  private static ApiService apiService;

  private ApiManager(){
    OkHttpClient.Builder builder = new OkHttpClient.Builder();
    builder.connectTimeout(DEFUALT_TIMEOUT, TimeUnit.SECONDS);
    OkHttpClient client = builder.build();

    retrofit = new Retrofit.Builder()
        .baseUrl(HttpConstants.BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
        .client(client)
        .build();
    apiService = retrofit.create(ApiService.class);
  }

  public static synchronized ApiService getApiService(){
    if(apiService == null){
      new ApiManager();
    }
    return apiService;
  }
}
