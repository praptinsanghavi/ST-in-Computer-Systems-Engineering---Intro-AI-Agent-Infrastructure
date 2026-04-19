---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:16:31Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/io/ChannelRegistration.html
title: ChannelRegistration
---

# ChannelRegistration

## Content

Package [akka.io](package-summary.html)
## Interface ChannelRegistration

- All Superinterfaces:
`[NoSerializationVerificationNeeded](../actor/NoSerializationVerificationNeeded.html "interface in akka.actor")`

---

```
public interface ChannelRegistration
extends [NoSerializationVerificationNeeded](../actor/NoSerializationVerificationNeeded.html "interface in akka.actor")
```

Implementations of this interface are sent as actor messages back to a channel actor as
 a result of it having called `register` on the `ChannelRegistry`.
 Enables a channel actor to directly schedule interest setting tasks to the selector management dispatcher.

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `void` | `[cancelAndClose](#cancelAndClose(scala.Function0))​(scala.Function0<scala.runtime.BoxedUnit> andThen)` | Explicitly cancel the registration and close the underlying channel. |
	| `void` | `[disableInterest](#disableInterest(int))​(int op)` |  |
	| `void` | `[enableInterest](#enableInterest(int))​(int op)` |  |

- - ### Method Detail
	
	
	
		- #### cancelAndClose
		
		
		
		```
		void cancelAndClose​(scala.Function0<scala.runtime.BoxedUnit> andThen)
		```
		
		Explicitly cancel the registration and close the underlying channel. Then run the given `andThen` method.
		 The `andThen` method is run from another thread so make sure it's safe to execute from there.
		- #### disableInterest
		
		
		
		```
		void disableInterest​(int op)
		```
		- #### enableInterest
		
		
		
		```
		void enableInterest​(int op)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/NoSerializationVerificationNeeded.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/io/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/io/ChannelRegistration.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/io/ChannelRegistration.html)*