---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:30:10Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/docs/akka/current/typed/testing.html
title: Testing • Akka Documentation
---

# Testing • Akka Documentation

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

# Testing

You are viewing the documentation for the new actor APIs, to view the Akka Classic documentation, see [Classic Testing](../testing.html).

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

To use Actor TestKit add the module to your project:

sbt
```
val AkkaVersion = "2.8.9"
libraryDependencies += "com.typesafe.akka" %% "akka-actor-testkit-typed" % AkkaVersion % Test
```
Maven
```
<properties>
  <scala.binary.version>2.13</scala.binary.version>
</properties>
<dependencyManagement>
  <dependencies>
    <dependency>
      <groupId>com.typesafe.akka</groupId>
      <artifactId>akka-bom_${scala.binary.version}</artifactId>
      <version>2.8.9</version>
      <type>pom</type>
      <scope>import</scope>
    </dependency&gt
  </dependencies>
</dependencyManagement>
<dependencies&gt
  <dependency>
    <groupId>com.typesafe.akka</groupId>
    <artifactId>akka-actor-testkit-typed_${scala.binary.version}</artifactId>
    <scope>test</scope>
  </dependency&gt
</dependencies>
```
Gradle
```
def versions = [
  ScalaBinary: "2.13"
]
dependencies {
  implementation platform("com.typesafe.akka:akka-bom_${versions.ScalaBinary}:2.8.9")

  testImplementation "com.typesafe.akka:akka-actor-testkit-typed_${versions.ScalaBinary}"
}
```

We recommend using Akka TestKit with ScalaTest:

sbt
```
libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.16" % Test
```
Maven
```
<properties>
  <scala.binary.version>2.13</scala.binary.version>
</properties>
<dependencies&gt
  <dependency>
    <groupId>org.scalatest</groupId>
    <artifactId>scalatest_${scala.binary.version}</artifactId>
    <version>3.2.16</version>
    <scope>test</scope>
  </dependency&gt
</dependencies>
```
Gradle
```
def versions = [
  ScalaBinary: "2.13"
]
dependencies {
  testImplementation "org.scalatest:scalatest_${versions.ScalaBinary}:3.2.16"
}
```

