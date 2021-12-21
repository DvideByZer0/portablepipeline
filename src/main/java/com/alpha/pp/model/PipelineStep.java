package com.alpha.pp.model;

/**
 * Pipeline step
 */
public class PipelineStep {

    /** 
     * Step name.
     */
    String name;

    /**
     * Container image.
     */
    String image;

    /**
     * Container arguments.
     */
    String[] arguments;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String[] getArguments() {
        return arguments;
    }

    public void setArguments(String[] arguments) {
        this.arguments = arguments;
    }
}
