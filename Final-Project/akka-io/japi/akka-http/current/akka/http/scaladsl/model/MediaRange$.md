---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:31:43Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/MediaRange$.html
title: MediaRange$
---

# MediaRange$

## Content

Package [akka.http.scaladsl.model](package-summary.html)
## Class MediaRange$

- java.lang.Object
- - akka.http.scaladsl.model.MediaRange$

- ---

```
public class MediaRange$
extends java.lang.Object
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [MediaRange$](MediaRange$.html "class in akka.http.scaladsl.model")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[MediaRange$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[MediaRange](MediaRange.html "class in akka.http.scaladsl.model")` | `[apply](#apply(akka.http.scaladsl.model.MediaType))​([MediaType](MediaType.html "class in akka.http.scaladsl.model") mediaType)` |  |
	| `[MediaRange](MediaRange.html "class in akka.http.scaladsl.model")` | `[apply](#apply(akka.http.scaladsl.model.MediaType,float))​([MediaType](MediaType.html "class in akka.http.scaladsl.model") mediaType,  float qValue)` |  |
	| `[MediaRange](MediaRange.html "class in akka.http.scaladsl.model")` | `[custom](#custom(java.lang.String,scala.collection.immutable.Map,float))​(java.lang.String mainType,  scala.collection.immutable.Map<java.lang.String,​java.lang.String> params,  float qValue)` |  |
	| `scala.Tuple2<scala.collection.immutable.Map<java.lang.String,​java.lang.String>,​java.lang.Object>` | `[splitOffQValue](#splitOffQValue(scala.collection.immutable.Map,float))​(scala.collection.immutable.Map<java.lang.String,​java.lang.String> params,  float defaultQ)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [MediaRange$](MediaRange$.html "class in akka.http.scaladsl.model") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### MediaRange$
		
		
		
		```
		public MediaRange$()
		```

	- ### Method Detail
	
	
	
		- #### splitOffQValue
		
		
		
		```
		public scala.Tuple2<scala.collection.immutable.Map<java.lang.String,​java.lang.String>,​java.lang.Object> splitOffQValue​(scala.collection.immutable.Map<java.lang.String,​java.lang.String> params,
		                                                                                                                                   float defaultQ)
		```
		- #### custom
		
		
		
		```
		public [MediaRange](MediaRange.html "class in akka.http.scaladsl.model") custom​(java.lang.String mainType,
		                         scala.collection.immutable.Map<java.lang.String,​java.lang.String> params,
		                         float qValue)
		```
		- #### apply
		
		
		
		```
		public [MediaRange](MediaRange.html "class in akka.http.scaladsl.model") apply​([MediaType](MediaType.html "class in akka.http.scaladsl.model") mediaType)
		```
		- #### apply
		
		
		
		```
		public [MediaRange](MediaRange.html "class in akka.http.scaladsl.model") apply​([MediaType](MediaType.html "class in akka.http.scaladsl.model") mediaType,
		                        float qValue)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/MediaRange$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/MediaRange.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/MediaType.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/MediaRange$.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/MediaRange$.html)*