package com.dzone.module4;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.dzone.module4.AR.ArActivity;
import com.dzone.module4.BSF.BSFactivity;
import com.dzone.module4.CISF.CISFactivity;
import com.dzone.module4.CRPF.CRPFactivity;
import com.dzone.module4.ICG.IcgActivity;
import com.dzone.module4.ITBP.ITBPactivity;
import com.dzone.module4.NDRF.NdrfActivity;
import com.dzone.module4.NSG.NsgActivity;
import com.dzone.module4.RPF.RpfActivity;
import com.dzone.module4.SFF.SFFactivity;
import com.dzone.module4.SPG.SpgActivity;
import com.dzone.module4.SSB.SSBactivity;

import java.util.List;

public class OthersAdapter extends RecyclerView.Adapter<OthersAdapter.ViewHolder>{

    private List<OthersRecyclerItems> listItems;
    private OthersActivity mContext;

    public OthersAdapter(List<OthersRecyclerItems> listItems, OthersActivity mContext) {
        this.listItems = listItems;
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.other_menu_list,parent,false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final OthersRecyclerItems items = listItems.get(position);
        holder.name.setText(items.getName());
        Glide.with(mContext).load(items.getImg()).into(holder.img);
    }

    @Override
    public int getItemCount() {
        return listItems.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        public TextView name;
        public ImageView img;

        public ViewHolder(View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.other_menu_name);
            img = itemView.findViewById(R.id.other_menu_pic);
            itemView.setClickable(true);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            switch (getAdapterPosition())
            {
                case 0:
                     view.getContext().startActivity(new Intent(view.getContext(),IcgActivity.class));
                     break;
                case 1:
                    view.getContext().startActivity(new Intent(view.getContext(),ArActivity.class));
                    break;
                case 2:
                    view.getContext().startActivity(new Intent(view.getContext(),SFFactivity.class));
                    break;
                case 3:
                    view.getContext().startActivity(new Intent(view.getContext(),CRPFactivity.class));
                    break;
                case 4:
                    view.getContext().startActivity(new Intent(view.getContext(),BSFactivity.class));
                    break;
                case 5:
                    view.getContext().startActivity(new Intent(view.getContext(),ITBPactivity.class));
                    break;
                case 6:
                    view.getContext().startActivity(new Intent(view.getContext(),SSBactivity.class));
                    break;
                case 7:
                    view.getContext().startActivity(new Intent(view.getContext(),CISFactivity.class));
                    break;
                case 8:
                    view.getContext().startActivity(new Intent(view.getContext(),NsgActivity.class));
                    break;
                case 9:
                    view.getContext().startActivity(new Intent(view.getContext(),SpgActivity.class));
                    break;
                case 10:
                    view.getContext().startActivity(new Intent(view.getContext(),RpfActivity.class));
                    break;
                case 11:
                    view.getContext().startActivity(new Intent(view.getContext(),NdrfActivity.class));
                    break;
            }
        }
    }
}
