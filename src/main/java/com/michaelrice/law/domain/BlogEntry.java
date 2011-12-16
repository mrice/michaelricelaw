package com.michaelrice.law.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.Entity;

@Entity
public class BlogEntry {
	
	@Id
	@GeneratedValue
	@Column(name="BLOG_ID")
	private Integer id;

	@Column(name="PUBLISH_DATE")
	private Date publishDate;
	
	@Column(name="TITLe")
	private String title;

	@Column(name="BODY")
	private String body;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	public Date getPublishDate() {
		return publishDate;
	}
	public void setPublishDate(Date publishDate) {
		this.publishDate = publishDate;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	
}
