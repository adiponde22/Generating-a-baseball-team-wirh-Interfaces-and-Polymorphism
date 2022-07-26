/**
* @param t is an object of class Super class Team
*/
class Main {
  public static void main(String[] args) 
  {    
    Team t = new Team();
    t.teamStats();
    System.out.println("Total Team Salary: $"+ t.teamSalary());
    System.out.println("Total Team Wins: "+ t.teamWins());

    
  }
}