---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:21:28Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/futures.html
title: Futures patterns • Akka core
---

# Futures patterns • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Futures patterns

## Dependency

Note
The Akka dependencies are available from Akka’s secure library repository. To access them you need to use a secure, tokenized URL as specified at <https://account.akka.io/token>.

Akka offers tiny helpers for use with [`Future`](http://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html "scala.concurrent.Future")s[`CompletionStage`](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html "java.util.concurrent.CompletionStage"). These are part of Akka’s core module:

sbt
```
val AkkaVersion = "2.10.17"
libraryDependencies += "com.typesafe.akka" %% "akka-actor" % AkkaVersion
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
    <artifactId>akka-actor_${scala.binary.version}</artifactId>
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

  implementation "com.typesafe.akka:akka-actor_${versions.ScalaBinary}"
}
```

## After

`akka.pattern.after`[`akka.pattern.Patterns.after`](https://doc.akka.io/japi/akka-core/2.10/akka/pattern/Patterns.html#after "akka.pattern.Patterns") makes it easy to complete a [`Future`](http://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html "scala.concurrent.Future")[`CompletionStage`](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html "java.util.concurrent.CompletionStage") with a value or exception after a timeout.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/future/FutureDocSpec.scala#L489-L493 "Go to snippet source")val delayed =
  akka.pattern.after(200.millis)(Future.failed(new IllegalStateException("OHNOES")))

val future = Future { Thread.sleep(1000); "foo" }
val result = Future.firstCompletedOf(Seq(future, delayed))
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/future/FutureDocTest.java#L30-L31 "Go to snippet source")import akka.pattern.Patterns;

CompletionStage<String> failWithException =
    CompletableFuture.supplyAsync(
        () -> {
          throw new IllegalStateException("OHNOES1");
        });
CompletionStage<String> delayed =
    Patterns.after(Duration.ofMillis(200), system, () -> failWithException);
```

## Retry

`akka.pattern.retry`[`akka.pattern.Patterns.retry`](https://doc.akka.io/japi/akka-core/2.10/akka/pattern/Patterns.html#retry "akka.pattern.Patterns") will retry a [`Future`](http://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html "scala.concurrent.Future")[`CompletionStage`](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html "java.util.concurrent.CompletionStage") some number of times with a delay between each attempt.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/future/FutureDocSpec.scala#L502-L516 "Go to snippet source")import akka.actor.typed.scaladsl.adapter._
implicit val scheduler: akka.actor.Scheduler = system.scheduler.toClassic
implicit val ec: ExecutionContext = system.executionContext

//Given some future that will succeed eventually
@volatile var failCount = 0
def futureToAttempt() = {
  if (failCount < 5) {
    failCount += 1
    Future.failed(new IllegalStateException(failCount.toString))
  } else Future.successful(5)
}

//Return a new future that will retry up to 10 times
val retried: Future[Int] = akka.pattern.retry(() => futureToAttempt(), attempts = 10, 100 milliseconds)
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/future/FutureDocTest.java#L30-L31 "Go to snippet source")import akka.pattern.Patterns;

Callable<CompletionStage<String>> attempt = () -> CompletableFuture.completedFuture("test");

CompletionStage<String> retriedFuture =
    Patterns.retry(attempt, 3, java.time.Duration.ofMillis(200), system);
```

## Code Examples

### Example 1: Dependency

```scala
val AkkaVersion = "2.10.17"
libraryDependencies += "com.typesafe.akka" %% "akka-actor" % AkkaVersion
```

### Example 2: Dependency

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
    <artifactId>akka-actor_${scala.binary.version}</artifactId>
  </dependency&gt
</dependencies>
```

### Example 3: Dependency

```gradle
def versions = [
  ScalaBinary: "2.13"
]
dependencies {
  implementation platform("com.typesafe.akka:akka-bom_${versions.ScalaBinary}:2.10.17")

  implementation "com.typesafe.akka:akka-actor_${versions.ScalaBinary}"
}
```

### Example 4: After

```scala
val delayed =
  akka.pattern.after(200.millis)(Future.failed(new IllegalStateException("OHNOES")))

val future = Future { Thread.sleep(1000); "foo" }
val result = Future.firstCompletedOf(Seq(future, delayed))
```

### Example 5: After

```java
import akka.pattern.Patterns;

CompletionStage<String> failWithException =
    CompletableFuture.supplyAsync(
        () -> {
          throw new IllegalStateException("OHNOES1");
        });
CompletionStage<String> delayed =
    Patterns.after(Duration.ofMillis(200), system, () -> failWithException);
```

### Example 6: Retry

```scala
import akka.actor.typed.scaladsl.adapter._
implicit val scheduler: akka.actor.Scheduler = system.scheduler.toClassic
implicit val ec: ExecutionContext = system.executionContext

//Given some future that will succeed eventually
@volatile var failCount = 0
def futureToAttempt() = {
  if (failCount < 5) {
    failCount += 1
    Future.failed(new IllegalStateException(failCount.toString))
  } else Future.successful(5)
}

//Return a new future that will retry up to 10 times
val retried: Future[Int] = akka.pattern.retry(() => futureToAttempt(), attempts = 10, 100 milliseconds)
```

### Example 7: Retry

```java
import akka.pattern.Patterns;

Callable<CompletionStage<String>> attempt = () -> CompletableFuture.completedFuture("test");

CompletionStage<String> retriedFuture =
    Patterns.retry(attempt, 3, java.time.Duration.ofMillis(200), system);
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/japi/akka-core/2.10/akka/pattern/Patterns.html
- https://doc.akka.io/libraries/akka-core/current/common/circuitbreaker.html
- https://doc.akka.io/libraries/akka-core/current/typed/extending.html

---
*Source: [https://doc.akka.io/libraries/akka-core/current/futures.html](https://doc.akka.io/libraries/akka-core/current/futures.html)*