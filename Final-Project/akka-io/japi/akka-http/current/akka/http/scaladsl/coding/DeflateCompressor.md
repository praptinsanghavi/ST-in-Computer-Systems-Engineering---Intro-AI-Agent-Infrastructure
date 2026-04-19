---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:29:26Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/coding/DeflateCompressor.html
title: DeflateCompressor
---

# DeflateCompressor

## Content

Package [akka.http.scaladsl.coding](package-summary.html)
## Class DeflateCompressor

- java.lang.Object
- - [akka.http.scaladsl.coding.Compressor](Compressor.html "class in akka.http.scaladsl.coding")
	- - akka.http.scaladsl.coding.DeflateCompressor

- Direct Known Subclasses:
`[GzipCompressor](GzipCompressor.html "class in akka.http.scaladsl.coding")`

---

```
public class DeflateCompressor
extends [Compressor](Compressor.html "class in akka.http.scaladsl.coding")
```

Deprecated.
DeflateCompressor is internal API and will be moved or removed in the future. Since 10\.2\.0\.

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[DeflateCompressor](#%3Cinit%3E())()` | Deprecated. |
	| `[DeflateCompressor](#%3Cinit%3E(int))​(int compressionLevel)` | Deprecated. |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) [Deprecated Methods](javascript:show(32);) 
	| Modifier and Type | Method | Description |
	| `akka.util.ByteString` | `[compress](#compress(akka.util.ByteString))​(akka.util.ByteString input)` | Deprecated. Compresses the given input and returns compressed data. |
	| `akka.util.ByteString` | `[compressAndFinish](#compressAndFinish(akka.util.ByteString))​(akka.util.ByteString input)` | Deprecated. Combines \`compress\` \+ \`finish\` |
	| `akka.util.ByteString` | `[compressAndFlush](#compressAndFlush(akka.util.ByteString))​(akka.util.ByteString input)` | Deprecated. Combines \`compress\` \+ \`flush\` |
	| `protected akka.util.ByteString` | `[compressWithBuffer](#compressWithBuffer(akka.util.ByteString,byte%5B%5D))​(akka.util.ByteString input,  byte[] buffer)` | Deprecated. |
	| `static int` | `[DefaultCompressionLevel](#DefaultCompressionLevel())()` | Deprecated. |
	| `protected java.util.zip.Deflater` | `[deflater](#deflater())()` | Deprecated. |
	| `static akka.util.ByteString` | `[drainDeflater](#drainDeflater(java.util.zip.Deflater,byte%5B%5D,akka.util.ByteStringBuilder))​(java.util.zip.Deflater deflater,  byte[] buffer,  akka.util.ByteStringBuilder result)` | Deprecated. |
	| `akka.util.ByteString` | `[finish](#finish())()` | Deprecated. Closes this compressed stream and return the remaining compressed data. |
	| `protected akka.util.ByteString` | `[finishWithBuffer](#finishWithBuffer(byte%5B%5D))​(byte[] buffer)` | Deprecated. |
	| `akka.util.ByteString` | `[flush](#flush())()` | Deprecated. Flushes any output data and returns the currently remaining compressed data. |
	| `protected akka.util.ByteString` | `[flushWithBuffer](#flushWithBuffer(byte%5B%5D))​(byte[] buffer)` | Deprecated. |
	| `static int` | `[MinBufferSize](#MinBufferSize())()` | Deprecated. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### DeflateCompressor
		
		
		
		```
		public DeflateCompressor​(int compressionLevel)
		```
		
		Deprecated.
		- #### DeflateCompressor
		
		
		
		```
		public DeflateCompressor()
		```
		
		Deprecated.

	- ### Method Detail
	
	
	
		- #### MinBufferSize
		
		
		
		```
		public static int MinBufferSize()
		```
		
		Deprecated.
		- #### DefaultCompressionLevel
		
		
		
		```
		public static int DefaultCompressionLevel()
		```
		
		Deprecated.
		- #### drainDeflater
		
		
		
		```
		public static akka.util.ByteString drainDeflater​(java.util.zip.Deflater deflater,
		                                                 byte[] buffer,
		                                                 akka.util.ByteStringBuilder result)
		```
		
		Deprecated.
		- #### deflater
		
		
		
		```
		protected java.util.zip.Deflater deflater()
		```
		
		Deprecated.
		- #### compressAndFlush
		
		
		
		```
		public final akka.util.ByteString compressAndFlush​(akka.util.ByteString input)
		```
		
		Deprecated.
		Description copied from class: `[Compressor](Compressor.html#compressAndFlush(akka.util.ByteString))`
		Combines \`compress\` \+ \`flush\`
		
		Specified by:
		`[compressAndFlush](Compressor.html#compressAndFlush(akka.util.ByteString))` in class `[Compressor](Compressor.html "class in akka.http.scaladsl.coding")`
		- #### compressAndFinish
		
		
		
		```
		public final akka.util.ByteString compressAndFinish​(akka.util.ByteString input)
		```
		
		Deprecated.
		Description copied from class: `[Compressor](Compressor.html#compressAndFinish(akka.util.ByteString))`
		Combines \`compress\` \+ \`finish\`
		
		Specified by:
		`[compressAndFinish](Compressor.html#compressAndFinish(akka.util.ByteString))` in class `[Compressor](Compressor.html "class in akka.http.scaladsl.coding")`
		- #### compress
		
		
		
		```
		public final akka.util.ByteString compress​(akka.util.ByteString input)
		```
		
		Deprecated.
		Description copied from class: `[Compressor](Compressor.html#compress(akka.util.ByteString))`
		Compresses the given input and returns compressed data. The implementation
		 can and will choose to buffer output data to improve compression. Use
		 `flush` or `compressAndFlush` to make sure that all input data has been
		 compressed and pending output data has been returned.
		
		Specified by:
		`[compress](Compressor.html#compress(akka.util.ByteString))` in class `[Compressor](Compressor.html "class in akka.http.scaladsl.coding")`
		Parameters:
		`input` \- (undocumented)
		Returns:
		(undocumented)
		- #### flush
		
		
		
		```
		public final akka.util.ByteString flush()
		```
		
		Deprecated.
		Description copied from class: `[Compressor](Compressor.html#flush())`
		Flushes any output data and returns the currently remaining compressed data.
		
		Specified by:
		`[flush](Compressor.html#flush())` in class `[Compressor](Compressor.html "class in akka.http.scaladsl.coding")`
		Returns:
		(undocumented)
		- #### finish
		
		
		
		```
		public final akka.util.ByteString finish()
		```
		
		Deprecated.
		Description copied from class: `[Compressor](Compressor.html#finish())`
		Closes this compressed stream and return the remaining compressed data. After
		 calling this method, this Compressor cannot be used any further.
		
		Specified by:
		`[finish](Compressor.html#finish())` in class `[Compressor](Compressor.html "class in akka.http.scaladsl.coding")`
		Returns:
		(undocumented)
		- #### compressWithBuffer
		
		
		
		```
		protected akka.util.ByteString compressWithBuffer​(akka.util.ByteString input,
		                                                  byte[] buffer)
		```
		
		Deprecated.
		- #### flushWithBuffer
		
		
		
		```
		protected akka.util.ByteString flushWithBuffer​(byte[] buffer)
		```
		
		Deprecated.
		- #### finishWithBuffer
		
		
		
		```
		protected akka.util.ByteString finishWithBuffer​(byte[] buffer)
		```
		
		Deprecated.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/coding/Compressor.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/coding/GzipCompressor.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/coding/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/coding/DeflateCompressor.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/coding/DeflateCompressor.html)*