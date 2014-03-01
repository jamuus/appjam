package com.example.levelapp;

import java.sql.Date;
import java.util.ArrayList;

import com.example.levelapp.Difficulty;

public class Skill
{
	
	public SkillType name;
	public int xp;
	public int level;
	public ArrayList<Action> actions;
	public LevelBoundaries levelBounds = new LevelBoundaries();

	// skill Constructor
	public void initialiseAction()
	{
		actions = new ArrayList<Action>();
	}
	
	// addAction - adds new action to the list
	public void addAction(String name, int xp, ArrayList<String> skills, Difficulty diff, Date deadline, int repeatDays)
	{
		Action action = new Action(name, xp, skills, diff, deadline, repeatDays);
		actions.add(action);
	}
	
	// completeAction - completes action
	private void completeAction(Action action)
	{
		xp = xp + action.xp;
		getLevel(xp);
		
	}
	
	private void getLevel(int xp)
	{
		level = levelBounds.getLevel(xp);
	}
	
	// updateSkill - updates skill Values
}