package socool;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Created by administrator_cheng on 2019/3/26.
 */
@EnableEurekaClient
@SpringBootApplication
public class MainLauncher {

    public static void main(String[] args) {

        SpringApplication.run(MainLauncher.class, args);
    }
}
