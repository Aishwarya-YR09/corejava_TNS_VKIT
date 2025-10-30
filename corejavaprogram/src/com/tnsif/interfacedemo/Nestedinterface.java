package com.tnsif.interfacedemo;

import com.tnsif.interfacedemo.Myinterface.Myinnerinterface;

public class Nestedinterface implements Myinterface.Myinnerinterface{

	@Override
	public void print() {
		System.out.println("inner interface");
	}
	
	public static void main(String[] args) {
		Nestedinterface n=new Nestedinterface();
		n.print();
	System.out.println(Myinnerinterface.id);	
	}
}

