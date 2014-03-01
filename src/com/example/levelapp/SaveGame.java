package com.example.levelapp;

import java.util.HashSet;
import java.util.Set;

import android.annotation.SuppressLint;
import android.content.SharedPreferences;

@SuppressLint("NewApi")
public class SaveGame {
	SharedPreferences save = null;
	Profile profile = null;
			
	public SaveGame(SharedPreferences saveFile, Profile p){
		save = saveFile;
		profile = p;
	}
	
	void readSave(){
		//read from save, write/create About
		profile.about.name = save.getString("Name", "");
		profile.about.bio = save.getString("Bio", "");
		profile.about.characterLevel = save.getInt("CharacterLevel", 0);
		profile.about.xp = save.getInt("XP", 0);
		profile.about.ap = save.getInt("AP", 0);
		
		//Set achievements by getting list of done achievement names, and altering lists
		Set<String> doneAchievs = save.getStringSet("doneAchievs", new HashSet<String>());
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
		
		Set<String> skills = save.getStringSet("skills", new HashSet<String>());
		Skills s = profile.skills;

		for(String skill : skills){
			String[] variables = skill.split(" ");
			s.skills.add(new Skill(SkillType.valueOf(variables[0]), Integer.parseInt(variables[1])));
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
		
		//save skills
		save.edit().putInt("TotalLevel", profile.skills.totalLevel);
		save.edit().putInt("TotalXP", profile.skills.totalXp);
		Set<String> skills = new HashSet<String>();
		for(Skill a : profile.skills.skills){
			skills.add(a.name.name() +  " " + a.xp);
		}
		save.edit().putStringSet("skills", skills);
		
		save.edit().commit();
	}
	
}
