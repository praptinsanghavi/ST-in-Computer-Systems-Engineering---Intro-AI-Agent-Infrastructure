---
description: Akka gRPC - Support for building streaming gRPC servers and clients on
  top of Akka Streams.
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:17:21Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-grpc/current/buildtools/maven.html
title: Maven • Akka gRPC
---

# Maven • Akka gRPC

> **Summary:** Akka gRPC - Support for building streaming gRPC servers and clients on top of Akka Streams.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Maven

Note
The Akka dependencies are available from Akka’s secure library repository. To access them you need to use a secure, tokenized URL as specified at <https://account.akka.io/token>.

To add the Akka gRPC maven plugin to a project:

`pom.xml`

```
<project>
  <modelVersion>4.0.0</modelVersion>
  <name>Project name</name>
  <groupId>com.example</groupId>
  <artifactId>my-grpc-app</artifactId>
  <version>0.1-SNAPSHOT</version>
  <properties>
<akka.grpc.version>2.5.10</akka.grpc.version>
<grpc.version>1.77.0</grpc.version>
<project.encoding>UTF-8</project.encoding>
  </properties>
  <repositories>
<repository>
  <id>akka-repository</id>
  <name>Akka library repository</name>
  <url>https://repo.akka.io/<your token>/secure</url>
</repository>
  </repositories>
  <pluginRepositories>
<pluginRepository>
  <id>akka-repository</id>
  <name>Akka library repository</name>
  <url>https://repo.akka.io/<your token>/secure</url>
</pluginRepository>
  </pluginRepositories>
  <dependencies>
<dependency>
  <groupId>com.lightbend.akka.grpc</groupId>
  <artifactId>akka-grpc-runtime_2.13</artifactId>
  <version>${akka.grpc.version}</version>
</dependency>
<!-- for loading of cert, issue #89 -->
<dependency>
  <groupId>io.grpc</groupId>
  <artifactId>grpc-testing</artifactId>
  <version>${grpc.version}</version>
</dependency>
  </dependencies>
  <build>
<plugins>
  <plugin>
    <groupId>com.lightbend.akka.grpc</groupId>
    <artifactId>akka-grpc-maven-plugin</artifactId>
    <version>${akka.grpc.version}</version>
    <!-- Hook the generate goal into the lifecycle,
         automatically tied to generate-sources -->
    <executions>
      <execution>
        <goals>
          <goal>generate</goal>
        </goals>
      </execution>
    </executions>
  </plugin>
</plugins>
  </build>
</project>

```

For a step by step getting started with Akka gRPC read the [client](../client/index.html) or [server](../server/index.html) introductions.

## Configuring what to generate

The plugin can be configured to generate either Java or Scala classes, and then server and or client for the chosen language. By default, both client and server in Java are generated.

Java

```
<plugin>
    <groupId>com.lightbend.akka.grpc</groupId>
    <artifactId>akka-grpc-maven-plugin</artifactId>
    <version>${akka.grpc.version}</version>
    <configuration>
      <language>Java</language>
      <generateClient>false</generateClient>
      <generateServer>true</generateServer>
    </configuration>
</plugin>

```

Scala

```
<plugin>
    <groupId>com.lightbend.akka.grpc</groupId>
    <artifactId>akka-grpc-maven-plugin</artifactId>
    <version>${akka.grpc.version}</version>
    <configuration>
      <language>Scala</language>
      <generateClient>false</generateClient>
      <generateServer>true</generateServer>
    </configuration>
</plugin>

```

### Generating server “power APIs”

