---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:11:13Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/RemoteAddress.html
title: RemoteAddress
---

# RemoteAddress

## Content

Package [akka.http.scaladsl.model](package-summary.html)
## Class RemoteAddress

- java.lang.Object
- - [akka.http.javadsl.model.RemoteAddress](../../javadsl/model/RemoteAddress.html "class in akka.http.javadsl.model")
	- - akka.http.scaladsl.model.RemoteAddress

- All Implemented Interfaces:
`[Renderable](../../impl/util/Renderable.html "interface in akka.http.impl.util")`, `[ToStringRenderable](../../impl/util/ToStringRenderable.html "interface in akka.http.impl.util")`, `[ValueRenderable](../../impl/util/ValueRenderable.html "interface in akka.http.impl.util")`

Direct Known Subclasses:
`[RemoteAddress.IP](RemoteAddress.IP.html "class in akka.http.scaladsl.model")`, `[RemoteAddress.Unknown$](RemoteAddress.Unknown$.html "class in akka.http.scaladsl.model")`

---

```
public abstract class RemoteAddress
extends [RemoteAddress](../../javadsl/model/RemoteAddress.html "class in akka.http.javadsl.model")
implements [ValueRenderable](../../impl/util/ValueRenderable.html "interface in akka.http.impl.util")
```

- - ### Nested Class Summary
	
	
	
	Nested Classes 
	| Modifier and Type | Class | Description |
	| `static class` | `[RemoteAddress.IP](RemoteAddress.IP.html "class in akka.http.scaladsl.model")` |  |
	| `static class` | `[RemoteAddress.IP$](RemoteAddress.IP$.html "class in akka.http.scaladsl.model")` |  |
	| `static class` | `[RemoteAddress.Unknown$](RemoteAddress.Unknown$.html "class in akka.http.scaladsl.model")` |  |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[RemoteAddress](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [RemoteAddress](RemoteAddress.html "class in akka.http.scaladsl.model")` | `[apply](#apply(byte%5B%5D))​(byte[] bytes)` |  |
	| `static [RemoteAddress.IP](RemoteAddress.IP.html "class in akka.http.scaladsl.model")` | `[apply](#apply(java.net.InetAddress,scala.Option))​(java.net.InetAddress a,  scala.Option<java.lang.Object> port)` |  |
	| `static [RemoteAddress.IP](RemoteAddress.IP.html "class in akka.http.scaladsl.model")` | `[apply](#apply(java.net.InetSocketAddress))​(java.net.InetSocketAddress a)` |  |
	| `java.util.Optional<java.net.InetAddress>` | `[getAddress](#getAddress())()` | Java API |
	| `int` | `[getPort](#getPort())()` | Java API |
	| `abstract boolean` | `[isUnknown](#isUnknown())()` |  |
	| `static java.lang.Object` | `[renderWithoutPort](#renderWithoutPort())()` |  |
	| `abstract scala.Option<[RemoteAddress.IP](RemoteAddress.IP.html "class in akka.http.scaladsl.model")>` | `[toIP](#toIP())()` |  |
	| `abstract scala.Option<java.net.InetAddress>` | `[toOption](#toOption())()` |  |
	
	
		- ### Methods inherited from class akka.http.javadsl.model.[RemoteAddress](../../javadsl/model/RemoteAddress.html "class in akka.http.javadsl.model")
		
		
		`[create](../../javadsl/model/RemoteAddress.html#create(byte%5B%5D)), [create](../../javadsl/model/RemoteAddress.html#create(java.net.InetAddress)), [create](../../javadsl/model/RemoteAddress.html#create(java.net.InetSocketAddress))`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface akka.http.impl.util.[Renderable](../../impl/util/Renderable.html "interface in akka.http.impl.util")
		
		
		`[render](../../impl/util/Renderable.html#render(R))`
		- ### Methods inherited from interface akka.http.impl.util.[ToStringRenderable](../../impl/util/ToStringRenderable.html "interface in akka.http.impl.util")
		
		
		`[toString](../../impl/util/ToStringRenderable.html#toString())`
		- ### Methods inherited from interface akka.http.impl.util.[ValueRenderable](../../impl/util/ValueRenderable.html "interface in akka.http.impl.util")
		
		
		`[value](../../impl/util/ValueRenderable.html#value())`

- - ### Constructor Detail
	
	
	
		- #### RemoteAddress
		
		
		
		```
		public RemoteAddress()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public static [RemoteAddress.IP](RemoteAddress.IP.html "class in akka.http.scaladsl.model") apply​(java.net.InetAddress a,
		                                     scala.Option<java.lang.Object> port)
		```
		- #### apply
		
		
		
		```
		public static [RemoteAddress.IP](RemoteAddress.IP.html "class in akka.http.scaladsl.model") apply​(java.net.InetSocketAddress a)
		```
		- #### apply
		
		
		
		```
		public static [RemoteAddress](RemoteAddress.html "class in akka.http.scaladsl.model") apply​(byte[] bytes)
		```
		- #### renderWithoutPort
		
		
		
		```
		public static java.lang.Object renderWithoutPort()
		```
		- #### toOption
		
		
		
		```
		public abstract scala.Option<java.net.InetAddress> toOption()
		```
		- #### toIP
		
		
		
		```
		public abstract scala.Option<[RemoteAddress.IP](RemoteAddress.IP.html "class in akka.http.scaladsl.model")> toIP()
		```
		- #### isUnknown
		
		
		
		```
		public abstract boolean isUnknown()
		```
		
		
		Specified by:
		`[isUnknown](../../javadsl/model/RemoteAddress.html#isUnknown())` in class `[RemoteAddress](../../javadsl/model/RemoteAddress.html "class in akka.http.javadsl.model")`
		- #### getAddress
		
		
		
		```
		public java.util.Optional<java.net.InetAddress> getAddress()
		```
		
		Java API
		
		Specified by:
		`[getAddress](../../javadsl/model/RemoteAddress.html#getAddress())` in class `[RemoteAddress](../../javadsl/model/RemoteAddress.html "class in akka.http.javadsl.model")`
		- #### getPort
		
		
		
		```
		public int getPort()
		```
		
		Java API
		
		Specified by:
		`[getPort](../../javadsl/model/RemoteAddress.html#getPort())` in class `[RemoteAddress](../../javadsl/model/RemoteAddress.html "class in akka.http.javadsl.model")`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/impl/util/Renderable.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/impl/util/ToStringRenderable.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/impl/util/ValueRenderable.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/RemoteAddress.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/RemoteAddress.IP$.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/RemoteAddress.IP.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/RemoteAddress.Unknown$.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/RemoteAddress.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/RemoteAddress.html](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/RemoteAddress.html)*