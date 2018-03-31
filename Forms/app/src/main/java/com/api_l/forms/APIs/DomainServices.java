package com.api_l.forms.APIs;

import com.api_l.forms.Models.DomainModel;
import com.api_l.forms.Models.FormModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by ahmed on 2/20/18.
 */

public interface DomainServices {
    @GET("api/domainssp/{id}")
    public Call<List<DomainModel>> GetAllDomains(@Path("id") int id);

}
