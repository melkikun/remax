package com.example.it01.paicong.service.Impl;

import android.util.Log;

import com.example.it01.paicong.api.ApiRest;
import com.example.it01.paicong.api.Testing;
import com.example.it01.paicong.entities.customer.Example;
import com.example.it01.paicong.presenter.CustomerPresenter;
import com.example.it01.paicong.service.TestingService;

import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

import io.reactivex.Flowable;
import io.reactivex.Observable;
import io.reactivex.Scheduler;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

/**
 * Created by IT01 on 6/2/2017.
 */

public class TestingServiceImpl implements TestingService{
    private Retrofit retrofit;
    private CustomerPresenter presenter;
    public TestingServiceImpl(CustomerPresenter presenter) {
        this.retrofit = ApiRest.api();
        this.presenter = presenter;
    }

    @Override
    public void print() {
        Testing testing = this.retrofit.create(Testing.class);
        Call<Example> x = testing.hasil();
        x.enqueue(new Callback<Example>() {
            @Override
            public void onResponse(Call<Example> call, Response<Example> response) {
                presenter.print(response.body());
            }

            @Override
            public void onFailure(Call<Example> call, Throwable t) {
                Log.d("gagal", t.getMessage());
            }
        });
    }

    @Override
    public void print2() {
        Testing testing = this.retrofit.create(Testing.class);
        Flowable<Example> flowable = testing.hasil2();
        flowable.subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Subscriber<Example>() {
                    @Override
                    public void onSubscribe(Subscription s) {

                    }

                    @Override
                    public void onNext(Example example) {
                        presenter.print(example);
                    }

                    @Override
                    public void onError(Throwable t) {

                    }

                    @Override
                    public void onComplete() {

                    }
                });
//        Observable<Example> exampleObservable = testing.hasil2();
//        exampleObservable.subscribeOn(Schedulers.io())
//                .observeOn(AndroidSchedulers.mainThread())
//                .subscribe();
    }
}
