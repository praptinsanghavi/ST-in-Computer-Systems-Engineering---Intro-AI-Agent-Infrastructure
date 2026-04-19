---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:51:51Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Framing$.html
title: Framing$
---

# Framing$

## Content

Package [akka.stream.javadsl](package-summary.html)
## Class Framing$

- java.lang.Object
- - akka.stream.javadsl.Framing$

- ---

```
public class Framing$
extends java.lang.Object
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [Framing$](Framing$.html "class in akka.stream.javadsl")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Framing$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[Flow](Flow.html "class in akka.stream.javadsl")<[ByteString](../../util/ByteString.html "class in akka.util"),​[ByteString](../../util/ByteString.html "class in akka.util"),​[NotUsed](../../NotUsed.html "class in akka")>` | `[delimiter](#delimiter(akka.util.ByteString,int))​([ByteString](../../util/ByteString.html "class in akka.util") delimiter,  int maximumFrameLength)` | Creates a Flow that handles decoding a stream of unstructured byte chunks into a stream of frames where the  incoming chunk stream uses a specific byte\-sequence to mark frame boundaries. |
	| `[Flow](Flow.html "class in akka.stream.javadsl")<[ByteString](../../util/ByteString.html "class in akka.util"),​[ByteString](../../util/ByteString.html "class in akka.util"),​[NotUsed](../../NotUsed.html "class in akka")>` | `[delimiter](#delimiter(akka.util.ByteString,int,akka.stream.javadsl.FramingTruncation))​([ByteString](../../util/ByteString.html "class in akka.util") delimiter,  int maximumFrameLength,  [FramingTruncation](FramingTruncation.html "enum in akka.stream.javadsl") allowTruncation)` | Creates a Flow that handles decoding a stream of unstructured byte chunks into a stream of frames where the  incoming chunk stream uses a specific byte\-sequence to mark frame boundaries. |
	| `[Flow](Flow.html "class in akka.stream.javadsl")<[ByteString](../../util/ByteString.html "class in akka.util"),​[ByteString](../../util/ByteString.html "class in akka.util"),​[NotUsed](../../NotUsed.html "class in akka")>` | `[lengthField](#lengthField(int,int,int))​(int fieldLength,  int fieldOffset,  int maximumFrameLength)` | Creates a Flow that decodes an incoming stream of unstructured byte chunks into a stream of frames, assuming that  incoming frames have a field that encodes their length. |
	| `[Flow](Flow.html "class in akka.stream.javadsl")<[ByteString](../../util/ByteString.html "class in akka.util"),​[ByteString](../../util/ByteString.html "class in akka.util"),​[NotUsed](../../NotUsed.html "class in akka")>` | `[lengthField](#lengthField(int,int,int,java.nio.ByteOrder))​(int fieldLength,  int fieldOffset,  int maximumFrameLength,  java.nio.ByteOrder byteOrder)` | Creates a Flow that decodes an incoming stream of unstructured byte chunks into a stream of frames, assuming that  incoming frames have a field that encodes their length. |
	| `[Flow](Flow.html "class in akka.stream.javadsl")<[ByteString](../../util/ByteString.html "class in akka.util"),​[ByteString](../../util/ByteString.html "class in akka.util"),​[NotUsed](../../NotUsed.html "class in akka")>` | `[lengthField](#lengthField(int,int,int,java.nio.ByteOrder,akka.japi.function.Function2))​(int fieldLength,  int fieldOffset,  int maximumFrameLength,  java.nio.ByteOrder byteOrder,  [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<byte[],​java.lang.Integer,​java.lang.Integer> computeFrameSize)` | Creates a Flow that decodes an incoming stream of unstructured byte chunks into a stream of frames, assuming that  incoming frames have a field that encodes their length. |
	| `[BidiFlow](BidiFlow.html "class in akka.stream.javadsl")<[ByteString](../../util/ByteString.html "class in akka.util"),​[ByteString](../../util/ByteString.html "class in akka.util"),​[ByteString](../../util/ByteString.html "class in akka.util"),​[ByteString](../../util/ByteString.html "class in akka.util"),​[NotUsed](../../NotUsed.html "class in akka")>` | `[simpleFramingProtocol](#simpleFramingProtocol(int))​(int maximumMessageLength)` | Returns a BidiFlow that implements a simple framing protocol. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [Framing$](Framing$.html "class in akka.stream.javadsl") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### Framing$
		
		
		
		```
		public Framing$()
		```

	- ### Method Detail
	
	
	
		- #### delimiter
		
		
		
		```
		public [Flow](Flow.html "class in akka.stream.javadsl")<[ByteString](../../util/ByteString.html "class in akka.util"),​[ByteString](../../util/ByteString.html "class in akka.util"),​[NotUsed](../../NotUsed.html "class in akka")> delimiter​([ByteString](../../util/ByteString.html "class in akka.util") delimiter,
		                                                                 int maximumFrameLength)
		```
		
		Creates a Flow that handles decoding a stream of unstructured byte chunks into a stream of frames where the
		 incoming chunk stream uses a specific byte\-sequence to mark frame boundaries.
		 
		 The decoded frames will not include the separator sequence.
		 
		
		
		 If there are buffered bytes (an incomplete frame) when the input stream finishes and ''allowTruncation'' is set to
		 false then this Flow will fail the stream reporting a truncated frame.
		 
		
		
		 Default truncation behavior is: when the last frame being decoded contains no valid delimiter this Flow
		 fails the stream instead of returning a truncated frame.
		 
		
		
		
		Parameters:
		`delimiter` \- The byte sequence to be treated as the end of the frame.
		`maximumFrameLength` \- The maximum length of allowed frames while decoding. If the maximum length is
		 exceeded this Flow will fail the stream.
		- #### delimiter
		
		
		
		```
		public [Flow](Flow.html "class in akka.stream.javadsl")<[ByteString](../../util/ByteString.html "class in akka.util"),​[ByteString](../../util/ByteString.html "class in akka.util"),​[NotUsed](../../NotUsed.html "class in akka")> delimiter​([ByteString](../../util/ByteString.html "class in akka.util") delimiter,
		                                                                 int maximumFrameLength,
		                                                                 [FramingTruncation](FramingTruncation.html "enum in akka.stream.javadsl") allowTruncation)
		```
		
		Creates a Flow that handles decoding a stream of unstructured byte chunks into a stream of frames where the
		 incoming chunk stream uses a specific byte\-sequence to mark frame boundaries.
		 
		 The decoded frames will not include the separator sequence.
		 
		
		
		 If there are buffered bytes (an incomplete frame) when the input stream finishes and ''allowTruncation'' is set to
		 false then this Flow will fail the stream reporting a truncated frame.
		 
		
		
		
		Parameters:
		`delimiter` \- The byte sequence to be treated as the end of the frame.
		`allowTruncation` \- If set to `DISALLOW`, then when the last frame being decoded contains no valid delimiter this Flow
		 fails the stream instead of returning a truncated frame.
		`maximumFrameLength` \- The maximum length of allowed frames while decoding. If the maximum length is
		 exceeded this Flow will fail the stream.
		- #### lengthField
		
		
		
		```
		public [Flow](Flow.html "class in akka.stream.javadsl")<[ByteString](../../util/ByteString.html "class in akka.util"),​[ByteString](../../util/ByteString.html "class in akka.util"),​[NotUsed](../../NotUsed.html "class in akka")> lengthField​(int fieldLength,
		                                                                   int fieldOffset,
		                                                                   int maximumFrameLength)
		```
		
		Creates a Flow that decodes an incoming stream of unstructured byte chunks into a stream of frames, assuming that
		 incoming frames have a field that encodes their length.
		 
		 If the input stream finishes before the last frame has been fully decoded, this Flow will fail the stream reporting
		 a truncated frame.
		 
		
		
		 The byte order used for when decoding the field defaults to little\-endian.
		 
		
		
		
		Parameters:
		`fieldLength` \- The length of the "size" field in bytes
		`fieldOffset` \- The offset of the field from the beginning of the frame in bytes
		`maximumFrameLength` \- The maximum length of allowed frames while decoding. If the maximum length is exceeded
		 this Flow will fail the stream. This length \*includes\* the header (i.e the offset and
		 the length of the size field)
		- #### lengthField
		
		
		
		```
		public [Flow](Flow.html "class in akka.stream.javadsl")<[ByteString](../../util/ByteString.html "class in akka.util"),​[ByteString](../../util/ByteString.html "class in akka.util"),​[NotUsed](../../NotUsed.html "class in akka")> lengthField​(int fieldLength,
		                                                                   int fieldOffset,
		                                                                   int maximumFrameLength,
		                                                                   java.nio.ByteOrder byteOrder)
		```
		
		Creates a Flow that decodes an incoming stream of unstructured byte chunks into a stream of frames, assuming that
		 incoming frames have a field that encodes their length.
		 
		 If the input stream finishes before the last frame has been fully decoded, this Flow will fail the stream reporting
		 a truncated frame.
		 
		
		
		
		Parameters:
		`fieldLength` \- The length of the "size" field in bytes
		`fieldOffset` \- The offset of the field from the beginning of the frame in bytes
		`maximumFrameLength` \- The maximum length of allowed frames while decoding. If the maximum length is exceeded
		 this Flow will fail the stream. This length \*includes\* the header (i.e the offset and
		 the length of the size field)
		`byteOrder` \- The ''ByteOrder'' to be used when decoding the field
		- #### lengthField
		
		
		
		```
		public [Flow](Flow.html "class in akka.stream.javadsl")<[ByteString](../../util/ByteString.html "class in akka.util"),​[ByteString](../../util/ByteString.html "class in akka.util"),​[NotUsed](../../NotUsed.html "class in akka")> lengthField​(int fieldLength,
		                                                                   int fieldOffset,
		                                                                   int maximumFrameLength,
		                                                                   java.nio.ByteOrder byteOrder,
		                                                                   [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<byte[],​java.lang.Integer,​java.lang.Integer> computeFrameSize)
		```
		
		Creates a Flow that decodes an incoming stream of unstructured byte chunks into a stream of frames, assuming that
		 incoming frames have a field that encodes their length.
		 
		 If the input stream finishes before the last frame has been fully decoded, this Flow will fail the stream reporting
		 a truncated frame.
		 
		
		
		
		Parameters:
		`fieldLength` \- The length of the "size" field in bytes
		`fieldOffset` \- The offset of the field from the beginning of the frame in bytes
		`maximumFrameLength` \- The maximum length of allowed frames while decoding. If the maximum length is exceeded
		 this Flow will fail the stream. This length \*includes\* the header (i.e the offset and
		 the length of the size field)
		`byteOrder` \- The ''ByteOrder'' to be used when decoding the field
		`computeFrameSize` \- This function can be supplied if frame size is varied or needs to be computed in a special fashion.
		 For example, frame can have a shape like this: `[offset bytes][body size bytes][body bytes][footer bytes]`.
		 Then computeFrameSize can be used to compute the frame size: `(offset bytes, computed size) => (actual frame size)`.
		 ''Actual frame size'' must be equal or bigger than sum of `fieldOffset` and `fieldLength`, the operator fails otherwise.
		- #### simpleFramingProtocol
		
		
		
		```
		public [BidiFlow](BidiFlow.html "class in akka.stream.javadsl")<[ByteString](../../util/ByteString.html "class in akka.util"),​[ByteString](../../util/ByteString.html "class in akka.util"),​[ByteString](../../util/ByteString.html "class in akka.util"),​[ByteString](../../util/ByteString.html "class in akka.util"),​[NotUsed](../../NotUsed.html "class in akka")> simpleFramingProtocol​(int maximumMessageLength)
		```
		
		Returns a BidiFlow that implements a simple framing protocol. This is a convenience wrapper over [`Framing.lengthField(int, int, int)`](Framing.html#lengthField(int,int,int))
		 and simply attaches a length field header of four bytes (using big endian encoding) to outgoing messages, and decodes
		 such messages in the inbound direction. The decoded messages do not contain the header.
		 
		```
		
		       +--------------------------------+
		       | Framing BidiFlow               |
		       |                                |
		       |  +--------------------------+  |
		 in2 ~~>  |        Decoding          | ~~> out2
		       |  +--------------------------+  |
		       |                                |
		       |  +--------------------------+  |
		 out1 <~~ |Encoding(Add length field)| <~~ in1
		       |  +--------------------------+  |
		       +--------------------------------+
		 
		```
		
		 This BidiFlow is useful if a simple message framing protocol is needed (for example when TCP is used to send
		 individual messages) but no compatibility with existing protocols is necessary.
		 
		 The encoded frames have the layout
		 
		
		
		```
		
		   [4 bytes length field, Big Endian][User Payload]
		 
		```
		
		 The length field encodes the length of the user payload excluding the header itself.
		 
		
		Parameters:
		`maximumMessageLength` \- Maximum length of allowed messages. If sent or received messages exceed the configured
		 limit this BidiFlow will fail the stream. The header attached by this BidiFlow are not
		 included in this limit.

## Code Examples

### Example 1: simpleFramingProtocol

```text
+--------------------------------+
       | Framing BidiFlow               |
       |                                |
       |  +--------------------------+  |
 in2 ~~>  |        Decoding          | ~~> out2
       |  +--------------------------+  |
       |                                |
       |  +--------------------------+  |
 out1 <~~ |Encoding(Add length field)| <~~ in1
       |  +--------------------------+  |
       +--------------------------------+
```

### Example 2: simpleFramingProtocol

```text
[4 bytes length field, Big Endian][User Payload]
```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/NotUsed.html
- https://doc.akka.io/japi/akka-core/2.10/akka/japi/function/Function2.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/BidiFlow.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Framing$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Framing.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/FramingTruncation.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/akka/util/ByteString.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Framing$.html](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Framing$.html)*