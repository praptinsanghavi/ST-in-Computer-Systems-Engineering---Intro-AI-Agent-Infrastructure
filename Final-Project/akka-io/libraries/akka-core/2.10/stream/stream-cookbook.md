---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:23:19Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/stream/stream-cookbook.html
title: Streams Cookbook • Akka core
---

# Streams Cookbook • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Streams Cookbook

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

## Introduction

This is a collection of patterns to demonstrate various usage of the Akka Streams API by solving small targeted problems in the format of “recipes”. The purpose of this page is to give inspiration and ideas how to approach various small tasks involving streams. The recipes in this page can be used directly as\-is, but they are most powerful as starting points: customization of the code snippets is warmly encouraged. The recipes can be extended or can provide a basis for the implementation of other [patterns](https://doc.akka.io/libraries/alpakka/current/patterns.html) involving [Alpakka](https://doc.akka.io/libraries/alpakka/current).

This part also serves as supplementary material for the main body of documentation. It is a good idea to have this page open while reading the manual and look for examples demonstrating various streaming concepts as they appear in the main body of documentation.

If you need a quick reference of the available operators used in the recipes see [operator index](operators/index.html).

## Working with Flows

In this collection we show simple recipes that involve linear flows. The recipes in this section are rather general, more targeted recipes are available as separate sections ([Buffers and working with rate](stream-rate.html), [Working with streaming IO](stream-io.html)).

### Logging in streams

**Situation:** During development it is sometimes helpful to see what happens in a particular section of a stream.

The simplest solution is to use a `map` operation and use `println` to print the elements received to the console. While this recipe is rather simplistic, it is often suitable for a quick debug session.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/cookbook/RecipeLoggingElements.scala#L24-L26 "Go to snippet source")val loggedSource = mySource.map { elem =>
  println(elem); elem
}
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/javadsl/cookbook/RecipeLoggingElements.java#L51-L55 "Go to snippet source")mySource.map(
    elem -> {
      System.out.println(elem);
      return elem;
    });
```

Another approach to logging is to use `log()` operation. This approach gives you more fine\-grained control of logging levels for elements flowing through the stream, finish and failure of the stream.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/cookbook/RecipeLoggingElements.scala#L37-L50 "Go to snippet source")// customise log levels
mySource
  .log("before-map")
  .withAttributes(Attributes
    .logLevels(onElement = Logging.WarningLevel, onFinish = Logging.InfoLevel, onFailure = Logging.DebugLevel))
  .map(analyse)
// or provide custom logging adapter
implicit val adapter: LoggingAdapter = Logging(system, "customLogger")
mySource.log("custom")
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/javadsl/cookbook/RecipeLoggingElements.java#L72-L85 "Go to snippet source")// customise log levels
mySource
    .log("before-map")
    .withAttributes(
        Attributes.createLogLevels(
            Logging.WarningLevel(), // onElement
            Logging.InfoLevel(), // onFinish
            Logging.DebugLevel() // onFailure
            ))
    .map(i -> analyse(i));

// or provide custom logging adapter
final LoggingAdapter adapter = Logging.getLogger(system, "customLogger");
mySource.log("custom", adapter);
```

### Creating a source that continuously evaluates a function

**Situation:** A source is required that continuously provides elements obtained by evaluating a given function, so long as there is demand.

The simplest implementation is to use a `Source.repeat` that produces some arbitrary element \- e.g. `NotUsed` \- and then map those elements to the function evaluation. E.g. if we have some `builderFunction()`, we can use:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/cookbook/RecipeSourceFromFunction.scala#L20 "Go to snippet source")val source = Source.repeat(NotUsed).map(_ => builderFunction())
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/javadsl/cookbook/RecipeSourceFromFunction.java#L48-L49 "Go to snippet source")final Source<String, NotUsed> source =
    Source.repeat(NotUsed.getInstance()).map(elem -> builderFunction());
```

Note: if the element\-builder function touches mutable state, then a guaranteed single\-threaded source should be used instead; e.g. `Source.unfold` or `Source.unfoldResource`.

### Flattening a stream of sequences

**Situation:** A stream is given as a stream of sequence of elements, but a stream of elements needed instead, streaming all the nested elements inside the sequences separately.

The `mapConcat` operation can be used to implement a one\-to\-many transformation of elements using a mapper function in the form of `In => immutable.Seq[Out]` `In -> List<Out>`. In this case we want to map a `Seq` `List` of elements to the elements in the collection itself, so we can call `mapConcat(identity)` `mapConcat(l -> l)`.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/cookbook/RecipeFlattenSeq.scala#L22-L23 "Go to snippet source")val myData: Source[List[Message], NotUsed] = someDataSource
val flattened: Source[Message, NotUsed] = myData.mapConcat(identity)
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/javadsl/cookbook/RecipeFlattenList.java#L46-L47 "Go to snippet source")Source<List<Message>, NotUsed> myData = someDataSource;
Source<Message, NotUsed> flattened = myData.mapConcat(i -> i);
```

### Draining a stream to a strict collection

**Situation:** A possibly unbounded sequence of elements is given as a stream, which needs to be collected into a Scala collection while ensuring boundedness

A common situation when working with streams is one where we need to collect incoming elements into a Scala collection. This operation is supported via `Sink.seq` which materializes into a `Future[Seq[T]]` `CompletionStage<List<T>>`.

The function `limit` or `take` should always be used in conjunction in order to guarantee stream boundedness, thus preventing the program from running out of memory.

For example, this is best avoided:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/cookbook/RecipeSeq.scala#L17-L18 "Go to snippet source")// Dangerous: might produce a collection with 2 billion elements!
val f: Future[Seq[String]] = mySource.runWith(Sink.seq)
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/javadsl/cookbook/RecipeSeq.java#L40-L41 "Go to snippet source")// Dangerous: might produce a collection with 2 billion elements!
final CompletionStage<List<String>> strings = mySource.runWith(Sink.seq(), system);
```

Rather, use `limit` or `take` to ensure that the resulting `Seq` `List` will contain only up to `max` `MAX_ALLOWED_SIZE` elements:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/cookbook/RecipeSeq.scala#L26-L35 "Go to snippet source")val MAX_ALLOWED_SIZE = 100

// OK. Future will fail with a `StreamLimitReachedException`
// if the number of incoming elements is larger than max
val limited: Future[Seq[String]] =
  mySource.limit(MAX_ALLOWED_SIZE).runWith(Sink.seq)

// OK. Collect up until max-th elements only, then cancel upstream
val ignoreOverflow: Future[Seq[String]] =
  mySource.take(MAX_ALLOWED_SIZE).runWith(Sink.seq)
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/javadsl/cookbook/RecipeSeq.java#L55-L78 "Go to snippet source")final int MAX_ALLOWED_SIZE = 100;

// OK. Future will fail with a `StreamLimitReachedException`
// if the number of incoming elements is larger than max
final CompletionStage<List<String>> strings =
    mySource.limit(MAX_ALLOWED_SIZE).runWith(Sink.seq(), system);

// OK. Collect up until max-th elements only, then cancel upstream
final CompletionStage<List<String>> strings =
    mySource.take(MAX_ALLOWED_SIZE).runWith(Sink.seq(), system);
```

### Calculating the digest of a ByteString stream

**Situation:** A stream of bytes is given as a stream of `ByteString` s and we want to calculate the cryptographic digest of the stream.

This recipe uses a [`GraphStage`](stream-customize.html) to define a custom Akka Stream operator, to host a mutable `MessageDigest` class (part of the Java Cryptography API) and update it with the bytes arriving from the stream. When the stream starts, the `onPull` handler of the operator is called, which bubbles up the `pull` event to its upstream. As a response to this pull, a ByteString chunk will arrive (`onPush`) which we use to update the digest, then it will pull for the next chunk.

Eventually the stream of `ByteString` s depletes and we get a notification about this event via `onUpstreamFinish`. At this point we want to emit the digest value, but we cannot do it with `push` in this handler directly since there may be no downstream demand. Instead we call `emit` which will temporarily replace the handlers, emit the provided value when demand comes in and then reset the operator state. It will then complete the operator.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/cookbook/RecipeDigest.scala#L17-L55 "Go to snippet source")import java.security.MessageDigest

import akka.NotUsed
import akka.stream.{ Attributes, FlowShape, Inlet, Outlet }
import akka.stream.scaladsl.{ Sink, Source }
import akka.util.ByteString

import akka.stream.stage._

val data: Source[ByteString, NotUsed] = Source.single(ByteString("abc"))

class DigestCalculator(algorithm: String) extends GraphStage[FlowShape[ByteString, ByteString]] {
  val in = Inlet[ByteString]("DigestCalculator.in")
  val out = Outlet[ByteString]("DigestCalculator.out")
  override val shape = FlowShape(in, out)

  override def createLogic(inheritedAttributes: Attributes): GraphStageLogic = new GraphStageLogic(shape) {
    private val digest = MessageDigest.getInstance(algorithm)

    setHandler(out, new OutHandler {
      override def onPull(): Unit = pull(in)
    })

    setHandler(in, new InHandler {
      override def onPush(): Unit = {
        val chunk = grab(in)
        digest.update(chunk.toArray)
        pull(in)
      }

      override def onUpstreamFinish(): Unit = {
        emit(out, ByteString(digest.digest()))
        completeStage()
      }
    })
  }
}

val digest: Source[ByteString, NotUsed] = data.via(new DigestCalculator("SHA-256"))
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/javadsl/cookbook/RecipeDigest.java#L39-L96 "Go to snippet source")class DigestCalculator extends GraphStage<FlowShape<ByteString, ByteString>> {
  private final String algorithm;
  public Inlet<ByteString> in = Inlet.create("DigestCalculator.in");
  public Outlet<ByteString> out = Outlet.create("DigestCalculator.out");
  private FlowShape<ByteString, ByteString> shape = FlowShape.of(in, out);

  public DigestCalculator(String algorithm) {
    this.algorithm = algorithm;
  }

  @Override
  public FlowShape<ByteString, ByteString> shape() {
    return shape;
  }

  @Override
  public GraphStageLogic createLogic(Attributes inheritedAttributes) {
    return new GraphStageLogic(shape) {
      final MessageDigest digest;

      {
        try {
          digest = MessageDigest.getInstance(algorithm);
        } catch (NoSuchAlgorithmException ex) {
          throw new RuntimeException(ex);
        }

        setHandler(
            out,
            new AbstractOutHandler() {
              @Override
              public void onPull() {
                pull(in);
              }
            });

        setHandler(
            in,
            new AbstractInHandler() {
              @Override
              public void onPush() {
                ByteString chunk = grab(in);
                digest.update(chunk.toArray());
                pull(in);
              }

              @Override
              public void onUpstreamFinish() {
                // If the stream is finished, we need to emit the digest
                // before completing
                emit(out, ByteString.fromArray(digest.digest()));
                completeStage();
              }
            });
      }
    };
  }
}
```

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/javadsl/cookbook/RecipeDigest.java#L106 "Go to snippet source")final Source<ByteString, NotUsed> digest = data.via(new DigestCalculator("SHA-256"));
```

### Parsing lines from a stream of ByteStrings

**Situation:** A stream of bytes is given as a stream of `ByteString` s containing lines terminated by line ending characters (or, alternatively, containing binary frames delimited by a special delimiter byte sequence) which needs to be parsed.

The `Framing` helper object class contains a convenience method to parse messages from a stream of `ByteString` s:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/cookbook/RecipeParseLines.scala#L28-L31 "Go to snippet source")import akka.stream.scaladsl.Framing
val linesStream = rawData
  .via(Framing.delimiter(ByteString("\r\n"), maximumFrameLength = 100, allowTruncation = true))
  .map(_.utf8String)
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/javadsl/cookbook/RecipeParseLines.java#L48-L51 "Go to snippet source")final Source<String, NotUsed> lines =
    rawData
        .via(Framing.delimiter(ByteString.fromString("\r\n"), 100, FramingTruncation.ALLOW))
        .map(b -> b.utf8String());
```

### Dealing with compressed data streams

**Situation:** A gzipped stream of bytes is given as a stream of `ByteString` s, for example from a `FileIO` source.

The `Compression` helper object class contains convenience methods for decompressing data streams compressed with Gzip or Deflate.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/cookbook/RecipeDecompress.scala#L18-L25 "Go to snippet source")import akka.stream.scaladsl.Compression
val uncompressed = compressed.via(Compression.gunzip()).map(_.utf8String)
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/javadsl/cookbook/RecipeDecompress.java#L44-L45 "Go to snippet source")final Source<ByteString, NotUsed> decompressedStream =
    compressedStream.via(Compression.gunzip(100));
```

