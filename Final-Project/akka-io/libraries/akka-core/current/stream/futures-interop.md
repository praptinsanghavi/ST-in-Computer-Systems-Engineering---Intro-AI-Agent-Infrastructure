---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:50:46Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/stream/futures-interop.html
title: Futures interop • Akka core
---

# Futures interop • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Futures interop

## Dependency

Note
The Akka dependencies are available from Akka’s secure library repository. To access them you need to use a secure, tokenized URL as specified at <https://account.akka.io/token>.

To use Akka Streams, add the module to your project:

sbt
```
val AkkaVersion = "2.10.17"
libraryDependencies += "com.typesafe.akka" %% "akka-stream" % AkkaVersion
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
    <artifactId>akka-stream_${scala.binary.version}</artifactId>
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

  implementation "com.typesafe.akka:akka-stream_${versions.ScalaBinary}"
}
```

## Overview

Stream transformations and side effects involving external non\-stream based services can be performed with `mapAsync` or `mapAsyncUnordered`.

For example, sending emails to the authors of selected tweets using an external email service:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/IntegrationDocSpec.scala#L68-L74 "Go to snippet source")def send(email: Email): Future[Unit] = {
  // ...
}
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/IntegrationDocTest.java#L188-L194 "Go to snippet source")public CompletionStage<Email> send(Email email) {
  // ...
}
```

We start with the tweet stream of authors:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/IntegrationDocSpec.scala#L162-L163 "Go to snippet source")val authors: Source[Author, NotUsed] =
  tweets.filter(_.hashtags.contains(akkaTag)).map(_.author)
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/IntegrationDocTest.java#L436-L438 "Go to snippet source")final Source<Author, NotUsed> authors =
    tweets.filter(t -> t.hashtags().contains(AKKA)).map(t -> t.author);

```

Assume that we can look up their email address using:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/IntegrationDocSpec.scala#L46 "Go to snippet source")def lookupEmail(handle: String): Future[Option[String]] =
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/IntegrationDocTest.java#L75 "Go to snippet source")public CompletionStage<Optional<String>> lookupEmail(String handle)
```

Transforming the stream of authors to a stream of email addresses by using the `lookupEmail` service can be done with `mapAsync`:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/IntegrationDocSpec.scala#L167-L170 "Go to snippet source")val emailAddresses: Source[String, NotUsed] =
  authors.mapAsync(4)(author => addressSystem.lookupEmail(author.handle)).collect {
    case Some(emailAddress) => emailAddress
  }
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/IntegrationDocTest.java#L442-L447 "Go to snippet source")final Source<String, NotUsed> emailAddresses =
    authors
        .mapAsync(4, author -> addressSystem.lookupEmail(author.handle))
        .filter(o -> o.isPresent())
        .map(o -> o.get());

```

Finally, sending the emails:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/IntegrationDocSpec.scala#L174-L181 "Go to snippet source")val sendEmails: RunnableGraph[NotUsed] =
  emailAddresses
    .mapAsync(4)(address => {
      emailServer.send(Email(to = address, title = "Akka", body = "I like your tweet"))
    })
    .to(Sink.ignore)

sendEmails.run()
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/IntegrationDocTest.java#L451-L457 "Go to snippet source")final RunnableGraph<NotUsed> sendEmails =
    emailAddresses
        .mapAsync(
            4, address -> emailServer.send(new Email(address, "Akka", "I like your tweet")))
        .to(Sink.ignore());

