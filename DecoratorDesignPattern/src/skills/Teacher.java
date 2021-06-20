package skills;

import client.*;
import interfaces.*;

public class Teacher extends HumanDesigner{
	String job = "I am a Teacher";
	
	@Override
	public void work() {
		super.work();
		System.out.println(job);
	}

	public Teacher(IWrokingHuman job){
		super(job);
	}
	
	@Override
	public String toString() {
		return super.toString() + "\n" + job;
	}
}