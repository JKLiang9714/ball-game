package org.liangjiakun.ballgame;

import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

/**
 * ���浯����Ϸ�������ĸ���
 * 
 * @author Liang Jiakun
 * @version 1.0
 */
public class BallComponent {
	// ����x����
	private int x = -1;
	// ����y����
	private int y = -1;
	// ����ͼƬ
	private Image image = null;
	// ����ͼƬ�ٶ�
	private int speed = 5;
	
	/**
	 * ������
	 * 
	 * @param path ͼƬ·��
	 * @throws IOException
	 */
	public BallComponent(String path) throws IOException {
		super();
		this.image = ImageIO.read(new File(path));
	}
	
	/**
	 * ������
	 * 
	 * @param panelWidth �����
	 * @param panelHeight ���߶�
	 * @param path ͼƬ·��
	 * @throws IOException
	 */
	public BallComponent(int panelWidth, int panelHeight, String path)
			throws IOException {
		super();
		// ��ȡͼƬ
		this.image = ImageIO.read(new File(path));
		// ����x����
		this.x = (int)((panelWidth - this.image.getWidth(null)) / 2);
	}
	
	/**
	 * ������
	 * 
	 * @param path ͼƬ·��
	 * @param x ͼƬ��x����
	 * @param y ͼƬ��y����
	 * @throws IOException
	 */
	public BallComponent(String path, int x, int y) throws IOException {
		super();
		// ��ȡͼƬ
		this.image = ImageIO.read(new File(path));
		this.x = x;
		this.y = y;
	}
	
	/**
	 * ��ȡx����
	 * 
	 * @return
	 */
	public int getX() {
		return this.x;
	}

	/**
	 * ��ȡy����
	 * 
	 * @return
	 */
	public int getY() {
		return this.y;
	}

	/**
	 * ��ȡͼƬ�ٶ�
	 * 
	 * @return
	 */
	public int getSpeed() {
		return this.speed;
	}

	/**
	 * ����x����
	 * 
	 * @param x x����
	 */
	public void setX(int x) {
		this.x = x;
	}

	/**
	 * ����y����
	 * 
	 * @param y y����
	 */
	public void setY(int y) {
		this.y = y;
	}

	/**
	 * ����ͼƬ
	 * 
	 * @return Image ͼƬ
	 */
	public Image getImage() {
		return this.image;
	}
}
