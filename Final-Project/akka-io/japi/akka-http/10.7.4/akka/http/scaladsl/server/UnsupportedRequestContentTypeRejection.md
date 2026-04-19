---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:10:47Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/UnsupportedRequestContentTypeRejection.html
title: UnsupportedRequestContentTypeRejection
---

# UnsupportedRequestContentTypeRejection

## Content

Package [akka.http.scaladsl.server](package-summary.html)
## Class UnsupportedRequestContentTypeRejection

- java.lang.Object
- - akka.http.scaladsl.server.UnsupportedRequestContentTypeRejection

- All Implemented Interfaces:
`[Rejection](../../javadsl/server/Rejection.html "interface in akka.http.javadsl.server")`, `[UnsupportedRequestContentTypeRejection](../../javadsl/server/UnsupportedRequestContentTypeRejection.html "interface in akka.http.javadsl.server")`, `[Rejection](Rejection.html "interface in akka.http.scaladsl.server")`, `java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public final class UnsupportedRequestContentTypeRejection
extends java.lang.Object
implements [UnsupportedRequestContentTypeRejection](../../javadsl/server/UnsupportedRequestContentTypeRejection.html "interface in akka.http.javadsl.server"), [Rejection](Rejection.html "interface in akka.http.scaladsl.server"), scala.Product, java.io.Serializable
```

Rejection created by unmarshallers.
 Signals that the request was rejected because the requests content\-type is unsupported.

