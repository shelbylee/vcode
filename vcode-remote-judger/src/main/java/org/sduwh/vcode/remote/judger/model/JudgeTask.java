package org.sduwh.vcode.remote.judger.model;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class JudgeTask {
    private String businessKey;
    private RemoteOJ remoteOJ;
    private Long remoteID;
    private JudgeLanguage language;
    private String code;
}
