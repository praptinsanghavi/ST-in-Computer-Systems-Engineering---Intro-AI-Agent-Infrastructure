---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:31:59Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/MediaTypes$.html
title: MediaTypes$
---

# MediaTypes$

## Content

Package [akka.http.scaladsl.model](package-summary.html)
## Class MediaTypes$

- java.lang.Object
- - akka.http.scaladsl.model.MediaTypes$

- All Implemented Interfaces:
`[ObjectRegistry](../../impl/util/ObjectRegistry.html "interface in akka.http.impl.util")<scala.Tuple2<java.lang.String,​java.lang.String>,​[MediaType](MediaType.html "class in akka.http.scaladsl.model")>`

---

```
public class MediaTypes$
extends java.lang.Object
implements [ObjectRegistry](../../impl/util/ObjectRegistry.html "interface in akka.http.impl.util")<scala.Tuple2<java.lang.String,​java.lang.String>,​[MediaType](MediaType.html "class in akka.http.scaladsl.model")>
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [MediaTypes$](MediaTypes$.html "class in akka.http.scaladsl.model")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[MediaTypes$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[MediaType](MediaType.html "class in akka.http.scaladsl.model")` | `[forExtension](#forExtension(java.lang.String))​(java.lang.String ext)` |  |
	| `scala.Option<[MediaType](MediaType.html "class in akka.http.scaladsl.model")>` | `[forExtensionOption](#forExtensionOption(java.lang.String))​(java.lang.String ext)` |  |
	| `[MediaType.Binary](MediaType.Binary.html "class in akka.http.scaladsl.model")` | `[NoMediaType](#NoMediaType())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface akka.http.impl.util.[ObjectRegistry](../../impl/util/ObjectRegistry.html "interface in akka.http.impl.util")
		
		
		`[getForKey](../../impl/util/ObjectRegistry.html#getForKey(K)), [getForKeyCaseInsensitive](../../impl/util/ObjectRegistry.html#getForKeyCaseInsensitive(java.lang.String,scala.$less$colon$less)), [register](../../impl/util/ObjectRegistry.html#register(K,V))`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [MediaTypes$](MediaTypes$.html "class in akka.http.scaladsl.model") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### MediaTypes$
		
		
		
		```
		public MediaTypes$()
		```

	- ### Method Detail
	
	
	
		- #### forExtensionOption
		
		
		
		```
		public scala.Option<[MediaType](MediaType.html "class in akka.http.scaladsl.model")> forExtensionOption​(java.lang.String ext)
		```
		- #### forExtension
		
		
		
		```
		public [MediaType](MediaType.html "class in akka.http.scaladsl.model") forExtension​(java.lang.String ext)
		```
		- #### NoMediaType
		
		
		
		```
		public [MediaType.Binary](MediaType.Binary.html "class in akka.http.scaladsl.model") NoMediaType()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/ObjectRegistry.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/MediaType.Binary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/MediaType.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/MediaTypes$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/MediaTypes$.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/MediaTypes$.html)*