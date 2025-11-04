package be.ucll.crafsmanship.command.gamecontroller.commands;

import be.ucll.crafsmanship.command.gamecontroller.Receiver;

public class PressCircleCommand implements Command {
    Receiver action;

    public PressCircleCommand(Receiver action) {
        this.action = action;
    }

    public void press() {
        action.actionCircle();
    }
}
