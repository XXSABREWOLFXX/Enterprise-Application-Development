package br.com.fiap.exception;

public class SearchNotFoundException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public SearchNotFoundException() {
		super();
	}

	public SearchNotFoundException(String arg0, Throwable arg1, boolean arg2, boolean arg3) {
		super(arg0, arg1, arg2, arg3);
	}

	public SearchNotFoundException(String arg0, Throwable arg1) {
		super(arg0, arg1);
	}

	public SearchNotFoundException(String arg0) {
		super(arg0);
	}

	public SearchNotFoundException(Throwable arg0) {
		super(arg0);
	}

	
	
}
