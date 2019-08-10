package io.github.androho.inratingtop.holders;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import io.github.androho.inratingtop.R;

public class ViewHolderItem extends RecyclerView.ViewHolder {
    public ImageView imageAvatar;
    public TextView username;

    public ViewHolderItem(View view) {
        super(view);
        imageAvatar = (ImageView) view.findViewById(R.id.img_user_avatar);
        username = (TextView) view.findViewById(R.id.tv_username);
    }
}
