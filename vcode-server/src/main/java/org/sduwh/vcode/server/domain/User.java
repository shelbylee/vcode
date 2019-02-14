package org.sduwh.vcode.server.domain;

import lombok.Data;
import lombok.ToString;

import java.sql.Timestamp;

@Data
@ToString
public class User {
    private Long id;
    private String email;
    private String username;
    private String password;
    private Timestamp createdAt;
    private Timestamp updatedAt;
}
