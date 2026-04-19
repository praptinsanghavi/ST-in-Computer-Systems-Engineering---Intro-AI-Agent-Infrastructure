---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:18:38Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/project/links.html
title: Project • Akka core
---

# Project • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Project

## Commercial Support

Commercial support is provided by [Akka](https://akka.io).

## Sponsors

**Akka** is the company behind Akka product, Scala Programming Language, Play Web Framework, Lagom, sbt and many other open source and source available projects. Learn more at [akka.io](https://akka.io).

## Akka Discuss Forums

[Akka Discuss Forums](https://discuss.akka.io)

## Source Code

Akka uses Git and is hosted at [Github akka/akka\-core](https://github.com/akka/akka-core).

## Releases Repository

Note
The Akka dependencies are available from Akka’s secure library repository. To access them you need to use a secure, tokenized URL as specified at <https://account.akka.io/token>.

## Snapshots Repository

Snapshot builds are available from the repository at `https://repo.akka.io/TOKEN/secure/snapshots`. All Akka modules that belong to the same build have the same version.

Warning
The use of Akka SNAPSHOTs, nightlies and milestone releases is discouraged unless you know what you are doing.

### sbt definition of snapshot repository

Make sure that you add the repository to the sbt resolvers:

```
resolvers += "Akka library snapshot repository".at("https://repo.akka.io/TOKEN/secure/snapshots")

```

Define the library dependencies with the complete version. For example:

```
libraryDependencies += "com.typesafe.akka" % "akka-cluster_2.13" % "2.9.0+72-53943d99-SNAPSHOT"

```

### Maven definition of snapshot repository

Make sure that you add the repository to the Maven repositories in pom.xml:

```
<repositories>
  <repositories>
    <repository>
      <id>akka-repository</id>
      <name>Akka library snapshot repository</name>
      <url>https://repo.akka.io/TOKEN/secure/snapshots</url>
    </repository>
  </repositories>
</repositories>

```

Define the library dependencies with the complete version. For example:

```
<dependencies>
  <dependency>
    <groupId>com.typesafe.akka</groupId>
    <artifactId>akka-cluster_2.13</artifactId>
    <version>2.9.0+72-53943d99-SNAPSHOT</version>
  </dependency>
</dependencies>

```

## Code Examples

### Example 1: sbt definition of snapshot repository

```text
resolvers += "Akka library snapshot repository".at("https://repo.akka.io/TOKEN/secure/snapshots")
```

### Example 2: sbt definition of snapshot repository

```text
libraryDependencies += "com.typesafe.akka" % "akka-cluster_2.13" % "2.9.0+72-53943d99-SNAPSHOT"
```

### Example 3: Maven definition of snapshot repository

```text
<repositories>
  <repositories>
    <repository>
      <id>akka-repository</id>
      <name>Akka library snapshot repository</name>
      <url>https://repo.akka.io/TOKEN/secure/snapshots</url>
    </repository>
  </repositories>
</repositories>
```

### Example 4: Maven definition of snapshot repository

```text
<dependencies>
  <dependency>
    <groupId>com.typesafe.akka</groupId>
    <artifactId>akka-cluster_2.13</artifactId>
    <version>2.9.0+72-53943d99-SNAPSHOT</version>
  </dependency>
</dependencies>
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/libraries/akka-core/2.10/index-classic.html
- https://doc.akka.io/libraries/akka-core/2.10/project/examples.html

---
*Source: [https://doc.akka.io/libraries/akka-core/2.10/project/links.html](https://doc.akka.io/libraries/akka-core/2.10/project/links.html)*