package dicj.info.AGEECJ_V3;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.content.Intent;
import android.net.Uri;
import android.view.View;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
            this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
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
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
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

        if (id == R.id.ageecj) {
            // Handle the ageecj action
            goToUrl ( "http://ageecj.ca/");
            }
        else if (id == R.id.obtus) {goToUrl ( "lobtus.com");}
        else if (id == R.id.vertdure) {goToUrl ( "http://stackoverflow.com/");}
        else if (id == R.id.nav_share) {}
        else if (id == R.id.nav_send) {}

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    //open the even description
    public void layoutOnClick(View view){
        Intent intent = new Intent(MainActivity.this, Evenement1.class);
        startActivity(intent);
    }

    public void layout2OnClick(View view){
        Intent intent = new Intent(MainActivity.this, Evenement2.class);
        startActivity(intent);
    }

    public void layout3OnClick(View view){
        Intent intent = new Intent(MainActivity.this, Evenement3.class);
        startActivity(intent);
    }

    public void layout4OnClick(View view){
        Intent intent = new Intent(MainActivity.this, Evenement4.class);
        startActivity(intent);
    }

    public void layout5OnClick(View view){
        Intent intent = new Intent(MainActivity.this, Evenement5.class);
        startActivity(intent);
    }

    public void layout6OnClick(View view){
        Intent intent = new Intent(MainActivity.this, Evenement6.class);
        startActivity(intent);
    }

    public void layout7OnClick(View view){
        Intent intent = new Intent(MainActivity.this, Evenement7.class);
        startActivity(intent);
    }

    //open web browser

    private void goToUrl (String url) {
        Uri uriUrl = Uri.parse(url);
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(launchBrowser);
    }

}
