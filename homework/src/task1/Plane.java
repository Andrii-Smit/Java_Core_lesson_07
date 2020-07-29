package task1;

public abstract class Plane {

	private int length;
	private int height;
	private int weight;

	private PlaneControl planeControl = new PlaneControl();

	public Plane(int length, int height, int weight) {
		this.length = length;
		this.height = height;
		this.weight = weight;
	}

	public void startEngines() {
		int countdown = 20 + (int) (Math.random() * (68 + 1));
		System.out.println(" I start the engines. Takeoff is possible through " + countdown + " seconds ");
	}

	public void takeoffPlane() {
		double distance = (Math.random() * 1000);
		System.out.println(" I'm taking off. The plane with full tanks will fly " + distance + " km ");
	}

	public void landingPlane() {
		System.out.println(" I'm landing. I'm starting to decline ");
	}

	public void moveUp() {
		planeControl.moveUp();
	}

	public void moveDown() {
		planeControl.moveDown();
	}

	public void moveLeft() {
		planeControl.moveLeft();
	}

	public void moveRight() {
		planeControl.moveRight();
	}

}
