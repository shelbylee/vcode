package org.sduwh.vcode.server.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.springframework.data.annotation.Id;

@Data
@ToString
@EqualsAndHashCode
public class Problem {
    @Id
    private String id;
    private String userId;
    private String title;
    private String content;
}
