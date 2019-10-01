package com.vandung.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.vandung.adapter.ProductAdapter;
import com.vandung.model.Product;
import com.vandung.myapplication.R;

import java.util.ArrayList;
import java.util.List;

public class MyFragment extends Fragment {
    private List<Product> products;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.my_fragment, null);
        ListView lvProduct = view.findViewById(R.id.lvProduct);
        products = new ArrayList<Product>();
        products.add(new Product("Coca cola", 20000, R.mipmap.ic_launcher));
        products.add(new Product("Fan tar", 25000, R.mipmap.ic_launcher));
        products.add(new Product("Stinh", 12000, R.mipmap.ic_launcher));
        products.add(new Product("Sprite", 29000, R.mipmap.ic_launcher));
        products.add(new Product("Twitter", 30000, R.mipmap.ic_launcher));
        products.add(new Product("Nuti Food", 10000, R.mipmap.ic_launcher));
        ProductAdapter productAdapter = new ProductAdapter(getActivity(), products);
        lvProduct.setAdapter(productAdapter);
        return view;
    }
}
