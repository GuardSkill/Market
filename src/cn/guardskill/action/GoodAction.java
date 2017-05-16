package cn.guardskill.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import cn.guardskill.orm.Good;
import cn.guardskill.service.GoodService;


public class GoodAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2L;
	private Good good;
	private GoodService goodService;

	public String newGood()  throws Exception{
		Integer uId=(Integer) ActionContext.getContext().getSession().get("UID");
		//take uId from memory
		if(goodService.addGood(good, uId)==null) return NONE;
		else return SUCCESS;

	}

	
	
	


	public void setGoodService(GoodService goodService) {
		this.goodService = goodService;
	}
	public Good getGood() {
		return good;
	}

	public void setGood(Good good) {
		this.good = good;
	}
}
