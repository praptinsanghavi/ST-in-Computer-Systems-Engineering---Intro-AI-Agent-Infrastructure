---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:13:02Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/persistence/testkit/scaladsl/PersistenceEffect.html
title: PersistenceEffect
---

# PersistenceEffect

## Content

Package [akka.persistence.testkit.scaladsl](package-summary.html)
## Class PersistenceEffect\<T\>

- java.lang.Object
- - akka.persistence.testkit.scaladsl.PersistenceEffect\<T\>

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public final class PersistenceEffect<T>
extends java.lang.Object
implements scala.Product, java.io.Serializable
```

See Also:
[Serialized Form](../../../../serialized-form.html#akka.persistence.testkit.scaladsl.PersistenceEffect)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[PersistenceEffect](#%3Cinit%3E(T,long,scala.collection.immutable.Set))​([T](PersistenceEffect.html "type parameter in PersistenceEffect") persistedObject,  long sequenceNr,  scala.collection.immutable.Set<java.lang.String> tags)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static <T> [PersistenceEffect](PersistenceEffect.html "class in akka.persistence.testkit.scaladsl")<T>` | `[apply](#apply(T,long,scala.collection.immutable.Set))​(T persistedObject,  long sequenceNr,  scala.collection.immutable.Set<java.lang.String> tags)` |  |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `<T> [PersistenceEffect](PersistenceEffect.html "class in akka.persistence.testkit.scaladsl")<T>` | `[copy](#copy(T,long,scala.collection.immutable.Set))​(T persistedObject,  long sequenceNr,  scala.collection.immutable.Set<java.lang.String> tags)` |  |
	| `<T> T` | `[copy$default$1](#copy$default$1())()` |  |
	| `<T> long` | `[copy$default$2](#copy$default$2())()` |  |
	| `<T> scala.collection.immutable.Set<java.lang.String>` | `[copy$default$3](#copy$default$3())()` |  |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `[T](PersistenceEffect.html "type parameter in PersistenceEffect")` | `[persistedObject](#persistedObject())()` |  |
	| `int` | `[productArity](#productArity())()` |  |
	| `java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `java.lang.String` | `[productElementName](#productElementName(int))​(int x$1)` |  |
	| `scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `long` | `[sequenceNr](#sequenceNr())()` |  |
	| `scala.collection.immutable.Set<java.lang.String>` | `[tags](#tags())()` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `static <T> scala.Option<scala.Tuple3<T,​java.lang.Object,​scala.collection.immutable.Set<java.lang.String>>>` | `[unapply](#unapply(akka.persistence.testkit.scaladsl.PersistenceEffect))​([PersistenceEffect](PersistenceEffect.html "class in akka.persistence.testkit.scaladsl")<T> x$0)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Product
		
		
		`productElementNames`

- - ### Constructor Detail
	
	
	
		- #### PersistenceEffect
		
		
		
		```
		public PersistenceEffect​([T](PersistenceEffect.html "type parameter in PersistenceEffect") persistedObject,
		                         long sequenceNr,
		                         scala.collection.immutable.Set<java.lang.String> tags)
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public static <T> [PersistenceEffect](PersistenceEffect.html "class in akka.persistence.testkit.scaladsl")<T> apply​(T persistedObject,
		                                             long sequenceNr,
		                                             scala.collection.immutable.Set<java.lang.String> tags)
		```
		- #### unapply
		
		
		
		```
		public static <T> scala.Option<scala.Tuple3<T,​java.lang.Object,​scala.collection.immutable.Set<java.lang.String>>> unapply​([PersistenceEffect](PersistenceEffect.html "class in akka.persistence.testkit.scaladsl")<T> x$0)
		```
		- #### persistedObject
		
		
		
		```
		public [T](PersistenceEffect.html "type parameter in PersistenceEffect") persistedObject()
		```
		- #### sequenceNr
		
		
		
		```
		public long sequenceNr()
		```
		- #### tags
		
		
		
		```
		public scala.collection.immutable.Set<java.lang.String> tags()
		```
		- #### copy
		
		
		
		```
		public <T> [PersistenceEffect](PersistenceEffect.html "class in akka.persistence.testkit.scaladsl")<T> copy​(T persistedObject,
		                                     long sequenceNr,
		                                     scala.collection.immutable.Set<java.lang.String> tags)
		```
		- #### copy$default$1
		
		
		
		```
		public <T> T copy$default$1()
		```
		- #### copy$default$2
		
		
		
		```
		public <T> long copy$default$2()
		```
		- #### copy$default$3
		
		
		
		```
		public <T> scala.collection.immutable.Set<java.lang.String> copy$default$3()
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

- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/testkit/scaladsl/PersistenceEffect.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/testkit/scaladsl/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/persistence/testkit/scaladsl/PersistenceEffect.html](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/testkit/scaladsl/PersistenceEffect.html)*