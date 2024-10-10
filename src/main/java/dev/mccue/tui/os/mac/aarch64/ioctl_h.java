// Generated by jextract

package dev.mccue.tui.os.mac.aarch64;

import java.lang.invoke.*;
import java.lang.foreign.*;
import java.nio.ByteOrder;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

import static java.lang.foreign.ValueLayout.*;
import static java.lang.foreign.MemoryLayout.PathElement.*;

public class ioctl_h {

    ioctl_h() {
        // Should not be called directly
    }

    static final Arena LIBRARY_ARENA = Arena.ofAuto();
    static final boolean TRACE_DOWNCALLS = Boolean.getBoolean("jextract.trace.downcalls");

    static void traceDowncall(String name, Object... args) {
         String traceArgs = Arrays.stream(args)
                       .map(Object::toString)
                       .collect(Collectors.joining(", "));
         System.out.printf("%s(%s)\n", name, traceArgs);
    }

    static MemorySegment findOrThrow(String symbol) {
        return SYMBOL_LOOKUP.find(symbol)
            .orElseThrow(() -> new UnsatisfiedLinkError("unresolved symbol: " + symbol));
    }

    static MethodHandle upcallHandle(Class<?> fi, String name, FunctionDescriptor fdesc) {
        try {
            return MethodHandles.lookup().findVirtual(fi, name, fdesc.toMethodType());
        } catch (ReflectiveOperationException ex) {
            throw new AssertionError(ex);
        }
    }

    static MemoryLayout align(MemoryLayout layout, long align) {
        return switch (layout) {
            case PaddingLayout p -> p;
            case ValueLayout v -> v.withByteAlignment(align);
            case GroupLayout g -> {
                MemoryLayout[] alignedMembers = g.memberLayouts().stream()
                        .map(m -> align(m, align)).toArray(MemoryLayout[]::new);
                yield g instanceof StructLayout ?
                        MemoryLayout.structLayout(alignedMembers) : MemoryLayout.unionLayout(alignedMembers);
            }
            case SequenceLayout s -> MemoryLayout.sequenceLayout(s.elementCount(), align(s.elementLayout(), align));
        };
    }

    static final SymbolLookup SYMBOL_LOOKUP = SymbolLookup.loaderLookup()
            .or(Linker.nativeLinker().defaultLookup());

