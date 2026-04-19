---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:09:33Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/RoutingJavaMapping.Implicits$.html
title: RoutingJavaMapping.Implicits$
---

# RoutingJavaMapping.Implicits$

## Content

Package [akka.http.javadsl.server](package-summary.html)
## Class RoutingJavaMapping.Implicits$

- java.lang.Object
- - akka.http.javadsl.server.RoutingJavaMapping.Implicits$

- Enclosing class:
[RoutingJavaMapping](RoutingJavaMapping.html "class in akka.http.javadsl.server")

---

```
public static class RoutingJavaMapping.Implicits$
extends java.lang.Object
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [RoutingJavaMapping.Implicits$](RoutingJavaMapping.Implicits$.html "class in akka.http.javadsl.server")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Implicits$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<S> [JavaMapping.AsJava](../../impl/util/JavaMapping.AsJava.html "interface in akka.http.impl.util")<java.lang.Object>` | `[AddAsJava](#AddAsJava(S,akka.http.impl.util.S2JMapping))​(S scalaObject,  [S2JMapping](../../impl/util/S2JMapping.html "interface in akka.http.impl.util")<S> mapping)` |  |
	| `<J> [JavaMapping.AsScala](../../impl/util/JavaMapping.AsScala.html "interface in akka.http.impl.util")<java.lang.Object>` | `[AddAsScala](#AddAsScala(J,akka.http.impl.util.J2SMapping))​(J javaObject,  [J2SMapping](../../impl/util/J2SMapping.html "interface in akka.http.impl.util")<J> mapping)` |  |
	| `<J> scala.collection.immutable.Seq<java.lang.Object>` | `[convertSeqToScala](#convertSeqToScala(scala.collection.immutable.Seq,akka.http.impl.util.J2SMapping))​(scala.collection.immutable.Seq<J> j,  [J2SMapping](../../impl/util/J2SMapping.html "interface in akka.http.impl.util")<J> mapping)` |  |
	| `<J> java.lang.Object` | `[convertToScala](#convertToScala(J,akka.http.impl.util.J2SMapping))​(J j,  [J2SMapping](../../impl/util/J2SMapping.html "interface in akka.http.impl.util")<J> mapping)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [RoutingJavaMapping.Implicits$](RoutingJavaMapping.Implicits$.html "class in akka.http.javadsl.server") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### Implicits$
		
		
		
		```
		public Implicits$()
		```

	- ### Method Detail
	
	
	
		- #### convertToScala
		
		
		
		```
		public <J> java.lang.Object convertToScala​(J j,
		                                           [J2SMapping](../../impl/util/J2SMapping.html "interface in akka.http.impl.util")<J> mapping)
		```
		- #### convertSeqToScala
		
		
		
		```
		public <J> scala.collection.immutable.Seq<java.lang.Object> convertSeqToScala​(scala.collection.immutable.Seq<J> j,
		                                                                              [J2SMapping](../../impl/util/J2SMapping.html "interface in akka.http.impl.util")<J> mapping)
		```
		- #### AddAsScala
		
		
		
		```
		public <J> [JavaMapping.AsScala](../../impl/util/JavaMapping.AsScala.html "interface in akka.http.impl.util")<java.lang.Object> AddAsScala​(J javaObject,
		                                                            [J2SMapping](../../impl/util/J2SMapping.html "interface in akka.http.impl.util")<J> mapping)
		```
		- #### AddAsJava
		
		
		
		```
		public <S> [JavaMapping.AsJava](../../impl/util/JavaMapping.AsJava.html "interface in akka.http.impl.util")<java.lang.Object> AddAsJava​(S scalaObject,
		                                                          [S2JMapping](../../impl/util/S2JMapping.html "interface in akka.http.impl.util")<S> mapping)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/impl/util/J2SMapping.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/impl/util/JavaMapping.AsJava.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/impl/util/JavaMapping.AsScala.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/impl/util/S2JMapping.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/RoutingJavaMapping.Implicits$.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/RoutingJavaMapping.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/RoutingJavaMapping.Implicits$.html](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/RoutingJavaMapping.Implicits$.html)*