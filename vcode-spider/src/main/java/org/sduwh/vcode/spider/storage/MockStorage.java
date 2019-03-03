package org.sduwh.vcode.spider.storage;

import org.sduwh.vcode.data.model.Problem;

public class MockStorage implements Storage {
    @Override
    public void save(Problem problem) {
        System.out.println("Mock saved: " + problem);
    }
}
