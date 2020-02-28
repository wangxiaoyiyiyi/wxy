package com.array;

public class Array {
	
	private int[] data;
	private int size;
	
	public Array(int capacity) {
		data = new int[capacity];
		size = 0;
	}

	public Array() {
		this(10);
	}
	
	public int size() {
		return size;
	}
	
	public int catatory() {
		return data.length;
	}
	public static void main(String[] args) {
		//leng();
	}

	public boolean isEmpty() {
		return size == 0;
	}
	
	public void add(int e) {
		data[size]=e;
		size++;  //这两句等同于data[size++]=e,size总是指向最后一个元素的下一格
	}
	public static void leng() {
		int[] arr = new int[10];
		int size = arr.length;
		System.out.println(size);//输出得是10
	}
	
}
