---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:34:05Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/remote/RemoteLogMarker$.html
title: RemoteLogMarker$
---

# RemoteLogMarker$

## Content

Package [akka.remote](package-summary.html)
## Class RemoteLogMarker$

- java.lang.Object
- - akka.remote.RemoteLogMarker$

- ---

```
public class RemoteLogMarker$
extends java.lang.Object
```

This is public with the purpose to document the used markers and properties of log events.
 No guarantee that it will remain binary compatible, but the marker names and properties
 are considered public API and will not be changed without notice.

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [RemoteLogMarker$](RemoteLogMarker$.html "class in akka.remote")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[RemoteLogMarker$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[LogMarker](../event/LogMarker.html "class in akka.event")` | `[connect](#connect(akka.actor.Address,scala.Option))​([Address](../actor/Address.html "class in akka.actor") remoteAddress,  scala.Option<java.lang.Object> remoteAddressUid)` | Marker "akkaConnect" of log event when outbound connection is attempted. |
	| `[LogMarker](../event/LogMarker.html "class in akka.event")` | `[disconnected](#disconnected(akka.actor.Address,scala.Option))​([Address](../actor/Address.html "class in akka.actor") remoteAddress,  scala.Option<java.lang.Object> remoteAddressUid)` | Marker "akkaDisconnected" of log event when outbound connection is closed. |
	| `[LogMarker](../event/LogMarker.html "class in akka.event")` | `[failureDetectorGrowing](#failureDetectorGrowing(java.lang.String))​(java.lang.String remoteAddress)` | Marker "akkaFailureDetectorGrowing" of log event when failure detector heartbeat interval  is growing too large. |
	| `[LogMarker](../event/LogMarker.html "class in akka.event")` | `[quarantine](#quarantine(akka.actor.Address,scala.Option))​([Address](../actor/Address.html "class in akka.actor") remoteAddress,  scala.Option<java.lang.Object> remoteAddressUid)` | Marker "akkaQuarantine" of log event when a node is quarantined. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [RemoteLogMarker$](RemoteLogMarker$.html "class in akka.remote") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### RemoteLogMarker$
		
		
		
		```
		public RemoteLogMarker$()
		```

	- ### Method Detail
	
	
	
		- #### failureDetectorGrowing
		
		
		
		```
		public [LogMarker](../event/LogMarker.html "class in akka.event") failureDetectorGrowing​(java.lang.String remoteAddress)
		```
		
		Marker "akkaFailureDetectorGrowing" of log event when failure detector heartbeat interval
		 is growing too large.
		 
		
		Parameters:
		`remoteAddress` \- The address of the node that the failure detector is monitoring. Included as property "akkaRemoteAddress".
		- #### quarantine
		
		
		
		```
		public [LogMarker](../event/LogMarker.html "class in akka.event") quarantine​([Address](../actor/Address.html "class in akka.actor") remoteAddress,
		                            scala.Option<java.lang.Object> remoteAddressUid)
		```
		
		Marker "akkaQuarantine" of log event when a node is quarantined.
		 
		
		Parameters:
		`remoteAddress` \- The address of the node that is quarantined. Included as property "akkaRemoteAddress".
		`remoteAddressUid` \- The address of the node that is quarantined. Included as property "akkaRemoteAddressUid".
		- #### connect
		
		
		
		```
		public [LogMarker](../event/LogMarker.html "class in akka.event") connect​([Address](../actor/Address.html "class in akka.actor") remoteAddress,
		                         scala.Option<java.lang.Object> remoteAddressUid)
		```
		
		Marker "akkaConnect" of log event when outbound connection is attempted.
		 
		
		Parameters:
		`remoteAddress` \- The address of the connected node. Included as property "akkaRemoteAddress".
		`remoteAddressUid` \- The address of the connected node. Included as property "akkaRemoteAddressUid".
		- #### disconnected
		
		
		
		```
		public [LogMarker](../event/LogMarker.html "class in akka.event") disconnected​([Address](../actor/Address.html "class in akka.actor") remoteAddress,
		                              scala.Option<java.lang.Object> remoteAddressUid)
		```
		
		Marker "akkaDisconnected" of log event when outbound connection is closed.
		 
		
		Parameters:
		`remoteAddress` \- The address of the disconnected node. Included as property "akkaRemoteAddress".
		`remoteAddressUid` \- The address of the disconnected node. Included as property "akkaRemoteAddressUid".

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/Address.html
- https://doc.akka.io/japi/akka/current/akka/event/LogMarker.html
- https://doc.akka.io/japi/akka/current/akka/remote/RemoteLogMarker$.html
- https://doc.akka.io/japi/akka/current/akka/remote/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/remote/RemoteLogMarker$.html](https://doc.akka.io/japi/akka/current/akka/remote/RemoteLogMarker$.html)*