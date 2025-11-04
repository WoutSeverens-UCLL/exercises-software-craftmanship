package be.ucll.crafsmanship.command.gamecontroller.commands;

import be.ucll.crafsmanship.command.gamecontroller.Receiver;

public class PressSquareCommand implements Command{
    Receiver action;

    public PressSquareCommand(Receiver action){
        this.action = action;
    }

    public void press(){
        action.actionSquare();
    }
}
