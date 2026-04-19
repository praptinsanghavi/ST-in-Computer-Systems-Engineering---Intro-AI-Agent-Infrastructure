---
description: Akka 2.10.17 - akka.persistence.typed.state.javadsl.CommandHandlerBuilder
knowledge_type: official_documentation
scraped_at: '2026-04-05T22:05:23Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/persistence/typed/state/javadsl/CommandHandlerBuilder$.html
title: Akka 2.10.17 - akka.persistence.typed.state.javadsl.CommandHandlerBuilder
---

# Akka 2.10.17 - akka.persistence.typed.state.javadsl.CommandHandlerBuilder

> **Summary:** Akka 2.10.17 - akka.persistence.typed.state.javadsl.CommandHandlerBuilder

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../../../index.html "Permalink")  package [root](../../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/index.html "Permalink")  package [akka](../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/persistence/index.html "Permalink")  package [persistence](../../../index.html)Definition Classes[akka](../../../../index.html)
- [**](../../../../../akka/persistence/typed/index.html "Permalink")  package [typed](../../index.html)Definition Classes[persistence](../../../index.html)
- [**](../../../../../akka/persistence/typed/state/index.html "Permalink")  package [state](../index.html)Definition Classes[typed](../../index.html)
- [**](../../../../../akka/persistence/typed/state/javadsl/index.html "Permalink")  package [javadsl](index.html)Definition Classes[state](../index.html)
- [ChangeEventHandler](ChangeEventHandler.html "API May Change: Implement this interface and use it in DurableStateBehavior#withChangeEventHandler to store additional change event when the state is updated.")
- [CommandHandler](CommandHandler.html "FunctionalInterface for reacting on commands")
- [CommandHandlerBuilder](CommandHandlerBuilder.html)
- [CommandHandlerBuilderByState](CommandHandlerBuilderByState.html)
- [CommandHandlerWithReply](CommandHandlerWithReply.html "FunctionalInterface for reacting on commands")
- [CommandHandlerWithReplyBuilder](CommandHandlerWithReplyBuilder.html)
- [CommandHandlerWithReplyBuilderByState](CommandHandlerWithReplyBuilderByState.html)
- [DurableStateBehavior](DurableStateBehavior.html "A Behavior for a persistent actor with durable storage of its state.")
- [DurableStateBehaviorWithEnforcedReplies](DurableStateBehaviorWithEnforcedReplies.html "A DurableStateBehavior that is enforcing that replies to commands are not forgotten.")
- [DurableStateOnCommandBehavior](DurableStateOnCommandBehavior.html "A Behavior for a persistent actor with durable storage of its state for projects built with Java 17 or newer where message handling can be done * using switch pattern match.")
- [DurableStateOnCommandWithReplyBehavior](DurableStateOnCommandWithReplyBehavior.html "A Behavior for a persistent actor with durable storage of its state for projects built with Java 17 or newer where message handling can be done * using switch pattern match.")
- [Effect](Effect.html "A command handler returns an Effect directive that defines what state to persist.")
- [EffectBuilder](EffectBuilder.html "A command handler returns an Effect directive that defines what state to persist.")
- [EffectFactories](EffectFactories.html "Factory methods for creating Effect directives - how a DurableStateBehavior reacts on a command.")
- [ReplyEffect](ReplyEffect.html "DurableStateBehaviorWithEnforcedReplies can be used to enforce that replies are not forgotten.")
- [SignalHandler](SignalHandler.html)
- [SignalHandlerBuilder](SignalHandlerBuilder.html "Mutable builder for handling signals in DurableStateBehavior")
[o](CommandHandlerBuilder.html "See companion class")[akka](../../../../index.html).[persistence](../../../index.html).[typed](../../index.html).[state](../index.html).[javadsl](index.html)

# [CommandHandlerBuilder](CommandHandlerBuilder.html "See companion class")[**](../../../../../akka/persistence/typed/state/javadsl/CommandHandlerBuilder$.html "Permalink")

### Companion [class CommandHandlerBuilder](CommandHandlerBuilder.html "See companion class")

#### object CommandHandlerBuilder

