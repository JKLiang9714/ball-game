package org.liangjiakun.ballgame;

import java.io.IOException;

/**
 * ʹ����䳤�ĵ���
 * 
 * @author Liang Jiakun
 * @version 1.0
 */
public class LongMagic extends Magic {
	/**
	 * ������
	 * 
	 * @param path �ļ�·��
	 * @param x x����
	 * @param y y����
	 * @throws IOException
	 */
	public LongMagic(String path, int x, int y) throws IOException {
		super(path, x, y);
	}
	
	/**
	 * ���ߵĹ��� : ����䳤
	 */
	public void magicDo(Stick stick) {
		double imageWidth = stick.getImage().getWidth(null);
		// �������û�б䳤��
		if (stick.getPreWidth() <= imageWidth) {
			// ������ĳ��ȸ�Ϊ˫��
			stick.setPreWidth((int)(stick.getPreWidth() * 2));
		}
	}
}
