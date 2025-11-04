package be.ucll.crafsmanship.command.gamecontroller.commands;

import be.ucll.crafsmanship.command.gamecontroller.Receiver;

public class PressCrossCommand implements Command {
    Receiver action;

    public PressCrossCommand(Receiver action) {
        this.action = action;
    }

    public void press() {
        action.actionCross();
    }
}
