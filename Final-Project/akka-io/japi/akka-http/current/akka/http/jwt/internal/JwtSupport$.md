---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:28:27Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/jwt/internal/JwtSupport$.html
title: JwtSupport$
---

# JwtSupport$

## Content

Package [akka.http.jwt.internal](package-summary.html)
## Class JwtSupport$

- java.lang.Object
- - akka.http.jwt.internal.JwtSupport$

- ---

```
public class JwtSupport$
extends java.lang.Object
```

INTERNAL API

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [JwtSupport$](JwtSupport$.html "class in akka.http.jwt.internal")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[JwtSupport$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[JwtSupport](JwtSupport.html "interface in akka.http.jwt.internal")` | `[fromConfig](#fromConfig(com.typesafe.config.Config))​(com.typesafe.config.Config jwtConfig)` |  |
	| `java.lang.String` | `[PrivateKeyConfig](#PrivateKeyConfig())()` |  |
	| `java.lang.String` | `[PublicKeyConfig](#PublicKeyConfig())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [JwtSupport$](JwtSupport$.html "class in akka.http.jwt.internal") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### JwtSupport$
		
		
		
		```
		public JwtSupport$()
		```

	- ### Method Detail
	
	
	
		- #### PrivateKeyConfig
		
		
		
		```
		public java.lang.String PrivateKeyConfig()
		```
		- #### PublicKeyConfig
		
		
		
		```
		public java.lang.String PublicKeyConfig()
		```
		- #### fromConfig
		
		
		
		```
		public [JwtSupport](JwtSupport.html "interface in akka.http.jwt.internal") fromConfig​(com.typesafe.config.Config jwtConfig)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/jwt/internal/JwtSupport$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/jwt/internal/JwtSupport.html
- https://doc.akka.io/japi/akka-http/current/akka/http/jwt/internal/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/jwt/internal/JwtSupport$.html](https://doc.akka.io/japi/akka-http/current/akka/http/jwt/internal/JwtSupport$.html)*