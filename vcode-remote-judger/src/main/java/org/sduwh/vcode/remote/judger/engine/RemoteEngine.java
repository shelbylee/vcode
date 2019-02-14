package org.sduwh.vcode.remote.judger.engine;

import org.sduwh.vcode.remote.judger.exception.JudgeException;
import org.sduwh.vcode.remote.judger.model.JudgeReply;
import org.sduwh.vcode.remote.judger.model.JudgeTask;

public interface RemoteEngine {
    JudgeReply judge(JudgeTask task) throws JudgeException;
}
