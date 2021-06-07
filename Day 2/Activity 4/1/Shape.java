public abstract class Shape {
	int value;
	
	public int getValue() {
		return value;
	}
	
	public void setValue(int newValue) {
		 this.value = newValue;
	}
	
	abstract void calculateArea(int value);

}
