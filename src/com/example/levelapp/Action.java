package com.example.levelapp;

import java.sql.Date;
import java.util.ArrayList;

public class Action
{
	public String name;
	public int xp;
	ArrayList<String> skills;
	
	public Date deadline;
	public int repeatDays;
	public Difficulty diff;
	
	public Action(String name, int xp, ArrayList<String> skills, Difficulty diff, Date deadline, int repeatDays)
	{
		this.name = name;
		this.xp = xp;
		this.skills = skills;
		this.diff = diff;
		this.deadline = deadline;
		this.repeatDays = repeatDays;
	}
	
}
