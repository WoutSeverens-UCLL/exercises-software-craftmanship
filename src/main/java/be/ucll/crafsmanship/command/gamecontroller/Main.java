package be.ucll.crafsmanship.command.gamecontroller;

import be.ucll.crafsmanship.command.gamecontroller.commands.*;

public class Main {
    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        Command circleCommand = new PressCircleCommand(receiver);
        Command crossCommand = new PressCrossCommand(receiver);
        Command squareCommand = new PressSquareCommand(receiver);
        Command triangleCommand = new PressTriangleCommand(receiver);
        GameApp gameApp = new GameApp();

        gameApp.setCircleButton(circleCommand);
        gameApp.pressCircleButton();


        gameApp.setCrossButton(crossCommand);
        gameApp.pressCrossButton();


        gameApp.setSquareButton(squareCommand);
        gameApp.pressSquareButton();


        gameApp.setTriangleButton(triangleCommand);
        gameApp.pressTriangleButton();

        //remapping cross button to square action
        gameApp.setCrossButton(squareCommand);
        gameApp.pressCrossButton();

    }
}
