---
description: Akka 2.10.17 - akka.actor.ActorSystem.Settings
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:46:31Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/actor/ActorSystem$$Settings.html
title: Akka 2.10.17 - akka.actor.ActorSystem.Settings
---

# Akka 2.10.17 - akka.actor.ActorSystem.Settings

> **Summary:** Akka 2.10.17 - akka.actor.ActorSystem.Settings

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../index.html "Permalink")  package [root](../../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/index.html "Permalink")  package [akka](../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/actor/index.html "Permalink")  package [actor](index.html)Definition Classes[akka](../index.html)
- [**](../../akka/actor/ActorSystem$.html "Permalink")  object [ActorSystem](ActorSystem$.html)Definition Classes[actor](index.html)
- Settings
c[akka](../index.html).[actor](index.html).[ActorSystem](ActorSystem$.html)

# Settings[**](../../akka/actor/ActorSystem$$Settings.html "Permalink")

### 

#### class Settings extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

Settings are the overall ActorSystem Settings which also provides a convenient access to the Config object.

For more detailed information about the different possible configuration options, look in the Akka Documentation under "Configuration"

Source[ActorSystem.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor/src/main/scala/akka/actor/ActorSystem.scala#L382)See also[The Typesafe Config Library API Documentation](https://lightbend.github.io/config/latest/api/index.html)

Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. Settings
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

1. [**](../../akka/actor/ActorSystem$$Settings.html#<init>(classLoader:ClassLoader,cfg:com.typesafe.config.Config,name:String):akka.actor.ActorSystem.Settings "Permalink")  new Settings(classLoader: [ClassLoader](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/ClassLoader.html#java.lang.ClassLoader), cfg: Config, name: String)
2. [**](../../akka/actor/ActorSystem$$Settings.html#<init>(classLoader:ClassLoader,cfg:com.typesafe.config.Config,name:String,setup:akka.actor.setup.ActorSystemSetup):akka.actor.ActorSystem.Settings "Permalink")  new Settings(classLoader: [ClassLoader](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/ClassLoader.html#java.lang.ClassLoader), cfg: Config, name: String, setup: [ActorSystemSetup](setup/ActorSystemSetup.html))
### Value Members

1. [**](../../akka/actor/ActorSystem$$Settings.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/actor/ActorSystem$$Settings.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/actor/ActorSystem$$Settings.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from Settings toany2stringadd\[Settings] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../akka/actor/ActorSystem$$Settings.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (Settings, B)ImplicitThis member is added by an implicit conversion from Settings toArrowAssoc\[Settings] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../akka/actor/ActorSystem$$Settings.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../akka/actor/ActorSystem$$Settings.html#AddLoggingReceive:Boolean "Permalink") final  val AddLoggingReceive: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)
7. [**](../../akka/actor/ActorSystem$$Settings.html#AllowJavaSerialization:Boolean "Permalink") final  val AllowJavaSerialization: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)
8. [**](../../akka/actor/ActorSystem$$Settings.html#ConfigVersion:String "Permalink") final  val ConfigVersion: String
9. [**](../../akka/actor/ActorSystem$$Settings.html#CoordinatedShutdownRunByActorSystemTerminate:Boolean "Permalink") final  val CoordinatedShutdownRunByActorSystemTerminate: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)
10. [**](../../akka/actor/ActorSystem$$Settings.html#CoordinatedShutdownTerminateActorSystem:Boolean "Permalink") final  val CoordinatedShutdownTerminateActorSystem: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)
11. [**](../../akka/actor/ActorSystem$$Settings.html#CreationTimeout:akka.util.Timeout "Permalink") final  val CreationTimeout: [Timeout](../util/Timeout.html)
12. [**](../../akka/actor/ActorSystem$$Settings.html#Daemonicity:Boolean "Permalink") final  val Daemonicity: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)
13. [**](../../akka/actor/ActorSystem$$Settings.html#DebugAutoReceive:Boolean "Permalink") final  val DebugAutoReceive: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)
14. [**](../../akka/actor/ActorSystem$$Settings.html#DebugEventStream:Boolean "Permalink") final  val DebugEventStream: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)
15. [**](../../akka/actor/ActorSystem$$Settings.html#DebugLifecycle:Boolean "Permalink") final  val DebugLifecycle: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)
16. [**](../../akka/actor/ActorSystem$$Settings.html#DebugRouterMisconfiguration:Boolean "Permalink") final  val DebugRouterMisconfiguration: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)
17. [**](../../akka/actor/ActorSystem$$Settings.html#DebugUnhandledMessage:Boolean "Permalink") final  val DebugUnhandledMessage: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)
18. [**](../../akka/actor/ActorSystem$$Settings.html#DefaultVirtualNodesFactor:Int "Permalink") final  val DefaultVirtualNodesFactor: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)
19. [**](../../akka/actor/ActorSystem$$Settings.html#FailMixedVersions:Boolean "Permalink") final  val FailMixedVersions: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)
20. [**](../../akka/actor/ActorSystem$$Settings.html#FsmDebugEvent:Boolean "Permalink") final  val FsmDebugEvent: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)
21. [**](../../akka/actor/ActorSystem$$Settings.html#HasCluster:Boolean "Permalink") final  val HasCluster: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)
22. [**](../../akka/actor/ActorSystem$$Settings.html#Home:Option[String] "Permalink") final  val Home: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[String]
23. [**](../../akka/actor/ActorSystem$$Settings.html#JvmExitOnFatalError:Boolean "Permalink") final  val JvmExitOnFatalError: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)
24. [**](../../akka/actor/ActorSystem$$Settings.html#JvmShutdownHooks:Boolean "Permalink") final  val JvmShutdownHooks: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)
25. [**](../../akka/actor/ActorSystem$$Settings.html#LogConfigOnStart:Boolean "Permalink") final  val LogConfigOnStart: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)
26. [**](../../akka/actor/ActorSystem$$Settings.html#LogDeadLetters:Int "Permalink") final  val LogDeadLetters: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)
27. [**](../../akka/actor/ActorSystem$$Settings.html#LogDeadLettersDuringShutdown:Boolean "Permalink") final  val LogDeadLettersDuringShutdown: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)
28. [**](../../akka/actor/ActorSystem$$Settings.html#LogDeadLettersSuspendDuration:scala.concurrent.duration.Duration "Permalink") final  val LogDeadLettersSuspendDuration: [Duration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/Duration.html#scala.concurrent.duration.Duration)
29. [**](../../akka/actor/ActorSystem$$Settings.html#LogLevel:String "Permalink") final  val LogLevel: String
30. [**](../../akka/actor/ActorSystem$$Settings.html#LoggerStartTimeout:akka.util.Timeout "Permalink") final  val LoggerStartTimeout: [Timeout](../util/Timeout.html)
31. [**](../../akka/actor/ActorSystem$$Settings.html#Loggers:Seq[String] "Permalink") final  val Loggers: [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[String]
32. [**](../../akka/actor/ActorSystem$$Settings.html#LoggersDispatcher:String "Permalink") final  val LoggersDispatcher: String
33. [**](../../akka/actor/ActorSystem$$Settings.html#LoggingFilter:String "Permalink") final  val LoggingFilter: String
34. [**](../../akka/actor/ActorSystem$$Settings.html#NoSerializationVerificationNeededClassPrefix:Set[String] "Permalink") final  val NoSerializationVerificationNeededClassPrefix: Set\[String]
35. [**](../../akka/actor/ActorSystem$$Settings.html#ProviderClass:String "Permalink") final  val ProviderClass: String
36. [**](../../akka/actor/ActorSystem$$Settings.html#ProviderSelectionType:akka.actor.ProviderSelection "Permalink") final  val ProviderSelectionType: [ProviderSelection](ProviderSelection.html)
37. [**](../../akka/actor/ActorSystem$$Settings.html#SchedulerClass:String "Permalink") final  val SchedulerClass: String
38. [**](../../akka/actor/ActorSystem$$Settings.html#SerializeAllCreators:Boolean "Permalink") final  val SerializeAllCreators: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)
39. [**](../../akka/actor/ActorSystem$$Settings.html#SerializeAllMessages:Boolean "Permalink") final  val SerializeAllMessages: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)
40. [**](../../akka/actor/ActorSystem$$Settings.html#StdoutLogLevel:String "Permalink") final  val StdoutLogLevel: String
41. [**](../../akka/actor/ActorSystem$$Settings.html#SupervisorStrategyClass:String "Permalink") final  val SupervisorStrategyClass: String
42. [**](../../akka/actor/ActorSystem$$Settings.html#UnstartedPushTimeout:akka.util.Timeout "Permalink") final  val UnstartedPushTimeout: [Timeout](../util/Timeout.html)
43. [**](../../akka/actor/ActorSystem$$Settings.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
44. [**](../../akka/actor/ActorSystem$$Settings.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
45. [**](../../akka/actor/ActorSystem$$Settings.html#config:com.typesafe.config.Config "Permalink") final  val config: ConfigThe backing Config of this ActorSystem's Settings

The backing Config of this ActorSystem's Settings

See also[The Typesafe Config Library API Documentation](https://lightbend.github.io/config/latest/api/index.html)
46. [**](../../akka/actor/ActorSystem$$Settings.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (Settings) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): SettingsImplicitThis member is added by an implicit conversion from Settings toEnsuring\[Settings] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
47. [**](../../akka/actor/ActorSystem$$Settings.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (Settings) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): SettingsImplicitThis member is added by an implicit conversion from Settings toEnsuring\[Settings] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
48. [**](../../akka/actor/ActorSystem$$Settings.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): SettingsImplicitThis member is added by an implicit conversion from Settings toEnsuring\[Settings] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
49. [**](../../akka/actor/ActorSystem$$Settings.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): SettingsImplicitThis member is added by an implicit conversion from Settings toEnsuring\[Settings] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
50. [**](../../akka/actor/ActorSystem$$Settings.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
51. [**](../../akka/actor/ActorSystem$$Settings.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
52. [**](../../akka/actor/ActorSystem$$Settings.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
53. [**](../../akka/actor/ActorSystem$$Settings.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
54. [**](../../akka/actor/ActorSystem$$Settings.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
55. [**](../../akka/actor/ActorSystem$$Settings.html#name:String "Permalink") final  val name: String
56. [**](../../akka/actor/ActorSystem$$Settings.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
57. [**](../../akka/actor/ActorSystem$$Settings.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
58. [**](../../akka/actor/ActorSystem$$Settings.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
59. [**](../../akka/actor/ActorSystem$$Settings.html#setup:akka.actor.setup.ActorSystemSetup "Permalink")  val setup: [ActorSystemSetup](setup/ActorSystemSetup.html)
60. [**](../../akka/actor/ActorSystem$$Settings.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
61. [**](../../akka/actor/ActorSystem$$Settings.html#toString():String "Permalink")  def toString(): StringReturns the String representation of the Config that this Settings is backed by

Returns the String representation of the Config that this Settings is backed by

Definition ClassesSettings → AnyRef → Any
62. [**](../../akka/actor/ActorSystem$$Settings.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
63. [**](../../akka/actor/ActorSystem$$Settings.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
64. [**](../../akka/actor/ActorSystem$$Settings.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../akka/actor/ActorSystem$$Settings.html#EnableAdditionalSerializationBindings:Boolean "Permalink") final  val EnableAdditionalSerializationBindings: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Annotations@deprecated Deprecated*(Since version 2\.6\.0\)* Always enabled from Akka 2\.6\.0
2. [**](../../akka/actor/ActorSystem$$Settings.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
3. [**](../../akka/actor/ActorSystem$$Settings.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from Settings toStringFormat\[Settings] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
4. [**](../../akka/actor/ActorSystem$$Settings.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (Settings, B)ImplicitThis member is added by an implicit conversion from Settings toArrowAssoc\[Settings] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromSettings to any2stringadd\[Settings]

### Inherited by implicit conversion StringFormat fromSettings to StringFormat\[Settings]

### Inherited by implicit conversion Ensuring fromSettings to Ensuring\[Settings]

### Inherited by implicit conversion ArrowAssoc fromSettings to ArrowAssoc\[Settings]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10/akka/actor/ActorSystem$$Settings.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/ActorSystem$.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/ProviderSelection.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/setup/ActorSystemSetup.html
- https://doc.akka.io/api/akka-core/2.10/akka/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/util/Timeout.html
- https://doc.akka.io/api/akka-core/2.10/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10/akka/actor/ActorSystem$$Settings.html](https://doc.akka.io/api/akka-core/2.10/akka/actor/ActorSystem$$Settings.html)*