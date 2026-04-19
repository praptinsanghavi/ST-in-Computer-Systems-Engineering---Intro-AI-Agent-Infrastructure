---
description: Akka 2.10.17 - akka.io.TcpExt.Settings
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:12:49Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/io/TcpExt$Settings.html
title: Akka 2.10.17 - akka.io.TcpExt.Settings
---

# Akka 2.10.17 - akka.io.TcpExt.Settings

> **Summary:** Akka 2.10.17 - akka.io.TcpExt.Settings

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../index.html "Permalink")  package [root](../../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/index.html "Permalink")  package [akka](../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/io/index.html "Permalink")  package [io](index.html)Definition Classes[akka](../index.html)
- [**](../../akka/io/TcpExt.html "Permalink")  class [TcpExt](TcpExt.html) extends [Extension](IO$$Extension.html)Definition Classes[io](index.html)
- Settings
c[akka](../index.html).[io](index.html).[TcpExt](TcpExt.html)

# Settings[**](../../akka/io/TcpExt$Settings.html "Permalink")

### 

#### class Settings extends [SelectionHandlerSettings](SelectionHandlerSettings.html)

Source[Tcp.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor/src/main/scala/akka/io/Tcp.scala#L599)Linear Supertypes[SelectionHandlerSettings](SelectionHandlerSettings.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. Settings
2. SelectionHandlerSettings
3. AnyRef
4. Any
Implicitly  
1. by any2stringadd
2. by StringFormat
3. by Ensuring
4. by ArrowAssoc
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Value Members

1. [**](../../akka/io/TcpExt$Settings.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/io/TcpExt$Settings.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/io/TcpExt$Settings.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from Settings toany2stringadd\[Settings] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../akka/io/TcpExt$Settings.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (Settings, B)ImplicitThis member is added by an implicit conversion from Settings toArrowAssoc\[Settings] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../akka/io/TcpExt$Settings.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../akka/io/TcpExt$Settings.html#BatchAcceptLimit:Int "Permalink")  val BatchAcceptLimit: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)
7. [**](../../akka/io/TcpExt$Settings.html#DirectBufferSize:Int "Permalink")  val DirectBufferSize: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)
8. [**](../../akka/io/TcpExt$Settings.html#FileIODispatcher:String "Permalink")  val FileIODispatcher: String
9. [**](../../akka/io/TcpExt$Settings.html#FinishConnectRetries:Int "Permalink")  val FinishConnectRetries: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)
10. [**](../../akka/io/TcpExt$Settings.html#ManagementDispatcher:String "Permalink")  val ManagementDispatcher: String
11. [**](../../akka/io/TcpExt$Settings.html#MaxChannels:Int "Permalink")  val MaxChannels: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition Classes[SelectionHandlerSettings](SelectionHandlerSettings.html)
12. [**](../../akka/io/TcpExt$Settings.html#MaxChannelsPerSelector:Int "Permalink")  val MaxChannelsPerSelector: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesSettings → [SelectionHandlerSettings](SelectionHandlerSettings.html)
13. [**](../../akka/io/TcpExt$Settings.html#MaxDirectBufferPoolSize:Int "Permalink")  val MaxDirectBufferPoolSize: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)
14. [**](../../akka/io/TcpExt$Settings.html#NrOfSelectors:Int "Permalink")  val NrOfSelectors: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)
15. [**](../../akka/io/TcpExt$Settings.html#ReceivedMessageSizeLimit:Int "Permalink")  val ReceivedMessageSizeLimit: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)
16. [**](../../akka/io/TcpExt$Settings.html#RegisterTimeout:scala.concurrent.duration.Duration "Permalink")  val RegisterTimeout: [Duration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/Duration.html#scala.concurrent.duration.Duration)
17. [**](../../akka/io/TcpExt$Settings.html#SelectorAssociationRetries:Int "Permalink")  val SelectorAssociationRetries: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition Classes[SelectionHandlerSettings](SelectionHandlerSettings.html)
18. [**](../../akka/io/TcpExt$Settings.html#SelectorDispatcher:String "Permalink")  val SelectorDispatcher: StringDefinition Classes[SelectionHandlerSettings](SelectionHandlerSettings.html)
19. [**](../../akka/io/TcpExt$Settings.html#TraceLogging:Boolean "Permalink")  val TraceLogging: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition Classes[SelectionHandlerSettings](SelectionHandlerSettings.html)
20. [**](../../akka/io/TcpExt$Settings.html#TransferToLimit:Int "Permalink")  val TransferToLimit: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)
21. [**](../../akka/io/TcpExt$Settings.html#WindowsConnectionAbortWorkaroundEnabled:Boolean "Permalink")  val WindowsConnectionAbortWorkaroundEnabled: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)
22. [**](../../akka/io/TcpExt$Settings.html#WorkerDispatcher:String "Permalink")  val WorkerDispatcher: StringDefinition Classes[SelectionHandlerSettings](SelectionHandlerSettings.html)
23. [**](../../akka/io/TcpExt$Settings.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
24. [**](../../akka/io/TcpExt$Settings.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
25. [**](../../akka/io/TcpExt$Settings.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (Settings) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): SettingsImplicitThis member is added by an implicit conversion from Settings toEnsuring\[Settings] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
26. [**](../../akka/io/TcpExt$Settings.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (Settings) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): SettingsImplicitThis member is added by an implicit conversion from Settings toEnsuring\[Settings] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
27. [**](../../akka/io/TcpExt$Settings.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): SettingsImplicitThis member is added by an implicit conversion from Settings toEnsuring\[Settings] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
28. [**](../../akka/io/TcpExt$Settings.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): SettingsImplicitThis member is added by an implicit conversion from Settings toEnsuring\[Settings] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
29. [**](../../akka/io/TcpExt$Settings.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
30. [**](../../akka/io/TcpExt$Settings.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
31. [**](../../akka/io/TcpExt$Settings.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
32. [**](../../akka/io/TcpExt$Settings.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
33. [**](../../akka/io/TcpExt$Settings.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
34. [**](../../akka/io/TcpExt$Settings.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
35. [**](../../akka/io/TcpExt$Settings.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
36. [**](../../akka/io/TcpExt$Settings.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
37. [**](../../akka/io/TcpExt$Settings.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
38. [**](../../akka/io/TcpExt$Settings.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
39. [**](../../akka/io/TcpExt$Settings.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
40. [**](../../akka/io/TcpExt$Settings.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
41. [**](../../akka/io/TcpExt$Settings.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../akka/io/TcpExt$Settings.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../akka/io/TcpExt$Settings.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from Settings toStringFormat\[Settings] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../akka/io/TcpExt$Settings.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (Settings, B)ImplicitThis member is added by an implicit conversion from Settings toArrowAssoc\[Settings] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [SelectionHandlerSettings](SelectionHandlerSettings.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromSettings to any2stringadd\[Settings]

### Inherited by implicit conversion StringFormat fromSettings to StringFormat\[Settings]

### Inherited by implicit conversion Ensuring fromSettings to Ensuring\[Settings]

### Inherited by implicit conversion ArrowAssoc fromSettings to ArrowAssoc\[Settings]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10/akka/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/IO$$Extension.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/SelectionHandlerSettings.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/TcpExt$Settings.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/TcpExt.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/index.html
- https://doc.akka.io/api/akka-core/2.10/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10/akka/io/TcpExt$Settings.html](https://doc.akka.io/api/akka-core/2.10/akka/io/TcpExt$Settings.html)*