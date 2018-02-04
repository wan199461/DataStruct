package com.example.list;

import java.util.Iterator;

public class MyLinkedList<T> implements MyList<T>{
	
	/**
	 * 头节点
	 */
	private Node<T> head;
	
	
	public MyLinkedList(){
		Init();   // 生成一个头节点
	}
	
	/**
	 * 初始化
	 */
	private void Init() {
		head = new Node<T>();
		head.setNex(null);
		head.setData(null);
	}
	
	/*
	 * 找到尾节点
	 */
	public Node<T> findEnd(){
		if(head == null ) {
			return null;
		}
		Node<T> tem = head;
		while(tem.getNex() != null) {
			 tem = tem.getNex();
		}
		return tem;
	}

	@Override
	public void add(T data) {
		Node<T> endNode = findEnd();
		Node<T> node = new Node<T>(data);
		endNode.setNex(node);
	}
	
	/**
	 * 找打第index个
	 * @param index
	 */
	public void findIndex(int index) {
		
	}
	
	/**
	 * 反转单链表
	 */
	public void reverse() {
		Node<T> newhead = null;    // 新头节点（该头节点也包含值）要反转节点的前驱
		Node<T> now = head.getNex();    // 开始反转的节点
		while(now != null) {
			Node<T> nex = now.getNex();   // 要反装节点的下一个节点
			now.setNex(newhead);              // 当前节点指向新头
			newhead = now;                //反装之后新头移动
			now = nex;
		}
		head.setNex(newhead);     // 头节点指向新的头
	}

	@Override
	public Iterator<T> iterator() {
		
		return new MyIterator<T>(head);
	}
	
	
	private class MyIterator<T> implements Iterator<T>{
		private Node<T> recoder = null;

		MyIterator(Node<T> head) {
			recoder = head;
		}
		
		@Override
		public boolean hasNext() {
			if(recoder == null || recoder.getNex() != null) {
				return true;
			}
			return false;
		}

		@Override
		public T next() {
			if(recoder == null || recoder.getNex() == null) {  // 防止产生空指针错误
				return null;
			}
			recoder = recoder.getNex();
			return recoder.getData();
		}
		
	}

}
