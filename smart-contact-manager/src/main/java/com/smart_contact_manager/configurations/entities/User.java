package com.smart_contact_manager.configurations.entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "user")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String userId;
	private String name;
	private String email;
	private String password;
	private String role;
	private String profile;
	private String mobNum;
	
	//Verification Parameters
	private boolean enabled=false;
	private boolean emailVerified=false;
	private boolean mobVerified=false;	
	
	//Provider Parameters
	private Providers provider=Providers.SELF;
	private String providerId;
	
	//One User Have Multiple Contacts
	@OneToMany(mappedBy = "user",cascade = CascadeType.ALL,fetch = FetchType.LAZY,orphanRemoval =true)		
	private List<Contacts> contacts = new ArrayList<>();

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getProfile() {
		return profile;
	}

	public void setProfile(String profile) {
		this.profile = profile;
	}

	public String getMobNum() {
		return mobNum;
	}

	public void setMobNum(String mobNum) {
		this.mobNum = mobNum;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public boolean isEmailVerified() {
		return emailVerified;
	}

	public void setEmailVerified(boolean emailVerified) {
		this.emailVerified = emailVerified;
	}

	public boolean isMobVerified() {
		return mobVerified;
	}

	public void setMobVerified(boolean mobVerified) {
		this.mobVerified = mobVerified;
	}

	public Providers getProvider() {
		return provider;
	}

	public void setProvider(Providers provider) {
		this.provider = provider;
	}

	public String getProviderId() {
		return providerId;
	}

	public void setProviderId(String providerId) {
		this.providerId = providerId;
	}

	public List<Contacts> getContacts() {
		return contacts;
	}

	public void setContacts(List<Contacts> contacts) {
		this.contacts = contacts;
	}

	public User(String userId, String name, String email, String password, String role, String profile, String mobNum,
			boolean enabled, boolean emailVerified, boolean mobVerified, Providers provider, String providerId,
			List<Contacts> contacts) {
		super();
		this.userId = userId;
		this.name = name;
		this.email = email;
		this.password = password;
		this.role = role;
		this.profile = profile;
		this.mobNum = mobNum;
		this.enabled = enabled;
		this.emailVerified = emailVerified;
		this.mobVerified = mobVerified;
		this.provider = provider;
		this.providerId = providerId;
		this.contacts = contacts;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
