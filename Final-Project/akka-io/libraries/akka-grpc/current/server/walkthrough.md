---
description: Akka gRPC - Support for building streaming gRPC servers and clients on
  top of Akka Streams.
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:23:46Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-grpc/current/server/walkthrough.html
title: Walkthrough • Akka gRPC
---

# Walkthrough • Akka gRPC

> **Summary:** Akka gRPC - Support for building streaming gRPC servers and clients on top of Akka Streams.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Walkthrough

## Setting up

To get started, you must obtain or write the [`.proto`](../proto.html) file(s) that describe the interface you want to implement and add those files to your project. Add `.proto` files to your project’s `src/main/protobuf``src/main/proto``src/main/proto` directory. (See the detailed chapters on [sbt](../buildtools/sbt.html), [Gradle](../buildtools/gradle.html) and [Maven](../buildtools/maven.html) for information on taking .proto definitions from dependencies)

Then add the Akka gRPC plugin to your build:

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
  </dependencies>
  <build>
    <plugins>
      <plugin>
        <groupId>com.lightbend.akka.grpc</groupId>
        <artifactId>akka-grpc-maven-plugin</artifactId>
        <version>${akka.grpc.version}</version>
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

## Writing a service definition

Define the interfaces you want to implement in your project’s `src/main/protobuf``src/main/proto``src/main/proto` file(s).

For example, this is the definition of a Hello World service:

```
[source](https://github.com/akka/akka-grpc/tree/v2.5.10/plugin-tester-scala/src/main/protobuf/helloworld.proto "Go to snippet source")syntax = "proto3";

import "google/protobuf/timestamp.proto";

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
    google.protobuf.Timestamp timestamp = 2;
}
```

## Generating interfaces and stubs

Start by generating code from the `.proto` definition with:

sbt

```
sbt compile

```

Gradle

```
./gradlew build

```

Maven

```
mvn akka-grpc:generate

```

From the above definition, Akka gRPC generates interfaces that look like this:

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

## Implementing the service

Let’s implement these 4 calls in a new class:

Scala

```
[source](https://github.com/akka/akka-grpc/tree/v2.5.10/plugin-tester-scala/src/main/scala/example/myapp/helloworld/GreeterServiceImpl.scala#L6-L38 "Go to snippet source")package example.myapp.helloworld

import scala.concurrent.Future
import akka.NotUsed
import akka.stream.Materializer
import akka.stream.scaladsl.Sink
import akka.stream.scaladsl.Source
import com.google.protobuf.timestamp.Timestamp
import example.myapp.helloworld.grpc._

class GreeterServiceImpl(implicit mat: Materializer) extends GreeterService {
  import mat.executionContext

  override def sayHello(in: HelloRequest): Future[HelloReply] = {
    println(s"sayHello to ${in.name}")
    Future.successful(HelloReply(s"Hello, ${in.name}", Some(Timestamp.apply(123456, 123))))
  }

  override def itKeepsTalking(in: Source[HelloRequest, NotUsed]): Future[HelloReply] = {
    println(s"sayHello to in stream...")
    in.runWith(Sink.seq).map(elements => HelloReply(s"Hello, ${elements.map(_.name).mkString(", ")}"))
  }

  override def itKeepsReplying(in: HelloRequest): Source[HelloReply, NotUsed] = {
    println(s"sayHello to ${in.name} with stream of chars...")
    Source(s"Hello, ${in.name}".toList).map(character => HelloReply(character.toString))
  }

  override def streamHellos(in: Source[HelloRequest, NotUsed]): Source[HelloReply, NotUsed] = {
    println(s"sayHello to stream...")
    in.map(request => HelloReply(s"Hello, ${request.name}"))
  }
}
```

Java

