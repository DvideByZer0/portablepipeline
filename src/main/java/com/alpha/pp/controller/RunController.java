package com.alpha.pp.controller;

import static org.springframework.http.HttpStatus.CREATED;

import java.util.Arrays;

import com.alpha.pp.model.Pipeline;
import com.alpha.pp.model.PipelineStep;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 * Run pipeline controller
 */
@RestController
@RequestMapping("/run")
public class RunController {

    /**
     * Get logger.
     */
    Logger logger = LoggerFactory.getLogger(RunController.class);

    /**
     * Run pipeline.
     * 
     * Invoked with HTTP POST.
     * 
     * @param pipeline pipeline object.
     * 
     * @return
     */
    @PostMapping
    @ResponseStatus(CREATED)
	public String run(@RequestBody Pipeline pipeline) {

        // prepare pipeline
        logger.debug("Starting execution of pipeline: "+ pipeline.getName());

        // execute steps
        PipelineStep[] steps = pipeline.getSteps();

        Arrays.stream(steps).forEach(s -> logger.debug("Executing step: "+s.getName()));

        // complete execution
        logger.debug("Completed execution of pipeline: "+ pipeline.getName());

		return "run";    
    }
}
