package week1day2;

import org.openqa.selenium.interactions.Actions;

public class MyCar {
	public static void main(String[] args) {
		Car actions=new Car();
		actions.applyBreak();
		actions.applyGear();
		actions.switchOnAc();
		actions.applyAcclerate();
	}

}
