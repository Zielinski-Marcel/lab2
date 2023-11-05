import java.util.ArrayList;
import java.util.Random;

class Player 
{
  public String name;
  public String title;
  public boolean status;
  public int healthPoints = 100;

  public String identify() 
  {
    return "[" + this.healthPoints + "] | " + this.title +" "+ this.name;
  }
}

public class App 
{
    public static void main(String[] args) 
    {
        Random random=new Random();
        
        ArrayList < Player > players = new ArrayList < Player > ();
        for(int i=0;i<30;i++)
        {
            boolean x=random.nextBoolean();
        Player player = new Player();
        player.name = getRandomName();
        if(x==true)
        player.title = getRandomtitle();
        player.status=getRandomstatus();
        players.add(player);
        }
        
        for (Player p: players) 
        if(p.status==true)
        System.out.println(p.identify());
        
    }
    
      protected static String getRandomName() 
      {
        String[] names = 
        {
          "John",
          "Jim",
          "Jack",
          "George",
          "Kevin"
        };
        return names[new Random().nextInt(names.length)];
      }

      protected static String getRandomtitle() 
        {
        String[] titles = 
        {
          "trooper",
          "specialist",
          "technician",
          "admiral",
          "capitan",
        };
        return titles[new Random().nextInt(titles.length)];
        }

        protected static boolean getRandomstatus() 
        {
            boolean status;
            Random random=new Random();
            status=random.nextBoolean();
            return status;
        }
}
