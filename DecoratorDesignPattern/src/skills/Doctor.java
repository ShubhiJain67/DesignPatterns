package skills;

import client.HumanDesigner;
import interfaces.*;

public class Doctor extends HumanDesigner{
	String job = "I am a Doctor";
	
	@Override
	public void work() {
		super.work();
		System.out.println(job);
	}

	public Doctor(IWrokingHuman job){
		super(job);
	}
	
	@Override
	public String toString() {
		return super.toString() + "\n" + job;
	}
}