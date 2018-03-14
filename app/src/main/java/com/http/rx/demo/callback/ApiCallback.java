package com.http.rx.demo.callback;

import retrofit2.adapter.rxjava.HttpException;
import rx.Subscriber;

/**
 * Created by hero on 2017/11/23.
 */

public abstract class ApiCallback<M> extends Subscriber<M> {

  public abstract void onSuccess(M model);

  public abstract void onFailure(String msg);

  public abstract void onFinish();

  @Override
  public void onCompleted() {
    onFinish();
  }

  @Override
  public void onError(Throwable e) {

    if (e instanceof HttpException) {
      HttpException httpException = (HttpException) e;
      int code = httpException.code();
      String msg = httpException.getMessage();
      if (code == 504) {
        msg = "网络不给力";
      }
      if (code == 502 || code == 404) {
        msg = "服务器异常，请稍后再试";
      }
      if (code == 302) {
        msg = "请求失败";
      }
      onFailure(msg);
    } else {
      onFailure(e.getMessage());
    }
    onFinish();
  }

  @Override
  public void onNext(M m) {
    onSuccess(m);
  }

}