    public static final ValueLayout.OfBoolean C_BOOL = ValueLayout.JAVA_BOOLEAN;
    public static final ValueLayout.OfByte C_CHAR = ValueLayout.JAVA_BYTE;
    public static final ValueLayout.OfShort C_SHORT = ValueLayout.JAVA_SHORT;
    public static final ValueLayout.OfInt C_INT = ValueLayout.JAVA_INT;
    public static final ValueLayout.OfLong C_LONG_LONG = ValueLayout.JAVA_LONG;
    public static final ValueLayout.OfFloat C_FLOAT = ValueLayout.JAVA_FLOAT;
    public static final ValueLayout.OfDouble C_DOUBLE = ValueLayout.JAVA_DOUBLE;
    public static final AddressLayout C_POINTER = ValueLayout.ADDRESS
            .withTargetLayout(MemoryLayout.sequenceLayout(java.lang.Long.MAX_VALUE, JAVA_BYTE));
    public static final ValueLayout.OfLong C_LONG = ValueLayout.JAVA_LONG;
    private static final int EBADF = (int)9L;
    /**
     * {@snippet lang=c :
     * #define EBADF 9
     * }
     */
    public static int EBADF() {
        return EBADF;
    }
    private static final int EFAULT = (int)14L;
    /**
     * {@snippet lang=c :
     * #define EFAULT 14
     * }
     */
    public static int EFAULT() {
        return EFAULT;
    }
    private static final int EINVAL = (int)22L;
    /**
     * {@snippet lang=c :
     * #define EINVAL 22
     * }
     */
    public static int EINVAL() {
        return EINVAL;
    }
    private static final int ENOTTY = (int)25L;
    /**
     * {@snippet lang=c :
     * #define ENOTTY 25
     * }
     */
    public static int ENOTTY() {
        return ENOTTY;
    }
    private static final int VEOF = (int)0L;
    /**
     * {@snippet lang=c :
     * #define VEOF 0
     * }
     */
    public static int VEOF() {
        return VEOF;
    }
    private static final int VEOL = (int)1L;
    /**
     * {@snippet lang=c :
     * #define VEOL 1
     * }
     */
    public static int VEOL() {
        return VEOL;
    }
    private static final int VEOL2 = (int)2L;
    /**
     * {@snippet lang=c :
     * #define VEOL2 2
     * }
     */
    public static int VEOL2() {
        return VEOL2;
    }
    private static final int VERASE = (int)3L;
    /**
     * {@snippet lang=c :
     * #define VERASE 3
     * }
     */
    public static int VERASE() {
        return VERASE;
    }
    private static final int VWERASE = (int)4L;
    /**
     * {@snippet lang=c :
     * #define VWERASE 4
     * }
     */
    public static int VWERASE() {
        return VWERASE;
    }
    private static final int VREPRINT = (int)6L;
    /**
     * {@snippet lang=c :
     * #define VREPRINT 6
     * }
     */
    public static int VREPRINT() {
        return VREPRINT;
    }
    private static final int VINTR = (int)8L;
    /**
     * {@snippet lang=c :
     * #define VINTR 8
     * }
     */
    public static int VINTR() {
        return VINTR;
    }
    private static final int VQUIT = (int)9L;
    /**
     * {@snippet lang=c :
     * #define VQUIT 9
     * }
     */
    public static int VQUIT() {
        return VQUIT;
    }
    private static final int VSUSP = (int)10L;
    /**
     * {@snippet lang=c :
     * #define VSUSP 10
     * }
     */
    public static int VSUSP() {
        return VSUSP;
    }
    private static final int VSTART = (int)12L;
    /**
     * {@snippet lang=c :
     * #define VSTART 12
     * }
     */
    public static int VSTART() {
        return VSTART;
    }
    private static final int VSTOP = (int)13L;
    /**
     * {@snippet lang=c :
     * #define VSTOP 13
     * }
     */
    public static int VSTOP() {
        return VSTOP;
    }
    private static final int VLNEXT = (int)14L;
    /**
     * {@snippet lang=c :
     * #define VLNEXT 14
     * }
     */
    public static int VLNEXT() {
        return VLNEXT;
    }
    private static final int VDISCARD = (int)15L;
    /**
     * {@snippet lang=c :
     * #define VDISCARD 15
     * }
     */
    public static int VDISCARD() {
        return VDISCARD;
    }
    private static final int VMIN = (int)16L;
    /**
     * {@snippet lang=c :
     * #define VMIN 16
     * }
     */
    public static int VMIN() {
        return VMIN;
    }
    private static final int VTIME = (int)17L;
    /**
     * {@snippet lang=c :
     * #define VTIME 17
     * }
     */
    public static int VTIME() {
        return VTIME;
    }
    private static final int IGNBRK = (int)1L;
    /**
     * {@snippet lang=c :
     * #define IGNBRK 1
     * }
     */
    public static int IGNBRK() {
        return IGNBRK;
    }
    private static final int BRKINT = (int)2L;
    /**
     * {@snippet lang=c :
     * #define BRKINT 2
     * }
     */
    public static int BRKINT() {
        return BRKINT;
    }
    private static final int IGNPAR = (int)4L;
    /**
     * {@snippet lang=c :
     * #define IGNPAR 4
     * }
     */
    public static int IGNPAR() {
        return IGNPAR;
    }
    private static final int PARMRK = (int)8L;
    /**
     * {@snippet lang=c :
     * #define PARMRK 8
     * }
     */
    public static int PARMRK() {
        return PARMRK;
    }
    private static final int INPCK = (int)16L;
    /**
     * {@snippet lang=c :
     * #define INPCK 16
     * }
     */
    public static int INPCK() {
        return INPCK;
    }
    private static final int ISTRIP = (int)32L;
    /**
     * {@snippet lang=c :
     * #define ISTRIP 32
     * }
     */
    public static int ISTRIP() {
        return ISTRIP;
    }
    private static final int INLCR = (int)64L;
    /**
     * {@snippet lang=c :
     * #define INLCR 64
     * }
     */
    public static int INLCR() {
        return INLCR;
    }
    private static final int IGNCR = (int)128L;
    /**
     * {@snippet lang=c :
     * #define IGNCR 128
     * }
     */
    public static int IGNCR() {
        return IGNCR;
    }
    private static final int ICRNL = (int)256L;
    /**
     * {@snippet lang=c :
     * #define ICRNL 256
     * }
     */
    public static int ICRNL() {
        return ICRNL;
    }
    private static final int IXON = (int)512L;
    /**
     * {@snippet lang=c :
     * #define IXON 512
     * }
     */
    public static int IXON() {
        return IXON;
    }
    private static final int IXOFF = (int)1024L;
    /**
     * {@snippet lang=c :
     * #define IXOFF 1024
     * }
     */
    public static int IXOFF() {
        return IXOFF;
    }
    private static final int IXANY = (int)2048L;
    /**
     * {@snippet lang=c :
     * #define IXANY 2048
     * }
     */
    public static int IXANY() {
        return IXANY;
    }
    private static final int IMAXBEL = (int)8192L;
    /**
     * {@snippet lang=c :
     * #define IMAXBEL 8192
     * }
     */
    public static int IMAXBEL() {
        return IMAXBEL;
    }
    private static final int OPOST = (int)1L;
    /**
     * {@snippet lang=c :
     * #define OPOST 1
     * }
     */
    public static int OPOST() {
        return OPOST;
    }
    private static final int ONLCR = (int)2L;
    /**
     * {@snippet lang=c :
     * #define ONLCR 2
     * }
     */
    public static int ONLCR() {
        return ONLCR;
    }
    private static final int OCRNL = (int)16L;
    /**
     * {@snippet lang=c :
     * #define OCRNL 16
     * }
     */
    public static int OCRNL() {
        return OCRNL;
    }
    private static final int ONOCR = (int)32L;
    /**
     * {@snippet lang=c :
     * #define ONOCR 32
     * }
     */
    public static int ONOCR() {
        return ONOCR;
    }
    private static final int ONLRET = (int)64L;
    /**
     * {@snippet lang=c :
     * #define ONLRET 64
     * }
     */
    public static int ONLRET() {
        return ONLRET;
    }
    private static final int CSIZE = (int)768L;
    /**
     * {@snippet lang=c :
     * #define CSIZE 768
     * }
     */
    public static int CSIZE() {
        return CSIZE;
    }
    private static final int CS7 = (int)512L;
    /**
     * {@snippet lang=c :
     * #define CS7 512
     * }
     */
    public static int CS7() {
        return CS7;
    }
    private static final int CS8 = (int)768L;
    /**
     * {@snippet lang=c :
     * #define CS8 768
     * }
     */
    public static int CS8() {
        return CS8;
    }
    private static final int PARENB = (int)4096L;
    /**
     * {@snippet lang=c :
     * #define PARENB 4096
     * }
     */
    public static int PARENB() {
        return PARENB;
    }
    private static final int PARODD = (int)8192L;
    /**
     * {@snippet lang=c :
     * #define PARODD 8192
     * }
     */
    public static int PARODD() {
        return PARODD;
    }
    private static final int ECHOKE = (int)1L;
    /**
     * {@snippet lang=c :
     * #define ECHOKE 1
     * }
     */
    public static int ECHOKE() {
        return ECHOKE;
    }
    private static final int ECHOE = (int)2L;
    /**
     * {@snippet lang=c :
     * #define ECHOE 2
     * }
     */
    public static int ECHOE() {
        return ECHOE;
    }
    private static final int ECHOK = (int)4L;
    /**
     * {@snippet lang=c :
     * #define ECHOK 4
     * }
     */
    public static int ECHOK() {
        return ECHOK;
    }
    private static final int ECHO = (int)8L;
    /**
     * {@snippet lang=c :
     * #define ECHO 8
     * }
     */
    public static int ECHO() {
        return ECHO;
    }
    private static final int ECHONL = (int)16L;
    /**
     * {@snippet lang=c :
     * #define ECHONL 16
     * }
     */
    public static int ECHONL() {
        return ECHONL;
    }
    private static final int ECHOCTL = (int)64L;
    /**
     * {@snippet lang=c :
     * #define ECHOCTL 64
     * }
     */
    public static int ECHOCTL() {
        return ECHOCTL;
    }
    private static final int ISIG = (int)128L;
    /**
     * {@snippet lang=c :
     * #define ISIG 128
     * }
     */
    public static int ISIG() {
        return ISIG;
    }
    private static final int ICANON = (int)256L;
    /**
     * {@snippet lang=c :
     * #define ICANON 256
     * }
     */
    public static int ICANON() {
        return ICANON;
    }
    private static final int IEXTEN = (int)1024L;
    /**
     * {@snippet lang=c :
     * #define IEXTEN 1024
     * }
     */
    public static int IEXTEN() {
        return IEXTEN;
    }
    private static final int TOSTOP = (int)4194304L;
    /**
     * {@snippet lang=c :
     * #define TOSTOP 4194304
     * }
     */
    public static int TOSTOP() {
        return TOSTOP;
    }
    private static final int PENDIN = (int)536870912L;
    /**
     * {@snippet lang=c :
     * #define PENDIN 536870912
     * }
     */
    public static int PENDIN() {
        return PENDIN;
    }

