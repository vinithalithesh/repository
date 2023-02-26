package Chain;

public class LeaveInfo implements LeaveRequest {
	
	private int leave;
	
	@Override
	public void setLeave(int leave) {
		this.leave=leave;
		
	}

	
	@Override
	public int getLeave() {
		
		return leave;
	}
	
	

}
