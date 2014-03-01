package com.example.levelapp;

import java.util.ArrayList;

public class Achievement
{
	public String name;
	public int xp;
	public int ap;
	public String description;
	ArrayList<Condition> conditions; // for Goals
	
	public Achievement(String name, String description, int xp, int ap, ArrayList<Condition> conditions)
	{
		this.name = name;
		this.description = description;
		this.xp = xp;
		this.ap = ap;
		for (Condition condition :conditions)
		{
			addCondition(condition);
		}
		this.conditions = conditions;
	}
	
	public void addCondition(Condition condition)
	{
		conditions.add(condition);
	}
	
	public Boolean checkConditions(ArrayList<Condition> conditions)
	{
		for (Condition condition : conditions)
		{	
		checkCondition(condition)
		return true;
		}
	}
	
	public Boolean checkCondition(Condition condition)
	{
		return false
	}
}
