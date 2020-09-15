package org.jugru.minijunit.dto;

import lombok.*;

@Getter
@Builder
@ToString
@EqualsAndHashCode
@AllArgsConstructor
public class TestResult {
    private final Exception exception;
    private final boolean success;
}
