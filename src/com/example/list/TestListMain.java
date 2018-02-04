package com.example.list;

import java.util.Iterator;

import com.alibaba.fastjson.JSON;

public class TestListMain {

	public static void main(String[] args) {
		
		MyLinkedList<String> list = new MyLinkedList<String>();
		list.add("Hello");
		list.add("World");
		list.add(" !");
		list.add("Maria");
		
		Iterator<String> iterator = list.iterator();
		String val1 = iterator.next();
		String val2 = iterator.next();
		String val3 = iterator.next();
		System.out.println("Val1:" + val1 +"  Val3:" + val3);
		
		System.out.println(JSON.toJSONString(list));
		
		// 反转链表
		list.reverse();
		System.out.println(JSON.toJSONString(list));
	}

}
