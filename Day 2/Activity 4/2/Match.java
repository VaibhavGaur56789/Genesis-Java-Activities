public abstract class Match {
	private int currentScore;
	private float currentOver;
	private int target;
	int balls,reqRunrate;
	
	abstract float calculateRunRate();
	abstract int calculateBalls();
	abstract void display(double reqRunrate, int balls);
	
	public int getCurrentScore() {
		return currentScore;
	}
	
	public float getCurrentOver() {
		return currentOver;
	}
	
	public int getTarget() {
		return target;
	}
	
	public void setCurrentScore(int newCurrentScore) {
		this.currentScore = newCurrentScore;
	}
	
	public void setCurrentOver(float newCurrentOver) {
		this.currentOver = newCurrentOver;
	}
	
	public void setTarget(int newTarget) {
		this.target = newTarget;
	}
	
	
}