See Also:
[Serialized Form](../../../../serialized-form.html#akka.http.scaladsl.server.UnsupportedRequestContentTypeRejection)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[UnsupportedRequestContentTypeRejection](#%3Cinit%3E(scala.collection.immutable.Set))​(scala.collection.immutable.Set<[ContentTypeRange](../model/ContentTypeRange.html "class in akka.http.scaladsl.model")> supported)` | Deprecated. for binary compatibility. |
	| `[UnsupportedRequestContentTypeRejection](#%3Cinit%3E(scala.collection.immutable.Set,scala.Option))​(scala.collection.immutable.Set<[ContentTypeRange](../model/ContentTypeRange.html "class in akka.http.scaladsl.model")> supported,  scala.Option<[ContentType](../model/ContentType.html "interface in akka.http.scaladsl.model")> contentType)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) [Deprecated Methods](javascript:show(32);) 
	| Modifier and Type | Method | Description |
	| `static [UnsupportedRequestContentTypeRejection](UnsupportedRequestContentTypeRejection.html "class in akka.http.scaladsl.server")` | `[apply](#apply(scala.collection.immutable.Set))​(scala.collection.immutable.Set<[ContentTypeRange](../model/ContentTypeRange.html "class in akka.http.scaladsl.model")> supported)` | Deprecated. for binary compatibility. |
	| `static [UnsupportedRequestContentTypeRejection](UnsupportedRequestContentTypeRejection.html "class in akka.http.scaladsl.server")` | `[apply](#apply(scala.collection.immutable.Set,scala.Option))​(scala.collection.immutable.Set<[ContentTypeRange](../model/ContentTypeRange.html "class in akka.http.scaladsl.model")> supported,  scala.Option<[ContentType](../model/ContentType.html "interface in akka.http.scaladsl.model")> contentType)` |  |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object that)` |  |
	| `scala.Option<[ContentType](../model/ContentType.html "interface in akka.http.scaladsl.model")>` | `[contentType](#contentType())()` |  |
	| `[UnsupportedRequestContentTypeRejection](UnsupportedRequestContentTypeRejection.html "class in akka.http.scaladsl.server")` | `[copy](#copy(scala.collection.immutable.Set))​(scala.collection.immutable.Set<[ContentTypeRange](../model/ContentTypeRange.html "class in akka.http.scaladsl.model")> supported)` | Deprecated. for binary compatibility. |
	| `[UnsupportedRequestContentTypeRejection](UnsupportedRequestContentTypeRejection.html "class in akka.http.scaladsl.server")` | `[copy](#copy(scala.collection.immutable.Set,scala.Option))​(scala.collection.immutable.Set<[ContentTypeRange](../model/ContentTypeRange.html "class in akka.http.scaladsl.model")> supported,  scala.Option<[ContentType](../model/ContentType.html "interface in akka.http.scaladsl.model")> contentType)` | Deprecated. for binary compatibility. |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object that)` |  |
	| `java.util.Set<[ContentTypeRange](../../javadsl/model/ContentTypeRange.html "class in akka.http.javadsl.model")>` | `[getSupported](#getSupported())()` |  |
	| `int` | `[productArity](#productArity())()` |  |
	| `java.lang.Object` | `[productElement](#productElement(int))​(int n)` |  |
	| `scala.collection.immutable.Set<[ContentTypeRange](../model/ContentTypeRange.html "class in akka.http.scaladsl.model")>` | `[supported](#supported())()` |  |
	| `static java.lang.String` | `[toString](#toString())()` |  |
	| `static scala.Option<scala.collection.immutable.Set<[ContentTypeRange](../model/ContentTypeRange.html "class in akka.http.scaladsl.model")>>` | `[unapply](#unapply(akka.http.scaladsl.server.UnsupportedRequestContentTypeRejection))​([UnsupportedRequestContentTypeRejection](UnsupportedRequestContentTypeRejection.html "class in akka.http.scaladsl.server") rejection)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface scala.Product
		
		
		`productElementName, productElementNames, productIterator, productPrefix`

- - ### Constructor Detail
	
	
	
		- #### UnsupportedRequestContentTypeRejection
		
		
		
		```
		public UnsupportedRequestContentTypeRejection​(scala.collection.immutable.Set<[ContentTypeRange](../model/ContentTypeRange.html "class in akka.http.scaladsl.model")> supported,
		                                              scala.Option<[ContentType](../model/ContentType.html "interface in akka.http.scaladsl.model")> contentType)
		```
		- #### UnsupportedRequestContentTypeRejection
		
		
		
		```
		public UnsupportedRequestContentTypeRejection​(scala.collection.immutable.Set<[ContentTypeRange](../model/ContentTypeRange.html "class in akka.http.scaladsl.model")> supported)
		```
		
		Deprecated.
		for binary compatibility. Since 10\.1\.9\.

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public static [UnsupportedRequestContentTypeRejection](UnsupportedRequestContentTypeRejection.html "class in akka.http.scaladsl.server") apply​(scala.collection.immutable.Set<[ContentTypeRange](../model/ContentTypeRange.html "class in akka.http.scaladsl.model")> supported,
		                                                           scala.Option<[ContentType](../model/ContentType.html "interface in akka.http.scaladsl.model")> contentType)
		```
		- #### apply
		
		
		
		```
		public static [UnsupportedRequestContentTypeRejection](UnsupportedRequestContentTypeRejection.html "class in akka.http.scaladsl.server") apply​(scala.collection.immutable.Set<[ContentTypeRange](../model/ContentTypeRange.html "class in akka.http.scaladsl.model")> supported)
		```
		
		Deprecated.
		for binary compatibility. Since 10\.1\.9\.
		- #### unapply
		
		
		
		```
		public static scala.Option<scala.collection.immutable.Set<[ContentTypeRange](../model/ContentTypeRange.html "class in akka.http.scaladsl.model")>> unapply​([UnsupportedRequestContentTypeRejection](UnsupportedRequestContentTypeRejection.html "class in akka.http.scaladsl.server") rejection)
		```
		- #### toString
		
		
		
		```
		public static java.lang.String toString()
		```
		- #### supported
		
		
		
		```
		public scala.collection.immutable.Set<[ContentTypeRange](../model/ContentTypeRange.html "class in akka.http.scaladsl.model")> supported()
		```
		- #### contentType
		
		
		
		```
		public scala.Option<[ContentType](../model/ContentType.html "interface in akka.http.scaladsl.model")> contentType()
		```
		- #### getSupported
		
		
		
		```
		public java.util.Set<[ContentTypeRange](../../javadsl/model/ContentTypeRange.html "class in akka.http.javadsl.model")> getSupported()
		```
		
		
		Specified by:
		`[getSupported](../../javadsl/server/UnsupportedRequestContentTypeRejection.html#getSupported())` in interface `[UnsupportedRequestContentTypeRejection](../../javadsl/server/UnsupportedRequestContentTypeRejection.html "interface in akka.http.javadsl.server")`
		- #### copy
		
		
		
		```
		public [UnsupportedRequestContentTypeRejection](UnsupportedRequestContentTypeRejection.html "class in akka.http.scaladsl.server") copy​(scala.collection.immutable.Set<[ContentTypeRange](../model/ContentTypeRange.html "class in akka.http.scaladsl.model")> supported)
		```
		
		Deprecated.
		for binary compatibility. Since 10\.1\.9\.
		- #### copy
		
		
		
		```
		public [UnsupportedRequestContentTypeRejection](UnsupportedRequestContentTypeRejection.html "class in akka.http.scaladsl.server") copy​(scala.collection.immutable.Set<[ContentTypeRange](../model/ContentTypeRange.html "class in akka.http.scaladsl.model")> supported,
		                                                   scala.Option<[ContentType](../model/ContentType.html "interface in akka.http.scaladsl.model")> contentType)
		```
		
		Deprecated.
		for binary compatibility. Since 10\.1\.9\.
		- #### canEqual
		
		
		
		```
		public boolean canEqual​(java.lang.Object that)
		```
		
		
		Specified by:
		`canEqual` in interface `scala.Equals`
		- #### equals
		
		
		
		```
		public boolean equals​(java.lang.Object that)
		```
		
		
		Specified by:
		`equals` in interface `scala.Equals`
		Overrides:
		`equals` in class `java.lang.Object`
		- #### productArity
		
		
		
		```
		public int productArity()
		```
		
		
		Specified by:
		`productArity` in interface `scala.Product`
		- #### productElement
		
		
		
		```
		public java.lang.Object productElement​(int n)
		```
		
		
		Specified by:
		`productElement` in interface `scala.Product`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/ContentTypeRange.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/Rejection.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/UnsupportedRequestContentTypeRejection.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/ContentType.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/ContentTypeRange.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/Rejection.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/UnsupportedRequestContentTypeRejection.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/package-summary.html
- https://doc.akka.io/japi/akka-http/10.7.4/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/UnsupportedRequestContentTypeRejection.html](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/UnsupportedRequestContentTypeRejection.html)*