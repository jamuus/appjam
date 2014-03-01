package com.example.levelapp;

import java.sql.Date;
import java.util.ArrayList;

import com.example.levelapp.Difficulty;

public class Skill
{
	
	public String name;
	public int xp;
	public int level;
	public ArrayList<Action> actions;
	public LevelBoundaries levelBounds = new LevelBoundaries();

	public Skill(String name, int xp, int level)
	{
		actions = new ArrayList<Action>();
		this.name = name;
		this.xp = xp;
		this.level = level; //levelBounds.getLevel(xp);
	}
	// skill Constructor
//	public void initialiseAction()
//	{
//		actions = new ArrayList<Action>();
//	}
	
	// addAction - adds new action to the list
	public void addAction(String name, int xp, ArrayList<String> skills, Difficulty diff, Date deadline, int repeatDays)
	{
		Action action = new Action(name, xp, skills, diff, deadline, repeatDays);
		actions.add(action);
	}
	
	// completeAction - completes action
	public void completeAction(Action action)
	{
		xp += action.xp;
		
	}
	
	// updateSkill - updates skill Values
}