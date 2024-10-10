package dev.mccue.tui.terminal;

public final class Terminal {
    private static final TerminalOperations ops;

    static {
        var os = System.getProperty("os.name");
        var arch = System.getProperty("os.arch");

        if (os.toLowerCase().startsWith("win") && arch.equals("amd64")) {
            ops = new TerminalOperations_Windows_amd64();
        }
        else if (os.toLowerCase().startsWith("mac") && arch.equals("aarch64")) {
            ops = new TerminalOperations_Mac_aarch64();
        }
        else if (os.toLowerCase().startsWith("linux") && arch.equals("amd64")) {
            ops = new TerminalOperations_Linux_amd64();
        }
        else {
            throw new ExceptionInInitializerError("Unsupported os/arch: os=" + os + ", arch=" + arch);
        }
    }

    public static boolean isTerminal(int fd) {
        return ops.isTerminal(fd);
    }

    public static void makeRaw(int fd){
        ops.makeRaw(fd);
    }
}
