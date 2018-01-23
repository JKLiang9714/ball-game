package org.liangjiakun.ballgame;

import java.io.IOException;

/**
 * ʹ�����̵ĵ���
 * 
 * @author Liang Jiakun
 * @version 1.0
 */
public class ShortMagic extends Magic {
	/**
	 * ������
	 * 
	 * @param path �ļ�·��
	 * @param x x����
	 * @param y y����
	 * @throws IOException
	 */
	public ShortMagic(String path, int x, int y) throws IOException {
		super(path, x, y);
	}
	
	/**
	 * ���ߵĹ��� : ������
	 */
	public void magicDo(Stick stick) {
		double imageWidth = stick.getImage().getWidth(null);
		// �������û�б�̹�
		if (stick.getPreWidth() >= imageWidth) {
			// ������Ŀ�ȸ�Ϊһ��
			stick.setPreWidth((int)(stick.getPreWidth() * 0.5));
		}
	}
}
