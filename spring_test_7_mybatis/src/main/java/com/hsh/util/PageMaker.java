package com.hsh.util;

import java.util.HashMap;

public class PageMaker {
	private int startNum;
	private int lastNum;
	private int curBlock;
	private int totalBlock;
	
	public void setMember(HashMap<String, Integer> hs){
		int totalPage = sum(hs.get("totalList"), hs.get("perPage"));
		totalBlock = sum(totalPage, hs.get("perPage"));
		curBlock = sum(hs.get("curPage"), hs.get("perPage"));
		startNum = hs.get("start");/*(curBlock - 1) * hs.get("perPage") + 1;*/
		lastNum = hs.get("last");/*curBlock * hs.get("perPage");*/
		if(curBlock == totalBlock){
			lastNum = totalPage;
		}
	}
	private int sum(int num1, int num2) {
		int result = 0;
		if (num1 % num2 == 0) {
			result = num1 / num2;
		} else {
			result = num1 / num2 + 1;
		}
		return result;
	}
	
	public int getStartNum() {
		return startNum;
	}
	public void setStartNum(int startNum) {
		this.startNum = startNum;
	}
	public int getLastNum() {
		return lastNum;
	}
	public void setLastNum(int lastNum) {
		this.lastNum = lastNum;
	}
	public int getCurBlock() {
		return curBlock;
	}
	public void setCurBlock(int curBlock) {
		this.curBlock = curBlock;
	}
	public int getTotalBlock() {
		return totalBlock;
	}
	public void setTotalBlock(int totalBlock) {
		this.totalBlock = totalBlock;
	}
}
