package opendict.longman;

import opendict.common.Dictionary;
import opendict.common.Meaning;
import opendict.exception.DictionaryNotAvailableException;
import opendict.longman.response.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.io.IOException;

/**
 * A dictionary based on longman online open api.
 * http://developer.pearson.com/apis/dictionaries
 * Created by baoke on 22/12/2016.
 */
public class LongmanDictionary implements Dictionary {
    private static final String API_BASE_URL = "http://api.pearson.com/v2/dictionaries/";
    private ApiService apiService;
    private String apiKey;

    public LongmanDictionary(String apiKey) {
        this.apiKey = apiKey;
        apiService = new Retrofit.Builder()
                .baseUrl(API_BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(ApiService.class);
    }

    @Override
    public Meaning lookup(String word) throws DictionaryNotAvailableException {
        retrofit2.Response<Response> response;
        try {
            response = apiService.lookup(word, apiKey).execute();
        } catch (IOException e) {
            throw new DictionaryNotAvailableException("network not available");
        }
        return response.body();
    }
}
