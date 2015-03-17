package com.claymon.android.gradtracker;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class TranscriptPicker extends ActionBarActivity {

    Button mBrowseButton;
    Button mGoButton;
    Button mExampleButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transcript_picker);

        //Set up the buttons.
        mExampleButton = (Button)findViewById(R.id.default_button);
        mGoButton = (Button)findViewById(R.id.go_button);
        mBrowseButton = (Button)findViewById(R.id.browse_button);

        final Toast unimplemented = Toast.makeText(getApplicationContext(), R.string.unimplimented, Toast.LENGTH_SHORT);

        //Set up onClickListeners
        mBrowseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                unimplemented.show();
            }
        });
        mGoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                unimplemented.show();
            }
        });
        mExampleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                unimplemented.show();
            }
        });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_transcript_picker, menu);
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
}
