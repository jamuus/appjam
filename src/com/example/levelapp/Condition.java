package com.example.levelapp;

public class Condition {
	String name;
	SkillType skill;
	int requiredLevel;
	
	public Condition(String name, SkillType skill, int requiredLevel)
	{
		this.name = name;
		this.skill = skill;
		this.requiredLevel = requiredLevel;
	}
}

