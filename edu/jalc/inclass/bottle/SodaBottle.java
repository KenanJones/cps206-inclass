package edu.jalc.inclass.bottle;

import edu.jalc.inclass.lid.*;

public class SodaBottle {
	//final only after the constructor finishes
	private final double capacity;
	private SodaBottleLid lid = new SodaBottleLid(30,true);

	private SodaBottle(){
		this.capacity = 0;
	}

	SodaBottle(double capacity){
		this.capacity = capacity;
	}

	double getCapacity(){
		return capacity;
	}

	public SodaBottleLid getLid(){
		return lid;
	}
}
