package com.LinearDS;

import java.util.Arrays;

class ArrayDS<T> {
	private Object[] data;
	private static int DEFAULT_SIZE = 10;
	private int size = 0;

	public ArrayDS() {
		data = new Object[DEFAULT_SIZE];
	}

	public void add(T num) {
		if (isFull()) {
			resize();
		}
		data[size++] = num;
	}

	public boolean isFull() {
		return size == data.length;
	}

	private void resize() {
		Object[] temp = new Object[data.length * 2];
		int i = 0;
		for (Object num : data) {
			temp[i++] = num;
		}

		data = temp;
	}

	public T remove() {
		@SuppressWarnings("unchecked")
		T removed = (T) data[--size];
		data[size]= null;
		return removed;
	}

	@SuppressWarnings("unchecked")
	public T getIndex(int index) {
		return (T) data[index];
	}

	public void setAtIndex(int index, T value) {
		data[index] = value;
		size++;
	}

	public int getSize() {
		return size;
	}

	public Object[] getData() {
		return data;
	}

	public static int getDEFAULT_SIZE() {
		return DEFAULT_SIZE;
	}

	@Override
	public String toString() {
		return "ArrayDS [data=" + Arrays.toString(data) + ", size=" + size + "]";
	}

}
