package skills;

import client.*;
import interfaces.*;

public class Painter extends HumanDesigner{
	String job = "I am a Painter";
	
	@Override
	public void work() {
		super.work();
		System.out.println(job);
	}

	public Painter(IWrokingHuman job){
		super(job);
	}
	
	@Override
	public String toString() {
		return super.toString() + "\n" + job;
	}
}