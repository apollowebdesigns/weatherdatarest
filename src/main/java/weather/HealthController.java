package weather;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.concurrent.atomic.AtomicLong;

@Configuration
@ImportResource({"classpath*:applicationContext.xml"})
public class HealthController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting")
    public String greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new JavaConfiguration().someDummyBean1();
    }
}

@Configuration
class JavaConfiguration {

    @Bean
    public String someDummyBean1() {
        return "someDummyBean1";
    }

    @Bean
    public String someDummyBean2() {
        return "someDummyBean2";
    }

}