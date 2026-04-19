---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:35:25Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/remote/artery/InboundContext.html
title: InboundContext
---

# InboundContext

## Content

Package [akka.remote.artery](package-summary.html)
## Interface InboundContext

- ---

```
public interface InboundContext
```

INTERNAL API
 Inbound API that is used by the stream operators.
 Separate trait to facilitate testing without real transport.

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `<any>` | `[association](#association(long))​(long uid)` | Lookup the outbound association for a given UID. |
	| `[OutboundContext](OutboundContext.html "interface in akka.remote.artery")` | `[association](#association(akka.actor.Address))​([Address](../../actor/Address.html "class in akka.actor") remoteAddress)` | Lookup the outbound association for a given address. |
	| `scala.concurrent.Future<[Done](../../Done.html "class in akka")>` | `[completeHandshake](#completeHandshake(akka.remote.UniqueAddress))​([UniqueAddress](../UniqueAddress.html "class in akka.remote") peer)` |  |
	| `[UniqueAddress](../UniqueAddress.html "class in akka.remote")` | `[localAddress](#localAddress())()` | The local inbound address. |
	| `void` | `[publishDropped](#publishDropped(akka.remote.artery.InboundEnvelope,java.lang.String))​([InboundEnvelope](InboundEnvelope.html "interface in akka.remote.artery") inbound,  java.lang.String reason)` |  |
	| `void` | `[sendControl](#sendControl(akka.actor.Address,akka.remote.artery.ControlMessage))​([Address](../../actor/Address.html "class in akka.actor") to,  [ControlMessage](ControlMessage.html "interface in akka.remote.artery") message)` | An inbound operator can send control message, e.g. |
	| `akka.remote.artery.ArterySettings` | `[settings](#settings())()` |  |

- - ### Method Detail
	
	
	
		- #### association
		
		
		
		```
		[OutboundContext](OutboundContext.html "interface in akka.remote.artery") association​([Address](../../actor/Address.html "class in akka.actor") remoteAddress)
		```
		
		Lookup the outbound association for a given address.
		- #### association
		
		
		
		```
		<any> association​(long uid)
		```
		
		Lookup the outbound association for a given UID.
		 Will return `OptionVal.None` if the UID is unknown, i.e.
		 handshake not completed.
		- #### completeHandshake
		
		
		
		```
		scala.concurrent.Future<[Done](../../Done.html "class in akka")> completeHandshake​([UniqueAddress](../UniqueAddress.html "class in akka.remote") peer)
		```
		- #### localAddress
		
		
		
		```
		[UniqueAddress](../UniqueAddress.html "class in akka.remote") localAddress()
		```
		
		The local inbound address.
		- #### publishDropped
		
		
		
		```
		void publishDropped​([InboundEnvelope](InboundEnvelope.html "interface in akka.remote.artery") inbound,
		                    java.lang.String reason)
		```
		- #### sendControl
		
		
		
		```
		void sendControl​([Address](../../actor/Address.html "class in akka.actor") to,
		                 [ControlMessage](ControlMessage.html "interface in akka.remote.artery") message)
		```
		
		An inbound operator can send control message, e.g. a reply, to the origin
		 address with this method. It will be sent over the control sub\-channel.
		- #### settings
		
		
		
		```
		akka.remote.artery.ArterySettings settings()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/Done.html
- https://doc.akka.io/japi/akka/current/akka/actor/Address.html
- https://doc.akka.io/japi/akka/current/akka/remote/UniqueAddress.html
- https://doc.akka.io/japi/akka/current/akka/remote/artery/ControlMessage.html
- https://doc.akka.io/japi/akka/current/akka/remote/artery/InboundEnvelope.html
- https://doc.akka.io/japi/akka/current/akka/remote/artery/OutboundContext.html
- https://doc.akka.io/japi/akka/current/akka/remote/artery/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/remote/artery/InboundContext.html](https://doc.akka.io/japi/akka/current/akka/remote/artery/InboundContext.html)*