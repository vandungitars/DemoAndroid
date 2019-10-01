package com.vandung.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.vandung.model.Product;
import com.vandung.myapplication.R;

import java.util.ArrayList;
import java.util.List;

public class ProductAdapter extends BaseAdapter {

    Context context;
    List<Product> products;
    LayoutInflater layoutInflater;

    public ProductAdapter(Context context, List<Product> products){
        this.context = context;
        this.products = products;
        this.layoutInflater = LayoutInflater.from(context);
    }
    @Override
    public int getCount() {
        return products.size();
    }

    @Override
    public Object getItem(int i) {
        return products.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder viewHolder = null;
        if(view == null){
            viewHolder = new ViewHolder();
            view = layoutInflater.inflate(R.layout.item, null);
            viewHolder.imgProduct = view.findViewById(R.id.imgProduct);
            viewHolder.txtNameProduct = view.findViewById(R.id.txtNameProduct);
            viewHolder.txtPriceProduct = view.findViewById(R.id.txtPriceProduct);
            view.setTag(viewHolder);
        }else{
            viewHolder = (ViewHolder) view.getTag();
        }
        Product product = products.get(i);
        viewHolder.imgProduct.setImageResource(product.getImage());
        viewHolder.txtNameProduct.setText(product.getName());
        viewHolder.txtPriceProduct.setText(product.getPrice().toString());
        return view;
    }

    private class ViewHolder{
        public ImageView imgProduct;
        public TextView txtNameProduct;
        public TextView txtPriceProduct;
    }
}
