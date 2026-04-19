---
description: Akka 2.10.17 - akka.remote.testkit.MultiNodeConfig
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:38:22Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/remote/testkit/MultiNodeConfig.html
title: Akka 2.10.17 - akka.remote.testkit.MultiNodeConfig
---

# Akka 2.10.17 - akka.remote.testkit.MultiNodeConfig

> **Summary:** Akka 2.10.17 - akka.remote.testkit.MultiNodeConfig

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/remote/index.html "Permalink")  package [remote](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/remote/testkit/index.html "Permalink")  package [testkit](index.html)Definition Classes[remote](../index.html)
- [Blackhole](Blackhole$.html)
- [Direction](Direction.html)
- [ForceDisassociate](ForceDisassociate.html "Management Command to force disassociation of an address.")
- [ForceDisassociateAck](ForceDisassociateAck$.html)
- MultiNodeConfig
- [MultiNodeSpec](MultiNodeSpec.html "Note: To be able to run tests with everything ignored or excluded by tags you must not use testconductor, or helper methods that use testconductor, from the constructor of your test class.")
- [MultiNodeSpecCallbacks](MultiNodeSpecCallbacks.html "Use this to hook MultiNodeSpec into your test framework lifecycle, either by having your test extend MultiNodeSpec and call these methods or by creating a trait that calls them and then mixing that trait with your test together with MultiNodeSpec.")
- [SetThrottle](SetThrottle.html)
- [SetThrottleAck](SetThrottleAck$.html)
- [ThrottleMode](ThrottleMode.html)
- [TokenBucket](TokenBucket.html)
- [Unthrottled](Unthrottled$.html)
c[akka](../../index.html).[remote](../index.html).[testkit](index.html)

# MultiNodeConfig[**](../../../akka/remote/testkit/MultiNodeConfig.html "Permalink")

### 

#### abstract  class MultiNodeConfig extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

Configure the role names and participants of the test, including configuration settings.

