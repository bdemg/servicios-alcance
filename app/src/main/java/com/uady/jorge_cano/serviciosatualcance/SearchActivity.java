package com.uady.jorge_cano.serviciosatualcance;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SearchView;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.uady.jorge_cano.serviciosatualcance.adapters.ResultListAdapter;
import com.uady.jorge_cano.serviciosatualcance.dao.Professional;

import java.util.ArrayList;
import java.util.List;

import com.uady.jorge_cano.serviciosatualcance.dao.ProfessionalsData;

public class SearchActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    private RecyclerView recyclerView;
    List<Professional> professionalList;
    ResultListAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        professionalList = new ArrayList();

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);
        LinearLayoutManager linearLayoutM = new LinearLayoutManager(this);
        linearLayoutM.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(linearLayoutM);

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        Intent intent = getIntent();
        String category = intent.getStringExtra("categorySearch");

        loadData(category);
        adapter = new ResultListAdapter(professionalList, this);
        recyclerView.setAdapter(adapter);
    }

    private void loadData(String typeProfessionist){
        if(typeProfessionist==null){
            typeProfessionist = "ninguno";
        }
        switch (typeProfessionist){
            case "Electricista":
                professionalList = (List) ProfessionalsData.getElectricistasData();
                break;
            case "Jardineria":
                professionalList = (List) ProfessionalsData.getJardinerosData();
                break;
            case "Carpinteria":
                professionalList = (List) ProfessionalsData.getCarpinterosData();
                break;
            case "Plomeria":
                professionalList = (List) ProfessionalsData.getPlomerosData();
                break;
            default:
                professionalList = (List) ProfessionalsData.getElectricistasData();
                professionalList.addAll((List) ProfessionalsData.getJardinerosData());
                professionalList.addAll((List) ProfessionalsData.getCarpinterosData());
                professionalList.addAll((List) ProfessionalsData.getPlomerosData());
                break;
        }
    }

    private void setSearchResults() {

    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.search, menu);

        SearchView serviceSearch = (SearchView) menu.findItem(R.id.services_search_results).getActionView();
        serviceSearch.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                search(query);
                return true;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                return false;
            }
        });

        String category = getIntent().getStringExtra("searchQuery");
        if(category != null) {
            serviceSearch.setQuery(category, false);
            search(category);
            setTitle(category);
        } else {
            String searchQuery = getIntent().getStringExtra("categorySearch");
            serviceSearch.setQuery(searchQuery, false);
            setTitle(searchQuery);
        }

        return true;
    }

    public void search(String query){
        String category = (String) SearchActivity.this.getTitle();
        if(category == null) {
            //loadData("ninguno");
        }
        List<Professional> aux = new ArrayList<>();
        for(Professional p : professionalList){
            if(p.getName().contains(query)){
                aux.add(p);
            }
        }
        adapter.setList(aux);
        adapter.notifyDataSetChanged();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_camera) {
            // Handle the camera action
        } else if (id == R.id.nav_gallery) {

        } else if (id == R.id.nav_slideshow) {

        } else if (id == R.id.nav_manage) {

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {
            Intent intent = new Intent(this, WorkerDetailsActivity.class);
            startActivity(intent);
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
