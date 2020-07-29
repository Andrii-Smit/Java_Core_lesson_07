package task1;

public class Su27 extends Plane implements TurboAcceleration, StealthTechnology, NuclearStrike {

	int maxSpeed;
	String color;

	public Su27(int length, int height, int weight, int maxSpeed, String color) {
		super(length, height, weight);
		this.maxSpeed = maxSpeed;
		this.color = color;
	}

	@Override
	public void turboAccelerate() {
		int accSpeed = this.maxSpeed + (int) (Math.random() * this.maxSpeed);
		System.out.println(" Turbo acceleration is running. Airplane speed " + accSpeed + " km / h ");
	}

	@Override
	public void becomeStealth() {
		int unvisibleTime = (int) (Math.random() * 1000);
		System.out.println(" Stealth technology launched. The plane disappeared from radar on " + unvisibleTime + " seconds ");
	}

	@Override
	public void nuclearStrike() {
		int bombsAmount = (int) (Math.random() * (10 + 1));
		System.out.println(" The nuclear strike function is activated. The object will be reset " + bombsAmount + " warhead ");
	}

}
