package com.basic.nutshell.threefour;

public class PlaneCircle extends Circle {
// 自动继承了Circle类的字段和方法，
// 因此只要在这里编写新代码
// 新实例字段，存储圆心的位置
	private final double cx, cy;
	// 新构造方法，用于初始化新字段
	// 使用特殊的句法调用构造方法Circle()
	public PlaneCircle(double r, double x, double y) {
		super(r); // 调用超类的构造方法Circle()
		this.cx = x; // 初始化实例字段cx
		this.cy = y; // 初始化实例字段cy
	}
	public double getCentreX() {
		return cx;
		}
		public double getCentreY() {
		return cy;
		}
		// area()和circumference()方法继承自Circle类
		// 新实例方法，检查点是否在圆内
		// 注意，这个方法使用了继承的实例字段r
		public boolean isInside(double x, double y) {
		double dx = x - cx, dy = y - cy; // 到圆心的距离
		double distance = Math.sqrt(dx*dx + dy*dy); // 勾股定理
		return (distance < r); // 返回true或false
		}
}