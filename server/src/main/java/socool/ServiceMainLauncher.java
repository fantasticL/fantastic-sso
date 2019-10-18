package socool;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by administrator_cheng on 2019/3/26.
 */
@EnableEurekaServer
@SpringBootApplication
public class ServiceMainLauncher {

    public static void main(String[] args) {
        SpringApplication.run(ServiceMainLauncher.class, args);
    }
}
