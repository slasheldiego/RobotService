package com.robot.service;

import com.robot.beans.Robot;

public class RobotServicesImpl implements RobotServices {

	@Override
	public boolean move(float x, float y, float z) {
		// TODO Auto-generated method stub
		Robot robot = new Robot();
		robot.setX(x);
		robot.setY(y);
		robot.setZ(z);
		
		try {
			System.out.println("Coordinates:" + robot.toString());

			return true;
		} catch(Exception e) {
			System.err.println("Err: " + e);

			return false;
		}
	}

}
