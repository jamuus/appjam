package com.example.levelapp;

import java.sql.Date;

public class Action
{
	public String name;
	public int xp;
	ArrayList<String> skill
	public enum difficulty
	{
		easy,
		medium,
		hard,
		EXTREME
	}
	
	public Date deadline;
	public int repeatDays;
	
	public Action(String name, int xp, ArrayList<String> skill, difficulty diff, Date deadline, int repeatDays)
	{
		this.name = name;
		this.xp = xp;
		this.skill = skill;
		this.diff = diff;
		this.deadline = deadline;
		this.repeatDays = repeatDays;
	}
	
}