sendEmails.run(system);
```

`mapAsync` is applying the given function that is calling out to the external service to each of the elements as they pass through this processing step. The function returns a `Future``CompletionStage` and the value of that future will be emitted downstream. The number of Futures that shall run in parallel is given as the first argument to `mapAsync`. These Futures may complete in any order, but the elements that are emitted downstream are in the same order as received from upstream.

That means that back\-pressure works as expected. For example if the `emailServer.send` is the bottleneck it will limit the rate at which incoming tweets are retrieved and email addresses looked up.

The final piece of this pipeline is to generate the demand that pulls the tweet authors information through the emailing pipeline: we attach a `Sink.ignore` which makes it all run. If our email process would return some interesting data for further transformation then we would not ignore it but send that result stream onwards for further processing or storage.

Note that `mapAsync` preserves the order of the stream elements. In this example the order is not important and then we can use the more efficient `mapAsyncUnordered`:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/IntegrationDocSpec.scala#L279-L294 "Go to snippet source")val authors: Source[Author, NotUsed] =
  tweets.filter(_.hashtags.contains(akkaTag)).map(_.author)

val emailAddresses: Source[String, NotUsed] =
  authors.mapAsyncUnordered(4)(author => addressSystem.lookupEmail(author.handle)).collect {
    case Some(emailAddress) => emailAddress
  }

val sendEmails: RunnableGraph[NotUsed] =
  emailAddresses
    .mapAsyncUnordered(4)(address => {
      emailServer.send(Email(to = address, title = "Akka", body = "I like your tweet"))
    })
    .to(Sink.ignore)

sendEmails.run()
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/IntegrationDocTest.java#L504-L519 "Go to snippet source")final Source<Author, NotUsed> authors =
    tweets.filter(t -> t.hashtags().contains(AKKA)).map(t -> t.author);

final Source<String, NotUsed> emailAddresses =
    authors
        .mapAsyncUnordered(4, author -> addressSystem.lookupEmail(author.handle))
        .filter(o -> o.isPresent())
        .map(o -> o.get());

final RunnableGraph<NotUsed> sendEmails =
    emailAddresses
        .mapAsyncUnordered(
            4, address -> emailServer.send(new Email(address, "Akka", "I like your tweet")))
        .to(Sink.ignore());

sendEmails.run(system);
```

In the above example the services conveniently returned a `Future``CompletionStage` of the result. If that is not the case you need to wrap the call in a `Future``CompletionStage`. If the service call involves blocking you must also make sure that you run it on a dedicated execution context, to avoid starvation and disturbance of other tasks in the system.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/IntegrationDocSpec.scala#L321-L332 "Go to snippet source")val blockingExecutionContext = system.dispatchers.lookup("blocking-dispatcher")

val sendTextMessages: RunnableGraph[NotUsed] =
  phoneNumbers
    .mapAsync(4)(phoneNo => {
      Future {
        smsServer.send(TextMessage(to = phoneNo, body = "I like your tweet"))
      }(blockingExecutionContext)
    })
    .to(Sink.ignore)

sendTextMessages.run()
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/IntegrationDocTest.java#L543-L555 "Go to snippet source")final Executor blockingEc = system.dispatchers().lookup("blocking-dispatcher");

final RunnableGraph<NotUsed> sendTextMessages =
    phoneNumbers
        .mapAsync(
            4,
            phoneNo ->
                CompletableFuture.supplyAsync(
                    () -> smsServer.send(new TextMessage(phoneNo, "I like your tweet")),
                    blockingEc))
        .to(Sink.ignore());

sendTextMessages.run(system);
```

The configuration of the `"blocking-dispatcher"` may look something like:

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/IntegrationDocSpec.scala#L32-L38 "Go to snippet source")blocking-dispatcher {
  executor = "thread-pool-executor"
  thread-pool-executor {
    core-pool-size-min    = 10
    core-pool-size-max    = 10
  }
}
```

An alternative for blocking calls is to perform them in a `map` operation, still using a dedicated dispatcher for that operation.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/IntegrationDocSpec.scala#L359-L367 "Go to snippet source")val send = Flow[String]
  .map { phoneNo =>
    smsServer.send(TextMessage(to = phoneNo, body = "I like your tweet"))
  }
  .withAttributes(ActorAttributes.dispatcher("blocking-dispatcher"))
val sendTextMessages: RunnableGraph[NotUsed] =
  phoneNumbers.via(send).to(Sink.ignore)

