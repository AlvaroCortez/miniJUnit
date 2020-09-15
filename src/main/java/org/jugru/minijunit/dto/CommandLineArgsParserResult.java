package org.jugru.minijunit.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Getter
@Builder
@AllArgsConstructor
public class CommandLineArgsParserResult {
    private final List<Class<?>> testClasses;
    private final List<String> errorClasses;
}
