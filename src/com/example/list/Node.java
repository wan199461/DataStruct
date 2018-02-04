package com.example.list;

public class Node<T>{
	
	private T data;
	   
	private Node<T> nex;
	
	Node(){
		this.data = null;
		this.nex = null;
	}
	
	Node(T data){
		this.data = data;
		this.nex = null;
	}
	
	Node(T data, Node<T> node){
		this.data = data;
		this.nex = node;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public Node<T> getNex() {
		return nex;
	}

	public void setNex(Node<T> nex) {
		this.nex = nex;
	}
	
}
