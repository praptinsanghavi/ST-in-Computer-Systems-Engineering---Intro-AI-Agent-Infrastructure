---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:32:28Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/RemoteAddress.Unknown$.html
title: RemoteAddress.Unknown$
---

# RemoteAddress.Unknown$

## Content

Package [akka.http.scaladsl.model](package-summary.html)
## Class RemoteAddress.Unknown$

- java.lang.Object
- - [akka.http.javadsl.model.RemoteAddress](../../javadsl/model/RemoteAddress.html "class in akka.http.javadsl.model")
	- - [akka.http.scaladsl.model.RemoteAddress](RemoteAddress.html "class in akka.http.scaladsl.model")
		- - akka.http.scaladsl.model.RemoteAddress.Unknown$

- All Implemented Interfaces:
`[Renderable](../../impl/util/Renderable.html "interface in akka.http.impl.util")`, `[ToStringRenderable](../../impl/util/ToStringRenderable.html "interface in akka.http.impl.util")`, `[ValueRenderable](../../impl/util/ValueRenderable.html "interface in akka.http.impl.util")`, `java.io.Serializable`, `scala.Equals`, `scala.Product`

Enclosing class:
[RemoteAddress](RemoteAddress.html "class in akka.http.scaladsl.model")

---

```
public static class RemoteAddress.Unknown$
extends [RemoteAddress](RemoteAddress.html "class in akka.http.scaladsl.model")
implements scala.Product, java.io.Serializable
```

See Also:
[Serialized Form](../../../../serialized-form.html#akka.http.scaladsl.model.RemoteAddress.Unknown$)

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from class akka.http.scaladsl.model.[RemoteAddress](RemoteAddress.html "class in akka.http.scaladsl.model")
		
		
		`[RemoteAddress.IP](RemoteAddress.IP.html "class in akka.http.scaladsl.model"), [RemoteAddress.IP$](RemoteAddress.IP$.html "class in akka.http.scaladsl.model"), [RemoteAddress.Unknown$](RemoteAddress.Unknown$.html "class in akka.http.scaladsl.model")`

	- ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [RemoteAddress.Unknown$](RemoteAddress.Unknown$.html "class in akka.http.scaladsl.model")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Unknown$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `boolean` | `[isUnknown](#isUnknown())()` |  |
	| `<R extends [Rendering](../../impl/util/Rendering.html "interface in akka.http.impl.util")>[Rendering](../../impl/util/Rendering.html "interface in akka.http.impl.util")` | `[render](#render(R))​(R r)` |  |
	| `scala.None$` | `[toIP](#toIP())()` |  |
	| `scala.None$` | `[toOption](#toOption())()` |  |
	
	
		- ### Methods inherited from class akka.http.scaladsl.model.[RemoteAddress](RemoteAddress.html "class in akka.http.scaladsl.model")
		
		
		`[apply](RemoteAddress.html#apply(byte%5B%5D)), [apply](RemoteAddress.html#apply(java.net.InetAddress,scala.Option)), [apply](RemoteAddress.html#apply(java.net.InetSocketAddress)), [getAddress](RemoteAddress.html#getAddress()), [getPort](RemoteAddress.html#getPort()), [renderWithoutPort](RemoteAddress.html#renderWithoutPort())`
		- ### Methods inherited from class akka.http.javadsl.model.[RemoteAddress](../../javadsl/model/RemoteAddress.html "class in akka.http.javadsl.model")
		
		
		`[create](../../javadsl/model/RemoteAddress.html#create(byte%5B%5D)), [create](../../javadsl/model/RemoteAddress.html#create(java.net.InetAddress)), [create](../../javadsl/model/RemoteAddress.html#create(java.net.InetSocketAddress))`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface scala.Equals
		
		
		`canEqual, equals`
		- ### Methods inherited from interface scala.Product
		
		
		`productArity, productElement, productElementName, productElementNames, productIterator, productPrefix`
		- ### Methods inherited from interface akka.http.impl.util.[ToStringRenderable](../../impl/util/ToStringRenderable.html "interface in akka.http.impl.util")
		
		
		`[toString](../../impl/util/ToStringRenderable.html#toString())`
		- ### Methods inherited from interface akka.http.impl.util.[ValueRenderable](../../impl/util/ValueRenderable.html "interface in akka.http.impl.util")
		
		
		`[value](../../impl/util/ValueRenderable.html#value())`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [RemoteAddress.Unknown$](RemoteAddress.Unknown$.html "class in akka.http.scaladsl.model") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### Unknown$
		
		
		
		```
		public Unknown$()
		```

	- ### Method Detail
	
	
	
		- #### toOption
		
		
		
		```
		public scala.None$ toOption()
		```
		- #### toIP
		
		
		
		```
		public scala.None$ toIP()
		```
		- #### render
		
		
		
		```
		public <R extends [Rendering](../../impl/util/Rendering.html "interface in akka.http.impl.util")> [Rendering](../../impl/util/Rendering.html "interface in akka.http.impl.util") render​(R r)
		```
		
		
		Specified by:
		`[render](../../impl/util/Renderable.html#render(R))` in interface `[Renderable](../../impl/util/Renderable.html "interface in akka.http.impl.util")`
		- #### isUnknown
		
		
		
		```
		public boolean isUnknown()
		```
		
		
		Specified by:
		`[isUnknown](RemoteAddress.html#isUnknown())` in class `[RemoteAddress](RemoteAddress.html "class in akka.http.scaladsl.model")`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/Renderable.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/Rendering.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/ToStringRenderable.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/ValueRenderable.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/RemoteAddress.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/RemoteAddress.IP$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/RemoteAddress.IP.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/RemoteAddress.Unknown$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/RemoteAddress.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/package-summary.html
- https://doc.akka.io/japi/akka-http/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/RemoteAddress.Unknown$.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/RemoteAddress.Unknown$.html)*