package com.chen.newsplash.models.photo


import com.google.gson.annotations.SerializedName

data class Tag(
    @SerializedName("title")
    var title: String
)