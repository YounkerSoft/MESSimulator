package com.xxx.bean;

/**
 * @author yuan
 *
 * @date 2016年1月20日 下午5:42:40
 */
public class Machine {
	
	private long machineId;
	private int status;					//run, wait, error	==	0, 1, 2
	private String component;
	
	
	/**
	 * @param machineId
	 */
	public Machine(long machineId) {
		super();
		this.machineId = machineId;
	}

	/**
	 * @param machineId
	 * @param status
	 * @param component
	 */
	public Machine(long machineId, int status, String component) {
		super();
		this.machineId = machineId;
		this.status = status;
		this.component = component;
	}
	

	/**
	 * @return the machineId
	 */
	public long getMachineId() {
		return machineId;
	}

	/**
	 * @return the status
	 */
	public int getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(int status) {
		this.status = status;
	}

	/**
	 * @return the component
	 */
	public String getComponent() {
		return component;
	}

	/**
	 * @param component the component to set
	 */
	public void setComponent(String component) {
		this.component = component;
	}
	
	
}
