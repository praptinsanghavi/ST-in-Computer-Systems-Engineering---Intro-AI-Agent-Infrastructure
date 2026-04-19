---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:34:17Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/impl/settings/ConnectionPoolSetup.html
title: ConnectionPoolSetup
---

# ConnectionPoolSetup

## Content

Package [akka.http.impl.settings](package-summary.html)
## Class ConnectionPoolSetup

- java.lang.Object
- - akka.http.impl.settings.ConnectionPoolSetup

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public final class ConnectionPoolSetup
extends java.lang.Object
implements scala.Product, java.io.Serializable
```

INTERNAL API

See Also:
[Serialized Form](../../../../serialized-form.html#akka.http.impl.settings.ConnectionPoolSetup)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ConnectionPoolSetup](#%3Cinit%3E(akka.http.scaladsl.settings.ConnectionPoolSettings,akka.http.scaladsl.ConnectionContext,akka.event.LoggingAdapter))​([ConnectionPoolSettings](../../scaladsl/settings/ConnectionPoolSettings.html "class in akka.http.scaladsl.settings") settings,  [ConnectionContext](../../scaladsl/ConnectionContext.html "interface in akka.http.scaladsl") connectionContext,  akka.event.LoggingAdapter log)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `abstract static R` | `[apply](#apply(T1,T2,T3))​(T1 v1,  T2 v2,  T3 v3)` |  |
	| `[ConnectionContext](../../scaladsl/ConnectionContext.html "interface in akka.http.scaladsl")` | `[connectionContext](#connectionContext())()` |  |
	| `akka.event.LoggingAdapter` | `[log](#log())()` |  |
	| `[ConnectionPoolSettings](../../scaladsl/settings/ConnectionPoolSettings.html "class in akka.http.scaladsl.settings")` | `[settings](#settings())()` |  |
	| `static java.lang.String` | `[toString](#toString())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface scala.Equals
		
		
		`canEqual, equals`
		- ### Methods inherited from interface scala.Product
		
		
		`productArity, productElement, productElementName, productElementNames, productIterator, productPrefix`

- - ### Constructor Detail
	
	
	
		- #### ConnectionPoolSetup
		
		
		
		```
		public ConnectionPoolSetup​([ConnectionPoolSettings](../../scaladsl/settings/ConnectionPoolSettings.html "class in akka.http.scaladsl.settings") settings,
		                           [ConnectionContext](../../scaladsl/ConnectionContext.html "interface in akka.http.scaladsl") connectionContext,
		                           akka.event.LoggingAdapter log)
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
		- #### settings
		
		
		
		```
		public [ConnectionPoolSettings](../../scaladsl/settings/ConnectionPoolSettings.html "class in akka.http.scaladsl.settings") settings()
		```
		- #### connectionContext
		
		
		
		```
		public [ConnectionContext](../../scaladsl/ConnectionContext.html "interface in akka.http.scaladsl") connectionContext()
		```
		- #### log
		
		
		
		```
		public akka.event.LoggingAdapter log()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/settings/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/ConnectionContext.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/settings/ConnectionPoolSettings.html
- https://doc.akka.io/japi/akka-http/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/impl/settings/ConnectionPoolSetup.html](https://doc.akka.io/japi/akka-http/current/akka/http/impl/settings/ConnectionPoolSetup.html)*