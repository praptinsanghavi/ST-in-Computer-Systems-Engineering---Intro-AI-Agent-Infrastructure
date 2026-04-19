---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:17:56Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/stream/stream-quickstart.html
title: Streams Quickstart Guide • Akka core
---

# Streams Quickstart Guide • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Streams Quickstart Guide

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
Note
Both the Java and Scala DSLs of Akka Streams are bundled in the same JAR. For a smooth development experience, when using an IDE such as Eclipse or IntelliJ, you can disable the auto\-importer from suggesting `javadsl` imports when working in Scala, or viceversa. See [IDE Tips](../additional/ide.html). 

## First steps

A stream usually begins at a source, so this is also how we start an Akka Stream. Before we create one, we import the full complement of streaming tools:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/QuickStartDocSpec.scala#L8-L11 "Go to snippet source")import akka.stream._
import akka.stream.scaladsl._

import scala.annotation.nowarn
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/QuickStartDocTest.java#L8-L9 "Go to snippet source")import akka.stream.*;
import akka.stream.javadsl.*;
```

If you want to execute the code samples while you read through the quick start guide, you will also need the following imports:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/QuickStartDocSpec.scala#L15-L20 "Go to snippet source")import akka.{ Done, NotUsed }
import akka.actor.ActorSystem
import akka.util.ByteString
import scala.concurrent._
import scala.concurrent.duration._
import java.nio.file.Paths
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/QuickStartDocTest.java#L13-L22 "Go to snippet source")import akka.Done;
import akka.NotUsed;
import akka.actor.ActorSystem;
import akka.util.ByteString;

import java.nio.file.Paths;
import java.math.BigInteger;
import java.time.Duration;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.ExecutionException;
```

And an objecta class to start an Akka [`ActorSystem`](https://doc.akka.io/api/akka-core/2.10/akka/actor/ActorSystem.html "akka.actor.ActorSystem")[`ActorSystem`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorSystem.html "akka.actor.ActorSystem") and hold your code . Making the `ActorSystem` implicit makes it available to the streams without manually passing it when running them:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/QuickStartDocSpec.scala#L28-L31 "Go to snippet source")object Main extends App {
  implicit val system: ActorSystem = ActorSystem("QuickStart")
  // Code here
}
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/Main.java#L10-L15 "Go to snippet source")public class Main {
  public static void main(String[] argv) {
    final ActorSystem system = ActorSystem.create("QuickStart");
    // Code here
  }
}
```

Now we will start with a rather simple source, emitting the integers 1 to 100:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/QuickStartDocSpec.scala#L44 "Go to snippet source")val source: Source[Int, NotUsed] = Source(1 to 100)
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/QuickStartDocTest.java#L40 "Go to snippet source")final Source<Integer, NotUsed> source = Source.range(1, 100);
```

