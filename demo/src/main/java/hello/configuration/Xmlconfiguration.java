package hello.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * @author lx
 * @create_TIME 2020-03-01-12:36
 */
@Configuration
@ImportResource({"classpath*:applicationContext.xml"})
public class Xmlconfiguration {
}