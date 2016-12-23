package opendict.oxford;

import opendict.oxford.response.Response;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Retrofit interface.
 * Created by baoke on 22/12/2016.
 */
public interface ApiService {
    @GET("entries/en/{word_id}")
    Call<Response> lookup(@Path("word_id") String word_id);
}
