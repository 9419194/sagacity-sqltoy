/**
 *@Generated by sagacity-quickvo 4.0
 */
package com.sagframe.sqltoy.showcase.vo;

import org.sagacity.sqltoy.config.annotation.SqlToyEntity;
import java.math.BigDecimal;
import java.util.Date;
import com.sagframe.sqltoy.showcase.vo.base.AbstractTransInfoHisVO;

/**
 * @project sqltoy-showcase
 * @author zhongxuchen
 * @version 1.0.0
 * Table: sqltoy_trans_info_his,Remark:支付交易流水表 	
 */
@SqlToyEntity
public class TransInfoHisVO extends AbstractTransInfoHisVO {	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5797324460386774236L;
	
	/**
	 * 请绝对不要在此类中重复定义Abstract类中的对应表字段的属性,易导致属性失去@Column关联表字段的注解特征,无法正确生成相应的sql
	 * 如覆盖定义了属性C,原本生成 insert into tableName (A,B,C) values(?,?,?) 变成了 insert into tableName (A,B) values(?,?)
	 */
	 
	/** default constructor */
	public TransInfoHisVO() {
		super();
	}
	
	/*---begin-constructor-area---don't-update-this-area--*/
	/** pk constructor */
	public TransInfoHisVO(String transId)
	{
		this.transId=transId;
	}

	/** minimal constructor */
	public TransInfoHisVO(String transId,String transCode,String transChannel,BigDecimal amt,Integer status,String resultCode,Date transTime,Date transDate,String userId)
	{
		this.transId=transId;
		this.transCode=transCode;
		this.transChannel=transChannel;
		this.amt=amt;
		this.status=status;
		this.resultCode=resultCode;
		this.transTime=transTime;
		this.transDate=transDate;
		this.userId=userId;
	}

	/** full constructor */
	public TransInfoHisVO(String transId,String transCode,String transChannel,BigDecimal amt,Integer status,String resultCode,Date transTime,Date transDate,String userId,String cardNo)
	{
		this.transId=transId;
		this.transCode=transCode;
		this.transChannel=transChannel;
		this.amt=amt;
		this.status=status;
		this.resultCode=resultCode;
		this.transTime=transTime;
		this.transDate=transDate;
		this.userId=userId;
		this.cardNo=cardNo;
	}

	/*---end-constructor-area---don't-update-this-area--*/
	
	
	//请绝对不要在此类中重复定义Abstract类中的对应表字段的属性,易导致属性失去@Column关联表字段的注解特征,无法正确生成相应的sql
	//如覆盖定义了属性C,原本生成 insert into tableName (A,B,C) values(?,?,?) 变成了 insert into tableName (A,B) values(?,?)
	 
	/**
     *@todo vo columns to String
     */
	public String toString() {
		return super.toString();
	}
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#clone()
	 */
	public TransInfoHisVO clone() {
		try {
			// TODO Auto-generated method stub
			return (TransInfoHisVO) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return null;
	}
	
}