package com.smart_contact_manager.configurations.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Contacts {
	@Id
	private String id;
	private String name;
	private String email;
	private String mobNumber;
	private String address;
	private String profilePic;
	private String description;
	private boolean favorite=false;

	//Social Links
	private String webLink;
	private String LinedInLink;
	
	//Mapped By user only
	@ManyToOne
	private User user;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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

	public String getMobNumber() {
		return mobNumber;
	}

	public void setMobNumber(String mobNumber) {
		this.mobNumber = mobNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getProfilePic() {
		return profilePic;
	}

	public void setProfilePic(String profilePic) {
		this.profilePic = profilePic;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean isFavorite() {
		return favorite;
	}

	public void setFavorite(boolean favorite) {
		this.favorite = favorite;
	}

	public String getWebLink() {
		return webLink;
	}

	public void setWebLink(String webLink) {
		this.webLink = webLink;
	}

	public String getLinedInLink() {
		return LinedInLink;
	}

	public void setLinedInLink(String linedInLink) {
		LinedInLink = linedInLink;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Contacts(String id, String name, String email, String mobNumber, String address, String profilePic,
			String description, boolean favorite, String webLink, String linedInLink, User user) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.mobNumber = mobNumber;
		this.address = address;
		this.profilePic = profilePic;
		this.description = description;
		this.favorite = favorite;
		this.webLink = webLink;
		LinedInLink = linedInLink;
		this.user = user;
	}

	public Contacts() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
