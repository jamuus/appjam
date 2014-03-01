package com.example.levelapp;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends Activity {

	public SaveGame saveGame = null;
	
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        setupEventListeners();
        
        save();
        
        
    }
    
    setupEventListeners()
    {
    	ImageButton toDoList = (ImageButton)findViewById(R.id.toDoList);
        toDoList.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                // Perform action on click
            }
        });
        ImageButton cheevs = (ImageButton)findViewById(R.id.achievements);
        cheevs.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                // Perform action on click
            }
        });
        ImageButton skeelz = (ImageButton)findViewById(R.id.skills);
        skeelz.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                // Perform action on click
            }
        });
    }

    void save() {
    	Profile profile = new Profile();
		SaveGame saveGame = new SaveGame(getPreferences(MODE_PRIVATE), profile);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
