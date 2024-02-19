package com.encore.data.structor.list;

public class EncoreNode {
	
	private int data;
	private EncoreNode node;
	
	public EncoreNode(int data) {
		this.data = data;
	}
	
	public int getData() {
		return this.data;
	}
	
	public void setNode(EncoreNode node) {
		this.node = node;
	}
	
	public EncoreNode getNode() {
		return this.node;
	}
	
}
