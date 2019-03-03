package org.sduwh.vcode.data.model;

import lombok.Data;
import lombok.ToString;

import java.sql.Timestamp;

@Data
@ToString
public class Problem {
    private Long id;
    private User user;
    private Origin origin;
    private Long originId;
    private String title;
    private String timeLimit;
    private String memoryLimit;
    private String description;
    private Timestamp createdAt;
    private Timestamp updatedAt;
}
