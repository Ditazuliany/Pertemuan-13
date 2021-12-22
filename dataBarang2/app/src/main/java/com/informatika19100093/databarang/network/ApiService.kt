package com.informatika19100093.databarang.network

import com.informatika19100093.databarang.model.ResponseUsersItem
import retrofit2.Call
import retrofit2.http.GET




interface ApiService {
    @GET("users")
    fun getData() : Call<List<ResponseUsersItem?>?>
}