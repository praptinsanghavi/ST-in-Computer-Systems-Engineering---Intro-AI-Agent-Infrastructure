---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:50:11Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/util/PrettyByteString.html
title: PrettyByteString
---

# PrettyByteString

## Content

Package [akka.util](package-summary.html)
## Class PrettyByteString

- java.lang.Object
- - akka.util.PrettyByteString

- ---

```
public class PrettyByteString
extends java.lang.Object
```

INTERNAL API: ByteString pretty printer, based on Johanes Rudolph's implementation from:
 https://github.com/jrudolph/akka/commit/c889dddf37c8635c365a79a391eb18a709f36773\#diff\-947cbf07996eeb823cb9850cc2e81126R19

- - ### Nested Class Summary
	
	
	
	Nested Classes 
	| Modifier and Type | Class | Description |
	| `static class` | `[PrettyByteString.asPretty](PrettyByteString.asPretty.html "class in akka.util")` |  |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[PrettyByteString](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [PrettyByteString.asPretty](PrettyByteString.asPretty.html "class in akka.util")` | `[asPretty](#asPretty(akka.util.ByteString))​([ByteString](ByteString.html "class in akka.util") bs)` |  |
	| `static scala.collection.Iterator<java.lang.String>` | `[formatBytes](#formatBytes(akka.util.ByteString,int))​([ByteString](ByteString.html "class in akka.util") bs,  int maxBytes)` |  |
	| `static int` | `[formatBytes$default$2](#formatBytes$default$2())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### PrettyByteString
		
		
		
		```
		public PrettyByteString()
		```

	- ### Method Detail
	
	
	
		- #### asPretty
		
		
		
		```
		public static [PrettyByteString.asPretty](PrettyByteString.asPretty.html "class in akka.util") asPretty​([ByteString](ByteString.html "class in akka.util") bs)
		```
		- #### formatBytes
		
		
		
		```
		public static scala.collection.Iterator<java.lang.String> formatBytes​([ByteString](ByteString.html "class in akka.util") bs,
		                                                                      int maxBytes)
		```
		- #### formatBytes$default$2
		
		
		
		```
		public static int formatBytes$default$2()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/util/ByteString.html
- https://doc.akka.io/japi/akka/current/akka/util/PrettyByteString.asPretty.html
- https://doc.akka.io/japi/akka/current/akka/util/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/util/PrettyByteString.html](https://doc.akka.io/japi/akka/current/akka/util/PrettyByteString.html)*