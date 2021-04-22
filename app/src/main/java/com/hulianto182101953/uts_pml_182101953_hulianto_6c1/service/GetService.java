package com.hulianto182101953.uts_pml_182101953_hulianto_6c1.service;

import com.hulianto182101953.uts_pml_182101953_hulianto_6c1.model.User;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface GetService {
    @GET("/users")
    Call<List<User>> getUserList();
}
