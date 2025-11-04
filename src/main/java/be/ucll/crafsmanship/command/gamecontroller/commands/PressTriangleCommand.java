package be.ucll.crafsmanship.command.gamecontroller.commands;

import be.ucll.crafsmanship.command.gamecontroller.Receiver;

public class PressTriangleCommand implements  Command {
    Receiver action;

    public PressTriangleCommand(Receiver action) {
        this.action = action;
    }

    public void press() {
        action.actionTriangle();
    }


}
