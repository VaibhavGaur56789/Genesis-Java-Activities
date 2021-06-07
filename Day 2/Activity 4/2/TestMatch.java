
class TestMatch extends Match {

	@Override
	float calculateRunRate() {
		
		return 0;
	}

	@Override
	int calculateBalls() {
		
		return 0;
	}

	@Override
	void display(double reqRunrate, int balls) {
		System.out.println("Recquired Runrate:"+" "+reqRunrate);
		
	}

}
