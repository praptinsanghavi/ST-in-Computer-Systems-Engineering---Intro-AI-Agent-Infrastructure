---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:23:28Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/stream/operators/index.html
title: Operators • Akka core
---

# Operators • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Operators

## Source operators

These built\-in sources are available from `akka.stream.scaladsl.Source` `akka.stream.javadsl.Source`:

|  | Operator | Description |
| --- | --- | --- |
| Source | [asSourceWithContext](Source/asSourceWithContext.html) | Extracts context data from the elements of a `Source` so that it can be turned into a `SourceWithContext` which can propagate that context per element along a stream. |
| Source | [asSubscriber](Source/asSubscriber.html) | Integration with Reactive Streams, materializes into a [`Subscriber`](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/Flow.Subscriber.html "java.util.concurrent.Flow.Subscriber"). |
| Source | [combine](Source/combine.html) | Combine several sources, using a given strategy such as merge or concat, into one source. |
| Source | [completionStage](Source/completionStage.html) | Send the single value of the `CompletionStage` when it completes and there is demand. |
| Source | [completionStageSource](Source/completionStageSource.html) | Streams the elements of an asynchronous source once its given *completion* operator completes. |
| Source | [cycle](Source/cycle.html) | Stream iterator in cycled manner. |
| Source | [empty](Source/empty.html) | Complete right away without ever emitting any elements. |
| Source | [failed](Source/failed.html) | Fail directly with a user specified exception. |
| Source | [applyfrom](Source/from.html) | Stream the values of an `immutable.Seq``Iterable`. |
| Source | [fromCompletionStage](Source/fromCompletionStage.html) | Deprecated by [`Source.completionStage`](Source/completionStage.html). |
| Source | [fromFuture](Source/fromFuture.html) | Deprecated by [`Source.future`](Source/future.html). |
| Source | [fromFutureSource](Source/fromFutureSource.html) | Deprecated by [`Source.futureSource`](Source/futureSource.html). |
| Source | [fromIterator](Source/fromIterator.html) | Stream the values from an `Iterator`, requesting the next value when there is demand. |
| Source | [fromJavaStream](Source/fromJavaStream.html) | Stream the values from a Java 8 `Stream`, requesting the next value when there is demand. |
| Source | [fromPublisher](Source/fromPublisher.html) | Integration with Reactive Streams, subscribes to a [`Publisher`](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/Flow.Publisher.html "java.util.concurrent.Flow.Publisher"). |
| Source | [fromSourceCompletionStage](Source/fromSourceCompletionStage.html) | Deprecated by [`Source.completionStageSource`](Source/completionStageSource.html). |
| Source | [future](Source/future.html) | Send the single value of the `Future` when it completes and there is demand. |
| Source | [futureSource](Source/futureSource.html) | Streams the elements of the given future source once it successfully completes. |
| Source | [lazily](Source/lazily.html) | Deprecated by [`Source.lazySource`](Source/lazySource.html). |
| Source | [lazilyAsync](Source/lazilyAsync.html) | Deprecated by [`Source.lazyFutureSource`](Source/lazyFutureSource.html). |
| Source | [lazyCompletionStage](Source/lazyCompletionStage.html) | Defers creation of a future of a single element source until there is demand. |
| Source | [lazyCompletionStageSource](Source/lazyCompletionStageSource.html) | Defers creation of a future source until there is demand. |
| Source | [lazyFuture](Source/lazyFuture.html) | Defers creation of a future of a single element source until there is demand. |
| Source | [lazyFutureSource](Source/lazyFutureSource.html) | Defers creation and materialization of a `Source` until there is demand. |
| Source | [lazySingle](Source/lazySingle.html) | Defers creation of a single element source until there is demand. |
| Source | [lazySource](Source/lazySource.html) | Defers creation and materialization of a `Source` until there is demand. |
| Source | [maybe](Source/maybe.html) | Create a source that emits once the materialized `Promise` `CompletableFuture` is completed with a value. |
| Source | [never](Source/never.html) | Never emit any elements, never complete and never fail. |
| Source | [queue](Source/queue.html) | Materialize a `BoundedSourceQueue` or `SourceQueue` onto which elements can be pushed for emitting from the source. |
| Source | [range](Source/range.html) | Emit each integer in a range, with an option to take bigger steps than 1\. |
| Source | [repeat](Source/repeat.html) | Stream a single object repeatedly. |
| Source | [single](Source/single.html) | Stream a single object once. |
| Source | [tick](Source/tick.html) | A periodical repetition of an arbitrary object. |
| Source | [unfold](Source/unfold.html) | Stream the result of a function as long as it returns a `Some` non empty `Optional`. |
| Source | [unfoldAsync](Source/unfoldAsync.html) | Just like `unfold` but the fold function returns a `Future` `CompletionStage`. |
| Source | [unfoldResource](Source/unfoldResource.html) | Wrap any resource that can be opened, queried for next element (in a blocking way) and closed using three distinct functions into a source. |
| Source | [unfoldResourceAsync](Source/unfoldResourceAsync.html) | Wrap any resource that can be opened, queried for next element and closed in an asynchronous way. |
| Source | [zipN](Source/zipN.html) | Combine the elements of multiple sources into a source of sequences of value. |
| Source | [zipWithN](Source/zipWithN.html) | Combine the elements of multiple streams into a stream of sequences using a combiner function. |

## Sink operators

These built\-in sinks are available from `akka.stream.scaladsl.Sink` `akka.stream.javadsl.Sink`:

