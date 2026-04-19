---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:52:01Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/JsonFraming$.html
title: JsonFraming$
---

# JsonFraming$

## Content

Package [akka.stream.javadsl](package-summary.html)
## Class JsonFraming$

- java.lang.Object
- - akka.stream.javadsl.JsonFraming$

- ---

```
public class JsonFraming$
extends java.lang.Object
```

Provides JSON framing operators that can separate valid JSON objects from incoming [`ByteString`](../../util/ByteString.html "class in akka.util") objects.

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [JsonFraming$](JsonFraming$.html "class in akka.stream.javadsl")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[JsonFraming$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[Flow](Flow.html "class in akka.stream.javadsl")<[ByteString](../../util/ByteString.html "class in akka.util"),​[ByteString](../../util/ByteString.html "class in akka.util"),​[NotUsed](../../NotUsed.html "class in akka")>` | `[objectScanner](#objectScanner(int))​(int maximumObjectLength)` | Returns a Flow that implements a "brace counting" based framing operator for emitting valid JSON chunks. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [JsonFraming$](JsonFraming$.html "class in akka.stream.javadsl") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### JsonFraming$
		
		
		
		```
		public JsonFraming$()
		```

	- ### Method Detail
	
	
	
		- #### objectScanner
		
		
		
		```
		public [Flow](Flow.html "class in akka.stream.javadsl")<[ByteString](../../util/ByteString.html "class in akka.util"),​[ByteString](../../util/ByteString.html "class in akka.util"),​[NotUsed](../../NotUsed.html "class in akka")> objectScanner​(int maximumObjectLength)
		```
		
		Returns a Flow that implements a "brace counting" based framing operator for emitting valid JSON chunks.
		 
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
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/JsonFraming$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/akka/util/ByteString.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/JsonFraming$.html](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/JsonFraming$.html)*