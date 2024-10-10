package dev.mccue.tui;

import dev.mccue.tui.terminal.Terminal;

public class Main {
    public static void main(String[] args) throws Exception {

        System.out.println("Hello");
        Thread.sleep(10000);
        Terminal.makeRaw(0);
        System.out.println("Hello");

        Thread.sleep(10000);
    }
}
