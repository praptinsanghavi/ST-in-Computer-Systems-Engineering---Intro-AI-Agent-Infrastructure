---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:12:46Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/persistence/state/javadsl/GetObjectResult$.html
title: GetObjectResult$
---

# GetObjectResult$

## Content

Package [akka.persistence.state.javadsl](package-summary.html)
## Class GetObjectResult$

- java.lang.Object
- - akka.persistence.state.javadsl.GetObjectResult$

- All Implemented Interfaces:
`java.io.Serializable`

---

```
public class GetObjectResult$
extends java.lang.Object
implements java.io.Serializable
```

See Also:
[Serialized Form](../../../../serialized-form.html#akka.persistence.state.javadsl.GetObjectResult$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [GetObjectResult$](GetObjectResult$.html "class in akka.persistence.state.javadsl")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[GetObjectResult$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<A> [GetObjectResult](GetObjectResult.html "class in akka.persistence.state.javadsl")<A>` | `[apply](#apply(java.util.Optional,long))​(java.util.Optional<A> value,  long revision)` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `<A> scala.Option<scala.Tuple2<java.util.Optional<A>,​java.lang.Object>>` | `[unapply](#unapply(akka.persistence.state.javadsl.GetObjectResult))​([GetObjectResult](GetObjectResult.html "class in akka.persistence.state.javadsl")<A> x$0)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [GetObjectResult$](GetObjectResult$.html "class in akka.persistence.state.javadsl") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### GetObjectResult$
		
		
		
		```
		public GetObjectResult$()
		```

	- ### Method Detail
	
	
	
		- #### toString
		
		
		
		```
		public final java.lang.String toString()
		```
		
		
		Overrides:
		`toString` in class `java.lang.Object`
		- #### apply
		
		
		
		```
		public <A> [GetObjectResult](GetObjectResult.html "class in akka.persistence.state.javadsl")<A> apply​(java.util.Optional<A> value,
		                                    long revision)
		```
		- #### unapply
		
		
		
		```
		public <A> scala.Option<scala.Tuple2<java.util.Optional<A>,​java.lang.Object>> unapply​([GetObjectResult](GetObjectResult.html "class in akka.persistence.state.javadsl")<A> x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/state/javadsl/GetObjectResult$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/state/javadsl/GetObjectResult.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/state/javadsl/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/persistence/state/javadsl/GetObjectResult$.html](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/state/javadsl/GetObjectResult$.html)*