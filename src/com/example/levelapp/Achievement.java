package com.example.levelapp;

public class Achievement
{
	public String name;
	public int xp;
	public int ap;
	public String description;
	public String[] conditions; // for Goals
	
	public Achievement(String name, String description, int xp, int ap, String[] conditions)
	{
		this.name = name;
		this.description = description;
		this.xp = xp;
		this.ap = ap;
		this.conditions = conditions;
	}

}

