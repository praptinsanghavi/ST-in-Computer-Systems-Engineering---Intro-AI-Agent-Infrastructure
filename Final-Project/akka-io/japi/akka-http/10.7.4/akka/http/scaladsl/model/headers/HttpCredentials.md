---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:22:14Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/headers/HttpCredentials.html
title: HttpCredentials
---

# HttpCredentials

## Content

Package [akka.http.scaladsl.model.headers](package-summary.html)
## Class HttpCredentials

- java.lang.Object
- - [akka.http.javadsl.model.headers.HttpCredentials](../../../javadsl/model/headers/HttpCredentials.html "class in akka.http.javadsl.model.headers")
	- - akka.http.scaladsl.model.headers.HttpCredentials

- All Implemented Interfaces:
`[Renderable](../../../impl/util/Renderable.html "interface in akka.http.impl.util")`, `[ToStringRenderable](../../../impl/util/ToStringRenderable.html "interface in akka.http.impl.util")`, `[ValueRenderable](../../../impl/util/ValueRenderable.html "interface in akka.http.impl.util")`

Direct Known Subclasses:
`[BasicHttpCredentials](../../../javadsl/model/headers/BasicHttpCredentials.html "class in akka.http.javadsl.model.headers")`, `[GenericHttpCredentials](GenericHttpCredentials.html "class in akka.http.scaladsl.model.headers")`, `[OAuth2BearerToken](../../../javadsl/model/headers/OAuth2BearerToken.html "class in akka.http.javadsl.model.headers")`

---

```
public abstract class HttpCredentials
extends [HttpCredentials](../../../javadsl/model/headers/HttpCredentials.html "class in akka.http.javadsl.model.headers")
implements [ValueRenderable](../../../impl/util/ValueRenderable.html "interface in akka.http.impl.util")
```

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[HttpCredentials](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `java.util.Map<java.lang.String,​java.lang.String>` | `[getParams](#getParams())()` | Java API |
	| `abstract scala.collection.immutable.Map<java.lang.String,​java.lang.String>` | `[params](#params())()` |  |
	| `abstract java.lang.String` | `[scheme](#scheme())()` |  |
	| `abstract java.lang.String` | `[token](#token())()` |  |
	
	
		- ### Methods inherited from class akka.http.javadsl.model.headers.[HttpCredentials](../../../javadsl/model/headers/HttpCredentials.html "class in akka.http.javadsl.model.headers")
		
		
		`[create](../../../javadsl/model/headers/HttpCredentials.html#create(java.lang.String,java.lang.String)), [create](../../../javadsl/model/headers/HttpCredentials.html#create(java.lang.String,java.lang.String,java.util.Map)), [createBasicHttpCredentials](../../../javadsl/model/headers/HttpCredentials.html#createBasicHttpCredentials(java.lang.String,java.lang.String)), [createOAuth2BearerToken](../../../javadsl/model/headers/HttpCredentials.html#createOAuth2BearerToken(java.lang.String))`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface akka.http.impl.util.[Renderable](../../../impl/util/Renderable.html "interface in akka.http.impl.util")
		
		
		`[render](../../../impl/util/Renderable.html#render(R))`
		- ### Methods inherited from interface akka.http.impl.util.[ToStringRenderable](../../../impl/util/ToStringRenderable.html "interface in akka.http.impl.util")
		
		
		`[toString](../../../impl/util/ToStringRenderable.html#toString())`
		- ### Methods inherited from interface akka.http.impl.util.[ValueRenderable](../../../impl/util/ValueRenderable.html "interface in akka.http.impl.util")
		
		
		`[value](../../../impl/util/ValueRenderable.html#value())`

- - ### Constructor Detail
	
	
	
		- #### HttpCredentials
		
		
		
		```
		public HttpCredentials()
		```

	- ### Method Detail
	
	
	
		- #### getParams
		
		
		
		```
		public java.util.Map<java.lang.String,​java.lang.String> getParams()
		```
		
		Java API
		
		Specified by:
		`[getParams](../../../javadsl/model/headers/HttpCredentials.html#getParams())` in class `[HttpCredentials](../../../javadsl/model/headers/HttpCredentials.html "class in akka.http.javadsl.model.headers")`
		- #### params
		
		
		
		```
		public abstract scala.collection.immutable.Map<java.lang.String,​java.lang.String> params()
		```
		- #### scheme
		
		
		
		```
		public abstract java.lang.String scheme()
		```
		
		
		Specified by:
		`[scheme](../../../javadsl/model/headers/HttpCredentials.html#scheme())` in class `[HttpCredentials](../../../javadsl/model/headers/HttpCredentials.html "class in akka.http.javadsl.model.headers")`
		- #### token
		
		
		
		```
		public abstract java.lang.String token()
		```
		
		
		Specified by:
		`[token](../../../javadsl/model/headers/HttpCredentials.html#token())` in class `[HttpCredentials](../../../javadsl/model/headers/HttpCredentials.html "class in akka.http.javadsl.model.headers")`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/impl/util/Renderable.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/impl/util/ToStringRenderable.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/impl/util/ValueRenderable.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/headers/BasicHttpCredentials.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/headers/HttpCredentials.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/headers/OAuth2BearerToken.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/headers/GenericHttpCredentials.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/headers/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/headers/HttpCredentials.html](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/headers/HttpCredentials.html)*