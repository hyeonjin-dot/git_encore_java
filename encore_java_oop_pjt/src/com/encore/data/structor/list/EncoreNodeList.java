package com.encore.data.structor.list;

public class EncoreNodeList {

	private EncoreNode head;
	
	public EncoreNodeList(int data) {
		this.head = new EncoreNode(data);
	}
	
	public void add(int data) {
		if (this.head == null) {
			//연결 리스트의 헤더가 생성되지 않은 상태
			this.head = new EncoreNode(data);
		}else {
			//노드가 생성된 상태
			//연결되어지는 노드를 생성
			EncoreNode node = this.head;
			while (node.getNode() != null) {
				node = node.getNode(); // 다음 노드로 넘어감 -> 빈 노드가 나오면 break
			}
			node.setNode(new EncoreNode(data));
		}
	}
	
	public void desc() {
		EncoreNode node = this.head;
		while (node != null) {
			System.out.println("debug >> " + node.getData());
			node = node.getNode();
		}
	}
	
	public void remove(int data) {
		EncoreNode bNode = this.head; //before
		EncoreNode node = null; 
		EncoreNode nNode = null; //next
		
		if (this.head.getData() == data) {
			bNode = this.head;
			this.head = this.head.getNode();
			bNode = null; // 메모리 해제
		}else {	
			while (bNode != null) {
				node = bNode.getNode();
				if (node != null && node.getData() == data) {
					nNode = node.getNode();
					EncoreNode tmp = node;
					bNode.setNode(nNode);
					tmp = null; // 메모리 해제
					break;
				}
				bNode = bNode.getNode();
			}
		}
	}
	
}