To additionally generate server “power APIs” that have access to request metadata, as described [here](../server/details.html#accessing-request-metadata), set the `serverPowerApis` tag as true:

`pom.xml`

```
<plugin>
    ...
    <configuration>
      ...
      <generatorSettings>
        <serverPowerApis>true</serverPowerApis>
      </generatorSettings>
    </configuration>
</plugin>

```

## Proto source directory

By default the plugin looks for `.proto`\-files under `src/main/protobuf` (and `src/main/proto`). This can be changed with the `protoPaths` setting, which is a relative path to the project basedir. The below configuration overrides the proto path to be only `src/main/protobuf`:

`pom.xml`

```
<plugin>
    <groupId>com.lightbend.akka.grpc</groupId>
    <artifactId>akka-grpc-maven-plugin</artifactId>
    <version>${akka.grpc.version}</version>
    <configuration>
      <protoPaths>
        <protoPath>src/main/protobuf</protoPath>
      </protoPaths>
    </configuration>
</plugin>

```

## Loading proto files from artifacts

Instead of duplicating the `.proto` definitions between server and client projects, you can add artifacts that contain proto definitions to your build.

A full example of a maven build definition can be found [here](https://github.com/akka/akka-grpc/blob/main/plugin-tester-java/pom.xml) which allows to import external protos like this:

Java

```
[source](https://github.com/akka/akka-grpc/tree/v2.5.10/plugin-tester-java/src/main/protobuf/helloworld.proto#L12-L13 "Go to snippet source")import "google/api/annotations.proto";
import "google/api/httpbody.proto";
```

The `pom.xml` has to be adjusted as follows. As a first step in the `<build>`, the `maven-dependency-plugin` needs to pull in the artifacts containing the protobuf file. The `<outputDirectory>` is the place where the protos from the dependencies are getting placed into (`target`):

Java

```
[source](https://github.com/akka/akka-grpc/tree/v2.5.10/plugin-tester-java/pom.xml#L85-L115 "Go to snippet source")<execution>
  <id>unpack</id>
  <phase>generate-sources</phase>
  <goals>
    <goal>unpack</goal>
  </goals>
  <configuration>
    <artifactItems>
      <artifactItem>
        <groupId>com.google.protobuf</groupId>
        <artifactId>protobuf-java</artifactId>
        <version>${protobuf-java.version}</version>
        <type>jar</type>
        <overWrite>true</overWrite>
        <outputDirectory>${project.build.directory}/proto</outputDirectory>
        <includes>**/*.proto</includes>
      </artifactItem>
      <artifactItem>
        <groupId>com.google.api.grpc</groupId>
        <artifactId>proto-google-common-protos</artifactId>
        <version>${proto-google-common-protos.version}</version>
        <type>jar</type>
        <overWrite>true</overWrite>
        <outputDirectory>${project.build.directory}/proto</outputDirectory>
        <includes>**/*.proto</includes>
      </artifactItem>
    </artifactItems>
    <overWriteReleases>false</overWriteReleases>
    <overWriteSnapshots>true</overWriteSnapshots>
  </configuration>
</execution>
```

Finally, the `target/proto` directory has to be introduced to the `akka-grpc-maven-plugin` to be picket up during `protoc` compilation. Make sure to include all other folders from the project as well, since the definition of `<protoPaths>` overrides the default:

Java

```
[source](https://github.com/akka/akka-grpc/tree/v2.5.10/plugin-tester-java/pom.xml#L141-L145 "Go to snippet source")<protoPaths>
  <protoPath>target/proto</protoPath>
  <protoPath>src/main/proto</protoPath>
  <protoPath>src/main/protobuf</protoPath>
</protoPaths>
```

## Starting your Akka gRPC server from Maven

You can start your gRPC application as usual with:

```
mvn compile exec:exec

```

## Code Examples

### Example 1: Maven

```xml
<project>
  <modelVersion>4.0.0</modelVersion>
  <name>Project name</name>
  <groupId>com.example</groupId>
  <artifactId>my-grpc-app</artifactId>
  <version>0.1-SNAPSHOT</version>
  <properties>
<akka.grpc.version>2.5.10</akka.grpc.version>
<grpc.version>1.77.0</grpc.version>
<project.encoding>UTF-8</project.encoding>
  </properties>
  <repositories>
<repository>
  <id>akka-repository</id>
  <name>Akka library repository</name>
  <url>https://repo.akka.io/<your token>/secure</url>
</repository>
  </repositories>
  <pluginRepositories>
<pluginRepository>
  <id>akka-repository</id>
  <name>Akka library repository</name>
  <url>https://repo.akka.io/<your token>/secure</url>
</pluginRepository>
  </pluginRepositories>
  <dependencies>
<dependency>
  <groupId>com.lightbend.akka.grpc</groupId>
  <artifactId>akka-grpc-runtime_2.13</artifactId>
  <version>${akka.grpc.version}</version>
</dependency>
<!-- for loading of cert, issue #89 -->
<dependency>
  <groupId>io.grpc</groupId>
  <artifactId>grpc-testing</artifactId>
  <version>${grpc.version}</version>
</dependency>
  </dependencies>
  <build>
<plugins>
  <plugin>
    <groupId>com.lightbend.akka.grpc</groupId>
    <artifactId>akka-grpc-maven-plugin</artifactId>
    <version>${akka.grpc.version}</version>
    <!-- Hook the generate goal into the lifecycle,
         automatically tied to generate-sources -->
    <executions>
      <execution>
        <goals>
          <goal>generate</goal>
        </goals>
      </execution>
    </executions>
  </plugin>
</plugins>
  </build>
</project>
```

### Example 2: Configuring what to generate

```xml
<plugin>
    <groupId>com.lightbend.akka.grpc</groupId>
    <artifactId>akka-grpc-maven-plugin</artifactId>
    <version>${akka.grpc.version}</version>
    <configuration>
      <language>Java</language>
      <generateClient>false</generateClient>
      <generateServer>true</generateServer>
    </configuration>
</plugin>
```

### Example 3: Configuring what to generate

```xml
<plugin>
    <groupId>com.lightbend.akka.grpc</groupId>
    <artifactId>akka-grpc-maven-plugin</artifactId>
    <version>${akka.grpc.version}</version>
    <configuration>
      <language>Scala</language>
      <generateClient>false</generateClient>
      <generateServer>true</generateServer>
    </configuration>
</plugin>
```

### Example 4: Generating server “power APIs”

```xml
<plugin>
    ...
    <configuration>
      ...
      <generatorSettings>
        <serverPowerApis>true</serverPowerApis>
      </generatorSettings>
    </configuration>
</plugin>
```

### Example 5: Proto source directory

```xml
<plugin>
    <groupId>com.lightbend.akka.grpc</groupId>
    <artifactId>akka-grpc-maven-plugin</artifactId>
    <version>${akka.grpc.version}</version>
    <configuration>
      <protoPaths>
        <protoPath>src/main/protobuf</protoPath>
      </protoPaths>
    </configuration>
</plugin>
```

### Example 6: Loading proto files from artifacts

```proto
import "google/api/annotations.proto";
import "google/api/httpbody.proto";
```

### Example 7: Loading proto files from artifacts

```xml
<execution>
  <id>unpack</id>
  <phase>generate-sources</phase>
  <goals>
    <goal>unpack</goal>
  </goals>
  <configuration>
    <artifactItems>
      <artifactItem>
        <groupId>com.google.protobuf</groupId>
        <artifactId>protobuf-java</artifactId>
        <version>${protobuf-java.version}</version>
        <type>jar</type>
        <overWrite>true</overWrite>
        <outputDirectory>${project.build.directory}/proto</outputDirectory>
        <includes>**/*.proto</includes>
      </artifactItem>
      <artifactItem>
        <groupId>com.google.api.grpc</groupId>
        <artifactId>proto-google-common-protos</artifactId>
        <version>${proto-google-common-protos.version}</version>
        <type>jar</type>
        <overWrite>true</overWrite>
        <outputDirectory>${project.build.directory}/proto</outputDirectory>
        <includes>**/*.proto</includes>
      </artifactItem>
    </artifactItems>
    <overWriteReleases>false</overWriteReleases>
    <overWriteSnapshots>true</overWriteSnapshots>
  </configuration>
</execution>
```

### Example 8: Loading proto files from artifacts

```xml
<protoPaths>
  <protoPath>target/proto</protoPath>
  <protoPath>src/main/proto</protoPath>
  <protoPath>src/main/protobuf</protoPath>
</protoPaths>
```

### Example 9: Starting your Akka gRPC server from Maven

```bash
mvn compile exec:exec
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/libraries/akka-grpc/current/binary-compatibility.html
- https://doc.akka.io/libraries/akka-grpc/current/buildtools/gradle.html
- https://doc.akka.io/libraries/akka-grpc/current/client/index.html
- https://doc.akka.io/libraries/akka-grpc/current/server/details.html
- https://doc.akka.io/libraries/akka-grpc/current/server/index.html

---
*Source: [https://doc.akka.io/libraries/akka-grpc/current/buildtools/maven.html](https://doc.akka.io/libraries/akka-grpc/current/buildtools/maven.html)*