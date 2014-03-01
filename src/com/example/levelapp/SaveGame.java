package com.example.levelapp;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.HashSet;
import java.util.Set;

import android.annotation.SuppressLint;
import android.content.SharedPreferences;

@SuppressLint("NewApi")
public class SaveGame {
	public FileInputStream inputSave;
	public FileOutputStream outputSave;
	SharedPreferences save = null;
	Profile profile = null;
			
	public SaveGame(SharedPreferences saveFile, Profile p){
		save = saveFile;
		profile = p;
	}
	
	void readSave(){
		//read from save, write/create About
		profile.about = new About(
				save.getString("Name", ""),
				save.getString("Name", ""),
				save.getInt("CharacterLevel", 0),
				save.getInt("XP", 0),
				save.getInt("AP", 0)
				);
		//Retrieve the values
		Set<String> set = new HashSet<String>();
		set = save.getStringSet("key", null);
	}
	
	void writeSave(){
		//save About class
		save.edit().putString("Name", profile.about.name);
		save.edit().putString("Bio", profile.about.bio);
		save.edit().putInt("CharacterLevel", profile.about.characterLevel);
		save.edit().putInt("XP", profile.about.xp);
		save.edit().putInt("AP", profile.about.ap);

		//save achievementList
	    JSONArray gson = new Gson();
	    String json = gson.toJson("MyObject");
	    prefsEditor.putString("MyObject", json);
		
		save.edit().commit();
	}
}
