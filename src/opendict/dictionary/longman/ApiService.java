package opendict.dictionary.longman;

import opendict.dictionary.longman.response.Response;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Retrofit interface.
 * Created by baoke on 22/12/2016.
 */
public interface ApiService {
    @GET("ldoce5/entries")
    Call<Response> lookup(@Query("headword") String headword, @Query("apiKey") String apiKey);
}
