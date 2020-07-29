package task1;

public class PlaneControl {

	public void moveUp() {
		System.out.println(" The plane flew up " + Move.move() + " km ");
	}

	public void moveDown() {
		System.out.println(" The plane flew down " + Move.move() + " km ");
	}

	public void moveLeft() {
		System.out.println(" The plane flew to the left " + Move.move() + " km ");
	}

	public void moveRight() {
		System.out.println(" The plane flew to the right " + Move.move() + " km ");
	}
}
