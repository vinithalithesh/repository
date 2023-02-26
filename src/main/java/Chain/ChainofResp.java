package Chain;

public class ChainofResp {

	public static void main(String[] args) {
		LeaveProcess manaLeaveProcess = new ManagerApprovalProcess();
		LeaveProcess hrLeaveProcess = new HrApprovalProcess();
		LeaveProcess direLeaveProcess = new DirectorApprovalProcess();
		
		manaLeaveProcess.setNext(direLeaveProcess);
		direLeaveProcess.setNext(hrLeaveProcess);
		
		LeaveRequest req = new LeaveInfo();
		req.setLeave(70);
		manaLeaveProcess.process(req);
		
			

	}

}
