package cn.guardskill.orm;

import java.util.Set;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;




@Entity
@Table(name="user")
public class User {
	
	@Id
	private String uName;
	private String uPassword;
	private String uPhone;
	
	@OneToMany(targetEntity=Good.class,mappedBy="gBuilder")  
	//mappedBy--which Property in targetEntity
	private Set<Good>  uGoods;
	
	@OneToMany(targetEntity=Indent.class,mappedBy="iSeller")  
	private Set<Indent> uSellOrders;
	@OneToMany(targetEntity=Indent.class,mappedBy="iCustomer")  
	private Set<Indent> uBuyOrders;

	
	
	public String getuPassword() {
		return uPassword;
	}
	public void setuPassword(String uPassword) {
		this.uPassword = uPassword;
	}
	public String getuPhone() {
		return uPhone;
	}
	public void setuPhone(String uPhone) {
		this.uPhone = uPhone;
	}
	public Set<Good> getuGoods() {
		return uGoods;
	}
	public void setuGoods(Set<Good> uGoods) {
		this.uGoods = uGoods;
	}
	public Set<Indent> getuSellOrders() {
		return uSellOrders;
	}
	public void setuSellOrders(Set<Indent> uSellOrders) {
		this.uSellOrders = uSellOrders;
	}
	public Set<Indent> getuBuyOrders() {
		return uBuyOrders;
	}
	public void setuBuyOrders(Set<Indent> uBuyOrders) {
		this.uBuyOrders = uBuyOrders;
	}
	public String getuName() {
		return uName;
	}
	public void setuName(String uName) {
		this.uName = uName;
	}
	
}
