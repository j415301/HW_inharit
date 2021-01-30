package com.kh.silsub2.point.model.vo;

import com.kh.silsub2.point.model.vo.Point;

public class Circle extends Point{
	
	private int radius;
	
	public Circle() {
		// TODO Auto-generated constructor stub
	}

	public Circle(int x, int y, int radius) {
		super(x, y);
		this.radius = radius;
	}
	
	@Override
	public void draw() {
		System.out.print("��ǥ: "+x+", "+y+"\t");
		System.out.printf("������: %.1f\t",Math.PI*radius*radius);
		System.out.printf("���ѷ�: %.1f\n",2*Math.PI*radius);
	}

}
