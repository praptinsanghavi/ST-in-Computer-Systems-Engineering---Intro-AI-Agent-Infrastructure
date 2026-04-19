---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T13:49:44Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/current/akka/actor/typed/ExtensionId.html
title: ExtensionId
---

# ExtensionId

## Content

Package [akka.actor.typed](package-summary.html)
## Class ExtensionId\<T extends [Extension](Extension.html "interface in akka.actor.typed")\>

- java.lang.Object
- - akka.actor.typed.ExtensionId\<T\>

- Type Parameters:
`T` \- The concrete extension type

Direct Known Subclasses:
`[ActorRefResolver$](ActorRefResolver$.html "class in akka.actor.typed")`, `[Cluster$](../../cluster/typed/Cluster$.html "class in akka.cluster.typed")`, `[ClusterSharding$](../../cluster/sharding/typed/scaladsl/ClusterSharding$.html "class in akka.cluster.sharding.typed.scaladsl")`, `[ClusterSingleton$](../../cluster/typed/ClusterSingleton$.html "class in akka.cluster.typed")`, `[DistributedData$](../../cluster/ddata/typed/javadsl/DistributedData$.html "class in akka.cluster.ddata.typed.javadsl")`, `[DistributedData$](../../cluster/ddata/typed/scaladsl/DistributedData$.html "class in akka.cluster.ddata.typed.scaladsl")`, `[DurableStateBehaviorInstrumentationProvider$](../../persistence/typed/telemetry/DurableStateBehaviorInstrumentationProvider$.html "class in akka.persistence.typed.telemetry")`, `[EventSourcedBehaviorInstrumentationProvider$](../../persistence/typed/telemetry/EventSourcedBehaviorInstrumentationProvider$.html "class in akka.persistence.typed.telemetry")`, `[EventStreamExtension$](internal/EventStreamExtension$.html "class in akka.actor.typed.internal")`, `[EventWriterExtension$](../../persistence/typed/internal/EventWriterExtension$.html "class in akka.persistence.typed.internal")`, `[PubSub$](pubsub/PubSub$.html "class in akka.actor.typed.pubsub")`, `[Receptionist$](receptionist/Receptionist$.html "class in akka.actor.typed.receptionist")`, `[ReplicatedShardingExtension$](../../cluster/sharding/typed/ReplicatedShardingExtension$.html "class in akka.cluster.sharding.typed")`, `[ShardedDaemonProcess$](../../cluster/sharding/typed/scaladsl/ShardedDaemonProcess$.html "class in akka.cluster.sharding.typed.scaladsl")`

---

```
public abstract class ExtensionId<T extends [Extension](Extension.html "interface in akka.actor.typed")>
extends java.lang.Object
```

Identifier and factory for an extension. Is used to look up an extension from the `ActorSystem`, and possibly create
 an instance if no instance was already registered. The extension can also be listed in the actor system configuration
 to have it eagerly loaded and registered on actor system startup.
 
 \*Scala API\*
 

 The `ExtensionId` for an extension written in Scala is best done by letting it be the companion object of the
 extension. If the extension will be used from Java special care needs to be taken to provide a `get` method with the
 concrete extension type as return (as this will not be inferred correctly by the Java compiler with the default
 implementation)
 

 Example:
 

```

 object MyExt extends ExtensionId[Ext] {

   override def createExtension(system: ActorSystem[_]): MyExt = new MyExt(system)

   // Java API: retrieve the extension instance for the given system.
   def get(system: ActorSystem[_]): MyExt = apply(system)
 }

 class MyExt(system: ActorSystem[_]) extends Extension {
   ...
 }

 // can be loaded eagerly on system startup through configuration
 // note that the name is the JVM/Java class name, with a dollar sign in the end
 // and not the Scala object name
 akka.actor.typed.extensions = ["com.example.MyExt$"]

 // Allows access like this from Scala
 MyExt().someMethodOnTheExtension()
 // and from Java
 MyExt.get(system).someMethodOnTheExtension()
 
```

 \*Java API\*
 

 To implement an extension in Java you should first create an `ExtensionId` singleton by implementing a static method
 called `getInstance`, this is needed to be able to list the extension among the `akka.actor.typed.extensions` in the configuration
 and have it loaded when the actor system starts up.
 

