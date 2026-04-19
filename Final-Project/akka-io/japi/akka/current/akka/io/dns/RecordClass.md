---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:18:52Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/io/dns/RecordClass.html
title: RecordClass
---

# RecordClass

## Content

Package [akka.io.dns](package-summary.html)
## Class RecordClass

- java.lang.Object
- - akka.io.dns.RecordClass

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public final class RecordClass
extends java.lang.Object
implements scala.Product, java.io.Serializable
```

See Also:
[Serialized Form](../../../serialized-form.html#akka.io.dns.RecordClass)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[RecordClass](#%3Cinit%3E(short,java.lang.String))​(short code,  java.lang.String name)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [RecordClass](RecordClass.html "class in akka.io.dns")` | `[apply](#apply(short,java.lang.String))​(short code,  java.lang.String name)` |  |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `static [RecordClass](RecordClass.html "class in akka.io.dns")` | `[CH](#CH())()` |  |
	| `short` | `[code](#code())()` |  |
	| `[RecordClass](RecordClass.html "class in akka.io.dns")` | `[copy](#copy(short,java.lang.String))​(short code,  java.lang.String name)` |  |
	| `short` | `[copy$default$1](#copy$default$1())()` |  |
	| `java.lang.String` | `[copy$default$2](#copy$default$2())()` |  |
	| `static [RecordClass](RecordClass.html "class in akka.io.dns")` | `[CS](#CS())()` |  |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `static [RecordClass](RecordClass.html "class in akka.io.dns")` | `[HS](#HS())()` |  |
	| `static [RecordClass](RecordClass.html "class in akka.io.dns")` | `[IN](#IN())()` |  |
	| `java.lang.String` | `[name](#name())()` |  |
	| `int` | `[productArity](#productArity())()` |  |
	| `java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `java.lang.String` | `[productElementName](#productElementName(int))​(int x$1)` |  |
	| `scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `static scala.Option<scala.Tuple2<java.lang.Object,​java.lang.String>>` | `[unapply](#unapply(akka.io.dns.RecordClass))​([RecordClass](RecordClass.html "class in akka.io.dns") x$0)` |  |
	| `static [RecordClass](RecordClass.html "class in akka.io.dns")` | `[WILDCARD](#WILDCARD())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Product
		
		
		`productElementNames`

- - ### Constructor Detail
	
	
	
		- #### RecordClass
		
		
		
		```
		public RecordClass​(short code,
		                   java.lang.String name)
		```

	- ### Method Detail
	
	
	
		- #### IN
		
		
		
		```
		public static [RecordClass](RecordClass.html "class in akka.io.dns") IN()
		```
		- #### CS
		
		
		
		```
		public static [RecordClass](RecordClass.html "class in akka.io.dns") CS()
		```
		- #### CH
		
		
		
		```
		public static [RecordClass](RecordClass.html "class in akka.io.dns") CH()
		```
		- #### HS
		
		
		
		```
		public static [RecordClass](RecordClass.html "class in akka.io.dns") HS()
		```
		- #### WILDCARD
		
		
		
		```
		public static [RecordClass](RecordClass.html "class in akka.io.dns") WILDCARD()
		```
		- #### apply
		
		
		
		```
		public static [RecordClass](RecordClass.html "class in akka.io.dns") apply​(short code,
		                                java.lang.String name)
		```
		- #### unapply
		
		
		
		```
		public static scala.Option<scala.Tuple2<java.lang.Object,​java.lang.String>> unapply​([RecordClass](RecordClass.html "class in akka.io.dns") x$0)
		```
		- #### code
		
		
		
		```
		public short code()
		```
		- #### name
		
		
		
		```
		public java.lang.String name()
		```
		- #### copy
		
		
		
		```
		public [RecordClass](RecordClass.html "class in akka.io.dns") copy​(short code,
		                        java.lang.String name)
		```
		- #### copy$default$1
		
		
		
		```
		public short copy$default$1()
		```
		- #### copy$default$2
		
		
		
		```
		public java.lang.String copy$default$2()
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

- https://doc.akka.io/japi/akka/current/akka/io/dns/RecordClass.html
- https://doc.akka.io/japi/akka/current/akka/io/dns/package-summary.html
- https://doc.akka.io/japi/akka/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/io/dns/RecordClass.html](https://doc.akka.io/japi/akka/current/akka/io/dns/RecordClass.html)*