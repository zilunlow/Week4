package SemuaCircle.CircleKecil;//create package .Package must put on first statement
//java.sun.com --> package com.sun.java
//package my.edu.utem.ftmk

public class Circle{

	//field or attribute
	private double jejari,x;

	public static int billObject=0;//static field or attribute

	 //Default constructor
	public Circle(){//this constructor dont need create if user just call default constructor only and dont have any overloading constructor
					//if have overloading constructor we need to manually create default constructor
		jejari=1;
		x=5;
		billObject++;
	}

	//Overloading constructor
	public Circle(double jejari){
		//this();//must be first statement in constructor . Execute default constructor for this class -> Circle()
		//this(jejari,56);//also call constructor for two parameter
		this.jejari=jejari;
		x=5;
		
		billObject++;
	}

	//Overloading constructor with 2 parameter
	public Circle(double jejari,double x){
		this.jejari=jejari;
		this.x=x;
		billObject++;
	}

	//Overload method toString()//when we sysout directly an object it will execute this function
	public String toString(){
		String tentangCircle;
		tentangCircle="Bil objek ialah "+billObject;
		// tentangCircle= "Jejari = "+jejari+
		// 				"\nx = "+x
		// 				+" \nLuas adalah "+KiraLuas();

		return tentangCircle;
	}

	//setter or mutator
	public void setJejari(double jejari){
		//System.out.println(this.jejari);//if we didn't put this. it will take the parameter jejari 
		this.jejari=jejari;

	}

	
	//gettor or accessor
	public double getJejari(){
		return jejari;
	}

	

	public double KiraLuas(){

		return getJejari()*getJejari()*Math.PI;

	}

	public static double UkurLilit(double j){
		return 2*Math.PI*j;//2PI*r circumference
	}

}

