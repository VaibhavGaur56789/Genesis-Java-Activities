import java.util.Comparator;

class TeamComparator implements Comparator<team> {

 public int compare(team s1, team s2)
 {
     if (s1.numberofmatches == s2.numberofmatches)
         return 0;
     else if (s1.numberofmatches > s2.numberofmatches)
         return 1;
     else
         return -1;
 }
}
