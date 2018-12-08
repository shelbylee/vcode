package org.sduwh.vcode.server.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;

@Data
@ToString
@EqualsAndHashCode
public class User {
    @Id
    private String id;
    @Indexed(unique = true)
    private String username;
    private String password;
}
