---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:56:43Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/util/WildcardTree$.html
title: WildcardTree$
---

# WildcardTree$

## Content

Package [akka.util](package-summary.html)
## Class WildcardTree$

- java.lang.Object
- - akka.util.WildcardTree$

- All Implemented Interfaces:
`java.io.Serializable`

---

```
public class WildcardTree$
extends java.lang.Object
implements java.io.Serializable
```

INTERNAL API

See Also:
[Serialized Form](../../serialized-form.html#akka.util.WildcardTree$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [WildcardTree$](WildcardTree$.html "class in akka.util")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[WildcardTree$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<T> scala.None$` | `[$lessinit$greater$default$1](#$lessinit$greater$default$1())()` | INTERNAL API |
	| `<T> scala.collection.immutable.HashMap<java.lang.String,​akka.util.WildcardTree<T>>` | `[$lessinit$greater$default$2](#$lessinit$greater$default$2())()` |  |
	| `<T> scala.collection.immutable.HashMap<java.lang.String,​akka.util.WildcardTree<T>>` | `[$lessinit$greater$default$3](#$lessinit$greater$default$3())()` |  |
	| `<T> akka.util.WildcardTree<T>` | `[apply](#apply())()` |  |
	| `<T> akka.util.WildcardTree<T>` | `[apply](#apply(scala.Option,scala.collection.immutable.Map,scala.collection.immutable.Map))​(scala.Option<T> data,  scala.collection.immutable.Map<java.lang.String,​akka.util.WildcardTree<T>> children,  scala.collection.immutable.Map<java.lang.String,​akka.util.WildcardTree<T>> wildcardSuffixChildren)` |  |
	| `<T> scala.None$` | `[apply$default$1](#apply$default$1())()` | INTERNAL API |
	| `<T> scala.collection.immutable.HashMap<java.lang.String,​akka.util.WildcardTree<T>>` | `[apply$default$2](#apply$default$2())()` |  |
	| `<T> scala.collection.immutable.HashMap<java.lang.String,​akka.util.WildcardTree<T>>` | `[apply$default$3](#apply$default$3())()` |  |
	| `<T> scala.Option<scala.Tuple3<scala.Option<T>,​scala.collection.immutable.Map<java.lang.String,​akka.util.WildcardTree<T>>,​scala.collection.immutable.Map<java.lang.String,​akka.util.WildcardTree<T>>>>` | `[unapply](#unapply(akka.util.WildcardTree))​(akka.util.WildcardTree<T> x$0)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [WildcardTree$](WildcardTree$.html "class in akka.util") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### WildcardTree$
		
		
		
		```
		public WildcardTree$()
		```

	- ### Method Detail
	
	
	
		- #### $lessinit$greater$default$1
		
		
		
		```
		public <T> scala.None$ $lessinit$greater$default$1()
		```
		
		INTERNAL API
		- #### $lessinit$greater$default$2
		
		
		
		```
		public <T> scala.collection.immutable.HashMap<java.lang.String,​akka.util.WildcardTree<T>> $lessinit$greater$default$2()
		```
		- #### $lessinit$greater$default$3
		
		
		
		```
		public <T> scala.collection.immutable.HashMap<java.lang.String,​akka.util.WildcardTree<T>> $lessinit$greater$default$3()
		```
		- #### apply
		
		
		
		```
		public <T> akka.util.WildcardTree<T> apply()
		```
		- #### apply$default$1
		
		
		
		```
		public <T> scala.None$ apply$default$1()
		```
		
		INTERNAL API
		- #### apply$default$2
		
		
		
		```
		public <T> scala.collection.immutable.HashMap<java.lang.String,​akka.util.WildcardTree<T>> apply$default$2()
		```
		- #### apply$default$3
		
		
		
		```
		public <T> scala.collection.immutable.HashMap<java.lang.String,​akka.util.WildcardTree<T>> apply$default$3()
		```
		- #### apply
		
		
		
		```
		public <T> akka.util.WildcardTree<T> apply​(scala.Option<T> data,
		                                           scala.collection.immutable.Map<java.lang.String,​akka.util.WildcardTree<T>> children,
		                                           scala.collection.immutable.Map<java.lang.String,​akka.util.WildcardTree<T>> wildcardSuffixChildren)
		```
		- #### unapply
		
		
		
		```
		public <T> scala.Option<scala.Tuple3<scala.Option<T>,​scala.collection.immutable.Map<java.lang.String,​akka.util.WildcardTree<T>>,​scala.collection.immutable.Map<java.lang.String,​akka.util.WildcardTree<T>>>> unapply​(akka.util.WildcardTree<T> x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/util/WildcardTree$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/util/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/util/WildcardTree$.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/util/WildcardTree$.html)*