---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:41:17Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/HttpEntity.DiscardedEntity.html
title: HttpEntity.DiscardedEntity
---

# HttpEntity.DiscardedEntity

## Content

Package [akka.http.scaladsl.model](package-summary.html)
## Class HttpEntity.DiscardedEntity

- java.lang.Object
- - akka.http.scaladsl.model.HttpEntity.DiscardedEntity

- All Implemented Interfaces:
`[HttpEntity.DiscardedEntity](../../javadsl/model/HttpEntity.DiscardedEntity.html "interface in akka.http.javadsl.model")`, `[HttpMessage.DiscardedEntity](../../javadsl/model/HttpMessage.DiscardedEntity.html "interface in akka.http.javadsl.model")`

Enclosing interface:
[HttpEntity](HttpEntity.html "interface in akka.http.scaladsl.model")

---

```
public static final class HttpEntity.DiscardedEntity
extends java.lang.Object
implements [HttpMessage.DiscardedEntity](../../javadsl/model/HttpMessage.DiscardedEntity.html "interface in akka.http.javadsl.model")
```

Represents the currently being\-drained HTTP Entity which triggers completion of the contained
 Future once the entity has been drained for the given HttpMessage completely.

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[DiscardedEntity](#%3Cinit%3E(scala.concurrent.Future))​(scala.concurrent.Future<akka.Done> f)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `java.util.concurrent.CompletionStage<akka.Done>` | `[completionStage](#completionStage())()` | This future completes successfully once the underlying entity stream has been  successfully drained (and fails otherwise). |
	| `scala.concurrent.Future<akka.Done>` | `[future](#future())()` | This future completes successfully once the underlying entity stream has been  successfully drained (and fails otherwise). |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### DiscardedEntity
		
		
		
		```
		public DiscardedEntity​(scala.concurrent.Future<akka.Done> f)
		```

	- ### Method Detail
	
	
	
		- #### completionStage
		
		
		
		```
		public java.util.concurrent.CompletionStage<akka.Done> completionStage()
		```
		
		This future completes successfully once the underlying entity stream has been
		 successfully drained (and fails otherwise).
		
		Specified by:
		`[completionStage](../../javadsl/model/HttpEntity.DiscardedEntity.html#completionStage())` in interface `[HttpEntity.DiscardedEntity](../../javadsl/model/HttpEntity.DiscardedEntity.html "interface in akka.http.javadsl.model")`
		Returns:
		(undocumented)
		- #### future
		
		
		
		```
		public scala.concurrent.Future<akka.Done> future()
		```
		
		This future completes successfully once the underlying entity stream has been
		 successfully drained (and fails otherwise).
		
		Specified by:
		`[future](../../javadsl/model/HttpEntity.DiscardedEntity.html#future())` in interface `[HttpEntity.DiscardedEntity](../../javadsl/model/HttpEntity.DiscardedEntity.html "interface in akka.http.javadsl.model")`
		Returns:
		(undocumented)

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/HttpEntity.DiscardedEntity.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/HttpMessage.DiscardedEntity.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/HttpEntity.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/HttpEntity.DiscardedEntity.html](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/HttpEntity.DiscardedEntity.html)*