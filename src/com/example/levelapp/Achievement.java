package com.example.levelapp;

import java.util.ArrayList;

public class Achievement
{
	public String name;
	public SkillType skill;
	public int xp;
	public int ap;
	public String description;
	ArrayList<Condition> conditions; // for Goals
	
	public Achievement(String name, SkillType skill, String description, int xp, int ap, ArrayList<Condition> conditions)
	{
		this.name = name;
		this.description = description;
		this.skill = skill;
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
			if (checkCondition(condition) != true){
				return false;
			}
		}
		return true;
	}
	
	public Boolean checkCondition(Condition condition)
	{
		Skills skills = new Skills();
		for (Skill skill : skills.returnSkills())
			if (condition.skill.equals(skill.name) && (skill.level >= condition.requiredLevel))
			{
				return true;
			}
		return false;
	}
}
