---
description: Akka 2.10.17 - akka.stream.javadsl.Source
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:56:06Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/stream/javadsl/Source$.html
title: Akka 2.10.17 - akka.stream.javadsl.Source
---

# Akka 2.10.17 - akka.stream.javadsl.Source

> **Summary:** Akka 2.10.17 - akka.stream.javadsl.Source

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/stream/index.html "Permalink")  package [stream](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/stream/javadsl/index.html "Permalink")  package [javadsl](index.html)Definition Classes[stream](../index.html)
- [AsPublisher](AsPublisher.html)
- [Balance](Balance$.html "Fan-out the stream to several streams.")
- [BidiFlow](BidiFlow.html)
- [Broadcast](Broadcast$.html "Fan-out the stream to several streams.")
- [BroadcastHub](BroadcastHub$.html "A BroadcastHub is a special streaming hub that is able to broadcast streamed elements to a dynamic set of consumers.")
- [Compression](Compression$.html)
- [Concat](Concat$.html "Takes two streams and outputs an output stream formed from the two input streams by consuming one stream first emitting all of its elements, then consuming the second stream emitting all of its elements.")
- [DelayStrategy](DelayStrategy.html "Allows to manage delay and can be stateful to compute delay for any sequence of elements, all elements go through nextDelay() updating state and returning delay for each element")
- [FileIO](FileIO$.html "Java API: Factories to create sinks and sources from files")
- [Flow](Flow.html "A Flow is a set of stream processing steps that has one open input and one open output.")
- [FlowWithContext](FlowWithContext.html "A flow that provides operations which automatically propagate the context of an element.")
- [Framing](Framing$.html)
- [FramingTruncation](FramingTruncation.html "Determines mode in which Framing operates.")
- [GraphDSL](GraphDSL$.html)
- [JavaFlowSupport](JavaFlowSupport.html "For use only with JDK 9+.")
- [JsonFraming](JsonFraming$.html "Provides JSON framing operators that can separate valid JSON objects from incoming akka.util.ByteString objects.")
- [Keep](Keep$.html)
- [Merge](Merge$.html "Merge several streams, taking elements as they arrive from input streams (picking randomly when several have elements ready).")
- [MergeHub](MergeHub$.html "A MergeHub is a special streaming hub that is able to collect streamed elements from a dynamic set of producers.")
- [MergeLatest](MergeLatest$.html "MergeLatest joins elements from N input streams into stream of lists of size N.")
- [MergePreferred](MergePreferred$.html "Merge several streams, taking elements as they arrive from input streams (picking from preferred when several have elements ready).")
- [MergePrioritized](MergePrioritized$.html "Merge several streams, taking elements as they arrive from input streams (picking from prioritized once when several have elements ready).")
- [MergeSequence](MergeSequence$.html "Takes multiple streams whose elements in aggregate have a defined linear sequence with difference 1, starting at 0, and outputs a single stream containing these elements, in order.")
- [Partition](Partition$.html "Fan-out the stream to several streams.")
- [PartitionHub](PartitionHub$.html "A PartitionHub is a special streaming hub that is able to route streamed elements to a dynamic set of consumers.")
- [RestartFlow](RestartFlow$.html "A RestartFlow wraps a Flow that gets restarted when it completes or fails.")
- [RestartSink](RestartSink$.html "A RestartSink wraps a Sink that gets restarted when it completes or fails.")
- [RestartSource](RestartSource$.html "A RestartSource wraps a Source that gets restarted when it completes or fails.")
- [RestartSourceWithContext](RestartSourceWithContext$.html "A RestartSourceWithContext wraps a SourceWithContext that gets restarted when it completes or fails.")
- [RetryFlow](RetryFlow$.html)
- [RunnableGraph](RunnableGraph.html "Java API")
- [Sink](Sink.html "Java API")
- [SinkQueue](SinkQueue.html "This trait allows to have a queue as a sink for a stream.")
- [SinkQueueWithCancel](SinkQueueWithCancel.html "This trait adds cancel support to SinkQueue.")
- [Source](Source.html "Java API")
- [SourceQueue](SourceQueue.html "This trait allows to have a queue as a data source for some stream.")
- [SourceQueueWithComplete](SourceQueueWithComplete.html "This trait adds completion support to SourceQueue.")
- [SourceWithContext](SourceWithContext.html "A source that provides operations which automatically propagate the context of an element.")
- [StreamConverters](StreamConverters$.html "Converters for interacting with the blocking java.io streams APIs and Java 8 Streams")
- [StreamRefs](StreamRefs$.html "Factories for creating stream refs.")
- [SubFlow](SubFlow.html "A “stream of streams” sub-flow of data elements, e.g.")
- [SubSource](SubSource.html "A “stream of streams” sub-flow of data elements, e.g.")
- [TLS](TLS$.html "Stream cipher support based upon JSSE.")
- [TLSPlacebo](TLSPlacebo$.html "This object holds simple wrapping akka.stream.scaladsl.BidiFlow implementations that can be used instead of TLS when no encryption is desired.")
- [Tcp](Tcp.html)
- [ThrottleControl](ThrottleControl.html "Control the throttle rate from the outside of the stream, or share a common throttle rate across several streams.")
- [Unzip](Unzip$.html "Takes a stream of pair elements and splits each pair to two output streams.")
- [UnzipWith](UnzipWith$.html "Split one stream into several streams using a splitting function.")
- [Zip](Zip$.html "Combine the elements of 2 streams into a stream of tuples.")
- [ZipLatest](ZipLatest$.html "Combine the elements of 2 streams into a stream of tuples, picking always the latest element of each.")
- [ZipLatestWith](ZipLatestWith$.html "Combine the elements of multiple streams into a stream of combined elements using a combiner function, picking always the latest of the elements of each source.")
- [ZipN](ZipN$.html "Combine the elements of multiple streams into a stream of lists.")
- [ZipWith](ZipWith$.html "Combine the elements of multiple streams into a stream of combined elements using a combiner function.")
- [ZipWithN](ZipWithN$.html "Combine the elements of multiple streams into a stream of lists using a combiner function.")
[o](Source.html "See companion class")[akka](../../index.html).[stream](../index.html).[javadsl](index.html)

# [Source](Source.html "See companion class")[**](../../../akka/stream/javadsl/Source$.html "Permalink")

### Companion [class Source](Source.html "See companion class")

#### object Source

Java API

