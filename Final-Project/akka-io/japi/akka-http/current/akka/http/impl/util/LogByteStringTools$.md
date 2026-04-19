---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:44:03Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/LogByteStringTools$.html
title: LogByteStringTools$
---

# LogByteStringTools$

## Content

Package [akka.http.impl.util](package-summary.html)
## Class LogByteStringTools$

- java.lang.Object
- - akka.http.impl.util.LogByteStringTools$

- ---

```
public class LogByteStringTools$
extends java.lang.Object
```

INTERNAL API
 
 Flow and BidiFlow stages to log streams of ByteString.

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [LogByteStringTools$](LogByteStringTools$.html "class in akka.http.impl.util")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[LogByteStringTools$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `char` | `[asASCII](#asASCII(byte))​(byte b)` |  |
	| `akka.stream.scaladsl.Flow<akka.util.ByteString,​akka.util.ByteString,​akka.NotUsed>` | `[logByteString](#logByteString(java.lang.String,int))​(java.lang.String name,  int maxBytes)` |  |
	| `akka.stream.scaladsl.BidiFlow<akka.util.ByteString,​akka.util.ByteString,​akka.util.ByteString,​akka.util.ByteString,​akka.NotUsed>` | `[logByteStringBidi](#logByteStringBidi(java.lang.String,int))​(java.lang.String name,  int maxBytes)` |  |
	| `akka.stream.scaladsl.BidiFlow<akka.stream.TLSProtocol.SslTlsOutbound,​akka.stream.TLSProtocol.SslTlsOutbound,​akka.stream.TLSProtocol.SslTlsInbound,​akka.stream.TLSProtocol.SslTlsInbound,​akka.NotUsed>` | `[logTLSBidi](#logTLSBidi(java.lang.String,int))​(java.lang.String name,  int maxBytes)` |  |
	| `akka.stream.scaladsl.BidiFlow<akka.stream.TLSProtocol.SslTlsOutbound,​akka.stream.TLSProtocol.SslTlsOutbound,​akka.stream.TLSProtocol.SslTlsInbound,​akka.stream.TLSProtocol.SslTlsInbound,​java.lang.Object>` | `[logTLSBidiBySetting](#logTLSBidiBySetting(java.lang.String,scala.Option))​(java.lang.String tag,  scala.Option<java.lang.Object> maxBytesSetting)` |  |
	| `akka.stream.scaladsl.Flow<akka.stream.TLSProtocol.SslTlsInbound,​akka.stream.TLSProtocol.SslTlsInbound,​akka.NotUsed>` | `[logTlsInbound](#logTlsInbound(java.lang.String,int))​(java.lang.String name,  int maxBytes)` |  |
	| `akka.stream.scaladsl.Flow<akka.stream.TLSProtocol.SslTlsOutbound,​akka.stream.TLSProtocol.SslTlsOutbound,​akka.NotUsed>` | `[logTlsOutbound](#logTlsOutbound(java.lang.String,int))​(java.lang.String name,  int maxBytes)` |  |
	| `<A> akka.stream.scaladsl.Flow<A,​A,​akka.NotUsed>` | `[logToString](#logToString(java.lang.String,int))​(java.lang.String name,  int maxBytes)` |  |
	| `<A,​B>akka.stream.scaladsl.BidiFlow<A,​A,​B,​B,​akka.NotUsed>` | `[logToStringBidi](#logToStringBidi(java.lang.String,int,scala.reflect.ClassTag,scala.reflect.ClassTag))​(java.lang.String name,  int maxBytes,  scala.reflect.ClassTag<A> evidence$1,  scala.reflect.ClassTag<B> evidence$2)` |  |
	| `int` | `[MaxBytesPrinted](#MaxBytesPrinted())()` |  |
	| `java.lang.String` | `[printByteString](#printByteString(akka.util.ByteString,int,boolean,java.lang.String))​(akka.util.ByteString bytes,  int maxBytes,  boolean addPrefix,  java.lang.String indent)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [LogByteStringTools$](LogByteStringTools$.html "class in akka.http.impl.util") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### LogByteStringTools$
		
		
		
		```
		public LogByteStringTools$()
		```

	- ### Method Detail
	
	
	
		- #### MaxBytesPrinted
		
		
		
		```
		public int MaxBytesPrinted()
		```
		- #### logByteStringBidi
		
		
		
		```
		public akka.stream.scaladsl.BidiFlow<akka.util.ByteString,​akka.util.ByteString,​akka.util.ByteString,​akka.util.ByteString,​akka.NotUsed> logByteStringBidi​(java.lang.String name,
		                                                                                                                                                                                 int maxBytes)
		```
		- #### logToStringBidi
		
		
		
		```
		public <A,​B> akka.stream.scaladsl.BidiFlow<A,​A,​B,​B,​akka.NotUsed> logToStringBidi​(java.lang.String name,
		                                                                                                               int maxBytes,
		                                                                                                               scala.reflect.ClassTag<A> evidence$1,
		                                                                                                               scala.reflect.ClassTag<B> evidence$2)
		```
		- #### logByteString
		
		
		
		```
		public akka.stream.scaladsl.Flow<akka.util.ByteString,​akka.util.ByteString,​akka.NotUsed> logByteString​(java.lang.String name,
		                                                                                                                   int maxBytes)
		```
		- #### logToString
		
		
		
		```
		public <A> akka.stream.scaladsl.Flow<A,​A,​akka.NotUsed> logToString​(java.lang.String name,
		                                                                               int maxBytes)
		```
		- #### logTLSBidi
		
		
		
		```
		public akka.stream.scaladsl.BidiFlow<akka.stream.TLSProtocol.SslTlsOutbound,​akka.stream.TLSProtocol.SslTlsOutbound,​akka.stream.TLSProtocol.SslTlsInbound,​akka.stream.TLSProtocol.SslTlsInbound,​akka.NotUsed> logTLSBidi​(java.lang.String name,
		                                                                                                                                                                                                                                                int maxBytes)
		```
		- #### logTlsOutbound
		
		
		
		```
		public akka.stream.scaladsl.Flow<akka.stream.TLSProtocol.SslTlsOutbound,​akka.stream.TLSProtocol.SslTlsOutbound,​akka.NotUsed> logTlsOutbound​(java.lang.String name,
		                                                                                                                                                        int maxBytes)
		```
		- #### logTlsInbound
		
		
		
		```
		public akka.stream.scaladsl.Flow<akka.stream.TLSProtocol.SslTlsInbound,​akka.stream.TLSProtocol.SslTlsInbound,​akka.NotUsed> logTlsInbound​(java.lang.String name,
		                                                                                                                                                     int maxBytes)
		```
		- #### printByteString
		
		
		
		```
		public java.lang.String printByteString​(akka.util.ByteString bytes,
		                                        int maxBytes,
		                                        boolean addPrefix,
		                                        java.lang.String indent)
		```
		- #### asASCII
		
		
		
		```
		public char asASCII​(byte b)
		```
		- #### logTLSBidiBySetting
		
		
		
		```
		public akka.stream.scaladsl.BidiFlow<akka.stream.TLSProtocol.SslTlsOutbound,​akka.stream.TLSProtocol.SslTlsOutbound,​akka.stream.TLSProtocol.SslTlsInbound,​akka.stream.TLSProtocol.SslTlsInbound,​java.lang.Object> logTLSBidiBySetting​(java.lang.String tag,
		                                                                                                                                                                                                                                                             scala.Option<java.lang.Object> maxBytesSetting)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/LogByteStringTools$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/LogByteStringTools$.html](https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/LogByteStringTools$.html)*