|  | Operator | Description |
| --- | --- | --- |
| Sink | [asPublisher](Sink/asPublisher.html) | Integration with Reactive Streams, materializes into a `org.reactivestreams.Publisher`. |
| Sink | [cancelled](Sink/cancelled.html) | Immediately cancel the stream |
| Sink | [collect](Sink/collect.html) | Collect all input elements using a Java [`Collector`](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/stream/Collector.html "java.util.stream.Collector"). |
| Sink | [collection](Sink/collection.html) | Collect all values emitted from the stream into a collection.Operator only available in the Scala API. The closest operator in the Java API is [`Sink.seq`](Sink/seq.html). |
| Sink | [combine](Sink/combine.html) | Combine several sinks into one using a user specified strategy |
| Sink | [completionStageSink](Sink/completionStageSink.html) | Streams the elements to the given future sink once it successfully completes. |
| Sink | [fold](Sink/fold.html) | Fold over emitted element with a function, where each invocation will get the new element and the result from the previous fold invocation. |
| Sink | [foreach](Sink/foreach.html) | Invoke a given procedure for each element received. |
| Sink | [foreachAsync](Sink/foreachAsync.html) | Invoke a given procedure asynchronously for each element received. |
| Sink | [fromMaterializer](Sink/fromMaterializer.html) | Defer the creation of a `Sink` until materialization and access `Materializer` and `Attributes` |
| Sink | [fromSubscriber](Sink/fromSubscriber.html) | Integration with Reactive Streams, wraps a `org.reactivestreams.Subscriber` as a sink. |
| Sink | [futureSink](Sink/futureSink.html) | Streams the elements to the given future sink once it successfully completes. |
| Sink | [head](Sink/head.html) | Materializes into a `Future` `CompletionStage` which completes with the first value arriving, after this the stream is canceled. |
| Sink | [headOption](Sink/headOption.html) | Materializes into a `Future[Option[T]]` `CompletionStage<Optional<T>>` which completes with the first value arriving wrapped in `Some` `Optional`, or a `None` an empty Optional if the stream completes without any elements emitted. |
| Sink | [ignore](Sink/ignore.html) | Consume all elements but discards them. |
| Sink | [last](Sink/last.html) | Materializes into a `Future` `CompletionStage` which will complete with the last value emitted when the stream completes. |
| Sink | [lastOption](Sink/lastOption.html) | Materialize a `Future[Option[T]]` `CompletionStage<Optional<T>>` which completes with the last value emitted wrapped in an `Some` `Optional` when the stream completes. |
| Sink | [lazyCompletionStageSink](Sink/lazyCompletionStageSink.html) | Defers creation and materialization of a `Sink` until there is a first element. |
| Sink | [lazyFutureSink](Sink/lazyFutureSink.html) | Defers creation and materialization of a `Sink` until there is a first element. |
| Sink | [lazyInitAsync](Sink/lazyInitAsync.html) | Deprecated by [`Sink.lazyFutureSink`](Sink/lazyFutureSink.html). |
| Sink | [lazySink](Sink/lazySink.html) | Defers creation and materialization of a `Sink` until there is a first element. |
| Sink | [never](Sink/never.html) | Always backpressure never cancel and never consume any elements from the stream. |
| Sink | [onComplete](Sink/onComplete.html) | Invoke a callback when the stream has completed or failed. |
| Sink | [preMaterialize](Sink/preMaterialize.html) | Materializes this Sink, immediately returning (1\) its materialized value, and (2\) a new Sink that can be consume elements ‘into’ the pre\-materialized one. |
| Sink | [queue](Sink/queue.html) | Materialize a `SinkQueue` that can be pulled to trigger demand through the sink. |
| Sink | [reduce](Sink/reduce.html) | Apply a reduction function on the incoming elements and pass the result to the next invocation. |
| Sink | [seq](Sink/seq.html) | Collect values emitted from the stream into a collection. |
| Sink | [setup](Sink/setup.html) | Defer the creation of a `Sink` until materialization and access `ActorMaterializer` and `Attributes` |
| Sink | [takeLast](Sink/takeLast.html) | Collect the last `n` values emitted from the stream into a collection. |

## Additional Sink and Source converters

Sources and sinks for integrating with `java.io.InputStream` and `java.io.OutputStream` can be found on `StreamConverters`. As they are blocking APIs the implementations of these operators are run on a separate dispatcher configured through the `akka.stream.blocking-io-dispatcher`.

Warning
Be aware that `asInputStream` and `asOutputStream` materialize `InputStream` and `OutputStream` respectively as blocking API implementation. They will block the thread until data will be available from upstream. Because of blocking nature these objects cannot be used in `mapMaterializeValue` section as it causes deadlock of the stream materialization process. For example, following snippet will fall with timeout exception:

```
...
.toMat(StreamConverters.asInputStream().mapMaterializedValue { inputStream =>
        inputStream.read()  // this could block forever
        ...
}).run()

```

|  | Operator | Description |
| --- | --- | --- |
| StreamConverters | [asInputStream](StreamConverters/asInputStream.html) | Create a sink which materializes into an `InputStream` that can be read to trigger demand through the sink. |
| StreamConverters | [asJavaStream](StreamConverters/asJavaStream.html) | Create a sink which materializes into Java 8 `Stream` that can be run to trigger demand through the sink. |
| StreamConverters | [asOutputStream](StreamConverters/asOutputStream.html) | Create a source that materializes into an `OutputStream`. |
| StreamConverters | [fromInputStream](StreamConverters/fromInputStream.html) | Create a source that wraps an `InputStream`. |
| StreamConverters | [fromJavaStream](StreamConverters/fromJavaStream.html) | Create a source that wraps a Java 8 `java.util.stream.Stream`. |
| StreamConverters | [fromOutputStream](StreamConverters/fromOutputStream.html) | Create a sink that wraps an `OutputStream`. |
| StreamConverters | [javaCollector](StreamConverters/javaCollector.html) | Create a sink which materializes into a `Future` `CompletionStage` which will be completed with a result of the Java 8 `Collector` transformation and reduction operations. |
| StreamConverters | [javaCollectorParallelUnordered](StreamConverters/javaCollectorParallelUnordered.html) | Create a sink which materializes into a `Future` `CompletionStage` which will be completed with a result of the Java 8 `Collector` transformation and reduction operations. |

