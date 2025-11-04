package be.ucll.crafsmanship.command.gamecontroller;

import be.ucll.crafsmanship.command.gamecontroller.commands.*;

public class Main {
    public static void main(String[] args) {
        GameApp gameApp = new GameApp();

        Receiver receiver = new Receiver();
        Command jump = new PressCrossCommand(receiver);
        gameApp.setCommand(jump);
        gameApp.pressButton();

        Command crouch = new PressCircleCommand(receiver);
        gameApp.setCommand(crouch);
        gameApp.pressButton();

        Command swapWeapon = new PressTriangleCommand(receiver);
        gameApp.setCommand(swapWeapon);
        gameApp.pressButton();

        Command useWeapon = new PressSquareCommand(receiver);
        gameApp.setCommand(useWeapon);
        gameApp.pressButton();

    }
}