```

 public class MyExt extends AbstractExtensionId<MyExtImpl> {
   // single instance of the identifier
   private final static MyExt instance = new MyExt();

   // protect against other instances than the singleton
   private MyExt() {}

   // This static method singleton accessor is needed to be able to enable the extension through config when
   // implementing extensions in Java.
   public static MyExt getInstance() {
     return instance;
   }

   public MyExtImpl createExtension(ActorSystem<?> system) {
     return new MyExtImpl();
   }

   // convenience accessor
   public static MyExtImpl get(ActorSystem<?> system) {
      return instance.apply(system);
   }
 }

 public class MyExtImpl implements Extension {
    ...
 }

 // can be loaded eagerly on system startup through configuration
 akka.actor.typed.extensions = ["com.example.MyExt"]

 // Allows access like this from Scala
 MyExt.someMethodOnTheExtension()
 // and from Java
 MyExt.get(system).someMethodOnTheExtension()
 
```

 For testing purposes extensions typically provide a concrete [`ExtensionSetup`](ExtensionSetup.html "class in akka.actor.typed")
 that can be used in [`ActorSystemSetup`](../setup/ActorSystemSetup.html "class in akka.actor.setup") when starting the [`ActorSystem`](ActorSystem.html "class in akka.actor.typed")
 to replace the default implementation of the extension.
 

