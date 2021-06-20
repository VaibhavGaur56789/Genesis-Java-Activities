import java.util.Arrays;

class SortScore extends Thread {
	String matchType;
	String scoreString;
	int scores[];
	
	
	public SortScore(String matchType, String scoreString) {
		this.matchType = matchType;
		this.scoreString = scoreString;
		}
	
	public void run() {
		Arrays.sort(scores);
	}
	
	public int[] getScore() {
		return scores;
	}
	
	public void setScore() {
		String arr[] = scoreString.split(",");
		scores = new int[arr.length];
		for(int i=0; i<arr.length; i++) {
			scores[i] = Integer.parseInt(arr[i]);
		}
	}
	
}
