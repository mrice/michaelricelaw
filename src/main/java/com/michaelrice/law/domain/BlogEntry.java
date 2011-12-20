package com.michaelrice.law.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="blog")
public class BlogEntry {
	
	@Id
	@GeneratedValue
	@Column(name="BLOG_ID")
	private Integer id;

	@Column(name="PUBLISH_DATE")
	private Date publishDate = new Date();
	
	@Column(name="TITLE")
	private String title;

	@Column(name="URL_PART")
	private String urlPart;

	@Column(name="BODY", columnDefinition="TEXT")
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
	
	public String getUrlPart() {
		return urlPart;
	}
	public void setUrlPart(String urlPart) {
		this.urlPart = urlPart;
	}
	
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	
}
