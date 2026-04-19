---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:30:56Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/internal/receptionist/DefaultServiceKey.html
title: DefaultServiceKey
---

# DefaultServiceKey

## Content

Package [akka.actor.typed.internal.receptionist](package-summary.html)
## Class DefaultServiceKey\<T\>

- java.lang.Object
- - akka.actor.typed.internal.receptionist.AbstractServiceKey
	- - [akka.actor.typed.receptionist.ServiceKey](../../receptionist/ServiceKey.html "class in akka.actor.typed.receptionist")\<T\>
		- - akka.actor.typed.internal.receptionist.DefaultServiceKey\<T\>

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public final class DefaultServiceKey<T>
extends [ServiceKey](../../receptionist/ServiceKey.html "class in akka.actor.typed.receptionist")<T>
implements scala.Product, java.io.Serializable
```

This is the only actual concrete service key type
 
 Internal API

See Also:
[Serialized Form](../../../../../serialized-form.html#akka.actor.typed.internal.receptionist.DefaultServiceKey)

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from class akka.actor.typed.receptionist.[ServiceKey](../../receptionist/ServiceKey.html "class in akka.actor.typed.receptionist")
		
		
		`[ServiceKey.Listing$](../../receptionist/ServiceKey.Listing$.html "class in akka.actor.typed.receptionist"), [ServiceKey.Registered$](../../receptionist/ServiceKey.Registered$.html "class in akka.actor.typed.receptionist")`

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[DefaultServiceKey](#%3Cinit%3E(java.lang.String,java.lang.String))​(java.lang.String id,  java.lang.String typeName)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static <T> [DefaultServiceKey](DefaultServiceKey.html "class in akka.actor.typed.internal.receptionist")<T>` | `[apply](#apply(java.lang.String,java.lang.String))​(java.lang.String id,  java.lang.String typeName)` |  |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `<T> [DefaultServiceKey](DefaultServiceKey.html "class in akka.actor.typed.internal.receptionist")<T>` | `[copy](#copy(java.lang.String,java.lang.String))​(java.lang.String id,  java.lang.String typeName)` |  |
	| `<T> java.lang.String` | `[copy$default$1](#copy$default$1())()` |  |
	| `<T> java.lang.String` | `[copy$default$2](#copy$default$2())()` |  |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `java.lang.String` | `[id](#id())()` |  |
	| `int` | `[productArity](#productArity())()` |  |
	| `java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `java.lang.String` | `[productElementName](#productElementName(int))​(int x$1)` |  |
	| `scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `java.lang.String` | `[typeName](#typeName())()` |  |
	| `static <T> scala.Option<scala.Tuple2<java.lang.String,​java.lang.String>>` | `[unapply](#unapply(akka.actor.typed.internal.receptionist.DefaultServiceKey))​([DefaultServiceKey](DefaultServiceKey.html "class in akka.actor.typed.internal.receptionist")<T> x$0)` |  |
	
	
		- ### Methods inherited from class akka.actor.typed.receptionist.[ServiceKey](../../receptionist/ServiceKey.html "class in akka.actor.typed.receptionist")
		
		
		`[apply](../../receptionist/ServiceKey.html#apply(java.lang.String,scala.reflect.ClassTag)), [asServiceKey](../../receptionist/ServiceKey.html#asServiceKey()), [create](../../receptionist/ServiceKey.html#create(java.lang.Class,java.lang.String)), [Listing](../../receptionist/ServiceKey.html#Listing()), [Registered](../../receptionist/ServiceKey.html#Registered())`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface scala.Product
		
		
		`productElementNames`

- - ### Constructor Detail
	
	
	
		- #### DefaultServiceKey
		
		
		
		```
		public DefaultServiceKey​(java.lang.String id,
		                         java.lang.String typeName)
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public static <T> [DefaultServiceKey](DefaultServiceKey.html "class in akka.actor.typed.internal.receptionist")<T> apply​(java.lang.String id,
		                                             java.lang.String typeName)
		```
		- #### unapply
		
		
		
		```
		public static <T> scala.Option<scala.Tuple2<java.lang.String,​java.lang.String>> unapply​([DefaultServiceKey](DefaultServiceKey.html "class in akka.actor.typed.internal.receptionist")<T> x$0)
		```
		- #### id
		
		
		
		```
		public java.lang.String id()
		```
		
		
		Specified by:
		`[id](../../receptionist/ServiceKey.html#id())` in class `[ServiceKey](../../receptionist/ServiceKey.html "class in akka.actor.typed.receptionist")<[T](DefaultServiceKey.html "type parameter in DefaultServiceKey")>`
		- #### typeName
		
		
		
		```
		public java.lang.String typeName()
		```
		- #### toString
		
		
		
		```
		public java.lang.String toString()
		```
		- #### copy
		
		
		
		```
		public <T> [DefaultServiceKey](DefaultServiceKey.html "class in akka.actor.typed.internal.receptionist")<T> copy​(java.lang.String id,
		                                     java.lang.String typeName)
		```
		- #### copy$default$1
		
		
		
		```
		public <T> java.lang.String copy$default$1()
		```
		- #### copy$default$2
		
		
		
		```
		public <T> java.lang.String copy$default$2()
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
		- #### equals
		
		
		
		```
		public boolean equals​(java.lang.Object x$1)
		```
		
		
		Specified by:
		`equals` in interface `scala.Equals`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/internal/receptionist/DefaultServiceKey.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/internal/receptionist/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/receptionist/ServiceKey.Listing$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/receptionist/ServiceKey.Registered$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/receptionist/ServiceKey.html
- https://doc.akka.io/japi/akka-core/2.10.17/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/internal/receptionist/DefaultServiceKey.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/internal/receptionist/DefaultServiceKey.html)*