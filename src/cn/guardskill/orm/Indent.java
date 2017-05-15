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
	private String iAdd;
	private Boolean iStatus;
	
	@ManyToOne(targetEntity=User.class)
	@JoinColumn(name="iSeller_n",referencedColumnName="uName",nullable=false)
	private User iSeller;
	@ManyToOne(targetEntity=User.class)
	@JoinColumn(name="iCustomer_n",referencedColumnName="uName",nullable=false)
	private User iCustomer;
	@OneToOne(targetEntity=Good.class,mappedBy="gOrder")
	
	private Good iGood;
	public Integer getiId() {
		return iId;
	}
	public void setiId(Integer iId) {
		this.iId = iId;
	}
	public String getiAdd() {
		return iAdd;
	}
	public void setiAdd(String iAdd) {
		this.iAdd = iAdd;
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
	
	
	

}
