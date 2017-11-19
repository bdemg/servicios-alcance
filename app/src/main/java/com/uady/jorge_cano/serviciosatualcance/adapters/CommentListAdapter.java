package com.uady.jorge_cano.serviciosatualcance.adapters;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.RatingBar;
import android.widget.TextView;

import com.uady.jorge_cano.serviciosatualcance.R;
import com.uady.jorge_cano.serviciosatualcance.model.Comment;

/**
 * Created by jorge-cano on 13/11/17.
 */

public class CommentListAdapter extends ArrayAdapter {

    Comment[] comments;

    public CommentListAdapter(@NonNull Context context, @LayoutRes int resource, @NonNull Comment[] comments) {
        super(context, resource, comments);
        this.comments = comments;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View commentEntry;

        if(convertView != null){
            commentEntry = convertView;
        } else{
            LayoutInflater vi;
            vi = LayoutInflater.from(getContext());
            commentEntry = vi.inflate(R.layout.comment_list_item, null);
        }

        TextView commenterName = (TextView) commentEntry.findViewById(R.id.commenter_name);
        TextView comment = (TextView) commentEntry.findViewById(R.id.comment);
        RatingBar rating = (RatingBar) commentEntry.findViewById(R.id.comment_rating);

        commenterName.setText(this.comments[position].getName());
        comment.setText(this.comments[position].getComment());
        rating.setRating(this.comments[position].getRating());

        return commentEntry;
    }
}
