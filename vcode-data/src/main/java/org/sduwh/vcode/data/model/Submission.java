package org.sduwh.vcode.data.model;

import lombok.Data;
import lombok.ToString;

import java.sql.Timestamp;

@Data
@ToString
public class Submission {
    private Long id;
    private User user;
    private Problem problem;
    private String code;
    private Language language;
    private Status status;
    private Timestamp createdAt;
    private Timestamp updatedAt;
}
