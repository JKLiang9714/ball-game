package org.liangjiakun.ballgame;

import java.io.IOException;

/**
 * 挡板类
 * 
 * @author Liang Jiakun
 * @version 1.0
 */
public class Stick extends BallComponent {
	// 定义档板移动的速度
	public static final int SPEED = 20;
	// 定义档板初始的长度
	private int preWidth = 0;
	
	/**
	 * 构造器
	 * 
	 * @param panelWidth 面板宽度
	 * @param panelHeight 面板高度
	 * @param path 图片路径
	 * @throws IOException
	 */
	public Stick(int panelWidth, int panelHeight, String path)
			throws IOException {
		// 调用父构造器
		super(panelWidth, panelHeight, path);
		// 设置y坐标
		this.setY(panelHeight - super.getImage().getHeight(null));
		// 设置原本的长度
		this.preWidth = super.getImage().getWidth(null);
	}
	
	/**
	 * 获取初始长度
	 * 
	 * @return 初始长度
	 */
	public int getPreWidth() {
		return this.preWidth;
	}

	/**
	 * 设置初始长度
	 */
	public void setPreWidth(int preWidth) {
		this.preWidth = preWidth;
	}
}
