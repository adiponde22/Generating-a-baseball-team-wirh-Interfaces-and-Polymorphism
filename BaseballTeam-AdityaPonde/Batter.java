/**
*Batter class that implments the interface Player
* @param name is the string that holds better's name 
* @param homeRuns is the variable that holds the total homeruns by a batter
* @param average is the variable that holds the average of a player 
* @param salary is a variable that holds the batter salary
*/
public class Batter implements Player
  {
      String name;
      int homeRuns;
      int average;
      double salary;

    
    public Batter(String n, int hR, int a, int s)
    {
      name = n;
      homeRuns = hR;
      average = a;
      salary = s;
    }

    //returns batter salary
    public double getSal()
    {
      return salary;
    }

    public int getWins()
    {
      return 0;
    }



    
   
    //prints out batter stats
    public void showStats()
    {
      System.out.println("Name: " + name);
      System.out.println("Home Runs: " + homeRuns);
      System.out.println("Average: " + average);
      System.out.println("Salary: $" + salary + "\n");

    }
    
  }