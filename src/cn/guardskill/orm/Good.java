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
@Table(name="good")
public class Good {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)  //generate type£¬auto+1
	private Integer gId;
	private String gTitle;
	private String gDesc;
	private double gPrice;
	private Boolean gStatus;
	
	@ManyToOne(targetEntity=User.class)
	@JoinColumn(name="gBuilder_n",referencedColumnName="uName",nullable=false) 

	//join Column "gBuilder_n" to table "good" & link 'uName" to "gBuilder_n"   
	private User gBuilder;
	
	@OneToOne(targetEntity=Indent.class)
	@JoinColumn(name="iId",referencedColumnName="iId",unique=true,nullable=true)
	private Indent gOrder;

	
	
	public Integer getgId() {
		return gId;
	}

	public void setgId(Integer gId) {
		this.gId = gId;
	}

	public String getgTitle() {
		return gTitle;
	}

	public void setgTitle(String gTitle) {
		this.gTitle = gTitle;
	}

	public String getgDesc() {
		return gDesc;
	}

	public void setgDesc(String gDesc) {
		this.gDesc = gDesc;
	}

	public double getgPrice() {
		return gPrice;
	}

	public void setgPrice(double gPrice) {
		this.gPrice = gPrice;
	}

	public Boolean getgStatus() {
		return gStatus;
	}

	public void setgStatus(Boolean gStatus) {
		this.gStatus = gStatus;
	}

	public User getgBuilder() {
		return gBuilder;
	}

	public void setgBuilder(User gBuilder) {
		this.gBuilder = gBuilder;
	}

	public Indent getgOrder() {
		return gOrder;
	}

	public void setgOrder(Indent gOrder) {
		this.gOrder = gOrder;
	}
	

	
}
