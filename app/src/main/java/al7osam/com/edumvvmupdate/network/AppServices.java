package al7osam.com.edumvvmupdate.network;

import java.util.HashMap;

import al7osam.com.edumvvmupdate.model.BlogsOutput;
import io.reactivex.Observable;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.POST;

/**
 * Created by eman.eraqi on 1/23/2019.
 */

public interface AppServices {
    @POST("GetBlogs")
    Call<BlogsOutput> GetBlogs(@Body HashMap<String, Object> body_data,
                               @Header("Content-Type") String header_type,
                               @Header("Lang") String Lang);


    @POST("GetBlogs")
    Observable<BlogsOutput> GetBlogsObserver(@Body HashMap<String, Object> body_data,
                                             @Header("Content-Type") String header_type,
                                             @Header("Lang") String Lang);
}
