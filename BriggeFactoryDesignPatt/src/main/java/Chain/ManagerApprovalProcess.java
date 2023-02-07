package Chain;

public class ManagerApprovalProcess implements LeaveProcess {
	
	private LeaveProcess nextProcess;

	@Override
	public void setNext(LeaveProcess nextProcess) {
		this.nextProcess=nextProcess;
		
	}

	@Override
	public boolean process(LeaveRequest leave) {
		System.out.println("Manger approves");
		if (leave.getLeave()>7) {
			return nextProcess.process(leave);
		}
		return false;
	}
	

}