### Implementing a Splitter

**Situation:** Given a stream of messages, where each message is a composition of different elements, we want to split the message into a series of individual sub\-messages, each of which may be processed in a different way.

The [Splitter](https://www.enterpriseintegrationpatterns.com/patterns/messaging/Sequencer.html) is an integration pattern as described in [Enterprise Integration Patterns](https://www.enterpriseintegrationpatterns.com). Let’s say that we have a stream containing strings. Each string contains a few numbers separated by “\-”. We want to create out of this a stream that only contains the numbers.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/cookbook/RecipeSplitter.scala#L23-L35 "Go to snippet source")//Sample Source
val source: Source[String, NotUsed] = Source(List("1-2-3", "2-3", "3-4"))

val ret = source
  .map(s => s.split("-").toList)
  .mapConcat(identity)
  //Sub-streams logic
  .map(s => s.toInt)
  .runWith(Sink.seq)

//Verify results

ret.futureValue should be(Vector(1, 2, 3, 2, 3, 3, 4))
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/javadsl/cookbook/RecipeSplitter.java#L26-L39 "Go to snippet source")// Sample Source
Source<String, NotUsed> source = Source.from(Arrays.asList("1-2-3", "2-3", "3-4"));

CompletionStage<List<Integer>> ret =
    source
        .map(s -> Arrays.asList(s.split("-")))
        .mapConcat(f -> f)
        // Sub-streams logic
        .map(s -> Integer.valueOf(s))
        .runWith(Sink.seq(), system);

// Verify results
List<Integer> list = ret.toCompletableFuture().get();
assert list.equals(Arrays.asList(1, 2, 3, 2, 3, 3, 4));
```

### Implementing a Splitter and Aggregator

**Situation:** Given a message, we want to split the message and aggregate its sub\-messages into a new message

Sometimes it’s very useful to split a message and aggregate its sub\-messages into a new message. This involves a combination of [Splitter](https://www.enterpriseintegrationpatterns.com/patterns/messaging/Sequencer.html) and [Aggregator](https://www.enterpriseintegrationpatterns.com/patterns/messaging/Aggregator.html)

Let’s say that now we want to create a new stream containing the sums of the numbers in each original string.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/cookbook/RecipeSplitter.scala#L43-L61 "Go to snippet source")//Sample Source
val source: Source[String, NotUsed] = Source(List("1-2-3", "2-3", "3-4"))

val result = source
  .map(s => s.split("-").toList)
  //split all messages into sub-streams
  .splitWhen(_ => true)
  //now split each collection
  .mapConcat(identity)
  //Sub-streams logic
  .map(s => s.toInt)
  //aggregate each sub-stream
  .reduce((a, b) => a + b)
  //and merge back the result into the original stream
  .mergeSubstreams
  .runWith(Sink.seq);

//Verify results
result.futureValue should be(Vector(6, 5, 7))
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/javadsl/cookbook/RecipeSplitter.java#L46-L66 "Go to snippet source")// Sample Source
Source<String, NotUsed> source = Source.from(Arrays.asList("1-2-3", "2-3", "3-4"));

CompletionStage<List<Integer>> ret =
    source
        .map(s -> Arrays.asList(s.split("-")))
        // split all messages into sub-streams
        .splitWhen(a -> true)
        // now split each collection
        .mapConcat(f -> f)
        // Sub-streams logic
        .map(s -> Integer.valueOf(s))
        // aggregate each sub-stream
        .reduce((a, b) -> a + b)
        // and merge back the result into the original stream
        .mergeSubstreams()
        .runWith(Sink.seq(), system);

// Verify results
List<Integer> list = ret.toCompletableFuture().get();
assert list.equals(Arrays.asList(6, 5, 7));
```

While in real life this solution is overkill for such a simple problem (you can just do everything in a map), more complex scenarios, involving in particular I/O, will benefit from the fact that you can parallelize sub\-streams and get back\-pressure for “free”.

### Implementing reduce\-by\-key

**Situation:** Given a stream of elements, we want to calculate some aggregated value on different subgroups of the elements.

The “hello world” of reduce\-by\-key style operations is *wordcount* which we demonstrate below. Given a stream of words we first create a new stream that groups the words according to the `identity` `i -> i` function, i.e. now we have a stream of streams, where every substream will serve identical words.

To count the words, we need to process the stream of streams (the actual groups containing identical words). `groupBy` returns a `SubFlow` `SubSource`, which means that we transform the resulting substreams directly. In this case we use the `reduce` operator to aggregate the word itself and the number of its occurrences within a tuple `(String, Integer)` `Pair<String, Integer>`. Each substream will then emit one final value—precisely such a pair—when the overall input completes. As a last step we merge back these values from the substreams into one single output stream.

One noteworthy detail pertains to the `MaximumDistinctWords` `MAXIMUM_DISTINCT_WORDS` parameter: this defines the breadth of the groupBy and merge operations. Akka Streams is focused on bounded resource consumption and the number of concurrently open inputs to the merge operator describes the amount of resources needed by the merge itself. Therefore only a finite number of substreams can be active at any given time. If the `groupBy` operator encounters more keys than this number then the stream cannot continue without violating its resource bound, in this case `groupBy` will terminate with a failure.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/cookbook/RecipeReduceByKey.scala#L26-L34 "Go to snippet source")val counts: Source[(String, Int), NotUsed] = words
// split the words into separate streams first
  .groupBy(MaximumDistinctWords, identity)
  //transform each element to pair with number of words in it
  .map(_ -> 1)
  // add counting logic to the streams
  .reduce((l, r) => (l._1, l._2 + r._2))
  // get a stream of word counts
  .mergeSubstreams
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/javadsl/cookbook/RecipeReduceByKeyTest.java#L50-L61 "Go to snippet source")final int MAXIMUM_DISTINCT_WORDS = 1000;

final Source<Pair<String, Integer>, NotUsed> counts =
    words
        // split the words into separate streams first
        .groupBy(MAXIMUM_DISTINCT_WORDS, i -> i)
        // transform each element to pair with number of words in it
        .map(i -> new Pair<>(i, 1))
        // add counting logic to the streams
        .reduce((left, right) -> new Pair<>(left.first(), left.second() + right.second()))
        // get a stream of word counts
        .mergeSubstreams();
```

By extracting the parts specific to *wordcount* into

- a `groupKey` function that defines the groups
- a `map` map each element to value that is used by the reduce on the substream
- a `reduce` function that does the actual reduction

we get a generalized version below:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/cookbook/RecipeReduceByKey.scala#L46-L58 "Go to snippet source")def reduceByKey[In, K, Out](maximumGroupSize: Int, groupKey: (In) => K, map: (In) => Out)(
    reduce: (Out, Out) => Out): Flow[In, (K, Out), NotUsed] = {

  Flow[In]
    .groupBy[K](maximumGroupSize, groupKey)
    .map(e => groupKey(e) -> map(e))
    .reduce((l, r) => l._1 -> reduce(l._2, r._2))
    .mergeSubstreams
}

val wordCounts = words.via(
  reduceByKey(MaximumDistinctWords, groupKey = (word: String) => word, map = (word: String) => 1)(
    (left: Int, right: Int) => left + right))
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/javadsl/cookbook/RecipeReduceByKeyTest.java#L79-L91 "Go to snippet source")public static <In, K, Out> Flow<In, Pair<K, Out>, NotUsed> reduceByKey(
    int maximumGroupSize,
    Function<In, K> groupKey,
    Function<In, Out> map,
    Function2<Out, Out, Out> reduce) {

  return Flow.<In>create()
      .groupBy(maximumGroupSize, groupKey)
      .map(i -> new Pair<>(groupKey.apply(i), map.apply(i)))
      .reduce(
          (left, right) -> new Pair<>(left.first(), reduce.apply(left.second(), right.second())))
      .mergeSubstreams();
}
```

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/javadsl/cookbook/RecipeReduceByKeyTest.java#L102-L111 "Go to snippet source")final int MAXIMUM_DISTINCT_WORDS = 1000;

Source<Pair<String, Integer>, NotUsed> counts =
    words.via(
        reduceByKey(
            MAXIMUM_DISTINCT_WORDS,
            word -> word,
            word -> 1,
            (left, right) -> left + right));

```

Note
Please note that the reduce\-by\-key version we discussed above is sequential in reading the overall input stream, in other words it is **NOT** a parallelization pattern like MapReduce and similar frameworks.

### Sorting elements to multiple groups with groupBy

**Situation:** The `groupBy` operation strictly partitions incoming elements, each element belongs to exactly one group. Sometimes we want to map elements into multiple groups simultaneously.

To achieve the desired result, we attack the problem in two steps:

- first, using a function `topicMapper` that gives a list of topics (groups) a message belongs to, we transform our stream of `Message` to a stream of `(Message, Topic)` `Pair<Message, Topic>` where for each topic the message belongs to a separate pair will be emitted. This is achieved by using `mapConcat`
- Then we take this new stream of message topic pairs (containing a separate pair for each topic a given message belongs to) and feed it into groupBy, using the topic as the group key.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/cookbook/RecipeMultiGroupBy.scala#L29-L44 "Go to snippet source")val topicMapper: (Message) => immutable.Seq[Topic] = extractTopics

val messageAndTopic: Source[(Message, Topic), NotUsed] = elems.mapConcat { (msg: Message) =>
  val topicsForMessage = topicMapper(msg)
  // Create a (Msg, Topic) pair for each of the topics
  // the message belongs to
  topicsForMessage.map(msg -> _)
}

val multiGroups = messageAndTopic.groupBy(2, _._2).map {
  case (msg, topic) =>
    // do what needs to be done
}
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/javadsl/cookbook/RecipeMultiGroupByTest.java#L94-L120 "Go to snippet source")final Function<Message, List<Topic>> topicMapper = m -> extractTopics(m);

final Source<Pair<Message, Topic>, NotUsed> messageAndTopic =
    elems.mapConcat(
        (Message msg) -> {
          List<Topic> topicsForMessage = topicMapper.apply(msg);
          // Create a (Msg, Topic) pair for each of the topics

          // the message belongs to
          return topicsForMessage.stream()
              .map(topic -> new Pair<Message, Topic>(msg, topic))
              .collect(toList());
        });

SubSource<Pair<Message, Topic>, NotUsed> multiGroups =
    messageAndTopic
        .groupBy(2, pair -> pair.second())
        .map(
            pair -> {
              Message message = pair.first();
              Topic topic = pair.second();

              // do what needs to be done
            });
```

### Adhoc source

**Situation:** The idea is that you have a source which you don’t want to start until you have a demand. Also, you want to shut it down when there is no more demand, and start it up again there is new demand again.

You can achieve this behavior by combining `lazySource`, `backpressureTimeout` and `recoverWithRetries` as follows:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/cookbook/RecipeAdhocSource.scala#L20-L28 "Go to snippet source")def adhocSource[T](source: Source[T, _], timeout: FiniteDuration, maxRetries: Int): Source[T, _] =
  Source.lazySource(
    () =>
      source
        .backpressureTimeout(timeout)
        .recoverWithRetries(maxRetries, {
          case _: TimeoutException =>
            Source.lazySource(() => source.backpressureTimeout(timeout)).mapMaterializedValue(_ => NotUsed)
        }))
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/javadsl/cookbook/RecipeAdhocSourceTest.java#L48-L62 "Go to snippet source")public <T> Source<T, ?> adhocSource(Source<T, ?> source, Duration timeout, int maxRetries) {
  return Source.lazySource(
      () ->
          source
              .backpressureTimeout(timeout)
              .recoverWithRetries(
                  maxRetries,
                  new PFBuilder<Throwable, Source<T, NotUsed>>()
                      .match(
                          TimeoutException.class,
                          ex ->
                              Source.lazySource(() -> source.backpressureTimeout(timeout))
                                  .mapMaterializedValue(v -> NotUsed.getInstance()))
                      .build()));
}
```

## Working with Operators

In this collection we show recipes that use stream operators to achieve various goals.

### Triggering the flow of elements programmatically

**Situation:** Given a stream of elements we want to control the emission of those elements according to a trigger signal. In other words, even if the stream would be able to flow (not being backpressured) we want to hold back elements until a trigger signal arrives.

This recipe solves the problem by zipping the stream of `Message` elements with the stream of `Trigger` signals. Since `Zip` produces pairs, we map the output stream selecting the first element of the pair.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/cookbook/RecipeManualTrigger.scala#L26-L33 "Go to snippet source")val graph = RunnableGraph.fromGraph(GraphDSL.create() { implicit builder =>
  import GraphDSL.Implicits._
  val zip = builder.add(Zip[Message, Trigger]())
  elements ~> zip.in0
  triggerSource ~> zip.in1
  zip.out ~> Flow[(Message, Trigger)].map { case (msg, _) => msg } ~> sink
  ClosedShape
})
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/javadsl/cookbook/RecipeManualTrigger.java#L50-L71 "Go to snippet source")final RunnableGraph<Pair<TestPublisher.Probe<Trigger>, TestSubscriber.Probe<Message>>> g =
    RunnableGraph
        .<Pair<TestPublisher.Probe<Trigger>, TestSubscriber.Probe<Message>>>fromGraph(
            GraphDSL.create(
                triggerSource,
                messageSink,
                (p, s) -> new Pair<>(p, s),
                (builder, source, sink) -> {
                  SourceShape<Message> elements =
                      builder.add(
                          Source.from(Arrays.asList("1", "2", "3", "4"))
                              .map(t -> new Message(t)));
                  FlowShape<Pair<Message, Trigger>, Message> takeMessage =
                      builder.add(
                          Flow.<Pair<Message, Trigger>>create().map(p -> p.first()));
                  final FanInShape2<Message, Trigger, Pair<Message, Trigger>> zip =
                      builder.add(Zip.create());
                  builder.from(elements).toInlet(zip.in0());
                  builder.from(source).toInlet(zip.in1());
                  builder.from(zip.out()).via(takeMessage).to(sink);
                  return ClosedShape.getInstance();
                }));
```

