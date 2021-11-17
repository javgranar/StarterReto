package src;

public class StatusBuilder {
	
	private String status;

	public StatusBuilder() {
	}
	
	public StatusBuilder withStatus(String status) {
		this.status = status;
		return this;
	}

	
	public Status build(){
		Status status = new Status();
        status.setStatus(this.status);
        return status;

}
}
