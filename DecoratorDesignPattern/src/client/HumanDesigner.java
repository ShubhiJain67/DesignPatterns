package client;

import interfaces.*;

public class HumanDesigner implements IWrokingHuman{
	protected IWrokingHuman job;
	
	public HumanDesigner(IWrokingHuman job) {
		this.job = job;
	}

	@Override
	public void work() {
		this.job.work();
	}
	
	@Override
	public String toString() {
		return job.toString();
	}

	@Override
	public void canTalk() {
		job.canTalk();
	}

	@Override
	public void canEat() {
		job.canEat();
	}

	@Override
	public void canWalk() {
		job.canWalk();
	}

	@Override
	public void canBreath() {
		job.canBreath();
	}

}