package com.wgx.command;

/**
 * @author wgx
 * @since 2023/4/17 16:08
 */
public class LightOnCommand implements Command {
    private LightReceiver light;

    public LightOnCommand(LightReceiver light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
}
