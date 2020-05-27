package com.sid.com;

public class Array02 {
		private long arr[];
		
		public Array02(int size) {
			arr = new long[size];
		}
		public void setElement(int index,long value) {
			arr[index] = value;
		}
		public long getElement(int index) {
			return arr[index];
		}
}
