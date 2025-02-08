package com.springcore.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {
	
	@Value("#{44+66}")
	private int x;
	
	@Value("#{25+25}")
	private int y;
	
	@Value("#{T(java.lang.Math).sqrt(144)}")    //static method
	private double z;
	
	@Value("#{T(java.lang.Math).E}")            // static variable
	private double e;
	
	@Value("#{T(java.lang.Math).PI}")
	private double pi;

	@Value("#{new String('Pranav Mahajan')}")    //expression object
	private String name;
	
	@Value("#{6+2>5}")
	private boolean isActive;
	

	public int getX() {
		return x;
	}



	public void setX(int x) {
		this.x = x;
	}



	public int getY() {
		return y;
	}



	public void setY(int y) {
		this.y = y;
	}



	public double getZ() {
		return z;
	}



	public void setZ(double z) {
		this.z = z;
	}



	public double getE() {
		return e;
	}



	public void setE(double e) {
		this.e = e;
	}



	public double getPi() {
		return pi;
	}



	public void setPi(double pi) {
		this.pi = pi;
	}



	@Override
	public String toString() {
		return "Demo [x=" + x + ", y=" + y + ", z=" + z + ", e=" + e + ", pi=" + pi + ", name=" + name + ", isActive="
				+ isActive + "]";
	}

	


}
