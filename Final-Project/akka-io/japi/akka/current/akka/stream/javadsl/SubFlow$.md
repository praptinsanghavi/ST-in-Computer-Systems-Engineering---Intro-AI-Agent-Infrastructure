---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:45:37Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/stream/javadsl/SubFlow$.html
title: SubFlow$
---

# SubFlow$

## Content

Package [akka.stream.javadsl](package-summary.html)
## Class SubFlow$

- java.lang.Object
- - akka.stream.javadsl.SubFlow$

- ---

```
public class SubFlow$
extends java.lang.Object
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [SubFlow$](SubFlow$.html "class in akka.stream.javadsl")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[SubFlow$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<In,​SuperOut,​Out extends SuperOut,​M>[SubFlow](SubFlow.html "class in akka.stream.javadsl")<In,​SuperOut,​M>` | `[upcast](#upcast(akka.stream.javadsl.SubFlow))​([SubFlow](SubFlow.html "class in akka.stream.javadsl")<In,​Out,​M> flow)` | Upcast a stream of elements to a stream of supertypes of that element. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [SubFlow$](SubFlow$.html "class in akka.stream.javadsl") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### SubFlow$
		
		
		
		```
		public SubFlow$()
		```

	- ### Method Detail
	
	
	
		- #### upcast
		
		
		
		```
		public <In,​SuperOut,​Out extends SuperOut,​M> [SubFlow](SubFlow.html "class in akka.stream.javadsl")<In,​SuperOut,​M> upcast​([SubFlow](SubFlow.html "class in akka.stream.javadsl")<In,​Out,​M> flow)
		```
		
		Upcast a stream of elements to a stream of supertypes of that element. Useful in combination with
		 fan\-in operators where you do not want to pay the cost of casting each element in a `map`.
		 
		
		Returns:
		A flow that accepts `In` and outputs elements of the super type

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/stream/javadsl/SubFlow$.html
- https://doc.akka.io/japi/akka/current/akka/stream/javadsl/SubFlow.html
- https://doc.akka.io/japi/akka/current/akka/stream/javadsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/stream/javadsl/SubFlow$.html](https://doc.akka.io/japi/akka/current/akka/stream/javadsl/SubFlow$.html)*