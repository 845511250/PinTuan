package com.example.zuoyun.pintuan.staffSend.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.zuoyun.pintuan.R;
import com.example.zuoyun.pintuan.staffSend.m.Shop;
import com.example.zuoyun.pintuan.staffSend.m.Staff;

import java.util.ArrayList;

/**
 * Created by  on 2016/9/2.
 */
public class ShopAdapter extends RecyclerView.Adapter<ShopAdapter.AnchorHotViewHolder> {
    private ArrayList<Shop> data;
    private Context context;
    LayoutInflater layoutInflater;

    public ShopAdapter(Context mContext, ArrayList<Shop> mData) {
        data = mData;
        context = mContext;
        layoutInflater = LayoutInflater.from(context);
    }


    @Override
    public AnchorHotViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_rv_shop,
                parent, false);
        return new AnchorHotViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final AnchorHotViewHolder holder, final int position) {
        Shop shop = data.get(position);

        holder.tv_name.setText(shop.name);
        holder.tv_phone.setText(shop.phone);
        holder.tv_address.setText(shop.address);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, "点击", Toast.LENGTH_SHORT).show();
            }
        });
    }


    @Override
    public int getItemCount() {
        return data.size();
    }

    @Override
    public int getItemViewType(int position) {
        return super.getItemViewType(position);
    }

    class AnchorHotViewHolder extends RecyclerView.ViewHolder {
        TextView tv_name;
        TextView tv_phone;
        TextView tv_address;

        public AnchorHotViewHolder(final View itemView) {
            super(itemView);
            tv_name = (TextView) itemView.findViewById(R.id.tv_name);
            tv_phone = (TextView) itemView.findViewById(R.id.tv_phone);
            tv_address = (TextView) itemView.findViewById(R.id.tv_address);
        }
    }
}
