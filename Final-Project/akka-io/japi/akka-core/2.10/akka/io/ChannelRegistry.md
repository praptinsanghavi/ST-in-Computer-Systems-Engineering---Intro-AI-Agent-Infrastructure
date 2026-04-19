---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:09:01Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/io/ChannelRegistry.html
title: ChannelRegistry
---

# ChannelRegistry

## Content

Package [akka.io](package-summary.html)
## Interface ChannelRegistry

- ---

```
public interface ChannelRegistry
```

Interface behind which we hide our selector management logic from the connection actors

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `void` | `[register](#register(java.nio.channels.SelectableChannel,int,akka.actor.ActorRef))​(java.nio.channels.SelectableChannel channel,  int initialOps,  [ActorRef](../actor/ActorRef.html "class in akka.actor") channelActor)` | Registers the given channel with the selector, creates a ChannelRegistration instance for it  and dispatches it back to the channelActor calling this `register` |

- - ### Method Detail
	
	
	
		- #### register
		
		
		
		```
		void register​(java.nio.channels.SelectableChannel channel,
		              int initialOps,
		              [ActorRef](../actor/ActorRef.html "class in akka.actor") channelActor)
		```
		
		Registers the given channel with the selector, creates a ChannelRegistration instance for it
		 and dispatches it back to the channelActor calling this `register`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorRef.html
- https://doc.akka.io/japi/akka-core/2.10/akka/io/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/io/ChannelRegistry.html](https://doc.akka.io/japi/akka-core/2.10/akka/io/ChannelRegistry.html)*