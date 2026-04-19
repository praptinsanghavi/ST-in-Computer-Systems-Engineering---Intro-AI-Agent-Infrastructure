---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:42:50Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/unmarshalling/Unmarshaller.UnsupportedContentTypeException.html
title: Unmarshaller.UnsupportedContentTypeException
---

# Unmarshaller.UnsupportedContentTypeException

## Content

Package [akka.http.scaladsl.unmarshalling](package-summary.html)
## Class Unmarshaller.UnsupportedContentTypeException

- java.lang.Object
- - java.lang.Throwable
	- - java.lang.Exception
		- - java.lang.RuntimeException
			- - akka.http.scaladsl.unmarshalling.Unmarshaller.UnsupportedContentTypeException

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Equals`, `scala.Product`

Enclosing interface:
[Unmarshaller](Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")\<[A](Unmarshaller.html "type parameter in Unmarshaller"),​[B](Unmarshaller.html "type parameter in Unmarshaller")\>

---

```
public static final class Unmarshaller.UnsupportedContentTypeException
extends java.lang.RuntimeException
implements scala.Product, java.io.Serializable
```

Signals that unmarshalling failed because the entity content\-type did not match one of the supported ranges.
 This error cannot be thrown by custom code, you need to use the `forContentTypes` modifier on a base
 [`Unmarshaller`](Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling") instead.

See Also:
[Serialized Form](../../../../serialized-form.html#akka.http.scaladsl.unmarshalling.Unmarshaller.UnsupportedContentTypeException)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[UnsupportedContentTypeException](#%3Cinit%3E(scala.collection.immutable.Set))​(scala.collection.immutable.Set<[ContentTypeRange](../model/ContentTypeRange.html "class in akka.http.scaladsl.model")> supported)` | Deprecated. for binary compatibility. |
	| `[UnsupportedContentTypeException](#%3Cinit%3E(scala.collection.immutable.Set,scala.Option))​(scala.collection.immutable.Set<[ContentTypeRange](../model/ContentTypeRange.html "class in akka.http.scaladsl.model")> supported,  scala.Option<[ContentType](../model/ContentType.html "interface in akka.http.scaladsl.model")> actualContentType)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) [Deprecated Methods](javascript:show(32);) 
	| Modifier and Type | Method | Description |
	| `scala.Option<[ContentType](../model/ContentType.html "interface in akka.http.scaladsl.model")>` | `[actualContentType](#actualContentType())()` |  |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object that)` |  |
	| `[Unmarshaller.UnsupportedContentTypeException](Unmarshaller.UnsupportedContentTypeException.html "class in akka.http.scaladsl.unmarshalling")` | `[copy](#copy(scala.collection.immutable.Set))​(scala.collection.immutable.Set<[ContentTypeRange](../model/ContentTypeRange.html "class in akka.http.scaladsl.model")> supported)` | Deprecated. for binary compatibility. |
	| `[Unmarshaller.UnsupportedContentTypeException](Unmarshaller.UnsupportedContentTypeException.html "class in akka.http.scaladsl.unmarshalling")` | `[copy](#copy(scala.collection.immutable.Set,scala.Option))​(scala.collection.immutable.Set<[ContentTypeRange](../model/ContentTypeRange.html "class in akka.http.scaladsl.model")> supported,  scala.Option<[ContentType](../model/ContentType.html "interface in akka.http.scaladsl.model")> contentType)` | Deprecated. for binary compatibility. |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object that)` |  |
	| `int` | `[productArity](#productArity())()` |  |
	| `java.lang.Object` | `[productElement](#productElement(int))​(int n)` |  |
	| `scala.collection.immutable.Set<[ContentTypeRange](../model/ContentTypeRange.html "class in akka.http.scaladsl.model")>` | `[supported](#supported())()` |  |
	
	
		- ### Methods inherited from class java.lang.Throwable
		
		
		`addSuppressed, fillInStackTrace, getCause, getLocalizedMessage, getMessage, getStackTrace, getSuppressed, initCause, printStackTrace, printStackTrace, printStackTrace, setStackTrace, toString`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Product
		
		
		`productElementName, productElementNames, productIterator, productPrefix`

- - ### Constructor Detail
	
	
	
		- #### UnsupportedContentTypeException
		
		
		
		```
		public UnsupportedContentTypeException​(scala.collection.immutable.Set<[ContentTypeRange](../model/ContentTypeRange.html "class in akka.http.scaladsl.model")> supported,
		                                       scala.Option<[ContentType](../model/ContentType.html "interface in akka.http.scaladsl.model")> actualContentType)
		```
		- #### UnsupportedContentTypeException
		
		
		
		```
		public UnsupportedContentTypeException​(scala.collection.immutable.Set<[ContentTypeRange](../model/ContentTypeRange.html "class in akka.http.scaladsl.model")> supported)
		```
		
		Deprecated.
		for binary compatibility. Since 10\.1\.9\.

	- ### Method Detail
	
	
	
		- #### supported
		
		
		
		```
		public scala.collection.immutable.Set<[ContentTypeRange](../model/ContentTypeRange.html "class in akka.http.scaladsl.model")> supported()
		```
		- #### actualContentType
		
		
		
		```
		public scala.Option<[ContentType](../model/ContentType.html "interface in akka.http.scaladsl.model")> actualContentType()
		```
		- #### copy
		
		
		
		```
		public [Unmarshaller.UnsupportedContentTypeException](Unmarshaller.UnsupportedContentTypeException.html "class in akka.http.scaladsl.unmarshalling") copy​(scala.collection.immutable.Set<[ContentTypeRange](../model/ContentTypeRange.html "class in akka.http.scaladsl.model")> supported)
		```
		
		Deprecated.
		for binary compatibility. Since 10\.1\.9\.
		- #### copy
		
		
		
		```
		public [Unmarshaller.UnsupportedContentTypeException](Unmarshaller.UnsupportedContentTypeException.html "class in akka.http.scaladsl.unmarshalling") copy​(scala.collection.immutable.Set<[ContentTypeRange](../model/ContentTypeRange.html "class in akka.http.scaladsl.model")> supported,
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

- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/ContentType.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/ContentTypeRange.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/unmarshalling/Unmarshaller.UnsupportedContentTypeException.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/unmarshalling/Unmarshaller.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/unmarshalling/package-summary.html
- https://doc.akka.io/japi/akka-http/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/unmarshalling/Unmarshaller.UnsupportedContentTypeException.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/unmarshalling/Unmarshaller.UnsupportedContentTypeException.html)*