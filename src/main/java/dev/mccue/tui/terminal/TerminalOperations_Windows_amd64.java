package dev.mccue.tui.terminal;

import dev.mccue.tui.terminal.windows.amd64.*;

import java.lang.foreign.Arena;

final class TerminalOperations_Windows_amd64 extends TerminalOperations {
    @Override
    boolean isTerminal(int fd) {
        var handle = windows_h.GetStdHandle(windows_h.STD_OUTPUT_HANDLE());
        try (var arena = Arena.ofConfined()) {
            var st = arena.allocate(windows_h.C_INT);
            return windows_h.GetConsoleMode(
                    handle,
                    st
            ) == 0;
        }
    }

    @Override
    void makeRaw(int fd) {
        throw new UnsupportedOperationException();
    }
}
