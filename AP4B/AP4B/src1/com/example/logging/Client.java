package com.example.logging;

public class Client {
    public static void main(String[] args) {
        // Create handlers
        LogHandler infoHandler = new InfoHandler();
        LogHandler debugHandler = new DebugHandler();
        LogHandler errorHandler = new ErrorHandler();

        // Set up chain of responsibility
        infoHandler.setNextHandler(debugHandler);
        debugHandler.setNextHandler(errorHandler);

        // Create Logger and commands
        Logger logger = new Logger();
        logger.addCommand(new LogCommand(infoHandler));
        logger.addCommand(new LogCommand(debugHandler));
        logger.addCommand(new LogCommand(errorHandler));

        // Process commands
        System.out.println("Processing logs:");
        logger.processCommands();

        // Example specific logs
        System.out.println("\nExample logs:");
        infoHandler.handle("This is an info message", LogLevel.INFO);
        debugHandler.handle("This is a debug message", LogLevel.DEBUG);
        errorHandler.handle("This is an error message", LogLevel.ERROR);
    }
}