---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:42:30Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/testkit/WSProbe$.html
title: WSProbe$
---

# WSProbe$

## Content

Package [akka.http.scaladsl.testkit](package-summary.html)
## Class WSProbe$

- java.lang.Object
- - akka.http.scaladsl.testkit.WSProbe$

- ---

```
public class WSProbe$
extends java.lang.Object
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [WSProbe$](WSProbe$.html "class in akka.http.scaladsl.testkit")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[WSProbe$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[WSProbe](WSProbe.html "interface in akka.http.scaladsl.testkit")` | `[apply](#apply(int,long,akka.actor.ActorSystem,akka.stream.Materializer))​(int maxChunks,  long maxChunkCollectionMills,  akka.actor.ActorSystem system,  akka.stream.Materializer materializer)` | Creates a WSProbe to use in tests against websocket handlers. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [WSProbe$](WSProbe$.html "class in akka.http.scaladsl.testkit") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### WSProbe$
		
		
		
		```
		public WSProbe$()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public [WSProbe](WSProbe.html "interface in akka.http.scaladsl.testkit") apply​(int maxChunks,
		                     long maxChunkCollectionMills,
		                     akka.actor.ActorSystem system,
		                     akka.stream.Materializer materializer)
		```
		
		Creates a WSProbe to use in tests against websocket handlers.
		 
		
		Parameters:
		`maxChunks` \- The maximum number of chunks to collect for streamed messages.
		`maxChunkCollectionMills` \- The maximum time in milliseconds to collect chunks for streamed messages.
		`system` \- (undocumented)
		`materializer` \- (undocumented)
		Returns:
		(undocumented)

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/testkit/WSProbe$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/testkit/WSProbe.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/testkit/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/testkit/WSProbe$.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/testkit/WSProbe$.html)*