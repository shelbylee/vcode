package org.sduwh.vcode.server.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.sql.Timestamp;

@Data
@ToString
@EqualsAndHashCode
public class ProblemListItem {
    private Long id;
    private String title;
    private Timestamp createdAt;
    private Timestamp updatedAt;
}
