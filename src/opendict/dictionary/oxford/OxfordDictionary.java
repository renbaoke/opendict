package opendict.dictionary.oxford;

import okhttp3.OkHttpClient;
import opendict.common.Dictionary;
import opendict.common.Meaning;
import opendict.exception.DictionaryNotAvailableException;
import opendict.dictionary.oxford.response.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.io.IOException;

/**
 * A dictionary based on oxford online open api.
 * https://developer.oxforddictionaries.com
 * Created by baoke on 22/12/2016.
 */
public class OxfordDictionary implements Dictionary {
    private static final String API_BASE_URL = "https://od-api.oxforddictionaries.com/api/v1/";
    private ApiService apiService;

    public OxfordDictionary(String app_id, String app_key) {
        apiService = new Retrofit.Builder()
                .baseUrl(API_BASE_URL)
                .client(new OkHttpClient.Builder()
                        .addInterceptor(chain -> chain.proceed(
                                chain.request().newBuilder()
                                        .addHeader("app_id", app_id)
                                        .addHeader("app_key", app_key)
                                        .build()
                        )).build())
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(ApiService.class);
    }

    @Override
    public Meaning lookup(String word) throws DictionaryNotAvailableException {
        retrofit2.Response<Response> response;
        try {
            response = apiService.lookup(word).execute();
        } catch (IOException e) {
            throw new DictionaryNotAvailableException("network not available");
        }

        return response.body();
    }
}
