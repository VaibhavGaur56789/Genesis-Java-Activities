class Player implements Comparable<Player> {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	Player(String name) {
		this.name = name;
	}
	
	public int compareTo(Player p) {
		return 0;
	}
}
