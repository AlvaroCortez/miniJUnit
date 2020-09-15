package org.jugru.minijunit.dto;

import lombok.*;

import java.util.List;

@Getter
@Builder
@ToString
@EqualsAndHashCode
@AllArgsConstructor
public class CommandLineArgsParserResult {
    private final List<Class<?>> testClasses;
    private final List<String> errorClasses;
}
