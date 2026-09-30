package com.codepath.nationalparks

import com.google.gson.annotations.SerializedName

class NationalPark {
    @JvmField
    @SerializedName("fullName")
    var name: String? = null

    @JvmField
    @SerializedName("description")
    var description: String? = null

    @JvmField
    @SerializedName("states")
    var location: String? = null

    @SerializedName("images")
    var images: List<Image>? = null

    // Returns the URL of the park's first image
    val imageUrl: String? get() = images?.firstOrNull()?.url

    class Image {
        @SerializedName("url")
        var url: String? = null
    }
}