package com.scfenzhi.tools;

import java.awt.*;
import java.awt.event.KeyEvent;

/**
 * @author DaiYi
 * @create 2021/4/11
 */
public class RobotTools {

    private static Robot robot;

    static {
        try {
            robot = new Robot();
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    public static void click(int button, int delayTime) {
        robot.mousePress(button);
        robot.delay(delayTime);
        robot.mouseRelease(button);
    }


    public static void pressKey(int key, int delayTime) {
        robot.keyPress(key);
        robot.delay(delayTime);
        robot.keyRelease(key);
    }

    public static void pressKey(int key, int count, int delayTime, int intervalTime) {
        for (int i = 0; i < count; i++) {
            robot.mousePress(key);
            robot.delay(delayTime);
            robot.keyRelease(key);
            robot.delay(intervalTime);
        }
    }


    public static void doubleClick(int delayTime, int intervalTime) {
        pressKey(KeyEvent.BUTTON1_MASK, delayTime);
        robot.delay(intervalTime);
        pressKey(KeyEvent.BUTTON1_MASK, delayTime);
    }


    public static void pressShortcuts(int delayTime, int intervalTime, int... keys) {

        for (int key : keys) {
            robot.keyPress(key);
            robot.delay(delayTime);
        }

        robot.delay(intervalTime);

        for (int key : keys) {
            robot.keyRelease(key);
            robot.delay(delayTime);
        }
    }


    public static Robot getRobot() {
        return robot;
    }

    public static void setRobot(Robot robot) {
        RobotTools.robot = robot;
    }
}
