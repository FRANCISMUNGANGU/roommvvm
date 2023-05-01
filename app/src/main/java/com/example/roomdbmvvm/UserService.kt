package com.example.roomdbmvvm

import retrofit2.http.GET

interface UserService {
    //     HTTP Requests (GET. POST. UPDATE. DELETE)
    @GET("/users")
    suspend fun fetchUsers() : List<User>
}