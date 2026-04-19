---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:41:14Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/HttpProtocol.html
title: HttpProtocol
---

# HttpProtocol

## Content

Package [akka.http.scaladsl.model](package-summary.html)
## Class HttpProtocol

- java.lang.Object
- - [akka.http.javadsl.model.HttpProtocol](../../javadsl/model/HttpProtocol.html "class in akka.http.javadsl.model")
	- - akka.http.scaladsl.model.HttpProtocol

- All Implemented Interfaces:
`[Renderable](../../impl/util/Renderable.html "interface in akka.http.impl.util")`, `[SingletonValueRenderable](../../impl/util/SingletonValueRenderable.html "interface in akka.http.impl.util")`, `java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public final class HttpProtocol
extends [HttpProtocol](../../javadsl/model/HttpProtocol.html "class in akka.http.javadsl.model")
implements [SingletonValueRenderable](../../impl/util/SingletonValueRenderable.html "interface in akka.http.impl.util"), scala.Product, java.io.Serializable
```

The protocol of an HTTP message

See Also:
[Serialized Form](../../../../serialized-form.html#akka.http.scaladsl.model.HttpProtocol)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[HttpProtocol](#%3Cinit%3E(java.lang.String))​(java.lang.String value)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `abstract static R` | `[apply](#apply(T1))​(T1 v1)` |  |
	| `static java.lang.String` | `[toString](#toString())()` |  |
	| `java.lang.String` | `[value](#value())()` | Returns the String representation of this protocol. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface scala.Equals
		
		
		`canEqual, equals`
		- ### Methods inherited from interface scala.Product
		
		
		`productArity, productElement, productElementName, productElementNames, productIterator, productPrefix`
		- ### Methods inherited from interface akka.http.impl.util.[SingletonValueRenderable](../../impl/util/SingletonValueRenderable.html "interface in akka.http.impl.util")
		
		
		`[render](../../impl/util/SingletonValueRenderable.html#render(R))`

- - ### Constructor Detail
	
	
	
		- #### HttpProtocol
		
		
		
		```
		public HttpProtocol​(java.lang.String value)
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public abstract static R apply​(T1 v1)
		```
		- #### toString
		
		
		
		```
		public static java.lang.String toString()
		```
		- #### value
		
		
		
		```
		public java.lang.String value()
		```
		
		Description copied from class: `[HttpProtocol](../../javadsl/model/HttpProtocol.html#value())`
		Returns the String representation of this protocol.
		
		Specified by:
		`[value](../../impl/util/SingletonValueRenderable.html#value())` in interface `[SingletonValueRenderable](../../impl/util/SingletonValueRenderable.html "interface in akka.http.impl.util")`
		Specified by:
		`[value](../../javadsl/model/HttpProtocol.html#value())` in class `[HttpProtocol](../../javadsl/model/HttpProtocol.html "class in akka.http.javadsl.model")`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/impl/util/Renderable.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/impl/util/SingletonValueRenderable.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/HttpProtocol.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/package-summary.html
- https://doc.akka.io/japi/akka-http/10.7.4/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/HttpProtocol.html](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/HttpProtocol.html)*