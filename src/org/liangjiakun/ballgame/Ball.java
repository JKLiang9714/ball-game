package org.liangjiakun.ballgame;

import java.io.IOException;

/**
 * С�����
 * 
 * @author Liang Jiakun
 * @version 1.0
 */
public class Ball extends BallComponent {
	// �������ˮƽ����ֱ�ٶ�
	private int speedX = 8;
	private int speedY = 10;
	// �����Ƿ����˶�
	private boolean started = false;
	// �����Ƿ�����˶�
	private boolean stop = false;
	/**
	 * �вι�����
	 * @param panelWidth ������
	 * @param panelHeight ����߶�
	 * @param offset λ��
	 * @param path ͼƬ·��
	 * @throws IOException
	 */
	public Ball(int panelWidth, int panelHeight, int offset, String path) 
			throws IOException {
		super(panelWidth, panelHeight, path);
		// ����y����
		this.setY(panelHeight - super.getImage().getHeight(null) - offset);
	}
	
	/**
	 * ���ú����ٶ�
	 * 
	 * @param speed
	 */
	public void setSpeedX(int speed) {
		this.speedX = speed;
	}
	
	/**
	 * ���������ٶ�
	 * 
	 * @param speed
	 */
	public void setSpeedY(int speed) {
		this.speedY = speed;
	}
	
	/**
	 * �����Ƿ����˶�
	 * 
	 * @param b
	 */
	public void setStarted(boolean b) {
		this.started = b;
	}
	
	/**
	 * �����Ƿ�����˶�
	 * 
	 * @param b
	 */
	public void setStop(boolean b) {
		this.stop = b;
	}
	
	/**
	 * ���غ����ٶ�
	 * 
	 * @return
	 */
	public int getSpeedX() {
		return this.speedX;
	}
	
	/**
	 * ���������ٶ�
	 * 
	 * @return
	 */
	public int getSpeedY() {
		return this.speedY;
	}
	
	/**
	 * �Ƿ����˶�
	 * 
	 * @return
	 */
	public boolean isStarted() {
		return this.started;
	}
	
	/**
	 * �Ƿ�����˶�
	 * 
	 * @return
	 */
	public boolean isStop() {
		return this.stop;
	}
}
