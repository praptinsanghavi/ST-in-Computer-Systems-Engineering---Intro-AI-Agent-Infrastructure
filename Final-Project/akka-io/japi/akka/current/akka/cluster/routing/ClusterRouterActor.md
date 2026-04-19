---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:06:54Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/cluster/routing/ClusterRouterActor.html
title: ClusterRouterActor
---

# ClusterRouterActor

## Content

Package [akka.cluster.routing](package-summary.html)
## Interface ClusterRouterActor

- ---

```
public interface ClusterRouterActor
```

INTERNAL API
 The router actor, subscribes to cluster events and
 adjusts the routees.

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `void` | `[addMember](#addMember(akka.cluster.Member))​([Member](../Member.html "class in akka.cluster") member)` |  |
	| `void` | `[addRoutees](#addRoutees())()` | Adds routees based on settings |
	| `scala.collection.immutable.SortedSet<[Address](../../actor/Address.html "class in akka.actor")>` | `[availableNodes](#availableNodes())()` |  |
	| `[Cluster](../Cluster.html "class in akka.cluster")` | `[cluster](#cluster())()` |  |
	| `scala.PartialFunction<java.lang.Object,​scala.runtime.BoxedUnit>` | `[clusterReceive](#clusterReceive())()` |  |
	| `[Address](../../actor/Address.html "class in akka.actor")` | `[fullAddress](#fullAddress(akka.routing.Routee))​([Routee](../../routing/Routee.html "interface in akka.routing") routee)` | Fills in self address for local ActorRef |
	| `boolean` | `[isAvailable](#isAvailable(akka.cluster.Member))​([Member](../Member.html "class in akka.cluster") m)` |  |
	| `scala.collection.immutable.SortedSet<[Address](../../actor/Address.html "class in akka.actor")>` | `[nodes](#nodes())()` |  |
	| `void` | `[nodes_$eq](#nodes_$eq(scala.collection.immutable.SortedSet))​(scala.collection.immutable.SortedSet<[Address](../../actor/Address.html "class in akka.actor")> x$1)` |  |
	| `void` | `[postStop](#postStop())()` |  |
	| `void` | `[preStart](#preStart())()` |  |
	| `void` | `[removeMember](#removeMember(akka.cluster.Member))​([Member](../Member.html "class in akka.cluster") member)` |  |
	| `boolean` | `[satisfiesRoles](#satisfiesRoles(scala.collection.immutable.Set))​(scala.collection.immutable.Set<java.lang.String> memberRoles)` |  |
	| `[ClusterRouterSettingsBase](ClusterRouterSettingsBase.html "interface in akka.cluster.routing")` | `[settings](#settings())()` |  |

- - ### Method Detail
	
	
	
		- #### addMember
		
		
		
		```
		void addMember​([Member](../Member.html "class in akka.cluster") member)
		```
		- #### addRoutees
		
		
		
		```
		void addRoutees()
		```
		
		Adds routees based on settings
		- #### availableNodes
		
		
		
		```
		scala.collection.immutable.SortedSet<[Address](../../actor/Address.html "class in akka.actor")> availableNodes()
		```
		- #### cluster
		
		
		
		```
		[Cluster](../Cluster.html "class in akka.cluster") cluster()
		```
		- #### clusterReceive
		
		
		
		```
		scala.PartialFunction<java.lang.Object,​scala.runtime.BoxedUnit> clusterReceive()
		```
		- #### fullAddress
		
		
		
		```
		[Address](../../actor/Address.html "class in akka.actor") fullAddress​([Routee](../../routing/Routee.html "interface in akka.routing") routee)
		```
		
		Fills in self address for local ActorRef
		- #### isAvailable
		
		
		
		```
		boolean isAvailable​([Member](../Member.html "class in akka.cluster") m)
		```
		- #### nodes
		
		
		
		```
		scala.collection.immutable.SortedSet<[Address](../../actor/Address.html "class in akka.actor")> nodes()
		```
		- #### nodes\_$eq
		
		
		
		```
		void nodes_$eq​(scala.collection.immutable.SortedSet<[Address](../../actor/Address.html "class in akka.actor")> x$1)
		```
		- #### postStop
		
		
		
		```
		void postStop()
		```
		- #### preStart
		
		
		
		```
		void preStart()
		```
		- #### removeMember
		
		
		
		```
		void removeMember​([Member](../Member.html "class in akka.cluster") member)
		```
		- #### satisfiesRoles
		
		
		
		```
		boolean satisfiesRoles​(scala.collection.immutable.Set<java.lang.String> memberRoles)
		```
		- #### settings
		
		
		
		```
		[ClusterRouterSettingsBase](ClusterRouterSettingsBase.html "interface in akka.cluster.routing") settings()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/Address.html
- https://doc.akka.io/japi/akka/current/akka/cluster/Cluster.html
- https://doc.akka.io/japi/akka/current/akka/cluster/Member.html
- https://doc.akka.io/japi/akka/current/akka/cluster/routing/ClusterRouterSettingsBase.html
- https://doc.akka.io/japi/akka/current/akka/cluster/routing/package-summary.html
- https://doc.akka.io/japi/akka/current/akka/routing/Routee.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/cluster/routing/ClusterRouterActor.html](https://doc.akka.io/japi/akka/current/akka/cluster/routing/ClusterRouterActor.html)*