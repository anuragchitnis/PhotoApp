package com.example.photoapp.api

import com.example.photoapp.models.PhotoList
import retrofit2.Call
import retrofit2.http.GET

/**
 * Created by anura on 6/2/2017.
 */
interface PhotoApi {
    @GET("?key=5534211-215158b7248b4e3109061ac87&q=nature&image_type=photo")
    fun getPhotos(): Call<PhotoList>
}