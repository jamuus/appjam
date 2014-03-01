package com.example.levelapp;

public class LevelBoundaries
{
	public Integer[] levelBounds;
	
	public LevelBoundaries()
	{
		setBoundaries();
	}
	
	private void setBoundaries() {
		levelBounds = new Integer[100];
		levelBounds[0] = 0;
		levelBounds[1] = 100;
		for (int n=2; n<100; n++){
			levelBounds[n] = (int)Math.round((double)levelBounds[n-1] +100*(n-2));
		}
	}
	public Integer[] getBoundaries()
	{
		return levelBounds;
	}
	
	public int getLevel(int xp)
	{
		for (int n=1; ; n++)
		{
			if (levelBounds[n] < xp)
				return (n);
		}
	}
	
	public int nextLevelXp (int level)
	{
		return levelBounds[level];
	}
	

}
