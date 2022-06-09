package com.example.a11st_app;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.ViewHolder> {
    ArrayList<Movie> items = new ArrayList<Movie>();
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
        View itemView = inflater.inflate(R.layout.movie_item, viewGroup, false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int position) {
        Movie item = items.get(position);
        viewHolder.setItem(item);
    }

    @Override
    public int getItemCount() {
        return items.size();
    }
    public void addItem(Movie item){
        items.add(item);
    }
    public void setItems(ArrayList<Movie> items){
        this.items = items;
    }
    public Movie getItem(int position){
        return items.get(position);
    }

    static class ViewHolder extends RecyclerView.ViewHolder{
        TextView movieName;
        TextView peopleCount;
        TextView rank;
        TextView yesterday;
        TextView oldnew;

            public ViewHolder(View itemView) {
                super(itemView);
                movieName = itemView.findViewById(R.id.movieName);
                peopleCount = itemView.findViewById(R.id.peopleCount);
                rank = itemView.findViewById(R.id.rank);
                yesterday = itemView.findViewById(R.id.yesterday);
                oldnew = itemView.findViewById(R.id.oldnew);
            }
            public void setItem(Movie item){
                movieName.setText(item.movieNm);
                peopleCount.setText(item.audiCnt);
                rank.setText(item.rank);
                yesterday.setText(item.audiInten);
                oldnew.setText(item.rankOldAndNew);
        }
    }
}
