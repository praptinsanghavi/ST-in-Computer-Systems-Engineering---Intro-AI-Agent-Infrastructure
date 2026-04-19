---
description: Akka 2.10.17 - akka.actor.typed.ActorTags
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:32:57Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/actor/typed/ActorTags.html
title: Akka 2.10.17 - akka.actor.typed.ActorTags
---

# Akka 2.10.17 - akka.actor.typed.ActorTags

> **Summary:** Akka 2.10.17 - akka.actor.typed.ActorTags

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/actor/index.html "Permalink")  package [actor](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/actor/typed/index.html "Permalink")  package [typed](index.html)Definition Classes[actor](../index.html)
- [**](../../../akka/actor/typed/delivery/index.html "Permalink")  package [delivery](delivery/index.html)Definition Classes[typed](index.html)
- [**](../../../akka/actor/typed/eventstream/index.html "Permalink")  package [eventstream](eventstream/index.html)Definition Classes[typed](index.html)
- [**](../../../akka/actor/typed/internal/index.html "Permalink")  package [internal](internal/index.html)Definition Classes[typed](index.html)
- [**](../../../akka/actor/typed/javadsl/index.html "Permalink")  package [javadsl](javadsl/index.html)Definition Classes[typed](index.html)
- [**](../../../akka/actor/typed/pubsub/index.html "Permalink")  package [pubsub](pubsub/index.html)Definition Classes[typed](index.html)
- [**](../../../akka/actor/typed/receptionist/index.html "Permalink")  package [receptionist](receptionist/index.html)Definition Classes[typed](index.html)
- [**](../../../akka/actor/typed/scaladsl/index.html "Permalink")  package [scaladsl](scaladsl/index.html)Definition Classes[typed](index.html)
- [AbstractExtensionSetup](AbstractExtensionSetup.html "Scala 2.11 API: Each extension typically provide a concrete ExtensionSetup that can be used in akka.actor.setup.ActorSystemSetup when starting the ActorSystem to replace the default implementation of the extension.")
- [ActorRef](ActorRef.html "An ActorRef is the identity or address of an Actor instance.")
- [ActorRefResolver](ActorRefResolver.html "Serialization and deserialization of ActorRef.")
- [ActorRefResolverSetup](ActorRefResolverSetup.html "Can be used in akka.actor.setup.ActorSystemSetup when starting the ActorSystem to replace the default implementation of the ActorRefResolver extension.")
- [ActorSystem](ActorSystem.html "An ActorSystem is home to a hierarchy of Actors.")
- ActorTags
- [BackoffSupervisorStrategy](BackoffSupervisorStrategy.html "Not for user extension")
- [Behavior](Behavior.html "The behavior of an actor defines how it reacts to the messages that it receives.")
- [BehaviorInterceptor](BehaviorInterceptor.html "A behavior interceptor allows for intercepting message and signal reception and perform arbitrary logic - transform, filter, send to a side channel etc.")
- [BehaviorSignalInterceptor](BehaviorSignalInterceptor.html "A behavior interceptor allows for intercepting signals reception and perform arbitrary logic - transform, filter, send to a side channel etc.")
- [ChildFailed](ChildFailed.html "Child has failed due an uncaught exception")
- [DeathPactException](DeathPactException.html "Exception that an actor fails with if it does not handle a Terminated message.")
- [DispatcherSelector](DispatcherSelector.html "Not for user extension.")
- [Dispatchers](Dispatchers.html "An ActorSystem looks up all its thread pools via a Dispatchers instance.")
- [ExtensibleBehavior](ExtensibleBehavior.html "Extension point for implementing custom behaviors in addition to the existing set of behaviors available through the DSLs in akka.actor.typed.scaladsl.Behaviors and akka.actor.typed.javadsl.Behaviors")
- [Extension](Extension.html "Marker trait/interface for extensions.")
- [ExtensionId](ExtensionId.html "Identifier and factory for an extension.")
- [ExtensionSetup](ExtensionSetup.html "Each extension typically provide a concrete ExtensionSetup that can be used in akka.actor.setup.ActorSystemSetup when starting the ActorSystem to replace the default implementation of the extension.")
- [Extensions](Extensions.html "API for registering and looking up extensions.")
- [LogOptions](LogOptions.html "Logging options when using Behaviors.logMessages.")
- [MailboxSelector](MailboxSelector.html "Not for user extension.")
- [MessageAdaptionFailure](MessageAdaptionFailure.html "Signal passed to the actor when a message adapter has thrown an exception adapting an incoming message.")
- [PostStop](PostStop.html "Lifecycle signal that is fired after this actor and all its child actors (transitively) have terminated.")
- [PreRestart](PreRestart.html "Lifecycle signal that is fired upon restart of the Actor before replacing the behavior with the fresh one (i.e.")
- [Props](Props.html "Data structure for describing an actor’s props details like which executor to run it on.")
- [RecipientRef](RecipientRef.html "FIXME doc - not serializable - not watchable")
- [RestartSupervisorStrategy](RestartSupervisorStrategy.html "Not for user extension")
- [Scheduler](Scheduler.html "The ActorSystem facility for scheduling tasks.")
- [Settings](Settings.html "The configuration settings that were parsed from the config by an ActorSystem.")
- [Signal](Signal.html "System signals are notifications that are generated by the system and delivered to the Actor behavior in a reliable fashion (i.e.")
- [SpawnProtocol](SpawnProtocol$.html "A message protocol for actors that support spawning a child actor when receiving a SpawnProtocol#Spawn message and sending back the ActorRef of the child actor.")
- [SupervisorStrategy](SupervisorStrategy.html "Not for user extension")
- [Terminated](Terminated.html "Lifecycle signal that is fired when an Actor that was watched has terminated.")
- [TypedActorContext](TypedActorContext.html "This trait is not meant to be extended by user code.")
[c](ActorTags$.html "See companion object")[akka](../../index.html).[actor](../index.html).[typed](index.html)