    /**
     * Variadic invoker class for:
     * {@snippet lang=c :
     * int ioctl(int, unsigned long, ...)
     * }
     */
    public static class ioctl {
        private static final FunctionDescriptor BASE_DESC = FunctionDescriptor.of(
                ioctl_h.C_INT,
                ioctl_h.C_INT,
                ioctl_h.C_LONG
            );
        private static final MemorySegment ADDR = ioctl_h.findOrThrow("ioctl");

        private final MethodHandle handle;
        private final FunctionDescriptor descriptor;
        private final MethodHandle spreader;

        private ioctl(MethodHandle handle, FunctionDescriptor descriptor, MethodHandle spreader) {
            this.handle = handle;
            this.descriptor = descriptor;
            this.spreader = spreader;
        }

        /**
         * Variadic invoker factory for:
         * {@snippet lang=c :
         * int ioctl(int, unsigned long, ...)
         * }
         */
        public static ioctl makeInvoker(MemoryLayout... layouts) {
            FunctionDescriptor desc$ = BASE_DESC.appendArgumentLayouts(layouts);
            Linker.Option fva$ = Linker.Option.firstVariadicArg(BASE_DESC.argumentLayouts().size());
            var mh$ = Linker.nativeLinker().downcallHandle(ADDR, desc$, fva$);
            var spreader$ = mh$.asSpreader(Object[].class, layouts.length);
            return new ioctl(mh$, desc$, spreader$);
        }

