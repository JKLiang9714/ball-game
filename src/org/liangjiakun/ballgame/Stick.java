package org.liangjiakun.ballgame;

import java.io.IOException;

/**
 * ������
 * 
 * @author Liang Jiakun
 * @version 1.0
 */
public class Stick extends BallComponent {
	// ���嵵���ƶ����ٶ�
	public static final int SPEED = 20;
	// ���嵵���ʼ�ĳ���
	private int preWidth = 0;
	
	/**
	 * ������
	 * 
	 * @param panelWidth �����
	 * @param panelHeight ���߶�
	 * @param path ͼƬ·��
	 * @throws IOException
	 */
	public Stick(int panelWidth, int panelHeight, String path)
			throws IOException {
		// ���ø�������
		super(panelWidth, panelHeight, path);
		// ����y����
		this.setY(panelHeight - super.getImage().getHeight(null));
		// ����ԭ���ĳ���
		this.preWidth = super.getImage().getWidth(null);
	}
	
	/**
	 * ��ȡ��ʼ����
	 * 
	 * @return ��ʼ����
	 */
	public int getPreWidth() {
		return this.preWidth;
	}

	/**
	 * ���ó�ʼ����
	 */
	public void setPreWidth(int preWidth) {
		this.preWidth = preWidth;
	}
}
