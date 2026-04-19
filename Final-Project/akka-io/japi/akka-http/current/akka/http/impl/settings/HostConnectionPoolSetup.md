---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:34:19Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/impl/settings/HostConnectionPoolSetup.html
title: HostConnectionPoolSetup
---

# HostConnectionPoolSetup

## Content

Package [akka.http.impl.settings](package-summary.html)
## Class HostConnectionPoolSetup

- java.lang.Object
- - akka.http.impl.settings.HostConnectionPoolSetup

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public final class HostConnectionPoolSetup
extends java.lang.Object
implements scala.Product, java.io.Serializable
```

See Also:
[Serialized Form](../../../../serialized-form.html#akka.http.impl.settings.HostConnectionPoolSetup)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[HostConnectionPoolSetup](#%3Cinit%3E(java.lang.String,int,akka.http.impl.settings.ConnectionPoolSetup))​(java.lang.String host,  int port,  [ConnectionPoolSetup](ConnectionPoolSetup.html "class in akka.http.impl.settings") setup)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `abstract static R` | `[apply](#apply(T1,T2,T3))​(T1 v1,  T2 v2,  T3 v3)` |  |
	| `java.lang.String` | `[host](#host())()` |  |
	| `int` | `[port](#port())()` |  |
	| `[ConnectionPoolSetup](ConnectionPoolSetup.html "class in akka.http.impl.settings")` | `[setup](#setup())()` |  |
	| `static java.lang.String` | `[toString](#toString())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface scala.Equals
		
		
		`canEqual, equals`
		- ### Methods inherited from interface scala.Product
		
		
		`productArity, productElement, productElementName, productElementNames, productIterator, productPrefix`

- - ### Constructor Detail
	
	
	
		- #### HostConnectionPoolSetup
		
		
		
		```
		public HostConnectionPoolSetup​(java.lang.String host,
		                               int port,
		                               [ConnectionPoolSetup](ConnectionPoolSetup.html "class in akka.http.impl.settings") setup)
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public abstract static R apply​(T1 v1,
		                               T2 v2,
		                               T3 v3)
		```
		- #### toString
		
		
		
		```
		public static java.lang.String toString()
		```
		- #### host
		
		
		
		```
		public java.lang.String host()
		```
		- #### port
		
		
		
		```
		public int port()
		```
		- #### setup
		
		
		
		```
		public [ConnectionPoolSetup](ConnectionPoolSetup.html "class in akka.http.impl.settings") setup()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/settings/ConnectionPoolSetup.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/settings/package-summary.html
- https://doc.akka.io/japi/akka-http/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/impl/settings/HostConnectionPoolSetup.html](https://doc.akka.io/japi/akka-http/current/akka/http/impl/settings/HostConnectionPoolSetup.html)*