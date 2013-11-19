package Bharat.mondodb;

public class UserInfo {
	String vaultname;
	Boolean Tier1;
	Boolean Tier2;
	String Role;
	/**
	 * @return the vaultname
	 */
	public String getVaultname() {
		return vaultname;
	}
	/**
	 * @param vaultname the vaultname to set
	 */
	public void setVaultname(String vaultname) {
		this.vaultname = vaultname;
	}
	/**
	 * @return the tier1
	 */
	public Boolean getTier1() {
		return Tier1;
	}
	/**
	 * @param tier1 the tier1 to set
	 */
	public void setTier1(Boolean tier1) {
		Tier1 = tier1;
	}
	/**
	 * @return the tier2
	 */
	public Boolean getTier2() {
		return Tier2;
	}
	/**
	 * @param tier2 the tier2 to set
	 */
	public void setTier2(Boolean tier2) {
		Tier2 = tier2;
	}
	/**
	 * @return the role
	 */
	public String getRole() {
		return Role;
	}
	/**
	 * @param role the role to set
	 */
	public void setRole(String role) {
		Role = role;
	}
	

}