        /**
         * {@return the address}
         */
        public static MemorySegment address() {
            return ADDR;
        }

        /**
         * {@return the specialized method handle}
         */
        public MethodHandle handle() {
            return handle;
        }

        /**
         * {@return the specialized descriptor}
         */
        public FunctionDescriptor descriptor() {
            return descriptor;
        }

        public int apply(int x0, long x1, Object... x2) {
            try {
                if (TRACE_DOWNCALLS) {
                    traceDowncall("ioctl", x0, x1, x2);
                }
                return (int)spreader.invokeExact(x0, x1, x2);
            } catch(IllegalArgumentException | ClassCastException ex$)  {
                throw ex$; // rethrow IAE from passing wrong number/type of args
            } catch (Throwable ex$) {
               throw new AssertionError("should not reach here", ex$);
            }
        }
    }

    private static class tcgetattr {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of(
            ioctl_h.C_INT,
            ioctl_h.C_INT,
            ioctl_h.C_POINTER
        );

        public static final MemorySegment ADDR = ioctl_h.findOrThrow("tcgetattr");

        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
    }

    /**
     * Function descriptor for:
     * {@snippet lang=c :
     * int tcgetattr(int, struct termios *)
     * }
     */
    public static FunctionDescriptor tcgetattr$descriptor() {
        return tcgetattr.DESC;
    }

