package org.liangjiakun.ballgame;

import java.io.IOException;

/**
 * ש����
 * 
 * @author Liang Jiakun
 * @version 1.0
 */
public class Brick extends BallComponent {
	// �������
	private Magic magic = null;
	// ����һ��boolean�������ñ����Ƿ���Ч
	private boolean disable = false;
	public static final int MAGIC_LONG_TYPE = 1;
	public static final int MAGIC_SHORT_TYPE = 2;
	
	/**
	 * ������
	 * @param path
	 * @param type
	 * @param x
	 * @param y
	 * @throws IOException
	 */
	public Brick(String path, int type, int x, int y) throws IOException {
		super(path);
		if (type == Brick.MAGIC_LONG_TYPE) {
			this.magic = new LongMagic("img/long.gif", x, y);
		} else if (type == Brick.MAGIC_SHORT_TYPE) {
			this.magic = new ShortMagic("img/short.gif", x, y);
		}
		if (this.magic != null) {
			this.magic.setX(x);
			this.magic.setY(y);
		}
	}
	
	/**
	 * ���ñ�����û��Ч
	 * 
	 * @param disable
	 */
	public void setDisable(boolean disable) {
		this.disable = disable;
	}

	/**
	 * �鿴������û��Ч
	 * 
	 * @return
	 */
	public boolean isDisable() {
		return this.disable;
	}

	/**
	 * ��ȡ����
	 * 
	 * @return magic
	 */
	public Magic getMagic() {
		return this.magic;
	}

	/**
	 * ���õ���
	 */
	public void setMagic(Magic magic) {
		this.magic = magic;
	}
}
