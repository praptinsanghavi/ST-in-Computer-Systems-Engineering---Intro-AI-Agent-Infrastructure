---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:21:04Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/remote/testconductor/Conductor.html
title: Conductor
---

# Conductor

## Content

Package [akka.remote.testconductor](package-summary.html)
## Interface Conductor

- All Known Implementing Classes:
`[TestConductorExt](TestConductorExt.html "class in akka.remote.testconductor")`

---

```
public interface Conductor
```

The conductor is the one orchestrating the test: it governs the
 `Controller`\&rsquo;s port to which all
 [`Player`](Player.html "interface in akka.remote.testconductor")s connect, it issues commands to their
 `akka.remote.testconductor.NetworkFailureInjector` and provides support
 for barriers using the `BarrierCoordinator`.
 All of this is bundled inside the [`TestConductorExt`](TestConductorExt.html "class in akka.remote.testconductor")
 extension.

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Deprecated Methods](javascript:show(32);) 
	| Modifier and Type | Method | Description |
	| `void` | `[_controller_$eq](#_controller_$eq(akka.actor.ActorRef))​([ActorRef](../../actor/ActorRef.html "class in akka.actor") x$1)` |  |
	| `scala.concurrent.Future<akka.remote.testconductor.Done>` | `[abort](#abort(akka.remote.testconductor.RoleName,akka.remote.testconductor.RoleName))​([RoleName](RoleName.html "class in akka.remote.testconductor") node,  [RoleName](RoleName.html "class in akka.remote.testconductor") target)` | Tell the remote support to TCP\_RESET the connection to the given remote  peer. |
	| `scala.concurrent.Future<akka.remote.testconductor.Done>` | `[blackhole](#blackhole(akka.remote.testconductor.RoleName,akka.remote.testconductor.RoleName,akka.remote.testkit.Direction))​([RoleName](RoleName.html "class in akka.remote.testconductor") node,  [RoleName](RoleName.html "class in akka.remote.testconductor") target,  [Direction](../testkit/Direction.html "interface in akka.remote.testkit") direction)` | Switch the Netty pipeline of the remote support into blackhole mode for  sending and/or receiving: it will just drop all messages right before  submitting them to the Socket or right after receiving them from the  Socket. |
	| `[ActorRef](../../actor/ActorRef.html "class in akka.actor")` | `[controller](#controller())()` |  |
	| `scala.concurrent.Future<akka.remote.testconductor.Done>` | `[disconnect](#disconnect(akka.remote.testconductor.RoleName,akka.remote.testconductor.RoleName))​([RoleName](RoleName.html "class in akka.remote.testconductor") node,  [RoleName](RoleName.html "class in akka.remote.testconductor") target)` | Tell the remote support to shutdown the connection to the given remote  peer. |
	| `scala.concurrent.Future<akka.remote.testconductor.Done>` | `[exit](#exit(akka.remote.testconductor.RoleName,int))​([RoleName](RoleName.html "class in akka.remote.testconductor") node,  int exitValue)` | Tell the remote node to shut itself down using System.exit with the given  exitValue. |
	| `scala.concurrent.Future<scala.collection.Iterable<[RoleName](RoleName.html "class in akka.remote.testconductor")>>` | `[getNodes](#getNodes())()` | Obtain the list of remote host names currently registered. |
	| `scala.concurrent.Future<akka.remote.testconductor.Done>` | `[passThrough](#passThrough(akka.remote.testconductor.RoleName,akka.remote.testconductor.RoleName,akka.remote.testkit.Direction))​([RoleName](RoleName.html "class in akka.remote.testconductor") node,  [RoleName](RoleName.html "class in akka.remote.testconductor") target,  [Direction](../testkit/Direction.html "interface in akka.remote.testkit") direction)` | Switch the Netty pipeline of the remote support into pass through mode for  sending and/or receiving. |
	| `scala.concurrent.Future<akka.remote.testconductor.Done>` | `[removeNode](#removeNode(akka.remote.testconductor.RoleName))​([RoleName](RoleName.html "class in akka.remote.testconductor") node)` | Remove a remote host from the list, so that the remaining nodes may still  pass subsequent barriers. |
	| `void` | `[requireTestConductorTranport](#requireTestConductorTranport())()` |  |
	| `scala.concurrent.Future<akka.remote.testconductor.Done>` | `[shutdown](#shutdown(akka.remote.testconductor.RoleName))​([RoleName](RoleName.html "class in akka.remote.testconductor") node)` | Tell the actor system at the remote node to shut itself down. |
	| `scala.concurrent.Future<akka.remote.testconductor.Done>` | `[shutdown](#shutdown(akka.remote.testconductor.RoleName,boolean))​([RoleName](RoleName.html "class in akka.remote.testconductor") node,  boolean abort)` | Tell the actor system at the remote node to shut itself down without  awaiting termination of remote\-deployed children. |
	| `scala.concurrent.Future<java.net.InetSocketAddress>` | `[sockAddr](#sockAddr())()` | Obtain the port to which the controller\&rsquo;s socket is actually bound. |
	| `scala.concurrent.Future<java.net.InetSocketAddress>` | `[startController](#startController(int,akka.remote.testconductor.RoleName,java.net.InetSocketAddress))​(int participants,  [RoleName](RoleName.html "class in akka.remote.testconductor") name,  java.net.InetSocketAddress controllerPort)` | Start the `Controller`, which in turn will  bind to a TCP port as specified in the `akka.testconductor.port` config  property, where 0 denotes automatic allocation. |
	| `scala.concurrent.Future<akka.remote.testconductor.Done>` | `[throttle](#throttle(akka.remote.testconductor.RoleName,akka.remote.testconductor.RoleName,akka.remote.testkit.Direction,double))​([RoleName](RoleName.html "class in akka.remote.testconductor") node,  [RoleName](RoleName.html "class in akka.remote.testconductor") target,  [Direction](../testkit/Direction.html "interface in akka.remote.testkit") direction,  double rateMBit)` | Deprecated. Throttle is not implemented, use blackhole and passThrough. |

