package com.informatika19100093.databarang

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.informatika19100093.databarang.model.ResponseUsersItem
import com.informatika19100093.databarang.network.koneksi
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import kotlin.math.log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        koneksi.service.getData().enqueue(object : Callback<List<ResponseUsersItem?>?>{
            override fun onResponse(
                call: Call<List<ResponseUsersItem?>?>,
                response: Response<List<ResponseUsersItem?>?>
            ) {
               if(response.isSuccessful){
                   Log.d("Pesan", response.body().toString())
               }
            }

            override fun onFailure(call: Call<List<ResponseUsersItem?>?>, t: Throwable) {
                Log.d("Pesan1", t.localizedMessage)
            }
        })
    }
}