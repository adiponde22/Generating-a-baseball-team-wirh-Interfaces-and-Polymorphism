/*
*Pitcher class implements the Player interface

* @param name holds the player's name 
* @param salary holds player salary 
* @param wins holds the number of games pitcher won 
* @param losses holds the number of games pitcher lost 
* @param era holds the pitcher era

*/

public class Pitcher implements Player
  {
      String name;
      double salary;
      int wins;
      int losses;
      int era;
    
    public Pitcher(String n, int s, int w, int l, int e)
    {
      name = n;
      salary = s;
      wins = w;
      losses = l;
      era = e;
      
    }

    //returns pitcher salary
    public double getSal()
    {
      return salary;
    }

    public int getWins()
    {
      return wins;
    }


    // prints out pitcher stats
    public void showStats()
    {
      System.out.println("Name: " + name);
      System.out.println("Salary: $" + salary);
      System.out.println("Wins: " + wins);
      System.out.println("Losses: " + losses);
      System.out.println("ERA: " + era + "\n");
    }
    
  }