Source[CommandHandler.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-persistence-typed/src/main/scala/akka/persistence/typed/state/javadsl/CommandHandler.scala#L29)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. CommandHandlerBuilder
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Value Members

1. [**](../../../../../akka/persistence/typed/state/javadsl/CommandHandlerBuilder$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../../akka/persistence/typed/state/javadsl/CommandHandlerBuilder$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../../akka/persistence/typed/state/javadsl/CommandHandlerBuilder$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../../../akka/persistence/typed/state/javadsl/CommandHandlerBuilder$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
5. [**](../../../../../akka/persistence/typed/state/javadsl/CommandHandlerBuilder$.html#builder[Command,State]():akka.persistence.typed.state.javadsl.CommandHandlerBuilder[Command,State] "Permalink")  def builder\[Command, State](): [CommandHandlerBuilder](CommandHandlerBuilder.html)\[Command, State]
6. [**](../../../../../akka/persistence/typed/state/javadsl/CommandHandlerBuilder$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
7. [**](../../../../../akka/persistence/typed/state/javadsl/CommandHandlerBuilder$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
8. [**](../../../../../akka/persistence/typed/state/javadsl/CommandHandlerBuilder$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
9. [**](../../../../../akka/persistence/typed/state/javadsl/CommandHandlerBuilder$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
10. [**](../../../../../akka/persistence/typed/state/javadsl/CommandHandlerBuilder$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
11. [**](../../../../../akka/persistence/typed/state/javadsl/CommandHandlerBuilder$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
12. [**](../../../../../akka/persistence/typed/state/javadsl/CommandHandlerBuilder$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../../../akka/persistence/typed/state/javadsl/CommandHandlerBuilder$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
14. [**](../../../../../akka/persistence/typed/state/javadsl/CommandHandlerBuilder$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../../../akka/persistence/typed/state/javadsl/CommandHandlerBuilder$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
16. [**](../../../../../akka/persistence/typed/state/javadsl/CommandHandlerBuilder$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
17. [**](../../../../../akka/persistence/typed/state/javadsl/CommandHandlerBuilder$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
18. [**](../../../../../akka/persistence/typed/state/javadsl/CommandHandlerBuilder$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
19. [**](../../../../../akka/persistence/typed/state/javadsl/CommandHandlerBuilder$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../../akka/persistence/typed/state/javadsl/CommandHandlerBuilder$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/index.html
- https://doc.akka.io/api/akka/current/akka/persistence/index.html
- https://doc.akka.io/api/akka/current/akka/persistence/typed/index.html
- https://doc.akka.io/api/akka/current/akka/persistence/typed/state/index.html
- https://doc.akka.io/api/akka/current/akka/persistence/typed/state/javadsl/ChangeEventHandler.html
- https://doc.akka.io/api/akka/current/akka/persistence/typed/state/javadsl/CommandHandler.html
- https://doc.akka.io/api/akka/current/akka/persistence/typed/state/javadsl/CommandHandlerBuilder$.html
- https://doc.akka.io/api/akka/current/akka/persistence/typed/state/javadsl/CommandHandlerBuilder.html
- https://doc.akka.io/api/akka/current/akka/persistence/typed/state/javadsl/CommandHandlerBuilderByState$.html
- https://doc.akka.io/api/akka/current/akka/persistence/typed/state/javadsl/CommandHandlerBuilderByState.html
- https://doc.akka.io/api/akka/current/akka/persistence/typed/state/javadsl/CommandHandlerWithReply.html
- https://doc.akka.io/api/akka/current/akka/persistence/typed/state/javadsl/CommandHandlerWithReplyBuilder$.html
- https://doc.akka.io/api/akka/current/akka/persistence/typed/state/javadsl/CommandHandlerWithReplyBuilder.html
- https://doc.akka.io/api/akka/current/akka/persistence/typed/state/javadsl/CommandHandlerWithReplyBuilderByState$.html
- https://doc.akka.io/api/akka/current/akka/persistence/typed/state/javadsl/CommandHandlerWithReplyBuilderByState.html
- https://doc.akka.io/api/akka/current/akka/persistence/typed/state/javadsl/DurableStateBehavior.html
- https://doc.akka.io/api/akka/current/akka/persistence/typed/state/javadsl/DurableStateBehaviorWithEnforcedReplies.html
- https://doc.akka.io/api/akka/current/akka/persistence/typed/state/javadsl/DurableStateOnCommandBehavior.html
- https://doc.akka.io/api/akka/current/akka/persistence/typed/state/javadsl/DurableStateOnCommandWithReplyBehavior.html
- https://doc.akka.io/api/akka/current/akka/persistence/typed/state/javadsl/Effect.html
- https://doc.akka.io/api/akka/current/akka/persistence/typed/state/javadsl/EffectBuilder.html
- https://doc.akka.io/api/akka/current/akka/persistence/typed/state/javadsl/EffectFactories.html
- https://doc.akka.io/api/akka/current/akka/persistence/typed/state/javadsl/ReplyEffect.html
- https://doc.akka.io/api/akka/current/akka/persistence/typed/state/javadsl/SignalHandler$.html
- https://doc.akka.io/api/akka/current/akka/persistence/typed/state/javadsl/SignalHandler.html
- https://doc.akka.io/api/akka/current/akka/persistence/typed/state/javadsl/SignalHandlerBuilder$.html
- https://doc.akka.io/api/akka/current/akka/persistence/typed/state/javadsl/SignalHandlerBuilder.html
- https://doc.akka.io/api/akka/current/akka/persistence/typed/state/javadsl/index.html
- https://doc.akka.io/api/akka/current/index.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/persistence/typed/state/javadsl/CommandHandlerBuilder$.html](https://doc.akka.io/api/akka/current/akka/persistence/typed/state/javadsl/CommandHandlerBuilder$.html)*