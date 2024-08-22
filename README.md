# CVE-2021-44228 Example

Example vulnerability container build for CVE-2021-44228.

DO NOT USE FOR ANYTHING OTHER THAN HIGHLY CONTROLLED SECURITY TESTING. This repository contains a sample application that deliberately uses a dependency with a dangerous remote-code execution vulnerability. Even in a controlled environment, you should not expose this software to public networks.

Simple springboot sample app with vulnerability CVE-2021-44228 aka "Log4Shell" 

To build the Java WAR for the springboot example app,

```
./mvnw package
```

To build a container image for x86 / amd64:

```
podman build --platform linux/amd64 -t log4shell:0.1 . -f ./Dockerfile.amd64
```

To build a container image for OS390:

```
podman build --platform s390x -t quay.io/rhacs-misc/log4shell:os390 ./ -f ./Dockerfile.os390
```