sendTextMessages.run()
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/IntegrationDocTest.java#L591-L597 "Go to snippet source")final Flow<String, Boolean, NotUsed> send =
    Flow.of(String.class)
        .map(phoneNo -> smsServer.send(new TextMessage(phoneNo, "I like your tweet")))
        .withAttributes(ActorAttributes.dispatcher("blocking-dispatcher"));
final RunnableGraph<?> sendTextMessages = phoneNumbers.via(send).to(Sink.ignore());

sendTextMessages.run(system);
```

However, that is not exactly the same as `mapAsync`, since the `mapAsync` may run several calls concurrently, but `map` performs them one at a time.

For a service that is exposed as an actor, or if an actor is used as a gateway in front of an external service, you can use `ask`:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/IntegrationDocSpec.scala#L384-L390 "Go to snippet source")import akka.pattern.ask

val akkaTweets: Source[Tweet, NotUsed] = tweets.filter(_.hashtags.contains(akkaTag))

implicit val timeout: Timeout = 3.seconds
val saveTweets: RunnableGraph[NotUsed] =
  akkaTweets.mapAsync(4)(tweet => database ? Save(tweet)).to(Sink.ignore)
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/IntegrationDocTest.java#L622-L627 "Go to snippet source")final Source<Tweet, NotUsed> akkaTweets = tweets.filter(t -> t.hashtags().contains(AKKA));

final RunnableGraph<NotUsed> saveTweets =
    akkaTweets
        .mapAsync(4, tweet -> ask(database, new Save(tweet), Duration.ofMillis(300L)))
        .to(Sink.ignore());
```

Note that if the `ask` is not completed within the given timeout the stream is completed with failure. If that is not desired outcome you can use `recover` on the `ask` `Future``CompletionStage`.

### Illustrating ordering and parallelism

Let us look at another example to get a better understanding of the ordering and parallelism characteristics of `mapAsync` and `mapAsyncUnordered`.

Several `mapAsync` and `mapAsyncUnordered` futures may run concurrently. The number of concurrent futures are limited by the downstream demand. For example, if 5 elements have been requested by downstream there will be at most 5 futures in progress.

`mapAsync` emits the future results in the same order as the input elements were received. That means that completed results are only emitted downstream when earlier results have been completed and emitted. One slow call will thereby delay the results of all successive calls, even though they are completed before the slow call.

`mapAsyncUnordered` emits the future results as soon as they are completed, i.e. it is possible that the elements are not emitted downstream in the same order as received from upstream. One slow call will thereby not delay the results of faster successive calls as long as there is downstream demand of several elements.

Here is a fictive service that we can use to illustrate these aspects.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/IntegrationDocSpec.scala#L101-L119 "Go to snippet source")class SometimesSlowService(implicit ec: ExecutionContext) {

  private val runningCount = new AtomicInteger

  def convert(s: String): Future[String] = {
    println(s"running: $s (${runningCount.incrementAndGet()})")
    Future {
      if (s.nonEmpty && s.head.isLower)
        Thread.sleep(500)
      else
        Thread.sleep(20)
      println(s"completed: $s (${runningCount.decrementAndGet()})")
      s.toUpperCase
    }
  }
}
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/IntegrationDocTest.java#L274-L302 "Go to snippet source")static class SometimesSlowService {
  private final Executor ec;

  public SometimesSlowService(Executor ec) {
    this.ec = ec;
  }

  private final AtomicInteger runningCount = new AtomicInteger();

  public CompletionStage<String> convert(String s) {
    System.out.println("running: " + s + "(" + runningCount.incrementAndGet() + ")");
    return CompletableFuture.supplyAsync(
        () -> {
          if (!s.isEmpty() && Character.isLowerCase(s.charAt(0)))
            try {
              Thread.sleep(500);
            } catch (InterruptedException e) {
            }
          else
            try {
              Thread.sleep(20);
            } catch (InterruptedException e) {
            }
          System.out.println("completed: " + s + "(" + runningCount.decrementAndGet() + ")");
          return s.toUpperCase();
        },
        ec);
  }
}
```

Elements starting with a lower case character are simulated to take longer time to process.

Here is how we can use it with `mapAsync`:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/IntegrationDocSpec.scala#L412-L420 "Go to snippet source")implicit val blockingExecutionContext = system.dispatchers.lookup("blocking-dispatcher")
val service = new SometimesSlowService

Source(List("a", "B", "C", "D", "e", "F", "g", "H", "i", "J"))
  .map(elem => { println(s"before: $elem"); elem })
  .mapAsync(4)(service.convert)
  .to(Sink.foreach(elem => println(s"after: $elem")))
  .withAttributes(Attributes.inputBuffer(initial = 4, max = 4))
  .run()
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/IntegrationDocTest.java#L663-L675 "Go to snippet source")final Executor blockingEc = system.dispatchers().lookup("blocking-dispatcher");
final SometimesSlowService service = new SometimesSlowService(blockingEc);

Source.from(Arrays.asList("a", "B", "C", "D", "e", "F", "g", "H", "i", "J"))
    .map(
        elem -> {
          System.out.println("before: " + elem);
          return elem;
        })
    .mapAsync(4, service::convert)
    .to(Sink.foreach(elem -> System.out.println("after: " + elem)))
    .withAttributes(Attributes.inputBuffer(4, 4))
    .run(system);
```

