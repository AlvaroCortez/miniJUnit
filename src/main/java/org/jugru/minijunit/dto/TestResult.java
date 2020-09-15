package org.jugru.minijunit.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
@AllArgsConstructor
public class TestResult {
    private final Exception exception;
    private final boolean success;
}
