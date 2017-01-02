class BicycleDemo {
	public static void main(String[] args) {
		//Create two Bicycles
		Bicycle bike1 = new Bicycle();
		Bicycle bike2 = new Bicycle();
		
		bike1.changeCadence(50);
		bike1.speedUp(10);
		bike1.changeGear(5);
		bike1.printStates();
		
		bike2.changeCadence(50);
		bike2.speedUp(10);
		bike2.changeGear(2);
		bike2.changeCadence(40);
		bike2.speedUp(10);
		bike2.changeGear(5);
		bike2.printStates();
		
		//Create a MountainBike
		MountainBike mBike1 = new MountainBike();
		
		mBike1.changeCadence(60);
		mBike1.speedUp(15);
		mBike1.changeGear(2);
		mBike1.changeGrip(2);
		mBike1.increaseSupension(2);
		mBike1.decreaseSuspension(2);
		mBike1.printStates();
		mBike1.printMoutainBikeStates();
		
		TeraBicycle tBike1 = new TeraBicycle();
		
		tBike1.changeCadence(60);
		tBike1.speedUp(15);
		tBike1.changeGear(2);
		tBike1.printStates();
	
	} //End Main
} //End Bicycle Demo Class
