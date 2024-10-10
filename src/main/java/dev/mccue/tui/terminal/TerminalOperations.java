package dev.mccue.tui.terminal;

abstract class TerminalOperations {
    abstract boolean isTerminal(int fd);

    abstract void makeRaw(int fd);
}
