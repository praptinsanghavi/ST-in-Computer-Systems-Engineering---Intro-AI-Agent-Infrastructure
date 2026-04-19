---
description: Akka gRPC - Support for building streaming gRPC servers and clients on
  top of Akka Streams.
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:28:20Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-grpc/current/client/walkthrough.html
title: Walkthrough • Akka gRPC
---

# Walkthrough • Akka gRPC

> **Summary:** Akka gRPC - Support for building streaming gRPC servers and clients on top of Akka Streams.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Walkthrough

## Setting up

To get started, you must obtain the [`.proto`](../proto.html) file(s) that describe the interface you want to use and add those files to your project.

Add `.proto` files to your project’s `src/main/protobuf``src/main/proto``src/main/proto` directory. See the detailed chapters on [sbt](../buildtools/sbt.html), [Gradle](../buildtools/gradle.html) and [Maven](../buildtools/maven.html) for information on picking up `.proto` definitions from dependencies automatically.

Then add the following configuration to your build:

sbt

```
// in project/plugins.sbt:
resolvers += "Akka library repository".at("https://repo.akka.io/maven")
addSbtPlugin("com.lightbend.akka.grpc" % "sbt-akka-grpc" % "2.5.10")
//
// in build.sbt:
resolvers += "Akka library repository".at("https://repo.akka.io/maven")
enablePlugins(AkkaGrpcPlugin)

```

Gradle

```
buildscript {
  repositories {
gradlePluginPortal()
maven {
  url "https://repo.akka.io/maven"
}
  }
}
plugins {
  id 'java'
  id 'application'
  id 'com.lightbend.akka.grpc.gradle' version '2.5.10'
}
repositories {
  mavenCentral()
  maven {
url "https://repo.akka.io/maven"
  }
}

```

Maven

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
  <url>https://repo.akka.io/maven</url>
</repository>
  </repositories>
  <pluginRepositories>
<pluginRepository>
  <id>akka-repository</id>
  <name>Akka library repository</name>
  <url>https://repo.akka.io/maven</url>
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

For a complete overview of the configuration options see the chapter for your build tool, [sbt](../buildtools/sbt.html), [Gradle](../buildtools/gradle.html) or [Maven](../buildtools/maven.html).

### Dependencies

The Akka gRPC plugin makes your code depend on the `akka-grpc-runtime` library.

The table below shows direct dependencies of it and the second tab shows all libraries it depends on transitively. Be aware that the `io.grpc.grpc-api` library depends on Guava.

Direct dependencies

