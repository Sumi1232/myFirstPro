package com.ust.app;

import com.ust.beans.SalesData;

public class Main {
    public static void main(String[] args){
	
	SalesData salesdata=new SalesData();
	System.out.println("Welcome To Sales App");
	displayGreeting();
	salesdata.display();
    }
    public static void displayGreeting(){
    	System.out.println("displaying sales");
    }
     
	
}
