---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:45:00Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/headers/BasicHttpCredentials.html
title: BasicHttpCredentials
---

# BasicHttpCredentials

## Content

Package [akka.http.javadsl.model.headers](package-summary.html)
## Class BasicHttpCredentials

- java.lang.Object
- - [akka.http.javadsl.model.headers.HttpCredentials](HttpCredentials.html "class in akka.http.javadsl.model.headers")
	- - [akka.http.scaladsl.model.headers.HttpCredentials](../../../scaladsl/model/headers/HttpCredentials.html "class in akka.http.scaladsl.model.headers")
		- - akka.http.javadsl.model.headers.BasicHttpCredentials

- All Implemented Interfaces:
`[Renderable](../../../impl/util/Renderable.html "interface in akka.http.impl.util")`, `[ToStringRenderable](../../../impl/util/ToStringRenderable.html "interface in akka.http.impl.util")`, `[ValueRenderable](../../../impl/util/ValueRenderable.html "interface in akka.http.impl.util")`

Direct Known Subclasses:
`[BasicHttpCredentials](../../../scaladsl/model/headers/BasicHttpCredentials.html "class in akka.http.scaladsl.model.headers")`

---

```
public abstract class BasicHttpCredentials
extends [HttpCredentials](../../../scaladsl/model/headers/HttpCredentials.html "class in akka.http.scaladsl.model.headers")
```

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[BasicHttpCredentials](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `abstract java.lang.String` | `[password](#password())()` |  |
	| `abstract java.lang.String` | `[username](#username())()` |  |
	
	
		- ### Methods inherited from class akka.http.scaladsl.model.headers.[HttpCredentials](../../../scaladsl/model/headers/HttpCredentials.html "class in akka.http.scaladsl.model.headers")
		
		
		`[getParams](../../../scaladsl/model/headers/HttpCredentials.html#getParams()), [params](../../../scaladsl/model/headers/HttpCredentials.html#params()), [scheme](../../../scaladsl/model/headers/HttpCredentials.html#scheme()), [token](../../../scaladsl/model/headers/HttpCredentials.html#token())`
		- ### Methods inherited from class akka.http.javadsl.model.headers.[HttpCredentials](HttpCredentials.html "class in akka.http.javadsl.model.headers")
		
		
		`[create](HttpCredentials.html#create(java.lang.String,java.lang.String)), [create](HttpCredentials.html#create(java.lang.String,java.lang.String,java.util.Map)), [createBasicHttpCredentials](HttpCredentials.html#createBasicHttpCredentials(java.lang.String,java.lang.String)), [createOAuth2BearerToken](HttpCredentials.html#createOAuth2BearerToken(java.lang.String))`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface akka.http.impl.util.[Renderable](../../../impl/util/Renderable.html "interface in akka.http.impl.util")
		
		
		`[render](../../../impl/util/Renderable.html#render(R))`
		- ### Methods inherited from interface akka.http.impl.util.[ToStringRenderable](../../../impl/util/ToStringRenderable.html "interface in akka.http.impl.util")
		
		
		`[toString](../../../impl/util/ToStringRenderable.html#toString())`
		- ### Methods inherited from interface akka.http.impl.util.[ValueRenderable](../../../impl/util/ValueRenderable.html "interface in akka.http.impl.util")
		
		
		`[value](../../../impl/util/ValueRenderable.html#value())`

- - ### Constructor Detail
	
	
	
		- #### BasicHttpCredentials
		
		
		
		```
		public BasicHttpCredentials()
		```

	- ### Method Detail
	
	
	
		- #### username
		
		
		
		```
		public abstract java.lang.String username()
		```
		- #### password
		
		
		
		```
		public abstract java.lang.String password()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/Renderable.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/ToStringRenderable.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/ValueRenderable.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/headers/HttpCredentials.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/headers/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/BasicHttpCredentials.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/HttpCredentials.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/headers/BasicHttpCredentials.html](https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/headers/BasicHttpCredentials.html)*