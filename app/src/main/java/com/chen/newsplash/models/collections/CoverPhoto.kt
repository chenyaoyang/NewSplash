package com.chen.newsplash.models.collections


import com.google.gson.annotations.SerializedName

data class CoverPhoto(

    @SerializedName("color")
    var color: String,
    @SerializedName("height")
    var height: Int,
    @SerializedName("width")
    var width: Int,
    @SerializedName("urls")
    var urls: Urls

)