See Also:
[`ExtensionSetup`](ExtensionSetup.html "class in akka.actor.typed")

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ExtensionId](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[T](ExtensionId.html "type parameter in ExtensionId")` | `[apply](#apply(akka.actor.typed.ActorSystem))​([ActorSystem](ActorSystem.html "class in akka.actor.typed")<?> system)` | Lookup or create an instance of the extension identified by this id. |
	| `abstract [T](ExtensionId.html "type parameter in ExtensionId")` | `[createExtension](#createExtension(akka.actor.typed.ActorSystem))​([ActorSystem](ActorSystem.html "class in akka.actor.typed")<?> system)` | Create the extension, will be invoked at most one time per actor system where the extension is registered. |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object other)` |  |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `[ExtensionId](ExtensionId.html "class in akka.actor.typed")<[T](ExtensionId.html "type parameter in ExtensionId")>` | `[id](#id())()` | Java API: The identifier of the extension |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### ExtensionId
		
		
		
		```
		public ExtensionId()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public final [T](ExtensionId.html "type parameter in ExtensionId") apply​([ActorSystem](ActorSystem.html "class in akka.actor.typed")<?> system)
		```
		
		Lookup or create an instance of the extension identified by this id.
		- #### createExtension
		
		
		
		```
		public abstract [T](ExtensionId.html "type parameter in ExtensionId") createExtension​([ActorSystem](ActorSystem.html "class in akka.actor.typed")<?> system)
		```
		
		Create the extension, will be invoked at most one time per actor system where the extension is registered.
		- #### equals
		
		
		
		```
		public final boolean equals​(java.lang.Object other)
		```
		
		
		Overrides:
		`equals` in class `java.lang.Object`
		- #### hashCode
		
		
		
		```
		public final int hashCode()
		```
		
		
		Overrides:
		`hashCode` in class `java.lang.Object`
		- #### id
		
		
		
		```
		public [ExtensionId](ExtensionId.html "class in akka.actor.typed")<[T](ExtensionId.html "type parameter in ExtensionId")> id()
		```
		
		Java API: The identifier of the extension

## Code Examples

### Example 1: Class ExtensionId<T extendsExtension>

```text
object MyExt extends ExtensionId[Ext] {

   override def createExtension(system: ActorSystem[_]): MyExt = new MyExt(system)

   // Java API: retrieve the extension instance for the given system.
   def get(system: ActorSystem[_]): MyExt = apply(system)
 }

 class MyExt(system: ActorSystem[_]) extends Extension {
   ...
 }

 // can be loaded eagerly on system startup through configuration
 // note that the name is the JVM/Java class name, with a dollar sign in the end
 // and not the Scala object name
 akka.actor.typed.extensions = ["com.example.MyExt$"]

 // Allows access like this from Scala
 MyExt().someMethodOnTheExtension()
 // and from Java
 MyExt.get(system).someMethodOnTheExtension()
```

### Example 2: Class ExtensionId<T extendsExtension>

```text
public class MyExt extends AbstractExtensionId<MyExtImpl> {
   // single instance of the identifier
   private final static MyExt instance = new MyExt();

   // protect against other instances than the singleton
   private MyExt() {}

   // This static method singleton accessor is needed to be able to enable the extension through config when
   // implementing extensions in Java.
   public static MyExt getInstance() {
     return instance;
   }

   public MyExtImpl createExtension(ActorSystem<?> system) {
     return new MyExtImpl();
   }

   // convenience accessor
   public static MyExtImpl get(ActorSystem<?> system) {
      return instance.apply(system);
   }
 }

 public class MyExtImpl implements Extension {
    ...
 }

 // can be loaded eagerly on system startup through configuration
 akka.actor.typed.extensions = ["com.example.MyExt"]

 // Allows access like this from Scala
 MyExt.someMethodOnTheExtension()
 // and from Java
 MyExt.get(system).someMethodOnTheExtension()
```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/current/akka/actor/setup/ActorSystemSetup.html
- https://doc.akka.io/japi/akka-core/current/akka/actor/typed/ActorRefResolver$.html
- https://doc.akka.io/japi/akka-core/current/akka/actor/typed/ActorSystem.html
- https://doc.akka.io/japi/akka-core/current/akka/actor/typed/Extension.html
- https://doc.akka.io/japi/akka-core/current/akka/actor/typed/ExtensionId.html
- https://doc.akka.io/japi/akka-core/current/akka/actor/typed/ExtensionSetup.html
- https://doc.akka.io/japi/akka-core/current/akka/actor/typed/internal/EventStreamExtension$.html
- https://doc.akka.io/japi/akka-core/current/akka/actor/typed/package-summary.html
- https://doc.akka.io/japi/akka-core/current/akka/actor/typed/pubsub/PubSub$.html
- https://doc.akka.io/japi/akka-core/current/akka/actor/typed/receptionist/Receptionist$.html
- https://doc.akka.io/japi/akka-core/current/akka/cluster/ddata/typed/javadsl/DistributedData$.html
- https://doc.akka.io/japi/akka-core/current/akka/cluster/ddata/typed/scaladsl/DistributedData$.html
- https://doc.akka.io/japi/akka-core/current/akka/cluster/sharding/typed/ReplicatedShardingExtension$.html
- https://doc.akka.io/japi/akka-core/current/akka/cluster/sharding/typed/scaladsl/ClusterSharding$.html
- https://doc.akka.io/japi/akka-core/current/akka/cluster/sharding/typed/scaladsl/ShardedDaemonProcess$.html
- https://doc.akka.io/japi/akka-core/current/akka/cluster/typed/Cluster$.html
- https://doc.akka.io/japi/akka-core/current/akka/cluster/typed/ClusterSingleton$.html
- https://doc.akka.io/japi/akka-core/current/akka/persistence/typed/internal/EventWriterExtension$.html
- https://doc.akka.io/japi/akka-core/current/akka/persistence/typed/telemetry/DurableStateBehaviorInstrumentationProvider$.html
- https://doc.akka.io/japi/akka-core/current/akka/persistence/typed/telemetry/EventSourcedBehaviorInstrumentationProvider$.html

---
*Source: [https://doc.akka.io/japi/akka-core/current/akka/actor/typed/ExtensionId.html](https://doc.akka.io/japi/akka-core/current/akka/actor/typed/ExtensionId.html)*