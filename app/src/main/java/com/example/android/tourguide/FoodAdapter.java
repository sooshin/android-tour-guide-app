package com.example.android.tourguide;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

/**
 * Created by sj on 12/2/2017.
 */

public class FoodAdapter extends RecyclerView.Adapter<FoodAdapter.ViewHolder> {
    private Context mContext;
    private List<Attraction> mAttractions;

    public FoodAdapter(Context context, List<Attraction> attractions, int item_layout) {
        mContext = context;
        mAttractions = attractions;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_item_food, null);
        return new ViewHolder(v);
    }

    @Override
    public int getItemCount() {
        return mAttractions.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView imageView;
        private TextView nameTextView;
        private CardView cardView;

        public ViewHolder(View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.food_image_card);
            nameTextView = itemView.findViewById(R.id.food_name_card);
            cardView = itemView.findViewById(R.id.cardview_food);
        }
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        final Attraction attraction = mAttractions.get(position);
        Drawable drawable = ContextCompat.getDrawable(mContext, attraction.getAttractionImageId());
        holder.imageView.setBackground(drawable);
        holder.nameTextView.setText(attraction.getAttractionName());
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(mContext, attraction.getAttractionName(), Toast.LENGTH_SHORT).show();
                // Create a new intent to open the {@link DetailActivity}
                Intent detailIntent = new Intent(mContext, DetailActivity.class);

                // Pass value to {@link DetailActivity}
                detailIntent.putExtra(mContext.getString(R.string.image_id),
                        attraction.getAttractionImageId());
                detailIntent.putExtra(mContext.getString(R.string.name),
                        attraction.getAttractionName());
                detailIntent.putExtra(mContext.getString(R.string.description),
                        attraction.getAttractionDescription());
                detailIntent.putExtra(mContext.getString(R.string.address),
                        attraction.getAttractionAddress());
                detailIntent.putExtra(mContext.getString(R.string.transport),
                        attraction.getAttractionTransportation());
                detailIntent.putExtra(mContext.getString(R.string.phone),
                        attraction.getAttractionPhone());
                detailIntent.putExtra(mContext.getString(R.string.web),
                        attraction.getAttractionWeb());
                detailIntent.putExtra(mContext.getString(R.string.hours),
                        attraction.getAttractionHours());
                detailIntent.putExtra(mContext.getString(R.string.fee),
                        attraction.getAttractionFee());

                // Start the new activity
                mContext.startActivity(detailIntent);
            }
        });
    }
}