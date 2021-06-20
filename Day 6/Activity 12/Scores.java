import java.util.*;

public class Scores extends Thread
{
    int start,end;
    String scoreType;
    int scoreList[];
    Scores(String scoreType,int start,int end)
    {
        this.start=start;
        this.end=end;
        this.scoreType=scoreType;
    }

    public void run()
    {
        if(scoreType.equals("Odd"))
        {
            int j=0;
            for(int i=start;i<=end;i++)
            {
                if(i%2!=0)
                {
                    j++;
                }
            }
            scoreList=new int[j];
            int m=0;
            for(int k=start;k<=end;k++)
            {
                if(k%2!=0)
                {
                    scoreList[m]=k;
                    m++;
                }
            }

        }
        else if(scoreType.equals("Even"))
        {
            int j=0;
            for(int i=start;i<=end;i++)
            {
                if(i%2==0)
                {
                    j++;
                }
            }
            scoreList=new int[j];
            int m=0;
            for(int k=start;k<=end;k++)
            {
                if(k%2==0)
                {
                    scoreList[m]=k;
                    m++;
                }
            }
        }
        display();
    }
    public void display()
    {
        for(int i=0;i<scoreList.length;i++)
        {
            System.out.print(scoreList[i]+" ");
        }
    }
}