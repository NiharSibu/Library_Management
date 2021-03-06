package com.mindtree.mobilestore.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Mobile {
	@Id
	@Column(name="MOVILE_ID")
	private int mobileId;
	@Column(name="MOBILE_NAME")
	private String mobileName;
	@Column(name="RAM")
	private String ram;
	@Column(name="PRISE")
	private String prise;
	public Mobile() {
		super();
	}
	public Mobile(int mobileId, String mobileName, String ram, String prise) {
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
		Mobile other = (Mobile) obj;
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
		return "Mobile [mobileId=" + mobileId + ", mobileName=" + mobileName + ", ram=" + ram + ", prise=" + prise
				+ "]";
	}

}
