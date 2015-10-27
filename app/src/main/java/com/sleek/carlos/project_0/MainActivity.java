package com.sleek.carlos.project_0;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import java.lang.Object;
import android.widget.Toast;
import android.content.Context;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
    public void announceApp(String appName)
    {
        Context context = getApplicationContext();
        CharSequence text = "This button opens the "+appName+" App";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
    public void startSpotifyStreamer(View view)
    {
        announceApp("Spotify Streamer");
    }
    public void startFootballScores(View view)
    {
        announceApp("Football Scores");
    }
    public void startLibrary(View view)
    {
        announceApp("Library");
    }
    public void startBuildItBigger(View view)
    {
        announceApp("Build It Bigger");
    }
    public void startXYZReader(View view)
    {
        announceApp("XYZ Reader");
    }
    public void startCapstone(View view)
    {
        announceApp("Capstone");
    }
}
