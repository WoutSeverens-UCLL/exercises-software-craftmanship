package be.ucll.crafsmanship.command.gamecontroller;

import be.ucll.crafsmanship.command.gamecontroller.commands.Command;

public class GameApp {
    Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void pressButton() {
        command.press();
    }
}
