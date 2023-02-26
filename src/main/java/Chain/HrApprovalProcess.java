package Chain;

public class HrApprovalProcess implements LeaveProcess {

	private LeaveProcess nextProcess;
	@Override
	public void setNext(LeaveProcess nextProcess) {
		this.nextProcess= nextProcess;
		
	}

	@Override
	public boolean process(LeaveRequest leave) {
		if (leave.getLeave()>40) {
			return nextProcess.process(leave);
			
		}
		System.out.println("Hr Approves");
		return false;
	}
	
 

}
