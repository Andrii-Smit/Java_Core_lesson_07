package task1;

public class Main {

	public static void main(String[] args) {

		Su27 md10 = new Su27(22362, 6103, 15800, 1270, "black");

		md10.startEngines();
		md10.takeoffPlane();
		md10.moveUp();
		md10.moveLeft();
		md10.moveDown();
		md10.moveRight();
		md10.becomeStealth();
		md10.nuclearStrike();
		md10.turboAccelerate();
		md10.landingPlane();
	}

}
