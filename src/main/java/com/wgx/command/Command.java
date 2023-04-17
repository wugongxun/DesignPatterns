package com.wgx.command;

/**
 * @author wgx
 * @since 2023/4/17 16:07
 */
public interface Command {
    void execute();
    void undo();
}
