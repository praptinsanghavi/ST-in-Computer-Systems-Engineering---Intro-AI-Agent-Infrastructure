---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:11:18Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/stream/scaladsl/JsonFraming.html
title: JsonFraming
---

# JsonFraming

## Content

Package [akka.stream.scaladsl](package-summary.html)
## Class JsonFraming

- java.lang.Object
- - akka.stream.scaladsl.JsonFraming

- ---

```
public class JsonFraming
extends java.lang.Object
```

Provides JSON framing operators that can separate valid JSON objects from incoming `ByteString` objects.

- - ### Nested Class Summary
	
	
	
	Nested Classes 
	| Modifier and Type | Class | Description |
	| `static class` | `[JsonFraming.PartialObjectException](JsonFraming.PartialObjectException.html "class in akka.stream.scaladsl")` | Thrown if upstream completes with a partial object in the buffer. |
	| `static class` | `[JsonFraming.PartialObjectException$](JsonFraming.PartialObjectException$.html "class in akka.stream.scaladsl")` |  |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[JsonFraming](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [Flow](Flow.html "class in akka.stream.scaladsl")<[ByteString](../../util/ByteString.html "class in akka.util"),​[ByteString](../../util/ByteString.html "class in akka.util"),​[NotUsed](../../NotUsed.html "class in akka")>` | `[objectScanner](#objectScanner(int))​(int maximumObjectLength)` | Returns a Flow that implements a "brace counting" based framing operator for emitting valid JSON chunks. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### JsonFraming
		
		
		
		```
		public JsonFraming()
		```

	- ### Method Detail
	
	
	
		- #### objectScanner
		
		
		
		```
		public static [Flow](Flow.html "class in akka.stream.scaladsl")<[ByteString](../../util/ByteString.html "class in akka.util"),​[ByteString](../../util/ByteString.html "class in akka.util"),​[NotUsed](../../NotUsed.html "class in akka")> objectScanner​(int maximumObjectLength)
		```
		
		Returns a Flow that implements a "brace counting" based framing operator for emitting valid JSON chunks.
		 It scans the incoming data stream for valid JSON objects and returns chunks of ByteStrings containing only those valid chunks.
		 
		 Typical examples of data that one may want to frame using this operator include:
		 
		
		
		 \*\*Very large arrays\*\*:
		 
		
		
		```
		
		   [{"id": 1}, {"id": 2}, [...], {"id": 999}]
		 
		```
		
		
		 \*\*Multiple concatenated JSON objects\*\* (with, or without commas between them):
		 
		
		
		
		
		
		```
		
		   {"id": 1}, {"id": 2}, [...], {"id": 999}
		 
		```
		
		
		 The framing works independently of formatting, i.e. it will still emit valid JSON elements even if two
		 elements are separated by multiple newlines or other whitespace characters. And of course is insensitive
		 (and does not impact the emitting frame) to the JSON object's internal formatting.
		 
		
		
		 If the stream completes while mid\-object, the stage will fail with a [`JsonFraming.PartialObjectException`](JsonFraming.PartialObjectException.html "class in akka.stream.scaladsl").
		 
		
		
		
		Parameters:
		`maximumObjectLength` \- The maximum length of allowed frames while decoding. If the maximum length is exceeded
		 this Flow will fail the stream.

## Code Examples

### Example 1: objectScanner

```text
[{"id": 1}, {"id": 2}, [...], {"id": 999}]
```

### Example 2: objectScanner

```text
{"id": 1}, {"id": 2}, [...], {"id": 999}
```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/NotUsed.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/scaladsl/Flow.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/scaladsl/JsonFraming.PartialObjectException$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/scaladsl/JsonFraming.PartialObjectException.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/scaladsl/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/akka/util/ByteString.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/stream/scaladsl/JsonFraming.html](https://doc.akka.io/japi/akka-core/2.10/akka/stream/scaladsl/JsonFraming.html)*