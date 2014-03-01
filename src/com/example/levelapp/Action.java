package com.example.levelapp;

public class Action
{
	public String name;
	public int xp;
	public SkillType skill;
	public int repeatDays;
	public Difficulty diff;
	
	public Action(String name, int xp, SkillType skill, Difficulty diff, int repeatDays)
	{
		this.name = name;
		this.xp = xp;
		this.skill = skill;
		this.diff = diff;
		this.repeatDays = repeatDays;
	}
	
}
