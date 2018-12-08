package org.sduwh.vcode.server.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.springframework.data.annotation.Id;

@Data
@ToString
@EqualsAndHashCode
public class Contest {
    @Id
    private String id;
}
