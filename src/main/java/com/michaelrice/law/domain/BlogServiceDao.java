package com.michaelrice.law.domain;

import java.util.List;

public interface BlogServiceDao {
	List<BlogEntry> listAll();
	List<BlogEntry> listLastN(int count);
	BlogEntry query(Integer id);
}
