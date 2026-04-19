---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:32:52Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/rendering/BodyPartRenderer.html
title: BodyPartRenderer
---

# BodyPartRenderer

## Content

Package [akka.http.impl.engine.rendering](package-summary.html)
## Class BodyPartRenderer

- java.lang.Object
- - akka.http.impl.engine.rendering.BodyPartRenderer

- ---

```
public class BodyPartRenderer
extends java.lang.Object
```

INTERNAL API

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[BodyPartRenderer](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static java.lang.String` | `[randomBoundary](#randomBoundary(int,java.util.Random))​(int length,  java.util.Random random)` | Creates a new random number of the given length and base64 encodes it (using a custom "safe" alphabet). |
	| `static java.lang.String` | `[randomBoundaryWithDefaultRandom](#randomBoundaryWithDefaultRandom(int))​(int length)` | Creates a new random number of the given length and base64 encodes it (using a custom "safe" alphabet). |
	| `static java.lang.String` | `[randomBoundaryWithDefaults](#randomBoundaryWithDefaults())()` | Creates a new random number of default length and base64 encodes it (using a custom "safe" alphabet). |
	| `static akka.stream.stage.GraphStage<akka.stream.FlowShape<[Multipart.BodyPart](../../../scaladsl/model/Multipart.BodyPart.html "interface in akka.http.scaladsl.model"),​akka.stream.scaladsl.Source<[HttpEntity.ChunkStreamPart](../../../scaladsl/model/HttpEntity.ChunkStreamPart.html "class in akka.http.scaladsl.model"),​java.lang.Object>>>` | `[streamed](#streamed(java.lang.String,int,akka.event.LoggingAdapter))​(java.lang.String boundary,  int partHeadersSizeHint,  akka.event.LoggingAdapter _log)` |  |
	| `static akka.util.ByteString` | `[strict](#strict(scala.collection.immutable.Seq,java.lang.String,int,akka.event.LoggingAdapter))​(scala.collection.immutable.Seq<[Multipart.BodyPart.Strict](../../../javadsl/model/Multipart.BodyPart.Strict.html "interface in akka.http.javadsl.model")> parts,  java.lang.String boundary,  int partHeadersSizeHint,  akka.event.LoggingAdapter log)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### BodyPartRenderer
		
		
		
		```
		public BodyPartRenderer()
		```

	- ### Method Detail
	
	
	
		- #### streamed
		
		
		
		```
		public static akka.stream.stage.GraphStage<akka.stream.FlowShape<[Multipart.BodyPart](../../../scaladsl/model/Multipart.BodyPart.html "interface in akka.http.scaladsl.model"),​akka.stream.scaladsl.Source<[HttpEntity.ChunkStreamPart](../../../scaladsl/model/HttpEntity.ChunkStreamPart.html "class in akka.http.scaladsl.model"),​java.lang.Object>>> streamed​(java.lang.String boundary,
		                                                                                                                                                                                    int partHeadersSizeHint,
		                                                                                                                                                                                    akka.event.LoggingAdapter _log)
		```
		- #### strict
		
		
		
		```
		public static akka.util.ByteString strict​(scala.collection.immutable.Seq<[Multipart.BodyPart.Strict](../../../javadsl/model/Multipart.BodyPart.Strict.html "interface in akka.http.javadsl.model")> parts,
		                                          java.lang.String boundary,
		                                          int partHeadersSizeHint,
		                                          akka.event.LoggingAdapter log)
		```
		- #### randomBoundary
		
		
		
		```
		public static java.lang.String randomBoundary​(int length,
		                                              java.util.Random random)
		```
		
		Creates a new random number of the given length and base64 encodes it (using a custom "safe" alphabet).
		
		Parameters:
		`length` \- (undocumented)
		`random` \- (undocumented)
		Returns:
		(undocumented)
		- #### randomBoundaryWithDefaults
		
		
		
		```
		public static java.lang.String randomBoundaryWithDefaults()
		```
		
		Creates a new random number of default length and base64 encodes it (using a custom "safe" alphabet).
		
		Returns:
		(undocumented)
		- #### randomBoundaryWithDefaultRandom
		
		
		
		```
		public static java.lang.String randomBoundaryWithDefaultRandom​(int length)
		```
		
		Creates a new random number of the given length and base64 encodes it (using a custom "safe" alphabet).
		
		Parameters:
		`length` \- (undocumented)
		Returns:
		(undocumented)

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/rendering/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/Multipart.BodyPart.Strict.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpEntity.ChunkStreamPart.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/Multipart.BodyPart.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/rendering/BodyPartRenderer.html](https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/rendering/BodyPartRenderer.html)*