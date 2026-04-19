---
description: Akka Management is a suite of tools for operating Akka Clusters.
knowledge_type: official_documentation
scraped_at: '2026-04-06T13:43:19Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-management/current/kubernetes-deployment/building-using-maven.html
title: Building using Maven • Akka Management
---

# Building using Maven • Akka Management

> **Summary:** Akka Management is a suite of tools for operating Akka Clusters.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Building using Maven

There are a number of Maven plugins available for building and deploying Docker images. We’re going to use [Fabric8](https://maven.fabric8.io/).

### Git hash based version numbers

There are a number of Maven plugins available for interacting with git, we recommend the [Maven git commit id plugin](https://github.com/git-commit-id/maven-git-commit-id-plugin). This plugin will allow us to make certain git based properties available to the build, which we can then use to compute the version number.

To use it, add this plugin to the build section of your parent POM:

```
<plugin>
    <groupId>pl.project13.maven</groupId>
    <artifactId>git-commit-id-plugin</artifactId>
    <version>4.0.0</version>
    <executions>
        <execution>
            <phase>validate</phase>
            <goals>
                <goal>revision</goal>
            </goals>
        </execution>
    </executions>
    <configuration>
        <dateFormat>yyyyMMdd-HHmmss</dateFormat>
        <generateGitPropertiesFile>false</generateGitPropertiesFile>
    </configuration>
</plugin>

```

Now, in the properties section of the parent POM, create a version number based on the commit time and id. Using the commit time is useful because it makes it possible to sort tags chronologically:

```
<properties>
   <version.number>${git.commit.time}-${git.commit.id.abbrev}</version.number>
</properties>

```
Note
The version number will only change when you create a new git commit. If you are not using the `latest` tag in your deployment spec, then make sure when you update your project and want to redeploy, that you commit your changes first so you get a new version number, and to ensure that version number correlates to what is in the git repository at that commit hash.

## Configuring the Fabric8 Docker plugin

```
<plugin>
    <groupId>io.fabric8</groupId>
    <artifactId>docker-maven-plugin</artifactId>
    <version>0.34.1</version>
    <configuration>
        <images>
            <image>
                <name>%a</name>
                <build>
                    <from>adoptopenjdk:11-jre-hotspot</from>
                    <tags>
                        <tag>latest</tag>
                        <tag>${version.number}</tag>
                    </tags>
                    <entryPoint>
                        <exec>
                            <arg>java</arg>
                            <arg>-cp</arg>
                            <arg>/maven/*</arg>
                            <arg>akka.cluster.bootstrap.demo.DemoApp</arg>
                        </exec>
                    </entryPoint>
                    <assembly>
                        <descriptorRef>artifact-with-dependencies</descriptorRef>
                    </assembly>
                </build>
            </image>
        </images>
    </configuration>
    <executions>
       <execution>
           <id>build-docker-image</id>
           <phase>package</phase>
           <goals>
               <goal>build</goal>
           </goals>
       </execution>
     </executions>
</plugin>

```

There are two things to pay careful attention to here. 

- The base image we’re using is `adoptopenjdk:11-jre-hotspot`. You can use any Docker image that provides a JRE, this is the one we recommend for open source users of Kubernetes.
- `docker:build` is added to the `package` phase do that the Docker image is built when running `mvn package`
- Versions `latest` and `${version.number}` are tagged
- Artifact with dependencies is set for the assembly. Meaning your application and its dependencies are added to `/maven` in the Docker image

## Building the Docker image

To build and publish the image run the following. The Docker username and registry are taken from system properties.

Note that the registry to push to must include the username, for example `-Ddocker.registry=docker.io/youruser`.

Security information (i.e. user and password) can be specified in multiple ways as described in section [docker\-maven\-plugin authentication](https://dmp.fabric8.io/#authentication).

```
mvn -Ddocker.username=<user> -Ddocker.registry=<registry>/<user> package docker:push

```

## Code Examples

### Example 1: Git hash based version numbers

```xml
<plugin>
    <groupId>pl.project13.maven</groupId>
    <artifactId>git-commit-id-plugin</artifactId>
    <version>4.0.0</version>
    <executions>
        <execution>
            <phase>validate</phase>
            <goals>
                <goal>revision</goal>
            </goals>
        </execution>
    </executions>
    <configuration>
        <dateFormat>yyyyMMdd-HHmmss</dateFormat>
        <generateGitPropertiesFile>false</generateGitPropertiesFile>
    </configuration>
</plugin>
```

### Example 2: Git hash based version numbers

```xml
<properties>
   <version.number>${git.commit.time}-${git.commit.id.abbrev}</version.number>
</properties>
```

### Example 3: Configuring the Fabric8 Docker plugin

```xml
<plugin>
    <groupId>io.fabric8</groupId>
    <artifactId>docker-maven-plugin</artifactId>
    <version>0.34.1</version>
    <configuration>
        <images>
            <image>
                <name>%a</name>
                <build>
                    <from>adoptopenjdk:11-jre-hotspot</from>
                    <tags>
                        <tag>latest</tag>
                        <tag>${version.number}</tag>
                    </tags>
                    <entryPoint>
                        <exec>
                            <arg>java</arg>
                            <arg>-cp</arg>
                            <arg>/maven/*</arg>
                            <arg>akka.cluster.bootstrap.demo.DemoApp</arg>
                        </exec>
                    </entryPoint>
                    <assembly>
                        <descriptorRef>artifact-with-dependencies</descriptorRef>
                    </assembly>
                </build>
            </image>
        </images>
    </configuration>
    <executions>
       <execution>
           <id>build-docker-image</id>
           <phase>package</phase>
           <goals>
               <goal>build</goal>
           </goals>
       </execution>
     </executions>
</plugin>
```

### Example 4: Building the Docker image

```text
mvn -Ddocker.username=<user> -Ddocker.registry=<registry>/<user> package docker:push
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/libraries/akka-management/current/kubernetes-deployment/building-using-sbt.html
- https://doc.akka.io/libraries/akka-management/current/kubernetes-deployment/deploying.html

---
*Source: [https://doc.akka.io/libraries/akka-management/current/kubernetes-deployment/building-using-maven.html](https://doc.akka.io/libraries/akka-management/current/kubernetes-deployment/building-using-maven.html)*