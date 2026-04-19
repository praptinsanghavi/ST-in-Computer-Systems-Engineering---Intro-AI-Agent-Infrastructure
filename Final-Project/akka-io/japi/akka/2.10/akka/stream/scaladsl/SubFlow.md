---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T03:03:49Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/2.10/akka/stream/scaladsl/SubFlow.html
title: SubFlow
---

# SubFlow

## Content

Package [akka.stream.scaladsl](package-summary.html)
## Interface SubFlow\<Out,​Mat,​F,​C\>

- All Superinterfaces:
`[FlowOps](FlowOps.html "interface in akka.stream.scaladsl")<Out,​Mat>`

---

```
public interface SubFlow<Out,​Mat,​F,​C>
extends [FlowOps](FlowOps.html "interface in akka.stream.scaladsl")<Out,​Mat>
```

A \&ldquo;stream of streams\&rdquo; sub\-flow of data elements, e.g. produced by `groupBy`.
 SubFlows cannot contribute to the super\-flow\&rsquo;s materialized value since they
 are materialized later, during the runtime of the flow graph processing.
 
 Not for user extension

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `[F](SubFlow.html "type parameter in SubFlow")` | `[concatSubstreams](#concatSubstreams())()` | Flatten the sub\-flows back into the super\-flow by concatenating them. |
	| `[F](SubFlow.html "type parameter in SubFlow")` | `[mergeSubstreams](#mergeSubstreams())()` | Flatten the sub\-flows back into the super\-flow by performing a merge  without parallelism limit (i.e. |
	| `[F](SubFlow.html "type parameter in SubFlow")` | `[mergeSubstreamsWithParallelism](#mergeSubstreamsWithParallelism(int))​(int parallelism)` | Flatten the sub\-flows back into the super\-flow by performing a merge  with the given parallelism limit. |
	| `<M> [C](SubFlow.html "type parameter in SubFlow")` | `[to](#to(akka.stream.Graph))​([Graph](../Graph.html "interface in akka.stream")<[SinkShape](../SinkShape.html "class in akka.stream")<[Out](SubFlow.html "type parameter in SubFlow")>,​M> sink)` | Attach a [`Sink`](Sink.html "class in akka.stream.scaladsl") to each sub\-flow, closing the overall Graph that is being  constructed. |
	
	
		- ### Methods inherited from interface akka.stream.scaladsl.[FlowOps](FlowOps.html "interface in akka.stream.scaladsl")
		
		
		`[$plus$plus](FlowOps.html#$plus$plus(akka.stream.Graph)), [addAttributes](FlowOps.html#addAttributes(akka.stream.Attributes)), [aggregateWithBoundary](FlowOps.html#aggregateWithBoundary(scala.Function0,scala.Function2,scala.Function1,scala.Option)), [alsoTo](FlowOps.html#alsoTo(akka.stream.Graph)), [alsoToAll](FlowOps.html#alsoToAll(scala.collection.immutable.Seq)), [alsoToGraph](FlowOps.html#alsoToGraph(akka.stream.Graph)), [ask](FlowOps.html#ask(int,akka.actor.ActorRef,akka.util.Timeout,scala.reflect.ClassTag)), [ask](FlowOps.html#ask(akka.actor.ActorRef,akka.util.Timeout,scala.reflect.ClassTag)), [async](FlowOps.html#async()), [backpressureTimeout](FlowOps.html#backpressureTimeout(scala.concurrent.duration.FiniteDuration)), [batch](FlowOps.html#batch(long,scala.Function1,scala.Function2)), [batchWeighted](FlowOps.html#batchWeighted(long,scala.Function1,scala.Function1,scala.Function2)), [buffer](FlowOps.html#buffer(int,akka.stream.OverflowStrategy)), [collect](FlowOps.html#collect(scala.PartialFunction)), [collectType](FlowOps.html#collectType(scala.reflect.ClassTag)), [completionTimeout](FlowOps.html#completionTimeout(scala.concurrent.duration.FiniteDuration)), [concat](FlowOps.html#concat(akka.stream.Graph)), [concatAllLazy](FlowOps.html#concatAllLazy(scala.collection.immutable.Seq)), [concatGraph](FlowOps.html#concatGraph(akka.stream.Graph,boolean)), [concatLazy](FlowOps.html#concatLazy(akka.stream.Graph)), [conflate](FlowOps.html#conflate(scala.Function2)), [conflateWithSeed](FlowOps.html#conflateWithSeed(scala.Function1,scala.Function2)), [delay](FlowOps.html#delay(scala.concurrent.duration.FiniteDuration,akka.stream.DelayOverflowStrategy)), [delay$default$2](FlowOps.html#delay$default$2()), [delayWith](FlowOps.html#delayWith(scala.Function0,akka.stream.DelayOverflowStrategy)), [detach](FlowOps.html#detach()), [divertTo](FlowOps.html#divertTo(akka.stream.Graph,scala.Function1)), [divertToGraph](FlowOps.html#divertToGraph(akka.stream.Graph,scala.Function1)), [drop](FlowOps.html#drop(long)), [dropWhile](FlowOps.html#dropWhile(scala.Function1)), [dropWithin](FlowOps.html#dropWithin(scala.concurrent.duration.FiniteDuration)), [expand](FlowOps.html#expand(scala.Function1)), [extrapolate](FlowOps.html#extrapolate(scala.Function1,scala.Option)), [extrapolate$default$2](FlowOps.html#extrapolate$default$2()), [filter](FlowOps.html#filter(scala.Function1)), [filterNot](FlowOps.html#filterNot(scala.Function1)), [flatMapConcat](FlowOps.html#flatMapConcat(scala.Function1)), [flatMapMerge](FlowOps.html#flatMapMerge(int,scala.Function1)), [flatMapPrefix](FlowOps.html#flatMapPrefix(int,scala.Function1)), [fold](FlowOps.html#fold(T,scala.Function2)), [foldAsync](FlowOps.html#foldAsync(T,scala.Function2)), [groupBy](FlowOps.html#groupBy(int,scala.Function1)), [groupBy](FlowOps.html#groupBy(int,scala.Function1,boolean)), [grouped](FlowOps.html#grouped(int)), [groupedWeighted](FlowOps.html#groupedWeighted(long,scala.Function1)), [groupedWeightedWithin](FlowOps.html#groupedWeightedWithin(long,int,scala.concurrent.duration.FiniteDuration,scala.Function1)), [groupedWeightedWithin](FlowOps.html#groupedWeightedWithin(long,scala.concurrent.duration.FiniteDuration,scala.Function1)), [groupedWithin](FlowOps.html#groupedWithin(int,scala.concurrent.duration.FiniteDuration)), [idleTimeout](FlowOps.html#idleTimeout(scala.concurrent.duration.FiniteDuration)), [initialDelay](FlowOps.html#initialDelay(scala.concurrent.duration.FiniteDuration)), [initialTimeout](FlowOps.html#initialTimeout(scala.concurrent.duration.FiniteDuration)), [interleave](FlowOps.html#interleave(akka.stream.Graph,int)), [interleave](FlowOps.html#interleave(akka.stream.Graph,int,boolean)), [interleaveAll](FlowOps.html#interleaveAll(scala.collection.immutable.Seq,int,boolean)), [interleaveGraph](FlowOps.html#interleaveGraph(akka.stream.Graph,int,boolean)), [interleaveGraph$default$3](FlowOps.html#interleaveGraph$default$3()), [internalConcat](FlowOps.html#internalConcat(akka.stream.Graph,boolean)), [internalConcatAll](FlowOps.html#internalConcatAll(akka.stream.Graph%5B%5D,boolean)), [intersperse](FlowOps.html#intersperse(T)), [intersperse](FlowOps.html#intersperse(T,T,T)), [keepAlive](FlowOps.html#keepAlive(scala.concurrent.duration.FiniteDuration,scala.Function0)), [limit](FlowOps.html#limit(long)), [limitWeighted](FlowOps.html#limitWeighted(long,scala.Function1)), [log](FlowOps.html#log(java.lang.String,scala.Function1,akka.event.LoggingAdapter)), [log$default$2](FlowOps.html#log$default$2()), [log$default$3](FlowOps.html#log$default$3(java.lang.String,scala.Function1)), [logWithMarker](FlowOps.html#logWithMarker(java.lang.String,scala.Function1,scala.Function1,akka.event.MarkerLoggingAdapter)), [logWithMarker$default$3](FlowOps.html#logWithMarker$default$3()), [logWithMarker$default$4](FlowOps.html#logWithMarker$default$4(java.lang.String,scala.Function1,scala.Function1)), [map](FlowOps.html#map(scala.Function1)), [mapAsync](FlowOps.html#mapAsync(int,scala.Function1)), [mapAsyncPartitioned](FlowOps.html#mapAsyncPartitioned(int,int,scala.Function1,scala.Function2)), [mapAsyncUnordered](FlowOps.html#mapAsyncUnordered(int,scala.Function1)), [mapConcat](FlowOps.html#mapConcat(scala.Function1)), [mapError](FlowOps.html#mapError(scala.PartialFunction)), [mapWithResource](FlowOps.html#mapWithResource(scala.Function0,scala.Function2,scala.Function1)), [merge](FlowOps.html#merge(akka.stream.Graph,boolean)), [merge$default$2](FlowOps.html#merge$default$2()), [mergeAll](FlowOps.html#mergeAll(scala.collection.immutable.Seq,boolean)), [mergeGraph](FlowOps.html#mergeGraph(akka.stream.Graph,boolean)), [mergeLatest](FlowOps.html#mergeLatest(akka.stream.Graph,boolean)), [mergeLatest$default$2](FlowOps.html#mergeLatest$default$2()), [mergeLatestGraph](FlowOps.html#mergeLatestGraph(akka.stream.Graph,boolean)), [mergePreferred](FlowOps.html#mergePreferred(akka.stream.Graph,boolean,boolean)), [mergePreferred$default$3](FlowOps.html#mergePreferred$default$3()), [mergePreferredGraph](FlowOps.html#mergePreferredGraph(akka.stream.Graph,boolean,boolean)), [mergePrioritized](FlowOps.html#mergePrioritized(akka.stream.Graph,int,int,boolean)), [mergePrioritized$default$4](FlowOps.html#mergePrioritized$default$4()), [mergePrioritizedGraph](FlowOps.html#mergePrioritizedGraph(akka.stream.Graph,int,int,boolean)), [mergeSorted](FlowOps.html#mergeSorted(akka.stream.Graph,scala.math.Ordering)), [mergeSortedGraph](FlowOps.html#mergeSortedGraph(akka.stream.Graph,scala.math.Ordering)), [named](FlowOps.html#named(java.lang.String)), [onErrorComplete](FlowOps.html#onErrorComplete(scala.PartialFunction)), [onErrorComplete](FlowOps.html#onErrorComplete(scala.reflect.ClassTag)), [orElse](FlowOps.html#orElse(akka.stream.Graph)), [orElseGraph](FlowOps.html#orElseGraph(akka.stream.Graph)), [prefixAndTail](FlowOps.html#prefixAndTail(int)), [prepend](FlowOps.html#prepend(akka.stream.Graph)), [prependGraph](FlowOps.html#prependGraph(akka.stream.Graph,boolean)), [prependLazy](FlowOps.html#prependLazy(akka.stream.Graph)), [recover](FlowOps.html#recover(scala.PartialFunction)), [recoverWith](FlowOps.html#recoverWith(scala.PartialFunction)), [recoverWithRetries](FlowOps.html#recoverWithRetries(int,scala.PartialFunction)), [reduce](FlowOps.html#reduce(scala.Function2)), [scan](FlowOps.html#scan(T,scala.Function2)), [scanAsync](FlowOps.html#scanAsync(T,scala.Function2)), [sliding](FlowOps.html#sliding(int,int)), [sliding$default$2](FlowOps.html#sliding$default$2()), [splitAfter](FlowOps.html#splitAfter(akka.stream.SubstreamCancelStrategy,scala.Function1)), [splitAfter](FlowOps.html#splitAfter(scala.Function1)), [splitWhen](FlowOps.html#splitWhen(akka.stream.SubstreamCancelStrategy,scala.Function1)), [splitWhen](FlowOps.html#splitWhen(scala.Function1)), [statefulMap](FlowOps.html#statefulMap(scala.Function0,scala.Function2,scala.Function1)), [statefulMapConcat](FlowOps.html#statefulMapConcat(scala.Function0)), [take](FlowOps.html#take(long)), [takeWhile](FlowOps.html#takeWhile(scala.Function1)), [takeWhile](FlowOps.html#takeWhile(scala.Function1,boolean)), [takeWithin](FlowOps.html#takeWithin(scala.concurrent.duration.FiniteDuration)), [throttle](FlowOps.html#throttle(int,scala.concurrent.duration.FiniteDuration)), [throttle](FlowOps.html#throttle(int,scala.concurrent.duration.FiniteDuration,int,akka.stream.ThrottleMode)), [throttle](FlowOps.html#throttle(int,scala.concurrent.duration.FiniteDuration,int,scala.Function1,akka.stream.ThrottleMode)), [throttle](FlowOps.html#throttle(int,scala.concurrent.duration.FiniteDuration,scala.Function1)), [throttle](FlowOps.html#throttle(akka.stream.scaladsl.ThrottleControl)), [throttle](FlowOps.html#throttle(akka.stream.scaladsl.ThrottleControl,scala.Function1)), [via](FlowOps.html#via(akka.stream.Graph)), [watch](FlowOps.html#watch(akka.actor.ActorRef)), [wireTap](FlowOps.html#wireTap(akka.stream.Graph)), [wireTap](FlowOps.html#wireTap(scala.Function1)), [wireTapGraph](FlowOps.html#wireTapGraph(akka.stream.Graph)), [withAttributes](FlowOps.html#withAttributes(akka.stream.Attributes)), [zip](FlowOps.html#zip(akka.stream.Graph)), [zipAll](FlowOps.html#zipAll(akka.stream.Graph,A,U)), [zipAllFlow](FlowOps.html#zipAllFlow(akka.stream.Graph,A,U)), [zipGraph](FlowOps.html#zipGraph(akka.stream.Graph)), [zipLatest](FlowOps.html#zipLatest(akka.stream.Graph)), [zipLatestGraph](FlowOps.html#zipLatestGraph(akka.stream.Graph)), [zipLatestWith](FlowOps.html#zipLatestWith(akka.stream.Graph,boolean,scala.Function2)), [zipLatestWith](FlowOps.html#zipLatestWith(akka.stream.Graph,scala.Function2)), [zipLatestWithGraph](FlowOps.html#zipLatestWithGraph(akka.stream.Graph,boolean,scala.Function2)), [zipLatestWithGraph](FlowOps.html#zipLatestWithGraph(akka.stream.Graph,scala.Function2)), [zipWith](FlowOps.html#zipWith(akka.stream.Graph,scala.Function2)), [zipWithGraph](FlowOps.html#zipWithGraph(akka.stream.Graph,scala.Function2)), [zipWithIndex](FlowOps.html#zipWithIndex())`

- - ### Method Detail
	
	
	
		- #### concatSubstreams
		
		
		
		```
		[F](SubFlow.html "type parameter in SubFlow") concatSubstreams()
		```
		
		Flatten the sub\-flows back into the super\-flow by concatenating them.
		 This is usually a bad idea when combined with `groupBy` since it can
		 easily lead to deadlock—the concatenation does not consume from the second
		 substream until the first has finished and the `groupBy` operator will get
		 back\-pressure from the second stream.
		 
		 This is identical in effect to `mergeSubstreamsWithParallelism(1)`.
		- #### mergeSubstreams
		
		
		
		```
		[F](SubFlow.html "type parameter in SubFlow") mergeSubstreams()
		```
		
		Flatten the sub\-flows back into the super\-flow by performing a merge
		 without parallelism limit (i.e. having an unbounded number of sub\-flows
		 active concurrently).
		 
		 This is identical in effect to `mergeSubstreamsWithParallelism(Integer.MAX_VALUE)`.
		- #### mergeSubstreamsWithParallelism
		
		
		
		```
		[F](SubFlow.html "type parameter in SubFlow") mergeSubstreamsWithParallelism​(int parallelism)
		```
		
		Flatten the sub\-flows back into the super\-flow by performing a merge
		 with the given parallelism limit. This means that only up to `parallelism`
		 substreams will be executed at any given time. Substreams that are not
		 yet executed are also not materialized, meaning that back\-pressure will
		 be exerted at the operator that creates the substreams when the parallelism
		 limit is reached.
		- #### to
		
		
		
		```
		<M> [C](SubFlow.html "type parameter in SubFlow") to​([Graph](../Graph.html "interface in akka.stream")<[SinkShape](../SinkShape.html "class in akka.stream")<[Out](SubFlow.html "type parameter in SubFlow")>,​M> sink)
		```
		
		Attach a [`Sink`](Sink.html "class in akka.stream.scaladsl") to each sub\-flow, closing the overall Graph that is being
		 constructed.
		 
		 Note that attributes set on the returned graph, including async boundaries are now for the entire graph and not
		 the `SubFlow`. for example `async` will not have any effect as the returned graph is the entire, closed graph.
		
		
		
		Specified by:
		`[to](FlowOps.html#to(akka.stream.Graph))` in interface `[FlowOps](FlowOps.html "interface in akka.stream.scaladsl")<[Out](SubFlow.html "type parameter in SubFlow"),​[Mat](SubFlow.html "type parameter in SubFlow")>`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/2.10/akka/stream/Graph.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/SinkShape.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/scaladsl/FlowOps.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/scaladsl/Sink.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/scaladsl/SubFlow.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/scaladsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/2.10/akka/stream/scaladsl/SubFlow.html](https://doc.akka.io/japi/akka/2.10/akka/stream/scaladsl/SubFlow.html)*