```
[source](https://github.com/akka/akka-grpc/tree/v2.5.10/plugin-tester-java/src/main/java/example/myapp/helloworld/GreeterServiceImpl.java#L6-L76 "Go to snippet source")package example.myapp.helloworld;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;
import java.util.stream.Collectors;

import akka.NotUsed;
import akka.stream.Materializer;
import akka.stream.javadsl.Sink;
import akka.stream.javadsl.Source;
import com.google.api.HttpBody;
import com.google.protobuf.BytesValue;
import com.google.protobuf.Timestamp;
import example.myapp.helloworld.grpc.*;

public class GreeterServiceImpl implements GreeterService {
  private final Materializer mat;

  public GreeterServiceImpl(Materializer mat) {
   this.mat = mat;
  }

  @Override
  public CompletionStage<HelloReply> sayHello(HelloRequest in) {
    System.out.println("sayHello to " + in.getName());
    HelloReply reply = HelloReply.newBuilder()
      .setMessage("Hello, " + in.getName())
      .setTimestamp(Timestamp.newBuilder().setSeconds(1234567890).setNanos(12345).build())
      .build();
    return CompletableFuture.completedFuture(reply);
  }

  @Override
  public CompletionStage<HttpBody> sayHelloHttp(HelloRequest in) {
    System.out.println("sayHelloHttp to " + in.getName());
    HttpBody reply = HttpBody.newBuilder().setData(
      com.google.protobuf.ByteString.copyFrom("test".getBytes())
    ).build();

    return CompletableFuture.completedFuture(reply);
  }

  @Override
  public CompletionStage<HelloReply> itKeepsTalking(Source<HelloRequest, NotUsed> in) {
    System.out.println("sayHello to in stream...");
    return in.runWith(Sink.seq(), mat)
      .thenApply(elements -> {
        String elementsStr = elements.stream().map(elem -> elem.getName())
            .collect(Collectors.toList()).toString();
        return HelloReply.newBuilder().setMessage("Hello, " + elementsStr).build();
      });
  }

  @Override
  public Source<HelloReply, NotUsed> itKeepsReplying(HelloRequest in) {
    System.out.println("sayHello to " + in.getName() + " with stream of chars");
    List<Character> characters = ("Hello, " + in.getName())
        .chars().mapToObj(c -> (char) c).collect(Collectors.toList());
    return Source.from(characters)
      .map(character -> {
        return HelloReply.newBuilder().setMessage(String.valueOf(character)).build();
      });
  }

  @Override
  public Source<HelloReply, NotUsed> streamHellos(Source<HelloRequest, NotUsed> in) {
    System.out.println("sayHello to stream...");
    return in.map(request -> HelloReply.newBuilder().setMessage("Hello, " + request.getName()).build());
  }
}
```

## Serving the service with Akka HTTP

Note, how the implementation we just wrote is free from any gRPC related boilerplate. It only uses the generated model and interfaces from your domain and basic Akka streams classes. We now need to connect this implementation class to the web server to offer it to clients.

Akka gRPC servers are implemented with Akka HTTP. In addition to the above `GreeterService`, a `GreeterServiceHandler``GreeterServiceHandlerFactory` was generated that wraps the implementation with the gRPC functionality to be plugged into an existing Akka HTTP server app.

You create the request handler by calling `GreeterServiceHandler(yourImpl)``GreeterServiceHandlerFactory.create(yourImpl, ...)`.