| Project Info: Akka Actor Testkit (typed) | |
| --- | --- |
| Artifact | com.typesafe.akka akka\-actor\-testkit\-typed 2\.8\.9 [Snapshots are available](project/links.html#snapshots-repository) |
| JDK versions | Adopt OpenJDK 8Adopt OpenJDK 11 |
| Scala versions | 2\.13\.11, 2\.12\.18, 3\.2\.2 |
| JPMS module name | akka.actor.testkit.typed |
| License | [BUSL\-1\.1](https://raw.githubusercontent.com/akka/akka/v2.8.9/LICENSE) |
| Readiness level | [Supported](https://developer.lightbend.com/docs/introduction/getting-help/support-terminology.html#supported), [Lightbend Subscription](https://www.lightbend.com/lightbend-subscription) provides support Since 2\.6\.0, 2019\-11\-06 |
| Home page | <https://akka.io/> |
| API documentation | [API (Scaladoc)](https://doc.akka.io/api/akka/2.8.9/akka/actor/testkit/typed/index.html) [API (Javadoc)](https://doc.akka.io/japi/akka/2.8.9/akka/actor/testkit/typed/package-summary.html) |
| Forums | [Lightbend Discuss](https://discuss.akka.io) [akka/akka Gitter channel](https://gitter.im/akka/akka) |
| Release notes | [akka.io blog](https://akka.io/blog/news-archive.html) |
| Issues | [Github issues](https://github.com/akka/akka/issues) |
| Sources | <https://github.com/akka/akka> |

## Introduction

Testing can either be done asynchronously using a real [`ActorSystem`](https://doc.akka.io/api/akka/2.8/akka/actor/typed/ActorSystem.html "akka.actor.typed.ActorSystem")[`ActorSystem`](https://doc.akka.io/japi/akka/2.8/akka/actor/typed/ActorSystem.html "akka.actor.typed.ActorSystem") or synchronously on the testing thread using the [`BehaviorTestKit`](https://doc.akka.io/japi/akka/2.8/akka/actor/testkit/typed/javadsl/BehaviorTestKit.html "akka.actor.testkit.typed.javadsl.BehaviorTestKit")[`BehaviorTestKit`](https://doc.akka.io/api/akka/2.8/akka/actor/testkit/typed/scaladsl/BehaviorTestKit.html "akka.actor.testkit.typed.scaladsl.BehaviorTestKit").

For testing logic in a [`Behavior`](https://doc.akka.io/api/akka/2.8/akka/actor/typed/Behavior.html "akka.actor.typed.Behavior")[`Behavior`](https://doc.akka.io/japi/akka/2.8/akka/actor/typed/Behavior.html "akka.actor.typed.Behavior") in isolation synchronous testing is preferred, but the features that can be tested are limited. For testing interactions between multiple actors a more realistic asynchronous test is preferred.

Those two testing approaches are described in:

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
val AkkaVersion = "2.8.9"
libraryDependencies += "com.typesafe.akka" %% "akka-actor-testkit-typed" % AkkaVersion % Test
```

### Example 5: Module info

```xml
<properties>
  <scala.binary.version>2.13</scala.binary.version>
</properties>
<dependencyManagement>
  <dependencies>
    <dependency>
      <groupId>com.typesafe.akka</groupId>
      <artifactId>akka-bom_${scala.binary.version}</artifactId>
      <version>2.8.9</version>
      <type>pom</type>
      <scope>import</scope>
    </dependency&gt
  </dependencies>
</dependencyManagement>
<dependencies&gt
  <dependency>
    <groupId>com.typesafe.akka</groupId>
    <artifactId>akka-actor-testkit-typed_${scala.binary.version}</artifactId>
    <scope>test</scope>
  </dependency&gt
</dependencies>
```

### Example 6: Module info

```gradle
def versions = [
  ScalaBinary: "2.13"
]
dependencies {
  implementation platform("com.typesafe.akka:akka-bom_${versions.ScalaBinary}:2.8.9")

  testImplementation "com.typesafe.akka:akka-actor-testkit-typed_${versions.ScalaBinary}"
}
```

### Example 7: Module info

```scala
libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.16" % Test
```

### Example 8: Module info

```xml
<properties>
  <scala.binary.version>2.13</scala.binary.version>
</properties>
<dependencies&gt
  <dependency>
    <groupId>org.scalatest</groupId>
    <artifactId>scalatest_${scala.binary.version}</artifactId>
    <version>3.2.16</version>
    <scope>test</scope>
  </dependency&gt
</dependencies>
```

### Example 9: Module info

```gradle
def versions = [
  ScalaBinary: "2.13"
]
dependencies {
  testImplementation "org.scalatest:scalatest_${versions.ScalaBinary}:3.2.16"
}
```

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/2.8.9/akka/actor/testkit/typed/index.html
- https://doc.akka.io/api/akka/2.8/akka/actor/testkit/typed/scaladsl/BehaviorTestKit.html
- https://doc.akka.io/api/akka/2.8/akka/actor/typed/ActorSystem.html
- https://doc.akka.io/api/akka/2.8/akka/actor/typed/Behavior.html
- https://doc.akka.io/japi/akka/2.8.9/akka/actor/testkit/typed/package-summary.html
- https://doc.akka.io/japi/akka/2.8/akka/actor/testkit/typed/javadsl/BehaviorTestKit.html
- https://doc.akka.io/japi/akka/2.8/akka/actor/typed/ActorSystem.html
- https://doc.akka.io/japi/akka/2.8/akka/actor/typed/Behavior.html
- https://doc.akka.io/libraries/akka-core/2.8/testing.html
- https://doc.akka.io/libraries/akka-core/2.8/typed/mailboxes.html
- https://doc.akka.io/libraries/akka-core/2.8/typed/project/links.html
- https://doc.akka.io/libraries/akka-core/2.8/typed/testing-async.html

---
*Source: [https://doc.akka.io/libraries/akka-core/2.8/typed/testing.html](https://doc.akka.io/libraries/akka-core/2.8/typed/testing.html)*