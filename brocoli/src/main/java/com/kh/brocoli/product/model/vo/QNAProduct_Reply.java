package com.kh.brocoli.product.model.vo;

import java.sql.Date;

public class QNAProduct_Reply {
	private String pqr_ParentNo;
	private String pqr_Writer;
	private String pqr_Id;
	private String pqr_Code;
	private String pqr_Content;
	private Date pqr_Date;
	private Date pqr_Modify_Date;
	private String pqr_Count;
	private String pqr_Check;
	private int pqr_Mno;
	
	public QNAProduct_Reply() {
		super();
	}

	public QNAProduct_Reply(String pqr_ParentNo, String pqr_Writer, String pqr_Id, String pqr_Code,
			String pqr_Content, Date pqr_Date, Date pqr_Modify_Date, String pqr_Count, String pqr_Check, int pqr_Mno) {
		super();
		this.pqr_ParentNo = pqr_ParentNo;
		this.pqr_Writer = pqr_Writer;
		this.pqr_Id = pqr_Id;
		this.pqr_Code = pqr_Code;
		this.pqr_Content = pqr_Content;
		this.pqr_Date = pqr_Date;
		this.pqr_Modify_Date = pqr_Modify_Date;
		this.pqr_Count = pqr_Count;
		this.pqr_Check = pqr_Check;
		this.pqr_Mno = pqr_Mno;
	}


	public String getPqr_ParentNo() {
		return pqr_ParentNo;
	}

	public void setPqr_ParentNo(String pqr_ParentNo) {
		this.pqr_ParentNo = pqr_ParentNo;
	}

	public String getPqr_Writer() {
		return pqr_Writer;
	}

	public void setPqr_Writer(String pqr_Writer) {
		this.pqr_Writer = pqr_Writer;
	}

	public String getPqr_Id() {
		return pqr_Id;
	}

	public void setPqr_Id(String pqr_Id) {
		this.pqr_Id = pqr_Id;
	}

	public String getPqr_Code() {
		return pqr_Code;
	}

	public void setPqr_Code(String pqr_Code) {
		this.pqr_Code = pqr_Code;
	}

	public String getPqr_Content() {
		return pqr_Content;
	}

	public void setPqr_Content(String pqr_Content) {
		this.pqr_Content = pqr_Content;
	}

	public Date getPqr_Date() {
		return pqr_Date;
	}

	public void setPqr_Date(Date pqr_Date) {
		this.pqr_Date = pqr_Date;
	}

	public Date getPqr_Modify_Date() {
		return pqr_Modify_Date;
	}

	public void setPqr_Modify_Date(Date pqr_Modify_Date) {
		this.pqr_Modify_Date = pqr_Modify_Date;
	}

	public String getPqr_Count() {
		return pqr_Count;
	}

	public void setPqr_Count(String pqr_Count) {
		this.pqr_Count = pqr_Count;
	}

	public String getPqr_Check() {
		return pqr_Check;
	}

	public void setPqr_Check(String pqr_Check) {
		this.pqr_Check = pqr_Check;
	}

	public int getPqr_Mno() {
		return pqr_Mno;
	}

	public void setPqr_Mno(int pqr_Mno) {
		this.pqr_Mno = pqr_Mno;
	}

	@Override
	public String toString() {
		return "QNAProduct_Reply [pqr_ParentNo=" + pqr_ParentNo + ", pqr_Writer=" + pqr_Writer
				+ ", pqr_Id=" + pqr_Id + ", pqr_Code=" + pqr_Code + ", pqr_Content=" + pqr_Content + ", pqr_Date="
				+ pqr_Date + ", pqr_Modify_Date=" + pqr_Modify_Date + ", pqr_Count=" + pqr_Count + ", pqr_Check="
				+ pqr_Check + ", pqr_Mno=" + pqr_Mno + "]";
	}
	
	
	
	
}
