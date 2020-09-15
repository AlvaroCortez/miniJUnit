package org.jugru.minijunit.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Getter
@Builder
@AllArgsConstructor
public class TestClassResult {
    private final String className;
    private final long successTestNumber;
    private final long failedTestNumber;
    private final List<Exception> failedTestExceptions;
}
