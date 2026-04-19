---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:29:28Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/coding/DeflateCompressor$.html
title: DeflateCompressor$
---

# DeflateCompressor$

## Content

Package [akka.http.scaladsl.coding](package-summary.html)
## Class DeflateCompressor$

- java.lang.Object
- - akka.http.scaladsl.coding.DeflateCompressor$

- ---

```
public class DeflateCompressor$
extends java.lang.Object
```

Internal API

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [DeflateCompressor$](DeflateCompressor$.html "class in akka.http.scaladsl.coding")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[DeflateCompressor$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `int` | `[DefaultCompressionLevel](#DefaultCompressionLevel())()` |  |
	| `akka.util.ByteString` | `[drainDeflater](#drainDeflater(java.util.zip.Deflater,byte%5B%5D,akka.util.ByteStringBuilder))​(java.util.zip.Deflater deflater,  byte[] buffer,  akka.util.ByteStringBuilder result)` |  |
	| `int` | `[MinBufferSize](#MinBufferSize())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [DeflateCompressor$](DeflateCompressor$.html "class in akka.http.scaladsl.coding") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### DeflateCompressor$
		
		
		
		```
		public DeflateCompressor$()
		```

	- ### Method Detail
	
	
	
		- #### MinBufferSize
		
		
		
		```
		public int MinBufferSize()
		```
		- #### DefaultCompressionLevel
		
		
		
		```
		public int DefaultCompressionLevel()
		```
		- #### drainDeflater
		
		
		
		```
		public akka.util.ByteString drainDeflater​(java.util.zip.Deflater deflater,
		                                          byte[] buffer,
		                                          akka.util.ByteStringBuilder result)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/coding/DeflateCompressor$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/coding/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/coding/DeflateCompressor$.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/coding/DeflateCompressor$.html)*