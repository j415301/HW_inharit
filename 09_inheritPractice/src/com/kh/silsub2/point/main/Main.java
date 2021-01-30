package com.kh.silsub2.point.main;

import com.kh.silsub2.point.model.vo.Circle;
import com.kh.silsub2.point.model.vo.Point;
import com.kh.silsub2.point.model.vo.Rectangle;

public class Main {
	
	public static void main(String[] args) {
		
		Circle[] carr = new Circle[3];
		carr[0] = new Circle(5,4,2);
		carr[1] = new Circle(3,8,3);
		carr[2] = new Circle(5,8,2);
		
		Rectangle[] rarr = new Rectangle[3];
		rarr[0] = new Rectangle(4,8);
		rarr[1] = new Rectangle(5,3);
		rarr[2] = new Rectangle(6,5);
		
		System.out.println("==== Circle ====");
		for(int i=0 ; i<carr.length ; i++) {
			carr[i].draw();
		}
		System.out.println("==== Rectangle ====");
		for(int i=0 ; i<rarr.length ; i++) {
			rarr[i].draw();
		}
		System.out.println();
		
		
		//3
		Point[] parr = new Point[5];
		parr[0] = new Circle(6,7,3);
		parr[1] = new Circle(6,4,9);
		parr[2] = new Circle(3,7,8);
		parr[3] = new Rectangle(2,8);
		parr[4] = new Rectangle(5,8);
		for(int i=0 ; i<parr.length ; i++) {
			parr[i].draw();
		}
	}
}