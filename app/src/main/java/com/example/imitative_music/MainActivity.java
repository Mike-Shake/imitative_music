package com.example.imitative_music;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.NavigationUI;

import android.os.Bundle;
import android.view.MenuItem;

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


        Toolbar toolbar=findViewById(R.id.toolbar);
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