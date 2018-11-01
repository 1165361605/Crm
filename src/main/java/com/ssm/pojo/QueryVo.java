package com.ssm.pojo;

public class QueryVo {
	/*
	*点查询时使用
	* */
	//用户名
	private String username;
	//性别
	private String usergender;
	/*
	 *点页数时使用
	 * */
	//当前页
	private Integer page;
	//每页数
	private Integer size = 10;
	//开始行
	private Integer startRow = 0;//默认从0开始

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getUsergender() {
		return usergender;
	}

	public void setUsergender(String usergender) {
		this.usergender = usergender;
	}

	public Integer getPage() {
		return page;
	}

	public void setPage(Integer page) {
		this.page = page;
	}

	public Integer getSize() {
		return size;
	}

	public void setSize(Integer size) {
		this.size = size;
	}

	public Integer getStartRow() {
		return startRow;
	}

	public void setStartRow(Integer startRow) {
		this.startRow = startRow;
	}
}
