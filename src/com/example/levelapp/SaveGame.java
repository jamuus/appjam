package com.example.levelapp;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.json.JSONArray;

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
		Set<String> doneAchievs = save.getStringSet("list", new HashSet<String>());
		Achievements a = profile.chievs;
		
		for(int i = 0; i < a.achievs.size(); i++){
			if(doneAchievs.contains(a.achievs.get(i).name)){
				a.doneAchievs.add(a.achievs.get(i));
				a.achievs.remove(a.achievs.get(i));
			}
		}
		for(int i = 0; i < a.goals.size(); i++){
			if(doneAchievs.contains(a.goals.get(i).name)){
				a.doneAchievs.add(a.goals.get(i));
				a.goals.remove(a.goals.get(i));
			}
		}
	}
	
	void writeSave(){
		//save About class
		save.edit().putString("Name", profile.about.name);
		save.edit().putString("Bio", profile.about.bio);
		save.edit().putInt("CharacterLevel", profile.about.characterLevel);
		save.edit().putInt("XP", profile.about.xp);
		save.edit().putInt("AP", profile.about.ap);

		//save achievements
		Set<String> achievements = new HashSet<String>();
		for(Achievement a : profile.chievs.doneAchievs)
			achievements.add(a.name);
		save.edit().putStringSet("doneAchievs", achievements);
		
		save.edit().commit();
	}
	
}
