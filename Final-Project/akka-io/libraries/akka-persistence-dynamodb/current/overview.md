---
description: An Akka Persistence plugin backed by Amazon DynamoDB
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:59:37Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-persistence-dynamodb/current/overview.html
title: Overview • Akka Persistence DynamoDB Documentation
---

# Overview • Akka Persistence DynamoDB Documentation

> **Summary:** An Akka Persistence plugin backed by Amazon DynamoDB

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Overview

The Akka Persistence DynamoDB plugin allows for using Amazon DynamoDB as a backend for Akka Persistence.

## Project Info

| Project Info: Akka Persistence DynamoDB | |
| --- | --- |
| Artifact | com.lightbend.akka akka\-persistence\-dynamodb 2\.0\.10 |
| JDK versions | Eclipse Temurin JDK 11Eclipse Temurin JDK 17Eclipse Temurin JDK 21 |
| Scala versions | 2\.13\.17, 3\.3\.7 |
| JPMS module name | akka.persistence.dynamodb |
| License | [BUSL\-1\.1](https://github.com/akka/akka-persistence-dynamodb/blob/v2.0.10/LICENSE) |
| Readiness level | [Supported](https://doc.akka.io/docs/akka-dependencies/current/support-terminology.html#supported), support is available from [Lightbend](https://www.lightbend.com/akka) Since 2\.0\.0, 2024\-10\-25 |
| Home page | [https://doc.akka.io/libraries/akka\-persistence\-dynamodb/current](https://doc.akka.io/libraries/akka-persistence-dynamodb/current) |
| Forums | [Akka Discuss](https://discuss.akka.io/c/akka/) |
| Release notes | [Github releases](https://github.com/akka/akka-persistence-dynamodb/releases) |
| Issues | [Github issues](https://github.com/akka/akka-persistence-dynamodb/issues) |
| Sources | [https://github.com/akka/akka\-persistence\-dynamodb](https://github.com/akka/akka-persistence-dynamodb) |

## Dependencies

The Akka dependencies are available from Akka’s library repository. To access them there, you need to configure the URL for this repository.

Maven
```
<project&gt
  ...
  <repositories>
    <repository>
      <id>akka-repository</id>
      <name>Akka library repository</name>
      <url>https://repo.akka.io/maven</url>
    </repository>
  </repositories&gt
</project>

```
sbt
```
resolvers += "Akka library repository".at("https://repo.akka.io/maven")

```
Gradle
```
repositories {
    mavenCentral()
    maven {
        url "https://repo.akka.io/maven"
    }
}

```

Additionally, add the dependency as below.

Maven
```
<properties>
  <scala.binary.version>2.13</scala.binary.version>
</properties>
<dependencies&gt
  <dependency>
    <groupId>com.lightbend.akka</groupId>
    <artifactId>akka-persistence-dynamodb_${scala.binary.version}</artifactId>
    <version>2.0.10</version>
  </dependency&gt
</dependencies>
```
sbt
```
libraryDependencies += "com.lightbend.akka" %% "akka-persistence-dynamodb" % "2.0.10"
```
Gradle
```
def versions = [
  ScalaBinary: "2.13"
]
dependencies {
  implementation "com.lightbend.akka:akka-persistence-dynamodb_${versions.ScalaBinary}:2.0.10"
}
```

This plugin depends on Akka 2\.10\.11 or later, and note that it is important that all `akka-*` dependencies are in the same version, so it is recommended to depend on them explicitly to avoid problems with transient dependencies causing an unlucky mix of versions.

Direct dependencies

| Organization | Artifact | Version |
| --- | --- | --- |
| com.typesafe.akka | akka\-persistence\-query\_2\.13 | [2\.10\.11](https://mvnrepository.com/artifact/com.typesafe.akka/akka-persistence-query_2.13/2.10.11) |
| com.typesafe.akka | akka\-persistence\-typed\_2\.13 | [2\.10\.11](https://mvnrepository.com/artifact/com.typesafe.akka/akka-persistence-typed_2.13/2.10.11) |
| org.scala\-lang | scala\-library | [2\.13\.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17) |
| software.amazon.awssdk | dynamodb | [2\.31\.63](https://mvnrepository.com/artifact/software.amazon.awssdk/dynamodb/2.31.63) |

Dependency tree
```

com.typesafe.akka    akka-persistence-query_2.13    [2.10.11](https://mvnrepository.com/artifact/com.typesafe.akka/akka-persistence-query_2.13/2.10.11)    BUSL-1.1
    com.typesafe.akka    akka-persistence_2.13    [2.10.11](https://mvnrepository.com/artifact/com.typesafe.akka/akka-persistence_2.13/2.10.11)    BUSL-1.1
        com.typesafe.akka    akka-actor_2.13    [2.10.11](https://mvnrepository.com/artifact/com.typesafe.akka/akka-actor_2.13/2.10.11)    BUSL-1.1
            com.typesafe    config    [1.4.5](https://mvnrepository.com/artifact/com.typesafe/config/1.4.5)    Apache-2.0
            org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
        com.typesafe.akka    akka-stream_2.13    [2.10.11](https://mvnrepository.com/artifact/com.typesafe.akka/akka-stream_2.13/2.10.11)    BUSL-1.1
            com.typesafe.akka    akka-actor_2.13    [2.10.11](https://mvnrepository.com/artifact/com.typesafe.akka/akka-actor_2.13/2.10.11)    BUSL-1.1
                com.typesafe    config    [1.4.5](https://mvnrepository.com/artifact/com.typesafe/config/1.4.5)    Apache-2.0
                org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
            com.typesafe.akka    akka-protobuf-v3_2.13    [2.10.11](https://mvnrepository.com/artifact/com.typesafe.akka/akka-protobuf-v3_2.13/2.10.11)    BUSL-1.1
            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
            org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
        org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
    com.typesafe.akka    akka-protobuf-v3_2.13    [2.10.11](https://mvnrepository.com/artifact/com.typesafe.akka/akka-protobuf-v3_2.13/2.10.11)    BUSL-1.1
    com.typesafe.akka    akka-stream_2.13    [2.10.11](https://mvnrepository.com/artifact/com.typesafe.akka/akka-stream_2.13/2.10.11)    BUSL-1.1
        com.typesafe.akka    akka-actor_2.13    [2.10.11](https://mvnrepository.com/artifact/com.typesafe.akka/akka-actor_2.13/2.10.11)    BUSL-1.1
            com.typesafe    config    [1.4.5](https://mvnrepository.com/artifact/com.typesafe/config/1.4.5)    Apache-2.0
            org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
        com.typesafe.akka    akka-protobuf-v3_2.13    [2.10.11](https://mvnrepository.com/artifact/com.typesafe.akka/akka-protobuf-v3_2.13/2.10.11)    BUSL-1.1
        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
        org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
    org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
com.typesafe.akka    akka-persistence-typed_2.13    [2.10.11](https://mvnrepository.com/artifact/com.typesafe.akka/akka-persistence-typed_2.13/2.10.11)    BUSL-1.1
    com.typesafe.akka    akka-actor-typed_2.13    [2.10.11](https://mvnrepository.com/artifact/com.typesafe.akka/akka-actor-typed_2.13/2.10.11)    BUSL-1.1
        com.typesafe.akka    akka-actor_2.13    [2.10.11](https://mvnrepository.com/artifact/com.typesafe.akka/akka-actor_2.13/2.10.11)    BUSL-1.1
            com.typesafe    config    [1.4.5](https://mvnrepository.com/artifact/com.typesafe/config/1.4.5)    Apache-2.0
            org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
        com.typesafe.akka    akka-slf4j_2.13    [2.10.11](https://mvnrepository.com/artifact/com.typesafe.akka/akka-slf4j_2.13/2.10.11)    BUSL-1.1
            com.typesafe.akka    akka-actor_2.13    [2.10.11](https://mvnrepository.com/artifact/com.typesafe.akka/akka-actor_2.13/2.10.11)    BUSL-1.1
                com.typesafe    config    [1.4.5](https://mvnrepository.com/artifact/com.typesafe/config/1.4.5)    Apache-2.0
                org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
            org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
        org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
    com.typesafe.akka    akka-persistence-query_2.13    [2.10.11](https://mvnrepository.com/artifact/com.typesafe.akka/akka-persistence-query_2.13/2.10.11)    BUSL-1.1
        com.typesafe.akka    akka-persistence_2.13    [2.10.11](https://mvnrepository.com/artifact/com.typesafe.akka/akka-persistence_2.13/2.10.11)    BUSL-1.1
            com.typesafe.akka    akka-actor_2.13    [2.10.11](https://mvnrepository.com/artifact/com.typesafe.akka/akka-actor_2.13/2.10.11)    BUSL-1.1
                com.typesafe    config    [1.4.5](https://mvnrepository.com/artifact/com.typesafe/config/1.4.5)    Apache-2.0
                org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
            com.typesafe.akka    akka-stream_2.13    [2.10.11](https://mvnrepository.com/artifact/com.typesafe.akka/akka-stream_2.13/2.10.11)    BUSL-1.1
                com.typesafe.akka    akka-actor_2.13    [2.10.11](https://mvnrepository.com/artifact/com.typesafe.akka/akka-actor_2.13/2.10.11)    BUSL-1.1
                    com.typesafe    config    [1.4.5](https://mvnrepository.com/artifact/com.typesafe/config/1.4.5)    Apache-2.0
                    org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
                com.typesafe.akka    akka-protobuf-v3_2.13    [2.10.11](https://mvnrepository.com/artifact/com.typesafe.akka/akka-protobuf-v3_2.13/2.10.11)    BUSL-1.1
                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
            org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
        com.typesafe.akka    akka-protobuf-v3_2.13    [2.10.11](https://mvnrepository.com/artifact/com.typesafe.akka/akka-protobuf-v3_2.13/2.10.11)    BUSL-1.1
        com.typesafe.akka    akka-stream_2.13    [2.10.11](https://mvnrepository.com/artifact/com.typesafe.akka/akka-stream_2.13/2.10.11)    BUSL-1.1
            com.typesafe.akka    akka-actor_2.13    [2.10.11](https://mvnrepository.com/artifact/com.typesafe.akka/akka-actor_2.13/2.10.11)    BUSL-1.1
                com.typesafe    config    [1.4.5](https://mvnrepository.com/artifact/com.typesafe/config/1.4.5)    Apache-2.0
                org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
            com.typesafe.akka    akka-protobuf-v3_2.13    [2.10.11](https://mvnrepository.com/artifact/com.typesafe.akka/akka-protobuf-v3_2.13/2.10.11)    BUSL-1.1
            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
            org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
        org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
    com.typesafe.akka    akka-persistence_2.13    [2.10.11](https://mvnrepository.com/artifact/com.typesafe.akka/akka-persistence_2.13/2.10.11)    BUSL-1.1
        com.typesafe.akka    akka-actor_2.13    [2.10.11](https://mvnrepository.com/artifact/com.typesafe.akka/akka-actor_2.13/2.10.11)    BUSL-1.1
            com.typesafe    config    [1.4.5](https://mvnrepository.com/artifact/com.typesafe/config/1.4.5)    Apache-2.0
            org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
        com.typesafe.akka    akka-stream_2.13    [2.10.11](https://mvnrepository.com/artifact/com.typesafe.akka/akka-stream_2.13/2.10.11)    BUSL-1.1
            com.typesafe.akka    akka-actor_2.13    [2.10.11](https://mvnrepository.com/artifact/com.typesafe.akka/akka-actor_2.13/2.10.11)    BUSL-1.1
                com.typesafe    config    [1.4.5](https://mvnrepository.com/artifact/com.typesafe/config/1.4.5)    Apache-2.0
                org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
            com.typesafe.akka    akka-protobuf-v3_2.13    [2.10.11](https://mvnrepository.com/artifact/com.typesafe.akka/akka-protobuf-v3_2.13/2.10.11)    BUSL-1.1
            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
            org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
        org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
    com.typesafe.akka    akka-remote_2.13    [2.10.11](https://mvnrepository.com/artifact/com.typesafe.akka/akka-remote_2.13/2.10.11)    BUSL-1.1
        com.typesafe.akka    akka-actor_2.13    [2.10.11](https://mvnrepository.com/artifact/com.typesafe.akka/akka-actor_2.13/2.10.11)    BUSL-1.1
            com.typesafe    config    [1.4.5](https://mvnrepository.com/artifact/com.typesafe/config/1.4.5)    Apache-2.0
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
        org.agrona    agrona    [1.22.0](https://mvnrepository.com/artifact/org.agrona/agrona/1.22.0)    The Apache License, Version 2.0
        org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
    com.typesafe.akka    akka-stream-typed_2.13    [2.10.11](https://mvnrepository.com/artifact/com.typesafe.akka/akka-stream-typed_2.13/2.10.11)    BUSL-1.1
        com.typesafe.akka    akka-actor-typed_2.13    [2.10.11](https://mvnrepository.com/artifact/com.typesafe.akka/akka-actor-typed_2.13/2.10.11)    BUSL-1.1
            com.typesafe.akka    akka-actor_2.13    [2.10.11](https://mvnrepository.com/artifact/com.typesafe.akka/akka-actor_2.13/2.10.11)    BUSL-1.1
                com.typesafe    config    [1.4.5](https://mvnrepository.com/artifact/com.typesafe/config/1.4.5)    Apache-2.0
                org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
            com.typesafe.akka    akka-slf4j_2.13    [2.10.11](https://mvnrepository.com/artifact/com.typesafe.akka/akka-slf4j_2.13/2.10.11)    BUSL-1.1
                com.typesafe.akka    akka-actor_2.13    [2.10.11](https://mvnrepository.com/artifact/com.typesafe.akka/akka-actor_2.13/2.10.11)    BUSL-1.1
                    com.typesafe    config    [1.4.5](https://mvnrepository.com/artifact/com.typesafe/config/1.4.5)    Apache-2.0
                    org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
                org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
            org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
        com.typesafe.akka    akka-stream_2.13    [2.10.11](https://mvnrepository.com/artifact/com.typesafe.akka/akka-stream_2.13/2.10.11)    BUSL-1.1
            com.typesafe.akka    akka-actor_2.13    [2.10.11](https://mvnrepository.com/artifact/com.typesafe.akka/akka-actor_2.13/2.10.11)    BUSL-1.1
                com.typesafe    config    [1.4.5](https://mvnrepository.com/artifact/com.typesafe/config/1.4.5)    Apache-2.0
                org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
            com.typesafe.akka    akka-protobuf-v3_2.13    [2.10.11](https://mvnrepository.com/artifact/com.typesafe.akka/akka-protobuf-v3_2.13/2.10.11)    BUSL-1.1
            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
            org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
        org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
    org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
software.amazon.awssdk    dynamodb    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/dynamodb/2.31.63)    Apache License, Version 2.0
    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
    software.amazon.awssdk    auth    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/auth/2.31.63)    Apache License, Version 2.0
        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
        software.amazon.awssdk    http-auth-aws-eventstream    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-auth-aws-eventstream/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.eventstream    eventstream    [1.0.1](https://mvnrepository.com/artifact/software.amazon.eventstream/eventstream/1.0.1)    Apache License, Version 2.0
        software.amazon.awssdk    http-auth-aws    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-auth-aws/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    checksums-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/checksums-spi/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    checksums    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/checksums/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    checksums-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/checksums-spi/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    http-auth-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-auth-spi/2.31.63)    Apache License, Version 2.0
                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    http-client-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-client-spi/2.31.63)    Apache License, Version 2.0
                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    metrics-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/metrics-spi/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    identity-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/identity-spi/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    http-client-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-client-spi/2.31.63)    Apache License, Version 2.0
                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    metrics-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/metrics-spi/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    identity-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/identity-spi/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
        software.amazon.awssdk    http-auth-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-auth-spi/2.31.63)    Apache License, Version 2.0
            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    http-client-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-client-spi/2.31.63)    Apache License, Version 2.0
                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    metrics-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/metrics-spi/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    identity-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/identity-spi/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
        software.amazon.awssdk    http-auth    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-auth/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    http-auth-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-auth-spi/2.31.63)    Apache License, Version 2.0
                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    http-client-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-client-spi/2.31.63)    Apache License, Version 2.0
                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    metrics-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/metrics-spi/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    identity-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/identity-spi/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    http-client-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-client-spi/2.31.63)    Apache License, Version 2.0
                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    metrics-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/metrics-spi/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    identity-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/identity-spi/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
        software.amazon.awssdk    http-client-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-client-spi/2.31.63)    Apache License, Version 2.0
            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    metrics-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/metrics-spi/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
        software.amazon.awssdk    identity-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/identity-spi/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
        software.amazon.awssdk    json-utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/json-utils/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    third-party-jackson-core    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/third-party-jackson-core/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
        software.amazon.awssdk    profiles    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/profiles/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
        software.amazon.awssdk    regions    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/regions/2.31.63)    Apache License, Version 2.0
            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    json-utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/json-utils/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    third-party-jackson-core    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/third-party-jackson-core/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    profiles    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/profiles/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    sdk-core    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/sdk-core/2.31.63)    Apache License, Version 2.0
                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    checksums-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/checksums-spi/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    checksums    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/checksums/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    checksums-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/checksums-spi/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    endpoints-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/endpoints-spi/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    http-auth-aws    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-auth-aws/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    checksums-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/checksums-spi/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    checksums    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/checksums/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    checksums-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/checksums-spi/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    http-auth-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-auth-spi/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    http-client-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-client-spi/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    metrics-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/metrics-spi/2.31.63)    Apache License, Version 2.0
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    identity-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/identity-spi/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    http-client-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-client-spi/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    metrics-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/metrics-spi/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    identity-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/identity-spi/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    http-auth-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-auth-spi/2.31.63)    Apache License, Version 2.0
                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    http-client-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-client-spi/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    metrics-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/metrics-spi/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    identity-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/identity-spi/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    http-client-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-client-spi/2.31.63)    Apache License, Version 2.0
                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    metrics-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/metrics-spi/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    identity-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/identity-spi/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    metrics-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/metrics-spi/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    profiles    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/profiles/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    retries-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/retries-spi/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    retries    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/retries/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    retries-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/retries-spi/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
        software.amazon.awssdk    sdk-core    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/sdk-core/2.31.63)    Apache License, Version 2.0
            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    checksums-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/checksums-spi/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    checksums    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/checksums/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    checksums-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/checksums-spi/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    endpoints-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/endpoints-spi/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    http-auth-aws    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-auth-aws/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    checksums-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/checksums-spi/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    checksums    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/checksums/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    checksums-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/checksums-spi/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    http-auth-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-auth-spi/2.31.63)    Apache License, Version 2.0
                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    http-client-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-client-spi/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    metrics-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/metrics-spi/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    identity-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/identity-spi/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    http-client-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-client-spi/2.31.63)    Apache License, Version 2.0
                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    metrics-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/metrics-spi/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    identity-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/identity-spi/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    http-auth-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-auth-spi/2.31.63)    Apache License, Version 2.0
                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    http-client-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-client-spi/2.31.63)    Apache License, Version 2.0
                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    metrics-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/metrics-spi/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    identity-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/identity-spi/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    http-client-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-client-spi/2.31.63)    Apache License, Version 2.0
                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    metrics-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/metrics-spi/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    identity-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/identity-spi/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    metrics-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/metrics-spi/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    profiles    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/profiles/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    retries-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/retries-spi/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    retries    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/retries/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    retries-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/retries-spi/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
        software.amazon.eventstream    eventstream    [1.0.1](https://mvnrepository.com/artifact/software.amazon.eventstream/eventstream/1.0.1)    Apache License, Version 2.0
    software.amazon.awssdk    aws-core    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/aws-core/2.31.63)    Apache License, Version 2.0
        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
        software.amazon.awssdk    auth    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/auth/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    http-auth-aws-eventstream    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-auth-aws-eventstream/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.eventstream    eventstream    [1.0.1](https://mvnrepository.com/artifact/software.amazon.eventstream/eventstream/1.0.1)    Apache License, Version 2.0
            software.amazon.awssdk    http-auth-aws    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-auth-aws/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    checksums-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/checksums-spi/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    checksums    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/checksums/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    checksums-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/checksums-spi/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    http-auth-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-auth-spi/2.31.63)    Apache License, Version 2.0
                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    http-client-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-client-spi/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    metrics-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/metrics-spi/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    identity-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/identity-spi/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    http-client-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-client-spi/2.31.63)    Apache License, Version 2.0
                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    metrics-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/metrics-spi/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    identity-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/identity-spi/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    http-auth-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-auth-spi/2.31.63)    Apache License, Version 2.0
                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    http-client-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-client-spi/2.31.63)    Apache License, Version 2.0
                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    metrics-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/metrics-spi/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    identity-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/identity-spi/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    http-auth    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-auth/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    http-auth-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-auth-spi/2.31.63)    Apache License, Version 2.0
                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    http-client-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-client-spi/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    metrics-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/metrics-spi/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    identity-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/identity-spi/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    http-client-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-client-spi/2.31.63)    Apache License, Version 2.0
                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    metrics-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/metrics-spi/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    identity-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/identity-spi/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    http-client-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-client-spi/2.31.63)    Apache License, Version 2.0
                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    metrics-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/metrics-spi/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    identity-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/identity-spi/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    json-utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/json-utils/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    third-party-jackson-core    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/third-party-jackson-core/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    profiles    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/profiles/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    regions    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/regions/2.31.63)    Apache License, Version 2.0
                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    json-utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/json-utils/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    third-party-jackson-core    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/third-party-jackson-core/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    profiles    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/profiles/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    sdk-core    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/sdk-core/2.31.63)    Apache License, Version 2.0
                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    checksums-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/checksums-spi/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    checksums    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/checksums/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    checksums-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/checksums-spi/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    endpoints-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/endpoints-spi/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    http-auth-aws    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-auth-aws/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    checksums-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/checksums-spi/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    checksums    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/checksums/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    checksums-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/checksums-spi/2.31.63)    Apache License, Version 2.0
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    http-auth-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-auth-spi/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    http-client-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-client-spi/2.31.63)    Apache License, Version 2.0
                                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                                software.amazon.awssdk    metrics-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/metrics-spi/2.31.63)    Apache License, Version 2.0
                                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    identity-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/identity-spi/2.31.63)    Apache License, Version 2.0
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    http-client-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-client-spi/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    metrics-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/metrics-spi/2.31.63)    Apache License, Version 2.0
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    identity-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/identity-spi/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    http-auth-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-auth-spi/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    http-client-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-client-spi/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    metrics-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/metrics-spi/2.31.63)    Apache License, Version 2.0
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    identity-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/identity-spi/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    http-client-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-client-spi/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    metrics-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/metrics-spi/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    identity-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/identity-spi/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    metrics-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/metrics-spi/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    profiles    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/profiles/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    retries-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/retries-spi/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    retries    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/retries/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    retries-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/retries-spi/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    sdk-core    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/sdk-core/2.31.63)    Apache License, Version 2.0
                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    checksums-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/checksums-spi/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    checksums    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/checksums/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    checksums-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/checksums-spi/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    endpoints-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/endpoints-spi/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    http-auth-aws    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-auth-aws/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    checksums-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/checksums-spi/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    checksums    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/checksums/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    checksums-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/checksums-spi/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    http-auth-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-auth-spi/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    http-client-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-client-spi/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    metrics-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/metrics-spi/2.31.63)    Apache License, Version 2.0
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    identity-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/identity-spi/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    http-client-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-client-spi/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    metrics-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/metrics-spi/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    identity-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/identity-spi/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    http-auth-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-auth-spi/2.31.63)    Apache License, Version 2.0
                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    http-client-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-client-spi/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    metrics-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/metrics-spi/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    identity-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/identity-spi/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    http-client-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-client-spi/2.31.63)    Apache License, Version 2.0
                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    metrics-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/metrics-spi/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    identity-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/identity-spi/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    metrics-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/metrics-spi/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    profiles    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/profiles/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    retries-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/retries-spi/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    retries    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/retries/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    retries-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/retries-spi/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.eventstream    eventstream    [1.0.1](https://mvnrepository.com/artifact/software.amazon.eventstream/eventstream/1.0.1)    Apache License, Version 2.0
        software.amazon.awssdk    endpoints-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/endpoints-spi/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
        software.amazon.awssdk    http-auth-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-auth-spi/2.31.63)    Apache License, Version 2.0
            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    http-client-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-client-spi/2.31.63)    Apache License, Version 2.0
                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    metrics-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/metrics-spi/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    identity-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/identity-spi/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
        software.amazon.awssdk    http-auth    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-auth/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    http-auth-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-auth-spi/2.31.63)    Apache License, Version 2.0
                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    http-client-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-client-spi/2.31.63)    Apache License, Version 2.0
                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    metrics-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/metrics-spi/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    identity-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/identity-spi/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    http-client-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-client-spi/2.31.63)    Apache License, Version 2.0
                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    metrics-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/metrics-spi/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    identity-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/identity-spi/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
        software.amazon.awssdk    http-client-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-client-spi/2.31.63)    Apache License, Version 2.0
            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    metrics-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/metrics-spi/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
        software.amazon.awssdk    identity-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/identity-spi/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
        software.amazon.awssdk    metrics-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/metrics-spi/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
        software.amazon.awssdk    profiles    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/profiles/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
        software.amazon.awssdk    regions    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/regions/2.31.63)    Apache License, Version 2.0
            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    json-utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/json-utils/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    third-party-jackson-core    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/third-party-jackson-core/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    profiles    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/profiles/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    sdk-core    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/sdk-core/2.31.63)    Apache License, Version 2.0
                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    checksums-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/checksums-spi/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    checksums    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/checksums/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    checksums-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/checksums-spi/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    endpoints-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/endpoints-spi/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    http-auth-aws    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-auth-aws/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    checksums-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/checksums-spi/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    checksums    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/checksums/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    checksums-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/checksums-spi/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    http-auth-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-auth-spi/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    http-client-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-client-spi/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    metrics-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/metrics-spi/2.31.63)    Apache License, Version 2.0
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    identity-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/identity-spi/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    http-client-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-client-spi/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    metrics-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/metrics-spi/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    identity-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/identity-spi/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    http-auth-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-auth-spi/2.31.63)    Apache License, Version 2.0
                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    http-client-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-client-spi/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    metrics-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/metrics-spi/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    identity-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/identity-spi/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    http-client-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-client-spi/2.31.63)    Apache License, Version 2.0
                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    metrics-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/metrics-spi/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    identity-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/identity-spi/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    metrics-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/metrics-spi/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    profiles    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/profiles/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    retries-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/retries-spi/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    retries    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/retries/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    retries-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/retries-spi/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
        software.amazon.awssdk    retries-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/retries-spi/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
        software.amazon.awssdk    retries    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/retries/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    retries-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/retries-spi/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
        software.amazon.awssdk    sdk-core    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/sdk-core/2.31.63)    Apache License, Version 2.0
            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    checksums-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/checksums-spi/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    checksums    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/checksums/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    checksums-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/checksums-spi/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    endpoints-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/endpoints-spi/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    http-auth-aws    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-auth-aws/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    checksums-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/checksums-spi/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    checksums    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/checksums/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    checksums-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/checksums-spi/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    http-auth-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-auth-spi/2.31.63)    Apache License, Version 2.0
                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    http-client-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-client-spi/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    metrics-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/metrics-spi/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    identity-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/identity-spi/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    http-client-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-client-spi/2.31.63)    Apache License, Version 2.0
                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    metrics-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/metrics-spi/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    identity-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/identity-spi/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    http-auth-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-auth-spi/2.31.63)    Apache License, Version 2.0
                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    http-client-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-client-spi/2.31.63)    Apache License, Version 2.0
                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    metrics-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/metrics-spi/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    identity-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/identity-spi/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    http-client-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-client-spi/2.31.63)    Apache License, Version 2.0
                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    metrics-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/metrics-spi/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    identity-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/identity-spi/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    metrics-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/metrics-spi/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    profiles    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/profiles/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    retries-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/retries-spi/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    retries    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/retries/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    retries-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/retries-spi/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
        software.amazon.eventstream    eventstream    [1.0.1](https://mvnrepository.com/artifact/software.amazon.eventstream/eventstream/1.0.1)    Apache License, Version 2.0
    software.amazon.awssdk    aws-json-protocol    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/aws-json-protocol/2.31.63)    Apache License, Version 2.0
        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
        software.amazon.awssdk    aws-core    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/aws-core/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    auth    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/auth/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    http-auth-aws-eventstream    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-auth-aws-eventstream/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.eventstream    eventstream    [1.0.1](https://mvnrepository.com/artifact/software.amazon.eventstream/eventstream/1.0.1)    Apache License, Version 2.0
                software.amazon.awssdk    http-auth-aws    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-auth-aws/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    checksums-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/checksums-spi/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    checksums    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/checksums/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    checksums-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/checksums-spi/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    http-auth-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-auth-spi/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    http-client-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-client-spi/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    metrics-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/metrics-spi/2.31.63)    Apache License, Version 2.0
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    identity-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/identity-spi/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    http-client-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-client-spi/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    metrics-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/metrics-spi/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    identity-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/identity-spi/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    http-auth-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-auth-spi/2.31.63)    Apache License, Version 2.0
                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    http-client-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-client-spi/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    metrics-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/metrics-spi/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    identity-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/identity-spi/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    http-auth    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-auth/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    http-auth-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-auth-spi/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    http-client-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-client-spi/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    metrics-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/metrics-spi/2.31.63)    Apache License, Version 2.0
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    identity-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/identity-spi/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    http-client-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-client-spi/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    metrics-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/metrics-spi/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    identity-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/identity-spi/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    http-client-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-client-spi/2.31.63)    Apache License, Version 2.0
                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    metrics-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/metrics-spi/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    identity-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/identity-spi/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    json-utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/json-utils/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    third-party-jackson-core    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/third-party-jackson-core/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    profiles    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/profiles/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    regions    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/regions/2.31.63)    Apache License, Version 2.0
                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    json-utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/json-utils/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    third-party-jackson-core    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/third-party-jackson-core/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    profiles    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/profiles/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    sdk-core    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/sdk-core/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    checksums-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/checksums-spi/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    checksums    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/checksums/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    checksums-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/checksums-spi/2.31.63)    Apache License, Version 2.0
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    endpoints-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/endpoints-spi/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    http-auth-aws    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-auth-aws/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    checksums-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/checksums-spi/2.31.63)    Apache License, Version 2.0
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    checksums    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/checksums/2.31.63)    Apache License, Version 2.0
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                                software.amazon.awssdk    checksums-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/checksums-spi/2.31.63)    Apache License, Version 2.0
                                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    http-auth-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-auth-spi/2.31.63)    Apache License, Version 2.0
                                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                                software.amazon.awssdk    http-client-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-client-spi/2.31.63)    Apache License, Version 2.0
                                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                                    software.amazon.awssdk    metrics-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/metrics-spi/2.31.63)    Apache License, Version 2.0
                                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                                software.amazon.awssdk    identity-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/identity-spi/2.31.63)    Apache License, Version 2.0
                                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    http-client-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-client-spi/2.31.63)    Apache License, Version 2.0
                                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                                software.amazon.awssdk    metrics-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/metrics-spi/2.31.63)    Apache License, Version 2.0
                                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    identity-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/identity-spi/2.31.63)    Apache License, Version 2.0
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    http-auth-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-auth-spi/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    http-client-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-client-spi/2.31.63)    Apache License, Version 2.0
                                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                                software.amazon.awssdk    metrics-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/metrics-spi/2.31.63)    Apache License, Version 2.0
                                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    identity-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/identity-spi/2.31.63)    Apache License, Version 2.0
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    http-client-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-client-spi/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    metrics-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/metrics-spi/2.31.63)    Apache License, Version 2.0
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    identity-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/identity-spi/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    metrics-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/metrics-spi/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    profiles    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/profiles/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    retries-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/retries-spi/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    retries    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/retries/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    retries-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/retries-spi/2.31.63)    Apache License, Version 2.0
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    sdk-core    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/sdk-core/2.31.63)    Apache License, Version 2.0
                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    checksums-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/checksums-spi/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    checksums    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/checksums/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    checksums-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/checksums-spi/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    endpoints-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/endpoints-spi/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    http-auth-aws    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-auth-aws/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    checksums-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/checksums-spi/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    checksums    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/checksums/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    checksums-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/checksums-spi/2.31.63)    Apache License, Version 2.0
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    http-auth-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-auth-spi/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    http-client-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-client-spi/2.31.63)    Apache License, Version 2.0
                                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                                software.amazon.awssdk    metrics-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/metrics-spi/2.31.63)    Apache License, Version 2.0
                                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    identity-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/identity-spi/2.31.63)    Apache License, Version 2.0
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    http-client-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-client-spi/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    metrics-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/metrics-spi/2.31.63)    Apache License, Version 2.0
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    identity-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/identity-spi/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    http-auth-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-auth-spi/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    http-client-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-client-spi/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    metrics-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/metrics-spi/2.31.63)    Apache License, Version 2.0
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    identity-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/identity-spi/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    http-client-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-client-spi/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    metrics-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/metrics-spi/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    identity-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/identity-spi/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    metrics-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/metrics-spi/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    profiles    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/profiles/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    retries-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/retries-spi/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    retries    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/retries/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    retries-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/retries-spi/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.eventstream    eventstream    [1.0.1](https://mvnrepository.com/artifact/software.amazon.eventstream/eventstream/1.0.1)    Apache License, Version 2.0
            software.amazon.awssdk    endpoints-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/endpoints-spi/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    http-auth-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-auth-spi/2.31.63)    Apache License, Version 2.0
                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    http-client-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-client-spi/2.31.63)    Apache License, Version 2.0
                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    metrics-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/metrics-spi/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    identity-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/identity-spi/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    http-auth    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-auth/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    http-auth-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-auth-spi/2.31.63)    Apache License, Version 2.0
                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    http-client-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-client-spi/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    metrics-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/metrics-spi/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    identity-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/identity-spi/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    http-client-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-client-spi/2.31.63)    Apache License, Version 2.0
                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    metrics-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/metrics-spi/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    identity-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/identity-spi/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    http-client-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-client-spi/2.31.63)    Apache License, Version 2.0
                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    metrics-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/metrics-spi/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    identity-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/identity-spi/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    metrics-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/metrics-spi/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    profiles    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/profiles/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    regions    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/regions/2.31.63)    Apache License, Version 2.0
                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    json-utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/json-utils/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    third-party-jackson-core    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/third-party-jackson-core/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    profiles    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/profiles/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    sdk-core    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/sdk-core/2.31.63)    Apache License, Version 2.0
                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    checksums-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/checksums-spi/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    checksums    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/checksums/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    checksums-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/checksums-spi/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    endpoints-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/endpoints-spi/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    http-auth-aws    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-auth-aws/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    checksums-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/checksums-spi/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    checksums    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/checksums/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    checksums-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/checksums-spi/2.31.63)    Apache License, Version 2.0
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    http-auth-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-auth-spi/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    http-client-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-client-spi/2.31.63)    Apache License, Version 2.0
                                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                                software.amazon.awssdk    metrics-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/metrics-spi/2.31.63)    Apache License, Version 2.0
                                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    identity-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/identity-spi/2.31.63)    Apache License, Version 2.0
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    http-client-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-client-spi/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    metrics-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/metrics-spi/2.31.63)    Apache License, Version 2.0
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    identity-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/identity-spi/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    http-auth-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-auth-spi/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    http-client-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-client-spi/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    metrics-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/metrics-spi/2.31.63)    Apache License, Version 2.0
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    identity-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/identity-spi/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    http-client-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-client-spi/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    metrics-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/metrics-spi/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    identity-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/identity-spi/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    metrics-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/metrics-spi/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    profiles    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/profiles/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    retries-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/retries-spi/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    retries    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/retries/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    retries-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/retries-spi/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    retries-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/retries-spi/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    retries    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/retries/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    retries-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/retries-spi/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    sdk-core    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/sdk-core/2.31.63)    Apache License, Version 2.0
                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    checksums-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/checksums-spi/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    checksums    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/checksums/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    checksums-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/checksums-spi/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    endpoints-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/endpoints-spi/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    http-auth-aws    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-auth-aws/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    checksums-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/checksums-spi/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    checksums    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/checksums/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    checksums-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/checksums-spi/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    http-auth-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-auth-spi/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    http-client-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-client-spi/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    metrics-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/metrics-spi/2.31.63)    Apache License, Version 2.0
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    identity-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/identity-spi/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    http-client-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-client-spi/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    metrics-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/metrics-spi/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    identity-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/identity-spi/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    http-auth-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-auth-spi/2.31.63)    Apache License, Version 2.0
                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    http-client-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-client-spi/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    metrics-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/metrics-spi/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    identity-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/identity-spi/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    http-client-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-client-spi/2.31.63)    Apache License, Version 2.0
                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    metrics-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/metrics-spi/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    identity-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/identity-spi/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    metrics-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/metrics-spi/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    profiles    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/profiles/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    retries-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/retries-spi/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    retries    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/retries/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    retries-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/retries-spi/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.eventstream    eventstream    [1.0.1](https://mvnrepository.com/artifact/software.amazon.eventstream/eventstream/1.0.1)    Apache License, Version 2.0
        software.amazon.awssdk    http-client-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-client-spi/2.31.63)    Apache License, Version 2.0
            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    metrics-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/metrics-spi/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
        software.amazon.awssdk    json-utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/json-utils/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    third-party-jackson-core    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/third-party-jackson-core/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
        software.amazon.awssdk    protocol-core    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/protocol-core/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    http-client-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-client-spi/2.31.63)    Apache License, Version 2.0
                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    metrics-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/metrics-spi/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    sdk-core    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/sdk-core/2.31.63)    Apache License, Version 2.0
                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    checksums-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/checksums-spi/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    checksums    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/checksums/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    checksums-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/checksums-spi/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    endpoints-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/endpoints-spi/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    http-auth-aws    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-auth-aws/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    checksums-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/checksums-spi/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    checksums    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/checksums/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    checksums-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/checksums-spi/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    http-auth-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-auth-spi/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    http-client-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-client-spi/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    metrics-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/metrics-spi/2.31.63)    Apache License, Version 2.0
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    identity-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/identity-spi/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    http-client-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-client-spi/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    metrics-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/metrics-spi/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    identity-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/identity-spi/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    http-auth-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-auth-spi/2.31.63)    Apache License, Version 2.0
                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    http-client-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-client-spi/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    metrics-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/metrics-spi/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    identity-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/identity-spi/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    http-client-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-client-spi/2.31.63)    Apache License, Version 2.0
                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    metrics-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/metrics-spi/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    identity-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/identity-spi/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    metrics-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/metrics-spi/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    profiles    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/profiles/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    retries-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/retries-spi/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    retries    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/retries/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    retries-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/retries-spi/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
        software.amazon.awssdk    sdk-core    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/sdk-core/2.31.63)    Apache License, Version 2.0
            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    checksums-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/checksums-spi/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    checksums    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/checksums/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    checksums-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/checksums-spi/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    endpoints-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/endpoints-spi/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    http-auth-aws    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-auth-aws/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    checksums-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/checksums-spi/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    checksums    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/checksums/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    checksums-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/checksums-spi/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    http-auth-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-auth-spi/2.31.63)    Apache License, Version 2.0
                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    http-client-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-client-spi/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    metrics-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/metrics-spi/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    identity-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/identity-spi/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    http-client-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-client-spi/2.31.63)    Apache License, Version 2.0
                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    metrics-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/metrics-spi/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    identity-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/identity-spi/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    http-auth-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-auth-spi/2.31.63)    Apache License, Version 2.0
                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    http-client-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-client-spi/2.31.63)    Apache License, Version 2.0
                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    metrics-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/metrics-spi/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    identity-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/identity-spi/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    http-client-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-client-spi/2.31.63)    Apache License, Version 2.0
                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    metrics-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/metrics-spi/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    identity-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/identity-spi/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    metrics-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/metrics-spi/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    profiles    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/profiles/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    retries-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/retries-spi/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    retries    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/retries/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    retries-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/retries-spi/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
        software.amazon.awssdk    third-party-jackson-core    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/third-party-jackson-core/2.31.63)    Apache License, Version 2.0
        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
    software.amazon.awssdk    endpoints-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/endpoints-spi/2.31.63)    Apache License, Version 2.0
        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
    software.amazon.awssdk    http-auth-aws    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-auth-aws/2.31.63)    Apache License, Version 2.0
        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
        software.amazon.awssdk    checksums-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/checksums-spi/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
        software.amazon.awssdk    checksums    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/checksums/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    checksums-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/checksums-spi/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
        software.amazon.awssdk    http-auth-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-auth-spi/2.31.63)    Apache License, Version 2.0
            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    http-client-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-client-spi/2.31.63)    Apache License, Version 2.0
                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    metrics-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/metrics-spi/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    identity-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/identity-spi/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
        software.amazon.awssdk    http-client-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-client-spi/2.31.63)    Apache License, Version 2.0
            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    metrics-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/metrics-spi/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
        software.amazon.awssdk    identity-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/identity-spi/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
    software.amazon.awssdk    http-auth-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-auth-spi/2.31.63)    Apache License, Version 2.0
        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
        software.amazon.awssdk    http-client-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-client-spi/2.31.63)    Apache License, Version 2.0
            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    metrics-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/metrics-spi/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
        software.amazon.awssdk    identity-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/identity-spi/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
    software.amazon.awssdk    http-auth    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-auth/2.31.63)    Apache License, Version 2.0
        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
        software.amazon.awssdk    http-auth-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-auth-spi/2.31.63)    Apache License, Version 2.0
            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    http-client-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-client-spi/2.31.63)    Apache License, Version 2.0
                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    metrics-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/metrics-spi/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    identity-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/identity-spi/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
        software.amazon.awssdk    http-client-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-client-spi/2.31.63)    Apache License, Version 2.0
            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    metrics-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/metrics-spi/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
        software.amazon.awssdk    identity-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/identity-spi/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
    software.amazon.awssdk    http-client-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-client-spi/2.31.63)    Apache License, Version 2.0
        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
        software.amazon.awssdk    metrics-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/metrics-spi/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
    software.amazon.awssdk    identity-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/identity-spi/2.31.63)    Apache License, Version 2.0
        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
    software.amazon.awssdk    json-utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/json-utils/2.31.63)    Apache License, Version 2.0
        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
        software.amazon.awssdk    third-party-jackson-core    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/third-party-jackson-core/2.31.63)    Apache License, Version 2.0
        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
    software.amazon.awssdk    metrics-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/metrics-spi/2.31.63)    Apache License, Version 2.0
        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
    software.amazon.awssdk    netty-nio-client    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/netty-nio-client/2.31.63)    Apache License, Version 2.0
        io.netty    netty-buffer    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.118.Final)    Apache License, Version 2.0
            io.netty    netty-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.118.Final)    Apache License, Version 2.0
        io.netty    netty-codec-http2    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-codec-http2/4.1.118.Final)    Apache License, Version 2.0
            io.netty    netty-buffer    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.118.Final)    Apache License, Version 2.0
                io.netty    netty-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.118.Final)    Apache License, Version 2.0
            io.netty    netty-codec-http    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-codec-http/4.1.118.Final)    Apache License, Version 2.0
                io.netty    netty-buffer    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.118.Final)    Apache License, Version 2.0
                    io.netty    netty-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.118.Final)    Apache License, Version 2.0
                io.netty    netty-codec    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-codec/4.1.118.Final)    Apache License, Version 2.0
                    io.netty    netty-buffer    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.118.Final)    Apache License, Version 2.0
                        io.netty    netty-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.118.Final)    Apache License, Version 2.0
                    io.netty    netty-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.118.Final)    Apache License, Version 2.0
                    io.netty    netty-transport    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-transport/4.1.118.Final)    Apache License, Version 2.0
                        io.netty    netty-buffer    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.118.Final)    Apache License, Version 2.0
                            io.netty    netty-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.118.Final)    Apache License, Version 2.0
                        io.netty    netty-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.118.Final)    Apache License, Version 2.0
                        io.netty    netty-resolver    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-resolver/4.1.118.Final)    Apache License, Version 2.0
                            io.netty    netty-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.118.Final)    Apache License, Version 2.0
                io.netty    netty-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.118.Final)    Apache License, Version 2.0
                io.netty    netty-handler    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-handler/4.1.118.Final)    Apache License, Version 2.0
                    io.netty    netty-buffer    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.118.Final)    Apache License, Version 2.0
                        io.netty    netty-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.118.Final)    Apache License, Version 2.0
                    io.netty    netty-codec    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-codec/4.1.118.Final)    Apache License, Version 2.0
                        io.netty    netty-buffer    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.118.Final)    Apache License, Version 2.0
                            io.netty    netty-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.118.Final)    Apache License, Version 2.0
                        io.netty    netty-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.118.Final)    Apache License, Version 2.0
                        io.netty    netty-transport    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-transport/4.1.118.Final)    Apache License, Version 2.0
                            io.netty    netty-buffer    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.118.Final)    Apache License, Version 2.0
                                io.netty    netty-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.118.Final)    Apache License, Version 2.0
                            io.netty    netty-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.118.Final)    Apache License, Version 2.0
                            io.netty    netty-resolver    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-resolver/4.1.118.Final)    Apache License, Version 2.0
                                io.netty    netty-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.118.Final)    Apache License, Version 2.0
                    io.netty    netty-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.118.Final)    Apache License, Version 2.0
                    io.netty    netty-resolver    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-resolver/4.1.118.Final)    Apache License, Version 2.0
                        io.netty    netty-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.118.Final)    Apache License, Version 2.0
                    io.netty    netty-transport-native-unix-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-transport-native-unix-common/4.1.118.Final)    Apache License, Version 2.0
                        io.netty    netty-buffer    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.118.Final)    Apache License, Version 2.0
                            io.netty    netty-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.118.Final)    Apache License, Version 2.0
                        io.netty    netty-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.118.Final)    Apache License, Version 2.0
                        io.netty    netty-transport    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-transport/4.1.118.Final)    Apache License, Version 2.0
                            io.netty    netty-buffer    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.118.Final)    Apache License, Version 2.0
                                io.netty    netty-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.118.Final)    Apache License, Version 2.0
                            io.netty    netty-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.118.Final)    Apache License, Version 2.0
                            io.netty    netty-resolver    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-resolver/4.1.118.Final)    Apache License, Version 2.0
                                io.netty    netty-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.118.Final)    Apache License, Version 2.0
                    io.netty    netty-transport    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-transport/4.1.118.Final)    Apache License, Version 2.0
                        io.netty    netty-buffer    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.118.Final)    Apache License, Version 2.0
                            io.netty    netty-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.118.Final)    Apache License, Version 2.0
                        io.netty    netty-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.118.Final)    Apache License, Version 2.0
                        io.netty    netty-resolver    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-resolver/4.1.118.Final)    Apache License, Version 2.0
                            io.netty    netty-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.118.Final)    Apache License, Version 2.0
                io.netty    netty-transport    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-transport/4.1.118.Final)    Apache License, Version 2.0
                    io.netty    netty-buffer    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.118.Final)    Apache License, Version 2.0
                        io.netty    netty-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.118.Final)    Apache License, Version 2.0
                    io.netty    netty-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.118.Final)    Apache License, Version 2.0
                    io.netty    netty-resolver    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-resolver/4.1.118.Final)    Apache License, Version 2.0
                        io.netty    netty-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.118.Final)    Apache License, Version 2.0
            io.netty    netty-codec    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-codec/4.1.118.Final)    Apache License, Version 2.0
                io.netty    netty-buffer    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.118.Final)    Apache License, Version 2.0
                    io.netty    netty-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.118.Final)    Apache License, Version 2.0
                io.netty    netty-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.118.Final)    Apache License, Version 2.0
                io.netty    netty-transport    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-transport/4.1.118.Final)    Apache License, Version 2.0
                    io.netty    netty-buffer    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.118.Final)    Apache License, Version 2.0
                        io.netty    netty-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.118.Final)    Apache License, Version 2.0
                    io.netty    netty-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.118.Final)    Apache License, Version 2.0
                    io.netty    netty-resolver    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-resolver/4.1.118.Final)    Apache License, Version 2.0
                        io.netty    netty-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.118.Final)    Apache License, Version 2.0
            io.netty    netty-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.118.Final)    Apache License, Version 2.0
            io.netty    netty-handler    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-handler/4.1.118.Final)    Apache License, Version 2.0
                io.netty    netty-buffer    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.118.Final)    Apache License, Version 2.0
                    io.netty    netty-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.118.Final)    Apache License, Version 2.0
                io.netty    netty-codec    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-codec/4.1.118.Final)    Apache License, Version 2.0
                    io.netty    netty-buffer    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.118.Final)    Apache License, Version 2.0
                        io.netty    netty-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.118.Final)    Apache License, Version 2.0
                    io.netty    netty-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.118.Final)    Apache License, Version 2.0
                    io.netty    netty-transport    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-transport/4.1.118.Final)    Apache License, Version 2.0
                        io.netty    netty-buffer    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.118.Final)    Apache License, Version 2.0
                            io.netty    netty-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.118.Final)    Apache License, Version 2.0
                        io.netty    netty-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.118.Final)    Apache License, Version 2.0
                        io.netty    netty-resolver    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-resolver/4.1.118.Final)    Apache License, Version 2.0
                            io.netty    netty-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.118.Final)    Apache License, Version 2.0
                io.netty    netty-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.118.Final)    Apache License, Version 2.0
                io.netty    netty-resolver    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-resolver/4.1.118.Final)    Apache License, Version 2.0
                    io.netty    netty-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.118.Final)    Apache License, Version 2.0
                io.netty    netty-transport-native-unix-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-transport-native-unix-common/4.1.118.Final)    Apache License, Version 2.0
                    io.netty    netty-buffer    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.118.Final)    Apache License, Version 2.0
                        io.netty    netty-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.118.Final)    Apache License, Version 2.0
                    io.netty    netty-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.118.Final)    Apache License, Version 2.0
                    io.netty    netty-transport    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-transport/4.1.118.Final)    Apache License, Version 2.0
                        io.netty    netty-buffer    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.118.Final)    Apache License, Version 2.0
                            io.netty    netty-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.118.Final)    Apache License, Version 2.0
                        io.netty    netty-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.118.Final)    Apache License, Version 2.0
                        io.netty    netty-resolver    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-resolver/4.1.118.Final)    Apache License, Version 2.0
                            io.netty    netty-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.118.Final)    Apache License, Version 2.0
                io.netty    netty-transport    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-transport/4.1.118.Final)    Apache License, Version 2.0
                    io.netty    netty-buffer    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.118.Final)    Apache License, Version 2.0
                        io.netty    netty-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.118.Final)    Apache License, Version 2.0
                    io.netty    netty-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.118.Final)    Apache License, Version 2.0
                    io.netty    netty-resolver    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-resolver/4.1.118.Final)    Apache License, Version 2.0
                        io.netty    netty-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.118.Final)    Apache License, Version 2.0
            io.netty    netty-transport    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-transport/4.1.118.Final)    Apache License, Version 2.0
                io.netty    netty-buffer    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.118.Final)    Apache License, Version 2.0
                    io.netty    netty-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.118.Final)    Apache License, Version 2.0
                io.netty    netty-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.118.Final)    Apache License, Version 2.0
                io.netty    netty-resolver    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-resolver/4.1.118.Final)    Apache License, Version 2.0
                    io.netty    netty-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.118.Final)    Apache License, Version 2.0
        io.netty    netty-codec-http    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-codec-http/4.1.118.Final)    Apache License, Version 2.0
            io.netty    netty-buffer    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.118.Final)    Apache License, Version 2.0
                io.netty    netty-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.118.Final)    Apache License, Version 2.0
            io.netty    netty-codec    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-codec/4.1.118.Final)    Apache License, Version 2.0
                io.netty    netty-buffer    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.118.Final)    Apache License, Version 2.0
                    io.netty    netty-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.118.Final)    Apache License, Version 2.0
                io.netty    netty-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.118.Final)    Apache License, Version 2.0
                io.netty    netty-transport    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-transport/4.1.118.Final)    Apache License, Version 2.0
                    io.netty    netty-buffer    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.118.Final)    Apache License, Version 2.0
                        io.netty    netty-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.118.Final)    Apache License, Version 2.0
                    io.netty    netty-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.118.Final)    Apache License, Version 2.0
                    io.netty    netty-resolver    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-resolver/4.1.118.Final)    Apache License, Version 2.0
                        io.netty    netty-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.118.Final)    Apache License, Version 2.0
            io.netty    netty-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.118.Final)    Apache License, Version 2.0
            io.netty    netty-handler    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-handler/4.1.118.Final)    Apache License, Version 2.0
                io.netty    netty-buffer    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.118.Final)    Apache License, Version 2.0
                    io.netty    netty-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.118.Final)    Apache License, Version 2.0
                io.netty    netty-codec    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-codec/4.1.118.Final)    Apache License, Version 2.0
                    io.netty    netty-buffer    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.118.Final)    Apache License, Version 2.0
                        io.netty    netty-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.118.Final)    Apache License, Version 2.0
                    io.netty    netty-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.118.Final)    Apache License, Version 2.0
                    io.netty    netty-transport    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-transport/4.1.118.Final)    Apache License, Version 2.0
                        io.netty    netty-buffer    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.118.Final)    Apache License, Version 2.0
                            io.netty    netty-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.118.Final)    Apache License, Version 2.0
                        io.netty    netty-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.118.Final)    Apache License, Version 2.0
                        io.netty    netty-resolver    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-resolver/4.1.118.Final)    Apache License, Version 2.0
                            io.netty    netty-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.118.Final)    Apache License, Version 2.0
                io.netty    netty-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.118.Final)    Apache License, Version 2.0
                io.netty    netty-resolver    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-resolver/4.1.118.Final)    Apache License, Version 2.0
                    io.netty    netty-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.118.Final)    Apache License, Version 2.0
                io.netty    netty-transport-native-unix-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-transport-native-unix-common/4.1.118.Final)    Apache License, Version 2.0
                    io.netty    netty-buffer    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.118.Final)    Apache License, Version 2.0
                        io.netty    netty-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.118.Final)    Apache License, Version 2.0
                    io.netty    netty-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.118.Final)    Apache License, Version 2.0
                    io.netty    netty-transport    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-transport/4.1.118.Final)    Apache License, Version 2.0
                        io.netty    netty-buffer    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.118.Final)    Apache License, Version 2.0
                            io.netty    netty-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.118.Final)    Apache License, Version 2.0
                        io.netty    netty-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.118.Final)    Apache License, Version 2.0
                        io.netty    netty-resolver    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-resolver/4.1.118.Final)    Apache License, Version 2.0
                            io.netty    netty-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.118.Final)    Apache License, Version 2.0
                io.netty    netty-transport    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-transport/4.1.118.Final)    Apache License, Version 2.0
                    io.netty    netty-buffer    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.118.Final)    Apache License, Version 2.0
                        io.netty    netty-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.118.Final)    Apache License, Version 2.0
                    io.netty    netty-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.118.Final)    Apache License, Version 2.0
                    io.netty    netty-resolver    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-resolver/4.1.118.Final)    Apache License, Version 2.0
                        io.netty    netty-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.118.Final)    Apache License, Version 2.0
            io.netty    netty-transport    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-transport/4.1.118.Final)    Apache License, Version 2.0
                io.netty    netty-buffer    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.118.Final)    Apache License, Version 2.0
                    io.netty    netty-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.118.Final)    Apache License, Version 2.0
                io.netty    netty-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.118.Final)    Apache License, Version 2.0
                io.netty    netty-resolver    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-resolver/4.1.118.Final)    Apache License, Version 2.0
                    io.netty    netty-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.118.Final)    Apache License, Version 2.0
        io.netty    netty-codec    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-codec/4.1.118.Final)    Apache License, Version 2.0
            io.netty    netty-buffer    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.118.Final)    Apache License, Version 2.0
                io.netty    netty-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.118.Final)    Apache License, Version 2.0
            io.netty    netty-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.118.Final)    Apache License, Version 2.0
            io.netty    netty-transport    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-transport/4.1.118.Final)    Apache License, Version 2.0
                io.netty    netty-buffer    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.118.Final)    Apache License, Version 2.0
                    io.netty    netty-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.118.Final)    Apache License, Version 2.0
                io.netty    netty-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.118.Final)    Apache License, Version 2.0
                io.netty    netty-resolver    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-resolver/4.1.118.Final)    Apache License, Version 2.0
                    io.netty    netty-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.118.Final)    Apache License, Version 2.0
        io.netty    netty-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.118.Final)    Apache License, Version 2.0
        io.netty    netty-handler    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-handler/4.1.118.Final)    Apache License, Version 2.0
            io.netty    netty-buffer    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.118.Final)    Apache License, Version 2.0
                io.netty    netty-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.118.Final)    Apache License, Version 2.0
            io.netty    netty-codec    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-codec/4.1.118.Final)    Apache License, Version 2.0
                io.netty    netty-buffer    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.118.Final)    Apache License, Version 2.0
                    io.netty    netty-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.118.Final)    Apache License, Version 2.0
                io.netty    netty-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.118.Final)    Apache License, Version 2.0
                io.netty    netty-transport    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-transport/4.1.118.Final)    Apache License, Version 2.0
                    io.netty    netty-buffer    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.118.Final)    Apache License, Version 2.0
                        io.netty    netty-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.118.Final)    Apache License, Version 2.0
                    io.netty    netty-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.118.Final)    Apache License, Version 2.0
                    io.netty    netty-resolver    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-resolver/4.1.118.Final)    Apache License, Version 2.0
                        io.netty    netty-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.118.Final)    Apache License, Version 2.0
            io.netty    netty-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.118.Final)    Apache License, Version 2.0
            io.netty    netty-resolver    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-resolver/4.1.118.Final)    Apache License, Version 2.0
                io.netty    netty-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.118.Final)    Apache License, Version 2.0
            io.netty    netty-transport-native-unix-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-transport-native-unix-common/4.1.118.Final)    Apache License, Version 2.0
                io.netty    netty-buffer    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.118.Final)    Apache License, Version 2.0
                    io.netty    netty-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.118.Final)    Apache License, Version 2.0
                io.netty    netty-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.118.Final)    Apache License, Version 2.0
                io.netty    netty-transport    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-transport/4.1.118.Final)    Apache License, Version 2.0
                    io.netty    netty-buffer    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.118.Final)    Apache License, Version 2.0
                        io.netty    netty-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.118.Final)    Apache License, Version 2.0
                    io.netty    netty-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.118.Final)    Apache License, Version 2.0
                    io.netty    netty-resolver    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-resolver/4.1.118.Final)    Apache License, Version 2.0
                        io.netty    netty-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.118.Final)    Apache License, Version 2.0
            io.netty    netty-transport    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-transport/4.1.118.Final)    Apache License, Version 2.0
                io.netty    netty-buffer    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.118.Final)    Apache License, Version 2.0
                    io.netty    netty-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.118.Final)    Apache License, Version 2.0
                io.netty    netty-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.118.Final)    Apache License, Version 2.0
                io.netty    netty-resolver    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-resolver/4.1.118.Final)    Apache License, Version 2.0
                    io.netty    netty-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.118.Final)    Apache License, Version 2.0
        io.netty    netty-resolver    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-resolver/4.1.118.Final)    Apache License, Version 2.0
            io.netty    netty-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.118.Final)    Apache License, Version 2.0
        io.netty    netty-transport-classes-epoll    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-transport-classes-epoll/4.1.118.Final)    Apache License, Version 2.0
            io.netty    netty-buffer    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.118.Final)    Apache License, Version 2.0
                io.netty    netty-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.118.Final)    Apache License, Version 2.0
            io.netty    netty-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.118.Final)    Apache License, Version 2.0
            io.netty    netty-transport-native-unix-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-transport-native-unix-common/4.1.118.Final)    Apache License, Version 2.0
                io.netty    netty-buffer    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.118.Final)    Apache License, Version 2.0
                    io.netty    netty-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.118.Final)    Apache License, Version 2.0
                io.netty    netty-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.118.Final)    Apache License, Version 2.0
                io.netty    netty-transport    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-transport/4.1.118.Final)    Apache License, Version 2.0
                    io.netty    netty-buffer    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.118.Final)    Apache License, Version 2.0
                        io.netty    netty-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.118.Final)    Apache License, Version 2.0
                    io.netty    netty-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.118.Final)    Apache License, Version 2.0
                    io.netty    netty-resolver    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-resolver/4.1.118.Final)    Apache License, Version 2.0
                        io.netty    netty-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.118.Final)    Apache License, Version 2.0
            io.netty    netty-transport    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-transport/4.1.118.Final)    Apache License, Version 2.0
                io.netty    netty-buffer    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.118.Final)    Apache License, Version 2.0
                    io.netty    netty-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.118.Final)    Apache License, Version 2.0
                io.netty    netty-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.118.Final)    Apache License, Version 2.0
                io.netty    netty-resolver    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-resolver/4.1.118.Final)    Apache License, Version 2.0
                    io.netty    netty-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.118.Final)    Apache License, Version 2.0
        io.netty    netty-transport    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-transport/4.1.118.Final)    Apache License, Version 2.0
            io.netty    netty-buffer    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.118.Final)    Apache License, Version 2.0
                io.netty    netty-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.118.Final)    Apache License, Version 2.0
            io.netty    netty-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.118.Final)    Apache License, Version 2.0
            io.netty    netty-resolver    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-resolver/4.1.118.Final)    Apache License, Version 2.0
                io.netty    netty-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.118.Final)    Apache License, Version 2.0
        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
        software.amazon.awssdk    http-client-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-client-spi/2.31.63)    Apache License, Version 2.0
            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    metrics-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/metrics-spi/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
        software.amazon.awssdk    metrics-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/metrics-spi/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
    software.amazon.awssdk    profiles    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/profiles/2.31.63)    Apache License, Version 2.0
        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
    software.amazon.awssdk    protocol-core    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/protocol-core/2.31.63)    Apache License, Version 2.0
        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
        software.amazon.awssdk    http-client-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-client-spi/2.31.63)    Apache License, Version 2.0
            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    metrics-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/metrics-spi/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
        software.amazon.awssdk    sdk-core    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/sdk-core/2.31.63)    Apache License, Version 2.0
            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    checksums-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/checksums-spi/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    checksums    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/checksums/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    checksums-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/checksums-spi/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    endpoints-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/endpoints-spi/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    http-auth-aws    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-auth-aws/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    checksums-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/checksums-spi/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    checksums    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/checksums/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    checksums-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/checksums-spi/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    http-auth-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-auth-spi/2.31.63)    Apache License, Version 2.0
                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    http-client-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-client-spi/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    metrics-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/metrics-spi/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    identity-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/identity-spi/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    http-client-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-client-spi/2.31.63)    Apache License, Version 2.0
                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    metrics-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/metrics-spi/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    identity-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/identity-spi/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    http-auth-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-auth-spi/2.31.63)    Apache License, Version 2.0
                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    http-client-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-client-spi/2.31.63)    Apache License, Version 2.0
                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    metrics-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/metrics-spi/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    identity-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/identity-spi/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    http-client-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-client-spi/2.31.63)    Apache License, Version 2.0
                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    metrics-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/metrics-spi/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    identity-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/identity-spi/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    metrics-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/metrics-spi/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    profiles    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/profiles/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    retries-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/retries-spi/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    retries    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/retries/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    retries-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/retries-spi/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
    software.amazon.awssdk    regions    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/regions/2.31.63)    Apache License, Version 2.0
        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
        software.amazon.awssdk    json-utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/json-utils/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    third-party-jackson-core    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/third-party-jackson-core/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
        software.amazon.awssdk    profiles    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/profiles/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
        software.amazon.awssdk    sdk-core    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/sdk-core/2.31.63)    Apache License, Version 2.0
            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    checksums-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/checksums-spi/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    checksums    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/checksums/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    checksums-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/checksums-spi/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    endpoints-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/endpoints-spi/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    http-auth-aws    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-auth-aws/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    checksums-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/checksums-spi/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    checksums    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/checksums/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    checksums-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/checksums-spi/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    http-auth-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-auth-spi/2.31.63)    Apache License, Version 2.0
                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    http-client-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-client-spi/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    metrics-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/metrics-spi/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    identity-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/identity-spi/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    http-client-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-client-spi/2.31.63)    Apache License, Version 2.0
                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    metrics-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/metrics-spi/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    identity-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/identity-spi/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    http-auth-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-auth-spi/2.31.63)    Apache License, Version 2.0
                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    http-client-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-client-spi/2.31.63)    Apache License, Version 2.0
                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    metrics-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/metrics-spi/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    identity-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/identity-spi/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    http-client-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-client-spi/2.31.63)    Apache License, Version 2.0
                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    metrics-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/metrics-spi/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    identity-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/identity-spi/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    metrics-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/metrics-spi/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    profiles    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/profiles/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    retries-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/retries-spi/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    retries    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/retries/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    retries-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/retries-spi/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
    software.amazon.awssdk    retries-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/retries-spi/2.31.63)    Apache License, Version 2.0
        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
    software.amazon.awssdk    sdk-core    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/sdk-core/2.31.63)    Apache License, Version 2.0
        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
        software.amazon.awssdk    checksums-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/checksums-spi/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
        software.amazon.awssdk    checksums    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/checksums/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    checksums-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/checksums-spi/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
        software.amazon.awssdk    endpoints-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/endpoints-spi/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
        software.amazon.awssdk    http-auth-aws    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-auth-aws/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    checksums-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/checksums-spi/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    checksums    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/checksums/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    checksums-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/checksums-spi/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    http-auth-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-auth-spi/2.31.63)    Apache License, Version 2.0
                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    http-client-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-client-spi/2.31.63)    Apache License, Version 2.0
                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    metrics-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/metrics-spi/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    identity-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/identity-spi/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    http-client-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-client-spi/2.31.63)    Apache License, Version 2.0
                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    metrics-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/metrics-spi/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    identity-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/identity-spi/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
        software.amazon.awssdk    http-auth-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-auth-spi/2.31.63)    Apache License, Version 2.0
            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    http-client-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-client-spi/2.31.63)    Apache License, Version 2.0
                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    metrics-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/metrics-spi/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    identity-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/identity-spi/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
        software.amazon.awssdk    http-client-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-client-spi/2.31.63)    Apache License, Version 2.0
            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    metrics-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/metrics-spi/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
        software.amazon.awssdk    identity-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/identity-spi/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
        software.amazon.awssdk    metrics-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/metrics-spi/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
        software.amazon.awssdk    profiles    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/profiles/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
        software.amazon.awssdk    retries-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/retries-spi/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
        software.amazon.awssdk    retries    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/retries/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    retries-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/retries-spi/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
```

## Code Examples

### Example 1: Dependencies

```xml
<project&gt
  ...
  <repositories>
    <repository>
      <id>akka-repository</id>
      <name>Akka library repository</name>
      <url>https://repo.akka.io/maven</url>
    </repository>
  </repositories&gt
</project>
```

### Example 2: Dependencies

```scala
resolvers += "Akka library repository".at("https://repo.akka.io/maven")
```

### Example 3: Dependencies

```gradle
repositories {
    mavenCentral()
    maven {
        url "https://repo.akka.io/maven"
    }
}
```

### Example 4: Dependencies

```xml
<properties>
  <scala.binary.version>2.13</scala.binary.version>
</properties>
<dependencies&gt
  <dependency>
    <groupId>com.lightbend.akka</groupId>
    <artifactId>akka-persistence-dynamodb_${scala.binary.version}</artifactId>
    <version>2.0.10</version>
  </dependency&gt
</dependencies>
```

### Example 5: Dependencies

```scala
libraryDependencies += "com.lightbend.akka" %% "akka-persistence-dynamodb" % "2.0.10"
```

### Example 6: Dependencies

```gradle
def versions = [
  ScalaBinary: "2.13"
]
dependencies {
  implementation "com.lightbend.akka:akka-persistence-dynamodb_${versions.ScalaBinary}:2.0.10"
}
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/docs/akka-dependencies/current/support-terminology.html
- https://doc.akka.io/libraries/akka-persistence-dynamodb/current
- https://doc.akka.io/libraries/akka-persistence-dynamodb/current/getting-started.html
- https://doc.akka.io/libraries/akka-persistence-dynamodb/current/index.html

---
*Source: [https://doc.akka.io/libraries/akka-persistence-dynamodb/current/overview.html](https://doc.akka.io/libraries/akka-persistence-dynamodb/current/overview.html)*