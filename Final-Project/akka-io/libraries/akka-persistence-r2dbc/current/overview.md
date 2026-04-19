---
description: An Akka Persistence backed by SQL database with R2DBC
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:23:51Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-persistence-r2dbc/current/overview.html
title: Overview • Akka Persistence R2DBC Documentation
---

# Overview • Akka Persistence R2DBC Documentation

> **Summary:** An Akka Persistence backed by SQL database with R2DBC

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Overview

The Akka Persistence R2DBC plugin allows for using SQL database with R2DBC as a backend for Akka Persistence.

Currently, the R2DBC plugin has support for:

- [PostgreSQL](https://www.postgresql.org)
- [Yugabyte](https://www.yugabyte.com)
- [H2](https://h2database.com) \- As a minimal in\-process memory or file based database.
- [Microsoft SQL Server](https://microsoft.com/sqlserver)

It is specifically designed to work well for distributed SQL databases.

[Create an issue](https://github.com/akka/akka-persistence-r2dbc/issues) if you would like to [contribute](contributing.html) support for other databases that has a [R2DBC driver](https://r2dbc.io/drivers/).

## Project Info

| Project Info: Akka Persistence R2DBC | |
| --- | --- |
| Artifact | com.lightbend.akka akka\-persistence\-r2dbc 1\.3\.12 |
| JDK versions | Eclipse Temurin JDK 11Eclipse Temurin JDK 17Eclipse Temurin JDK 21 |
| Scala versions | 2\.13\.17, 3\.3\.7 |
| JPMS module name | akka.persistence.r2dbc |
| License | [BUSL\-1\.1](https://raw.githubusercontent.com/akka/akka-persistence-r2dbc/main/LICENSE) |
| Readiness level | [Supported](https://doc.akka.io/docs/akka-dependencies/current/support-terminology.html#supported), support is available from [Lightbend](https://www.lightbend.com/akka) Since 1\.0\.0, 2022\-10\-25 |
| Home page | [https://doc.akka.io/libraries/akka\-persistence\-r2dbc/current](https://doc.akka.io/libraries/akka-persistence-r2dbc/current) |
| Forums | [Lightbend Discuss](https://discuss.akka.io/c/akka/) |
| Release notes | [Github releases](https://github.com/akka/akka-persistence-r2dbc/releases) |
| Issues | [Github issues](https://github.com/akka/akka-persistence-r2dbc/issues) |
| Sources | [https://github.com/akka/akka\-persistence\-r2dbc](https://github.com/akka/akka-persistence-r2dbc) |

## Dependencies

Note
The Akka dependencies are available from Akka’s secure library repository. To access them you need to use a secure, tokenized URL as specified at <https://account.akka.io/token>.

Additionally, add the dependency as below.

Maven
```
<properties>
  <scala.binary.version>2.13</scala.binary.version>
</properties>
<dependencies&gt
  <dependency>
    <groupId>com.lightbend.akka</groupId>
    <artifactId>akka-persistence-r2dbc_${scala.binary.version}</artifactId>
    <version>1.3.12</version>
  </dependency&gt
</dependencies>
```
sbt
```
libraryDependencies += "com.lightbend.akka" %% "akka-persistence-r2dbc" % "1.3.12"
```
Gradle
```
def versions = [
  ScalaBinary: "2.13"
]
dependencies {
  implementation "com.lightbend.akka:akka-persistence-r2dbc_${versions.ScalaBinary}:1.3.12"
}
```

This plugin depends on Akka 2\.10\.13 or later, and note that it is important that all `akka-*` dependencies are in the same version, so it is recommended to depend on them explicitly to avoid problems with transient dependencies causing an unlucky mix of versions.

Direct dependencies

| Organization | Artifact | Version |
| --- | --- | --- |
| com.typesafe.akka | akka\-persistence\-query\_2\.13 | [2\.10\.13](https://mvnrepository.com/artifact/com.typesafe.akka/akka-persistence-query_2.13/2.10.13) |
| com.typesafe.akka | akka\-persistence\-typed\_2\.13 | [2\.10\.13](https://mvnrepository.com/artifact/com.typesafe.akka/akka-persistence-typed_2.13/2.10.13) |
| io.projectreactor.netty | reactor\-netty\-core | [1\.1\.31](https://mvnrepository.com/artifact/io.projectreactor.netty/reactor-netty-core/1.1.31) |
| io.r2dbc | r2dbc\-pool | [1\.0\.2\.RELEASE](https://mvnrepository.com/artifact/io.r2dbc/r2dbc-pool/1.0.2.RELEASE) |
| io.r2dbc | r2dbc\-spi | [1\.0\.0\.RELEASE](https://mvnrepository.com/artifact/io.r2dbc/r2dbc-spi/1.0.0.RELEASE) |
| org.postgresql | r2dbc\-postgresql | [1\.1\.0\.RELEASE](https://mvnrepository.com/artifact/org.postgresql/r2dbc-postgresql/1.1.0.RELEASE) |
| org.scala\-lang | scala\-library | [2\.13\.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17) |

Dependency tree
```

com.typesafe.akka    akka-persistence-query_2.13    [2.10.13](https://mvnrepository.com/artifact/com.typesafe.akka/akka-persistence-query_2.13/2.10.13)    BUSL-1.1
    com.typesafe.akka    akka-persistence_2.13    [2.10.13](https://mvnrepository.com/artifact/com.typesafe.akka/akka-persistence_2.13/2.10.13)    BUSL-1.1
        com.typesafe.akka    akka-actor_2.13    [2.10.13](https://mvnrepository.com/artifact/com.typesafe.akka/akka-actor_2.13/2.10.13)    BUSL-1.1
            com.typesafe    config    [1.4.5](https://mvnrepository.com/artifact/com.typesafe/config/1.4.5)    Apache-2.0
            org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
        com.typesafe.akka    akka-stream_2.13    [2.10.13](https://mvnrepository.com/artifact/com.typesafe.akka/akka-stream_2.13/2.10.13)    BUSL-1.1
            com.typesafe.akka    akka-actor_2.13    [2.10.13](https://mvnrepository.com/artifact/com.typesafe.akka/akka-actor_2.13/2.10.13)    BUSL-1.1
                com.typesafe    config    [1.4.5](https://mvnrepository.com/artifact/com.typesafe/config/1.4.5)    Apache-2.0
                org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
            com.typesafe.akka    akka-protobuf-v3_2.13    [2.10.13](https://mvnrepository.com/artifact/com.typesafe.akka/akka-protobuf-v3_2.13/2.10.13)    BUSL-1.1
            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
            org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
        org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
    com.typesafe.akka    akka-protobuf-v3_2.13    [2.10.13](https://mvnrepository.com/artifact/com.typesafe.akka/akka-protobuf-v3_2.13/2.10.13)    BUSL-1.1
    com.typesafe.akka    akka-stream_2.13    [2.10.13](https://mvnrepository.com/artifact/com.typesafe.akka/akka-stream_2.13/2.10.13)    BUSL-1.1
        com.typesafe.akka    akka-actor_2.13    [2.10.13](https://mvnrepository.com/artifact/com.typesafe.akka/akka-actor_2.13/2.10.13)    BUSL-1.1
            com.typesafe    config    [1.4.5](https://mvnrepository.com/artifact/com.typesafe/config/1.4.5)    Apache-2.0
            org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
        com.typesafe.akka    akka-protobuf-v3_2.13    [2.10.13](https://mvnrepository.com/artifact/com.typesafe.akka/akka-protobuf-v3_2.13/2.10.13)    BUSL-1.1
        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
        org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
    org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
com.typesafe.akka    akka-persistence-typed_2.13    [2.10.13](https://mvnrepository.com/artifact/com.typesafe.akka/akka-persistence-typed_2.13/2.10.13)    BUSL-1.1
    com.typesafe.akka    akka-actor-typed_2.13    [2.10.13](https://mvnrepository.com/artifact/com.typesafe.akka/akka-actor-typed_2.13/2.10.13)    BUSL-1.1
        com.typesafe.akka    akka-actor_2.13    [2.10.13](https://mvnrepository.com/artifact/com.typesafe.akka/akka-actor_2.13/2.10.13)    BUSL-1.1
            com.typesafe    config    [1.4.5](https://mvnrepository.com/artifact/com.typesafe/config/1.4.5)    Apache-2.0
            org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
        com.typesafe.akka    akka-slf4j_2.13    [2.10.13](https://mvnrepository.com/artifact/com.typesafe.akka/akka-slf4j_2.13/2.10.13)    BUSL-1.1
            com.typesafe.akka    akka-actor_2.13    [2.10.13](https://mvnrepository.com/artifact/com.typesafe.akka/akka-actor_2.13/2.10.13)    BUSL-1.1
                com.typesafe    config    [1.4.5](https://mvnrepository.com/artifact/com.typesafe/config/1.4.5)    Apache-2.0
                org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
            org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
        org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
    com.typesafe.akka    akka-persistence-query_2.13    [2.10.13](https://mvnrepository.com/artifact/com.typesafe.akka/akka-persistence-query_2.13/2.10.13)    BUSL-1.1
        com.typesafe.akka    akka-persistence_2.13    [2.10.13](https://mvnrepository.com/artifact/com.typesafe.akka/akka-persistence_2.13/2.10.13)    BUSL-1.1
            com.typesafe.akka    akka-actor_2.13    [2.10.13](https://mvnrepository.com/artifact/com.typesafe.akka/akka-actor_2.13/2.10.13)    BUSL-1.1
                com.typesafe    config    [1.4.5](https://mvnrepository.com/artifact/com.typesafe/config/1.4.5)    Apache-2.0
                org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
            com.typesafe.akka    akka-stream_2.13    [2.10.13](https://mvnrepository.com/artifact/com.typesafe.akka/akka-stream_2.13/2.10.13)    BUSL-1.1
                com.typesafe.akka    akka-actor_2.13    [2.10.13](https://mvnrepository.com/artifact/com.typesafe.akka/akka-actor_2.13/2.10.13)    BUSL-1.1
                    com.typesafe    config    [1.4.5](https://mvnrepository.com/artifact/com.typesafe/config/1.4.5)    Apache-2.0
                    org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
                com.typesafe.akka    akka-protobuf-v3_2.13    [2.10.13](https://mvnrepository.com/artifact/com.typesafe.akka/akka-protobuf-v3_2.13/2.10.13)    BUSL-1.1
                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
            org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
        com.typesafe.akka    akka-protobuf-v3_2.13    [2.10.13](https://mvnrepository.com/artifact/com.typesafe.akka/akka-protobuf-v3_2.13/2.10.13)    BUSL-1.1
        com.typesafe.akka    akka-stream_2.13    [2.10.13](https://mvnrepository.com/artifact/com.typesafe.akka/akka-stream_2.13/2.10.13)    BUSL-1.1
            com.typesafe.akka    akka-actor_2.13    [2.10.13](https://mvnrepository.com/artifact/com.typesafe.akka/akka-actor_2.13/2.10.13)    BUSL-1.1
                com.typesafe    config    [1.4.5](https://mvnrepository.com/artifact/com.typesafe/config/1.4.5)    Apache-2.0
                org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
            com.typesafe.akka    akka-protobuf-v3_2.13    [2.10.13](https://mvnrepository.com/artifact/com.typesafe.akka/akka-protobuf-v3_2.13/2.10.13)    BUSL-1.1
            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
            org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
        org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
    com.typesafe.akka    akka-persistence_2.13    [2.10.13](https://mvnrepository.com/artifact/com.typesafe.akka/akka-persistence_2.13/2.10.13)    BUSL-1.1
        com.typesafe.akka    akka-actor_2.13    [2.10.13](https://mvnrepository.com/artifact/com.typesafe.akka/akka-actor_2.13/2.10.13)    BUSL-1.1
            com.typesafe    config    [1.4.5](https://mvnrepository.com/artifact/com.typesafe/config/1.4.5)    Apache-2.0
            org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
        com.typesafe.akka    akka-stream_2.13    [2.10.13](https://mvnrepository.com/artifact/com.typesafe.akka/akka-stream_2.13/2.10.13)    BUSL-1.1
            com.typesafe.akka    akka-actor_2.13    [2.10.13](https://mvnrepository.com/artifact/com.typesafe.akka/akka-actor_2.13/2.10.13)    BUSL-1.1
                com.typesafe    config    [1.4.5](https://mvnrepository.com/artifact/com.typesafe/config/1.4.5)    Apache-2.0
                org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
            com.typesafe.akka    akka-protobuf-v3_2.13    [2.10.13](https://mvnrepository.com/artifact/com.typesafe.akka/akka-protobuf-v3_2.13/2.10.13)    BUSL-1.1
            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
            org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
        org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
    com.typesafe.akka    akka-remote_2.13    [2.10.13](https://mvnrepository.com/artifact/com.typesafe.akka/akka-remote_2.13/2.10.13)    BUSL-1.1
        com.typesafe.akka    akka-actor_2.13    [2.10.13](https://mvnrepository.com/artifact/com.typesafe.akka/akka-actor_2.13/2.10.13)    BUSL-1.1
            com.typesafe    config    [1.4.5](https://mvnrepository.com/artifact/com.typesafe/config/1.4.5)    Apache-2.0
            org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
        com.typesafe.akka    akka-pki_2.13    [2.10.13](https://mvnrepository.com/artifact/com.typesafe.akka/akka-pki_2.13/2.10.13)    BUSL-1.1
            com.hierynomus    asn-one    [0.6.0](https://mvnrepository.com/artifact/com.hierynomus/asn-one/0.6.0)    The Apache License, Version 2.0
            com.typesafe.akka    akka-actor_2.13    [2.10.13](https://mvnrepository.com/artifact/com.typesafe.akka/akka-actor_2.13/2.10.13)    BUSL-1.1
                com.typesafe    config    [1.4.5](https://mvnrepository.com/artifact/com.typesafe/config/1.4.5)    Apache-2.0
                org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
            org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
        com.typesafe.akka    akka-stream_2.13    [2.10.13](https://mvnrepository.com/artifact/com.typesafe.akka/akka-stream_2.13/2.10.13)    BUSL-1.1
            com.typesafe.akka    akka-actor_2.13    [2.10.13](https://mvnrepository.com/artifact/com.typesafe.akka/akka-actor_2.13/2.10.13)    BUSL-1.1
                com.typesafe    config    [1.4.5](https://mvnrepository.com/artifact/com.typesafe/config/1.4.5)    Apache-2.0
                org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
            com.typesafe.akka    akka-protobuf-v3_2.13    [2.10.13](https://mvnrepository.com/artifact/com.typesafe.akka/akka-protobuf-v3_2.13/2.10.13)    BUSL-1.1
            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
            org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
        org.agrona    agrona    [1.22.0](https://mvnrepository.com/artifact/org.agrona/agrona/1.22.0)    The Apache License, Version 2.0
        org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
    com.typesafe.akka    akka-stream-typed_2.13    [2.10.13](https://mvnrepository.com/artifact/com.typesafe.akka/akka-stream-typed_2.13/2.10.13)    BUSL-1.1
        com.typesafe.akka    akka-actor-typed_2.13    [2.10.13](https://mvnrepository.com/artifact/com.typesafe.akka/akka-actor-typed_2.13/2.10.13)    BUSL-1.1
            com.typesafe.akka    akka-actor_2.13    [2.10.13](https://mvnrepository.com/artifact/com.typesafe.akka/akka-actor_2.13/2.10.13)    BUSL-1.1
                com.typesafe    config    [1.4.5](https://mvnrepository.com/artifact/com.typesafe/config/1.4.5)    Apache-2.0
                org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
            com.typesafe.akka    akka-slf4j_2.13    [2.10.13](https://mvnrepository.com/artifact/com.typesafe.akka/akka-slf4j_2.13/2.10.13)    BUSL-1.1
                com.typesafe.akka    akka-actor_2.13    [2.10.13](https://mvnrepository.com/artifact/com.typesafe.akka/akka-actor_2.13/2.10.13)    BUSL-1.1
                    com.typesafe    config    [1.4.5](https://mvnrepository.com/artifact/com.typesafe/config/1.4.5)    Apache-2.0
                    org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
                org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
            org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
        com.typesafe.akka    akka-stream_2.13    [2.10.13](https://mvnrepository.com/artifact/com.typesafe.akka/akka-stream_2.13/2.10.13)    BUSL-1.1
            com.typesafe.akka    akka-actor_2.13    [2.10.13](https://mvnrepository.com/artifact/com.typesafe.akka/akka-actor_2.13/2.10.13)    BUSL-1.1
                com.typesafe    config    [1.4.5](https://mvnrepository.com/artifact/com.typesafe/config/1.4.5)    Apache-2.0
                org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
            com.typesafe.akka    akka-protobuf-v3_2.13    [2.10.13](https://mvnrepository.com/artifact/com.typesafe.akka/akka-protobuf-v3_2.13/2.10.13)    BUSL-1.1
            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
            org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
        org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
    org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
io.projectreactor.netty    reactor-netty-core    [1.1.31](https://mvnrepository.com/artifact/io.projectreactor.netty/reactor-netty-core/1.1.31)    The Apache Software License, Version 2.0
    io.netty    netty-handler-proxy    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-handler-proxy/4.1.122.Final)    Apache License, Version 2.0
        io.netty    netty-buffer    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.122.Final)    Apache License, Version 2.0
            io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
        io.netty    netty-codec-http    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-codec-http/4.1.122.Final)    Apache License, Version 2.0
            io.netty    netty-buffer    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.122.Final)    Apache License, Version 2.0
                io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
            io.netty    netty-codec    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-codec/4.1.122.Final)    Apache License, Version 2.0
                io.netty    netty-buffer    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.122.Final)    Apache License, Version 2.0
                    io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
                io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
                io.netty    netty-transport    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-transport/4.1.122.Final)    Apache License, Version 2.0
                    io.netty    netty-buffer    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.122.Final)    Apache License, Version 2.0
                        io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
                    io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
                    io.netty    netty-resolver    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-resolver/4.1.122.Final)    Apache License, Version 2.0
                        io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
            io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
            io.netty    netty-handler    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-handler/4.1.122.Final)    Apache License, Version 2.0
                io.netty    netty-buffer    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.122.Final)    Apache License, Version 2.0
                    io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
                io.netty    netty-codec    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-codec/4.1.122.Final)    Apache License, Version 2.0
                    io.netty    netty-buffer    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.122.Final)    Apache License, Version 2.0
                        io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
                    io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
                    io.netty    netty-transport    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-transport/4.1.122.Final)    Apache License, Version 2.0
                        io.netty    netty-buffer    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.122.Final)    Apache License, Version 2.0
                            io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
                        io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
                        io.netty    netty-resolver    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-resolver/4.1.122.Final)    Apache License, Version 2.0
                            io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
                io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
                io.netty    netty-resolver    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-resolver/4.1.122.Final)    Apache License, Version 2.0
                    io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
                io.netty    netty-transport-native-unix-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-transport-native-unix-common/4.1.122.Final)    Apache License, Version 2.0
                    io.netty    netty-buffer    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.122.Final)    Apache License, Version 2.0
                        io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
                    io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
                    io.netty    netty-transport    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-transport/4.1.122.Final)    Apache License, Version 2.0
                        io.netty    netty-buffer    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.122.Final)    Apache License, Version 2.0
                            io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
                        io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
                        io.netty    netty-resolver    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-resolver/4.1.122.Final)    Apache License, Version 2.0
                            io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
                io.netty    netty-transport    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-transport/4.1.122.Final)    Apache License, Version 2.0
                    io.netty    netty-buffer    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.122.Final)    Apache License, Version 2.0
                        io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
                    io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
                    io.netty    netty-resolver    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-resolver/4.1.122.Final)    Apache License, Version 2.0
                        io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
            io.netty    netty-transport    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-transport/4.1.122.Final)    Apache License, Version 2.0
                io.netty    netty-buffer    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.122.Final)    Apache License, Version 2.0
                    io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
                io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
                io.netty    netty-resolver    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-resolver/4.1.122.Final)    Apache License, Version 2.0
                    io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
        io.netty    netty-codec-socks    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-codec-socks/4.1.122.Final)    Apache License, Version 2.0
            io.netty    netty-buffer    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.122.Final)    Apache License, Version 2.0
                io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
            io.netty    netty-codec    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-codec/4.1.122.Final)    Apache License, Version 2.0
                io.netty    netty-buffer    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.122.Final)    Apache License, Version 2.0
                    io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
                io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
                io.netty    netty-transport    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-transport/4.1.122.Final)    Apache License, Version 2.0
                    io.netty    netty-buffer    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.122.Final)    Apache License, Version 2.0
                        io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
                    io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
                    io.netty    netty-resolver    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-resolver/4.1.122.Final)    Apache License, Version 2.0
                        io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
            io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
            io.netty    netty-transport    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-transport/4.1.122.Final)    Apache License, Version 2.0
                io.netty    netty-buffer    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.122.Final)    Apache License, Version 2.0
                    io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
                io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
                io.netty    netty-resolver    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-resolver/4.1.122.Final)    Apache License, Version 2.0
                    io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
        io.netty    netty-codec    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-codec/4.1.122.Final)    Apache License, Version 2.0
            io.netty    netty-buffer    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.122.Final)    Apache License, Version 2.0
                io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
            io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
            io.netty    netty-transport    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-transport/4.1.122.Final)    Apache License, Version 2.0
                io.netty    netty-buffer    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.122.Final)    Apache License, Version 2.0
                    io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
                io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
                io.netty    netty-resolver    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-resolver/4.1.122.Final)    Apache License, Version 2.0
                    io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
        io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
        io.netty    netty-transport    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-transport/4.1.122.Final)    Apache License, Version 2.0
            io.netty    netty-buffer    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.122.Final)    Apache License, Version 2.0
                io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
            io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
            io.netty    netty-resolver    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-resolver/4.1.122.Final)    Apache License, Version 2.0
                io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
    io.netty    netty-handler    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-handler/4.1.122.Final)    Apache License, Version 2.0
        io.netty    netty-buffer    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.122.Final)    Apache License, Version 2.0
            io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
        io.netty    netty-codec    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-codec/4.1.122.Final)    Apache License, Version 2.0
            io.netty    netty-buffer    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.122.Final)    Apache License, Version 2.0
                io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
            io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
            io.netty    netty-transport    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-transport/4.1.122.Final)    Apache License, Version 2.0
                io.netty    netty-buffer    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.122.Final)    Apache License, Version 2.0
                    io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
                io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
                io.netty    netty-resolver    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-resolver/4.1.122.Final)    Apache License, Version 2.0
                    io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
        io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
        io.netty    netty-resolver    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-resolver/4.1.122.Final)    Apache License, Version 2.0
            io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
        io.netty    netty-transport-native-unix-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-transport-native-unix-common/4.1.122.Final)    Apache License, Version 2.0
            io.netty    netty-buffer    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.122.Final)    Apache License, Version 2.0
                io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
            io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
            io.netty    netty-transport    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-transport/4.1.122.Final)    Apache License, Version 2.0
                io.netty    netty-buffer    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.122.Final)    Apache License, Version 2.0
                    io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
                io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
                io.netty    netty-resolver    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-resolver/4.1.122.Final)    Apache License, Version 2.0
                    io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
        io.netty    netty-transport    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-transport/4.1.122.Final)    Apache License, Version 2.0
            io.netty    netty-buffer    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.122.Final)    Apache License, Version 2.0
                io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
            io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
            io.netty    netty-resolver    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-resolver/4.1.122.Final)    Apache License, Version 2.0
                io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
    io.netty    netty-resolver-dns-native-macos    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-resolver-dns-native-macos/4.1.122.Final)    Apache License, Version 2.0
        io.netty    netty-resolver-dns-classes-macos    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-resolver-dns-classes-macos/4.1.122.Final)    Apache License, Version 2.0
            io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
            io.netty    netty-resolver-dns    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-resolver-dns/4.1.122.Final)    Apache License, Version 2.0
                io.netty    netty-buffer    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.122.Final)    Apache License, Version 2.0
                    io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
                io.netty    netty-codec-dns    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-codec-dns/4.1.122.Final)    Apache License, Version 2.0
                    io.netty    netty-buffer    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.122.Final)    Apache License, Version 2.0
                        io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
                    io.netty    netty-codec    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-codec/4.1.122.Final)    Apache License, Version 2.0
                        io.netty    netty-buffer    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.122.Final)    Apache License, Version 2.0
                            io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
                        io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
                        io.netty    netty-transport    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-transport/4.1.122.Final)    Apache License, Version 2.0
                            io.netty    netty-buffer    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.122.Final)    Apache License, Version 2.0
                                io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
                            io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
                            io.netty    netty-resolver    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-resolver/4.1.122.Final)    Apache License, Version 2.0
                                io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
                    io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
                    io.netty    netty-transport    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-transport/4.1.122.Final)    Apache License, Version 2.0
                        io.netty    netty-buffer    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.122.Final)    Apache License, Version 2.0
                            io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
                        io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
                        io.netty    netty-resolver    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-resolver/4.1.122.Final)    Apache License, Version 2.0
                            io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
                io.netty    netty-codec    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-codec/4.1.122.Final)    Apache License, Version 2.0
                    io.netty    netty-buffer    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.122.Final)    Apache License, Version 2.0
                        io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
                    io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
                    io.netty    netty-transport    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-transport/4.1.122.Final)    Apache License, Version 2.0
                        io.netty    netty-buffer    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.122.Final)    Apache License, Version 2.0
                            io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
                        io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
                        io.netty    netty-resolver    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-resolver/4.1.122.Final)    Apache License, Version 2.0
                            io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
                io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
                io.netty    netty-handler    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-handler/4.1.122.Final)    Apache License, Version 2.0
                    io.netty    netty-buffer    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.122.Final)    Apache License, Version 2.0
                        io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
                    io.netty    netty-codec    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-codec/4.1.122.Final)    Apache License, Version 2.0
                        io.netty    netty-buffer    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.122.Final)    Apache License, Version 2.0
                            io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
                        io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
                        io.netty    netty-transport    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-transport/4.1.122.Final)    Apache License, Version 2.0
                            io.netty    netty-buffer    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.122.Final)    Apache License, Version 2.0
                                io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
                            io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
                            io.netty    netty-resolver    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-resolver/4.1.122.Final)    Apache License, Version 2.0
                                io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
                    io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
                    io.netty    netty-resolver    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-resolver/4.1.122.Final)    Apache License, Version 2.0
                        io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
                    io.netty    netty-transport-native-unix-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-transport-native-unix-common/4.1.122.Final)    Apache License, Version 2.0
                        io.netty    netty-buffer    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.122.Final)    Apache License, Version 2.0
                            io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
                        io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
                        io.netty    netty-transport    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-transport/4.1.122.Final)    Apache License, Version 2.0
                            io.netty    netty-buffer    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.122.Final)    Apache License, Version 2.0
                                io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
                            io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
                            io.netty    netty-resolver    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-resolver/4.1.122.Final)    Apache License, Version 2.0
                                io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
                    io.netty    netty-transport    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-transport/4.1.122.Final)    Apache License, Version 2.0
                        io.netty    netty-buffer    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.122.Final)    Apache License, Version 2.0
                            io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
                        io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
                        io.netty    netty-resolver    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-resolver/4.1.122.Final)    Apache License, Version 2.0
                            io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
                io.netty    netty-resolver    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-resolver/4.1.122.Final)    Apache License, Version 2.0
                    io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
                io.netty    netty-transport    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-transport/4.1.122.Final)    Apache License, Version 2.0
                    io.netty    netty-buffer    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.122.Final)    Apache License, Version 2.0
                        io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
                    io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
                    io.netty    netty-resolver    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-resolver/4.1.122.Final)    Apache License, Version 2.0
                        io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
            io.netty    netty-transport-native-unix-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-transport-native-unix-common/4.1.122.Final)    Apache License, Version 2.0
                io.netty    netty-buffer    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.122.Final)    Apache License, Version 2.0
                    io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
                io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
                io.netty    netty-transport    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-transport/4.1.122.Final)    Apache License, Version 2.0
                    io.netty    netty-buffer    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.122.Final)    Apache License, Version 2.0
                        io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
                    io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
                    io.netty    netty-resolver    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-resolver/4.1.122.Final)    Apache License, Version 2.0
                        io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
    io.netty    netty-resolver-dns    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-resolver-dns/4.1.122.Final)    Apache License, Version 2.0
        io.netty    netty-buffer    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.122.Final)    Apache License, Version 2.0
            io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
        io.netty    netty-codec-dns    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-codec-dns/4.1.122.Final)    Apache License, Version 2.0
            io.netty    netty-buffer    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.122.Final)    Apache License, Version 2.0
                io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
            io.netty    netty-codec    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-codec/4.1.122.Final)    Apache License, Version 2.0
                io.netty    netty-buffer    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.122.Final)    Apache License, Version 2.0
                    io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
                io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
                io.netty    netty-transport    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-transport/4.1.122.Final)    Apache License, Version 2.0
                    io.netty    netty-buffer    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.122.Final)    Apache License, Version 2.0
                        io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
                    io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
                    io.netty    netty-resolver    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-resolver/4.1.122.Final)    Apache License, Version 2.0
                        io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
            io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
            io.netty    netty-transport    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-transport/4.1.122.Final)    Apache License, Version 2.0
                io.netty    netty-buffer    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.122.Final)    Apache License, Version 2.0
                    io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
                io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
                io.netty    netty-resolver    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-resolver/4.1.122.Final)    Apache License, Version 2.0
                    io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
        io.netty    netty-codec    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-codec/4.1.122.Final)    Apache License, Version 2.0
            io.netty    netty-buffer    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.122.Final)    Apache License, Version 2.0
                io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
            io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
            io.netty    netty-transport    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-transport/4.1.122.Final)    Apache License, Version 2.0
                io.netty    netty-buffer    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.122.Final)    Apache License, Version 2.0
                    io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
                io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
                io.netty    netty-resolver    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-resolver/4.1.122.Final)    Apache License, Version 2.0
                    io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
        io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
        io.netty    netty-handler    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-handler/4.1.122.Final)    Apache License, Version 2.0
            io.netty    netty-buffer    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.122.Final)    Apache License, Version 2.0
                io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
            io.netty    netty-codec    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-codec/4.1.122.Final)    Apache License, Version 2.0
                io.netty    netty-buffer    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.122.Final)    Apache License, Version 2.0
                    io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
                io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
                io.netty    netty-transport    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-transport/4.1.122.Final)    Apache License, Version 2.0
                    io.netty    netty-buffer    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.122.Final)    Apache License, Version 2.0
                        io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
                    io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
                    io.netty    netty-resolver    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-resolver/4.1.122.Final)    Apache License, Version 2.0
                        io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
            io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
            io.netty    netty-resolver    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-resolver/4.1.122.Final)    Apache License, Version 2.0
                io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
            io.netty    netty-transport-native-unix-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-transport-native-unix-common/4.1.122.Final)    Apache License, Version 2.0
                io.netty    netty-buffer    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.122.Final)    Apache License, Version 2.0
                    io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
                io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
                io.netty    netty-transport    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-transport/4.1.122.Final)    Apache License, Version 2.0
                    io.netty    netty-buffer    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.122.Final)    Apache License, Version 2.0
                        io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
                    io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
                    io.netty    netty-resolver    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-resolver/4.1.122.Final)    Apache License, Version 2.0
                        io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
            io.netty    netty-transport    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-transport/4.1.122.Final)    Apache License, Version 2.0
                io.netty    netty-buffer    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.122.Final)    Apache License, Version 2.0
                    io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
                io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
                io.netty    netty-resolver    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-resolver/4.1.122.Final)    Apache License, Version 2.0
                    io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
        io.netty    netty-resolver    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-resolver/4.1.122.Final)    Apache License, Version 2.0
            io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
        io.netty    netty-transport    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-transport/4.1.122.Final)    Apache License, Version 2.0
            io.netty    netty-buffer    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.122.Final)    Apache License, Version 2.0
                io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
            io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
            io.netty    netty-resolver    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-resolver/4.1.122.Final)    Apache License, Version 2.0
                io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
    io.netty    netty-transport-native-epoll    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-transport-native-epoll/4.1.122.Final)    Apache License, Version 2.0
        io.netty    netty-buffer    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.122.Final)    Apache License, Version 2.0
            io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
        io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
        io.netty    netty-transport-classes-epoll    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-transport-classes-epoll/4.1.122.Final)    Apache License, Version 2.0
            io.netty    netty-buffer    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.122.Final)    Apache License, Version 2.0
                io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
            io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
            io.netty    netty-transport-native-unix-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-transport-native-unix-common/4.1.122.Final)    Apache License, Version 2.0
                io.netty    netty-buffer    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.122.Final)    Apache License, Version 2.0
                    io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
                io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
                io.netty    netty-transport    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-transport/4.1.122.Final)    Apache License, Version 2.0
                    io.netty    netty-buffer    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.122.Final)    Apache License, Version 2.0
                        io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
                    io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
                    io.netty    netty-resolver    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-resolver/4.1.122.Final)    Apache License, Version 2.0
                        io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
            io.netty    netty-transport    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-transport/4.1.122.Final)    Apache License, Version 2.0
                io.netty    netty-buffer    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.122.Final)    Apache License, Version 2.0
                    io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
                io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
                io.netty    netty-resolver    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-resolver/4.1.122.Final)    Apache License, Version 2.0
                    io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
        io.netty    netty-transport-native-unix-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-transport-native-unix-common/4.1.122.Final)    Apache License, Version 2.0
            io.netty    netty-buffer    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.122.Final)    Apache License, Version 2.0
                io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
            io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
            io.netty    netty-transport    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-transport/4.1.122.Final)    Apache License, Version 2.0
                io.netty    netty-buffer    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.122.Final)    Apache License, Version 2.0
                    io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
                io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
                io.netty    netty-resolver    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-resolver/4.1.122.Final)    Apache License, Version 2.0
                    io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
        io.netty    netty-transport    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-transport/4.1.122.Final)    Apache License, Version 2.0
            io.netty    netty-buffer    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.122.Final)    Apache License, Version 2.0
                io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
            io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
            io.netty    netty-resolver    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-resolver/4.1.122.Final)    Apache License, Version 2.0
                io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
    io.projectreactor    reactor-core    [3.5.20](https://mvnrepository.com/artifact/io.projectreactor/reactor-core/3.5.20)    Apache License, Version 2.0
        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
io.r2dbc    r2dbc-pool    [1.0.2.RELEASE](https://mvnrepository.com/artifact/io.r2dbc/r2dbc-pool/1.0.2.RELEASE)    Apache License 2.0
    io.projectreactor.addons    reactor-pool    [1.0.8](https://mvnrepository.com/artifact/io.projectreactor.addons/reactor-pool/1.0.8)    The Apache Software License, Version 2.0
        io.projectreactor    reactor-core    [3.5.20](https://mvnrepository.com/artifact/io.projectreactor/reactor-core/3.5.20)    Apache License, Version 2.0
            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
    io.projectreactor    reactor-core    [3.5.20](https://mvnrepository.com/artifact/io.projectreactor/reactor-core/3.5.20)    Apache License, Version 2.0
        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
    io.r2dbc    r2dbc-spi    [1.0.0.RELEASE](https://mvnrepository.com/artifact/io.r2dbc/r2dbc-spi/1.0.0.RELEASE)    Apache License 2.0
        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
io.r2dbc    r2dbc-spi    [1.0.0.RELEASE](https://mvnrepository.com/artifact/io.r2dbc/r2dbc-spi/1.0.0.RELEASE)    Apache License 2.0
    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
org.postgresql    r2dbc-postgresql    [1.1.0.RELEASE](https://mvnrepository.com/artifact/org.postgresql/r2dbc-postgresql/1.1.0.RELEASE)    Apache License 2.0
    com.ongres.scram    scram-client    [3.2](https://mvnrepository.com/artifact/com.ongres.scram/scram-client/3.2)    BSD 2-Clause "Simplified" License
        com.ongres.scram    scram-common    [3.2](https://mvnrepository.com/artifact/com.ongres.scram/scram-common/3.2)    BSD 2-Clause "Simplified" License
            com.ongres.stringprep    saslprep    [2.2](https://mvnrepository.com/artifact/com.ongres.stringprep/saslprep/2.2)    BSD 2-Clause "Simplified" License
            com.ongres.stringprep    stringprep    [2.2](https://mvnrepository.com/artifact/com.ongres.stringprep/stringprep/2.2)    BSD 2-Clause "Simplified" License
        com.ongres.stringprep    saslprep    [2.2](https://mvnrepository.com/artifact/com.ongres.stringprep/saslprep/2.2)    BSD 2-Clause "Simplified" License
        com.ongres.stringprep    stringprep    [2.2](https://mvnrepository.com/artifact/com.ongres.stringprep/stringprep/2.2)    BSD 2-Clause "Simplified" License
    com.ongres.scram    scram-common    [3.2](https://mvnrepository.com/artifact/com.ongres.scram/scram-common/3.2)    BSD 2-Clause "Simplified" License
        com.ongres.stringprep    saslprep    [2.2](https://mvnrepository.com/artifact/com.ongres.stringprep/saslprep/2.2)    BSD 2-Clause "Simplified" License
        com.ongres.stringprep    stringprep    [2.2](https://mvnrepository.com/artifact/com.ongres.stringprep/stringprep/2.2)    BSD 2-Clause "Simplified" License
    io.projectreactor.netty    reactor-netty-core    [1.1.31](https://mvnrepository.com/artifact/io.projectreactor.netty/reactor-netty-core/1.1.31)    The Apache Software License, Version 2.0
        io.netty    netty-handler-proxy    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-handler-proxy/4.1.122.Final)    Apache License, Version 2.0
            io.netty    netty-buffer    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.122.Final)    Apache License, Version 2.0
                io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
            io.netty    netty-codec-http    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-codec-http/4.1.122.Final)    Apache License, Version 2.0
                io.netty    netty-buffer    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.122.Final)    Apache License, Version 2.0
                    io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
                io.netty    netty-codec    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-codec/4.1.122.Final)    Apache License, Version 2.0
                    io.netty    netty-buffer    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.122.Final)    Apache License, Version 2.0
                        io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
                    io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
                    io.netty    netty-transport    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-transport/4.1.122.Final)    Apache License, Version 2.0
                        io.netty    netty-buffer    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.122.Final)    Apache License, Version 2.0
                            io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
                        io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
                        io.netty    netty-resolver    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-resolver/4.1.122.Final)    Apache License, Version 2.0
                            io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
                io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
                io.netty    netty-handler    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-handler/4.1.122.Final)    Apache License, Version 2.0
                    io.netty    netty-buffer    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.122.Final)    Apache License, Version 2.0
                        io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
                    io.netty    netty-codec    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-codec/4.1.122.Final)    Apache License, Version 2.0
                        io.netty    netty-buffer    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.122.Final)    Apache License, Version 2.0
                            io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
                        io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
                        io.netty    netty-transport    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-transport/4.1.122.Final)    Apache License, Version 2.0
                            io.netty    netty-buffer    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.122.Final)    Apache License, Version 2.0
                                io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
                            io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
                            io.netty    netty-resolver    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-resolver/4.1.122.Final)    Apache License, Version 2.0
                                io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
                    io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
                    io.netty    netty-resolver    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-resolver/4.1.122.Final)    Apache License, Version 2.0
                        io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
                    io.netty    netty-transport-native-unix-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-transport-native-unix-common/4.1.122.Final)    Apache License, Version 2.0
                        io.netty    netty-buffer    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.122.Final)    Apache License, Version 2.0
                            io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
                        io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
                        io.netty    netty-transport    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-transport/4.1.122.Final)    Apache License, Version 2.0
                            io.netty    netty-buffer    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.122.Final)    Apache License, Version 2.0
                                io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
                            io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
                            io.netty    netty-resolver    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-resolver/4.1.122.Final)    Apache License, Version 2.0
                                io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
                    io.netty    netty-transport    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-transport/4.1.122.Final)    Apache License, Version 2.0
                        io.netty    netty-buffer    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.122.Final)    Apache License, Version 2.0
                            io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
                        io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
                        io.netty    netty-resolver    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-resolver/4.1.122.Final)    Apache License, Version 2.0
                            io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
                io.netty    netty-transport    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-transport/4.1.122.Final)    Apache License, Version 2.0
                    io.netty    netty-buffer    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.122.Final)    Apache License, Version 2.0
                        io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
                    io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
                    io.netty    netty-resolver    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-resolver/4.1.122.Final)    Apache License, Version 2.0
                        io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
            io.netty    netty-codec-socks    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-codec-socks/4.1.122.Final)    Apache License, Version 2.0
                io.netty    netty-buffer    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.122.Final)    Apache License, Version 2.0
                    io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
                io.netty    netty-codec    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-codec/4.1.122.Final)    Apache License, Version 2.0
                    io.netty    netty-buffer    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.122.Final)    Apache License, Version 2.0
                        io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
                    io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
                    io.netty    netty-transport    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-transport/4.1.122.Final)    Apache License, Version 2.0
                        io.netty    netty-buffer    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.122.Final)    Apache License, Version 2.0
                            io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
                        io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
                        io.netty    netty-resolver    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-resolver/4.1.122.Final)    Apache License, Version 2.0
                            io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
                io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
                io.netty    netty-transport    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-transport/4.1.122.Final)    Apache License, Version 2.0
                    io.netty    netty-buffer    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.122.Final)    Apache License, Version 2.0
                        io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
                    io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
                    io.netty    netty-resolver    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-resolver/4.1.122.Final)    Apache License, Version 2.0
                        io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
            io.netty    netty-codec    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-codec/4.1.122.Final)    Apache License, Version 2.0
                io.netty    netty-buffer    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.122.Final)    Apache License, Version 2.0
                    io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
                io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
                io.netty    netty-transport    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-transport/4.1.122.Final)    Apache License, Version 2.0
                    io.netty    netty-buffer    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.122.Final)    Apache License, Version 2.0
                        io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
                    io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
                    io.netty    netty-resolver    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-resolver/4.1.122.Final)    Apache License, Version 2.0
                        io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
            io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
            io.netty    netty-transport    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-transport/4.1.122.Final)    Apache License, Version 2.0
                io.netty    netty-buffer    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.122.Final)    Apache License, Version 2.0
                    io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
                io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
                io.netty    netty-resolver    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-resolver/4.1.122.Final)    Apache License, Version 2.0
                    io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
        io.netty    netty-handler    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-handler/4.1.122.Final)    Apache License, Version 2.0
            io.netty    netty-buffer    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.122.Final)    Apache License, Version 2.0
                io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
            io.netty    netty-codec    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-codec/4.1.122.Final)    Apache License, Version 2.0
                io.netty    netty-buffer    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.122.Final)    Apache License, Version 2.0
                    io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
                io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
                io.netty    netty-transport    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-transport/4.1.122.Final)    Apache License, Version 2.0
                    io.netty    netty-buffer    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.122.Final)    Apache License, Version 2.0
                        io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
                    io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
                    io.netty    netty-resolver    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-resolver/4.1.122.Final)    Apache License, Version 2.0
                        io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
            io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
            io.netty    netty-resolver    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-resolver/4.1.122.Final)    Apache License, Version 2.0
                io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
            io.netty    netty-transport-native-unix-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-transport-native-unix-common/4.1.122.Final)    Apache License, Version 2.0
                io.netty    netty-buffer    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.122.Final)    Apache License, Version 2.0
                    io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
                io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
                io.netty    netty-transport    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-transport/4.1.122.Final)    Apache License, Version 2.0
                    io.netty    netty-buffer    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.122.Final)    Apache License, Version 2.0
                        io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
                    io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
                    io.netty    netty-resolver    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-resolver/4.1.122.Final)    Apache License, Version 2.0
                        io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
            io.netty    netty-transport    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-transport/4.1.122.Final)    Apache License, Version 2.0
                io.netty    netty-buffer    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.122.Final)    Apache License, Version 2.0
                    io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
                io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
                io.netty    netty-resolver    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-resolver/4.1.122.Final)    Apache License, Version 2.0
                    io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
        io.netty    netty-resolver-dns-native-macos    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-resolver-dns-native-macos/4.1.122.Final)    Apache License, Version 2.0
            io.netty    netty-resolver-dns-classes-macos    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-resolver-dns-classes-macos/4.1.122.Final)    Apache License, Version 2.0
                io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
                io.netty    netty-resolver-dns    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-resolver-dns/4.1.122.Final)    Apache License, Version 2.0
                    io.netty    netty-buffer    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.122.Final)    Apache License, Version 2.0
                        io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
                    io.netty    netty-codec-dns    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-codec-dns/4.1.122.Final)    Apache License, Version 2.0
                        io.netty    netty-buffer    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.122.Final)    Apache License, Version 2.0
                            io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
                        io.netty    netty-codec    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-codec/4.1.122.Final)    Apache License, Version 2.0
                            io.netty    netty-buffer    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.122.Final)    Apache License, Version 2.0
                                io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
                            io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
                            io.netty    netty-transport    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-transport/4.1.122.Final)    Apache License, Version 2.0
                                io.netty    netty-buffer    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.122.Final)    Apache License, Version 2.0
                                    io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
                                io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
                                io.netty    netty-resolver    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-resolver/4.1.122.Final)    Apache License, Version 2.0
                                    io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
                        io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
                        io.netty    netty-transport    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-transport/4.1.122.Final)    Apache License, Version 2.0
                            io.netty    netty-buffer    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.122.Final)    Apache License, Version 2.0
                                io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
                            io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
                            io.netty    netty-resolver    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-resolver/4.1.122.Final)    Apache License, Version 2.0
                                io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
                    io.netty    netty-codec    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-codec/4.1.122.Final)    Apache License, Version 2.0
                        io.netty    netty-buffer    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.122.Final)    Apache License, Version 2.0
                            io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
                        io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
                        io.netty    netty-transport    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-transport/4.1.122.Final)    Apache License, Version 2.0
                            io.netty    netty-buffer    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.122.Final)    Apache License, Version 2.0
                                io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
                            io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
                            io.netty    netty-resolver    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-resolver/4.1.122.Final)    Apache License, Version 2.0
                                io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
                    io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
                    io.netty    netty-handler    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-handler/4.1.122.Final)    Apache License, Version 2.0
                        io.netty    netty-buffer    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.122.Final)    Apache License, Version 2.0
                            io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
                        io.netty    netty-codec    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-codec/4.1.122.Final)    Apache License, Version 2.0
                            io.netty    netty-buffer    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.122.Final)    Apache License, Version 2.0
                                io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
                            io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
                            io.netty    netty-transport    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-transport/4.1.122.Final)    Apache License, Version 2.0
                                io.netty    netty-buffer    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.122.Final)    Apache License, Version 2.0
                                    io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
                                io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
                                io.netty    netty-resolver    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-resolver/4.1.122.Final)    Apache License, Version 2.0
                                    io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
                        io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
                        io.netty    netty-resolver    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-resolver/4.1.122.Final)    Apache License, Version 2.0
                            io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
                        io.netty    netty-transport-native-unix-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-transport-native-unix-common/4.1.122.Final)    Apache License, Version 2.0
                            io.netty    netty-buffer    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.122.Final)    Apache License, Version 2.0
                                io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
                            io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
                            io.netty    netty-transport    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-transport/4.1.122.Final)    Apache License, Version 2.0
                                io.netty    netty-buffer    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.122.Final)    Apache License, Version 2.0
                                    io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
                                io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
                                io.netty    netty-resolver    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-resolver/4.1.122.Final)    Apache License, Version 2.0
                                    io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
                        io.netty    netty-transport    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-transport/4.1.122.Final)    Apache License, Version 2.0
                            io.netty    netty-buffer    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.122.Final)    Apache License, Version 2.0
                                io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
                            io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
                            io.netty    netty-resolver    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-resolver/4.1.122.Final)    Apache License, Version 2.0
                                io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
                    io.netty    netty-resolver    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-resolver/4.1.122.Final)    Apache License, Version 2.0
                        io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
                    io.netty    netty-transport    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-transport/4.1.122.Final)    Apache License, Version 2.0
                        io.netty    netty-buffer    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.122.Final)    Apache License, Version 2.0
                            io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
                        io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
                        io.netty    netty-resolver    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-resolver/4.1.122.Final)    Apache License, Version 2.0
                            io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
                io.netty    netty-transport-native-unix-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-transport-native-unix-common/4.1.122.Final)    Apache License, Version 2.0
                    io.netty    netty-buffer    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.122.Final)    Apache License, Version 2.0
                        io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
                    io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
                    io.netty    netty-transport    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-transport/4.1.122.Final)    Apache License, Version 2.0
                        io.netty    netty-buffer    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.122.Final)    Apache License, Version 2.0
                            io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
                        io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
                        io.netty    netty-resolver    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-resolver/4.1.122.Final)    Apache License, Version 2.0
                            io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
        io.netty    netty-resolver-dns    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-resolver-dns/4.1.122.Final)    Apache License, Version 2.0
            io.netty    netty-buffer    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.122.Final)    Apache License, Version 2.0
                io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
            io.netty    netty-codec-dns    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-codec-dns/4.1.122.Final)    Apache License, Version 2.0
                io.netty    netty-buffer    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.122.Final)    Apache License, Version 2.0
                    io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
                io.netty    netty-codec    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-codec/4.1.122.Final)    Apache License, Version 2.0
                    io.netty    netty-buffer    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.122.Final)    Apache License, Version 2.0
                        io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
                    io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
                    io.netty    netty-transport    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-transport/4.1.122.Final)    Apache License, Version 2.0
                        io.netty    netty-buffer    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.122.Final)    Apache License, Version 2.0
                            io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
                        io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
                        io.netty    netty-resolver    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-resolver/4.1.122.Final)    Apache License, Version 2.0
                            io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
                io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
                io.netty    netty-transport    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-transport/4.1.122.Final)    Apache License, Version 2.0
                    io.netty    netty-buffer    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.122.Final)    Apache License, Version 2.0
                        io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
                    io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
                    io.netty    netty-resolver    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-resolver/4.1.122.Final)    Apache License, Version 2.0
                        io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
            io.netty    netty-codec    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-codec/4.1.122.Final)    Apache License, Version 2.0
                io.netty    netty-buffer    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.122.Final)    Apache License, Version 2.0
                    io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
                io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
                io.netty    netty-transport    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-transport/4.1.122.Final)    Apache License, Version 2.0
                    io.netty    netty-buffer    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.122.Final)    Apache License, Version 2.0
                        io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
                    io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
                    io.netty    netty-resolver    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-resolver/4.1.122.Final)    Apache License, Version 2.0
                        io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
            io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
            io.netty    netty-handler    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-handler/4.1.122.Final)    Apache License, Version 2.0
                io.netty    netty-buffer    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.122.Final)    Apache License, Version 2.0
                    io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
                io.netty    netty-codec    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-codec/4.1.122.Final)    Apache License, Version 2.0
                    io.netty    netty-buffer    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.122.Final)    Apache License, Version 2.0
                        io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
                    io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
                    io.netty    netty-transport    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-transport/4.1.122.Final)    Apache License, Version 2.0
                        io.netty    netty-buffer    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.122.Final)    Apache License, Version 2.0
                            io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
                        io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
                        io.netty    netty-resolver    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-resolver/4.1.122.Final)    Apache License, Version 2.0
                            io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
                io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
                io.netty    netty-resolver    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-resolver/4.1.122.Final)    Apache License, Version 2.0
                    io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
                io.netty    netty-transport-native-unix-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-transport-native-unix-common/4.1.122.Final)    Apache License, Version 2.0
                    io.netty    netty-buffer    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.122.Final)    Apache License, Version 2.0
                        io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
                    io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
                    io.netty    netty-transport    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-transport/4.1.122.Final)    Apache License, Version 2.0
                        io.netty    netty-buffer    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.122.Final)    Apache License, Version 2.0
                            io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
                        io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
                        io.netty    netty-resolver    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-resolver/4.1.122.Final)    Apache License, Version 2.0
                            io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
                io.netty    netty-transport    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-transport/4.1.122.Final)    Apache License, Version 2.0
                    io.netty    netty-buffer    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.122.Final)    Apache License, Version 2.0
                        io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
                    io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
                    io.netty    netty-resolver    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-resolver/4.1.122.Final)    Apache License, Version 2.0
                        io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
            io.netty    netty-resolver    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-resolver/4.1.122.Final)    Apache License, Version 2.0
                io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
            io.netty    netty-transport    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-transport/4.1.122.Final)    Apache License, Version 2.0
                io.netty    netty-buffer    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.122.Final)    Apache License, Version 2.0
                    io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
                io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
                io.netty    netty-resolver    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-resolver/4.1.122.Final)    Apache License, Version 2.0
                    io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
        io.netty    netty-transport-native-epoll    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-transport-native-epoll/4.1.122.Final)    Apache License, Version 2.0
            io.netty    netty-buffer    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.122.Final)    Apache License, Version 2.0
                io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
            io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
            io.netty    netty-transport-classes-epoll    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-transport-classes-epoll/4.1.122.Final)    Apache License, Version 2.0
                io.netty    netty-buffer    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.122.Final)    Apache License, Version 2.0
                    io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
                io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
                io.netty    netty-transport-native-unix-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-transport-native-unix-common/4.1.122.Final)    Apache License, Version 2.0
                    io.netty    netty-buffer    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.122.Final)    Apache License, Version 2.0
                        io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
                    io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
                    io.netty    netty-transport    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-transport/4.1.122.Final)    Apache License, Version 2.0
                        io.netty    netty-buffer    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.122.Final)    Apache License, Version 2.0
                            io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
                        io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
                        io.netty    netty-resolver    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-resolver/4.1.122.Final)    Apache License, Version 2.0
                            io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
                io.netty    netty-transport    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-transport/4.1.122.Final)    Apache License, Version 2.0
                    io.netty    netty-buffer    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.122.Final)    Apache License, Version 2.0
                        io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
                    io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
                    io.netty    netty-resolver    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-resolver/4.1.122.Final)    Apache License, Version 2.0
                        io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
            io.netty    netty-transport-native-unix-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-transport-native-unix-common/4.1.122.Final)    Apache License, Version 2.0
                io.netty    netty-buffer    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.122.Final)    Apache License, Version 2.0
                    io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
                io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
                io.netty    netty-transport    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-transport/4.1.122.Final)    Apache License, Version 2.0
                    io.netty    netty-buffer    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.122.Final)    Apache License, Version 2.0
                        io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
                    io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
                    io.netty    netty-resolver    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-resolver/4.1.122.Final)    Apache License, Version 2.0
                        io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
            io.netty    netty-transport    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-transport/4.1.122.Final)    Apache License, Version 2.0
                io.netty    netty-buffer    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.122.Final)    Apache License, Version 2.0
                    io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
                io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
                io.netty    netty-resolver    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-resolver/4.1.122.Final)    Apache License, Version 2.0
                    io.netty    netty-common    [4.1.122.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.122.Final)    Apache License, Version 2.0
        io.projectreactor    reactor-core    [3.5.20](https://mvnrepository.com/artifact/io.projectreactor/reactor-core/3.5.20)    Apache License, Version 2.0
            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
    io.projectreactor    reactor-core    [3.5.20](https://mvnrepository.com/artifact/io.projectreactor/reactor-core/3.5.20)    Apache License, Version 2.0
        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
    io.r2dbc    r2dbc-spi    [1.0.0.RELEASE](https://mvnrepository.com/artifact/io.r2dbc/r2dbc-spi/1.0.0.RELEASE)    Apache License 2.0
        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
```

## Code Examples

### Example 1: Dependencies

```xml
<properties>
  <scala.binary.version>2.13</scala.binary.version>
</properties>
<dependencies&gt
  <dependency>
    <groupId>com.lightbend.akka</groupId>
    <artifactId>akka-persistence-r2dbc_${scala.binary.version}</artifactId>
    <version>1.3.12</version>
  </dependency&gt
</dependencies>
```

### Example 2: Dependencies

```scala
libraryDependencies += "com.lightbend.akka" %% "akka-persistence-r2dbc" % "1.3.12"
```

### Example 3: Dependencies

```gradle
def versions = [
  ScalaBinary: "2.13"
]
dependencies {
  implementation "com.lightbend.akka:akka-persistence-r2dbc_${versions.ScalaBinary}:1.3.12"
}
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/docs/akka-dependencies/current/support-terminology.html
- https://doc.akka.io/libraries/akka-persistence-r2dbc/current
- https://doc.akka.io/libraries/akka-persistence-r2dbc/current/contributing.html
- https://doc.akka.io/libraries/akka-persistence-r2dbc/current/getting-started.html
- https://doc.akka.io/libraries/akka-persistence-r2dbc/current/index.html

---
*Source: [https://doc.akka.io/libraries/akka-persistence-r2dbc/current/overview.html](https://doc.akka.io/libraries/akka-persistence-r2dbc/current/overview.html)*