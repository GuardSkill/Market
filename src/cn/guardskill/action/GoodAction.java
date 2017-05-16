package cn.guardskill.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import cn.guardskill.orm.Good;
import cn.guardskill.orm.User;
import cn.guardskill.service.GoodService;
import cn.guardskill.service.UserService;

public class GoodAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2L;
	private Good good;
	private User user;
	private UserService userService;
	private GoodService goodService;

	public String newGood()  throws Exception{
		Integer name=(Integer) ActionContext.getContext().getSession().get("UID");
		//take uId from memory
		
		addActionMessage(name.toString());
		return NONE;

	}

	
	
	
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	public Good getGood() {
		return good;
	}

	public void setGood(Good good) {
		this.good = good;
	}
}