# [ActorTags](ActorTags$.html "See companion object")[**](../../../akka/actor/typed/ActorTags.html "Permalink")

### Companion [object ActorTags](ActorTags$.html "See companion object")

#### abstract  class ActorTags extends [Props](Props.html)

Actor tags are used to logically group actors. The tags are included in logging as markers
Especially useful for logging from functional style actors and since those may not have a clear logger class.

Not for user extension.

Annotations@[DoNotInherit](../../annotation/DoNotInherit.html)() Source[Props.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor-typed/src/main/scala/akka/actor/typed/Props.scala#L230)Linear Supertypes[Props](Props.html), [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable), [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product), [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. ActorTags
2. Props
3. Serializable
4. Product
5. Equals
6. AnyRef
7. Any
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

1. [**](../../../akka/actor/typed/ActorTags.html#<init>():akka.actor.typed.ActorTags "Permalink")  new ActorTags()
### Abstract Value Members

1. [**](../../../akka/actor/typed/ActorTags.html#canEqual(that:Any):Boolean "Permalink") abstract  def canEqual(that: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesEquals
2. [**](../../../akka/actor/typed/ActorTags.html#productArity:Int "Permalink") abstract  def productArity: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesProduct
3. [**](../../../akka/actor/typed/ActorTags.html#productElement(n:Int):Any "Permalink") abstract  def productElement(n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Definition ClassesProduct
4. [**](../../../akka/actor/typed/ActorTags.html#tags:Set[String] "Permalink") abstract  def tags: Set\[String]Scala API: one or more tags defined for the actor
### Concrete Value Members

1. [**](../../../akka/actor/typed/ActorTags.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/actor/typed/ActorTags.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/actor/typed/ActorTags.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from ActorTags toany2stringadd\[ActorTags] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../akka/actor/typed/ActorTags.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (ActorTags, B)ImplicitThis member is added by an implicit conversion from ActorTags toArrowAssoc\[ActorTags] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../akka/actor/typed/ActorTags.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../akka/actor/typed/ActorTags.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../akka/actor/typed/ActorTags.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../akka/actor/typed/ActorTags.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (ActorTags) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ActorTagsImplicitThis member is added by an implicit conversion from ActorTags toEnsuring\[ActorTags] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../../akka/actor/typed/ActorTags.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (ActorTags) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ActorTagsImplicitThis member is added by an implicit conversion from ActorTags toEnsuring\[ActorTags] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../akka/actor/typed/ActorTags.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ActorTagsImplicitThis member is added by an implicit conversion from ActorTags toEnsuring\[ActorTags] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../akka/actor/typed/ActorTags.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ActorTagsImplicitThis member is added by an implicit conversion from ActorTags toEnsuring\[ActorTags] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../akka/actor/typed/ActorTags.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../akka/actor/typed/ActorTags.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
14. [**](../../../akka/actor/typed/ActorTags.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../akka/actor/typed/ActorTags.html#getTags():java.util.Set[String] "Permalink")  def getTags(): [Set](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Set.html#java.util.Set)\[String]Java API: one or more tags defined for the actor
16. [**](../../../akka/actor/typed/ActorTags.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
17. [**](../../../akka/actor/typed/ActorTags.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
18. [**](../../../akka/actor/typed/ActorTags.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
19. [**](../../../akka/actor/typed/ActorTags.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../akka/actor/typed/ActorTags.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
21. [**](../../../akka/actor/typed/ActorTags.html#productElementName(n:Int):String "Permalink")  def productElementName(n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): StringDefinition ClassesProduct
22. [**](../../../akka/actor/typed/ActorTags.html#productElementNames:Iterator[String] "Permalink")  def productElementNames: Iterator\[String]Definition ClassesProduct
23. [**](../../../akka/actor/typed/ActorTags.html#productIterator:Iterator[Any] "Permalink")  def productIterator: Iterator\[[Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)]Definition ClassesProduct
24. [**](../../../akka/actor/typed/ActorTags.html#productPrefix:String "Permalink")  def productPrefix: StringDefinition ClassesProduct
25. [**](../../../akka/actor/typed/ActorTags.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
26. [**](../../../akka/actor/typed/ActorTags.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
27. [**](../../../akka/actor/typed/ActorTags.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
28. [**](../../../akka/actor/typed/ActorTags.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
29. [**](../../../akka/actor/typed/ActorTags.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
30. [**](../../../akka/actor/typed/ActorTags.html#withDispatcherDefault:akka.actor.typed.Props "Permalink")  def withDispatcherDefault: [Props](Props.html)Prepend a selection of the [ActorSystem](ActorSystem.html) default executor to this Props.

Prepend a selection of the [ActorSystem](ActorSystem.html) default executor to this Props.

Definition Classes[Props](Props.html)
31. [**](../../../akka/actor/typed/ActorTags.html#withDispatcherFromConfig(path:String):akka.actor.typed.Props "Permalink")  def withDispatcherFromConfig(path: String): [Props](Props.html)Prepend a selection of the executor found at the given Config path to this Props.

Prepend a selection of the executor found at the given Config path to this Props.
The path is relative to the configuration root of the [ActorSystem](ActorSystem.html) that looks up the
executor.

Definition Classes[Props](Props.html)
32. [**](../../../akka/actor/typed/ActorTags.html#withDispatcherSameAsParent:akka.actor.typed.Props "Permalink")  def withDispatcherSameAsParent: [Props](Props.html)Prepend a selection of the same executor as the parent actor to this Props.

Prepend a selection of the same executor as the parent actor to this Props.

Definition Classes[Props](Props.html)
33. [**](../../../akka/actor/typed/ActorTags.html#withMailboxFromConfig(path:String):akka.actor.typed.Props "Permalink")  def withMailboxFromConfig(path: String): [Props](Props.html)Prepend a selection of the mailbox found at the given Config path to this Props.

Prepend a selection of the mailbox found at the given Config path to this Props.
The path is relative to the configuration root of the [ActorSystem](ActorSystem.html) that looks up the
mailbox.

Definition Classes[Props](Props.html)
### Deprecated Value Members

1. [**](../../../akka/actor/typed/ActorTags.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../akka/actor/typed/ActorTags.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from ActorTags toStringFormat\[ActorTags] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../akka/actor/typed/ActorTags.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (ActorTags, B)ImplicitThis member is added by an implicit conversion from ActorTags toArrowAssoc\[ActorTags] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [Props](Props.html)

### Inherited from [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

### Inherited from [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product)

### Inherited from [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromActorTags to any2stringadd\[ActorTags]

### Inherited by implicit conversion StringFormat fromActorTags to StringFormat\[ActorTags]

### Inherited by implicit conversion Ensuring fromActorTags to Ensuring\[ActorTags]

### Inherited by implicit conversion ArrowAssoc fromActorTags to ArrowAssoc\[ActorTags]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10/akka/actor/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/AbstractExtensionSetup.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/ActorRef$.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/ActorRef.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/ActorRefResolver$.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/ActorRefResolver.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/ActorRefResolverSetup$.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/ActorRefResolverSetup.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/ActorSystem$.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/ActorSystem.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/ActorTags$.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/ActorTags.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/BackoffSupervisorStrategy.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/Behavior$.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/Behavior.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/BehaviorInterceptor$.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/BehaviorInterceptor.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/BehaviorSignalInterceptor.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/ChildFailed$.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/ChildFailed.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/DeathPactException.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/DispatcherSelector$.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/DispatcherSelector.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/Dispatchers$.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/Dispatchers.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/ExtensibleBehavior.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/Extension.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/ExtensionId.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/ExtensionSetup.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/Extensions.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/LogOptions$.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/LogOptions.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/MailboxSelector$.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/MailboxSelector.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/MessageAdaptionFailure.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/PostStop$.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/PostStop.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/PreRestart$.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/PreRestart.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/Props$.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/Props.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/RecipientRef$.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/RecipientRef.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/RestartSupervisorStrategy.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/Scheduler.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/Settings.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/Signal.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/SpawnProtocol$.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/SupervisorStrategy$.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/SupervisorStrategy.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/ActorTags.html](https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/ActorTags.html)*