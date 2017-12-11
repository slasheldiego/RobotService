package com.robot.beans;

import java.io.Serializable;

public class Robot implements Serializable{

	/**
	 * @param x coordinate
	 * @param y coordinate
	 * @param z coordinate
	 */
	private static final long serialVersionUID = 7030915456519670218L;
	
	private float x;
	private float y;
	private float z;
	
	public float getX() {
		return x;
	}
	public void setX(float x) {
		this.x = x;
	}
	public float getY() {
		return y;
	}
	public void setY(float y) {
		this.y = y;
	}
	public float getZ() {
		return z;
	}
	public void setZ(float z) {
		this.z = z;
	}
	
	public String toString() {
		return "x: "+x+" y: "+y+" z: "+z;
	}

}
