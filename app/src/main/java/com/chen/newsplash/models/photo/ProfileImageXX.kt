package com.chen.newsplash.models.photo


import com.google.gson.annotations.SerializedName

data class ProfileImageXX(
    @SerializedName("large")
    var large: String,
    @SerializedName("medium")
    var medium: String,
    @SerializedName("small")
    var small: String
)