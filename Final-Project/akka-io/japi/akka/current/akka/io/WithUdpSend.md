---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:16:53Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/io/WithUdpSend.html
title: WithUdpSend
---

# WithUdpSend

## Content

Package [akka.io](package-summary.html)
## Interface WithUdpSend

- ---

```
public interface WithUdpSend
```

INTERNAL API

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `void` | `[akka$io$WithUdpSend$_setter_$settings_$eq](#akka$io$WithUdpSend$_setter_$settings_$eq(akka.io.Udp.UdpSettings))​(akka.io.Udp.UdpSettings x$1)` |  |
	| `java.nio.channels.DatagramChannel` | `[channel](#channel())()` |  |
	| `void` | `[doSend](#doSend(akka.io.ChannelRegistration))​([ChannelRegistration](ChannelRegistration.html "interface in akka.io") registration)` |  |
	| `boolean` | `[hasWritePending](#hasWritePending())()` |  |
	| `void` | `[pendingCommander_$eq](#pendingCommander_$eq(akka.actor.ActorRef))​([ActorRef](../actor/ActorRef.html "class in akka.actor") x$1)` |  |
	| `void` | `[pendingSend_$eq](#pendingSend_$eq(akka.io.Udp.Send))​([Udp.Send](Udp.Send.html "class in akka.io") x$1)` |  |
	| `void` | `[retriedSend_$eq](#retriedSend_$eq(boolean))​(boolean x$1)` |  |
	| `scala.PartialFunction<java.lang.Object,​scala.runtime.BoxedUnit>` | `[sendHandlers](#sendHandlers(akka.io.ChannelRegistration))​([ChannelRegistration](ChannelRegistration.html "interface in akka.io") registration)` |  |
	| `akka.io.Udp.UdpSettings` | `[settings](#settings())()` |  |
	| `[UdpExt](UdpExt.html "class in akka.io")` | `[udp](#udp())()` |  |

- - ### Method Detail
	
	
	
		- #### akka$io$WithUdpSend$\_setter\_$settings\_$eq
		
		
		
		```
		void akka$io$WithUdpSend$_setter_$settings_$eq​(akka.io.Udp.UdpSettings x$1)
		```
		- #### channel
		
		
		
		```
		java.nio.channels.DatagramChannel channel()
		```
		- #### doSend
		
		
		
		```
		void doSend​([ChannelRegistration](ChannelRegistration.html "interface in akka.io") registration)
		```
		- #### hasWritePending
		
		
		
		```
		boolean hasWritePending()
		```
		- #### pendingCommander\_$eq
		
		
		
		```
		void pendingCommander_$eq​([ActorRef](../actor/ActorRef.html "class in akka.actor") x$1)
		```
		- #### pendingSend\_$eq
		
		
		
		```
		void pendingSend_$eq​([Udp.Send](Udp.Send.html "class in akka.io") x$1)
		```
		- #### retriedSend\_$eq
		
		
		
		```
		void retriedSend_$eq​(boolean x$1)
		```
		- #### sendHandlers
		
		
		
		```
		scala.PartialFunction<java.lang.Object,​scala.runtime.BoxedUnit> sendHandlers​([ChannelRegistration](ChannelRegistration.html "interface in akka.io") registration)
		```
		- #### settings
		
		
		
		```
		akka.io.Udp.UdpSettings settings()
		```
		- #### udp
		
		
		
		```
		[UdpExt](UdpExt.html "class in akka.io") udp()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/ActorRef.html
- https://doc.akka.io/japi/akka/current/akka/io/ChannelRegistration.html
- https://doc.akka.io/japi/akka/current/akka/io/Udp.Send.html
- https://doc.akka.io/japi/akka/current/akka/io/UdpExt.html
- https://doc.akka.io/japi/akka/current/akka/io/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/io/WithUdpSend.html](https://doc.akka.io/japi/akka/current/akka/io/WithUdpSend.html)*