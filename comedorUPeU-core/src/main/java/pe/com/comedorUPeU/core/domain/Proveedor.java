package pe.com.comedorUPeU.core.domain;

import java.io.Serializable;

public class Proveedor extends BaseEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String ruc;
	private String enterpriceName;
	private String adress;
	private String phone;
	private StatusProveedor statusProveedor;
	public String getRuc() {
		return ruc;
	}
	public void setRuc(String ruc) {
		this.ruc = ruc;
	}
	public String getEnterpriceName() {
		return enterpriceName;
	}
	public void setEnterpriceName(String enterpriceName) {
		this.enterpriceName = enterpriceName;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public StatusProveedor getStatusProveedor() {
		return statusProveedor;
	}
	public void setStatusProveedor(StatusProveedor statusProveedor) {
		this.statusProveedor = statusProveedor;
	}
	
}