Note
The server will reuse the given instance of the implementation, which means that it is shared between (potentially concurrent) requests. Make sure that the implementation is thread\-safe. In the sample above there is no mutable state, so it is safe. For more information about safely implementing servers with state see the advice about [stateful](#stateful-services) below.

A complete main program that starts an Akka HTTP server with the `GreeterService` looks like this:

Scala

```
[source](https://github.com/akka/akka-grpc/tree/v2.5.10/plugin-tester-scala/src/main/scala/example/myapp/helloworld/GreeterServer.scala#L6-L47 "Go to snippet source")package example.myapp.helloworld

import akka.actor.ActorSystem
import akka.http.scaladsl.model.{ HttpRequest, HttpResponse }
import akka.http.scaladsl.Http
import com.typesafe.config.ConfigFactory
import example.myapp.helloworld.grpc._

import scala.concurrent.{ ExecutionContext, Future }

object GreeterServer {
  def main(args: Array[String]): Unit = {
    // Important: enable HTTP/2 in ActorSystem's config
    // We do it here programmatically, but you can also set it in the application.conf
    val conf =
      ConfigFactory.parseString("akka.http.server.enable-http2 = on").withFallback(ConfigFactory.defaultApplication())
    val system = ActorSystem("HelloWorld", conf)
    new GreeterServer(system).run()
    // ActorSystem threads will keep the app alive until `system.terminate()` is called
  }
}

class GreeterServer(system: ActorSystem) {
  def run(): Future[Http.ServerBinding] = {
    // Akka boot up code
    implicit val sys: ActorSystem = system
    implicit val ec: ExecutionContext = sys.dispatcher

    // Create service handlers
    val service: HttpRequest => Future[HttpResponse] =
      GreeterServiceHandler(new GreeterServiceImpl())

    // Bind service handler servers to localhost:8080/8081
    val binding = Http().newServerAt("127.0.0.1", 8080).bind(service)

    // report successful binding
    binding.foreach { binding => println(s"gRPC server bound to: ${binding.localAddress}") }

    binding
  }
}

```

Java

```
[source](https://github.com/akka/akka-grpc/tree/v2.5.10/plugin-tester-java/src/main/java/example/myapp/helloworld/GreeterServer.java#L6-L63 "Go to snippet source")package example.myapp.helloworld;

import akka.actor.ActorSystem;
import akka.grpc.javadsl.ServerReflection;
import akka.grpc.javadsl.ServiceHandler;

import akka.http.javadsl.Http;
import akka.http.javadsl.ServerBinding;
import akka.http.javadsl.model.HttpRequest;
import akka.http.javadsl.model.HttpResponse;
import akka.japi.function.Function;
import akka.stream.SystemMaterializer;
import akka.stream.Materializer;
import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;
import example.myapp.helloworld.grpc.GreeterService;
import example.myapp.helloworld.grpc.GreeterServiceHandlerFactory;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletionStage;

class GreeterServer {
  public static void main(String[] args) throws Exception {
    // important to enable HTTP/2 in ActorSystem's config
    Config conf = ConfigFactory.parseString("akka.http.server.enable-http2 = on")
            .withFallback(ConfigFactory.defaultApplication());

    // Akka ActorSystem Boot
    ActorSystem sys = ActorSystem.create("HelloWorld", conf);

    run(sys).thenAccept(binding -> {
      System.out.println("gRPC server bound to: " + binding.localAddress());
    });

    // ActorSystem threads will keep the app alive until `system.terminate()` is called
  }

  @SuppressWarnings("unchecked")
  public static CompletionStage<ServerBinding> run(ActorSystem sys) throws Exception {
    Materializer mat = SystemMaterializer.get(sys).materializer();

    // Instantiate implementation
    GreeterService impl = new GreeterServiceImpl(mat);

    // Create the reflection handler for multiple services
    Function<HttpRequest, CompletionStage<HttpResponse>> reflectionPartial =
      ServerReflection.create(List.of(GreeterService.description), sys);

    Function<HttpRequest, CompletionStage<HttpResponse>> serviceHandlers =
      ServiceHandler.concatOrNotFound(GreeterServiceHandlerFactory.create(impl, sys), reflectionPartial);

    return Http
      .get(sys)
      .newServerAt("127.0.0.1", 8090)
      .bind(serviceHandlers);
  }
}
```

Note
It’s important to enable HTTP/2 in Akka HTTP in the configuration of the `ActorSystem` by setting

```
akka.http.server.enable-http2 = on

```

In the example this was done from the `main` method, but you could also do this from within your `application.conf`.

The above example does not use TLS. Find more about how to [Serve gRPC over TLS](../deploy.html) on the deployment section.

## Serving multiple services

When a server handles several services the handlers must be combined with `akka.grpc.scaladsl.ServiceHandler.concatOrNotFound``akka.grpc.javadsl.ServiceHandler.concatOrNotFound`:

Scala

```
[source](https://github.com/akka/akka-grpc/tree/v2.5.10/plugin-tester-scala/src/main/scala/example/myapp/CombinedServer.scala#L21-L50 "Go to snippet source")import akka.grpc.scaladsl.ServiceHandler

// explicit types not needed but included in example for clarity
val greeterService: PartialFunction[HttpRequest, Future[HttpResponse]] =
  example.myapp.helloworld.grpc.GreeterServiceHandler.partial(new GreeterServiceImpl())
val echoService: PartialFunction[HttpRequest, Future[HttpResponse]] =
  EchoServiceHandler.partial(new EchoServiceImpl)
val reflectionService = ServerReflection.partial(List(GreeterService, EchoService))
val serviceHandlers: HttpRequest => Future[HttpResponse] =
  ServiceHandler.concatOrNotFound(greeterService, echoService, reflectionService)

Http()
  .newServerAt("127.0.0.1", 8080)
  .bind(serviceHandlers)
```

Java

```
[source](https://github.com/akka/akka-grpc/tree/v2.5.10/plugin-tester-java/src/main/java/example/myapp/CombinedServer.java#L18-L22 "Go to snippet source")import akka.grpc.javadsl.ServiceHandler;
import akka.http.javadsl.model.HttpRequest;
import akka.http.javadsl.model.HttpResponse;
import akka.japi.function.Function;

Function<HttpRequest, CompletionStage<HttpResponse>> greeterService =
    GreeterServiceHandlerFactory.create(new GreeterServiceImpl(mat), sys);
Function<HttpRequest, CompletionStage<HttpResponse>> echoService =
  EchoServiceHandlerFactory.create(new EchoServiceImpl(), sys);
@SuppressWarnings("unchecked")
Function<HttpRequest, CompletionStage<HttpResponse>> serviceHandlers =
  ServiceHandler.concatOrNotFound(greeterService, echoService);

Http.get(sys)
    .newServerAt("127.0.0.1", 8090)
    .bind(serviceHandlers)
```

Note that `GreeterServiceHandler.partial` and `EchoServiceHandler.partial` are used instead of `apply` methods to create partial functions that are combined by `concatOrNotFound`.

## Running the server

See the detailed chapters on [sbt](../buildtools/sbt.html#starting-your-akka-grpc-server-from-sbt), [Gradle](../buildtools/gradle.html#starting-your-akka-grpc-server-from-gradle) and [Maven](../buildtools/maven.html#starting-your-akka-grpc-server-from-maven) for details on adding the agent.

## Stateful services

More often than not, the whole point of the implementing a service is to keep state. Since the service implementation is shared between concurrent incoming requests any state must be thread safe.

There are two recommended ways to deal with this:

- Put the mutable state inside an actor and interact with it through `ask` from unary methods or `Flow.ask` from streams.
- Keep the state in a thread\-safe place. For example, a CRUD application that is backed by a database is thread\-safe when access to the backing database is (which until recently was THE way that applications dealt with request concurrency).

This is an example based on the Hello World above, but allowing users to change the greeting through a unary call:

Scala

```
[source](https://github.com/akka/akka-grpc/tree/v2.5.10/plugin-tester-scala/src/main/scala/example/myapp/statefulhelloworld/GreeterServiceImpl.scala#L17-L34 "Go to snippet source")class GreeterServiceImpl(system: ActorSystem) extends GreeterService {
  val greeterActor = system.actorOf(GreeterActor.props("Hello"), "greeter")

  def sayHello(in: HelloRequest): Future[HelloReply] = {
    // timeout and execution context for ask
    implicit val timeout: Timeout = 3.seconds
    import system.dispatcher

    (greeterActor ? GreeterActor.GetGreeting)
      .mapTo[GreeterActor.Greeting]
      .map(message => HelloReply(s"${message.greeting}, ${in.name}"))
  }

  def changeGreeting(in: ChangeRequest): Future[ChangeResponse] = {
    greeterActor ! GreeterActor.ChangeGreeting(in.newGreeting)
    Future.successful(ChangeResponse())
  }
}
```

Java

```
[source](https://github.com/akka/akka-grpc/tree/v2.5.10/plugin-tester-java/src/main/java/example/myapp/statefulhelloworld/GreeterServiceImpl.java#L18-L42 "Go to snippet source")public final class GreeterServiceImpl implements GreeterService {

  private final ActorSystem system;
  private final ActorRef greeterActor;

  public GreeterServiceImpl(ActorSystem system) {
    this.system = system;
    this.greeterActor = system.actorOf(GreeterActor.props("Hello"), "greeter");
  }

  public CompletionStage<HelloReply> sayHello(HelloRequest in) {
    return ask(greeterActor, GreeterActor.GET_GREETING, Duration.ofSeconds(5))
        .thenApply(message ->
          HelloReply.newBuilder()
            .setMessage(((GreeterActor.Greeting) message).greeting)
            .build()
        );
  }

  public CompletionStage<ChangeResponse> changeGreeting(ChangeRequest in) {
    greeterActor.tell(new GreeterActor.ChangeGreeting(in.getNewGreeting()), ActorRef.noSender());
    return CompletableFuture.completedFuture(ChangeResponse.newBuilder().build());
  }

}
```

The `GreeterActor` is implemented like this:

Scala

```
[source](https://github.com/akka/akka-grpc/tree/v2.5.10/plugin-tester-scala/src/main/scala/example/myapp/statefulhelloworld/GreeterActor.scala#L11-L30 "Go to snippet source")object GreeterActor {
  case class ChangeGreeting(newGreeting: String)

  case object GetGreeting
  case class Greeting(greeting: String)

  def props(initialGreeting: String) = Props(new GreeterActor(initialGreeting))
}

class GreeterActor(initialGreeting: String) extends Actor {
  import GreeterActor._

  var greeting = Greeting(initialGreeting)

  def receive = {
    case GetGreeting => sender() ! greeting
    case ChangeGreeting(newGreeting) =>
      greeting = Greeting(newGreeting)
  }
}
```

Java

```
[source](https://github.com/akka/akka-grpc/tree/v2.5.10/plugin-tester-java/src/main/java/example/myapp/statefulhelloworld/GreeterActor.java#L11-L53 "Go to snippet source")public class GreeterActor extends AbstractActor {

  public static class ChangeGreeting {
    public final String newGreeting;
    public ChangeGreeting(String newGreeting) {
      this.newGreeting = newGreeting;
    }
  }
  public static class GetGreeting {}
  public static GetGreeting GET_GREETING = new GetGreeting();

  public static class Greeting {
    public final String greeting;
    public Greeting(String greeting) {
      this.greeting = greeting;
    }
  }

  public static Props props(final String initialGreeting) {
    return Props.create(GreeterActor.class, () -> new GreeterActor(initialGreeting));
  }

  private Greeting greeting;

  public GreeterActor(String initialGreeting) {
    greeting = new Greeting(initialGreeting);
  }

  public AbstractActor.Receive createReceive() {
    return receiveBuilder()
        .match(GetGreeting.class, this::onGetGreeting)
        .match(ChangeGreeting.class, this::onChangeGreeting)
        .build();
  }

  private void onGetGreeting(GetGreeting get) {
    getSender().tell(greeting, getSelf());
  }

  private void onChangeGreeting(ChangeGreeting change) {
    greeting = new Greeting(change.newGreeting);
  }
}
```

Now the actor mailbox is used to synchronize accesses to the mutable state.

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
  </dependencies>
  <build>
    <plugins>
      <plugin>
        <groupId>com.lightbend.akka.grpc</groupId>
        <artifactId>akka-grpc-maven-plugin</artifactId>
        <version>${akka.grpc.version}</version>
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

### Example 4: Writing a service definition

```proto
syntax = "proto3";

import "google/protobuf/timestamp.proto";

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
    google.protobuf.Timestamp timestamp = 2;
}
```

### Example 5: Generating interfaces and stubs

```text
sbt compile
```

### Example 6: Generating interfaces and stubs

```text
./gradlew build
```

### Example 7: Generating interfaces and stubs

```text
mvn akka-grpc:generate
```

### Example 8: Generating interfaces and stubs

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

### Example 9: Generating interfaces and stubs

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

### Example 10: Implementing the service

```scala
package example.myapp.helloworld

import scala.concurrent.Future
import akka.NotUsed
import akka.stream.Materializer
import akka.stream.scaladsl.Sink
import akka.stream.scaladsl.Source
import com.google.protobuf.timestamp.Timestamp
import example.myapp.helloworld.grpc._

class GreeterServiceImpl(implicit mat: Materializer) extends GreeterService {
  import mat.executionContext

  override def sayHello(in: HelloRequest): Future[HelloReply] = {
    println(s"sayHello to ${in.name}")
    Future.successful(HelloReply(s"Hello, ${in.name}", Some(Timestamp.apply(123456, 123))))
  }

  override def itKeepsTalking(in: Source[HelloRequest, NotUsed]): Future[HelloReply] = {
    println(s"sayHello to in stream...")
    in.runWith(Sink.seq).map(elements => HelloReply(s"Hello, ${elements.map(_.name).mkString(", ")}"))
  }

  override def itKeepsReplying(in: HelloRequest): Source[HelloReply, NotUsed] = {
    println(s"sayHello to ${in.name} with stream of chars...")
    Source(s"Hello, ${in.name}".toList).map(character => HelloReply(character.toString))
  }

  override def streamHellos(in: Source[HelloRequest, NotUsed]): Source[HelloReply, NotUsed] = {
    println(s"sayHello to stream...")
    in.map(request => HelloReply(s"Hello, ${request.name}"))
  }
}
```

### Example 11: Implementing the service

```java
package example.myapp.helloworld;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;
import java.util.stream.Collectors;

import akka.NotUsed;
import akka.stream.Materializer;
import akka.stream.javadsl.Sink;
import akka.stream.javadsl.Source;
import com.google.api.HttpBody;
import com.google.protobuf.BytesValue;
import com.google.protobuf.Timestamp;
import example.myapp.helloworld.grpc.*;

public class GreeterServiceImpl implements GreeterService {
  private final Materializer mat;

  public GreeterServiceImpl(Materializer mat) {
   this.mat = mat;
  }

  @Override
  public CompletionStage<HelloReply> sayHello(HelloRequest in) {
    System.out.println("sayHello to " + in.getName());
    HelloReply reply = HelloReply.newBuilder()
      .setMessage("Hello, " + in.getName())
      .setTimestamp(Timestamp.newBuilder().setSeconds(1234567890).setNanos(12345).build())
      .build();
    return CompletableFuture.completedFuture(reply);
  }

  @Override
  public CompletionStage<HttpBody> sayHelloHttp(HelloRequest in) {
    System.out.println("sayHelloHttp to " + in.getName());
    HttpBody reply = HttpBody.newBuilder().setData(
      com.google.protobuf.ByteString.copyFrom("test".getBytes())
    ).build();

    return CompletableFuture.completedFuture(reply);
  }

  @Override
  public CompletionStage<HelloReply> itKeepsTalking(Source<HelloRequest, NotUsed> in) {
    System.out.println("sayHello to in stream...");
    return in.runWith(Sink.seq(), mat)
      .thenApply(elements -> {
        String elementsStr = elements.stream().map(elem -> elem.getName())
            .collect(Collectors.toList()).toString();
        return HelloReply.newBuilder().setMessage("Hello, " + elementsStr).build();
      });
  }

  @Override
  public Source<HelloReply, NotUsed> itKeepsReplying(HelloRequest in) {
    System.out.println("sayHello to " + in.getName() + " with stream of chars");
    List<Character> characters = ("Hello, " + in.getName())
        .chars().mapToObj(c -> (char) c).collect(Collectors.toList());
    return Source.from(characters)
      .map(character -> {
        return HelloReply.newBuilder().setMessage(String.valueOf(character)).build();
      });
  }

  @Override
  public Source<HelloReply, NotUsed> streamHellos(Source<HelloRequest, NotUsed> in) {
    System.out.println("sayHello to stream...");
    return in.map(request -> HelloReply.newBuilder().setMessage("Hello, " + request.getName()).build());
  }
}
```

### Example 12: Serving the service with Akka HTTP

```scala
package example.myapp.helloworld

import akka.actor.ActorSystem
import akka.http.scaladsl.model.{ HttpRequest, HttpResponse }
import akka.http.scaladsl.Http
import com.typesafe.config.ConfigFactory
import example.myapp.helloworld.grpc._

import scala.concurrent.{ ExecutionContext, Future }

object GreeterServer {
  def main(args: Array[String]): Unit = {
    // Important: enable HTTP/2 in ActorSystem's config
    // We do it here programmatically, but you can also set it in the application.conf
    val conf =
      ConfigFactory.parseString("akka.http.server.enable-http2 = on").withFallback(ConfigFactory.defaultApplication())
    val system = ActorSystem("HelloWorld", conf)
    new GreeterServer(system).run()
    // ActorSystem threads will keep the app alive until `system.terminate()` is called
  }
}

class GreeterServer(system: ActorSystem) {
  def run(): Future[Http.ServerBinding] = {
    // Akka boot up code
    implicit val sys: ActorSystem = system
    implicit val ec: ExecutionContext = sys.dispatcher

    // Create service handlers
    val service: HttpRequest => Future[HttpResponse] =
      GreeterServiceHandler(new GreeterServiceImpl())

    // Bind service handler servers to localhost:8080/8081
    val binding = Http().newServerAt("127.0.0.1", 8080).bind(service)

    // report successful binding
    binding.foreach { binding => println(s"gRPC server bound to: ${binding.localAddress}") }

    binding
  }
}
```

### Example 13: Serving the service with Akka HTTP

```java
package example.myapp.helloworld;

import akka.actor.ActorSystem;
import akka.grpc.javadsl.ServerReflection;
import akka.grpc.javadsl.ServiceHandler;

import akka.http.javadsl.Http;
import akka.http.javadsl.ServerBinding;
import akka.http.javadsl.model.HttpRequest;
import akka.http.javadsl.model.HttpResponse;
import akka.japi.function.Function;
import akka.stream.SystemMaterializer;
import akka.stream.Materializer;
import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;
import example.myapp.helloworld.grpc.GreeterService;
import example.myapp.helloworld.grpc.GreeterServiceHandlerFactory;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletionStage;

class GreeterServer {
  public static void main(String[] args) throws Exception {
    // important to enable HTTP/2 in ActorSystem's config
    Config conf = ConfigFactory.parseString("akka.http.server.enable-http2 = on")
            .withFallback(ConfigFactory.defaultApplication());

    // Akka ActorSystem Boot
    ActorSystem sys = ActorSystem.create("HelloWorld", conf);

    run(sys).thenAccept(binding -> {
      System.out.println("gRPC server bound to: " + binding.localAddress());
    });

    // ActorSystem threads will keep the app alive until `system.terminate()` is called
  }

  @SuppressWarnings("unchecked")
  public static CompletionStage<ServerBinding> run(ActorSystem sys) throws Exception {
    Materializer mat = SystemMaterializer.get(sys).materializer();

    // Instantiate implementation
    GreeterService impl = new GreeterServiceImpl(mat);

    // Create the reflection handler for multiple services
    Function<HttpRequest, CompletionStage<HttpResponse>> reflectionPartial =
      ServerReflection.create(List.of(GreeterService.description), sys);

    Function<HttpRequest, CompletionStage<HttpResponse>> serviceHandlers =
      ServiceHandler.concatOrNotFound(GreeterServiceHandlerFactory.create(impl, sys), reflectionPartial);

    return Http
      .get(sys)
      .newServerAt("127.0.0.1", 8090)
      .bind(serviceHandlers);
  }
}
```

### Example 14: Serving the service with Akka HTTP

```text
akka.http.server.enable-http2 = on
```

### Example 15: Serving multiple services

```scala
import akka.grpc.scaladsl.ServiceHandler

// explicit types not needed but included in example for clarity
val greeterService: PartialFunction[HttpRequest, Future[HttpResponse]] =
  example.myapp.helloworld.grpc.GreeterServiceHandler.partial(new GreeterServiceImpl())
val echoService: PartialFunction[HttpRequest, Future[HttpResponse]] =
  EchoServiceHandler.partial(new EchoServiceImpl)
val reflectionService = ServerReflection.partial(List(GreeterService, EchoService))
val serviceHandlers: HttpRequest => Future[HttpResponse] =
  ServiceHandler.concatOrNotFound(greeterService, echoService, reflectionService)

Http()
  .newServerAt("127.0.0.1", 8080)
  .bind(serviceHandlers)
```

### Example 16: Serving multiple services

```java
import akka.grpc.javadsl.ServiceHandler;
import akka.http.javadsl.model.HttpRequest;
import akka.http.javadsl.model.HttpResponse;
import akka.japi.function.Function;

Function<HttpRequest, CompletionStage<HttpResponse>> greeterService =
    GreeterServiceHandlerFactory.create(new GreeterServiceImpl(mat), sys);
Function<HttpRequest, CompletionStage<HttpResponse>> echoService =
  EchoServiceHandlerFactory.create(new EchoServiceImpl(), sys);
@SuppressWarnings("unchecked")
Function<HttpRequest, CompletionStage<HttpResponse>> serviceHandlers =
  ServiceHandler.concatOrNotFound(greeterService, echoService);

Http.get(sys)
    .newServerAt("127.0.0.1", 8090)
    .bind(serviceHandlers)
```

### Example 17: Stateful services

```scala
class GreeterServiceImpl(system: ActorSystem) extends GreeterService {
  val greeterActor = system.actorOf(GreeterActor.props("Hello"), "greeter")

  def sayHello(in: HelloRequest): Future[HelloReply] = {
    // timeout and execution context for ask
    implicit val timeout: Timeout = 3.seconds
    import system.dispatcher

    (greeterActor ? GreeterActor.GetGreeting)
      .mapTo[GreeterActor.Greeting]
      .map(message => HelloReply(s"${message.greeting}, ${in.name}"))
  }

  def changeGreeting(in: ChangeRequest): Future[ChangeResponse] = {
    greeterActor ! GreeterActor.ChangeGreeting(in.newGreeting)
    Future.successful(ChangeResponse())
  }
}
```

### Example 18: Stateful services

```java
public final class GreeterServiceImpl implements GreeterService {

  private final ActorSystem system;
  private final ActorRef greeterActor;

  public GreeterServiceImpl(ActorSystem system) {
    this.system = system;
    this.greeterActor = system.actorOf(GreeterActor.props("Hello"), "greeter");
  }

  public CompletionStage<HelloReply> sayHello(HelloRequest in) {
    return ask(greeterActor, GreeterActor.GET_GREETING, Duration.ofSeconds(5))
        .thenApply(message ->
          HelloReply.newBuilder()
            .setMessage(((GreeterActor.Greeting) message).greeting)
            .build()
        );
  }

  public CompletionStage<ChangeResponse> changeGreeting(ChangeRequest in) {
    greeterActor.tell(new GreeterActor.ChangeGreeting(in.getNewGreeting()), ActorRef.noSender());
    return CompletableFuture.completedFuture(ChangeResponse.newBuilder().build());
  }

}
```

### Example 19: Stateful services

```scala
object GreeterActor {
  case class ChangeGreeting(newGreeting: String)

  case object GetGreeting
  case class Greeting(greeting: String)

  def props(initialGreeting: String) = Props(new GreeterActor(initialGreeting))
}

class GreeterActor(initialGreeting: String) extends Actor {
  import GreeterActor._

  var greeting = Greeting(initialGreeting)

  def receive = {
    case GetGreeting => sender() ! greeting
    case ChangeGreeting(newGreeting) =>
      greeting = Greeting(newGreeting)
  }
}
```

### Example 20: Stateful services

```java
public class GreeterActor extends AbstractActor {

  public static class ChangeGreeting {
    public final String newGreeting;
    public ChangeGreeting(String newGreeting) {
      this.newGreeting = newGreeting;
    }
  }
  public static class GetGreeting {}
  public static GetGreeting GET_GREETING = new GetGreeting();

  public static class Greeting {
    public final String greeting;
    public Greeting(String greeting) {
      this.greeting = greeting;
    }
  }

  public static Props props(final String initialGreeting) {
    return Props.create(GreeterActor.class, () -> new GreeterActor(initialGreeting));
  }

  private Greeting greeting;

  public GreeterActor(String initialGreeting) {
    greeting = new Greeting(initialGreeting);
  }

  public AbstractActor.Receive createReceive() {
    return receiveBuilder()
        .match(GetGreeting.class, this::onGetGreeting)
        .match(ChangeGreeting.class, this::onChangeGreeting)
        .build();
  }

  private void onGetGreeting(GetGreeting get) {
    getSender().tell(greeting, getSelf());
  }

  private void onChangeGreeting(ChangeGreeting change) {
    greeting = new Greeting(change.newGreeting);
  }
}
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/libraries/akka-grpc/current/buildtools/gradle.html
- https://doc.akka.io/libraries/akka-grpc/current/buildtools/maven.html
- https://doc.akka.io/libraries/akka-grpc/current/buildtools/sbt.html
- https://doc.akka.io/libraries/akka-grpc/current/deploy.html
- https://doc.akka.io/libraries/akka-grpc/current/proto.html
- https://doc.akka.io/libraries/akka-grpc/current/server/grpc-web.html
- https://doc.akka.io/libraries/akka-grpc/current/server/index.html

---
*Source: [https://doc.akka.io/libraries/akka-grpc/current/server/walkthrough.html](https://doc.akka.io/libraries/akka-grpc/current/server/walkthrough.html)*