---
description: Akka 2.10.17 - akka.remote.routing.RemoteRouterConfig
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:38:15Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/remote/routing/RemoteRouterConfig.html
title: Akka 2.10.17 - akka.remote.routing.RemoteRouterConfig
---

# Akka 2.10.17 - akka.remote.routing.RemoteRouterConfig

> **Summary:** Akka 2.10.17 - akka.remote.routing.RemoteRouterConfig

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/remote/index.html "Permalink")  package [remote](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/remote/routing/index.html "Permalink")  package [routing](index.html)Definition Classes[remote](../index.html)
- RemoteRouterConfig
c[akka](../../index.html).[remote](../index.html).[routing](index.html)

# RemoteRouterConfig[**](../../../akka/remote/routing/RemoteRouterConfig.html "Permalink")

### 

#### final  case class RemoteRouterConfig(local: [Pool](../../routing/Pool.html), nodes: Iterable\[[Address](../../actor/Address.html)]) extends [Pool](../../routing/Pool.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable

[akka.routing.RouterConfig](../../routing/RouterConfig.html) implementation for remote deployment on defined
target nodes. Delegates other duties to the local [akka.routing.Pool](../../routing/Pool.html),
which makes it possible to mix this with the built\-in routers such as
[akka.routing.RoundRobinGroup](../../routing/RoundRobinGroup.html) or custom routers.

