---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:55:22Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/PropsImpl.MailboxFromConfigSelector$.html
title: PropsImpl.MailboxFromConfigSelector$
---

# PropsImpl.MailboxFromConfigSelector$

## Content

Package [akka.actor.typed.internal](package-summary.html)
## Class PropsImpl.MailboxFromConfigSelector$

- java.lang.Object
- - scala.runtime.AbstractFunction2\<java.lang.String,​[Props](../Props.html "class in akka.actor.typed"),​[PropsImpl.MailboxFromConfigSelector](PropsImpl.MailboxFromConfigSelector.html "class in akka.actor.typed.internal")\>
	- - akka.actor.typed.internal.PropsImpl.MailboxFromConfigSelector$

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Function2<java.lang.String,​[Props](../Props.html "class in akka.actor.typed"),​[PropsImpl.MailboxFromConfigSelector](PropsImpl.MailboxFromConfigSelector.html "class in akka.actor.typed.internal")>`

Enclosing class:
[PropsImpl](PropsImpl.html "class in akka.actor.typed.internal")

---

```
public static class PropsImpl.MailboxFromConfigSelector$
extends scala.runtime.AbstractFunction2<java.lang.String,​[Props](../Props.html "class in akka.actor.typed"),​[PropsImpl.MailboxFromConfigSelector](PropsImpl.MailboxFromConfigSelector.html "class in akka.actor.typed.internal")>
implements java.io.Serializable
```

See Also:
[Serialized Form](../../../../serialized-form.html#akka.actor.typed.internal.PropsImpl.MailboxFromConfigSelector$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [PropsImpl.MailboxFromConfigSelector$](PropsImpl.MailboxFromConfigSelector$.html "class in akka.actor.typed.internal")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[MailboxFromConfigSelector$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[Props](../Props.html "class in akka.actor.typed")` | `[$lessinit$greater$default$2](#$lessinit$greater$default$2())()` |  |
	| `[PropsImpl.MailboxFromConfigSelector](PropsImpl.MailboxFromConfigSelector.html "class in akka.actor.typed.internal")` | `[apply](#apply(java.lang.String,akka.actor.typed.Props))​(java.lang.String path,  [Props](../Props.html "class in akka.actor.typed") next)` |  |
	| `[Props](../Props.html "class in akka.actor.typed")` | `[apply$default$2](#apply$default$2())()` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `scala.Option<scala.Tuple2<java.lang.String,​[Props](../Props.html "class in akka.actor.typed")>>` | `[unapply](#unapply(akka.actor.typed.internal.PropsImpl.MailboxFromConfigSelector))​([PropsImpl.MailboxFromConfigSelector](PropsImpl.MailboxFromConfigSelector.html "class in akka.actor.typed.internal") x$0)` |  |
	
	
		- ### Methods inherited from class scala.runtime.AbstractFunction2
		
		
		`apply$mcDDD$sp, apply$mcDDI$sp, apply$mcDDJ$sp, apply$mcDID$sp, apply$mcDII$sp, apply$mcDIJ$sp, apply$mcDJD$sp, apply$mcDJI$sp, apply$mcDJJ$sp, apply$mcFDD$sp, apply$mcFDI$sp, apply$mcFDJ$sp, apply$mcFID$sp, apply$mcFII$sp, apply$mcFIJ$sp, apply$mcFJD$sp, apply$mcFJI$sp, apply$mcFJJ$sp, apply$mcIDD$sp, apply$mcIDI$sp, apply$mcIDJ$sp, apply$mcIID$sp, apply$mcIII$sp, apply$mcIIJ$sp, apply$mcIJD$sp, apply$mcIJI$sp, apply$mcIJJ$sp, apply$mcJDD$sp, apply$mcJDI$sp, apply$mcJDJ$sp, apply$mcJID$sp, apply$mcJII$sp, apply$mcJIJ$sp, apply$mcJJD$sp, apply$mcJJI$sp, apply$mcJJJ$sp, apply$mcVDD$sp, apply$mcVDI$sp, apply$mcVDJ$sp, apply$mcVID$sp, apply$mcVII$sp, apply$mcVIJ$sp, apply$mcVJD$sp, apply$mcVJI$sp, apply$mcVJJ$sp, apply$mcZDD$sp, apply$mcZDI$sp, apply$mcZDJ$sp, apply$mcZID$sp, apply$mcZII$sp, apply$mcZIJ$sp, apply$mcZJD$sp, apply$mcZJI$sp, apply$mcZJJ$sp, curried, tupled`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [PropsImpl.MailboxFromConfigSelector$](PropsImpl.MailboxFromConfigSelector$.html "class in akka.actor.typed.internal") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### MailboxFromConfigSelector$
		
		
		
		```
		public MailboxFromConfigSelector$()
		```

	- ### Method Detail
	
	
	
		- #### $lessinit$greater$default$2
		
		
		
		```
		public [Props](../Props.html "class in akka.actor.typed") $lessinit$greater$default$2()
		```
		- #### toString
		
		
		
		```
		public final java.lang.String toString()
		```
		
		
		Specified by:
		`toString` in interface `scala.Function2<java.lang.String,​[Props](../Props.html "class in akka.actor.typed"),​[PropsImpl.MailboxFromConfigSelector](PropsImpl.MailboxFromConfigSelector.html "class in akka.actor.typed.internal")>`
		Overrides:
		`toString` in class `scala.runtime.AbstractFunction2<java.lang.String,​[Props](../Props.html "class in akka.actor.typed"),​[PropsImpl.MailboxFromConfigSelector](PropsImpl.MailboxFromConfigSelector.html "class in akka.actor.typed.internal")>`
		- #### apply
		
		
		
		```
		public [PropsImpl.MailboxFromConfigSelector](PropsImpl.MailboxFromConfigSelector.html "class in akka.actor.typed.internal") apply​(java.lang.String path,
		                                                 [Props](../Props.html "class in akka.actor.typed") next)
		```
		
		
		Specified by:
		`apply` in interface `scala.Function2<java.lang.String,​[Props](../Props.html "class in akka.actor.typed"),​[PropsImpl.MailboxFromConfigSelector](PropsImpl.MailboxFromConfigSelector.html "class in akka.actor.typed.internal")>`
		- #### apply$default$2
		
		
		
		```
		public [Props](../Props.html "class in akka.actor.typed") apply$default$2()
		```
		- #### unapply
		
		
		
		```
		public scala.Option<scala.Tuple2<java.lang.String,​[Props](../Props.html "class in akka.actor.typed")>> unapply​([PropsImpl.MailboxFromConfigSelector](PropsImpl.MailboxFromConfigSelector.html "class in akka.actor.typed.internal") x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/typed/Props.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/PropsImpl.MailboxFromConfigSelector$.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/PropsImpl.MailboxFromConfigSelector.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/PropsImpl.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/package-summary.html
- https://doc.akka.io/japi/akka/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/PropsImpl.MailboxFromConfigSelector$.html](https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/PropsImpl.MailboxFromConfigSelector$.html)*