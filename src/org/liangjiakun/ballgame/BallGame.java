package org.liangjiakun.ballgame;

import java.io.IOException;

import javax.swing.JFrame;

/**
 * 游戏入口类
 * 
 * @author Liang Jiakun
 * @version 1.0
 */
public class BallGame {
	/**
	 * 开始游戏
	 * 
	 * @param args
	 * @throws IOExcception
	 */
	public static void main(String[] args) throws IOException {
		BallFrame ballFrame = new BallFrame();
		ballFrame.setResizable(false);
		ballFrame.pack();
		ballFrame.setVisible(true);
		ballFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ballFrame.setLocationRelativeTo(null);
	}
}