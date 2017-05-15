package cn.guardskill.orm;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Indent")
public class Indent {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer iId;
	private String iAddr;
	private Boolean iStatus;
	
	public Integer getiId() {
		return iId;
	}
	public void setiId(Integer iId) {
		this.iId = iId;
	}
	public String getiAddr() {
		return iAddr;
	}
	public void setiAddr(String iAddr) {
		this.iAddr = iAddr;
	}
	public Boolean getiStatus() {
		return iStatus;
	}
	public void setiStatus(Boolean iStatus) {
		this.iStatus = iStatus;
	}
	public User getiSeller() {
		return iSeller;
	}
	public void setiSeller(User iSeller) {
		this.iSeller = iSeller;
	}
	public User getiCustomer() {
		return iCustomer;
	}
	public void setiCustomer(User iCustomer) {
		this.iCustomer = iCustomer;
	}
	public Good getiGood() {
		return iGood;
	}
	public void setiGood(Good iGood) {
		this.iGood = iGood;
	}
	@ManyToOne(targetEntity=User.class)
	@JoinColumn(name="s_uId",referencedColumnName="uId",nullable=false)
	private User iSeller;
	@ManyToOne(targetEntity=User.class)
	@JoinColumn(name="c_uId",referencedColumnName="uId",nullable=false)
	private User iCustomer;
	@OneToOne(targetEntity=Good.class,mappedBy="gOrder")
	private Good iGood;
	
}
