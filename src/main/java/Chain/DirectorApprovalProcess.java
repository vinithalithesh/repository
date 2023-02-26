package Chain;
import Chain.LeaveProcess;
import Chain.LeaveRequest;

public class DirectorApprovalProcess implements LeaveProcess{

	private LeaveProcess nextProcess;
	@Override
	public void setNext(LeaveProcess nextProcess) {
		this.nextProcess= nextProcess;
	}

	@Override
	public boolean process(LeaveRequest leave) {
		if (leave.getLeave()>60) {
			return nextProcess.process(leave);
			
		}System.out.println("Director Approves");
		return false;
	}

}
