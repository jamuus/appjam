package com.example.levelapp;

import java.util.ArrayList;

public class Skill
{
	
	public String name;
	public int xp;
	public int level;
	public ArrayList<Action> actions; 

	// skill Constructor
	public void initialiseAction()
	{
		actions = new ArrayList<Action>();
	}
	
	// addAction - adds new action to the list
	public void addAction(Action action)
	{
		actions.add(action);
	}
	
	// completeAction - completes action
	public void completeAction(Action action)
	{
		
	}
	
	// updateSkill - updates skill Values
}