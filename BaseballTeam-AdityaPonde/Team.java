import java.lang.Math;   
/*
* This is a super class Team is to implement an array of players team, it also holds methods to calculate team salary and team wins
* @param team[] array that holds all the player info as an object

*/
public class Team 
{
Player[] team = new Player[10];
public Team()
  {
    for(int i = 0; i < 5; i++)
      {
        team[i] = new Batter("Batter " + (i+1), 5, 10, (int)(Math.random() * (100000 - 50000 + 1) + 50000));
      }
    for(int i = 5; i < 10; i++)
      {
        team[i] = new Pitcher("Pitcher " + (i+1),(int)(Math.random() * (100000 - 50000 + 1) + 50000), 5, 0, 15);
      }
  }

//claculates and displays total team salary
public double teamSalary()
  {
    double total = 0;
    
    for(int i = 0; i < 10; i++)
      {
        total += team[i].getSal();
      }
    return total;
  }
  //calculates and displays the entire team wins
public int teamWins()
{
  int total = 0;

  for (int i = 0; i < 10; i++)
    {
      total += team[i].getWins();
    }
  return total;
}
//calls methods to display single player stat
public void playerStats(int x)
  {
    team[x].showStats();
  }
  //displays entire team stats
  public void teamStats()
  {
    for(int i = 0; i < 10; i++)
      {
        team[i].showStats();
      }
  }
}
  