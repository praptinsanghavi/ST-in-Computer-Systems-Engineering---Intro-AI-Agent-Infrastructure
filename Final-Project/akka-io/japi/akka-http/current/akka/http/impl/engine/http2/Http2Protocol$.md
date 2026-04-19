---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:31:27Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/Http2Protocol$.html
title: Http2Protocol$
---

# Http2Protocol$

## Content

Package [akka.http.impl.engine.http2](package-summary.html)
## Class Http2Protocol$

- java.lang.Object
- - akka.http.impl.engine.http2\.Http2Protocol$

- ---

```
public class Http2Protocol$
extends java.lang.Object
```

INTERNAL API
 
 Defines constants as defined in the HTTP/2 specification.
 

 https://tools.ietf.org/html/rfc7540

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [Http2Protocol$](Http2Protocol$.html "class in akka.http.impl.engine.http2")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Http2Protocol$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `akka.util.ByteString` | `[ClientConnectionPreface](#ClientConnectionPreface())()` | The client connection preface starts with a sequence of 24 octets,  which in hex notation is: |
	| `int` | `[InitialMaxConcurrentStreams](#InitialMaxConcurrentStreams())()` | Indicates the maximum number of concurrent streams that the sender will allow. |
	| `int` | `[InitialMaxFrameSize](#InitialMaxFrameSize())()` | The initial frame size for both incoming and outgoing frames as defined by the  specification. |
	| `int` | `[InitialMaxHeaderListSize](#InitialMaxHeaderListSize())()` | This advisory setting informs a peer of the maximum size of header list that the sender is prepared to accept, in octets. |
	| `int` | `[InitialMaxHeaderTableSize](#InitialMaxHeaderTableSize())()` | Initial maximum size of the header compression table used to decode header blocks, in octets. |
	| `int` | `[InitialWindowSize](#InitialWindowSize())()` | The initial window size for both new streams and the overall connection  as defined by the specification. |
	| `int` | `[MaxFrameSize](#MaxFrameSize())()` | Maximum frame size that can be written. |
	| `int` | `[MinFrameSize](#MinFrameSize())()` | Minimum frame size that can be written. |
	| `int` | `[NoStreamId](#NoStreamId())()` | The stream id to be used for frames not associated with any individual stream  as defined by the specification. |
	| `boolean` | `[PushPromiseEnabledDefault](#PushPromiseEnabledDefault())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [Http2Protocol$](Http2Protocol$.html "class in akka.http.impl.engine.http2") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### Http2Protocol$
		
		
		
		```
		public Http2Protocol$()
		```

	- ### Method Detail
	
	
	
		- #### InitialMaxConcurrentStreams
		
		
		
		```
		public final int InitialMaxConcurrentStreams()
		```
		
		Indicates the maximum number of concurrent streams that the sender will allow.
		 This limit is directional: it applies to the number of streams that the sender
		 permits the receiver to create. Initially, there is no limit to this value. It
		 is recommended that this value be no smaller than 100, so as to not
		 unnecessarily limit parallelism.
		 
		 A value of 0 for SETTINGS\_MAX\_CONCURRENT\_STREAMS SHOULD NOT be treated as special
		 by endpoints. A zero value does prevent the creation of new streams; however,
		 this can also happen for any limit that is exhausted with active streams. Servers
		 SHOULD only set a zero value for short durations; if a server does not wish to
		 accept requests, closing the connection is more appropriate.
		
		
		
		Returns:
		(undocumented)
		- #### InitialWindowSize
		
		
		
		```
		public final int InitialWindowSize()
		```
		
		The initial window size for both new streams and the overall connection
		 as defined by the specification.
		 
		 See https://tools.ietf.org/html/rfc7540\#section\-5\.2\.1:
		 4\. The initial value for the flow\-control window is 65,535 octets
		 for both new streams and the overall connection.
		
		
		
		Returns:
		(undocumented)
		- #### InitialMaxFrameSize
		
		
		
		```
		public final int InitialMaxFrameSize()
		```
		
		The initial frame size for both incoming and outgoing frames as defined by the
		 specification.
		 
		 The frame size can be changed by changing SETTINGS\_MAX\_FRAME\_SIZE.
		 
		
		
		 See https://tools.ietf.org/html/rfc7540\#section\-6\.5\.2:
		 
		
		
		 SETTINGS\_MAX\_FRAME\_SIZE (0x5\): Indicates the size of the largest
		 frame payload that the sender is willing to receive, in octets.
		 
		
		
		 The initial value is 2^14 (16,384\) octets. The value advertised
		 by an endpoint MUST be between this initial value and the maximum
		 allowed frame size (2^24\-1 or 16,777,215 octets), inclusive.
		 Values outside this range MUST be treated as a connection error
		 (Section 5\.4\.1\) of type PROTOCOL\_ERROR.
		
		
		
		Returns:
		(undocumented)
		- #### MinFrameSize
		
		
		
		```
		public final int MinFrameSize()
		```
		
		Minimum frame size that can be written.
		 
		 See http://httpwg.org/specs/rfc7540\.html\#rfc.section.4\.2
		 
		
		
		 The size of a frame payload is limited by the maximum size that a receiver advertises in the SETTINGS\_MAX\_FRAME\_SIZE setting.
		 This setting can have any value between 2^14^ (16,384\) and 2^24^\-1 (16,777,215\) octets, inclusive.
		
		
		
		Returns:
		(undocumented)
		- #### MaxFrameSize
		
		
		
		```
		public final int MaxFrameSize()
		```
		
		Maximum frame size that can be written.
		 
		 See http://httpwg.org/specs/rfc7540\.html\#rfc.section.4\.2
		 
		
		
		 The size of a frame payload is limited by the maximum size that a receiver advertises in the SETTINGS\_MAX\_FRAME\_SIZE setting.
		 This setting can have any value between 2^14^ (16,384\) and 2^24^\-1 (16,777,215\) octets, inclusive.
		
		
		
		Returns:
		(undocumented)
		- #### InitialMaxHeaderTableSize
		
		
		
		```
		public final int InitialMaxHeaderTableSize()
		```
		
		Initial maximum size of the header compression table used to decode header blocks, in octets.
		 
		 See http://httpwg.org/specs/rfc7540\.html\#SettingValues
		
		
		
		Returns:
		(undocumented)
		- #### InitialMaxHeaderListSize
		
		
		
		```
		public final int InitialMaxHeaderListSize()
		```
		
		This advisory setting informs a peer of the maximum size of header list that the sender is prepared to accept, in octets.
		 
		 The value is based on the uncompressed size of header fields,
		 including the length of the name and value in octets plus an overhead of 32 octets for each header field.
		 For any given request, a lower limit than what is advertised MAY be enforced.
		 
		
		
		 See http://httpwg.org/specs/rfc7540\.html\#SettingValues
		
		
		
		Returns:
		(undocumented)
		- #### NoStreamId
		
		
		
		```
		public final int NoStreamId()
		```
		
		The stream id to be used for frames not associated with any individual stream
		 as defined by the specification.
		 
		 See https://tools.ietf.org/html/rfc7540\#section\-4\.1:
		 
		
		
		 Stream Identifier: A stream identifier (see Section 5\.1\.1\) expressed
		 as an unsigned 31\-bit integer. The value 0x0 is reserved for
		 frames that are associated with the connection as a whole as
		 opposed to an individual stream.
		
		
		
		Returns:
		(undocumented)
		- #### PushPromiseEnabledDefault
		
		
		
		```
		public final boolean PushPromiseEnabledDefault()
		```
		- #### ClientConnectionPreface
		
		
		
		```
		public akka.util.ByteString ClientConnectionPreface()
		```
		
		The client connection preface starts with a sequence of 24 octets,
		 which in hex notation is:
		 
		 0x505249202a20485454502f322e300d0a0d0a534d0d0a0d0a
		 
		
		
		 That is, the connection preface starts with the string "PRI \* HTTP/2\.0\\r\\n\\r\\nSM\\r\\n\\r\\n".
		
		
		
		Returns:
		(undocumented)

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/Http2Protocol$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/Http2Protocol$.html](https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/Http2Protocol$.html)*