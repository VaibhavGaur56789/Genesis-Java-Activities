import java.util.*;

class Main3
{
    public static void main(String arg[])
    {
        Scanner ob=new Scanner(System.in);
        int start,end;
        String scoreType;

        System.out.println("Enter range of scores");
        start=ob.nextInt();
        end=ob.nextInt();ob.nextLine();
        scoreType=ob.nextLine();

        Scores obj1=new Scores(scoreType,start,end);
        obj1.start();
        try
        {
            obj1.join();
        }
        catch(Exception e)
        {   
            System.out.println(e);
        }
        ob.nextLine();
        scoreType=ob.nextLine();
        Scores obj2=new Scores(scoreType,start,end);

        obj2.start();

        try
        {
            obj2.join();
        }
        catch(Exception e)
        {   
            System.out.println(e);
        }

    }

}