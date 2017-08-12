package com.nishant.springcloudhelper.springcloudconfighelper;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {
	
	@Autowired
	private TestDao testDao;
	
	@RequestMapping(value="/all",method=RequestMethod.GET)
	public List<TestTable> get(){
		return testDao.findAll();
	}
	@RequestMapping(value="/add",method=RequestMethod.POST)
	public String add(@RequestBody TestTable tt){
		 testDao.save(tt);
		 return "success";
	}
	

}
