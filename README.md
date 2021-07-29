# FakeLoad Docker Example
Example project demonstrating how to use the [FakeLoad](https://github.com/msigwart/fakeload) library for simulating system load within a Docker container.

## Getting started
Build the docker image by executing the following commands.
```
mvn clean install
```

```
docker build . -t fakeload-docker
```

Then run the image with the following commands.
```
docker run -d fakeload-docker
```
