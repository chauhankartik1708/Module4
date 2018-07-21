package com.dzone.module4.NSG;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.dzone.module4.R;

import java.util.List;

public class NsgMartyrAdapter extends RecyclerView.Adapter<NsgMartyrAdapter.ViewHolder>{
    private List<NsgMartyrRecyclerItems> listItems;
    private Context mContext;

    public NsgMartyrAdapter(List<NsgMartyrRecyclerItems> listItems, Context mContext) {
        this.listItems = listItems;
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.nsg_rank_list,parent,false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final NsgMartyrRecyclerItems item = listItems.get(position);
        holder.name.setText(item.getName());
        Glide.with(mContext).load(item.getImg()).into(holder.pic);
    }

    @Override
    public int getItemCount() {
        return listItems.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        public ImageView pic;
        public TextView name;

        public ViewHolder(View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.nsg_martyr_name);
            pic = itemView.findViewById(R.id.nsg_martyr_pic);
        }
    }
}