    /**
     * Downcall method handle for:
     * {@snippet lang=c :
     * int tcgetattr(int, struct termios *)
     * }
     */
    public static MethodHandle tcgetattr$handle() {
        return tcgetattr.HANDLE;
    }

    /**
     * Address for:
     * {@snippet lang=c :
     * int tcgetattr(int, struct termios *)
     * }
     */
    public static MemorySegment tcgetattr$address() {
        return tcgetattr.ADDR;
    }

    /**
     * {@snippet lang=c :
     * int tcgetattr(int, struct termios *)
     * }
     */
    public static int tcgetattr(int x0, MemorySegment x1) {
        var mh$ = tcgetattr.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                traceDowncall("tcgetattr", x0, x1);
            }
            return (int)mh$.invokeExact(x0, x1);
        } catch (Throwable ex$) {
           throw new AssertionError("should not reach here", ex$);
        }
    }

    private static class tcsetattr {
        public static final FunctionDescriptor DESC = FunctionDescriptor.of(
            ioctl_h.C_INT,
            ioctl_h.C_INT,
            ioctl_h.C_INT,
            ioctl_h.C_POINTER
        );

        public static final MemorySegment ADDR = ioctl_h.findOrThrow("tcsetattr");

        public static final MethodHandle HANDLE = Linker.nativeLinker().downcallHandle(ADDR, DESC);
    }

    /**
     * Function descriptor for:
     * {@snippet lang=c :
     * int tcsetattr(int, int, const struct termios *)
     * }
     */
    public static FunctionDescriptor tcsetattr$descriptor() {
        return tcsetattr.DESC;
    }

    /**
     * Downcall method handle for:
     * {@snippet lang=c :
     * int tcsetattr(int, int, const struct termios *)
     * }
     */
    public static MethodHandle tcsetattr$handle() {
        return tcsetattr.HANDLE;
    }

    /**
     * Address for:
     * {@snippet lang=c :
     * int tcsetattr(int, int, const struct termios *)
     * }
     */
    public static MemorySegment tcsetattr$address() {
        return tcsetattr.ADDR;
    }

    /**
     * {@snippet lang=c :
     * int tcsetattr(int, int, const struct termios *)
     * }
     */
    public static int tcsetattr(int x0, int x1, MemorySegment x2) {
        var mh$ = tcsetattr.HANDLE;
        try {
            if (TRACE_DOWNCALLS) {
                traceDowncall("tcsetattr", x0, x1, x2);
            }
            return (int)mh$.invokeExact(x0, x1, x2);
        } catch (Throwable ex$) {
           throw new AssertionError("should not reach here", ex$);
        }
    }
    private static final long TIOCGETA = 1078490131L;
    /**
     * {@snippet lang=c :
     * #define TIOCGETA 1078490131
     * }
     */
    public static long TIOCGETA() {
        return TIOCGETA;
    }
    private static final long TIOCSETA = 2152231956L;
    /**
     * {@snippet lang=c :
     * #define TIOCSETA 2152231956
     * }
     */
    public static long TIOCSETA() {
        return TIOCSETA;
    }
    private static final int NOFLSH = (int)2147483648L;
    /**
     * {@snippet lang=c :
     * #define NOFLSH 2147483648
     * }
     */
    public static int NOFLSH() {
        return NOFLSH;
    }
}

