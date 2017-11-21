package com.uady.jorge_cano.serviciosatualcance.adapters;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RatingBar;
import android.widget.TextView;

import com.uady.jorge_cano.serviciosatualcance.R;
import com.uady.jorge_cano.serviciosatualcance.WorkerDetailsActivity;
import com.uady.jorge_cano.serviciosatualcance.dao.Professional;

import java.util.List;

/**
 * Created by M on 13/11/2017.
 */

public class ResultListAdapter extends RecyclerView.Adapter<ResultListAdapter.ResultListHolder> {

    private List<Professional> professionalList;
    private Activity activity;


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

    public ResultListAdapter(List<Professional> professionals, Activity activity){
        this.professionalList = professionals;
        this.activity = activity;
    }

    @Override
    public ResultListHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.content_person, parent, false);
        return new ResultListHolder(view);
    }

    @Override
    public void onBindViewHolder(final ResultListHolder holder, final int position) {
        Professional profes = professionalList.get(position);
        holder.name.setText(profes.getName());
        holder.phone.setText(profes.getPhoneNumber());
        holder.distance.setText(profes.getAddress());
        holder.rating.setRating(profes.getRating());

        holder.card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(activity, WorkerDetailsActivity.class);
                intent.putExtra("professional",professionalList.get(position));
                activity.startActivity(intent);
            }
        });
        
    }

    public  void setList(List<Professional> list){
        professionalList = list;
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
