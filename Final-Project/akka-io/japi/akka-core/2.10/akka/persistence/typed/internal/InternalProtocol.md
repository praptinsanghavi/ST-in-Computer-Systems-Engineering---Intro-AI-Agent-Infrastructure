---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:13:40Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/internal/InternalProtocol.SnapshotterResponse$.html
title: InternalProtocol.SnapshotterResponse$
---

# InternalProtocol.SnapshotterResponse$

## Content

Package [akka.persistence.typed.internal](package-summary.html)
## Class InternalProtocol.SnapshotterResponse$

- java.lang.Object
- - scala.runtime.AbstractFunction1\<[SnapshotProtocol.Response](../../SnapshotProtocol.Response.html "interface in akka.persistence"),​[InternalProtocol.SnapshotterResponse](InternalProtocol.SnapshotterResponse.html "class in akka.persistence.typed.internal")\>
	- - akka.persistence.typed.internal.InternalProtocol.SnapshotterResponse$

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Function1<[SnapshotProtocol.Response](../../SnapshotProtocol.Response.html "interface in akka.persistence"),​[InternalProtocol.SnapshotterResponse](InternalProtocol.SnapshotterResponse.html "class in akka.persistence.typed.internal")>`

Enclosing interface:
[InternalProtocol](InternalProtocol.html "interface in akka.persistence.typed.internal")

---

```
public static class InternalProtocol.SnapshotterResponse$
extends scala.runtime.AbstractFunction1<[SnapshotProtocol.Response](../../SnapshotProtocol.Response.html "interface in akka.persistence"),​[InternalProtocol.SnapshotterResponse](InternalProtocol.SnapshotterResponse.html "class in akka.persistence.typed.internal")>
implements java.io.Serializable
```

See Also:
[Serialized Form](../../../../serialized-form.html#akka.persistence.typed.internal.InternalProtocol.SnapshotterResponse$)

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from interface scala.Function1
		
		
		`scala.Function1.UnliftOps<A extends java.lang.Object,​B extends java.lang.Object>, scala.Function1.UnliftOps$`

	- ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [InternalProtocol.SnapshotterResponse$](InternalProtocol.SnapshotterResponse$.html "class in akka.persistence.typed.internal")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[SnapshotterResponse$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[InternalProtocol.SnapshotterResponse](InternalProtocol.SnapshotterResponse.html "class in akka.persistence.typed.internal")` | `[apply](#apply(akka.persistence.SnapshotProtocol.Response))​([SnapshotProtocol.Response](../../SnapshotProtocol.Response.html "interface in akka.persistence") msg)` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `scala.Option<[SnapshotProtocol.Response](../../SnapshotProtocol.Response.html "interface in akka.persistence")>` | `[unapply](#unapply(akka.persistence.typed.internal.InternalProtocol.SnapshotterResponse))​([InternalProtocol.SnapshotterResponse](InternalProtocol.SnapshotterResponse.html "class in akka.persistence.typed.internal") x$0)` |  |
	
	
		- ### Methods inherited from class scala.runtime.AbstractFunction1
		
		
		`andThen, apply$mcDD$sp, apply$mcDF$sp, apply$mcDI$sp, apply$mcDJ$sp, apply$mcFD$sp, apply$mcFF$sp, apply$mcFI$sp, apply$mcFJ$sp, apply$mcID$sp, apply$mcIF$sp, apply$mcII$sp, apply$mcIJ$sp, apply$mcJD$sp, apply$mcJF$sp, apply$mcJI$sp, apply$mcJJ$sp, apply$mcVD$sp, apply$mcVF$sp, apply$mcVI$sp, apply$mcVJ$sp, apply$mcZD$sp, apply$mcZF$sp, apply$mcZI$sp, apply$mcZJ$sp, compose`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [InternalProtocol.SnapshotterResponse$](InternalProtocol.SnapshotterResponse$.html "class in akka.persistence.typed.internal") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### SnapshotterResponse$
		
		
		
		```
		public SnapshotterResponse$()
		```

	- ### Method Detail
	
	
	
		- #### toString
		
		
		
		```
		public final java.lang.String toString()
		```
		
		
		Specified by:
		`toString` in interface `scala.Function1<[SnapshotProtocol.Response](../../SnapshotProtocol.Response.html "interface in akka.persistence"),​[InternalProtocol.SnapshotterResponse](InternalProtocol.SnapshotterResponse.html "class in akka.persistence.typed.internal")>`
		Overrides:
		`toString` in class `scala.runtime.AbstractFunction1<[SnapshotProtocol.Response](../../SnapshotProtocol.Response.html "interface in akka.persistence"),​[InternalProtocol.SnapshotterResponse](InternalProtocol.SnapshotterResponse.html "class in akka.persistence.typed.internal")>`
		- #### apply
		
		
		
		```
		public [InternalProtocol.SnapshotterResponse](InternalProtocol.SnapshotterResponse.html "class in akka.persistence.typed.internal") apply​([SnapshotProtocol.Response](../../SnapshotProtocol.Response.html "interface in akka.persistence") msg)
		```
		
		
		Specified by:
		`apply` in interface `scala.Function1<[SnapshotProtocol.Response](../../SnapshotProtocol.Response.html "interface in akka.persistence"),​[InternalProtocol.SnapshotterResponse](InternalProtocol.SnapshotterResponse.html "class in akka.persistence.typed.internal")>`
		- #### unapply
		
		
		
		```
		public scala.Option<[SnapshotProtocol.Response](../../SnapshotProtocol.Response.html "interface in akka.persistence")> unapply​([InternalProtocol.SnapshotterResponse](InternalProtocol.SnapshotterResponse.html "class in akka.persistence.typed.internal") x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/SnapshotProtocol.Response.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/internal/InternalProtocol.SnapshotterResponse$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/internal/InternalProtocol.SnapshotterResponse.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/internal/InternalProtocol.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/internal/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/internal/InternalProtocol.SnapshotterResponse$.html](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/internal/InternalProtocol.SnapshotterResponse$.html)*