package com.jp_funda.qiitaclient.model

import com.squareup.moshi.Json

data class Article(
    val id: String,
    val title: String,
    val user: User,
) {
    data class User(
        val id: String,
        @Json(name = "profile_image_url")
        val profileImageUrl: String,
    )
}