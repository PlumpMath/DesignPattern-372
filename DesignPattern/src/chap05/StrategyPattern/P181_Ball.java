package chap05.StrategyPattern;

import java.awt.Color;

/**
 * 공 클래스.
 * 공의 위치와 공의 이동 간격을 가지며 
 * DirectionStragety와 DrawStrategy 추상 클래스에 따라 각각 다른 알고리즘이 실행됨.
 *
 * @author assu
 * @date 2016. 11. 19.
 */
public class P181_Ball extends Thread {
	public static final int SIZE = 20;
	public static final int INTERVAL = 10;
	private int x, y;
	private int xInterval, yInterval;
	private P181_DirectionStrategy directionStrategy;
	private P181_DrawStrategy drawStrategy;
	private Color color;
	
	public P181_Ball(int x, int y) {
		this.x = x;
		this.y = y;
		this.xInterval = this.yInterval = 0;
	}

	public void setIntervals(int xInterval, int yInterval) {
		this.xInterval = xInterval;
		this.yInterval = yInterval;
	}
	
	public void draw() {
		drawStrategy.draw(this);
	}

	public void move() {
		directionStrategy.move(this);
	}
	
	public void run() {
		draw();
		move();
	}
	
	public int getX() {
		return x;
	}
	
	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getxInterval() {
		return xInterval;
	}

	public void setxInterval(int xInterval) {
		this.xInterval = xInterval;
	}

	public int getyInterval() {
		return yInterval;
	}

	public void setyInterval(int yInterval) {
		this.yInterval = yInterval;
	}

	public P181_DirectionStrategy getDirectionStrategy() {
		return directionStrategy;
	}

	public void setDirectionStrategy(P181_DirectionStrategy directionStrategy) {
		this.directionStrategy = directionStrategy;
	}

	public P181_DrawStrategy getDrawStrategy() {
		return drawStrategy;
	}

	public void setDrawStrategy(P181_DrawStrategy drawStrategy) {
		this.drawStrategy = drawStrategy;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
}
