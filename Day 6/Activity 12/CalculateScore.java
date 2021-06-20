class CalculateScore implements Runnable {
	
	String matchType;
	private String scoreString;
	private int scores[];
	private int meanScore;
	private int minScore;
	private int maxScore;
	
	public CalculateScore(String matchType, String scoreString) {
		this.matchType = matchType;
		this.scoreString = scoreString;
		}

	@Override 
	public void run() {
		int min = Integer.MAX_VALUE;
		int max = 0;
		int sum=0;
		for(int i=0; i<scores.length; i++) {
			sum = sum+scores[i];
			
			if(scores[i] < min) {
				min = scores[i];
			}
			
			if(scores[i] > max) {
				max = scores[i];
			}
		}
		System.out.println("Mean Score"+" "+(sum/scores.length));
		System.out.println("Minimum Score"+" "+min);
		System.out.println("Maximum Score"+" "+max);
		
	}
	
	public void setScore()
    {
        String arr[]=scoreString.split(",");
        scores = new int [arr.length];
        for(int i=0; i<arr.length; i++) {
            scores[i] = Integer.parseInt(arr[i]);
        }
    }
	
}
