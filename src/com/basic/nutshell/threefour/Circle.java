package com.basic.nutshell.threefour;

public class Circle {
public static final double PI = 3.14159; // 常量
// 实例字段，保存圆的半径
protected double r;
// 构造方法：初始化r字段
public Circle(double r) {
	this.r = r;
}
// 实例方法：基于半径计算得到值
public double circumference() { return 2 * PI * r; }
public double area() { return PI * r*r; }
public double radius() { return r; }
}
