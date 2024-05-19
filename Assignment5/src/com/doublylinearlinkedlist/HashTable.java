package com.doublylinearlinkedlist;

import java.util.LinkedList;
import java.util.List;

public class HashTable {
	public class Entry {
		private String key;
		private String value;
		int count;

		public Entry(String key, String value) {
			this.key = key;
			this.value = value;
			count=1;
		}

		public String getKey() {
			return key;
		}

		public String getValue() {
			return value;
		}

		public void setValue(String value) {
			this.value = value;
		}
	}

	private int SIZE;
	private List<Entry>[] arr;
	

	public HashTable(int size) {
		SIZE = size;
		arr = new List[SIZE];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = new LinkedList<>();
		}
	}

	public int h(String key) {
		int result = 0;
		for (int i = 0; i < key.length(); i++) {
			result += key.charAt(i);
		}
		return result % SIZE;
	}

	public void put(String key, String value) {
		int slot = h(key);
		List<Entry> bucket = arr[slot];
		for (Entry e : bucket) {
			if (e.getKey().equals(key)) {
				e.setValue(value);
					e.count++;
				return;
			}
		}
		Entry e = new Entry(key, value);
		bucket.add(e);
	}

	public String get(String key) {
		int slot = h(key);
		List<Entry> bucket = arr[slot];
		for (Entry e : bucket) {
			if (e.getKey().equals(key)) {
				return e.getValue();
			}
		}
		return null;
	}
	public int getOccurance(String key) {
		int slot = h(key);
		List<Entry> bucket = arr[slot];
		for (Entry e : bucket) {
			if (e.getKey().equals(key)) {
				return e.count;
			}
		}
		return -1;
	}
}