Alternatively, instead of using a `Zip`, and then using `map` to get the first element of the pairs, we can avoid creating the pairs in the first place by using `ZipWith` which takes a two argument function to produce the output element. If this function would return a pair of the two argument it would be exactly the behavior of `Zip` so `ZipWith` is a generalization of zipping.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/cookbook/RecipeManualTrigger.scala#L65-L73 "Go to snippet source")val graph = RunnableGraph.fromGraph(GraphDSL.create() { implicit builder =>
  import GraphDSL.Implicits._
  val zip = builder.add(ZipWith((msg: Message, _: Trigger) => msg))

  elements ~> zip.in0
  triggerSource ~> zip.in1
  zip.out ~> sink
  ClosedShape
})
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/javadsl/cookbook/RecipeManualTrigger.java#L108-L126 "Go to snippet source")final RunnableGraph<Pair<TestPublisher.Probe<Trigger>, TestSubscriber.Probe<Message>>> g =
    RunnableGraph
        .<Pair<TestPublisher.Probe<Trigger>, TestSubscriber.Probe<Message>>>fromGraph(
            GraphDSL.create(
                triggerSource,
                messageSink,
                (p, s) -> new Pair<>(p, s),
                (builder, source, sink) -> {
                  final SourceShape<Message> elements =
                      builder.add(
                          Source.from(Arrays.asList("1", "2", "3", "4"))
                              .map(t -> new Message(t)));
                  final FanInShape2<Message, Trigger, Message> zipWith =
                      builder.add(ZipWith.create((msg, trigger) -> msg));
                  builder.from(elements).toInlet(zipWith.in0());
                  builder.from(source).toInlet(zipWith.in1());
                  builder.from(zipWith.out()).to(sink);
                  return ClosedShape.getInstance();
                }));
```

### Balancing jobs to a fixed pool of workers

**Situation:** Given a stream of jobs and a worker process expressed as a `Flow` create a pool of workers that automatically balances incoming jobs to available workers, then merges the results.

We will express our solution as a function that takes a worker flow and the number of workers to be allocated and gives a flow that internally contains a pool of these workers. To achieve the desired result we will create a `Flow` from an operator.

The operator consists of a `Balance` node which is a special fan\-out operation that tries to route elements to available downstream consumers. In a `for` loop we wire all of our desired workers as outputs of this balancer element, then we wire the outputs of these workers to a `Merge` element that will collect the results from the workers.

To make the worker operators run in parallel we mark them as asynchronous with *async*.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/cookbook/RecipeWorkerPool.scala#L25-L42 "Go to snippet source")def balancer[In, Out](worker: Flow[In, Out, Any], workerCount: Int): Flow[In, Out, NotUsed] = {
  import GraphDSL.Implicits._

  Flow.fromGraph(GraphDSL.create() { implicit b =>
    val balancer = b.add(Balance[In](workerCount, waitForAllDownstreams = true))
    val merge = b.add(Merge[Out](workerCount))

    for (_ <- 1 to workerCount) {
      // for each worker, add an edge from the balancer to the worker, then wire
      // it to the merge element
      balancer ~> worker.async ~> merge
    }

    FlowShape(balancer.in, merge.out)
  })
}

val processedJobs: Source[Result, NotUsed] = myJobs.via(balancer(worker, 3))
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/javadsl/cookbook/RecipeWorkerPool.java#L38-L54 "Go to snippet source")public static <In, Out> Flow<In, Out, NotUsed> balancer(
    Flow<In, Out, NotUsed> worker, int workerCount) {
  return Flow.fromGraph(
      GraphDSL.create(
          b -> {
            boolean waitForAllDownstreams = true;
            final UniformFanOutShape<In, In> balance =
                b.add(Balance.<In>create(workerCount, waitForAllDownstreams));
            final UniformFanInShape<Out, Out> merge = b.add(Merge.<Out>create(workerCount));

            for (int i = 0; i < workerCount; i++) {
              b.from(balance.out(i)).via(b.add(worker.async())).toInlet(merge.in(i));
            }

            return FlowShape.of(balance.in(), merge.out());
          }));
}
```

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/javadsl/cookbook/RecipeWorkerPool.java#L68-L69 "Go to snippet source")Flow<Message, Message, NotUsed> balancer = balancer(worker, 3);
Source<Message, NotUsed> processedJobs = data.via(balancer);
```

## Working with rate

This collection of recipes demonstrate various patterns where rate differences between upstream and downstream needs to be handled by other strategies than simple backpressure.

### Dropping elements

**Situation:** Given a fast producer and a slow consumer, we want to drop elements if necessary to not slow down the producer too much.

This can be solved by using a versatile rate\-transforming operation, `conflate`. Conflate can be thought as a special `reduce` operation that collapses multiple upstream elements into one aggregate element if needed to keep the speed of the upstream unaffected by the downstream.

When the upstream is faster, the reducing process of the `conflate` starts. Our reducer function takes the freshest element. This in a simple dropping operation.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/cookbook/RecipeSimpleDrop.scala#L25-L26 "Go to snippet source")val droppyStream: Flow[Message, Message, NotUsed] =
  Flow[Message].conflate((lastMessage, newMessage) => newMessage)
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/javadsl/cookbook/RecipeSimpleDrop.java#L44-L45 "Go to snippet source")final Flow<Message, Message, NotUsed> droppyStream =
    Flow.of(Message.class).conflate((lastMessage, newMessage) -> newMessage);
```

There is a more general version of `conflate` named `conflateWithSeed` that allows to express more complex aggregations, more similar to a `fold`.

### Dropping broadcast

**Situation:** The default `Broadcast` operator is properly backpressured, but that means that a slow downstream consumer can hold back the other downstream consumers resulting in lowered throughput. In other words the rate of `Broadcast` is the rate of its slowest downstream consumer. In certain cases it is desirable to allow faster consumers to progress independently of their slower siblings by dropping elements if necessary.

One solution to this problem is to append a `buffer` element in front of all of the downstream consumers defining a dropping strategy instead of the default `Backpressure`. This allows small temporary rate differences between the different consumers (the buffer smooths out small rate variances), but also allows faster consumers to progress by dropping from the buffer of the slow consumers if necessary.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/cookbook/RecipeDroppyBroadcast.scala#L26-L37 "Go to snippet source")val graph = RunnableGraph.fromGraph(GraphDSL.createGraph(mySink1, mySink2, mySink3)((_, _, _)) {
  implicit b => (sink1, sink2, sink3) =>
    import GraphDSL.Implicits._

    val bcast = b.add(Broadcast[Int](3))
    myElements ~> bcast

    bcast.buffer(10, OverflowStrategy.dropHead) ~> sink1
    bcast.buffer(10, OverflowStrategy.dropHead) ~> sink2
    bcast.buffer(10, OverflowStrategy.dropHead) ~> sink3
    ClosedShape
})
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/javadsl/cookbook/RecipeDroppyBroadcast.java#L38-L42 "Go to snippet source")// Makes a sink drop elements if too slow
public <T> Sink<T, CompletionStage<Done>> droppySink(
    Sink<T, CompletionStage<Done>> sink, int size) {
  return Flow.<T>create().buffer(size, OverflowStrategy.dropHead()).toMat(sink, Keep.right());
}
```

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/javadsl/cookbook/RecipeDroppyBroadcast.java#L58-L69 "Go to snippet source")RunnableGraph.fromGraph(
    GraphDSL.create(
        builder -> {
          final int outputCount = 3;
          final UniformFanOutShape<Integer, Integer> bcast =
              builder.add(Broadcast.create(outputCount));
          builder.from(builder.add(myData)).toFanOut(bcast);
          builder.from(bcast).to(builder.add(droppySink(mySink1, 10)));
          builder.from(bcast).to(builder.add(droppySink(mySink2, 10)));
          builder.from(bcast).to(builder.add(droppySink(mySink3, 10)));
          return ClosedShape.getInstance();
        }));
```

### Collecting missed ticks

**Situation:** Given a regular (stream) source of ticks, instead of trying to backpressure the producer of the ticks we want to keep a counter of the missed ticks instead and pass it down when possible.

We will use `conflateWithSeed` to solve the problem. The seed version of conflate takes two functions:

- A seed function that produces the zero element for the folding process that happens when the upstream is faster than the downstream. In our case the seed function is a constant function that returns 0 since there were no missed ticks at that point.
- A fold function that is invoked when multiple upstream messages needs to be collapsed to an aggregate value due to the insufficient processing rate of the downstream. Our folding function increments the currently stored count of the missed ticks so far.

As a result, we have a flow of `Int` where the number represents the missed ticks. A number 0 means that we were able to consume the tick fast enough (i.e. zero means: 1 non\-missed tick \+ 0 missed ticks)

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/cookbook/RecipeMissedTicks.scala#L31-L32 "Go to snippet source")val missedTicks: Flow[Tick, Int, NotUsed] =
  Flow[Tick].conflateWithSeed(seed = _ => 0)((missedTicks, _) => missedTicks + 1)
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/javadsl/cookbook/RecipeMissedTicks.java#L53-L54 "Go to snippet source")final Flow<Tick, Integer, NotUsed> missedTicks =
    Flow.of(Tick.class).conflateWithSeed(tick -> 0, (missed, tick) -> missed + 1);
