package com.example.my;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import org.jetbrains.annotations.NotNull;

public class ImagesAdaptor extends RecyclerView.Adapter<ImagesAdaptor.ViewHolder> {
    public String[] captions;
    public int[] imageIds;

    public ImagesAdaptor(String[] captions, int[] imageIds) {
        this.captions = captions;
        this.imageIds = imageIds;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        CardView cardView;
        public ViewHolder(CardView cardView) {
            super(cardView);
            this.cardView=cardView;
        }
    }
    @NotNull
    @Override
    public ImagesAdaptor.ViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        CardView cv= (CardView) LayoutInflater.from(parent.getContext())
                .inflate(R.layout.card_view,parent,false);
        return new ViewHolder(cv);
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull ImagesAdaptor.ViewHolder holder, int position) {
        CardView cardView = holder.cardView;
        ImageView imageView = cardView.findViewById(R.id.image);
        TextView textView = cardView.findViewById(R.id.text);
        Drawable drawable = ContextCompat.getDrawable(cardView.getContext(),imageIds[position]);

        imageView.setImageDrawable(drawable);
        imageView.setContentDescription(captions[position]);
        textView.setText(captions[position]);
    }

    @Override
    public int getItemCount() {
        return captions.length;
    }
}
