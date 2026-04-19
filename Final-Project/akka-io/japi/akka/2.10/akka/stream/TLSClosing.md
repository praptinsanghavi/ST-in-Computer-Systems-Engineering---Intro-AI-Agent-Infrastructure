---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T17:01:51Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/2.10/akka/stream/TLSClosing.html
title: TLSClosing
---

# TLSClosing

## Content

Package [akka.stream](package-summary.html)
## Class TLSClosing

- java.lang.Object
- - akka.stream.TLSClosing

- Direct Known Subclasses:
`[EagerClose](EagerClose.html "class in akka.stream")`, `[IgnoreBoth](IgnoreBoth.html "class in akka.stream")`, `[IgnoreCancel](IgnoreCancel.html "class in akka.stream")`, `[IgnoreComplete](IgnoreComplete.html "class in akka.stream")`

---

```
public abstract class TLSClosing
extends java.lang.Object
```

All streams in Akka are unidirectional: while in a complex flow graph data
 may flow in multiple directions these individual flows are independent from
 each other. The difference between two half\-duplex connections in opposite
 directions and a full\-duplex connection is that the underlying transport
 is shared in the latter and tearing it down will end the data transfer in
 both directions.
 
 When integrating a full\-duplex transport medium that does not support
 half\-closing (which means ending one direction of data transfer without
 ending the other) into a stream topology, there can be unexpected effects.
 Feeding a finite Source into this medium will close the connection after
 all elements have been sent, which means that possible replies may not
 be received in full. To support this type of usage, the sending and
 receiving of data on the same side (e.g. on the [`Client`](Client.html "class in akka.stream")) need to be
 coordinated such that it is known when all replies have been received.
 Only then should the transport be shut down.
 

 To support these scenarios it is recommended that the full\-duplex
 transport integration is configurable in terms of termination handling,
 which means that the user can optionally suppress the normal (closing)
 reaction to completion or cancellation events, as is expressed by the
 possible values of this type:
 

 \- [`EagerClose`](EagerClose.html "class in akka.stream") means to not ignore signals
 \- [`IgnoreCancel`](IgnoreCancel.html "class in akka.stream") means to not react to cancellation of the receiving
 side unless the sending side has already completed
 \- [`IgnoreComplete`](IgnoreComplete.html "class in akka.stream") means to not react to the completion of the sending
 side unless the receiving side has already canceled
 \- [`IgnoreBoth`](IgnoreBoth.html "class in akka.stream") means to ignore the first termination signal—be that
 cancellation or completion—and only act upon the second one

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[TLSClosing](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [TLSClosing](TLSClosing.html "class in akka.stream")` | `[eagerClose](#eagerClose())()` | Java API: obtain the [`EagerClose`](EagerClose.html "class in akka.stream") singleton value. |
	| `static [TLSClosing](TLSClosing.html "class in akka.stream")` | `[ignoreBoth](#ignoreBoth())()` | Java API: obtain the [`IgnoreBoth`](IgnoreBoth.html "class in akka.stream") singleton value. |
	| `abstract boolean` | `[ignoreCancel](#ignoreCancel())()` |  |
	| `abstract boolean` | `[ignoreComplete](#ignoreComplete())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### TLSClosing
		
		
		
		```
		public TLSClosing()
		```

	- ### Method Detail
	
	
	
		- #### eagerClose
		
		
		
		```
		public static [TLSClosing](TLSClosing.html "class in akka.stream") eagerClose()
		```
		
		Java API: obtain the [`EagerClose`](EagerClose.html "class in akka.stream") singleton value.
		- #### ignoreBoth
		
		
		
		```
		public static [TLSClosing](TLSClosing.html "class in akka.stream") ignoreBoth()
		```
		
		Java API: obtain the [`IgnoreBoth`](IgnoreBoth.html "class in akka.stream") singleton value.
		- #### ignoreCancel
		
		
		
		```
		public abstract boolean ignoreCancel()
		```
		- #### ignoreComplete
		
		
		
		```
		public abstract boolean ignoreComplete()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/2.10/akka/stream/Client.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/EagerClose.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/IgnoreBoth.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/IgnoreCancel.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/IgnoreComplete.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/TLSClosing.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/2.10/akka/stream/TLSClosing.html](https://doc.akka.io/japi/akka/2.10/akka/stream/TLSClosing.html)*