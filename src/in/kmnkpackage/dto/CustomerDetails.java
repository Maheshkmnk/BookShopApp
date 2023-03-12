package in.kmnkpackage.dto;

import java.io.Serializable;

public class CustomerDetails implements Serializable {

	private static final long serialVersionUID = -2306041223511801470L;

	private Integer uid;
	private String uname;
	private String uemail;
	private String umobile;
	private String upassword;
	private String ugender;
	private Integer uage;
	private String uaddress;

	public Integer getUid() {
		return uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getUemail() {
		return uemail;
	}

	public void setUemail(String uemail) {
		this.uemail = uemail;
	}

	public String getUmobile() {
		return umobile;
	}

	public void setUmobile(String umobile) {
		this.umobile = umobile;
	}

	public String getUpassword() {
		return upassword;
	}

	public void setUpassword(String upassword) {
		this.upassword = upassword;
	}

	public String getUgender() {
		return ugender;
	}

	public void setUgender(String ugender) {
		this.ugender = ugender;
	}

	public Integer getUage() {
		return uage;
	}

	public void setUage(Integer uage) {
		this.uage = uage;
	}

	public String getUaddress() {
		return uaddress;
	}

	public void setUaddress(String uaddress) {
		this.uaddress = uaddress;
	}

	@Override
	public String toString() {
		return "CustomerDetails [uid=" + uid + ", uname=" + uname + ", uemail=" + uemail + ", umobile=" + umobile
				+ ", upassword=" + upassword + ", ugender=" + ugender + ", uage=" + uage + ", uaddress=" + uaddress
				+ "]";
	}

}
