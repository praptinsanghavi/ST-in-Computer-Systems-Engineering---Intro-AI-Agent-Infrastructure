---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:44:25Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/StreamUtils$.html
title: StreamUtils$
---

# StreamUtils$

## Content

Package [akka.http.impl.util](package-summary.html)
## Class StreamUtils$

- java.lang.Object
- - akka.http.impl.util.StreamUtils$

- ---

```
public class StreamUtils$
extends java.lang.Object
```

INTERNAL API

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [StreamUtils$](StreamUtils$.html "class in akka.http.impl.util")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[StreamUtils$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `akka.stream.stage.GraphStage<akka.stream.FlowShape<akka.util.ByteString,​akka.util.ByteString>>` | `[byteStringTransformer](#byteStringTransformer(scala.Function1,scala.Function0))​(scala.Function1<akka.util.ByteString,​akka.util.ByteString> f,  scala.Function0<akka.util.ByteString> finish)` | Creates a transformer that will call `f` for each incoming ByteString and output its result. |
	| `void` | `[cancelSource](#cancelSource(akka.stream.scaladsl.Source,akka.stream.Materializer))​(akka.stream.scaladsl.Source<?,​?> source,  akka.stream.Materializer materializer)` | Tries to guess whether a source needs to cancelled and how. |
	| `<T,​Mat>scala.Tuple4<akka.stream.scaladsl.Source<T,​Mat>,​scala.concurrent.Future<scala.runtime.BoxedUnit>,​scala.concurrent.Future<scala.runtime.BoxedUnit>,​akka.stream.KillSwitch>` | `[captureMaterializationTerminationAndKillSwitch](#captureMaterializationTerminationAndKillSwitch(akka.stream.scaladsl.Source))​(akka.stream.scaladsl.Source<T,​Mat> source)` |  |
	| `<T,​Mat>scala.Tuple2<akka.stream.scaladsl.Source<T,​Mat>,​scala.concurrent.Future<scala.runtime.BoxedUnit>>` | `[captureTermination](#captureTermination(akka.stream.scaladsl.Source))​(akka.stream.scaladsl.Source<T,​Mat> source)` |  |
	| `<T> akka.stream.scaladsl.Flow<T,​T,​akka.NotUsed>` | `[delayCancellation](#delayCancellation(scala.concurrent.duration.Duration))​(scala.concurrent.duration.Duration cancelAfter)` | INTERNAL API |
	| `<T> akka.stream.scaladsl.Flow<T,​T,​akka.NotUsed>` | `[encodeErrorAndComplete](#encodeErrorAndComplete(scala.Function1))​(scala.Function1<java.lang.Throwable,​T> f)` |  |
	| `akka.stream.stage.GraphStage<akka.stream.FlowShape<akka.util.ByteString,​akka.util.ByteString>>` | `[limitByteChunksStage](#limitByteChunksStage(int))​(int maxBytesPerChunk)` |  |
	| `akka.stream.Materializer` | `[OnlyRunInGraphInterpreterContext](#OnlyRunInGraphInterpreterContext())()` | Dummy name to signify that the caller asserts that cancelSource is only run from within a GraphInterpreter context |
	| `akka.stream.scaladsl.Flow<akka.util.ByteString,​akka.util.ByteString,​akka.NotUsed>` | `[sliceBytesTransformer](#sliceBytesTransformer(long,long))​(long start,  long length)` |  |
	| `<T,​U>akka.stream.scaladsl.Flow<T,​U,​akka.NotUsed>` | `[statefulAttrsMap](#statefulAttrsMap(scala.Function1))​(scala.Function1<akka.stream.Attributes,​scala.Function1<T,​U>> functionConstructor)` | Lifts the streams attributes into an element and passes them to the function for each passed through element. |
	| `<T extends [HttpEntity](../../scaladsl/model/HttpEntity.html "interface in akka.http.scaladsl.model"),​M>scala.Tuple2<T,​M>` | `[transformEntityStream](#transformEntityStream(T,akka.http.impl.util.StreamUtils.EntityStreamOp))​(T entity,  [StreamUtils.EntityStreamOp](StreamUtils.EntityStreamOp.html "interface in akka.http.impl.util")<M> streamOp)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [StreamUtils$](StreamUtils$.html "class in akka.http.impl.util") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### StreamUtils$
		
		
		
		```
		public StreamUtils$()
		```

	- ### Method Detail
	
	
	
		- #### byteStringTransformer
		
		
		
		```
		public akka.stream.stage.GraphStage<akka.stream.FlowShape<akka.util.ByteString,​akka.util.ByteString>> byteStringTransformer​(scala.Function1<akka.util.ByteString,​akka.util.ByteString> f,
		                                                                                                                                  scala.Function0<akka.util.ByteString> finish)
		```
		
		Creates a transformer that will call `f` for each incoming ByteString and output its result. After the complete
		 input has been read it will call `finish` once to determine the final ByteString to post to the output.
		 Empty ByteStrings are discarded.
		
		Parameters:
		`f` \- (undocumented)
		`finish` \- (undocumented)
		Returns:
		(undocumented)
		- #### captureTermination
		
		
		
		```
		public <T,​Mat> scala.Tuple2<akka.stream.scaladsl.Source<T,​Mat>,​scala.concurrent.Future<scala.runtime.BoxedUnit>> captureTermination​(akka.stream.scaladsl.Source<T,​Mat> source)
		```
		- #### captureMaterializationTerminationAndKillSwitch
		
		
		
		```
		public <T,​Mat> scala.Tuple4<akka.stream.scaladsl.Source<T,​Mat>,​scala.concurrent.Future<scala.runtime.BoxedUnit>,​scala.concurrent.Future<scala.runtime.BoxedUnit>,​akka.stream.KillSwitch> captureMaterializationTerminationAndKillSwitch​(akka.stream.scaladsl.Source<T,​Mat> source)
		```
		- #### sliceBytesTransformer
		
		
		
		```
		public akka.stream.scaladsl.Flow<akka.util.ByteString,​akka.util.ByteString,​akka.NotUsed> sliceBytesTransformer​(long start,
		                                                                                                                           long length)
		```
		- #### limitByteChunksStage
		
		
		
		```
		public akka.stream.stage.GraphStage<akka.stream.FlowShape<akka.util.ByteString,​akka.util.ByteString>> limitByteChunksStage​(int maxBytesPerChunk)
		```
		- #### delayCancellation
		
		
		
		```
		public <T> akka.stream.scaladsl.Flow<T,​T,​akka.NotUsed> delayCancellation​(scala.concurrent.duration.Duration cancelAfter)
		```
		
		INTERNAL API
		 
		 Returns a flow that is almost identity but delays propagation of cancellation from downstream to upstream.
		
		
		
		Parameters:
		`cancelAfter` \- (undocumented)
		Returns:
		(undocumented)
		- #### statefulAttrsMap
		
		
		
		```
		public <T,​U> akka.stream.scaladsl.Flow<T,​U,​akka.NotUsed> statefulAttrsMap​(scala.Function1<akka.stream.Attributes,​scala.Function1<T,​U>> functionConstructor)
		```
		
		Lifts the streams attributes into an element and passes them to the function for each passed through element.
		 Similar idea than `FlowOps.statefulMapConcat` but for a simple map.
		 
		 The result of `Attributes => (T => U)` is cached, and only the `T => U` function will be invoked afterwards for each element.
		
		
		
		Parameters:
		`functionConstructor` \- (undocumented)
		Returns:
		(undocumented)
		- #### OnlyRunInGraphInterpreterContext
		
		
		
		```
		public akka.stream.Materializer OnlyRunInGraphInterpreterContext()
		```
		
		Dummy name to signify that the caller asserts that cancelSource is only run from within a GraphInterpreter context
		- #### cancelSource
		
		
		
		```
		public void cancelSource​(akka.stream.scaladsl.Source<?,​?> source,
		                         akka.stream.Materializer materializer)
		```
		
		Tries to guess whether a source needs to cancelled and how. In the best case no materialization should be needed.
		
		Parameters:
		`source` \- (undocumented)
		`materializer` \- (undocumented)
		- #### transformEntityStream
		
		
		
		```
		public <T extends [HttpEntity](../../scaladsl/model/HttpEntity.html "interface in akka.http.scaladsl.model"),​M> scala.Tuple2<T,​M> transformEntityStream​(T entity,
		                                                                                    [StreamUtils.EntityStreamOp](StreamUtils.EntityStreamOp.html "interface in akka.http.impl.util")<M> streamOp)
		```
		- #### encodeErrorAndComplete
		
		
		
		```
		public <T> akka.stream.scaladsl.Flow<T,​T,​akka.NotUsed> encodeErrorAndComplete​(scala.Function1<java.lang.Throwable,​T> f)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/StreamUtils$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/StreamUtils.EntityStreamOp.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpEntity.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/StreamUtils$.html](https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/StreamUtils$.html)*