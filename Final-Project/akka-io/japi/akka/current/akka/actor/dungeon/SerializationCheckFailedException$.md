---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:48:53Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/actor/dungeon/SerializationCheckFailedException$.html
title: SerializationCheckFailedException$
---

# SerializationCheckFailedException$

## Content

Package [akka.actor.dungeon](package-summary.html)
## Class SerializationCheckFailedException$

- java.lang.Object
- - scala.runtime.AbstractFunction2\<java.lang.Object,​java.lang.Throwable,​[SerializationCheckFailedException](SerializationCheckFailedException.html "class in akka.actor.dungeon")\>
	- - akka.actor.dungeon.SerializationCheckFailedException$

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Function2<java.lang.Object,​java.lang.Throwable,​[SerializationCheckFailedException](SerializationCheckFailedException.html "class in akka.actor.dungeon")>`

---

```
public class SerializationCheckFailedException$
extends scala.runtime.AbstractFunction2<java.lang.Object,​java.lang.Throwable,​[SerializationCheckFailedException](SerializationCheckFailedException.html "class in akka.actor.dungeon")>
implements java.io.Serializable
```

See Also:
[Serialized Form](../../../serialized-form.html#akka.actor.dungeon.SerializationCheckFailedException$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [SerializationCheckFailedException$](SerializationCheckFailedException$.html "class in akka.actor.dungeon")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[SerializationCheckFailedException$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[SerializationCheckFailedException](SerializationCheckFailedException.html "class in akka.actor.dungeon")` | `[apply](#apply(java.lang.Object,java.lang.Throwable))​(java.lang.Object msg,  java.lang.Throwable cause)` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `scala.Option<scala.Tuple2<java.lang.Object,​java.lang.Throwable>>` | `[unapply](#unapply(akka.actor.dungeon.SerializationCheckFailedException))​([SerializationCheckFailedException](SerializationCheckFailedException.html "class in akka.actor.dungeon") x$0)` |  |
	
	
		- ### Methods inherited from class scala.runtime.AbstractFunction2
		
		
		`apply$mcDDD$sp, apply$mcDDI$sp, apply$mcDDJ$sp, apply$mcDID$sp, apply$mcDII$sp, apply$mcDIJ$sp, apply$mcDJD$sp, apply$mcDJI$sp, apply$mcDJJ$sp, apply$mcFDD$sp, apply$mcFDI$sp, apply$mcFDJ$sp, apply$mcFID$sp, apply$mcFII$sp, apply$mcFIJ$sp, apply$mcFJD$sp, apply$mcFJI$sp, apply$mcFJJ$sp, apply$mcIDD$sp, apply$mcIDI$sp, apply$mcIDJ$sp, apply$mcIID$sp, apply$mcIII$sp, apply$mcIIJ$sp, apply$mcIJD$sp, apply$mcIJI$sp, apply$mcIJJ$sp, apply$mcJDD$sp, apply$mcJDI$sp, apply$mcJDJ$sp, apply$mcJID$sp, apply$mcJII$sp, apply$mcJIJ$sp, apply$mcJJD$sp, apply$mcJJI$sp, apply$mcJJJ$sp, apply$mcVDD$sp, apply$mcVDI$sp, apply$mcVDJ$sp, apply$mcVID$sp, apply$mcVII$sp, apply$mcVIJ$sp, apply$mcVJD$sp, apply$mcVJI$sp, apply$mcVJJ$sp, apply$mcZDD$sp, apply$mcZDI$sp, apply$mcZDJ$sp, apply$mcZID$sp, apply$mcZII$sp, apply$mcZIJ$sp, apply$mcZJD$sp, apply$mcZJI$sp, apply$mcZJJ$sp, curried, tupled`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [SerializationCheckFailedException$](SerializationCheckFailedException$.html "class in akka.actor.dungeon") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### SerializationCheckFailedException$
		
		
		
		```
		public SerializationCheckFailedException$()
		```

	- ### Method Detail
	
	
	
		- #### toString
		
		
		
		```
		public final java.lang.String toString()
		```
		
		
		Specified by:
		`toString` in interface `scala.Function2<java.lang.Object,​java.lang.Throwable,​[SerializationCheckFailedException](SerializationCheckFailedException.html "class in akka.actor.dungeon")>`
		Overrides:
		`toString` in class `scala.runtime.AbstractFunction2<java.lang.Object,​java.lang.Throwable,​[SerializationCheckFailedException](SerializationCheckFailedException.html "class in akka.actor.dungeon")>`
		- #### apply
		
		
		
		```
		public [SerializationCheckFailedException](SerializationCheckFailedException.html "class in akka.actor.dungeon") apply​(java.lang.Object msg,
		                                               java.lang.Throwable cause)
		```
		
		
		Specified by:
		`apply` in interface `scala.Function2<java.lang.Object,​java.lang.Throwable,​[SerializationCheckFailedException](SerializationCheckFailedException.html "class in akka.actor.dungeon")>`
		- #### unapply
		
		
		
		```
		public scala.Option<scala.Tuple2<java.lang.Object,​java.lang.Throwable>> unapply​([SerializationCheckFailedException](SerializationCheckFailedException.html "class in akka.actor.dungeon") x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/dungeon/SerializationCheckFailedException$.html
- https://doc.akka.io/japi/akka/current/akka/actor/dungeon/SerializationCheckFailedException.html
- https://doc.akka.io/japi/akka/current/akka/actor/dungeon/package-summary.html
- https://doc.akka.io/japi/akka/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/actor/dungeon/SerializationCheckFailedException$.html](https://doc.akka.io/japi/akka/current/akka/actor/dungeon/SerializationCheckFailedException$.html)*