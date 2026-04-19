---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:14:36Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.6/akka/cluster/client/ClusterReceptionist.Internal$.html
title: ClusterReceptionist.Internal$
---

# ClusterReceptionist.Internal$

## Content

Package [akka.cluster.client](package-summary.html)
## Class ClusterReceptionist.Internal$

- java.lang.Object
- - akka.cluster.client.ClusterReceptionist.Internal$

- Enclosing class:
[ClusterReceptionist](ClusterReceptionist.html "class in akka.cluster.client")

---

```
public static class ClusterReceptionist.Internal$
extends java.lang.Object
```

INTERNAL API

- - ### Nested Class Summary
	
	
	
	Nested Classes 
	| Modifier and Type | Class | Description |
	| `class` | `[ClusterReceptionist.Internal$.CheckDeadlines](ClusterReceptionist.Internal$.CheckDeadlines.html "class in akka.cluster.client")` |  |
	| `class` | `[ClusterReceptionist.Internal$.CheckDeadlines$](ClusterReceptionist.Internal$.CheckDeadlines$.html "class in akka.cluster.client")` |  |
	| `class` | `[ClusterReceptionist.Internal$.ClientResponseTunnel](ClusterReceptionist.Internal$.ClientResponseTunnel.html "class in akka.cluster.client")` | Replies are tunneled via this actor, child of the receptionist, to avoid  inbound connections from other cluster nodes to the client. |
	| `class` | `[ClusterReceptionist.Internal$.Contacts](ClusterReceptionist.Internal$.Contacts.html "class in akka.cluster.client")` |  |
	| `class` | `[ClusterReceptionist.Internal$.Contacts$](ClusterReceptionist.Internal$.Contacts$.html "class in akka.cluster.client")` |  |
	| `class` | `[ClusterReceptionist.Internal$.GetContacts](ClusterReceptionist.Internal$.GetContacts.html "class in akka.cluster.client")` |  |
	| `class` | `[ClusterReceptionist.Internal$.GetContacts$](ClusterReceptionist.Internal$.GetContacts$.html "class in akka.cluster.client")` |  |
	| `class` | `[ClusterReceptionist.Internal$.Heartbeat](ClusterReceptionist.Internal$.Heartbeat.html "class in akka.cluster.client")` |  |
	| `class` | `[ClusterReceptionist.Internal$.Heartbeat$](ClusterReceptionist.Internal$.Heartbeat$.html "class in akka.cluster.client")` |  |
	| `class` | `[ClusterReceptionist.Internal$.HeartbeatRsp](ClusterReceptionist.Internal$.HeartbeatRsp.html "class in akka.cluster.client")` |  |
	| `class` | `[ClusterReceptionist.Internal$.HeartbeatRsp$](ClusterReceptionist.Internal$.HeartbeatRsp$.html "class in akka.cluster.client")` |  |
	| `class` | `[ClusterReceptionist.Internal$.Ping](ClusterReceptionist.Internal$.Ping.html "class in akka.cluster.client")` |  |
	| `class` | `[ClusterReceptionist.Internal$.Ping$](ClusterReceptionist.Internal$.Ping$.html "class in akka.cluster.client")` |  |
	| `class` | `[ClusterReceptionist.Internal$.ReceptionistShutdown](ClusterReceptionist.Internal$.ReceptionistShutdown.html "class in akka.cluster.client")` |  |
	| `class` | `[ClusterReceptionist.Internal$.ReceptionistShutdown$](ClusterReceptionist.Internal$.ReceptionistShutdown$.html "class in akka.cluster.client")` |  |

	- ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [ClusterReceptionist.Internal$](ClusterReceptionist.Internal$.html "class in akka.cluster.client")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Internal$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [ClusterReceptionist.Internal$](ClusterReceptionist.Internal$.html "class in akka.cluster.client") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### Internal$
		
		
		
		```
		public Internal$()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.6/akka/cluster/client/ClusterReceptionist.Internal$.CheckDeadlines$.html
- https://doc.akka.io/japi/akka-core/2.6/akka/cluster/client/ClusterReceptionist.Internal$.CheckDeadlines.html
- https://doc.akka.io/japi/akka-core/2.6/akka/cluster/client/ClusterReceptionist.Internal$.ClientResponseTunnel.html
- https://doc.akka.io/japi/akka-core/2.6/akka/cluster/client/ClusterReceptionist.Internal$.Contacts$.html
- https://doc.akka.io/japi/akka-core/2.6/akka/cluster/client/ClusterReceptionist.Internal$.Contacts.html
- https://doc.akka.io/japi/akka-core/2.6/akka/cluster/client/ClusterReceptionist.Internal$.GetContacts$.html
- https://doc.akka.io/japi/akka-core/2.6/akka/cluster/client/ClusterReceptionist.Internal$.GetContacts.html
- https://doc.akka.io/japi/akka-core/2.6/akka/cluster/client/ClusterReceptionist.Internal$.Heartbeat$.html
- https://doc.akka.io/japi/akka-core/2.6/akka/cluster/client/ClusterReceptionist.Internal$.Heartbeat.html
- https://doc.akka.io/japi/akka-core/2.6/akka/cluster/client/ClusterReceptionist.Internal$.HeartbeatRsp$.html
- https://doc.akka.io/japi/akka-core/2.6/akka/cluster/client/ClusterReceptionist.Internal$.HeartbeatRsp.html
- https://doc.akka.io/japi/akka-core/2.6/akka/cluster/client/ClusterReceptionist.Internal$.Ping$.html
- https://doc.akka.io/japi/akka-core/2.6/akka/cluster/client/ClusterReceptionist.Internal$.Ping.html
- https://doc.akka.io/japi/akka-core/2.6/akka/cluster/client/ClusterReceptionist.Internal$.ReceptionistShutdown$.html
- https://doc.akka.io/japi/akka-core/2.6/akka/cluster/client/ClusterReceptionist.Internal$.ReceptionistShutdown.html
- https://doc.akka.io/japi/akka-core/2.6/akka/cluster/client/ClusterReceptionist.Internal$.html
- https://doc.akka.io/japi/akka-core/2.6/akka/cluster/client/ClusterReceptionist.html
- https://doc.akka.io/japi/akka-core/2.6/akka/cluster/client/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.6/akka/cluster/client/ClusterReceptionist.Internal$.html](https://doc.akka.io/japi/akka-core/2.6/akka/cluster/client/ClusterReceptionist.Internal$.html)*