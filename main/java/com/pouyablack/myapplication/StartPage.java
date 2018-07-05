package com.pouyablack.myapplication;

import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

public class StartPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_page);
        setupViews();
    }

    private void setupViews() {
        setupRecyclerView();
//        setupToolbar();
    }

    private void setupRecyclerView() {
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        ContentPageAdapter contentPage = new ContentPageAdapter(this);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        recyclerView.setAdapter(contentPage);
        contentPage.setContentPageAdapter(DataFakeGenerator.getAppFeatures(this));
    }

//    private void setupToolbar(){
//        DrawerLayout drawerLayout = findViewById(R.id.drawer_layout);
//        Toolbar toolbar = findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);
//
//        ActionBar actionBar = getSupportActionBar();
//        actionBar.setDisplayHomeAsUpEnabled(true);
//        actionBar.setHomeButtonEnabled(true);
//
//        ActionBarDrawerToggle drawerToggle=new ActionBarDrawerToggle(this,
//                drawerLayout,toolbar,0,0);
//
//        drawerLayout.addDrawerListener(drawerToggle);
//        drawerToggle.syncState();
//    }

}