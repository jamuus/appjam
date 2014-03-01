package com.example.levelapp;

import java.util.ArrayList;

public class Achievements
{
	public ArrayList<Achievement> achievs; // Achievements to be done
	public ArrayList<Achievement> doneAchievs; //completed
	public ArrayList<Achievement> goals; //goals no tickbox
	public int ap; // Achievement Points total from doneAchievs
	
	// initialiseAchievementList
	public void initialiseAchievementList()
	{
		achievs = new ArrayList<Achievement>();
		doneAchievs = new ArrayList<Achievement>();
		goals = new ArrayList<Achievement>();
	}
	// addAcheivement
	public void addAchievement(ArrayList<Achievement> list, String name, String description,int xp, int ap, String[] conditions)
	{
		Achievement newAchievement = new Achievement(name, description, xp, ap, conditions);
		list.add(newAchievement);
	}
	
	// checkDone - checks if Achievement is completed
	private Boolean checkDone(String name)
	{
		
		
		return done;
	}
	
	// checkExists - prevents duplicate achievements
	private Boolean checkExists(String name)
	{
		for (Achievement achievement: achievs){
			if (achievement.name.equals(name))
				return true;
		}
		for (Achievement achievement: doneAchievs){
			if (achievement.name.equals(name))
				return true;
		}
		for (Achievement achievement: goals){
			if (achievement.name.equals(name))
				return true;
		}
		return false;
	}
	// checkDoneGoals - checks which goal was done
	public Boolean checkDoneGoals(ArrayList<Achievement> goals)
	{
		Boolean done;
		for (Achievement goal : goals)
		{
			// checks conditions
		}
		return false;
	}
	
	// updateAP - when achievement is completed, adds AP to AP pool
	private void updateAP(int currentAP, int addAP)
	{
		currentAP = currentAP + addAP;
	}
	// removeGoals
	private void removeGoals(Achievement achievement)
	{
		doneAchievs.add(achievement);
		updateAP(ap, achievement.ap);
		goals.remove(achievement);
		
	}
	// removeAchievs
	private void removeAchievs(Achievement achievement)
	{
		doneAchievs.add(achievement);
		updateAP(ap, achievement.ap);
		goals.remove(achievement);
		
	}
	//getXP - gets xp from
	// updateLists
}
