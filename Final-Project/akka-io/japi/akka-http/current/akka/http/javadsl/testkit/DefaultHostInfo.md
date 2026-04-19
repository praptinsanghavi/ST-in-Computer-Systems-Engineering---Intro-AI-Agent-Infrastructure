---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:48:29Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/testkit/DefaultHostInfo.html
title: DefaultHostInfo
---

# DefaultHostInfo

## Content

Package [akka.http.javadsl.testkit](package-summary.html)
## Class DefaultHostInfo

- java.lang.Object
- - akka.http.javadsl.testkit.DefaultHostInfo

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public final class DefaultHostInfo
extends java.lang.Object
implements scala.Product, java.io.Serializable
```

See Also:
[Serialized Form](../../../../serialized-form.html#akka.http.javadsl.testkit.DefaultHostInfo)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[DefaultHostInfo](#%3Cinit%3E(akka.http.javadsl.model.headers.Host,boolean))​([Host](../model/headers/Host.html "class in akka.http.javadsl.model.headers") host,  boolean securedConnection)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `abstract static R` | `[apply](#apply(T1,T2))​(T1 v1,  T2 v2)` |  |
	| `[Host](../model/headers/Host.html "class in akka.http.javadsl.model.headers")` | `[getHost](#getHost())()` |  |
	| `boolean` | `[isSecuredConnection](#isSecuredConnection())()` |  |
	| `static java.lang.String` | `[toString](#toString())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface scala.Equals
		
		
		`canEqual, equals`
		- ### Methods inherited from interface scala.Product
		
		
		`productArity, productElement, productElementName, productElementNames, productIterator, productPrefix`

- - ### Constructor Detail
	
	
	
		- #### DefaultHostInfo
		
		
		
		```
		public DefaultHostInfo​([Host](../model/headers/Host.html "class in akka.http.javadsl.model.headers") host,
		                       boolean securedConnection)
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public abstract static R apply​(T1 v1,
		                               T2 v2)
		```
		- #### toString
		
		
		
		```
		public static java.lang.String toString()
		```
		- #### getHost
		
		
		
		```
		public [Host](../model/headers/Host.html "class in akka.http.javadsl.model.headers") getHost()
		```
		- #### isSecuredConnection
		
		
		
		```
		public boolean isSecuredConnection()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/headers/Host.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/testkit/package-summary.html
- https://doc.akka.io/japi/akka-http/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/testkit/DefaultHostInfo.html](https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/testkit/DefaultHostInfo.html)*