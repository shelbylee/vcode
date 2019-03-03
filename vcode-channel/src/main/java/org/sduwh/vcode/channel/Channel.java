package org.sduwh.vcode.channel;

public interface Channel<T> {
    void produce(T message);

    T consume();
}
