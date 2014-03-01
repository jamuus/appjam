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

	public Skill(SkillType name, int xp)
	{
		actions = new ArrayList<Action>();
		this.name = name;
		this.xp = xp;//levelBounds.getLevel(xp);
	}
	// skill Constructor
//	public void initialiseAction()
//	{
//		actions = new ArrayList<Action>();
//	}
	
	// addAction - adds new action to the list
	public void addAction(String name, int xp, SkillType skill, Difficulty diff, int repeatDays)
	{
		Action action = new Action(name, xp, skill, diff, repeatDays);
		actions.add(action);
	}
	
	// completeAction - completes action
	private void completeAction(Action action)
	{
		xp = xp + action.xp;
		getLevel(xp);
		
	}
	
	public void getLevel(int xp)
	{
		level = levelBounds.getLevel(xp);
	}
	
	// updateSkill - updates skill Values
}