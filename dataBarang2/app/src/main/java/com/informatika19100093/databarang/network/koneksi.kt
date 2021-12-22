package com.informatika19100093.databarang.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


class koneksi {
    companion object{
        var retrofit = Retrofit.Builder()
            .baseUrl("https://jsonplaceholder.typicode.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        var service: ApiService = retrofit.create<ApiService>(ApiService::class.java)
    }
    }
}