```

### Create a stream processor that repeats the last element seen

**Situation:** Given a producer and consumer, where the rate of neither is known in advance, we want to ensure that none of them is slowing down the other by dropping earlier unconsumed elements from the upstream if necessary, and repeating the last value for the downstream if necessary.

We have two options to implement this feature. In both cases we will use [`GraphStage`](stream-customize.html), to build our custom operator. In the first version we will use a provided initial value `initial` that will be used to feed the downstream if no upstream element is ready yet. In the `onPush()` handler we overwrite the `currentValue` variable and immediately relieve the upstream by calling `pull()`. The downstream `onPull` handler is very similar, we immediately relieve the downstream by emitting `currentValue`.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/cookbook/RecipeHold.scala#L15-L42 "Go to snippet source")import akka.stream._
import akka.stream.stage._
final class HoldWithInitial[T](initial: T) extends GraphStage[FlowShape[T, T]] {
  val in = Inlet[T]("HoldWithInitial.in")
  val out = Outlet[T]("HoldWithInitial.out")

  override val shape = FlowShape.of(in, out)

  override def createLogic(inheritedAttributes: Attributes): GraphStageLogic = new GraphStageLogic(shape) {
    private var currentValue: T = initial

    setHandlers(in, out, new InHandler with OutHandler {
      override def onPush(): Unit = {
        currentValue = grab(in)
        pull(in)
      }

      override def onPull(): Unit = {
        push(out, currentValue)
      }
    })

    override def preStart(): Unit = {
      pull(in)
    }
  }

}
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/javadsl/cookbook/RecipeHold.java#L40-L88 "Go to snippet source")class HoldWithInitial<T> extends GraphStage<FlowShape<T, T>> {

  public Inlet<T> in = Inlet.<T>create("HoldWithInitial.in");
  public Outlet<T> out = Outlet.<T>create("HoldWithInitial.out");
  private FlowShape<T, T> shape = FlowShape.of(in, out);

  private final T initial;

  public HoldWithInitial(T initial) {
    this.initial = initial;
  }

  @Override
  public FlowShape<T, T> shape() {
    return shape;
  }

  @Override
  public GraphStageLogic createLogic(Attributes inheritedAttributes) {
    return new GraphStageLogic(shape) {
      private T currentValue = initial;

      {
        setHandler(
            in,
            new AbstractInHandler() {
              @Override
              public void onPush() throws Exception {
                currentValue = grab(in);
                pull(in);
              }
            });
        setHandler(
            out,
            new AbstractOutHandler() {
              @Override
              public void onPull() throws Exception {
                push(out, currentValue);
              }
            });
      }

      @Override
      public void preStart() {
        pull(in);
      }
    };
  }
}
```

While it is relatively simple, the drawback of the first version is that it needs an arbitrary initial element which is not always possible to provide. Hence, we create a second version where the downstream might need to wait in one single case: if the very first element is not yet available.

We introduce a boolean variable `waitingFirstValue` to denote whether the first element has been provided or not (alternatively an `Option` `Optional` can be used for `currentValue` or if the element type is a subclass of `AnyRef` `Object` a null can be used with the same purpose). In the downstream `onPull()` handler the difference from the previous version is that we check if we have received the first value and only emit if we have. This leads to that when the first element comes in we must check if there possibly already was demand from downstream so that we in that case can push the element directly.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/cookbook/RecipeHold.scala#L46-L80 "Go to snippet source")import akka.stream._
import akka.stream.stage._
final class HoldWithWait[T] extends GraphStage[FlowShape[T, T]] {
  val in = Inlet[T]("HoldWithWait.in")
  val out = Outlet[T]("HoldWithWait.out")

  override val shape = FlowShape.of(in, out)

  override def createLogic(inheritedAttributes: Attributes): GraphStageLogic = new GraphStageLogic(shape) {
    private var currentValue: T = _
    private var waitingFirstValue = true

    setHandlers(
      in,
      out,
      new InHandler with OutHandler {
        override def onPush(): Unit = {
          currentValue = grab(in)
          if (waitingFirstValue) {
            waitingFirstValue = false
            if (isAvailable(out)) push(out, currentValue)
          }
          pull(in)
        }

        override def onPull(): Unit = {
          if (!waitingFirstValue) push(out, currentValue)
        }
      })

    override def preStart(): Unit = {
      pull(in)
    }
  }
}
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/javadsl/cookbook/RecipeHold.java#L92-L138 "Go to snippet source")class HoldWithWait<T> extends GraphStage<FlowShape<T, T>> {
  public Inlet<T> in = Inlet.<T>create("HoldWithInitial.in");
  public Outlet<T> out = Outlet.<T>create("HoldWithInitial.out");
  private FlowShape<T, T> shape = FlowShape.of(in, out);

  @Override
  public FlowShape<T, T> shape() {
    return shape;
  }

  @Override
  public GraphStageLogic createLogic(Attributes inheritedAttributes) {
    return new GraphStageLogic(shape) {
      private T currentValue = null;
      private boolean waitingFirstValue = true;

      {
        setHandler(
            in,
            new AbstractInHandler() {
              @Override
              public void onPush() throws Exception {
                currentValue = grab(in);
                if (waitingFirstValue) {
                  waitingFirstValue = false;
                  if (isAvailable(out)) push(out, currentValue);
                }
                pull(in);
              }
            });
        setHandler(
            out,
            new AbstractOutHandler() {
              @Override
              public void onPull() throws Exception {
                if (!waitingFirstValue) push(out, currentValue);
              }
            });
      }

      @Override
      public void preStart() {
        pull(in);
      }
    };
  }
}
```

### Globally limiting the rate of a set of streams

**Situation:** Given a set of independent streams that we cannot merge, we want to globally limit the aggregate throughput of the set of streams.

One possible solution uses a shared actor as the global limiter combined with mapAsync to create a reusable `Flow` that can be plugged into a stream to limit its rate.

As the first step we define an actor that will do the accounting for the global rate limit. The actor maintains a timer, a counter for pending permit tokens and a queue for possibly waiting participants. The actor has an `open` and `closed` state. The actor is in the `open` state while it has still pending permits. Whenever a request for permit arrives as a `WantToPass` message to the actor the number of available permits is decremented and we notify the sender that it can pass by answering with a `MayPass` message. If the amount of permits reaches zero, the actor transitions to the `closed` state. In this state requests are not immediately answered, instead the reference of the sender is added to a queue. Once the timer for replenishing the pending permits fires by sending a `ReplenishTokens` message, we increment the pending permits counter and send a reply to each of the waiting senders. If there are more waiting senders than permits available we will stay in the `closed` state.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/cookbook/RecipeGlobalRateLimit.scala#L22-L77 "Go to snippet source")object Limiter {
  case object WantToPass
  case object MayPass

  case object ReplenishTokens

  def props(maxAvailableTokens: Int, tokenRefreshPeriod: FiniteDuration, tokenRefreshAmount: Int): Props =
    Props(new Limiter(maxAvailableTokens, tokenRefreshPeriod, tokenRefreshAmount))
}

class Limiter(val maxAvailableTokens: Int, val tokenRefreshPeriod: FiniteDuration, val tokenRefreshAmount: Int)
    extends Actor {
  import Limiter._
  import context.dispatcher
  import akka.actor.Status

  private var waitQueue = immutable.Queue.empty[ActorRef]
  private var permitTokens = maxAvailableTokens
  private val replenishTimer = system.scheduler.scheduleWithFixedDelay(
    initialDelay = tokenRefreshPeriod,
    delay = tokenRefreshPeriod,
    receiver = self,
    ReplenishTokens)

  override def receive: Receive = open

  val open: Receive = {
    case ReplenishTokens =>
      permitTokens = math.min(permitTokens + tokenRefreshAmount, maxAvailableTokens)
    case WantToPass =>
      permitTokens -= 1
      sender() ! MayPass
      if (permitTokens == 0) context.become(closed)
  }

  val closed: Receive = {
    case ReplenishTokens =>
      permitTokens = math.min(permitTokens + tokenRefreshAmount, maxAvailableTokens)
      releaseWaiting()
    case WantToPass =>
      waitQueue = waitQueue.enqueue(sender())
  }

  private def releaseWaiting(): Unit = {
    val (toBeReleased, remainingQueue) = waitQueue.splitAt(permitTokens)
    waitQueue = remainingQueue
    permitTokens -= toBeReleased.size
    toBeReleased.foreach(_ ! MayPass)
    if (permitTokens > 0) context.become(open)
  }

  override def postStop(): Unit = {
    replenishTimer.cancel()
    waitQueue.foreach(_ ! Status.Failure(new IllegalStateException("limiter stopped")))
  }
}
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/javadsl/cookbook/RecipeGlobalRateLimit.java#L40-L151 "Go to snippet source")static class Limiter extends AbstractActor {

  public static class WantToPass {}

  public static final WantToPass WANT_TO_PASS = new WantToPass();

  public static class MayPass {}

  public static final MayPass MAY_PASS = new MayPass();

  public static class ReplenishTokens {}

  public static final ReplenishTokens REPLENISH_TOKENS = new ReplenishTokens();

  private final int maxAvailableTokens;
  private final Duration tokenRefreshPeriod;
  private final int tokenRefreshAmount;

  private final List<ActorRef> waitQueue = new ArrayList<>();
  private final Cancellable replenishTimer;

  private int permitTokens;

  public static Props props(
      int maxAvailableTokens, Duration tokenRefreshPeriod, int tokenRefreshAmount) {
    return Props.create(
        Limiter.class, maxAvailableTokens, tokenRefreshPeriod, tokenRefreshAmount);
  }

  private Limiter(int maxAvailableTokens, Duration tokenRefreshPeriod, int tokenRefreshAmount) {
    this.maxAvailableTokens = maxAvailableTokens;
    this.tokenRefreshPeriod = tokenRefreshPeriod;
    this.tokenRefreshAmount = tokenRefreshAmount;
    this.permitTokens = maxAvailableTokens;

    this.replenishTimer =
        system
            .scheduler()
            .scheduleWithFixedDelay(
                this.tokenRefreshPeriod,
                this.tokenRefreshPeriod,
                getSelf(),
                REPLENISH_TOKENS,
                getContext().getSystem().dispatcher(),
                getSelf());
  }

  @Override
  public Receive createReceive() {
    return open();
  }

  private Receive open() {
    return receiveBuilder()
        .match(
            ReplenishTokens.class,
            rt -> {
              permitTokens = Math.min(permitTokens + tokenRefreshAmount, maxAvailableTokens);
            })
        .match(
            WantToPass.class,
            wtp -> {
              permitTokens -= 1;
              getSender().tell(MAY_PASS, getSelf());
              if (permitTokens == 0) {
                getContext().become(closed());
              }
            })
        .build();
  }

  private Receive closed() {
    return receiveBuilder()
        .match(
            ReplenishTokens.class,
            rt -> {
              permitTokens = Math.min(permitTokens + tokenRefreshAmount, maxAvailableTokens);
              releaseWaiting();
            })
        .match(
            WantToPass.class,
            wtp -> {
              waitQueue.add(getSender());
            })
        .build();
  }

  private void releaseWaiting() {
    final List<ActorRef> toBeReleased = new ArrayList<>(permitTokens);
    for (Iterator<ActorRef> it = waitQueue.iterator(); permitTokens > 0 && it.hasNext(); ) {
      toBeReleased.add(it.next());
      it.remove();
      permitTokens--;
    }

    toBeReleased.stream().forEach(ref -> ref.tell(MAY_PASS, getSelf()));
    if (permitTokens > 0) {
      getContext().become(open());
    }
  }

  @Override
  public void postStop() {
    replenishTimer.cancel();
    waitQueue.stream()
        .forEach(
            ref -> {
              ref.tell(
                  new Status.Failure(new IllegalStateException("limiter stopped")), getSelf());
            });
  }
}
```

