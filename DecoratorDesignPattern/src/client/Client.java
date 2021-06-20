package client;

import interfaces.*;
import skills.*;
import utility.*;

public class Client {
	public static void main(String[] args) {
		IWrokingHuman shubhi = new Human("Shubhi", 22, Gender.Female);
		shubhi = new Engineer(shubhi);
		shubhi = new Teacher(shubhi);
		System.out.println(shubhi);
		shubhi.work();
		shubhi.canBreath();
		shubhi.canEat();
		shubhi.canTalk();
		shubhi.canWalk();
	}
}