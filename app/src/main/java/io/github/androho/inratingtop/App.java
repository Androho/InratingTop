package io.github.androho.inratingtop;

import android.app.Application;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class App extends Application {
    private Retrofit retrofit;
    private static GetResponseService response;

    @Override
    public void onCreate() {
        super.onCreate();
        retrofit=new Retrofit.Builder()
                .baseUrl("https://api.inrating.top/v1/users/posts/")
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .build();
        response = retrofit.create(GetResponseService.class);
    }
    public static GetResponseService getApi(){
        return response;
    }
}
