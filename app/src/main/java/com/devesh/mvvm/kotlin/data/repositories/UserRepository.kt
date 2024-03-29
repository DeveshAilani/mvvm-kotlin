package com.devesh.mvvm.kotlin.data.repositories

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.devesh.mvvm.kotlin.data.network.MyApi
import com.devesh.mvvm.kotlin.data.network.response.AuthResponse
import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class UserRepository {

    /*fun userLogin(email:String, password:String) :LiveData<String> {

        val loginResponse = MutableLiveData<String>()
        MyApi().userLogin(email, password)
            .enqueue(object : Callback<ResponseBody>{
                override fun onFailure(call: Call<ResponseBody>, t: Throwable) {
                    loginResponse.value = t.message
                }

                override fun onResponse(call: Call<ResponseBody>, response: Response<ResponseBody>) {
                    if (response.isSuccessful){
                        loginResponse.value = response.body()?.string()
                    }else{
                        loginResponse.value = response.errorBody()?.string()
                    }
                }

            })
        return loginResponse
    }*/

    suspend fun userLogin(email:String, password:String) :Response<AuthResponse> {
        return MyApi().userLogin(email, password)
    }
}