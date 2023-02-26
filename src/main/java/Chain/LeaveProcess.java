package Chain;

public interface LeaveProcess {
	public void setNext(LeaveProcess nextProcess);
	public boolean process(LeaveRequest leave);
}
