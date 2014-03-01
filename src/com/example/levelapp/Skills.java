package com.example.levelapp;

import java.util.ArrayList;

public class Skills
{
	public ArrayList<Skill> skills;
	public int totalLevel;
	public int totalXp;
	
	
	
	public Skills()
	{
		skills = new ArrayList<Skill>();
	}
	
	public void addSkill(SkillType name, int xp, int level)
	{
		Skill s = new Skill(name, xp, level);
		skills.add(s);
	}

}
