---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T13:51:38Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/current/akka/cluster/ClusterUserAction.SetAppVersion$.html
title: ClusterUserAction.SetAppVersion$
---

# ClusterUserAction.SetAppVersion$

## Content

Package [akka.cluster](package-summary.html)
## Class ClusterUserAction.SetAppVersion$

- java.lang.Object
- - scala.runtime.AbstractFunction1\<[Version](../util/Version.html "class in akka.util"),​[ClusterUserAction.SetAppVersion](ClusterUserAction.SetAppVersion.html "class in akka.cluster")\>
	- - akka.cluster.ClusterUserAction.SetAppVersion$

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Function1<[Version](../util/Version.html "class in akka.util"),​[ClusterUserAction.SetAppVersion](ClusterUserAction.SetAppVersion.html "class in akka.cluster")>`

Enclosing class:
[ClusterUserAction](ClusterUserAction.html "class in akka.cluster")

---

```
public static class ClusterUserAction.SetAppVersion$
extends scala.runtime.AbstractFunction1<[Version](../util/Version.html "class in akka.util"),​[ClusterUserAction.SetAppVersion](ClusterUserAction.SetAppVersion.html "class in akka.cluster")>
implements java.io.Serializable
```

See Also:
[Serialized Form](../../serialized-form.html#akka.cluster.ClusterUserAction.SetAppVersion$)

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from interface scala.Function1
		
		
		`scala.Function1.UnliftOps<A extends java.lang.Object,​B extends java.lang.Object>, scala.Function1.UnliftOps$`

	- ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [ClusterUserAction.SetAppVersion$](ClusterUserAction.SetAppVersion$.html "class in akka.cluster")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[SetAppVersion$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[ClusterUserAction.SetAppVersion](ClusterUserAction.SetAppVersion.html "class in akka.cluster")` | `[apply](#apply(akka.util.Version))​([Version](../util/Version.html "class in akka.util") appVersion)` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `scala.Option<[Version](../util/Version.html "class in akka.util")>` | `[unapply](#unapply(akka.cluster.ClusterUserAction.SetAppVersion))​([ClusterUserAction.SetAppVersion](ClusterUserAction.SetAppVersion.html "class in akka.cluster") x$0)` |  |
	
	
		- ### Methods inherited from class scala.runtime.AbstractFunction1
		
		
		`andThen, apply$mcDD$sp, apply$mcDF$sp, apply$mcDI$sp, apply$mcDJ$sp, apply$mcFD$sp, apply$mcFF$sp, apply$mcFI$sp, apply$mcFJ$sp, apply$mcID$sp, apply$mcIF$sp, apply$mcII$sp, apply$mcIJ$sp, apply$mcJD$sp, apply$mcJF$sp, apply$mcJI$sp, apply$mcJJ$sp, apply$mcVD$sp, apply$mcVF$sp, apply$mcVI$sp, apply$mcVJ$sp, apply$mcZD$sp, apply$mcZF$sp, apply$mcZI$sp, apply$mcZJ$sp, compose`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [ClusterUserAction.SetAppVersion$](ClusterUserAction.SetAppVersion$.html "class in akka.cluster") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### SetAppVersion$
		
		
		
		```
		public SetAppVersion$()
		```

	- ### Method Detail
	
	
	
		- #### toString
		
		
		
		```
		public final java.lang.String toString()
		```
		
		
		Specified by:
		`toString` in interface `scala.Function1<[Version](../util/Version.html "class in akka.util"),​[ClusterUserAction.SetAppVersion](ClusterUserAction.SetAppVersion.html "class in akka.cluster")>`
		Overrides:
		`toString` in class `scala.runtime.AbstractFunction1<[Version](../util/Version.html "class in akka.util"),​[ClusterUserAction.SetAppVersion](ClusterUserAction.SetAppVersion.html "class in akka.cluster")>`
		- #### apply
		
		
		
		```
		public [ClusterUserAction.SetAppVersion](ClusterUserAction.SetAppVersion.html "class in akka.cluster") apply​([Version](../util/Version.html "class in akka.util") appVersion)
		```
		
		
		Specified by:
		`apply` in interface `scala.Function1<[Version](../util/Version.html "class in akka.util"),​[ClusterUserAction.SetAppVersion](ClusterUserAction.SetAppVersion.html "class in akka.cluster")>`
		- #### unapply
		
		
		
		```
		public scala.Option<[Version](../util/Version.html "class in akka.util")> unapply​([ClusterUserAction.SetAppVersion](ClusterUserAction.SetAppVersion.html "class in akka.cluster") x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/current/akka/cluster/ClusterUserAction.SetAppVersion$.html
- https://doc.akka.io/japi/akka-core/current/akka/cluster/ClusterUserAction.SetAppVersion.html
- https://doc.akka.io/japi/akka-core/current/akka/cluster/ClusterUserAction.html
- https://doc.akka.io/japi/akka-core/current/akka/cluster/package-summary.html
- https://doc.akka.io/japi/akka-core/current/akka/util/Version.html
- https://doc.akka.io/japi/akka-core/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/current/akka/cluster/ClusterUserAction.SetAppVersion$.html](https://doc.akka.io/japi/akka-core/current/akka/cluster/ClusterUserAction.SetAppVersion$.html)*