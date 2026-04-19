---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:36:17Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/remote/artery/jfr/AeronSinkEnvelopeOffered.html
title: AeronSinkEnvelopeOffered
---

# AeronSinkEnvelopeOffered

## Content

Package [akka.remote.artery.jfr](package-summary.html)
## Class AeronSinkEnvelopeOffered

- java.lang.Object
- - jdk.internal.event.Event
	- - jdk.jfr.Event
		- - akka.remote.artery.jfr.AeronSinkEnvelopeOffered

- ---

```
public final class AeronSinkEnvelopeOffered
extends jdk.jfr.Event
```

INTERNAL API

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[AeronSinkEnvelopeOffered](#%3Cinit%3E(int))​(int lastMessageSize)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `int` | `[lastMessageSize](#lastMessageSize())()` |  |
	
	
		- ### Methods inherited from class jdk.jfr.Event
		
		
		`begin, commit, end, isEnabled, set, shouldCommit`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### AeronSinkEnvelopeOffered
		
		
		
		```
		public AeronSinkEnvelopeOffered​(int lastMessageSize)
		```

	- ### Method Detail
	
	
	
		- #### lastMessageSize
		
		
		
		```
		public int lastMessageSize()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/remote/artery/jfr/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/remote/artery/jfr/AeronSinkEnvelopeOffered.html](https://doc.akka.io/japi/akka/current/akka/remote/artery/jfr/AeronSinkEnvelopeOffered.html)*