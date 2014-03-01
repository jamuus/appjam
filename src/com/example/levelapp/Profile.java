package com.example.levelapp;

import java.io.FileInputStream;

import android.content.SharedPreferences;


public class Profile
{
	public Achievements chievs;
	public Todo todo;
	
	public Skills skills;
	
	public About about;
	
	public SaveGame saveGame = null;

		
	public enum currentArea {
		None,
		About,
		Achievements,
		Skills,
		Todo,
	}
	
	public Profile(){

	}
	
	
	
}
