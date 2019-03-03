package org.sduwh.vcode.judger;

import org.sduwh.vcode.channel.Channel;
import org.sduwh.vcode.channel.JudgeRedisChannel;
import org.sduwh.vcode.channel.JudgeTask;

public class VCodeJudger {
    private Channel<JudgeTask> channel = new JudgeRedisChannel();
    private Thread worker = new Thread(() -> {
        while (true) {
            JudgeTask task = channel.consume();
            System.out.println(task);
        }
    }, "vcode-judger-worker");

    public static void main(String[] args) {
        new VCodeJudger().worker.start();
    }
}
