package com.xxx.util;

import com.xxx.util.ReadXml;

/**
 * @author yuan
 *
 * @date 2016年1月21日 上午10:16:14
 */
public class ValueOfConfigureFile {
	
	//get Time info from TimeInfo.xml
	private int windownSize = Integer.valueOf(ReadXml.readname("config/TimeInfo.xml", "windowsize"));
	private int TimeSize = Integer.valueOf(ReadXml.readname("config/TimeInfo.xml", "size"));
	
	
	//get Order info from OrderInfo.xml
	private String orderGenRule = ReadXml.readname("config/OrderInfo.xml", "rule");
	private int ordersPerWin = Integer.valueOf(ReadXml.readname("config/OrderInfo.xml", "amountofwin"));
	private int orderGenErr = Integer.valueOf(ReadXml.readname("config/OrderInfo.xml", "err"));
	
	
	//get Time info from ProductInfo.xml
	private int productCategory = Integer.valueOf(ReadXml.readname("config/ProductInfo.xml", "windowsize"));

	
	
	/**
	 * @return the windownSize
	 */
	public int getWindownSize() {
		return windownSize;
	}
	
	/**
	 * @return the timeSize
	 */
	public int getTimeSize() {
		return TimeSize;
	}
	
	/**
	 * @return the orderGenRule
	 */
	public String getOrderGenRule() {
		return orderGenRule;
	}
	
	/**
	 * @return the ordersPerWin
	 */
	public int getOrdersPerWin() {
		return ordersPerWin;
	}
	
	/**
	 * @return the orderGenErr
	 */
	public int getOrderGenErr() {
		return orderGenErr;
	}

	/**
	 * @return the productCategory
	 */
	public int getProductCategory() {
		return productCategory;
	}
	
}
