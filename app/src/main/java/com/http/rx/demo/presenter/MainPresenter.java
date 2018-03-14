package com.http.rx.demo.presenter;

import com.http.rx.demo.base.BasePresenter;
import com.http.rx.demo.callback.ApiCallback;
import com.http.rx.demo.model.Rsource;
import com.http.rx.demo.view.MainView;

/**
 * Created by hero on 2017/11/23.
 */

public class MainPresenter extends BasePresenter<MainView> {

  public MainPresenter(MainView view){
    attachView(view);
  }

  public void loadData(){
    mView.showLoading();

    addSubscription(apiService.getRsource(), new ApiCallback<Rsource>() {

      @Override
      public void onSuccess(Rsource model) {
        mView.getDataSuccess(model);
      }

      @Override
      public void onFailure(String msg) {
        mView.getDataFail(msg);
      }

      @Override
      public void onFinish() {
        mView.hideLoading();
      }

    });

  }
}
