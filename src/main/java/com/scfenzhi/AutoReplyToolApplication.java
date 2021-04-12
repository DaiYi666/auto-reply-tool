package com.scfenzhi;

import com.scfenzhi.tools.Reply;
import com.scfenzhi.tools.RobotTools;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.awt.*;
import java.awt.event.KeyEvent;

@SpringBootApplication
public class AutoReplyToolApplication {

    public static void main(String[] args) {
        Robot robot = RobotTools.getRobot();

        for (int i = 0; i < 10; i++) {
            RobotTools.setSysClipboardText("");
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.delay(100);
            robot.keyPress(KeyEvent.VK_TAB);
            robot.delay(100);
            robot.keyRelease(KeyEvent.VK_TAB);
            robot.delay(100);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            robot.delay(100);
            robot.mouseMove(740, 220);
            robot.delay(100);

            robot.mousePress(KeyEvent.BUTTON1_MASK);
            robot.delay(100);
            robot.mouseRelease(KeyEvent.BUTTON1_MASK);
            robot.delay(100);

            robot.mousePress(KeyEvent.BUTTON1_MASK);
            robot.delay(100);
            robot.mouseRelease(KeyEvent.BUTTON1_MASK);
            robot.delay(100);

            robot.mousePress(KeyEvent.BUTTON1_MASK);
            robot.delay(100);
            robot.mouseRelease(KeyEvent.BUTTON1_MASK);
            robot.delay(100);

            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.delay(100);
            robot.keyPress(KeyEvent.VK_C);
            robot.delay(100);
            robot.keyRelease(KeyEvent.VK_C);
            robot.delay(100);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            robot.delay(100);
            robot.mouseMove(735, 255);
            robot.delay(100);

            String sysClipboardText = RobotTools.getSysClipboardText();
            System.out.println(sysClipboardText);
            if (!Reply.DEFAULT_REPLY.equals(sysClipboardText)) {
                RobotTools.setSysClipboardText(Reply.DEFAULT_REPLY);
                robot.mouseMove(600, 400);
                robot.mousePress(KeyEvent.BUTTON1_MASK);
                robot.delay(100);
                robot.mouseRelease(KeyEvent.BUTTON1_MASK);
                robot.delay(100);
                robot.keyPress(KeyEvent.VK_CONTROL);
                robot.delay(100);
                robot.keyPress(KeyEvent.VK_V);
                robot.delay(100);
                robot.keyRelease(KeyEvent.VK_V);
                robot.delay(100);
                robot.keyRelease(KeyEvent.VK_CONTROL);
                robot.delay(100);
                robot.mouseMove(735, 255);
                robot.delay(100);
                robot.keyPress(KeyEvent.VK_ENTER);
                robot.delay(100);
                robot.keyRelease(KeyEvent.VK_ENTER);
            }
        }
    }

}
