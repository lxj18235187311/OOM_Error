package com.atguigu.oom;


public class OOMTest {
	
	public static void main(String[] args) {
		stackOOMError(1);
	}
	
	public static void stackOOMError(int depth){
		depth ++;
		stackOOMError(depth);
	}
}
