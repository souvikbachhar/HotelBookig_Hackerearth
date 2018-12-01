package com.souvik.dao;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "hotel_master")
public class Hotel {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "hotel_master")
    @SequenceGenerator(sequenceName = "hotel_master_seq", allocationSize = 1, name = "hotel_master")
	private String id ;
	private String  address ;
	private String categories ;
	private String city ;
	private String country ;
	private String latitude ;
	private String longitude ;
	private String name ;
	private String postalcode ;
	private String province ;
	private String reviews_rating ;
	private String reviews_text ;
	private String reviews_title ;
	private String reviews_username;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCategories() {
		return categories;
	}
	public void setCategories(String categories) {
		this.categories = categories;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getLatitude() {
		return latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPostalCode() {
		return postalcode;
	}
	public void setPostalCode(String postalCode) {
		this.postalcode = postalCode;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public String getReviews_rating() {
		return reviews_rating;
	}
	public void setReviews_rating(String reviews_rating) {
		this.reviews_rating = reviews_rating;
	}
	
	public String getReviews_title() {
		return reviews_title;
	}
	public void setReviews_title(String reviews_title) {
		this.reviews_title = reviews_title;
	}
	public String getReviews_username() {
		return reviews_username;
	}
	public void setReviews_username(String reviews_username) {
		this.reviews_username = reviews_username;
	}
	public String getPostalcode() {
		return postalcode;
	}
	public void setPostalcode(String postalcode) {
		this.postalcode = postalcode;
	}
	public String getReviews_text() {
		return reviews_text;
	}
	public void setReviews_text(String reviews_text) {
		this.reviews_text = reviews_text;
	}
	@Override
	public String toString() {
		return "CD [id=" + id + ", address=" + address + ", categories=" + categories + ", city=" + city + ", country="
				+ country + ", latitude=" + latitude + ", longitude=" + longitude + ", name=" + name + ", postalCode="
				+ postalcode + ", province=" + province + ", reviews_rating=" + reviews_rating + ", reviews_text="
				+ reviews_text + ", reviews_title=" + reviews_title + ", reviews_username=" + reviews_username + "]";
	} 


}
