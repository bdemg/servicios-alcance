package com.uady.jorge_cano.serviciosatualcance;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RatingBar;
import android.widget.TextView;

import com.uady.jorge_cano.serviciosatualcance.dao.Professional;

import java.util.List;

/**
 * Created by M on 13/11/2017.
 */

public class ResultListAdapter extends RecyclerView.Adapter<ResultListAdapter.ResultListHolder> {

    private List<Professional> professionalList;


    public class ResultListHolder extends RecyclerView.ViewHolder{

        public CardView card;
        public TextView name;
        public TextView phone;
        public TextView distance;
        public RatingBar rating;

        public ResultListHolder(View view){
            super(view);
            this.card = (CardView) view.findViewById(R.id.card);
            this.name = (TextView) view.findViewById(R.id.person_name);
            this.phone = (TextView) view.findViewById(R.id.person_telephone);
            this.distance = (TextView) view.findViewById(R.id.distance_of_me);
            this.rating = (RatingBar) view.findViewById(R.id.rating);
        }
    }

    public ResultListAdapter(List<Professional> professionals){
        this.professionalList = professionals;
    }

    @Override
    public ResultListHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.content_person, parent, false);
        return new ResultListHolder(view);
    }

    @Override
    public void onBindViewHolder(ResultListHolder holder, int position) {
        Professional profes = professionalList.get(position);
        holder.name.setText(profes.getName());
        holder.phone.setText(profes.getTelephone());
        holder.distance.setText(profes.getAddress());
        holder.rating.setRating(profes.getRating());
        
    }

    @Override
    public int getItemCount() {
        return professionalList.size();
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }
}
