package edu.jalc.inclass.pojo.bottle;

import edu.jalc.inclass.pojo.lid.SodaBottleLid;
import edu.jalc.inclass.pojo.liquid.Soda;

public class SodaBottleApp {

	public static void main(String... args)throws Exception{
		SodaBottle sodaBottle = new SodaBottle(20,new SodaBottleLid(1,2),new Soda());
		System.out.println("Capacity: " + sodaBottle.getCapacity());
	}
}
