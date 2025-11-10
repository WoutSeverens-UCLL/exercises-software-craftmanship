package be.ucll.crafsmanship.command.gamecontroller;

import be.ucll.crafsmanship.command.gamecontroller.commands.Command;

public class GameApp {
    Command circleButton;
    Command CrossButton;
    Command squareButton;
    Command triangleButton;

    public void setCircleButton(Command circleButton) {
        this.circleButton = circleButton;
    }
    public void setCrossButton(Command crossButton) {
        CrossButton = crossButton;
    }
    public void setSquareButton(Command squareButton) {
        this.squareButton = squareButton;
    }

    public void setTriangleButton(Command triangleButton) {
        this.triangleButton = triangleButton;
    }

    public void pressCircleButton() {
        circleButton.press();
    }

    public void pressCrossButton() {
        CrossButton.press();
    }

    public void pressSquareButton() {
        squareButton.press();
    }

    public void pressTriangleButton() {
        triangleButton.press();
    }
}