The [`Source`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html "akka.stream.javadsl.Source")[`Source`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html "akka.stream.scaladsl.Source") type is parameterized with two types: the first one is the type of element that this source emits and the second one, the “materialized value”, allows running the source to produce some auxiliary value (e.g. a network source may provide information about the bound port or the peer’s address). Where no auxiliary information is produced, the type [`NotUsed`](https://doc.akka.io/api/akka-core/2.10/akka/NotUsed.html "akka.NotUsed")[`NotUsed`](https://doc.akka.io/japi/akka-core/2.10/akka/NotUsed.html "akka.NotUsed") is used. A simple range of integers falls into this category \- running our stream produces a `NotUsed`.

Having created this source means that we have a description of how to emit the first 100 natural numbers, but this source is not yet active. In order to get those numbers out we have to run it:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/QuickStartDocSpec.scala#L48 "Go to snippet source")source.runForeach(i => println(i))
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/QuickStartDocTest.java#L44 "Go to snippet source")source.runForeach(i -> System.out.println(i), system);
```

This line will complement the source with a consumer function—in this example we print out the numbers to the console—and pass this little stream setup to an Actor that runs it. This activation is signaled by having “run” be part of the method name; there are other methods that run Akka Streams, and they all follow this pattern.

When running this source in a `scala.App`program you might notice it does not terminate, because the [`ActorSystem`](https://doc.akka.io/api/akka-core/2.10/akka/actor/ActorSystem.html "akka.actor.ActorSystem")[`ActorSystem`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorSystem.html "akka.actor.ActorSystem") is never terminated. Luckily [`runForeach`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html#runForeach(akka.japi.function.Procedure,akka.stream.Materializer) "akka.stream.javadsl.Source")[`runForeach`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html#runForeach(f:Out=%3EUnit)(implicitmaterializer:akka.stream.Materializer):scala.concurrent.Future[akka.Done] "akka.stream.scaladsl.Source") returns a [`Future`](http://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html "scala.concurrent.Future")\[[`Done`](https://doc.akka.io/api/akka-core/2.10/akka/Done.html "akka.Done")[`Done`](https://doc.akka.io/japi/akka-core/2.10/akka/Done.html "akka.Done")][`CompletionStage`](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html "java.util.concurrent.CompletionStage")\<[`Done`](https://doc.akka.io/api/akka-core/2.10/akka/Done.html "akka.Done")[`Done`](https://doc.akka.io/japi/akka-core/2.10/akka/Done.html "akka.Done")\> which resolves when the stream finishes:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/QuickStartDocSpec.scala#L73-L76 "Go to snippet source")val done: Future[Done] = source.runForeach(i => println(i))

implicit val ec = system.dispatcher
done.onComplete(_ => system.terminate())
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/QuickStartDocTest.java#L72-L74 "Go to snippet source")final CompletionStage<Done> done = source.runForeach(i -> System.out.println(i), system);

done.thenRun(() -> system.terminate());
```

The nice thing about Akka Streams is that the `Source` is a description of what you want to run, and like an architect’s blueprint it can be reused, incorporated into a larger design. We may choose to transform the source of integers and write it to a file instead:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/QuickStartDocSpec.scala#L52-L55 "Go to snippet source")val factorials = source.scan(BigInt(1))((acc, next) => acc * next)

val result: Future[IOResult] =
  factorials.map(num => ByteString(s"$num\n")).runWith(FileIO.toPath(Paths.get("factorials.txt")))
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/QuickStartDocTest.java#L48-L54 "Go to snippet source")final Source<BigInteger, NotUsed> factorials =
    source.scan(BigInteger.ONE, (acc, next) -> acc.multiply(BigInteger.valueOf(next)));

final CompletionStage<IOResult> result =
    factorials
        .map(num -> ByteString.fromString(num.toString() + "\n"))
        .runWith(FileIO.toPath(Paths.get("factorials.txt")), system);
```

First we use the [`scan`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html#scan(T,akka.japi.function.Function2) "akka.stream.javadsl.Source")[`scan`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html#scan[T](zero:T)(f:(T,Out)=%3ET):FlowOps.this.Repr[T] "akka.stream.scaladsl.Source") operator to run a computation over the whole stream: starting with the number 1 (`BigInt(1)``BigInteger.ONE`) we multiply by each of the incoming numbers, one after the other; the scan operation emits the initial value and then every calculation result. This yields the series of factorial numbers which we stash away as a `Source` for later reuse—it is important to keep in mind that nothing is actually computed yet, this is a description of what we want to have computed once we run the stream. Then we convert the resulting series of numbers into a stream of [`ByteString`](https://doc.akka.io/api/akka-core/2.10/akka/util/ByteString.html "akka.util.ByteString")[`ByteString`](https://doc.akka.io/japi/akka-core/2.10/akka/util/ByteString.html "akka.util.ByteString") objects describing lines in a text file. This stream is then run by attaching a file as the receiver of the data. In the terminology of Akka Streams this is called a [`Sink`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Sink.html "akka.stream.javadsl.Sink")[`Sink`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Sink.html "akka.stream.scaladsl.Sink"). [`IOResult`](https://doc.akka.io/api/akka-core/2.10/akka/stream/IOResult.html "akka.stream.IOResult")[`IOResult`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/IOResult.html "akka.stream.IOResult") is a type that IO operations return in Akka Streams in order to tell you how many bytes or elements were consumed and whether the stream terminated normally or exceptionally.

## Reusable Pieces

One of the nice parts of Akka Streams—and something that other stream libraries do not offer—is that not only sources can be reused like blueprints, all other elements can be as well. We can take the file\-writing [`Sink`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Sink.html "akka.stream.javadsl.Sink")[`Sink`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Sink.html "akka.stream.scaladsl.Sink"), prepend the processing steps necessary to get the [`ByteString`](https://doc.akka.io/api/akka-core/2.10/akka/util/ByteString.html "akka.util.ByteString")[`ByteString`](https://doc.akka.io/japi/akka-core/2.10/akka/util/ByteString.html "akka.util.ByteString") elements from incoming strings and package that up as a reusable piece as well. Since the language for writing these streams always flows from left to right (just like plain English), we need a starting point that is like a source but with an “open” input. In Akka Streams this is called a [`Flow`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html "akka.stream.javadsl.Flow")[`Flow`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow.html "akka.stream.scaladsl.Flow"):

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/QuickStartDocSpec.scala#L83-L84 "Go to snippet source")def lineSink(filename: String): Sink[String, Future[IOResult]] =
  Flow[String].map(s => ByteString(s + "\n")).toMat(FileIO.toPath(Paths.get(filename)))(Keep.right)
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/QuickStartDocTest.java#L81-L85 "Go to snippet source")public Sink<String, CompletionStage<IOResult>> lineSink(String filename) {
  return Flow.of(String.class)
      .map(s -> ByteString.fromString(s.toString() + "\n"))
      .toMat(FileIO.toPath(Paths.get(filename)), Keep.right());
}
```

Starting from a flow of strings we convert each to `ByteString` and then feed to the already known file\-writing `Sink`. The resulting blueprint is a `Sink[String, Future[IOResult]]``Sink<String, CompletionStage<IOResult>>`, which means that it accepts strings as its input and when materialized it will create auxiliary information of type [`Future`](http://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html "scala.concurrent.Future")\[[`IOResult`](https://doc.akka.io/api/akka-core/2.10/akka/stream/IOResult.html "akka.stream.IOResult")[`IOResult`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/IOResult.html "akka.stream.IOResult")][`CompletionStage`](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html "java.util.concurrent.CompletionStage")\<[`IOResult`](https://doc.akka.io/api/akka-core/2.10/akka/stream/IOResult.html "akka.stream.IOResult")[`IOResult`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/IOResult.html "akka.stream.IOResult")\> (when chaining operations on a `Source` or `Flow` the type of the auxiliary information—called the “materialized value”—is given by the leftmost starting point; since we want to retain what the [`FileIO.toPath`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/FileIO.html#toPath(java.nio.file.Path) "akka.stream.javadsl.FileIO")[`FileIO.toPath`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/FileIO$.html#toPath(f:java.nio.file.Path,options:Set[java.nio.file.OpenOption],startPosition:Long):akka.stream.scaladsl.Sink[akka.util.ByteString,scala.concurrent.Future[akka.stream.IOResult]] "akka.stream.scaladsl.FileIO") sink has to offer, we need to say [`Keep.right`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Keep$.html#right[L,R]:(L,R)=%3ER "akka.stream.scaladsl.Keep")[`Keep.right()`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Keep$.html#right() "akka.stream.javadsl.Keep").

We can use the new and shiny [`Sink`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Sink.html "akka.stream.javadsl.Sink")[`Sink`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Sink.html "akka.stream.scaladsl.Sink") we just created by attaching it to our `factorials` source—after a small adaptation to turn the numbers into strings:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/QuickStartDocSpec.scala#L59 "Go to snippet source")factorials.map(_.toString).runWith(lineSink("factorial2.txt"))
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/QuickStartDocTest.java#L58 "Go to snippet source")factorials.map(BigInteger::toString).runWith(lineSink("factorial2.txt"), system);
```

## Time\-Based Processing

Before we start looking at a more involved example we explore the streaming nature of what Akka Streams can do. Starting from the `factorials` source we transform the stream by zipping it together with another stream, represented by a [`Source`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html "akka.stream.javadsl.Source")[`Source`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html "akka.stream.scaladsl.Source") that emits the number 0 to 100: the first number emitted by the `factorials` source is the factorial of zero, the second is the factorial of one, and so on. We combine these two by forming strings like `"3! = 6"`.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/QuickStartDocSpec.scala#L63-L69 "Go to snippet source")factorials
  .zipWith(Source(0 to 100))((num, idx) => s"$idx! = $num")
  .throttle(1, 1.second)
  .runForeach(println)
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/QuickStartDocTest.java#L62-L68 "Go to snippet source")factorials
    .zipWith(Source.range(0, 99), (num, idx) -> String.format("%d! = %s", idx, num))
    .throttle(1, Duration.ofSeconds(1))
    .runForeach(s -> System.out.println(s), system);
```

All operations so far have been time\-independent and could have been performed in the same fashion on strict collections of elements. The next line demonstrates that we are in fact dealing with streams that can flow at a certain speed: we use the [`throttle`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html#throttle(int,java.time.Duration) "akka.stream.javadsl.Source")[`throttle`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html#throttle(elements:Int,per:scala.concurrent.duration.FiniteDuration):FlowOps.this.Repr[Out] "akka.stream.scaladsl.Source") operator to slow down the stream to 1 element per second.

If you run this program you will see one line printed per second. One aspect that is not immediately visible deserves mention, though: if you try and set the streams to produce a billion numbers each then you will notice that your JVM does not crash with an OutOfMemoryError, even though you will also notice that running the streams happens in the background, asynchronously (this is the reason for the auxiliary information to be provided as a [`Future`](http://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html "scala.concurrent.Future")[`CompletionStage`](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html "java.util.concurrent.CompletionStage"), in the future). The secret that makes this work is that Akka Streams implicitly implement pervasive flow control, all operators respect back\-pressure. This allows the throttle operator to signal to all its upstream sources of data that it can only accept elements at a certain rate—when the incoming rate is higher than one per second the throttle operator will assert *back\-pressure* upstream.

This is all there is to Akka Streams in a nutshell—glossing over the fact that there are dozens of sources and sinks and many more stream transformation operators to choose from, see also [operator index](operators/index.html).

# Reactive Tweets

A typical use case for stream processing is consuming a live stream of data that we want to extract or aggregate some other data from. In this example we’ll consider consuming a stream of tweets and extracting information concerning Akka from them.

We will also consider the problem inherent to all non\-blocking streaming solutions: *“What if the subscriber is too slow to consume the live stream of data?”*. Traditionally the solution is often to buffer the elements, but this can—and usually will—cause eventual buffer overflows and instability of such systems. Instead Akka Streams depend on internal backpressure signals that allow to control what should happen in such scenarios.

Here’s the data model we’ll be working with throughout the quickstart examples:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/TwitterStreamQuickstartDocSpec.scala#L27-L41 "Go to snippet source")final case class Author(handle: String)

final case class Hashtag(name: String)

final case class Tweet(author: Author, timestamp: Long, body: String) {
  def hashtags: Set[Hashtag] =
    body
      .split(" ")
      .collect {
        case t if t.startsWith("#") => Hashtag(t.replaceAll("[^#\\w]", ""))
      }
      .toSet
}

val akkaTag = Hashtag("#akka")
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/TwitterStreamQuickstartDocTest.java#L57-L167 "Go to snippet source")public static class Author {
  public final String handle;

  public Author(String handle) {
    this.handle = handle;
  }

  // ...

}

public static class Hashtag {
  public final String name;

  public Hashtag(String name) {
    this.name = name;
  }

  // ...
}

public static class Tweet {
  public final Author author;
  public final long timestamp;
  public final String body;

  public Tweet(Author author, long timestamp, String body) {
    this.author = author;
    this.timestamp = timestamp;
    this.body = body;
  }

  public Set<Hashtag> hashtags() {
    return Arrays.asList(body.split(" ")).stream()
        .filter(a -> a.startsWith("#"))
        .map(a -> new Hashtag(a))
        .collect(Collectors.toSet());
  }

  // ...
}

public static final Hashtag AKKA = new Hashtag("#akka");
```

Note
If you would like to get an overview of the used vocabulary first instead of diving head\-first into an actual example you can have a look at the [Core concepts](stream-flows-and-basics.html#core-concepts) and [Defining and running streams](stream-flows-and-basics.html#defining-and-running-streams) sections of the docs, and then come back to this quickstart to see it all pieced together into a simple example application.

## Transforming and consuming simple streams

The example application we will be looking at is a simple Twitter feed stream from which we’ll want to extract certain information, like for example finding all twitter handles of users who tweet about `#akka`.

In order to prepare our environment by creating an [`ActorSystem`](https://doc.akka.io/api/akka-core/2.10/akka/actor/ActorSystem.html "akka.actor.ActorSystem")[`ActorSystem`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorSystem.html "akka.actor.ActorSystem") which will be responsible for running the streams we are about to create:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/TwitterStreamQuickstartDocSpec.scala#L76 "Go to snippet source")implicit val system: ActorSystem = ActorSystem("reactive-tweets")
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/TwitterStreamQuickstartDocTest.java#L200 "Go to snippet source")final ActorSystem system = ActorSystem.create("reactive-tweets");
```

Let’s assume we have a stream of tweets readily available. In Akka this is expressed as a `Source[Out, M]``Source<Out, M>`:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/TwitterStreamQuickstartDocSpec.scala#L46 "Go to snippet source")val tweets: Source[Tweet, NotUsed]
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/TwitterStreamQuickstartDocTest.java#L193 "Go to snippet source")Source<Tweet, NotUsed> tweets;
```

Streams always start flowing from a `Source[Out,M1]``Source<Out,M1>` then can continue through `Flow[In,Out,M2]``Flow<In,Out,M2>` elements or more advanced operators to finally be consumed by a `Sink[In,M3]``Sink<In,M3>` (ignore the type parameters `M1`, `M2` and `M3` for now, they are not relevant to the types of the elements produced/consumed by these classes – they are “materialized types”, which we’ll talk about [below](stream-quickstart.html#materialized-values-quick)). The first type parameter—`Tweet` in this case—designates the kind of elements produced by the source while the `M` type parameters describe the object that is created during materialization ([see below](#materialized-values-quick))—`NotUsed` (from the `scala.runtime` package) means that no value is produced, it is the generic equivalent of `void`.

The operations should look familiar to anyone who has used the Scala Collections library, however they operate on streams and not collections of data (which is a very important distinction, as some operations only make sense in streaming and vice versa):

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/TwitterStreamQuickstartDocSpec.scala#L85-L86 "Go to snippet source")val authors: Source[Author, NotUsed] =
  tweets.filter(_.hashtags.contains(akkaTag)).map(_.author)
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/TwitterStreamQuickstartDocTest.java#L234-L235 "Go to snippet source")final Source<Author, NotUsed> authors =
    tweets.filter(t -> t.hashtags().contains(AKKA)).map(t -> t.author);
```

Finally in order to [materialize](stream-flows-and-basics.html#stream-materialization) and run the stream computation we need to attach the Flow to a `Sink``Sink<T, M>` that will get the Flow running. The simplest way to do this is to call [`runWith(sink)`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html#runWith(akka.stream.Graph,akka.actor.ClassicActorSystemProvider) "akka.stream.javadsl.Source")[`runWith(sink)`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html#runWith[Mat2](sink:akka.stream.Graph[akka.stream.SinkShape[Out],Mat2])(implicitmaterializer:akka.stream.Materializer):Mat2 "akka.stream.scaladsl.Source") on a `Source``Source<Out, M>`. For convenience a number of common Sinks are predefined and collected as static methods on the `Sink` companion object`Sink class`. For now let’s print each author:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/TwitterStreamQuickstartDocSpec.scala#L100 "Go to snippet source")authors.runWith(Sink.foreach(println))
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/TwitterStreamQuickstartDocTest.java#L260 "Go to snippet source")authors.runWith(Sink.foreach(a -> System.out.println(a)), system);
```

or by using the shorthand version (which are defined only for the most popular Sinks such as [`Sink.fold`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Sink.html#fold(U,akka.japi.function.Function2) "akka.stream.javadsl.Sink")[`Sink.fold`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Sink$.html#fold[U,T](zero:U)(f:(U,T)=%3EU):akka.stream.scaladsl.Sink[T,scala.concurrent.Future[U]] "akka.stream.scaladsl.Sink") and [`Sink.foreach`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Sink.html#foreach(akka.japi.function.Procedure) "akka.stream.javadsl.Sink")[`Sink.foreach`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Sink$.html#foreach[T](f:T=%3EUnit):akka.stream.scaladsl.Sink[T,scala.concurrent.Future[akka.Done]] "akka.stream.scaladsl.Sink")):

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/TwitterStreamQuickstartDocSpec.scala#L105 "Go to snippet source")authors.runForeach(println)
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/TwitterStreamQuickstartDocTest.java#L265 "Go to snippet source")authors.runForeach(a -> System.out.println(a), system);
```

Materializing and running a stream always requires an `ActorSystem` to be in implicit scope (or passed in explicitly, like this: [`.runWith(sink)(system)`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html#runWith[Mat2](sink:akka.stream.Graph[akka.stream.SinkShape[Out],Mat2])(implicitmaterializer:akka.stream.Materializer):Mat2 "akka.stream.scaladsl.Source"))passed in explicitly, like this: [`runWith(sink, system)`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html#runWith(akka.stream.Graph,akka.stream.Materializer) "akka.stream.javadsl.Source").

The complete snippet looks like this:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/TwitterStreamQuickstartDocSpec.scala#L76-L100 "Go to snippet source")implicit val system: ActorSystem = ActorSystem("reactive-tweets")

val authors: Source[Author, NotUsed] =
  tweets.filter(_.hashtags.contains(akkaTag)).map(_.author)

authors.runWith(Sink.foreach(println))
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/TwitterStreamQuickstartDocTest.java#L200-L260 "Go to snippet source")final ActorSystem system = ActorSystem.create("reactive-tweets");

final Source<Author, NotUsed> authors =
    tweets.filter(t -> t.hashtags().contains(AKKA)).map(t -> t.author);

authors.runWith(Sink.foreach(a -> System.out.println(a)), system);
```

## Flattening sequences in streams

In the previous section we were working on 1:1 relationships of elements which is the most common case, but sometimes we might want to map from one element to a number of elements and receive a “flattened” stream, similarly like `flatMap` works on Scala Collections. In order to get a flattened stream of hashtags from our stream of tweets we can use the [`mapConcat`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html#mapConcat(akka.japi.function.Function) "akka.stream.javadsl.Source")[`mapConcat`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html#mapConcat[T](f:Out=%3EIterableOnce[T]):FlowOps.this.Repr[T] "akka.stream.scaladsl.Source") operator:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/TwitterStreamQuickstartDocSpec.scala#L111 "Go to snippet source")val hashtags: Source[Hashtag, NotUsed] = tweets.mapConcat(_.hashtags.toList)
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/TwitterStreamQuickstartDocTest.java#L272-L273 "Go to snippet source")final Source<Hashtag, NotUsed> hashtags =
    tweets.mapConcat(t -> new ArrayList<Hashtag>(t.hashtags()));
```

Note
The name `flatMap` was consciously avoided due to its proximity with for\-comprehensions and monadic composition. It is problematic for two reasons: firstfirstly, flattening by concatenation is often undesirable in bounded stream processing due to the risk of deadlock (with merge being the preferred strategy), and secondsecondly, the monad laws would not hold for our implementation of flatMap (due to the liveness issues).

Please note that the [`mapConcat`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html#mapConcat(akka.japi.function.Function) "akka.stream.javadsl.Source")[`mapConcat`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html#mapConcat[T](f:Out=%3EIterableOnce[T]):FlowOps.this.Repr[T] "akka.stream.scaladsl.Source") requires the supplied function to return an iterable (`f: Out => immutable.Iterable[T]`a strict collection (`Out f -> java.util.List<T>`), whereas `flatMap` would have to operate on streams all the way through.

## Broadcasting a stream

Now let’s say we want to persist all hashtags, as well as all author names from this one live stream. For example we’d like to write all author handles into one file, and all hashtags into another file on disk. This means we have to split the source stream into two streams which will handle the writing to these different files.

Elements that can be used to form such “fan\-out” (or “fan\-in”) structures are referred to as “junctions” in Akka Streams. One of these that we’ll be using in this example is called [`Broadcast`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Broadcast.html "akka.stream.javadsl.Broadcast")[`Broadcast`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Broadcast$.html "akka.stream.scaladsl.Broadcast"), and it emits elements from its input port to all of its output ports.

Akka Streams intentionally separate the linear stream structures (Flows) from the non\-linear, branching ones (Graphs) in order to offer the most convenient API for both of these cases. Graphs can express arbitrarily complex stream setups at the expense of not reading as familiarly as collection transformations.

Graphs are constructed using [`GraphDSL`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/GraphDSL.html "akka.stream.javadsl.GraphDSL")[`GraphDSL`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/GraphDSL$.html "akka.stream.scaladsl.GraphDSL") like this:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/TwitterStreamQuickstartDocSpec.scala#L117-L137 "Go to snippet source")val writeAuthors: Sink[Author, NotUsed] = ???
val writeHashtags: Sink[Hashtag, NotUsed] = ???
val g = RunnableGraph.fromGraph(GraphDSL.create() { implicit b =>
  import GraphDSL.Implicits._

  val bcast = b.add(Broadcast[Tweet](2))
  tweets ~> bcast.in
  bcast.out(0) ~> Flow[Tweet].map(_.author) ~> writeAuthors
  bcast.out(1) ~> Flow[Tweet].mapConcat(_.hashtags.toList) ~> writeHashtags
  ClosedShape
})
g.run()
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/TwitterStreamQuickstartDocTest.java#L279-L307 "Go to snippet source")Sink<Author, NotUsed> writeAuthors;
Sink<Hashtag, NotUsed> writeHashtags;
RunnableGraph.fromGraph(
        GraphDSL.create(
            b -> {
              final UniformFanOutShape<Tweet, Tweet> bcast = b.add(Broadcast.create(2));
              final FlowShape<Tweet, Author> toAuthor =
                  b.add(Flow.of(Tweet.class).map(t -> t.author));
              final FlowShape<Tweet, Hashtag> toTags =
                  b.add(
                      Flow.of(Tweet.class)
                          .mapConcat(t -> new ArrayList<Hashtag>(t.hashtags())));
              final SinkShape<Author> authors = b.add(writeAuthors);
              final SinkShape<Hashtag> hashtags = b.add(writeHashtags);

              b.from(b.add(tweets)).viaFanOut(bcast).via(toAuthor).to(authors);
              b.from(bcast).via(toTags).to(hashtags);
              return ClosedShape.getInstance();
            }))
    .run(system);
```

As you can see, inside the `GraphDSL` we use an implicit graph builder `b` to mutably construct the graph using the `~>` “edge operator” (also read as “connect” or “via” or “to”). The operator is provided implicitly by importing `GraphDSL.Implicits._`we use graph builder `b` to construct the graph using [`UniformFanOutShape`](https://doc.akka.io/api/akka-core/2.10/akka/stream/UniformFanOutShape.html "akka.stream.UniformFanOutShape")[`UniformFanOutShape`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/UniformFanOutShape.html "akka.stream.UniformFanOutShape") and [`Flow`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html "akka.stream.javadsl.Flow")[`Flow`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow.html "akka.stream.scaladsl.Flow") s.

[`GraphDSL.create`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/GraphDSL.html#create(java.util.List,akka.japi.function.Function2) "akka.stream.javadsl.GraphDSL")[`GraphDSL.create`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/GraphDSL$.html#create[S<:akka.stream.Shape,IS<:akka.stream.Shape,Mat](graphs:Seq[akka.stream.Graph[IS,Mat]])(buildBlock:akka.stream.scaladsl.GraphDSL.Builder[Seq[Mat]]=%3E(Seq[IS]=%3ES)):akka.stream.Graph[S,Seq[Mat]] "akka.stream.scaladsl.GraphDSL") returns a [`Graph`](https://doc.akka.io/api/akka-core/2.10/akka/stream/Graph.html "akka.stream.Graph")[`Graph`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/Graph.html "akka.stream.Graph"), in this example a `Graph[ClosedShape, NotUsed]``Graph<ClosedShape,NotUsed>` where [`ClosedShape`](https://doc.akka.io/api/akka-core/2.10/akka/stream/ClosedShape.html "akka.stream.ClosedShape")[`ClosedShape`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/ClosedShape.html "akka.stream.ClosedShape") means that it is *a fully connected graph* or “closed” \- there are no unconnected inputs or outputs. Since it is closed it is possible to transform the graph into a [`RunnableGraph`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/RunnableGraph.html "akka.stream.javadsl.RunnableGraph")[`RunnableGraph`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/RunnableGraph.html "akka.stream.scaladsl.RunnableGraph") using [`RunnableGraph.fromGraph`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/RunnableGraph.html#fromGraph(akka.stream.Graph) "akka.stream.javadsl.RunnableGraph")[`RunnableGraph.fromGraph`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/RunnableGraph$.html#fromGraph[Mat](g:akka.stream.Graph[akka.stream.ClosedShape,Mat]):akka.stream.scaladsl.RunnableGraph[Mat] "akka.stream.scaladsl.RunnableGraph"). The `RunnableGraph` can then be [`run()`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/RunnableGraph.html#run(akka.stream.Materializer) "akka.stream.javadsl.RunnableGraph")[`run()`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/RunnableGraph.html#run()(implicitmaterializer:akka.stream.Materializer):Mat "akka.stream.scaladsl.RunnableGraph") to materialize a stream out of it.

Both `Graph` and `RunnableGraph` are *immutable, thread\-safe, and freely shareable*.

A graph can also have one of several other shapes, with one or more unconnected ports. Having unconnected ports expresses a graph that is a *partial graph*. Concepts around composing and nesting graphs in large structures are explained in detail in [Modularity, Composition and Hierarchy](stream-composition.html). It is also possible to wrap complex computation graphs as Flows, Sinks or Sources, which will be explained in detail in [Constructing Sources, Sinks and Flows from Partial Graphs](stream-graphs.html#constructing-sources-sinks-flows-from-partial-graphs)[Constructing and combining Partial Graphs](stream-graphs.html#partial-graph-dsl).

## Back\-pressure in action

One of the main advantages of Akka Streams is that they *always* propagate back\-pressure information from stream Sinks (Subscribers) to their Sources (Publishers). It is not an optional feature, and is enabled at all times. To learn more about the back\-pressure protocol used by Akka Streams and all other Reactive Streams compatible implementations read [Back\-pressure explained](stream-flows-and-basics.html#back-pressure-explained).

A typical problem applications (not using Akka Streams) like this often face is that they are unable to process the incoming data fast enough, either temporarily or by design, and will start buffering incoming data until there’s no more space to buffer, resulting in either [`OutOfMemoryError`](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/OutOfMemoryError.html "java.lang.OutOfMemoryError") s or other severe degradations of service responsiveness. With Akka Streams buffering can and must be handled explicitly. For example, if we are only interested in the “*most recent tweets, with a buffer of 10 elements*” this can be expressed using the [`buffer`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html#buffer(int,akka.stream.OverflowStrategy) "akka.stream.javadsl.Source")[`buffer`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html#buffer(size:Int,overflowStrategy:akka.stream.OverflowStrategy):FlowOps.this.Repr[Out] "akka.stream.scaladsl.Source") element:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/TwitterStreamQuickstartDocSpec.scala#L149 "Go to snippet source")tweets.buffer(10, OverflowStrategy.dropHead).map(slowComputation).runWith(Sink.ignore)
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/TwitterStreamQuickstartDocTest.java#L323-L326 "Go to snippet source")tweets
    .buffer(10, OverflowStrategy.dropHead())
    .map(t -> slowComputation(t))
    .runWith(Sink.ignore(), system);
```

The `buffer` element takes an explicit and required [`OverflowStrategy`](https://doc.akka.io/api/akka-core/2.10/akka/stream/OverflowStrategy.html "akka.stream.OverflowStrategy")[`OverflowStrategy`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/OverflowStrategy.html "akka.stream.OverflowStrategy"), which defines how the buffer should react when it receives another element while it is full. Strategies provided include dropping the oldest element (`dropHead`), dropping the entire buffer, signalling errorsfailures etc. Be sure to pick and choose the strategy that fits your use case best.

## Materialized values

So far we’ve been only processing data using Flows and consuming it into some kind of external Sink \- be it by printing values or storing them in some external system. However sometimes we may be interested in some value that can be obtained from the materialized processing pipeline. For example, we want to know how many tweets we have processed. While this question is not as obvious to give an answer to in case of an infinite stream of tweets (one way to answer this question in a streaming setting would be to create a stream of counts described as “*up until now*, we’ve processed N tweets”), but in general it is possible to deal with finite streams and come up with a nice result such as a total count of elements.

First, let’s write such an element counter using [`Sink.fold`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Sink$.html#fold[U,T](zero:U)(f:(U,T)=%3EU):akka.stream.scaladsl.Sink[T,scala.concurrent.Future[U]] "akka.stream.scaladsl.Sink") and[`Flow.of(Class)`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html#of(java.lang.Class) "akka.stream.javadsl.Flow") and [`Sink.fold`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Sink$.html#fold(U,akka.japi.function.Function2) "akka.stream.javadsl.Sink") to see how the types look like:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/TwitterStreamQuickstartDocSpec.scala#L170-L179 "Go to snippet source")val count: Flow[Tweet, Int, NotUsed] = Flow[Tweet].map(_ => 1)

val sumSink: Sink[Int, Future[Int]] = Sink.fold[Int, Int](0)(_ + _)

val counterGraph: RunnableGraph[Future[Int]] =
  tweets.via(count).toMat(sumSink)(Keep.right)

val sum: Future[Int] = counterGraph.run()

sum.foreach(c => println(s"Total tweets processed: $c"))
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/TwitterStreamQuickstartDocTest.java#L333-L342 "Go to snippet source")final Sink<Integer, CompletionStage<Integer>> sumSink =
    Sink.<Integer, Integer>fold(0, (acc, elem) -> acc + elem);

final RunnableGraph<CompletionStage<Integer>> counter =
    tweets.map(t -> 1).toMat(sumSink, Keep.right());

final CompletionStage<Integer> sum = counter.run(system);

sum.thenAcceptAsync(
    c -> System.out.println("Total tweets processed: " + c), system.dispatcher());
```

First we prepare a reusable `Flow` that will change each incoming tweet into an integer of value `1`. We’ll use this in order to combine those with a `Sink.fold` that will sum all `Int` elements of the stream and make its result available as a `Future[Int]`. Next we connect the `tweets` stream to `count` with `via`. Finally we connect the Flow to the previously prepared Sink using `toMat``Sink.fold` will sum all `Integer` elements of the stream and make its result available as a `CompletionStage<Integer>`. Next we use the `map` method of `tweets` `Source` which will change each incoming tweet into an integer value `1`. Finally we connect the Flow to the previously prepared Sink using `toMat`.

Remember those mysterious `Mat` type parameters on [`Source`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html "akka.stream.scaladsl.Source")\[\+Out, \+Mat], [`Flow`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow.html "akka.stream.scaladsl.Flow")\[\-In, \+Out, \+Mat] and [`Sink`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Sink.html "akka.stream.scaladsl.Sink")\[\-In, \+Mat][`Source`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html "akka.stream.javadsl.Source")\<Out, Mat\>, [`Flow`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html "akka.stream.javadsl.Flow")\<In, Out, Mat\> and [`Sink`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Sink.html "akka.stream.javadsl.Sink")\<In, Mat\>? They represent the type of values these processing parts return when materialized. When you chain these together, you can explicitly combine their materialized values. In our example we used the [`Keep.right`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Keep$.html#right[L,R]:(L,R)=%3ER "akka.stream.scaladsl.Keep")[`Keep.right()`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Keep$.html#right() "akka.stream.javadsl.Keep") predefined function, which tells the implementation to only care about the materialized type of the operator currently appended to the right. The materialized type of `sumSink` is [`Future`](http://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html "scala.concurrent.Future")\[Int][`CompletionStage`](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html "java.util.concurrent.CompletionStage") and because of using `Keep.right``Keep.right()`, the resulting [`RunnableGraph`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/RunnableGraph.html "akka.stream.javadsl.RunnableGraph")[`RunnableGraph`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/RunnableGraph.html "akka.stream.scaladsl.RunnableGraph") has also a type parameter of `Future[Int]``CompletionStage<Integer>`.

This step does *not* yet materialize the processing pipeline, it merely prepares the description of the Flow, which is now connected to a Sink, and therefore can be `run()`, as indicated by its type: `RunnableGraph[Future[Int]]``RunnableGraph<CompletionStage<Integer>>`. Next we call [`run()`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/RunnableGraph.html#run(akka.stream.Materializer) "akka.stream.javadsl.RunnableGraph")[`run()`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/RunnableGraph.html#run()(implicitmaterializer:akka.stream.Materializer):Mat "akka.stream.scaladsl.RunnableGraph") which materializes and runs the Flow. The value returned by calling `run()` on a `RunnableGraph[T]``RunnableGraph<T>` is of type `T`. In our case this type is `Future[Int]``CompletionStage<Integer>` which, when completed, will contain the total length of our `tweets` stream. In case of the stream failing, this future would complete with a Failure.

A [`RunnableGraph`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/RunnableGraph.html "akka.stream.javadsl.RunnableGraph")[`RunnableGraph`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/RunnableGraph.html "akka.stream.scaladsl.RunnableGraph") may be reused and materialized multiple times, because it is only the “blueprint” of the stream. This means that if we materialize a stream, for example one that consumes a live stream of tweets within a minute, the materialized values for those two materializations will be different, as illustrated by this example:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/TwitterStreamQuickstartDocSpec.scala#L193-L201 "Go to snippet source")val sumSink = Sink.fold[Int, Int](0)(_ + _)
val counterRunnableGraph: RunnableGraph[Future[Int]] =
  tweetsInMinuteFromNow.filter(_.hashtags contains akkaTag).map(t => 1).toMat(sumSink)(Keep.right)

// materialize the stream once in the morning
val morningTweetsCount: Future[Int] = counterRunnableGraph.run()
// and once in the evening, reusing the flow
val eveningTweetsCount: Future[Int] = counterRunnableGraph.run()

```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/TwitterStreamQuickstartDocTest.java#L358-L369 "Go to snippet source")final Sink<Integer, CompletionStage<Integer>> sumSink =
    Sink.<Integer, Integer>fold(0, (acc, elem) -> acc + elem);
final RunnableGraph<CompletionStage<Integer>> counterRunnableGraph =
    tweetsInMinuteFromNow
        .filter(t -> t.hashtags().contains(AKKA))
        .map(t -> 1)
        .toMat(sumSink, Keep.right());

// materialize the stream once in the morning
final CompletionStage<Integer> morningTweetsCount = counterRunnableGraph.run(system);
// and once in the evening, reusing the blueprint
final CompletionStage<Integer> eveningTweetsCount = counterRunnableGraph.run(system);
```

Many elements in Akka Streams provide materialized values which can be used for obtaining either results of computation or steering these elements which will be discussed in detail in [Stream Materialization](stream-flows-and-basics.html#stream-materialization). Summing up this section, now we know what happens behind the scenes when we run this one\-liner, which is equivalent to the multi line version above:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/TwitterStreamQuickstartDocSpec.scala#L184 "Go to snippet source")val sum: Future[Int] = tweets.map(t => 1).runWith(sumSink)
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/TwitterStreamQuickstartDocTest.java#L347 "Go to snippet source")final CompletionStage<Integer> sum = tweets.map(t -> 1).runWith(sumSink, system);
```

Note
`runWith()` is a convenience method that automatically ignores the materialized value of any other operators except those appended by the `runWith()` itself. In the above example it translates to using `Keep.right``Keep.right()` as the combiner for materialized values.

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

### Example 4: First steps

```scala
import akka.stream._
import akka.stream.scaladsl._

import scala.annotation.nowarn
```

### Example 5: First steps

```java
import akka.stream.*;
import akka.stream.javadsl.*;
```

### Example 6: First steps

```scala
import akka.{ Done, NotUsed }
import akka.actor.ActorSystem
import akka.util.ByteString
import scala.concurrent._
import scala.concurrent.duration._
import java.nio.file.Paths
```

### Example 7: First steps

```java
import akka.Done;
import akka.NotUsed;
import akka.actor.ActorSystem;
import akka.util.ByteString;

import java.nio.file.Paths;
import java.math.BigInteger;
import java.time.Duration;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.ExecutionException;
```

### Example 8: First steps

```scala
object Main extends App {
  implicit val system: ActorSystem = ActorSystem("QuickStart")
  // Code here
}
```

### Example 9: First steps

```java
public class Main {
  public static void main(String[] argv) {
    final ActorSystem system = ActorSystem.create("QuickStart");
    // Code here
  }
}
```

### Example 10: First steps

```scala
val source: Source[Int, NotUsed] = Source(1 to 100)
```

### Example 11: First steps

```java
final Source<Integer, NotUsed> source = Source.range(1, 100);
```

### Example 12: First steps

```scala
source.runForeach(i => println(i))
```

### Example 13: First steps

```java
source.runForeach(i -> System.out.println(i), system);
```

### Example 14: First steps

```scala
val done: Future[Done] = source.runForeach(i => println(i))

implicit val ec = system.dispatcher
done.onComplete(_ => system.terminate())
```

### Example 15: First steps

```java
final CompletionStage<Done> done = source.runForeach(i -> System.out.println(i), system);

done.thenRun(() -> system.terminate());
```

### Example 16: First steps

```scala
val factorials = source.scan(BigInt(1))((acc, next) => acc * next)

val result: Future[IOResult] =
  factorials.map(num => ByteString(s"$num\n")).runWith(FileIO.toPath(Paths.get("factorials.txt")))
```

### Example 17: First steps

```java
final Source<BigInteger, NotUsed> factorials =
    source.scan(BigInteger.ONE, (acc, next) -> acc.multiply(BigInteger.valueOf(next)));

final CompletionStage<IOResult> result =
    factorials
        .map(num -> ByteString.fromString(num.toString() + "\n"))
        .runWith(FileIO.toPath(Paths.get("factorials.txt")), system);
```

### Example 18: Reusable Pieces

```scala
def lineSink(filename: String): Sink[String, Future[IOResult]] =
  Flow[String].map(s => ByteString(s + "\n")).toMat(FileIO.toPath(Paths.get(filename)))(Keep.right)
```

### Example 19: Reusable Pieces

```java
public Sink<String, CompletionStage<IOResult>> lineSink(String filename) {
  return Flow.of(String.class)
      .map(s -> ByteString.fromString(s.toString() + "\n"))
      .toMat(FileIO.toPath(Paths.get(filename)), Keep.right());
}
```

### Example 20: Reusable Pieces

```scala
factorials.map(_.toString).runWith(lineSink("factorial2.txt"))
```

### Example 21: Reusable Pieces

```java
factorials.map(BigInteger::toString).runWith(lineSink("factorial2.txt"), system);
```

### Example 22: Time-Based Processing

```scala
factorials
  .zipWith(Source(0 to 100))((num, idx) => s"$idx! = $num")
  .throttle(1, 1.second)
  .runForeach(println)
```

### Example 23: Time-Based Processing

```java
factorials
    .zipWith(Source.range(0, 99), (num, idx) -> String.format("%d! = %s", idx, num))
    .throttle(1, Duration.ofSeconds(1))
    .runForeach(s -> System.out.println(s), system);
```

### Example 24: Reactive Tweets

```scala
final case class Author(handle: String)

final case class Hashtag(name: String)

final case class Tweet(author: Author, timestamp: Long, body: String) {
  def hashtags: Set[Hashtag] =
    body
      .split(" ")
      .collect {
        case t if t.startsWith("#") => Hashtag(t.replaceAll("[^#\\w]", ""))
      }
      .toSet
}

val akkaTag = Hashtag("#akka")
```

### Example 25: Reactive Tweets

```java
public static class Author {
  public final String handle;

  public Author(String handle) {
    this.handle = handle;
  }

  // ...

}

public static class Hashtag {
  public final String name;

  public Hashtag(String name) {
    this.name = name;
  }

  // ...
}

public static class Tweet {
  public final Author author;
  public final long timestamp;
  public final String body;

  public Tweet(Author author, long timestamp, String body) {
    this.author = author;
    this.timestamp = timestamp;
    this.body = body;
  }

  public Set<Hashtag> hashtags() {
    return Arrays.asList(body.split(" ")).stream()
        .filter(a -> a.startsWith("#"))
        .map(a -> new Hashtag(a))
        .collect(Collectors.toSet());
  }

  // ...
}

public static final Hashtag AKKA = new Hashtag("#akka");
```

### Example 26: Transforming and consuming simple streams

```scala
implicit val system: ActorSystem = ActorSystem("reactive-tweets")
```

### Example 27: Transforming and consuming simple streams

```java
final ActorSystem system = ActorSystem.create("reactive-tweets");
```

### Example 28: Transforming and consuming simple streams

```scala
val tweets: Source[Tweet, NotUsed]
```

### Example 29: Transforming and consuming simple streams

```java
Source<Tweet, NotUsed> tweets;
```

### Example 30: Transforming and consuming simple streams

```scala
val authors: Source[Author, NotUsed] =
  tweets.filter(_.hashtags.contains(akkaTag)).map(_.author)
```

### Example 31: Transforming and consuming simple streams

```java
final Source<Author, NotUsed> authors =
    tweets.filter(t -> t.hashtags().contains(AKKA)).map(t -> t.author);
```

### Example 32: Transforming and consuming simple streams

```scala
authors.runWith(Sink.foreach(println))
```

### Example 33: Transforming and consuming simple streams

```java
authors.runWith(Sink.foreach(a -> System.out.println(a)), system);
```

### Example 34: Transforming and consuming simple streams

```scala
authors.runForeach(println)
```

### Example 35: Transforming and consuming simple streams

```java
authors.runForeach(a -> System.out.println(a), system);
```

### Example 36: Transforming and consuming simple streams

```scala
implicit val system: ActorSystem = ActorSystem("reactive-tweets")

val authors: Source[Author, NotUsed] =
  tweets.filter(_.hashtags.contains(akkaTag)).map(_.author)

authors.runWith(Sink.foreach(println))
```

### Example 37: Transforming and consuming simple streams

```java
final ActorSystem system = ActorSystem.create("reactive-tweets");

final Source<Author, NotUsed> authors =
    tweets.filter(t -> t.hashtags().contains(AKKA)).map(t -> t.author);

authors.runWith(Sink.foreach(a -> System.out.println(a)), system);
```

### Example 38: Flattening sequences in streams

```scala
val hashtags: Source[Hashtag, NotUsed] = tweets.mapConcat(_.hashtags.toList)
```

### Example 39: Flattening sequences in streams

```java
final Source<Hashtag, NotUsed> hashtags =
    tweets.mapConcat(t -> new ArrayList<Hashtag>(t.hashtags()));
```

### Example 40: Broadcasting a stream

```scala
val writeAuthors: Sink[Author, NotUsed] = ???
val writeHashtags: Sink[Hashtag, NotUsed] = ???
val g = RunnableGraph.fromGraph(GraphDSL.create() { implicit b =>
  import GraphDSL.Implicits._

  val bcast = b.add(Broadcast[Tweet](2))
  tweets ~> bcast.in
  bcast.out(0) ~> Flow[Tweet].map(_.author) ~> writeAuthors
  bcast.out(1) ~> Flow[Tweet].mapConcat(_.hashtags.toList) ~> writeHashtags
  ClosedShape
})
g.run()
```

### Example 41: Broadcasting a stream

```java
Sink<Author, NotUsed> writeAuthors;
Sink<Hashtag, NotUsed> writeHashtags;
RunnableGraph.fromGraph(
        GraphDSL.create(
            b -> {
              final UniformFanOutShape<Tweet, Tweet> bcast = b.add(Broadcast.create(2));
              final FlowShape<Tweet, Author> toAuthor =
                  b.add(Flow.of(Tweet.class).map(t -> t.author));
              final FlowShape<Tweet, Hashtag> toTags =
                  b.add(
                      Flow.of(Tweet.class)
                          .mapConcat(t -> new ArrayList<Hashtag>(t.hashtags())));
              final SinkShape<Author> authors = b.add(writeAuthors);
              final SinkShape<Hashtag> hashtags = b.add(writeHashtags);

              b.from(b.add(tweets)).viaFanOut(bcast).via(toAuthor).to(authors);
              b.from(bcast).via(toTags).to(hashtags);
              return ClosedShape.getInstance();
            }))
    .run(system);
```

### Example 42: Back-pressure in action

```scala
tweets.buffer(10, OverflowStrategy.dropHead).map(slowComputation).runWith(Sink.ignore)
```

### Example 43: Back-pressure in action

```java
tweets
    .buffer(10, OverflowStrategy.dropHead())
    .map(t -> slowComputation(t))
    .runWith(Sink.ignore(), system);
```

### Example 44: Materialized values

```scala
val count: Flow[Tweet, Int, NotUsed] = Flow[Tweet].map(_ => 1)

val sumSink: Sink[Int, Future[Int]] = Sink.fold[Int, Int](0)(_ + _)

val counterGraph: RunnableGraph[Future[Int]] =
  tweets.via(count).toMat(sumSink)(Keep.right)

val sum: Future[Int] = counterGraph.run()

sum.foreach(c => println(s"Total tweets processed: $c"))
```

### Example 45: Materialized values

```java
final Sink<Integer, CompletionStage<Integer>> sumSink =
    Sink.<Integer, Integer>fold(0, (acc, elem) -> acc + elem);

final RunnableGraph<CompletionStage<Integer>> counter =
    tweets.map(t -> 1).toMat(sumSink, Keep.right());

final CompletionStage<Integer> sum = counter.run(system);

sum.thenAcceptAsync(
    c -> System.out.println("Total tweets processed: " + c), system.dispatcher());
```

### Example 46: Materialized values

```scala
val sumSink = Sink.fold[Int, Int](0)(_ + _)
val counterRunnableGraph: RunnableGraph[Future[Int]] =
  tweetsInMinuteFromNow.filter(_.hashtags contains akkaTag).map(t => 1).toMat(sumSink)(Keep.right)

// materialize the stream once in the morning
val morningTweetsCount: Future[Int] = counterRunnableGraph.run()
// and once in the evening, reusing the flow
val eveningTweetsCount: Future[Int] = counterRunnableGraph.run()
```

### Example 47: Materialized values

```java
final Sink<Integer, CompletionStage<Integer>> sumSink =
    Sink.<Integer, Integer>fold(0, (acc, elem) -> acc + elem);
final RunnableGraph<CompletionStage<Integer>> counterRunnableGraph =
    tweetsInMinuteFromNow
        .filter(t -> t.hashtags().contains(AKKA))
        .map(t -> 1)
        .toMat(sumSink, Keep.right());

// materialize the stream once in the morning
final CompletionStage<Integer> morningTweetsCount = counterRunnableGraph.run(system);
// and once in the evening, reusing the blueprint
final CompletionStage<Integer> eveningTweetsCount = counterRunnableGraph.run(system);
```

### Example 48: Materialized values

```scala
val sum: Future[Int] = tweets.map(t => 1).runWith(sumSink)
```

### Example 49: Materialized values

```java
final CompletionStage<Integer> sum = tweets.map(t -> 1).runWith(sumSink, system);
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10/akka/Done.html
- https://doc.akka.io/api/akka-core/2.10/akka/NotUsed.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/ActorSystem.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/ClosedShape.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/Graph.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/IOResult.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/OverflowStrategy.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/UniformFanOutShape.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Broadcast$.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/FileIO$.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/GraphDSL$.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Keep$.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/RunnableGraph$.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/RunnableGraph.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Sink$.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Sink.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html
- https://doc.akka.io/api/akka-core/2.10/akka/util/ByteString.html
- https://doc.akka.io/japi/akka-core/2.10/akka/Done.html
- https://doc.akka.io/japi/akka-core/2.10/akka/NotUsed.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorSystem.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/ClosedShape.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/Graph.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/IOResult.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/OverflowStrategy.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/UniformFanOutShape.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Broadcast.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/FileIO.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/GraphDSL.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Keep$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/RunnableGraph.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Sink$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Sink.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html
- https://doc.akka.io/japi/akka-core/2.10/akka/util/ByteString.html
- https://doc.akka.io/libraries/akka-core/2.10/additional/ide.html
- https://doc.akka.io/libraries/akka-core/2.10/general/stream/stream-design.html
- https://doc.akka.io/libraries/akka-core/2.10/stream/operators/index.html
- https://doc.akka.io/libraries/akka-core/2.10/stream/stream-composition.html
- https://doc.akka.io/libraries/akka-core/2.10/stream/stream-flows-and-basics.html
- https://doc.akka.io/libraries/akka-core/2.10/stream/stream-graphs.html
- https://doc.akka.io/libraries/akka-core/2.10/stream/stream-introduction.html
- https://doc.akka.io/libraries/akka-core/2.10/stream/stream-quickstart.html

---
*Source: [https://doc.akka.io/libraries/akka-core/2.10/stream/stream-quickstart.html](https://doc.akka.io/libraries/akka-core/2.10/stream/stream-quickstart.html)*