package io.imagekit.imagekitdemo

import retrofit2.http.Body
import retrofit2.http.POST

interface UploadAuthService {
    @POST("/")
    suspend fun generateUploadAuthToken(@Body body: TokenRequest): Map<String, String>
}