| Organization | Artifact | Version |
| --- | --- | --- |
| com.google.protobuf | protobuf\-java | [3\.25\.8](https://mvnrepository.com/artifact/com.google.protobuf/protobuf-java/3.25.8) |
| com.thesamet.scalapb | scalapb\-runtime\_2\.13 | [0\.11\.18](https://mvnrepository.com/artifact/com.thesamet.scalapb/scalapb-runtime_2.13/0.11.18) |
| com.typesafe.akka | akka\-discovery\_2\.13 | [2\.10\.11](https://mvnrepository.com/artifact/com.typesafe.akka/akka-discovery_2.13/2.10.11) |
| com.typesafe.akka | akka\-http\-core\_2\.13 | [10\.7\.3](https://mvnrepository.com/artifact/com.typesafe.akka/akka-http-core_2.13/10.7.3) |
| com.typesafe.akka | akka\-http\_2\.13 | [10\.7\.3](https://mvnrepository.com/artifact/com.typesafe.akka/akka-http_2.13/10.7.3) |
| com.typesafe.akka | akka\-pki\_2\.13 | [2\.10\.11](https://mvnrepository.com/artifact/com.typesafe.akka/akka-pki_2.13/2.10.11) |
| com.typesafe.akka | akka\-stream\_2\.13 | [2\.10\.11](https://mvnrepository.com/artifact/com.typesafe.akka/akka-stream_2.13/2.10.11) |
| io.grpc | grpc\-core | [1\.77\.0](https://mvnrepository.com/artifact/io.grpc/grpc-core/1.77.0) |
| io.grpc | grpc\-netty\-shaded | [1\.77\.0](https://mvnrepository.com/artifact/io.grpc/grpc-netty-shaded/1.77.0) |
| io.grpc | grpc\-protobuf | [1\.77\.0](https://mvnrepository.com/artifact/io.grpc/grpc-protobuf/1.77.0) |
| org.scala\-lang | scala\-library | [2\.13\.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17) |

Dependency tree
```

com.google.protobuf    protobuf-java    [3.25.8](https://mvnrepository.com/artifact/com.google.protobuf/protobuf-java/3.25.8)    BSD-3-Clause
com.thesamet.scalapb    scalapb-runtime_2.13    [0.11.18](https://mvnrepository.com/artifact/com.thesamet.scalapb/scalapb-runtime_2.13/0.11.18)    Apache 2
    com.google.protobuf    protobuf-java    [3.25.8](https://mvnrepository.com/artifact/com.google.protobuf/protobuf-java/3.25.8)    BSD-3-Clause
    com.thesamet.scalapb    lenses_2.13    [0.11.18](https://mvnrepository.com/artifact/com.thesamet.scalapb/lenses_2.13/0.11.18)    Apache 2
        org.scala-lang.modules    scala-collection-compat_2.13    [2.12.0](https://mvnrepository.com/artifact/org.scala-lang.modules/scala-collection-compat_2.13/2.12.0)    Apache-2.0
            org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
        org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
    org.scala-lang.modules    scala-collection-compat_2.13    [2.12.0](https://mvnrepository.com/artifact/org.scala-lang.modules/scala-collection-compat_2.13/2.12.0)    Apache-2.0
        org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
    org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
com.typesafe.akka    akka-discovery_2.13    [2.10.11](https://mvnrepository.com/artifact/com.typesafe.akka/akka-discovery_2.13/2.10.11)    BUSL-1.1
    com.typesafe.akka    akka-actor_2.13    [2.10.11](https://mvnrepository.com/artifact/com.typesafe.akka/akka-actor_2.13/2.10.11)    BUSL-1.1
        com.typesafe    config    [1.4.5](https://mvnrepository.com/artifact/com.typesafe/config/1.4.5)    Apache-2.0
        org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
    org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
com.typesafe.akka    akka-http-core_2.13    [10.7.3](https://mvnrepository.com/artifact/com.typesafe.akka/akka-http-core_2.13/10.7.3)    BUSL-1.1
    com.typesafe.akka    akka-parsing_2.13    [10.7.3](https://mvnrepository.com/artifact/com.typesafe.akka/akka-parsing_2.13/10.7.3)    BUSL-1.1
        org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
    org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
com.typesafe.akka    akka-http_2.13    [10.7.3](https://mvnrepository.com/artifact/com.typesafe.akka/akka-http_2.13/10.7.3)    BUSL-1.1
    com.typesafe.akka    akka-http-core_2.13    [10.7.3](https://mvnrepository.com/artifact/com.typesafe.akka/akka-http-core_2.13/10.7.3)    BUSL-1.1
        com.typesafe.akka    akka-parsing_2.13    [10.7.3](https://mvnrepository.com/artifact/com.typesafe.akka/akka-parsing_2.13/10.7.3)    BUSL-1.1
            org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
        org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
    com.typesafe.akka    akka-pki_2.13    [2.10.11](https://mvnrepository.com/artifact/com.typesafe.akka/akka-pki_2.13/2.10.11)    BUSL-1.1
        com.hierynomus    asn-one    [0.6.0](https://mvnrepository.com/artifact/com.hierynomus/asn-one/0.6.0)    The Apache License, Version 2.0
        com.typesafe.akka    akka-actor_2.13    [2.10.11](https://mvnrepository.com/artifact/com.typesafe.akka/akka-actor_2.13/2.10.11)    BUSL-1.1
            com.typesafe    config    [1.4.5](https://mvnrepository.com/artifact/com.typesafe/config/1.4.5)    Apache-2.0
            org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
        org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
    org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
com.typesafe.akka    akka-pki_2.13    [2.10.11](https://mvnrepository.com/artifact/com.typesafe.akka/akka-pki_2.13/2.10.11)    BUSL-1.1
    com.hierynomus    asn-one    [0.6.0](https://mvnrepository.com/artifact/com.hierynomus/asn-one/0.6.0)    The Apache License, Version 2.0
    com.typesafe.akka    akka-actor_2.13    [2.10.11](https://mvnrepository.com/artifact/com.typesafe.akka/akka-actor_2.13/2.10.11)    BUSL-1.1
        com.typesafe    config    [1.4.5](https://mvnrepository.com/artifact/com.typesafe/config/1.4.5)    Apache-2.0
        org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
    org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
com.typesafe.akka    akka-stream_2.13    [2.10.11](https://mvnrepository.com/artifact/com.typesafe.akka/akka-stream_2.13/2.10.11)    BUSL-1.1
    com.typesafe.akka    akka-actor_2.13    [2.10.11](https://mvnrepository.com/artifact/com.typesafe.akka/akka-actor_2.13/2.10.11)    BUSL-1.1
        com.typesafe    config    [1.4.5](https://mvnrepository.com/artifact/com.typesafe/config/1.4.5)    Apache-2.0
        org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
    com.typesafe.akka    akka-protobuf-v3_2.13    [2.10.11](https://mvnrepository.com/artifact/com.typesafe.akka/akka-protobuf-v3_2.13/2.10.11)    BUSL-1.1
    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
    org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
io.grpc    grpc-core    [1.77.0](https://mvnrepository.com/artifact/io.grpc/grpc-core/1.77.0)    Apache 2.0
    com.google.android    annotations    [4.1.1.4](https://mvnrepository.com/artifact/com.google.android/annotations/4.1.1.4)    Apache 2.0
    com.google.code.gson    gson    [2.11.0](https://mvnrepository.com/artifact/com.google.code.gson/gson/2.11.0)    Apache-2.0
        com.google.errorprone    error_prone_annotations    [2.36.0](https://mvnrepository.com/artifact/com.google.errorprone/error_prone_annotations/2.36.0)    Apache 2.0
    com.google.errorprone    error_prone_annotations    [2.36.0](https://mvnrepository.com/artifact/com.google.errorprone/error_prone_annotations/2.36.0)    Apache 2.0
    com.google.guava    guava    [33.4.8-android](https://mvnrepository.com/artifact/com.google.guava/guava/33.4.8-android)    Apache License, Version 2.0
        com.google.errorprone    error_prone_annotations    [2.36.0](https://mvnrepository.com/artifact/com.google.errorprone/error_prone_annotations/2.36.0)    Apache 2.0
        com.google.guava    failureaccess    [1.0.3](https://mvnrepository.com/artifact/com.google.guava/failureaccess/1.0.3)    Apache License, Version 2.0
        com.google.guava    listenablefuture    [9999.0-empty-to-avoid-conflict-with-guava](https://mvnrepository.com/artifact/com.google.guava/listenablefuture/9999.0-empty-to-avoid-conflict-with-guava)    The Apache Software License, Version 2.0
        com.google.j2objc    j2objc-annotations    [3.0.0](https://mvnrepository.com/artifact/com.google.j2objc/j2objc-annotations/3.0.0)    Apache License, Version 2.0
        org.jspecify    jspecify    [1.0.0](https://mvnrepository.com/artifact/org.jspecify/jspecify/1.0.0)    The Apache License, Version 2.0
    io.grpc    grpc-api    [1.77.0](https://mvnrepository.com/artifact/io.grpc/grpc-api/1.77.0)    Apache 2.0
        com.google.code.findbugs    jsr305    [3.0.2](https://mvnrepository.com/artifact/com.google.code.findbugs/jsr305/3.0.2)    The Apache Software License, Version 2.0
        com.google.errorprone    error_prone_annotations    [2.36.0](https://mvnrepository.com/artifact/com.google.errorprone/error_prone_annotations/2.36.0)    Apache 2.0
        com.google.guava    guava    [33.4.8-android](https://mvnrepository.com/artifact/com.google.guava/guava/33.4.8-android)    Apache License, Version 2.0
            com.google.errorprone    error_prone_annotations    [2.36.0](https://mvnrepository.com/artifact/com.google.errorprone/error_prone_annotations/2.36.0)    Apache 2.0
            com.google.guava    failureaccess    [1.0.3](https://mvnrepository.com/artifact/com.google.guava/failureaccess/1.0.3)    Apache License, Version 2.0
            com.google.guava    listenablefuture    [9999.0-empty-to-avoid-conflict-with-guava](https://mvnrepository.com/artifact/com.google.guava/listenablefuture/9999.0-empty-to-avoid-conflict-with-guava)    The Apache Software License, Version 2.0
            com.google.j2objc    j2objc-annotations    [3.0.0](https://mvnrepository.com/artifact/com.google.j2objc/j2objc-annotations/3.0.0)    Apache License, Version 2.0
            org.jspecify    jspecify    [1.0.0](https://mvnrepository.com/artifact/org.jspecify/jspecify/1.0.0)    The Apache License, Version 2.0
    io.grpc    grpc-context    [1.77.0](https://mvnrepository.com/artifact/io.grpc/grpc-context/1.77.0)    Apache 2.0
        io.grpc    grpc-api    [1.77.0](https://mvnrepository.com/artifact/io.grpc/grpc-api/1.77.0)    Apache 2.0
            com.google.code.findbugs    jsr305    [3.0.2](https://mvnrepository.com/artifact/com.google.code.findbugs/jsr305/3.0.2)    The Apache Software License, Version 2.0
            com.google.errorprone    error_prone_annotations    [2.36.0](https://mvnrepository.com/artifact/com.google.errorprone/error_prone_annotations/2.36.0)    Apache 2.0
            com.google.guava    guava    [33.4.8-android](https://mvnrepository.com/artifact/com.google.guava/guava/33.4.8-android)    Apache License, Version 2.0
                com.google.errorprone    error_prone_annotations    [2.36.0](https://mvnrepository.com/artifact/com.google.errorprone/error_prone_annotations/2.36.0)    Apache 2.0
                com.google.guava    failureaccess    [1.0.3](https://mvnrepository.com/artifact/com.google.guava/failureaccess/1.0.3)    Apache License, Version 2.0
                com.google.guava    listenablefuture    [9999.0-empty-to-avoid-conflict-with-guava](https://mvnrepository.com/artifact/com.google.guava/listenablefuture/9999.0-empty-to-avoid-conflict-with-guava)    The Apache Software License, Version 2.0
                com.google.j2objc    j2objc-annotations    [3.0.0](https://mvnrepository.com/artifact/com.google.j2objc/j2objc-annotations/3.0.0)    Apache License, Version 2.0
                org.jspecify    jspecify    [1.0.0](https://mvnrepository.com/artifact/org.jspecify/jspecify/1.0.0)    The Apache License, Version 2.0
    io.perfmark    perfmark-api    [0.27.0](https://mvnrepository.com/artifact/io.perfmark/perfmark-api/0.27.0)    Apache 2.0
    org.codehaus.mojo    animal-sniffer-annotations    [1.24](https://mvnrepository.com/artifact/org.codehaus.mojo/animal-sniffer-annotations/1.24)    MIT license
io.grpc    grpc-netty-shaded    [1.77.0](https://mvnrepository.com/artifact/io.grpc/grpc-netty-shaded/1.77.0)    Apache 2.0
    com.google.errorprone    error_prone_annotations    [2.36.0](https://mvnrepository.com/artifact/com.google.errorprone/error_prone_annotations/2.36.0)    Apache 2.0
    com.google.guava    guava    [33.4.8-android](https://mvnrepository.com/artifact/com.google.guava/guava/33.4.8-android)    Apache License, Version 2.0
        com.google.errorprone    error_prone_annotations    [2.36.0](https://mvnrepository.com/artifact/com.google.errorprone/error_prone_annotations/2.36.0)    Apache 2.0
        com.google.guava    failureaccess    [1.0.3](https://mvnrepository.com/artifact/com.google.guava/failureaccess/1.0.3)    Apache License, Version 2.0
        com.google.guava    listenablefuture    [9999.0-empty-to-avoid-conflict-with-guava](https://mvnrepository.com/artifact/com.google.guava/listenablefuture/9999.0-empty-to-avoid-conflict-with-guava)    The Apache Software License, Version 2.0
        com.google.j2objc    j2objc-annotations    [3.0.0](https://mvnrepository.com/artifact/com.google.j2objc/j2objc-annotations/3.0.0)    Apache License, Version 2.0
        org.jspecify    jspecify    [1.0.0](https://mvnrepository.com/artifact/org.jspecify/jspecify/1.0.0)    The Apache License, Version 2.0
    io.grpc    grpc-api    [1.77.0](https://mvnrepository.com/artifact/io.grpc/grpc-api/1.77.0)    Apache 2.0
        com.google.code.findbugs    jsr305    [3.0.2](https://mvnrepository.com/artifact/com.google.code.findbugs/jsr305/3.0.2)    The Apache Software License, Version 2.0
        com.google.errorprone    error_prone_annotations    [2.36.0](https://mvnrepository.com/artifact/com.google.errorprone/error_prone_annotations/2.36.0)    Apache 2.0
        com.google.guava    guava    [33.4.8-android](https://mvnrepository.com/artifact/com.google.guava/guava/33.4.8-android)    Apache License, Version 2.0
            com.google.errorprone    error_prone_annotations    [2.36.0](https://mvnrepository.com/artifact/com.google.errorprone/error_prone_annotations/2.36.0)    Apache 2.0
            com.google.guava    failureaccess    [1.0.3](https://mvnrepository.com/artifact/com.google.guava/failureaccess/1.0.3)    Apache License, Version 2.0
            com.google.guava    listenablefuture    [9999.0-empty-to-avoid-conflict-with-guava](https://mvnrepository.com/artifact/com.google.guava/listenablefuture/9999.0-empty-to-avoid-conflict-with-guava)    The Apache Software License, Version 2.0
            com.google.j2objc    j2objc-annotations    [3.0.0](https://mvnrepository.com/artifact/com.google.j2objc/j2objc-annotations/3.0.0)    Apache License, Version 2.0
            org.jspecify    jspecify    [1.0.0](https://mvnrepository.com/artifact/org.jspecify/jspecify/1.0.0)    The Apache License, Version 2.0
    io.grpc    grpc-core    [1.77.0](https://mvnrepository.com/artifact/io.grpc/grpc-core/1.77.0)    Apache 2.0
        com.google.android    annotations    [4.1.1.4](https://mvnrepository.com/artifact/com.google.android/annotations/4.1.1.4)    Apache 2.0
        com.google.code.gson    gson    [2.11.0](https://mvnrepository.com/artifact/com.google.code.gson/gson/2.11.0)    Apache-2.0
            com.google.errorprone    error_prone_annotations    [2.36.0](https://mvnrepository.com/artifact/com.google.errorprone/error_prone_annotations/2.36.0)    Apache 2.0
        com.google.errorprone    error_prone_annotations    [2.36.0](https://mvnrepository.com/artifact/com.google.errorprone/error_prone_annotations/2.36.0)    Apache 2.0
        com.google.guava    guava    [33.4.8-android](https://mvnrepository.com/artifact/com.google.guava/guava/33.4.8-android)    Apache License, Version 2.0
            com.google.errorprone    error_prone_annotations    [2.36.0](https://mvnrepository.com/artifact/com.google.errorprone/error_prone_annotations/2.36.0)    Apache 2.0
            com.google.guava    failureaccess    [1.0.3](https://mvnrepository.com/artifact/com.google.guava/failureaccess/1.0.3)    Apache License, Version 2.0
            com.google.guava    listenablefuture    [9999.0-empty-to-avoid-conflict-with-guava](https://mvnrepository.com/artifact/com.google.guava/listenablefuture/9999.0-empty-to-avoid-conflict-with-guava)    The Apache Software License, Version 2.0
            com.google.j2objc    j2objc-annotations    [3.0.0](https://mvnrepository.com/artifact/com.google.j2objc/j2objc-annotations/3.0.0)    Apache License, Version 2.0
            org.jspecify    jspecify    [1.0.0](https://mvnrepository.com/artifact/org.jspecify/jspecify/1.0.0)    The Apache License, Version 2.0
        io.grpc    grpc-api    [1.77.0](https://mvnrepository.com/artifact/io.grpc/grpc-api/1.77.0)    Apache 2.0
            com.google.code.findbugs    jsr305    [3.0.2](https://mvnrepository.com/artifact/com.google.code.findbugs/jsr305/3.0.2)    The Apache Software License, Version 2.0
            com.google.errorprone    error_prone_annotations    [2.36.0](https://mvnrepository.com/artifact/com.google.errorprone/error_prone_annotations/2.36.0)    Apache 2.0
            com.google.guava    guava    [33.4.8-android](https://mvnrepository.com/artifact/com.google.guava/guava/33.4.8-android)    Apache License, Version 2.0
                com.google.errorprone    error_prone_annotations    [2.36.0](https://mvnrepository.com/artifact/com.google.errorprone/error_prone_annotations/2.36.0)    Apache 2.0
                com.google.guava    failureaccess    [1.0.3](https://mvnrepository.com/artifact/com.google.guava/failureaccess/1.0.3)    Apache License, Version 2.0
                com.google.guava    listenablefuture    [9999.0-empty-to-avoid-conflict-with-guava](https://mvnrepository.com/artifact/com.google.guava/listenablefuture/9999.0-empty-to-avoid-conflict-with-guava)    The Apache Software License, Version 2.0
                com.google.j2objc    j2objc-annotations    [3.0.0](https://mvnrepository.com/artifact/com.google.j2objc/j2objc-annotations/3.0.0)    Apache License, Version 2.0
                org.jspecify    jspecify    [1.0.0](https://mvnrepository.com/artifact/org.jspecify/jspecify/1.0.0)    The Apache License, Version 2.0
        io.grpc    grpc-context    [1.77.0](https://mvnrepository.com/artifact/io.grpc/grpc-context/1.77.0)    Apache 2.0
            io.grpc    grpc-api    [1.77.0](https://mvnrepository.com/artifact/io.grpc/grpc-api/1.77.0)    Apache 2.0
                com.google.code.findbugs    jsr305    [3.0.2](https://mvnrepository.com/artifact/com.google.code.findbugs/jsr305/3.0.2)    The Apache Software License, Version 2.0
                com.google.errorprone    error_prone_annotations    [2.36.0](https://mvnrepository.com/artifact/com.google.errorprone/error_prone_annotations/2.36.0)    Apache 2.0
                com.google.guava    guava    [33.4.8-android](https://mvnrepository.com/artifact/com.google.guava/guava/33.4.8-android)    Apache License, Version 2.0
                    com.google.errorprone    error_prone_annotations    [2.36.0](https://mvnrepository.com/artifact/com.google.errorprone/error_prone_annotations/2.36.0)    Apache 2.0
                    com.google.guava    failureaccess    [1.0.3](https://mvnrepository.com/artifact/com.google.guava/failureaccess/1.0.3)    Apache License, Version 2.0
                    com.google.guava    listenablefuture    [9999.0-empty-to-avoid-conflict-with-guava](https://mvnrepository.com/artifact/com.google.guava/listenablefuture/9999.0-empty-to-avoid-conflict-with-guava)    The Apache Software License, Version 2.0
                    com.google.j2objc    j2objc-annotations    [3.0.0](https://mvnrepository.com/artifact/com.google.j2objc/j2objc-annotations/3.0.0)    Apache License, Version 2.0
                    org.jspecify    jspecify    [1.0.0](https://mvnrepository.com/artifact/org.jspecify/jspecify/1.0.0)    The Apache License, Version 2.0
        io.perfmark    perfmark-api    [0.27.0](https://mvnrepository.com/artifact/io.perfmark/perfmark-api/0.27.0)    Apache 2.0
        org.codehaus.mojo    animal-sniffer-annotations    [1.24](https://mvnrepository.com/artifact/org.codehaus.mojo/animal-sniffer-annotations/1.24)    MIT license
    io.grpc    grpc-util    [1.77.0](https://mvnrepository.com/artifact/io.grpc/grpc-util/1.77.0)    Apache 2.0
        com.google.guava    guava    [33.4.8-android](https://mvnrepository.com/artifact/com.google.guava/guava/33.4.8-android)    Apache License, Version 2.0
            com.google.errorprone    error_prone_annotations    [2.36.0](https://mvnrepository.com/artifact/com.google.errorprone/error_prone_annotations/2.36.0)    Apache 2.0
            com.google.guava    failureaccess    [1.0.3](https://mvnrepository.com/artifact/com.google.guava/failureaccess/1.0.3)    Apache License, Version 2.0
            com.google.guava    listenablefuture    [9999.0-empty-to-avoid-conflict-with-guava](https://mvnrepository.com/artifact/com.google.guava/listenablefuture/9999.0-empty-to-avoid-conflict-with-guava)    The Apache Software License, Version 2.0
            com.google.j2objc    j2objc-annotations    [3.0.0](https://mvnrepository.com/artifact/com.google.j2objc/j2objc-annotations/3.0.0)    Apache License, Version 2.0
            org.jspecify    jspecify    [1.0.0](https://mvnrepository.com/artifact/org.jspecify/jspecify/1.0.0)    The Apache License, Version 2.0
        io.grpc    grpc-api    [1.77.0](https://mvnrepository.com/artifact/io.grpc/grpc-api/1.77.0)    Apache 2.0
            com.google.code.findbugs    jsr305    [3.0.2](https://mvnrepository.com/artifact/com.google.code.findbugs/jsr305/3.0.2)    The Apache Software License, Version 2.0
            com.google.errorprone    error_prone_annotations    [2.36.0](https://mvnrepository.com/artifact/com.google.errorprone/error_prone_annotations/2.36.0)    Apache 2.0
            com.google.guava    guava    [33.4.8-android](https://mvnrepository.com/artifact/com.google.guava/guava/33.4.8-android)    Apache License, Version 2.0
                com.google.errorprone    error_prone_annotations    [2.36.0](https://mvnrepository.com/artifact/com.google.errorprone/error_prone_annotations/2.36.0)    Apache 2.0
                com.google.guava    failureaccess    [1.0.3](https://mvnrepository.com/artifact/com.google.guava/failureaccess/1.0.3)    Apache License, Version 2.0
                com.google.guava    listenablefuture    [9999.0-empty-to-avoid-conflict-with-guava](https://mvnrepository.com/artifact/com.google.guava/listenablefuture/9999.0-empty-to-avoid-conflict-with-guava)    The Apache Software License, Version 2.0
                com.google.j2objc    j2objc-annotations    [3.0.0](https://mvnrepository.com/artifact/com.google.j2objc/j2objc-annotations/3.0.0)    Apache License, Version 2.0
                org.jspecify    jspecify    [1.0.0](https://mvnrepository.com/artifact/org.jspecify/jspecify/1.0.0)    The Apache License, Version 2.0
        io.grpc    grpc-core    [1.77.0](https://mvnrepository.com/artifact/io.grpc/grpc-core/1.77.0)    Apache 2.0
            com.google.android    annotations    [4.1.1.4](https://mvnrepository.com/artifact/com.google.android/annotations/4.1.1.4)    Apache 2.0
            com.google.code.gson    gson    [2.11.0](https://mvnrepository.com/artifact/com.google.code.gson/gson/2.11.0)    Apache-2.0
                com.google.errorprone    error_prone_annotations    [2.36.0](https://mvnrepository.com/artifact/com.google.errorprone/error_prone_annotations/2.36.0)    Apache 2.0
            com.google.errorprone    error_prone_annotations    [2.36.0](https://mvnrepository.com/artifact/com.google.errorprone/error_prone_annotations/2.36.0)    Apache 2.0
            com.google.guava    guava    [33.4.8-android](https://mvnrepository.com/artifact/com.google.guava/guava/33.4.8-android)    Apache License, Version 2.0
                com.google.errorprone    error_prone_annotations    [2.36.0](https://mvnrepository.com/artifact/com.google.errorprone/error_prone_annotations/2.36.0)    Apache 2.0
                com.google.guava    failureaccess    [1.0.3](https://mvnrepository.com/artifact/com.google.guava/failureaccess/1.0.3)    Apache License, Version 2.0
                com.google.guava    listenablefuture    [9999.0-empty-to-avoid-conflict-with-guava](https://mvnrepository.com/artifact/com.google.guava/listenablefuture/9999.0-empty-to-avoid-conflict-with-guava)    The Apache Software License, Version 2.0
                com.google.j2objc    j2objc-annotations    [3.0.0](https://mvnrepository.com/artifact/com.google.j2objc/j2objc-annotations/3.0.0)    Apache License, Version 2.0
                org.jspecify    jspecify    [1.0.0](https://mvnrepository.com/artifact/org.jspecify/jspecify/1.0.0)    The Apache License, Version 2.0
            io.grpc    grpc-api    [1.77.0](https://mvnrepository.com/artifact/io.grpc/grpc-api/1.77.0)    Apache 2.0
                com.google.code.findbugs    jsr305    [3.0.2](https://mvnrepository.com/artifact/com.google.code.findbugs/jsr305/3.0.2)    The Apache Software License, Version 2.0
                com.google.errorprone    error_prone_annotations    [2.36.0](https://mvnrepository.com/artifact/com.google.errorprone/error_prone_annotations/2.36.0)    Apache 2.0
                com.google.guava    guava    [33.4.8-android](https://mvnrepository.com/artifact/com.google.guava/guava/33.4.8-android)    Apache License, Version 2.0
                    com.google.errorprone    error_prone_annotations    [2.36.0](https://mvnrepository.com/artifact/com.google.errorprone/error_prone_annotations/2.36.0)    Apache 2.0
                    com.google.guava    failureaccess    [1.0.3](https://mvnrepository.com/artifact/com.google.guava/failureaccess/1.0.3)    Apache License, Version 2.0
                    com.google.guava    listenablefuture    [9999.0-empty-to-avoid-conflict-with-guava](https://mvnrepository.com/artifact/com.google.guava/listenablefuture/9999.0-empty-to-avoid-conflict-with-guava)    The Apache Software License, Version 2.0
                    com.google.j2objc    j2objc-annotations    [3.0.0](https://mvnrepository.com/artifact/com.google.j2objc/j2objc-annotations/3.0.0)    Apache License, Version 2.0
                    org.jspecify    jspecify    [1.0.0](https://mvnrepository.com/artifact/org.jspecify/jspecify/1.0.0)    The Apache License, Version 2.0
            io.grpc    grpc-context    [1.77.0](https://mvnrepository.com/artifact/io.grpc/grpc-context/1.77.0)    Apache 2.0
                io.grpc    grpc-api    [1.77.0](https://mvnrepository.com/artifact/io.grpc/grpc-api/1.77.0)    Apache 2.0
                    com.google.code.findbugs    jsr305    [3.0.2](https://mvnrepository.com/artifact/com.google.code.findbugs/jsr305/3.0.2)    The Apache Software License, Version 2.0
                    com.google.errorprone    error_prone_annotations    [2.36.0](https://mvnrepository.com/artifact/com.google.errorprone/error_prone_annotations/2.36.0)    Apache 2.0
                    com.google.guava    guava    [33.4.8-android](https://mvnrepository.com/artifact/com.google.guava/guava/33.4.8-android)    Apache License, Version 2.0
                        com.google.errorprone    error_prone_annotations    [2.36.0](https://mvnrepository.com/artifact/com.google.errorprone/error_prone_annotations/2.36.0)    Apache 2.0
                        com.google.guava    failureaccess    [1.0.3](https://mvnrepository.com/artifact/com.google.guava/failureaccess/1.0.3)    Apache License, Version 2.0
                        com.google.guava    listenablefuture    [9999.0-empty-to-avoid-conflict-with-guava](https://mvnrepository.com/artifact/com.google.guava/listenablefuture/9999.0-empty-to-avoid-conflict-with-guava)    The Apache Software License, Version 2.0
                        com.google.j2objc    j2objc-annotations    [3.0.0](https://mvnrepository.com/artifact/com.google.j2objc/j2objc-annotations/3.0.0)    Apache License, Version 2.0
                        org.jspecify    jspecify    [1.0.0](https://mvnrepository.com/artifact/org.jspecify/jspecify/1.0.0)    The Apache License, Version 2.0
            io.perfmark    perfmark-api    [0.27.0](https://mvnrepository.com/artifact/io.perfmark/perfmark-api/0.27.0)    Apache 2.0
            org.codehaus.mojo    animal-sniffer-annotations    [1.24](https://mvnrepository.com/artifact/org.codehaus.mojo/animal-sniffer-annotations/1.24)    MIT license
        org.codehaus.mojo    animal-sniffer-annotations    [1.24](https://mvnrepository.com/artifact/org.codehaus.mojo/animal-sniffer-annotations/1.24)    MIT license
    io.perfmark    perfmark-api    [0.27.0](https://mvnrepository.com/artifact/io.perfmark/perfmark-api/0.27.0)    Apache 2.0
    org.codehaus.mojo    animal-sniffer-annotations    [1.24](https://mvnrepository.com/artifact/org.codehaus.mojo/animal-sniffer-annotations/1.24)    MIT license
io.grpc    grpc-protobuf    [1.77.0](https://mvnrepository.com/artifact/io.grpc/grpc-protobuf/1.77.0)    Apache 2.0
    com.google.api.grpc    proto-google-common-protos    [2.59.2](https://mvnrepository.com/artifact/com.google.api.grpc/proto-google-common-protos/2.59.2)    Apache-2.0
        com.google.protobuf    protobuf-java    [3.25.8](https://mvnrepository.com/artifact/com.google.protobuf/protobuf-java/3.25.8)    BSD-3-Clause
    com.google.code.findbugs    jsr305    [3.0.2](https://mvnrepository.com/artifact/com.google.code.findbugs/jsr305/3.0.2)    The Apache Software License, Version 2.0
    com.google.guava    guava    [33.4.8-android](https://mvnrepository.com/artifact/com.google.guava/guava/33.4.8-android)    Apache License, Version 2.0
        com.google.errorprone    error_prone_annotations    [2.36.0](https://mvnrepository.com/artifact/com.google.errorprone/error_prone_annotations/2.36.0)    Apache 2.0
        com.google.guava    failureaccess    [1.0.3](https://mvnrepository.com/artifact/com.google.guava/failureaccess/1.0.3)    Apache License, Version 2.0
        com.google.guava    listenablefuture    [9999.0-empty-to-avoid-conflict-with-guava](https://mvnrepository.com/artifact/com.google.guava/listenablefuture/9999.0-empty-to-avoid-conflict-with-guava)    The Apache Software License, Version 2.0
        com.google.j2objc    j2objc-annotations    [3.0.0](https://mvnrepository.com/artifact/com.google.j2objc/j2objc-annotations/3.0.0)    Apache License, Version 2.0
        org.jspecify    jspecify    [1.0.0](https://mvnrepository.com/artifact/org.jspecify/jspecify/1.0.0)    The Apache License, Version 2.0
    com.google.protobuf    protobuf-java    [3.25.8](https://mvnrepository.com/artifact/com.google.protobuf/protobuf-java/3.25.8)    BSD-3-Clause
    io.grpc    grpc-api    [1.77.0](https://mvnrepository.com/artifact/io.grpc/grpc-api/1.77.0)    Apache 2.0
        com.google.code.findbugs    jsr305    [3.0.2](https://mvnrepository.com/artifact/com.google.code.findbugs/jsr305/3.0.2)    The Apache Software License, Version 2.0
        com.google.errorprone    error_prone_annotations    [2.36.0](https://mvnrepository.com/artifact/com.google.errorprone/error_prone_annotations/2.36.0)    Apache 2.0
        com.google.guava    guava    [33.4.8-android](https://mvnrepository.com/artifact/com.google.guava/guava/33.4.8-android)    Apache License, Version 2.0
            com.google.errorprone    error_prone_annotations    [2.36.0](https://mvnrepository.com/artifact/com.google.errorprone/error_prone_annotations/2.36.0)    Apache 2.0
            com.google.guava    failureaccess    [1.0.3](https://mvnrepository.com/artifact/com.google.guava/failureaccess/1.0.3)    Apache License, Version 2.0
            com.google.guava    listenablefuture    [9999.0-empty-to-avoid-conflict-with-guava](https://mvnrepository.com/artifact/com.google.guava/listenablefuture/9999.0-empty-to-avoid-conflict-with-guava)    The Apache Software License, Version 2.0
            com.google.j2objc    j2objc-annotations    [3.0.0](https://mvnrepository.com/artifact/com.google.j2objc/j2objc-annotations/3.0.0)    Apache License, Version 2.0
            org.jspecify    jspecify    [1.0.0](https://mvnrepository.com/artifact/org.jspecify/jspecify/1.0.0)    The Apache License, Version 2.0
    io.grpc    grpc-protobuf-lite    [1.77.0](https://mvnrepository.com/artifact/io.grpc/grpc-protobuf-lite/1.77.0)    Apache 2.0
        com.google.code.findbugs    jsr305    [3.0.2](https://mvnrepository.com/artifact/com.google.code.findbugs/jsr305/3.0.2)    The Apache Software License, Version 2.0
        com.google.guava    guava    [33.4.8-android](https://mvnrepository.com/artifact/com.google.guava/guava/33.4.8-android)    Apache License, Version 2.0
            com.google.errorprone    error_prone_annotations    [2.36.0](https://mvnrepository.com/artifact/com.google.errorprone/error_prone_annotations/2.36.0)    Apache 2.0
            com.google.guava    failureaccess    [1.0.3](https://mvnrepository.com/artifact/com.google.guava/failureaccess/1.0.3)    Apache License, Version 2.0
            com.google.guava    listenablefuture    [9999.0-empty-to-avoid-conflict-with-guava](https://mvnrepository.com/artifact/com.google.guava/listenablefuture/9999.0-empty-to-avoid-conflict-with-guava)    The Apache Software License, Version 2.0
            com.google.j2objc    j2objc-annotations    [3.0.0](https://mvnrepository.com/artifact/com.google.j2objc/j2objc-annotations/3.0.0)    Apache License, Version 2.0
            org.jspecify    jspecify    [1.0.0](https://mvnrepository.com/artifact/org.jspecify/jspecify/1.0.0)    The Apache License, Version 2.0
        io.grpc    grpc-api    [1.77.0](https://mvnrepository.com/artifact/io.grpc/grpc-api/1.77.0)    Apache 2.0
            com.google.code.findbugs    jsr305    [3.0.2](https://mvnrepository.com/artifact/com.google.code.findbugs/jsr305/3.0.2)    The Apache Software License, Version 2.0
            com.google.errorprone    error_prone_annotations    [2.36.0](https://mvnrepository.com/artifact/com.google.errorprone/error_prone_annotations/2.36.0)    Apache 2.0
            com.google.guava    guava    [33.4.8-android](https://mvnrepository.com/artifact/com.google.guava/guava/33.4.8-android)    Apache License, Version 2.0
                com.google.errorprone    error_prone_annotations    [2.36.0](https://mvnrepository.com/artifact/com.google.errorprone/error_prone_annotations/2.36.0)    Apache 2.0
                com.google.guava    failureaccess    [1.0.3](https://mvnrepository.com/artifact/com.google.guava/failureaccess/1.0.3)    Apache License, Version 2.0
                com.google.guava    listenablefuture    [9999.0-empty-to-avoid-conflict-with-guava](https://mvnrepository.com/artifact/com.google.guava/listenablefuture/9999.0-empty-to-avoid-conflict-with-guava)    The Apache Software License, Version 2.0
                com.google.j2objc    j2objc-annotations    [3.0.0](https://mvnrepository.com/artifact/com.google.j2objc/j2objc-annotations/3.0.0)    Apache License, Version 2.0
                org.jspecify    jspecify    [1.0.0](https://mvnrepository.com/artifact/org.jspecify/jspecify/1.0.0)    The Apache License, Version 2.0
org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
```

## Generating Service Stubs

To use a service, such as the Hello World service described in the [server documentation](../server/index.html), you only need the protobuf definition (the `.proto` files) of the service. No additional dependencies to the server project are needed.

For example, this is the definition of a Hello World service:

```
[source](https://github.com/akka/akka-grpc/tree/v2.5.10/plugin-tester-scala/src/main/protobuf/helloworld.proto#L2-L54 "Go to snippet source")syntax = "proto3";

option java_multiple_files = true;
option java_package = "example.myapp.helloworld.grpc";
option java_outer_classname = "HelloWorldProto";

package helloworld;

////////////////////////////////////// The greeting service definition.
service GreeterService {
    //////////////////////
    // Sends a greeting //
    ////////*****/////////
    //      HELLO       //
    ////////*****/////////
    rpc SayHello (HelloRequest) returns (HelloReply) {}

    // Comment spanning
    // on several lines
    rpc ItKeepsTalking (stream HelloRequest) returns (HelloReply) {}

    /*
     * C style comments
     */
    rpc ItKeepsReplying (HelloRequest) returns (stream HelloReply) {}

    /* C style comments
     * on several lines
     * with non-empty heading/trailing line */
    rpc StreamHellos (stream HelloRequest) returns (stream HelloReply) {}
}

// The request message containing the user's name.
message HelloRequest {
    string name = 1;
}

// The response message containing the greetings
message HelloReply {
    string message = 1;
}
```

From this definition, Akka gRPC generates interfaces that look like this:

Scala

```
[source](https://github.com/akka/akka-grpc/tree/v2.5.10/plugin-tester-scala/target/scala-2.13/src_managed/main/example/myapp/helloworld/grpc/GreeterService.scala "Go to snippet source")  
// Generated by Akka gRPC. DO NOT EDIT.
package example.myapp.helloworld.grpc

import akka.annotation.ApiMayChange

import akka.grpc.AkkaGrpcGenerated

/**
 * #services
 * //////////////////////////////////// The greeting service definition.
 */
@AkkaGrpcGenerated
trait GreeterService {
  
  /**
   * ////////////////////
   * Sends a greeting //
   * //////&#42;****&#47;////////
   *      HELLO       //
   * //////&#42;****&#47;////////
   */
  def sayHello(in: example.myapp.helloworld.grpc.HelloRequest): scala.concurrent.Future[example.myapp.helloworld.grpc.HelloReply]
  
  /**
   * Comment spanning
   * on several lines
   */
  def itKeepsTalking(in: akka.stream.scaladsl.Source[example.myapp.helloworld.grpc.HelloRequest, akka.NotUsed]): scala.concurrent.Future[example.myapp.helloworld.grpc.HelloReply]
  
  /**
   *  C style comments
   */
  def itKeepsReplying(in: example.myapp.helloworld.grpc.HelloRequest): akka.stream.scaladsl.Source[example.myapp.helloworld.grpc.HelloReply, akka.NotUsed]
  
  /**
   * C style comments
   * on several lines
   * with non-empty heading/trailing line    */
  def streamHellos(in: akka.stream.scaladsl.Source[example.myapp.helloworld.grpc.HelloRequest, akka.NotUsed]): akka.stream.scaladsl.Source[example.myapp.helloworld.grpc.HelloReply, akka.NotUsed]
  
}

@AkkaGrpcGenerated
object GreeterService extends akka.grpc.ServiceDescription {
  val name = "helloworld.GreeterService"

  val descriptor: com.google.protobuf.Descriptors.FileDescriptor =
    example.myapp.helloworld.grpc.HelloworldProto.javaDescriptor;

  object Serializers {
    import akka.grpc.scaladsl.ScalapbProtobufSerializer
    
    val HelloRequestSerializer = new ScalapbProtobufSerializer(example.myapp.helloworld.grpc.HelloRequest.messageCompanion)
    
    val HelloReplySerializer = new ScalapbProtobufSerializer(example.myapp.helloworld.grpc.HelloReply.messageCompanion)
    
  }

  @ApiMayChange
  @AkkaGrpcGenerated
  object MethodDescriptors {
    import akka.grpc.internal.Marshaller
    import io.grpc.MethodDescriptor
    import Serializers._

    
    val sayHelloDescriptor: MethodDescriptor[example.myapp.helloworld.grpc.HelloRequest, example.myapp.helloworld.grpc.HelloReply] =
      MethodDescriptor.newBuilder()
        .setType(
   MethodDescriptor.MethodType.UNARY 
  
  
  
)
        .setFullMethodName(MethodDescriptor.generateFullMethodName("helloworld.GreeterService", "SayHello"))
        .setRequestMarshaller(new Marshaller(HelloRequestSerializer))
        .setResponseMarshaller(new Marshaller(HelloReplySerializer))
        .setSampledToLocalTracing(true)
        .build()
    
    val itKeepsTalkingDescriptor: MethodDescriptor[example.myapp.helloworld.grpc.HelloRequest, example.myapp.helloworld.grpc.HelloReply] =
      MethodDescriptor.newBuilder()
        .setType(
  
  MethodDescriptor.MethodType.CLIENT_STREAMING 
  
  
)
        .setFullMethodName(MethodDescriptor.generateFullMethodName("helloworld.GreeterService", "ItKeepsTalking"))
        .setRequestMarshaller(new Marshaller(HelloRequestSerializer))
        .setResponseMarshaller(new Marshaller(HelloReplySerializer))
        .setSampledToLocalTracing(true)
        .build()
    
    val itKeepsReplyingDescriptor: MethodDescriptor[example.myapp.helloworld.grpc.HelloRequest, example.myapp.helloworld.grpc.HelloReply] =
      MethodDescriptor.newBuilder()
        .setType(
  
  
   MethodDescriptor.MethodType.SERVER_STREAMING 
  
)
        .setFullMethodName(MethodDescriptor.generateFullMethodName("helloworld.GreeterService", "ItKeepsReplying"))
        .setRequestMarshaller(new Marshaller(HelloRequestSerializer))
        .setResponseMarshaller(new Marshaller(HelloReplySerializer))
        .setSampledToLocalTracing(true)
        .build()
    
    val streamHellosDescriptor: MethodDescriptor[example.myapp.helloworld.grpc.HelloRequest, example.myapp.helloworld.grpc.HelloReply] =
      MethodDescriptor.newBuilder()
        .setType(
  
  
  
  MethodDescriptor.MethodType.BIDI_STREAMING 
)
        .setFullMethodName(MethodDescriptor.generateFullMethodName("helloworld.GreeterService", "StreamHellos"))
        .setRequestMarshaller(new Marshaller(HelloRequestSerializer))
        .setResponseMarshaller(new Marshaller(HelloReplySerializer))
        .setSampledToLocalTracing(true)
        .build()
    
  }
}
```

Java

```
[source](https://github.com/akka/akka-grpc/tree/v2.5.10/plugin-tester-java/target/scala-2.13/src_managed/main/example/myapp/helloworld/grpc/GreeterService.java "Go to snippet source")  
// Generated by Akka gRPC. DO NOT EDIT.
package example.myapp.helloworld.grpc;

import akka.grpc.ProtobufSerializer;
import akka.grpc.javadsl.GoogleProtobufSerializer;

import akka.grpc.AkkaGrpcGenerated;

/**
 * //////////////////////////////////// The greeting service definition.
 */
public interface GreeterService {
  
  /**
   * ////////////////////
   * Sends a greeting //
   * //////&#42;****&#47;////////
   *      HELLO       //
   * //////&#42;****&#47;////////
   */
  java.util.concurrent.CompletionStage<example.myapp.helloworld.grpc.HelloReply> sayHello(example.myapp.helloworld.grpc.HelloRequest in);
  
  
  java.util.concurrent.CompletionStage<com.google.api.HttpBody> sayHelloHttp(example.myapp.helloworld.grpc.HelloRequest in);
  
  /**
   * Comment spanning
   * on several lines
   */
  java.util.concurrent.CompletionStage<example.myapp.helloworld.grpc.HelloReply> itKeepsTalking(akka.stream.javadsl.Source<example.myapp.helloworld.grpc.HelloRequest, akka.NotUsed> in);
  
  /**
   *  C style comments
   */
  akka.stream.javadsl.Source<example.myapp.helloworld.grpc.HelloReply, akka.NotUsed> itKeepsReplying(example.myapp.helloworld.grpc.HelloRequest in);
  
  /**
   * C style comments
   * on several lines
   * with non-empty heading/trailing line    */
  akka.stream.javadsl.Source<example.myapp.helloworld.grpc.HelloReply, akka.NotUsed> streamHellos(akka.stream.javadsl.Source<example.myapp.helloworld.grpc.HelloRequest, akka.NotUsed> in);
  

  static String name = "helloworld.GreeterService";
  static akka.grpc.ServiceDescription description = new akka.grpc.internal.ServiceDescriptionImpl(name, HelloWorldProto.getDescriptor());

  @AkkaGrpcGenerated
  public static class Serializers {
    
      public static ProtobufSerializer<example.myapp.helloworld.grpc.HelloRequest> HelloRequestSerializer = new GoogleProtobufSerializer<>(example.myapp.helloworld.grpc.HelloRequest.parser());
    
      public static ProtobufSerializer<example.myapp.helloworld.grpc.HelloReply> HelloReplySerializer = new GoogleProtobufSerializer<>(example.myapp.helloworld.grpc.HelloReply.parser());
    
      public static ProtobufSerializer<com.google.api.HttpBody> google_api_HttpBodySerializer = new GoogleProtobufSerializer<>(com.google.api.HttpBody.parser());
    
  }
}
```

and model case classes for `HelloRequest` and `HelloResponse`.

The service interface is the same for the client and the server side. On the server side, the service implements the interface, on the client side the Akka gRPC infrastructure implements a stub that will connect to the remote service when called.

There are 4 different types of calls:

- **unary call** \- single request that returns a `Future``CompletionStage` with a single response, see `sayHello` in above example
- **client streaming call** \- `Source` (stream) of requests from the client that returns a `Future``CompletionStage` with a single response, see `itKeepsTalking` in above example
- **server streaming call** \- single request that returns a `Source` (stream) of responses, see `itKeepsReplying` in above example
- **client and server streaming call** \- `Source` (stream) of requests from the client that returns a `Source` (stream) of responses, see `streamHellos` in above example

## Writing a Client Program

Let’s use these 4 calls from a client. Start by generating code from the `.proto` definition with:

sbt

```
compile

```

Gradle

```
./gradlew build

```

Maven

```
mvn akka-grpc:generate

```

A main program that calls the server with the `GreeterService` looks like this:

Scala

```
[source](https://github.com/akka/akka-grpc/tree/v2.5.10/plugin-tester-scala/src/main/scala/example/myapp/helloworld/GreeterClient.scala#L6-L98 "Go to snippet source")package example.myapp.helloworld

import akka.{ Done, NotUsed }
import akka.actor.ActorSystem
import akka.grpc.GrpcClientSettings
import akka.stream.scaladsl.Source
import example.myapp.helloworld.grpc._

import scala.concurrent.Future
import scala.concurrent.duration._
import scala.util.{ Failure, Success }

object GreeterClient {
  def main(args: Array[String]): Unit = {
    // Boot akka
    implicit val sys = ActorSystem("HelloWorldClient")
    implicit val ec = sys.dispatcher

    // Configure the client by code:
    val clientSettings = GrpcClientSettings.connectToServiceAt("127.0.0.1", 8080).withTls(false)

    // Or via application.conf:
    // val clientSettings = GrpcClientSettings.fromConfig(GreeterService.name)

    // Create a client-side stub for the service
    val client: GreeterService = GreeterServiceClient(clientSettings)

    // Run examples for each of the exposed service methods.
    runSingleRequestReplyExample()
    runStreamingRequestExample()
    runStreamingReplyExample()
    runStreamingRequestReplyExample()

    sys.scheduler.scheduleWithFixedDelay(1.second, 1.second) { () => runSingleRequestReplyExample() }

    def runSingleRequestReplyExample(): Unit = {
      sys.log.info("Performing request")
      val reply = client.sayHello(HelloRequest("Alice"))
      reply.onComplete {
        case Success(msg) =>
          println(s"got single reply: $msg")
        case Failure(e) =>
          println(s"Error sayHello: $e")
      }
    }

    def runStreamingRequestExample(): Unit = {
      val requests = List("Alice", "Bob", "Peter").map(HelloRequest(_))
      val reply = client.itKeepsTalking(Source(requests))
      reply.onComplete {
        case Success(msg) =>
          println(s"got single reply for streaming requests: $msg")
        case Failure(e) =>
          println(s"Error streamingRequest: $e")
      }
    }

    def runStreamingReplyExample(): Unit = {
      val responseStream = client.itKeepsReplying(HelloRequest("Alice"))
      val done: Future[Done] =
        responseStream.runForeach(reply => println(s"got streaming reply: ${reply.message}"))

      done.onComplete {
        case Success(_) =>
          println("streamingReply done")
        case Failure(e) =>
          println(s"Error streamingReply: $e")
      }
    }

    def runStreamingRequestReplyExample(): Unit = {
      val requestStream: Source[HelloRequest, NotUsed] =
        Source
          .tick(100.millis, 1.second, "tick")
          .zipWithIndex
          .map { case (_, i) => i }
          .map(i => HelloRequest(s"Alice-$i"))
          .take(10)
          .mapMaterializedValue(_ => NotUsed)

      val responseStream: Source[HelloReply, NotUsed] = client.streamHellos(requestStream)
      val done: Future[Done] =
        responseStream.runForeach(reply => println(s"got streaming reply: ${reply.message}"))

      done.onComplete {
        case Success(_) =>
          println("streamingRequestReply done")
        case Failure(e) =>
          println(s"Error streamingRequestReply: $e")
      }
    }
  }
}
```

Java

```
[source](https://github.com/akka/akka-grpc/tree/v2.5.10/plugin-tester-java/src/main/java/example/myapp/helloworld/GreeterClient.java#L6-L106 "Go to snippet source")package example.myapp.helloworld;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import java.time.Duration;

import io.grpc.StatusRuntimeException;

import akka.Done;
import akka.NotUsed;
import akka.actor.ActorSystem;
import akka.stream.SystemMaterializer;
import akka.stream.Materializer;
import akka.stream.javadsl.Source;
import akka.grpc.GrpcClientSettings;

import example.myapp.helloworld.grpc.*;

class GreeterClient {
  public static void main(String[] args) throws Exception {

    String serverHost = "127.0.0.1";
    int serverPort = 8090;

    ActorSystem system = ActorSystem.create("HelloWorldClient");
    Materializer materializer = SystemMaterializer.get(system).materializer();

    // Configure the client by code:
    GrpcClientSettings settings = GrpcClientSettings.connectToServiceAt("127.0.0.1", 8090, system).withTls(false);

    // Or via application.conf:
    // GrpcClientSettings settings = GrpcClientSettings.fromConfig(GreeterService.name, system);

    GreeterServiceClient client = null;
    try {
      client = GreeterServiceClient.create(settings, system);

      singleRequestReply(client);
      streamingRequest(client);
      streamingReply(client, materializer);
      streamingRequestReply(client, materializer);

    } catch (StatusRuntimeException e) {
      System.out.println("Status: " + e.getStatus());
    } catch (Exception e)  {
      System.out.println(e);
    } finally {
      if (client != null) client.close();
      system.terminate();
    }

  }

  private static void singleRequestReply(GreeterService client) throws Exception {
    HelloRequest request = HelloRequest.newBuilder().setName("Alice").build();
    CompletionStage<HelloReply> reply = client.sayHello(request);
    System.out.println("got single reply: " + reply.toCompletableFuture().get(5, TimeUnit.SECONDS));
  }

  private static void streamingRequest(GreeterService client) throws Exception {
    List<HelloRequest> requests = Arrays.asList("Alice", "Bob", "Peter")
        .stream().map(name -> HelloRequest.newBuilder().setName(name).build())
        .collect(Collectors.toList());
    CompletionStage<HelloReply> reply = client.itKeepsTalking(Source.from(requests));
    System.out.println("got single reply for streaming requests: " +
        reply.toCompletableFuture().get(5, TimeUnit.SECONDS));
  }

  private static void streamingReply(GreeterService client, Materializer mat) throws Exception {
    HelloRequest request = HelloRequest.newBuilder().setName("Alice").build();
    Source<HelloReply, NotUsed> responseStream = client.itKeepsReplying(request);
    CompletionStage<Done> done =
      responseStream.runForeach(reply ->
        System.out.println("got streaming reply: " + reply.getMessage()), mat);

    done.toCompletableFuture().get(60, TimeUnit.SECONDS);
  }

  private static void streamingRequestReply(GreeterService client, Materializer mat) throws Exception {
    Duration interval = Duration.ofSeconds(1);
    Source<HelloRequest, NotUsed> requestStream = Source
      .tick(interval, interval, "tick")
      .zipWithIndex()
      .map(pair -> pair.second())
      .map(i -> HelloRequest.newBuilder().setName("Alice-" + i).build())
      .take(10)
      .mapMaterializedValue(m -> NotUsed.getInstance());

    Source<HelloReply, NotUsed> responseStream = client.streamHellos(requestStream);
    CompletionStage<Done> done =
      responseStream.runForeach(reply ->
        System.out.println("got streaming reply: " + reply.getMessage()), mat);

    done.toCompletableFuture().get(60, TimeUnit.SECONDS);
  }

}
```

You can run the example with

sbt

```
runMain io.grpc.examples.helloworld.GreeterClient

```

Gradle

```
./gradlew run

```

Maven

```
mvn akka-grpc:generate compile exec:java -Dexec.mainClass=io.grpc.examples.helloworld.GreeterClient

```

## Code Examples

### Example 1: Setting up

```scala
// in project/plugins.sbt:
resolvers += "Akka library repository".at("https://repo.akka.io/maven")
addSbtPlugin("com.lightbend.akka.grpc" % "sbt-akka-grpc" % "2.5.10")
//
// in build.sbt:
resolvers += "Akka library repository".at("https://repo.akka.io/maven")
enablePlugins(AkkaGrpcPlugin)
```

### Example 2: Setting up

```gradle
buildscript {
  repositories {
gradlePluginPortal()
maven {
  url "https://repo.akka.io/maven"
}
  }
}
plugins {
  id 'java'
  id 'application'
  id 'com.lightbend.akka.grpc.gradle' version '2.5.10'
}
repositories {
  mavenCentral()
  maven {
url "https://repo.akka.io/maven"
  }
}
```

### Example 3: Setting up

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
  <url>https://repo.akka.io/maven</url>
</repository>
  </repositories>
  <pluginRepositories>
<pluginRepository>
  <id>akka-repository</id>
  <name>Akka library repository</name>
  <url>https://repo.akka.io/maven</url>
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

### Example 4: Generating Service Stubs

```proto
syntax = "proto3";

option java_multiple_files = true;
option java_package = "example.myapp.helloworld.grpc";
option java_outer_classname = "HelloWorldProto";

package helloworld;

////////////////////////////////////// The greeting service definition.
service GreeterService {
    //////////////////////
    // Sends a greeting //
    ////////*****/////////
    //      HELLO       //
    ////////*****/////////
    rpc SayHello (HelloRequest) returns (HelloReply) {}

    // Comment spanning
    // on several lines
    rpc ItKeepsTalking (stream HelloRequest) returns (HelloReply) {}

    /*
     * C style comments
     */
    rpc ItKeepsReplying (HelloRequest) returns (stream HelloReply) {}

    /* C style comments
     * on several lines
     * with non-empty heading/trailing line */
    rpc StreamHellos (stream HelloRequest) returns (stream HelloReply) {}
}

// The request message containing the user's name.
message HelloRequest {
    string name = 1;
}

// The response message containing the greetings
message HelloReply {
    string message = 1;
}
```

### Example 5: Generating Service Stubs

```scala
// Generated by Akka gRPC. DO NOT EDIT.
package example.myapp.helloworld.grpc

import akka.annotation.ApiMayChange

import akka.grpc.AkkaGrpcGenerated

/**
 * #services
 * //////////////////////////////////// The greeting service definition.
 */
@AkkaGrpcGenerated
trait GreeterService {
  
  /**
   * ////////////////////
   * Sends a greeting //
   * //////&#42;****&#47;////////
   *      HELLO       //
   * //////&#42;****&#47;////////
   */
  def sayHello(in: example.myapp.helloworld.grpc.HelloRequest): scala.concurrent.Future[example.myapp.helloworld.grpc.HelloReply]
  
  /**
   * Comment spanning
   * on several lines
   */
  def itKeepsTalking(in: akka.stream.scaladsl.Source[example.myapp.helloworld.grpc.HelloRequest, akka.NotUsed]): scala.concurrent.Future[example.myapp.helloworld.grpc.HelloReply]
  
  /**
   *  C style comments
   */
  def itKeepsReplying(in: example.myapp.helloworld.grpc.HelloRequest): akka.stream.scaladsl.Source[example.myapp.helloworld.grpc.HelloReply, akka.NotUsed]
  
  /**
   * C style comments
   * on several lines
   * with non-empty heading/trailing line    */
  def streamHellos(in: akka.stream.scaladsl.Source[example.myapp.helloworld.grpc.HelloRequest, akka.NotUsed]): akka.stream.scaladsl.Source[example.myapp.helloworld.grpc.HelloReply, akka.NotUsed]
  
}



@AkkaGrpcGenerated
object GreeterService extends akka.grpc.ServiceDescription {
  val name = "helloworld.GreeterService"

  val descriptor: com.google.protobuf.Descriptors.FileDescriptor =
    example.myapp.helloworld.grpc.HelloworldProto.javaDescriptor;

  object Serializers {
    import akka.grpc.scaladsl.ScalapbProtobufSerializer
    
    val HelloRequestSerializer = new ScalapbProtobufSerializer(example.myapp.helloworld.grpc.HelloRequest.messageCompanion)
    
    val HelloReplySerializer = new ScalapbProtobufSerializer(example.myapp.helloworld.grpc.HelloReply.messageCompanion)
    
  }

  @ApiMayChange
  @AkkaGrpcGenerated
  object MethodDescriptors {
    import akka.grpc.internal.Marshaller
    import io.grpc.MethodDescriptor
    import Serializers._

    
    val sayHelloDescriptor: MethodDescriptor[example.myapp.helloworld.grpc.HelloRequest, example.myapp.helloworld.grpc.HelloReply] =
      MethodDescriptor.newBuilder()
        .setType(
   MethodDescriptor.MethodType.UNARY 
  
  
  
)
        .setFullMethodName(MethodDescriptor.generateFullMethodName("helloworld.GreeterService", "SayHello"))
        .setRequestMarshaller(new Marshaller(HelloRequestSerializer))
        .setResponseMarshaller(new Marshaller(HelloReplySerializer))
        .setSampledToLocalTracing(true)
        .build()
    
    val itKeepsTalkingDescriptor: MethodDescriptor[example.myapp.helloworld.grpc.HelloRequest, example.myapp.helloworld.grpc.HelloReply] =
      MethodDescriptor.newBuilder()
        .setType(
  
  MethodDescriptor.MethodType.CLIENT_STREAMING 
  
  
)
        .setFullMethodName(MethodDescriptor.generateFullMethodName("helloworld.GreeterService", "ItKeepsTalking"))
        .setRequestMarshaller(new Marshaller(HelloRequestSerializer))
        .setResponseMarshaller(new Marshaller(HelloReplySerializer))
        .setSampledToLocalTracing(true)
        .build()
    
    val itKeepsReplyingDescriptor: MethodDescriptor[example.myapp.helloworld.grpc.HelloRequest, example.myapp.helloworld.grpc.HelloReply] =
      MethodDescriptor.newBuilder()
        .setType(
  
  
   MethodDescriptor.MethodType.SERVER_STREAMING 
  
)
        .setFullMethodName(MethodDescriptor.generateFullMethodName("helloworld.GreeterService", "ItKeepsReplying"))
        .setRequestMarshaller(new Marshaller(HelloRequestSerializer))
        .setResponseMarshaller(new Marshaller(HelloReplySerializer))
        .setSampledToLocalTracing(true)
        .build()
    
    val streamHellosDescriptor: MethodDescriptor[example.myapp.helloworld.grpc.HelloRequest, example.myapp.helloworld.grpc.HelloReply] =
      MethodDescriptor.newBuilder()
        .setType(
  
  
  
  MethodDescriptor.MethodType.BIDI_STREAMING 
)
        .setFullMethodName(MethodDescriptor.generateFullMethodName("helloworld.GreeterService", "StreamHellos"))
        .setRequestMarshaller(new Marshaller(HelloRequestSerializer))
        .setResponseMarshaller(new Marshaller(HelloReplySerializer))
        .setSampledToLocalTracing(true)
        .build()
    
  }
}
```

### Example 6: Generating Service Stubs

```java
// Generated by Akka gRPC. DO NOT EDIT.
package example.myapp.helloworld.grpc;

import akka.grpc.ProtobufSerializer;
import akka.grpc.javadsl.GoogleProtobufSerializer;

import akka.grpc.AkkaGrpcGenerated;

/**
 * //////////////////////////////////// The greeting service definition.
 */
public interface GreeterService {
  
  /**
   * ////////////////////
   * Sends a greeting //
   * //////&#42;****&#47;////////
   *      HELLO       //
   * //////&#42;****&#47;////////
   */
  java.util.concurrent.CompletionStage<example.myapp.helloworld.grpc.HelloReply> sayHello(example.myapp.helloworld.grpc.HelloRequest in);
  
  
  java.util.concurrent.CompletionStage<com.google.api.HttpBody> sayHelloHttp(example.myapp.helloworld.grpc.HelloRequest in);
  
  /**
   * Comment spanning
   * on several lines
   */
  java.util.concurrent.CompletionStage<example.myapp.helloworld.grpc.HelloReply> itKeepsTalking(akka.stream.javadsl.Source<example.myapp.helloworld.grpc.HelloRequest, akka.NotUsed> in);
  
  /**
   *  C style comments
   */
  akka.stream.javadsl.Source<example.myapp.helloworld.grpc.HelloReply, akka.NotUsed> itKeepsReplying(example.myapp.helloworld.grpc.HelloRequest in);
  
  /**
   * C style comments
   * on several lines
   * with non-empty heading/trailing line    */
  akka.stream.javadsl.Source<example.myapp.helloworld.grpc.HelloReply, akka.NotUsed> streamHellos(akka.stream.javadsl.Source<example.myapp.helloworld.grpc.HelloRequest, akka.NotUsed> in);
  

  static String name = "helloworld.GreeterService";
  static akka.grpc.ServiceDescription description = new akka.grpc.internal.ServiceDescriptionImpl(name, HelloWorldProto.getDescriptor());

  @AkkaGrpcGenerated
  public static class Serializers {
    
      public static ProtobufSerializer<example.myapp.helloworld.grpc.HelloRequest> HelloRequestSerializer = new GoogleProtobufSerializer<>(example.myapp.helloworld.grpc.HelloRequest.parser());
    
      public static ProtobufSerializer<example.myapp.helloworld.grpc.HelloReply> HelloReplySerializer = new GoogleProtobufSerializer<>(example.myapp.helloworld.grpc.HelloReply.parser());
    
      public static ProtobufSerializer<com.google.api.HttpBody> google_api_HttpBodySerializer = new GoogleProtobufSerializer<>(com.google.api.HttpBody.parser());
    
  }
}
```

### Example 7: Writing a Client Program

```text
compile
```

### Example 8: Writing a Client Program

```text
./gradlew build
```

### Example 9: Writing a Client Program

```text
mvn akka-grpc:generate
```

### Example 10: Writing a Client Program

```scala
package example.myapp.helloworld

import akka.{ Done, NotUsed }
import akka.actor.ActorSystem
import akka.grpc.GrpcClientSettings
import akka.stream.scaladsl.Source
import example.myapp.helloworld.grpc._

import scala.concurrent.Future
import scala.concurrent.duration._
import scala.util.{ Failure, Success }

object GreeterClient {
  def main(args: Array[String]): Unit = {
    // Boot akka
    implicit val sys = ActorSystem("HelloWorldClient")
    implicit val ec = sys.dispatcher

    // Configure the client by code:
    val clientSettings = GrpcClientSettings.connectToServiceAt("127.0.0.1", 8080).withTls(false)

    // Or via application.conf:
    // val clientSettings = GrpcClientSettings.fromConfig(GreeterService.name)

    // Create a client-side stub for the service
    val client: GreeterService = GreeterServiceClient(clientSettings)

    // Run examples for each of the exposed service methods.
    runSingleRequestReplyExample()
    runStreamingRequestExample()
    runStreamingReplyExample()
    runStreamingRequestReplyExample()

    sys.scheduler.scheduleWithFixedDelay(1.second, 1.second) { () => runSingleRequestReplyExample() }

    def runSingleRequestReplyExample(): Unit = {
      sys.log.info("Performing request")
      val reply = client.sayHello(HelloRequest("Alice"))
      reply.onComplete {
        case Success(msg) =>
          println(s"got single reply: $msg")
        case Failure(e) =>
          println(s"Error sayHello: $e")
      }
    }

    def runStreamingRequestExample(): Unit = {
      val requests = List("Alice", "Bob", "Peter").map(HelloRequest(_))
      val reply = client.itKeepsTalking(Source(requests))
      reply.onComplete {
        case Success(msg) =>
          println(s"got single reply for streaming requests: $msg")
        case Failure(e) =>
          println(s"Error streamingRequest: $e")
      }
    }

    def runStreamingReplyExample(): Unit = {
      val responseStream = client.itKeepsReplying(HelloRequest("Alice"))
      val done: Future[Done] =
        responseStream.runForeach(reply => println(s"got streaming reply: ${reply.message}"))

      done.onComplete {
        case Success(_) =>
          println("streamingReply done")
        case Failure(e) =>
          println(s"Error streamingReply: $e")
      }
    }

    def runStreamingRequestReplyExample(): Unit = {
      val requestStream: Source[HelloRequest, NotUsed] =
        Source
          .tick(100.millis, 1.second, "tick")
          .zipWithIndex
          .map { case (_, i) => i }
          .map(i => HelloRequest(s"Alice-$i"))
          .take(10)
          .mapMaterializedValue(_ => NotUsed)

      val responseStream: Source[HelloReply, NotUsed] = client.streamHellos(requestStream)
      val done: Future[Done] =
        responseStream.runForeach(reply => println(s"got streaming reply: ${reply.message}"))

      done.onComplete {
        case Success(_) =>
          println("streamingRequestReply done")
        case Failure(e) =>
          println(s"Error streamingRequestReply: $e")
      }
    }
  }
}
```

### Example 11: Writing a Client Program

```java
package example.myapp.helloworld;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import java.time.Duration;

import io.grpc.StatusRuntimeException;

import akka.Done;
import akka.NotUsed;
import akka.actor.ActorSystem;
import akka.stream.SystemMaterializer;
import akka.stream.Materializer;
import akka.stream.javadsl.Source;
import akka.grpc.GrpcClientSettings;

import example.myapp.helloworld.grpc.*;

class GreeterClient {
  public static void main(String[] args) throws Exception {

    String serverHost = "127.0.0.1";
    int serverPort = 8090;

    ActorSystem system = ActorSystem.create("HelloWorldClient");
    Materializer materializer = SystemMaterializer.get(system).materializer();

    // Configure the client by code:
    GrpcClientSettings settings = GrpcClientSettings.connectToServiceAt("127.0.0.1", 8090, system).withTls(false);

    // Or via application.conf:
    // GrpcClientSettings settings = GrpcClientSettings.fromConfig(GreeterService.name, system);

    GreeterServiceClient client = null;
    try {
      client = GreeterServiceClient.create(settings, system);

      singleRequestReply(client);
      streamingRequest(client);
      streamingReply(client, materializer);
      streamingRequestReply(client, materializer);


    } catch (StatusRuntimeException e) {
      System.out.println("Status: " + e.getStatus());
    } catch (Exception e)  {
      System.out.println(e);
    } finally {
      if (client != null) client.close();
      system.terminate();
    }

  }

  private static void singleRequestReply(GreeterService client) throws Exception {
    HelloRequest request = HelloRequest.newBuilder().setName("Alice").build();
    CompletionStage<HelloReply> reply = client.sayHello(request);
    System.out.println("got single reply: " + reply.toCompletableFuture().get(5, TimeUnit.SECONDS));
  }

  private static void streamingRequest(GreeterService client) throws Exception {
    List<HelloRequest> requests = Arrays.asList("Alice", "Bob", "Peter")
        .stream().map(name -> HelloRequest.newBuilder().setName(name).build())
        .collect(Collectors.toList());
    CompletionStage<HelloReply> reply = client.itKeepsTalking(Source.from(requests));
    System.out.println("got single reply for streaming requests: " +
        reply.toCompletableFuture().get(5, TimeUnit.SECONDS));
  }

  private static void streamingReply(GreeterService client, Materializer mat) throws Exception {
    HelloRequest request = HelloRequest.newBuilder().setName("Alice").build();
    Source<HelloReply, NotUsed> responseStream = client.itKeepsReplying(request);
    CompletionStage<Done> done =
      responseStream.runForeach(reply ->
        System.out.println("got streaming reply: " + reply.getMessage()), mat);

    done.toCompletableFuture().get(60, TimeUnit.SECONDS);
  }

  private static void streamingRequestReply(GreeterService client, Materializer mat) throws Exception {
    Duration interval = Duration.ofSeconds(1);
    Source<HelloRequest, NotUsed> requestStream = Source
      .tick(interval, interval, "tick")
      .zipWithIndex()
      .map(pair -> pair.second())
      .map(i -> HelloRequest.newBuilder().setName("Alice-" + i).build())
      .take(10)
      .mapMaterializedValue(m -> NotUsed.getInstance());

    Source<HelloReply, NotUsed> responseStream = client.streamHellos(requestStream);
    CompletionStage<Done> done =
      responseStream.runForeach(reply ->
        System.out.println("got streaming reply: " + reply.getMessage()), mat);

    done.toCompletableFuture().get(60, TimeUnit.SECONDS);
  }

}
```

### Example 12: Writing a Client Program

```text
runMain io.grpc.examples.helloworld.GreeterClient
```

### Example 13: Writing a Client Program

```text
./gradlew run
```

### Example 14: Writing a Client Program

```text
mvn akka-grpc:generate compile exec:java -Dexec.mainClass=io.grpc.examples.helloworld.GreeterClient
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/libraries/akka-grpc/current/buildtools/gradle.html
- https://doc.akka.io/libraries/akka-grpc/current/buildtools/maven.html
- https://doc.akka.io/libraries/akka-grpc/current/buildtools/sbt.html
- https://doc.akka.io/libraries/akka-grpc/current/client/configuration.html
- https://doc.akka.io/libraries/akka-grpc/current/client/index.html
- https://doc.akka.io/libraries/akka-grpc/current/proto.html
- https://doc.akka.io/libraries/akka-grpc/current/server/index.html

---
*Source: [https://doc.akka.io/libraries/akka-grpc/current/client/walkthrough.html](https://doc.akka.io/libraries/akka-grpc/current/client/walkthrough.html)*