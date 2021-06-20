package skills;

import client.*;
import interfaces.*;

public class Tailor extends HumanDesigner{
	String job = "I am a Tailor";
	
	@Override
	public void work() {
		super.work();
		System.out.println(job);
	}

	public Tailor(IWrokingHuman job){
		super(job);
	}
	
	@Override
	public String toString() {
		return super.toString() + "\n" + job;
	}
}