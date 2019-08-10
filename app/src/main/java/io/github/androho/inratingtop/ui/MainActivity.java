package io.github.androho.inratingtop.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import java.util.List;

import io.github.androho.inratingtop.App;
import io.github.androho.inratingtop.observable.GetObservable;
import io.github.androho.inratingtop.model.commentators.GetAllCommentators;
import io.github.androho.inratingtop.model.likers.Datum;
import io.github.androho.inratingtop.model.mentions.GetAllMentions;
import io.github.androho.inratingtop.model.postinfo.GetPostInfo;
import io.github.androho.inratingtop.model.reposters.GetAllReposters;
import rx.Observable;

import io.github.androho.inratingtop.R;
import io.github.androho.inratingtop.model.likers.GetAllLikers;

public class MainActivity extends AppCompatActivity {
    public static Observable<GetAllLikers> allLikersObservable = null;
    public static Observable<GetPostInfo> postInfoObservable = null;
    public static Observable<GetAllCommentators> allCommentatorsObservable = null;
    public static Observable<GetAllMentions> allMentionsObservable = null;
    public static Observable<GetAllReposters> allRepostersObservable = null;
    public int POST_ID = 2790;
    public List<Datum> datumListLikers;
    public List<io.github.androho.inratingtop.model.commentators.Datum> datumListCommentators;
    public List<io.github.androho.inratingtop.model.mentions.Datum> datumListMentions;
    public List<io.github.androho.inratingtop.model.reposters.Datum> datumListReposters;
    public RecyclerView rvLikers, rvCommentators, rvMentions, rvReposters;
    public TextView tvLikersCounter, tvViewsCounter, tvCommentCounter, tvMentionsCounter, tvReposterstCounter, tvBookmarksCounter,
            tvLikersCounterLeft, tvLikersMoreSymbol, tvLikersMore,
            tvCommentsCounterLeft, tvCommentsMoreSymbol, tvCommentsMore,
            tvMentionsCounterLeft, tvMentionsMoreSymbol, tvMentionsMore,
            tvRepostersCounterLeft, tvRepostersMoreSymbol, tvRepostersMore;

    public LinearLayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvLikers = (RecyclerView) findViewById(R.id.rv_likers);
        rvCommentators = (RecyclerView) findViewById(R.id.rv_commentators);
        rvMentions = (RecyclerView) findViewById(R.id.rv_markers);
        rvReposters = (RecyclerView) findViewById(R.id.rv_reposts);
        tvLikersCounter = (TextView) findViewById(R.id.tv_likers_counter);
        tvLikersCounterLeft = (TextView) findViewById(R.id.tv_counter_left);
        tvLikersMore = (TextView) findViewById(R.id.tv_likers_more);
        tvLikersMoreSymbol = (TextView) findViewById(R.id.tv_more_symbol);
        tvViewsCounter = (TextView) findViewById(R.id.tv_views_counter);
        tvCommentCounter = (TextView) findViewById(R.id.tv_comentators_counter);
        tvCommentsCounterLeft = (TextView) findViewById(R.id.tv_commentators_counter_left);
        tvCommentsMore = (TextView) findViewById(R.id.tv_commentators_more);
        tvCommentsMoreSymbol = (TextView) findViewById(R.id.tv_commentators_more_symbol);
        tvMentionsCounter = (TextView) findViewById(R.id.tv_markers_counter);
        tvMentionsCounterLeft = (TextView) findViewById(R.id.tv_markers_counter_left);
        tvMentionsMore = (TextView) findViewById(R.id.tv_markers_more);
        tvMentionsMoreSymbol = (TextView) findViewById(R.id.tv_markers_more_symbol);
        tvReposterstCounter = (TextView) findViewById(R.id.tv_reposts_counter);
        tvBookmarksCounter = (TextView) findViewById(R.id.tv_bookmarks_counter);
        tvRepostersCounterLeft = (TextView) findViewById(R.id.tv_reposts_counter_left);
        tvRepostersMore = (TextView) findViewById(R.id.tv_reposts_more);
        tvRepostersMoreSymbol = (TextView) findViewById(R.id.tv_reposts_more_symbol);

        getData(POST_ID);
    }

    private void getData(int postId) {
        allLikersObservable = App.getApiLikers()
                .getLikersData(postId);
        postInfoObservable = App.getApiPostinfo()
                .getPostinfoData(postId);
        allCommentatorsObservable = App.getApiCommentators()
                .getCommentatorsData(postId);
        allMentionsObservable = App.getApiMentions()
                .getMentionsData(postId);
        allRepostersObservable = App.getApiReposters()
                .getRepostersData(postId);

        GetObservable.getObservable(this,
                allCommentatorsObservable, postInfoObservable,
                allLikersObservable, allRepostersObservable,allMentionsObservable);
    }

}
