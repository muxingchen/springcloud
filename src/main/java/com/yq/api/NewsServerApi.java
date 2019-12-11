package com.yq.api;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;

import com.yq.news.pojo.Category;
import com.yq.news.pojo.News;
public interface NewsServerApi {

	
	@RequestMapping(value="/getList")
	public List<News> getNewsList();

	@RequestMapping(value="/getCategory")
	List<Category> getCategory();
}
