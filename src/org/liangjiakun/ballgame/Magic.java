package org.liangjiakun.ballgame;

import java.io.IOException;

/**
 * ���߶���
 * 
 * @author Liang Jiakun
 * @version 1.0
 */
public abstract class Magic extends BallComponent {
	/**
	 * �ṩ��������õĹ�����
	 * 
	 * @param path �ļ�·��
	 * @param x x����
	 * @param y y����
	 * @throws IOException
	 */
	public Magic(String path, int x, int y) throws IOException {
		super(path, x, y);
	}
	
	/**
	 * ���ߵĹ���
	 * @param stick
	 */
	public abstract void magicDo(Stick stick);
}
