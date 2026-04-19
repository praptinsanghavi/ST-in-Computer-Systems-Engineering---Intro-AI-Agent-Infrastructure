---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:59:58Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/headers/GenericHttpCredentials.html
title: GenericHttpCredentials
---

# GenericHttpCredentials

## Content

Package [akka.http.scaladsl.model.headers](package-summary.html)
## Class GenericHttpCredentials

- java.lang.Object
- - [akka.http.javadsl.model.headers.HttpCredentials](../../../javadsl/model/headers/HttpCredentials.html "class in akka.http.javadsl.model.headers")
	- - [akka.http.scaladsl.model.headers.HttpCredentials](HttpCredentials.html "class in akka.http.scaladsl.model.headers")
		- - akka.http.scaladsl.model.headers.GenericHttpCredentials

- All Implemented Interfaces:
`[Renderable](../../../impl/util/Renderable.html "interface in akka.http.impl.util")`, `[ToStringRenderable](../../../impl/util/ToStringRenderable.html "interface in akka.http.impl.util")`, `[ValueRenderable](../../../impl/util/ValueRenderable.html "interface in akka.http.impl.util")`, `java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public final class GenericHttpCredentials
extends [HttpCredentials](HttpCredentials.html "class in akka.http.scaladsl.model.headers")
implements scala.Product, java.io.Serializable
```

See Also:
[Serialized Form](../../../../../serialized-form.html#akka.http.scaladsl.model.headers.GenericHttpCredentials)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[GenericHttpCredentials](#%3Cinit%3E(java.lang.String,java.lang.String,scala.collection.immutable.Map))​(java.lang.String scheme,  java.lang.String token,  scala.collection.immutable.Map<java.lang.String,​java.lang.String> params)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [GenericHttpCredentials](GenericHttpCredentials.html "class in akka.http.scaladsl.model.headers")` | `[apply](#apply(java.lang.String,scala.collection.immutable.Map))​(java.lang.String scheme,  scala.collection.immutable.Map<java.lang.String,​java.lang.String> params)` |  |
	| `scala.collection.immutable.Map<java.lang.String,​java.lang.String>` | `[params](#params())()` |  |
	| `<R extends [Rendering](../../../impl/util/Rendering.html "interface in akka.http.impl.util")>[Rendering](../../../impl/util/Rendering.html "interface in akka.http.impl.util")` | `[render](#render(R))​(R r)` |  |
	| `java.lang.String` | `[scheme](#scheme())()` |  |
	| `java.lang.String` | `[token](#token())()` |  |
	
	
		- ### Methods inherited from class akka.http.scaladsl.model.headers.[HttpCredentials](HttpCredentials.html "class in akka.http.scaladsl.model.headers")
		
		
		`[getParams](HttpCredentials.html#getParams())`
		- ### Methods inherited from class akka.http.javadsl.model.headers.[HttpCredentials](../../../javadsl/model/headers/HttpCredentials.html "class in akka.http.javadsl.model.headers")
		
		
		`[create](../../../javadsl/model/headers/HttpCredentials.html#create(java.lang.String,java.lang.String)), [create](../../../javadsl/model/headers/HttpCredentials.html#create(java.lang.String,java.lang.String,java.util.Map)), [createBasicHttpCredentials](../../../javadsl/model/headers/HttpCredentials.html#createBasicHttpCredentials(java.lang.String,java.lang.String)), [createOAuth2BearerToken](../../../javadsl/model/headers/HttpCredentials.html#createOAuth2BearerToken(java.lang.String))`
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
	
	
	
		- #### GenericHttpCredentials
		
		
		
		```
		public GenericHttpCredentials​(java.lang.String scheme,
		                              java.lang.String token,
		                              scala.collection.immutable.Map<java.lang.String,​java.lang.String> params)
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public static [GenericHttpCredentials](GenericHttpCredentials.html "class in akka.http.scaladsl.model.headers") apply​(java.lang.String scheme,
		                                           scala.collection.immutable.Map<java.lang.String,​java.lang.String> params)
		```
		- #### scheme
		
		
		
		```
		public java.lang.String scheme()
		```
		
		
		Specified by:
		`[scheme](HttpCredentials.html#scheme())` in class `[HttpCredentials](HttpCredentials.html "class in akka.http.scaladsl.model.headers")`
		- #### token
		
		
		
		```
		public java.lang.String token()
		```
		
		
		Specified by:
		`[token](HttpCredentials.html#token())` in class `[HttpCredentials](HttpCredentials.html "class in akka.http.scaladsl.model.headers")`
		- #### params
		
		
		
		```
		public scala.collection.immutable.Map<java.lang.String,​java.lang.String> params()
		```
		
		
		Specified by:
		`[params](HttpCredentials.html#params())` in class `[HttpCredentials](HttpCredentials.html "class in akka.http.scaladsl.model.headers")`
		- #### render
		
		
		
		```
		public <R extends [Rendering](../../../impl/util/Rendering.html "interface in akka.http.impl.util")> [Rendering](../../../impl/util/Rendering.html "interface in akka.http.impl.util") render​(R r)
		```
		
		
		Specified by:
		`[render](../../../impl/util/Renderable.html#render(R))` in interface `[Renderable](../../../impl/util/Renderable.html "interface in akka.http.impl.util")`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/impl/util/Renderable.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/impl/util/Rendering.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/impl/util/ToStringRenderable.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/impl/util/ValueRenderable.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/headers/HttpCredentials.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/headers/GenericHttpCredentials.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/headers/HttpCredentials.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/headers/package-summary.html
- https://doc.akka.io/japi/akka-http/10.7.4/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/headers/GenericHttpCredentials.html](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/headers/GenericHttpCredentials.html)*