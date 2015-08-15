package com.example.f3838284.myappportfolio;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {

    Context context = null;
    CharSequence text = null;
    int duration = Toast.LENGTH_SHORT;
    Toast toast = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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

    /** Called when the user touches the button */
    public void showToastMessage(View view) {
        Button clickedButton = (Button) view;
        int buttonId = clickedButton.getId();
        context = this.getApplicationContext();
        if(toast != null){
            toast.cancel();
        }
        switch (buttonId){
            case R.id.button_spotify:
                text = "This button will launch the spotify app!";
                break;
            case R.id.button_scores:
                text = "This button will launch the football scores app!";
                break;
            case R.id.button_library:
                text = "This button will launch the library app!";
                break;
            case R.id.button_build_it:
                text = "This button will launch build it bigger!";
                break;
            case R.id.button_xyz:
                text = "This button will launch the XYZ reader app!";
                break;
            case R.id.button_capstone:
                text = "This button will launch my capstone app!";
                break;
            default:
                text = "Oops what happened there ?";
        }
        toast = Toast.makeText(context, text, duration);
        toast.show();
    }
}
