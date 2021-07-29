package com.martensigwart.fakeload.docker;

import com.martensigwart.fakeload.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.TimeUnit;

public class Application {
    private static final Logger logger = LoggerFactory.getLogger(java.util.logging.Logger.class);

    public static void main(String[] args) {
        logger.debug("Started fakeload, Java Version: {}", System.getProperty("java.version"));

        // Creation
        FakeLoad fakeload = FakeLoads.create()
                .lasting(60, TimeUnit.SECONDS)
                .withCpu(80)
                .withMemory(300, MemoryUnit.MB);

        // Execution
        FakeLoadExecutor executor = FakeLoadExecutors.newDefaultExecutor();
        executor.execute(fakeload);
    }
}
