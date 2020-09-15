package org.jugru.minijunit;

import org.jugru.minijunit.annotation.Test;
import org.jugru.minijunit.dto.CommandLineArgsParserResult;
import org.jugru.minijunit.help.ClassWithGoodTests;

import java.util.List;

import static java.util.Collections.emptyList;
import static java.util.Collections.singletonList;
import static org.jugru.minijunit.assertion.Assert.assertEquals;

public class CommandLineArgsParserTest {
    private final CommandLineArgsParser parser = new CommandLineArgsParser();

    @Test
    public void parseArgs_noArg() {
        final CommandLineArgsParserResult parserResult = CommandLineArgsParserResult.builder()
                .testClasses(emptyList())
                .errorClasses(emptyList())
                .build();
        assertEquals(parserResult, parser.parseArgs(new String[]{}));
    }

    @Test
    public void parseArgs_wrongClass() {
        final List<String> errorClasses = singletonList("Class");
        final CommandLineArgsParserResult parserResult = CommandLineArgsParserResult.builder()
                .testClasses(emptyList())
                .errorClasses(errorClasses)
                .build();
        assertEquals(parserResult, parser.parseArgs(new String[]{"Class"}));
    }

    @Test
    public void parseArgs_testClass() {
        final List<Class<?>> classes = singletonList(ClassWithGoodTests.class);
        final CommandLineArgsParserResult parserResult = CommandLineArgsParserResult.builder()
                .testClasses(classes)
                .errorClasses(emptyList())
                .build();
        assertEquals(parserResult, parser.parseArgs(new String[]{"org.jugru.minijunit.help.ClassWithGoodTests"}));
    }
}
