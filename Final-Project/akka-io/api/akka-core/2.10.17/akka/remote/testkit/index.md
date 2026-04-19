---
description: Akka 2.10.17 - akka.remote.testkit
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:21:00Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/remote/testkit/index.html
title: Akka 2.10.17 - akka.remote.testkit
---

# Akka 2.10.17 - akka.remote.testkit

> **Summary:** Akka 2.10.17 - akka.remote.testkit

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/remote/index.html "Permalink")  package [remote](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/remote/artery/index.html "Permalink")  package [artery](../artery/index.html)Definition Classes[remote](../index.html)
- [**](../../../akka/remote/routing/index.html "Permalink")  package [routing](../routing/index.html)Definition Classes[remote](../index.html)
- [**](../../../akka/remote/serialization/index.html "Permalink")  package [serialization](../serialization/index.html)Definition Classes[remote](../index.html)
- [**](../../../akka/remote/testconductor/index.html "Permalink")  package [testconductor](../testconductor/index.html)Definition Classes[remote](../index.html)
- [**](../../../akka/remote/testkit/index.html "Permalink")  package testkitDefinition Classes[remote](../index.html)
- [Blackhole](Blackhole$.html)
- [Direction](Direction.html)
- [ForceDisassociate](ForceDisassociate.html "Management Command to force disassociation of an address.")
- [ForceDisassociateAck](ForceDisassociateAck$.html)
- [MultiNodeConfig](MultiNodeConfig.html "Configure the role names and participants of the test, including configuration settings.")
- [MultiNodeSpec](MultiNodeSpec.html "Note: To be able to run tests with everything ignored or excluded by tags you must not use testconductor, or helper methods that use testconductor, from the constructor of your test class.")
- [MultiNodeSpecCallbacks](MultiNodeSpecCallbacks.html "Use this to hook MultiNodeSpec into your test framework lifecycle, either by having your test extend MultiNodeSpec and call these methods or by creating a trait that calls them and then mixing that trait with your test together with MultiNodeSpec.")
- [SetThrottle](SetThrottle.html)
- [SetThrottleAck](SetThrottleAck$.html)
- [ThrottleMode](ThrottleMode.html)
- [TokenBucket](TokenBucket.html)
- [Unthrottled](Unthrottled$.html)
p[akka](../../index.html).[remote](../index.html)

# testkit[**](../../../akka/remote/testkit/index.html "Permalink")

#### package testkit

Content Hierarchy****Ordering1. Alphabetic
Visibility1. Public
2. Protected
### Type Members

