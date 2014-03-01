package com.example.levelapp;

import java.sql.Date;
import java.util.ArrayList;

//import com.example.levelapp.Action.difficulty;

public class Todo
{
	private ArrayList<Action> actions;
	
	public Todo()
	{
		actions = new ArrayList<Action>();
	}
	
	public void addAction(String name, int xp, SkillType skill, Difficulty diff, int repeatDays)
	{
		Action a = new Action(name, xp, skill, diff, repeatDays);
		actions.add(a);
	}
	
	public ArrayList<Action> getActions()
	{
		return actions;
	}
	
	public void completeAction(Action action)
	{
		actions.remove(action);
	}
	
	public void completeAction(String action)
	{
		for(Action a : actions)
		{
			if(a.name == action)
				actions.remove(a);
				
		}
	}
	
}
