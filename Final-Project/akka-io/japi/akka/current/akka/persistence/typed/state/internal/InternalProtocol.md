---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:31:43Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/persistence/typed/state/internal/InternalProtocol.UpsertSuccess$.html
title: InternalProtocol.UpsertSuccess$
---

# InternalProtocol.UpsertSuccess$

## Content

Package [akka.persistence.typed.state.internal](package-summary.html)
## Class InternalProtocol.UpsertSuccess$

- java.lang.Object
- - akka.persistence.typed.state.internal.InternalProtocol.UpsertSuccess$

- All Implemented Interfaces:
`[InternalProtocol](InternalProtocol.html "interface in akka.persistence.typed.state.internal")`, `java.io.Serializable`, `scala.Equals`, `scala.Product`

Enclosing interface:
[InternalProtocol](InternalProtocol.html "interface in akka.persistence.typed.state.internal")

---

```
public static class InternalProtocol.UpsertSuccess$
extends java.lang.Object
implements [InternalProtocol](InternalProtocol.html "interface in akka.persistence.typed.state.internal"), scala.Product, java.io.Serializable
```

See Also:
[Serialized Form](../../../../../serialized-form.html#akka.persistence.typed.state.internal.InternalProtocol.UpsertSuccess$)

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from interface akka.persistence.typed.state.internal.[InternalProtocol](InternalProtocol.html "interface in akka.persistence.typed.state.internal")
		
		
		`[InternalProtocol.ContinueUnstash$](InternalProtocol.ContinueUnstash$.html "class in akka.persistence.typed.state.internal"), [InternalProtocol.DeleteFailure](InternalProtocol.DeleteFailure.html "class in akka.persistence.typed.state.internal"), [InternalProtocol.DeleteFailure$](InternalProtocol.DeleteFailure$.html "class in akka.persistence.typed.state.internal"), [InternalProtocol.DeleteSuccess$](InternalProtocol.DeleteSuccess$.html "class in akka.persistence.typed.state.internal"), [InternalProtocol.GetFailure](InternalProtocol.GetFailure.html "class in akka.persistence.typed.state.internal"), [InternalProtocol.GetFailure$](InternalProtocol.GetFailure$.html "class in akka.persistence.typed.state.internal"), [InternalProtocol.GetSuccess](InternalProtocol.GetSuccess.html "class in akka.persistence.typed.state.internal")<[S](InternalProtocol.GetSuccess.html "type parameter in InternalProtocol.GetSuccess")>, [InternalProtocol.GetSuccess$](InternalProtocol.GetSuccess$.html "class in akka.persistence.typed.state.internal"), [InternalProtocol.IncomingCommand](InternalProtocol.IncomingCommand.html "class in akka.persistence.typed.state.internal")<[C](InternalProtocol.IncomingCommand.html "type parameter in InternalProtocol.IncomingCommand")>, [InternalProtocol.IncomingCommand$](InternalProtocol.IncomingCommand$.html "class in akka.persistence.typed.state.internal"), [InternalProtocol.RecoveryPermitGranted$](InternalProtocol.RecoveryPermitGranted$.html "class in akka.persistence.typed.state.internal"), [InternalProtocol.RecoveryTimeout$](InternalProtocol.RecoveryTimeout$.html "class in akka.persistence.typed.state.internal"), [InternalProtocol.UpsertFailure](InternalProtocol.UpsertFailure.html "class in akka.persistence.typed.state.internal"), [InternalProtocol.UpsertFailure$](InternalProtocol.UpsertFailure$.html "class in akka.persistence.typed.state.internal"), [InternalProtocol.UpsertSuccess$](InternalProtocol.UpsertSuccess$.html "class in akka.persistence.typed.state.internal")`

	- ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [InternalProtocol.UpsertSuccess$](InternalProtocol.UpsertSuccess$.html "class in akka.persistence.typed.state.internal")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[UpsertSuccess$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `int` | `[productArity](#productArity())()` |  |
	| `java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Equals
		
		
		`equals`
		- ### Methods inherited from interface scala.Product
		
		
		`productElementName, productElementNames`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [InternalProtocol.UpsertSuccess$](InternalProtocol.UpsertSuccess$.html "class in akka.persistence.typed.state.internal") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### UpsertSuccess$
		
		
		
		```
		public UpsertSuccess$()
		```

	- ### Method Detail
	
	
	
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
		- #### toString
		
		
		
		```
		public java.lang.String toString()
		```
		
		
		Overrides:
		`toString` in class `java.lang.Object`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/persistence/typed/state/internal/InternalProtocol.ContinueUnstash$.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/state/internal/InternalProtocol.DeleteFailure$.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/state/internal/InternalProtocol.DeleteFailure.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/state/internal/InternalProtocol.DeleteSuccess$.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/state/internal/InternalProtocol.GetFailure$.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/state/internal/InternalProtocol.GetFailure.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/state/internal/InternalProtocol.GetSuccess$.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/state/internal/InternalProtocol.GetSuccess.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/state/internal/InternalProtocol.IncomingCommand$.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/state/internal/InternalProtocol.IncomingCommand.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/state/internal/InternalProtocol.RecoveryPermitGranted$.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/state/internal/InternalProtocol.RecoveryTimeout$.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/state/internal/InternalProtocol.UpsertFailure$.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/state/internal/InternalProtocol.UpsertFailure.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/state/internal/InternalProtocol.UpsertSuccess$.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/state/internal/InternalProtocol.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/state/internal/package-summary.html
- https://doc.akka.io/japi/akka/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/persistence/typed/state/internal/InternalProtocol.UpsertSuccess$.html](https://doc.akka.io/japi/akka/current/akka/persistence/typed/state/internal/InternalProtocol.UpsertSuccess$.html)*