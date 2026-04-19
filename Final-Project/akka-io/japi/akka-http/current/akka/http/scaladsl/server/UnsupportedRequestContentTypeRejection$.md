---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:39:30Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/UnsupportedRequestContentTypeRejection$.html
title: UnsupportedRequestContentTypeRejection$
---

# UnsupportedRequestContentTypeRejection$

## Content

Package [akka.http.scaladsl.server](package-summary.html)
## Class UnsupportedRequestContentTypeRejection$

- java.lang.Object
- - scala.runtime.AbstractFunction1\<scala.collection.immutable.Set\<[ContentTypeRange](../model/ContentTypeRange.html "class in akka.http.scaladsl.model")\>,​[UnsupportedRequestContentTypeRejection](UnsupportedRequestContentTypeRejection.html "class in akka.http.scaladsl.server")\>
	- - akka.http.scaladsl.server.UnsupportedRequestContentTypeRejection$

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Function1<scala.collection.immutable.Set<[ContentTypeRange](../model/ContentTypeRange.html "class in akka.http.scaladsl.model")>,​[UnsupportedRequestContentTypeRejection](UnsupportedRequestContentTypeRejection.html "class in akka.http.scaladsl.server")>`

---

```
public class UnsupportedRequestContentTypeRejection$
extends scala.runtime.AbstractFunction1<scala.collection.immutable.Set<[ContentTypeRange](../model/ContentTypeRange.html "class in akka.http.scaladsl.model")>,​[UnsupportedRequestContentTypeRejection](UnsupportedRequestContentTypeRejection.html "class in akka.http.scaladsl.server")>
implements java.io.Serializable
```

See Also:
[Serialized Form](../../../../serialized-form.html#akka.http.scaladsl.server.UnsupportedRequestContentTypeRejection$)

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from interface scala.Function1
		
		
		`scala.Function1.UnliftOps<A extends java.lang.Object,​B extends java.lang.Object>, scala.Function1.UnliftOps$`

	- ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [UnsupportedRequestContentTypeRejection$](UnsupportedRequestContentTypeRejection$.html "class in akka.http.scaladsl.server")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[UnsupportedRequestContentTypeRejection$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) [Deprecated Methods](javascript:show(32);) 
	| Modifier and Type | Method | Description |
	| `[UnsupportedRequestContentTypeRejection](UnsupportedRequestContentTypeRejection.html "class in akka.http.scaladsl.server")` | `[apply](#apply(scala.collection.immutable.Set))​(scala.collection.immutable.Set<[ContentTypeRange](../model/ContentTypeRange.html "class in akka.http.scaladsl.model")> supported)` | Deprecated. for binary compatibility. |
	| `[UnsupportedRequestContentTypeRejection](UnsupportedRequestContentTypeRejection.html "class in akka.http.scaladsl.server")` | `[apply](#apply(scala.collection.immutable.Set,scala.Option))​(scala.collection.immutable.Set<[ContentTypeRange](../model/ContentTypeRange.html "class in akka.http.scaladsl.model")> supported,  scala.Option<[ContentType](../model/ContentType.html "interface in akka.http.scaladsl.model")> contentType)` |  |
	| `scala.Option<scala.collection.immutable.Set<[ContentTypeRange](../model/ContentTypeRange.html "class in akka.http.scaladsl.model")>>` | `[unapply](#unapply(akka.http.scaladsl.server.UnsupportedRequestContentTypeRejection))​([UnsupportedRequestContentTypeRejection](UnsupportedRequestContentTypeRejection.html "class in akka.http.scaladsl.server") rejection)` |  |
	
	
		- ### Methods inherited from class scala.runtime.AbstractFunction1
		
		
		`andThen, apply$mcDD$sp, apply$mcDF$sp, apply$mcDI$sp, apply$mcDJ$sp, apply$mcFD$sp, apply$mcFF$sp, apply$mcFI$sp, apply$mcFJ$sp, apply$mcID$sp, apply$mcIF$sp, apply$mcII$sp, apply$mcIJ$sp, apply$mcJD$sp, apply$mcJF$sp, apply$mcJI$sp, apply$mcJJ$sp, apply$mcVD$sp, apply$mcVF$sp, apply$mcVI$sp, apply$mcVJ$sp, apply$mcZD$sp, apply$mcZF$sp, apply$mcZI$sp, apply$mcZJ$sp, compose, toString`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [UnsupportedRequestContentTypeRejection$](UnsupportedRequestContentTypeRejection$.html "class in akka.http.scaladsl.server") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### UnsupportedRequestContentTypeRejection$
		
		
		
		```
		public UnsupportedRequestContentTypeRejection$()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public [UnsupportedRequestContentTypeRejection](UnsupportedRequestContentTypeRejection.html "class in akka.http.scaladsl.server") apply​(scala.collection.immutable.Set<[ContentTypeRange](../model/ContentTypeRange.html "class in akka.http.scaladsl.model")> supported,
		                                                    scala.Option<[ContentType](../model/ContentType.html "interface in akka.http.scaladsl.model")> contentType)
		```
		- #### apply
		
		
		
		```
		public [UnsupportedRequestContentTypeRejection](UnsupportedRequestContentTypeRejection.html "class in akka.http.scaladsl.server") apply​(scala.collection.immutable.Set<[ContentTypeRange](../model/ContentTypeRange.html "class in akka.http.scaladsl.model")> supported)
		```
		
		Deprecated.
		for binary compatibility. Since 10\.1\.9\.
		
		
		Specified by:
		`apply` in interface `scala.Function1<scala.collection.immutable.Set<[ContentTypeRange](../model/ContentTypeRange.html "class in akka.http.scaladsl.model")>,​[UnsupportedRequestContentTypeRejection](UnsupportedRequestContentTypeRejection.html "class in akka.http.scaladsl.server")>`
		- #### unapply
		
		
		
		```
		public scala.Option<scala.collection.immutable.Set<[ContentTypeRange](../model/ContentTypeRange.html "class in akka.http.scaladsl.model")>> unapply​([UnsupportedRequestContentTypeRejection](UnsupportedRequestContentTypeRejection.html "class in akka.http.scaladsl.server") rejection)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/ContentType.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/ContentTypeRange.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/UnsupportedRequestContentTypeRejection$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/UnsupportedRequestContentTypeRejection.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/package-summary.html
- https://doc.akka.io/japi/akka-http/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/UnsupportedRequestContentTypeRejection$.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/UnsupportedRequestContentTypeRejection$.html)*