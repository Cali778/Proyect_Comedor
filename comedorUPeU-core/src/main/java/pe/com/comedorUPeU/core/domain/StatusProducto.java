package pe.com.comedorUPeU.core.domain;

public class StatusProducto  extends BaseType{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public enum Status {
		PRODUCTO_ACT("PRODUCTO_ACT"), PRODUCTON_INACT("PRODUCTON_INACT");

		private String statusCode;

		private Status(String s) {
			statusCode = s;
		}

		public String getStatusCode() {
			return statusCode;
		}

	}

}
