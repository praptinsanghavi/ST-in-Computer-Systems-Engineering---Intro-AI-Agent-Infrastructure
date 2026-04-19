---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:28:15Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/jwt/internal/JwtKeyLoader$.html
title: JwtKeyLoader$
---

# JwtKeyLoader$

## Content

Package [akka.http.jwt.internal](package-summary.html)
## Class JwtKeyLoader$

- java.lang.Object
- - akka.http.jwt.internal.JwtKeyLoader$

- ---

```
public class JwtKeyLoader$
extends java.lang.Object
```

INTERNAL API
 
 Loads a key from a directory.

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [JwtKeyLoader$](JwtKeyLoader$.html "class in akka.http.jwt.internal")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[JwtKeyLoader$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[JwtSupport.JwtAlgorithmSecret](JwtSupport.JwtAlgorithmSecret.html "interface in akka.http.jwt.internal")` | `[loadKey](#loadKey(java.lang.String,pdi.jwt.JwtAlgorithm,com.typesafe.config.Config))​(java.lang.String keyId,  pdi.jwt.JwtAlgorithm algorithm,  com.typesafe.config.Config secretConfig)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [JwtKeyLoader$](JwtKeyLoader$.html "class in akka.http.jwt.internal") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### JwtKeyLoader$
		
		
		
		```
		public JwtKeyLoader$()
		```

	- ### Method Detail
	
	
	
		- #### loadKey
		
		
		
		```
		public [JwtSupport.JwtAlgorithmSecret](JwtSupport.JwtAlgorithmSecret.html "interface in akka.http.jwt.internal") loadKey​(java.lang.String keyId,
		                                             pdi.jwt.JwtAlgorithm algorithm,
		                                             com.typesafe.config.Config secretConfig)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/jwt/internal/JwtKeyLoader$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/jwt/internal/JwtSupport.JwtAlgorithmSecret.html
- https://doc.akka.io/japi/akka-http/current/akka/http/jwt/internal/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/jwt/internal/JwtKeyLoader$.html](https://doc.akka.io/japi/akka-http/current/akka/http/jwt/internal/JwtKeyLoader$.html)*