To create a Flow that uses this global limiter actor we use the `mapAsync` function with the combination of the `ask` pattern. We also define a timeout, so if a reply is not received during the configured maximum wait period the returned future from `ask` will fail, which will fail the corresponding stream as well.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/cookbook/RecipeGlobalRateLimit.scala#L83-L93 "Go to snippet source")def limitGlobal[T](limiter: ActorRef, maxAllowedWait: FiniteDuration): Flow[T, T, NotUsed] = {
  import akka.pattern.ask
  import akka.util.Timeout
  Flow[T].mapAsync(4)((element: T) => {
    import system.dispatcher
    implicit val triggerTimeout = Timeout(maxAllowedWait)
    val limiterTriggerFuture = limiter ? Limiter.WantToPass
    limiterTriggerFuture.map((_) => element)
  })

}
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/javadsl/cookbook/RecipeGlobalRateLimit.java#L158-L169 "Go to snippet source")public <T> Flow<T, T, NotUsed> limitGlobal(ActorRef limiter, Duration maxAllowedWait) {
  final int parallelism = 4;
  final Flow<T, T, NotUsed> f = Flow.create();

  return f.mapAsync(
      parallelism,
      element -> {
        final CompletionStage<Object> limiterTriggerFuture =
            Patterns.ask(limiter, Limiter.WANT_TO_PASS, maxAllowedWait);
        return limiterTriggerFuture.thenApplyAsync(response -> element, system.dispatcher());
      });
}
```

Note
The global actor used for limiting introduces a global bottleneck. You might want to assign a dedicated dispatcher for this actor.

## Working with IO

### Chunking up a stream of ByteStrings into limited size ByteStrings

**Situation:** Given a stream of `ByteString` s we want to produce a stream of `ByteString` s containing the same bytes in the same sequence, but capping the size of `ByteString` s. In other words we want to slice up `ByteString` s into smaller chunks if they exceed a size threshold.

This can be achieved with a single [`GraphStage`](stream-customize.html) to define a custom Akka Stream operator. The main logic of our operator is in `emitChunk()` which implements the following logic:

- if the buffer is empty, and upstream is not closed we pull for more bytes, if it is closed we complete
- if the buffer is nonEmpty, we split it according to the `chunkSize`. This will give a next chunk that we will emit, and an empty or nonempty remaining buffer.

Both `onPush()` and `onPull()` calls `emitChunk()` the only difference is that the push handler also stores the incoming chunk by appending to the end of the buffer.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/cookbook/RecipeByteStrings.scala#L24-L74 "Go to snippet source")import akka.stream.stage._

class Chunker(val chunkSize: Int) extends GraphStage[FlowShape[ByteString, ByteString]] {
  val in = Inlet[ByteString]("Chunker.in")
  val out = Outlet[ByteString]("Chunker.out")
  override val shape = FlowShape.of(in, out)
  override def createLogic(inheritedAttributes: Attributes): GraphStageLogic = new GraphStageLogic(shape) {
    private var buffer = ByteString.empty

    setHandler(out, new OutHandler {
      override def onPull(): Unit = {
        emitChunk()
      }
    })
    setHandler(
      in,
      new InHandler {
        override def onPush(): Unit = {
          val elem = grab(in)
          buffer ++= elem
          emitChunk()
        }

        override def onUpstreamFinish(): Unit = {
          if (buffer.isEmpty) completeStage()
          else {
            // There are elements left in buffer, so
            // we keep accepting downstream pulls and push from buffer until emptied.
            //
            // It might be though, that the upstream finished while it was pulled, in which
            // case we will not get an onPull from the downstream, because we already had one.
            // In that case we need to emit from the buffer.
            if (isAvailable(out)) emitChunk()
          }
        }
      })

    private def emitChunk(): Unit = {
      if (buffer.isEmpty) {
        if (isClosed(in)) completeStage()
        else pull(in)
      } else {
        val (chunk, nextBuffer) = buffer.splitAt(chunkSize)
        buffer = nextBuffer
        push(out, chunk)
      }
    }
  }
}

val chunksStream = rawBytes.via(new Chunker(ChunkLimit))
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/javadsl/cookbook/RecipeByteStrings.java#L58-L132 "Go to snippet source")class Chunker extends GraphStage<FlowShape<ByteString, ByteString>> {

  private final int chunkSize;

  public Inlet<ByteString> in = Inlet.<ByteString>create("Chunker.in");
  public Outlet<ByteString> out = Outlet.<ByteString>create("Chunker.out");
  private FlowShape<ByteString, ByteString> shape = FlowShape.of(in, out);

  public Chunker(int chunkSize) {
    this.chunkSize = chunkSize;
  }

  @Override
  public FlowShape<ByteString, ByteString> shape() {
    return shape;
  }

  @Override
  public GraphStageLogic createLogic(Attributes inheritedAttributes) {
    return new GraphStageLogic(shape) {
      private ByteString buffer = emptyByteString();

      {
        setHandler(
            out,
            new AbstractOutHandler() {
              @Override
              public void onPull() throws Exception {
                emitChunk();
              }
            });

        setHandler(
            in,
            new AbstractInHandler() {

              @Override
              public void onPush() throws Exception {
                ByteString elem = grab(in);
                buffer = buffer.concat(elem);
                emitChunk();
              }

              @Override
              public void onUpstreamFinish() throws Exception {
                if (buffer.isEmpty()) completeStage();
                else {
                  // There are elements left in buffer, so
                  // we keep accepting downstream pulls and push from buffer until emptied.
                  //
                  // It might be though, that the upstream finished while it was pulled, in
                  // which
                  // case we will not get an onPull from the downstream, because we already
                  // had one.
                  // In that case we need to emit from the buffer.
                  if (isAvailable(out)) emitChunk();
                }
              }
            });
      }

      private void emitChunk() {
        if (buffer.isEmpty()) {
          if (isClosed(in)) completeStage();
          else pull(in);
        } else {
          Tuple2<ByteString, ByteString> split = buffer.splitAt(chunkSize);
          ByteString chunk = split._1();
          buffer = split._2();
          push(out, chunk);
        }
      }
    };
  }
}
```

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/javadsl/cookbook/RecipeByteStrings.java#L137 "Go to snippet source")Source<ByteString, NotUsed> chunksStream = rawBytes.via(new Chunker(CHUNK_LIMIT));
```

### Limit the number of bytes passing through a stream of ByteStrings

**Situation:** Given a stream of `ByteString` s we want to fail the stream if more than a given maximum of bytes has been consumed.

This recipe uses a [`GraphStage`](stream-customize.html) to implement the desired feature. In the only handler we override, `onPush()` we update a counter and see if it gets larger than `maximumBytes`. If a violation happens we signal failure, otherwise we forward the chunk we have received.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/cookbook/RecipeByteStrings.scala#L88-L113 "Go to snippet source")import akka.stream.stage._
class ByteLimiter(val maximumBytes: Long) extends GraphStage[FlowShape[ByteString, ByteString]] {
  val in = Inlet[ByteString]("ByteLimiter.in")
  val out = Outlet[ByteString]("ByteLimiter.out")
  override val shape = FlowShape.of(in, out)

  override def createLogic(inheritedAttributes: Attributes): GraphStageLogic = new GraphStageLogic(shape) {
    private var count = 0

    setHandlers(in, out, new InHandler with OutHandler {

      override def onPull(): Unit = {
        pull(in)
      }

      override def onPush(): Unit = {
        val chunk = grab(in)
        count += chunk.size
        if (count > maximumBytes) failStage(new IllegalStateException("Too much bytes"))
        else push(out, chunk)
      }
    })
  }
}

val limiter = Flow[ByteString].via(new ByteLimiter(SizeLimit))
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/javadsl/cookbook/RecipeByteStrings.java#L164-L212 "Go to snippet source")class ByteLimiter extends GraphStage<FlowShape<ByteString, ByteString>> {

  final long maximumBytes;

  public Inlet<ByteString> in = Inlet.<ByteString>create("ByteLimiter.in");
  public Outlet<ByteString> out = Outlet.<ByteString>create("ByteLimiter.out");
  private FlowShape<ByteString, ByteString> shape = FlowShape.of(in, out);

  public ByteLimiter(long maximumBytes) {
    this.maximumBytes = maximumBytes;
  }

  @Override
  public FlowShape<ByteString, ByteString> shape() {
    return shape;
  }

  @Override
  public GraphStageLogic createLogic(Attributes inheritedAttributes) {
    return new GraphStageLogic(shape) {
      private int count = 0;

      {
        setHandler(
            out,
            new AbstractOutHandler() {
              @Override
              public void onPull() throws Exception {
                pull(in);
              }
            });
        setHandler(
            in,
            new AbstractInHandler() {
              @Override
              public void onPush() throws Exception {
                ByteString chunk = grab(in);
                count += chunk.size();
                if (count > maximumBytes) {
                  failStage(new IllegalStateException("Too much bytes"));
                } else {
                  push(out, chunk);
                }
              }
            });
      }
    };
  }
}
```

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/javadsl/cookbook/RecipeByteStrings.java#L217-L218 "Go to snippet source")Flow<ByteString, ByteString, NotUsed> limiter =
    Flow.of(ByteString.class).via(new ByteLimiter(SIZE_LIMIT));
```

### Compact ByteStrings in a stream of ByteStrings

**Situation:** After a long stream of transformations, due to their immutable, structural sharing nature `ByteString` s may refer to multiple original ByteString instances unnecessarily retaining memory. As the final step of a transformation chain we want to have clean copies that are no longer referencing the original `ByteString` s.

The recipe is a simple use of map, calling the `compact()` method of the `ByteString` elements. This does copying of the underlying arrays, so this should be the last element of a long chain if used.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/cookbook/RecipeByteStrings.scala#L132 "Go to snippet source")val compacted: Source[ByteString, NotUsed] = data.map(_.compact)
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/javadsl/cookbook/RecipeByteStrings.java#L280 "Go to snippet source")Source<ByteString, NotUsed> compacted = rawBytes.map(ByteString::compact);
```

### Injecting keep\-alive messages into a stream of ByteStrings

**Situation:** Given a communication channel expressed as a stream of `ByteString` s we want to inject keep\-alive messages but only if this does not interfere with normal traffic.

There is a built\-in operation that allows to do this directly:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/cookbook/RecipeKeepAlive.scala#L22-L24 "Go to snippet source")import scala.concurrent.duration._
val injectKeepAlive: Flow[ByteString, ByteString, NotUsed] =
  Flow[ByteString].keepAlive(1.second, () => keepaliveMessage)
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/javadsl/cookbook/RecipeKeepAlive.java#L43-L44 "Go to snippet source")Flow<ByteString, ByteString, NotUsed> keepAliveInject =
    Flow.of(ByteString.class).keepAlive(Duration.ofSeconds(1), () -> keepAliveMessage);
```

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

### Example 4: Logging in streams

```scala
val loggedSource = mySource.map { elem =>
  println(elem); elem
}
```

### Example 5: Logging in streams

```java
mySource.map(
    elem -> {
      System.out.println(elem);
      return elem;
    });
```

### Example 6: Logging in streams

```scala
// customise log levels
mySource
  .log("before-map")
  .withAttributes(Attributes
    .logLevels(onElement = Logging.WarningLevel, onFinish = Logging.InfoLevel, onFailure = Logging.DebugLevel))
  .map(analyse)
// or provide custom logging adapter
implicit val adapter: LoggingAdapter = Logging(system, "customLogger")
mySource.log("custom")
```

### Example 7: Logging in streams

```java
// customise log levels
mySource
    .log("before-map")
    .withAttributes(
        Attributes.createLogLevels(
            Logging.WarningLevel(), // onElement
            Logging.InfoLevel(), // onFinish
            Logging.DebugLevel() // onFailure
            ))
    .map(i -> analyse(i));

// or provide custom logging adapter
final LoggingAdapter adapter = Logging.getLogger(system, "customLogger");
mySource.log("custom", adapter);
```

### Example 8: Creating a source that continuously evaluates a function

```scala
val source = Source.repeat(NotUsed).map(_ => builderFunction())
```

### Example 9: Creating a source that continuously evaluates a function

```java
final Source<String, NotUsed> source =
    Source.repeat(NotUsed.getInstance()).map(elem -> builderFunction());
```

### Example 10: Flattening a stream of sequences

```scala
val myData: Source[List[Message], NotUsed] = someDataSource
val flattened: Source[Message, NotUsed] = myData.mapConcat(identity)
```

### Example 11: Flattening a stream of sequences

```java
Source<List<Message>, NotUsed> myData = someDataSource;
Source<Message, NotUsed> flattened = myData.mapConcat(i -> i);
```

### Example 12: Draining a stream to a strict collection

```scala
// Dangerous: might produce a collection with 2 billion elements!
val f: Future[Seq[String]] = mySource.runWith(Sink.seq)
```

### Example 13: Draining a stream to a strict collection

```java
// Dangerous: might produce a collection with 2 billion elements!
final CompletionStage<List<String>> strings = mySource.runWith(Sink.seq(), system);
```

### Example 14: Draining a stream to a strict collection

```scala
val MAX_ALLOWED_SIZE = 100

// OK. Future will fail with a `StreamLimitReachedException`
// if the number of incoming elements is larger than max
val limited: Future[Seq[String]] =
  mySource.limit(MAX_ALLOWED_SIZE).runWith(Sink.seq)

// OK. Collect up until max-th elements only, then cancel upstream
val ignoreOverflow: Future[Seq[String]] =
  mySource.take(MAX_ALLOWED_SIZE).runWith(Sink.seq)
```

### Example 15: Draining a stream to a strict collection

```java
final int MAX_ALLOWED_SIZE = 100;

// OK. Future will fail with a `StreamLimitReachedException`
// if the number of incoming elements is larger than max
final CompletionStage<List<String>> strings =
    mySource.limit(MAX_ALLOWED_SIZE).runWith(Sink.seq(), system);

// OK. Collect up until max-th elements only, then cancel upstream
final CompletionStage<List<String>> strings =
    mySource.take(MAX_ALLOWED_SIZE).runWith(Sink.seq(), system);
