package PomModel;

public class pageInfo implements pageRequest {
	private int page;
	@Override
	public void setPage(int page) {
		this.page = page;
		
	}

	@Override
	public int getPage() {
		
		return page;
	}

}
