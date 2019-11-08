package com.theembers.iot.config;


import com.theembers.iot.collector.DataCollectorConfig;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "theembers.iot.netty")
public class NettyConfig extends DataCollectorConfig {
    private Integer port;

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }
}
