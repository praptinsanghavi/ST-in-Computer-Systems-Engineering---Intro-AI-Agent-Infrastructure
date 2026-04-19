---
description: Alpakka is a Reactive Enterprise Integration library for Java and Scala,
  based on Reactive Streams and Akka.
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:00:31Z'
section: docs
site: akka-io
source_url: https://doc.akka.io/libraries/alpakka/current/geode.html
title: Apache Geode • Alpakka Documentation
---

# Apache Geode • Alpakka Documentation

> **Summary:** Alpakka is a Reactive Enterprise Integration library for Java and Scala, based on Reactive Streams and Akka.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Apache Geode

[Apache Geode](https://geode.apache.org) is a distributed datagrid (formerly called [“Gemfire” which used to be Pivotal’s packaging of Geode and now is VMware Tanzu](https://tanzu.vmware.com/gemfire)).

Alpakka Geode provides flows and sinks to put elements into Geode, and a source to retrieve elements from it. It stores key\-value\-pairs. Keys and values must be serialized with Geode’s support for it.

| Project Info: Alpakka Geode | |
| --- | --- |
| Artifact | com.lightbend.akka akka\-stream\-alpakka\-geode 10\.0\.2 [Snapshots are available](other-docs/snapshots.html) |
| JDK versions | Eclipse Temurin JDK 11Eclipse Temurin JDK 17 |
| Scala versions | 2\.13\.17 |
| JPMS module name | akka.stream.alpakka.geode |
| License | [BUSL\-1\.1](https://raw.githubusercontent.com/akka/alpakka/v10.0.2/LICENSE) |
| Readiness level | [Community\-driven](https://doc.akka.io/docs/akka-dependencies/current/support-terminology.html#community-driven) Since 0\.10, 2017\-06\-30 |
| Home page | <https://doc.akka.io/libraries/alpakka/current> |
| API documentation | [API (Scaladoc)](https://doc.akka.io/api/alpakka/10.0.2/akka/stream/alpakka/geode/index.html) |
| Forums | [Akka Discuss](https://discuss.akka.io) |
| Release notes | [GitHub releases](https://github.com/akka/alpakka/releases) |
| Issues | [Github issues](https://github.com/akka/alpakka/labels/p%3Ageode) |
| Sources | <https://github.com/akka/alpakka> |

## Artifacts

Note
The Akka dependencies are available from Akka’s secure library repository. To access them you need to use a secure, tokenized URL as specified at <https://account.akka.io/token>.

Additionally, add the dependencies as below.

sbt
```
val AkkaVersion = "2.10.11"
libraryDependencies ++= Seq(
  "com.lightbend.akka" %% "akka-stream-alpakka-geode" % "10.0.2",
  "com.typesafe.akka" %% "akka-stream" % AkkaVersion
)
```
Maven
```
<properties>
  <akka.version>2.10.11</akka.version>
  <scala.binary.version>2.13</scala.binary.version>
</properties>
<dependencies&gt
  <dependency>
    <groupId>com.lightbend.akka</groupId>
    <artifactId>akka-stream-alpakka-geode_${scala.binary.version}</artifactId>
    <version>10.0.2</version>
  </dependency&gt
  <dependency>
    <groupId>com.typesafe.akka</groupId>
    <artifactId>akka-stream_${scala.binary.version}</artifactId>
    <version>${akka.version}</version>
  </dependency&gt
</dependencies>
```
Gradle
```
def versions = [
  AkkaVersion: "2.10.11",
  ScalaBinary: "2.13"
]
dependencies {
  implementation "com.lightbend.akka:akka-stream-alpakka-geode_${versions.ScalaBinary}:10.0.2"
  implementation "com.typesafe.akka:akka-stream_${versions.ScalaBinary}:${versions.AkkaVersion}"
}
```

The table below shows direct dependencies of this module and the second tab shows all libraries it depends on transitively.

Direct dependencies

| Organization | Artifact | Version |
| --- | --- | --- |
| com.chuusai | shapeless\_2\.13 | [2\.3\.12](https://mvnrepository.com/artifact/com.chuusai/shapeless_2.13/2.3.12) |
| com.fasterxml.jackson.core | jackson\-core | [2\.18\.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4) |
| com.fasterxml.jackson.core | jackson\-databind | [2\.18\.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-databind/2.18.4) |
| com.typesafe.akka | akka\-stream\_2\.13 | [2\.10\.11](https://mvnrepository.com/artifact/com.typesafe.akka/akka-stream_2.13/2.10.11) |
| org.apache.geode | geode\-core | [1\.15\.1](https://mvnrepository.com/artifact/org.apache.geode/geode-core/1.15.1) |
| org.apache.geode | geode\-cq | [1\.15\.1](https://mvnrepository.com/artifact/org.apache.geode/geode-cq/1.15.1) |
| org.scala\-lang | scala\-library | [2\.13\.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17) |

Dependency tree
```

com.chuusai    shapeless_2.13    [2.3.12](https://mvnrepository.com/artifact/com.chuusai/shapeless_2.13/2.3.12)    Apache 2
    org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
com.fasterxml.jackson.core    jackson-databind    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-databind/2.18.4)    The Apache Software License, Version 2.0
    com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
    com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
com.typesafe.akka    akka-stream_2.13    [2.10.11](https://mvnrepository.com/artifact/com.typesafe.akka/akka-stream_2.13/2.10.11)    BUSL-1.1
    com.typesafe.akka    akka-actor_2.13    [2.10.11](https://mvnrepository.com/artifact/com.typesafe.akka/akka-actor_2.13/2.10.11)    BUSL-1.1
        com.typesafe    config    [1.4.5](https://mvnrepository.com/artifact/com.typesafe/config/1.4.5)    Apache-2.0
        org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
    com.typesafe.akka    akka-protobuf-v3_2.13    [2.10.11](https://mvnrepository.com/artifact/com.typesafe.akka/akka-protobuf-v3_2.13/2.10.11)    BUSL-1.1
    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
    org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
org.apache.geode    geode-core    [1.15.1](https://mvnrepository.com/artifact/org.apache.geode/geode-core/1.15.1)    The Apache Software License, Version 2.0
    antlr    antlr    [2.7.7](https://mvnrepository.com/artifact/antlr/antlr/2.7.7)    BSD License
    com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
    com.fasterxml.jackson.core    jackson-databind    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-databind/2.18.4)    The Apache Software License, Version 2.0
        com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
        com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
    com.healthmarketscience.rmiio    rmiio    [2.1.2](https://mvnrepository.com/artifact/com.healthmarketscience.rmiio/rmiio/2.1.2)    Apache License, Version 2.0
        commons-logging    commons-logging    [1.2](https://mvnrepository.com/artifact/commons-logging/commons-logging/1.2)    The Apache Software License, Version 2.0
    com.sun.istack    istack-commons-runtime    [4.0.1](https://mvnrepository.com/artifact/com.sun.istack/istack-commons-runtime/4.0.1)    Eclipse Distribution License - v 1.0
    com.sun.xml.bind    jaxb-impl    [2.3.2](https://mvnrepository.com/artifact/com.sun.xml.bind/jaxb-impl/2.3.2)    Eclipse Distribution License - v 1.0
    commons-io    commons-io    [2.11.0](https://mvnrepository.com/artifact/commons-io/commons-io/2.11.0)    Apache License, Version 2.0
    commons-validator    commons-validator    [1.7](https://mvnrepository.com/artifact/commons-validator/commons-validator/1.7)    Apache License, Version 2.0
        commons-beanutils    commons-beanutils    [1.9.4](https://mvnrepository.com/artifact/commons-beanutils/commons-beanutils/1.9.4)    Apache License, Version 2.0
            commons-collections    commons-collections    [3.2.2](https://mvnrepository.com/artifact/commons-collections/commons-collections/3.2.2)    Apache License, Version 2.0
            commons-logging    commons-logging    [1.2](https://mvnrepository.com/artifact/commons-logging/commons-logging/1.2)    The Apache Software License, Version 2.0
        commons-collections    commons-collections    [3.2.2](https://mvnrepository.com/artifact/commons-collections/commons-collections/3.2.2)    Apache License, Version 2.0
        commons-digester    commons-digester    [2.1](https://mvnrepository.com/artifact/commons-digester/commons-digester/2.1)    The Apache Software License, Version 2.0
        commons-logging    commons-logging    [1.2](https://mvnrepository.com/artifact/commons-logging/commons-logging/1.2)    The Apache Software License, Version 2.0
    io.github.classgraph    classgraph    [4.8.146](https://mvnrepository.com/artifact/io.github.classgraph/classgraph/4.8.146)    The MIT License (MIT)
    io.micrometer    micrometer-core    [1.9.0](https://mvnrepository.com/artifact/io.micrometer/micrometer-core/1.9.0)    The Apache Software License, Version 2.0
        org.hdrhistogram    HdrHistogram    [2.1.12](https://mvnrepository.com/artifact/org.hdrhistogram/HdrHistogram/2.1.12)    Public Domain, per Creative Commons CC0
        org.latencyutils    LatencyUtils    [2.0.3](https://mvnrepository.com/artifact/org.latencyutils/LatencyUtils/2.0.3)    Public Domain, per Creative Commons CC0
    it.unimi.dsi    fastutil    [8.5.8](https://mvnrepository.com/artifact/it.unimi.dsi/fastutil/8.5.8)    Apache License, Version 2.0
    javax.resource    javax.resource-api    [1.7.1](https://mvnrepository.com/artifact/javax.resource/javax.resource-api/1.7.1)    CDDL + GPLv2 with classpath exception
        javax.transaction    javax.transaction-api    [1.3](https://mvnrepository.com/artifact/javax.transaction/javax.transaction-api/1.3)    CDDL + GPLv2 with classpath exception
    javax.xml.bind    jaxb-api    [2.3.1](https://mvnrepository.com/artifact/javax.xml.bind/jaxb-api/2.3.1)    CDDL 1.1
        javax.activation    javax.activation-api    [1.2.0](https://mvnrepository.com/artifact/javax.activation/javax.activation-api/1.2.0)    CDDL/GPLv2+CE
    net.java.dev.jna    jna-platform    [5.11.0](https://mvnrepository.com/artifact/net.java.dev.jna/jna-platform/5.11.0)    LGPL-2.1-or-later
        net.java.dev.jna    jna    [5.11.0](https://mvnrepository.com/artifact/net.java.dev.jna/jna/5.11.0)    LGPL-2.1-or-later
    net.java.dev.jna    jna    [5.11.0](https://mvnrepository.com/artifact/net.java.dev.jna/jna/5.11.0)    LGPL-2.1-or-later
    net.sf.jopt-simple    jopt-simple    [5.0.4](https://mvnrepository.com/artifact/net.sf.jopt-simple/jopt-simple/5.0.4)    The MIT License
    org.apache.commons    commons-lang3    [3.12.0](https://mvnrepository.com/artifact/org.apache.commons/commons-lang3/3.12.0)    Apache License, Version 2.0
    org.apache.geode    geode-common    [1.15.1](https://mvnrepository.com/artifact/org.apache.geode/geode-common/1.15.1)    The Apache Software License, Version 2.0
        com.fasterxml.jackson.core    jackson-databind    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-databind/2.18.4)    The Apache Software License, Version 2.0
            com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
            com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
        com.fasterxml.jackson.datatype    jackson-datatype-joda    [2.13.2](https://mvnrepository.com/artifact/com.fasterxml.jackson.datatype/jackson-datatype-joda/2.13.2)    The Apache Software License, Version 2.0
            com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
            com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
            com.fasterxml.jackson.core    jackson-databind    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-databind/2.18.4)    The Apache Software License, Version 2.0
                com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
                com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
            joda-time    joda-time    [2.10.8](https://mvnrepository.com/artifact/joda-time/joda-time/2.10.8)    Apache License, Version 2.0
        com.fasterxml.jackson.datatype    jackson-datatype-jsr310    [2.13.2](https://mvnrepository.com/artifact/com.fasterxml.jackson.datatype/jackson-datatype-jsr310/2.13.2)    The Apache Software License, Version 2.0
            com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
            com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
            com.fasterxml.jackson.core    jackson-databind    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-databind/2.18.4)    The Apache Software License, Version 2.0
                com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
                com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
    org.apache.geode    geode-deployment-legacy    [1.15.1](https://mvnrepository.com/artifact/org.apache.geode/geode-deployment-legacy/1.15.1)    The Apache Software License, Version 2.0
    org.apache.geode    geode-logging    [1.15.1](https://mvnrepository.com/artifact/org.apache.geode/geode-logging/1.15.1)    The Apache Software License, Version 2.0
        org.apache.geode    geode-common    [1.15.1](https://mvnrepository.com/artifact/org.apache.geode/geode-common/1.15.1)    The Apache Software License, Version 2.0
            com.fasterxml.jackson.core    jackson-databind    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-databind/2.18.4)    The Apache Software License, Version 2.0
                com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
                com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
            com.fasterxml.jackson.datatype    jackson-datatype-joda    [2.13.2](https://mvnrepository.com/artifact/com.fasterxml.jackson.datatype/jackson-datatype-joda/2.13.2)    The Apache Software License, Version 2.0
                com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
                com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
                com.fasterxml.jackson.core    jackson-databind    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-databind/2.18.4)    The Apache Software License, Version 2.0
                    com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
                    com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
                joda-time    joda-time    [2.10.8](https://mvnrepository.com/artifact/joda-time/joda-time/2.10.8)    Apache License, Version 2.0
            com.fasterxml.jackson.datatype    jackson-datatype-jsr310    [2.13.2](https://mvnrepository.com/artifact/com.fasterxml.jackson.datatype/jackson-datatype-jsr310/2.13.2)    The Apache Software License, Version 2.0
                com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
                com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
                com.fasterxml.jackson.core    jackson-databind    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-databind/2.18.4)    The Apache Software License, Version 2.0
                    com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
                    com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
        org.apache.logging.log4j    log4j-api    [2.17.2](https://mvnrepository.com/artifact/org.apache.logging.log4j/log4j-api/2.17.2)    Apache License, Version 2.0
    org.apache.geode    geode-management    [1.15.1](https://mvnrepository.com/artifact/org.apache.geode/geode-management/1.15.1)    The Apache Software License, Version 2.0
        com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
        com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
        com.fasterxml.jackson.core    jackson-databind    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-databind/2.18.4)    The Apache Software License, Version 2.0
            com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
            com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
        commons-io    commons-io    [2.11.0](https://mvnrepository.com/artifact/commons-io/commons-io/2.11.0)    Apache License, Version 2.0
        org.apache.commons    commons-lang3    [3.12.0](https://mvnrepository.com/artifact/org.apache.commons/commons-lang3/3.12.0)    Apache License, Version 2.0
        org.apache.geode    geode-serialization    [1.15.1](https://mvnrepository.com/artifact/org.apache.geode/geode-serialization/1.15.1)    The Apache Software License, Version 2.0
            it.unimi.dsi    fastutil    [8.5.8](https://mvnrepository.com/artifact/it.unimi.dsi/fastutil/8.5.8)    Apache License, Version 2.0
            org.apache.commons    commons-lang3    [3.12.0](https://mvnrepository.com/artifact/org.apache.commons/commons-lang3/3.12.0)    Apache License, Version 2.0
            org.apache.geode    geode-common    [1.15.1](https://mvnrepository.com/artifact/org.apache.geode/geode-common/1.15.1)    The Apache Software License, Version 2.0
                com.fasterxml.jackson.core    jackson-databind    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-databind/2.18.4)    The Apache Software License, Version 2.0
                    com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
                    com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
                com.fasterxml.jackson.datatype    jackson-datatype-joda    [2.13.2](https://mvnrepository.com/artifact/com.fasterxml.jackson.datatype/jackson-datatype-joda/2.13.2)    The Apache Software License, Version 2.0
                    com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
                    com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
                    com.fasterxml.jackson.core    jackson-databind    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-databind/2.18.4)    The Apache Software License, Version 2.0
                        com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
                        com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
                    joda-time    joda-time    [2.10.8](https://mvnrepository.com/artifact/joda-time/joda-time/2.10.8)    Apache License, Version 2.0
                com.fasterxml.jackson.datatype    jackson-datatype-jsr310    [2.13.2](https://mvnrepository.com/artifact/com.fasterxml.jackson.datatype/jackson-datatype-jsr310/2.13.2)    The Apache Software License, Version 2.0
                    com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
                    com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
                    com.fasterxml.jackson.core    jackson-databind    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-databind/2.18.4)    The Apache Software License, Version 2.0
                        com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
                        com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
            org.apache.geode    geode-logging    [1.15.1](https://mvnrepository.com/artifact/org.apache.geode/geode-logging/1.15.1)    The Apache Software License, Version 2.0
                org.apache.geode    geode-common    [1.15.1](https://mvnrepository.com/artifact/org.apache.geode/geode-common/1.15.1)    The Apache Software License, Version 2.0
                    com.fasterxml.jackson.core    jackson-databind    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-databind/2.18.4)    The Apache Software License, Version 2.0
                        com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
                        com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
                    com.fasterxml.jackson.datatype    jackson-datatype-joda    [2.13.2](https://mvnrepository.com/artifact/com.fasterxml.jackson.datatype/jackson-datatype-joda/2.13.2)    The Apache Software License, Version 2.0
                        com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
                        com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
                        com.fasterxml.jackson.core    jackson-databind    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-databind/2.18.4)    The Apache Software License, Version 2.0
                            com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
                            com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
                        joda-time    joda-time    [2.10.8](https://mvnrepository.com/artifact/joda-time/joda-time/2.10.8)    Apache License, Version 2.0
                    com.fasterxml.jackson.datatype    jackson-datatype-jsr310    [2.13.2](https://mvnrepository.com/artifact/com.fasterxml.jackson.datatype/jackson-datatype-jsr310/2.13.2)    The Apache Software License, Version 2.0
                        com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
                        com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
                        com.fasterxml.jackson.core    jackson-databind    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-databind/2.18.4)    The Apache Software License, Version 2.0
                            com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
                            com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
                org.apache.logging.log4j    log4j-api    [2.17.2](https://mvnrepository.com/artifact/org.apache.logging.log4j/log4j-api/2.17.2)    Apache License, Version 2.0
            org.apache.logging.log4j    log4j-api    [2.17.2](https://mvnrepository.com/artifact/org.apache.logging.log4j/log4j-api/2.17.2)    Apache License, Version 2.0
        org.apache.httpcomponents    httpclient    [4.5.13](https://mvnrepository.com/artifact/org.apache.httpcomponents/httpclient/4.5.13)    Apache License, Version 2.0
            commons-codec    commons-codec    [1.11](https://mvnrepository.com/artifact/commons-codec/commons-codec/1.11)    Apache License, Version 2.0
            commons-logging    commons-logging    [1.2](https://mvnrepository.com/artifact/commons-logging/commons-logging/1.2)    The Apache Software License, Version 2.0
            org.apache.httpcomponents    httpcore    [4.4.13](https://mvnrepository.com/artifact/org.apache.httpcomponents/httpcore/4.4.13)    Apache License, Version 2.0
        org.springframework    spring-web    [5.3.20](https://mvnrepository.com/artifact/org.springframework/spring-web/5.3.20)    Apache License, Version 2.0
            org.springframework    spring-beans    [5.3.20](https://mvnrepository.com/artifact/org.springframework/spring-beans/5.3.20)    Apache License, Version 2.0
                org.springframework    spring-core    [5.3.20](https://mvnrepository.com/artifact/org.springframework/spring-core/5.3.20)    Apache License, Version 2.0
                    org.springframework    spring-jcl    [5.3.20](https://mvnrepository.com/artifact/org.springframework/spring-jcl/5.3.20)    Apache License, Version 2.0
            org.springframework    spring-core    [5.3.20](https://mvnrepository.com/artifact/org.springframework/spring-core/5.3.20)    Apache License, Version 2.0
                org.springframework    spring-jcl    [5.3.20](https://mvnrepository.com/artifact/org.springframework/spring-jcl/5.3.20)    Apache License, Version 2.0
    org.apache.geode    geode-membership    [1.15.1](https://mvnrepository.com/artifact/org.apache.geode/geode-membership/1.15.1)    The Apache Software License, Version 2.0
        commons-validator    commons-validator    [1.7](https://mvnrepository.com/artifact/commons-validator/commons-validator/1.7)    Apache License, Version 2.0
            commons-beanutils    commons-beanutils    [1.9.4](https://mvnrepository.com/artifact/commons-beanutils/commons-beanutils/1.9.4)    Apache License, Version 2.0
                commons-collections    commons-collections    [3.2.2](https://mvnrepository.com/artifact/commons-collections/commons-collections/3.2.2)    Apache License, Version 2.0
                commons-logging    commons-logging    [1.2](https://mvnrepository.com/artifact/commons-logging/commons-logging/1.2)    The Apache Software License, Version 2.0
            commons-collections    commons-collections    [3.2.2](https://mvnrepository.com/artifact/commons-collections/commons-collections/3.2.2)    Apache License, Version 2.0
            commons-digester    commons-digester    [2.1](https://mvnrepository.com/artifact/commons-digester/commons-digester/2.1)    The Apache Software License, Version 2.0
            commons-logging    commons-logging    [1.2](https://mvnrepository.com/artifact/commons-logging/commons-logging/1.2)    The Apache Software License, Version 2.0
        it.unimi.dsi    fastutil    [8.5.8](https://mvnrepository.com/artifact/it.unimi.dsi/fastutil/8.5.8)    Apache License, Version 2.0
        org.apache.commons    commons-lang3    [3.12.0](https://mvnrepository.com/artifact/org.apache.commons/commons-lang3/3.12.0)    Apache License, Version 2.0
        org.apache.geode    geode-common    [1.15.1](https://mvnrepository.com/artifact/org.apache.geode/geode-common/1.15.1)    The Apache Software License, Version 2.0
            com.fasterxml.jackson.core    jackson-databind    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-databind/2.18.4)    The Apache Software License, Version 2.0
                com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
                com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
            com.fasterxml.jackson.datatype    jackson-datatype-joda    [2.13.2](https://mvnrepository.com/artifact/com.fasterxml.jackson.datatype/jackson-datatype-joda/2.13.2)    The Apache Software License, Version 2.0
                com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
                com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
                com.fasterxml.jackson.core    jackson-databind    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-databind/2.18.4)    The Apache Software License, Version 2.0
                    com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
                    com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
                joda-time    joda-time    [2.10.8](https://mvnrepository.com/artifact/joda-time/joda-time/2.10.8)    Apache License, Version 2.0
            com.fasterxml.jackson.datatype    jackson-datatype-jsr310    [2.13.2](https://mvnrepository.com/artifact/com.fasterxml.jackson.datatype/jackson-datatype-jsr310/2.13.2)    The Apache Software License, Version 2.0
                com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
                com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
                com.fasterxml.jackson.core    jackson-databind    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-databind/2.18.4)    The Apache Software License, Version 2.0
                    com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
                    com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
        org.apache.geode    geode-logging    [1.15.1](https://mvnrepository.com/artifact/org.apache.geode/geode-logging/1.15.1)    The Apache Software License, Version 2.0
            org.apache.geode    geode-common    [1.15.1](https://mvnrepository.com/artifact/org.apache.geode/geode-common/1.15.1)    The Apache Software License, Version 2.0
                com.fasterxml.jackson.core    jackson-databind    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-databind/2.18.4)    The Apache Software License, Version 2.0
                    com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
                    com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
                com.fasterxml.jackson.datatype    jackson-datatype-joda    [2.13.2](https://mvnrepository.com/artifact/com.fasterxml.jackson.datatype/jackson-datatype-joda/2.13.2)    The Apache Software License, Version 2.0
                    com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
                    com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
                    com.fasterxml.jackson.core    jackson-databind    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-databind/2.18.4)    The Apache Software License, Version 2.0
                        com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
                        com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
                    joda-time    joda-time    [2.10.8](https://mvnrepository.com/artifact/joda-time/joda-time/2.10.8)    Apache License, Version 2.0
                com.fasterxml.jackson.datatype    jackson-datatype-jsr310    [2.13.2](https://mvnrepository.com/artifact/com.fasterxml.jackson.datatype/jackson-datatype-jsr310/2.13.2)    The Apache Software License, Version 2.0
                    com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
                    com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
                    com.fasterxml.jackson.core    jackson-databind    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-databind/2.18.4)    The Apache Software License, Version 2.0
                        com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
                        com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
            org.apache.logging.log4j    log4j-api    [2.17.2](https://mvnrepository.com/artifact/org.apache.logging.log4j/log4j-api/2.17.2)    Apache License, Version 2.0
        org.apache.geode    geode-serialization    [1.15.1](https://mvnrepository.com/artifact/org.apache.geode/geode-serialization/1.15.1)    The Apache Software License, Version 2.0
            it.unimi.dsi    fastutil    [8.5.8](https://mvnrepository.com/artifact/it.unimi.dsi/fastutil/8.5.8)    Apache License, Version 2.0
            org.apache.commons    commons-lang3    [3.12.0](https://mvnrepository.com/artifact/org.apache.commons/commons-lang3/3.12.0)    Apache License, Version 2.0
            org.apache.geode    geode-common    [1.15.1](https://mvnrepository.com/artifact/org.apache.geode/geode-common/1.15.1)    The Apache Software License, Version 2.0
                com.fasterxml.jackson.core    jackson-databind    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-databind/2.18.4)    The Apache Software License, Version 2.0
                    com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
                    com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
                com.fasterxml.jackson.datatype    jackson-datatype-joda    [2.13.2](https://mvnrepository.com/artifact/com.fasterxml.jackson.datatype/jackson-datatype-joda/2.13.2)    The Apache Software License, Version 2.0
                    com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
                    com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
                    com.fasterxml.jackson.core    jackson-databind    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-databind/2.18.4)    The Apache Software License, Version 2.0
                        com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
                        com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
                    joda-time    joda-time    [2.10.8](https://mvnrepository.com/artifact/joda-time/joda-time/2.10.8)    Apache License, Version 2.0
                com.fasterxml.jackson.datatype    jackson-datatype-jsr310    [2.13.2](https://mvnrepository.com/artifact/com.fasterxml.jackson.datatype/jackson-datatype-jsr310/2.13.2)    The Apache Software License, Version 2.0
                    com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
                    com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
                    com.fasterxml.jackson.core    jackson-databind    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-databind/2.18.4)    The Apache Software License, Version 2.0
                        com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
                        com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
            org.apache.geode    geode-logging    [1.15.1](https://mvnrepository.com/artifact/org.apache.geode/geode-logging/1.15.1)    The Apache Software License, Version 2.0
                org.apache.geode    geode-common    [1.15.1](https://mvnrepository.com/artifact/org.apache.geode/geode-common/1.15.1)    The Apache Software License, Version 2.0
                    com.fasterxml.jackson.core    jackson-databind    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-databind/2.18.4)    The Apache Software License, Version 2.0
                        com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
                        com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
                    com.fasterxml.jackson.datatype    jackson-datatype-joda    [2.13.2](https://mvnrepository.com/artifact/com.fasterxml.jackson.datatype/jackson-datatype-joda/2.13.2)    The Apache Software License, Version 2.0
                        com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
                        com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
                        com.fasterxml.jackson.core    jackson-databind    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-databind/2.18.4)    The Apache Software License, Version 2.0
                            com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
                            com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
                        joda-time    joda-time    [2.10.8](https://mvnrepository.com/artifact/joda-time/joda-time/2.10.8)    Apache License, Version 2.0
                    com.fasterxml.jackson.datatype    jackson-datatype-jsr310    [2.13.2](https://mvnrepository.com/artifact/com.fasterxml.jackson.datatype/jackson-datatype-jsr310/2.13.2)    The Apache Software License, Version 2.0
                        com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
                        com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
                        com.fasterxml.jackson.core    jackson-databind    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-databind/2.18.4)    The Apache Software License, Version 2.0
                            com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
                            com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
                org.apache.logging.log4j    log4j-api    [2.17.2](https://mvnrepository.com/artifact/org.apache.logging.log4j/log4j-api/2.17.2)    Apache License, Version 2.0
            org.apache.logging.log4j    log4j-api    [2.17.2](https://mvnrepository.com/artifact/org.apache.logging.log4j/log4j-api/2.17.2)    Apache License, Version 2.0
        org.apache.geode    geode-tcp-server    [1.15.1](https://mvnrepository.com/artifact/org.apache.geode/geode-tcp-server/1.15.1)    The Apache Software License, Version 2.0
            commons-validator    commons-validator    [1.7](https://mvnrepository.com/artifact/commons-validator/commons-validator/1.7)    Apache License, Version 2.0
                commons-beanutils    commons-beanutils    [1.9.4](https://mvnrepository.com/artifact/commons-beanutils/commons-beanutils/1.9.4)    Apache License, Version 2.0
                    commons-collections    commons-collections    [3.2.2](https://mvnrepository.com/artifact/commons-collections/commons-collections/3.2.2)    Apache License, Version 2.0
                    commons-logging    commons-logging    [1.2](https://mvnrepository.com/artifact/commons-logging/commons-logging/1.2)    The Apache Software License, Version 2.0
                commons-collections    commons-collections    [3.2.2](https://mvnrepository.com/artifact/commons-collections/commons-collections/3.2.2)    Apache License, Version 2.0
                commons-digester    commons-digester    [2.1](https://mvnrepository.com/artifact/commons-digester/commons-digester/2.1)    The Apache Software License, Version 2.0
                commons-logging    commons-logging    [1.2](https://mvnrepository.com/artifact/commons-logging/commons-logging/1.2)    The Apache Software License, Version 2.0
            org.apache.geode    geode-common    [1.15.1](https://mvnrepository.com/artifact/org.apache.geode/geode-common/1.15.1)    The Apache Software License, Version 2.0
                com.fasterxml.jackson.core    jackson-databind    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-databind/2.18.4)    The Apache Software License, Version 2.0
                    com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
                    com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
                com.fasterxml.jackson.datatype    jackson-datatype-joda    [2.13.2](https://mvnrepository.com/artifact/com.fasterxml.jackson.datatype/jackson-datatype-joda/2.13.2)    The Apache Software License, Version 2.0
                    com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
                    com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
                    com.fasterxml.jackson.core    jackson-databind    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-databind/2.18.4)    The Apache Software License, Version 2.0
                        com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
                        com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
                    joda-time    joda-time    [2.10.8](https://mvnrepository.com/artifact/joda-time/joda-time/2.10.8)    Apache License, Version 2.0
                com.fasterxml.jackson.datatype    jackson-datatype-jsr310    [2.13.2](https://mvnrepository.com/artifact/com.fasterxml.jackson.datatype/jackson-datatype-jsr310/2.13.2)    The Apache Software License, Version 2.0
                    com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
                    com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
                    com.fasterxml.jackson.core    jackson-databind    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-databind/2.18.4)    The Apache Software License, Version 2.0
                        com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
                        com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
            org.apache.geode    geode-logging    [1.15.1](https://mvnrepository.com/artifact/org.apache.geode/geode-logging/1.15.1)    The Apache Software License, Version 2.0
                org.apache.geode    geode-common    [1.15.1](https://mvnrepository.com/artifact/org.apache.geode/geode-common/1.15.1)    The Apache Software License, Version 2.0
                    com.fasterxml.jackson.core    jackson-databind    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-databind/2.18.4)    The Apache Software License, Version 2.0
                        com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
                        com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
                    com.fasterxml.jackson.datatype    jackson-datatype-joda    [2.13.2](https://mvnrepository.com/artifact/com.fasterxml.jackson.datatype/jackson-datatype-joda/2.13.2)    The Apache Software License, Version 2.0
                        com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
                        com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
                        com.fasterxml.jackson.core    jackson-databind    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-databind/2.18.4)    The Apache Software License, Version 2.0
                            com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
                            com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
                        joda-time    joda-time    [2.10.8](https://mvnrepository.com/artifact/joda-time/joda-time/2.10.8)    Apache License, Version 2.0
                    com.fasterxml.jackson.datatype    jackson-datatype-jsr310    [2.13.2](https://mvnrepository.com/artifact/com.fasterxml.jackson.datatype/jackson-datatype-jsr310/2.13.2)    The Apache Software License, Version 2.0
                        com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
                        com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
                        com.fasterxml.jackson.core    jackson-databind    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-databind/2.18.4)    The Apache Software License, Version 2.0
                            com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
                            com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
                org.apache.logging.log4j    log4j-api    [2.17.2](https://mvnrepository.com/artifact/org.apache.logging.log4j/log4j-api/2.17.2)    Apache License, Version 2.0
            org.apache.geode    geode-serialization    [1.15.1](https://mvnrepository.com/artifact/org.apache.geode/geode-serialization/1.15.1)    The Apache Software License, Version 2.0
                it.unimi.dsi    fastutil    [8.5.8](https://mvnrepository.com/artifact/it.unimi.dsi/fastutil/8.5.8)    Apache License, Version 2.0
                org.apache.commons    commons-lang3    [3.12.0](https://mvnrepository.com/artifact/org.apache.commons/commons-lang3/3.12.0)    Apache License, Version 2.0
                org.apache.geode    geode-common    [1.15.1](https://mvnrepository.com/artifact/org.apache.geode/geode-common/1.15.1)    The Apache Software License, Version 2.0
                    com.fasterxml.jackson.core    jackson-databind    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-databind/2.18.4)    The Apache Software License, Version 2.0
                        com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
                        com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
                    com.fasterxml.jackson.datatype    jackson-datatype-joda    [2.13.2](https://mvnrepository.com/artifact/com.fasterxml.jackson.datatype/jackson-datatype-joda/2.13.2)    The Apache Software License, Version 2.0
                        com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
                        com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
                        com.fasterxml.jackson.core    jackson-databind    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-databind/2.18.4)    The Apache Software License, Version 2.0
                            com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
                            com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
                        joda-time    joda-time    [2.10.8](https://mvnrepository.com/artifact/joda-time/joda-time/2.10.8)    Apache License, Version 2.0
                    com.fasterxml.jackson.datatype    jackson-datatype-jsr310    [2.13.2](https://mvnrepository.com/artifact/com.fasterxml.jackson.datatype/jackson-datatype-jsr310/2.13.2)    The Apache Software License, Version 2.0
                        com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
                        com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
                        com.fasterxml.jackson.core    jackson-databind    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-databind/2.18.4)    The Apache Software License, Version 2.0
                            com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
                            com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
                org.apache.geode    geode-logging    [1.15.1](https://mvnrepository.com/artifact/org.apache.geode/geode-logging/1.15.1)    The Apache Software License, Version 2.0
                    org.apache.geode    geode-common    [1.15.1](https://mvnrepository.com/artifact/org.apache.geode/geode-common/1.15.1)    The Apache Software License, Version 2.0
                        com.fasterxml.jackson.core    jackson-databind    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-databind/2.18.4)    The Apache Software License, Version 2.0
                            com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
                            com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
                        com.fasterxml.jackson.datatype    jackson-datatype-joda    [2.13.2](https://mvnrepository.com/artifact/com.fasterxml.jackson.datatype/jackson-datatype-joda/2.13.2)    The Apache Software License, Version 2.0
                            com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
                            com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
                            com.fasterxml.jackson.core    jackson-databind    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-databind/2.18.4)    The Apache Software License, Version 2.0
                                com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
                                com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
                            joda-time    joda-time    [2.10.8](https://mvnrepository.com/artifact/joda-time/joda-time/2.10.8)    Apache License, Version 2.0
                        com.fasterxml.jackson.datatype    jackson-datatype-jsr310    [2.13.2](https://mvnrepository.com/artifact/com.fasterxml.jackson.datatype/jackson-datatype-jsr310/2.13.2)    The Apache Software License, Version 2.0
                            com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
                            com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
                            com.fasterxml.jackson.core    jackson-databind    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-databind/2.18.4)    The Apache Software License, Version 2.0
                                com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
                                com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
                    org.apache.logging.log4j    log4j-api    [2.17.2](https://mvnrepository.com/artifact/org.apache.logging.log4j/log4j-api/2.17.2)    Apache License, Version 2.0
                org.apache.logging.log4j    log4j-api    [2.17.2](https://mvnrepository.com/artifact/org.apache.logging.log4j/log4j-api/2.17.2)    Apache License, Version 2.0
            org.apache.logging.log4j    log4j-api    [2.17.2](https://mvnrepository.com/artifact/org.apache.logging.log4j/log4j-api/2.17.2)    Apache License, Version 2.0
        org.apache.logging.log4j    log4j-api    [2.17.2](https://mvnrepository.com/artifact/org.apache.logging.log4j/log4j-api/2.17.2)    Apache License, Version 2.0
        org.jgroups    jgroups    [3.6.14.Final](https://mvnrepository.com/artifact/org.jgroups/jgroups/3.6.14.Final)    Apache License 2.0
    org.apache.geode    geode-serialization    [1.15.1](https://mvnrepository.com/artifact/org.apache.geode/geode-serialization/1.15.1)    The Apache Software License, Version 2.0
        it.unimi.dsi    fastutil    [8.5.8](https://mvnrepository.com/artifact/it.unimi.dsi/fastutil/8.5.8)    Apache License, Version 2.0
        org.apache.commons    commons-lang3    [3.12.0](https://mvnrepository.com/artifact/org.apache.commons/commons-lang3/3.12.0)    Apache License, Version 2.0
        org.apache.geode    geode-common    [1.15.1](https://mvnrepository.com/artifact/org.apache.geode/geode-common/1.15.1)    The Apache Software License, Version 2.0
            com.fasterxml.jackson.core    jackson-databind    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-databind/2.18.4)    The Apache Software License, Version 2.0
                com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
                com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
            com.fasterxml.jackson.datatype    jackson-datatype-joda    [2.13.2](https://mvnrepository.com/artifact/com.fasterxml.jackson.datatype/jackson-datatype-joda/2.13.2)    The Apache Software License, Version 2.0
                com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
                com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
                com.fasterxml.jackson.core    jackson-databind    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-databind/2.18.4)    The Apache Software License, Version 2.0
                    com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
                    com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
                joda-time    joda-time    [2.10.8](https://mvnrepository.com/artifact/joda-time/joda-time/2.10.8)    Apache License, Version 2.0
            com.fasterxml.jackson.datatype    jackson-datatype-jsr310    [2.13.2](https://mvnrepository.com/artifact/com.fasterxml.jackson.datatype/jackson-datatype-jsr310/2.13.2)    The Apache Software License, Version 2.0
                com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
                com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
                com.fasterxml.jackson.core    jackson-databind    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-databind/2.18.4)    The Apache Software License, Version 2.0
                    com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
                    com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
        org.apache.geode    geode-logging    [1.15.1](https://mvnrepository.com/artifact/org.apache.geode/geode-logging/1.15.1)    The Apache Software License, Version 2.0
            org.apache.geode    geode-common    [1.15.1](https://mvnrepository.com/artifact/org.apache.geode/geode-common/1.15.1)    The Apache Software License, Version 2.0
                com.fasterxml.jackson.core    jackson-databind    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-databind/2.18.4)    The Apache Software License, Version 2.0
                    com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
                    com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
                com.fasterxml.jackson.datatype    jackson-datatype-joda    [2.13.2](https://mvnrepository.com/artifact/com.fasterxml.jackson.datatype/jackson-datatype-joda/2.13.2)    The Apache Software License, Version 2.0
                    com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
                    com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
                    com.fasterxml.jackson.core    jackson-databind    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-databind/2.18.4)    The Apache Software License, Version 2.0
                        com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
                        com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
                    joda-time    joda-time    [2.10.8](https://mvnrepository.com/artifact/joda-time/joda-time/2.10.8)    Apache License, Version 2.0
                com.fasterxml.jackson.datatype    jackson-datatype-jsr310    [2.13.2](https://mvnrepository.com/artifact/com.fasterxml.jackson.datatype/jackson-datatype-jsr310/2.13.2)    The Apache Software License, Version 2.0
                    com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
                    com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
                    com.fasterxml.jackson.core    jackson-databind    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-databind/2.18.4)    The Apache Software License, Version 2.0
                        com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
                        com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
            org.apache.logging.log4j    log4j-api    [2.17.2](https://mvnrepository.com/artifact/org.apache.logging.log4j/log4j-api/2.17.2)    Apache License, Version 2.0
        org.apache.logging.log4j    log4j-api    [2.17.2](https://mvnrepository.com/artifact/org.apache.logging.log4j/log4j-api/2.17.2)    Apache License, Version 2.0
    org.apache.geode    geode-tcp-server    [1.15.1](https://mvnrepository.com/artifact/org.apache.geode/geode-tcp-server/1.15.1)    The Apache Software License, Version 2.0
        commons-validator    commons-validator    [1.7](https://mvnrepository.com/artifact/commons-validator/commons-validator/1.7)    Apache License, Version 2.0
            commons-beanutils    commons-beanutils    [1.9.4](https://mvnrepository.com/artifact/commons-beanutils/commons-beanutils/1.9.4)    Apache License, Version 2.0
                commons-collections    commons-collections    [3.2.2](https://mvnrepository.com/artifact/commons-collections/commons-collections/3.2.2)    Apache License, Version 2.0
                commons-logging    commons-logging    [1.2](https://mvnrepository.com/artifact/commons-logging/commons-logging/1.2)    The Apache Software License, Version 2.0
            commons-collections    commons-collections    [3.2.2](https://mvnrepository.com/artifact/commons-collections/commons-collections/3.2.2)    Apache License, Version 2.0
            commons-digester    commons-digester    [2.1](https://mvnrepository.com/artifact/commons-digester/commons-digester/2.1)    The Apache Software License, Version 2.0
            commons-logging    commons-logging    [1.2](https://mvnrepository.com/artifact/commons-logging/commons-logging/1.2)    The Apache Software License, Version 2.0
        org.apache.geode    geode-common    [1.15.1](https://mvnrepository.com/artifact/org.apache.geode/geode-common/1.15.1)    The Apache Software License, Version 2.0
            com.fasterxml.jackson.core    jackson-databind    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-databind/2.18.4)    The Apache Software License, Version 2.0
                com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
                com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
            com.fasterxml.jackson.datatype    jackson-datatype-joda    [2.13.2](https://mvnrepository.com/artifact/com.fasterxml.jackson.datatype/jackson-datatype-joda/2.13.2)    The Apache Software License, Version 2.0
                com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
                com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
                com.fasterxml.jackson.core    jackson-databind    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-databind/2.18.4)    The Apache Software License, Version 2.0
                    com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
                    com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
                joda-time    joda-time    [2.10.8](https://mvnrepository.com/artifact/joda-time/joda-time/2.10.8)    Apache License, Version 2.0
            com.fasterxml.jackson.datatype    jackson-datatype-jsr310    [2.13.2](https://mvnrepository.com/artifact/com.fasterxml.jackson.datatype/jackson-datatype-jsr310/2.13.2)    The Apache Software License, Version 2.0
                com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
                com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
                com.fasterxml.jackson.core    jackson-databind    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-databind/2.18.4)    The Apache Software License, Version 2.0
                    com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
                    com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
        org.apache.geode    geode-logging    [1.15.1](https://mvnrepository.com/artifact/org.apache.geode/geode-logging/1.15.1)    The Apache Software License, Version 2.0
            org.apache.geode    geode-common    [1.15.1](https://mvnrepository.com/artifact/org.apache.geode/geode-common/1.15.1)    The Apache Software License, Version 2.0
                com.fasterxml.jackson.core    jackson-databind    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-databind/2.18.4)    The Apache Software License, Version 2.0
                    com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
                    com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
                com.fasterxml.jackson.datatype    jackson-datatype-joda    [2.13.2](https://mvnrepository.com/artifact/com.fasterxml.jackson.datatype/jackson-datatype-joda/2.13.2)    The Apache Software License, Version 2.0
                    com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
                    com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
                    com.fasterxml.jackson.core    jackson-databind    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-databind/2.18.4)    The Apache Software License, Version 2.0
                        com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
                        com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
                    joda-time    joda-time    [2.10.8](https://mvnrepository.com/artifact/joda-time/joda-time/2.10.8)    Apache License, Version 2.0
                com.fasterxml.jackson.datatype    jackson-datatype-jsr310    [2.13.2](https://mvnrepository.com/artifact/com.fasterxml.jackson.datatype/jackson-datatype-jsr310/2.13.2)    The Apache Software License, Version 2.0
                    com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
                    com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
                    com.fasterxml.jackson.core    jackson-databind    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-databind/2.18.4)    The Apache Software License, Version 2.0
                        com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
                        com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
            org.apache.logging.log4j    log4j-api    [2.17.2](https://mvnrepository.com/artifact/org.apache.logging.log4j/log4j-api/2.17.2)    Apache License, Version 2.0
        org.apache.geode    geode-serialization    [1.15.1](https://mvnrepository.com/artifact/org.apache.geode/geode-serialization/1.15.1)    The Apache Software License, Version 2.0
            it.unimi.dsi    fastutil    [8.5.8](https://mvnrepository.com/artifact/it.unimi.dsi/fastutil/8.5.8)    Apache License, Version 2.0
            org.apache.commons    commons-lang3    [3.12.0](https://mvnrepository.com/artifact/org.apache.commons/commons-lang3/3.12.0)    Apache License, Version 2.0
            org.apache.geode    geode-common    [1.15.1](https://mvnrepository.com/artifact/org.apache.geode/geode-common/1.15.1)    The Apache Software License, Version 2.0
                com.fasterxml.jackson.core    jackson-databind    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-databind/2.18.4)    The Apache Software License, Version 2.0
                    com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
                    com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
                com.fasterxml.jackson.datatype    jackson-datatype-joda    [2.13.2](https://mvnrepository.com/artifact/com.fasterxml.jackson.datatype/jackson-datatype-joda/2.13.2)    The Apache Software License, Version 2.0
                    com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
                    com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
                    com.fasterxml.jackson.core    jackson-databind    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-databind/2.18.4)    The Apache Software License, Version 2.0
                        com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
                        com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
                    joda-time    joda-time    [2.10.8](https://mvnrepository.com/artifact/joda-time/joda-time/2.10.8)    Apache License, Version 2.0
                com.fasterxml.jackson.datatype    jackson-datatype-jsr310    [2.13.2](https://mvnrepository.com/artifact/com.fasterxml.jackson.datatype/jackson-datatype-jsr310/2.13.2)    The Apache Software License, Version 2.0
                    com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
                    com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
                    com.fasterxml.jackson.core    jackson-databind    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-databind/2.18.4)    The Apache Software License, Version 2.0
                        com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
                        com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
            org.apache.geode    geode-logging    [1.15.1](https://mvnrepository.com/artifact/org.apache.geode/geode-logging/1.15.1)    The Apache Software License, Version 2.0
                org.apache.geode    geode-common    [1.15.1](https://mvnrepository.com/artifact/org.apache.geode/geode-common/1.15.1)    The Apache Software License, Version 2.0
                    com.fasterxml.jackson.core    jackson-databind    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-databind/2.18.4)    The Apache Software License, Version 2.0
                        com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
                        com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
                    com.fasterxml.jackson.datatype    jackson-datatype-joda    [2.13.2](https://mvnrepository.com/artifact/com.fasterxml.jackson.datatype/jackson-datatype-joda/2.13.2)    The Apache Software License, Version 2.0
                        com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
                        com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
                        com.fasterxml.jackson.core    jackson-databind    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-databind/2.18.4)    The Apache Software License, Version 2.0
                            com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
                            com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
                        joda-time    joda-time    [2.10.8](https://mvnrepository.com/artifact/joda-time/joda-time/2.10.8)    Apache License, Version 2.0
                    com.fasterxml.jackson.datatype    jackson-datatype-jsr310    [2.13.2](https://mvnrepository.com/artifact/com.fasterxml.jackson.datatype/jackson-datatype-jsr310/2.13.2)    The Apache Software License, Version 2.0
                        com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
                        com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
                        com.fasterxml.jackson.core    jackson-databind    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-databind/2.18.4)    The Apache Software License, Version 2.0
                            com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
                            com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
                org.apache.logging.log4j    log4j-api    [2.17.2](https://mvnrepository.com/artifact/org.apache.logging.log4j/log4j-api/2.17.2)    Apache License, Version 2.0
            org.apache.logging.log4j    log4j-api    [2.17.2](https://mvnrepository.com/artifact/org.apache.logging.log4j/log4j-api/2.17.2)    Apache License, Version 2.0
        org.apache.logging.log4j    log4j-api    [2.17.2](https://mvnrepository.com/artifact/org.apache.logging.log4j/log4j-api/2.17.2)    Apache License, Version 2.0
    org.apache.geode    geode-unsafe    [1.15.1](https://mvnrepository.com/artifact/org.apache.geode/geode-unsafe/1.15.1)    The Apache Software License, Version 2.0
    org.apache.logging.log4j    log4j-api    [2.17.2](https://mvnrepository.com/artifact/org.apache.logging.log4j/log4j-api/2.17.2)    Apache License, Version 2.0
    org.apache.shiro    shiro-core    [1.9.1](https://mvnrepository.com/artifact/org.apache.shiro/shiro-core/1.9.1)    Apache License, Version 2.0
        org.apache.shiro    shiro-cache    [1.9.1](https://mvnrepository.com/artifact/org.apache.shiro/shiro-cache/1.9.1)    Apache License, Version 2.0
            org.apache.shiro    shiro-lang    [1.9.1](https://mvnrepository.com/artifact/org.apache.shiro/shiro-lang/1.9.1)    Apache License, Version 2.0
                org.slf4j    slf4j-api    [1.7.36](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/1.7.36)    MIT License
        org.apache.shiro    shiro-config-core    [1.9.1](https://mvnrepository.com/artifact/org.apache.shiro/shiro-config-core/1.9.1)    Apache License, Version 2.0
            org.apache.shiro    shiro-lang    [1.9.1](https://mvnrepository.com/artifact/org.apache.shiro/shiro-lang/1.9.1)    Apache License, Version 2.0
                org.slf4j    slf4j-api    [1.7.36](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/1.7.36)    MIT License
        org.apache.shiro    shiro-config-ogdl    [1.9.1](https://mvnrepository.com/artifact/org.apache.shiro/shiro-config-ogdl/1.9.1)    Apache License, Version 2.0
            commons-beanutils    commons-beanutils    [1.9.4](https://mvnrepository.com/artifact/commons-beanutils/commons-beanutils/1.9.4)    Apache License, Version 2.0
                commons-collections    commons-collections    [3.2.2](https://mvnrepository.com/artifact/commons-collections/commons-collections/3.2.2)    Apache License, Version 2.0
                commons-logging    commons-logging    [1.2](https://mvnrepository.com/artifact/commons-logging/commons-logging/1.2)    The Apache Software License, Version 2.0
            org.apache.shiro    shiro-config-core    [1.9.1](https://mvnrepository.com/artifact/org.apache.shiro/shiro-config-core/1.9.1)    Apache License, Version 2.0
                org.apache.shiro    shiro-lang    [1.9.1](https://mvnrepository.com/artifact/org.apache.shiro/shiro-lang/1.9.1)    Apache License, Version 2.0
                    org.slf4j    slf4j-api    [1.7.36](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/1.7.36)    MIT License
            org.apache.shiro    shiro-event    [1.9.1](https://mvnrepository.com/artifact/org.apache.shiro/shiro-event/1.9.1)    Apache License, Version 2.0
                org.apache.shiro    shiro-lang    [1.9.1](https://mvnrepository.com/artifact/org.apache.shiro/shiro-lang/1.9.1)    Apache License, Version 2.0
                    org.slf4j    slf4j-api    [1.7.36](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/1.7.36)    MIT License
            org.apache.shiro    shiro-lang    [1.9.1](https://mvnrepository.com/artifact/org.apache.shiro/shiro-lang/1.9.1)    Apache License, Version 2.0
                org.slf4j    slf4j-api    [1.7.36](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/1.7.36)    MIT License
            org.slf4j    slf4j-api    [1.7.36](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/1.7.36)    MIT License
        org.apache.shiro    shiro-crypto-cipher    [1.9.1](https://mvnrepository.com/artifact/org.apache.shiro/shiro-crypto-cipher/1.9.1)    Apache License, Version 2.0
            org.apache.shiro    shiro-crypto-core    [1.9.1](https://mvnrepository.com/artifact/org.apache.shiro/shiro-crypto-core/1.9.1)    Apache License, Version 2.0
                org.apache.shiro    shiro-lang    [1.9.1](https://mvnrepository.com/artifact/org.apache.shiro/shiro-lang/1.9.1)    Apache License, Version 2.0
                    org.slf4j    slf4j-api    [1.7.36](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/1.7.36)    MIT License
            org.apache.shiro    shiro-lang    [1.9.1](https://mvnrepository.com/artifact/org.apache.shiro/shiro-lang/1.9.1)    Apache License, Version 2.0
                org.slf4j    slf4j-api    [1.7.36](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/1.7.36)    MIT License
        org.apache.shiro    shiro-crypto-hash    [1.9.1](https://mvnrepository.com/artifact/org.apache.shiro/shiro-crypto-hash/1.9.1)    Apache License, Version 2.0
            org.apache.shiro    shiro-crypto-core    [1.9.1](https://mvnrepository.com/artifact/org.apache.shiro/shiro-crypto-core/1.9.1)    Apache License, Version 2.0
                org.apache.shiro    shiro-lang    [1.9.1](https://mvnrepository.com/artifact/org.apache.shiro/shiro-lang/1.9.1)    Apache License, Version 2.0
                    org.slf4j    slf4j-api    [1.7.36](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/1.7.36)    MIT License
            org.apache.shiro    shiro-lang    [1.9.1](https://mvnrepository.com/artifact/org.apache.shiro/shiro-lang/1.9.1)    Apache License, Version 2.0
                org.slf4j    slf4j-api    [1.7.36](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/1.7.36)    MIT License
        org.apache.shiro    shiro-event    [1.9.1](https://mvnrepository.com/artifact/org.apache.shiro/shiro-event/1.9.1)    Apache License, Version 2.0
            org.apache.shiro    shiro-lang    [1.9.1](https://mvnrepository.com/artifact/org.apache.shiro/shiro-lang/1.9.1)    Apache License, Version 2.0
                org.slf4j    slf4j-api    [1.7.36](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/1.7.36)    MIT License
        org.apache.shiro    shiro-lang    [1.9.1](https://mvnrepository.com/artifact/org.apache.shiro/shiro-lang/1.9.1)    Apache License, Version 2.0
            org.slf4j    slf4j-api    [1.7.36](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/1.7.36)    MIT License
    org.jgroups    jgroups    [3.6.14.Final](https://mvnrepository.com/artifact/org.jgroups/jgroups/3.6.14.Final)    Apache License 2.0
org.apache.geode    geode-cq    [1.15.1](https://mvnrepository.com/artifact/org.apache.geode/geode-cq/1.15.1)    The Apache Software License, Version 2.0
    org.apache.geode    geode-core    [1.15.1](https://mvnrepository.com/artifact/org.apache.geode/geode-core/1.15.1)    The Apache Software License, Version 2.0
        antlr    antlr    [2.7.7](https://mvnrepository.com/artifact/antlr/antlr/2.7.7)    BSD License
        com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
        com.fasterxml.jackson.core    jackson-databind    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-databind/2.18.4)    The Apache Software License, Version 2.0
            com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
            com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
        com.healthmarketscience.rmiio    rmiio    [2.1.2](https://mvnrepository.com/artifact/com.healthmarketscience.rmiio/rmiio/2.1.2)    Apache License, Version 2.0
            commons-logging    commons-logging    [1.2](https://mvnrepository.com/artifact/commons-logging/commons-logging/1.2)    The Apache Software License, Version 2.0
        com.sun.istack    istack-commons-runtime    [4.0.1](https://mvnrepository.com/artifact/com.sun.istack/istack-commons-runtime/4.0.1)    Eclipse Distribution License - v 1.0
        com.sun.xml.bind    jaxb-impl    [2.3.2](https://mvnrepository.com/artifact/com.sun.xml.bind/jaxb-impl/2.3.2)    Eclipse Distribution License - v 1.0
        commons-io    commons-io    [2.11.0](https://mvnrepository.com/artifact/commons-io/commons-io/2.11.0)    Apache License, Version 2.0
        commons-validator    commons-validator    [1.7](https://mvnrepository.com/artifact/commons-validator/commons-validator/1.7)    Apache License, Version 2.0
            commons-beanutils    commons-beanutils    [1.9.4](https://mvnrepository.com/artifact/commons-beanutils/commons-beanutils/1.9.4)    Apache License, Version 2.0
                commons-collections    commons-collections    [3.2.2](https://mvnrepository.com/artifact/commons-collections/commons-collections/3.2.2)    Apache License, Version 2.0
                commons-logging    commons-logging    [1.2](https://mvnrepository.com/artifact/commons-logging/commons-logging/1.2)    The Apache Software License, Version 2.0
            commons-collections    commons-collections    [3.2.2](https://mvnrepository.com/artifact/commons-collections/commons-collections/3.2.2)    Apache License, Version 2.0
            commons-digester    commons-digester    [2.1](https://mvnrepository.com/artifact/commons-digester/commons-digester/2.1)    The Apache Software License, Version 2.0
            commons-logging    commons-logging    [1.2](https://mvnrepository.com/artifact/commons-logging/commons-logging/1.2)    The Apache Software License, Version 2.0
        io.github.classgraph    classgraph    [4.8.146](https://mvnrepository.com/artifact/io.github.classgraph/classgraph/4.8.146)    The MIT License (MIT)
        io.micrometer    micrometer-core    [1.9.0](https://mvnrepository.com/artifact/io.micrometer/micrometer-core/1.9.0)    The Apache Software License, Version 2.0
            org.hdrhistogram    HdrHistogram    [2.1.12](https://mvnrepository.com/artifact/org.hdrhistogram/HdrHistogram/2.1.12)    Public Domain, per Creative Commons CC0
            org.latencyutils    LatencyUtils    [2.0.3](https://mvnrepository.com/artifact/org.latencyutils/LatencyUtils/2.0.3)    Public Domain, per Creative Commons CC0
        it.unimi.dsi    fastutil    [8.5.8](https://mvnrepository.com/artifact/it.unimi.dsi/fastutil/8.5.8)    Apache License, Version 2.0
        javax.resource    javax.resource-api    [1.7.1](https://mvnrepository.com/artifact/javax.resource/javax.resource-api/1.7.1)    CDDL + GPLv2 with classpath exception
            javax.transaction    javax.transaction-api    [1.3](https://mvnrepository.com/artifact/javax.transaction/javax.transaction-api/1.3)    CDDL + GPLv2 with classpath exception
        javax.xml.bind    jaxb-api    [2.3.1](https://mvnrepository.com/artifact/javax.xml.bind/jaxb-api/2.3.1)    CDDL 1.1
            javax.activation    javax.activation-api    [1.2.0](https://mvnrepository.com/artifact/javax.activation/javax.activation-api/1.2.0)    CDDL/GPLv2+CE
        net.java.dev.jna    jna-platform    [5.11.0](https://mvnrepository.com/artifact/net.java.dev.jna/jna-platform/5.11.0)    LGPL-2.1-or-later
            net.java.dev.jna    jna    [5.11.0](https://mvnrepository.com/artifact/net.java.dev.jna/jna/5.11.0)    LGPL-2.1-or-later
        net.java.dev.jna    jna    [5.11.0](https://mvnrepository.com/artifact/net.java.dev.jna/jna/5.11.0)    LGPL-2.1-or-later
        net.sf.jopt-simple    jopt-simple    [5.0.4](https://mvnrepository.com/artifact/net.sf.jopt-simple/jopt-simple/5.0.4)    The MIT License
        org.apache.commons    commons-lang3    [3.12.0](https://mvnrepository.com/artifact/org.apache.commons/commons-lang3/3.12.0)    Apache License, Version 2.0
        org.apache.geode    geode-common    [1.15.1](https://mvnrepository.com/artifact/org.apache.geode/geode-common/1.15.1)    The Apache Software License, Version 2.0
            com.fasterxml.jackson.core    jackson-databind    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-databind/2.18.4)    The Apache Software License, Version 2.0
                com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
                com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
            com.fasterxml.jackson.datatype    jackson-datatype-joda    [2.13.2](https://mvnrepository.com/artifact/com.fasterxml.jackson.datatype/jackson-datatype-joda/2.13.2)    The Apache Software License, Version 2.0
                com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
                com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
                com.fasterxml.jackson.core    jackson-databind    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-databind/2.18.4)    The Apache Software License, Version 2.0
                    com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
                    com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
                joda-time    joda-time    [2.10.8](https://mvnrepository.com/artifact/joda-time/joda-time/2.10.8)    Apache License, Version 2.0
            com.fasterxml.jackson.datatype    jackson-datatype-jsr310    [2.13.2](https://mvnrepository.com/artifact/com.fasterxml.jackson.datatype/jackson-datatype-jsr310/2.13.2)    The Apache Software License, Version 2.0
                com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
                com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
                com.fasterxml.jackson.core    jackson-databind    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-databind/2.18.4)    The Apache Software License, Version 2.0
                    com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
                    com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
        org.apache.geode    geode-deployment-legacy    [1.15.1](https://mvnrepository.com/artifact/org.apache.geode/geode-deployment-legacy/1.15.1)    The Apache Software License, Version 2.0
        org.apache.geode    geode-logging    [1.15.1](https://mvnrepository.com/artifact/org.apache.geode/geode-logging/1.15.1)    The Apache Software License, Version 2.0
            org.apache.geode    geode-common    [1.15.1](https://mvnrepository.com/artifact/org.apache.geode/geode-common/1.15.1)    The Apache Software License, Version 2.0
                com.fasterxml.jackson.core    jackson-databind    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-databind/2.18.4)    The Apache Software License, Version 2.0
                    com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
                    com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
                com.fasterxml.jackson.datatype    jackson-datatype-joda    [2.13.2](https://mvnrepository.com/artifact/com.fasterxml.jackson.datatype/jackson-datatype-joda/2.13.2)    The Apache Software License, Version 2.0
                    com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
                    com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
                    com.fasterxml.jackson.core    jackson-databind    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-databind/2.18.4)    The Apache Software License, Version 2.0
                        com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
                        com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
                    joda-time    joda-time    [2.10.8](https://mvnrepository.com/artifact/joda-time/joda-time/2.10.8)    Apache License, Version 2.0
                com.fasterxml.jackson.datatype    jackson-datatype-jsr310    [2.13.2](https://mvnrepository.com/artifact/com.fasterxml.jackson.datatype/jackson-datatype-jsr310/2.13.2)    The Apache Software License, Version 2.0
                    com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
                    com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
                    com.fasterxml.jackson.core    jackson-databind    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-databind/2.18.4)    The Apache Software License, Version 2.0
                        com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
                        com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
            org.apache.logging.log4j    log4j-api    [2.17.2](https://mvnrepository.com/artifact/org.apache.logging.log4j/log4j-api/2.17.2)    Apache License, Version 2.0
        org.apache.geode    geode-management    [1.15.1](https://mvnrepository.com/artifact/org.apache.geode/geode-management/1.15.1)    The Apache Software License, Version 2.0
            com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
            com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
            com.fasterxml.jackson.core    jackson-databind    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-databind/2.18.4)    The Apache Software License, Version 2.0
                com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
                com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
            commons-io    commons-io    [2.11.0](https://mvnrepository.com/artifact/commons-io/commons-io/2.11.0)    Apache License, Version 2.0
            org.apache.commons    commons-lang3    [3.12.0](https://mvnrepository.com/artifact/org.apache.commons/commons-lang3/3.12.0)    Apache License, Version 2.0
            org.apache.geode    geode-serialization    [1.15.1](https://mvnrepository.com/artifact/org.apache.geode/geode-serialization/1.15.1)    The Apache Software License, Version 2.0
                it.unimi.dsi    fastutil    [8.5.8](https://mvnrepository.com/artifact/it.unimi.dsi/fastutil/8.5.8)    Apache License, Version 2.0
                org.apache.commons    commons-lang3    [3.12.0](https://mvnrepository.com/artifact/org.apache.commons/commons-lang3/3.12.0)    Apache License, Version 2.0
                org.apache.geode    geode-common    [1.15.1](https://mvnrepository.com/artifact/org.apache.geode/geode-common/1.15.1)    The Apache Software License, Version 2.0
                    com.fasterxml.jackson.core    jackson-databind    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-databind/2.18.4)    The Apache Software License, Version 2.0
                        com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
                        com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
                    com.fasterxml.jackson.datatype    jackson-datatype-joda    [2.13.2](https://mvnrepository.com/artifact/com.fasterxml.jackson.datatype/jackson-datatype-joda/2.13.2)    The Apache Software License, Version 2.0
                        com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
                        com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
                        com.fasterxml.jackson.core    jackson-databind    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-databind/2.18.4)    The Apache Software License, Version 2.0
                            com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
                            com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
                        joda-time    joda-time    [2.10.8](https://mvnrepository.com/artifact/joda-time/joda-time/2.10.8)    Apache License, Version 2.0
                    com.fasterxml.jackson.datatype    jackson-datatype-jsr310    [2.13.2](https://mvnrepository.com/artifact/com.fasterxml.jackson.datatype/jackson-datatype-jsr310/2.13.2)    The Apache Software License, Version 2.0
                        com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
                        com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
                        com.fasterxml.jackson.core    jackson-databind    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-databind/2.18.4)    The Apache Software License, Version 2.0
                            com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
                            com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
                org.apache.geode    geode-logging    [1.15.1](https://mvnrepository.com/artifact/org.apache.geode/geode-logging/1.15.1)    The Apache Software License, Version 2.0
                    org.apache.geode    geode-common    [1.15.1](https://mvnrepository.com/artifact/org.apache.geode/geode-common/1.15.1)    The Apache Software License, Version 2.0
                        com.fasterxml.jackson.core    jackson-databind    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-databind/2.18.4)    The Apache Software License, Version 2.0
                            com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
                            com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
                        com.fasterxml.jackson.datatype    jackson-datatype-joda    [2.13.2](https://mvnrepository.com/artifact/com.fasterxml.jackson.datatype/jackson-datatype-joda/2.13.2)    The Apache Software License, Version 2.0
                            com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
                            com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
                            com.fasterxml.jackson.core    jackson-databind    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-databind/2.18.4)    The Apache Software License, Version 2.0
                                com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
                                com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
                            joda-time    joda-time    [2.10.8](https://mvnrepository.com/artifact/joda-time/joda-time/2.10.8)    Apache License, Version 2.0
                        com.fasterxml.jackson.datatype    jackson-datatype-jsr310    [2.13.2](https://mvnrepository.com/artifact/com.fasterxml.jackson.datatype/jackson-datatype-jsr310/2.13.2)    The Apache Software License, Version 2.0
                            com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
                            com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
                            com.fasterxml.jackson.core    jackson-databind    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-databind/2.18.4)    The Apache Software License, Version 2.0
                                com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
                                com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
                    org.apache.logging.log4j    log4j-api    [2.17.2](https://mvnrepository.com/artifact/org.apache.logging.log4j/log4j-api/2.17.2)    Apache License, Version 2.0
                org.apache.logging.log4j    log4j-api    [2.17.2](https://mvnrepository.com/artifact/org.apache.logging.log4j/log4j-api/2.17.2)    Apache License, Version 2.0
            org.apache.httpcomponents    httpclient    [4.5.13](https://mvnrepository.com/artifact/org.apache.httpcomponents/httpclient/4.5.13)    Apache License, Version 2.0
                commons-codec    commons-codec    [1.11](https://mvnrepository.com/artifact/commons-codec/commons-codec/1.11)    Apache License, Version 2.0
                commons-logging    commons-logging    [1.2](https://mvnrepository.com/artifact/commons-logging/commons-logging/1.2)    The Apache Software License, Version 2.0
                org.apache.httpcomponents    httpcore    [4.4.13](https://mvnrepository.com/artifact/org.apache.httpcomponents/httpcore/4.4.13)    Apache License, Version 2.0
            org.springframework    spring-web    [5.3.20](https://mvnrepository.com/artifact/org.springframework/spring-web/5.3.20)    Apache License, Version 2.0
                org.springframework    spring-beans    [5.3.20](https://mvnrepository.com/artifact/org.springframework/spring-beans/5.3.20)    Apache License, Version 2.0
                    org.springframework    spring-core    [5.3.20](https://mvnrepository.com/artifact/org.springframework/spring-core/5.3.20)    Apache License, Version 2.0
                        org.springframework    spring-jcl    [5.3.20](https://mvnrepository.com/artifact/org.springframework/spring-jcl/5.3.20)    Apache License, Version 2.0
                org.springframework    spring-core    [5.3.20](https://mvnrepository.com/artifact/org.springframework/spring-core/5.3.20)    Apache License, Version 2.0
                    org.springframework    spring-jcl    [5.3.20](https://mvnrepository.com/artifact/org.springframework/spring-jcl/5.3.20)    Apache License, Version 2.0
        org.apache.geode    geode-membership    [1.15.1](https://mvnrepository.com/artifact/org.apache.geode/geode-membership/1.15.1)    The Apache Software License, Version 2.0
            commons-validator    commons-validator    [1.7](https://mvnrepository.com/artifact/commons-validator/commons-validator/1.7)    Apache License, Version 2.0
                commons-beanutils    commons-beanutils    [1.9.4](https://mvnrepository.com/artifact/commons-beanutils/commons-beanutils/1.9.4)    Apache License, Version 2.0
                    commons-collections    commons-collections    [3.2.2](https://mvnrepository.com/artifact/commons-collections/commons-collections/3.2.2)    Apache License, Version 2.0
                    commons-logging    commons-logging    [1.2](https://mvnrepository.com/artifact/commons-logging/commons-logging/1.2)    The Apache Software License, Version 2.0
                commons-collections    commons-collections    [3.2.2](https://mvnrepository.com/artifact/commons-collections/commons-collections/3.2.2)    Apache License, Version 2.0
                commons-digester    commons-digester    [2.1](https://mvnrepository.com/artifact/commons-digester/commons-digester/2.1)    The Apache Software License, Version 2.0
                commons-logging    commons-logging    [1.2](https://mvnrepository.com/artifact/commons-logging/commons-logging/1.2)    The Apache Software License, Version 2.0
            it.unimi.dsi    fastutil    [8.5.8](https://mvnrepository.com/artifact/it.unimi.dsi/fastutil/8.5.8)    Apache License, Version 2.0
            org.apache.commons    commons-lang3    [3.12.0](https://mvnrepository.com/artifact/org.apache.commons/commons-lang3/3.12.0)    Apache License, Version 2.0
            org.apache.geode    geode-common    [1.15.1](https://mvnrepository.com/artifact/org.apache.geode/geode-common/1.15.1)    The Apache Software License, Version 2.0
                com.fasterxml.jackson.core    jackson-databind    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-databind/2.18.4)    The Apache Software License, Version 2.0
                    com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
                    com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
                com.fasterxml.jackson.datatype    jackson-datatype-joda    [2.13.2](https://mvnrepository.com/artifact/com.fasterxml.jackson.datatype/jackson-datatype-joda/2.13.2)    The Apache Software License, Version 2.0
                    com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
                    com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
                    com.fasterxml.jackson.core    jackson-databind    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-databind/2.18.4)    The Apache Software License, Version 2.0
                        com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
                        com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
                    joda-time    joda-time    [2.10.8](https://mvnrepository.com/artifact/joda-time/joda-time/2.10.8)    Apache License, Version 2.0
                com.fasterxml.jackson.datatype    jackson-datatype-jsr310    [2.13.2](https://mvnrepository.com/artifact/com.fasterxml.jackson.datatype/jackson-datatype-jsr310/2.13.2)    The Apache Software License, Version 2.0
                    com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
                    com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
                    com.fasterxml.jackson.core    jackson-databind    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-databind/2.18.4)    The Apache Software License, Version 2.0
                        com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
                        com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
            org.apache.geode    geode-logging    [1.15.1](https://mvnrepository.com/artifact/org.apache.geode/geode-logging/1.15.1)    The Apache Software License, Version 2.0
                org.apache.geode    geode-common    [1.15.1](https://mvnrepository.com/artifact/org.apache.geode/geode-common/1.15.1)    The Apache Software License, Version 2.0
                    com.fasterxml.jackson.core    jackson-databind    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-databind/2.18.4)    The Apache Software License, Version 2.0
                        com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
                        com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
                    com.fasterxml.jackson.datatype    jackson-datatype-joda    [2.13.2](https://mvnrepository.com/artifact/com.fasterxml.jackson.datatype/jackson-datatype-joda/2.13.2)    The Apache Software License, Version 2.0
                        com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
                        com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
                        com.fasterxml.jackson.core    jackson-databind    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-databind/2.18.4)    The Apache Software License, Version 2.0
                            com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
                            com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
                        joda-time    joda-time    [2.10.8](https://mvnrepository.com/artifact/joda-time/joda-time/2.10.8)    Apache License, Version 2.0
                    com.fasterxml.jackson.datatype    jackson-datatype-jsr310    [2.13.2](https://mvnrepository.com/artifact/com.fasterxml.jackson.datatype/jackson-datatype-jsr310/2.13.2)    The Apache Software License, Version 2.0
                        com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
                        com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
                        com.fasterxml.jackson.core    jackson-databind    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-databind/2.18.4)    The Apache Software License, Version 2.0
                            com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
                            com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
                org.apache.logging.log4j    log4j-api    [2.17.2](https://mvnrepository.com/artifact/org.apache.logging.log4j/log4j-api/2.17.2)    Apache License, Version 2.0
            org.apache.geode    geode-serialization    [1.15.1](https://mvnrepository.com/artifact/org.apache.geode/geode-serialization/1.15.1)    The Apache Software License, Version 2.0
                it.unimi.dsi    fastutil    [8.5.8](https://mvnrepository.com/artifact/it.unimi.dsi/fastutil/8.5.8)    Apache License, Version 2.0
                org.apache.commons    commons-lang3    [3.12.0](https://mvnrepository.com/artifact/org.apache.commons/commons-lang3/3.12.0)    Apache License, Version 2.0
                org.apache.geode    geode-common    [1.15.1](https://mvnrepository.com/artifact/org.apache.geode/geode-common/1.15.1)    The Apache Software License, Version 2.0
                    com.fasterxml.jackson.core    jackson-databind    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-databind/2.18.4)    The Apache Software License, Version 2.0
                        com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
                        com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
                    com.fasterxml.jackson.datatype    jackson-datatype-joda    [2.13.2](https://mvnrepository.com/artifact/com.fasterxml.jackson.datatype/jackson-datatype-joda/2.13.2)    The Apache Software License, Version 2.0
                        com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
                        com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
                        com.fasterxml.jackson.core    jackson-databind    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-databind/2.18.4)    The Apache Software License, Version 2.0
                            com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
                            com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
                        joda-time    joda-time    [2.10.8](https://mvnrepository.com/artifact/joda-time/joda-time/2.10.8)    Apache License, Version 2.0
                    com.fasterxml.jackson.datatype    jackson-datatype-jsr310    [2.13.2](https://mvnrepository.com/artifact/com.fasterxml.jackson.datatype/jackson-datatype-jsr310/2.13.2)    The Apache Software License, Version 2.0
                        com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
                        com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
                        com.fasterxml.jackson.core    jackson-databind    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-databind/2.18.4)    The Apache Software License, Version 2.0
                            com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
                            com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
                org.apache.geode    geode-logging    [1.15.1](https://mvnrepository.com/artifact/org.apache.geode/geode-logging/1.15.1)    The Apache Software License, Version 2.0
                    org.apache.geode    geode-common    [1.15.1](https://mvnrepository.com/artifact/org.apache.geode/geode-common/1.15.1)    The Apache Software License, Version 2.0
                        com.fasterxml.jackson.core    jackson-databind    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-databind/2.18.4)    The Apache Software License, Version 2.0
                            com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
                            com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
                        com.fasterxml.jackson.datatype    jackson-datatype-joda    [2.13.2](https://mvnrepository.com/artifact/com.fasterxml.jackson.datatype/jackson-datatype-joda/2.13.2)    The Apache Software License, Version 2.0
                            com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
                            com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
                            com.fasterxml.jackson.core    jackson-databind    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-databind/2.18.4)    The Apache Software License, Version 2.0
                                com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
                                com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
                            joda-time    joda-time    [2.10.8](https://mvnrepository.com/artifact/joda-time/joda-time/2.10.8)    Apache License, Version 2.0
                        com.fasterxml.jackson.datatype    jackson-datatype-jsr310    [2.13.2](https://mvnrepository.com/artifact/com.fasterxml.jackson.datatype/jackson-datatype-jsr310/2.13.2)    The Apache Software License, Version 2.0
                            com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
                            com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
                            com.fasterxml.jackson.core    jackson-databind    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-databind/2.18.4)    The Apache Software License, Version 2.0
                                com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
                                com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
                    org.apache.logging.log4j    log4j-api    [2.17.2](https://mvnrepository.com/artifact/org.apache.logging.log4j/log4j-api/2.17.2)    Apache License, Version 2.0
                org.apache.logging.log4j    log4j-api    [2.17.2](https://mvnrepository.com/artifact/org.apache.logging.log4j/log4j-api/2.17.2)    Apache License, Version 2.0
            org.apache.geode    geode-tcp-server    [1.15.1](https://mvnrepository.com/artifact/org.apache.geode/geode-tcp-server/1.15.1)    The Apache Software License, Version 2.0
                commons-validator    commons-validator    [1.7](https://mvnrepository.com/artifact/commons-validator/commons-validator/1.7)    Apache License, Version 2.0
                    commons-beanutils    commons-beanutils    [1.9.4](https://mvnrepository.com/artifact/commons-beanutils/commons-beanutils/1.9.4)    Apache License, Version 2.0
                        commons-collections    commons-collections    [3.2.2](https://mvnrepository.com/artifact/commons-collections/commons-collections/3.2.2)    Apache License, Version 2.0
                        commons-logging    commons-logging    [1.2](https://mvnrepository.com/artifact/commons-logging/commons-logging/1.2)    The Apache Software License, Version 2.0
                    commons-collections    commons-collections    [3.2.2](https://mvnrepository.com/artifact/commons-collections/commons-collections/3.2.2)    Apache License, Version 2.0
                    commons-digester    commons-digester    [2.1](https://mvnrepository.com/artifact/commons-digester/commons-digester/2.1)    The Apache Software License, Version 2.0
                    commons-logging    commons-logging    [1.2](https://mvnrepository.com/artifact/commons-logging/commons-logging/1.2)    The Apache Software License, Version 2.0
                org.apache.geode    geode-common    [1.15.1](https://mvnrepository.com/artifact/org.apache.geode/geode-common/1.15.1)    The Apache Software License, Version 2.0
                    com.fasterxml.jackson.core    jackson-databind    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-databind/2.18.4)    The Apache Software License, Version 2.0
                        com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
                        com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
                    com.fasterxml.jackson.datatype    jackson-datatype-joda    [2.13.2](https://mvnrepository.com/artifact/com.fasterxml.jackson.datatype/jackson-datatype-joda/2.13.2)    The Apache Software License, Version 2.0
                        com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
                        com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
                        com.fasterxml.jackson.core    jackson-databind    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-databind/2.18.4)    The Apache Software License, Version 2.0
                            com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
                            com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
                        joda-time    joda-time    [2.10.8](https://mvnrepository.com/artifact/joda-time/joda-time/2.10.8)    Apache License, Version 2.0
                    com.fasterxml.jackson.datatype    jackson-datatype-jsr310    [2.13.2](https://mvnrepository.com/artifact/com.fasterxml.jackson.datatype/jackson-datatype-jsr310/2.13.2)    The Apache Software License, Version 2.0
                        com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
                        com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
                        com.fasterxml.jackson.core    jackson-databind    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-databind/2.18.4)    The Apache Software License, Version 2.0
                            com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
                            com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
                org.apache.geode    geode-logging    [1.15.1](https://mvnrepository.com/artifact/org.apache.geode/geode-logging/1.15.1)    The Apache Software License, Version 2.0
                    org.apache.geode    geode-common    [1.15.1](https://mvnrepository.com/artifact/org.apache.geode/geode-common/1.15.1)    The Apache Software License, Version 2.0
                        com.fasterxml.jackson.core    jackson-databind    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-databind/2.18.4)    The Apache Software License, Version 2.0
                            com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
                            com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
                        com.fasterxml.jackson.datatype    jackson-datatype-joda    [2.13.2](https://mvnrepository.com/artifact/com.fasterxml.jackson.datatype/jackson-datatype-joda/2.13.2)    The Apache Software License, Version 2.0
                            com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
                            com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
                            com.fasterxml.jackson.core    jackson-databind    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-databind/2.18.4)    The Apache Software License, Version 2.0
                                com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
                                com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
                            joda-time    joda-time    [2.10.8](https://mvnrepository.com/artifact/joda-time/joda-time/2.10.8)    Apache License, Version 2.0
                        com.fasterxml.jackson.datatype    jackson-datatype-jsr310    [2.13.2](https://mvnrepository.com/artifact/com.fasterxml.jackson.datatype/jackson-datatype-jsr310/2.13.2)    The Apache Software License, Version 2.0
                            com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
                            com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
                            com.fasterxml.jackson.core    jackson-databind    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-databind/2.18.4)    The Apache Software License, Version 2.0
                                com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
                                com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
                    org.apache.logging.log4j    log4j-api    [2.17.2](https://mvnrepository.com/artifact/org.apache.logging.log4j/log4j-api/2.17.2)    Apache License, Version 2.0
                org.apache.geode    geode-serialization    [1.15.1](https://mvnrepository.com/artifact/org.apache.geode/geode-serialization/1.15.1)    The Apache Software License, Version 2.0
                    it.unimi.dsi    fastutil    [8.5.8](https://mvnrepository.com/artifact/it.unimi.dsi/fastutil/8.5.8)    Apache License, Version 2.0
                    org.apache.commons    commons-lang3    [3.12.0](https://mvnrepository.com/artifact/org.apache.commons/commons-lang3/3.12.0)    Apache License, Version 2.0
                    org.apache.geode    geode-common    [1.15.1](https://mvnrepository.com/artifact/org.apache.geode/geode-common/1.15.1)    The Apache Software License, Version 2.0
                        com.fasterxml.jackson.core    jackson-databind    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-databind/2.18.4)    The Apache Software License, Version 2.0
                            com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
                            com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
                        com.fasterxml.jackson.datatype    jackson-datatype-joda    [2.13.2](https://mvnrepository.com/artifact/com.fasterxml.jackson.datatype/jackson-datatype-joda/2.13.2)    The Apache Software License, Version 2.0
                            com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
                            com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
                            com.fasterxml.jackson.core    jackson-databind    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-databind/2.18.4)    The Apache Software License, Version 2.0
                                com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
                                com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
                            joda-time    joda-time    [2.10.8](https://mvnrepository.com/artifact/joda-time/joda-time/2.10.8)    Apache License, Version 2.0
                        com.fasterxml.jackson.datatype    jackson-datatype-jsr310    [2.13.2](https://mvnrepository.com/artifact/com.fasterxml.jackson.datatype/jackson-datatype-jsr310/2.13.2)    The Apache Software License, Version 2.0
                            com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
                            com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
                            com.fasterxml.jackson.core    jackson-databind    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-databind/2.18.4)    The Apache Software License, Version 2.0
                                com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
                                com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
                    org.apache.geode    geode-logging    [1.15.1](https://mvnrepository.com/artifact/org.apache.geode/geode-logging/1.15.1)    The Apache Software License, Version 2.0
                        org.apache.geode    geode-common    [1.15.1](https://mvnrepository.com/artifact/org.apache.geode/geode-common/1.15.1)    The Apache Software License, Version 2.0
                            com.fasterxml.jackson.core    jackson-databind    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-databind/2.18.4)    The Apache Software License, Version 2.0
                                com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
                                com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
                            com.fasterxml.jackson.datatype    jackson-datatype-joda    [2.13.2](https://mvnrepository.com/artifact/com.fasterxml.jackson.datatype/jackson-datatype-joda/2.13.2)    The Apache Software License, Version 2.0
                                com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
                                com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
                                com.fasterxml.jackson.core    jackson-databind    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-databind/2.18.4)    The Apache Software License, Version 2.0
                                    com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
                                    com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
                                joda-time    joda-time    [2.10.8](https://mvnrepository.com/artifact/joda-time/joda-time/2.10.8)    Apache License, Version 2.0
                            com.fasterxml.jackson.datatype    jackson-datatype-jsr310    [2.13.2](https://mvnrepository.com/artifact/com.fasterxml.jackson.datatype/jackson-datatype-jsr310/2.13.2)    The Apache Software License, Version 2.0
                                com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
                                com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
                                com.fasterxml.jackson.core    jackson-databind    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-databind/2.18.4)    The Apache Software License, Version 2.0
                                    com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
                                    com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
                        org.apache.logging.log4j    log4j-api    [2.17.2](https://mvnrepository.com/artifact/org.apache.logging.log4j/log4j-api/2.17.2)    Apache License, Version 2.0
                    org.apache.logging.log4j    log4j-api    [2.17.2](https://mvnrepository.com/artifact/org.apache.logging.log4j/log4j-api/2.17.2)    Apache License, Version 2.0
                org.apache.logging.log4j    log4j-api    [2.17.2](https://mvnrepository.com/artifact/org.apache.logging.log4j/log4j-api/2.17.2)    Apache License, Version 2.0
            org.apache.logging.log4j    log4j-api    [2.17.2](https://mvnrepository.com/artifact/org.apache.logging.log4j/log4j-api/2.17.2)    Apache License, Version 2.0
            org.jgroups    jgroups    [3.6.14.Final](https://mvnrepository.com/artifact/org.jgroups/jgroups/3.6.14.Final)    Apache License 2.0
        org.apache.geode    geode-serialization    [1.15.1](https://mvnrepository.com/artifact/org.apache.geode/geode-serialization/1.15.1)    The Apache Software License, Version 2.0
            it.unimi.dsi    fastutil    [8.5.8](https://mvnrepository.com/artifact/it.unimi.dsi/fastutil/8.5.8)    Apache License, Version 2.0
            org.apache.commons    commons-lang3    [3.12.0](https://mvnrepository.com/artifact/org.apache.commons/commons-lang3/3.12.0)    Apache License, Version 2.0
            org.apache.geode    geode-common    [1.15.1](https://mvnrepository.com/artifact/org.apache.geode/geode-common/1.15.1)    The Apache Software License, Version 2.0
                com.fasterxml.jackson.core    jackson-databind    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-databind/2.18.4)    The Apache Software License, Version 2.0
                    com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
                    com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
                com.fasterxml.jackson.datatype    jackson-datatype-joda    [2.13.2](https://mvnrepository.com/artifact/com.fasterxml.jackson.datatype/jackson-datatype-joda/2.13.2)    The Apache Software License, Version 2.0
                    com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
                    com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
                    com.fasterxml.jackson.core    jackson-databind    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-databind/2.18.4)    The Apache Software License, Version 2.0
                        com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
                        com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
                    joda-time    joda-time    [2.10.8](https://mvnrepository.com/artifact/joda-time/joda-time/2.10.8)    Apache License, Version 2.0
                com.fasterxml.jackson.datatype    jackson-datatype-jsr310    [2.13.2](https://mvnrepository.com/artifact/com.fasterxml.jackson.datatype/jackson-datatype-jsr310/2.13.2)    The Apache Software License, Version 2.0
                    com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
                    com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
                    com.fasterxml.jackson.core    jackson-databind    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-databind/2.18.4)    The Apache Software License, Version 2.0
                        com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
                        com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
            org.apache.geode    geode-logging    [1.15.1](https://mvnrepository.com/artifact/org.apache.geode/geode-logging/1.15.1)    The Apache Software License, Version 2.0
                org.apache.geode    geode-common    [1.15.1](https://mvnrepository.com/artifact/org.apache.geode/geode-common/1.15.1)    The Apache Software License, Version 2.0
                    com.fasterxml.jackson.core    jackson-databind    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-databind/2.18.4)    The Apache Software License, Version 2.0
                        com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
                        com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
                    com.fasterxml.jackson.datatype    jackson-datatype-joda    [2.13.2](https://mvnrepository.com/artifact/com.fasterxml.jackson.datatype/jackson-datatype-joda/2.13.2)    The Apache Software License, Version 2.0
                        com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
                        com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
                        com.fasterxml.jackson.core    jackson-databind    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-databind/2.18.4)    The Apache Software License, Version 2.0
                            com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
                            com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
                        joda-time    joda-time    [2.10.8](https://mvnrepository.com/artifact/joda-time/joda-time/2.10.8)    Apache License, Version 2.0
                    com.fasterxml.jackson.datatype    jackson-datatype-jsr310    [2.13.2](https://mvnrepository.com/artifact/com.fasterxml.jackson.datatype/jackson-datatype-jsr310/2.13.2)    The Apache Software License, Version 2.0
                        com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
                        com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
                        com.fasterxml.jackson.core    jackson-databind    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-databind/2.18.4)    The Apache Software License, Version 2.0
                            com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
                            com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
                org.apache.logging.log4j    log4j-api    [2.17.2](https://mvnrepository.com/artifact/org.apache.logging.log4j/log4j-api/2.17.2)    Apache License, Version 2.0
            org.apache.logging.log4j    log4j-api    [2.17.2](https://mvnrepository.com/artifact/org.apache.logging.log4j/log4j-api/2.17.2)    Apache License, Version 2.0
        org.apache.geode    geode-tcp-server    [1.15.1](https://mvnrepository.com/artifact/org.apache.geode/geode-tcp-server/1.15.1)    The Apache Software License, Version 2.0
            commons-validator    commons-validator    [1.7](https://mvnrepository.com/artifact/commons-validator/commons-validator/1.7)    Apache License, Version 2.0
                commons-beanutils    commons-beanutils    [1.9.4](https://mvnrepository.com/artifact/commons-beanutils/commons-beanutils/1.9.4)    Apache License, Version 2.0
                    commons-collections    commons-collections    [3.2.2](https://mvnrepository.com/artifact/commons-collections/commons-collections/3.2.2)    Apache License, Version 2.0
                    commons-logging    commons-logging    [1.2](https://mvnrepository.com/artifact/commons-logging/commons-logging/1.2)    The Apache Software License, Version 2.0
                commons-collections    commons-collections    [3.2.2](https://mvnrepository.com/artifact/commons-collections/commons-collections/3.2.2)    Apache License, Version 2.0
                commons-digester    commons-digester    [2.1](https://mvnrepository.com/artifact/commons-digester/commons-digester/2.1)    The Apache Software License, Version 2.0
                commons-logging    commons-logging    [1.2](https://mvnrepository.com/artifact/commons-logging/commons-logging/1.2)    The Apache Software License, Version 2.0
            org.apache.geode    geode-common    [1.15.1](https://mvnrepository.com/artifact/org.apache.geode/geode-common/1.15.1)    The Apache Software License, Version 2.0
                com.fasterxml.jackson.core    jackson-databind    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-databind/2.18.4)    The Apache Software License, Version 2.0
                    com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
                    com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
                com.fasterxml.jackson.datatype    jackson-datatype-joda    [2.13.2](https://mvnrepository.com/artifact/com.fasterxml.jackson.datatype/jackson-datatype-joda/2.13.2)    The Apache Software License, Version 2.0
                    com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
                    com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
                    com.fasterxml.jackson.core    jackson-databind    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-databind/2.18.4)    The Apache Software License, Version 2.0
                        com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
                        com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
                    joda-time    joda-time    [2.10.8](https://mvnrepository.com/artifact/joda-time/joda-time/2.10.8)    Apache License, Version 2.0
                com.fasterxml.jackson.datatype    jackson-datatype-jsr310    [2.13.2](https://mvnrepository.com/artifact/com.fasterxml.jackson.datatype/jackson-datatype-jsr310/2.13.2)    The Apache Software License, Version 2.0
                    com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
                    com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
                    com.fasterxml.jackson.core    jackson-databind    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-databind/2.18.4)    The Apache Software License, Version 2.0
                        com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
                        com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
            org.apache.geode    geode-logging    [1.15.1](https://mvnrepository.com/artifact/org.apache.geode/geode-logging/1.15.1)    The Apache Software License, Version 2.0
                org.apache.geode    geode-common    [1.15.1](https://mvnrepository.com/artifact/org.apache.geode/geode-common/1.15.1)    The Apache Software License, Version 2.0
                    com.fasterxml.jackson.core    jackson-databind    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-databind/2.18.4)    The Apache Software License, Version 2.0
                        com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
                        com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
                    com.fasterxml.jackson.datatype    jackson-datatype-joda    [2.13.2](https://mvnrepository.com/artifact/com.fasterxml.jackson.datatype/jackson-datatype-joda/2.13.2)    The Apache Software License, Version 2.0
                        com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
                        com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
                        com.fasterxml.jackson.core    jackson-databind    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-databind/2.18.4)    The Apache Software License, Version 2.0
                            com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
                            com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
                        joda-time    joda-time    [2.10.8](https://mvnrepository.com/artifact/joda-time/joda-time/2.10.8)    Apache License, Version 2.0
                    com.fasterxml.jackson.datatype    jackson-datatype-jsr310    [2.13.2](https://mvnrepository.com/artifact/com.fasterxml.jackson.datatype/jackson-datatype-jsr310/2.13.2)    The Apache Software License, Version 2.0
                        com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
                        com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
                        com.fasterxml.jackson.core    jackson-databind    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-databind/2.18.4)    The Apache Software License, Version 2.0
                            com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
                            com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
                org.apache.logging.log4j    log4j-api    [2.17.2](https://mvnrepository.com/artifact/org.apache.logging.log4j/log4j-api/2.17.2)    Apache License, Version 2.0
            org.apache.geode    geode-serialization    [1.15.1](https://mvnrepository.com/artifact/org.apache.geode/geode-serialization/1.15.1)    The Apache Software License, Version 2.0
                it.unimi.dsi    fastutil    [8.5.8](https://mvnrepository.com/artifact/it.unimi.dsi/fastutil/8.5.8)    Apache License, Version 2.0
                org.apache.commons    commons-lang3    [3.12.0](https://mvnrepository.com/artifact/org.apache.commons/commons-lang3/3.12.0)    Apache License, Version 2.0
                org.apache.geode    geode-common    [1.15.1](https://mvnrepository.com/artifact/org.apache.geode/geode-common/1.15.1)    The Apache Software License, Version 2.0
                    com.fasterxml.jackson.core    jackson-databind    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-databind/2.18.4)    The Apache Software License, Version 2.0
                        com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
                        com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
                    com.fasterxml.jackson.datatype    jackson-datatype-joda    [2.13.2](https://mvnrepository.com/artifact/com.fasterxml.jackson.datatype/jackson-datatype-joda/2.13.2)    The Apache Software License, Version 2.0
                        com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
                        com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
                        com.fasterxml.jackson.core    jackson-databind    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-databind/2.18.4)    The Apache Software License, Version 2.0
                            com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
                            com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
                        joda-time    joda-time    [2.10.8](https://mvnrepository.com/artifact/joda-time/joda-time/2.10.8)    Apache License, Version 2.0
                    com.fasterxml.jackson.datatype    jackson-datatype-jsr310    [2.13.2](https://mvnrepository.com/artifact/com.fasterxml.jackson.datatype/jackson-datatype-jsr310/2.13.2)    The Apache Software License, Version 2.0
                        com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
                        com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
                        com.fasterxml.jackson.core    jackson-databind    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-databind/2.18.4)    The Apache Software License, Version 2.0
                            com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
                            com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
                org.apache.geode    geode-logging    [1.15.1](https://mvnrepository.com/artifact/org.apache.geode/geode-logging/1.15.1)    The Apache Software License, Version 2.0
                    org.apache.geode    geode-common    [1.15.1](https://mvnrepository.com/artifact/org.apache.geode/geode-common/1.15.1)    The Apache Software License, Version 2.0
                        com.fasterxml.jackson.core    jackson-databind    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-databind/2.18.4)    The Apache Software License, Version 2.0
                            com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
                            com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
                        com.fasterxml.jackson.datatype    jackson-datatype-joda    [2.13.2](https://mvnrepository.com/artifact/com.fasterxml.jackson.datatype/jackson-datatype-joda/2.13.2)    The Apache Software License, Version 2.0
                            com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
                            com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
                            com.fasterxml.jackson.core    jackson-databind    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-databind/2.18.4)    The Apache Software License, Version 2.0
                                com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
                                com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
                            joda-time    joda-time    [2.10.8](https://mvnrepository.com/artifact/joda-time/joda-time/2.10.8)    Apache License, Version 2.0
                        com.fasterxml.jackson.datatype    jackson-datatype-jsr310    [2.13.2](https://mvnrepository.com/artifact/com.fasterxml.jackson.datatype/jackson-datatype-jsr310/2.13.2)    The Apache Software License, Version 2.0
                            com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
                            com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
                            com.fasterxml.jackson.core    jackson-databind    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-databind/2.18.4)    The Apache Software License, Version 2.0
                                com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
                                com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
                    org.apache.logging.log4j    log4j-api    [2.17.2](https://mvnrepository.com/artifact/org.apache.logging.log4j/log4j-api/2.17.2)    Apache License, Version 2.0
                org.apache.logging.log4j    log4j-api    [2.17.2](https://mvnrepository.com/artifact/org.apache.logging.log4j/log4j-api/2.17.2)    Apache License, Version 2.0
            org.apache.logging.log4j    log4j-api    [2.17.2](https://mvnrepository.com/artifact/org.apache.logging.log4j/log4j-api/2.17.2)    Apache License, Version 2.0
        org.apache.geode    geode-unsafe    [1.15.1](https://mvnrepository.com/artifact/org.apache.geode/geode-unsafe/1.15.1)    The Apache Software License, Version 2.0
        org.apache.logging.log4j    log4j-api    [2.17.2](https://mvnrepository.com/artifact/org.apache.logging.log4j/log4j-api/2.17.2)    Apache License, Version 2.0
        org.apache.shiro    shiro-core    [1.9.1](https://mvnrepository.com/artifact/org.apache.shiro/shiro-core/1.9.1)    Apache License, Version 2.0
            org.apache.shiro    shiro-cache    [1.9.1](https://mvnrepository.com/artifact/org.apache.shiro/shiro-cache/1.9.1)    Apache License, Version 2.0
                org.apache.shiro    shiro-lang    [1.9.1](https://mvnrepository.com/artifact/org.apache.shiro/shiro-lang/1.9.1)    Apache License, Version 2.0
                    org.slf4j    slf4j-api    [1.7.36](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/1.7.36)    MIT License
            org.apache.shiro    shiro-config-core    [1.9.1](https://mvnrepository.com/artifact/org.apache.shiro/shiro-config-core/1.9.1)    Apache License, Version 2.0
                org.apache.shiro    shiro-lang    [1.9.1](https://mvnrepository.com/artifact/org.apache.shiro/shiro-lang/1.9.1)    Apache License, Version 2.0
                    org.slf4j    slf4j-api    [1.7.36](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/1.7.36)    MIT License
            org.apache.shiro    shiro-config-ogdl    [1.9.1](https://mvnrepository.com/artifact/org.apache.shiro/shiro-config-ogdl/1.9.1)    Apache License, Version 2.0
                commons-beanutils    commons-beanutils    [1.9.4](https://mvnrepository.com/artifact/commons-beanutils/commons-beanutils/1.9.4)    Apache License, Version 2.0
                    commons-collections    commons-collections    [3.2.2](https://mvnrepository.com/artifact/commons-collections/commons-collections/3.2.2)    Apache License, Version 2.0
                    commons-logging    commons-logging    [1.2](https://mvnrepository.com/artifact/commons-logging/commons-logging/1.2)    The Apache Software License, Version 2.0
                org.apache.shiro    shiro-config-core    [1.9.1](https://mvnrepository.com/artifact/org.apache.shiro/shiro-config-core/1.9.1)    Apache License, Version 2.0
                    org.apache.shiro    shiro-lang    [1.9.1](https://mvnrepository.com/artifact/org.apache.shiro/shiro-lang/1.9.1)    Apache License, Version 2.0
                        org.slf4j    slf4j-api    [1.7.36](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/1.7.36)    MIT License
                org.apache.shiro    shiro-event    [1.9.1](https://mvnrepository.com/artifact/org.apache.shiro/shiro-event/1.9.1)    Apache License, Version 2.0
                    org.apache.shiro    shiro-lang    [1.9.1](https://mvnrepository.com/artifact/org.apache.shiro/shiro-lang/1.9.1)    Apache License, Version 2.0
                        org.slf4j    slf4j-api    [1.7.36](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/1.7.36)    MIT License
                org.apache.shiro    shiro-lang    [1.9.1](https://mvnrepository.com/artifact/org.apache.shiro/shiro-lang/1.9.1)    Apache License, Version 2.0
                    org.slf4j    slf4j-api    [1.7.36](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/1.7.36)    MIT License
                org.slf4j    slf4j-api    [1.7.36](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/1.7.36)    MIT License
            org.apache.shiro    shiro-crypto-cipher    [1.9.1](https://mvnrepository.com/artifact/org.apache.shiro/shiro-crypto-cipher/1.9.1)    Apache License, Version 2.0
                org.apache.shiro    shiro-crypto-core    [1.9.1](https://mvnrepository.com/artifact/org.apache.shiro/shiro-crypto-core/1.9.1)    Apache License, Version 2.0
                    org.apache.shiro    shiro-lang    [1.9.1](https://mvnrepository.com/artifact/org.apache.shiro/shiro-lang/1.9.1)    Apache License, Version 2.0
                        org.slf4j    slf4j-api    [1.7.36](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/1.7.36)    MIT License
                org.apache.shiro    shiro-lang    [1.9.1](https://mvnrepository.com/artifact/org.apache.shiro/shiro-lang/1.9.1)    Apache License, Version 2.0
                    org.slf4j    slf4j-api    [1.7.36](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/1.7.36)    MIT License
            org.apache.shiro    shiro-crypto-hash    [1.9.1](https://mvnrepository.com/artifact/org.apache.shiro/shiro-crypto-hash/1.9.1)    Apache License, Version 2.0
                org.apache.shiro    shiro-crypto-core    [1.9.1](https://mvnrepository.com/artifact/org.apache.shiro/shiro-crypto-core/1.9.1)    Apache License, Version 2.0
                    org.apache.shiro    shiro-lang    [1.9.1](https://mvnrepository.com/artifact/org.apache.shiro/shiro-lang/1.9.1)    Apache License, Version 2.0
                        org.slf4j    slf4j-api    [1.7.36](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/1.7.36)    MIT License
                org.apache.shiro    shiro-lang    [1.9.1](https://mvnrepository.com/artifact/org.apache.shiro/shiro-lang/1.9.1)    Apache License, Version 2.0
                    org.slf4j    slf4j-api    [1.7.36](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/1.7.36)    MIT License
            org.apache.shiro    shiro-event    [1.9.1](https://mvnrepository.com/artifact/org.apache.shiro/shiro-event/1.9.1)    Apache License, Version 2.0
                org.apache.shiro    shiro-lang    [1.9.1](https://mvnrepository.com/artifact/org.apache.shiro/shiro-lang/1.9.1)    Apache License, Version 2.0
                    org.slf4j    slf4j-api    [1.7.36](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/1.7.36)    MIT License
            org.apache.shiro    shiro-lang    [1.9.1](https://mvnrepository.com/artifact/org.apache.shiro/shiro-lang/1.9.1)    Apache License, Version 2.0
                org.slf4j    slf4j-api    [1.7.36](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/1.7.36)    MIT License
        org.jgroups    jgroups    [3.6.14.Final](https://mvnrepository.com/artifact/org.jgroups/jgroups/3.6.14.Final)    Apache License 2.0
    org.apache.geode    geode-logging    [1.15.1](https://mvnrepository.com/artifact/org.apache.geode/geode-logging/1.15.1)    The Apache Software License, Version 2.0
        org.apache.geode    geode-common    [1.15.1](https://mvnrepository.com/artifact/org.apache.geode/geode-common/1.15.1)    The Apache Software License, Version 2.0
            com.fasterxml.jackson.core    jackson-databind    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-databind/2.18.4)    The Apache Software License, Version 2.0
                com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
                com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
            com.fasterxml.jackson.datatype    jackson-datatype-joda    [2.13.2](https://mvnrepository.com/artifact/com.fasterxml.jackson.datatype/jackson-datatype-joda/2.13.2)    The Apache Software License, Version 2.0
                com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
                com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
                com.fasterxml.jackson.core    jackson-databind    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-databind/2.18.4)    The Apache Software License, Version 2.0
                    com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
                    com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
                joda-time    joda-time    [2.10.8](https://mvnrepository.com/artifact/joda-time/joda-time/2.10.8)    Apache License, Version 2.0
            com.fasterxml.jackson.datatype    jackson-datatype-jsr310    [2.13.2](https://mvnrepository.com/artifact/com.fasterxml.jackson.datatype/jackson-datatype-jsr310/2.13.2)    The Apache Software License, Version 2.0
                com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
                com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
                com.fasterxml.jackson.core    jackson-databind    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-databind/2.18.4)    The Apache Software License, Version 2.0
                    com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
                    com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
        org.apache.logging.log4j    log4j-api    [2.17.2](https://mvnrepository.com/artifact/org.apache.logging.log4j/log4j-api/2.17.2)    Apache License, Version 2.0
    org.apache.geode    geode-membership    [1.15.1](https://mvnrepository.com/artifact/org.apache.geode/geode-membership/1.15.1)    The Apache Software License, Version 2.0
        commons-validator    commons-validator    [1.7](https://mvnrepository.com/artifact/commons-validator/commons-validator/1.7)    Apache License, Version 2.0
            commons-beanutils    commons-beanutils    [1.9.4](https://mvnrepository.com/artifact/commons-beanutils/commons-beanutils/1.9.4)    Apache License, Version 2.0
                commons-collections    commons-collections    [3.2.2](https://mvnrepository.com/artifact/commons-collections/commons-collections/3.2.2)    Apache License, Version 2.0
                commons-logging    commons-logging    [1.2](https://mvnrepository.com/artifact/commons-logging/commons-logging/1.2)    The Apache Software License, Version 2.0
            commons-collections    commons-collections    [3.2.2](https://mvnrepository.com/artifact/commons-collections/commons-collections/3.2.2)    Apache License, Version 2.0
            commons-digester    commons-digester    [2.1](https://mvnrepository.com/artifact/commons-digester/commons-digester/2.1)    The Apache Software License, Version 2.0
            commons-logging    commons-logging    [1.2](https://mvnrepository.com/artifact/commons-logging/commons-logging/1.2)    The Apache Software License, Version 2.0
        it.unimi.dsi    fastutil    [8.5.8](https://mvnrepository.com/artifact/it.unimi.dsi/fastutil/8.5.8)    Apache License, Version 2.0
        org.apache.commons    commons-lang3    [3.12.0](https://mvnrepository.com/artifact/org.apache.commons/commons-lang3/3.12.0)    Apache License, Version 2.0
        org.apache.geode    geode-common    [1.15.1](https://mvnrepository.com/artifact/org.apache.geode/geode-common/1.15.1)    The Apache Software License, Version 2.0
            com.fasterxml.jackson.core    jackson-databind    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-databind/2.18.4)    The Apache Software License, Version 2.0
                com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
                com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
            com.fasterxml.jackson.datatype    jackson-datatype-joda    [2.13.2](https://mvnrepository.com/artifact/com.fasterxml.jackson.datatype/jackson-datatype-joda/2.13.2)    The Apache Software License, Version 2.0
                com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
                com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
                com.fasterxml.jackson.core    jackson-databind    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-databind/2.18.4)    The Apache Software License, Version 2.0
                    com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
                    com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
                joda-time    joda-time    [2.10.8](https://mvnrepository.com/artifact/joda-time/joda-time/2.10.8)    Apache License, Version 2.0
            com.fasterxml.jackson.datatype    jackson-datatype-jsr310    [2.13.2](https://mvnrepository.com/artifact/com.fasterxml.jackson.datatype/jackson-datatype-jsr310/2.13.2)    The Apache Software License, Version 2.0
                com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
                com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
                com.fasterxml.jackson.core    jackson-databind    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-databind/2.18.4)    The Apache Software License, Version 2.0
                    com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
                    com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
        org.apache.geode    geode-logging    [1.15.1](https://mvnrepository.com/artifact/org.apache.geode/geode-logging/1.15.1)    The Apache Software License, Version 2.0
            org.apache.geode    geode-common    [1.15.1](https://mvnrepository.com/artifact/org.apache.geode/geode-common/1.15.1)    The Apache Software License, Version 2.0
                com.fasterxml.jackson.core    jackson-databind    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-databind/2.18.4)    The Apache Software License, Version 2.0
                    com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
                    com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
                com.fasterxml.jackson.datatype    jackson-datatype-joda    [2.13.2](https://mvnrepository.com/artifact/com.fasterxml.jackson.datatype/jackson-datatype-joda/2.13.2)    The Apache Software License, Version 2.0
                    com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
                    com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
                    com.fasterxml.jackson.core    jackson-databind    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-databind/2.18.4)    The Apache Software License, Version 2.0
                        com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
                        com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
                    joda-time    joda-time    [2.10.8](https://mvnrepository.com/artifact/joda-time/joda-time/2.10.8)    Apache License, Version 2.0
                com.fasterxml.jackson.datatype    jackson-datatype-jsr310    [2.13.2](https://mvnrepository.com/artifact/com.fasterxml.jackson.datatype/jackson-datatype-jsr310/2.13.2)    The Apache Software License, Version 2.0
                    com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
                    com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
                    com.fasterxml.jackson.core    jackson-databind    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-databind/2.18.4)    The Apache Software License, Version 2.0
                        com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
                        com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
            org.apache.logging.log4j    log4j-api    [2.17.2](https://mvnrepository.com/artifact/org.apache.logging.log4j/log4j-api/2.17.2)    Apache License, Version 2.0
        org.apache.geode    geode-serialization    [1.15.1](https://mvnrepository.com/artifact/org.apache.geode/geode-serialization/1.15.1)    The Apache Software License, Version 2.0
            it.unimi.dsi    fastutil    [8.5.8](https://mvnrepository.com/artifact/it.unimi.dsi/fastutil/8.5.8)    Apache License, Version 2.0
            org.apache.commons    commons-lang3    [3.12.0](https://mvnrepository.com/artifact/org.apache.commons/commons-lang3/3.12.0)    Apache License, Version 2.0
            org.apache.geode    geode-common    [1.15.1](https://mvnrepository.com/artifact/org.apache.geode/geode-common/1.15.1)    The Apache Software License, Version 2.0
                com.fasterxml.jackson.core    jackson-databind    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-databind/2.18.4)    The Apache Software License, Version 2.0
                    com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
                    com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
                com.fasterxml.jackson.datatype    jackson-datatype-joda    [2.13.2](https://mvnrepository.com/artifact/com.fasterxml.jackson.datatype/jackson-datatype-joda/2.13.2)    The Apache Software License, Version 2.0
                    com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
                    com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
                    com.fasterxml.jackson.core    jackson-databind    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-databind/2.18.4)    The Apache Software License, Version 2.0
                        com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
                        com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
                    joda-time    joda-time    [2.10.8](https://mvnrepository.com/artifact/joda-time/joda-time/2.10.8)    Apache License, Version 2.0
                com.fasterxml.jackson.datatype    jackson-datatype-jsr310    [2.13.2](https://mvnrepository.com/artifact/com.fasterxml.jackson.datatype/jackson-datatype-jsr310/2.13.2)    The Apache Software License, Version 2.0
                    com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
                    com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
                    com.fasterxml.jackson.core    jackson-databind    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-databind/2.18.4)    The Apache Software License, Version 2.0
                        com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
                        com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
            org.apache.geode    geode-logging    [1.15.1](https://mvnrepository.com/artifact/org.apache.geode/geode-logging/1.15.1)    The Apache Software License, Version 2.0
                org.apache.geode    geode-common    [1.15.1](https://mvnrepository.com/artifact/org.apache.geode/geode-common/1.15.1)    The Apache Software License, Version 2.0
                    com.fasterxml.jackson.core    jackson-databind    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-databind/2.18.4)    The Apache Software License, Version 2.0
                        com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
                        com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
                    com.fasterxml.jackson.datatype    jackson-datatype-joda    [2.13.2](https://mvnrepository.com/artifact/com.fasterxml.jackson.datatype/jackson-datatype-joda/2.13.2)    The Apache Software License, Version 2.0
                        com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
                        com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
                        com.fasterxml.jackson.core    jackson-databind    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-databind/2.18.4)    The Apache Software License, Version 2.0
                            com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
                            com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
                        joda-time    joda-time    [2.10.8](https://mvnrepository.com/artifact/joda-time/joda-time/2.10.8)    Apache License, Version 2.0
                    com.fasterxml.jackson.datatype    jackson-datatype-jsr310    [2.13.2](https://mvnrepository.com/artifact/com.fasterxml.jackson.datatype/jackson-datatype-jsr310/2.13.2)    The Apache Software License, Version 2.0
                        com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
                        com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
                        com.fasterxml.jackson.core    jackson-databind    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-databind/2.18.4)    The Apache Software License, Version 2.0
                            com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
                            com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
                org.apache.logging.log4j    log4j-api    [2.17.2](https://mvnrepository.com/artifact/org.apache.logging.log4j/log4j-api/2.17.2)    Apache License, Version 2.0
            org.apache.logging.log4j    log4j-api    [2.17.2](https://mvnrepository.com/artifact/org.apache.logging.log4j/log4j-api/2.17.2)    Apache License, Version 2.0
        org.apache.geode    geode-tcp-server    [1.15.1](https://mvnrepository.com/artifact/org.apache.geode/geode-tcp-server/1.15.1)    The Apache Software License, Version 2.0
            commons-validator    commons-validator    [1.7](https://mvnrepository.com/artifact/commons-validator/commons-validator/1.7)    Apache License, Version 2.0
                commons-beanutils    commons-beanutils    [1.9.4](https://mvnrepository.com/artifact/commons-beanutils/commons-beanutils/1.9.4)    Apache License, Version 2.0
                    commons-collections    commons-collections    [3.2.2](https://mvnrepository.com/artifact/commons-collections/commons-collections/3.2.2)    Apache License, Version 2.0
                    commons-logging    commons-logging    [1.2](https://mvnrepository.com/artifact/commons-logging/commons-logging/1.2)    The Apache Software License, Version 2.0
                commons-collections    commons-collections    [3.2.2](https://mvnrepository.com/artifact/commons-collections/commons-collections/3.2.2)    Apache License, Version 2.0
                commons-digester    commons-digester    [2.1](https://mvnrepository.com/artifact/commons-digester/commons-digester/2.1)    The Apache Software License, Version 2.0
                commons-logging    commons-logging    [1.2](https://mvnrepository.com/artifact/commons-logging/commons-logging/1.2)    The Apache Software License, Version 2.0
            org.apache.geode    geode-common    [1.15.1](https://mvnrepository.com/artifact/org.apache.geode/geode-common/1.15.1)    The Apache Software License, Version 2.0
                com.fasterxml.jackson.core    jackson-databind    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-databind/2.18.4)    The Apache Software License, Version 2.0
                    com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
                    com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
                com.fasterxml.jackson.datatype    jackson-datatype-joda    [2.13.2](https://mvnrepository.com/artifact/com.fasterxml.jackson.datatype/jackson-datatype-joda/2.13.2)    The Apache Software License, Version 2.0
                    com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
                    com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
                    com.fasterxml.jackson.core    jackson-databind    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-databind/2.18.4)    The Apache Software License, Version 2.0
                        com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
                        com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
                    joda-time    joda-time    [2.10.8](https://mvnrepository.com/artifact/joda-time/joda-time/2.10.8)    Apache License, Version 2.0
                com.fasterxml.jackson.datatype    jackson-datatype-jsr310    [2.13.2](https://mvnrepository.com/artifact/com.fasterxml.jackson.datatype/jackson-datatype-jsr310/2.13.2)    The Apache Software License, Version 2.0
                    com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
                    com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
                    com.fasterxml.jackson.core    jackson-databind    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-databind/2.18.4)    The Apache Software License, Version 2.0
                        com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
                        com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
            org.apache.geode    geode-logging    [1.15.1](https://mvnrepository.com/artifact/org.apache.geode/geode-logging/1.15.1)    The Apache Software License, Version 2.0
                org.apache.geode    geode-common    [1.15.1](https://mvnrepository.com/artifact/org.apache.geode/geode-common/1.15.1)    The Apache Software License, Version 2.0
                    com.fasterxml.jackson.core    jackson-databind    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-databind/2.18.4)    The Apache Software License, Version 2.0
                        com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
                        com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
                    com.fasterxml.jackson.datatype    jackson-datatype-joda    [2.13.2](https://mvnrepository.com/artifact/com.fasterxml.jackson.datatype/jackson-datatype-joda/2.13.2)    The Apache Software License, Version 2.0
                        com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
                        com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
                        com.fasterxml.jackson.core    jackson-databind    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-databind/2.18.4)    The Apache Software License, Version 2.0
                            com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
                            com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
                        joda-time    joda-time    [2.10.8](https://mvnrepository.com/artifact/joda-time/joda-time/2.10.8)    Apache License, Version 2.0
                    com.fasterxml.jackson.datatype    jackson-datatype-jsr310    [2.13.2](https://mvnrepository.com/artifact/com.fasterxml.jackson.datatype/jackson-datatype-jsr310/2.13.2)    The Apache Software License, Version 2.0
                        com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
                        com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
                        com.fasterxml.jackson.core    jackson-databind    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-databind/2.18.4)    The Apache Software License, Version 2.0
                            com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
                            com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
                org.apache.logging.log4j    log4j-api    [2.17.2](https://mvnrepository.com/artifact/org.apache.logging.log4j/log4j-api/2.17.2)    Apache License, Version 2.0
            org.apache.geode    geode-serialization    [1.15.1](https://mvnrepository.com/artifact/org.apache.geode/geode-serialization/1.15.1)    The Apache Software License, Version 2.0
                it.unimi.dsi    fastutil    [8.5.8](https://mvnrepository.com/artifact/it.unimi.dsi/fastutil/8.5.8)    Apache License, Version 2.0
                org.apache.commons    commons-lang3    [3.12.0](https://mvnrepository.com/artifact/org.apache.commons/commons-lang3/3.12.0)    Apache License, Version 2.0
                org.apache.geode    geode-common    [1.15.1](https://mvnrepository.com/artifact/org.apache.geode/geode-common/1.15.1)    The Apache Software License, Version 2.0
                    com.fasterxml.jackson.core    jackson-databind    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-databind/2.18.4)    The Apache Software License, Version 2.0
                        com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
                        com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
                    com.fasterxml.jackson.datatype    jackson-datatype-joda    [2.13.2](https://mvnrepository.com/artifact/com.fasterxml.jackson.datatype/jackson-datatype-joda/2.13.2)    The Apache Software License, Version 2.0
                        com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
                        com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
                        com.fasterxml.jackson.core    jackson-databind    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-databind/2.18.4)    The Apache Software License, Version 2.0
                            com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
                            com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
                        joda-time    joda-time    [2.10.8](https://mvnrepository.com/artifact/joda-time/joda-time/2.10.8)    Apache License, Version 2.0
                    com.fasterxml.jackson.datatype    jackson-datatype-jsr310    [2.13.2](https://mvnrepository.com/artifact/com.fasterxml.jackson.datatype/jackson-datatype-jsr310/2.13.2)    The Apache Software License, Version 2.0
                        com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
                        com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
                        com.fasterxml.jackson.core    jackson-databind    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-databind/2.18.4)    The Apache Software License, Version 2.0
                            com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
                            com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
                org.apache.geode    geode-logging    [1.15.1](https://mvnrepository.com/artifact/org.apache.geode/geode-logging/1.15.1)    The Apache Software License, Version 2.0
                    org.apache.geode    geode-common    [1.15.1](https://mvnrepository.com/artifact/org.apache.geode/geode-common/1.15.1)    The Apache Software License, Version 2.0
                        com.fasterxml.jackson.core    jackson-databind    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-databind/2.18.4)    The Apache Software License, Version 2.0
                            com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
                            com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
                        com.fasterxml.jackson.datatype    jackson-datatype-joda    [2.13.2](https://mvnrepository.com/artifact/com.fasterxml.jackson.datatype/jackson-datatype-joda/2.13.2)    The Apache Software License, Version 2.0
                            com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
                            com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
                            com.fasterxml.jackson.core    jackson-databind    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-databind/2.18.4)    The Apache Software License, Version 2.0
                                com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
                                com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
                            joda-time    joda-time    [2.10.8](https://mvnrepository.com/artifact/joda-time/joda-time/2.10.8)    Apache License, Version 2.0
                        com.fasterxml.jackson.datatype    jackson-datatype-jsr310    [2.13.2](https://mvnrepository.com/artifact/com.fasterxml.jackson.datatype/jackson-datatype-jsr310/2.13.2)    The Apache Software License, Version 2.0
                            com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
                            com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
                            com.fasterxml.jackson.core    jackson-databind    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-databind/2.18.4)    The Apache Software License, Version 2.0
                                com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
                                com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
                    org.apache.logging.log4j    log4j-api    [2.17.2](https://mvnrepository.com/artifact/org.apache.logging.log4j/log4j-api/2.17.2)    Apache License, Version 2.0
                org.apache.logging.log4j    log4j-api    [2.17.2](https://mvnrepository.com/artifact/org.apache.logging.log4j/log4j-api/2.17.2)    Apache License, Version 2.0
            org.apache.logging.log4j    log4j-api    [2.17.2](https://mvnrepository.com/artifact/org.apache.logging.log4j/log4j-api/2.17.2)    Apache License, Version 2.0
        org.apache.logging.log4j    log4j-api    [2.17.2](https://mvnrepository.com/artifact/org.apache.logging.log4j/log4j-api/2.17.2)    Apache License, Version 2.0
        org.jgroups    jgroups    [3.6.14.Final](https://mvnrepository.com/artifact/org.jgroups/jgroups/3.6.14.Final)    Apache License 2.0
    org.apache.geode    geode-serialization    [1.15.1](https://mvnrepository.com/artifact/org.apache.geode/geode-serialization/1.15.1)    The Apache Software License, Version 2.0
        it.unimi.dsi    fastutil    [8.5.8](https://mvnrepository.com/artifact/it.unimi.dsi/fastutil/8.5.8)    Apache License, Version 2.0
        org.apache.commons    commons-lang3    [3.12.0](https://mvnrepository.com/artifact/org.apache.commons/commons-lang3/3.12.0)    Apache License, Version 2.0
        org.apache.geode    geode-common    [1.15.1](https://mvnrepository.com/artifact/org.apache.geode/geode-common/1.15.1)    The Apache Software License, Version 2.0
            com.fasterxml.jackson.core    jackson-databind    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-databind/2.18.4)    The Apache Software License, Version 2.0
                com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
                com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
            com.fasterxml.jackson.datatype    jackson-datatype-joda    [2.13.2](https://mvnrepository.com/artifact/com.fasterxml.jackson.datatype/jackson-datatype-joda/2.13.2)    The Apache Software License, Version 2.0
                com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
                com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
                com.fasterxml.jackson.core    jackson-databind    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-databind/2.18.4)    The Apache Software License, Version 2.0
                    com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
                    com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
                joda-time    joda-time    [2.10.8](https://mvnrepository.com/artifact/joda-time/joda-time/2.10.8)    Apache License, Version 2.0
            com.fasterxml.jackson.datatype    jackson-datatype-jsr310    [2.13.2](https://mvnrepository.com/artifact/com.fasterxml.jackson.datatype/jackson-datatype-jsr310/2.13.2)    The Apache Software License, Version 2.0
                com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
                com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
                com.fasterxml.jackson.core    jackson-databind    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-databind/2.18.4)    The Apache Software License, Version 2.0
                    com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
                    com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
        org.apache.geode    geode-logging    [1.15.1](https://mvnrepository.com/artifact/org.apache.geode/geode-logging/1.15.1)    The Apache Software License, Version 2.0
            org.apache.geode    geode-common    [1.15.1](https://mvnrepository.com/artifact/org.apache.geode/geode-common/1.15.1)    The Apache Software License, Version 2.0
                com.fasterxml.jackson.core    jackson-databind    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-databind/2.18.4)    The Apache Software License, Version 2.0
                    com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
                    com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
                com.fasterxml.jackson.datatype    jackson-datatype-joda    [2.13.2](https://mvnrepository.com/artifact/com.fasterxml.jackson.datatype/jackson-datatype-joda/2.13.2)    The Apache Software License, Version 2.0
                    com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
                    com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
                    com.fasterxml.jackson.core    jackson-databind    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-databind/2.18.4)    The Apache Software License, Version 2.0
                        com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
                        com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
                    joda-time    joda-time    [2.10.8](https://mvnrepository.com/artifact/joda-time/joda-time/2.10.8)    Apache License, Version 2.0
                com.fasterxml.jackson.datatype    jackson-datatype-jsr310    [2.13.2](https://mvnrepository.com/artifact/com.fasterxml.jackson.datatype/jackson-datatype-jsr310/2.13.2)    The Apache Software License, Version 2.0
                    com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
                    com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
                    com.fasterxml.jackson.core    jackson-databind    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-databind/2.18.4)    The Apache Software License, Version 2.0
                        com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
                        com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
            org.apache.logging.log4j    log4j-api    [2.17.2](https://mvnrepository.com/artifact/org.apache.logging.log4j/log4j-api/2.17.2)    Apache License, Version 2.0
        org.apache.logging.log4j    log4j-api    [2.17.2](https://mvnrepository.com/artifact/org.apache.logging.log4j/log4j-api/2.17.2)    Apache License, Version 2.0
    org.apache.logging.log4j    log4j-api    [2.17.2](https://mvnrepository.com/artifact/org.apache.logging.log4j/log4j-api/2.17.2)    Apache License, Version 2.0
org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
```

## Setup

### Connection

The connection to Geode is handled by a [ClientCache](https://geode.apache.org/docs/guide/115/basic_config/the_cache/managing_a_client_cache.html). A single `ClientCache` per application is enough. `ClientCache` also holds a single `PDXSerializer`.

The Geode client should be closed after use, it is recommended to close it on actor system termination.

Scala

```
[source](https://github.com/akka/alpakka/tree/v10.0.2/geode/src/test/scala/docs/scaladsl/GeodeFlowSpec.scala#L23-L34 "Go to snippet source")val geodeSettings = GeodeSettings(hostname, port = 10334)
  .withConfiguration(c => c.setPoolIdleTimeout(10))
val geode = new Geode(geodeSettings)
system.registerOnTermination(geode.close())
```

Java

```
[source](https://github.com/akka/alpakka/tree/v10.0.2/geode/src/test/java/docs/javadsl/GeodeBaseTestCase.java#L62-L65 "Go to snippet source")GeodeSettings settings =
    GeodeSettings.create(hostname, 10334).withConfiguration(c -> c.setPoolIdleTimeout(10));
Geode geode = new Geode(settings);
system.registerOnTermination(() -> geode.close());
```

Apache Geode supports continuous queries. Continuous query rely on server events, thus Alpakka Geode needs to listen to those events. This behaviour – as it consumes more resources – is isolated in a Scala trait and/or an specialized Java class.

Scala

```
[source](https://github.com/akka/alpakka/tree/v10.0.2/geode/src/test/scala/docs/scaladsl/GeodeContinuousSourceSpec.scala#L25-L26 "Go to snippet source")val geode = new Geode(geodeSettings) with PoolSubscription
system.registerOnTermination(geode.close())
```

Java

```
[source](https://github.com/akka/alpakka/tree/v10.0.2/geode/src/test/java/docs/javadsl/GeodeBaseTestCase.java#L73 "Go to snippet source")GeodeWithPoolSubscription geode = new GeodeWithPoolSubscription(settings);
```

### Region

Define a [region](https://geode.apache.org/docs/guide/115/basic_config/data_regions/chapter_overview.html) setting to describe how to access region and the key extraction function.

Scala

```
[source](https://github.com/akka/alpakka/tree/v10.0.2/geode/src/test/scala/docs/scaladsl/GeodeBaseSpec.scala#L26-L29 "Go to snippet source")val personsRegionSettings: RegionSettings[Int, Person] = RegionSettings("persons", (p: Person) => p.id)
val animalsRegionSettings: RegionSettings[Int, Animal] = RegionSettings("animals", (a: Animal) => a.id)
val complexesRegionSettings: RegionSettings[UUID, Complex] = RegionSettings("complexes", (a: Complex) => a.id)

```

Java

```
[source](https://github.com/akka/alpakka/tree/v10.0.2/geode/src/test/java/docs/javadsl/GeodeBaseTestCase.java#L38-L41 "Go to snippet source")protected final RegionSettings<Integer, Person> personRegionSettings =
    RegionSettings.create("persons", Person::getId);
protected final RegionSettings<Integer, Animal> animalRegionSettings =
    RegionSettings.create("animals", Animal::getId);
```

### Serialization

Objects must be serialized to be stored in or retrieved from Geode. Only **PDX format** is available with Alpakka Geode. `PDXEncoder`s support many options as described in [Geode PDX Serialization](https://geode.apache.org/docs/guide/115/developing/data_serialization/gemfire_pdx_serialization.html). A `PdxSerializer` must be provided to Geode when reading from or writing to a region.

Scala

```
[source](https://github.com/akka/alpakka/tree/v10.0.2/geode/src/test/scala/docs/scaladsl/PersonPdxSerializer.scala#L13-L32 "Go to snippet source")object PersonPdxSerializer extends AkkaPdxSerializer[Person] {
  override def clazz: Class[Person] = classOf[Person]

  override def toData(o: scala.Any, out: PdxWriter): Boolean =
    if (o.isInstanceOf[Person]) {
      val p = o.asInstanceOf[Person]
      out.writeInt("id", p.id)
      out.writeString("name", p.name)
      out.writeDate("birthDate", p.birthDate)
      true
    } else
      false

  override def fromData(clazz: Class[_], in: PdxReader): AnyRef = {
    val id: Int = in.readInt("id")
    val name: String = in.readString("name")
    val birthDate: Date = in.readDate("birthDate")
    Person(id, name, birthDate)
  }
}
```

Java

```
[source](https://github.com/akka/alpakka/tree/v10.0.2/geode/src/test/java/docs/javadsl/PersonPdxSerializer.java#L13-L39 "Go to snippet source")public class PersonPdxSerializer implements AkkaPdxSerializer<Person> {

  @Override
  public Class<Person> clazz() {
    return Person.class;
  }

  @Override
  public boolean toData(Object o, PdxWriter out) {
    if (o instanceof Person) {
      Person p = (Person) o;
      out.writeInt("id", p.getId());
      out.writeString("name", p.getName());
      out.writeDate("birthDate", p.getBirthDate());
      return true;
    }
    return false;
  }

  @Override
  public Object fromData(Class<?> clazz, PdxReader in) {
    int id = in.readInt("id");
    String name = in.readString("name");
    Date birthDate = in.readDate("birthDate");
    return new Person(id, name, birthDate);
  }
}
```

This Alpakka Geode provides a generic solution for Scala users based on [Shapeless](https://github.com/milessabin/shapeless) which may generate serializers for case classes at compile time.

Java users need to implement custom serializers manually, or use runtime reflection as described in [Using Automatic Reflection\-Based PDX Serialization](https://geode.apache.org/docs/guide/115/developing/data_serialization/auto_serialization.html).

## Writing to Geode

This example stores data in Geode within a flow.

Scala

```
[source](https://github.com/akka/alpakka/tree/v10.0.2/geode/src/test/scala/docs/scaladsl/GeodeFlowSpec.scala#L40-L42 "Go to snippet source")val flow: Flow[Person, Person, NotUsed] = geode.flow(personsRegionSettings)

val fut = source.via(flow).runWith(Sink.ignore)
```

Java

```
[source](https://github.com/akka/alpakka/tree/v10.0.2/geode/src/test/java/docs/javadsl/GeodeFlowTestCase.java#L31-L35 "Go to snippet source")Flow<Person, Person, NotUsed> flow =
    geode.flow(personRegionSettings, new PersonPdxSerializer());

CompletionStage<List<Person>> run =
    source.via(flow).toMat(Sink.seq(), Keep.right()).run(system);
```

This example stores data in Geode by using a sink.

Scala

```
[source](https://github.com/akka/alpakka/tree/v10.0.2/geode/src/test/scala/docs/scaladsl/GeodeSinkSpec.scala#L40-L46 "Go to snippet source")val animalsRegionSettings: RegionSettings[Int, Animal] =
  RegionSettings("animals", (a: Animal) => a.id)

val sink: Sink[Animal, Future[Done]] =
  geode.sink(animalsRegionSettings)

val fut: Future[Done] = source.runWith(sink)
```

Java

```
[source](https://github.com/akka/alpakka/tree/v10.0.2/geode/src/test/java/docs/javadsl/GeodeSinkTestCase.java#L50-L53 "Go to snippet source")Sink<Animal, CompletionStage<Done>> sink =
    geode.sink(animalRegionSettings, new AnimalPdxSerializer());

RunnableGraph<CompletionStage<Done>> runnableGraph = source.toMat(sink, Keep.right());
```

## Reading from Geode

### Simple query

Apache Geode supports simple queries.

Scala

```
[source](https://github.com/akka/alpakka/tree/v10.0.2/geode/src/test/scala/docs/scaladsl/GeodeFiniteSourceSpec.scala#L23-L29 "Go to snippet source")val geode = new Geode(geodeSettings)
system.registerOnTermination(geode.close())

val source =
  geode
    .query[Person](s"select * from /persons order by id")
    .runWith(Sink.foreach(e => log.debug(s"$e")))
```

Java

```
[source](https://github.com/akka/alpakka/tree/v10.0.2/geode/src/test/java/docs/javadsl/GeodeFiniteSourceTestCase.java#L24-L31 "Go to snippet source")CompletionStage<Done> personsDone =
    geode
        .query("select * from /persons", new PersonPdxSerializer())
        .runForeach(
            p -> {
              LOGGER.debug(p.toString());
            },
            system);
```

### Continuous query

Continuous queries need to be explicitly closed, to connect creating and closing a unique identifier needs to be passed to both `continuousQuery` and `closeContinuousQuery`.

Scala

```
[source](https://github.com/akka/alpakka/tree/v10.0.2/geode/src/test/scala/docs/scaladsl/GeodeContinuousSourceSpec.scala#L32-L44 "Go to snippet source")val source =
  geode
    .continuousQuery[Person](Symbol("test"), s"select * from /persons")
    .runWith(Sink.fold(0) { (c, p) =>
      log.debug(s"$p $c")
      if (c == 19) {
        geode.closeContinuousQuery(Symbol("test")).foreach { _ =>
          log.debug("test cQuery is closed")
        }

      }
      c + 1
    })
```

Java

```
[source](https://github.com/akka/alpakka/tree/v10.0.2/geode/src/test/java/docs/javadsl/GeodeContinuousSourceTestCase.java#L33-L43 "Go to snippet source")CompletionStage<Done> fut =
    geode
        .continuousQuery("test", "select * from /persons", new PersonPdxSerializer())
        .runForeach(
            p -> {
              LOGGER.debug(p.toString());
              if (p.getId() == 120) {
                geode.closeContinuousQuery("test");
              }
            },
            system);
```

## Geode basic commands

Assuming Apache Geode is installed:

```
gfsh

```

From the Geode shell:

```
start locator --name=locator
configure pdx --read-serialized=true
start server --name=server

create region --name=animals --type=PARTITION_REDUNDANT --redundant-copies=2
create region --name=persons --type=PARTITION_REDUNDANT --redundant-copies=2

```

## Code Examples

### Example 1: Artifacts

```scala
val AkkaVersion = "2.10.11"
libraryDependencies ++= Seq(
  "com.lightbend.akka" %% "akka-stream-alpakka-geode" % "10.0.2",
  "com.typesafe.akka" %% "akka-stream" % AkkaVersion
)
```

### Example 2: Artifacts

```xml
<properties>
  <akka.version>2.10.11</akka.version>
  <scala.binary.version>2.13</scala.binary.version>
</properties>
<dependencies&gt
  <dependency>
    <groupId>com.lightbend.akka</groupId>
    <artifactId>akka-stream-alpakka-geode_${scala.binary.version}</artifactId>
    <version>10.0.2</version>
  </dependency&gt
  <dependency>
    <groupId>com.typesafe.akka</groupId>
    <artifactId>akka-stream_${scala.binary.version}</artifactId>
    <version>${akka.version}</version>
  </dependency&gt
</dependencies>
```

### Example 3: Artifacts

```gradle
def versions = [
  AkkaVersion: "2.10.11",
  ScalaBinary: "2.13"
]
dependencies {
  implementation "com.lightbend.akka:akka-stream-alpakka-geode_${versions.ScalaBinary}:10.0.2"
  implementation "com.typesafe.akka:akka-stream_${versions.ScalaBinary}:${versions.AkkaVersion}"
}
```

### Example 4: Connection

```scala
val geodeSettings = GeodeSettings(hostname, port = 10334)
  .withConfiguration(c => c.setPoolIdleTimeout(10))
val geode = new Geode(geodeSettings)
system.registerOnTermination(geode.close())
```

### Example 5: Connection

```java
GeodeSettings settings =
    GeodeSettings.create(hostname, 10334).withConfiguration(c -> c.setPoolIdleTimeout(10));
Geode geode = new Geode(settings);
system.registerOnTermination(() -> geode.close());
```

### Example 6: Connection

```scala
val geode = new Geode(geodeSettings) with PoolSubscription
system.registerOnTermination(geode.close())
```

### Example 7: Connection

```java
GeodeWithPoolSubscription geode = new GeodeWithPoolSubscription(settings);
```

### Example 8: Region

```scala
val personsRegionSettings: RegionSettings[Int, Person] = RegionSettings("persons", (p: Person) => p.id)
val animalsRegionSettings: RegionSettings[Int, Animal] = RegionSettings("animals", (a: Animal) => a.id)
val complexesRegionSettings: RegionSettings[UUID, Complex] = RegionSettings("complexes", (a: Complex) => a.id)
```

### Example 9: Region

```java
protected final RegionSettings<Integer, Person> personRegionSettings =
    RegionSettings.create("persons", Person::getId);
protected final RegionSettings<Integer, Animal> animalRegionSettings =
    RegionSettings.create("animals", Animal::getId);
```

### Example 10: Serialization

```scala
object PersonPdxSerializer extends AkkaPdxSerializer[Person] {
  override def clazz: Class[Person] = classOf[Person]

  override def toData(o: scala.Any, out: PdxWriter): Boolean =
    if (o.isInstanceOf[Person]) {
      val p = o.asInstanceOf[Person]
      out.writeInt("id", p.id)
      out.writeString("name", p.name)
      out.writeDate("birthDate", p.birthDate)
      true
    } else
      false

  override def fromData(clazz: Class[_], in: PdxReader): AnyRef = {
    val id: Int = in.readInt("id")
    val name: String = in.readString("name")
    val birthDate: Date = in.readDate("birthDate")
    Person(id, name, birthDate)
  }
}
```

### Example 11: Serialization

```java
public class PersonPdxSerializer implements AkkaPdxSerializer<Person> {

  @Override
  public Class<Person> clazz() {
    return Person.class;
  }

  @Override
  public boolean toData(Object o, PdxWriter out) {
    if (o instanceof Person) {
      Person p = (Person) o;
      out.writeInt("id", p.getId());
      out.writeString("name", p.getName());
      out.writeDate("birthDate", p.getBirthDate());
      return true;
    }
    return false;
  }

  @Override
  public Object fromData(Class<?> clazz, PdxReader in) {
    int id = in.readInt("id");
    String name = in.readString("name");
    Date birthDate = in.readDate("birthDate");
    return new Person(id, name, birthDate);
  }
}
```

### Example 12: Writing to Geode

```scala
val flow: Flow[Person, Person, NotUsed] = geode.flow(personsRegionSettings)

val fut = source.via(flow).runWith(Sink.ignore)
```

### Example 13: Writing to Geode

```java
Flow<Person, Person, NotUsed> flow =
    geode.flow(personRegionSettings, new PersonPdxSerializer());

CompletionStage<List<Person>> run =
    source.via(flow).toMat(Sink.seq(), Keep.right()).run(system);
```

### Example 14: Writing to Geode

```scala
val animalsRegionSettings: RegionSettings[Int, Animal] =
  RegionSettings("animals", (a: Animal) => a.id)

val sink: Sink[Animal, Future[Done]] =
  geode.sink(animalsRegionSettings)

val fut: Future[Done] = source.runWith(sink)
```

### Example 15: Writing to Geode

```java
Sink<Animal, CompletionStage<Done>> sink =
    geode.sink(animalRegionSettings, new AnimalPdxSerializer());

RunnableGraph<CompletionStage<Done>> runnableGraph = source.toMat(sink, Keep.right());
```

### Example 16: Simple query

```scala
val geode = new Geode(geodeSettings)
system.registerOnTermination(geode.close())

val source =
  geode
    .query[Person](s"select * from /persons order by id")
    .runWith(Sink.foreach(e => log.debug(s"$e")))
```

### Example 17: Simple query

```java
CompletionStage<Done> personsDone =
    geode
        .query("select * from /persons", new PersonPdxSerializer())
        .runForeach(
            p -> {
              LOGGER.debug(p.toString());
            },
            system);
```

### Example 18: Continuous query

```scala
val source =
  geode
    .continuousQuery[Person](Symbol("test"), s"select * from /persons")
    .runWith(Sink.fold(0) { (c, p) =>
      log.debug(s"$p $c")
      if (c == 19) {
        geode.closeContinuousQuery(Symbol("test")).foreach { _ =>
          log.debug("test cQuery is closed")
        }

      }
      c + 1
    })
```

### Example 19: Continuous query

```java
CompletionStage<Done> fut =
    geode
        .continuousQuery("test", "select * from /persons", new PersonPdxSerializer())
        .runForeach(
            p -> {
              LOGGER.debug(p.toString());
              if (p.getId() == 120) {
                geode.closeContinuousQuery("test");
              }
            },
            system);
```

### Example 20: Geode basic commands

```text
gfsh
```

### Example 21: Geode basic commands

```text
start locator --name=locator
configure pdx --read-serialized=true
start server --name=server

create region --name=animals --type=PARTITION_REDUNDANT --redundant-copies=2
create region --name=persons --type=PARTITION_REDUNDANT --redundant-copies=2
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/alpakka/10.0.2/akka/stream/alpakka/geode/index.html
- https://doc.akka.io/docs/akka-dependencies/current/support-terminology.html
- https://doc.akka.io/docs/alpakka/current/cassandra.html
- https://doc.akka.io/docs/alpakka/current/kafka.html
- https://doc.akka.io/docs/alpakka/current/other-docs/snapshots.html
- https://doc.akka.io/libraries/alpakka/current

---
*Source: [https://doc.akka.io/docs/alpakka/current/geode.html](https://doc.akka.io/docs/alpakka/current/geode.html)*