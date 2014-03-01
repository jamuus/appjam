package com.example.levelapp;

import java.sql.Date;
import java.util.ArrayList;

import com.example.levelapp.Action.difficulty;

public class Skill
{
	
	public String name;
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
	public void addAction(String name, int xp, ArrayList<String> skills, difficulty diff, Date deadline, int repeatDays)
	{
		action =
		actions.add(action);
	}
	
	// completeAction - completes action
	public void completeAction(Action action)
	{
		xp = xp + action.xp;
		
	}
	
	// updateSkill - updates skill Values
}