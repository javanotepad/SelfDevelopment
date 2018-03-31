package com.api_l.forms.APIs;

import com.api_l.forms.Models.AnswerModel;
import com.api_l.forms.Models.AuthModel;
import com.api_l.forms.Models.UserModel;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

/**
 * Created by ahmed on 3/6/18.
 */

public interface AnswerServices {
    @POST("api/answers/")
    public Call<AnswerModel> AddAnswer(@Body AnswerModel body);


}
