package com.dzone.module4.SPG;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.dzone.module4.R;

import java.util.List;

public class SpgOrganAdapter extends RecyclerView.Adapter<SpgOrganAdapter.ViewHolder>{

    private List<SpgOrganRecyclerItems> listItems;
    private Context mContext;

    public SpgOrganAdapter(List<SpgOrganRecyclerItems> listItems, Context mContext) {
        this.listItems = listItems;
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.nsg_hist_list,parent,false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final SpgOrganRecyclerItems item = listItems.get(position);
        holder.title.setText(item.getTitle());
        holder.desc.setText(item.getDesc());
    }

    @Override
    public int getItemCount() {
        return listItems.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        public TextView title;
        public TextView desc;

        public ViewHolder(View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.nsg_hist_date);
            desc = itemView.findViewById(R.id.nsg_hist_desc);
        }
    }
}
