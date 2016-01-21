package com.xxx.bean;

/**
 * @author yuan
 *
 * @date 2016年1月20日 下午5:42:23
 */
public class Product {
	
	private long productId;
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
	 * @param definition
	 */
	public Product(long productId, String definition) {
		super();
		this.productId = productId;
		this.definition = definition;
	}

	
	/**
	 * @return the productId
	 */
	public long getProductId() {
		return productId;
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