1. [**](../../../akka/remote/testkit/Direction.html "Permalink") sealed  trait [Direction](Direction.html) extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
2. [**](../../../akka/remote/testkit/ForceDisassociate.html "Permalink") final  case class [ForceDisassociate](ForceDisassociate.html "Management Command to force disassociation of an address.")(address: [Address](../../actor/Address.html)) extends [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableManagement Command to force disassociation of an address.

Management Command to force disassociation of an address.

Annotations@SerialVersionUID()
3. [**](../../../akka/remote/testkit/MultiNodeConfig.html "Permalink") abstract  class [MultiNodeConfig](MultiNodeConfig.html "Configure the role names and participants of the test, including configuration settings.") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Configure the role names and participants of the test, including configuration settings.
4. [**](../../../akka/remote/testkit/MultiNodeSpec.html "Permalink") abstract  class [MultiNodeSpec](MultiNodeSpec.html "Note: To be able to run tests with everything ignored or excluded by tags you must not use testconductor, or helper methods that use testconductor, from the constructor of your test class.") extends [TestKit](../../testkit/TestKit.html) with [MultiNodeSpecCallbacks](MultiNodeSpecCallbacks.html)Note: To be able to run tests with everything ignored or excluded by tags
you must not use `testconductor`, or helper methods that use `testconductor`,
from the constructor of your test class.

Note: To be able to run tests with everything ignored or excluded by tags
you must not use `testconductor`, or helper methods that use `testconductor`,
from the constructor of your test class. Otherwise the controller node might
be shutdown before other nodes have completed and you will see errors like:
`AskTimeoutException: sending to terminated ref breaks promises`. Using lazy
val is fine.
5. [**](../../../akka/remote/testkit/MultiNodeSpecCallbacks.html "Permalink")  trait [MultiNodeSpecCallbacks](MultiNodeSpecCallbacks.html "Use this to hook MultiNodeSpec into your test framework lifecycle, either by having your test extend MultiNodeSpec and call these methods or by creating a trait that calls them and then mixing that trait with your test together with MultiNodeSpec.") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Use this to hook MultiNodeSpec into your test framework lifecycle, either by having your test extend MultiNodeSpec
and call these methods or by creating a trait that calls them and then mixing that trait with your test together
with MultiNodeSpec.

Use this to hook MultiNodeSpec into your test framework lifecycle, either by having your test extend MultiNodeSpec
and call these methods or by creating a trait that calls them and then mixing that trait with your test together
with MultiNodeSpec.

Example trait for MultiNodeSpec with ScalaTest

```
trait STMultiNodeSpec extends MultiNodeSpecCallbacks with AnyWordSpecLike with Matchers with BeforeAndAfterAll {
  override def beforeAll() = multiNodeSpecBeforeAll()
  override def afterAll() = multiNodeSpecAfterAll()
}
```
6. [**](../../../akka/remote/testkit/SetThrottle.html "Permalink") final  case class [SetThrottle](SetThrottle.html)(address: [Address](../../actor/Address.html), direction: [Direction](Direction.html), mode: [ThrottleMode](ThrottleMode.html)) extends [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableAnnotations@SerialVersionUID()
7. [**](../../../akka/remote/testkit/ThrottleMode.html "Permalink") sealed  trait [ThrottleMode](ThrottleMode.html) extends [NoSerializationVerificationNeeded](../../actor/NoSerializationVerificationNeeded.html)
8. [**](../../../akka/remote/testkit/TokenBucket.html "Permalink") final  case class [TokenBucket](TokenBucket.html)(capacity: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), tokensPerSecond: [Double](https://www.scala-lang.org/api/2.13.17/scala/Double.html#scala.Double), nanoTimeOfLastSend: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), availableTokens: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)) extends [ThrottleMode](ThrottleMode.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableAnnotations@SerialVersionUID()
### Value Members

1. [**](../../../akka/remote/testkit/Blackhole$.html "Permalink")  case object [Blackhole](Blackhole$.html) extends [ThrottleMode](ThrottleMode.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableAnnotations@SerialVersionUID()
2. [**](../../../akka/remote/testkit/Direction$.html "Permalink")  object [Direction](Direction$.html)
3. [**](../../../akka/remote/testkit/ForceDisassociateAck$.html "Permalink")  case object [ForceDisassociateAck](ForceDisassociateAck$.html) extends [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableAnnotations@SerialVersionUID()
4. [**](../../../akka/remote/testkit/MultiNodeSpec$.html "Permalink")  object [MultiNodeSpec](MultiNodeSpec$.html)
5. [**](../../../akka/remote/testkit/SetThrottleAck$.html "Permalink")  case object [SetThrottleAck](SetThrottleAck$.html) extends [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableAnnotations@SerialVersionUID()
6. [**](../../../akka/remote/testkit/ThrottleMode$.html "Permalink")  object [ThrottleMode](ThrottleMode$.html)
7. [**](../../../akka/remote/testkit/Unthrottled$.html "Permalink")  case object [Unthrottled](Unthrottled$.html) extends [ThrottleMode](ThrottleMode.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableAnnotations@SerialVersionUID()
### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/Address.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/NoSerializationVerificationNeeded.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/remote/artery/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/remote/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/remote/routing/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/remote/serialization/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/remote/testconductor/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/remote/testkit/Blackhole$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/remote/testkit/Direction$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/remote/testkit/Direction.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/remote/testkit/ForceDisassociate.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/remote/testkit/ForceDisassociateAck$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/remote/testkit/MultiNodeConfig.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/remote/testkit/MultiNodeSpec$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/remote/testkit/MultiNodeSpec.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/remote/testkit/MultiNodeSpecCallbacks.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/remote/testkit/SetThrottle.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/remote/testkit/SetThrottleAck$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/remote/testkit/ThrottleMode$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/remote/testkit/ThrottleMode.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/remote/testkit/TokenBucket.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/remote/testkit/Unthrottled$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/remote/testkit/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/testkit/TestKit.html
- https://doc.akka.io/api/akka-core/2.10.17/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10.17/akka/remote/testkit/index.html](https://doc.akka.io/api/akka-core/2.10.17/akka/remote/testkit/index.html)*