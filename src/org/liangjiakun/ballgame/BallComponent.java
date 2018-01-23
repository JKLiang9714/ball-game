package org.liangjiakun.ballgame;

import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

/**
 * 桌面弹球游戏相关组件的父类
 * 
 * @author Liang Jiakun
 * @version 1.0
 */
public class BallComponent {
	// 设置x坐标
	private int x = -1;
	// 设置y坐标
	private int y = -1;
	// 设置图片
	private Image image = null;
	// 设置图片速度
	private int speed = 5;
	
	/**
	 * 构造器
	 * 
	 * @param path 图片路径
	 * @throws IOException
	 */
	public BallComponent(String path) throws IOException {
		super();
		this.image = ImageIO.read(new File(path));
	}
	
	/**
	 * 构造器
	 * 
	 * @param panelWidth 面板宽度
	 * @param panelHeight 面板高度
	 * @param path 图片路径
	 * @throws IOException
	 */
	public BallComponent(int panelWidth, int panelHeight, String path)
			throws IOException {
		super();
		// 读取图片
		this.image = ImageIO.read(new File(path));
		// 设置x坐标
		this.x = (int)((panelWidth - this.image.getWidth(null)) / 2);
	}
	
	/**
	 * 构造器
	 * 
	 * @param path 图片路径
	 * @param x 图片的x坐标
	 * @param y 图片的y坐标
	 * @throws IOException
	 */
	public BallComponent(String path, int x, int y) throws IOException {
		super();
		// 读取图片
		this.image = ImageIO.read(new File(path));
		this.x = x;
		this.y = y;
	}
	
	/**
	 * 获取x坐标
	 * 
	 * @return
	 */
	public int getX() {
		return this.x;
	}

	/**
	 * 获取y坐标
	 * 
	 * @return
	 */
	public int getY() {
		return this.y;
	}

	/**
	 * 获取图片速度
	 * 
	 * @return
	 */
	public int getSpeed() {
		return this.speed;
	}

	/**
	 * 设置x坐标
	 * 
	 * @param x x坐标
	 */
	public void setX(int x) {
		this.x = x;
	}

	/**
	 * 设置y坐标
	 * 
	 * @param y y坐标
	 */
	public void setY(int y) {
		this.y = y;
	}

	/**
	 * 返回图片
	 * 
	 * @return Image 图片
	 */
	public Image getImage() {
		return this.image;
	}
}
