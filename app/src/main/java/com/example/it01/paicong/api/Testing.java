package com.example.it01.paicong.api;

import com.example.it01.paicong.entities.customer.Example;

import io.reactivex.Flowable;
import io.reactivex.Observable;
import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by IT01 on 6/2/2017.
 */

public interface Testing {
    @GET("customer")
    Call<Example> hasil();
    @GET("customer")
//    Observable<Example> hasil2();
    Flowable<Example> hasil2();
}
