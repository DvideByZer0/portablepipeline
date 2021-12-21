package com.alpha.build.controller;

import static com.alpha.build.container.ContainerFactory.getClientInstance;
import static org.springframework.http.HttpStatus.OK;
import static com.alpha.build.Constants.VERSION;

import com.alpha.build.Constants;
import com.github.dockerjava.api.DockerClient;
import com.github.dockerjava.api.command.VersionCmd;
import com.github.dockerjava.api.model.Version;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 * Get version controller
 */
@RestController
@RequestMapping("/version")
public class VersionController {
    
    /**
     * Get logger.
     */
    Logger logger = LoggerFactory.getLogger(RunController.class);

    /**
     * Get version information.
     * 
     * Invoked with HTTP Get.
     * 
     * @return version information for the project and the used container runtime.
     */
    @GetMapping
    @ResponseBody    
    @ResponseStatus(OK)    
    public String getVersion() {

        logger.debug("Starting execution of getting version info");

        StringBuilder builder = new StringBuilder();
        builder.append("Version: ");
        builder.append(VERSION);
        builder.append("\n");
        builder.append("Container runtime version: ");
        builder.append(resolveDockerVersion());
        builder.append("\n");

        logger.debug("Completed execution of getting version info");

        return builder.toString();
    }

    /**
     * Resolve the version of the Docker runtime.
     * 
     * @return the version of the Docker runtime
     */
    String  resolveDockerVersion() {

        // get client
        DockerClient client = getClientInstance();

        // get version
        VersionCmd versionCmd = client.versionCmd();
        Version version = versionCmd.exec();
        String versionAsString = version.getVersion();

        // verifiy version is defined
        if (versionAsString == null ) return "N/A";
        if (versionAsString.isEmpty()) return "N/A";
        return versionAsString;
    }    
}
