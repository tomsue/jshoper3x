package com.jshop.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the function_m database table.
 * 
 */
@Entity
@Table(name="function_m")
@NamedQuery(name="FunctionM.findAll", query="SELECT f FROM FunctionM f")
public class FunctionM implements Serializable {
	private static final long serialVersionUID = 1L;
	private String id;
	private Date createtime;
	private String functionname;
	private String moduleid;
	private String visitmethodname;
	private String visitpagesourceids;
	private String visiturl;

	public FunctionM() {
	}


	@Id
	@Column(unique=true, nullable=false, length=20)
	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}


	@Temporal(TemporalType.TIMESTAMP)
	@Column(nullable=false)
	public Date getCreatetime() {
		return this.createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}


	@Column(nullable=false, length=100)
	public String getFunctionname() {
		return this.functionname;
	}

	public void setFunctionname(String functionname) {
		this.functionname = functionname;
	}


	@Column(nullable=false, length=20)
	public String getModuleid() {
		return this.moduleid;
	}

	public void setModuleid(String moduleid) {
		this.moduleid = moduleid;
	}


	@Column(nullable=false, length=100)
	public String getVisitmethodname() {
		return this.visitmethodname;
	}

	public void setVisitmethodname(String visitmethodname) {
		this.visitmethodname = visitmethodname;
	}


	@Column(nullable=false, length=200)
	public String getVisitpagesourceids() {
		return this.visitpagesourceids;
	}

	public void setVisitpagesourceids(String visitpagesourceids) {
		this.visitpagesourceids = visitpagesourceids;
	}


	@Column(nullable=false, length=225)
	public String getVisiturl() {
		return this.visiturl;
	}

	public void setVisiturl(String visiturl) {
		this.visiturl = visiturl;
	}

}