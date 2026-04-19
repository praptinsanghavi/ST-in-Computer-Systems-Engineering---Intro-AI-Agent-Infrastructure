---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:36:31Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ddata/typed/scaladsl/Replicator.Update$.html
title: Replicator.Update$
---

# Replicator.Update$

## Content

Package [akka.cluster.ddata.typed.scaladsl](package-summary.html)
## Class Replicator.Update$

- java.lang.Object
- - akka.cluster.ddata.typed.scaladsl.Replicator.Update$

- All Implemented Interfaces:
`java.io.Serializable`

Enclosing class:
[Replicator](Replicator.html "class in akka.cluster.ddata.typed.scaladsl")

---

```
public static class Replicator.Update$
extends java.lang.Object
implements java.io.Serializable
```

See Also:
[Serialized Form](../../../../../serialized-form.html#akka.cluster.ddata.typed.scaladsl.Replicator.Update$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [Replicator.Update$](Replicator.Update$.html "class in akka.cluster.ddata.typed.scaladsl")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Update$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<A extends [ReplicatedData](../../ReplicatedData.html "interface in akka.cluster.ddata")>[Replicator.Update](Replicator.Update.html "class in akka.cluster.ddata.typed.scaladsl")<A>` | `[apply](#apply(akka.cluster.ddata.Key,akka.cluster.ddata.Replicator.WriteConsistency,akka.actor.typed.ActorRef,scala.Function1))​([Key](../../Key.html "class in akka.cluster.ddata")<A> key,  [Replicator.WriteConsistency](../../Replicator.WriteConsistency.html "interface in akka.cluster.ddata") writeConsistency,  [ActorRef](../../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<[Replicator.UpdateResponse](../../Replicator.UpdateResponse.html "class in akka.cluster.ddata")<A>> replyTo,  scala.Function1<scala.Option<A>,​A> modify)` | Send this message to the local `Replicator` to update a data value for the  given `key`. |
	| `<A extends [ReplicatedData](../../ReplicatedData.html "interface in akka.cluster.ddata")>[Replicator.Update](Replicator.Update.html "class in akka.cluster.ddata.typed.scaladsl")<A>` | `[apply](#apply(akka.cluster.ddata.Key,A,akka.cluster.ddata.Replicator.WriteConsistency,akka.actor.typed.ActorRef,scala.Function1))​([Key](../../Key.html "class in akka.cluster.ddata")<A> key,  A initial,  [Replicator.WriteConsistency](../../Replicator.WriteConsistency.html "interface in akka.cluster.ddata") writeConsistency,  [ActorRef](../../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<[Replicator.UpdateResponse](../../Replicator.UpdateResponse.html "class in akka.cluster.ddata")<A>> replyTo,  scala.Function1<A,​A> modify)` | Modify value of local `Replicator` and replicate with given `writeConsistency`. |
	| `<A extends [ReplicatedData](../../ReplicatedData.html "interface in akka.cluster.ddata")>scala.Function1<[ActorRef](../../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<[Replicator.UpdateResponse](../../Replicator.UpdateResponse.html "class in akka.cluster.ddata")<A>>,​[Replicator.Update](Replicator.Update.html "class in akka.cluster.ddata.typed.scaladsl")<A>>` | `[apply](#apply(akka.cluster.ddata.Key,A,akka.cluster.ddata.Replicator.WriteConsistency,scala.Function1))​([Key](../../Key.html "class in akka.cluster.ddata")<A> key,  A initial,  [Replicator.WriteConsistency](../../Replicator.WriteConsistency.html "interface in akka.cluster.ddata") writeConsistency,  scala.Function1<A,​A> modify)` | Convenience for `ask`. |
	| `<A extends [ReplicatedData](../../ReplicatedData.html "interface in akka.cluster.ddata")>scala.Option<scala.Tuple3<[Key](../../Key.html "class in akka.cluster.ddata")<A>,​[Replicator.WriteConsistency](../../Replicator.WriteConsistency.html "interface in akka.cluster.ddata"),​[ActorRef](../../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<[Replicator.UpdateResponse](../../Replicator.UpdateResponse.html "class in akka.cluster.ddata")<A>>>>` | `[unapply](#unapply(akka.cluster.ddata.typed.scaladsl.Replicator.Update))​([Replicator.Update](Replicator.Update.html "class in akka.cluster.ddata.typed.scaladsl")<A> x$0)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [Replicator.Update$](Replicator.Update$.html "class in akka.cluster.ddata.typed.scaladsl") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### Update$
		
		
		
		```
		public Update$()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public <A extends [ReplicatedData](../../ReplicatedData.html "interface in akka.cluster.ddata")> [Replicator.Update](Replicator.Update.html "class in akka.cluster.ddata.typed.scaladsl")<A> apply​([Key](../../Key.html "class in akka.cluster.ddata")<A> key,
		                                                             A initial,
		                                                             [Replicator.WriteConsistency](../../Replicator.WriteConsistency.html "interface in akka.cluster.ddata") writeConsistency,
		                                                             [ActorRef](../../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<[Replicator.UpdateResponse](../../Replicator.UpdateResponse.html "class in akka.cluster.ddata")<A>> replyTo,
		                                                             scala.Function1<A,​A> modify)
		```
		
		Modify value of local `Replicator` and replicate with given `writeConsistency`.
		 
		 The current value for the `key` is passed to the `modify` function.
		 If there is no current data value for the `key` the `initial` value will be
		 passed to the `modify` function.
		- #### apply
		
		
		
		```
		public <A extends [ReplicatedData](../../ReplicatedData.html "interface in akka.cluster.ddata")> scala.Function1<[ActorRef](../../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<[Replicator.UpdateResponse](../../Replicator.UpdateResponse.html "class in akka.cluster.ddata")<A>>,​[Replicator.Update](Replicator.Update.html "class in akka.cluster.ddata.typed.scaladsl")<A>> apply​([Key](../../Key.html "class in akka.cluster.ddata")<A> key,
		                                                                                                                           A initial,
		                                                                                                                           [Replicator.WriteConsistency](../../Replicator.WriteConsistency.html "interface in akka.cluster.ddata") writeConsistency,
		                                                                                                                           scala.Function1<A,​A> modify)
		```
		
		Convenience for `ask`.
		- #### apply
		
		
		
		```
		public <A extends [ReplicatedData](../../ReplicatedData.html "interface in akka.cluster.ddata")> [Replicator.Update](Replicator.Update.html "class in akka.cluster.ddata.typed.scaladsl")<A> apply​([Key](../../Key.html "class in akka.cluster.ddata")<A> key,
		                                                             [Replicator.WriteConsistency](../../Replicator.WriteConsistency.html "interface in akka.cluster.ddata") writeConsistency,
		                                                             [ActorRef](../../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<[Replicator.UpdateResponse](../../Replicator.UpdateResponse.html "class in akka.cluster.ddata")<A>> replyTo,
		                                                             scala.Function1<scala.Option<A>,​A> modify)
		```
		
		Send this message to the local `Replicator` to update a data value for the
		 given `key`. The `Replicator` will reply with one of the `UpdateResponse` messages.
		 
		 Note that the [`companion`](Replicator.Update$.html "class in akka.cluster.ddata.typed.scaladsl") object provides `apply` functions for convenient
		 construction of this message.
		 
		
		
		 The current data value for the `key` is passed as parameter to the `modify` function.
		 It is `None` if there is no value for the `key`, and otherwise `Some(data)`. The function
		 is supposed to return the new value of the data, which will then be replicated according to
		 the given `writeConsistency`.
		 
		
		
		 The `modify` function is called by the `Replicator` actor and must therefore be a pure
		 function that only uses the data parameter and stable fields from enclosing scope. It must
		 for example not access `sender()` reference of an enclosing actor.
		- #### unapply
		
		
		
		```
		public <A extends [ReplicatedData](../../ReplicatedData.html "interface in akka.cluster.ddata")> scala.Option<scala.Tuple3<[Key](../../Key.html "class in akka.cluster.ddata")<A>,​[Replicator.WriteConsistency](../../Replicator.WriteConsistency.html "interface in akka.cluster.ddata"),​[ActorRef](../../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<[Replicator.UpdateResponse](../../Replicator.UpdateResponse.html "class in akka.cluster.ddata")<A>>>> unapply​([Replicator.Update](Replicator.Update.html "class in akka.cluster.ddata.typed.scaladsl")<A> x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/ActorRef.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ddata/Key.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ddata/ReplicatedData.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ddata/Replicator.UpdateResponse.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ddata/Replicator.WriteConsistency.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ddata/typed/scaladsl/Replicator.Update$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ddata/typed/scaladsl/Replicator.Update.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ddata/typed/scaladsl/Replicator.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ddata/typed/scaladsl/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ddata/typed/scaladsl/Replicator.Update$.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ddata/typed/scaladsl/Replicator.Update$.html)*