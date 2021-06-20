package skills;

import client.*;
import interfaces.*;

public class Lawyer extends HumanDesigner{
	String job = "I am a Lawyer";
	
	@Override
	public void work() {
		super.work();
		System.out.println(job);
	}

	public Lawyer(IWrokingHuman job){
		super(job);
	}
	
	@Override
	public String toString() {
		return super.toString() + "\n" + job;
	}
}