---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:35:27Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/remote/artery/OutboundContext.html
title: OutboundContext
---

# OutboundContext

## Content

Package [akka.remote.artery](package-summary.html)
## Interface OutboundContext

- ---

```
public interface OutboundContext
```

INTERNAL API
 Outbound association API that is used by the stream operators.
 Separate trait to facilitate testing without real transport.

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `akka.remote.artery.AssociationState` | `[associationState](#associationState())()` |  |
	| `akka.remote.artery.InboundControlJunction.ControlMessageSubject` | `[controlSubject](#controlSubject())()` | An outbound operator can listen to control messages  via this observer subject. |
	| `boolean` | `[isOrdinaryMessageStreamActive](#isOrdinaryMessageStreamActive())()` |  |
	| `[UniqueAddress](../UniqueAddress.html "class in akka.remote")` | `[localAddress](#localAddress())()` | The local inbound address. |
	| `void` | `[quarantine](#quarantine(java.lang.String))​(java.lang.String reason)` |  |
	| `[Address](../../actor/Address.html "class in akka.actor")` | `[remoteAddress](#remoteAddress())()` | The outbound address for this association. |
	| `void` | `[sendControl](#sendControl(akka.remote.artery.ControlMessage))​([ControlMessage](ControlMessage.html "interface in akka.remote.artery") message)` | An inbound operator can send control message, e.g. |
	| `akka.remote.artery.ArterySettings` | `[settings](#settings())()` |  |

- - ### Method Detail
	
	
	
		- #### associationState
		
		
		
		```
		akka.remote.artery.AssociationState associationState()
		```
		- #### controlSubject
		
		
		
		```
		akka.remote.artery.InboundControlJunction.ControlMessageSubject controlSubject()
		```
		
		An outbound operator can listen to control messages
		 via this observer subject.
		- #### isOrdinaryMessageStreamActive
		
		
		
		```
		boolean isOrdinaryMessageStreamActive()
		```
		
		
		Returns:
		`true` if any of the streams are active (not stopped due to idle)
		- #### localAddress
		
		
		
		```
		[UniqueAddress](../UniqueAddress.html "class in akka.remote") localAddress()
		```
		
		The local inbound address.
		- #### quarantine
		
		
		
		```
		void quarantine​(java.lang.String reason)
		```
		- #### remoteAddress
		
		
		
		```
		[Address](../../actor/Address.html "class in akka.actor") remoteAddress()
		```
		
		The outbound address for this association.
		- #### sendControl
		
		
		
		```
		void sendControl​([ControlMessage](ControlMessage.html "interface in akka.remote.artery") message)
		```
		
		An inbound operator can send control message, e.g. a HandshakeReq, to the remote
		 address of this association. It will be sent over the control sub\-channel.
		- #### settings
		
		
		
		```
		akka.remote.artery.ArterySettings settings()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/Address.html
- https://doc.akka.io/japi/akka/current/akka/remote/UniqueAddress.html
- https://doc.akka.io/japi/akka/current/akka/remote/artery/ControlMessage.html
- https://doc.akka.io/japi/akka/current/akka/remote/artery/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/remote/artery/OutboundContext.html](https://doc.akka.io/japi/akka/current/akka/remote/artery/OutboundContext.html)*