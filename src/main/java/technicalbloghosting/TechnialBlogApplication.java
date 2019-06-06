package technicalbloghosting;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class TechnialBlogApplication {
    public static void main (String[] args){
        SpringApplication.run(TechnialBlogApplication.class,args);
    }

}