Annotations@SerialVersionUID() Source[RemoteRouterConfig.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-remote/src/main/scala/akka/remote/routing/RemoteRouterConfig.scala#L37)Linear Supertypes[Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product), [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals), [Pool](../../routing/Pool.html), [RouterConfig](../../routing/RouterConfig.html), [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. RemoteRouterConfig
2. Product
3. Equals
4. Pool
5. RouterConfig
6. Serializable
7. AnyRef
8. Any
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

1. [**](../../../akka/remote/routing/RemoteRouterConfig.html#<init>(local:akka.routing.Pool,nodes:Array[akka.actor.Address]):akka.remote.routing.RemoteRouterConfig "Permalink")  new RemoteRouterConfig(local: [Pool](../../routing/Pool.html), nodes: [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[[Address](../../actor/Address.html)])
2. [**](../../../akka/remote/routing/RemoteRouterConfig.html#<init>(local:akka.routing.Pool,nodes:Iterable[akka.actor.Address]):akka.remote.routing.RemoteRouterConfig "Permalink")  new RemoteRouterConfig(local: [Pool](../../routing/Pool.html), nodes: [Iterable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Iterable.html#java.lang.Iterable)\[[Address](../../actor/Address.html)])
3. [**](../../../akka/remote/routing/RemoteRouterConfig.html#<init>(local:akka.routing.Pool,nodes:Iterable[akka.actor.Address]):akka.remote.routing.RemoteRouterConfig "Permalink")  new RemoteRouterConfig(local: [Pool](../../routing/Pool.html), nodes: Iterable\[[Address](../../actor/Address.html)])
### Value Members

1. [**](../../../akka/remote/routing/RemoteRouterConfig.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/remote/routing/RemoteRouterConfig.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/remote/routing/RemoteRouterConfig.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from RemoteRouterConfig toany2stringadd\[RemoteRouterConfig] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../akka/remote/routing/RemoteRouterConfig.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (RemoteRouterConfig, B)ImplicitThis member is added by an implicit conversion from RemoteRouterConfig toArrowAssoc\[RemoteRouterConfig] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../akka/remote/routing/RemoteRouterConfig.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../akka/remote/routing/RemoteRouterConfig.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../akka/remote/routing/RemoteRouterConfig.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../akka/remote/routing/RemoteRouterConfig.html#createRouter(system:akka.actor.ActorSystem):akka.routing.Router "Permalink")  def createRouter(system: [ActorSystem](../../actor/ActorSystem.html)): [Router](../../routing/Router.html)Create the actual router, responsible for routing messages to routees.

Create the actual router, responsible for routing messages to routees.

systemthe ActorSystem this router belongs to

Definition ClassesRemoteRouterConfig → [RouterConfig](../../routing/RouterConfig.html)
9. [**](../../../akka/remote/routing/RemoteRouterConfig.html#createRouterActor():akka.routing.RouterActor "Permalink")  def createRouterActor(): RouterActorINTERNAL API

INTERNAL API

Definition ClassesRemoteRouterConfig → [Pool](../../routing/Pool.html) → [RouterConfig](../../routing/RouterConfig.html)
10. [**](../../../akka/remote/routing/RemoteRouterConfig.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (RemoteRouterConfig) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): RemoteRouterConfigImplicitThis member is added by an implicit conversion from RemoteRouterConfig toEnsuring\[RemoteRouterConfig] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../akka/remote/routing/RemoteRouterConfig.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (RemoteRouterConfig) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): RemoteRouterConfigImplicitThis member is added by an implicit conversion from RemoteRouterConfig toEnsuring\[RemoteRouterConfig] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../akka/remote/routing/RemoteRouterConfig.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): RemoteRouterConfigImplicitThis member is added by an implicit conversion from RemoteRouterConfig toEnsuring\[RemoteRouterConfig] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../../akka/remote/routing/RemoteRouterConfig.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): RemoteRouterConfigImplicitThis member is added by an implicit conversion from RemoteRouterConfig toEnsuring\[RemoteRouterConfig] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
14. [**](../../../akka/remote/routing/RemoteRouterConfig.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
15. [**](../../../akka/remote/routing/RemoteRouterConfig.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../akka/remote/routing/RemoteRouterConfig.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
17. [**](../../../akka/remote/routing/RemoteRouterConfig.html#isManagementMessage(msg:Any):Boolean "Permalink")  def isManagementMessage(msg: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Is the message handled by the router head actor or the
[\#routingLogicController](#routingLogicController(routingLogic:akka.routing.RoutingLogic):Option[akka.actor.Props]) actor.

Is the message handled by the router head actor or the
[\#routingLogicController](#routingLogicController(routingLogic:akka.routing.RoutingLogic):Option[akka.actor.Props]) actor.

Definition Classes[RouterConfig](../../routing/RouterConfig.html)
18. [**](../../../akka/remote/routing/RemoteRouterConfig.html#local:akka.routing.Pool "Permalink")  val local: [Pool](../../routing/Pool.html)
19. [**](../../../akka/remote/routing/RemoteRouterConfig.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
20. [**](../../../akka/remote/routing/RemoteRouterConfig.html#newRoutee(routeeProps:akka.actor.Props,context:akka.actor.ActorContext):akka.routing.Routee "Permalink")  def newRoutee(routeeProps: [Props](../../actor/Props.html), context: [ActorContext](../../actor/ActorContext.html)): [Routee](../../routing/Routee.html)INTERNAL API

INTERNAL API

Definition ClassesRemoteRouterConfig → [Pool](../../routing/Pool.html)
21. [**](../../../akka/remote/routing/RemoteRouterConfig.html#nodes:Iterable[akka.actor.Address] "Permalink")  val nodes: Iterable\[[Address](../../actor/Address.html)]
22. [**](../../../akka/remote/routing/RemoteRouterConfig.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
23. [**](../../../akka/remote/routing/RemoteRouterConfig.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
24. [**](../../../akka/remote/routing/RemoteRouterConfig.html#nrOfInstances(sys:akka.actor.ActorSystem):Int "Permalink")  def nrOfInstances(sys: [ActorSystem](../../actor/ActorSystem.html)): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Initial number of routee instances

Initial number of routee instances

Definition ClassesRemoteRouterConfig → [Pool](../../routing/Pool.html)
25. [**](../../../akka/remote/routing/RemoteRouterConfig.html#productElementNames:Iterator[String] "Permalink")  def productElementNames: Iterator\[String]Definition ClassesProduct
26. [**](../../../akka/remote/routing/RemoteRouterConfig.html#props(routeeProps:akka.actor.Props):akka.actor.Props "Permalink")  def props(routeeProps: [Props](../../actor/Props.html)): [Props](../../actor/Props.html)[akka.actor.Props](../../actor/Props.html) for a pool router based on the settings defined by
this instance and the supplied [akka.actor.Props](../../actor/Props.html) for the routees created by the
router.

[akka.actor.Props](../../actor/Props.html) for a pool router based on the settings defined by
this instance and the supplied [akka.actor.Props](../../actor/Props.html) for the routees created by the
router.

Definition Classes[Pool](../../routing/Pool.html)
27. [**](../../../akka/remote/routing/RemoteRouterConfig.html#resizer:Option[akka.routing.Resizer] "Permalink")  def resizer: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Resizer](../../routing/Resizer.html)]Pool with dynamically resizable number of routees return the [akka.routing.Resizer](../../routing/Resizer.html)
to use.

Pool with dynamically resizable number of routees return the [akka.routing.Resizer](../../routing/Resizer.html)
to use. The resizer is invoked once when the router is created, before any messages can
be sent to it. Resize is also triggered when messages are sent to the routees, and the
resizer is invoked asynchronously, i.e. not necessarily before the message has been sent.

Definition ClassesRemoteRouterConfig → [Pool](../../routing/Pool.html)
28. [**](../../../akka/remote/routing/RemoteRouterConfig.html#routerDispatcher:String "Permalink")  def routerDispatcher: StringDispatcher ID to use for running the “head” actor, which handles
supervision, death watch and router management messages

Dispatcher ID to use for running the “head” actor, which handles
supervision, death watch and router management messages

Definition ClassesRemoteRouterConfig → [RouterConfig](../../routing/RouterConfig.html)
29. [**](../../../akka/remote/routing/RemoteRouterConfig.html#routingLogicController(routingLogic:akka.routing.RoutingLogic):Option[akka.actor.Props] "Permalink")  def routingLogicController(routingLogic: [RoutingLogic](../../routing/RoutingLogic.html)): [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Props](../../actor/Props.html)]Possibility to define an actor for controlling the routing
logic from external stimuli (e.g.

Possibility to define an actor for controlling the routing
logic from external stimuli (e.g. monitoring metrics).
This actor will be a child of the router "head" actor.
Management messages not handled by the "head" actor are
delegated to this controller actor.

Definition Classes[RouterConfig](../../routing/RouterConfig.html)
30. [**](../../../akka/remote/routing/RemoteRouterConfig.html#stopRouterWhenAllRouteesRemoved:Boolean "Permalink")  def stopRouterWhenAllRouteesRemoved: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition Classes[Pool](../../routing/Pool.html) → [RouterConfig](../../routing/RouterConfig.html)
31. [**](../../../akka/remote/routing/RemoteRouterConfig.html#supervisorStrategy:akka.actor.SupervisorStrategy "Permalink")  def supervisorStrategy: [SupervisorStrategy](../../actor/SupervisorStrategy.html)SupervisorStrategy for the head actor, i.e.

SupervisorStrategy for the head actor, i.e. for supervising the routees of the pool.

Definition ClassesRemoteRouterConfig → [Pool](../../routing/Pool.html)
32. [**](../../../akka/remote/routing/RemoteRouterConfig.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
33. [**](../../../akka/remote/routing/RemoteRouterConfig.html#usePoolDispatcher:Boolean "Permalink")  def usePoolDispatcher: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Use a dedicated dispatcher for the routees of the pool.

Use a dedicated dispatcher for the routees of the pool.
The dispatcher is defined in 'pool\-dispatcher' configuration property in the
deployment section of the router.

Definition Classes[Pool](../../routing/Pool.html)
34. [**](../../../akka/remote/routing/RemoteRouterConfig.html#verifyConfig(path:akka.actor.ActorPath):Unit "Permalink")  def verifyConfig(path: [ActorPath](../../actor/ActorPath.html)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Check that everything is there which is needed.

Check that everything is there which is needed. Called in constructor of RoutedActorRef to fail early.

Definition Classes[RouterConfig](../../routing/RouterConfig.html)
35. [**](../../../akka/remote/routing/RemoteRouterConfig.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
36. [**](../../../akka/remote/routing/RemoteRouterConfig.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
37. [**](../../../akka/remote/routing/RemoteRouterConfig.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
38. [**](../../../akka/remote/routing/RemoteRouterConfig.html#withFallback(other:akka.routing.RouterConfig):akka.routing.RouterConfig "Permalink")  def withFallback(other: [RouterConfig](../../routing/RouterConfig.html)): [RouterConfig](../../routing/RouterConfig.html)Overridable merge strategy, by default completely prefers `this` (i.e.

Overridable merge strategy, by default completely prefers `this` (i.e. no merge).

Definition ClassesRemoteRouterConfig → [RouterConfig](../../routing/RouterConfig.html)
### Deprecated Value Members

1. [**](../../../akka/remote/routing/RemoteRouterConfig.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../akka/remote/routing/RemoteRouterConfig.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from RemoteRouterConfig toStringFormat\[RemoteRouterConfig] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../akka/remote/routing/RemoteRouterConfig.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (RemoteRouterConfig, B)ImplicitThis member is added by an implicit conversion from RemoteRouterConfig toArrowAssoc\[RemoteRouterConfig] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product)

### Inherited from [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals)

### Inherited from [Pool](../../routing/Pool.html)

### Inherited from [RouterConfig](../../routing/RouterConfig.html)

### Inherited from [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromRemoteRouterConfig to any2stringadd\[RemoteRouterConfig]

### Inherited by implicit conversion StringFormat fromRemoteRouterConfig to StringFormat\[RemoteRouterConfig]

### Inherited by implicit conversion Ensuring fromRemoteRouterConfig to Ensuring\[RemoteRouterConfig]

### Inherited by implicit conversion ArrowAssoc fromRemoteRouterConfig to ArrowAssoc\[RemoteRouterConfig]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/actor/ActorContext.html
- https://doc.akka.io/api/akka/current/akka/actor/ActorPath.html
- https://doc.akka.io/api/akka/current/akka/actor/ActorSystem.html
- https://doc.akka.io/api/akka/current/akka/actor/Address.html
- https://doc.akka.io/api/akka/current/akka/actor/Props.html
- https://doc.akka.io/api/akka/current/akka/actor/SupervisorStrategy.html
- https://doc.akka.io/api/akka/current/akka/index.html
- https://doc.akka.io/api/akka/current/akka/remote/index.html
- https://doc.akka.io/api/akka/current/akka/remote/routing/RemoteRouterConfig.html
- https://doc.akka.io/api/akka/current/akka/remote/routing/index.html
- https://doc.akka.io/api/akka/current/akka/routing/Pool.html
- https://doc.akka.io/api/akka/current/akka/routing/Resizer.html
- https://doc.akka.io/api/akka/current/akka/routing/RoundRobinGroup.html
- https://doc.akka.io/api/akka/current/akka/routing/Routee.html
- https://doc.akka.io/api/akka/current/akka/routing/Router.html
- https://doc.akka.io/api/akka/current/akka/routing/RouterConfig.html
- https://doc.akka.io/api/akka/current/akka/routing/RoutingLogic.html
- https://doc.akka.io/api/akka/current/index.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/remote/routing/RemoteRouterConfig.html](https://doc.akka.io/api/akka/current/akka/remote/routing/RemoteRouterConfig.html)*