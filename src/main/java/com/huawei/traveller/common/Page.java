package com.huawei.traveller.common;

import java.util.List;

public class Page <T> {
	// 每页显示条数（预先定义）
	private int pageSize = 10;
	// 页面上显示的记录
	private List<T> records;
	// 与页面有关
	private int currentPageNum;
	private int totalPageNum;
	private int prePageNum;
	private int nextPageNum;

	// 与数据库有关
	private int totalRecordsNum;
	private int startIndex;

	// 实例一个页面时，需要拿到当前页码和总记录条数
	public Page(int currentPageNum, int totalRecordsNum) {
		this.currentPageNum = currentPageNum;
		this.totalRecordsNum = totalRecordsNum;
		// 计算totalPageNum
		totalPageNum = totalRecordsNum % pageSize == 0 ? totalRecordsNum / pageSize : (totalRecordsNum / pageSize + 1);
		// 计算startIndex
		startIndex = (currentPageNum - 1) * pageSize;
	}

	public int getPrePageNum() {
		prePageNum = currentPageNum - 1;
		if (prePageNum < 1) {
			prePageNum = 1;
		}
		return prePageNum;
	}

	public int getNextPageNum() {
		nextPageNum = currentPageNum + 1;
		if (nextPageNum > totalPageNum) {
			nextPageNum = totalPageNum;
		}
		return nextPageNum;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public List<T> getRecords() {
		return records;
	}

	public void setRecords(List<T> records) {
		this.records = records;
	}

	public int getCurrentPageNum() {
		return currentPageNum;
	}

	public void setCurrentPageNum(int currentPageNum) {
		this.currentPageNum = currentPageNum;
	}

	public int getTotalPageNum() {
		return totalPageNum;
	}

	public void setTotalPageNum(int totalPageNum) {
		this.totalPageNum = totalPageNum;
	}

	public int getTotalRecordsNum() {
		return totalRecordsNum;
	}

	public void setTotalRecordsNum(int totalRecordsNum) {
		this.totalRecordsNum = totalRecordsNum;
	}

	public int getStartIndex() {
		return startIndex;
	}

	public void setStartIndex(int startIndex) {
		this.startIndex = startIndex;
	}

	public void setPrePageNum(int prePageNum) {
		this.prePageNum = prePageNum;
	}

	public void setNextPageNum(int nextPageNum) {
		this.nextPageNum = nextPageNum;
	}

}