```

### Example 16: Calculating the digest of a ByteString stream

```scala
import java.security.MessageDigest

import akka.NotUsed
import akka.stream.{ Attributes, FlowShape, Inlet, Outlet }
import akka.stream.scaladsl.{ Sink, Source }
import akka.util.ByteString

import akka.stream.stage._

val data: Source[ByteString, NotUsed] = Source.single(ByteString("abc"))

class DigestCalculator(algorithm: String) extends GraphStage[FlowShape[ByteString, ByteString]] {
  val in = Inlet[ByteString]("DigestCalculator.in")
  val out = Outlet[ByteString]("DigestCalculator.out")
  override val shape = FlowShape(in, out)

  override def createLogic(inheritedAttributes: Attributes): GraphStageLogic = new GraphStageLogic(shape) {
    private val digest = MessageDigest.getInstance(algorithm)

    setHandler(out, new OutHandler {
      override def onPull(): Unit = pull(in)
    })

    setHandler(in, new InHandler {
      override def onPush(): Unit = {
        val chunk = grab(in)
        digest.update(chunk.toArray)
        pull(in)
      }

      override def onUpstreamFinish(): Unit = {
        emit(out, ByteString(digest.digest()))
        completeStage()
      }
    })
  }
}

val digest: Source[ByteString, NotUsed] = data.via(new DigestCalculator("SHA-256"))
```

### Example 17: Calculating the digest of a ByteString stream

```java
class DigestCalculator extends GraphStage<FlowShape<ByteString, ByteString>> {
  private final String algorithm;
  public Inlet<ByteString> in = Inlet.create("DigestCalculator.in");
  public Outlet<ByteString> out = Outlet.create("DigestCalculator.out");
  private FlowShape<ByteString, ByteString> shape = FlowShape.of(in, out);

  public DigestCalculator(String algorithm) {
    this.algorithm = algorithm;
  }

  @Override
  public FlowShape<ByteString, ByteString> shape() {
    return shape;
  }

  @Override
  public GraphStageLogic createLogic(Attributes inheritedAttributes) {
    return new GraphStageLogic(shape) {
      final MessageDigest digest;

      {
        try {
          digest = MessageDigest.getInstance(algorithm);
        } catch (NoSuchAlgorithmException ex) {
          throw new RuntimeException(ex);
        }

        setHandler(
            out,
            new AbstractOutHandler() {
              @Override
              public void onPull() {
                pull(in);
              }
            });

        setHandler(
            in,
            new AbstractInHandler() {
              @Override
              public void onPush() {
                ByteString chunk = grab(in);
                digest.update(chunk.toArray());
                pull(in);
              }

              @Override
              public void onUpstreamFinish() {
                // If the stream is finished, we need to emit the digest
                // before completing
                emit(out, ByteString.fromArray(digest.digest()));
                completeStage();
              }
            });
      }
    };
  }
}
```

### Example 18: Calculating the digest of a ByteString stream

```java
final Source<ByteString, NotUsed> digest = data.via(new DigestCalculator("SHA-256"));
```

### Example 19: Parsing lines from a stream of ByteStrings

```scala
import akka.stream.scaladsl.Framing
val linesStream = rawData
  .via(Framing.delimiter(ByteString("\r\n"), maximumFrameLength = 100, allowTruncation = true))
  .map(_.utf8String)
```

### Example 20: Parsing lines from a stream of ByteStrings

```java
final Source<String, NotUsed> lines =
    rawData
        .via(Framing.delimiter(ByteString.fromString("\r\n"), 100, FramingTruncation.ALLOW))
        .map(b -> b.utf8String());
```

### Example 21: Dealing with compressed data streams

```scala
import akka.stream.scaladsl.Compression
val uncompressed = compressed.via(Compression.gunzip()).map(_.utf8String)
```

### Example 22: Dealing with compressed data streams

```java
final Source<ByteString, NotUsed> decompressedStream =
    compressedStream.via(Compression.gunzip(100));
```

### Example 23: Implementing a Splitter

```scala
//Sample Source
val source: Source[String, NotUsed] = Source(List("1-2-3", "2-3", "3-4"))

val ret = source
  .map(s => s.split("-").toList)
  .mapConcat(identity)
  //Sub-streams logic
  .map(s => s.toInt)
  .runWith(Sink.seq)

//Verify results

ret.futureValue should be(Vector(1, 2, 3, 2, 3, 3, 4))
```

### Example 24: Implementing a Splitter

```java
// Sample Source
Source<String, NotUsed> source = Source.from(Arrays.asList("1-2-3", "2-3", "3-4"));

CompletionStage<List<Integer>> ret =
    source
        .map(s -> Arrays.asList(s.split("-")))
        .mapConcat(f -> f)
        // Sub-streams logic
        .map(s -> Integer.valueOf(s))
        .runWith(Sink.seq(), system);

// Verify results
List<Integer> list = ret.toCompletableFuture().get();
assert list.equals(Arrays.asList(1, 2, 3, 2, 3, 3, 4));
```

### Example 25: Implementing a Splitter and Aggregator

```scala
//Sample Source
val source: Source[String, NotUsed] = Source(List("1-2-3", "2-3", "3-4"))

val result = source
  .map(s => s.split("-").toList)
  //split all messages into sub-streams
  .splitWhen(_ => true)
  //now split each collection
  .mapConcat(identity)
  //Sub-streams logic
  .map(s => s.toInt)
  //aggregate each sub-stream
  .reduce((a, b) => a + b)
  //and merge back the result into the original stream
  .mergeSubstreams
  .runWith(Sink.seq);

//Verify results
result.futureValue should be(Vector(6, 5, 7))
```

### Example 26: Implementing a Splitter and Aggregator

```java
// Sample Source
Source<String, NotUsed> source = Source.from(Arrays.asList("1-2-3", "2-3", "3-4"));

CompletionStage<List<Integer>> ret =
    source
        .map(s -> Arrays.asList(s.split("-")))
        // split all messages into sub-streams
        .splitWhen(a -> true)
        // now split each collection
        .mapConcat(f -> f)
        // Sub-streams logic
        .map(s -> Integer.valueOf(s))
        // aggregate each sub-stream
        .reduce((a, b) -> a + b)
        // and merge back the result into the original stream
        .mergeSubstreams()
        .runWith(Sink.seq(), system);

// Verify results
List<Integer> list = ret.toCompletableFuture().get();
assert list.equals(Arrays.asList(6, 5, 7));
```

### Example 27: Implementing reduce-by-key

```scala
val counts: Source[(String, Int), NotUsed] = words
// split the words into separate streams first
  .groupBy(MaximumDistinctWords, identity)
  //transform each element to pair with number of words in it
  .map(_ -> 1)
  // add counting logic to the streams
  .reduce((l, r) => (l._1, l._2 + r._2))
  // get a stream of word counts
  .mergeSubstreams
```

### Example 28: Implementing reduce-by-key

```java
final int MAXIMUM_DISTINCT_WORDS = 1000;

final Source<Pair<String, Integer>, NotUsed> counts =
    words
        // split the words into separate streams first
        .groupBy(MAXIMUM_DISTINCT_WORDS, i -> i)
        // transform each element to pair with number of words in it
        .map(i -> new Pair<>(i, 1))
        // add counting logic to the streams
        .reduce((left, right) -> new Pair<>(left.first(), left.second() + right.second()))
        // get a stream of word counts
        .mergeSubstreams();
```

### Example 29: Implementing reduce-by-key

```scala
def reduceByKey[In, K, Out](maximumGroupSize: Int, groupKey: (In) => K, map: (In) => Out)(
    reduce: (Out, Out) => Out): Flow[In, (K, Out), NotUsed] = {

  Flow[In]
    .groupBy[K](maximumGroupSize, groupKey)
    .map(e => groupKey(e) -> map(e))
    .reduce((l, r) => l._1 -> reduce(l._2, r._2))
    .mergeSubstreams
}

val wordCounts = words.via(
  reduceByKey(MaximumDistinctWords, groupKey = (word: String) => word, map = (word: String) => 1)(
    (left: Int, right: Int) => left + right))
```

### Example 30: Implementing reduce-by-key

```java
public static <In, K, Out> Flow<In, Pair<K, Out>, NotUsed> reduceByKey(
    int maximumGroupSize,
    Function<In, K> groupKey,
    Function<In, Out> map,
    Function2<Out, Out, Out> reduce) {

  return Flow.<In>create()
      .groupBy(maximumGroupSize, groupKey)
      .map(i -> new Pair<>(groupKey.apply(i), map.apply(i)))
      .reduce(
          (left, right) -> new Pair<>(left.first(), reduce.apply(left.second(), right.second())))
      .mergeSubstreams();
}
```

### Example 31: Implementing reduce-by-key

```java
final int MAXIMUM_DISTINCT_WORDS = 1000;

Source<Pair<String, Integer>, NotUsed> counts =
    words.via(
        reduceByKey(
            MAXIMUM_DISTINCT_WORDS,
            word -> word,
            word -> 1,
            (left, right) -> left + right));
```

### Example 32: Sorting elements to multiple groups with groupBy

```scala
val topicMapper: (Message) => immutable.Seq[Topic] = extractTopics

val messageAndTopic: Source[(Message, Topic), NotUsed] = elems.mapConcat { (msg: Message) =>
  val topicsForMessage = topicMapper(msg)
  // Create a (Msg, Topic) pair for each of the topics
  // the message belongs to
  topicsForMessage.map(msg -> _)
}

val multiGroups = messageAndTopic.groupBy(2, _._2).map {
  case (msg, topic) =>
    // do what needs to be done
}
```

### Example 33: Sorting elements to multiple groups with groupBy

```java
final Function<Message, List<Topic>> topicMapper = m -> extractTopics(m);

final Source<Pair<Message, Topic>, NotUsed> messageAndTopic =
    elems.mapConcat(
        (Message msg) -> {
          List<Topic> topicsForMessage = topicMapper.apply(msg);
          // Create a (Msg, Topic) pair for each of the topics

          // the message belongs to
          return topicsForMessage.stream()
              .map(topic -> new Pair<Message, Topic>(msg, topic))
              .collect(toList());
        });

SubSource<Pair<Message, Topic>, NotUsed> multiGroups =
    messageAndTopic
        .groupBy(2, pair -> pair.second())
        .map(
            pair -> {
              Message message = pair.first();
              Topic topic = pair.second();

              // do what needs to be done
            });
```

### Example 34: Adhoc source

```scala
def adhocSource[T](source: Source[T, _], timeout: FiniteDuration, maxRetries: Int): Source[T, _] =
  Source.lazySource(
    () =>
      source
        .backpressureTimeout(timeout)
        .recoverWithRetries(maxRetries, {
          case _: TimeoutException =>
            Source.lazySource(() => source.backpressureTimeout(timeout)).mapMaterializedValue(_ => NotUsed)
        }))
```

### Example 35: Adhoc source

```java
public <T> Source<T, ?> adhocSource(Source<T, ?> source, Duration timeout, int maxRetries) {
  return Source.lazySource(
      () ->
          source
              .backpressureTimeout(timeout)
              .recoverWithRetries(
                  maxRetries,
                  new PFBuilder<Throwable, Source<T, NotUsed>>()
                      .match(
                          TimeoutException.class,
                          ex ->
                              Source.lazySource(() -> source.backpressureTimeout(timeout))
                                  .mapMaterializedValue(v -> NotUsed.getInstance()))
                      .build()));
}
```

### Example 36: Triggering the flow of elements programmatically

```scala
val graph = RunnableGraph.fromGraph(GraphDSL.create() { implicit builder =>
  import GraphDSL.Implicits._
  val zip = builder.add(Zip[Message, Trigger]())
  elements ~> zip.in0
  triggerSource ~> zip.in1
  zip.out ~> Flow[(Message, Trigger)].map { case (msg, _) => msg } ~> sink
  ClosedShape
})
```

### Example 37: Triggering the flow of elements programmatically

```java
final RunnableGraph<Pair<TestPublisher.Probe<Trigger>, TestSubscriber.Probe<Message>>> g =
    RunnableGraph
        .<Pair<TestPublisher.Probe<Trigger>, TestSubscriber.Probe<Message>>>fromGraph(
            GraphDSL.create(
                triggerSource,
                messageSink,
                (p, s) -> new Pair<>(p, s),
                (builder, source, sink) -> {
                  SourceShape<Message> elements =
                      builder.add(
                          Source.from(Arrays.asList("1", "2", "3", "4"))
                              .map(t -> new Message(t)));
                  FlowShape<Pair<Message, Trigger>, Message> takeMessage =
                      builder.add(
                          Flow.<Pair<Message, Trigger>>create().map(p -> p.first()));
                  final FanInShape2<Message, Trigger, Pair<Message, Trigger>> zip =
                      builder.add(Zip.create());
                  builder.from(elements).toInlet(zip.in0());
                  builder.from(source).toInlet(zip.in1());
                  builder.from(zip.out()).via(takeMessage).to(sink);
                  return ClosedShape.getInstance();
                }));
