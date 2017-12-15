package com.robot.service;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;

import org.apache.log4j.Logger;

import com.robot.beans.Robot;

public class RobotServicesImpl implements RobotServices {
	
	final static Logger logger = Logger.getLogger(RobotServicesImpl.class);
	
	@Override
	public boolean move(float x, float y, float z) {
		// TODO Auto-generated method stub
		Robot robot = new Robot();
		robot.setX(x);
		robot.setY(y);
		robot.setZ(z);
		
		try
        {
            /* Se crea el socket cliente */
            Socket socket = new Socket ("localhost", 25557);
			//Socket socket = new Socket ("localhost", 55000);
			logger.info("conectado");

            PrintStream ps = new PrintStream(socket.getOutputStream());
            
            String s = "y";
            /*ps.write(s.getBytes("UTF-8"));
            ps.flush();
            Thread.sleep(1000);
            ps.write(String.valueOf(x).getBytes("UTF-8"));
            ps.flush();
            Thread.sleep(1000);
            ps.write(String.valueOf(y).getBytes("UTF-8"));
            ps.flush();
            Thread.sleep(1000);
            ps.write(String.valueOf(z).getBytes("UTF-8"));
            ps.flush();
            ps.write(s.getBytes("UTF-8"));
            ps.flush();
            
            Thread.sleep(1000000);*/
            
            ps.println(s);
            
            ps.close();
            socket.close();
            
            return true;
        }
        catch (Exception e)
        {
            e.printStackTrace();
            return false;
        }
	}

}
