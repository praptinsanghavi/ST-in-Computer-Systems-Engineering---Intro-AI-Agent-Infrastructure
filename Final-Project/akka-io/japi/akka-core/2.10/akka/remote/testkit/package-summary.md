---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T13:12:17Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/remote/testkit/package-summary.html
title: akka.remote.testkit
---

# akka.remote.testkit

## Content

# Package akka.remote.testkit

- Interface Summary 
| Interface | Description |
| [Direction](Direction.html "interface in akka.remote.testkit") |  |
| --- | --- |
| [MultiNodeSpecCallbacks](MultiNodeSpecCallbacks.html "interface in akka.remote.testkit") | Use this to hook MultiNodeSpec into your test framework lifecycle, either by having your test extend MultiNodeSpec  and call these methods or by creating a trait that calls them and then mixing that trait with your test together  with MultiNodeSpec. |
| [PerfFlamesSupport](PerfFlamesSupport.html "interface in akka.remote.testkit") | INTERNAL API: Support trait allowing trivially recording perf metrics from [`MultiNodeSpec`](MultiNodeSpec.html "class in akka.remote.testkit")s |
| [ThrottleMode](ThrottleMode.html "interface in akka.remote.testkit") |  |
- Class Summary 
| Class | Description |
| [Blackhole](Blackhole.html "class in akka.remote.testkit") |  |
| --- | --- |
| [Blackhole$](Blackhole$.html "class in akka.remote.testkit") |  |
| [Direction.Both$](Direction.Both$.html "class in akka.remote.testkit") |  |
| [Direction.Receive$](Direction.Receive$.html "class in akka.remote.testkit") |  |
| [Direction.Send$](Direction.Send$.html "class in akka.remote.testkit") |  |
| [Direction$](Direction$.html "class in akka.remote.testkit") |  |
| [ForceDisassociate](ForceDisassociate.html "class in akka.remote.testkit") | Management Command to force disassociation of an address. |
| [ForceDisassociate$](ForceDisassociate$.html "class in akka.remote.testkit") |  |
| [ForceDisassociateAck](ForceDisassociateAck.html "class in akka.remote.testkit") |  |
| [ForceDisassociateAck$](ForceDisassociateAck$.html "class in akka.remote.testkit") |  |
| [MultiNodeConfig](MultiNodeConfig.html "class in akka.remote.testkit") | Configure the role names and participants of the test, including configuration settings. |
| [MultiNodeSpec](MultiNodeSpec.html "class in akka.remote.testkit") | Note: To be able to run tests with everything ignored or excluded by tags  you must not use `testconductor`, or helper methods that use `testconductor`,  from the constructor of your test class. |
| [MultiNodeSpec$](MultiNodeSpec$.html "class in akka.remote.testkit") |  |
| [SetThrottle](SetThrottle.html "class in akka.remote.testkit") |  |
| [SetThrottle$](SetThrottle$.html "class in akka.remote.testkit") |  |
| [SetThrottleAck](SetThrottleAck.html "class in akka.remote.testkit") |  |
| [SetThrottleAck$](SetThrottleAck$.html "class in akka.remote.testkit") |  |
| [ThrottleMode$](ThrottleMode$.html "class in akka.remote.testkit") |  |
| [TokenBucket](TokenBucket.html "class in akka.remote.testkit") |  |
| [TokenBucket$](TokenBucket$.html "class in akka.remote.testkit") |  |
| [Unthrottled](Unthrottled.html "class in akka.remote.testkit") |  |
| [Unthrottled$](Unthrottled$.html "class in akka.remote.testkit") |  |

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/remote/testkit/Blackhole$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/testkit/Blackhole.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/testkit/Direction$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/testkit/Direction.Both$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/testkit/Direction.Receive$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/testkit/Direction.Send$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/testkit/Direction.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/testkit/ForceDisassociate$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/testkit/ForceDisassociate.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/testkit/ForceDisassociateAck$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/testkit/ForceDisassociateAck.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/testkit/MultiNodeConfig.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/testkit/MultiNodeSpec$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/testkit/MultiNodeSpec.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/testkit/MultiNodeSpecCallbacks.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/testkit/PerfFlamesSupport.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/testkit/SetThrottle$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/testkit/SetThrottle.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/testkit/SetThrottleAck$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/testkit/SetThrottleAck.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/testkit/ThrottleMode$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/testkit/ThrottleMode.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/testkit/TokenBucket$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/testkit/TokenBucket.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/testkit/Unthrottled$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/testkit/Unthrottled.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/remote/testkit/package-summary.html](https://doc.akka.io/japi/akka-core/2.10/akka/remote/testkit/package-summary.html)*