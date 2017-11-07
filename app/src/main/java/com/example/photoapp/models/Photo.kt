package com.example.photoapp.models

import java.io.Serializable

/**
 * Created by anura on 6/2/2017.
 */
data class Photo(val id: Int,
                 val likes: Int,
                 val favorites: Int,
                 val tags: String,
                 val previewURL: String,
                 val webformatURL: String) : Serializable{

}
