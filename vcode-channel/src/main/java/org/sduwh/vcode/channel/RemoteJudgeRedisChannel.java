package org.sduwh.vcode.channel;

public class RemoteJudgeRedisChannel extends RedisChannel<RemoteJudgeTask> {
    public RemoteJudgeRedisChannel() {
        super(RedisConfig.channelRemoteJudge, RemoteJudgeTask.class);
    }
}
