package org.sduwh.vcode.spider;

import org.sduwh.vcode.data.model.Origin;
import org.sduwh.vcode.spider.engine.Engine;
import org.sduwh.vcode.spider.engine.Engines;
import org.sduwh.vcode.spider.storage.MockStorage;
import org.sduwh.vcode.spider.storage.Storage;

import java.util.ArrayList;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class VCodeSpider {
    private static Storage storage = new MockStorage();

    public static void main(String[] args) {
        Executors.newSingleThreadScheduledExecutor(r -> new Thread(r, "vcode-spider")).scheduleAtFixedRate(() -> {
            var engines = new ArrayList<Engine>();
            for (var origin : Origin.values()) {
                engines.add(Engines.engine(origin));
            }
            for (var engine : engines) {
                for (var originId = engine.minOriginId(); originId <= engine.maxOriginId(); originId++) {
                    var problem = engine.fetch(originId);
                    storage.save(problem);
                }
            }
        }, 5, 60, TimeUnit.MINUTES);
    }
}
