package io.github.androho.inratingtop;

import android.app.Application;

import io.github.androho.inratingtop.apiservise.GetResponseServiceCommentators;
import io.github.androho.inratingtop.apiservise.GetResponseServiceLikers;
import io.github.androho.inratingtop.apiservise.GetResponseServiceMentions;
import io.github.androho.inratingtop.apiservise.GetResponseServicePostinfo;
import io.github.androho.inratingtop.apiservise.GetResponseServiceReposters;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class App extends Application {
    private Retrofit retrofit;
    private static GetResponseServiceLikers responseServiceLikers;
    private static GetResponseServiceCommentators responseServiceCommentators;
    private static GetResponseServicePostinfo responseServicePostinfo;
    private static GetResponseServiceMentions responseServiceMentions;
    private static GetResponseServiceReposters responseServiceReposters;
    private static String BASE_URL = "https://api.inrating.top/v1/users/posts/";

    @Override
    public void onCreate() {
        super.onCreate();
        retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .build();
        responseServiceLikers = retrofit.create(GetResponseServiceLikers.class);
        responseServiceCommentators = retrofit.create(GetResponseServiceCommentators.class);
        responseServicePostinfo = retrofit.create(GetResponseServicePostinfo.class);
        responseServiceMentions = retrofit.create(GetResponseServiceMentions.class);
        responseServiceReposters=retrofit.create(GetResponseServiceReposters.class);
    }

    public static GetResponseServiceLikers getApiLikers() {
        return responseServiceLikers;
    }

    public static GetResponseServiceCommentators getApiCommentators() {
        return responseServiceCommentators;
    }

    public static GetResponseServicePostinfo getApiPostinfo() {
        return responseServicePostinfo;
    }

    public static GetResponseServiceMentions getApiMentions() {
        return responseServiceMentions;
    }
    public static GetResponseServiceReposters getApiReposters(){
        return responseServiceReposters;
    }
}
