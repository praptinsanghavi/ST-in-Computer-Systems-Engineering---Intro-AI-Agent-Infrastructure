---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:32:08Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/remote/artery/compress/CompressionTable$.html
title: CompressionTable$
---

# CompressionTable$

## Content

Package [akka.remote.artery.compress](package-summary.html)
## Class CompressionTable$

- java.lang.Object
- - akka.remote.artery.compress.CompressionTable$

- ---

```
public class CompressionTable$
extends java.lang.Object
```

INTERNAL API

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [CompressionTable$](CompressionTable$.html "class in akka.remote.artery.compress")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[CompressionTable$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<T> akka.remote.artery.compress.CompressionTable<T>` | `[apply](#apply(long,byte,scala.collection.immutable.Map))​(long originUid,  byte version,  scala.collection.immutable.Map<T,​java.lang.Object> dictionary)` |  |
	| `<T> java.util.Comparator<scala.Tuple2<T,​java.lang.Object>>` | `[compareBy2ndValue](#compareBy2ndValue())()` |  |
	| `java.util.Comparator<scala.Tuple2<java.lang.Object,​java.lang.Object>>` | `[CompareBy2ndValue](#CompareBy2ndValue())()` |  |
	| `<T> akka.remote.artery.compress.CompressionTable<T>` | `[empty](#empty())()` |  |
	| `int` | `[NotCompressedId](#NotCompressedId())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [CompressionTable$](CompressionTable$.html "class in akka.remote.artery.compress") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### CompressionTable$
		
		
		
		```
		public CompressionTable$()
		```

	- ### Method Detail
	
	
	
		- #### NotCompressedId
		
		
		
		```
		public final int NotCompressedId()
		```
		- #### CompareBy2ndValue
		
		
		
		```
		public final java.util.Comparator<scala.Tuple2<java.lang.Object,​java.lang.Object>> CompareBy2ndValue()
		```
		- #### compareBy2ndValue
		
		
		
		```
		public <T> java.util.Comparator<scala.Tuple2<T,​java.lang.Object>> compareBy2ndValue()
		```
		- #### empty
		
		
		
		```
		public <T> akka.remote.artery.compress.CompressionTable<T> empty()
		```
		- #### apply
		
		
		
		```
		public <T> akka.remote.artery.compress.CompressionTable<T> apply​(long originUid,
		                                                                 byte version,
		                                                                 scala.collection.immutable.Map<T,​java.lang.Object> dictionary)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/remote/artery/compress/CompressionTable$.html
- https://doc.akka.io/japi/akka/current/akka/remote/artery/compress/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/remote/artery/compress/CompressionTable$.html](https://doc.akka.io/japi/akka/current/akka/remote/artery/compress/CompressionTable$.html)*