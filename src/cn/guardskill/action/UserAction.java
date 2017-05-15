package cn.guardskill.action;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

import com.opensymphony.xwork2.ActionSupport;

import cn.guardskill.orm.User;
import cn.guardskill.service.UserService;

public class UserAction extends ActionSupport{
	private static final long serialVersionUID = 1L;
	private UserService userService;
	
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	private User user;
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	 private InputStream inputStream; 
	 public InputStream getResult()  
	    {  
	        return inputStream;  
	    }  
	public String userLogin () throws Exception
	 {
		if(user.getuName().trim().isEmpty()||user.getuName().length()>10
				||user.getuPassword().length()>10
				||user.getuPassword().trim().isEmpty())
			return ERROR;
		 User userdata=userService.loginUser(user);
		 if(userdata==null) return ERROR;	
		 else return SUCCESS;
	 }
	public String userAdd () throws Exception

	{
		String  result=userService.addUser(user);
		if(result!=null)	return SUCCESS;
		else return ERROR;
		
	}
	public String userExist() throws IOException
	{
		User exisUser =userService.findByKey(user.getuName());  
	    //获得response  
		inputStream =(exisUser==null)? new ByteArrayInputStream("用户名可用"  
	                .getBytes("UTF-8"))  
	            : new ByteArrayInputStream("用户名存在"  
	                .getBytes("UTF-8"));  
	    return SUCCESS;  
	}

}
