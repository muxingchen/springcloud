package com.yq.api;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.yq.news.pojo.News;
import com.yq.news.pojo.Result;

public interface EditService {
	
	
	@RequestMapping(value="/addNews",method=RequestMethod.POST)
	
	//@RequestBody将   json---> java类型 
	public Result addNews(@RequestBody News news);
	@RequestMapping(value="/updateNews",method=RequestMethod.POST)
	public Result updateNews(@RequestBody News news);
	
	
	@RequestMapping(value="/delNews",method=RequestMethod.GET)
	public Result delNews(Integer[] ids);
}
