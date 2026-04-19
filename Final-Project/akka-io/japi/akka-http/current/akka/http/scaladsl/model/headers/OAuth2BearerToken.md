---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:36:46Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/OAuth2BearerToken.html
title: OAuth2BearerToken
---

# OAuth2BearerToken

## Content

Package [akka.http.scaladsl.model.headers](package-summary.html)
## Class OAuth2BearerToken

- java.lang.Object
- - [akka.http.javadsl.model.headers.HttpCredentials](../../../javadsl/model/headers/HttpCredentials.html "class in akka.http.javadsl.model.headers")
	- - [akka.http.scaladsl.model.headers.HttpCredentials](HttpCredentials.html "class in akka.http.scaladsl.model.headers")
		- - [akka.http.javadsl.model.headers.OAuth2BearerToken](../../../javadsl/model/headers/OAuth2BearerToken.html "class in akka.http.javadsl.model.headers")
			- - akka.http.scaladsl.model.headers.OAuth2BearerToken

- All Implemented Interfaces:
`[Renderable](../../../impl/util/Renderable.html "interface in akka.http.impl.util")`, `[ToStringRenderable](../../../impl/util/ToStringRenderable.html "interface in akka.http.impl.util")`, `[ValueRenderable](../../../impl/util/ValueRenderable.html "interface in akka.http.impl.util")`, `java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public final class OAuth2BearerToken
extends [OAuth2BearerToken](../../../javadsl/model/headers/OAuth2BearerToken.html "class in akka.http.javadsl.model.headers")
implements scala.Product, java.io.Serializable
```

See Also:
[Serialized Form](../../../../../serialized-form.html#akka.http.scaladsl.model.headers.OAuth2BearerToken)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[OAuth2BearerToken](#%3Cinit%3E(java.lang.String))​(java.lang.String token)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `abstract static R` | `[apply](#apply(T1))​(T1 v1)` |  |
	| `scala.collection.immutable.Map<java.lang.String,​java.lang.String>` | `[params](#params())()` |  |
	| `<R extends [Rendering](../../../impl/util/Rendering.html "interface in akka.http.impl.util")>[Rendering](../../../impl/util/Rendering.html "interface in akka.http.impl.util")` | `[render](#render(R))​(R r)` |  |
	| `java.lang.String` | `[scheme](#scheme())()` |  |
	| `java.lang.String` | `[token](#token())()` |  |
	| `static java.lang.String` | `[toString](#toString())()` |  |
	
	
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
	
	
	
		- #### OAuth2BearerToken
		
		
		
		```
		public OAuth2BearerToken​(java.lang.String token)
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
		- #### token
		
		
		
		```
		public java.lang.String token()
		```
		
		
		Specified by:
		`[token](../../../javadsl/model/headers/OAuth2BearerToken.html#token())` in class `[OAuth2BearerToken](../../../javadsl/model/headers/OAuth2BearerToken.html "class in akka.http.javadsl.model.headers")`
		- #### render
		
		
		
		```
		public <R extends [Rendering](../../../impl/util/Rendering.html "interface in akka.http.impl.util")> [Rendering](../../../impl/util/Rendering.html "interface in akka.http.impl.util") render​(R r)
		```
		
		
		Specified by:
		`[render](../../../impl/util/Renderable.html#render(R))` in interface `[Renderable](../../../impl/util/Renderable.html "interface in akka.http.impl.util")`
		- #### scheme
		
		
		
		```
		public java.lang.String scheme()
		```
		
		
		Specified by:
		`[scheme](HttpCredentials.html#scheme())` in class `[HttpCredentials](HttpCredentials.html "class in akka.http.scaladsl.model.headers")`
		- #### params
		
		
		
		```
		public scala.collection.immutable.Map<java.lang.String,​java.lang.String> params()
		```
		
		
		Specified by:
		`[params](HttpCredentials.html#params())` in class `[HttpCredentials](HttpCredentials.html "class in akka.http.scaladsl.model.headers")`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/Renderable.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/Rendering.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/ToStringRenderable.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/ValueRenderable.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/headers/HttpCredentials.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/headers/OAuth2BearerToken.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/HttpCredentials.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/package-summary.html
- https://doc.akka.io/japi/akka-http/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/OAuth2BearerToken.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/OAuth2BearerToken.html)*