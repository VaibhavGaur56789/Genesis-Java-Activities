import java.util.*;

public class Player 
{
    public static void main(String arg[])
    {
        
        Scanner ob=new Scanner(System.in);
        TreeMap<String,Player1>tm=new TreeMap<String,Player1>();

        System.out.println("Enter the number of players");
        int n=ob.nextInt();ob.nextLine();
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter the details of the player");
            String capNumber=ob.nextLine();
            String name=ob.nextLine();
            String team=ob.nextLine();
            String skills=ob.nextLine();
            tm.put(capNumber,new Player1(name,team,skills));
        }
        System.out.println("Player Details");
        for(Map.Entry<String, Player1> entry:tm.entrySet()){   
            String key=entry.getKey();  
            Player1 b=entry.getValue();  
            System.out.println(key+"--"+b.name+"--"+b.team+"--"+b.skills); 
        }
    }
}
