---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T13:47:41Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/current/akka/remote/package-summary.html
title: akka.remote
---

# akka.remote

## Content

# Package akka.remote

- Interface Summary 
| Interface | Description |
| [ArteryControlFormats.AddressOrBuilder](ArteryControlFormats.AddressOrBuilder.html "interface in akka.remote") |  |
| --- | --- |
| [ArteryControlFormats.ArteryHeartbeatRspOrBuilder](ArteryControlFormats.ArteryHeartbeatRspOrBuilder.html "interface in akka.remote") |  |
| [ArteryControlFormats.CompressionTableAdvertisementAckOrBuilder](ArteryControlFormats.CompressionTableAdvertisementAckOrBuilder.html "interface in akka.remote") |  |
| [ArteryControlFormats.CompressionTableAdvertisementOrBuilder](ArteryControlFormats.CompressionTableAdvertisementOrBuilder.html "interface in akka.remote") |  |
| [ArteryControlFormats.FlushAckOrBuilder](ArteryControlFormats.FlushAckOrBuilder.html "interface in akka.remote") |  |
| [ArteryControlFormats.HandshakeReqOrBuilder](ArteryControlFormats.HandshakeReqOrBuilder.html "interface in akka.remote") |  |
| [ArteryControlFormats.MessageWithAddressOrBuilder](ArteryControlFormats.MessageWithAddressOrBuilder.html "interface in akka.remote") |  |
| [ArteryControlFormats.QuarantinedOrBuilder](ArteryControlFormats.QuarantinedOrBuilder.html "interface in akka.remote") |  |
| [ArteryControlFormats.SystemMessageDeliveryAckOrBuilder](ArteryControlFormats.SystemMessageDeliveryAckOrBuilder.html "interface in akka.remote") |  |
| [ArteryControlFormats.SystemMessageEnvelopeOrBuilder](ArteryControlFormats.SystemMessageEnvelopeOrBuilder.html "interface in akka.remote") |  |
| [ArteryControlFormats.UniqueAddressOrBuilder](ArteryControlFormats.UniqueAddressOrBuilder.html "interface in akka.remote") |  |
| [ContainerFormats.ActorIdentityOrBuilder](ContainerFormats.ActorIdentityOrBuilder.html "interface in akka.remote") |  |
| [ContainerFormats.ActorInitializationExceptionOrBuilder](ContainerFormats.ActorInitializationExceptionOrBuilder.html "interface in akka.remote") |  |
| [ContainerFormats.ActorRefOrBuilder](ContainerFormats.ActorRefOrBuilder.html "interface in akka.remote") |  |
| [ContainerFormats.IdentifyOrBuilder](ContainerFormats.IdentifyOrBuilder.html "interface in akka.remote") |  |
| [ContainerFormats.OptionOrBuilder](ContainerFormats.OptionOrBuilder.html "interface in akka.remote") |  |
| [ContainerFormats.PayloadOrBuilder](ContainerFormats.PayloadOrBuilder.html "interface in akka.remote") |  |
| [ContainerFormats.SelectionEnvelopeOrBuilder](ContainerFormats.SelectionEnvelopeOrBuilder.html "interface in akka.remote") |  |
| [ContainerFormats.SelectionOrBuilder](ContainerFormats.SelectionOrBuilder.html "interface in akka.remote") |  |
| [ContainerFormats.StackTraceElementOrBuilder](ContainerFormats.StackTraceElementOrBuilder.html "interface in akka.remote") |  |
| [ContainerFormats.StatusReplyErrorMessageOrBuilder](ContainerFormats.StatusReplyErrorMessageOrBuilder.html "interface in akka.remote") |  |
| [ContainerFormats.ThrowableNotSerializableOrBuilder](ContainerFormats.ThrowableNotSerializableOrBuilder.html "interface in akka.remote") |  |
| [ContainerFormats.ThrowableOrBuilder](ContainerFormats.ThrowableOrBuilder.html "interface in akka.remote") |  |
| [ContainerFormats.WatcherHeartbeatResponseOrBuilder](ContainerFormats.WatcherHeartbeatResponseOrBuilder.html "interface in akka.remote") |  |
| [DaemonMsg](DaemonMsg.html "interface in akka.remote") | INTERNAL API |
| [FailureDetector](FailureDetector.html "interface in akka.remote") | A failure detector must be a thread\-safe mutable construct that registers heartbeat events of a resource and is able to  decide the availability of that monitored resource. |
| [FailureDetectorRegistry](FailureDetectorRegistry.html "interface in akka.remote")\<A\> | Interface for a registry of Akka failure detectors. |
| [HeartbeatMessage](HeartbeatMessage.html "interface in akka.remote") | Failure detector heartbeat messages are marked with this trait. |
| [PriorityMessage](PriorityMessage.html "interface in akka.remote") | INTERNAL API  Messages marked with this trait will be sent before other messages when buffering is active. |
| [RemoteRef](RemoteRef.html "interface in akka.remote") |  |
| [SystemMessageFormats.DeathWatchNotificationDataOrBuilder](SystemMessageFormats.DeathWatchNotificationDataOrBuilder.html "interface in akka.remote") |  |
| [SystemMessageFormats.FailedDataOrBuilder](SystemMessageFormats.FailedDataOrBuilder.html "interface in akka.remote") |  |
| [SystemMessageFormats.SuperviseDataOrBuilder](SystemMessageFormats.SuperviseDataOrBuilder.html "interface in akka.remote") |  |
| [SystemMessageFormats.SystemMessageOrBuilder](SystemMessageFormats.SystemMessageOrBuilder.html "interface in akka.remote") |  |
| [SystemMessageFormats.WatchDataOrBuilder](SystemMessageFormats.WatchDataOrBuilder.html "interface in akka.remote") |  |
| [WireFormats.AckAndEnvelopeContainerOrBuilder](WireFormats.AckAndEnvelopeContainerOrBuilder.html "interface in akka.remote") |  |
| [WireFormats.AcknowledgementInfoOrBuilder](WireFormats.AcknowledgementInfoOrBuilder.html "interface in akka.remote") |  |
| [WireFormats.ActorRefDataOrBuilder](WireFormats.ActorRefDataOrBuilder.html "interface in akka.remote") |  |
| [WireFormats.AddressDataOrBuilder](WireFormats.AddressDataOrBuilder.html "interface in akka.remote") |  |
| [WireFormats.AkkaControlMessageOrBuilder](WireFormats.AkkaControlMessageOrBuilder.html "interface in akka.remote") |  |
| [WireFormats.AkkaHandshakeInfoOrBuilder](WireFormats.AkkaHandshakeInfoOrBuilder.html "interface in akka.remote") |  |
| [WireFormats.AkkaProtocolMessageOrBuilder](WireFormats.AkkaProtocolMessageOrBuilder.html "interface in akka.remote") |  |
| [WireFormats.DaemonMsgCreateDataOrBuilder](WireFormats.DaemonMsgCreateDataOrBuilder.html "interface in akka.remote") |  |
| [WireFormats.DefaultResizerOrBuilder](WireFormats.DefaultResizerOrBuilder.html "interface in akka.remote") |  |
| [WireFormats.DeployDataOrBuilder](WireFormats.DeployDataOrBuilder.html "interface in akka.remote") |  |
| [WireFormats.FiniteDurationOrBuilder](WireFormats.FiniteDurationOrBuilder.html "interface in akka.remote") |  |
| [WireFormats.FromConfigOrBuilder](WireFormats.FromConfigOrBuilder.html "interface in akka.remote") |  |
| [WireFormats.GenericRoutingPoolOrBuilder](WireFormats.GenericRoutingPoolOrBuilder.html "interface in akka.remote") |  |
| [WireFormats.PropsDataOrBuilder](WireFormats.PropsDataOrBuilder.html "interface in akka.remote") |  |
| [WireFormats.RemoteEnvelopeOrBuilder](WireFormats.RemoteEnvelopeOrBuilder.html "interface in akka.remote") |  |
| [WireFormats.RemoteRouterConfigOrBuilder](WireFormats.RemoteRouterConfigOrBuilder.html "interface in akka.remote") |  |
| [WireFormats.RemoteScopeOrBuilder](WireFormats.RemoteScopeOrBuilder.html "interface in akka.remote") |  |
| [WireFormats.ScatterGatherPoolOrBuilder](WireFormats.ScatterGatherPoolOrBuilder.html "interface in akka.remote") |  |
| [WireFormats.SerializedMessageOrBuilder](WireFormats.SerializedMessageOrBuilder.html "interface in akka.remote") |  |
| [WireFormats.TailChoppingPoolOrBuilder](WireFormats.TailChoppingPoolOrBuilder.html "interface in akka.remote") |  |
- Class Summary 
| Class | Description |
| [AddressUidExtension](AddressUidExtension.html "class in akka.remote") | Deprecated. Use ExtendedActorSystem.uid instead. |
| --- | --- |
| [AddressUidExtension$](AddressUidExtension$.html "class in akka.remote") | Deprecated. Use ExtendedActorSystem.uid instead. |
| [ArteryControlFormats](ArteryControlFormats.html "class in akka.remote") |  |
| [ArteryControlFormats.Address](ArteryControlFormats.Address.html "class in akka.remote") | Defines a remote address. |
| [ArteryControlFormats.Address.Builder](ArteryControlFormats.Address.Builder.html "class in akka.remote") | Defines a remote address. |
| [ArteryControlFormats.ArteryHeartbeatRsp](ArteryControlFormats.ArteryHeartbeatRsp.html "class in akka.remote") | RemoteWatcher.ArteryHeartbeat is empty array  RemoteWatcher.ArteryHeartbeatRsp |
| [ArteryControlFormats.ArteryHeartbeatRsp.Builder](ArteryControlFormats.ArteryHeartbeatRsp.Builder.html "class in akka.remote") | RemoteWatcher.ArteryHeartbeat is empty array  RemoteWatcher.ArteryHeartbeatRsp |
| [ArteryControlFormats.CompressionTableAdvertisement](ArteryControlFormats.CompressionTableAdvertisement.html "class in akka.remote") | CompressionProtocol.ActorRefCompressionAdvertisement  CompressionProtocol.ClassManifestCompressionAdvertisement |
| [ArteryControlFormats.CompressionTableAdvertisement.Builder](ArteryControlFormats.CompressionTableAdvertisement.Builder.html "class in akka.remote") | CompressionProtocol.ActorRefCompressionAdvertisement  CompressionProtocol.ClassManifestCompressionAdvertisement |
| [ArteryControlFormats.CompressionTableAdvertisementAck](ArteryControlFormats.CompressionTableAdvertisementAck.html "class in akka.remote") | CompressionProtocol.ActorRefCompressionAdvertisementAck  CompressionProtocol.ClassManifestCompressionAdvertisementAck |
| [ArteryControlFormats.CompressionTableAdvertisementAck.Builder](ArteryControlFormats.CompressionTableAdvertisementAck.Builder.html "class in akka.remote") | CompressionProtocol.ActorRefCompressionAdvertisementAck  CompressionProtocol.ClassManifestCompressionAdvertisementAck |
| [ArteryControlFormats.FlushAck](ArteryControlFormats.FlushAck.html "class in akka.remote") | Protobuf type `FlushAck` |
| [ArteryControlFormats.FlushAck.Builder](ArteryControlFormats.FlushAck.Builder.html "class in akka.remote") | Protobuf type `FlushAck` |
| [ArteryControlFormats.HandshakeReq](ArteryControlFormats.HandshakeReq.html "class in akka.remote") | Protobuf type `HandshakeReq` |
| [ArteryControlFormats.HandshakeReq.Builder](ArteryControlFormats.HandshakeReq.Builder.html "class in akka.remote") | Protobuf type `HandshakeReq` |
| [ArteryControlFormats.MessageWithAddress](ArteryControlFormats.MessageWithAddress.html "class in akka.remote") | Generic message declaration that is used for all types of message that (currently) have a single  address field. |
| [ArteryControlFormats.MessageWithAddress.Builder](ArteryControlFormats.MessageWithAddress.Builder.html "class in akka.remote") | Generic message declaration that is used for all types of message that (currently) have a single  address field. |
| [ArteryControlFormats.Quarantined](ArteryControlFormats.Quarantined.html "class in akka.remote") | Protobuf type `Quarantined` |
| [ArteryControlFormats.Quarantined.Builder](ArteryControlFormats.Quarantined.Builder.html "class in akka.remote") | Protobuf type `Quarantined` |
| [ArteryControlFormats.SystemMessageDeliveryAck](ArteryControlFormats.SystemMessageDeliveryAck.html "class in akka.remote") | SystemMessageDelivery.Ack  SystemMessageDelivery.Nack |
| [ArteryControlFormats.SystemMessageDeliveryAck.Builder](ArteryControlFormats.SystemMessageDeliveryAck.Builder.html "class in akka.remote") | SystemMessageDelivery.Ack  SystemMessageDelivery.Nack |
| [ArteryControlFormats.SystemMessageEnvelope](ArteryControlFormats.SystemMessageEnvelope.html "class in akka.remote") | SystemMessageDelivery.SystemMessageEnvelope |
| [ArteryControlFormats.SystemMessageEnvelope.Builder](ArteryControlFormats.SystemMessageEnvelope.Builder.html "class in akka.remote") | SystemMessageDelivery.SystemMessageEnvelope |
| [ArteryControlFormats.UniqueAddress](ArteryControlFormats.UniqueAddress.html "class in akka.remote") | Defines a remote address with uid. |
| [ArteryControlFormats.UniqueAddress.Builder](ArteryControlFormats.UniqueAddress.Builder.html "class in akka.remote") | Defines a remote address with uid. |
| [BoundAddressesExtension](BoundAddressesExtension.html "class in akka.remote") |  |
| [BoundAddressesExtension$](BoundAddressesExtension$.html "class in akka.remote") | Extension provides access to bound addresses. |
| [ByteStringUtils](ByteStringUtils.html "class in akka.remote") | INTERNAL API |
| [ByteStringUtils$](ByteStringUtils$.html "class in akka.remote") | INTERNAL API |
| [ContainerFormats](ContainerFormats.html "class in akka.remote") |  |
| [ContainerFormats.ActorIdentity](ContainerFormats.ActorIdentity.html "class in akka.remote") | Protobuf type `ActorIdentity` |
| [ContainerFormats.ActorIdentity.Builder](ContainerFormats.ActorIdentity.Builder.html "class in akka.remote") | Protobuf type `ActorIdentity` |
| [ContainerFormats.ActorInitializationException](ContainerFormats.ActorInitializationException.html "class in akka.remote") | Protobuf type `ActorInitializationException` |
| [ContainerFormats.ActorInitializationException.Builder](ContainerFormats.ActorInitializationException.Builder.html "class in akka.remote") | Protobuf type `ActorInitializationException` |
| [ContainerFormats.ActorRef](ContainerFormats.ActorRef.html "class in akka.remote") | Protobuf type `ActorRef` |
| [ContainerFormats.ActorRef.Builder](ContainerFormats.ActorRef.Builder.html "class in akka.remote") | Protobuf type `ActorRef` |
| [ContainerFormats.Identify](ContainerFormats.Identify.html "class in akka.remote") | Protobuf type `Identify` |
| [ContainerFormats.Identify.Builder](ContainerFormats.Identify.Builder.html "class in akka.remote") | Protobuf type `Identify` |
| [ContainerFormats.Option](ContainerFormats.Option.html "class in akka.remote") | Protobuf type `Option` |
| [ContainerFormats.Option.Builder](ContainerFormats.Option.Builder.html "class in akka.remote") | Protobuf type `Option` |
| [ContainerFormats.Payload](ContainerFormats.Payload.html "class in akka.remote") | Protobuf type `Payload` |
| [ContainerFormats.Payload.Builder](ContainerFormats.Payload.Builder.html "class in akka.remote") | Protobuf type `Payload` |
| [ContainerFormats.Selection](ContainerFormats.Selection.html "class in akka.remote") | Protobuf type `Selection` |
| [ContainerFormats.Selection.Builder](ContainerFormats.Selection.Builder.html "class in akka.remote") | Protobuf type `Selection` |
| [ContainerFormats.SelectionEnvelope](ContainerFormats.SelectionEnvelope.html "class in akka.remote") | Protobuf type `SelectionEnvelope` |
| [ContainerFormats.SelectionEnvelope.Builder](ContainerFormats.SelectionEnvelope.Builder.html "class in akka.remote") | Protobuf type `SelectionEnvelope` |
| [ContainerFormats.StackTraceElement](ContainerFormats.StackTraceElement.html "class in akka.remote") | Protobuf type `StackTraceElement` |
| [ContainerFormats.StackTraceElement.Builder](ContainerFormats.StackTraceElement.Builder.html "class in akka.remote") | Protobuf type `StackTraceElement` |
| [ContainerFormats.StatusReplyErrorMessage](ContainerFormats.StatusReplyErrorMessage.html "class in akka.remote") | ReplyWith pattern message(s) |
| [ContainerFormats.StatusReplyErrorMessage.Builder](ContainerFormats.StatusReplyErrorMessage.Builder.html "class in akka.remote") | ReplyWith pattern message(s) |
| [ContainerFormats.Throwable](ContainerFormats.Throwable.html "class in akka.remote") | Protobuf type `Throwable` |
| [ContainerFormats.Throwable.Builder](ContainerFormats.Throwable.Builder.html "class in akka.remote") | Protobuf type `Throwable` |
| [ContainerFormats.ThrowableNotSerializable](ContainerFormats.ThrowableNotSerializable.html "class in akka.remote") | Protobuf type `ThrowableNotSerializable` |
| [ContainerFormats.ThrowableNotSerializable.Builder](ContainerFormats.ThrowableNotSerializable.Builder.html "class in akka.remote") | Protobuf type `ThrowableNotSerializable` |
| [ContainerFormats.WatcherHeartbeatResponse](ContainerFormats.WatcherHeartbeatResponse.html "class in akka.remote") | Protobuf type `WatcherHeartbeatResponse` |
| [ContainerFormats.WatcherHeartbeatResponse.Builder](ContainerFormats.WatcherHeartbeatResponse.Builder.html "class in akka.remote") | Protobuf type `WatcherHeartbeatResponse` |
| [DaemonMsgCreate$](DaemonMsgCreate$.html "class in akka.remote") |  |
| [DeadlineFailureDetector](DeadlineFailureDetector.html "class in akka.remote") | Implementation of failure detector using an absolute timeout of missing heartbeats  to trigger unavailability. |
| [DefaultFailureDetectorRegistry](DefaultFailureDetectorRegistry.html "class in akka.remote")\<A\> | A lock\-less thread\-safe implementation of [`FailureDetectorRegistry`](FailureDetectorRegistry.html "interface in akka.remote"). |
| [FailureDetector.Clock](FailureDetector.Clock.html "class in akka.remote") | Abstraction of a clock that returns time in milliseconds. |
| [FailureDetector$](FailureDetector$.html "class in akka.remote") |  |
| [FailureDetectorLoader](FailureDetectorLoader.html "class in akka.remote") | INTERNAL API |
| [FailureDetectorLoader$](FailureDetectorLoader$.html "class in akka.remote") | INTERNAL API |
| [HeartbeatHistory$](HeartbeatHistory$.html "class in akka.remote") |  |
| [MessageSerializer](MessageSerializer.html "class in akka.remote") | INTERNAL API |
| [MessageSerializer$](MessageSerializer$.html "class in akka.remote") | INTERNAL API |
| [PhiAccrualFailureDetector](PhiAccrualFailureDetector.html "class in akka.remote") | Implementation of 'The Phi Accrual Failure Detector' by Hayashibara et al. |
| [RARP$](RARP$.html "class in akka.remote") | INTERNAL API |
| [RemoteActorRefProvider$](RemoteActorRefProvider$.html "class in akka.remote") | INTERNAL API |
| [RemoteDeploymentWatcher$](RemoteDeploymentWatcher$.html "class in akka.remote") | INTERNAL API |
| [RemoteLogMarker](RemoteLogMarker.html "class in akka.remote") | This is public with the purpose to document the used markers and properties of log events. |
| [RemoteLogMarker$](RemoteLogMarker$.html "class in akka.remote") | This is public with the purpose to document the used markers and properties of log events. |
| [RemoteScope](RemoteScope.html "class in akka.remote") |  |
| [RemoteScope$](RemoteScope$.html "class in akka.remote") |  |
| [RemoteSettings](RemoteSettings.html "class in akka.remote") |  |
| [RemoteWatcher$](RemoteWatcher$.html "class in akka.remote") | INTERNAL API |
| [SystemMessageFormats](SystemMessageFormats.html "class in akka.remote") |  |
| [SystemMessageFormats.DeathWatchNotificationData](SystemMessageFormats.DeathWatchNotificationData.html "class in akka.remote") | Protobuf type `DeathWatchNotificationData` |
| [SystemMessageFormats.DeathWatchNotificationData.Builder](SystemMessageFormats.DeathWatchNotificationData.Builder.html "class in akka.remote") | Protobuf type `DeathWatchNotificationData` |
| [SystemMessageFormats.FailedData](SystemMessageFormats.FailedData.html "class in akka.remote") | Protobuf type `FailedData` |
| [SystemMessageFormats.FailedData.Builder](SystemMessageFormats.FailedData.Builder.html "class in akka.remote") | Protobuf type `FailedData` |
| [SystemMessageFormats.SuperviseData](SystemMessageFormats.SuperviseData.html "class in akka.remote") | Protobuf type `SuperviseData` |
| [SystemMessageFormats.SuperviseData.Builder](SystemMessageFormats.SuperviseData.Builder.html "class in akka.remote") | Protobuf type `SuperviseData` |
| [SystemMessageFormats.SystemMessage](SystemMessageFormats.SystemMessage.html "class in akka.remote") | Protobuf type `SystemMessage` |
| [SystemMessageFormats.SystemMessage.Builder](SystemMessageFormats.SystemMessage.Builder.html "class in akka.remote") | Protobuf type `SystemMessage` |
| [SystemMessageFormats.WatchData](SystemMessageFormats.WatchData.html "class in akka.remote") | Protobuf type `WatchData` |
| [SystemMessageFormats.WatchData.Builder](SystemMessageFormats.WatchData.Builder.html "class in akka.remote") | Protobuf type `WatchData` |
| [UniqueAddress](UniqueAddress.html "class in akka.remote") |  |
| [UniqueAddress$](UniqueAddress$.html "class in akka.remote") |  |
| [WireFormats](WireFormats.html "class in akka.remote") |  |
| [WireFormats.AckAndEnvelopeContainer](WireFormats.AckAndEnvelopeContainer.html "class in akka.remote") | Protobuf type `AckAndEnvelopeContainer` |
| [WireFormats.AckAndEnvelopeContainer.Builder](WireFormats.AckAndEnvelopeContainer.Builder.html "class in akka.remote") | Protobuf type `AckAndEnvelopeContainer` |
| [WireFormats.AcknowledgementInfo](WireFormats.AcknowledgementInfo.html "class in akka.remote") | Protobuf type `AcknowledgementInfo` |
| [WireFormats.AcknowledgementInfo.Builder](WireFormats.AcknowledgementInfo.Builder.html "class in akka.remote") | Protobuf type `AcknowledgementInfo` |
| [WireFormats.ActorRefData](WireFormats.ActorRefData.html "class in akka.remote") | Defines a remote ActorRef that "remembers" and uses its original Actor instance  on the original node. |
| [WireFormats.ActorRefData.Builder](WireFormats.ActorRefData.Builder.html "class in akka.remote") | Defines a remote ActorRef that "remembers" and uses its original Actor instance  on the original node. |
| [WireFormats.AddressData](WireFormats.AddressData.html "class in akka.remote") | Defines a remote address. |
| [WireFormats.AddressData.Builder](WireFormats.AddressData.Builder.html "class in akka.remote") | Defines a remote address. |
| [WireFormats.AkkaControlMessage](WireFormats.AkkaControlMessage.html "class in akka.remote") | Defines some control messages for the remoting |
| [WireFormats.AkkaControlMessage.Builder](WireFormats.AkkaControlMessage.Builder.html "class in akka.remote") | Defines some control messages for the remoting |
| [WireFormats.AkkaHandshakeInfo](WireFormats.AkkaHandshakeInfo.html "class in akka.remote") | Protobuf type `AkkaHandshakeInfo` |
| [WireFormats.AkkaHandshakeInfo.Builder](WireFormats.AkkaHandshakeInfo.Builder.html "class in akka.remote") | Protobuf type `AkkaHandshakeInfo` |
| [WireFormats.AkkaProtocolMessage](WireFormats.AkkaProtocolMessage.html "class in akka.remote") | Message format of Akka Protocol. |
| [WireFormats.AkkaProtocolMessage.Builder](WireFormats.AkkaProtocolMessage.Builder.html "class in akka.remote") | Message format of Akka Protocol. |
| [WireFormats.DaemonMsgCreateData](WireFormats.DaemonMsgCreateData.html "class in akka.remote") | Defines akka.remote.DaemonMsgCreate |
| [WireFormats.DaemonMsgCreateData.Builder](WireFormats.DaemonMsgCreateData.Builder.html "class in akka.remote") | Defines akka.remote.DaemonMsgCreate |
| [WireFormats.DefaultResizer](WireFormats.DefaultResizer.html "class in akka.remote") | Protobuf type `DefaultResizer` |
| [WireFormats.DefaultResizer.Builder](WireFormats.DefaultResizer.Builder.html "class in akka.remote") | Protobuf type `DefaultResizer` |
| [WireFormats.DeployData](WireFormats.DeployData.html "class in akka.remote") | Serialization of akka.actor.Deploy |
| [WireFormats.DeployData.Builder](WireFormats.DeployData.Builder.html "class in akka.remote") | Serialization of akka.actor.Deploy |
| [WireFormats.FiniteDuration](WireFormats.FiniteDuration.html "class in akka.remote") | Protobuf type `FiniteDuration` |
| [WireFormats.FiniteDuration.Builder](WireFormats.FiniteDuration.Builder.html "class in akka.remote") | Protobuf type `FiniteDuration` |
| [WireFormats.FromConfig](WireFormats.FromConfig.html "class in akka.remote") | Protobuf type `FromConfig` |
| [WireFormats.FromConfig.Builder](WireFormats.FromConfig.Builder.html "class in akka.remote") | Protobuf type `FromConfig` |
| [WireFormats.GenericRoutingPool](WireFormats.GenericRoutingPool.html "class in akka.remote") | Protobuf type `GenericRoutingPool` |
| [WireFormats.GenericRoutingPool.Builder](WireFormats.GenericRoutingPool.Builder.html "class in akka.remote") | Protobuf type `GenericRoutingPool` |
| [WireFormats.PropsData](WireFormats.PropsData.html "class in akka.remote") | Serialization of akka.actor.Props |
| [WireFormats.PropsData.Builder](WireFormats.PropsData.Builder.html "class in akka.remote") | Serialization of akka.actor.Props |
| [WireFormats.RemoteEnvelope](WireFormats.RemoteEnvelope.html "class in akka.remote") | Defines a remote message. |
| [WireFormats.RemoteEnvelope.Builder](WireFormats.RemoteEnvelope.Builder.html "class in akka.remote") | Defines a remote message. |
| [WireFormats.RemoteRouterConfig](WireFormats.RemoteRouterConfig.html "class in akka.remote") | Protobuf type `RemoteRouterConfig` |
| [WireFormats.RemoteRouterConfig.Builder](WireFormats.RemoteRouterConfig.Builder.html "class in akka.remote") | Protobuf type `RemoteRouterConfig` |
| [WireFormats.RemoteScope](WireFormats.RemoteScope.html "class in akka.remote") | Protobuf type `RemoteScope` |
| [WireFormats.RemoteScope.Builder](WireFormats.RemoteScope.Builder.html "class in akka.remote") | Protobuf type `RemoteScope` |
| [WireFormats.ScatterGatherPool](WireFormats.ScatterGatherPool.html "class in akka.remote") | Protobuf type `ScatterGatherPool` |
| [WireFormats.ScatterGatherPool.Builder](WireFormats.ScatterGatherPool.Builder.html "class in akka.remote") | Protobuf type `ScatterGatherPool` |
| [WireFormats.SerializedMessage](WireFormats.SerializedMessage.html "class in akka.remote") | Defines a message. |
| [WireFormats.SerializedMessage.Builder](WireFormats.SerializedMessage.Builder.html "class in akka.remote") | Defines a message. |
| [WireFormats.TailChoppingPool](WireFormats.TailChoppingPool.html "class in akka.remote") | Protobuf type `TailChoppingPool` |
| [WireFormats.TailChoppingPool.Builder](WireFormats.TailChoppingPool.Builder.html "class in akka.remote") | Protobuf type `TailChoppingPool` |
- Enum Summary 
| Enum | Description |
| [ContainerFormats.PatternType](ContainerFormats.PatternType.html "enum in akka.remote") | Protobuf enum `PatternType` |
| --- | --- |
| [SystemMessageFormats.SystemMessage.Type](SystemMessageFormats.SystemMessage.Type.html "enum in akka.remote") | Protobuf enum `SystemMessage.Type` |
| [WireFormats.CommandType](WireFormats.CommandType.html "enum in akka.remote") | Defines the type of the AkkaControlMessage command type |
| [WireFormats.TimeUnit](WireFormats.TimeUnit.html "enum in akka.remote") | java.util.concurrent.TimeUnit enum |
- Exception Summary 
| Exception | Description |
| [MessageSerializer.SerializationException](MessageSerializer.SerializationException.html "class in akka.remote") |  |
| --- | --- |
| [NotAllowedClassRemoteDeploymentAttemptException](NotAllowedClassRemoteDeploymentAttemptException.html "class in akka.remote") | INTERNAL API |
| [RemoteTransportException](RemoteTransportException.html "class in akka.remote") | RemoteTransportException represents a general failure within a RemoteTransport,  such as inability to start, wrong configuration etc. |
| [RemoteTransportExceptionNoStackTrace](RemoteTransportExceptionNoStackTrace.html "class in akka.remote") | [`RemoteTransportException`](RemoteTransportException.html "class in akka.remote") without stack trace. |

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/current/akka/remote/AddressUidExtension$.html
- https://doc.akka.io/japi/akka-core/current/akka/remote/AddressUidExtension.html
- https://doc.akka.io/japi/akka-core/current/akka/remote/ArteryControlFormats.Address.Builder.html
- https://doc.akka.io/japi/akka-core/current/akka/remote/ArteryControlFormats.Address.html
- https://doc.akka.io/japi/akka-core/current/akka/remote/ArteryControlFormats.AddressOrBuilder.html
- https://doc.akka.io/japi/akka-core/current/akka/remote/ArteryControlFormats.ArteryHeartbeatRsp.Builder.html
- https://doc.akka.io/japi/akka-core/current/akka/remote/ArteryControlFormats.ArteryHeartbeatRsp.html
- https://doc.akka.io/japi/akka-core/current/akka/remote/ArteryControlFormats.ArteryHeartbeatRspOrBuilder.html
- https://doc.akka.io/japi/akka-core/current/akka/remote/ArteryControlFormats.CompressionTableAdvertisement.Builder.html
- https://doc.akka.io/japi/akka-core/current/akka/remote/ArteryControlFormats.CompressionTableAdvertisement.html
- https://doc.akka.io/japi/akka-core/current/akka/remote/ArteryControlFormats.CompressionTableAdvertisementAck.Builder.html
- https://doc.akka.io/japi/akka-core/current/akka/remote/ArteryControlFormats.CompressionTableAdvertisementAck.html
- https://doc.akka.io/japi/akka-core/current/akka/remote/ArteryControlFormats.CompressionTableAdvertisementAckOrBuilder.html
- https://doc.akka.io/japi/akka-core/current/akka/remote/ArteryControlFormats.CompressionTableAdvertisementOrBuilder.html
- https://doc.akka.io/japi/akka-core/current/akka/remote/ArteryControlFormats.FlushAck.Builder.html
- https://doc.akka.io/japi/akka-core/current/akka/remote/ArteryControlFormats.FlushAck.html
- https://doc.akka.io/japi/akka-core/current/akka/remote/ArteryControlFormats.FlushAckOrBuilder.html
- https://doc.akka.io/japi/akka-core/current/akka/remote/ArteryControlFormats.HandshakeReq.Builder.html
- https://doc.akka.io/japi/akka-core/current/akka/remote/ArteryControlFormats.HandshakeReq.html
- https://doc.akka.io/japi/akka-core/current/akka/remote/ArteryControlFormats.HandshakeReqOrBuilder.html
- https://doc.akka.io/japi/akka-core/current/akka/remote/ArteryControlFormats.MessageWithAddress.Builder.html
- https://doc.akka.io/japi/akka-core/current/akka/remote/ArteryControlFormats.MessageWithAddress.html
- https://doc.akka.io/japi/akka-core/current/akka/remote/ArteryControlFormats.MessageWithAddressOrBuilder.html
- https://doc.akka.io/japi/akka-core/current/akka/remote/ArteryControlFormats.Quarantined.Builder.html
- https://doc.akka.io/japi/akka-core/current/akka/remote/ArteryControlFormats.Quarantined.html
- https://doc.akka.io/japi/akka-core/current/akka/remote/ArteryControlFormats.QuarantinedOrBuilder.html
- https://doc.akka.io/japi/akka-core/current/akka/remote/ArteryControlFormats.SystemMessageDeliveryAck.Builder.html
- https://doc.akka.io/japi/akka-core/current/akka/remote/ArteryControlFormats.SystemMessageDeliveryAck.html
- https://doc.akka.io/japi/akka-core/current/akka/remote/ArteryControlFormats.SystemMessageDeliveryAckOrBuilder.html
- https://doc.akka.io/japi/akka-core/current/akka/remote/ArteryControlFormats.SystemMessageEnvelope.Builder.html
- https://doc.akka.io/japi/akka-core/current/akka/remote/ArteryControlFormats.SystemMessageEnvelope.html
- https://doc.akka.io/japi/akka-core/current/akka/remote/ArteryControlFormats.SystemMessageEnvelopeOrBuilder.html
- https://doc.akka.io/japi/akka-core/current/akka/remote/ArteryControlFormats.UniqueAddress.Builder.html
- https://doc.akka.io/japi/akka-core/current/akka/remote/ArteryControlFormats.UniqueAddress.html
- https://doc.akka.io/japi/akka-core/current/akka/remote/ArteryControlFormats.UniqueAddressOrBuilder.html
- https://doc.akka.io/japi/akka-core/current/akka/remote/ArteryControlFormats.html
- https://doc.akka.io/japi/akka-core/current/akka/remote/BoundAddressesExtension$.html
- https://doc.akka.io/japi/akka-core/current/akka/remote/BoundAddressesExtension.html
- https://doc.akka.io/japi/akka-core/current/akka/remote/ByteStringUtils$.html
- https://doc.akka.io/japi/akka-core/current/akka/remote/ByteStringUtils.html
- https://doc.akka.io/japi/akka-core/current/akka/remote/ContainerFormats.ActorIdentity.Builder.html
- https://doc.akka.io/japi/akka-core/current/akka/remote/ContainerFormats.ActorIdentity.html
- https://doc.akka.io/japi/akka-core/current/akka/remote/ContainerFormats.ActorIdentityOrBuilder.html
- https://doc.akka.io/japi/akka-core/current/akka/remote/ContainerFormats.ActorInitializationException.Builder.html
- https://doc.akka.io/japi/akka-core/current/akka/remote/ContainerFormats.ActorInitializationException.html
- https://doc.akka.io/japi/akka-core/current/akka/remote/ContainerFormats.ActorInitializationExceptionOrBuilder.html
- https://doc.akka.io/japi/akka-core/current/akka/remote/ContainerFormats.ActorRef.Builder.html
- https://doc.akka.io/japi/akka-core/current/akka/remote/ContainerFormats.ActorRef.html
- https://doc.akka.io/japi/akka-core/current/akka/remote/ContainerFormats.ActorRefOrBuilder.html
- https://doc.akka.io/japi/akka-core/current/akka/remote/ContainerFormats.Identify.Builder.html

---
*Source: [https://doc.akka.io/japi/akka-core/current/akka/remote/package-summary.html](https://doc.akka.io/japi/akka-core/current/akka/remote/package-summary.html)*