The output may look like this:

```
before: a
before: B
before: C
before: D
running: a (1)
running: B (2)
before: e
running: C (3)
before: F
running: D (4)
before: g
before: H
completed: C (3)
completed: B (2)
completed: D (1)
completed: a (0)
after: A
after: B
running: e (1)
after: C
after: D
running: F (2)
before: i
before: J
running: g (3)
running: H (4)
completed: H (2)
completed: F (3)
completed: e (1)
completed: g (0)
after: E
after: F
running: i (1)
after: G
after: H
running: J (2)
completed: J (1)
completed: i (0)
after: I
after: J

```

Note that `after` lines are in the same order as the `before` lines even though elements are `completed` in a different order. For example `H` is `completed` before `g`, but still emitted afterwards.

The numbers in parentheses illustrate how many calls that are in progress at the same time. Here the downstream demand and thereby the number of concurrent calls are limited by the buffer size (4\) set with an attribute.

Here is how we can use the same service with `mapAsyncUnordered`:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/IntegrationDocSpec.scala#L443-L451 "Go to snippet source")implicit val blockingExecutionContext = system.dispatchers.lookup("blocking-dispatcher")
val service = new SometimesSlowService

Source(List("a", "B", "C", "D", "e", "F", "g", "H", "i", "J"))
  .map(elem => { println(s"before: $elem"); elem })
  .mapAsyncUnordered(4)(service.convert)
  .to(Sink.foreach(elem => println(s"after: $elem")))
  .withAttributes(Attributes.inputBuffer(initial = 4, max = 4))
  .run()
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/IntegrationDocTest.java#L711-L723 "Go to snippet source")final Executor blockingEc = system.dispatchers().lookup("blocking-dispatcher");
final SometimesSlowService service = new SometimesSlowService(blockingEc);

Source.from(Arrays.asList("a", "B", "C", "D", "e", "F", "g", "H", "i", "J"))
    .map(
        elem -> {
          System.out.println("before: " + elem);
          return elem;
        })
    .mapAsyncUnordered(4, service::convert)
    .to(Sink.foreach(elem -> System.out.println("after: " + elem)))
    .withAttributes(Attributes.inputBuffer(4, 4))
    .run(system);
```

The output may look like this:

```
before: a
before: B
before: C
before: D
running: a (1)
running: B (2)
before: e
running: C (3)
before: F
running: D (4)
before: g
before: H
completed: B (3)
completed: C (1)
completed: D (2)
after: B
after: D
running: e (2)
after: C
running: F (3)
before: i
before: J
completed: F (2)
after: F
running: g (3)
running: H (4)
completed: H (3)
after: H
completed: a (2)
after: A
running: i (3)
running: J (4)
completed: J (3)
after: J
completed: e (2)
after: E
completed: g (1)
after: G
completed: i (0)
after: I

