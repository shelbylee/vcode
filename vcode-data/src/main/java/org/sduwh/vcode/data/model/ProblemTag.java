package org.sduwh.vcode.data.model;

import lombok.Data;
import lombok.ToString;

import java.sql.Timestamp;

@Data
@ToString
public class ProblemTag {
    private Long id;
    private Problem problem;
    private String name;
    private Timestamp createdAt;
    private Timestamp updatedAt;
}
