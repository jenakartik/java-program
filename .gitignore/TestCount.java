package com.simple;

import java.util.ArrayList;

public class TestCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> a=new ArrayList<Integer>(100);
		for(int i=1;i<=100;i++)
			a.add(i);
		//System.out.print("Answer is :"+a.size());
		for(int i=0;a.size()!=1;i++)
		{
			if(a.size()<i+1)
				i=0;
			//System.out.print("Answer is :"+a.size());
			if(a.size()==i+1)
				i=-1;
			//System.out.print("Answer is :"+a.size());
			a.remove(i+1);
			//System.out.print("Answer is :"+a.size());
		}
		System.out.print("Answer is : "+a.get(0));

	}

}
