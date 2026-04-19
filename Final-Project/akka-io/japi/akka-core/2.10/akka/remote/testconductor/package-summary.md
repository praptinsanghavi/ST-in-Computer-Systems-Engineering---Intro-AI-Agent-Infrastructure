---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T13:12:00Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/remote/testconductor/package-summary.html
title: akka.remote.testconductor
---

# akka.remote.testconductor

## Content

# Package akka.remote.testconductor

- Interface Summary 
| Interface | Description |
| [ClientOp](ClientOp.html "interface in akka.remote.testconductor") |  |
| --- | --- |
| [CommandOp](CommandOp.html "interface in akka.remote.testconductor") |  |
| [Conductor](Conductor.html "interface in akka.remote.testconductor") | The conductor is the one orchestrating the test: it governs the  `Controller`\&rsquo;s port to which all  [`Player`](Player.html "interface in akka.remote.testconductor")s connect, it issues commands to their  `akka.remote.testconductor.NetworkFailureInjector` and provides support  for barriers using the `BarrierCoordinator`. |
| [ConfirmedClientOp](ConfirmedClientOp.html "interface in akka.remote.testconductor") |  |
| [NetworkOp](NetworkOp.html "interface in akka.remote.testconductor") |  |
| [Player](Player.html "interface in akka.remote.testconductor") | The Player is the client component of the  [`TestConductorExt`](TestConductorExt.html "class in akka.remote.testconductor") extension. |
| [RemoteConnection](RemoteConnection.html "interface in akka.remote.testconductor") | INTERNAL API. |
| [Role](Role.html "interface in akka.remote.testconductor") | INTERNAL API. |
| [ServerOp](ServerOp.html "interface in akka.remote.testconductor") |  |
| [TestConductorProtocol.AddressOrBuilder](TestConductorProtocol.AddressOrBuilder.html "interface in akka.remote.testconductor") |  |
| [TestConductorProtocol.AddressRequestOrBuilder](TestConductorProtocol.AddressRequestOrBuilder.html "interface in akka.remote.testconductor") |  |
| [TestConductorProtocol.EnterBarrierOrBuilder](TestConductorProtocol.EnterBarrierOrBuilder.html "interface in akka.remote.testconductor") |  |
| [TestConductorProtocol.HelloOrBuilder](TestConductorProtocol.HelloOrBuilder.html "interface in akka.remote.testconductor") |  |
| [TestConductorProtocol.InjectFailureOrBuilder](TestConductorProtocol.InjectFailureOrBuilder.html "interface in akka.remote.testconductor") |  |
| [TestConductorProtocol.WrapperOrBuilder](TestConductorProtocol.WrapperOrBuilder.html "interface in akka.remote.testconductor") |  |
| [UnconfirmedClientOp](UnconfirmedClientOp.html "interface in akka.remote.testconductor") |  |
- Class Summary 
| Class | Description |
| [AddressReply$](AddressReply$.html "class in akka.remote.testconductor") |  |
| --- | --- |
| [BarrierCoordinator$](BarrierCoordinator$.html "class in akka.remote.testconductor") | INTERNAL API. |
| [BarrierResult$](BarrierResult$.html "class in akka.remote.testconductor") |  |
| [Client](Client.html "class in akka.remote.testconductor") | INTERNAL API. |
| [Client$](Client$.html "class in akka.remote.testconductor") | INTERNAL API. |
| [ClientFSM$](ClientFSM$.html "class in akka.remote.testconductor") | INTERNAL API. |
| [Controller$](Controller$.html "class in akka.remote.testconductor") | INTERNAL API. |
| [Disconnect$](Disconnect$.html "class in akka.remote.testconductor") |  |
| [DisconnectMsg$](DisconnectMsg$.html "class in akka.remote.testconductor") |  |
| [Done$](Done$.html "class in akka.remote.testconductor") |  |
| [EnterBarrier$](EnterBarrier$.html "class in akka.remote.testconductor") |  |
| [FailBarrier$](FailBarrier$.html "class in akka.remote.testconductor") |  |
| [GetAddress$](GetAddress$.html "class in akka.remote.testconductor") |  |
| [Hello$](Hello$.html "class in akka.remote.testconductor") |  |
| [Player.Waiter](Player.Waiter.html "class in akka.remote.testconductor") |  |
| [Player$](Player$.html "class in akka.remote.testconductor") |  |
| [RemoteConnection$](RemoteConnection$.html "class in akka.remote.testconductor") | INTERNAL API. |
| [Remove$](Remove$.html "class in akka.remote.testconductor") |  |
| [RoleName](RoleName.html "class in akka.remote.testconductor") |  |
| [RoleName$](RoleName$.html "class in akka.remote.testconductor") |  |
| [Server](Server.html "class in akka.remote.testconductor") | INTERNAL API. |
| [Server$](Server$.html "class in akka.remote.testconductor") | INTERNAL API. |
| [ServerFSM$](ServerFSM$.html "class in akka.remote.testconductor") | INTERNAL API. |
| [Terminate$](Terminate$.html "class in akka.remote.testconductor") |  |
| [TerminateMsg$](TerminateMsg$.html "class in akka.remote.testconductor") |  |
| [TestConductor](TestConductor.html "class in akka.remote.testconductor") | Access to the [`TestConductorExt`](TestConductorExt.html "class in akka.remote.testconductor") extension: |
| [TestConductor$](TestConductor$.html "class in akka.remote.testconductor") | Access to the [`TestConductorExt`](TestConductorExt.html "class in akka.remote.testconductor") extension: |
| [TestConductorExt](TestConductorExt.html "class in akka.remote.testconductor") | This binds together the [`Conductor`](Conductor.html "interface in akka.remote.testconductor") and  [`Player`](Player.html "interface in akka.remote.testconductor") roles inside an Akka  [`Extension`](../../actor/Extension.html "interface in akka.actor"). |
| [TestConductorProtocol](TestConductorProtocol.html "class in akka.remote.testconductor") |  |
| [TestConductorProtocol.Address](TestConductorProtocol.Address.html "class in akka.remote.testconductor") | Protobuf type `Address` |
| [TestConductorProtocol.Address.Builder](TestConductorProtocol.Address.Builder.html "class in akka.remote.testconductor") | Protobuf type `Address` |
| [TestConductorProtocol.AddressRequest](TestConductorProtocol.AddressRequest.html "class in akka.remote.testconductor") | Protobuf type `AddressRequest` |
| [TestConductorProtocol.AddressRequest.Builder](TestConductorProtocol.AddressRequest.Builder.html "class in akka.remote.testconductor") | Protobuf type `AddressRequest` |
| [TestConductorProtocol.EnterBarrier](TestConductorProtocol.EnterBarrier.html "class in akka.remote.testconductor") | Protobuf type `EnterBarrier` |
| [TestConductorProtocol.EnterBarrier.Builder](TestConductorProtocol.EnterBarrier.Builder.html "class in akka.remote.testconductor") | Protobuf type `EnterBarrier` |
| [TestConductorProtocol.Hello](TestConductorProtocol.Hello.html "class in akka.remote.testconductor") | Protobuf type `Hello` |
| [TestConductorProtocol.Hello.Builder](TestConductorProtocol.Hello.Builder.html "class in akka.remote.testconductor") | Protobuf type `Hello` |
| [TestConductorProtocol.InjectFailure](TestConductorProtocol.InjectFailure.html "class in akka.remote.testconductor") | Protobuf type `InjectFailure` |
| [TestConductorProtocol.InjectFailure.Builder](TestConductorProtocol.InjectFailure.Builder.html "class in akka.remote.testconductor") | Protobuf type `InjectFailure` |
| [TestConductorProtocol.Wrapper](TestConductorProtocol.Wrapper.html "class in akka.remote.testconductor") | Protobuf type `Wrapper` |
| [TestConductorProtocol.Wrapper.Builder](TestConductorProtocol.Wrapper.Builder.html "class in akka.remote.testconductor") | Protobuf type `Wrapper` |
| [Throttle$](Throttle$.html "class in akka.remote.testconductor") |  |
| [ThrottleMsg$](ThrottleMsg$.html "class in akka.remote.testconductor") |  |
| [ToClient$](ToClient$.html "class in akka.remote.testconductor") |  |
| [ToServer$](ToServer$.html "class in akka.remote.testconductor") |  |
- Enum Summary 
| Enum | Description |
| [TestConductorProtocol.BarrierOp](TestConductorProtocol.BarrierOp.html "enum in akka.remote.testconductor") | Protobuf enum `BarrierOp` |
| --- | --- |
| [TestConductorProtocol.Direction](TestConductorProtocol.Direction.html "enum in akka.remote.testconductor") | Protobuf enum `Direction` |
| [TestConductorProtocol.FailType](TestConductorProtocol.FailType.html "enum in akka.remote.testconductor") | Protobuf enum `FailType` |

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/Extension.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/testconductor/AddressReply$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/testconductor/BarrierCoordinator$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/testconductor/BarrierResult$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/testconductor/Client$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/testconductor/Client.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/testconductor/ClientFSM$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/testconductor/ClientOp.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/testconductor/CommandOp.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/testconductor/Conductor.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/testconductor/ConfirmedClientOp.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/testconductor/Controller$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/testconductor/Disconnect$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/testconductor/DisconnectMsg$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/testconductor/Done$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/testconductor/EnterBarrier$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/testconductor/FailBarrier$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/testconductor/GetAddress$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/testconductor/Hello$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/testconductor/NetworkOp.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/testconductor/Player$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/testconductor/Player.Waiter.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/testconductor/Player.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/testconductor/RemoteConnection$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/testconductor/RemoteConnection.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/testconductor/Remove$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/testconductor/Role.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/testconductor/RoleName$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/testconductor/RoleName.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/testconductor/Server$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/testconductor/Server.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/testconductor/ServerFSM$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/testconductor/ServerOp.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/testconductor/Terminate$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/testconductor/TerminateMsg$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/testconductor/TestConductor$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/testconductor/TestConductor.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/testconductor/TestConductorExt.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/testconductor/TestConductorProtocol.Address.Builder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/testconductor/TestConductorProtocol.Address.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/testconductor/TestConductorProtocol.AddressOrBuilder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/testconductor/TestConductorProtocol.AddressRequest.Builder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/testconductor/TestConductorProtocol.AddressRequest.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/testconductor/TestConductorProtocol.AddressRequestOrBuilder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/testconductor/TestConductorProtocol.BarrierOp.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/testconductor/TestConductorProtocol.Direction.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/testconductor/TestConductorProtocol.EnterBarrier.Builder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/testconductor/TestConductorProtocol.EnterBarrier.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/testconductor/TestConductorProtocol.EnterBarrierOrBuilder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/testconductor/TestConductorProtocol.FailType.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/remote/testconductor/package-summary.html](https://doc.akka.io/japi/akka-core/2.10/akka/remote/testconductor/package-summary.html)*