```

Note that `after` lines are not in the same order as the `before` lines. For example `H` overtakes the slow `G`.

The numbers in parentheses illustrate how many calls that are in progress at the same time. Here the downstream demand and thereby the number of concurrent calls are limited by the buffer size (4\) set with an attribute.

## Code Examples

### Example 1: Dependency

```scala
val AkkaVersion = "2.10.17"
libraryDependencies += "com.typesafe.akka" %% "akka-stream" % AkkaVersion
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
    <artifactId>akka-stream_${scala.binary.version}</artifactId>
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

  implementation "com.typesafe.akka:akka-stream_${versions.ScalaBinary}"
}
```

### Example 4: Overview

```scala
def send(email: Email): Future[Unit] = {
  // ...
}
```

### Example 5: Overview

```java
public CompletionStage<Email> send(Email email) {
  // ...
}
```

### Example 6: Overview

```scala
val authors: Source[Author, NotUsed] =
  tweets.filter(_.hashtags.contains(akkaTag)).map(_.author)
```

### Example 7: Overview

```java
final Source<Author, NotUsed> authors =
    tweets.filter(t -> t.hashtags().contains(AKKA)).map(t -> t.author);
```

### Example 8: Overview

```scala
def lookupEmail(handle: String): Future[Option[String]] =
```

### Example 9: Overview

```java
public CompletionStage<Optional<String>> lookupEmail(String handle)
```

### Example 10: Overview

```scala
val emailAddresses: Source[String, NotUsed] =
  authors.mapAsync(4)(author => addressSystem.lookupEmail(author.handle)).collect {
    case Some(emailAddress) => emailAddress
  }
```

### Example 11: Overview

```java
final Source<String, NotUsed> emailAddresses =
    authors
        .mapAsync(4, author -> addressSystem.lookupEmail(author.handle))
        .filter(o -> o.isPresent())
        .map(o -> o.get());
```

### Example 12: Overview

```scala
val sendEmails: RunnableGraph[NotUsed] =
  emailAddresses
    .mapAsync(4)(address => {
      emailServer.send(Email(to = address, title = "Akka", body = "I like your tweet"))
    })
    .to(Sink.ignore)

sendEmails.run()
```

### Example 13: Overview

```java
final RunnableGraph<NotUsed> sendEmails =
    emailAddresses
        .mapAsync(
            4, address -> emailServer.send(new Email(address, "Akka", "I like your tweet")))
        .to(Sink.ignore());

sendEmails.run(system);
```

### Example 14: Overview

```scala
val authors: Source[Author, NotUsed] =
  tweets.filter(_.hashtags.contains(akkaTag)).map(_.author)

val emailAddresses: Source[String, NotUsed] =
  authors.mapAsyncUnordered(4)(author => addressSystem.lookupEmail(author.handle)).collect {
    case Some(emailAddress) => emailAddress
  }

val sendEmails: RunnableGraph[NotUsed] =
  emailAddresses
    .mapAsyncUnordered(4)(address => {
      emailServer.send(Email(to = address, title = "Akka", body = "I like your tweet"))
    })
    .to(Sink.ignore)

sendEmails.run()
```

### Example 15: Overview

```java
final Source<Author, NotUsed> authors =
    tweets.filter(t -> t.hashtags().contains(AKKA)).map(t -> t.author);

final Source<String, NotUsed> emailAddresses =
    authors
        .mapAsyncUnordered(4, author -> addressSystem.lookupEmail(author.handle))
        .filter(o -> o.isPresent())
        .map(o -> o.get());

final RunnableGraph<NotUsed> sendEmails =
    emailAddresses
        .mapAsyncUnordered(
            4, address -> emailServer.send(new Email(address, "Akka", "I like your tweet")))
        .to(Sink.ignore());

sendEmails.run(system);
```

### Example 16: Overview

```scala
val blockingExecutionContext = system.dispatchers.lookup("blocking-dispatcher")

