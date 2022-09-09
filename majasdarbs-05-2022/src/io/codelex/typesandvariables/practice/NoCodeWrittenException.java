package io.codelex.typesandvariables.practice;

public class NoCodeWrittenException extends RuntimeException {
    public NoCodeWrittenException() {
        super("Sorry, no code written :(");
    }
}
