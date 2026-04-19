---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T13:47:40Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/current/akka/remote/artery/package-summary.html
title: akka.remote.artery
---

# akka.remote.artery

## Content

# Package akka.remote.artery

- Interface Summary 
| Interface | Description |
| [ArteryMessage](ArteryMessage.html "interface in akka.remote.artery") | INTERNAL API: marker trait for protobuf\-serializable artery messages |
| --- | --- |
| [ControlMessage](ControlMessage.html "interface in akka.remote.artery") | INTERNAL API  Marker trait for control messages that can be sent via the system message sub\-channel  but don't need full reliable delivery. |
| [HeaderBuilder](HeaderBuilder.html "interface in akka.remote.artery") | INTERNAL API |
| [InboundContext](InboundContext.html "interface in akka.remote.artery") | INTERNAL API  Inbound API that is used by the stream operators. |
| [InboundEnvelope](InboundEnvelope.html "interface in akka.remote.artery") | INTERNAL API |
| [OutboundContext](OutboundContext.html "interface in akka.remote.artery") | INTERNAL API  Outbound association API that is used by the stream operators. |
| [OutboundEnvelope](OutboundEnvelope.html "interface in akka.remote.artery") | INTERNAL API |
| [Reply](Reply.html "interface in akka.remote.artery") | INTERNAL API: Marker trait for reply messages |
- Class Summary 
| Class | Description |
| [ActorSystemTerminating$](ActorSystemTerminating$.html "class in akka.remote.artery") |  |
| --- | --- |
| [ActorSystemTerminatingAck$](ActorSystemTerminatingAck$.html "class in akka.remote.artery") |  |
| [ArterySettings$](ArterySettings$.html "class in akka.remote.artery") | INTERNAL API |
| [ArteryTransport$](ArteryTransport$.html "class in akka.remote.artery") | INTERNAL API |
| [Association$](Association$.html "class in akka.remote.artery") | INTERNAL API |
| [AssociationState$](AssociationState$.html "class in akka.remote.artery") | INTERNAL API |
| [ByteFlag$](ByteFlag$.html "class in akka.remote.artery") | INTERNAL API |
| [CacheStatistics$](CacheStatistics$.html "class in akka.remote.artery") |  |
| [Decoder$](Decoder$.html "class in akka.remote.artery") | INTERNAL API |
| [Encoder$](Encoder$.html "class in akka.remote.artery") | INTERNAL API |
| [EnvelopeBuffer$](EnvelopeBuffer$.html "class in akka.remote.artery") | INTERNAL API |
| [Flush](Flush.html "class in akka.remote.artery") | INTERNAL API |
| [Flush$](Flush$.html "class in akka.remote.artery") | INTERNAL API |
| [FlushAck$](FlushAck$.html "class in akka.remote.artery") |  |
| [FlushBeforeDeathWatchNotification$](FlushBeforeDeathWatchNotification$.html "class in akka.remote.artery") | INTERNAL API |
| [FlushOnShutdown$](FlushOnShutdown$.html "class in akka.remote.artery") | INTERNAL API |
| [GracefulShutdownQuarantinedEvent](GracefulShutdownQuarantinedEvent.html "class in akka.remote.artery") |  |
| [GracefulShutdownQuarantinedEvent$](GracefulShutdownQuarantinedEvent$.html "class in akka.remote.artery") |  |
| [HeaderBuilder$](HeaderBuilder$.html "class in akka.remote.artery") | INTERNAL API |
| [ImmutableLongMap$](ImmutableLongMap$.html "class in akka.remote.artery") | INTERNAL API |
| [InboundControlJunction$](InboundControlJunction$.html "class in akka.remote.artery") | INTERNAL API |
| [InboundEnvelope$](InboundEnvelope$.html "class in akka.remote.artery") | INTERNAL API |
| [OutboundControlJunction$](OutboundControlJunction$.html "class in akka.remote.artery") | INTERNAL API |
| [OutboundEnvelope$](OutboundEnvelope$.html "class in akka.remote.artery") | INTERNAL API |
| [OutboundHandshake$](OutboundHandshake$.html "class in akka.remote.artery") | INTERNAL API |
| [Quarantined$](Quarantined$.html "class in akka.remote.artery") |  |
| [QuarantinedEvent](QuarantinedEvent.html "class in akka.remote.artery") |  |
| [QuarantinedEvent$](QuarantinedEvent$.html "class in akka.remote.artery") |  |
| [RemoteInstrument](RemoteInstrument.html "class in akka.remote.artery") | INTERNAL API |
| [RemoteInstruments$](RemoteInstruments$.html "class in akka.remote.artery") | INTERNAL API |
| [RemotingFlightRecorder](RemotingFlightRecorder.html "class in akka.remote.artery") | INTERNAL API |
| [RemotingFlightRecorder$](RemotingFlightRecorder$.html "class in akka.remote.artery") | INTERNAL API |
| [RestartCounter$](RestartCounter$.html "class in akka.remote.artery") | INTERNAL API |
| [ReusableInboundEnvelope$](ReusableInboundEnvelope$.html "class in akka.remote.artery") | INTERNAL API |
| [ReusableOutboundEnvelope$](ReusableOutboundEnvelope$.html "class in akka.remote.artery") | INTERNAL API |
| [SendQueue$](SendQueue$.html "class in akka.remote.artery") | INTERNAL API |
| [SystemMessageAcker$](SystemMessageAcker$.html "class in akka.remote.artery") | INTERNAL API |
| [SystemMessageDelivery$](SystemMessageDelivery$.html "class in akka.remote.artery") | INTERNAL API |
| [TestManagementCommands](TestManagementCommands.html "class in akka.remote.artery") |  |
| [TestManagementCommands.FailInboundStreamOnce](TestManagementCommands.FailInboundStreamOnce.html "class in akka.remote.artery") | INTERNAL API |
| [TestManagementCommands.FailInboundStreamOnce$](TestManagementCommands.FailInboundStreamOnce$.html "class in akka.remote.artery") |  |
| [TestManagementCommands$](TestManagementCommands$.html "class in akka.remote.artery") |  |
| [TestState$](TestState$.html "class in akka.remote.artery") |  |
| [ThisActorSystemQuarantinedEvent](ThisActorSystemQuarantinedEvent.html "class in akka.remote.artery") |  |
| [ThisActorSystemQuarantinedEvent$](ThisActorSystemQuarantinedEvent$.html "class in akka.remote.artery") |  |

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/current/akka/remote/artery/ActorSystemTerminating$.html
- https://doc.akka.io/japi/akka-core/current/akka/remote/artery/ActorSystemTerminatingAck$.html
- https://doc.akka.io/japi/akka-core/current/akka/remote/artery/ArteryMessage.html
- https://doc.akka.io/japi/akka-core/current/akka/remote/artery/ArterySettings$.html
- https://doc.akka.io/japi/akka-core/current/akka/remote/artery/ArteryTransport$.html
- https://doc.akka.io/japi/akka-core/current/akka/remote/artery/Association$.html
- https://doc.akka.io/japi/akka-core/current/akka/remote/artery/AssociationState$.html
- https://doc.akka.io/japi/akka-core/current/akka/remote/artery/ByteFlag$.html
- https://doc.akka.io/japi/akka-core/current/akka/remote/artery/CacheStatistics$.html
- https://doc.akka.io/japi/akka-core/current/akka/remote/artery/ControlMessage.html
- https://doc.akka.io/japi/akka-core/current/akka/remote/artery/Decoder$.html
- https://doc.akka.io/japi/akka-core/current/akka/remote/artery/Encoder$.html
- https://doc.akka.io/japi/akka-core/current/akka/remote/artery/EnvelopeBuffer$.html
- https://doc.akka.io/japi/akka-core/current/akka/remote/artery/Flush$.html
- https://doc.akka.io/japi/akka-core/current/akka/remote/artery/Flush.html
- https://doc.akka.io/japi/akka-core/current/akka/remote/artery/FlushAck$.html
- https://doc.akka.io/japi/akka-core/current/akka/remote/artery/FlushBeforeDeathWatchNotification$.html
- https://doc.akka.io/japi/akka-core/current/akka/remote/artery/FlushOnShutdown$.html
- https://doc.akka.io/japi/akka-core/current/akka/remote/artery/GracefulShutdownQuarantinedEvent$.html
- https://doc.akka.io/japi/akka-core/current/akka/remote/artery/GracefulShutdownQuarantinedEvent.html
- https://doc.akka.io/japi/akka-core/current/akka/remote/artery/HeaderBuilder$.html
- https://doc.akka.io/japi/akka-core/current/akka/remote/artery/HeaderBuilder.html
- https://doc.akka.io/japi/akka-core/current/akka/remote/artery/ImmutableLongMap$.html
- https://doc.akka.io/japi/akka-core/current/akka/remote/artery/InboundContext.html
- https://doc.akka.io/japi/akka-core/current/akka/remote/artery/InboundControlJunction$.html
- https://doc.akka.io/japi/akka-core/current/akka/remote/artery/InboundEnvelope$.html
- https://doc.akka.io/japi/akka-core/current/akka/remote/artery/InboundEnvelope.html
- https://doc.akka.io/japi/akka-core/current/akka/remote/artery/OutboundContext.html
- https://doc.akka.io/japi/akka-core/current/akka/remote/artery/OutboundControlJunction$.html
- https://doc.akka.io/japi/akka-core/current/akka/remote/artery/OutboundEnvelope$.html
- https://doc.akka.io/japi/akka-core/current/akka/remote/artery/OutboundEnvelope.html
- https://doc.akka.io/japi/akka-core/current/akka/remote/artery/OutboundHandshake$.html
- https://doc.akka.io/japi/akka-core/current/akka/remote/artery/Quarantined$.html
- https://doc.akka.io/japi/akka-core/current/akka/remote/artery/QuarantinedEvent$.html
- https://doc.akka.io/japi/akka-core/current/akka/remote/artery/QuarantinedEvent.html
- https://doc.akka.io/japi/akka-core/current/akka/remote/artery/RemoteInstrument.html
- https://doc.akka.io/japi/akka-core/current/akka/remote/artery/RemoteInstruments$.html
- https://doc.akka.io/japi/akka-core/current/akka/remote/artery/RemotingFlightRecorder$.html
- https://doc.akka.io/japi/akka-core/current/akka/remote/artery/RemotingFlightRecorder.html
- https://doc.akka.io/japi/akka-core/current/akka/remote/artery/Reply.html
- https://doc.akka.io/japi/akka-core/current/akka/remote/artery/RestartCounter$.html
- https://doc.akka.io/japi/akka-core/current/akka/remote/artery/ReusableInboundEnvelope$.html
- https://doc.akka.io/japi/akka-core/current/akka/remote/artery/ReusableOutboundEnvelope$.html
- https://doc.akka.io/japi/akka-core/current/akka/remote/artery/SendQueue$.html
- https://doc.akka.io/japi/akka-core/current/akka/remote/artery/SystemMessageAcker$.html
- https://doc.akka.io/japi/akka-core/current/akka/remote/artery/SystemMessageDelivery$.html
- https://doc.akka.io/japi/akka-core/current/akka/remote/artery/TestManagementCommands$.html
- https://doc.akka.io/japi/akka-core/current/akka/remote/artery/TestManagementCommands.FailInboundStreamOnce$.html
- https://doc.akka.io/japi/akka-core/current/akka/remote/artery/TestManagementCommands.FailInboundStreamOnce.html
- https://doc.akka.io/japi/akka-core/current/akka/remote/artery/TestManagementCommands.html

---
*Source: [https://doc.akka.io/japi/akka-core/current/akka/remote/artery/package-summary.html](https://doc.akka.io/japi/akka-core/current/akka/remote/artery/package-summary.html)*