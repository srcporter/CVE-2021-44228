./mvnw package
podman build --platform linux/s390x -t quay.io/rhacs-misc/log4shell:os390 ./ -f ./Dockerfile.os390
