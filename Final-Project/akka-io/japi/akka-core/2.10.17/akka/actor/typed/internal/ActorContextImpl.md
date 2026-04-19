---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:29:07Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/internal/ActorContextImpl.LoggingContext.html
title: ActorContextImpl.LoggingContext
---

# ActorContextImpl.LoggingContext

## Content

Package [akka.actor.typed.internal](package-summary.html)
## Class ActorContextImpl.LoggingContext

- java.lang.Object
- - akka.actor.typed.internal.ActorContextImpl.LoggingContext

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Equals`, `scala.Product`

Enclosing interface:
[ActorContextImpl](ActorContextImpl.html "interface in akka.actor.typed.internal")\<[T](ActorContextImpl.html "type parameter in ActorContextImpl")\>

---

```
public static final class ActorContextImpl.LoggingContext
extends java.lang.Object
implements scala.Product, java.io.Serializable
```

See Also:
[Serialized Form](../../../../serialized-form.html#akka.actor.typed.internal.ActorContextImpl.LoggingContext)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[LoggingContext](#%3Cinit%3E(org.slf4j.Logger,java.lang.String,java.lang.String,java.lang.String,java.lang.String,boolean))​(org.slf4j.Logger logger,  java.lang.String tagsString,  java.lang.String akkaSource,  java.lang.String sourceActorSystem,  java.lang.String akkaAddress,  boolean hasCustomName)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `java.lang.String` | `[akkaAddress](#akkaAddress())()` |  |
	| `java.lang.String` | `[akkaSource](#akkaSource())()` |  |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `[ActorContextImpl.LoggingContext](ActorContextImpl.LoggingContext.html "class in akka.actor.typed.internal")` | `[copy](#copy(org.slf4j.Logger,java.lang.String,java.lang.String,java.lang.String,java.lang.String,boolean))​(org.slf4j.Logger logger,  java.lang.String tagsString,  java.lang.String akkaSource,  java.lang.String sourceActorSystem,  java.lang.String akkaAddress,  boolean hasCustomName)` |  |
	| `org.slf4j.Logger` | `[copy$default$1](#copy$default$1())()` |  |
	| `java.lang.String` | `[copy$default$2](#copy$default$2())()` |  |
	| `java.lang.String` | `[copy$default$3](#copy$default$3())()` |  |
	| `java.lang.String` | `[copy$default$4](#copy$default$4())()` |  |
	| `java.lang.String` | `[copy$default$5](#copy$default$5())()` |  |
	| `boolean` | `[copy$default$6](#copy$default$6())()` |  |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `boolean` | `[hasCustomName](#hasCustomName())()` |  |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `org.slf4j.Logger` | `[logger](#logger())()` |  |
	| `boolean` | `[mdcUsed](#mdcUsed())()` |  |
	| `void` | `[mdcUsed_$eq](#mdcUsed_$eq(boolean))​(boolean x$1)` |  |
	| `int` | `[productArity](#productArity())()` |  |
	| `java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `java.lang.String` | `[productElementName](#productElementName(int))​(int x$1)` |  |
	| `scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `java.lang.String` | `[sourceActorSystem](#sourceActorSystem())()` |  |
	| `java.lang.String` | `[tagsString](#tagsString())()` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `[ActorContextImpl.LoggingContext](ActorContextImpl.LoggingContext.html "class in akka.actor.typed.internal")` | `[withLogger](#withLogger(org.slf4j.Logger))​(org.slf4j.Logger logger)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Product
		
		
		`productElementNames`

- - ### Constructor Detail
	
	
	
		- #### LoggingContext
		
		
		
		```
		public LoggingContext​(org.slf4j.Logger logger,
		                      java.lang.String tagsString,
		                      java.lang.String akkaSource,
		                      java.lang.String sourceActorSystem,
		                      java.lang.String akkaAddress,
		                      boolean hasCustomName)
		```

	- ### Method Detail
	
	
	
		- #### logger
		
		
		
		```
		public org.slf4j.Logger logger()
		```
		- #### tagsString
		
		
		
		```
		public java.lang.String tagsString()
		```
		- #### akkaSource
		
		
		
		```
		public java.lang.String akkaSource()
		```
		- #### sourceActorSystem
		
		
		
		```
		public java.lang.String sourceActorSystem()
		```
		- #### akkaAddress
		
		
		
		```
		public java.lang.String akkaAddress()
		```
		- #### hasCustomName
		
		
		
		```
		public boolean hasCustomName()
		```
		- #### mdcUsed
		
		
		
		```
		public boolean mdcUsed()
		```
		- #### mdcUsed\_$eq
		
		
		
		```
		public void mdcUsed_$eq​(boolean x$1)
		```
		- #### withLogger
		
		
		
		```
		public [ActorContextImpl.LoggingContext](ActorContextImpl.LoggingContext.html "class in akka.actor.typed.internal") withLogger​(org.slf4j.Logger logger)
		```
		- #### copy
		
		
		
		```
		public [ActorContextImpl.LoggingContext](ActorContextImpl.LoggingContext.html "class in akka.actor.typed.internal") copy​(org.slf4j.Logger logger,
		                                            java.lang.String tagsString,
		                                            java.lang.String akkaSource,
		                                            java.lang.String sourceActorSystem,
		                                            java.lang.String akkaAddress,
		                                            boolean hasCustomName)
		```
		- #### copy$default$1
		
		
		
		```
		public org.slf4j.Logger copy$default$1()
		```
		- #### copy$default$2
		
		
		
		```
		public java.lang.String copy$default$2()
		```
		- #### copy$default$3
		
		
		
		```
		public java.lang.String copy$default$3()
		```
		- #### copy$default$4
		
		
		
		```
		public java.lang.String copy$default$4()
		```
		- #### copy$default$5
		
		
		
		```
		public java.lang.String copy$default$5()
		```
		- #### copy$default$6
		
		
		
		```
		public boolean copy$default$6()
		```
		- #### productPrefix
		
		
		
		```
		public java.lang.String productPrefix()
		```
		
		
		Specified by:
		`productPrefix` in interface `scala.Product`
		- #### productArity
		
		
		
		```
		public int productArity()
		```
		
		
		Specified by:
		`productArity` in interface `scala.Product`
		- #### productElement
		
		
		
		```
		public java.lang.Object productElement​(int x$1)
		```
		
		
		Specified by:
		`productElement` in interface `scala.Product`
		- #### productIterator
		
		
		
		```
		public scala.collection.Iterator<java.lang.Object> productIterator()
		```
		
		
		Specified by:
		`productIterator` in interface `scala.Product`
		- #### canEqual
		
		
		
		```
		public boolean canEqual​(java.lang.Object x$1)
		```
		
		
		Specified by:
		`canEqual` in interface `scala.Equals`
		- #### productElementName
		
		
		
		```
		public java.lang.String productElementName​(int x$1)
		```
		
		
		Specified by:
		`productElementName` in interface `scala.Product`
		- #### hashCode
		
		
		
		```
		public int hashCode()
		```
		
		
		Overrides:
		`hashCode` in class `java.lang.Object`
		- #### toString
		
		
		
		```
		public java.lang.String toString()
		```
		
		
		Overrides:
		`toString` in class `java.lang.Object`
		- #### equals
		
		
		
		```
		public boolean equals​(java.lang.Object x$1)
		```
		
		
		Specified by:
		`equals` in interface `scala.Equals`
		Overrides:
		`equals` in class `java.lang.Object`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/internal/ActorContextImpl.LoggingContext.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/internal/ActorContextImpl.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/internal/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/internal/ActorContextImpl.LoggingContext.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/internal/ActorContextImpl.LoggingContext.html)*