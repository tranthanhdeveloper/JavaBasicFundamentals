package com.javabasic.screenrecorder;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ScreeenRecoder {
	public static void main(String[] args) throws AWTException {
		String imageExt = "png";
		Dimension size = Toolkit.getDefaultToolkit().getScreenSize(); 
		Robot robot = new Robot(); 
		
		
        try {
            BufferedImage img = robot.createScreenCapture(new Rectangle(size));
            
			ImageIO.write(img, imageExt, new File(String.valueOf(System.nanoTime()).concat("."+imageExt)));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
