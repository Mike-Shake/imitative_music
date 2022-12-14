package com.example.imitative_music;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.core.view.MenuItemCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.NavigationUI;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.SearchView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    private DrawerLayout mDrawLayout;

    //底部导航栏
    BottomNavigationView bottomNavigation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        //隐藏导航栏
//        this.getSupportActionBar().hide();

        //实现状态栏和toorbar颜色是相同的
        View decorView = getWindow().getDecorView();
        int option = View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                | View.SYSTEM_UI_FLAG_LAYOUT_STABLE;
        decorView.setSystemUiVisibility(option);
        getWindow().setNavigationBarColor(Color.TRANSPARENT);
        getWindow().setStatusBarColor(Color.TRANSPARENT);


        Toolbar toolbar=findViewById(R.id.toolbar);
        toolbar.setTitle("");
        setSupportActionBar(toolbar);


        bottomNavigation=findViewById(R.id.bottom_navigation);
        //获取navController
        NavController navController= Navigation.findNavController(this,R.id.nav_host_fragment);
        //通过setupWithNavController将顶部导航和导航控制器进行绑定
        NavigationUI.setupWithNavController(bottomNavigation,navController);


        mDrawLayout = findViewById(R.id.drawLayout);
        ActionBar actionBar=getSupportActionBar();
        if(actionBar!=null){
            actionBar.setDisplayHomeAsUpEnabled(true);
            actionBar.setHomeAsUpIndicator(R.drawable.ic_baseline_menu_24);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.toorbar, menu);
        // 获取搜索Menu
        MenuItem item = menu.findItem(R.id.search);
        // 通过MenuItemCompat.getActionView()方法获取SearchView
        android.widget.SearchView mSearchView = (SearchView) MenuItemCompat.getActionView(item);
        mSearchView.setSubmitButtonEnabled(true);
        mSearchView.setIconified(true);
        return true;
    }

    //侧滑菜单
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case android.R.id.home:
                mDrawLayout.openDrawer(GravityCompat.START);
        }
        return true;
    }
}