val sendTextMessages: RunnableGraph[NotUsed] =
  phoneNumbers
    .mapAsync(4)(phoneNo => {
      Future {
        smsServer.send(TextMessage(to = phoneNo, body = "I like your tweet"))
      }(blockingExecutionContext)
    })
    .to(Sink.ignore)

sendTextMessages.run()
```

### Example 17: Overview

```java
final Executor blockingEc = system.dispatchers().lookup("blocking-dispatcher");

final RunnableGraph<NotUsed> sendTextMessages =
    phoneNumbers
        .mapAsync(
            4,
            phoneNo ->
                CompletableFuture.supplyAsync(
                    () -> smsServer.send(new TextMessage(phoneNo, "I like your tweet")),
                    blockingEc))
        .to(Sink.ignore());

sendTextMessages.run(system);
```

### Example 18: Overview

```scala
blocking-dispatcher {
  executor = "thread-pool-executor"
  thread-pool-executor {
    core-pool-size-min    = 10
    core-pool-size-max    = 10
  }
}
```

### Example 19: Overview

```scala
val send = Flow[String]
  .map { phoneNo =>
    smsServer.send(TextMessage(to = phoneNo, body = "I like your tweet"))
  }
  .withAttributes(ActorAttributes.dispatcher("blocking-dispatcher"))
val sendTextMessages: RunnableGraph[NotUsed] =
  phoneNumbers.via(send).to(Sink.ignore)

sendTextMessages.run()
```

### Example 20: Overview

```java
final Flow<String, Boolean, NotUsed> send =
    Flow.of(String.class)
        .map(phoneNo -> smsServer.send(new TextMessage(phoneNo, "I like your tweet")))
        .withAttributes(ActorAttributes.dispatcher("blocking-dispatcher"));
final RunnableGraph<?> sendTextMessages = phoneNumbers.via(send).to(Sink.ignore());

sendTextMessages.run(system);
```

### Example 21: Overview

```scala
import akka.pattern.ask

val akkaTweets: Source[Tweet, NotUsed] = tweets.filter(_.hashtags.contains(akkaTag))

implicit val timeout: Timeout = 3.seconds
val saveTweets: RunnableGraph[NotUsed] =
  akkaTweets.mapAsync(4)(tweet => database ? Save(tweet)).to(Sink.ignore)
```

### Example 22: Overview

```java
final Source<Tweet, NotUsed> akkaTweets = tweets.filter(t -> t.hashtags().contains(AKKA));

final RunnableGraph<NotUsed> saveTweets =
    akkaTweets
        .mapAsync(4, tweet -> ask(database, new Save(tweet), Duration.ofMillis(300L)))
        .to(Sink.ignore());
```

### Example 23: Illustrating ordering and parallelism

```scala
class SometimesSlowService(implicit ec: ExecutionContext) {

  private val runningCount = new AtomicInteger

  def convert(s: String): Future[String] = {
    println(s"running: $s (${runningCount.incrementAndGet()})")
    Future {
      if (s.nonEmpty && s.head.isLower)
        Thread.sleep(500)
      else
        Thread.sleep(20)
      println(s"completed: $s (${runningCount.decrementAndGet()})")
      s.toUpperCase
    }
  }
}
```

### Example 24: Illustrating ordering and parallelism

```java
static class SometimesSlowService {
  private final Executor ec;

  public SometimesSlowService(Executor ec) {
    this.ec = ec;
  }

  private final AtomicInteger runningCount = new AtomicInteger();

  public CompletionStage<String> convert(String s) {
    System.out.println("running: " + s + "(" + runningCount.incrementAndGet() + ")");
    return CompletableFuture.supplyAsync(
        () -> {
          if (!s.isEmpty() && Character.isLowerCase(s.charAt(0)))
            try {
              Thread.sleep(500);
            } catch (InterruptedException e) {
            }
          else
            try {
              Thread.sleep(20);
            } catch (InterruptedException e) {
            }
          System.out.println("completed: " + s + "(" + runningCount.decrementAndGet() + ")");
          return s.toUpperCase();
        },
        ec);
  }
}
```

### Example 25: Illustrating ordering and parallelism

```scala
implicit val blockingExecutionContext = system.dispatchers.lookup("blocking-dispatcher")
val service = new SometimesSlowService

