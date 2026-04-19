---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:32:08Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/remote/artery/compress/DecompressionTable$.html
title: DecompressionTable$
---

# DecompressionTable$

## Content

Package [akka.remote.artery.compress](package-summary.html)
## Class DecompressionTable$

- java.lang.Object
- - akka.remote.artery.compress.DecompressionTable$

- All Implemented Interfaces:
`java.io.Serializable`

---

```
public class DecompressionTable$
extends java.lang.Object
implements java.io.Serializable
```

INTERNAL API

See Also:
[Serialized Form](../../../../serialized-form.html#akka.remote.artery.compress.DecompressionTable$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [DecompressionTable$](DecompressionTable$.html "class in akka.remote.artery.compress")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[DecompressionTable$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<T> akka.remote.artery.compress.DecompressionTable<T>` | `[apply](#apply(long,byte,java.lang.Object))​(long originUid,  byte version,  java.lang.Object table)` |  |
	| `<T> akka.remote.artery.compress.DecompressionTable<T>` | `[disabled](#disabled())()` |  |
	| `byte` | `[DisabledVersion](#DisabledVersion())()` |  |
	| `<T> akka.remote.artery.compress.DecompressionTable<T>` | `[empty](#empty())()` |  |
	| `<T> scala.Option<scala.Tuple3<java.lang.Object,​java.lang.Object,​java.lang.Object>>` | `[unapply](#unapply(akka.remote.artery.compress.DecompressionTable))​(akka.remote.artery.compress.DecompressionTable<T> x$0)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [DecompressionTable$](DecompressionTable$.html "class in akka.remote.artery.compress") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### DecompressionTable$
		
		
		
		```
		public DecompressionTable$()
		```

	- ### Method Detail
	
	
	
		- #### DisabledVersion
		
		
		
		```
		public byte DisabledVersion()
		```
		- #### empty
		
		
		
		```
		public <T> akka.remote.artery.compress.DecompressionTable<T> empty()
		```
		- #### disabled
		
		
		
		```
		public <T> akka.remote.artery.compress.DecompressionTable<T> disabled()
		```
		- #### apply
		
		
		
		```
		public <T> akka.remote.artery.compress.DecompressionTable<T> apply​(long originUid,
		                                                                   byte version,
		                                                                   java.lang.Object table)
		```
		- #### unapply
		
		
		
		```
		public <T> scala.Option<scala.Tuple3<java.lang.Object,​java.lang.Object,​java.lang.Object>> unapply​(akka.remote.artery.compress.DecompressionTable<T> x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/remote/artery/compress/DecompressionTable$.html
- https://doc.akka.io/japi/akka/current/akka/remote/artery/compress/package-summary.html
- https://doc.akka.io/japi/akka/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/remote/artery/compress/DecompressionTable$.html](https://doc.akka.io/japi/akka/current/akka/remote/artery/compress/DecompressionTable$.html)*