## File IO Sinks and Sources

Sources and sinks for reading and writing files can be found on `FileIO`.

|  | Operator | Description |
| --- | --- | --- |
| FileIO | [fromFile](FileIO/fromFile.html) | Emits the contents of a file. |
| FileIO | [fromPath](FileIO/fromPath.html) | Emits the contents of a file from the given path. |
| FileIO | [toFile](FileIO/toFile.html) | Create a sink which will write incoming `ByteString` s to a given file. |
| FileIO | [toPath](FileIO/toPath.html) | Create a sink which will write incoming `ByteString` s to a given file path. |

## Simple operators

These operators can transform the rate of incoming elements since there are operators that emit multiple elements for a single input (e.g. `mapConcat`) or consume multiple elements before emitting one output (e.g. `filter`). However, these rate transformations are data\-driven, i.e. it is the incoming elements that define how the rate is affected. This is in contrast with [detached operators](#backpressure-aware-operators) which can change their processing behavior depending on being backpressured by downstream or not.

|  | Operator | Description |
| --- | --- | --- |
| Flow | [asFlowWithContext](Flow/asFlowWithContext.html) | Extracts context data from the elements of a `Flow` so that it can be turned into a `FlowWithContext` which can propagate that context per element along a stream. |
| Source/Flow | [collect](Source-or-Flow/collect.html) | Apply a partial function to each incoming element, if the partial function is defined for a value the returned value is passed downstream. |
| Source/Flow | [collectType](Source-or-Flow/collectType.html) | Transform this stream by testing the type of each of the elements on which the element is an instance of the provided type as they pass through this processing step. |
| Flow | [completionStageFlow](Flow/completionStageFlow.html) | Streams the elements through the given future flow once it successfully completes. |
| Flow | [contramap](Flow/contramap.html) | Transform this Flow by applying a function to each *incoming* upstream element before it is passed to the Flow. |
| Source/Flow | [detach](Source-or-Flow/detach.html) | Detach upstream demand from downstream demand without detaching the stream rates. |
| Source/Flow | [drop](Source-or-Flow/drop.html) | Drop `n` elements and then pass any subsequent element downstream. |
| Source/Flow | [dropWhile](Source-or-Flow/dropWhile.html) | Drop elements as long as a predicate function return true for the element |
| Source/Flow | [filter](Source-or-Flow/filter.html) | Filter the incoming elements using a predicate. |
| Source/Flow | [filterNot](Source-or-Flow/filterNot.html) | Filter the incoming elements using a predicate. |
| Flow | [flattenOptional](Flow/flattenOptional.html) | Collect the value of `Optional` from all the elements passing through this flow , empty `Optional` is filtered out. |
| Source/Flow | [fold](Source-or-Flow/fold.html) | Start with current value `zero` and then apply the current and next value to the given function. When upstream completes, the current value is emitted downstream. |
| Source/Flow | [foldAsync](Source-or-Flow/foldAsync.html) | Just like `fold` but receives a function that results in a `Future` `CompletionStage` to the next value. |
| Source/Flow | [fromMaterializer](Source-or-Flow/fromMaterializer.html) | Defer the creation of a `Source/Flow` until materialization and access `Materializer` and `Attributes` |
| Flow | [futureFlow](Flow/futureFlow.html) | Streams the elements through the given future flow once it successfully completes. |
| Source/Flow | [grouped](Source-or-Flow/grouped.html) | Accumulate incoming events until the specified number of elements have been accumulated and then pass the collection of elements downstream. |
| Source/Flow | [groupedWeighted](Source-or-Flow/groupedWeighted.html) | Accumulate incoming events until the combined weight of elements is greater than or equal to the minimum weight and then pass the collection of elements downstream. |
| Source/Flow | [intersperse](Source-or-Flow/intersperse.html) | Intersperse stream with provided element similar to `List.mkString`. |
| Flow | [lazyCompletionStageFlow](Flow/lazyCompletionStageFlow.html) | Defers creation and materialization of a `Flow` until there is a first element. |
| Flow | [lazyFlow](Flow/lazyFlow.html) | Defers creation and materialization of a `Flow` until there is a first element. |
| Flow | [lazyFutureFlow](Flow/lazyFutureFlow.html) | Defers creation and materialization of a `Flow` until there is a first element. |
| Flow | [lazyInitAsync](Flow/lazyInitAsync.html) | Deprecated by [`Flow.lazyFutureFlow`](Flow/lazyFutureFlow.html) in combination with [`prefixAndTail`](Source-or-Flow/prefixAndTail.html). |
| Source/Flow | [limit](Source-or-Flow/limit.html) | Limit number of element from upstream to given `max` number. |
| Source/Flow | [limitWeighted](Source-or-Flow/limitWeighted.html) | Limit the total weight of incoming elements |
| Source/Flow | [log](Source-or-Flow/log.html) | Log elements flowing through the stream as well as completion and erroring. |
| Source/Flow | [logWithMarker](Source-or-Flow/logWithMarker.html) | Log elements flowing through the stream as well as completion and erroring. |
| Source/Flow | [map](Source-or-Flow/map.html) | Transform each element in the stream by calling a mapping function with it and passing the returned value downstream. |
| Source/Flow | [mapConcat](Source-or-Flow/mapConcat.html) | Transform each element into zero or more elements that are individually passed downstream. |
| Source/Flow | [mapWithResource](Source-or-Flow/mapWithResource.html) | Map elements with the help of a resource that can be opened, transform each element (in a blocking way) and closed. |
| Source/Flow | [preMaterialize](Source-or-Flow/preMaterialize.html) | Materializes this Graph, immediately returning (1\) its materialized value, and (2\) a new pre\-materialized Graph. |
| Source/Flow | [reduce](Source-or-Flow/reduce.html) | Start with first element and then apply the current and next value to the given function, when upstream complete the current value is emitted downstream. |
| Source/Flow | [scan](Source-or-Flow/scan.html) | Emit its current value, which starts at `zero`, and then apply the current and next value to the given function, emitting the next current value. |
| Source/Flow | [scanAsync](Source-or-Flow/scanAsync.html) | Just like [`scan`](Source-or-Flow/scan.html) but receives a function that results in a `Future` `CompletionStage` to the next value. |
| Source/Flow | [setup](Source-or-Flow/setup.html) | Defer the creation of a `Source/Flow` until materialization and access `Materializer` and `Attributes` |
| Source/Flow | [sliding](Source-or-Flow/sliding.html) | Provide a sliding window over the incoming stream and pass the windows as groups of elements downstream. |
| Source/Flow | [statefulMap](Source-or-Flow/statefulMap.html) | Transform each stream element with the help of a state. |
| Source/Flow | [statefulMapConcat](Source-or-Flow/statefulMapConcat.html) | Transform each element into zero or more elements that are individually passed downstream. |
| Source/Flow | [take](Source-or-Flow/take.html) | Pass `n` incoming elements downstream and then complete |
| Source/Flow | [takeWhile](Source-or-Flow/takeWhile.html) | Pass elements downstream as long as a predicate function returns true and then complete. |
| Source/Flow | [throttle](Source-or-Flow/throttle.html) | Limit the throughput to a specific number of elements per time unit, or a specific total cost per time unit, where a function has to be provided to calculate the individual cost of each element. |

## Flow operators composed of Sinks and Sources

|  | Operator | Description |
| --- | --- | --- |
| Flow | [fromSinkAndSource](Flow/fromSinkAndSource.html) | Creates a `Flow` from a `Sink` and a `Source` where the Flow’s input will be sent to the `Sink` and the `Flow` ’s output will come from the Source. |
| Flow | [fromSinkAndSourceCoupled](Flow/fromSinkAndSourceCoupled.html) | Allows coupling termination (cancellation, completion, erroring) of Sinks and Sources while creating a Flow between them. |

## Asynchronous operators

These operators encapsulate an asynchronous computation, properly handling backpressure while taking care of the asynchronous operation at the same time (usually handling the completion of a `Future` `CompletionStage`).

|  | Operator | Description |
| --- | --- | --- |
| Source/Flow | [mapAsync](Source-or-Flow/mapAsync.html) | Pass incoming elements to a function that return a `Future` `CompletionStage` result. |
| Source/Flow | [mapAsyncPartitioned](Source-or-Flow/mapAsyncPartitioned.html) | Pass incoming elements to a function that extracts a partitioning key from the element, then to a function that returns a `Future` `CompletionStage` result, bounding the number of incomplete Futures CompletionStages per partitioning key. |
| Source/Flow | [mapAsyncUnordered](Source-or-Flow/mapAsyncUnordered.html) | Like `mapAsync` but `Future` `CompletionStage` results are passed downstream as they arrive regardless of the order of the elements that triggered them. |

## Timer driven operators

These operators process elements using timers, delaying, dropping or grouping elements for certain time durations.

|  | Operator | Description |
| --- | --- | --- |
| Source/Flow | [delay](Source-or-Flow/delay.html) | Delay every element passed through with a specific duration. |
| Source/Flow | [delayWith](Source-or-Flow/delayWith.html) | Delay every element passed through with a duration that can be controlled dynamically. |
| Source/Flow | [dropWithin](Source-or-Flow/dropWithin.html) | Drop elements until a timeout has fired |
| Source/Flow | [groupedWeightedWithin](Source-or-Flow/groupedWeightedWithin.html) | Chunk up this stream into groups of elements received within a time window, or limited by the weight of the elements, whatever happens first. |
| Source/Flow | [groupedWithin](Source-or-Flow/groupedWithin.html) | Chunk up this stream into groups of elements received within a time window, or limited by the number of the elements, whatever happens first. |
| Source/Flow | [initialDelay](Source-or-Flow/initialDelay.html) | Delays the initial element by the specified duration. |
| Source/Flow | [takeWithin](Source-or-Flow/takeWithin.html) | Pass elements downstream within a timeout and then complete. |

## Backpressure aware operators

These operators are aware of the backpressure provided by their downstreams and able to adapt their behavior to that signal.

|  | Operator | Description |
| --- | --- | --- |
| Source/Flow | [aggregateWithBoundary](Source-or-Flow/aggregateWithBoundary.html) | Aggregate and emit until custom boundary condition met. |
| Source/Flow | [batch](Source-or-Flow/batch.html) | Allow for a slower downstream by passing incoming elements and a summary into an aggregate function as long as there is backpressure and a maximum number of batched elements is not yet reached. |
| Source/Flow | [batchWeighted](Source-or-Flow/batchWeighted.html) | Allow for a slower downstream by passing incoming elements and a summary into an aggregate function as long as there is backpressure and a maximum weight batched elements is not yet reached. |
| Source/Flow | [buffer](Source-or-Flow/buffer.html) | Allow for a temporarily faster upstream events by buffering `size` elements. |
| Source/Flow | [conflate](Source-or-Flow/conflate.html) | Allow for a slower downstream by passing incoming elements and a summary into an aggregate function as long as there is backpressure. |
| Source/Flow | [conflateWithSeed](Source-or-Flow/conflateWithSeed.html) | Allow for a slower downstream by passing incoming elements and a summary into an aggregate function as long as there is backpressure. |
| Source/Flow | [expand](Source-or-Flow/expand.html) | Like `extrapolate`, but does not have the `initial` argument, and the `Iterator` is also used in lieu of the original element, allowing for it to be rewritten and/or filtered. |
| Source/Flow | [extrapolate](Source-or-Flow/extrapolate.html) | Allow for a faster downstream by expanding the last emitted element to an `Iterator`. |

## Nesting and flattening operators

These operators either take a stream and turn it into a stream of streams (nesting) or they take a stream that contains nested streams and turn them into a stream of elements instead (flattening).

See the [Substreams](../stream-substream.html) page for more detail and code samples.

|  | Operator | Description |
| --- | --- | --- |
| Source/Flow | [flatMapConcat](Source-or-Flow/flatMapConcat.html) | Transform each input element into a `Source` whose elements are then flattened into the output stream through concatenation. |
| Source/Flow | [flatMapMerge](Source-or-Flow/flatMapMerge.html) | Transform each input element into a `Source` whose elements are then flattened into the output stream through merging. |
| Source/Flow | [flatMapPrefix](Source-or-Flow/flatMapPrefix.html) | Use the first `n` elements from the stream to determine how to process the rest. |
| Source/Flow | [groupBy](Source-or-Flow/groupBy.html) | Demultiplex the incoming stream into separate output streams. |
| Source/Flow | [prefixAndTail](Source-or-Flow/prefixAndTail.html) | Take up to *n* elements from the stream (less than *n* only if the upstream completes before emitting *n* elements) and returns a pair containing a strict sequence of the taken element and a stream representing the remaining elements. |
| Source/Flow | [splitAfter](Source-or-Flow/splitAfter.html) | End the current substream whenever a predicate returns `true`, starting a new substream for the next element. |
| Source/Flow | [splitWhen](Source-or-Flow/splitWhen.html) | Split off elements into a new substream whenever a predicate function return `true`. |

## Time aware operators

Those operators operate taking time into consideration.

|  | Operator | Description |
| --- | --- | --- |
| Source/Flow | [backpressureTimeout](Source-or-Flow/backpressureTimeout.html) | If the time between the emission of an element and the following downstream demand exceeds the provided timeout, the stream is failed with a `TimeoutException`. |
| Source/Flow | [completionTimeout](Source-or-Flow/completionTimeout.html) | If the completion of the stream does not happen until the provided timeout, the stream is failed with a `TimeoutException`. |
| Source/Flow | [idleTimeout](Source-or-Flow/idleTimeout.html) | If the time between two processed elements exceeds the provided timeout, the stream is failed with a `TimeoutException`. |
| Source/Flow | [initialTimeout](Source-or-Flow/initialTimeout.html) | If the first element has not passed through this operators before the provided timeout, the stream is failed with a `TimeoutException`. |
| Source/Flow | [keepAlive](Source-or-Flow/keepAlive.html) | Injects additional (configured) elements if upstream does not emit for a configured amount of time. |

## Fan\-in operators

These operators take multiple streams as their input and provide a single output combining the elements from all of the inputs in different ways.

|  | Operator | Description |
| --- | --- | --- |
|  | [MergeSequence](MergeSequence.html) | Merge a linear sequence partitioned across multiple sources. |
| Source/Flow | [concat](Source-or-Flow/concat.html) | After completion of the original upstream the elements of the given source will be emitted. |
| Source/Flow | [concatAllLazy](Source-or-Flow/concatAllLazy.html) | After completion of the original upstream the elements of the given sources will be emitted sequentially. |
| Source/Flow | [concatLazy](Source-or-Flow/concatLazy.html) | After completion of the original upstream the elements of the given source will be emitted. |
| Source/Flow | [interleave](Source-or-Flow/interleave.html) | Emits a specifiable number of elements from the original source, then from the provided source and repeats. |
| Source/Flow | [interleaveAll](Source-or-Flow/interleaveAll.html) | Emits a specifiable number of elements from the original source, then from the provided sources and repeats. |
| Source/Flow | [merge](Source-or-Flow/merge.html) | Merge multiple sources. |
| Source/Flow | [mergeAll](Source-or-Flow/mergeAll.html) | Merge multiple sources. |
| Source/Flow | [mergeLatest](Source-or-Flow/mergeLatest.html) | Merge multiple sources. |
| Source/Flow | [mergePreferred](Source-or-Flow/mergePreferred.html) | Merge multiple sources. |
| Source/Flow | [mergePrioritized](Source-or-Flow/mergePrioritized.html) | Merge multiple sources. |
| Source | [mergePrioritizedN](Source/mergePrioritizedN.html) | Merge multiple sources with priorities. |
| Source/Flow | [mergeSorted](Source-or-Flow/mergeSorted.html) | Merge multiple sources. |
| Source/Flow | [orElse](Source-or-Flow/orElse.html) | If the primary source completes without emitting any elements, the elements from the secondary source are emitted. |
| Source/Flow | [prepend](Source-or-Flow/prepend.html) | Prepends the given source to the flow, consuming it until completion before the original source is consumed. |
| Source/Flow | [prependLazy](Source-or-Flow/prependLazy.html) | Prepends the given source to the flow, consuming it until completion before the original source is consumed. |
| Source/Flow | [zip](Source-or-Flow/zip.html) | Combines elements from each of multiple sources into tuples *Pair* and passes the tuples pairs downstream. |
| Source/Flow | [zipAll](Source-or-Flow/zipAll.html) | Combines elements from two sources into tuples *Pair* handling early completion of either source. |
| Source/Flow | [zipLatest](Source-or-Flow/zipLatest.html) | Combines elements from each of multiple sources into tuples *Pair* and passes the tuples pairs downstream, picking always the latest element of each. |
| Source/Flow | [zipLatestWith](Source-or-Flow/zipLatestWith.html) | Combines elements from multiple sources through a `combine` function and passes the returned value downstream, picking always the latest element of each. |
| Source/Flow | [zipWith](Source-or-Flow/zipWith.html) | Combines elements from multiple sources through a `combine` function and passes the returned value downstream. |
| Source/Flow | [zipWithIndex](Source-or-Flow/zipWithIndex.html) | Zips elements of current flow with its indices. |

## Fan\-out operators

These have one input and multiple outputs. They might route the elements between different outputs, or emit elements on multiple outputs at the same time.

There is a number of fan\-out operators for which currently no ‘fluent’ is API available. To use those you will have to use the [Graph DSL](../stream-graphs.html#constructing-graphs).

|  | Operator | Description |
| --- | --- | --- |
|  | [Balance](Balance.html) | Fan\-out the stream to several streams. |
|  | [Broadcast](Broadcast.html) | Emit each incoming element each of `n` outputs. |
|  | [Partition](Partition.html) | Fan\-out the stream to several streams. |
|  | [Unzip](Unzip.html) | Takes a stream of two element tuples and unzips the two elements ino two different downstreams. |
|  | [UnzipWith](UnzipWith.html) | Splits each element of input into multiple downstreams using a function |
| Source/Flow | [alsoTo](Source-or-Flow/alsoTo.html) | Attaches the given `Sink` to this `Flow`, meaning that elements that pass through this `Flow` will also be sent to the `Sink`. |
| Source/Flow | [alsoToAll](Source-or-Flow/alsoToAll.html) | Attaches the given [`Source`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html "akka.stream.javadsl.Source")[`Source`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html "akka.stream.scaladsl.Source")s to this [`Flow`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html "akka.stream.javadsl.Flow")[`Flow`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow.html "akka.stream.scaladsl.Flow"), meaning that elements that pass through this [`Flow`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html "akka.stream.javadsl.Flow")[`Flow`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow.html "akka.stream.scaladsl.Flow") will also be sent to all those [`Sink`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Sink.html "akka.stream.javadsl.Sink")[`Sink`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Sink.html "akka.stream.scaladsl.Sink")s. |
| Source/Flow | [divertTo](Source-or-Flow/divertTo.html) | Each upstream element will either be diverted to the given sink, or the downstream consumer according to the predicate function applied to the element. |
| Source/Flow | [wireTap](Source-or-Flow/wireTap.html) | Attaches the given `Sink` to this `Flow` as a wire tap, meaning that elements that pass through will also be sent to the wire\-tap `Sink`, without the latter affecting the mainline flow. |

## Watching status operators

|  | Operator | Description |
| --- | --- | --- |
| Source/Flow | [monitor](Source-or-Flow/monitor.html) | Materializes to a `FlowMonitor` that monitors messages flowing through or completion of the operators. |
| Source/Flow | [watchTermination](Source-or-Flow/watchTermination.html) | Materializes to a `Future` `CompletionStage` that will be completed with Done or failed depending whether the upstream of the operators has been completed or failed. |

## Actor interop operators

Operators meant for inter\-operating between Akka Streams and Actors:

|  | Operator | Description |
| --- | --- | --- |
| Source | [actorRef](Source/actorRef.html) | Materialize an `ActorRef` of the classic actors API; sending messages to it will emit them on the stream. |
| Sink | [actorRef](Sink/actorRef.html) | Send the elements from the stream to an `ActorRef` of the classic actors API. |
| ActorSource | [actorRef](ActorSource/actorRef.html) | Materialize an `ActorRef<T>``ActorRef[T]` of the new actors API; sending messages to it will emit them on the stream only if they are of the same type as the stream. |
| ActorSink | [actorRef](ActorSink/actorRef.html) | Sends the elements of the stream to the given `ActorRef<T>``ActorRef[T]` of the new actors API, without considering backpressure. |
| Source | [actorRefWithBackpressure](Source/actorRefWithBackpressure.html) | Materialize an `ActorRef` of the classic actors API; sending messages to it will emit them on the stream. The source acknowledges reception after emitting a message, to provide back pressure from the source. |
| Sink | [actorRefWithBackpressure](Sink/actorRefWithBackpressure.html) | Send the elements from the stream to an `ActorRef` (of the classic actors API) which must then acknowledge reception after completing a message, to provide back pressure onto the sink. |
| ActorSource | [actorRefWithBackpressure](ActorSource/actorRefWithBackpressure.html) | Materialize an `ActorRef<T>``ActorRef[T]` of the new actors API; sending messages to it will emit them on the stream. The source acknowledges reception after emitting a message, to provide back pressure from the source. |
| ActorSink | [actorRefWithBackpressure](ActorSink/actorRefWithBackpressure.html) | Sends the elements of the stream to the given `ActorRef<T>``ActorRef[T]` of the new actors API with backpressure, to be able to signal demand when the actor is ready to receive more elements. |
| Source/Flow | [ask](Source-or-Flow/ask.html) | Use the “Ask Pattern” to send a request\-reply message to the target `ref` actor (of the classic actors API). |
| ActorFlow | [ask](ActorFlow/ask.html) | Use the “Ask Pattern” to send each stream element as an `ask` to the target actor (of the new actors API), and expect a reply that will be emitted downstream. |
| ActorFlow | [askWithContext](ActorFlow/askWithContext.html) | Use the “Ask Pattern” to send each stream element (without the context) as an `ask` to the target actor (of the new actors API), and expect a reply that will be emitted downstream. |
| ActorFlow | [askWithStatus](ActorFlow/askWithStatus.html) | Use the “Ask Pattern” to send each stream element as an `ask` to the target actor (of the new actors API), and expect a reply of Type `StatusReply[T]``StatusReply<T>` where the T will be unwrapped and emitted downstream. |
| ActorFlow | [askWithStatusAndContext](ActorFlow/askWithStatusAndContext.html) | Use the “Ask Pattern” to send each stream element (without the context) as an `ask` to the target actor (of the new actors API), and expect a reply of Type `StatusReply[T]``StatusReply<T>` where the T will be unwrapped and emitted downstream. |
| PubSub | [sink](PubSub/sink.html) | A sink that will publish emitted messages to a [`Topic`](https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/pubsub/Topic$.html "akka.actor.typed.pubsub.Topic")[`Topic`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/pubsub/Topic.html "akka.actor.typed.pubsub.Topic"). |
| PubSub | [source](PubSub/source.html) | A source that will subscribe to a [`Topic`](https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/pubsub/Topic$.html "akka.actor.typed.pubsub.Topic")[`Topic`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/pubsub/Topic.html "akka.actor.typed.pubsub.Topic") and stream messages published to the topic. |
| Source/Flow | [watch](Source-or-Flow/watch.html) | Watch a specific `ActorRef` and signal a failure downstream once the actor terminates. |

## Compression operators

Flow operators to (de)compress.

|  | Operator | Description |
| --- | --- | --- |
| Compression | [deflate](Compression/deflate.html) | Creates a flow that deflate\-compresses a stream of ByteStrings. |
| Compression | [gunzip](Compression/gunzip.html) | Creates a flow that gzip\-decompresses a stream of ByteStrings. |
| Compression | [gzip](Compression/gzip.html) | Creates a flow that gzip\-compresses a stream of ByteStrings. |
| Compression | [inflate](Compression/inflate.html) | Creates a flow that deflate\-decompresses a stream of ByteStrings. |

## Error handling

For more background see the [Error Handling in Streams](../stream-error.html) section.

|  | Operator | Description |
| --- | --- | --- |
| Source/Flow | [mapError](Source-or-Flow/mapError.html) | While similar to `recover` this operators can be used to transform an error signal to a different one *without* logging it as an error in the process. |
| Source/Flow | [onErrorComplete](Source-or-Flow/onErrorComplete.html) | Allows completing the stream when an upstream error occurs. |
| RestartSource | [onFailuresWithBackoff](RestartSource/onFailuresWithBackoff.html) | Wrap the given [`Source`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html "akka.stream.javadsl.Source")[`Source`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html "akka.stream.scaladsl.Source") with a [`Source`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html "akka.stream.javadsl.Source")[`Source`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html "akka.stream.scaladsl.Source") that will restart it when it fails using an exponential backoff. Notice that this [`Source`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html "akka.stream.javadsl.Source")[`Source`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html "akka.stream.scaladsl.Source") will not restart on completion of the wrapped flow. |
| RestartFlow | [onFailuresWithBackoff](RestartFlow/onFailuresWithBackoff.html) | Wrap the given [`Flow`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html "akka.stream.javadsl.Flow")[`Flow`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow.html "akka.stream.scaladsl.Flow") with a [`Flow`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html "akka.stream.javadsl.Flow")[`Flow`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow.html "akka.stream.scaladsl.Flow") that will restart it when it fails using an exponential backoff. Notice that this [`Flow`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html "akka.stream.javadsl.Flow")[`Flow`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow.html "akka.stream.scaladsl.Flow") will not restart on completion of the wrapped flow. |
| Source/Flow | [recover](Source-or-Flow/recover.html) | Allow sending of one last element downstream when a failure has happened upstream. |
| Source/Flow | [recoverWith](Source-or-Flow/recoverWith.html) | Allow switching to alternative Source when a failure has happened upstream. |
| Source/Flow | [recoverWithRetries](Source-or-Flow/recoverWithRetries.html) | RecoverWithRetries allows to switch to alternative Source on flow failure. |
| RestartSource | [withBackoff](RestartSource/withBackoff.html) | Wrap the given [`Source`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html "akka.stream.javadsl.Source")[`Source`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html "akka.stream.scaladsl.Source") with a [`Source`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html "akka.stream.javadsl.Source")[`Source`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html "akka.stream.scaladsl.Source") that will restart it when it fails or completes using an exponential backoff. |
| RestartFlow | [withBackoff](RestartFlow/withBackoff.html) | Wrap the given [`Flow`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html "akka.stream.javadsl.Flow")[`Flow`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow.html "akka.stream.scaladsl.Flow") with a [`Flow`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html "akka.stream.javadsl.Flow")[`Flow`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow.html "akka.stream.scaladsl.Flow") that will restart it when it fails or complete using an exponential backoff. |
| RestartSink | [withBackoff](RestartSink/withBackoff.html) | Wrap the given [`Sink`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Sink.html "akka.stream.javadsl.Sink")[`Sink`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Sink.html "akka.stream.scaladsl.Sink") with a [`Sink`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Sink.html "akka.stream.javadsl.Sink")[`Sink`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Sink.html "akka.stream.scaladsl.Sink") that will restart it when it fails or complete using an exponential backoff. |
| RetryFlow | [withBackoff](RetryFlow/withBackoff.html) | Wrap the given [`Flow`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html "akka.stream.javadsl.Flow")[`Flow`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow.html "akka.stream.scaladsl.Flow") and retry individual elements in that stream with an exponential backoff. A decider function tests every emitted element and can return a new element to be sent to the wrapped flow for another try. |
| RetryFlow | [withBackoffAndContext](RetryFlow/withBackoffAndContext.html) | Wrap the given [`FlowWithContext`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/FlowWithContext.html "akka.stream.javadsl.FlowWithContext")[`FlowWithContext`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/FlowWithContext.html "akka.stream.scaladsl.FlowWithContext") and retry individual elements in that stream with an exponential backoff. A decider function tests every emitted element and can return a new element to be sent to the wrapped flow for another try. |

## Code Examples

### Example 1: Additional Sink and Source converters

```scala
...
.toMat(StreamConverters.asInputStream().mapMaterializedValue { inputStream =>
        inputStream.read()  // this could block forever
        ...
}).run()
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/pubsub/Topic$.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/FlowWithContext.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Sink.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/pubsub/Topic.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/FlowWithContext.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Sink.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html
- https://doc.akka.io/libraries/akka-core/2.10/general/stream/stream-configuration.html
- https://doc.akka.io/libraries/akka-core/2.10/stream/operators/ActorFlow/ask.html
- https://doc.akka.io/libraries/akka-core/2.10/stream/operators/ActorFlow/askWithContext.html
- https://doc.akka.io/libraries/akka-core/2.10/stream/operators/ActorFlow/askWithStatus.html
- https://doc.akka.io/libraries/akka-core/2.10/stream/operators/ActorFlow/askWithStatusAndContext.html
- https://doc.akka.io/libraries/akka-core/2.10/stream/operators/ActorSink/actorRef.html
- https://doc.akka.io/libraries/akka-core/2.10/stream/operators/ActorSink/actorRefWithBackpressure.html
- https://doc.akka.io/libraries/akka-core/2.10/stream/operators/ActorSource/actorRef.html
- https://doc.akka.io/libraries/akka-core/2.10/stream/operators/ActorSource/actorRefWithBackpressure.html
- https://doc.akka.io/libraries/akka-core/2.10/stream/operators/Balance.html
- https://doc.akka.io/libraries/akka-core/2.10/stream/operators/Broadcast.html
- https://doc.akka.io/libraries/akka-core/2.10/stream/operators/Compression/deflate.html
- https://doc.akka.io/libraries/akka-core/2.10/stream/operators/Compression/gunzip.html
- https://doc.akka.io/libraries/akka-core/2.10/stream/operators/Compression/gzip.html
- https://doc.akka.io/libraries/akka-core/2.10/stream/operators/Compression/inflate.html
- https://doc.akka.io/libraries/akka-core/2.10/stream/operators/FileIO/fromFile.html
- https://doc.akka.io/libraries/akka-core/2.10/stream/operators/FileIO/fromPath.html
- https://doc.akka.io/libraries/akka-core/2.10/stream/operators/FileIO/toFile.html
- https://doc.akka.io/libraries/akka-core/2.10/stream/operators/FileIO/toPath.html
- https://doc.akka.io/libraries/akka-core/2.10/stream/operators/Flow/asFlowWithContext.html
- https://doc.akka.io/libraries/akka-core/2.10/stream/operators/Flow/completionStageFlow.html
- https://doc.akka.io/libraries/akka-core/2.10/stream/operators/Flow/contramap.html
- https://doc.akka.io/libraries/akka-core/2.10/stream/operators/Flow/flattenOptional.html
- https://doc.akka.io/libraries/akka-core/2.10/stream/operators/Flow/fromSinkAndSource.html
- https://doc.akka.io/libraries/akka-core/2.10/stream/operators/Flow/fromSinkAndSourceCoupled.html
- https://doc.akka.io/libraries/akka-core/2.10/stream/operators/Flow/futureFlow.html
- https://doc.akka.io/libraries/akka-core/2.10/stream/operators/Flow/lazyCompletionStageFlow.html
- https://doc.akka.io/libraries/akka-core/2.10/stream/operators/Flow/lazyFlow.html
- https://doc.akka.io/libraries/akka-core/2.10/stream/operators/Flow/lazyFutureFlow.html
- https://doc.akka.io/libraries/akka-core/2.10/stream/operators/Flow/lazyInitAsync.html
- https://doc.akka.io/libraries/akka-core/2.10/stream/operators/MergeSequence.html
- https://doc.akka.io/libraries/akka-core/2.10/stream/operators/Partition.html
- https://doc.akka.io/libraries/akka-core/2.10/stream/operators/PubSub/sink.html
- https://doc.akka.io/libraries/akka-core/2.10/stream/operators/PubSub/source.html
- https://doc.akka.io/libraries/akka-core/2.10/stream/operators/RestartFlow/onFailuresWithBackoff.html
- https://doc.akka.io/libraries/akka-core/2.10/stream/operators/RestartFlow/withBackoff.html
- https://doc.akka.io/libraries/akka-core/2.10/stream/operators/RestartSink/withBackoff.html
- https://doc.akka.io/libraries/akka-core/2.10/stream/operators/RestartSource/onFailuresWithBackoff.html
- https://doc.akka.io/libraries/akka-core/2.10/stream/operators/RestartSource/withBackoff.html

---
*Source: [https://doc.akka.io/libraries/akka-core/2.10/stream/operators/index.html](https://doc.akka.io/libraries/akka-core/2.10/stream/operators/index.html)*