Source(List("a", "B", "C", "D", "e", "F", "g", "H", "i", "J"))
  .map(elem => { println(s"before: $elem"); elem })
  .mapAsync(4)(service.convert)
  .to(Sink.foreach(elem => println(s"after: $elem")))
  .withAttributes(Attributes.inputBuffer(initial = 4, max = 4))
  .run()
```

### Example 26: Illustrating ordering and parallelism

```java
final Executor blockingEc = system.dispatchers().lookup("blocking-dispatcher");
final SometimesSlowService service = new SometimesSlowService(blockingEc);

Source.from(Arrays.asList("a", "B", "C", "D", "e", "F", "g", "H", "i", "J"))
    .map(
        elem -> {
          System.out.println("before: " + elem);
          return elem;
        })
    .mapAsync(4, service::convert)
    .to(Sink.foreach(elem -> System.out.println("after: " + elem)))
    .withAttributes(Attributes.inputBuffer(4, 4))
    .run(system);
```

### Example 27: Illustrating ordering and parallelism

```text
before: a
before: B
before: C
before: D
running: a (1)
running: B (2)
before: e
running: C (3)
before: F
running: D (4)
before: g
before: H
completed: C (3)
completed: B (2)
completed: D (1)
completed: a (0)
after: A
after: B
running: e (1)
after: C
after: D
running: F (2)
before: i
before: J
running: g (3)
running: H (4)
completed: H (2)
completed: F (3)
completed: e (1)
completed: g (0)
after: E
after: F
running: i (1)
after: G
after: H
running: J (2)
completed: J (1)
completed: i (0)
after: I
after: J
```

### Example 28: Illustrating ordering and parallelism

```scala
implicit val blockingExecutionContext = system.dispatchers.lookup("blocking-dispatcher")
val service = new SometimesSlowService

Source(List("a", "B", "C", "D", "e", "F", "g", "H", "i", "J"))
  .map(elem => { println(s"before: $elem"); elem })
  .mapAsyncUnordered(4)(service.convert)
  .to(Sink.foreach(elem => println(s"after: $elem")))
  .withAttributes(Attributes.inputBuffer(initial = 4, max = 4))
  .run()
```

### Example 29: Illustrating ordering and parallelism

```java
final Executor blockingEc = system.dispatchers().lookup("blocking-dispatcher");
final SometimesSlowService service = new SometimesSlowService(blockingEc);

Source.from(Arrays.asList("a", "B", "C", "D", "e", "F", "g", "H", "i", "J"))
    .map(
        elem -> {
          System.out.println("before: " + elem);
          return elem;
        })
    .mapAsyncUnordered(4, service::convert)
    .to(Sink.foreach(elem -> System.out.println("after: " + elem)))
    .withAttributes(Attributes.inputBuffer(4, 4))
    .run(system);
```

### Example 30: Illustrating ordering and parallelism

```text
before: a
before: B
before: C
before: D
running: a (1)
running: B (2)
before: e
running: C (3)
before: F
running: D (4)
before: g
before: H
completed: B (3)
completed: C (1)
completed: D (2)
after: B
after: D
running: e (2)
after: C
running: F (3)
before: i
before: J
completed: F (2)
after: F
running: g (3)
running: H (4)
completed: H (3)
after: H
completed: a (2)
after: A
running: i (3)
running: J (4)
completed: J (3)
after: J
completed: e (2)
after: E
completed: g (1)
after: G
completed: i (0)
after: I
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/libraries/akka-core/current/stream/actor-interop.html
- https://doc.akka.io/libraries/akka-core/current/stream/stream-customize.html

---
*Source: [https://doc.akka.io/libraries/akka-core/current/stream/futures-interop.html](https://doc.akka.io/libraries/akka-core/current/stream/futures-interop.html)*