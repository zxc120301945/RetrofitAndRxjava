package com.http.rx.demo.base;

import com.http.rx.demo.manager.ApiManager;
import com.http.rx.demo.service.ApiService;

import rx.Observable;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;
import rx.subscriptions.CompositeSubscription;

/**
 * Created by hero on 2017/11/23.
 */

public class BasePresenter<V> {

  protected V mView;
  protected ApiService apiService;
  private CompositeSubscription mCompositeSubscription;

  public void attachView(V view) {
    mView = view;
    apiService = ApiManager.getApiService();
  }

  public void detachView() {
    mView = null;
  }

  //RXjava统一取消注册，以避免内存泄露
  public void onUnsubscribe() {
    if (mCompositeSubscription != null && mCompositeSubscription.hasSubscriptions()) {
      mCompositeSubscription.unsubscribe();
    }
  }

  /**
   * ObserveOn
   * specify the Scheduler on which an observer will observe this Observable
   * 指定一个观察者在哪个调度器上观察这个Observable
   * <p>
   * SubscribeOn
   * specify the Scheduler on which an Observable will operate
   * 指定Observable自身在哪个调度器上执行
   *
   * @param observable
   * @param subscriber
   */
  public void addSubscription(Observable observable, Subscriber subscriber) {
    if (mCompositeSubscription == null) {
      mCompositeSubscription = new CompositeSubscription();
    }
    mCompositeSubscription.add(observable
        .subscribeOn(Schedulers.io())
        .observeOn(AndroidSchedulers.mainThread())
        .subscribe(subscriber));
  }

}
