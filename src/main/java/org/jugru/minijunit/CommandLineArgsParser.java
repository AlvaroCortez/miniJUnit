package org.jugru.minijunit;

import org.jugru.minijunit.dto.CommandLineArgsParserResult;

import java.util.LinkedList;
import java.util.List;

public class CommandLineArgsParser {

    public CommandLineArgsParserResult parseArgs(String[] args) {
        final List<Class<?>> testClasses = new LinkedList<>();
        final List<String> errorClasses = new LinkedList<>();

        for (String arg : args) {
            try {
                testClasses.add(Class.forName(arg));
            } catch (ClassNotFoundException e) {
                errorClasses.add(arg);
            }
        }
        return CommandLineArgsParserResult.builder()
                .testClasses(testClasses)
                .errorClasses(errorClasses)
                .build();
    }
}
