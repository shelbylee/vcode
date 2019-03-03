package org.sduwh.vcode.data.model;

import lombok.Data;
import lombok.ToString;

import java.sql.Timestamp;

@Data
@ToString
public class Contest {
    private Long id;
    private User user;
    private String title;
    private String description;
    private Timestamp createdAt;
    private Timestamp updatedAt;
}
