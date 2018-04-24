package init.destroy;

public class HelloID {
	private String message;

	public String getMessage() {
		System.out.println(message);
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	public void init() {
		System.out.println("Bean is initializing....");
	}

	public void destroy() {
		System.out.println("Bean is destroyed");
	}
}
