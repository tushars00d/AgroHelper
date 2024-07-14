package com.doubtless.doubtless.screens

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.doubtless.doubtless.R
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class APIfetch : AppCompatActivity() {
    lateinit var myAdapter: MyAdapter
    lateinit var linearLayoutManager: LinearLayoutManager

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_apifetch)


        val recyclerview_users = findViewById<RecyclerView>(R.id.recyclerview_users)
        recyclerview_users.setHasFixedSize(true)
        linearLayoutManager = LinearLayoutManager(this)
        recyclerview_users.layoutManager = linearLayoutManager

        getMyData()
    }

    private fun getMyData() {
        val retrofitBuilder = Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl(BASE_URL)
            .build()
            .create(ApiInterface::class.java)

        val retrofitData = retrofitBuilder.getData()

        retrofitData.enqueue(object : Callback<List<MyDataItem>?> {
            override fun onResponse(
                call: Call<List<MyDataItem>?>,
                response: Response<List<MyDataItem>?>
            ) {
                val responseBody = response.body() ?: emptyList()
                myAdapter = MyAdapter(this@APIfetch, responseBody)
                myAdapter.notifyDataSetChanged()
                val recyclerview_users = findViewById<RecyclerView>(R.id.recyclerview_users)
                recyclerview_users.adapter = myAdapter
            }

            override fun onFailure(call: Call<List<MyDataItem>?>, t: Throwable) {
                Log.d("APIfetch", "onfailure: ${t.message}")
            }
        })
    }

    companion object {
        const val BASE_URL = "https://jsonplaceholder.typicode.com/"
    }
}
