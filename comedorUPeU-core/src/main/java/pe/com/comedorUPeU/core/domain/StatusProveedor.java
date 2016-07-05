package pe.com.comedorUPeU.core.domain;

public class StatusProveedor extends BaseType{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public enum Status {
		PROVEEDOR_ACT("PROVEEDOR_ACT"), PROVEEDOR_INACT("PROVEEDOR_INACT");

		private String statusCode;

		private Status(String s) {
			statusCode = s;
		}

		public String getStatusCode() {
			return statusCode;
		}

	}

}
