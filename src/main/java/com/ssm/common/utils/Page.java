package com.ssm.common.utils;

import java.util.List;

public class Page<T>{ //也可以不设置占位符<T>，，直接在List<>中设置List<Customer> rows; 因为Page是公用的所以设置占位符T
//    总条数
	private int total;
//    当前页
	private int page;
//	每页的条数
	private int size;
//	查询到的所有Charcter对象结果
    private List<T> rows;
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public List<T> getRows() {
		return rows;
	}
	public void setRows(List<T> rows) {
		this.rows = rows;
	}
    
	
    
}
