package org.sduwh.vcode.spider.engine;

import org.sduwh.vcode.data.model.Problem;

public interface Engine {
    Problem fetch(long originId);

    long minOriginId();

    long maxOriginId();
}
