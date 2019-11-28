package com.dev.footballchampion.services

import com.dev.footballchampion.model.match.ResponseNextMatch
import com.dev.footballchampion.model.match.ResponsePrevMatch
import com.google.gson.GsonBuilder
import io.reactivex.Observable
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query
import java.util.concurrent.TimeUnit

interface BaseApi {

    @GET("eventsnextleague.php")
    fun getNextMatch(
        @Query("id") id: String
    ) : Observable<ResponseNextMatch>

    @GET("eventspastleague.php")
    fun getPrevMatch(
        @Query("id") id: String
    ) : Observable<ResponsePrevMatch>

    companion object {
        var URL: String = "https://www.thesportsdb.com/api/v1/json/1/"
        fun create(): BaseApi {
            val gson = GsonBuilder()
                .setLenient()
                .create()

            val clientBuilder = OkHttpClient.Builder()
            clientBuilder.connectTimeout(10, TimeUnit.SECONDS)
                .readTimeout(10, TimeUnit.SECONDS)
                .writeTimeout(10, TimeUnit.SECONDS)
                .retryOnConnectionFailure(true)
                .build()
            val client = clientBuilder.build()
            val retrofit = Retrofit.Builder()
                .baseUrl(URL)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .client(client)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build()
            return retrofit.create(BaseApi::class.java)
        }
    }
}