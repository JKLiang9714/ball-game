package org.liangjiakun.ballgame;

import java.io.IOException;

/**
 * 小球对象
 * 
 * @author Liang Jiakun
 * @version 1.0
 */
public class Ball extends BallComponent {
	// 定义球的水平和竖直速度
	private int speedX = 8;
	private int speedY = 10;
	// 定义是否在运动
	private boolean started = false;
	// 定义是否结束运动
	private boolean stop = false;
	/**
	 * 有参构造器
	 * @param panelWidth 画板宽度
	 * @param panelHeight 画板高度
	 * @param offset 位移
	 * @param path 图片路径
	 * @throws IOException
	 */
	public Ball(int panelWidth, int panelHeight, int offset, String path) 
			throws IOException {
		super(panelWidth, panelHeight, path);
		// 设置y坐标
		this.setY(panelHeight - super.getImage().getHeight(null) - offset);
	}
	
	/**
	 * 设置横向速度
	 * 
	 * @param speed
	 */
	public void setSpeedX(int speed) {
		this.speedX = speed;
	}
	
	/**
	 * 设置竖向速度
	 * 
	 * @param speed
	 */
	public void setSpeedY(int speed) {
		this.speedY = speed;
	}
	
	/**
	 * 设置是否在运动
	 * 
	 * @param b
	 */
	public void setStarted(boolean b) {
		this.started = b;
	}
	
	/**
	 * 设置是否结束运动
	 * 
	 * @param b
	 */
	public void setStop(boolean b) {
		this.stop = b;
	}
	
	/**
	 * 返回横向速度
	 * 
	 * @return
	 */
	public int getSpeedX() {
		return this.speedX;
	}
	
	/**
	 * 返回竖向速度
	 * 
	 * @return
	 */
	public int getSpeedY() {
		return this.speedY;
	}
	
	/**
	 * 是否在运动
	 * 
	 * @return
	 */
	public boolean isStarted() {
		return this.started;
	}
	
	/**
	 * 是否结束运动
	 * 
	 * @return
	 */
	public boolean isStop() {
		return this.stop;
	}
}
