---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:29:56Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/marshalling/Marshal$.html
title: Marshal$
---

# Marshal$

## Content

Package [akka.http.scaladsl.marshalling](package-summary.html)
## Class Marshal$

- java.lang.Object
- - akka.http.scaladsl.marshalling.Marshal$

- ---

```
public class Marshal$
extends java.lang.Object
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [Marshal$](Marshal$.html "class in akka.http.scaladsl.marshalling")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Marshal$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<T> [Marshal](Marshal.html "class in akka.http.scaladsl.marshalling")<T>` | `[apply](#apply(T))​(T value)` |  |
	| `<T> scala.Option<scala.Function0<T>>` | `[selectMarshallingForContentType](#selectMarshallingForContentType(scala.collection.immutable.Seq,akka.http.scaladsl.model.ContentType))​(scala.collection.immutable.Seq<[Marshalling](Marshalling.html "interface in akka.http.scaladsl.marshalling")<T>> marshallings,  [ContentType](../model/ContentType.html "interface in akka.http.scaladsl.model") contentType)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [Marshal$](Marshal$.html "class in akka.http.scaladsl.marshalling") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### Marshal$
		
		
		
		```
		public Marshal$()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public <T> [Marshal](Marshal.html "class in akka.http.scaladsl.marshalling")<T> apply​(T value)
		```
		- #### selectMarshallingForContentType
		
		
		
		```
		public <T> scala.Option<scala.Function0<T>> selectMarshallingForContentType​(scala.collection.immutable.Seq<[Marshalling](Marshalling.html "interface in akka.http.scaladsl.marshalling")<T>> marshallings,
		                                                                            [ContentType](../model/ContentType.html "interface in akka.http.scaladsl.model") contentType)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/marshalling/Marshal$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/marshalling/Marshal.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/marshalling/Marshalling.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/marshalling/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/ContentType.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/marshalling/Marshal$.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/marshalling/Marshal$.html)*