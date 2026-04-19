---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:34:37Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/BasicHttpCredentials.html
title: BasicHttpCredentials
---

# BasicHttpCredentials

## Content

Package [akka.http.scaladsl.model.headers](package-summary.html)
## Class BasicHttpCredentials

- java.lang.Object
- - [akka.http.javadsl.model.headers.HttpCredentials](../../../javadsl/model/headers/HttpCredentials.html "class in akka.http.javadsl.model.headers")
	- - [akka.http.scaladsl.model.headers.HttpCredentials](HttpCredentials.html "class in akka.http.scaladsl.model.headers")
		- - [akka.http.javadsl.model.headers.BasicHttpCredentials](../../../javadsl/model/headers/BasicHttpCredentials.html "class in akka.http.javadsl.model.headers")
			- - akka.http.scaladsl.model.headers.BasicHttpCredentials

- All Implemented Interfaces:
`[Renderable](../../../impl/util/Renderable.html "interface in akka.http.impl.util")`, `[ToStringRenderable](../../../impl/util/ToStringRenderable.html "interface in akka.http.impl.util")`, `[ValueRenderable](../../../impl/util/ValueRenderable.html "interface in akka.http.impl.util")`, `java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public final class BasicHttpCredentials
extends [BasicHttpCredentials](../../../javadsl/model/headers/BasicHttpCredentials.html "class in akka.http.javadsl.model.headers")
implements scala.Product, java.io.Serializable
```

See Also:
[Serialized Form](../../../../../serialized-form.html#akka.http.scaladsl.model.headers.BasicHttpCredentials)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[BasicHttpCredentials](#%3Cinit%3E(java.lang.String,java.lang.String))​(java.lang.String username,  java.lang.String password)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [BasicHttpCredentials](BasicHttpCredentials.html "class in akka.http.scaladsl.model.headers")` | `[apply](#apply(java.lang.String))​(java.lang.String credentials)` |  |
	| `char[]` | `[cookie](#cookie())()` |  |
	| `scala.collection.immutable.Map<java.lang.String,​java.lang.String>` | `[params](#params())()` |  |
	| `java.lang.String` | `[password](#password())()` |  |
	| `<R extends [Rendering](../../../impl/util/Rendering.html "interface in akka.http.impl.util")>[Rendering](../../../impl/util/Rendering.html "interface in akka.http.impl.util")` | `[render](#render(R))​(R r)` |  |
	| `java.lang.String` | `[scheme](#scheme())()` |  |
	| `java.lang.String` | `[token](#token())()` |  |
	| `java.lang.String` | `[username](#username())()` |  |
	
	
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
	
	
	
		- #### BasicHttpCredentials
		
		
		
		```
		public BasicHttpCredentials​(java.lang.String username,
		                            java.lang.String password)
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public static [BasicHttpCredentials](BasicHttpCredentials.html "class in akka.http.scaladsl.model.headers") apply​(java.lang.String credentials)
		```
		- #### username
		
		
		
		```
		public java.lang.String username()
		```
		
		
		Specified by:
		`[username](../../../javadsl/model/headers/BasicHttpCredentials.html#username())` in class `[BasicHttpCredentials](../../../javadsl/model/headers/BasicHttpCredentials.html "class in akka.http.javadsl.model.headers")`
		- #### password
		
		
		
		```
		public java.lang.String password()
		```
		
		
		Specified by:
		`[password](../../../javadsl/model/headers/BasicHttpCredentials.html#password())` in class `[BasicHttpCredentials](../../../javadsl/model/headers/BasicHttpCredentials.html "class in akka.http.javadsl.model.headers")`
		- #### cookie
		
		
		
		```
		public char[] cookie()
		```
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

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/Renderable.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/Rendering.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/ToStringRenderable.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/ValueRenderable.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/headers/BasicHttpCredentials.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/headers/HttpCredentials.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/BasicHttpCredentials.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/HttpCredentials.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/package-summary.html
- https://doc.akka.io/japi/akka-http/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/BasicHttpCredentials.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/BasicHttpCredentials.html)*