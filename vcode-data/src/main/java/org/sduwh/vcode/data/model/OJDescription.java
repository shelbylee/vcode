package org.sduwh.vcode.data.model;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class OJDescription {
    private String input;
    private String output;
    private String sampleInput;
    private String sampleOutput;
    private String hint;
    private String source;
}
