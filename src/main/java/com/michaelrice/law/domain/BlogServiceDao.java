package com.michaelrice.law.domain;

import java.util.List;

public interface BlogServiceDao {
	void save(BlogEntry entry);
	List<BlogEntry> listAll();
	List<BlogEntry> listLastN(int count);
	BlogEntry queryById(Integer id);
	BlogEntry queryByUrlPart(String urlPart);
}
