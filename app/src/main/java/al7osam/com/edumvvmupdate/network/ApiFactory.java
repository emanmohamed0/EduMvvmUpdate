package al7osam.com.edumvvmupdate.network;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

import static al7osam.com.edumvvmupdate.utils.Constants.Base_Url;

/**
 * Created by eman.eraqi on 1/23/2019.
 */

public class ApiFactory {
    public static AppServices create() {
        Retrofit retrofit = new Retrofit.Builder().baseUrl(Base_Url)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();
        return retrofit.create(AppServices.class);
    }
}