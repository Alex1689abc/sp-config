package com.jt.pojo;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
/**
 * 为对象的属性赋值，当前的对象交给spring容器管理* 
 * */
@Component  //Map<k,v> key=user
 
public class User implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 4718945441755990260L;
	@Value("${user.id}") //从容器中取值之后
	private Integer id;	//默认值null
	@Value("${user.username}")
	private String username;
	@Value("${user.age}")
	private Integer age;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", age=" + age + "]";
	}
	
	

}
