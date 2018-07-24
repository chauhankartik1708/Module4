package com.dzone.module4.SSB;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.dzone.module4.R;

import java.util.List;

public class SSBranksAdapter extends RecyclerView.Adapter<SSBranksAdapter.ViewHolder> {
    private List<SSBrankRecyclerItems> listItems;
    private Context mContext;

    public SSBranksAdapter(List<SSBrankRecyclerItems> listItems, Context mContext) {
        this.listItems = listItems;
        this.mContext = mContext;
    }
    @NonNull
    @Override
    public SSBranksAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.rank_list,parent,false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull SSBranksAdapter.ViewHolder holder, int position) {
        final SSBrankRecyclerItems item = listItems.get(position);
        holder.rank.setText(item.getRank());
    }

    @Override
    public int getItemCount() {
        return listItems.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        public TextView rank;

        public ViewHolder(View itemView) {
            super(itemView);
            rank = itemView.findViewById(R.id.nsg_rank_rank);
        }
    }
}
