package com.sjjg.three;

import org.junit.Test;

public class px {
	

	//冒泡排序

	public void mppx() {
		
		int [] px = {1,5,6,8,9,7,8,1};
		for(int i=0;i<px.length-1;i++){
			for(int j=0;j<px.length-i-1;j++){
				if(px[j]>px[j+1]){
					int temp = px[j];
					px[j]=px[j+1];
					px[j+1]=temp;
				}
				
			}
		}
		
		for(int s : px){
			System.out.println(s);
		}

	}
	//选择排序

	public void xzpx(){
		int [] px = {14,5,1,6,10,9,11,8,1};
		for(int i=0;i<px.length-1;i++){
			int zb =i;
			for(int j=i+1;j<px.length;j++){
				if(px[zb]>px[j]){
					//更新最小值坐标
					 zb = j;
				}
			}
			//交换
			if(zb!=i){
				int temp = px[zb];
				px[zb]=px[i];
				px[i]=temp;
			}

		}
		for(int s : px){
			System.out.println(s);
		}
	}
	

	public void crpx(){
		int [] px = {14,1,3};
		int in,out;
		for( out=0;out<px.length;out++){
			int temp = px[out];
			in = out;
			while(in>0&&px[in-1]>=temp){
				px[in] = px[in-1];
				--in;
			}
			px[in]=temp;
		}
		for(int s : px){
			System.out.println(s);
		}
	}
	

}
