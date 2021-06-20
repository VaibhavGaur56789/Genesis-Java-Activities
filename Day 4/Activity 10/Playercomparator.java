import java.util.Comparator;

class Playercomparator implements Comparator <player> {

	
	public int compare(player o1, player o2) {
		 return o1.skill.compareTo(o2.skill);
	}
	


}