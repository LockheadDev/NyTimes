package edu.itesm.prros.patterns

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitSingleton {
    fun getRetroFit(): Retrofit {
        return Retrofit.Builder()
            .baseUrl("https://api.nytimes.com/svc/books/v3/lists")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
}