```

### Example 38: Triggering the flow of elements programmatically

```scala
val graph = RunnableGraph.fromGraph(GraphDSL.create() { implicit builder =>
  import GraphDSL.Implicits._
  val zip = builder.add(ZipWith((msg: Message, _: Trigger) => msg))

  elements ~> zip.in0
  triggerSource ~> zip.in1
  zip.out ~> sink
  ClosedShape
})
```

### Example 39: Triggering the flow of elements programmatically

```java
final RunnableGraph<Pair<TestPublisher.Probe<Trigger>, TestSubscriber.Probe<Message>>> g =
    RunnableGraph
        .<Pair<TestPublisher.Probe<Trigger>, TestSubscriber.Probe<Message>>>fromGraph(
            GraphDSL.create(
                triggerSource,
                messageSink,
                (p, s) -> new Pair<>(p, s),
                (builder, source, sink) -> {
                  final SourceShape<Message> elements =
                      builder.add(
                          Source.from(Arrays.asList("1", "2", "3", "4"))
                              .map(t -> new Message(t)));
                  final FanInShape2<Message, Trigger, Message> zipWith =
                      builder.add(ZipWith.create((msg, trigger) -> msg));
                  builder.from(elements).toInlet(zipWith.in0());
                  builder.from(source).toInlet(zipWith.in1());
                  builder.from(zipWith.out()).to(sink);
                  return ClosedShape.getInstance();
                }));
```

### Example 40: Balancing jobs to a fixed pool of workers

```scala
def balancer[In, Out](worker: Flow[In, Out, Any], workerCount: Int): Flow[In, Out, NotUsed] = {
  import GraphDSL.Implicits._

  Flow.fromGraph(GraphDSL.create() { implicit b =>
    val balancer = b.add(Balance[In](workerCount, waitForAllDownstreams = true))
    val merge = b.add(Merge[Out](workerCount))

    for (_ <- 1 to workerCount) {
      // for each worker, add an edge from the balancer to the worker, then wire
      // it to the merge element
      balancer ~> worker.async ~> merge
    }

    FlowShape(balancer.in, merge.out)
  })
}

val processedJobs: Source[Result, NotUsed] = myJobs.via(balancer(worker, 3))
```

### Example 41: Balancing jobs to a fixed pool of workers

```java
public static <In, Out> Flow<In, Out, NotUsed> balancer(
    Flow<In, Out, NotUsed> worker, int workerCount) {
  return Flow.fromGraph(
      GraphDSL.create(
          b -> {
            boolean waitForAllDownstreams = true;
            final UniformFanOutShape<In, In> balance =
                b.add(Balance.<In>create(workerCount, waitForAllDownstreams));
            final UniformFanInShape<Out, Out> merge = b.add(Merge.<Out>create(workerCount));

            for (int i = 0; i < workerCount; i++) {
              b.from(balance.out(i)).via(b.add(worker.async())).toInlet(merge.in(i));
            }

            return FlowShape.of(balance.in(), merge.out());
          }));
}
```

### Example 42: Balancing jobs to a fixed pool of workers

```java
Flow<Message, Message, NotUsed> balancer = balancer(worker, 3);
Source<Message, NotUsed> processedJobs = data.via(balancer);
```

### Example 43: Dropping elements

```scala
val droppyStream: Flow[Message, Message, NotUsed] =
  Flow[Message].conflate((lastMessage, newMessage) => newMessage)
```

### Example 44: Dropping elements

```java
final Flow<Message, Message, NotUsed> droppyStream =
    Flow.of(Message.class).conflate((lastMessage, newMessage) -> newMessage);
```

### Example 45: Dropping broadcast

```scala
val graph = RunnableGraph.fromGraph(GraphDSL.createGraph(mySink1, mySink2, mySink3)((_, _, _)) {
  implicit b => (sink1, sink2, sink3) =>
    import GraphDSL.Implicits._

    val bcast = b.add(Broadcast[Int](3))
    myElements ~> bcast

    bcast.buffer(10, OverflowStrategy.dropHead) ~> sink1
    bcast.buffer(10, OverflowStrategy.dropHead) ~> sink2
    bcast.buffer(10, OverflowStrategy.dropHead) ~> sink3
    ClosedShape
})
```

### Example 46: Dropping broadcast

```java
// Makes a sink drop elements if too slow
public <T> Sink<T, CompletionStage<Done>> droppySink(
    Sink<T, CompletionStage<Done>> sink, int size) {
  return Flow.<T>create().buffer(size, OverflowStrategy.dropHead()).toMat(sink, Keep.right());
}
```

### Example 47: Dropping broadcast

```java
RunnableGraph.fromGraph(
    GraphDSL.create(
        builder -> {
          final int outputCount = 3;
          final UniformFanOutShape<Integer, Integer> bcast =
              builder.add(Broadcast.create(outputCount));
          builder.from(builder.add(myData)).toFanOut(bcast);
          builder.from(bcast).to(builder.add(droppySink(mySink1, 10)));
          builder.from(bcast).to(builder.add(droppySink(mySink2, 10)));
          builder.from(bcast).to(builder.add(droppySink(mySink3, 10)));
          return ClosedShape.getInstance();
        }));
```

### Example 48: Collecting missed ticks

```scala
val missedTicks: Flow[Tick, Int, NotUsed] =
  Flow[Tick].conflateWithSeed(seed = _ => 0)((missedTicks, _) => missedTicks + 1)
```

### Example 49: Collecting missed ticks

```java
final Flow<Tick, Integer, NotUsed> missedTicks =
    Flow.of(Tick.class).conflateWithSeed(tick -> 0, (missed, tick) -> missed + 1);
```

### Example 50: Create a stream processor that repeats the last element seen

```scala
import akka.stream._
import akka.stream.stage._
final class HoldWithInitial[T](initial: T) extends GraphStage[FlowShape[T, T]] {
  val in = Inlet[T]("HoldWithInitial.in")
  val out = Outlet[T]("HoldWithInitial.out")

  override val shape = FlowShape.of(in, out)

  override def createLogic(inheritedAttributes: Attributes): GraphStageLogic = new GraphStageLogic(shape) {
    private var currentValue: T = initial

    setHandlers(in, out, new InHandler with OutHandler {
      override def onPush(): Unit = {
        currentValue = grab(in)
        pull(in)
      }

      override def onPull(): Unit = {
        push(out, currentValue)
      }
    })

    override def preStart(): Unit = {
      pull(in)
    }
  }

}
```

### Example 51: Create a stream processor that repeats the last element seen

```java
class HoldWithInitial<T> extends GraphStage<FlowShape<T, T>> {

  public Inlet<T> in = Inlet.<T>create("HoldWithInitial.in");
  public Outlet<T> out = Outlet.<T>create("HoldWithInitial.out");
  private FlowShape<T, T> shape = FlowShape.of(in, out);

  private final T initial;

  public HoldWithInitial(T initial) {
    this.initial = initial;
  }

  @Override
  public FlowShape<T, T> shape() {
    return shape;
  }

  @Override
  public GraphStageLogic createLogic(Attributes inheritedAttributes) {
    return new GraphStageLogic(shape) {
      private T currentValue = initial;

      {
        setHandler(
            in,
            new AbstractInHandler() {
              @Override
              public void onPush() throws Exception {
                currentValue = grab(in);
                pull(in);
              }
            });
        setHandler(
            out,
            new AbstractOutHandler() {
              @Override
              public void onPull() throws Exception {
                push(out, currentValue);
              }
            });
      }

      @Override
      public void preStart() {
        pull(in);
      }
    };
  }
}
```

### Example 52: Create a stream processor that repeats the last element seen

```scala
import akka.stream._
import akka.stream.stage._
final class HoldWithWait[T] extends GraphStage[FlowShape[T, T]] {
  val in = Inlet[T]("HoldWithWait.in")
  val out = Outlet[T]("HoldWithWait.out")

  override val shape = FlowShape.of(in, out)

  override def createLogic(inheritedAttributes: Attributes): GraphStageLogic = new GraphStageLogic(shape) {
    private var currentValue: T = _
    private var waitingFirstValue = true

    setHandlers(
      in,
      out,
      new InHandler with OutHandler {
        override def onPush(): Unit = {
          currentValue = grab(in)
          if (waitingFirstValue) {
            waitingFirstValue = false
            if (isAvailable(out)) push(out, currentValue)
          }
          pull(in)
        }

        override def onPull(): Unit = {
          if (!waitingFirstValue) push(out, currentValue)
        }
      })

    override def preStart(): Unit = {
      pull(in)
    }
  }
}
```

### Example 53: Create a stream processor that repeats the last element seen

```java
class HoldWithWait<T> extends GraphStage<FlowShape<T, T>> {
  public Inlet<T> in = Inlet.<T>create("HoldWithInitial.in");
  public Outlet<T> out = Outlet.<T>create("HoldWithInitial.out");
  private FlowShape<T, T> shape = FlowShape.of(in, out);

  @Override
  public FlowShape<T, T> shape() {
    return shape;
  }

  @Override
  public GraphStageLogic createLogic(Attributes inheritedAttributes) {
    return new GraphStageLogic(shape) {
      private T currentValue = null;
      private boolean waitingFirstValue = true;

      {
        setHandler(
            in,
            new AbstractInHandler() {
              @Override
              public void onPush() throws Exception {
                currentValue = grab(in);
                if (waitingFirstValue) {
                  waitingFirstValue = false;
                  if (isAvailable(out)) push(out, currentValue);
                }
                pull(in);
              }
            });
        setHandler(
            out,
            new AbstractOutHandler() {
              @Override
              public void onPull() throws Exception {
                if (!waitingFirstValue) push(out, currentValue);
              }
            });
      }

      @Override
      public void preStart() {
        pull(in);
      }
    };
  }
}
```

### Example 54: Globally limiting the rate of a set of streams

```scala
object Limiter {
  case object WantToPass
  case object MayPass

  case object ReplenishTokens

  def props(maxAvailableTokens: Int, tokenRefreshPeriod: FiniteDuration, tokenRefreshAmount: Int): Props =
    Props(new Limiter(maxAvailableTokens, tokenRefreshPeriod, tokenRefreshAmount))
}

class Limiter(val maxAvailableTokens: Int, val tokenRefreshPeriod: FiniteDuration, val tokenRefreshAmount: Int)
    extends Actor {
  import Limiter._
  import context.dispatcher
  import akka.actor.Status

  private var waitQueue = immutable.Queue.empty[ActorRef]
  private var permitTokens = maxAvailableTokens
  private val replenishTimer = system.scheduler.scheduleWithFixedDelay(
    initialDelay = tokenRefreshPeriod,
    delay = tokenRefreshPeriod,
    receiver = self,
    ReplenishTokens)

  override def receive: Receive = open

  val open: Receive = {
    case ReplenishTokens =>
      permitTokens = math.min(permitTokens + tokenRefreshAmount, maxAvailableTokens)
    case WantToPass =>
      permitTokens -= 1
      sender() ! MayPass
      if (permitTokens == 0) context.become(closed)
  }

  val closed: Receive = {
    case ReplenishTokens =>
      permitTokens = math.min(permitTokens + tokenRefreshAmount, maxAvailableTokens)
      releaseWaiting()
    case WantToPass =>
      waitQueue = waitQueue.enqueue(sender())
  }

  private def releaseWaiting(): Unit = {
    val (toBeReleased, remainingQueue) = waitQueue.splitAt(permitTokens)
    waitQueue = remainingQueue
    permitTokens -= toBeReleased.size
    toBeReleased.foreach(_ ! MayPass)
    if (permitTokens > 0) context.become(open)
  }

  override def postStop(): Unit = {
    replenishTimer.cancel()
    waitQueue.foreach(_ ! Status.Failure(new IllegalStateException("limiter stopped")))
  }
}
```

### Example 55: Globally limiting the rate of a set of streams

```java
static class Limiter extends AbstractActor {

