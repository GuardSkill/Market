package cn.guardskill.action;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;


import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import cn.guardskill.orm.User;
import cn.guardskill.service.UserService;

public class UserAction extends ActionSupport{
	private static final long serialVersionUID = 1L;
	private UserService userService;
	//this interface is implement by UserServiceImp (Spring bean)
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	private User user;
		
	/* for AJAX output*/
	 private InputStream inputStream; 
	 public InputStream getResult()  
	    {  
	        return inputStream;  
	    }  
	 /*user login*/
	public String userLogin () throws Exception
	 {
		ActionContext ctx=ActionContext.getContext();//build ActionCtx
		if(!validateLogin())  //input invalid
			{
			addActionMessage("请好好输入");
			return NONE;  
			}
		 User userdata=userService.loginUser(user);
		 if(userdata==null)
			 {
			 addActionMessage("您输错了");
			 return NONE;	//if login not success
			 }
		 else 
			 {
			 ctx.getSession().put("UID", userdata.getuId());
			 ctx.getSession().put("USER", userdata.getuName());
			 ctx.getSession().put("PWD", userdata.getuPassword());
			 //put the data to the memory
			 return SUCCESS;
			 }
	 }
	 /*user sign up*/
	public String userAdd () throws Exception
	{
		if (!validateRegister()) {
			addActionMessage("请好好输入");
			return NONE;
		}
		Integer uId = userService.addUser(user);
		if (uId == null) {
			addActionMessage("用户已经存在");
			return NONE; // if login not success
		} else
		return SUCCESS;
		
	}
	 /*uName validate AJAX*/
	public String userExist() throws IOException

	{
		if(!validateName())
		{
			inputStream=new ByteArrayInputStream("请好好输入"  
					.getBytes("UTF-8"));  
		}
		User exisUser =userService.findByName(user.getuName());  
	    //query if this uName is Already exist in database  
		/*get response  	*/	
		inputStream =(exisUser==null)? new ByteArrayInputStream("用户名可用"  
	                .getBytes("UTF-8"))  
	            : new ByteArrayInputStream("用户名存在"  
	                .getBytes("UTF-8"));  
	    return NONE;  
	}

	
	protected Boolean validateName()
	{
		if(user.getuName().trim().isEmpty()||user.getuName().length()>15
				||user.getuName().length()<4) return false;
		else return true;
	}
	protected Boolean validateRegister()
	{
		if(user.getuName().trim().isEmpty()||user.getuName().length()>15
		  ||user.getuName().length()<4||user.getuPassword().length()>15
          ||user.getuPassword().length()<4
          ||user.getuPassword().trim().isEmpty()
		  ||user.getuPhone().trim().isEmpty()) return false;
		else return true;
	}
	protected Boolean validateLogin(){ 
		if(user.getuName().trim().isEmpty()||user.getuName().length()>15
		  ||user.getuName().length()<4||user.getuPassword().length()>15
		  ||user.getuPassword().length()<4
		  ||user.getuPassword().trim().isEmpty())  return false;
		else return true;
	}
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
}
