package com.example.levelapp;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import android.content.SharedPreferences;

public class SaveGame {
	public FileInputStream inputSave;
	public FileOutputStream outputSave;
	SharedPreferences save = null;
	Profile profile = null;
			
	public SaveGame(SharedPreferences saveFile, Profile p){
		save = saveFile;
		profile = p;
	}
	
	void writeSave(){
		//save About class
		save.edit().putString("Name", profile.about.name);
		save.edit().putString("Bio", profile.about.bio);
		save.edit().putInt("XP", profile.about.xp);
		save.edit().putInt("CharacterLevel", profile.about.characterLevel);
		//save 

	}
}
