package org.sduwh.vcode.spider.engine;

import org.sduwh.vcode.data.model.Origin;

import java.util.HashMap;
import java.util.Map;

public class Engines {
    private static Map<Origin, Engine> engines;

    static {
        engines = new HashMap<>();
        engines.put(Origin.POJ, new POJEngine());
        engines.put(Origin.HDU, new HDUEngine());
        engines.put(Origin.SDUT, new SDUTEngine());
    }

    public static Engine engine(Origin origin) {
        return engines.get(origin);
    }
}
