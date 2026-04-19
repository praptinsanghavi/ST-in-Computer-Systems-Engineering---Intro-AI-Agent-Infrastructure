---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:11:16Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/stream/scaladsl/Framing.html
title: Framing
---

# Framing

## Content

Package [akka.stream.scaladsl](package-summary.html)
## Class Framing

- java.lang.Object
- - akka.stream.scaladsl.Framing

- ---

```
public class Framing
extends java.lang.Object
```

- - ### Nested Class Summary
	
	
	
	Nested Classes 
	| Modifier and Type | Class | Description |
	| `static class` | `[Framing.FramingException](Framing.FramingException.html "class in akka.stream.scaladsl")` |  |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Framing](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [Flow](Flow.html "class in akka.stream.scaladsl")<[ByteString](../../util/ByteString.html "class in akka.util"),​[ByteString](../../util/ByteString.html "class in akka.util"),​[NotUsed](../../NotUsed.html "class in akka")>` | `[delimiter](#delimiter(akka.util.ByteString,int,boolean))​([ByteString](../../util/ByteString.html "class in akka.util") delimiter,  int maximumFrameLength,  boolean allowTruncation)` | Creates a Flow that handles decoding a stream of unstructured byte chunks into a stream of frames where the  incoming chunk stream uses a specific byte\-sequence to mark frame boundaries. |
	| `static boolean` | `[delimiter$default$3](#delimiter$default$3())()` |  |
	| `static [Flow](Flow.html "class in akka.stream.scaladsl")<[ByteString](../../util/ByteString.html "class in akka.util"),​[ByteString](../../util/ByteString.html "class in akka.util"),​[NotUsed](../../NotUsed.html "class in akka")>` | `[lengthField](#lengthField(int,int,int,java.nio.ByteOrder))​(int fieldLength,  int fieldOffset,  int maximumFrameLength,  java.nio.ByteOrder byteOrder)` | Creates a Flow that decodes an incoming stream of unstructured byte chunks into a stream of frames, assuming that  incoming frames have a field that encodes their length. |
	| `static [Flow](Flow.html "class in akka.stream.scaladsl")<[ByteString](../../util/ByteString.html "class in akka.util"),​[ByteString](../../util/ByteString.html "class in akka.util"),​[NotUsed](../../NotUsed.html "class in akka")>` | `[lengthField](#lengthField(int,int,int,java.nio.ByteOrder,scala.Function2))​(int fieldLength,  int fieldOffset,  int maximumFrameLength,  java.nio.ByteOrder byteOrder,  scala.Function2<byte[],​java.lang.Object,​java.lang.Object> computeFrameSize)` | Creates a Flow that decodes an incoming stream of unstructured byte chunks into a stream of frames, assuming that  incoming frames have a field that encodes their length. |
	| `static int` | `[lengthField$default$2](#lengthField$default$2())()` |  |
	| `static java.nio.ByteOrder` | `[lengthField$default$4](#lengthField$default$4())()` |  |
	| `static [BidiFlow](BidiFlow.html "class in akka.stream.scaladsl")<[ByteString](../../util/ByteString.html "class in akka.util"),​[ByteString](../../util/ByteString.html "class in akka.util"),​[ByteString](../../util/ByteString.html "class in akka.util"),​[ByteString](../../util/ByteString.html "class in akka.util"),​[NotUsed](../../NotUsed.html "class in akka")>` | `[simpleFramingProtocol](#simpleFramingProtocol(int))​(int maximumMessageLength)` | Returns a BidiFlow that implements a simple framing protocol. |
	| `static [Flow](Flow.html "class in akka.stream.scaladsl")<[ByteString](../../util/ByteString.html "class in akka.util"),​[ByteString](../../util/ByteString.html "class in akka.util"),​[NotUsed](../../NotUsed.html "class in akka")>` | `[simpleFramingProtocolDecoder](#simpleFramingProtocolDecoder(int))​(int maximumMessageLength)` | Protocol decoder that is used by [`simpleFramingProtocol(int)`](#simpleFramingProtocol(int)) |
	| `static [Flow](Flow.html "class in akka.stream.scaladsl")<[ByteString](../../util/ByteString.html "class in akka.util"),​[ByteString](../../util/ByteString.html "class in akka.util"),​[NotUsed](../../NotUsed.html "class in akka")>` | `[simpleFramingProtocolEncoder](#simpleFramingProtocolEncoder(int))​(int maximumMessageLength)` | Protocol encoder that is used by [`simpleFramingProtocol(int)`](#simpleFramingProtocol(int)) |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### Framing
		
		
		
		```
		public Framing()
		```

	- ### Method Detail
	
	
	
		- #### delimiter
		
		
		
		```
		public static [Flow](Flow.html "class in akka.stream.scaladsl")<[ByteString](../../util/ByteString.html "class in akka.util"),​[ByteString](../../util/ByteString.html "class in akka.util"),​[NotUsed](../../NotUsed.html "class in akka")> delimiter​([ByteString](../../util/ByteString.html "class in akka.util") delimiter,
		                                                                        int maximumFrameLength,
		                                                                        boolean allowTruncation)
		```
		
		Creates a Flow that handles decoding a stream of unstructured byte chunks into a stream of frames where the
		 incoming chunk stream uses a specific byte\-sequence to mark frame boundaries.
		 
		 The decoded frames will not include the separator sequence.
		 
		
		
		 If there are buffered bytes (an incomplete frame) when the input stream finishes and ''allowTruncation'' is set to
		 false then this Flow will fail the stream reporting a truncated frame.
		 
		
		
		
		Parameters:
		`delimiter` \- The byte sequence to be treated as the end of the frame.
		`allowTruncation` \- If `false`, then when the last frame being decoded contains no valid delimiter this Flow
		 fails the stream instead of returning a truncated frame.
		`maximumFrameLength` \- The maximum length of allowed frames while decoding. If the maximum length is
		 exceeded this Flow will fail the stream.
		- #### delimiter$default$3
		
		
		
		```
		public static boolean delimiter$default$3()
		```
		- #### lengthField
		
		
		
		```
		public static [Flow](Flow.html "class in akka.stream.scaladsl")<[ByteString](../../util/ByteString.html "class in akka.util"),​[ByteString](../../util/ByteString.html "class in akka.util"),​[NotUsed](../../NotUsed.html "class in akka")> lengthField​(int fieldLength,
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
		public static [Flow](Flow.html "class in akka.stream.scaladsl")<[ByteString](../../util/ByteString.html "class in akka.util"),​[ByteString](../../util/ByteString.html "class in akka.util"),​[NotUsed](../../NotUsed.html "class in akka")> lengthField​(int fieldLength,
		                                                                          int fieldOffset,
		                                                                          int maximumFrameLength,
		                                                                          java.nio.ByteOrder byteOrder,
		                                                                          scala.Function2<byte[],​java.lang.Object,​java.lang.Object> computeFrameSize)
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
		 Must not mutate the given byte array.
		- #### lengthField$default$2
		
		
		
		```
		public static int lengthField$default$2()
		```
		- #### lengthField$default$4
		
		
		
		```
		public static java.nio.ByteOrder lengthField$default$4()
		```
		- #### simpleFramingProtocol
		
		
		
		```
		public static [BidiFlow](BidiFlow.html "class in akka.stream.scaladsl")<[ByteString](../../util/ByteString.html "class in akka.util"),​[ByteString](../../util/ByteString.html "class in akka.util"),​[ByteString](../../util/ByteString.html "class in akka.util"),​[ByteString](../../util/ByteString.html "class in akka.util"),​[NotUsed](../../NotUsed.html "class in akka")> simpleFramingProtocol​(int maximumMessageLength)
		```
		
		Returns a BidiFlow that implements a simple framing protocol. This is a convenience wrapper over [`lengthField(int, int, int, java.nio.ByteOrder)`](#lengthField(int,int,int,java.nio.ByteOrder))
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
		- #### simpleFramingProtocolDecoder
		
		
		
		```
		public static [Flow](Flow.html "class in akka.stream.scaladsl")<[ByteString](../../util/ByteString.html "class in akka.util"),​[ByteString](../../util/ByteString.html "class in akka.util"),​[NotUsed](../../NotUsed.html "class in akka")> simpleFramingProtocolDecoder​(int maximumMessageLength)
		```
		
		Protocol decoder that is used by [`simpleFramingProtocol(int)`](#simpleFramingProtocol(int))
		- #### simpleFramingProtocolEncoder
		
		
		
		```
		public static [Flow](Flow.html "class in akka.stream.scaladsl")<[ByteString](../../util/ByteString.html "class in akka.util"),​[ByteString](../../util/ByteString.html "class in akka.util"),​[NotUsed](../../NotUsed.html "class in akka")> simpleFramingProtocolEncoder​(int maximumMessageLength)
		```
		
		Protocol encoder that is used by [`simpleFramingProtocol(int)`](#simpleFramingProtocol(int))

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
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/scaladsl/BidiFlow.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/scaladsl/Flow.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/scaladsl/Framing.FramingException.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/scaladsl/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/akka/util/ByteString.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/stream/scaladsl/Framing.html](https://doc.akka.io/japi/akka-core/2.10/akka/stream/scaladsl/Framing.html)*