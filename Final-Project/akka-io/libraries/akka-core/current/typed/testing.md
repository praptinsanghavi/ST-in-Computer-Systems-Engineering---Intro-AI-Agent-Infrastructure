---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:24:32Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/typed/testing.html
title: Testing • Akka core
---

# Testing • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Testing

You are viewing the documentation for the new actor APIs, to view the Akka Classic documentation, see [Classic Testing](../testing.html).

## Module info

Note
The Akka dependencies are available from Akka’s secure library repository. To access them you need to use a secure, tokenized URL as specified at <https://account.akka.io/token>.

To use Actor TestKit add the module to your project:

sbt
```
val AkkaVersion = "2.10.17"
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
      <version>2.10.17</version>
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
  implementation platform("com.typesafe.akka:akka-bom_${versions.ScalaBinary}:2.10.17")

  testImplementation "com.typesafe.akka:akka-actor-testkit-typed_${versions.ScalaBinary}"
}
```

We recommend using Akka TestKit with ScalaTest:

sbt
```
libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.17" % Test
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
    <version>3.2.17</version>
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
  testImplementation "org.scalatest:scalatest_${versions.ScalaBinary}:3.2.17"
}
```

| Project Info: Akka Actor Testkit (typed) | |
| --- | --- |
| Artifact | com.typesafe.akka akka\-actor\-testkit\-typed 2\.10\.17 [Snapshots are available](project/links.html#snapshots-repository) |
| JDK versions | Eclipse Temurin JDK 11Eclipse Temurin JDK 17Eclipse Temurin JDK 21 |
| Scala versions | 2\.13\.17, 3\.3\.7 |
| JPMS module name | akka.actor.testkit.typed |
| License | [BUSL\-1\.1](https://raw.githubusercontent.com/akka/akka-core/v2.10.17/LICENSE) |
| Readiness level | [Supported](https://doc.akka.io/docs/akka-dependencies/current/support-terminology.html#supported), support is available from [Lightbend](https://www.lightbend.com/akka) Since 2\.6\.0, 2019\-11\-06 |
| Home page | <https://akka.io/> |
| API documentation | [API (Scaladoc)](https://doc.akka.io/api/akka-core/2.10.17/akka/actor/testkit/typed/index.html) [API (Javadoc)](https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/testkit/typed/package-summary.html) |
| Forums | [Akka Discuss](https://discuss.akka.io) |
| Release notes | [Akka release notes](https://doc.akka.io/reference/release-notes.html) |
| Issues | [Github issues](https://github.com/akka/akka-core/issues) |
| Sources | [https://github.com/akka/akka\-core](https://github.com/akka/akka-core) |

## Introduction

Testing can either be done asynchronously using a real [`ActorSystem`](https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/ActorSystem.html "akka.actor.typed.ActorSystem")[`ActorSystem`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/ActorSystem.html "akka.actor.typed.ActorSystem") or synchronously on the testing thread using the [`BehaviorTestKit`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/testkit/typed/javadsl/BehaviorTestKit.html "akka.actor.testkit.typed.javadsl.BehaviorTestKit")[`BehaviorTestKit`](https://doc.akka.io/api/akka-core/2.10/akka/actor/testkit/typed/scaladsl/BehaviorTestKit.html "akka.actor.testkit.typed.scaladsl.BehaviorTestKit").

For testing logic in a [`Behavior`](https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/Behavior.html "akka.actor.typed.Behavior")[`Behavior`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/Behavior.html "akka.actor.typed.Behavior") in isolation synchronous testing is preferred, but the features that can be tested are limited. For testing interactions between multiple actors a more realistic asynchronous test is preferred.

Those two testing approaches are described in:

## Code Examples

### Example 1: Module info

```scala
val AkkaVersion = "2.10.17"
libraryDependencies += "com.typesafe.akka" %% "akka-actor-testkit-typed" % AkkaVersion % Test
```

### Example 2: Module info

```xml
<properties>
  <scala.binary.version>2.13</scala.binary.version>
</properties>
<dependencyManagement>
  <dependencies>
    <dependency>
      <groupId>com.typesafe.akka</groupId>
      <artifactId>akka-bom_${scala.binary.version}</artifactId>
      <version>2.10.17</version>
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

### Example 3: Module info

```gradle
def versions = [
  ScalaBinary: "2.13"
]
dependencies {
  implementation platform("com.typesafe.akka:akka-bom_${versions.ScalaBinary}:2.10.17")

  testImplementation "com.typesafe.akka:akka-actor-testkit-typed_${versions.ScalaBinary}"
}
```

### Example 4: Module info

```scala
libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.17" % Test
```

### Example 5: Module info

```xml
<properties>
  <scala.binary.version>2.13</scala.binary.version>
</properties>
<dependencies&gt
  <dependency>
    <groupId>org.scalatest</groupId>
    <artifactId>scalatest_${scala.binary.version}</artifactId>
    <version>3.2.17</version>
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
  testImplementation "org.scalatest:scalatest_${versions.ScalaBinary}:3.2.17"
}
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/testkit/typed/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/testkit/typed/scaladsl/BehaviorTestKit.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/ActorSystem.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/Behavior.html
- https://doc.akka.io/docs/akka-dependencies/current/support-terminology.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/testkit/typed/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/testkit/typed/javadsl/BehaviorTestKit.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/ActorSystem.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/Behavior.html
- https://doc.akka.io/libraries/akka-core/current/testing.html
- https://doc.akka.io/libraries/akka-core/current/typed/mailboxes.html
- https://doc.akka.io/libraries/akka-core/current/typed/project/links.html
- https://doc.akka.io/libraries/akka-core/current/typed/testing-async.html
- https://doc.akka.io/reference/release-notes.html

---
*Source: [https://doc.akka.io/libraries/akka-core/current/typed/testing.html](https://doc.akka.io/libraries/akka-core/current/typed/testing.html)*