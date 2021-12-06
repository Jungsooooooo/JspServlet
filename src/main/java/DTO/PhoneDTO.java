package DTO;

public class PhoneDTO {
	String	name;
	String  birth;
	String	phoneNum;
	
	public PhoneDTO() {
	
	}
	
	public PhoneDTO(String name, String birth, String phoneNum) {
		this.name 	  = name;
		this.birth	  = birth;
		this.phoneNum = phoneNum;

	}

	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	@Override
	public String toString() {
		return name+", "+birth+", "+phoneNum;
	}
}
