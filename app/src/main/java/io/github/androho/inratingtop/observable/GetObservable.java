package io.github.androho.inratingtop.observable;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.concurrent.TimeUnit;

import io.github.androho.inratingtop.adapters.CommentatorsAdapter;
import io.github.androho.inratingtop.adapters.LikersAdapter;
import io.github.androho.inratingtop.adapters.MentionsAdapter;
import io.github.androho.inratingtop.adapters.RepostersAdapter;
import io.github.androho.inratingtop.model.commentators.GetAllCommentators;
import io.github.androho.inratingtop.model.likers.GetAllLikers;
import io.github.androho.inratingtop.model.mentions.GetAllMentions;
import io.github.androho.inratingtop.model.postinfo.GetPostInfo;
import io.github.androho.inratingtop.model.reposters.GetAllReposters;
import io.github.androho.inratingtop.ui.MainActivity;
import rx.Observable;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;


public class GetObservable {
    public static void getObservable(final MainActivity mainActivity,
                                     Observable<GetAllCommentators> allCommentatorsObservable,
                                     Observable<GetPostInfo> postInfoObservable,
                                     Observable<GetAllLikers> allLikersObservable,
                                     Observable<GetAllReposters> allRepostersObservable,
                                     Observable<GetAllMentions> allMentionsObservable) {
//    Commentators
        allCommentatorsObservable.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Subscriber<GetAllCommentators>() {
                    @Override
                    public void onCompleted() {
                    }

                    @Override
                    public void onError(Throwable e) {
                    }

                    @Override
                    public void onNext(GetAllCommentators getAllCommentators) {
                        mainActivity.datumListCommentators = getAllCommentators.getData();
                        mainActivity.layoutManager
                                = new LinearLayoutManager(mainActivity, LinearLayoutManager.HORIZONTAL, false);
                        mainActivity.rvCommentators.setLayoutManager(mainActivity.layoutManager);
                        CommentatorsAdapter commentatorsAdapter = new CommentatorsAdapter(mainActivity, mainActivity.datumListCommentators);
                        mainActivity.rvCommentators.setAdapter(commentatorsAdapter);
                        mainActivity.tvCommentCounter.setText(Integer.toString(mainActivity.datumListCommentators.size()));
                        int size = mainActivity.datumListCommentators.size();
                        if (size == 0) {
                            mainActivity.tvCommentsCounterLeft.setVisibility(View.GONE);
                            mainActivity.tvCommentsMore.setVisibility(View.GONE);
                            mainActivity.tvCommentsMoreSymbol.setVisibility(View.GONE);
                        }
                        mainActivity.rvCommentators.addOnScrollListener(new RecyclerView.OnScrollListener() {
                            @Override
                            public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
                                super.onScrollStateChanged(recyclerView, newState);
                            }

                            @Override
                            public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
                                super.onScrolled(recyclerView, dx, dy);
                                int lastVisiblePos = mainActivity.layoutManager.findLastCompletelyVisibleItemPosition();
                                int left = mainActivity.datumListCommentators.size() - (lastVisiblePos + 1);
                                if (left < 3) {
                                    mainActivity.tvCommentsCounterLeft.setVisibility(View.GONE);
                                    mainActivity.tvCommentsMore.setVisibility(View.GONE);
                                    mainActivity.tvCommentsMoreSymbol.setVisibility(View.GONE);
                                } else {
                                    mainActivity.tvCommentsCounterLeft.setText(Integer.toString(left));
                                    mainActivity.tvCommentsCounterLeft.setVisibility(View.VISIBLE);
                                    mainActivity.tvCommentsMore.setVisibility(View.VISIBLE);
                                    mainActivity.tvCommentsMoreSymbol.setVisibility(View.VISIBLE);
                                }

                            }
                        });
                    }
                });
//        Post Info
        postInfoObservable.debounce(6000, TimeUnit.MILLISECONDS)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Subscriber<GetPostInfo>() {

                    @Override
                    public void onCompleted() {
                    }

                    @Override
                    public void onError(Throwable e) {
                    }

                    @Override
                    public void onNext(GetPostInfo getPostInfo) {
                        long views = getPostInfo.getViewsCount();
                        mainActivity.tvViewsCounter.setText(Long.toString(views));
                        mainActivity.tvBookmarksCounter.setText(Long.toString(getPostInfo.getBookmarksCount()));
                    }
                });
