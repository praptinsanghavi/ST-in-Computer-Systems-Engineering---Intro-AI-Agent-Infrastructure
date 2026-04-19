---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:48:37Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/testkit/WSProbe$.html
title: WSProbe$
---

# WSProbe$

## Content

Package [akka.http.javadsl.testkit](package-summary.html)
## Class WSProbe$

- java.lang.Object
- - akka.http.javadsl.testkit.WSProbe$

- ---

```
public class WSProbe$
extends java.lang.Object
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [WSProbe$](WSProbe$.html "class in akka.http.javadsl.testkit")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[WSProbe$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[WSProbe](WSProbe.html "class in akka.http.javadsl.testkit")` | `[create](#create(akka.actor.ActorSystem,akka.stream.Materializer))​(akka.actor.ActorSystem system,  akka.stream.Materializer materializer)` |  |
	| `[WSProbe](WSProbe.html "class in akka.http.javadsl.testkit")` | `[create](#create(akka.actor.ActorSystem,akka.stream.Materializer,int,long))​(akka.actor.ActorSystem system,  akka.stream.Materializer materializer,  int maxChunks,  long maxChunkCollectionMills)` | Creates a WSProbe to use in tests against websocket handlers. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [WSProbe$](WSProbe$.html "class in akka.http.javadsl.testkit") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### WSProbe$
		
		
		
		```
		public WSProbe$()
		```

	- ### Method Detail
	
	
	
		- #### create
		
		
		
		```
		public [WSProbe](WSProbe.html "class in akka.http.javadsl.testkit") create​(akka.actor.ActorSystem system,
		                      akka.stream.Materializer materializer)
		```
		- #### create
		
		
		
		```
		public [WSProbe](WSProbe.html "class in akka.http.javadsl.testkit") create​(akka.actor.ActorSystem system,
		                      akka.stream.Materializer materializer,
		                      int maxChunks,
		                      long maxChunkCollectionMills)
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

- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/testkit/WSProbe$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/testkit/WSProbe.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/testkit/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/testkit/WSProbe$.html](https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/testkit/WSProbe$.html)*