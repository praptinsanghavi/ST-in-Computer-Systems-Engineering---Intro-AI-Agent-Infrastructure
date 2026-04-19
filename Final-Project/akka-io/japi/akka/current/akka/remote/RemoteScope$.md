---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:34:05Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/remote/RemoteScope$.html
title: RemoteScope$
---

# RemoteScope$

## Content

Package [akka.remote](package-summary.html)
## Class RemoteScope$

- java.lang.Object
- - scala.runtime.AbstractFunction1\<[Address](../actor/Address.html "class in akka.actor"),​[RemoteScope](RemoteScope.html "class in akka.remote")\>
	- - akka.remote.RemoteScope$

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Function1<[Address](../actor/Address.html "class in akka.actor"),​[RemoteScope](RemoteScope.html "class in akka.remote")>`

---

```
public class RemoteScope$
extends scala.runtime.AbstractFunction1<[Address](../actor/Address.html "class in akka.actor"),​[RemoteScope](RemoteScope.html "class in akka.remote")>
implements java.io.Serializable
```

See Also:
[Serialized Form](../../serialized-form.html#akka.remote.RemoteScope$)

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from interface scala.Function1
		
		
		`scala.Function1.UnliftOps<A extends java.lang.Object,​B extends java.lang.Object>, scala.Function1.UnliftOps$`

	- ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [RemoteScope$](RemoteScope$.html "class in akka.remote")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[RemoteScope$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[RemoteScope](RemoteScope.html "class in akka.remote")` | `[apply](#apply(akka.actor.Address))​([Address](../actor/Address.html "class in akka.actor") node)` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `scala.Option<[Address](../actor/Address.html "class in akka.actor")>` | `[unapply](#unapply(akka.remote.RemoteScope))​([RemoteScope](RemoteScope.html "class in akka.remote") x$0)` |  |
	
	
		- ### Methods inherited from class scala.runtime.AbstractFunction1
		
		
		`andThen, apply$mcDD$sp, apply$mcDF$sp, apply$mcDI$sp, apply$mcDJ$sp, apply$mcFD$sp, apply$mcFF$sp, apply$mcFI$sp, apply$mcFJ$sp, apply$mcID$sp, apply$mcIF$sp, apply$mcII$sp, apply$mcIJ$sp, apply$mcJD$sp, apply$mcJF$sp, apply$mcJI$sp, apply$mcJJ$sp, apply$mcVD$sp, apply$mcVF$sp, apply$mcVI$sp, apply$mcVJ$sp, apply$mcZD$sp, apply$mcZF$sp, apply$mcZI$sp, apply$mcZJ$sp, compose`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [RemoteScope$](RemoteScope$.html "class in akka.remote") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### RemoteScope$
		
		
		
		```
		public RemoteScope$()
		```

	- ### Method Detail
	
	
	
		- #### toString
		
		
		
		```
		public final java.lang.String toString()
		```
		
		
		Specified by:
		`toString` in interface `scala.Function1<[Address](../actor/Address.html "class in akka.actor"),​[RemoteScope](RemoteScope.html "class in akka.remote")>`
		Overrides:
		`toString` in class `scala.runtime.AbstractFunction1<[Address](../actor/Address.html "class in akka.actor"),​[RemoteScope](RemoteScope.html "class in akka.remote")>`
		- #### apply
		
		
		
		```
		public [RemoteScope](RemoteScope.html "class in akka.remote") apply​([Address](../actor/Address.html "class in akka.actor") node)
		```
		
		
		Specified by:
		`apply` in interface `scala.Function1<[Address](../actor/Address.html "class in akka.actor"),​[RemoteScope](RemoteScope.html "class in akka.remote")>`
		- #### unapply
		
		
		
		```
		public scala.Option<[Address](../actor/Address.html "class in akka.actor")> unapply​([RemoteScope](RemoteScope.html "class in akka.remote") x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/Address.html
- https://doc.akka.io/japi/akka/current/akka/remote/RemoteScope$.html
- https://doc.akka.io/japi/akka/current/akka/remote/RemoteScope.html
- https://doc.akka.io/japi/akka/current/akka/remote/package-summary.html
- https://doc.akka.io/japi/akka/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/remote/RemoteScope$.html](https://doc.akka.io/japi/akka/current/akka/remote/RemoteScope$.html)*