  public static class WantToPass {}

  public static final WantToPass WANT_TO_PASS = new WantToPass();

  public static class MayPass {}

  public static final MayPass MAY_PASS = new MayPass();

  public static class ReplenishTokens {}

  public static final ReplenishTokens REPLENISH_TOKENS = new ReplenishTokens();

  private final int maxAvailableTokens;
  private final Duration tokenRefreshPeriod;
  private final int tokenRefreshAmount;

  private final List<ActorRef> waitQueue = new ArrayList<>();
  private final Cancellable replenishTimer;

  private int permitTokens;

  public static Props props(
      int maxAvailableTokens, Duration tokenRefreshPeriod, int tokenRefreshAmount) {
    return Props.create(
        Limiter.class, maxAvailableTokens, tokenRefreshPeriod, tokenRefreshAmount);
  }

  private Limiter(int maxAvailableTokens, Duration tokenRefreshPeriod, int tokenRefreshAmount) {
    this.maxAvailableTokens = maxAvailableTokens;
    this.tokenRefreshPeriod = tokenRefreshPeriod;
    this.tokenRefreshAmount = tokenRefreshAmount;
    this.permitTokens = maxAvailableTokens;

    this.replenishTimer =
        system
            .scheduler()
            .scheduleWithFixedDelay(
                this.tokenRefreshPeriod,
                this.tokenRefreshPeriod,
                getSelf(),
                REPLENISH_TOKENS,
                getContext().getSystem().dispatcher(),
                getSelf());
  }

  @Override
  public Receive createReceive() {
    return open();
  }

  private Receive open() {
    return receiveBuilder()
        .match(
            ReplenishTokens.class,
            rt -> {
              permitTokens = Math.min(permitTokens + tokenRefreshAmount, maxAvailableTokens);
            })
        .match(
            WantToPass.class,
            wtp -> {
              permitTokens -= 1;
              getSender().tell(MAY_PASS, getSelf());
              if (permitTokens == 0) {
                getContext().become(closed());
              }
            })
        .build();
  }

  private Receive closed() {
    return receiveBuilder()
        .match(
            ReplenishTokens.class,
            rt -> {
              permitTokens = Math.min(permitTokens + tokenRefreshAmount, maxAvailableTokens);
              releaseWaiting();
            })
        .match(
            WantToPass.class,
            wtp -> {
              waitQueue.add(getSender());
            })
        .build();
  }

  private void releaseWaiting() {
    final List<ActorRef> toBeReleased = new ArrayList<>(permitTokens);
    for (Iterator<ActorRef> it = waitQueue.iterator(); permitTokens > 0 && it.hasNext(); ) {
      toBeReleased.add(it.next());
      it.remove();
      permitTokens--;
    }

    toBeReleased.stream().forEach(ref -> ref.tell(MAY_PASS, getSelf()));
    if (permitTokens > 0) {
      getContext().become(open());
    }
  }

  @Override
  public void postStop() {
    replenishTimer.cancel();
    waitQueue.stream()
        .forEach(
            ref -> {
              ref.tell(
                  new Status.Failure(new IllegalStateException("limiter stopped")), getSelf());
            });
  }
}
```

### Example 56: Globally limiting the rate of a set of streams

```scala
def limitGlobal[T](limiter: ActorRef, maxAllowedWait: FiniteDuration): Flow[T, T, NotUsed] = {
  import akka.pattern.ask
  import akka.util.Timeout
  Flow[T].mapAsync(4)((element: T) => {
    import system.dispatcher
    implicit val triggerTimeout = Timeout(maxAllowedWait)
    val limiterTriggerFuture = limiter ? Limiter.WantToPass
    limiterTriggerFuture.map((_) => element)
  })

}
```

### Example 57: Globally limiting the rate of a set of streams

```java
public <T> Flow<T, T, NotUsed> limitGlobal(ActorRef limiter, Duration maxAllowedWait) {
  final int parallelism = 4;
  final Flow<T, T, NotUsed> f = Flow.create();

  return f.mapAsync(
      parallelism,
      element -> {
        final CompletionStage<Object> limiterTriggerFuture =
            Patterns.ask(limiter, Limiter.WANT_TO_PASS, maxAllowedWait);
        return limiterTriggerFuture.thenApplyAsync(response -> element, system.dispatcher());
      });
}
```

### Example 58: Chunking up a stream of ByteStrings into limited size ByteStrings

```scala
import akka.stream.stage._

class Chunker(val chunkSize: Int) extends GraphStage[FlowShape[ByteString, ByteString]] {
  val in = Inlet[ByteString]("Chunker.in")
  val out = Outlet[ByteString]("Chunker.out")
  override val shape = FlowShape.of(in, out)
  override def createLogic(inheritedAttributes: Attributes): GraphStageLogic = new GraphStageLogic(shape) {
    private var buffer = ByteString.empty

    setHandler(out, new OutHandler {
      override def onPull(): Unit = {
        emitChunk()
      }
    })
    setHandler(
      in,
      new InHandler {
        override def onPush(): Unit = {
          val elem = grab(in)
          buffer ++= elem
          emitChunk()
        }

        override def onUpstreamFinish(): Unit = {
          if (buffer.isEmpty) completeStage()
          else {
            // There are elements left in buffer, so
            // we keep accepting downstream pulls and push from buffer until emptied.
            //
            // It might be though, that the upstream finished while it was pulled, in which
            // case we will not get an onPull from the downstream, because we already had one.
            // In that case we need to emit from the buffer.
            if (isAvailable(out)) emitChunk()
          }
        }
      })

    private def emitChunk(): Unit = {
      if (buffer.isEmpty) {
        if (isClosed(in)) completeStage()
        else pull(in)
      } else {
        val (chunk, nextBuffer) = buffer.splitAt(chunkSize)
        buffer = nextBuffer
        push(out, chunk)
      }
    }
  }
}

val chunksStream = rawBytes.via(new Chunker(ChunkLimit))
```

### Example 59: Chunking up a stream of ByteStrings into limited size ByteStrings

```java
class Chunker extends GraphStage<FlowShape<ByteString, ByteString>> {

  private final int chunkSize;

  public Inlet<ByteString> in = Inlet.<ByteString>create("Chunker.in");
  public Outlet<ByteString> out = Outlet.<ByteString>create("Chunker.out");
  private FlowShape<ByteString, ByteString> shape = FlowShape.of(in, out);

  public Chunker(int chunkSize) {
    this.chunkSize = chunkSize;
  }

  @Override
  public FlowShape<ByteString, ByteString> shape() {
    return shape;
  }

  @Override
  public GraphStageLogic createLogic(Attributes inheritedAttributes) {
    return new GraphStageLogic(shape) {
      private ByteString buffer = emptyByteString();

      {
        setHandler(
            out,
            new AbstractOutHandler() {
              @Override
              public void onPull() throws Exception {
                emitChunk();
              }
            });

        setHandler(
            in,
            new AbstractInHandler() {

              @Override
              public void onPush() throws Exception {
                ByteString elem = grab(in);
                buffer = buffer.concat(elem);
                emitChunk();
              }

              @Override
              public void onUpstreamFinish() throws Exception {
                if (buffer.isEmpty()) completeStage();
                else {
                  // There are elements left in buffer, so
                  // we keep accepting downstream pulls and push from buffer until emptied.
                  //
                  // It might be though, that the upstream finished while it was pulled, in
                  // which
                  // case we will not get an onPull from the downstream, because we already
                  // had one.
                  // In that case we need to emit from the buffer.
                  if (isAvailable(out)) emitChunk();
                }
              }
            });
      }

      private void emitChunk() {
        if (buffer.isEmpty()) {
          if (isClosed(in)) completeStage();
          else pull(in);
        } else {
          Tuple2<ByteString, ByteString> split = buffer.splitAt(chunkSize);
          ByteString chunk = split._1();
          buffer = split._2();
          push(out, chunk);
        }
      }
    };
  }
}
```

### Example 60: Chunking up a stream of ByteStrings into limited size ByteStrings

```java
Source<ByteString, NotUsed> chunksStream = rawBytes.via(new Chunker(CHUNK_LIMIT));
```

### Example 61: Limit the number of bytes passing through a stream of ByteStrings

```scala
import akka.stream.stage._
class ByteLimiter(val maximumBytes: Long) extends GraphStage[FlowShape[ByteString, ByteString]] {
  val in = Inlet[ByteString]("ByteLimiter.in")
  val out = Outlet[ByteString]("ByteLimiter.out")
  override val shape = FlowShape.of(in, out)

  override def createLogic(inheritedAttributes: Attributes): GraphStageLogic = new GraphStageLogic(shape) {
    private var count = 0

    setHandlers(in, out, new InHandler with OutHandler {

      override def onPull(): Unit = {
        pull(in)
      }

      override def onPush(): Unit = {
        val chunk = grab(in)
        count += chunk.size
        if (count > maximumBytes) failStage(new IllegalStateException("Too much bytes"))
        else push(out, chunk)
      }
    })
  }
}

val limiter = Flow[ByteString].via(new ByteLimiter(SizeLimit))
```

### Example 62: Limit the number of bytes passing through a stream of ByteStrings

```java
class ByteLimiter extends GraphStage<FlowShape<ByteString, ByteString>> {

  final long maximumBytes;

  public Inlet<ByteString> in = Inlet.<ByteString>create("ByteLimiter.in");
  public Outlet<ByteString> out = Outlet.<ByteString>create("ByteLimiter.out");
  private FlowShape<ByteString, ByteString> shape = FlowShape.of(in, out);

  public ByteLimiter(long maximumBytes) {
    this.maximumBytes = maximumBytes;
  }

  @Override
  public FlowShape<ByteString, ByteString> shape() {
    return shape;
  }

  @Override
  public GraphStageLogic createLogic(Attributes inheritedAttributes) {
    return new GraphStageLogic(shape) {
      private int count = 0;

      {
        setHandler(
            out,
            new AbstractOutHandler() {
              @Override
              public void onPull() throws Exception {
                pull(in);
              }
            });
        setHandler(
            in,
            new AbstractInHandler() {
              @Override
              public void onPush() throws Exception {
                ByteString chunk = grab(in);
                count += chunk.size();
                if (count > maximumBytes) {
                  failStage(new IllegalStateException("Too much bytes"));
                } else {
                  push(out, chunk);
                }
              }
            });
      }
    };
  }
}
```

### Example 63: Limit the number of bytes passing through a stream of ByteStrings

```java
Flow<ByteString, ByteString, NotUsed> limiter =
    Flow.of(ByteString.class).via(new ByteLimiter(SIZE_LIMIT));
```

### Example 64: Compact ByteStrings in a stream of ByteStrings

```scala
val compacted: Source[ByteString, NotUsed] = data.map(_.compact)
```

### Example 65: Compact ByteStrings in a stream of ByteStrings

```java
Source<ByteString, NotUsed> compacted = rawBytes.map(ByteString::compact);
```

### Example 66: Injecting keep-alive messages into a stream of ByteStrings

```scala
import scala.concurrent.duration._
val injectKeepAlive: Flow[ByteString, ByteString, NotUsed] =
  Flow[ByteString].keepAlive(1.second, () => keepaliveMessage)
```

### Example 67: Injecting keep-alive messages into a stream of ByteStrings

```java
Flow<ByteString, ByteString, NotUsed> keepAliveInject =
    Flow.of(ByteString.class).keepAlive(Duration.ofSeconds(1), () -> keepAliveMessage);
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/libraries/akka-core/2.10/general/stream/stream-configuration.html
- https://doc.akka.io/libraries/akka-core/2.10/stream/operators/index.html
- https://doc.akka.io/libraries/akka-core/2.10/stream/stream-customize.html
- https://doc.akka.io/libraries/akka-core/2.10/stream/stream-io.html
- https://doc.akka.io/libraries/akka-core/2.10/stream/stream-rate.html
- https://doc.akka.io/libraries/akka-core/2.10/stream/stream-substream.html
- https://doc.akka.io/libraries/alpakka/current
- https://doc.akka.io/libraries/alpakka/current/patterns.html

---
*Source: [https://doc.akka.io/libraries/akka-core/2.10/stream/stream-cookbook.html](https://doc.akka.io/libraries/akka-core/2.10/stream/stream-cookbook.html)*