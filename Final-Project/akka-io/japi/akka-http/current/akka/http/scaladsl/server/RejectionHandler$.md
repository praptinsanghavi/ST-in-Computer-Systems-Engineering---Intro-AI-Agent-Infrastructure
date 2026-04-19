---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:39:05Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/RejectionHandler$.html
title: RejectionHandler$
---

# RejectionHandler$

## Content

Package [akka.http.scaladsl.server](package-summary.html)
## Class RejectionHandler$

- java.lang.Object
- - akka.http.scaladsl.server.RejectionHandler$

- ---

```
public class RejectionHandler$
extends java.lang.Object
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [RejectionHandler$](RejectionHandler$.html "class in akka.http.scaladsl.server")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[RejectionHandler$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `scala.collection.immutable.Seq<[Rejection](Rejection.html "interface in akka.http.scaladsl.server")>` | `[applyTransformations](#applyTransformations(scala.collection.immutable.Seq))​(scala.collection.immutable.Seq<[Rejection](Rejection.html "interface in akka.http.scaladsl.server")> rejections)` | Filters out all TransformationRejections from the given sequence and applies them (in order) to the  remaining rejections. |
	| `[RejectionHandler.Builder](RejectionHandler.Builder.html "class in akka.http.scaladsl.server")` | `[newBuilder](#newBuilder())()` | Creates a new [`RejectionHandler`](RejectionHandler.html "interface in akka.http.scaladsl.server") builder. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [RejectionHandler$](RejectionHandler$.html "class in akka.http.scaladsl.server") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### RejectionHandler$
		
		
		
		```
		public RejectionHandler$()
		```

	- ### Method Detail
	
	
	
		- #### newBuilder
		
		
		
		```
		public [RejectionHandler.Builder](RejectionHandler.Builder.html "class in akka.http.scaladsl.server") newBuilder()
		```
		
		Creates a new [`RejectionHandler`](RejectionHandler.html "interface in akka.http.scaladsl.server") builder.
		
		Returns:
		(undocumented)
		- #### applyTransformations
		
		
		
		```
		public scala.collection.immutable.Seq<[Rejection](Rejection.html "interface in akka.http.scaladsl.server")> applyTransformations​(scala.collection.immutable.Seq<[Rejection](Rejection.html "interface in akka.http.scaladsl.server")> rejections)
		```
		
		Filters out all TransformationRejections from the given sequence and applies them (in order) to the
		 remaining rejections.
		
		Parameters:
		`rejections` \- (undocumented)
		Returns:
		(undocumented)

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/Rejection.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/RejectionHandler$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/RejectionHandler.Builder.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/RejectionHandler.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/RejectionHandler$.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/RejectionHandler$.html)*