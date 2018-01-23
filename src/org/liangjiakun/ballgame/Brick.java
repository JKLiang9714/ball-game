package org.liangjiakun.ballgame;

import java.io.IOException;

/**
 * 砖块类
 * 
 * @author Liang Jiakun
 * @version 1.0
 */
public class Brick extends BallComponent {
	// 定义道具
	private Magic magic = null;
	// 定义一个boolean变量设置本类是否有效
	private boolean disable = false;
	public static final int MAGIC_LONG_TYPE = 1;
	public static final int MAGIC_SHORT_TYPE = 2;
	
	/**
	 * 构造器
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
	 * 设置本类有没有效
	 * 
	 * @param disable
	 */
	public void setDisable(boolean disable) {
		this.disable = disable;
	}

	/**
	 * 查看本类有没有效
	 * 
	 * @return
	 */
	public boolean isDisable() {
		return this.disable;
	}

	/**
	 * 获取道具
	 * 
	 * @return magic
	 */
	public Magic getMagic() {
		return this.magic;
	}

	/**
	 * 设置道具
	 */
	public void setMagic(Magic magic) {
		this.magic = magic;
	}
}
