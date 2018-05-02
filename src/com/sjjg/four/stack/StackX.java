package com.sjjg.four.stack;

public class StackX {
	
	private int maxSize;
	private long[] stackArray;
	private int top;
	
	public StackX(int s){
		maxSize = s ;
		stackArray = new long [maxSize];
		top=-1;
	}
	//压栈
	public void push(long j){
		
		stackArray[++top]=j;
	}
	//弹栈
	public long pop(){
		
		return stackArray[top--];
	}
	//是否为空
	public boolean isEmpty(){
		
		return (top==-1);
	}
	//是否达到上限
	public boolean isFull(){
		
		return (top == maxSize-1);
	}
	
}