Source[Source.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-stream/src/main/scala/akka/stream/javadsl/Source.scala#L36)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. Source
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Value Members

1. [**](../../../akka/stream/javadsl/Source$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/stream/javadsl/Source$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/stream/javadsl/Source$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../akka/stream/javadsl/Source$.html#actorRef[T](completionMatcher:akka.japi.function.Function[Any,java.util.Optional[akka.stream.CompletionStrategy]],failureMatcher:akka.japi.function.Function[Any,java.util.Optional[Throwable]],bufferSize:Int,overflowStrategy:akka.stream.OverflowStrategy):akka.stream.javadsl.Source[T,akka.actor.ActorRef] "Permalink")  def actorRef\[T](completionMatcher: [Function](../../japi/function/Function.html)\[[Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), [Optional](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Optional.html#java.util.Optional)\[[CompletionStrategy](../CompletionStrategy.html)]], failureMatcher: [Function](../../japi/function/Function.html)\[[Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), [Optional](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Optional.html#java.util.Optional)\[Throwable]], bufferSize: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), overflowStrategy: [OverflowStrategy](../OverflowStrategy.html)): [Source](Source.html)\[T, [ActorRef](../../actor/ActorRef.html)]Creates a `Source` that is materialized as an [akka.actor.ActorRef](../../actor/ActorRef.html).

Creates a `Source` that is materialized as an [akka.actor.ActorRef](../../actor/ActorRef.html).
Messages sent to this actor will be emitted to the stream if there is demand from downstream,
otherwise they will be buffered until request for demand is received.

Depending on the defined [akka.stream.OverflowStrategy](../OverflowStrategy.html) it might drop elements if
there is no space available in the buffer.

The strategy [akka.stream.OverflowStrategy.backpressure](../OverflowStrategy$.html#backpressure:akka.stream.OverflowStrategy) is not supported, and an
IllegalArgument("Backpressure overflowStrategy not supported") will be thrown if it is passed as argument.

The buffer can be disabled by using `bufferSize` of 0 and then received messages are dropped if there is no demand
from downstream. When `bufferSize` is 0 the `overflowStrategy` does not matter.

The stream can be completed successfully by sending the actor reference a message that is matched by
`completionMatcher` in which case already buffered elements will be signaled before signaling
completion.

The stream can be completed with failure by sending a message that is matched by `failureMatcher`. The extracted
Throwable will be used to fail the stream. In case the Actor is still draining its internal buffer (after having received
a message matched by `completionMatcher`) before signaling completion and it receives a message matched by `failureMatcher`,
the failure will be signaled downstream immediately (instead of the completion signal).

Note that terminating the actor without first completing it, either with a success or a
failure, will prevent the actor triggering downstream completion and the stream will continue
to run even though the source actor is dead. Therefore you should \*\*not\*\* attempt to
manually terminate the actor such as with a [akka.actor.PoisonPill](../../actor/PoisonPill.html).

The actor will be stopped when the stream is completed, failed or canceled from downstream,
i.e. you can watch it to get notified when that happens.

See also [akka.stream.scaladsl.Source.queue](../scaladsl/Source$.html#queue[T](bufferSize:Int,overflowStrategy:akka.stream.OverflowStrategy,maxConcurrentOffers:Int):akka.stream.scaladsl.Source[T,akka.stream.scaladsl.SourceQueueWithComplete[T]]).

completionMatchercatches the completion message to end the stream

failureMatchercatches the failure message to fail the stream

bufferSizeThe size of the buffer in element count

overflowStrategyStrategy that is used when incoming elements cannot fit inside the buffer
5. [**](../../../akka/stream/javadsl/Source$.html#actorRefWithBackpressure[T](ackMessage:Any,completionMatcher:akka.japi.function.Function[Any,java.util.Optional[akka.stream.CompletionStrategy]],failureMatcher:akka.japi.function.Function[Any,java.util.Optional[Throwable]]):akka.stream.javadsl.Source[T,akka.actor.ActorRef] "Permalink")  def actorRefWithBackpressure\[T](ackMessage: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), completionMatcher: [Function](../../japi/function/Function.html)\[[Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), [Optional](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Optional.html#java.util.Optional)\[[CompletionStrategy](../CompletionStrategy.html)]], failureMatcher: [Function](../../japi/function/Function.html)\[[Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), [Optional](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Optional.html#java.util.Optional)\[Throwable]]): [Source](Source.html)\[T, [ActorRef](../../actor/ActorRef.html)]Creates a `Source` that is materialized as an [akka.actor.ActorRef](../../actor/ActorRef.html).

Creates a `Source` that is materialized as an [akka.actor.ActorRef](../../actor/ActorRef.html).
Messages sent to this actor will be emitted to the stream if there is demand from downstream,
and a new message will only be accepted after the previous messages has been consumed and acknowledged back.
The stream will complete with failure if a message is sent before the acknowledgement has been replied back.

The stream can be completed with failure by sending a message that is matched by `failureMatcher`. The extracted
Throwable will be used to fail the stream. In case the Actor is still draining its internal buffer (after having received
a message matched by `completionMatcher`) before signaling completion and it receives a message matched by `failureMatcher`,
the failure will be signaled downstream immediately (instead of the completion signal).

The actor will be stopped when the stream is completed, failed or canceled from downstream,
i.e. you can watch it to get notified when that happens.
6. [**](../../../akka/stream/javadsl/Source$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../akka/stream/javadsl/Source$.html#asSubscriber[T]():akka.stream.javadsl.Source[T,org.reactivestreams.Subscriber[T]] "Permalink")  def asSubscriber\[T](): [Source](Source.html)\[T, Subscriber\[T]]Creates a `Source` that is materialized as a org.reactivestreams.Subscriber
8. [**](../../../akka/stream/javadsl/Source$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
9. [**](../../../akka/stream/javadsl/Source$.html#combine[T,U,M](sources:java.util.List[_<:akka.stream.Graph[akka.stream.SourceShape[T],M]],fanInStrategy:akka.japi.function.Function[Integer,akka.stream.Graph[akka.stream.UniformFanInShape[T,U],akka.NotUsed]]):akka.stream.javadsl.Source[U,java.util.List[M]] "Permalink")  def combine\[T, U, M](sources: [List](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/List.html#java.util.List)\[\_ \<: [Graph](../Graph.html)\[[SourceShape](../SourceShape.html)\[T], M]], fanInStrategy: [Function](../../japi/function/Function.html)\[[Integer](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Integer.html#java.lang.Integer), [Graph](../Graph.html)\[[UniformFanInShape](../UniformFanInShape.html)\[T, U], [NotUsed](../../NotUsed.html)]]): [Source](Source.html)\[U, [List](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/List.html#java.util.List)\[M]]Combines several sources with fan\-in strategy like [Merge](Merge$.html) or [Concat](Concat$.html) into a single [Source](Source.html).
10. [**](../../../akka/stream/javadsl/Source$.html#combine[T,U](first:akka.stream.javadsl.Source[T,_],second:akka.stream.javadsl.Source[T,_],rest:java.util.List[akka.stream.javadsl.Source[T,_]],fanInStrategy:akka.japi.function.Function[Integer,_<:akka.stream.Graph[akka.stream.UniformFanInShape[T,U],akka.NotUsed]]):akka.stream.javadsl.Source[U,akka.NotUsed] "Permalink")  def combine\[T, U](first: [Source](Source.html)\[T, \_], second: [Source](Source.html)\[T, \_], rest: [List](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/List.html#java.util.List)\[[Source](Source.html)\[T, \_]], fanInStrategy: [Function](../../japi/function/Function.html)\[[Integer](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Integer.html#java.lang.Integer), \_ \<: [Graph](../Graph.html)\[[UniformFanInShape](../UniformFanInShape.html)\[T, U], [NotUsed](../../NotUsed.html)]]): [Source](Source.html)\[U, [NotUsed](../../NotUsed.html)]Combines several sources with fan\-in strategy like [Merge](Merge$.html) or [Concat](Concat$.html) into a single [Source](Source.html).
11. [**](../../../akka/stream/javadsl/Source$.html#combineMat[T,U,M1,M2,M](first:akka.stream.javadsl.Source[T,M1],second:akka.stream.javadsl.Source[T,M2],fanInStrategy:akka.japi.function.Function[Integer,_<:akka.stream.Graph[akka.stream.UniformFanInShape[T,U],akka.NotUsed]],matF:akka.japi.function.Function2[M1,M2,M]):akka.stream.javadsl.Source[U,M] "Permalink")  def combineMat\[T, U, M1, M2, M](first: [Source](Source.html)\[T, M1], second: [Source](Source.html)\[T, M2], fanInStrategy: [Function](../../japi/function/Function.html)\[[Integer](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Integer.html#java.lang.Integer), \_ \<: [Graph](../Graph.html)\[[UniformFanInShape](../UniformFanInShape.html)\[T, U], [NotUsed](../../NotUsed.html)]], matF: [Function2](../../japi/function/Function2.html)\[M1, M2, M]): [Source](Source.html)\[U, M]Combines two sources with fan\-in strategy like `Merge` or `Concat` and returns `Source` with a materialized value.
12. [**](../../../akka/stream/javadsl/Source$.html#completionStage[T](completionStage:java.util.concurrent.CompletionStage[T]):akka.stream.javadsl.Source[T,akka.NotUsed] "Permalink")  def completionStage\[T](completionStage: [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[T]): [Source](Source.html)\[T, [NotUsed](../../NotUsed.html)]Emits a single value when the given `CompletionStage` is successfully completed and then completes the stream.

Emits a single value when the given `CompletionStage` is successfully completed and then completes the stream.
If the `CompletionStage` is completed with a failure the stream is failed.
13. [**](../../../akka/stream/javadsl/Source$.html#completionStageSource[T,M](completionStageSource:java.util.concurrent.CompletionStage[akka.stream.javadsl.Source[T,M]]):akka.stream.javadsl.Source[T,java.util.concurrent.CompletionStage[M]] "Permalink")  def completionStageSource\[T, M](completionStageSource: [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[[Source](Source.html)\[T, M]]): [Source](Source.html)\[T, [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[M]]Turn a `CompletionStage[Source]` into a source that will emit the values of the source when the future completes successfully.

Turn a `CompletionStage[Source]` into a source that will emit the values of the source when the future completes successfully.
If the `CompletionStage` is completed with a failure the stream is failed.
14. [**](../../../akka/stream/javadsl/Source$.html#cycle[O](f:akka.japi.function.Creator[java.util.Iterator[O]]):akka.stream.javadsl.Source[O,akka.NotUsed] "Permalink")  def cycle\[O](f: [Creator](../../japi/function/Creator.html)\[[Iterator](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Iterator.html#java.util.Iterator)\[O]]): [Source](Source.html)\[O, [NotUsed](../../NotUsed.html)]Helper to create a 'cycled' [Source](Source.html) that will continually produce elements in the order
they are provided.

Helper to create a 'cycled' [Source](Source.html) that will continually produce elements in the order
they are provided.

Example usage:

```
Source.cycle(() -> Arrays.asList(1, 2, 3).iterator());
```
The function `f` is invoked to obtain an iterator and elements are emitted into the stream as
provided by that iterator. If the iterator is finite, the function `f` invoked again, as necessary,
when the elements from the previous iteration are exhausted. If every call to function `f` returns
an iterator that produces the same elements in the same order, then the [Source](Source.html) will effectively
be cyclic. However, `f` is not required to behave that way, in which case the [Source](Source.html) will not be cyclic.

The [Source](Source.html) fails if `f` returns an empty iterator.
15. [**](../../../akka/stream/javadsl/Source$.html#empty[T](clazz:Class[T]):akka.stream.javadsl.Source[T,akka.NotUsed] "Permalink")  def empty\[T](clazz: Class\[T]): [Source](Source.html)\[T, [NotUsed](../../NotUsed.html)]Create a `Source` with no elements.

Create a `Source` with no elements. The result is the same as calling `Source.<O>empty()`
16. [**](../../../akka/stream/javadsl/Source$.html#empty[O]():akka.stream.javadsl.Source[O,akka.NotUsed] "Permalink")  def empty\[O](): [Source](Source.html)\[O, [NotUsed](../../NotUsed.html)]Create a `Source` with no elements, i.e.

Create a `Source` with no elements, i.e. an empty stream that is completed immediately
for every connected `Sink`.
17. [**](../../../akka/stream/javadsl/Source$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
18. [**](../../../akka/stream/javadsl/Source$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
19. [**](../../../akka/stream/javadsl/Source$.html#failed[T](cause:Throwable):akka.stream.javadsl.Source[T,akka.NotUsed] "Permalink")  def failed\[T](cause: Throwable): [Source](Source.html)\[T, [NotUsed](../../NotUsed.html)]Create a `Source` that immediately ends the stream with the `cause` failure to every connected `Sink`.
20. [**](../../../akka/stream/javadsl/Source$.html#from[O](iterable:Iterable[O]):akka.stream.javadsl.Source[O,akka.NotUsed] "Permalink")  def from\[O](iterable: [Iterable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Iterable.html#java.lang.Iterable)\[O]): [Source](Source.html)\[O, [NotUsed](../../NotUsed.html)]Helper to create [Source](Source.html) from `Iterable`.

Helper to create [Source](Source.html) from `Iterable`.
Example usage:

```
List<Integer> data = new ArrayList<Integer>();
data.add(1);
data.add(2);
data.add(3);
Source.from(data);
```
Starts a new `Source` from the given `Iterable`. This is like starting from an
Iterator, but every Subscriber directly attached to the Publisher of this
stream will see an individual flow of elements (always starting from the
beginning) regardless of when they subscribed.

Make sure that the `Iterable` is immutable or at least not modified after
being used as a `Source`. Otherwise the stream may fail with
`ConcurrentModificationException` or other more subtle errors may occur.
21. [**](../../../akka/stream/javadsl/Source$.html#fromGraph[T,M](g:akka.stream.Graph[akka.stream.SourceShape[T],M]):akka.stream.javadsl.Source[T,M] "Permalink")  def fromGraph\[T, M](g: [Graph](../Graph.html)\[[SourceShape](../SourceShape.html)\[T], M]): [Source](Source.html)\[T, M]A graph with the shape of a source logically is a source, this method makes
it so also in type.
22. [**](../../../akka/stream/javadsl/Source$.html#fromIterator[O](f:akka.japi.function.Creator[java.util.Iterator[O]]):akka.stream.javadsl.Source[O,akka.NotUsed] "Permalink")  def fromIterator\[O](f: [Creator](../../japi/function/Creator.html)\[[Iterator](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Iterator.html#java.util.Iterator)\[O]]): [Source](Source.html)\[O, [NotUsed](../../NotUsed.html)]Helper to create a [Source](Source.html) from an `Iterator`.

Helper to create a [Source](Source.html) from an `Iterator`.
Example usage:

```
List<Integer> data = new ArrayList<Integer>();
data.add(1);
data.add(2);
data.add(3);
Source.from(() -> data.iterator());
```
Start a new `Source` from the given Iterator. The produced stream of elements
will continue until the iterator runs empty or fails during evaluation of
the `next()` method. Elements are pulled out of the iterator
in accordance with the demand coming from the downstream transformation
steps.
23. [**](../../../akka/stream/javadsl/Source$.html#fromJavaStream[O,S<:java.util.stream.BaseStream[O,S]](stream:akka.japi.function.Creator[java.util.stream.BaseStream[O,S]]):akka.stream.javadsl.Source[O,akka.NotUsed] "Permalink")  def fromJavaStream\[O, S \<: [BaseStream](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/stream/BaseStream.html#java.util.stream.BaseStream)\[O, S]](stream: [Creator](../../japi/function/Creator.html)\[[BaseStream](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/stream/BaseStream.html#java.util.stream.BaseStream)\[O, S]]): [Source](Source.html)\[O, [NotUsed](../../NotUsed.html)]Creates a source that wraps a Java 8 `Stream`.

Creates a source that wraps a Java 8 `Stream`. `Source` uses a stream iterator to get all its
elements and send them downstream on demand.

You can use [Source.async](Source.html#async(dispatcher:String,inputBufferSize:Int):akka.stream.javadsl.Source[Out,Mat]) to create asynchronous boundaries between synchronous java stream
and the rest of flow.
24. [**](../../../akka/stream/javadsl/Source$.html#fromMaterializer[T,M](factory:java.util.function.BiFunction[akka.stream.Materializer,akka.stream.Attributes,akka.stream.javadsl.Source[T,M]]):akka.stream.javadsl.Source[T,java.util.concurrent.CompletionStage[M]] "Permalink")  def fromMaterializer\[T, M](factory: [BiFunction](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/BiFunction.html#java.util.function.BiFunction)\[[Materializer](../Materializer.html), [Attributes](../Attributes.html), [Source](Source.html)\[T, M]]): [Source](Source.html)\[T, [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[M]]Defers the creation of a [Source](Source.html) until materialization.

Defers the creation of a [Source](Source.html) until materialization. The `factory` function
exposes [Materializer](../Materializer.html) which is going to be used during materialization and
[Attributes](../Attributes.html) of the [Source](Source.html) returned by this method.
25. [**](../../../akka/stream/javadsl/Source$.html#fromPublisher[O](publisher:org.reactivestreams.Publisher[O]):akka.stream.javadsl.Source[O,akka.NotUsed] "Permalink")  def fromPublisher\[O](publisher: Publisher\[O]): [Source](Source.html)\[O, [NotUsed](../../NotUsed.html)]Helper to create [Source](Source.html) from `Publisher`.

Helper to create [Source](Source.html) from `Publisher`.

Construct a transformation starting with given publisher. The transformation steps
are executed by a series of org.reactivestreams.Processor instances
that mediate the flow of elements downstream and the propagation of
back\-pressure upstream.
26. [**](../../../akka/stream/javadsl/Source$.html#future[T](futureElement:scala.concurrent.Future[T]):akka.stream.javadsl.Source[T,akka.NotUsed] "Permalink")  def future\[T](futureElement: [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[T]): [Source](Source.html)\[T, [NotUsed](../../NotUsed.html)]Emits a single value when the given Scala `Future` is successfully completed and then completes the stream.

Emits a single value when the given Scala `Future` is successfully completed and then completes the stream.
The stream fails if the `Future` is completed with a failure.

Here for Java interoperability, the normal use from Java should be [Source.completionStage](#completionStage[T](completionStage:java.util.concurrent.CompletionStage[T]):akka.stream.javadsl.Source[T,akka.NotUsed])
27. [**](../../../akka/stream/javadsl/Source$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
28. [**](../../../akka/stream/javadsl/Source$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
29. [**](../../../akka/stream/javadsl/Source$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
30. [**](../../../akka/stream/javadsl/Source$.html#lazyCompletionStage[T](create:akka.japi.function.Creator[java.util.concurrent.CompletionStage[T]]):akka.stream.javadsl.Source[T,akka.NotUsed] "Permalink")  def lazyCompletionStage\[T](create: [Creator](../../japi/function/Creator.html)\[[CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[T]]): [Source](Source.html)\[T, [NotUsed](../../NotUsed.html)]Defers invoking the `create` function to create a future element until there is downstream demand.

Defers invoking the `create` function to create a future element until there is downstream demand.

The returned future element will be emitted downstream when it completes, or fail the stream if the future
is failed or the `create` function itself fails.

Note that asynchronous boundaries (and other operators) in the stream may do pre\-fetching which counter acts
the laziness and will trigger the factory immediately.

The materialized future `Done` value is completed when the `create` function has successfully been invoked and the future completes,
if the function throws or the future fails the future materialized value is failed with that exception.
If downstream cancels or fails before the function is invoked the materialized value
is failed with a [akka.stream.NeverMaterializedException](../NeverMaterializedException.html)
31. [**](../../../akka/stream/javadsl/Source$.html#lazyCompletionStageSource[T,M](create:akka.japi.function.Creator[java.util.concurrent.CompletionStage[akka.stream.javadsl.Source[T,M]]]):akka.stream.javadsl.Source[T,java.util.concurrent.CompletionStage[M]] "Permalink")  def lazyCompletionStageSource\[T, M](create: [Creator](../../japi/function/Creator.html)\[[CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[[Source](Source.html)\[T, M]]]): [Source](Source.html)\[T, [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[M]] Defers invoking the `create` function to create a future source until there is downstream demand.

 Defers invoking the `create` function to create a future source until there is downstream demand.

The returned future source will emit downstream and behave just like it was the outer source when the `CompletionStage` completes
successfully. Downstream completes when the created source completes and fails when the created source fails.
If the `CompletionStage` or the `create` function fails the stream is failed.

Note that asynchronous boundaries (and other operators) in the stream may do pre\-fetching which counter acts
the laziness and triggers the factory immediately.

The materialized `CompletionStage` value is completed with the materialized value of the created source when
it has been materialized. If the function throws or the source materialization fails the future materialized value
is failed with the thrown exception.

If downstream cancels or fails before the function is invoked the materialized value
is failed with a [akka.stream.NeverMaterializedException](../NeverMaterializedException.html)
32. [**](../../../akka/stream/javadsl/Source$.html#lazySingle[T](create:akka.japi.function.Creator[T]):akka.stream.javadsl.Source[T,akka.NotUsed] "Permalink")  def lazySingle\[T](create: [Creator](../../japi/function/Creator.html)\[T]): [Source](Source.html)\[T, [NotUsed](../../NotUsed.html)]Defers invoking the `create` function to create a single element until there is downstream demand.

Defers invoking the `create` function to create a single element until there is downstream demand.

If the `create` function fails when invoked the stream is failed.

Note that asynchronous boundaries (and other operators) in the stream may do pre\-fetching which counter acts
the laziness and will trigger the factory immediately.

The materialized future `Done` value is completed when the `create` function has successfully been invoked,
if the function throws the future materialized value is failed with that exception.
If downstream cancels or fails before the function is invoked the materialized value
is failed with a [akka.stream.NeverMaterializedException](../NeverMaterializedException.html)
33. [**](../../../akka/stream/javadsl/Source$.html#lazySource[T,M](create:akka.japi.function.Creator[akka.stream.javadsl.Source[T,M]]):akka.stream.javadsl.Source[T,java.util.concurrent.CompletionStage[M]] "Permalink")  def lazySource\[T, M](create: [Creator](../../japi/function/Creator.html)\[[Source](Source.html)\[T, M]]): [Source](Source.html)\[T, [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[M]]Defers invoking the `create` function to create a future source until there is downstream demand.

Defers invoking the `create` function to create a future source until there is downstream demand.

The returned source will emit downstream and behave just like it was the outer source. Downstream completes
when the created source completes and fails when the created source fails.

Note that asynchronous boundaries (and other operators) in the stream may do pre\-fetching which counter acts
the laziness and will trigger the factory immediately.

The materialized future value is completed with the materialized value of the created source when
it has been materialized. If the function throws or the source materialization fails the future materialized value
is failed with the thrown exception.

If downstream cancels or fails before the function is invoked the materialized value
is failed with a [akka.stream.NeverMaterializedException](../NeverMaterializedException.html)
34. [**](../../../akka/stream/javadsl/Source$.html#maybe[T]:akka.stream.javadsl.Source[T,java.util.concurrent.CompletableFuture[java.util.Optional[T]]] "Permalink")  def maybe\[T]: [Source](Source.html)\[T, [CompletableFuture](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletableFuture.html#java.util.concurrent.CompletableFuture)\[[Optional](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Optional.html#java.util.Optional)\[T]]]Create a `Source` which materializes a [java.util.concurrent.CompletableFuture](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletableFuture.html) which controls what element
will be emitted by the Source.

Create a `Source` which materializes a [java.util.concurrent.CompletableFuture](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletableFuture.html) which controls what element
will be emitted by the Source.
If the materialized promise is completed with a filled Optional, that value will be produced downstream,
followed by completion.
If the materialized promise is completed with an empty Optional, no value will be produced downstream and completion will
be signalled immediately.
If the materialized promise is completed with a failure, then the source will fail with that error.
If the downstream of this source cancels or fails before the promise has been completed, then the promise will be completed
with an empty Optional.
35. [**](../../../akka/stream/javadsl/Source$.html#mergePrioritizedN[T](sourcesAndPriorities:java.util.List[akka.japi.Pair[akka.stream.javadsl.Source[T,_],Integer]],eagerComplete:Boolean):akka.stream.javadsl.Source[T,akka.NotUsed] "Permalink")  def mergePrioritizedN\[T](sourcesAndPriorities: [List](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/List.html#java.util.List)\[[Pair](../../japi/Pair.html)\[[Source](Source.html)\[T, \_], [Integer](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Integer.html#java.lang.Integer)]], eagerComplete: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): [Source](Source.html)\[T, [NotUsed](../../NotUsed.html)]Merge multiple [Source](Source.html)s.

Merge multiple [Source](Source.html)s. Prefer the sources depending on the 'priority' parameters.
The provided sources and priorities must have the same size and order.

**emits** when one of the inputs has an element available, preferring inputs based on the 'priority' parameters if both have elements available

**backpressures** when downstream backpressures

**completes** when both upstreams complete (This behavior is changeable to completing when any upstream completes by setting `eagerComplete=true`.)

**Cancels when** downstream cancels
36. [**](../../../akka/stream/javadsl/Source$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
37. [**](../../../akka/stream/javadsl/Source$.html#never[T]:akka.stream.javadsl.Source[T,akka.NotUsed] "Permalink")  def never\[T]: [Source](Source.html)\[T, [NotUsed](../../NotUsed.html)]Never emits any elements, never completes and never fails.

Never emits any elements, never completes and never fails.
This stream could be useful in tests.
38. [**](../../../akka/stream/javadsl/Source$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
39. [**](../../../akka/stream/javadsl/Source$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
40. [**](../../../akka/stream/javadsl/Source$.html#queue[T](bufferSize:Int,overflowStrategy:akka.stream.OverflowStrategy,maxConcurrentOffers:Int):akka.stream.javadsl.Source[T,akka.stream.javadsl.SourceQueueWithComplete[T]] "Permalink")  def queue\[T](bufferSize: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), overflowStrategy: [OverflowStrategy](../OverflowStrategy.html), maxConcurrentOffers: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Source](Source.html)\[T, [SourceQueueWithComplete](SourceQueueWithComplete.html)\[T]]Creates a `Source` that is materialized as an [akka.stream.javadsl.SourceQueueWithComplete](SourceQueueWithComplete.html).

Creates a `Source` that is materialized as an [akka.stream.javadsl.SourceQueueWithComplete](SourceQueueWithComplete.html).
You can push elements to the queue and they will be emitted to the stream if there is demand from downstream,
otherwise they will be buffered until request for demand is received. Elements in the buffer will be discarded
if downstream is terminated.

Depending on the defined [akka.stream.OverflowStrategy](../OverflowStrategy.html) it might drop elements if
there is no space available in the buffer.

Acknowledgement mechanism is available.
[akka.stream.javadsl.SourceQueueWithComplete.offer](SourceQueueWithComplete.html#offer(elem:T):java.util.concurrent.CompletionStage[akka.stream.QueueOfferResult]) returns `CompletionStage<QueueOfferResult>` which completes with
`QueueOfferResult.enqueued()` if element was added to buffer or sent downstream. It completes with
`QueueOfferResult.dropped()` if element was dropped. Can also complete with `QueueOfferResult.Failure` \-
when stream failed or `QueueOfferResult.QueueClosed` when downstream is completed.

The strategy [akka.stream.OverflowStrategy.backpressure](../OverflowStrategy$.html#backpressure:akka.stream.OverflowStrategy) will not complete `maxConcurrentOffers` number of
`offer():CompletionStage` call when buffer is full.

Instead of using the strategy [akka.stream.OverflowStrategy.dropNew](../OverflowStrategy$.html#dropNew:akka.stream.OverflowStrategy) it's recommended to use
`Source.queue(bufferSize)` instead which returns a [QueueOfferResult](../QueueOfferResult.html) synchronously.

You can watch accessibility of stream with [akka.stream.javadsl.SourceQueueWithComplete.watchCompletion](SourceQueueWithComplete.html#watchCompletion():java.util.concurrent.CompletionStage[akka.Done]).
It returns a future that completes with success when this operator is completed or fails when stream is failed.

The buffer can be disabled by using `bufferSize` of 0 and then received message will wait
for downstream demand unless there is another message waiting for downstream demand, in that case
offer result will be completed according to the overflow strategy.

The materialized SourceQueue may be used by up to maxConcurrentOffers concurrent producers.

bufferSizesize of buffer in element count

overflowStrategyStrategy that is used when incoming elements cannot fit inside the buffer

maxConcurrentOffersmaximum number of pending offers when buffer is full, should be greater than 0, not
 applicable when `OverflowStrategy.dropNew` is used
41. [**](../../../akka/stream/javadsl/Source$.html#queue[T](bufferSize:Int,overflowStrategy:akka.stream.OverflowStrategy):akka.stream.javadsl.Source[T,akka.stream.javadsl.SourceQueueWithComplete[T]] "Permalink")  def queue\[T](bufferSize: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), overflowStrategy: [OverflowStrategy](../OverflowStrategy.html)): [Source](Source.html)\[T, [SourceQueueWithComplete](SourceQueueWithComplete.html)\[T]]Creates a `Source` that is materialized as an [akka.stream.javadsl.SourceQueueWithComplete](SourceQueueWithComplete.html).

Creates a `Source` that is materialized as an [akka.stream.javadsl.SourceQueueWithComplete](SourceQueueWithComplete.html).
You can push elements to the queue and they will be emitted to the stream if there is demand from downstream,
otherwise they will be buffered until request for demand is received. Elements in the buffer will be discarded
if downstream is terminated.

Depending on the defined [akka.stream.OverflowStrategy](../OverflowStrategy.html) it might drop elements if
there is no space available in the buffer.

Acknowledgement mechanism is available.
[akka.stream.javadsl.SourceQueueWithComplete.offer](SourceQueueWithComplete.html#offer(elem:T):java.util.concurrent.CompletionStage[akka.stream.QueueOfferResult]) returns `CompletionStage<QueueOfferResult>` which completes with
`QueueOfferResult.enqueued()` if element was added to buffer or sent downstream. It completes with
`QueueOfferResult.dropped()` if element was dropped. Can also complete with `QueueOfferResult.Failure` \-
when stream failed or `QueueOfferResult.QueueClosed` when downstream is completed.

The strategy [akka.stream.OverflowStrategy.backpressure](../OverflowStrategy$.html#backpressure:akka.stream.OverflowStrategy) will not complete last `offer():CompletionStage`
call when buffer is full.

Instead of using the strategy [akka.stream.OverflowStrategy.dropNew](../OverflowStrategy$.html#dropNew:akka.stream.OverflowStrategy) it's recommended to use
`Source.queue(bufferSize)` instead which returns a [QueueOfferResult](../QueueOfferResult.html) synchronously.

You can watch accessibility of stream with [akka.stream.javadsl.SourceQueueWithComplete.watchCompletion](SourceQueueWithComplete.html#watchCompletion():java.util.concurrent.CompletionStage[akka.Done]).
It returns a future that completes with success when this operator is completed or fails when stream is failed.

The buffer can be disabled by using `bufferSize` of 0 and then received message will wait
for downstream demand unless there is another message waiting for downstream demand, in that case
offer result will be completed according to the overflow strategy.

The materialized SourceQueue may only be used from a single producer.

bufferSizesize of buffer in element count

overflowStrategyStrategy that is used when incoming elements cannot fit inside the buffer
42. [**](../../../akka/stream/javadsl/Source$.html#queue[T](bufferSize:Int):akka.stream.javadsl.Source[T,akka.stream.BoundedSourceQueue[T]] "Permalink")  def queue\[T](bufferSize: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Source](Source.html)\[T, [BoundedSourceQueue](../BoundedSourceQueue.html)\[T]]Creates a `Source` that is materialized as an [akka.stream.BoundedSourceQueue](../BoundedSourceQueue.html).

Creates a `Source` that is materialized as an [akka.stream.BoundedSourceQueue](../BoundedSourceQueue.html).
You can push elements to the queue and they will be emitted to the stream if there is demand from downstream,
otherwise they will be buffered until request for demand is received. The buffer size is passed in as a parameter.
Elements in the buffer will be discarded if downstream is terminated.

Pushed elements may be dropped if there is no space available in the buffer. Elements will also be dropped if the
queue is failed through the materialized `BoundedQueueSource` or the `Source` is cancelled by the downstream.
An element that was reported to be `enqueued` is not guaranteed to be processed by the rest of the stream. If the
queue is failed by calling `BoundedQueueSource.fail` or the downstream cancels the stream, elements in the buffer
are discarded.

Acknowledgement of pushed elements is immediate.
[akka.stream.BoundedSourceQueue.offer](../BoundedSourceQueue.html#offer(elem:T):akka.stream.QueueOfferResult) returns [akka.stream.QueueOfferResult](../QueueOfferResult.html) which is implemented as:

`QueueOfferResult.enqueued()` element was added to buffer, but may still be discarded later when the queue is
 failed or cancelled
`QueueOfferResult.dropped()` element was dropped
`QueueOfferResult.QueueClosed` the queue was completed with [akka.stream.BoundedSourceQueue.complete](../BoundedSourceQueue.html#complete():Unit)
`QueueOfferResult.Failure` the queue was failed with [akka.stream.BoundedSourceQueue.fail](../BoundedSourceQueue.html#fail(ex:Throwable):Unit) or if the
 stream failed

bufferSizesize of the buffer in number of elements
43. [**](../../../akka/stream/javadsl/Source$.html#range(start:Int,end:Int,step:Int):akka.stream.javadsl.Source[Integer,akka.NotUsed] "Permalink")  def range(start: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), end: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), step: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Source](Source.html)\[[Integer](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Integer.html#java.lang.Integer), [NotUsed](../../NotUsed.html)]Creates [Source](Source.html) that represents integer values in range *\[start;end]*, with the given step.

Creates [Source](Source.html) that represents integer values in range *\[start;end]*, with the given step.
It allows to create `Source` out of range as simply as on Scala `Source(1 to N)`

Uses Int, Int) internally

See alsoInt, Int)
44. [**](../../../akka/stream/javadsl/Source$.html#range(start:Int,end:Int):akka.stream.javadsl.Source[Integer,akka.NotUsed] "Permalink")  def range(start: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), end: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Source](Source.html)\[[Integer](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Integer.html#java.lang.Integer), [NotUsed](../../NotUsed.html)]Creates [Source](Source.html) that represents integer values in range *\[start;end]*, step equals to 1\.

Creates [Source](Source.html) that represents integer values in range *\[start;end]*, step equals to 1\.
It allows to create `Source` out of range as simply as on Scala `Source(1 to N)`

Uses Int) internally

See alsoInt)
45. [**](../../../akka/stream/javadsl/Source$.html#repeat[T](element:T):akka.stream.javadsl.Source[T,akka.NotUsed] "Permalink")  def repeat\[T](element: T): [Source](Source.html)\[T, [NotUsed](../../NotUsed.html)]Create a `Source` that will continually emit the given element.
46. [**](../../../akka/stream/javadsl/Source$.html#single[T](element:T):akka.stream.javadsl.Source[T,akka.NotUsed] "Permalink")  def single\[T](element: T): [Source](Source.html)\[T, [NotUsed](../../NotUsed.html)]Create a `Source` with one element.

Create a `Source` with one element.
Every connected `Sink` of this stream will see an individual stream consisting of one element.
47. [**](../../../akka/stream/javadsl/Source$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
48. [**](../../../akka/stream/javadsl/Source$.html#tick[O](initialDelay:java.time.Duration,interval:java.time.Duration,tick:O):akka.stream.javadsl.Source[O,akka.actor.Cancellable] "Permalink")  def tick\[O](initialDelay: [Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration), interval: [Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration), tick: O): [Source](Source.html)\[O, [Cancellable](../../actor/Cancellable.html)]Elements are emitted periodically with the specified interval.

Elements are emitted periodically with the specified interval.
The tick element will be delivered to downstream consumers that has requested any elements.
If a consumer has not requested any elements at the point in time when the tick
element is produced it will not receive that tick element later. It will
receive new tick elements as soon as it has requested more elements.
49. [**](../../../akka/stream/javadsl/Source$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
50. [**](../../../akka/stream/javadsl/Source$.html#unfold[S,E](s:S,f:akka.japi.function.Function[S,java.util.Optional[akka.japi.Pair[S,E]]]):akka.stream.javadsl.Source[E,akka.NotUsed] "Permalink")  def unfold\[S, E](s: S, f: [Function](../../japi/function/Function.html)\[S, [Optional](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Optional.html#java.util.Optional)\[[Pair](../../japi/Pair.html)\[S, E]]]): [Source](Source.html)\[E, [NotUsed](../../NotUsed.html)]Create a `Source` that will unfold a value of type `S` into
a pair of the next state `S` and output elements of type `E`.
51. [**](../../../akka/stream/javadsl/Source$.html#unfoldAsync[S,E](s:S,f:akka.japi.function.Function[S,java.util.concurrent.CompletionStage[java.util.Optional[akka.japi.Pair[S,E]]]]):akka.stream.javadsl.Source[E,akka.NotUsed] "Permalink")  def unfoldAsync\[S, E](s: S, f: [Function](../../japi/function/Function.html)\[S, [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[[Optional](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Optional.html#java.util.Optional)\[[Pair](../../japi/Pair.html)\[S, E]]]]): [Source](Source.html)\[E, [NotUsed](../../NotUsed.html)]Same as [unfold](#unfold[S,E](s:S,f:akka.japi.function.Function[S,java.util.Optional[akka.japi.Pair[S,E]]]):akka.stream.javadsl.Source[E,akka.NotUsed]), but uses an async function to generate the next state\-element tuple.
52. [**](../../../akka/stream/javadsl/Source$.html#unfoldResource[T,S](create:akka.japi.function.Creator[S],read:akka.japi.function.Function[S,java.util.Optional[T]],close:akka.japi.function.Procedure[S]):akka.stream.javadsl.Source[T,akka.NotUsed] "Permalink")  def unfoldResource\[T, S](create: [Creator](../../japi/function/Creator.html)\[S], read: [Function](../../japi/function/Function.html)\[S, [Optional](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Optional.html#java.util.Optional)\[T]], close: [Procedure](../../japi/function/Procedure.html)\[S]): [Source](Source.html)\[T, [NotUsed](../../NotUsed.html)]Start a new `Source` from some resource which can be opened, read and closed.

Start a new `Source` from some resource which can be opened, read and closed.
Interaction with resource happens in a blocking way.

Example:

```
Source.unfoldResource(
  () -> new BufferedReader(new FileReader("...")),
  reader -> reader.readLine(),
  reader -> reader.close())
```
You can use the supervision strategy to handle exceptions for `read` function. All exceptions thrown by `create`
or `close` will fail the stream.

`Restart` supervision strategy will close and create blocking IO again. Default strategy is `Stop` which means
that stream will be terminated on error in `read` function by default.

You can configure the default dispatcher for this Source by changing the `akka.stream.materializer.blocking-io-dispatcher` or
set it for a given Source by using [ActorAttributes](../ActorAttributes$.html).

Adheres to the [ActorAttributes.SupervisionStrategy](../ActorAttributes$$SupervisionStrategy.html) attribute.

create\- function that is called on stream start and creates/opens resource.

read\- function that reads data from opened resource. It is called each time backpressure signal
 is received. Stream calls close and completes when `read` returns an empty Optional.

close\- function that closes resource
53. [**](../../../akka/stream/javadsl/Source$.html#unfoldResourceAsync[T,S](create:akka.japi.function.Creator[java.util.concurrent.CompletionStage[S]],read:akka.japi.function.Function[S,java.util.concurrent.CompletionStage[java.util.Optional[T]]],close:akka.japi.function.Function[S,java.util.concurrent.CompletionStage[akka.Done]]):akka.stream.javadsl.Source[T,akka.NotUsed] "Permalink")  def unfoldResourceAsync\[T, S](create: [Creator](../../japi/function/Creator.html)\[[CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[S]], read: [Function](../../japi/function/Function.html)\[S, [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[[Optional](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Optional.html#java.util.Optional)\[T]]], close: [Function](../../japi/function/Function.html)\[S, [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[[Done](../../Done.html)]]): [Source](Source.html)\[T, [NotUsed](../../NotUsed.html)]Start a new `Source` from some resource which can be opened, read and closed.

Start a new `Source` from some resource which can be opened, read and closed.
It's similar to `unfoldResource` but takes functions that return `CompletionStage` instead of plain values.

You can use the supervision strategy to handle exceptions for `read` function or failures of produced `Futures`.
All exceptions thrown by `create` or `close` as well as fails of returned futures will fail the stream.

`Restart` supervision strategy will close and create resource. Default strategy is `Stop` which means
that stream will be terminated on error in `read` function (or future) by default.

You can configure the default dispatcher for this Source by changing the `akka.stream.materializer.blocking-io-dispatcher` or
set it for a given Source by using [ActorAttributes](../ActorAttributes$.html).

Adheres to the [ActorAttributes.SupervisionStrategy](../ActorAttributes$$SupervisionStrategy.html) attribute.

create\- function that is called on stream start and creates/opens resource.

read\- function that reads data from opened resource. It is called each time backpressure signal
 is received. Stream calls close and completes when `CompletionStage` from read function returns an empty Optional.

close\- function that closes resource
54. [**](../../../akka/stream/javadsl/Source$.html#upcast[SuperOut,Out<:SuperOut,Mat](source:akka.stream.javadsl.Source[Out,Mat]):akka.stream.javadsl.Source[SuperOut,Mat] "Permalink")  def upcast\[SuperOut, Out \<: SuperOut, Mat](source: [Source](Source.html)\[Out, Mat]): [Source](Source.html)\[SuperOut, Mat]Upcast a stream of elements to a stream of supertypes of that element.

Upcast a stream of elements to a stream of supertypes of that element. Useful in combination with
fan\-in operators where you do not want to pay the cost of casting each element in a `map`.

Example:

```
Source<Apple, NotUsed> apples = Source.single(new Apple());
Source<Orange, NotUsed> oranges = Source.single(new Orange());
Source<Fruit, NotUsed> appleFruits = Source.upcast(apples);
Source<Fruit, NotUsed> orangeFruits = Source.upcast(oranges);

Source<Fruit, NotUsed> fruits = appleFruits.merge(orangeFruits);
```
SuperOuta supertype to the type of elements in stream

returnsA source with the supertype as elements
55. [**](../../../akka/stream/javadsl/Source$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
56. [**](../../../akka/stream/javadsl/Source$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
57. [**](../../../akka/stream/javadsl/Source$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
58. [**](../../../akka/stream/javadsl/Source$.html#zipN[T](sources:java.util.List[akka.stream.javadsl.Source[T,_]]):akka.stream.javadsl.Source[java.util.List[T],akka.NotUsed] "Permalink")  def zipN\[T](sources: [List](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/List.html#java.util.List)\[[Source](Source.html)\[T, \_]]): [Source](Source.html)\[[List](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/List.html#java.util.List)\[T], [NotUsed](../../NotUsed.html)]Combine the elements of multiple streams into a stream of lists.
59. [**](../../../akka/stream/javadsl/Source$.html#zipWithN[T,O](zipper:akka.japi.function.Function[java.util.List[T],O],sources:java.util.List[akka.stream.javadsl.Source[T,_]]):akka.stream.javadsl.Source[O,akka.NotUsed] "Permalink")  def zipWithN\[T, O](zipper: [Function](../../japi/function/Function.html)\[[List](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/List.html#java.util.List)\[T], O], sources: [List](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/List.html#java.util.List)\[[Source](Source.html)\[T, \_]]): [Source](Source.html)\[O, [NotUsed](../../NotUsed.html)]
### Deprecated Value Members

1. [**](../../../akka/stream/javadsl/Source$.html#actorRef[T](bufferSize:Int,overflowStrategy:akka.stream.OverflowStrategy):akka.stream.javadsl.Source[T,akka.actor.ActorRef] "Permalink")  def actorRef\[T](bufferSize: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), overflowStrategy: [OverflowStrategy](../OverflowStrategy.html)): [Source](Source.html)\[T, [ActorRef](../../actor/ActorRef.html)]Creates a `Source` that is materialized as an [akka.actor.ActorRef](../../actor/ActorRef.html).

Creates a `Source` that is materialized as an [akka.actor.ActorRef](../../actor/ActorRef.html).
Messages sent to this actor will be emitted to the stream if there is demand from downstream,
otherwise they will be buffered until request for demand is received.

Depending on the defined [akka.stream.OverflowStrategy](../OverflowStrategy.html) it might drop elements if
there is no space available in the buffer.

The strategy [akka.stream.OverflowStrategy.backpressure](../OverflowStrategy$.html#backpressure:akka.stream.OverflowStrategy) is not supported, and an
IllegalArgument("Backpressure overflowStrategy not supported") will be thrown if it is passed as argument.

The buffer can be disabled by using `bufferSize` of 0 and then received messages are dropped if there is no demand
from downstream. When `bufferSize` is 0 the `overflowStrategy` does not matter.

The stream can be completed successfully by sending the actor reference a [akka.actor.Status.Success](../../actor/Status$$Success.html)
(whose content will be ignored) in which case already buffered elements will be signaled before signaling
completion.

The stream can be completed successfully by sending the actor reference a [akka.actor.Status.Success](../../actor/Status$$Success.html).
If the content is [akka.stream.CompletionStrategy.immediately](../CompletionStrategy$.html#immediately:akka.stream.CompletionStrategy) the completion will be signaled immediately,
otherwise if the content is [akka.stream.CompletionStrategy.draining](../CompletionStrategy$.html#draining:akka.stream.CompletionStrategy) (or anything else)
already buffered elements will be signaled before signaling completion.
Sending [akka.actor.PoisonPill](../../actor/PoisonPill.html) will signal completion immediately but this behavior is deprecated and scheduled to be removed.

The stream can be completed with failure by sending a [akka.actor.Status.Failure](../../actor/Status$$Failure.html) to the
actor reference. In case the Actor is still draining its internal buffer (after having received
a [akka.actor.Status.Success](../../actor/Status$$Success.html)) before signaling completion and it receives a [akka.actor.Status.Failure](../../actor/Status$$Failure.html),
the failure will be signaled downstream immediately (instead of the completion signal).

Note that terminating the actor without first completing it, either with a success or a
failure, will prevent the actor triggering downstream completion and the stream will continue
to run even though the source actor is dead. Therefore you should \*\*not\*\* attempt to
manually terminate the actor such as with a [akka.actor.PoisonPill](../../actor/PoisonPill.html).

The actor will be stopped when the stream is completed, failed or canceled from downstream,
i.e. you can watch it to get notified when that happens.

See also [akka.stream.javadsl.Source.queue](#queue[T](bufferSize:Int,overflowStrategy:akka.stream.OverflowStrategy,maxConcurrentOffers:Int):akka.stream.javadsl.Source[T,akka.stream.javadsl.SourceQueueWithComplete[T]]).

bufferSizeThe size of the buffer in element count

overflowStrategyStrategy that is used when incoming elements cannot fit inside the buffer

Annotations@Deprecated @deprecated Deprecated*(Since version 2\.6\.0\)* Use variant accepting completion and failure matchers
2. [**](../../../akka/stream/javadsl/Source$.html#actorRefWithAck[T](ackMessage:Any):akka.stream.javadsl.Source[T,akka.actor.ActorRef] "Permalink")  def actorRefWithAck\[T](ackMessage: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Source](Source.html)\[T, [ActorRef](../../actor/ActorRef.html)]Creates a `Source` that is materialized as an [akka.actor.ActorRef](../../actor/ActorRef.html).

Creates a `Source` that is materialized as an [akka.actor.ActorRef](../../actor/ActorRef.html).
Messages sent to this actor will be emitted to the stream if there is demand from downstream,
and a new message will only be accepted after the previous messages has been consumed and acknowledged back.
The stream will complete with failure if a message is sent before the acknowledgement has been replied back.

The stream can be completed successfully by sending the actor reference a [akka.actor.Status.Success](../../actor/Status$$Success.html).
If the content is [akka.stream.CompletionStrategy.immediately](../CompletionStrategy$.html#immediately:akka.stream.CompletionStrategy) the completion will be signaled immediately,
otherwise if the content is [akka.stream.CompletionStrategy.draining](../CompletionStrategy$.html#draining:akka.stream.CompletionStrategy) (or anything else)
already buffered element will be signaled before signaling completion.

The stream can be completed with failure by sending a [akka.actor.Status.Failure](../../actor/Status$$Failure.html) to the
actor reference. In case the Actor is still draining its internal buffer (after having received
a [akka.actor.Status.Success](../../actor/Status$$Success.html)) before signaling completion and it receives a [akka.actor.Status.Failure](../../actor/Status$$Failure.html),
the failure will be signaled downstream immediately (instead of the completion signal).

The actor will be stopped when the stream is completed, failed or canceled from downstream,
i.e. you can watch it to get notified when that happens.

Annotations@Deprecated @deprecated Deprecated*(Since version 2\.6\.0\)* Use actorRefWithBackpressure accepting completion and failure matchers
3. [**](../../../akka/stream/javadsl/Source$.html#actorRefWithAck[T](ackMessage:Any,completionMatcher:akka.japi.function.Function[Any,java.util.Optional[akka.stream.CompletionStrategy]],failureMatcher:akka.japi.function.Function[Any,java.util.Optional[Throwable]]):akka.stream.javadsl.Source[T,akka.actor.ActorRef] "Permalink")  def actorRefWithAck\[T](ackMessage: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), completionMatcher: [Function](../../japi/function/Function.html)\[[Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), [Optional](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Optional.html#java.util.Optional)\[[CompletionStrategy](../CompletionStrategy.html)]], failureMatcher: [Function](../../japi/function/Function.html)\[[Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), [Optional](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Optional.html#java.util.Optional)\[Throwable]]): [Source](Source.html)\[T, [ActorRef](../../actor/ActorRef.html)]Creates a `Source` that is materialized as an [akka.actor.ActorRef](../../actor/ActorRef.html).

Creates a `Source` that is materialized as an [akka.actor.ActorRef](../../actor/ActorRef.html).
Messages sent to this actor will be emitted to the stream if there is demand from downstream,
and a new message will only be accepted after the previous messages has been consumed and acknowledged back.
The stream will complete with failure if a message is sent before the acknowledgement has been replied back.

The stream can be completed with failure by sending a message that is matched by `failureMatcher`. The extracted
Throwable will be used to fail the stream. In case the Actor is still draining its internal buffer (after having received
a message matched by `completionMatcher`) before signaling completion and it receives a message matched by `failureMatcher`,
the failure will be signaled downstream immediately (instead of the completion signal).

The actor will be stopped when the stream is completed, failed or canceled from downstream,
i.e. you can watch it to get notified when that happens.

Annotations@Deprecated @deprecated Deprecated*(Since version 2\.6\.0\)* Use actorRefWithBackpressure instead
4. [**](../../../akka/stream/javadsl/Source$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
5. [**](../../../akka/stream/javadsl/Source$.html#fromCompletionStage[O](future:java.util.concurrent.CompletionStage[O]):akka.stream.javadsl.Source[O,akka.NotUsed] "Permalink")  def fromCompletionStage\[O](future: [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[O]): [Source](Source.html)\[O, [NotUsed](../../NotUsed.html)]Starts a new `Source` from the given `CompletionStage`.

Starts a new `Source` from the given `CompletionStage`. The stream will consist of
one element when the `CompletionStage` is completed with a successful value, which
may happen before or after materializing the `Flow`.
The stream terminates with a failure if the `CompletionStage` is completed with a failure.

Annotations@deprecated Deprecated*(Since version 2\.6\.0\)* Use 'Source.completionStage' instead
6. [**](../../../akka/stream/javadsl/Source$.html#fromFuture[O](future:scala.concurrent.Future[O]):akka.stream.javadsl.Source[O,akka.NotUsed] "Permalink")  def fromFuture\[O](future: [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[O]): [Source](Source.html)\[O, [NotUsed](../../NotUsed.html)]Start a new `Source` from the given `Future`.

Start a new `Source` from the given `Future`. The stream will consist of
one element when the `Future` is completed with a successful value, which
may happen before or after materializing the `Flow`.
The stream terminates with a failure if the `Future` is completed with a failure.

Annotations@deprecated Deprecated*(Since version 2\.6\.0\)* Use 'Source.future' instead
7. [**](../../../akka/stream/javadsl/Source$.html#fromFutureSource[T,M](future:scala.concurrent.Future[_<:akka.stream.Graph[akka.stream.SourceShape[T],M]]):akka.stream.javadsl.Source[T,scala.concurrent.Future[M]] "Permalink")  def fromFutureSource\[T, M](future: [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[\_ \<: [Graph](../Graph.html)\[[SourceShape](../SourceShape.html)\[T], M]]): [Source](Source.html)\[T, [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[M]]Streams the elements of the given future source once it successfully completes.

Streams the elements of the given future source once it successfully completes.
If the Future fails the stream is failed with the exception from the future. If downstream cancels before the
stream completes the materialized Future will be failed with a [StreamDetachedException](../StreamDetachedException.html).

Annotations@deprecated Deprecated*(Since version 2\.6\.0\)* Use 'Source.futureSource' (potentially together with `Source.fromGraph`) instead
8. [**](../../../akka/stream/javadsl/Source$.html#fromSourceCompletionStage[T,M](completion:java.util.concurrent.CompletionStage[_<:akka.stream.Graph[akka.stream.SourceShape[T],M]]):akka.stream.javadsl.Source[T,java.util.concurrent.CompletionStage[M]] "Permalink")  def fromSourceCompletionStage\[T, M](completion: [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[\_ \<: [Graph](../Graph.html)\[[SourceShape](../SourceShape.html)\[T], M]]): [Source](Source.html)\[T, [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[M]]Streams the elements of an asynchronous source once its given CompletionStage completes.

Streams the elements of an asynchronous source once its given CompletionStage completes.
If the CompletionStage fails the stream is failed with the exception from the future.
If downstream cancels before the stream completes the materialized CompletionStage will be failed
with a [StreamDetachedException](../StreamDetachedException.html)

Annotations@deprecated Deprecated*(Since version 2\.6\.0\)* Use 'Source.completionStageSource' (potentially together with `Source.fromGraph`) instead
9. [**](../../../akka/stream/javadsl/Source$.html#lazily[T,M](create:akka.japi.function.Creator[akka.stream.javadsl.Source[T,M]]):akka.stream.javadsl.Source[T,java.util.concurrent.CompletionStage[M]] "Permalink")  def lazily\[T, M](create: [Creator](../../japi/function/Creator.html)\[[Source](Source.html)\[T, M]]): [Source](Source.html)\[T, [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[M]]Creates a `Source` that is not materialized until there is downstream demand, when the source gets materialized
the materialized future is completed with its value, if downstream cancels or fails without any demand the
`create` factory is never called and the materialized `CompletionStage` is failed.

Creates a `Source` that is not materialized until there is downstream demand, when the source gets materialized
the materialized future is completed with its value, if downstream cancels or fails without any demand the
`create` factory is never called and the materialized `CompletionStage` is failed.

Annotations@deprecated Deprecated*(Since version 2\.6\.0\)* Use 'Source.lazySource' instead
10. [**](../../../akka/stream/javadsl/Source$.html#lazilyAsync[T](create:akka.japi.function.Creator[java.util.concurrent.CompletionStage[T]]):akka.stream.javadsl.Source[T,scala.concurrent.Future[akka.NotUsed]] "Permalink")  def lazilyAsync\[T](create: [Creator](../../japi/function/Creator.html)\[[CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[T]]): [Source](Source.html)\[T, [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[NotUsed](../../NotUsed.html)]]Creates a `Source` from supplied future factory that is not called until downstream demand.

Creates a `Source` from supplied future factory that is not called until downstream demand. When source gets
materialized the materialized future is completed with the value from the factory. If downstream cancels or fails
without any demand the create factory is never called and the materialized `Future` is failed.

Annotations@deprecated Deprecated*(Since version 2\.6\.0\)* Use 'Source.lazyCompletionStage' instead

See also[Source.lazily](#lazily[T,M](create:akka.japi.function.Creator[akka.stream.javadsl.Source[T,M]]):akka.stream.javadsl.Source[T,java.util.concurrent.CompletionStage[M]])
11. [**](../../../akka/stream/javadsl/Source$.html#setup[T,M](factory:java.util.function.BiFunction[akka.stream.ActorMaterializer,akka.stream.Attributes,akka.stream.javadsl.Source[T,M]]):akka.stream.javadsl.Source[T,java.util.concurrent.CompletionStage[M]] "Permalink")  def setup\[T, M](factory: [BiFunction](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/BiFunction.html#java.util.function.BiFunction)\[[ActorMaterializer](../ActorMaterializer.html), [Attributes](../Attributes.html), [Source](Source.html)\[T, M]]): [Source](Source.html)\[T, [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[M]]Defers the creation of a [Source](Source.html) until materialization.

Defers the creation of a [Source](Source.html) until materialization. The `factory` function
exposes [ActorMaterializer](../ActorMaterializer.html) which is going to be used during materialization and
[Attributes](../Attributes.html) of the [Source](Source.html) returned by this method.

Annotations@deprecated Deprecated*(Since version 2\.6\.0\)* Use 'fromMaterializer' instead
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10/akka/Done.html
- https://doc.akka.io/api/akka-core/2.10/akka/NotUsed.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/ActorRef.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/Cancellable.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/PoisonPill.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/Status$$Failure.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/Status$$Success.html
- https://doc.akka.io/api/akka-core/2.10/akka/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/japi/Pair.html
- https://doc.akka.io/api/akka-core/2.10/akka/japi/function/Creator.html
- https://doc.akka.io/api/akka-core/2.10/akka/japi/function/Function.html
- https://doc.akka.io/api/akka-core/2.10/akka/japi/function/Function2.html
- https://doc.akka.io/api/akka-core/2.10/akka/japi/function/Procedure.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/ActorAttributes$$SupervisionStrategy.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/ActorAttributes$.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/ActorMaterializer.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/Attributes.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/BoundedSourceQueue.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/CompletionStrategy$.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/CompletionStrategy.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/Graph.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/Materializer.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/NeverMaterializedException.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/OverflowStrategy$.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/OverflowStrategy.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/QueueOfferResult.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/SourceShape.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/StreamDetachedException.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/UniformFanInShape.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/javadsl/AsPublisher.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/javadsl/Balance$.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/javadsl/BidiFlow$.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/javadsl/BidiFlow.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/javadsl/Broadcast$.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/javadsl/BroadcastHub$.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/javadsl/Compression$.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/javadsl/Concat$.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/javadsl/DelayStrategy$.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/javadsl/DelayStrategy.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/javadsl/FileIO$.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/javadsl/Flow$.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/javadsl/Flow.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/javadsl/FlowWithContext$.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/javadsl/FlowWithContext.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/javadsl/Framing$.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/javadsl/FramingTruncation.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/javadsl/GraphDSL$.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/javadsl/JavaFlowSupport.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/javadsl/JsonFraming$.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10/akka/stream/javadsl/Source$.html](https://doc.akka.io/api/akka-core/2.10/akka/stream/javadsl/Source$.html)*