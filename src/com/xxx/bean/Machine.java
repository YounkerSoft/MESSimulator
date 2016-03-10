package com.xxx.bean;

/**
 * @author yuan
 *
 * @date 2016年1月20日 下午5:42:40
 */
public class Machine {
	
	private long machineId;
	private String machineModel;		//机器型号
	private int status;					//run, wait, error	==	0, 1, 2
	private int Throughput;				//每秒钟能完成的工序数
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
	 * @param throughput
	 * @param component
	 */
	public Machine(long machineId, int status, int throughput, String component) {
		super();
		this.machineId = machineId;
		this.status = status;
		this.Throughput = throughput;
		this.component = component;
	}

	/**
	 * @param machineId
	 * @param machineModel
	 * @param status
	 * @param throughput
	 * @param component
	 */
	public Machine(long machineId, String machineModel, int status,
			int throughput, String component) {
		super();
		this.machineId = machineId;
		this.machineModel = machineModel;
		this.status = status;
		Throughput = throughput;
		this.component = component;
	}

	/**
	 * @return the machineId
	 */
	public long getMachineId() {
		return machineId;
	}

	/**
	 * @return the machineModel
	 */
	public String getMachineModel() {
		return machineModel;
	}

	/**
	 * @param machineModel the machineModel to set
	 */
	public void setMachineModel(String machineModel) {
		this.machineModel = machineModel;
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
	 * @return the throughput
	 */
	public int getThroughput() {
		return Throughput;
	}

	/**
	 * @param throughput the throughput to set
	 */
	public void setThroughput(int throughput) {
		this.Throughput = throughput;
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
