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
import io.github.androho.inratingtop.model.commentators.Datum;

public class CommentatorsAdapter extends RecyclerView.Adapter<ViewHolderItem> {
    private Context context;
    private List<Datum> datumListCommentators;
    public View view;
    public CommentatorsAdapter(Context context, List<Datum> datumListCommentators) {
        this.datumListCommentators = datumListCommentators;
        this.context = context;
    }


    @Override
    public ViewHolderItem onCreateViewHolder(ViewGroup parent, int viewType) {

        view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);

        return new ViewHolderItem(view);
    }
    @Override
    public void onBindViewHolder(@NonNull ViewHolderItem viewHolder, int position) {
        Datum datumCommentators = datumListCommentators.get(position);
        String photoUrl;
        if (datumCommentators.getAvatarImage() != null) {
            photoUrl = datumCommentators.getAvatarImage().getUrl();
        } else
            photoUrl = String.valueOf(R.drawable.no_avatar);
        Glide.with(view)
                .load(photoUrl)
                .centerCrop()
                .error(Glide.with(view)
                        .load(R.drawable.no_avatar))
                .into(viewHolder.imageAvatar);
        viewHolder.username.setText(datumCommentators.getNickname());

        return;
    }
    @Override
    public int getItemCount() {
        return datumListCommentators.size();
    }
}
