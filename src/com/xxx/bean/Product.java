package com.xxx.bean;

/**
 * @author yuan
 *
 * @date 2016年1月20日 下午5:42:23
 */
public class Product {
	
	private long productId;
	private int NumberOfSteps;		//织衣服所需要的工序数，为了统计在不同的机器上的完成时间
	private String definition;
	
	
	/**
	 * @param productId
	 */
	public Product(long productId) {
		super();
		this.productId = productId;
	}

	
	/**
	 * @param productId
	 * @param numberOfSteps
	 * @param definition
	 */
	public Product(long productId, int numberOfSteps, String definition) {
		super();
		this.productId = productId;
		this.NumberOfSteps = numberOfSteps;
		this.definition = definition;
	}




	/**
	 * @return the productId
	 */
	public long getProductId() {
		return productId;
	}

	/**
	 * @return the numberOfSteps
	 */
	public int getNumberOfSteps() {
		return NumberOfSteps;
	}

	/**
	 * @param numberOfSteps the numberOfSteps to set
	 */
	public void setNumberOfSteps(int numberOfSteps) {
		this.NumberOfSteps = numberOfSteps;
	}

	/**
	 * @return the definition
	 */
	public String getDefinition() {
		return definition;
	}

	/**
	 * @param definition the definition to set
	 */
	public void setDefinition(String definition) {
		this.definition = definition;
	}
	
	
}
