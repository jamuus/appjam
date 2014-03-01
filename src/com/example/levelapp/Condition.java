package com.example.levelapp;

public class Condition {
	String name;
	SkillType skill;
	int requiredLevel;
	int requiredAp;
	
	public Condition(String name, SkillType skill, int requiredLevel, int requiredAp)
	{
		this.name = name;
		this.skill = skill;
		this.requiredLevel = requiredLevel;
		this.requiredAp = requiredAp;
	}
}

