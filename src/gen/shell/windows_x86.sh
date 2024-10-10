./jextract-22/bin/jextract \
        --output src/main/java \
        --target-package dev.mccue.tui.os.windows.amd64 \
        --include-function GetConsoleMode \
        --include-function SetConsoleMode \
        --include-constant ENABLE_ECHO_INPUT \
        --include-constant ENABLE_PROCESSED_INPUT \
        --include-constant ENABLE_LINE_INPUT \
        --include-constant ENABLE_PROCESSED_OUTPUT \
        --include-typedef HANDLE \
        --include-function GetConsoleScreenBufferInfo \
        --include-function GetCurrentProcess \
        --include-function DuplicateHandle \
        --include-constant DUPLICATE_SAME_ACCESS \
        --include-function GetStdHandle \
        --include-constant STD_OUTPUT_HANDLE \
        src/gen/c/windows.h