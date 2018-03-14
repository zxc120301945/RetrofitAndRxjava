package com.http.rx.demo.view;

import com.http.rx.demo.base.BaseView;
import com.http.rx.demo.model.Rsource;

/**
 * Created by hero on 2017/11/23.
 */

public interface MainView extends BaseView {

  void getDataSuccess(Rsource model);

  void getDataFail(String msg);
}
