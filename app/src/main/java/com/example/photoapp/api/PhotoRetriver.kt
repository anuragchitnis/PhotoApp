package com.example.photoapp.api

import com.example.photoapp.models.PhotoList
import retrofit2.Callback
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

/**
 * Created by anura on 6/2/2017.
 */
class PhotoRetriver {
    private val service : PhotoApi

    init {
        val retrofit = Retrofit.Builder().
                baseUrl("https://pixabay.com/api/")
                .addConverterFactory(GsonConverterFactory.create())
                .build()
        service = retrofit.create(PhotoApi::class.java)
    }

    fun getPhotos(callback : Callback<PhotoList>) {
        val call  = service.getPhotos()
        call.enqueue(callback)

    }
}