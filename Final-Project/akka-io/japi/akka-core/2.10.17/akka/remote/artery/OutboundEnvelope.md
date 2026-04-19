---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:16:34Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/remote/artery/OutboundEnvelope.html
title: OutboundEnvelope
---

# OutboundEnvelope

## Content

Package [akka.remote.artery](package-summary.html)
## Interface OutboundEnvelope

- All Superinterfaces:
`[NoSerializationVerificationNeeded](../../actor/NoSerializationVerificationNeeded.html "interface in akka.actor")`

---

```
public interface OutboundEnvelope
extends [NoSerializationVerificationNeeded](../../actor/NoSerializationVerificationNeeded.html "interface in akka.actor")
```

INTERNAL API

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `[OutboundEnvelope](OutboundEnvelope.html "interface in akka.remote.artery")` | `[copy](#copy())()` |  |
	| `java.lang.Object` | `[message](#message())()` |  |
	| `<any>` | `[recipient](#recipient())()` |  |
	| `<any>` | `[sender](#sender())()` |  |
	| `[OutboundEnvelope](OutboundEnvelope.html "interface in akka.remote.artery")` | `[withMessage](#withMessage(java.lang.Object))​(java.lang.Object message)` |  |

- - ### Method Detail
	
	
	
		- #### recipient
		
		
		
		```
		<any> recipient()
		```
		- #### message
		
		
		
		```
		java.lang.Object message()
		```
		- #### sender
		
		
		
		```
		<any> sender()
		```
		- #### withMessage
		
		
		
		```
		[OutboundEnvelope](OutboundEnvelope.html "interface in akka.remote.artery") withMessage​(java.lang.Object message)
		```
		- #### copy
		
		
		
		```
		[OutboundEnvelope](OutboundEnvelope.html "interface in akka.remote.artery") copy()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/NoSerializationVerificationNeeded.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/remote/artery/OutboundEnvelope.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/remote/artery/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/remote/artery/OutboundEnvelope.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/remote/artery/OutboundEnvelope.html)*