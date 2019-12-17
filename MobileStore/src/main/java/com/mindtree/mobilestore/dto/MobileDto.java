package com.mindtree.mobilestore.dto;

public class MobileDto {
	private int mobileId;
	private String mobileName;
	private String ram;
	private String prise;
	public MobileDto() {
		super();
	}
	public MobileDto(int mobileId, String mobileName, String ram, String prise) {
		super();
		this.mobileId = mobileId;
		this.mobileName = mobileName;
		this.ram = ram;
		this.prise = prise;
	}
	public int getMobileId() {
		return mobileId;
	}
	public void setMobileId(int mobileId) {
		this.mobileId = mobileId;
	}
	public String getMobileName() {
		return mobileName;
	}
	public void setMobileName(String mobileName) {
		this.mobileName = mobileName;
	}
	public String getRam() {
		return ram;
	}
	public void setRam(String ram) {
		this.ram = ram;
	}
	public String getPrise() {
		return prise;
	}
	public void setPrise(String prise) {
		this.prise = prise;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + mobileId;
		result = prime * result + ((mobileName == null) ? 0 : mobileName.hashCode());
		result = prime * result + ((prise == null) ? 0 : prise.hashCode());
		result = prime * result + ((ram == null) ? 0 : ram.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MobileDto other = (MobileDto) obj;
		if (mobileId != other.mobileId)
			return false;
		if (mobileName == null) {
			if (other.mobileName != null)
				return false;
		} else if (!mobileName.equals(other.mobileName))
			return false;
		if (prise == null) {
			if (other.prise != null)
				return false;
		} else if (!prise.equals(other.prise))
			return false;
		if (ram == null) {
			if (other.ram != null)
				return false;
		} else if (!ram.equals(other.ram))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "MobileDto [mobileId=" + mobileId + ", mobileName=" + mobileName + ", ram=" + ram + ", prise=" + prise
				+ "]";
	}
	
}
