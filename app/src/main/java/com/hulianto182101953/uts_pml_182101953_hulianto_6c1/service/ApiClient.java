package com.hulianto182101953.uts_pml_182101953_hulianto_6c1.service;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClient {
    public  static Retrofit retrofit;
    public static  final  String BASE_URL = "http://jsonplaceholder.typicode.com/users";
    public static  Retrofit getRetrofitInstance(){
        if(retrofit==null){
            retrofit = new Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }

}
