package com.jz.first.demo;

import java.util.*;

public class ArrayDemo {
	public static void main(String[] args) {
		int[] a = new int[10];
		if (a instanceof int[]) {
			System.out.println("111" + ((int[]) a).getClass().getName());
		}
		String[] strings = new String[5];
		Object[] objects = strings;
		System.out.println("222" + objects.getClass().getSuperclass().getName());
		a.clone();
		Math.abs(100);
		List<String> arrayList = new ArrayList<>();
		List<String> linkedList = new LinkedList<>();
		for (int i = 0; i < 1000000; i++) {
			linkedList.add("" + i + "");
			arrayList.add("" + i + "");
		}

		long start1 = new Date().getTime();
		System.out.println(start1);
		for (String str : arrayList) {

		}
		System.out.println("arrayList时间:" + (new Date().getTime() - start1));
		long start = new Date().getTime();
		System.out.println(start);
		for (String str : linkedList) {

		}
		System.out.println("linkedList时间:" + (new Date().getTime() - start));
		Set<String> hashSet = new HashSet<>();
		Set<String> linkedSet = new LinkedHashSet<>();

		Map<String, Object> map = new HashMap<>();
		map.put("1","q");
		Stack stack = new Stack();
	}

	@Override
	public int hashCode() {
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}
}
