package cn.guardskill.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class GoodAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2L;

	public String newGood()  throws Exception{
		String name=(String) ActionContext.getContext().getSession().get("USER");
		addActionMessage(name);
		return NONE;

	}

}
