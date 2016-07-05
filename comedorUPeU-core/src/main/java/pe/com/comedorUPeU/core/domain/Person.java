package pe.com.comedorUPeU.core.domain;

import java.io.Serializable;

public class Person extends BaseEntity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String NAME;
	private String lastNameF;
	private String lastNameM;
	private String numberDocument;
	private String phone;
	private String address;
	
	
	public String getNAME() {
		return NAME;
	}
	public void setNAME(String nAME) {
		NAME = nAME;
	}
	public String getLastNameF() {
		return lastNameF;
	}
	public void setLastNameF(String lastNameF) {
		this.lastNameF = lastNameF;
	}
	public String getLastNameM() {
		return lastNameM;
	}
	public void setLastNameM(String lastNameM) {
		this.lastNameM = lastNameM;
	}
	public String getNumberDocument() {
		return numberDocument;
	}
	public void setNumberDocument(String numberDocument) {
		this.numberDocument = numberDocument;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
}