Source[MultiNodeSpec.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-multi-node-testkit/src/main/scala/akka/remote/testkit/MultiNodeSpec.scala#L36)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. MultiNodeConfig
2. AnyRef
3. Any
Implicitly  
1. by any2stringadd
2. by StringFormat
3. by Ensuring
4. by ArrowAssoc
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Instance Constructors

1. [**](../../../akka/remote/testkit/MultiNodeConfig.html#<init>():akka.remote.testkit.MultiNodeConfig "Permalink")  new MultiNodeConfig()
### Value Members

1. [**](../../../akka/remote/testkit/MultiNodeConfig.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/remote/testkit/MultiNodeConfig.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/remote/testkit/MultiNodeConfig.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from MultiNodeConfig toany2stringadd\[MultiNodeConfig] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../akka/remote/testkit/MultiNodeConfig.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (MultiNodeConfig, B)ImplicitThis member is added by an implicit conversion from MultiNodeConfig toArrowAssoc\[MultiNodeConfig] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../akka/remote/testkit/MultiNodeConfig.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../akka/remote/testkit/MultiNodeConfig.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../akka/remote/testkit/MultiNodeConfig.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../akka/remote/testkit/MultiNodeConfig.html#commonConfig(config:com.typesafe.config.Config):Unit "Permalink")  def commonConfig(config: Config): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Register a common base config for all test participants, if so desired.
9. [**](../../../akka/remote/testkit/MultiNodeConfig.html#debugConfig(on:Boolean):com.typesafe.config.Config "Permalink")  def debugConfig(on: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ConfigInclude for verbose debug logging

Include for verbose debug logging

onwhen `true` debug Config is returned, otherwise config with info logging
10. [**](../../../akka/remote/testkit/MultiNodeConfig.html#deployOn(role:akka.remote.testconductor.RoleName,deployment:String):Unit "Permalink")  def deployOn(role: [RoleName](../testconductor/RoleName.html), deployment: String): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)
11. [**](../../../akka/remote/testkit/MultiNodeConfig.html#deployOnAll(deployment:String):Unit "Permalink")  def deployOnAll(deployment: String): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)
12. [**](../../../akka/remote/testkit/MultiNodeConfig.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (MultiNodeConfig) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): MultiNodeConfigImplicitThis member is added by an implicit conversion from MultiNodeConfig toEnsuring\[MultiNodeConfig] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../../akka/remote/testkit/MultiNodeConfig.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (MultiNodeConfig) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): MultiNodeConfigImplicitThis member is added by an implicit conversion from MultiNodeConfig toEnsuring\[MultiNodeConfig] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
14. [**](../../../akka/remote/testkit/MultiNodeConfig.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): MultiNodeConfigImplicitThis member is added by an implicit conversion from MultiNodeConfig toEnsuring\[MultiNodeConfig] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
15. [**](../../../akka/remote/testkit/MultiNodeConfig.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): MultiNodeConfigImplicitThis member is added by an implicit conversion from MultiNodeConfig toEnsuring\[MultiNodeConfig] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
16. [**](../../../akka/remote/testkit/MultiNodeConfig.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
17. [**](../../../akka/remote/testkit/MultiNodeConfig.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
18. [**](../../../akka/remote/testkit/MultiNodeConfig.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../../akka/remote/testkit/MultiNodeConfig.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../akka/remote/testkit/MultiNodeConfig.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
21. [**](../../../akka/remote/testkit/MultiNodeConfig.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
22. [**](../../../akka/remote/testkit/MultiNodeConfig.html#nodeConfig(roles:akka.remote.testconductor.RoleName*)(configs:com.typesafe.config.Config*):Unit "Permalink")  def nodeConfig(roles: [RoleName](../testconductor/RoleName.html)\*)(configs: Config\*): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Register a config override for a specific participant.
23. [**](../../../akka/remote/testkit/MultiNodeConfig.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
24. [**](../../../akka/remote/testkit/MultiNodeConfig.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
25. [**](../../../akka/remote/testkit/MultiNodeConfig.html#role(name:String):akka.remote.testconductor.RoleName "Permalink")  def role(name: String): [RoleName](../testconductor/RoleName.html)Construct a RoleName and return it, to be used as an identifier in the
test.

Construct a RoleName and return it, to be used as an identifier in the
test. Registration of a role name creates a role which then needs to be
filled.
26. [**](../../../akka/remote/testkit/MultiNodeConfig.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
27. [**](../../../akka/remote/testkit/MultiNodeConfig.html#testTransport(on:Boolean):Unit "Permalink")  def testTransport(on: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)To be able to use `blackhole`, `passThrough`, and `throttle` you must
activate the failure injector and throttler transport adapters by
specifying `testTransport(on = true)` in your MultiNodeConfig.
28. [**](../../../akka/remote/testkit/MultiNodeConfig.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
29. [**](../../../akka/remote/testkit/MultiNodeConfig.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
30. [**](../../../akka/remote/testkit/MultiNodeConfig.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
31. [**](../../../akka/remote/testkit/MultiNodeConfig.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../akka/remote/testkit/MultiNodeConfig.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../akka/remote/testkit/MultiNodeConfig.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from MultiNodeConfig toStringFormat\[MultiNodeConfig] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../akka/remote/testkit/MultiNodeConfig.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (MultiNodeConfig, B)ImplicitThis member is added by an implicit conversion from MultiNodeConfig toArrowAssoc\[MultiNodeConfig] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromMultiNodeConfig to any2stringadd\[MultiNodeConfig]

### Inherited by implicit conversion StringFormat fromMultiNodeConfig to StringFormat\[MultiNodeConfig]

### Inherited by implicit conversion Ensuring fromMultiNodeConfig to Ensuring\[MultiNodeConfig]

### Inherited by implicit conversion ArrowAssoc fromMultiNodeConfig to ArrowAssoc\[MultiNodeConfig]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/index.html
- https://doc.akka.io/api/akka/current/akka/remote/index.html
- https://doc.akka.io/api/akka/current/akka/remote/testconductor/RoleName.html
- https://doc.akka.io/api/akka/current/akka/remote/testkit/Blackhole$.html
- https://doc.akka.io/api/akka/current/akka/remote/testkit/Direction$.html
- https://doc.akka.io/api/akka/current/akka/remote/testkit/Direction.html
- https://doc.akka.io/api/akka/current/akka/remote/testkit/ForceDisassociate.html
- https://doc.akka.io/api/akka/current/akka/remote/testkit/ForceDisassociateAck$.html
- https://doc.akka.io/api/akka/current/akka/remote/testkit/MultiNodeConfig.html
- https://doc.akka.io/api/akka/current/akka/remote/testkit/MultiNodeSpec$.html
- https://doc.akka.io/api/akka/current/akka/remote/testkit/MultiNodeSpec.html
- https://doc.akka.io/api/akka/current/akka/remote/testkit/MultiNodeSpecCallbacks.html
- https://doc.akka.io/api/akka/current/akka/remote/testkit/SetThrottle.html
- https://doc.akka.io/api/akka/current/akka/remote/testkit/SetThrottleAck$.html
- https://doc.akka.io/api/akka/current/akka/remote/testkit/ThrottleMode$.html
- https://doc.akka.io/api/akka/current/akka/remote/testkit/ThrottleMode.html
- https://doc.akka.io/api/akka/current/akka/remote/testkit/TokenBucket.html
- https://doc.akka.io/api/akka/current/akka/remote/testkit/Unthrottled$.html
- https://doc.akka.io/api/akka/current/akka/remote/testkit/index.html
- https://doc.akka.io/api/akka/current/index.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/remote/testkit/MultiNodeConfig.html](https://doc.akka.io/api/akka/current/akka/remote/testkit/MultiNodeConfig.html)*