package com.dipanjan.controller;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JobController {
    @Autowired
    private JobLauncher jobLauncher;

    @Autowired
    private Job createJob;

    @GetMapping("/joblauncher")
    public void handle() throws Exception{
        jobLauncher.run(createJob, new JobParameters());
    }

}
