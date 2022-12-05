package com.ahmfarisi.quotes.API;

import com.ahmfarisi.quotes.Model.QuotesModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface APIRequestData {
    @GET("quotes")
    Call<List<QuotesModel>> requestData();
}
