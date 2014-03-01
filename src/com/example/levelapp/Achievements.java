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
	public void addAchievement(ArrayList<Achievement> list, String name, SkillType skill, String description,int xp, int ap, ArrayList<Condition> conditions)
	{
		if (checkExists(name) == true)
		{return;}
		Achievement newAchievement = new Achievement(name, skill, description, xp, ap, conditions);
		list.add(newAchievement);
	}
	
	// checkDone - checks if Achievement is completed
	public Boolean checkDone(String name)
	{
		Boolean done = false;
		// TO BE COMPLETED
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
	public void removeAchievs(Achievement achievement)
	{
		Skills skills = new Skills();
		doneAchievs.add(achievement);
		updateAP(ap, achievement.ap);
		goals.remove(achievement);
		for (Skill skill : skills.returnSkills())
		{
			if (skill.name.equals(achievement.skill))
			{
				skill.xp = skill.xp + achievement.xp;
				skill.getLevel(skill.xp);
			}
		}
		
		
	}
	//getXP - gets xp from Achievement
	public int getXP(Achievement achievement) //!!!!!!!!! get it to work
	{
		return achievement.xp;
	}
	// updateLists
}
