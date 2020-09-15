package org.jugru.minijunit.dto;

import lombok.*;

import java.util.List;

@Getter
@Builder
@ToString
@EqualsAndHashCode
@AllArgsConstructor
public class TestClassResult {
    private final String className;
    private final long successTestNumber;
    private final long failedTestNumber;
    private final List<Exception> failedTestExceptions;
}
