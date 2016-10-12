package com.atguigu.oom;

import java.util.ArrayList;
import java.util.List;
//常量池内存溢出
public class ConstantPoolOOM {
	
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		
		int i = 0;
		while(true){
			list.add(String.valueOf(i++).intern());
		}
	}
	
}
