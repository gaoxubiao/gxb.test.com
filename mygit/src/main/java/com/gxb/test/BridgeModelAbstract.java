package com.gxb.test;

public abstract class BridgeModelAbstract {
	private BridgeInterface bridge;

	public void bridgeModelTest(){
		bridge.bridgeModelTest();
	}
	public BridgeInterface getBridge() {
		return bridge;
	}
	public void setBridge(BridgeInterface bridge) {
		this.bridge = bridge;
	}

	
	
	

}
