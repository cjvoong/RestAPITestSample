FROM hbriese/maven-openjdk16:latest

ARG USERNAME
ARG PASSWORD
ARG BRANCH
RUN mkdir -p /build
RUN mkdir -p /build/.m2/repository
WORKDIR /build
RUN apt-get update && apt-get install -y git

WORKDIR /build/isp-be-integration-test
COPY ./ ./
RUN mvn dependency:purge-local-repository -Dmaven.repo.local=.m2/repository
RUN mvn clean install -DskipTests=true -Dtest.included.groups=SIB -Dmaven.repo.local=.m2/repository

RUN chmod -R 777 /build

CMD bash
