package com.example.logging;

public interface Command {
    void execute(String message, LogLevel level);
}