class MountainBike extends Bicycle {
	int grip = 1;
	int suspension = 1; //Soft, higher numbers mean harder suspension
	
	void changeGrip(int newValue) {
		grip = newValue;
	}
	
	void increaseSupension(int increment) {
		suspension = suspension + increment;
	}
	
	void decreaseSuspension(int decrement) {
		suspension = suspension - decrement;
	}
	
	void printMoutainBikeStates() {
		System.out.println("Grip:" + grip + " Suspension:" + 
			suspension);
	}
} //Ends MountainBike Class
