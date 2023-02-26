package PomModel;

import Chain.LeaveRequest;

public interface nxtProcess {
	
	public void setNext(nxtProcess nextProcess);
	public boolean process();
	
	
}

