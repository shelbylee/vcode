package org.sduwh.vcode.spider.engine;

import org.sduwh.vcode.data.model.Problem;

public class SDUTEngine implements Engine {
    @Override
    public Problem fetch(long originId) {
        var problem = new Problem();
        problem.setOriginId(originId);
        return problem;
    }

    @Override
    public long minOriginId() {
        return 0;
    }

    @Override
    public long maxOriginId() {
        return 0;
    }
}
