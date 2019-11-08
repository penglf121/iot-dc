package com.theembers.iot;

import com.theembers.iot.collector.AbstractCollectorRunner;
import com.theembers.iot.collector.DataCollector;
import com.theembers.iot.config.NettyConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 基于 netty 实现的采集器执行者
 * 也就是之前s-0.1这的netty实现方案
 *
 * @author TheEmbers Guo
 * createTime 2019-11-06 14:46
 */
@Component
public class NettyCollectorRunner extends AbstractCollectorRunner<NettyConfig> {
    @Autowired
    private NettyConfig nettyConfig;
    @Autowired
    private DataCollector<NettyConfig> collector;

    @Override
    public NettyConfig setCollectorConfig() {
        return nettyConfig;
    }

    @Override
    public DataCollector setDataCollector() {
        return collector;
    }


}
