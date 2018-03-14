package com.http.rx.demo.view;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.http.rx.demo.presenter.MainPresenter;

/**
 * Created by hero on 2017/11/23.
 */

public abstract class MvpActivtiy<P extends MainPresenter> extends AppCompatActivity {

  protected P mPresenter;

  @Override
  protected void onCreate(@Nullable Bundle savedInstanceState) {
    mPresenter = createPresenter();
    super.onCreate(savedInstanceState);
  }

  protected abstract P createPresenter();

  @Override
  protected void onDestroy() {
    super.onDestroy();
    //页面销毁时取消presenter绑定
    if (mPresenter != null) mPresenter.detachView();
  }
}
