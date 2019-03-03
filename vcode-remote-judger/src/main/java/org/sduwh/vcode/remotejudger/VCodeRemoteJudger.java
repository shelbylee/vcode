package org.sduwh.vcode.remotejudger;

import org.sduwh.vcode.channel.*;
import org.sduwh.vcode.channel.RemoteJudgeTask;

public class VCodeRemoteJudger {
    private static Channel<RemoteJudgeTask> channel = new RemoteJudgeRedisChannel();

    public static void main(String[] args) {
        new Thread(() -> {
            while (true) {
                RemoteJudgeTask task = channel.consume();
                System.out.println(task);
            }
        }, "vcode-remote-judger-worker").start();
    }
}
