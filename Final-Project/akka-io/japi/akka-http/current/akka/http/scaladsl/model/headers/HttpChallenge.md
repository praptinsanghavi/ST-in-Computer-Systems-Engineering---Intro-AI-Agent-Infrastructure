---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:35:39Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/HttpChallenge.html
title: HttpChallenge
---

# HttpChallenge

## Content

Package [akka.http.scaladsl.model.headers](package-summary.html)
## Class HttpChallenge

- java.lang.Object
- - [akka.http.javadsl.model.headers.HttpChallenge](../../../javadsl/model/headers/HttpChallenge.html "class in akka.http.javadsl.model.headers")
	- - akka.http.scaladsl.model.headers.HttpChallenge

- All Implemented Interfaces:
`[Renderable](../../../impl/util/Renderable.html "interface in akka.http.impl.util")`, `[ToStringRenderable](../../../impl/util/ToStringRenderable.html "interface in akka.http.impl.util")`, `[ValueRenderable](../../../impl/util/ValueRenderable.html "interface in akka.http.impl.util")`, `java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public final class HttpChallenge
extends [HttpChallenge](../../../javadsl/model/headers/HttpChallenge.html "class in akka.http.javadsl.model.headers")
implements [ValueRenderable](../../../impl/util/ValueRenderable.html "interface in akka.http.impl.util"), scala.Product, java.io.Serializable
```

Note: the token of challenge is stored in the params Map as a parameter whose name is empty String("") for binary
 compatibility, but it will be parsed and rendered correctly.

See Also:
[Serialized Form](../../../../../serialized-form.html#akka.http.scaladsl.model.headers.HttpChallenge)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[HttpChallenge](#%3Cinit%3E(java.lang.String,java.lang.String,scala.collection.immutable.Map))​(java.lang.String scheme,  java.lang.String realm,  scala.collection.immutable.Map<java.lang.String,​java.lang.String> params)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [HttpChallenge](HttpChallenge.html "class in akka.http.scaladsl.model.headers")` | `[apply](#apply(java.lang.String,scala.Option))​(java.lang.String scheme,  scala.Option<java.lang.String> realm)` |  |
	| `static [HttpChallenge](HttpChallenge.html "class in akka.http.scaladsl.model.headers")` | `[apply](#apply(java.lang.String,scala.Option,scala.collection.immutable.Map))​(java.lang.String scheme,  scala.Option<java.lang.String> realm,  scala.collection.immutable.Map<java.lang.String,​java.lang.String> params)` |  |
	| `java.util.Map<java.lang.String,​java.lang.String>` | `[getParams](#getParams())()` | Java API |
	| `scala.collection.immutable.Map<java.lang.String,​java.lang.String>` | `[params](#params())()` |  |
	| `java.lang.String` | `[realm](#realm())()` |  |
	| `<R extends [Rendering](../../../impl/util/Rendering.html "interface in akka.http.impl.util")>[Rendering](../../../impl/util/Rendering.html "interface in akka.http.impl.util")` | `[render](#render(R))​(R r)` |  |
	| `java.lang.String` | `[scheme](#scheme())()` |  |
	| `static java.lang.String` | `[toString](#toString())()` |  |
	
	
		- ### Methods inherited from class akka.http.javadsl.model.headers.[HttpChallenge](../../../javadsl/model/headers/HttpChallenge.html "class in akka.http.javadsl.model.headers")
		
		
		`[create](../../../javadsl/model/headers/HttpChallenge.html#create(java.lang.String,akka.japi.Option)), [create](../../../javadsl/model/headers/HttpChallenge.html#create(java.lang.String,akka.japi.Option,java.util.Map)), [create](../../../javadsl/model/headers/HttpChallenge.html#create(java.lang.String,java.lang.String)), [create](../../../javadsl/model/headers/HttpChallenge.html#create(java.lang.String,java.lang.String,java.util.Map)), [createBasic](../../../javadsl/model/headers/HttpChallenge.html#createBasic(java.lang.String)), [createOAuth2](../../../javadsl/model/headers/HttpChallenge.html#createOAuth2(java.lang.String))`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface scala.Equals
		
		
		`canEqual, equals`
		- ### Methods inherited from interface scala.Product
		
		
		`productArity, productElement, productElementName, productElementNames, productIterator, productPrefix`
		- ### Methods inherited from interface akka.http.impl.util.[ToStringRenderable](../../../impl/util/ToStringRenderable.html "interface in akka.http.impl.util")
		
		
		`[toString](../../../impl/util/ToStringRenderable.html#toString())`
		- ### Methods inherited from interface akka.http.impl.util.[ValueRenderable](../../../impl/util/ValueRenderable.html "interface in akka.http.impl.util")
		
		
		`[value](../../../impl/util/ValueRenderable.html#value())`

- - ### Constructor Detail
	
	
	
		- #### HttpChallenge
		
		
		
		```
		public HttpChallenge​(java.lang.String scheme,
		                     java.lang.String realm,
		                     scala.collection.immutable.Map<java.lang.String,​java.lang.String> params)
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public static [HttpChallenge](HttpChallenge.html "class in akka.http.scaladsl.model.headers") apply​(java.lang.String scheme,
		                                  scala.Option<java.lang.String> realm)
		```
		- #### apply
		
		
		
		```
		public static [HttpChallenge](HttpChallenge.html "class in akka.http.scaladsl.model.headers") apply​(java.lang.String scheme,
		                                  scala.Option<java.lang.String> realm,
		                                  scala.collection.immutable.Map<java.lang.String,​java.lang.String> params)
		```
		- #### toString
		
		
		
		```
		public static java.lang.String toString()
		```
		- #### scheme
		
		
		
		```
		public java.lang.String scheme()
		```
		
		
		Specified by:
		`[scheme](../../../javadsl/model/headers/HttpChallenge.html#scheme())` in class `[HttpChallenge](../../../javadsl/model/headers/HttpChallenge.html "class in akka.http.javadsl.model.headers")`
		- #### realm
		
		
		
		```
		public java.lang.String realm()
		```
		
		
		Specified by:
		`[realm](../../../javadsl/model/headers/HttpChallenge.html#realm())` in class `[HttpChallenge](../../../javadsl/model/headers/HttpChallenge.html "class in akka.http.javadsl.model.headers")`
		- #### params
		
		
		
		```
		public scala.collection.immutable.Map<java.lang.String,​java.lang.String> params()
		```
		- #### render
		
		
		
		```
		public <R extends [Rendering](../../../impl/util/Rendering.html "interface in akka.http.impl.util")> [Rendering](../../../impl/util/Rendering.html "interface in akka.http.impl.util") render​(R r)
		```
		
		
		Specified by:
		`[render](../../../impl/util/Renderable.html#render(R))` in interface `[Renderable](../../../impl/util/Renderable.html "interface in akka.http.impl.util")`
		- #### getParams
		
		
		
		```
		public java.util.Map<java.lang.String,​java.lang.String> getParams()
		```
		
		Java API
		
		Specified by:
		`[getParams](../../../javadsl/model/headers/HttpChallenge.html#getParams())` in class `[HttpChallenge](../../../javadsl/model/headers/HttpChallenge.html "class in akka.http.javadsl.model.headers")`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/Renderable.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/Rendering.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/ToStringRenderable.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/ValueRenderable.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/headers/HttpChallenge.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/HttpChallenge.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/package-summary.html
- https://doc.akka.io/japi/akka-http/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/HttpChallenge.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/HttpChallenge.html)*