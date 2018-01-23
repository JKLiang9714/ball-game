package org.liangjiakun.ballgame;

import java.io.IOException;

/**
 * 道具对象
 * 
 * @author Liang Jiakun
 * @version 1.0
 */
public abstract class Magic extends BallComponent {
	/**
	 * 提供给子类调用的构造器
	 * 
	 * @param path 文件路径
	 * @param x x坐标
	 * @param y y坐标
	 * @throws IOException
	 */
	public Magic(String path, int x, int y) throws IOException {
		super(path, x, y);
	}
	
	/**
	 * 道具的功能
	 * @param stick
	 */
	public abstract void magicDo(Stick stick);
}
