package HackerRank;

public class Datatypes {
	
	int maxSpeed = 100;
	int minSpeed = 50;
	double weight = 3459;
	boolean  isDriving = false;
	char condition = 'A';
	
	public void printVariables() {
		System.out.println("The max speed is :" + maxSpeed);
		System.out.println(minSpeed);
		System.out.println(weight);
		System.out.println(isDriving);
		System.out.println(condition);
	}
	public void upgradeSpeed() {
		minSpeed = maxSpeed;
		maxSpeed = maxSpeed + 1;
	}

	public static void main(String[] args) {
		Datatypes dt = new Datatypes();
		dt.printVariables();
		dt.upgradeSpeed();
		dt.printVariables();

	}

}
