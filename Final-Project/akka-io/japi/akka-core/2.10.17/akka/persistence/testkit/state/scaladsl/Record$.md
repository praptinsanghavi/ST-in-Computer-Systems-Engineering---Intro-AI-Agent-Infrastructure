---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:48:18Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/testkit/state/scaladsl/Record$.html
title: Record$
---

# Record$

## Content

Package [akka.persistence.testkit.state.scaladsl](package-summary.html)
## Class Record$

- java.lang.Object
- - akka.persistence.testkit.state.scaladsl.Record$

- All Implemented Interfaces:
`java.io.Serializable`

---

```
public class Record$
extends java.lang.Object
implements java.io.Serializable
```

See Also:
[Serialized Form](../../../../../serialized-form.html#akka.persistence.testkit.state.scaladsl.Record$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [Record$](Record$.html "class in akka.persistence.testkit.state.scaladsl")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Record$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<A> long` | `[$lessinit$greater$default$6](#$lessinit$greater$default$6())()` |  |
	| `<A> [Record](Record.html "class in akka.persistence.testkit.state.scaladsl")<A>` | `[apply](#apply(long,java.lang.String,long,scala.Option,java.lang.String,long))​(long globalOffset,  java.lang.String persistenceId,  long revision,  scala.Option<A> value,  java.lang.String tag,  long timestamp)` |  |
	| `<A> long` | `[apply$default$6](#apply$default$6())()` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `<A> scala.Option<scala.Tuple6<java.lang.Object,​java.lang.String,​java.lang.Object,​scala.Option<A>,​java.lang.String,​java.lang.Object>>` | `[unapply](#unapply(akka.persistence.testkit.state.scaladsl.Record))​([Record](Record.html "class in akka.persistence.testkit.state.scaladsl")<A> x$0)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [Record$](Record$.html "class in akka.persistence.testkit.state.scaladsl") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### Record$
		
		
		
		```
		public Record$()
		```

	- ### Method Detail
	
	
	
		- #### $lessinit$greater$default$6
		
		
		
		```
		public <A> long $lessinit$greater$default$6()
		```
		- #### toString
		
		
		
		```
		public final java.lang.String toString()
		```
		
		
		Overrides:
		`toString` in class `java.lang.Object`
		- #### apply
		
		
		
		```
		public <A> [Record](Record.html "class in akka.persistence.testkit.state.scaladsl")<A> apply​(long globalOffset,
		                           java.lang.String persistenceId,
		                           long revision,
		                           scala.Option<A> value,
		                           java.lang.String tag,
		                           long timestamp)
		```
		- #### apply$default$6
		
		
		
		```
		public <A> long apply$default$6()
		```
		- #### unapply
		
		
		
		```
		public <A> scala.Option<scala.Tuple6<java.lang.Object,​java.lang.String,​java.lang.Object,​scala.Option<A>,​java.lang.String,​java.lang.Object>> unapply​([Record](Record.html "class in akka.persistence.testkit.state.scaladsl")<A> x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/testkit/state/scaladsl/Record$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/testkit/state/scaladsl/Record.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/testkit/state/scaladsl/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/testkit/state/scaladsl/Record$.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/testkit/state/scaladsl/Record$.html)*