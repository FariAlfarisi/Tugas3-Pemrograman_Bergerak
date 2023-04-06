package com.pemrogramanbergerak.recycleview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class BrandAdapterActivity extends RecyclerView.Adapter<BrandAdapterActivity.BrandViewHolder> {
    Context context;
    List<BrandActivity> brandList;
    OnClickShowListener mOnClickShowListener;

    public BrandAdapterActivity(Context context, List<BrandActivity> brandList, OnClickShowListener onClickShowListener) {
        this.context = context;
        this.brandList = brandList;
        this.mOnClickShowListener = onClickShowListener;
    }

    @NonNull
    @Override
    public BrandViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.item_brand, parent, false);
        return new BrandViewHolder(view, mOnClickShowListener);
    }

    @Override
    public void onBindViewHolder(@NonNull BrandViewHolder holder, int position) {
        String name = brandList .get(position).getNama();
        int logo = brandList.get(position).getLogo();

        holder.BrandName.setText(name);
        holder.BrandLogo.setImageResource(logo);
    }

    @Override
    public int getItemCount() {
        return brandList.size();
    }

    public class BrandViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView BrandName;
        ImageView BrandLogo;
        OnClickShowListener onClickShowListener;

        public BrandViewHolder(@NonNull View itemView, OnClickShowListener onClickShowListener) {
            super(itemView);
            BrandName = itemView.findViewById(R.id.brand_name);
            BrandLogo = itemView.findViewById(R.id.brand_logo);
            this.onClickShowListener = onClickShowListener;
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            onClickShowListener.OnCLickShowListener(getAdapterPosition());

        }
    }

    public interface OnClickShowListener {
        void OnCLickShowListener(int position);
    }
}
