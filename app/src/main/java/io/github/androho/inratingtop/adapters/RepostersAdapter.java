package io.github.androho.inratingtop.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bumptech.glide.Glide;

import java.util.List;

import io.github.androho.inratingtop.R;
import io.github.androho.inratingtop.holders.ViewHolderItem;
import io.github.androho.inratingtop.model.reposters.Datum;

public class RepostersAdapter extends RecyclerView.Adapter<ViewHolderItem> {
    private Context context;
    private List<Datum> datumListReposters;
    public View view;

    public RepostersAdapter(Context context, List<Datum> datumListReposters) {
        this.context = context;
        this.datumListReposters = datumListReposters;
    }
    @NonNull
    @Override
    public ViewHolderItem onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);

        return new ViewHolderItem(view);
    }
    @Override
    public void onBindViewHolder(@NonNull ViewHolderItem viewHolder, int position) {
        Datum datumMentions = datumListReposters.get(position);
        String photoUrl;
        if (datumMentions.getAvatarImage() != null) {
            photoUrl = datumMentions.getAvatarImage().getUrl();
        } else
            photoUrl = String.valueOf(R.drawable.no_avatar);
        Glide.with(view)
                .load(photoUrl)
                .centerCrop()
                .error(Glide.with(view)
                        .load(R.drawable.no_avatar))
                .into(viewHolder.imageAvatar);
        viewHolder.username.setText(datumMentions.getNickname());

        return;
    }
    @Override
    public int getItemCount() {
        return datumListReposters.size();
    }
}
