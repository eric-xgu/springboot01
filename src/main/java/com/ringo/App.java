package com.ringo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class App 
{
    private  static Logger logger= LoggerFactory.getLogger(App.class);
    public static void main( String[] args )
    {
        logger.info("启动");
        //通过内嵌的tomcat
        //SpringApplication.run(App.class);
        //关闭banner对象
        SpringApplication springApplication=new SpringApplication(App.class);
        springApplication.setBannerMode(Banner.Mode.OFF);
        springApplication.run();
    }
}
