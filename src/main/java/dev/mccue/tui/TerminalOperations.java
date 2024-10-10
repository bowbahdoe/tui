package dev.mccue.tui;

abstract class TerminalOperations {
    abstract boolean isTerminal(int fd);

    abstract void makeRaw(int fd);
}
