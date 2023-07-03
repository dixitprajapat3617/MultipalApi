package com.app.androidretrofit.Interface

import androidx.room.Insert
import androidx.room.OnConflictStrategy
import com.app.androidretrofit.Model.User
import com.app.androidretrofit.Model.UserListResponse
import retrofit2.Call
import retrofit2.http.GET

interface ApiService {
    @GET("users?page=2")
    fun getUserList():Call<UserListResponse>
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun inserUser(user: User)
}