- - ### Method Detail
	
	
	
		- #### \_controller\_$eq
		
		
		
		```
		void _controller_$eq​([ActorRef](../../actor/ActorRef.html "class in akka.actor") x$1)
		```
		- #### abort
		
		
		
		```
		scala.concurrent.Future<akka.remote.testconductor.Done> abort​([RoleName](RoleName.html "class in akka.remote.testconductor") node,
		                                                              [RoleName](RoleName.html "class in akka.remote.testconductor") target)
		```
		
		Tell the remote support to TCP\_RESET the connection to the given remote
		 peer. It works regardless of whether the recipient was initiator or
		 responder.
		 
		
		Parameters:
		`node` \- is the symbolic name of the node which is to be affected
		`target` \- is the symbolic name of the other node to which connectivity shall be impeded
		- #### blackhole
		
		
		
		```
		scala.concurrent.Future<akka.remote.testconductor.Done> blackhole​([RoleName](RoleName.html "class in akka.remote.testconductor") node,
		                                                                  [RoleName](RoleName.html "class in akka.remote.testconductor") target,
		                                                                  [Direction](../testkit/Direction.html "interface in akka.remote.testkit") direction)
		```
		
		Switch the Netty pipeline of the remote support into blackhole mode for
		 sending and/or receiving: it will just drop all messages right before
		 submitting them to the Socket or right after receiving them from the
		 Socket.
		 
		 \=\=\=\=Note\=\=\=\=
		 To use this feature you must activate the failure injector and throttler
		 transport adapters by specifying `testTransport(on = true)` in your MultiNodeConfig.
		 
		
		
		
		Parameters:
		`node` \- is the symbolic name of the node which is to be affected
		`target` \- is the symbolic name of the other node to which connectivity shall be impeded
		`direction` \- can be either `Direction.Send`, `Direction.Receive` or `Direction.Both`
		- #### controller
		
		
		
		```
		[ActorRef](../../actor/ActorRef.html "class in akka.actor") controller()
		```
		- #### disconnect
		
		
		
		```
		scala.concurrent.Future<akka.remote.testconductor.Done> disconnect​([RoleName](RoleName.html "class in akka.remote.testconductor") node,
		                                                                   [RoleName](RoleName.html "class in akka.remote.testconductor") target)
		```
		
		Tell the remote support to shutdown the connection to the given remote
		 peer. It works regardless of whether the recipient was initiator or
		 responder.
		 
		
		Parameters:
		`node` \- is the symbolic name of the node which is to be affected
		`target` \- is the symbolic name of the other node to which connectivity shall be impeded
		- #### exit
		
		
		
		```
		scala.concurrent.Future<akka.remote.testconductor.Done> exit​([RoleName](RoleName.html "class in akka.remote.testconductor") node,
		                                                             int exitValue)
		```
		
		Tell the remote node to shut itself down using System.exit with the given
		 exitValue. The node will also be removed, so that the remaining nodes may still
		 pass subsequent barriers.
		 
		
		Parameters:
		`node` \- is the symbolic name of the node which is to be affected
		`exitValue` \- is the return code which shall be given to System.exit
		- #### getNodes
		
		
		
		```
		scala.concurrent.Future<scala.collection.Iterable<[RoleName](RoleName.html "class in akka.remote.testconductor")>> getNodes()
		```
		
		Obtain the list of remote host names currently registered.
		- #### passThrough
		
		
		
		```
		scala.concurrent.Future<akka.remote.testconductor.Done> passThrough​([RoleName](RoleName.html "class in akka.remote.testconductor") node,
		                                                                    [RoleName](RoleName.html "class in akka.remote.testconductor") target,
		                                                                    [Direction](../testkit/Direction.html "interface in akka.remote.testkit") direction)
		```
		
		Switch the Netty pipeline of the remote support into pass through mode for
		 sending and/or receiving.
		 
		 \=\=\=\=Note\=\=\=\=
		 To use this feature you must activate the failure injector and throttler
		 transport adapters by specifying `testTransport(on = true)` in your MultiNodeConfig.
		 
		
		
		
		Parameters:
		`node` \- is the symbolic name of the node which is to be affected
		`target` \- is the symbolic name of the other node to which connectivity shall be impeded
		`direction` \- can be either `Direction.Send`, `Direction.Receive` or `Direction.Both`
		- #### removeNode
		
		
		
		```
		scala.concurrent.Future<akka.remote.testconductor.Done> removeNode​([RoleName](RoleName.html "class in akka.remote.testconductor") node)
		```
		
		Remove a remote host from the list, so that the remaining nodes may still
		 pass subsequent barriers. This must be done before the client connection
		 breaks down in order to affect an \&ldquo;orderly\&rdquo; removal (i.e. without failing
		 present and future barriers).
		 
		
		Parameters:
		`node` \- is the symbolic name of the node which is to be removed
		- #### requireTestConductorTranport
		
		
		
		```
		void requireTestConductorTranport()
		```
		- #### shutdown
		
		
		
		```
		scala.concurrent.Future<akka.remote.testconductor.Done> shutdown​([RoleName](RoleName.html "class in akka.remote.testconductor") node)
		```
		
		Tell the actor system at the remote node to shut itself down. The node will also be
		 removed, so that the remaining nodes may still pass subsequent barriers.
		 
		
		Parameters:
		`node` \- is the symbolic name of the node which is to be affected
		- #### shutdown
		
		
		
		```
		scala.concurrent.Future<akka.remote.testconductor.Done> shutdown​([RoleName](RoleName.html "class in akka.remote.testconductor") node,
		                                                                 boolean abort)
		```
		
		Tell the actor system at the remote node to shut itself down without
		 awaiting termination of remote\-deployed children. The node will also be
		 removed, so that the remaining nodes may still pass subsequent barriers.
		 
		
		Parameters:
		`node` \- is the symbolic name of the node which is to be affected
		- #### sockAddr
		
		
		
		```
		scala.concurrent.Future<java.net.InetSocketAddress> sockAddr()
		```
		
		Obtain the port to which the controller\&rsquo;s socket is actually bound. This
		 will deviate from the configuration in `akka.testconductor.port` in case
		 that was given as zero.
		- #### startController
		
		
		
		```
		scala.concurrent.Future<java.net.InetSocketAddress> startController​(int participants,
		                                                                    [RoleName](RoleName.html "class in akka.remote.testconductor") name,
		                                                                    java.net.InetSocketAddress controllerPort)
		```
		
		Start the `Controller`, which in turn will
		 bind to a TCP port as specified in the `akka.testconductor.port` config
		 property, where 0 denotes automatic allocation. Since the latter is
		 actually preferred, a `Future[Int]` is returned which will be completed
		 with the port number actually chosen, so that this can then be communicated
		 to the players for their proper start\-up.
		 
		 This method also invokes [`Player`](Player.html "interface in akka.remote.testconductor").startClient,
		 since it is expected that the conductor participates in barriers for
		 overall coordination. The returned Future will only be completed once the
		 client\&rsquo;s start\-up finishes, which in fact waits for all other players to
		 connect.
		 
		
		
		
		Parameters:
		`participants` \- gives the number of participants which shall connect
		 before any of their startClient() operations complete.
		- #### throttle
		
		
		
		```
		scala.concurrent.Future<akka.remote.testconductor.Done> throttle​([RoleName](RoleName.html "class in akka.remote.testconductor") node,
		                                                                 [RoleName](RoleName.html "class in akka.remote.testconductor") target,
		                                                                 [Direction](../testkit/Direction.html "interface in akka.remote.testkit") direction,
		                                                                 double rateMBit)
		```
		
		Deprecated.
		Throttle is not implemented, use blackhole and passThrough. Since 2\.8\.0\.
		
		Make the remoting pipeline on the node throttle data sent to or received
		 from the given remote peer. Throttling works by delaying packet submission
		 within the netty pipeline until the packet would have been completely sent
		 according to the given rate, the previous packet completion and the current
		 packet length. In case of large packets they are split up if the calculated
		 send pause would exceed `akka.testconductor.packet-split-threshold`
		 (roughly). All of this uses the system\&rsquo;s scheduler, which is not
		 terribly precise and will execute tasks later than they are schedule (even
		 on average), but that is countered by using the actual execution time for
		 determining how much to send, leading to the correct output rate, but with
		 increased latency.
		 
		 \=\=\=\=Note\=\=\=\=
		 To use this feature you must activate the failure injector and throttler
		 transport adapters by specifying `testTransport(on = true)` in your MultiNodeConfig.
		 
		
		
		
		Parameters:
		`node` \- is the symbolic name of the node which is to be affected
		`target` \- is the symbolic name of the other node to which connectivity shall be throttled
		`direction` \- can be either `Direction.Send`, `Direction.Receive` or `Direction.Both`
		`rateMBit` \- is the maximum data rate in MBit

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorRef.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/testconductor/Player.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/testconductor/RoleName.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/testconductor/TestConductorExt.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/testconductor/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/testkit/Direction.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/remote/testconductor/Conductor.html](https://doc.akka.io/japi/akka-core/2.10/akka/remote/testconductor/Conductor.html)*