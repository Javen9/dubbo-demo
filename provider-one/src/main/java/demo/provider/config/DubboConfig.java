package demo.provider.config;

import com.alibaba.dubbo.config.ProtocolConfig;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by javen on 2017/9/18.
 */
@Configuration
@ConfigurationProperties(
        prefix = "spring.dubbo.custom"
)
public class DubboConfig {

    private ProtocolConfig protocol;

    @Bean
    public ProtocolConfig customProtocolConfig() {
        return protocol;
    }

    public ProtocolConfig getProtocol() {
        return protocol;
    }

    public void setProtocol(ProtocolConfig protocol) {
        this.protocol = protocol;
    }
}
