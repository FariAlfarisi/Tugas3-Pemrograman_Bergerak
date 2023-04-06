package com.pemrogramanbergerak.recycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements BrandAdapterActivity.OnClickShowListener{
    RecyclerView recyclerviewBrandList;
    List<BrandActivity> BrandList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initBrandList();

        recyclerviewBrandList = findViewById(R.id.brand_list);
        BrandAdapterActivity BrandAdapter = new BrandAdapterActivity(this, BrandList, this::OnCLickShowListener);

        recyclerviewBrandList.setAdapter(BrandAdapter);
        recyclerviewBrandList.setLayoutManager(new LinearLayoutManager(this));
    }

    private void initBrandList() {
        BrandList = new ArrayList<>();
        BrandList.add(new BrandActivity("SAMSUNG", "Samsung sudah bertahun-tahun menjadi merk hp terbaik di dunia. Banyaknya segmen konsumen yang diincar, kualitas produk yang bagus, service center yang tersebar di banyak kota, dan dukungan sistem operasi berkelanjutan membuat banyak konsumen menyukainya.", R.drawable.samsung_logo));
        BrandList.add(new BrandActivity("IPHONE","Produk iPhone dari Apple selalu dinanti di akhir tahun. Sesuai dengan kebiasaan Apple yang meluncurkan varian terbaru iPhone setiap akhir tahun. Kebanyakan konsumen di dunia selalu menanti fitur baru apa yang dimiliki seri iPhone terbaru.", R.drawable.apple_logo));
        BrandList.add(new BrandActivity("XIAOMI", "Dari dulu sampai sekarang, Xiaomi selalu konsisten memberikan produk dengan harga murah dan spesifikasi terbaik di kelasnya. Xiaomi adalah hp budget friendly yang memungkinkan banyak orang mencicipi spesifikasi kelas atas dengan harga lebih murah.", R.drawable.xiaomi_logo));
    }

    @Override
    public void OnCLickShowListener(int position) {
        String name = BrandList.get(position).getNama();
        int logo = BrandList.get(position).getLogo();
        String text = BrandList.get(position).getText();

        Intent intent = new Intent(this, AppearanceActivity.class);
        intent.putExtra("nama", name);
        intent.putExtra("logo", logo);
        intent.putExtra("text", text);
        startActivity(intent);

    }
}