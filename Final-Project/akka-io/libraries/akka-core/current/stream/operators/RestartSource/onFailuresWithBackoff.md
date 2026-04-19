---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:28:47Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/stream/operators/RestartSource/onFailuresWithBackoff.html
title: RestartSource.onFailuresWithBackoff • Akka core
---

# RestartSource.onFailuresWithBackoff • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# RestartSource.onFailuresWithBackoff

Wrap the given [`Source`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html "akka.stream.javadsl.Source")[`Source`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html "akka.stream.scaladsl.Source") with a [`Source`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html "akka.stream.javadsl.Source")[`Source`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html "akka.stream.scaladsl.Source") that will restart it when it fails using an exponential backoff. Notice that this [`Source`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html "akka.stream.javadsl.Source")[`Source`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html "akka.stream.scaladsl.Source") will not restart on completion of the wrapped flow.

[Error handling](../index.html#error-handling)

## Signature

[`RestartSource.onFailuresWithBackoff`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/RestartSource.html#onFailuresWithBackoff(akka.stream.RestartSettings,akka.japi.function.Creator) "akka.stream.javadsl.RestartSource")[`RestartSource.onFailuresWithBackoff`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/RestartSource$.html#onFailuresWithBackoff[T](settings:akka.stream.RestartSettings)(sourceFactory:()=>akka.stream.scaladsl.Source[T,_]):akka.stream.scaladsl.Source[T,akka.NotUsed] "akka.stream.scaladsl.RestartSource")

## Description

Wraps the given [`Source`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html "akka.stream.javadsl.Source")[`Source`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html "akka.stream.scaladsl.Source") with a [`Source`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html "akka.stream.javadsl.Source")[`Source`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html "akka.stream.scaladsl.Source") that will restart it when it fails using exponential backoff. The backoff resets back to `minBackoff` if there hasn’t been a restart within `maxRestartsWithin` (which defaults to `minBackoff`).

This [`Source`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html "akka.stream.javadsl.Source")[`Source`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html "akka.stream.scaladsl.Source") will not emit a failure as long as maxRestarts is not reached. The failure of the wrapped [`Source`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html "akka.stream.javadsl.Source")[`Source`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html "akka.stream.scaladsl.Source") is handled by restarting it. However, the wrapped [`Source`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html "akka.stream.javadsl.Source")[`Source`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html "akka.stream.scaladsl.Source") can be cancelled by cancelling this [`Source`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html "akka.stream.javadsl.Source")[`Source`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html "akka.stream.scaladsl.Source"). When that happens, the wrapped [`Source`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html "akka.stream.javadsl.Source")[`Source`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html "akka.stream.scaladsl.Source"), if currently running will, be cancelled and not restarted. This can be triggered by the downstream cancelling, or externally by introducing a [KillSwitch](../../stream-dynamic.html#controlling-stream-completion-with-killswitch) right after this [`Source`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html "akka.stream.javadsl.Source")[`Source`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html "akka.stream.scaladsl.Source") in the graph.

This uses the same exponential backoff algorithm as [`BackoffOpts`](https://doc.akka.io/api/akka-core/2.10/akka/pattern/BackoffOpts$.html "akka.pattern.BackoffOpts")[`BackoffOpts`](https://doc.akka.io/japi/akka-core/2.10/akka/pattern/BackoffOpts.html "akka.pattern.BackoffOpts").

See also: 

- [RestartSource.withBackoff](withBackoff.html)
- [RestartFlow.onFailuresWithBackoff](../RestartFlow/onFailuresWithBackoff.html)
- [RestartFlow.withBackoff](../RestartFlow/withBackoff.html)
- [RestartSink.withBackoff](../RestartSink/withBackoff.html)

## Examples

This shows that a Source is not restarted if it completes, only if it fails. Tick is only printed three times as the `take(3)` means the inner source completes successfully after emitting the first 3 elements.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/operators/source/Restart.scala#L58-L64 "Go to snippet source")val finiteSource = Source.tick(1.second, 1.second, "tick").take(3)
val forever = RestartSource.onFailuresWithBackoff(RestartSettings(1.second, 10.seconds, 0.1))(() => finiteSource)
forever.runWith(Sink.foreach(println))
// prints
// tick
// tick
// tick
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/operators/source/Restart.java#L77-L87 "Go to snippet source")Source<String, Cancellable> finiteSource =
    Source.tick(Duration.ofSeconds(1), Duration.ofSeconds(1), "tick").take(3);
Source<String, NotUsed> forever =
    RestartSource.onFailuresWithBackoff(
        RestartSettings.create(Duration.ofSeconds(1), Duration.ofSeconds(10), 0.1),
        () -> finiteSource);
forever.runWith(Sink.foreach(System.out::println), system);
// prints
// tick
// tick
// tick
```

If the inner source instead fails, it will be restarted with an increasing backoff. The source emits 1, 2, 3, and then throws an exception. The first time the exception is thrown the source is restarted after 1s, then 2s etc, until the `maxBackoff` of 10s.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/operators/source/Restart.scala#L29-L50 "Go to snippet source")// could throw if for example it used a database connection to get rows
val flakySource: Source[() => Int, NotUsed] =
  Source(List(() => 1, () => 2, () => 3, () => throw CantConnectToDatabase("darn")))
val forever =
  RestartSource.onFailuresWithBackoff(
    RestartSettings(minBackoff = 1.second, maxBackoff = 10.seconds, randomFactor = 0.1))(() => flakySource)
forever.runWith(Sink.foreach(nr => system.log.info("{}", nr())))
// logs
//[INFO] [12/10/2019 13:51:58.300] [default-akka.test.stream-dispatcher-7] [akka.actor.ActorSystemImpl(default)] 1
//[INFO] [12/10/2019 13:51:58.301] [default-akka.test.stream-dispatcher-7] [akka.actor.ActorSystemImpl(default)] 2
//[INFO] [12/10/2019 13:51:58.302] [default-akka.test.stream-dispatcher-7] [akka.actor.ActorSystemImpl(default)] 3
//[WARN] [12/10/2019 13:51:58.310] [default-akka.test.stream-dispatcher-7] [RestartWithBackoffSource(akka://default)] Restarting graph due to failure. stack_trace:  (docs.stream.operators.source.Restart$CantConnectToDatabase: darn)
// --> 1 second gap
//[INFO] [12/10/2019 13:51:59.379] [default-akka.test.stream-dispatcher-8] [akka.actor.ActorSystemImpl(default)] 1
//[INFO] [12/10/2019 13:51:59.382] [default-akka.test.stream-dispatcher-8] [akka.actor.ActorSystemImpl(default)] 2
//[INFO] [12/10/2019 13:51:59.383] [default-akka.test.stream-dispatcher-8] [akka.actor.ActorSystemImpl(default)] 3
//[WARN] [12/10/2019 13:51:59.386] [default-akka.test.stream-dispatcher-8] [RestartWithBackoffSource(akka://default)] Restarting graph due to failure. stack_trace:  (docs.stream.operators.source.Restart$CantConnectToDatabase: darn)
//--> 2 second gap
//[INFO] [12/10/2019 13:52:01.594] [default-akka.test.stream-dispatcher-8] [akka.actor.ActorSystemImpl(default)] 1
//[INFO] [12/10/2019 13:52:01.595] [default-akka.test.stream-dispatcher-8] [akka.actor.ActorSystemImpl(default)] 2
//[INFO] [12/10/2019 13:52:01.595] [default-akka.test.stream-dispatcher-8] [akka.actor.ActorSystemImpl(default)] 3
//[WARN] [12/10/2019 13:52:01.596] [default-akka.test.stream-dispatcher-8] [RestartWithBackoffSource(akka://default)] Restarting graph due to failure. stack_trace:  (docs.stream.operators.source.Restart$CantConnectToDatabase: darn)
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/operators/source/Restart.java#L25-L70 "Go to snippet source")// could throw if for example it used a database connection to get rows
Source<Creator<Integer>, NotUsed> flakySource =
    Source.from(
        Arrays.<Creator<Integer>>asList(
            () -> 1,
            () -> 2,
            () -> 3,
            () -> {
              throw new RuntimeException("darn");
            }));
Source<Creator<Integer>, NotUsed> forever =
    RestartSource.onFailuresWithBackoff(
        RestartSettings.create(Duration.ofSeconds(1), Duration.ofSeconds(10), 0.1),
        () -> flakySource);
forever.runWith(
    Sink.foreach((Creator<Integer> nr) -> system.log().info("{}", nr.create())), system);
// logs
// [INFO] [12/10/2019 13:51:58.300] [default-akka.test.stream-dispatcher-7]
// [akka.actor.ActorSystemImpl(default)] 1
// [INFO] [12/10/2019 13:51:58.301] [default-akka.test.stream-dispatcher-7]
// [akka.actor.ActorSystemImpl(default)] 2
// [INFO] [12/10/2019 13:51:58.302] [default-akka.test.stream-dispatcher-7]
// [akka.actor.ActorSystemImpl(default)] 3
// [WARN] [12/10/2019 13:51:58.310] [default-akka.test.stream-dispatcher-7]
// [RestartWithBackoffSource(akka://default)] Restarting graph due to failure. stack_trace:
// (RuntimeException: darn)
// --> 1 second gap
// [INFO] [12/10/2019 13:51:59.379] [default-akka.test.stream-dispatcher-8]
// [akka.actor.ActorSystemImpl(default)] 1
// [INFO] [12/10/2019 13:51:59.382] [default-akka.test.stream-dispatcher-8]
// [akka.actor.ActorSystemImpl(default)] 2
// [INFO] [12/10/2019 13:51:59.383] [default-akka.test.stream-dispatcher-8]
// [akka.actor.ActorSystemImpl(default)] 3
// [WARN] [12/10/2019 13:51:59.386] [default-akka.test.stream-dispatcher-8]
// [RestartWithBackoffSource(akka://default)] Restarting graph due to failure. stack_trace:
// (RuntimeException: darn)
// --> 2 second gap
// [INFO] [12/10/2019 13:52:01.594] [default-akka.test.stream-dispatcher-8]
// [akka.actor.ActorSystemImpl(default)] 1
// [INFO] [12/10/2019 13:52:01.595] [default-akka.test.stream-dispatcher-8]
// [akka.actor.ActorSystemImpl(default)] 2
// [INFO] [12/10/2019 13:52:01.595] [default-akka.test.stream-dispatcher-8]
// [akka.actor.ActorSystemImpl(default)] 3
// [WARN] [12/10/2019 13:52:01.596] [default-akka.test.stream-dispatcher-8]
// [RestartWithBackoffSource(akka://default)] Restarting graph due to failure. stack_trace:
// (RuntimeException: darn)
```

Finally, to be able to stop the restarting, a kill switch can be used. The kill switch is inserted right after the restart source. The inner source is the same as above so emits 3 elements and then fails. A killswitch is used to be able to stop the source being restarted: 

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/operators/source/Restart.scala#L70-L80 "Go to snippet source")val flakySource: Source[() => Int, NotUsed] =
  Source(List(() => 1, () => 2, () => 3, () => throw CantConnectToDatabase("darn")))
val stopRestarting: UniqueKillSwitch =
  RestartSource
    .onFailuresWithBackoff(RestartSettings(1.second, 10.seconds, 0.1))(() => flakySource)
    .viaMat(KillSwitches.single)(Keep.right)
    .toMat(Sink.foreach(nr => println(s"Nr ${nr()}")))(Keep.left)
    .run()
//... from some where else
// stop the source from restarting
stopRestarting.shutdown()
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/operators/source/Restart.java#L93-L111 "Go to snippet source")Source<Creator<Integer>, NotUsed> flakySource =
    Source.from(
        Arrays.<Creator<Integer>>asList(
            () -> 1,
            () -> 2,
            () -> 3,
            () -> {
              throw new RuntimeException("darn");
            }));
UniqueKillSwitch stopRestarting =
    RestartSource.onFailuresWithBackoff(
            RestartSettings.create(Duration.ofSeconds(1), Duration.ofSeconds(10), 0.1),
            () -> flakySource)
        .viaMat(KillSwitches.single(), Keep.right())
        .toMat(Sink.foreach(nr -> System.out.println("nr " + nr.create())), Keep.left())
        .run(system);
// ... from some where else
// stop the source from restarting
stopRestarting.shutdown();
```

## Reactive Streams semantics

**emits** when the wrapped source emits

**backpressures** during backoff and when downstream backpressures

**completes** when the wrapped source completes or `maxRestarts` are reached within the given time limit

**cancels** when downstream cancels

## Code Examples

### Example 1: Examples

```scala
val finiteSource = Source.tick(1.second, 1.second, "tick").take(3)
val forever = RestartSource.onFailuresWithBackoff(RestartSettings(1.second, 10.seconds, 0.1))(() => finiteSource)
forever.runWith(Sink.foreach(println))
// prints
// tick
// tick
// tick
```

### Example 2: Examples

```java
Source<String, Cancellable> finiteSource =
    Source.tick(Duration.ofSeconds(1), Duration.ofSeconds(1), "tick").take(3);
Source<String, NotUsed> forever =
    RestartSource.onFailuresWithBackoff(
        RestartSettings.create(Duration.ofSeconds(1), Duration.ofSeconds(10), 0.1),
        () -> finiteSource);
forever.runWith(Sink.foreach(System.out::println), system);
// prints
// tick
// tick
// tick
```

### Example 3: Examples

```scala
// could throw if for example it used a database connection to get rows
val flakySource: Source[() => Int, NotUsed] =
  Source(List(() => 1, () => 2, () => 3, () => throw CantConnectToDatabase("darn")))
val forever =
  RestartSource.onFailuresWithBackoff(
    RestartSettings(minBackoff = 1.second, maxBackoff = 10.seconds, randomFactor = 0.1))(() => flakySource)
forever.runWith(Sink.foreach(nr => system.log.info("{}", nr())))
// logs
//[INFO] [12/10/2019 13:51:58.300] [default-akka.test.stream-dispatcher-7] [akka.actor.ActorSystemImpl(default)] 1
//[INFO] [12/10/2019 13:51:58.301] [default-akka.test.stream-dispatcher-7] [akka.actor.ActorSystemImpl(default)] 2
//[INFO] [12/10/2019 13:51:58.302] [default-akka.test.stream-dispatcher-7] [akka.actor.ActorSystemImpl(default)] 3
//[WARN] [12/10/2019 13:51:58.310] [default-akka.test.stream-dispatcher-7] [RestartWithBackoffSource(akka://default)] Restarting graph due to failure. stack_trace:  (docs.stream.operators.source.Restart$CantConnectToDatabase: darn)
// --> 1 second gap
//[INFO] [12/10/2019 13:51:59.379] [default-akka.test.stream-dispatcher-8] [akka.actor.ActorSystemImpl(default)] 1
//[INFO] [12/10/2019 13:51:59.382] [default-akka.test.stream-dispatcher-8] [akka.actor.ActorSystemImpl(default)] 2
//[INFO] [12/10/2019 13:51:59.383] [default-akka.test.stream-dispatcher-8] [akka.actor.ActorSystemImpl(default)] 3
//[WARN] [12/10/2019 13:51:59.386] [default-akka.test.stream-dispatcher-8] [RestartWithBackoffSource(akka://default)] Restarting graph due to failure. stack_trace:  (docs.stream.operators.source.Restart$CantConnectToDatabase: darn)
//--> 2 second gap
//[INFO] [12/10/2019 13:52:01.594] [default-akka.test.stream-dispatcher-8] [akka.actor.ActorSystemImpl(default)] 1
//[INFO] [12/10/2019 13:52:01.595] [default-akka.test.stream-dispatcher-8] [akka.actor.ActorSystemImpl(default)] 2
//[INFO] [12/10/2019 13:52:01.595] [default-akka.test.stream-dispatcher-8] [akka.actor.ActorSystemImpl(default)] 3
//[WARN] [12/10/2019 13:52:01.596] [default-akka.test.stream-dispatcher-8] [RestartWithBackoffSource(akka://default)] Restarting graph due to failure. stack_trace:  (docs.stream.operators.source.Restart$CantConnectToDatabase: darn)
```

### Example 4: Examples

```java
// could throw if for example it used a database connection to get rows
Source<Creator<Integer>, NotUsed> flakySource =
    Source.from(
        Arrays.<Creator<Integer>>asList(
            () -> 1,
            () -> 2,
            () -> 3,
            () -> {
              throw new RuntimeException("darn");
            }));
Source<Creator<Integer>, NotUsed> forever =
    RestartSource.onFailuresWithBackoff(
        RestartSettings.create(Duration.ofSeconds(1), Duration.ofSeconds(10), 0.1),
        () -> flakySource);
forever.runWith(
    Sink.foreach((Creator<Integer> nr) -> system.log().info("{}", nr.create())), system);
// logs
// [INFO] [12/10/2019 13:51:58.300] [default-akka.test.stream-dispatcher-7]
// [akka.actor.ActorSystemImpl(default)] 1
// [INFO] [12/10/2019 13:51:58.301] [default-akka.test.stream-dispatcher-7]
// [akka.actor.ActorSystemImpl(default)] 2
// [INFO] [12/10/2019 13:51:58.302] [default-akka.test.stream-dispatcher-7]
// [akka.actor.ActorSystemImpl(default)] 3
// [WARN] [12/10/2019 13:51:58.310] [default-akka.test.stream-dispatcher-7]
// [RestartWithBackoffSource(akka://default)] Restarting graph due to failure. stack_trace:
// (RuntimeException: darn)
// --> 1 second gap
// [INFO] [12/10/2019 13:51:59.379] [default-akka.test.stream-dispatcher-8]
// [akka.actor.ActorSystemImpl(default)] 1
// [INFO] [12/10/2019 13:51:59.382] [default-akka.test.stream-dispatcher-8]
// [akka.actor.ActorSystemImpl(default)] 2
// [INFO] [12/10/2019 13:51:59.383] [default-akka.test.stream-dispatcher-8]
// [akka.actor.ActorSystemImpl(default)] 3
// [WARN] [12/10/2019 13:51:59.386] [default-akka.test.stream-dispatcher-8]
// [RestartWithBackoffSource(akka://default)] Restarting graph due to failure. stack_trace:
// (RuntimeException: darn)
// --> 2 second gap
// [INFO] [12/10/2019 13:52:01.594] [default-akka.test.stream-dispatcher-8]
// [akka.actor.ActorSystemImpl(default)] 1
// [INFO] [12/10/2019 13:52:01.595] [default-akka.test.stream-dispatcher-8]
// [akka.actor.ActorSystemImpl(default)] 2
// [INFO] [12/10/2019 13:52:01.595] [default-akka.test.stream-dispatcher-8]
// [akka.actor.ActorSystemImpl(default)] 3
// [WARN] [12/10/2019 13:52:01.596] [default-akka.test.stream-dispatcher-8]
// [RestartWithBackoffSource(akka://default)] Restarting graph due to failure. stack_trace:
// (RuntimeException: darn)
```

### Example 5: Examples

```scala
val flakySource: Source[() => Int, NotUsed] =
  Source(List(() => 1, () => 2, () => 3, () => throw CantConnectToDatabase("darn")))
val stopRestarting: UniqueKillSwitch =
  RestartSource
    .onFailuresWithBackoff(RestartSettings(1.second, 10.seconds, 0.1))(() => flakySource)
    .viaMat(KillSwitches.single)(Keep.right)
    .toMat(Sink.foreach(nr => println(s"Nr ${nr()}")))(Keep.left)
    .run()
//... from some where else
// stop the source from restarting
stopRestarting.shutdown()
```

### Example 6: Examples

```java
Source<Creator<Integer>, NotUsed> flakySource =
    Source.from(
        Arrays.<Creator<Integer>>asList(
            () -> 1,
            () -> 2,
            () -> 3,
            () -> {
              throw new RuntimeException("darn");
            }));
UniqueKillSwitch stopRestarting =
    RestartSource.onFailuresWithBackoff(
            RestartSettings.create(Duration.ofSeconds(1), Duration.ofSeconds(10), 0.1),
            () -> flakySource)
        .viaMat(KillSwitches.single(), Keep.right())
        .toMat(Sink.foreach(nr -> System.out.println("nr " + nr.create())), Keep.left())
        .run(system);
// ... from some where else
// stop the source from restarting
stopRestarting.shutdown();
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10/akka/pattern/BackoffOpts$.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/RestartSource$.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html
- https://doc.akka.io/japi/akka-core/2.10/akka/pattern/BackoffOpts.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/RestartSource.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/RestartFlow/onFailuresWithBackoff.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/RestartFlow/withBackoff.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/RestartSink/withBackoff.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/RestartSource/withBackoff.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/onErrorComplete.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/index.html
- https://doc.akka.io/libraries/akka-core/current/stream/stream-dynamic.html

---
*Source: [https://doc.akka.io/libraries/akka-core/current/stream/operators/RestartSource/onFailuresWithBackoff.html](https://doc.akka.io/libraries/akka-core/current/stream/operators/RestartSource/onFailuresWithBackoff.html)*