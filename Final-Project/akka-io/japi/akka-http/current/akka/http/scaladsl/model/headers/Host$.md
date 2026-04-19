---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:35:40Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Host$.html
title: Host$
---

# Host$

## Content

Package [akka.http.scaladsl.model.headers](package-summary.html)
## Class Host$

- java.lang.Object
- - [akka.http.scaladsl.model.headers.ModeledCompanion](ModeledCompanion.html "class in akka.http.scaladsl.model.headers")\<[Host](Host.html "class in akka.http.scaladsl.model.headers")\>
	- - akka.http.scaladsl.model.headers.Host$

- All Implemented Interfaces:
`[Renderable](../../../impl/util/Renderable.html "interface in akka.http.impl.util")`, `java.io.Serializable`

---

```
public class Host$
extends [ModeledCompanion](ModeledCompanion.html "class in akka.http.scaladsl.model.headers")<[Host](Host.html "class in akka.http.scaladsl.model.headers")>
implements java.io.Serializable
```

See Also:
[Serialized Form](../../../../../serialized-form.html#akka.http.scaladsl.model.headers.Host$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [Host$](Host$.html "class in akka.http.scaladsl.model.headers")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Host$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[Host](Host.html "class in akka.http.scaladsl.model.headers")` | `[apply](#apply(akka.http.scaladsl.model.Uri.Authority))​([Uri.Authority](../Uri.Authority.html "class in akka.http.scaladsl.model") authority)` |  |
	| `[Host](Host.html "class in akka.http.scaladsl.model.headers")` | `[apply](#apply(java.lang.String))​(java.lang.String host)` |  |
	| `[Host](Host.html "class in akka.http.scaladsl.model.headers")` | `[apply](#apply(java.lang.String,int))​(java.lang.String host,  int port)` |  |
	| `[Host](Host.html "class in akka.http.scaladsl.model.headers")` | `[apply](#apply(java.net.InetSocketAddress))​(java.net.InetSocketAddress address)` |  |
	| `[Host](Host.html "class in akka.http.scaladsl.model.headers")` | `[empty](#empty())()` |  |
	
	
		- ### Methods inherited from class akka.http.scaladsl.model.headers.[ModeledCompanion](ModeledCompanion.html "class in akka.http.scaladsl.model.headers")
		
		
		`[lowercaseName](ModeledCompanion.html#lowercaseName()), [name](ModeledCompanion.html#name()), [nameFromClass](ModeledCompanion.html#nameFromClass(java.lang.Class)), [parseFromValueString](ModeledCompanion.html#parseFromValueString(java.lang.String)), [render](ModeledCompanion.html#render(R))`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [Host$](Host$.html "class in akka.http.scaladsl.model.headers") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### Host$
		
		
		
		```
		public Host$()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public [Host](Host.html "class in akka.http.scaladsl.model.headers") apply​([Uri.Authority](../Uri.Authority.html "class in akka.http.scaladsl.model") authority)
		```
		- #### apply
		
		
		
		```
		public [Host](Host.html "class in akka.http.scaladsl.model.headers") apply​(java.net.InetSocketAddress address)
		```
		- #### apply
		
		
		
		```
		public [Host](Host.html "class in akka.http.scaladsl.model.headers") apply​(java.lang.String host)
		```
		- #### apply
		
		
		
		```
		public [Host](Host.html "class in akka.http.scaladsl.model.headers") apply​(java.lang.String host,
		                  int port)
		```
		- #### empty
		
		
		
		```
		public [Host](Host.html "class in akka.http.scaladsl.model.headers") empty()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/Renderable.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/Uri.Authority.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Host$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Host.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/ModeledCompanion.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/package-summary.html
- https://doc.akka.io/japi/akka-http/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Host$.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Host$.html)*