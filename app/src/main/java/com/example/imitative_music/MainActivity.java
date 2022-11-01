package com.example.imitative_music;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.NavigationUI;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.imitative_music.find_LoopView.LoopAdapter;
import com.example.imitative_music.find_LoopView.pagerOnClickListener;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    BottomNavigationView bottomNavigation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //隐藏导航栏
        this.getSupportActionBar().hide();

        bottomNavigation=findViewById(R.id.bottom_navigation);
        //获取navController
        NavController navController= Navigation.findNavController(this,R.id.nav_host_fragment);
        //通过setupWithNavController将顶部导航和导航控制器进行绑定
        NavigationUI.setupWithNavController(bottomNavigation,navController);
    }
}