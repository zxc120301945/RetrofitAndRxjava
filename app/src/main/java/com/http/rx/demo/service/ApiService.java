package com.http.rx.demo.service;

import com.http.rx.demo.constants.HttpConstants;
import com.http.rx.demo.model.Rsource;

import retrofit2.http.GET;
import rx.Observable;

/**
 * Created by hero on 2017/11/23.
 */

public interface ApiService {

  @GET(HttpConstants.REQUEST_HTTP_URL)
  Observable<Rsource> getRsource();
}
