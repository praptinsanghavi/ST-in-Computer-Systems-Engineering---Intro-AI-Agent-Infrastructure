---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:38:39Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/MissingAttributeRejection.html
title: MissingAttributeRejection
---

# MissingAttributeRejection

## Content

Package [akka.http.scaladsl.server](package-summary.html)
## Class MissingAttributeRejection\<T\>

- java.lang.Object
- - akka.http.scaladsl.server.MissingAttributeRejection\<T\>

- All Implemented Interfaces:
`[MissingAttributeRejection](../../javadsl/server/MissingAttributeRejection.html "interface in akka.http.javadsl.server")<T>`, `[Rejection](../../javadsl/server/Rejection.html "interface in akka.http.javadsl.server")`, `[Rejection](Rejection.html "interface in akka.http.scaladsl.server")`, `java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public final class MissingAttributeRejection<T>
extends java.lang.Object
implements [MissingAttributeRejection](../../javadsl/server/MissingAttributeRejection.html "interface in akka.http.javadsl.server")<T>, [Rejection](Rejection.html "interface in akka.http.scaladsl.server"), scala.Product, java.io.Serializable
```

Rejection created by attribute directives.
 Signals that the request was rejected because a required request attribute could not be found.

See Also:
[Serialized Form](../../../../serialized-form.html#akka.http.scaladsl.server.MissingAttributeRejection)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[MissingAttributeRejection](#%3Cinit%3E(akka.http.scaladsl.model.AttributeKey))​([AttributeKey](../model/AttributeKey.html "class in akka.http.scaladsl.model")<[T](MissingAttributeRejection.html "type parameter in MissingAttributeRejection")> key)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[AttributeKey](../model/AttributeKey.html "class in akka.http.scaladsl.model")<[T](MissingAttributeRejection.html "type parameter in MissingAttributeRejection")>` | `[key](#key())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface scala.Equals
		
		
		`canEqual, equals`
		- ### Methods inherited from interface scala.Product
		
		
		`productArity, productElement, productElementName, productElementNames, productIterator, productPrefix`

- - ### Constructor Detail
	
	
	
		- #### MissingAttributeRejection
		
		
		
		```
		public MissingAttributeRejection​([AttributeKey](../model/AttributeKey.html "class in akka.http.scaladsl.model")<[T](MissingAttributeRejection.html "type parameter in MissingAttributeRejection")> key)
		```

	- ### Method Detail
	
	
	
		- #### key
		
		
		
		```
		public [AttributeKey](../model/AttributeKey.html "class in akka.http.scaladsl.model")<[T](MissingAttributeRejection.html "type parameter in MissingAttributeRejection")> key()
		```
		
		
		Specified by:
		`[key](../../javadsl/server/MissingAttributeRejection.html#key())` in interface `[MissingAttributeRejection](../../javadsl/server/MissingAttributeRejection.html "interface in akka.http.javadsl.server")<[T](MissingAttributeRejection.html "type parameter in MissingAttributeRejection")>`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/MissingAttributeRejection.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/Rejection.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/AttributeKey.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/MissingAttributeRejection.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/Rejection.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/package-summary.html
- https://doc.akka.io/japi/akka-http/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/MissingAttributeRejection.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/MissingAttributeRejection.html)*