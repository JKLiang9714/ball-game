package org.liangjiakun.ballgame;

import java.io.IOException;

/**
 * 使挡板变短的道具
 * 
 * @author Liang Jiakun
 * @version 1.0
 */
public class ShortMagic extends Magic {
	/**
	 * 构造器
	 * 
	 * @param path 文件路径
	 * @param x x坐标
	 * @param y y坐标
	 * @throws IOException
	 */
	public ShortMagic(String path, int x, int y) throws IOException {
		super(path, x, y);
	}
	
	/**
	 * 道具的功能 : 档板变短
	 */
	public void magicDo(Stick stick) {
		double imageWidth = stick.getImage().getWidth(null);
		// 如果档板没有变短过
		if (stick.getPreWidth() >= imageWidth) {
			// 将档板的宽度改为一半
			stick.setPreWidth((int)(stick.getPreWidth() * 0.5));
		}
	}
}
