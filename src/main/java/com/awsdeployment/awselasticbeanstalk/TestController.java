package com.awsdeployment.awselasticbeanstalk;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/hello")
@RestController
public class TestController {

    public String hello() {
        return "This is Spring Boot and CI/CD deployment using AWS CodePipeline.";
    }
}
