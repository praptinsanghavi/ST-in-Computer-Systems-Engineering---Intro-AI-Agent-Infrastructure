---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:59:12Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/persistence/serialization/MessageSerializer.html
title: MessageSerializer
---

# MessageSerializer

## Content

Package [akka.persistence.serialization](package-summary.html)
## Class MessageSerializer

- java.lang.Object
- - akka.persistence.serialization.MessageSerializer

- All Implemented Interfaces:
`[BaseSerializer](../../serialization/BaseSerializer.html "interface in akka.serialization")`, `[Serializer](../../serialization/Serializer.html "interface in akka.serialization")`

---

```
public class MessageSerializer
extends java.lang.Object
implements [BaseSerializer](../../serialization/BaseSerializer.html "interface in akka.serialization")
```

Protobuf serializer for [`PersistentRepr`](../PersistentRepr.html "interface in akka.persistence"), [`AtLeastOnceDelivery`](../AtLeastOnceDelivery.html "interface in akka.persistence") and [`PersistentFSM.StateChangeEvent`](../fsm/PersistentFSM.StateChangeEvent.html "class in akka.persistence.fsm") messages.

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[MessageSerializer](#%3Cinit%3E(akka.actor.ExtendedActorSystem))​([ExtendedActorSystem](../../actor/ExtendedActorSystem.html "class in akka.actor") system)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `protected void` | `[akka$serialization$BaseSerializer$_setter_$identifier_$eq](#akka$serialization$BaseSerializer$_setter_$identifier_$eq(int))​(int x$1)` | Globally unique serialization identifier configured in the `reference.conf`. |
	| `[AtLeastOnceDelivery.AtLeastOnceDeliverySnapshot](../AtLeastOnceDelivery.AtLeastOnceDeliverySnapshot.html "class in akka.persistence")` | `[atLeastOnceDeliverySnapshot](#atLeastOnceDeliverySnapshot(akka.persistence.serialization.MessageFormats.AtLeastOnceDeliverySnapshot))​([MessageFormats.AtLeastOnceDeliverySnapshot](MessageFormats.AtLeastOnceDeliverySnapshot.html "class in akka.persistence.serialization") atLeastOnceDeliverySnapshot)` |  |
	| `[MessageFormats.AtLeastOnceDeliverySnapshot.Builder](MessageFormats.AtLeastOnceDeliverySnapshot.Builder.html "class in akka.persistence.serialization")` | `[atLeastOnceDeliverySnapshotBuilder](#atLeastOnceDeliverySnapshotBuilder(akka.persistence.AtLeastOnceDelivery.AtLeastOnceDeliverySnapshot))​([AtLeastOnceDelivery.AtLeastOnceDeliverySnapshot](../AtLeastOnceDelivery.AtLeastOnceDeliverySnapshot.html "class in akka.persistence") snap)` |  |
	| `java.lang.Class<[AtLeastOnceDelivery.AtLeastOnceDeliverySnapshot](../AtLeastOnceDelivery.AtLeastOnceDeliverySnapshot.html "class in akka.persistence")>` | `[AtLeastOnceDeliverySnapshotClass](#AtLeastOnceDeliverySnapshotClass())()` |  |
	| `java.lang.Class<[AtomicWrite](../AtomicWrite.html "class in akka.persistence")>` | `[AtomicWriteClass](#AtomicWriteClass())()` |  |
	| `[Message](Message.html "interface in akka.persistence.serialization")` | `[fromBinary](#fromBinary(byte%5B%5D,scala.Option))​(byte[] bytes,  scala.Option<java.lang.Class<?>> manifest)` | Deserializes persistent messages. |
	| `int` | `[identifier](#identifier())()` | Globally unique serialization identifier configured in the `reference.conf`. |
	| `boolean` | `[includeManifest](#includeManifest())()` | Returns whether this serializer needs a manifest in the fromBinary method |
	| `<any>` | `[persistentFSMSnapshot](#persistentFSMSnapshot(akka.persistence.serialization.MessageFormats.PersistentFSMSnapshot))​([MessageFormats.PersistentFSMSnapshot](MessageFormats.PersistentFSMSnapshot.html "class in akka.persistence.serialization") persistentFSMSnapshot)` |  |
	| `java.lang.Class<<any>>` | `[PersistentFSMSnapshotClass](#PersistentFSMSnapshotClass())()` |  |
	| `java.lang.Class<akka.persistence.PersistentImpl>` | `[PersistentImplClass](#PersistentImplClass())()` |  |
	| `java.lang.Class<[PersistentRepr](../PersistentRepr.html "interface in akka.persistence")>` | `[PersistentReprClass](#PersistentReprClass())()` |  |
	| `java.lang.Class<[PersistentFSM.StateChangeEvent](../fsm/PersistentFSM.StateChangeEvent.html "class in akka.persistence.fsm")>` | `[PersistentStateChangeEventClass](#PersistentStateChangeEventClass())()` |  |
	| `[PersistentFSM.StateChangeEvent](../fsm/PersistentFSM.StateChangeEvent.html "class in akka.persistence.fsm")` | `[stateChange](#stateChange(akka.persistence.serialization.MessageFormats.PersistentStateChangeEvent))​([MessageFormats.PersistentStateChangeEvent](MessageFormats.PersistentStateChangeEvent.html "class in akka.persistence.serialization") persistentStateChange)` |  |
	| `[ExtendedActorSystem](../../actor/ExtendedActorSystem.html "class in akka.actor")` | `[system](#system())()` | Actor system which is required by most serializer implementations. |
	| `byte[]` | `[toBinary](#toBinary(java.lang.Object))​(java.lang.Object o)` | Serializes persistent messages. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface akka.serialization.[BaseSerializer](../../serialization/BaseSerializer.html "interface in akka.serialization")
		
		
		`[identifierFromConfig](../../serialization/BaseSerializer.html#identifierFromConfig()), [SerializationIdentifiers](../../serialization/BaseSerializer.html#SerializationIdentifiers())`
		- ### Methods inherited from interface akka.serialization.[Serializer](../../serialization/Serializer.html "interface in akka.serialization")
		
		
		`[fromBinary](../../serialization/Serializer.html#fromBinary(byte%5B%5D)), [fromBinary](../../serialization/Serializer.html#fromBinary(byte%5B%5D,java.lang.Class))`

- - ### Constructor Detail
	
	
	
		- #### MessageSerializer
		
		
		
		```
		public MessageSerializer​([ExtendedActorSystem](../../actor/ExtendedActorSystem.html "class in akka.actor") system)
		```

	- ### Method Detail
	
	
	
		- #### AtLeastOnceDeliverySnapshotClass
		
		
		
		```
		public java.lang.Class<[AtLeastOnceDelivery.AtLeastOnceDeliverySnapshot](../AtLeastOnceDelivery.AtLeastOnceDeliverySnapshot.html "class in akka.persistence")> AtLeastOnceDeliverySnapshotClass()
		```
		- #### AtomicWriteClass
		
		
		
		```
		public java.lang.Class<[AtomicWrite](../AtomicWrite.html "class in akka.persistence")> AtomicWriteClass()
		```
		- #### PersistentFSMSnapshotClass
		
		
		
		```
		public java.lang.Class<<any>> PersistentFSMSnapshotClass()
		```
		- #### PersistentImplClass
		
		
		
		```
		public java.lang.Class<akka.persistence.PersistentImpl> PersistentImplClass()
		```
		- #### PersistentReprClass
		
		
		
		```
		public java.lang.Class<[PersistentRepr](../PersistentRepr.html "interface in akka.persistence")> PersistentReprClass()
		```
		- #### PersistentStateChangeEventClass
		
		
		
		```
		public java.lang.Class<[PersistentFSM.StateChangeEvent](../fsm/PersistentFSM.StateChangeEvent.html "class in akka.persistence.fsm")> PersistentStateChangeEventClass()
		```
		- #### akka$serialization$BaseSerializer$\_setter\_$identifier\_$eq
		
		
		
		```
		protected void akka$serialization$BaseSerializer$_setter_$identifier_$eq​(int x$1)
		```
		
		Description copied from interface: `[BaseSerializer](../../serialization/BaseSerializer.html#akka$serialization$BaseSerializer$_setter_$identifier_$eq(int))`
		Globally unique serialization identifier configured in the `reference.conf`.
		 
		 See `Serializer.identifier`.
		
		
		
		Specified by:
		`[akka$serialization$BaseSerializer$_setter_$identifier_$eq](../../serialization/BaseSerializer.html#akka$serialization$BaseSerializer$_setter_$identifier_$eq(int))` in interface `[BaseSerializer](../../serialization/BaseSerializer.html "interface in akka.serialization")`
		- #### atLeastOnceDeliverySnapshot
		
		
		
		```
		public [AtLeastOnceDelivery.AtLeastOnceDeliverySnapshot](../AtLeastOnceDelivery.AtLeastOnceDeliverySnapshot.html "class in akka.persistence") atLeastOnceDeliverySnapshot​([MessageFormats.AtLeastOnceDeliverySnapshot](MessageFormats.AtLeastOnceDeliverySnapshot.html "class in akka.persistence.serialization") atLeastOnceDeliverySnapshot)
		```
		- #### atLeastOnceDeliverySnapshotBuilder
		
		
		
		```
		public [MessageFormats.AtLeastOnceDeliverySnapshot.Builder](MessageFormats.AtLeastOnceDeliverySnapshot.Builder.html "class in akka.persistence.serialization") atLeastOnceDeliverySnapshotBuilder​([AtLeastOnceDelivery.AtLeastOnceDeliverySnapshot](../AtLeastOnceDelivery.AtLeastOnceDeliverySnapshot.html "class in akka.persistence") snap)
		```
		- #### fromBinary
		
		
		
		```
		public [Message](Message.html "interface in akka.persistence.serialization") fromBinary​(byte[] bytes,
		                          scala.Option<java.lang.Class<?>> manifest)
		```
		
		Deserializes persistent messages. Delegates deserialization of a persistent
		 message's payload to a matching `akka.serialization.Serializer`.
		
		Specified by:
		`[fromBinary](../../serialization/Serializer.html#fromBinary(byte%5B%5D,scala.Option))` in interface `[Serializer](../../serialization/Serializer.html "interface in akka.serialization")`
		- #### identifier
		
		
		
		```
		public int identifier()
		```
		
		Description copied from interface: `[BaseSerializer](../../serialization/BaseSerializer.html#identifier())`
		Globally unique serialization identifier configured in the `reference.conf`.
		 
		 See `Serializer.identifier`.
		
		
		
		Specified by:
		`[identifier](../../serialization/BaseSerializer.html#identifier())` in interface `[BaseSerializer](../../serialization/BaseSerializer.html "interface in akka.serialization")`
		Specified by:
		`[identifier](../../serialization/Serializer.html#identifier())` in interface `[Serializer](../../serialization/Serializer.html "interface in akka.serialization")`
		- #### includeManifest
		
		
		
		```
		public boolean includeManifest()
		```
		
		Description copied from interface: `[Serializer](../../serialization/Serializer.html#includeManifest())`
		Returns whether this serializer needs a manifest in the fromBinary method
		
		Specified by:
		`[includeManifest](../../serialization/Serializer.html#includeManifest())` in interface `[Serializer](../../serialization/Serializer.html "interface in akka.serialization")`
		- #### persistentFSMSnapshot
		
		
		
		```
		public <any> persistentFSMSnapshot​([MessageFormats.PersistentFSMSnapshot](MessageFormats.PersistentFSMSnapshot.html "class in akka.persistence.serialization") persistentFSMSnapshot)
		```
		- #### stateChange
		
		
		
		```
		public [PersistentFSM.StateChangeEvent](../fsm/PersistentFSM.StateChangeEvent.html "class in akka.persistence.fsm") stateChange​([MessageFormats.PersistentStateChangeEvent](MessageFormats.PersistentStateChangeEvent.html "class in akka.persistence.serialization") persistentStateChange)
		```
		- #### system
		
		
		
		```
		public [ExtendedActorSystem](../../actor/ExtendedActorSystem.html "class in akka.actor") system()
		```
		
		Description copied from interface: `[BaseSerializer](../../serialization/BaseSerializer.html#system())`
		Actor system which is required by most serializer implementations.
		
		Specified by:
		`[system](../../serialization/BaseSerializer.html#system())` in interface `[BaseSerializer](../../serialization/BaseSerializer.html "interface in akka.serialization")`
		- #### toBinary
		
		
		
		```
		public byte[] toBinary​(java.lang.Object o)
		```
		
		Serializes persistent messages. Delegates serialization of a persistent
		 message's payload to a matching `akka.serialization.Serializer`.
		
		Specified by:
		`[toBinary](../../serialization/Serializer.html#toBinary(java.lang.Object))` in interface `[Serializer](../../serialization/Serializer.html "interface in akka.serialization")`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ExtendedActorSystem.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/AtLeastOnceDelivery.AtLeastOnceDeliverySnapshot.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/AtLeastOnceDelivery.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/AtomicWrite.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/PersistentRepr.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/fsm/PersistentFSM.StateChangeEvent.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/serialization/Message.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/serialization/MessageFormats.AtLeastOnceDeliverySnapshot.Builder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/serialization/MessageFormats.AtLeastOnceDeliverySnapshot.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/serialization/MessageFormats.PersistentFSMSnapshot.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/serialization/MessageFormats.PersistentStateChangeEvent.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/serialization/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/akka/serialization/BaseSerializer.html
- https://doc.akka.io/japi/akka-core/2.10/akka/serialization/Serializer.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/persistence/serialization/MessageSerializer.html](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/serialization/MessageSerializer.html)*