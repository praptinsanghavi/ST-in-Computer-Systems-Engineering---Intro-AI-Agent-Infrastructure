---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:37:42Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/WWW$minusAuthenticate$.html
title: WWW$minusAuthenticate$
---

# WWW$minusAuthenticate$

## Content

Package [akka.http.scaladsl.model.headers](package-summary.html)
## Class WWW$minusAuthenticate$

- java.lang.Object
- - [akka.http.scaladsl.model.headers.ModeledCompanion](ModeledCompanion.html "class in akka.http.scaladsl.model.headers")\<[WWW$minusAuthenticate](WWW$minusAuthenticate.html "class in akka.http.scaladsl.model.headers")\>
	- - akka.http.scaladsl.model.headers.WWW$minusAuthenticate$

- All Implemented Interfaces:
`[Renderable](../../../impl/util/Renderable.html "interface in akka.http.impl.util")`, `java.io.Serializable`

---

```
public class WWW$minusAuthenticate$
extends [ModeledCompanion](ModeledCompanion.html "class in akka.http.scaladsl.model.headers")<[WWW$minusAuthenticate](WWW$minusAuthenticate.html "class in akka.http.scaladsl.model.headers")>
implements java.io.Serializable
```

See Also:
[Serialized Form](../../../../../serialized-form.html#akka.http.scaladsl.model.headers.WWW$minusAuthenticate$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [WWW$minusAuthenticate$](WWW$minusAuthenticate$.html "class in akka.http.scaladsl.model.headers")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[WWW$minusAuthenticate$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[WWW$minusAuthenticate](WWW$minusAuthenticate.html "class in akka.http.scaladsl.model.headers")` | `[apply](#apply(akka.http.scaladsl.model.headers.HttpChallenge,scala.collection.immutable.Seq))​([HttpChallenge](HttpChallenge.html "class in akka.http.scaladsl.model.headers") first,  scala.collection.immutable.Seq<[HttpChallenge](HttpChallenge.html "class in akka.http.scaladsl.model.headers")> more)` |  |
	| `[Renderer](../../../impl/util/Renderer.html "interface in akka.http.impl.util")<scala.collection.immutable.Iterable<[HttpChallenge](HttpChallenge.html "class in akka.http.scaladsl.model.headers")>>` | `[challengesRenderer](#challengesRenderer())()` |  |
	
	
		- ### Methods inherited from class akka.http.scaladsl.model.headers.[ModeledCompanion](ModeledCompanion.html "class in akka.http.scaladsl.model.headers")
		
		
		`[lowercaseName](ModeledCompanion.html#lowercaseName()), [name](ModeledCompanion.html#name()), [nameFromClass](ModeledCompanion.html#nameFromClass(java.lang.Class)), [parseFromValueString](ModeledCompanion.html#parseFromValueString(java.lang.String)), [render](ModeledCompanion.html#render(R))`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [WWW$minusAuthenticate$](WWW$minusAuthenticate$.html "class in akka.http.scaladsl.model.headers") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### WWW$minusAuthenticate$
		
		
		
		```
		public WWW$minusAuthenticate$()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public [WWW$minusAuthenticate](WWW$minusAuthenticate.html "class in akka.http.scaladsl.model.headers") apply​([HttpChallenge](HttpChallenge.html "class in akka.http.scaladsl.model.headers") first,
		                                   scala.collection.immutable.Seq<[HttpChallenge](HttpChallenge.html "class in akka.http.scaladsl.model.headers")> more)
		```
		- #### challengesRenderer
		
		
		
		```
		public [Renderer](../../../impl/util/Renderer.html "interface in akka.http.impl.util")<scala.collection.immutable.Iterable<[HttpChallenge](HttpChallenge.html "class in akka.http.scaladsl.model.headers")>> challengesRenderer()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/Renderable.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/Renderer.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/HttpChallenge.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/ModeledCompanion.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/WWW$minusAuthenticate$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/WWW$minusAuthenticate.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/package-summary.html
- https://doc.akka.io/japi/akka-http/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/WWW$minusAuthenticate$.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/WWW$minusAuthenticate$.html)*