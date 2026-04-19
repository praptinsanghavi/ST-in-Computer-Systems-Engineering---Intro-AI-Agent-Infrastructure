---
description: A plugin for storing events in an event journal akka-persistence-jdbc
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:59:32Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-persistence-jdbc/current/overview.html
title: Overview • Akka Persistence JDBC
---

# Overview • Akka Persistence JDBC

> **Summary:** A plugin for storing events in an event journal akka-persistence-jdbc

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Overview

The Akka Persistence JDBC plugin allows for using JDBC\-compliant databases as backend for [Akka Persistence](https://doc.akka.io/libraries/akka-core/2.10/persistence.html) and [Akka Persistence Query](https://doc.akka.io/libraries/akka-core/2.10/persistence-query.html).

akka\-persistence\-jdbc writes journal and snapshot entries to a configured JDBC store. It implements the full akka\-persistence\-query API and is therefore very useful for implementing DDD\-style application models using Akka and Scala for creating reactive applications.

Akka Persistence JDBC requires Akka 2\.10\.11 or later. It uses [Slick](https://scala-slick.org/doc/3.5.1/) 3\.5\.1 internally to access the database via JDBC, this does not require user code to make use of Slick.

## Version history

| Description | Version | Akka version |
| --- | --- | --- |
| Required database schema migration, see [Migration](migration.html#migrating-to-version-5-4-0) | [5\.4\.0](https://github.com/akka/akka-persistence-jdbc/releases/tag/v5.4.0) | Akka 2\.6\.\+ |
| New database schema, see [Migration](migration.html#migrating-to-version-5-0-0) | [5\.0\.0](https://github.com/akka/akka-persistence-jdbc/releases/tag/v5.0.0) | Akka 2\.6\.\+ |
| First release within the Akka organization | [4\.0\.0](https://github.com/akka/akka-persistence-jdbc/releases/tag/v4.0.0) | Akka 2\.6\.\+ |
| Requires Akka 2\.5\.0 | [3\.5\.3\+](https://github.com/akka/akka-persistence-jdbc/releases/tag/v3.5.3) | Akka 2\.5\.23\+ or 2\.6\.x |

See the full release history at [GitHub releases](https://github.com/akka/akka-persistence-jdbc/releases).

## Module info

The Akka dependencies are available from Akka’s library repository. To access them there, you need to configure the URL for this repository.

sbt
```
resolvers += "Akka library repository".at("https://repo.akka.io/maven")

```
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
Gradle
```
repositories {
    mavenCentral()
    maven {
        url "https://repo.akka.io/maven"
    }
}

```

Additionally, add the dependencies as below.

sbt
```
val AkkaVersion = "2.10.11"
val SlickVersion = "3.5.1"
libraryDependencies ++= Seq(
  "com.lightbend.akka" %% "akka-persistence-jdbc" % "5.5.4",
  "com.typesafe.akka" %% "akka-persistence-query" % AkkaVersion,
  "com.typesafe.slick" %% "slick" % SlickVersion,
  "com.typesafe.slick" %% "slick-hikaricp" % SlickVersion
)
```
Maven
```
<properties>
  <akka.version>2.10.11</akka.version>
  <slick.version>3.5.1</slick.version>
  <scala.binary.version>2.13</scala.binary.version>
</properties>
<dependencies&gt
  <dependency>
    <groupId>com.lightbend.akka</groupId>
    <artifactId>akka-persistence-jdbc_${scala.binary.version}</artifactId>
    <version>5.5.4</version>
  </dependency&gt
  <dependency>
    <groupId>com.typesafe.akka</groupId>
    <artifactId>akka-persistence-query_${scala.binary.version}</artifactId>
    <version>${akka.version}</version>
  </dependency&gt
  <dependency>
    <groupId>com.typesafe.slick</groupId>
    <artifactId>slick_${scala.binary.version}</artifactId>
    <version>${slick.version}</version>
  </dependency&gt
  <dependency>
    <groupId>com.typesafe.slick</groupId>
    <artifactId>slick-hikaricp_${scala.binary.version}</artifactId>
    <version>${slick.version}</version>
  </dependency&gt
</dependencies>
```
Gradle
```
def versions = [
  AkkaVersion: "2.10.11",
  SlickVersion: "3.5.1",
  ScalaBinary: "2.13"
]
dependencies {
  implementation "com.lightbend.akka:akka-persistence-jdbc_${versions.ScalaBinary}:5.5.4"
  implementation "com.typesafe.akka:akka-persistence-query_${versions.ScalaBinary}:${versions.AkkaVersion}"
  implementation "com.typesafe.slick:slick_${versions.ScalaBinary}:${versions.SlickVersion}"
  implementation "com.typesafe.slick:slick-hikaricp_${versions.ScalaBinary}:${versions.SlickVersion}"
}
```

| Project Info: Akka Persistence JDBC | |
| --- | --- |
| Artifact | com.lightbend.akka akka\-persistence\-jdbc 5\.5\.4 [Snapshots are available](snapshots.html) |
| JDK versions | Eclipse Temurin JDK 11Eclipse Temurin JDK 17Eclipse Temurin JDK 21 |
| Scala versions | 2\.13\.17, 3\.3\.7 |
| JPMS module name | akka.persistence.jdbc |
| License | [BUSL\-1\.1](https://raw.githubusercontent.com/akka/akka-persistence-jdbc/master/LICENSE) |
| Readiness level | [Supported](https://doc.akka.io/docs/akka-dependencies/current/support-terminology.html#supported), support is available from [Lightbend](https://www.lightbend.com/akka) Since 5\.1\.0, 2022\-10\-05 |
| Home page | [https://doc.akka.io/libraries/akka\-persistence\-jdbc/current/](https://doc.akka.io/libraries/akka-persistence-jdbc/current/) |
| Forums | [Lightbend Discuss](https://discuss.akka.io/c/akka/) |
| Release notes | [GitHub releases](https://github.com/akka/akka-persistence-jdbc/releases) |
| Issues | [GitHub issues](https://github.com/akka/akka-persistence-jdbc/issues) |
| Sources | [https://github.com/akka/akka\-persistence\-jdbc](https://github.com/akka/akka-persistence-jdbc) |

## Contribution policy

Contributions via GitHub pull requests are gladly accepted from their original author. Along with any pull requests, please state that the contribution is your original work and that you license the work to the project under the project’s open source license. Whether or not you state this explicitly, by submitting any copyrighted material via pull request, email, or other means you agree to license the material under the project’s open source license and warrant that you have the legal authority to do so.

## Code of Conduct

Contributors all agree to follow the [Lightbend Community Code of Conduct](https://www.lightbend.com/conduct).

## License

This source code is made available under the [Business Source License 1\.1](https://raw.githubusercontent.com/akka/akka-persistence-jdbc/master/LICENSE)

## Code Examples

### Example 1: Module info

```scala
resolvers += "Akka library repository".at("https://repo.akka.io/maven")
```

### Example 2: Module info

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

### Example 3: Module info

```gradle
repositories {
    mavenCentral()
    maven {
        url "https://repo.akka.io/maven"
    }
}
```

### Example 4: Module info

```scala
val AkkaVersion = "2.10.11"
val SlickVersion = "3.5.1"
libraryDependencies ++= Seq(
  "com.lightbend.akka" %% "akka-persistence-jdbc" % "5.5.4",
  "com.typesafe.akka" %% "akka-persistence-query" % AkkaVersion,
  "com.typesafe.slick" %% "slick" % SlickVersion,
  "com.typesafe.slick" %% "slick-hikaricp" % SlickVersion
)
```

### Example 5: Module info

```xml
<properties>
  <akka.version>2.10.11</akka.version>
  <slick.version>3.5.1</slick.version>
  <scala.binary.version>2.13</scala.binary.version>
</properties>
<dependencies&gt
  <dependency>
    <groupId>com.lightbend.akka</groupId>
    <artifactId>akka-persistence-jdbc_${scala.binary.version}</artifactId>
    <version>5.5.4</version>
  </dependency&gt
  <dependency>
    <groupId>com.typesafe.akka</groupId>
    <artifactId>akka-persistence-query_${scala.binary.version}</artifactId>
    <version>${akka.version}</version>
  </dependency&gt
  <dependency>
    <groupId>com.typesafe.slick</groupId>
    <artifactId>slick_${scala.binary.version}</artifactId>
    <version>${slick.version}</version>
  </dependency&gt
  <dependency>
    <groupId>com.typesafe.slick</groupId>
    <artifactId>slick-hikaricp_${scala.binary.version}</artifactId>
    <version>${slick.version}</version>
  </dependency&gt
</dependencies>
```

### Example 6: Module info

```gradle
def versions = [
  AkkaVersion: "2.10.11",
  SlickVersion: "3.5.1",
  ScalaBinary: "2.13"
]
dependencies {
  implementation "com.lightbend.akka:akka-persistence-jdbc_${versions.ScalaBinary}:5.5.4"
  implementation "com.typesafe.akka:akka-persistence-query_${versions.ScalaBinary}:${versions.AkkaVersion}"
  implementation "com.typesafe.slick:slick_${versions.ScalaBinary}:${versions.SlickVersion}"
  implementation "com.typesafe.slick:slick-hikaricp_${versions.ScalaBinary}:${versions.SlickVersion}"
}
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/docs/akka-dependencies/current/support-terminology.html
- https://doc.akka.io/libraries/akka-core/2.10/persistence-query.html
- https://doc.akka.io/libraries/akka-core/2.10/persistence.html
- https://doc.akka.io/libraries/akka-persistence-jdbc/current/
- https://doc.akka.io/libraries/akka-persistence-jdbc/current/configuration.html
- https://doc.akka.io/libraries/akka-persistence-jdbc/current/index.html
- https://doc.akka.io/libraries/akka-persistence-jdbc/current/migration.html
- https://doc.akka.io/libraries/akka-persistence-jdbc/current/snapshots.html

---
*Source: [https://doc.akka.io/libraries/akka-persistence-jdbc/current/overview.html](https://doc.akka.io/libraries/akka-persistence-jdbc/current/overview.html)*