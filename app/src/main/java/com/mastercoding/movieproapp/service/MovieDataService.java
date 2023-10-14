package com.mastercoding.movieproapp.service;

import com.mastercoding.movieproapp.model.Result;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface MovieDataService {

    // Base Url
    // https://api.themoviedb.org/3/
    //
    // End Point Url
    // movie/popular?api_key=a4e3e5a69ec1084596e4b3ce7ad09ce0
    @GET("movie/popular")
    Call<Result> getPopularMovies(@Query("api_key") String apiKey);

}
