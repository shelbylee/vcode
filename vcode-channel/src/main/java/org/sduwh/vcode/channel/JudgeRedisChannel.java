package org.sduwh.vcode.channel;

public class JudgeRedisChannel extends RedisChannel<JudgeTask> {
    public JudgeRedisChannel() {
        super(RedisConfig.channelJudge, JudgeTask.class);
    }
}