//        Likers
        allLikersObservable.debounce(6000, TimeUnit.MILLISECONDS)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Subscriber<GetAllLikers>() {
                    @Override
                    public void onCompleted() {
                    }

                    @Override
                    public void onError(Throwable e) {
                    }

                    @Override
                    public void onNext(GetAllLikers getAllLikers) {
                        mainActivity.datumListLikers = getAllLikers.getData();
                        mainActivity.layoutManager
                                = new LinearLayoutManager(mainActivity, LinearLayoutManager.HORIZONTAL, false);
                        mainActivity.rvLikers.setLayoutManager(mainActivity.layoutManager);
                        LikersAdapter likersAdapter = new LikersAdapter(mainActivity, mainActivity.datumListLikers);
                        mainActivity.rvLikers.setAdapter(likersAdapter);
                        mainActivity.tvLikersCounter.setText(Integer.toString(mainActivity.datumListLikers.size()));
                        int size = mainActivity.datumListLikers.size();
                        if (size == 0) {
                            mainActivity.tvLikersCounterLeft.setVisibility(View.GONE);
                            mainActivity.tvLikersMore.setVisibility(View.GONE);
                            mainActivity.tvLikersMoreSymbol.setVisibility(View.GONE);
                        }
                        mainActivity.rvLikers.addOnScrollListener(new RecyclerView.OnScrollListener() {
                            @Override
                            public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
                                super.onScrollStateChanged(recyclerView, newState);
                            }

                            @Override
                            public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
                                super.onScrolled(recyclerView, dx, dy);
                                int lastVisiblePos = mainActivity.layoutManager.findLastCompletelyVisibleItemPosition();
                                int left = mainActivity.datumListLikers.size() - (lastVisiblePos + 1);
                                if (left < 3) {
                                    mainActivity.tvLikersCounterLeft.setVisibility(View.GONE);
                                    mainActivity.tvLikersMore.setVisibility(View.GONE);
                                    mainActivity.tvLikersMoreSymbol.setVisibility(View.GONE);
                                } else {
                                    mainActivity.tvLikersCounterLeft.setText(Integer.toString(left));
                                    mainActivity.tvLikersCounterLeft.setVisibility(View.VISIBLE);
                                    mainActivity.tvLikersMore.setVisibility(View.VISIBLE);
                                    mainActivity.tvLikersMoreSymbol.setVisibility(View.VISIBLE);
                                }

                            }
                        });
                    }
                });
//        Mentions
        allMentionsObservable.debounce(6000, TimeUnit.MILLISECONDS)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Subscriber<GetAllMentions>() {
                    @Override
                    public void onCompleted() {
                    }

                    @Override
                    public void onError(Throwable e) {
                    }

                    @Override
                    public void onNext(GetAllMentions getAllMentions) {
                        mainActivity.datumListMentions = getAllMentions.getData();
                        mainActivity.layoutManager
                                = new LinearLayoutManager(mainActivity, LinearLayoutManager.HORIZONTAL, false);
                        mainActivity.rvMentions.setLayoutManager(mainActivity.layoutManager);
                        MentionsAdapter mentionsAdapter = new MentionsAdapter(mainActivity, mainActivity.datumListMentions);
                        mainActivity.rvMentions.setAdapter(mentionsAdapter);
                        int size = mainActivity.datumListMentions.size();
                        mainActivity.tvMentionsCounter.setText(Integer.toString(size));
                        if (size == 0) {
                            mainActivity.tvMentionsCounterLeft.setVisibility(View.GONE);
                            mainActivity.tvMentionsMore.setVisibility(View.GONE);
                            mainActivity.tvMentionsMoreSymbol.setVisibility(View.GONE);
                        }
                        mainActivity.rvMentions.addOnScrollListener(new RecyclerView.OnScrollListener() {
                            @Override
                            public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
                                super.onScrollStateChanged(recyclerView, newState);
                            }

                            @Override
                            public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
                                super.onScrolled(recyclerView, dx, dy);

                                int lastVisiblePos = mainActivity.layoutManager.findLastCompletelyVisibleItemPosition();
                                int left = mainActivity.datumListMentions.size() - (lastVisiblePos + 1);
                                if (left < 3) {
                                    mainActivity.tvMentionsCounterLeft.setVisibility(View.GONE);
                                    mainActivity.tvMentionsMore.setVisibility(View.GONE);
                                    mainActivity.tvMentionsMoreSymbol.setVisibility(View.GONE);
                                } else {
                                    mainActivity.tvMentionsCounterLeft.setText(Integer.toString(left));
                                    mainActivity.tvMentionsCounterLeft.setVisibility(View.VISIBLE);
                                    mainActivity.tvMentionsMore.setVisibility(View.VISIBLE);
                                    mainActivity.tvMentionsMoreSymbol.setVisibility(View.VISIBLE);
                                }
                            }
                        });
                    }
                });
//        Reposters
        allRepostersObservable.debounce(6000, TimeUnit.MILLISECONDS)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Subscriber<GetAllReposters>() {
                    @Override
                    public void onCompleted() {
                    }

                    @Override
                    public void onError(Throwable e) {
                    }

                    @Override
                    public void onNext(GetAllReposters getAllReposters) {
                        mainActivity.datumListReposters = getAllReposters.getData();
                        int reposts = getAllReposters.getData().size();
                        mainActivity.tvReposterstCounter.setText(Integer.toString(reposts));
                        mainActivity.layoutManager = new LinearLayoutManager(mainActivity, LinearLayoutManager.HORIZONTAL, false);
                        mainActivity.rvReposters.setLayoutManager(mainActivity.layoutManager);
                        RepostersAdapter repostersAdapter = new RepostersAdapter(mainActivity, mainActivity.datumListReposters);
                        mainActivity.rvReposters.setAdapter(repostersAdapter);
                        if (reposts == 0) {
                            mainActivity.tvRepostersCounterLeft.setVisibility(View.GONE);
                            mainActivity.tvRepostersMore.setVisibility(View.GONE);
                            mainActivity.tvRepostersMoreSymbol.setVisibility(View.GONE);
                        }
                    }
                });
    }
}
