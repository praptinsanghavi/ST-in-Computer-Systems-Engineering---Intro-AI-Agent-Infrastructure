---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:22:52Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/persistence/PersistentRepr$.html
title: PersistentRepr$
---

# PersistentRepr$

## Content

Package [akka.persistence](package-summary.html)
## Class PersistentRepr$

- java.lang.Object
- - akka.persistence.PersistentRepr$

- All Implemented Interfaces:
`java.io.Serializable`

---

```
public class PersistentRepr$
extends java.lang.Object
implements java.io.Serializable
```

See Also:
[Serialized Form](../../serialized-form.html#akka.persistence.PersistentRepr$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [PersistentRepr$](PersistentRepr$.html "class in akka.persistence")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[PersistentRepr$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[PersistentRepr](PersistentRepr.html "interface in akka.persistence")` | `[apply](#apply(java.lang.Object,long,java.lang.String,java.lang.String,boolean,akka.actor.ActorRef,java.lang.String))​(java.lang.Object payload,  long sequenceNr,  java.lang.String persistenceId,  java.lang.String manifest,  boolean deleted,  [ActorRef](../actor/ActorRef.html "class in akka.actor") sender,  java.lang.String writerUuid)` | Plugin API. |
	| `long` | `[apply$default$2](#apply$default$2())()` |  |
	| `java.lang.String` | `[apply$default$3](#apply$default$3())()` |  |
	| `java.lang.String` | `[apply$default$4](#apply$default$4())()` |  |
	| `boolean` | `[apply$default$5](#apply$default$5())()` |  |
	| `[ActorRef](../actor/ActorRef.html "class in akka.actor")` | `[apply$default$6](#apply$default$6())()` |  |
	| `java.lang.String` | `[apply$default$7](#apply$default$7())()` |  |
	| `scala.Function7<java.lang.Object,​java.lang.Object,​java.lang.String,​java.lang.String,​java.lang.Object,​[ActorRef](../actor/ActorRef.html "class in akka.actor"),​java.lang.String,​[PersistentRepr](PersistentRepr.html "interface in akka.persistence")>` | `[create](#create())()` | Java API, Plugin API. |
	| `scala.Option<scala.Tuple2<java.lang.Object,​java.lang.Object>>` | `[unapply](#unapply(akka.persistence.PersistentRepr))​([PersistentRepr](PersistentRepr.html "interface in akka.persistence") persistent)` | extractor of payload and sequenceNr. |
	| `java.lang.String` | `[Undefined](#Undefined())()` | Plugin API: value of an undefined persistenceId or manifest. |
	| `int` | `[UndefinedId](#UndefinedId())()` | Plugin API: value of an undefined / identity event adapter. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [PersistentRepr$](PersistentRepr$.html "class in akka.persistence") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### PersistentRepr$
		
		
		
		```
		public PersistentRepr$()
		```

	- ### Method Detail
	
	
	
		- #### Undefined
		
		
		
		```
		public java.lang.String Undefined()
		```
		
		Plugin API: value of an undefined persistenceId or manifest.
		- #### UndefinedId
		
		
		
		```
		public int UndefinedId()
		```
		
		Plugin API: value of an undefined / identity event adapter.
		- #### apply
		
		
		
		```
		public [PersistentRepr](PersistentRepr.html "interface in akka.persistence") apply​(java.lang.Object payload,
		                            long sequenceNr,
		                            java.lang.String persistenceId,
		                            java.lang.String manifest,
		                            boolean deleted,
		                            [ActorRef](../actor/ActorRef.html "class in akka.actor") sender,
		                            java.lang.String writerUuid)
		```
		
		Plugin API.
		- #### apply$default$2
		
		
		
		```
		public long apply$default$2()
		```
		- #### apply$default$3
		
		
		
		```
		public java.lang.String apply$default$3()
		```
		- #### apply$default$4
		
		
		
		```
		public java.lang.String apply$default$4()
		```
		- #### apply$default$5
		
		
		
		```
		public boolean apply$default$5()
		```
		- #### apply$default$6
		
		
		
		```
		public [ActorRef](../actor/ActorRef.html "class in akka.actor") apply$default$6()
		```
		- #### apply$default$7
		
		
		
		```
		public java.lang.String apply$default$7()
		```
		- #### create
		
		
		
		```
		public scala.Function7<java.lang.Object,​java.lang.Object,​java.lang.String,​java.lang.String,​java.lang.Object,​[ActorRef](../actor/ActorRef.html "class in akka.actor"),​java.lang.String,​[PersistentRepr](PersistentRepr.html "interface in akka.persistence")> create()
		```
		
		Java API, Plugin API.
		- #### unapply
		
		
		
		```
		public scala.Option<scala.Tuple2<java.lang.Object,​java.lang.Object>> unapply​([PersistentRepr](PersistentRepr.html "interface in akka.persistence") persistent)
		```
		
		extractor of payload and sequenceNr.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/ActorRef.html
- https://doc.akka.io/japi/akka/current/akka/persistence/PersistentRepr$.html
- https://doc.akka.io/japi/akka/current/akka/persistence/PersistentRepr.html
- https://doc.akka.io/japi/akka/current/akka/persistence/package-summary.html
- https://doc.akka.io/japi/akka/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/persistence/PersistentRepr$.html](https://doc.akka.io/japi/akka/current/akka/persistence/PersistentRepr$.html)*