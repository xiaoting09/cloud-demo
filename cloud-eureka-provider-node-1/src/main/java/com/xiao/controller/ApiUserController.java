package com.xiao.controller;

import com.xiao.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @author 肖亭
 */
@Slf4j
@RestController
@RequestMapping(value = "/api/user")
public class ApiUserController {

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public User view(@PathVariable int id) {
		User user = new User();
		user.setId(id);
		user.setName("提供者-node1-");
		user.setTime(new Date());
		log.info("请求接口返回：{}", user);
		return user;
	}

}
