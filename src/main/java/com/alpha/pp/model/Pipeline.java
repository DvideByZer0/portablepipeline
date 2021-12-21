package com.alpha.pp.model;

public class Pipeline {

    /**
     * Pipleline name.
     */
    String name;

    /**
     * Pipeline steps.
     */
    PipelineStep[] steps;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PipelineStep[] getSteps() {
        return steps;
    }

    public void setSteps(PipelineStep[] steps) {
        this.steps = steps;
    }
}
