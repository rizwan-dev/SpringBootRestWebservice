package com.riztech.springboot.model;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "name", "realname", "team", "firstappearance", "createdby", "publisher", "imageurl", "bio" })
public class Movie {

	@JsonProperty("name")
	private String name;
	@JsonProperty("realname")
	private String realname;
	@JsonProperty("team")
	private String team;
	@JsonProperty("firstappearance")
	private String firstappearance;
	@JsonProperty("createdby")
	private String createdby;
	@JsonProperty("publisher")
	private String publisher;
	@JsonProperty("imageurl")
	private String imageurl;
	@JsonProperty("bio")
	private String bio;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("name")
	public String getName() {
		return name;
	}

	@JsonProperty("name")
	public void setName(String name) {
		this.name = name;
	}

	@JsonProperty("realname")
	public String getRealname() {
		return realname;
	}

	@JsonProperty("realname")
	public void setRealname(String realname) {
		this.realname = realname;
	}

	@JsonProperty("team")
	public String getTeam() {
		return team;
	}

	@JsonProperty("team")
	public void setTeam(String team) {
		this.team = team;
	}

	@JsonProperty("firstappearance")
	public String getFirstappearance() {
		return firstappearance;
	}

	@JsonProperty("firstappearance")
	public void setFirstappearance(String firstappearance) {
		this.firstappearance = firstappearance;
	}

	@JsonProperty("createdby")
	public String getCreatedby() {
		return createdby;
	}

	@JsonProperty("createdby")
	public void setCreatedby(String createdby) {
		this.createdby = createdby;
	}

	@JsonProperty("publisher")
	public String getPublisher() {
		return publisher;
	}

	@JsonProperty("publisher")
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	@JsonProperty("imageurl")
	public String getImageurl() {
		return imageurl;
	}

	@JsonProperty("imageurl")
	public void setImageurl(String imageurl) {
		this.imageurl = imageurl;
	}

	@JsonProperty("bio")
	public String getBio() {
		return bio;
	}

	@JsonProperty("bio")
	public void setBio(String bio) {
		this.bio = bio;
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

}