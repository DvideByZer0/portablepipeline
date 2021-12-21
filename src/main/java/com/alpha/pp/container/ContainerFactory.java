package com.alpha.pp.container;

import com.github.dockerjava.api.DockerClient;
import com.github.dockerjava.core.DefaultDockerClientConfig;
import com.github.dockerjava.core.DockerClientBuilder;

/**
 * Utilitiy for handling containers
 */
public class ContainerFactory {
    
    /**
     * Docker client instance.
     */
    static DockerClient client; 

    /**
     * Create Docker client configuration.
     * 
     * @return Docker client configuration.
     */
    public static DefaultDockerClientConfig getConfigInstance() {
        DefaultDockerClientConfig config
        = DefaultDockerClientConfig.createDefaultConfigBuilder()
          .withDockerHost("unix:///var/run/docker.sock").build();
        return config;
    }    

    /**
     * Create Docker client.
     * 
     * @return Docker client.
     */
    public static DockerClient getClientInstance() {
        if(client != null) return client;

        DefaultDockerClientConfig config = getConfigInstance();
        DockerClient dockerClient = DockerClientBuilder.getInstance(config).build();    
        client = dockerClient;
        return dockerClient;
    }
}
