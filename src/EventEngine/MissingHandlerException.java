package EventEngine;

public class MissingHandlerException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MissingHandlerException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MissingHandlerException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public MissingHandlerException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public MissingHandlerException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public MissingHandlerException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

}
