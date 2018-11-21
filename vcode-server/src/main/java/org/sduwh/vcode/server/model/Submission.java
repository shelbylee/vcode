package org.sduwh.vcode.server.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@ToString
@EqualsAndHashCode
public class Submission {
    private Long id;
    private Long userId;
    private Status status;
    private Long memory;
    private Long cpuTime;
    private Long realTime;

    public enum Status {
        WAITING, QUEUEING, JUDGING
    }
}
