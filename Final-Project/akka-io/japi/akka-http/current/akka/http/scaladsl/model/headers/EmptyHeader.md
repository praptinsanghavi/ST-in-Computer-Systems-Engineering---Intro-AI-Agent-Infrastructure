---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:35:25Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/EmptyHeader.html
title: EmptyHeader
---

# EmptyHeader

## Content

Package [akka.http.scaladsl.model.headers](package-summary.html)
## Class EmptyHeader

- java.lang.Object
- - akka.http.scaladsl.model.headers.EmptyHeader

- ---

```
public class EmptyHeader
extends java.lang.Object
```

INTERNAL API

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[EmptyHeader](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static java.lang.String` | `[akka$http$scaladsl$model$headers$ModeledHeader$$_value](#akka$http$scaladsl$model$headers$ModeledHeader$$_value())()` |  |
	| `static void` | `[akka$http$scaladsl$model$headers$ModeledHeader$$_value_$eq](#akka$http$scaladsl$model$headers$ModeledHeader$$_value_$eq(java.lang.String))​(java.lang.String x$1)` |  |
	| `protected static [ModeledCompanion](ModeledCompanion.html "class in akka.http.scaladsl.model.headers")<[EmptyHeader$](EmptyHeader$.html "class in akka.http.scaladsl.model.headers")>` | `[companion](#companion())()` |  |
	| `static boolean` | `[is](#is(java.lang.String))​(java.lang.String nameInLowerCase)` |  |
	| `static boolean` | `[isNot](#isNot(java.lang.String))​(java.lang.String nameInLowerCase)` |  |
	| `static java.lang.String` | `[lowercaseName](#lowercaseName())()` |  |
	| `static java.lang.String` | `[name](#name())()` |  |
	| `static <R extends [Rendering](../../../impl/util/Rendering.html "interface in akka.http.impl.util")>[Rendering](../../../impl/util/Rendering.html "interface in akka.http.impl.util")` | `[render](#render(R))​(R r)` |  |
	| `static boolean` | `[renderInRequests](#renderInRequests())()` |  |
	| `static boolean` | `[renderInResponses](#renderInResponses())()` |  |
	| `static <R extends [Rendering](../../../impl/util/Rendering.html "interface in akka.http.impl.util")>[Rendering](../../../impl/util/Rendering.html "interface in akka.http.impl.util")` | `[renderValue](#renderValue(R))​(R r)` |  |
	| `static java.lang.String` | `[toString](#toString())()` |  |
	| `static java.lang.String` | `[unsafeToString](#unsafeToString())()` |  |
	| `static java.lang.String` | `[value](#value())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### EmptyHeader
		
		
		
		```
		public EmptyHeader()
		```

	- ### Method Detail
	
	
	
		- #### renderValue
		
		
		
		```
		public static <R extends [Rendering](../../../impl/util/Rendering.html "interface in akka.http.impl.util")> [Rendering](../../../impl/util/Rendering.html "interface in akka.http.impl.util") renderValue​(R r)
		```
		- #### companion
		
		
		
		```
		protected static [ModeledCompanion](ModeledCompanion.html "class in akka.http.scaladsl.model.headers")<[EmptyHeader$](EmptyHeader$.html "class in akka.http.scaladsl.model.headers")> companion()
		```
		- #### toString
		
		
		
		```
		public static java.lang.String toString()
		```
		- #### is
		
		
		
		```
		public static boolean is​(java.lang.String nameInLowerCase)
		```
		- #### isNot
		
		
		
		```
		public static boolean isNot​(java.lang.String nameInLowerCase)
		```
		- #### unsafeToString
		
		
		
		```
		public static java.lang.String unsafeToString()
		```
		- #### renderInRequests
		
		
		
		```
		public static boolean renderInRequests()
		```
		- #### renderInResponses
		
		
		
		```
		public static boolean renderInResponses()
		```
		- #### name
		
		
		
		```
		public static java.lang.String name()
		```
		- #### akka$http$scaladsl$model$headers$ModeledHeader$$\_value
		
		
		
		```
		public static java.lang.String akka$http$scaladsl$model$headers$ModeledHeader$$_value()
		```
		- #### akka$http$scaladsl$model$headers$ModeledHeader$$\_value\_$eq
		
		
		
		```
		public static void akka$http$scaladsl$model$headers$ModeledHeader$$_value_$eq​(java.lang.String x$1)
		```
		- #### value
		
		
		
		```
		public static java.lang.String value()
		```
		- #### lowercaseName
		
		
		
		```
		public static java.lang.String lowercaseName()
		```
		- #### render
		
		
		
		```
		public static final <R extends [Rendering](../../../impl/util/Rendering.html "interface in akka.http.impl.util")> [Rendering](../../../impl/util/Rendering.html "interface in akka.http.impl.util") render​(R r)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/Rendering.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/EmptyHeader$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/ModeledCompanion.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/EmptyHeader.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/EmptyHeader.html)*