package com.my.batch;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.explore.support.SimpleJobExplorer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
@EnableBatchProcessing
public class BatchApplication {

    public static void main(String[] args) {

        SpringApplication.run(BatchApplication.class, args);

        /*ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("job.xml");
        SimpleJobExplorer launcher = (SimpleJobExplorer) ctx.getBean("launcher");
        Job job = (Job) ctx.getBean("jobExample");
        System.out.println("=========="+launcher);
        System.out.println("=========="+job);
        launcher*/
    }

}
