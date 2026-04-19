---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:46:45Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/journal/IdentityEventAdapters$.html
title: IdentityEventAdapters$
---

# IdentityEventAdapters$

## Content

Package [akka.persistence.journal](package-summary.html)
## Class IdentityEventAdapters$

- java.lang.Object
- - [akka.persistence.journal.EventAdapters](EventAdapters.html "class in akka.persistence.journal")
	- - akka.persistence.journal.IdentityEventAdapters$

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public class IdentityEventAdapters$
extends [EventAdapters](EventAdapters.html "class in akka.persistence.journal")
implements scala.Product, java.io.Serializable
```

See Also:
[Serialized Form](../../../serialized-form.html#akka.persistence.journal.IdentityEventAdapters$)

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from class akka.persistence.journal.[EventAdapters](EventAdapters.html "class in akka.persistence.journal")
		
		
		`[EventAdapters.CombinedReadEventAdapter$](EventAdapters.CombinedReadEventAdapter$.html "class in akka.persistence.journal")`

	- ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [IdentityEventAdapters$](IdentityEventAdapters$.html "class in akka.persistence.journal")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[IdentityEventAdapters$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `[EventAdapter](EventAdapter.html "interface in akka.persistence.journal")` | `[get](#get(java.lang.Class))​(java.lang.Class<?> clazz)` | Finds the "most specific" matching adapter for the given class (i.e. |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `int` | `[productArity](#productArity())()` |  |
	| `java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	
	
		- ### Methods inherited from class akka.persistence.journal.[EventAdapters](EventAdapters.html "class in akka.persistence.journal")
		
		
		`[apply](EventAdapters.html#apply(akka.actor.ExtendedActorSystem,com.typesafe.config.Config)), [instantiateAdapter](EventAdapters.html#instantiateAdapter(java.lang.String,akka.actor.ExtendedActorSystem))`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Equals
		
		
		`equals`
		- ### Methods inherited from interface scala.Product
		
		
		`productElementName, productElementNames`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [IdentityEventAdapters$](IdentityEventAdapters$.html "class in akka.persistence.journal") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### IdentityEventAdapters$
		
		
		
		```
		public IdentityEventAdapters$()
		```

	- ### Method Detail
	
	
	
		- #### get
		
		
		
		```
		public [EventAdapter](EventAdapter.html "interface in akka.persistence.journal") get​(java.lang.Class<?> clazz)
		```
		
		Description copied from class: `[EventAdapters](EventAdapters.html#get(java.lang.Class))`
		Finds the "most specific" matching adapter for the given class (i.e. it may return an adapter that can work on a
		 interface implemented by the given class if no direct match is found).
		 
		 Falls back to [`IdentityEventAdapter`](IdentityEventAdapter.html "class in akka.persistence.journal") if no adapter was defined for the given class.
		
		
		
		Overrides:
		`[get](EventAdapters.html#get(java.lang.Class))` in class `[EventAdapters](EventAdapters.html "class in akka.persistence.journal")`
		- #### toString
		
		
		
		```
		public java.lang.String toString()
		```
		
		
		Overrides:
		`[toString](EventAdapters.html#toString())` in class `[EventAdapters](EventAdapters.html "class in akka.persistence.journal")`
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
		- #### hashCode
		
		
		
		```
		public int hashCode()
		```
		
		
		Overrides:
		`hashCode` in class `java.lang.Object`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/journal/EventAdapter.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/journal/EventAdapters.CombinedReadEventAdapter$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/journal/EventAdapters.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/journal/IdentityEventAdapter.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/journal/IdentityEventAdapters$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/journal/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/journal/IdentityEventAdapters$.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/journal/IdentityEventAdapters$.html)*