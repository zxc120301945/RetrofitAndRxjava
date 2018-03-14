package com.http.rx.demo;

import android.os.Bundle;
import android.widget.Toast;

import com.http.rx.demo.model.Rsource;
import com.http.rx.demo.presenter.MainPresenter;
import com.http.rx.demo.view.MainView;
import com.http.rx.demo.view.MvpActivtiy;

public class MainActivity extends MvpActivtiy<MainPresenter> implements MainView {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    mPresenter.loadData();
  }

  @Override
  protected MainPresenter createPresenter() {
    return new MainPresenter(this);
  }

  @Override
  public void showLoading() {
    Toast.makeText(this, "开启loading", Toast.LENGTH_SHORT).show();
  }

  @Override
  public void hideLoading() {
    Toast.makeText(this, "关闭loading", Toast.LENGTH_SHORT).show();

  }

  @Override
  public void getDataSuccess(Rsource model) {
    if (model != null) {
      Toast.makeText(this, "box_id = " + model.getBox_id(), Toast.LENGTH_SHORT).show();
      ;
    } else {
      Toast.makeText(this, "model不存在", Toast.LENGTH_SHORT).show();
      ;
    }
  }

  @Override
  public void getDataFail(String msg) {
    Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    ;
  }
}
