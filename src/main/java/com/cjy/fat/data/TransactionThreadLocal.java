package com.cjy.fat.data;

public class TransactionThreadLocal {
	
	/**
	 * 根txKey
	 */
	private String rootTxKey;
	
	/**
	 * serviceId,服务标识
	 */
	private String serviceId ;
	
	private TransactionResolveParam txParam;

	public String getRootTxKey() {
		return rootTxKey;
	}

	public void setRootTxKey(String rootTxKey) {
		this.rootTxKey = rootTxKey;
	}

	public String getServiceId() {
		return serviceId;
	}

	public void setServiceId(String serviceId) {
		this.serviceId = serviceId;
	}
	
	public TransactionResolveParam getTxParam() {
		return txParam;
	}
	
	public void setTxParam(TransactionResolveParam txParam) {
		this.txParam = txParam;
	}
	
}
