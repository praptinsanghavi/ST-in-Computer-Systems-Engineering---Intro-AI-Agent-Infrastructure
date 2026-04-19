---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:41:43Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/Keep.html
title: Keep
---

# Keep

## Content

Package [akka.stream.scaladsl](package-summary.html)
## Class Keep

- java.lang.Object
- - akka.stream.scaladsl.Keep

- ---

```
public class Keep
extends java.lang.Object
```

Convenience functions for often\-encountered purposes like keeping only the
 left (first) or only the right (second) of two input values.

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Keep](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static <L,​R>scala.Function2<L,​R,​scala.Tuple2<L,​R>>` | `[both](#both())()` |  |
	| `static <L,​R>scala.Function2<L,​R,​L>` | `[left](#left())()` |  |
	| `static <L,​R>scala.Function2<L,​R,​[NotUsed](../../NotUsed.html "class in akka")>` | `[none](#none())()` |  |
	| `static <L,​R>scala.Function2<L,​R,​R>` | `[right](#right())()` |  |
	
	
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
		public static <L,​R> scala.Function2<L,​R,​L> left()
		```
		- #### right
		
		
		
		```
		public static <L,​R> scala.Function2<L,​R,​R> right()
		```
		- #### both
		
		
		
		```
		public static <L,​R> scala.Function2<L,​R,​scala.Tuple2<L,​R>> both()
		```
		- #### none
		
		
		
		```
		public static <L,​R> scala.Function2<L,​R,​[NotUsed](../../NotUsed.html "class in akka")> none()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/NotUsed.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/Keep.html](https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/Keep.html)*