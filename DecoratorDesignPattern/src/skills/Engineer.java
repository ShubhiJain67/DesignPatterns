package skills;

import client.HumanDesigner;
import interfaces.IWrokingHuman;

public class Engineer extends HumanDesigner{
	String job = "I am an Engineer";
	
	@Override
	public void work() {
		super.work();
		System.out.println(job);
	}

	public Engineer(IWrokingHuman job){
		super(job);
	}
	
	@Override
	public String toString() {
		return super.toString() +"\n" +  job;
	}
}