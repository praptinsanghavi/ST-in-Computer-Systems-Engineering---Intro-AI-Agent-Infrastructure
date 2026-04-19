---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T03:01:40Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/2.10/akka/stream/javadsl/Keep.html
title: Keep
---

# Keep

## Content

Package [akka.stream.javadsl](package-summary.html)
## Class Keep

- java.lang.Object
- - akka.stream.javadsl.Keep

- ---

```
public class Keep
extends java.lang.Object
```

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Keep](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static <L,​R>[Function2](../../japi/function/Function2.html "interface in akka.japi.function")<L,​R,​[Pair](../../japi/Pair.html "class in akka.japi")<L,​R>>` | `[both](#both())()` |  |
	| `static <L,​R>[Function2](../../japi/function/Function2.html "interface in akka.japi.function")<L,​R,​L>` | `[left](#left())()` |  |
	| `static <L,​R>[Function2](../../japi/function/Function2.html "interface in akka.japi.function")<L,​R,​[NotUsed](../../NotUsed.html "class in akka")>` | `[none](#none())()` |  |
	| `static <L,​R>[Function2](../../japi/function/Function2.html "interface in akka.japi.function")<L,​R,​R>` | `[right](#right())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### Keep
		
		
		
		```
		public Keep()
		```

	- ### Method Detail
	
	
	
		- #### left
		
		
		
		```
		public static <L,​R> [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<L,​R,​L> left()
		```
		- #### right
		
		
		
		```
		public static <L,​R> [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<L,​R,​R> right()
		```
		- #### both
		
		
		
		```
		public static <L,​R> [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<L,​R,​[Pair](../../japi/Pair.html "class in akka.japi")<L,​R>> both()
		```
		- #### none
		
		
		
		```
		public static <L,​R> [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<L,​R,​[NotUsed](../../NotUsed.html "class in akka")> none()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/2.10/akka/NotUsed.html
- https://doc.akka.io/japi/akka/2.10/akka/japi/Pair.html
- https://doc.akka.io/japi/akka/2.10/akka/japi/function/Function2.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/javadsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/2.10/akka/stream/javadsl/Keep.html](https://doc.akka.io/japi/akka/2.10/akka/stream/javadsl/Keep.html)*