---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:29:32Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/coding/GzipCompressor.html
title: GzipCompressor
---

# GzipCompressor

## Content

Package [akka.http.scaladsl.coding](package-summary.html)
## Class GzipCompressor

- java.lang.Object
- - [akka.http.scaladsl.coding.Compressor](Compressor.html "class in akka.http.scaladsl.coding")
	- - [akka.http.scaladsl.coding.DeflateCompressor](DeflateCompressor.html "class in akka.http.scaladsl.coding")
		- - akka.http.scaladsl.coding.GzipCompressor

- ---

```
public class GzipCompressor
extends [DeflateCompressor](DeflateCompressor.html "class in akka.http.scaladsl.coding")
```

Internal API

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[GzipCompressor](#%3Cinit%3E())()` |  |
	| `[GzipCompressor](#%3Cinit%3E(int))​(int compressionLevel)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `protected akka.util.ByteString` | `[compressWithBuffer](#compressWithBuffer(akka.util.ByteString,byte%5B%5D))​(akka.util.ByteString input,  byte[] buffer)` |  |
	| `static int` | `[DefaultCompressionLevel](#DefaultCompressionLevel())()` |  |
	| `protected java.util.zip.Deflater` | `[deflater](#deflater())()` |  |
	| `protected akka.util.ByteString` | `[finishWithBuffer](#finishWithBuffer(byte%5B%5D))​(byte[] buffer)` |  |
	| `protected akka.util.ByteString` | `[flushWithBuffer](#flushWithBuffer(byte%5B%5D))​(byte[] buffer)` |  |
	
	
		- ### Methods inherited from class akka.http.scaladsl.coding.[DeflateCompressor](DeflateCompressor.html "class in akka.http.scaladsl.coding")
		
		
		`[compress](DeflateCompressor.html#compress(akka.util.ByteString)), [compressAndFinish](DeflateCompressor.html#compressAndFinish(akka.util.ByteString)), [compressAndFlush](DeflateCompressor.html#compressAndFlush(akka.util.ByteString)), [drainDeflater](DeflateCompressor.html#drainDeflater(java.util.zip.Deflater,byte%5B%5D,akka.util.ByteStringBuilder)), [finish](DeflateCompressor.html#finish()), [flush](DeflateCompressor.html#flush()), [MinBufferSize](DeflateCompressor.html#MinBufferSize())`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### GzipCompressor
		
		
		
		```
		public GzipCompressor​(int compressionLevel)
		```
		- #### GzipCompressor
		
		
		
		```
		public GzipCompressor()
		```

	- ### Method Detail
	
	
	
		- #### DefaultCompressionLevel
		
		
		
		```
		public static int DefaultCompressionLevel()
		```
		- #### deflater
		
		
		
		```
		protected java.util.zip.Deflater deflater()
		```
		
		
		Overrides:
		`[deflater](DeflateCompressor.html#deflater())` in class `[DeflateCompressor](DeflateCompressor.html "class in akka.http.scaladsl.coding")`
		- #### compressWithBuffer
		
		
		
		```
		protected akka.util.ByteString compressWithBuffer​(akka.util.ByteString input,
		                                                  byte[] buffer)
		```
		
		
		Overrides:
		`[compressWithBuffer](DeflateCompressor.html#compressWithBuffer(akka.util.ByteString,byte%5B%5D))` in class `[DeflateCompressor](DeflateCompressor.html "class in akka.http.scaladsl.coding")`
		- #### flushWithBuffer
		
		
		
		```
		protected akka.util.ByteString flushWithBuffer​(byte[] buffer)
		```
		
		
		Overrides:
		`[flushWithBuffer](DeflateCompressor.html#flushWithBuffer(byte%5B%5D))` in class `[DeflateCompressor](DeflateCompressor.html "class in akka.http.scaladsl.coding")`
		- #### finishWithBuffer
		
		
		
		```
		protected akka.util.ByteString finishWithBuffer​(byte[] buffer)
		```
		
		
		Overrides:
		`[finishWithBuffer](DeflateCompressor.html#finishWithBuffer(byte%5B%5D))` in class `[DeflateCompressor](DeflateCompressor.html "class in akka.http.scaladsl.coding")`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/coding/Compressor.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/coding/DeflateCompressor.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/coding/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/coding/GzipCompressor.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/coding/GzipCompressor.html)*