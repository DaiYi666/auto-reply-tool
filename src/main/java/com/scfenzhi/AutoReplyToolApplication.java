package com.scfenzhi;

import com.scfenzhi.tools.RobotTools;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.awt.event.KeyEvent;

@SpringBootApplication
public class AutoReplyToolApplication {

    public static void main(String[] args) {
        RobotTools.getRobot().delay(100);
//        RobotTools.pressShortcuts(100, 100, KeyEvent.VK_CONTROL, KeyEvent.VK_TAB);
        RobotTools.getRobot().mouseMove(680, 255);
        RobotTools.getRobot().delay(100);
        RobotTools.pressKey(KeyEvent.BUTTON1_MASK, 3, 200, 200);
    }

}
