---
description: Akka 2.10.17 - akka.remote.artery.RemoteInstrument
knowledge_type: official_documentation
scraped_at: '2026-04-06T13:10:22Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/remote/artery/RemoteInstrument.html
title: Akka 2.10.17 - akka.remote.artery.RemoteInstrument
---

# Akka 2.10.17 - akka.remote.artery.RemoteInstrument

> **Summary:** Akka 2.10.17 - akka.remote.artery.RemoteInstrument

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/remote/index.html "Permalink")  package [remote](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/remote/artery/index.html "Permalink")  package [artery](index.html)Definition Classes[remote](../index.html)
- [**](../../../akka/remote/artery/aeron/index.html "Permalink")  package [aeron](aeron/index.html)Definition Classes[artery](index.html)
- [**](../../../akka/remote/artery/compress/index.html "Permalink")  package [compress](compress/index.html)Definition Classes[artery](index.html)
- [**](../../../akka/remote/artery/jfr/index.html "Permalink")  package [jfr](jfr/index.html)Definition Classes[artery](index.html)
- [**](../../../akka/remote/artery/tcp/index.html "Permalink")  package [tcp](tcp/index.html)Definition Classes[artery](index.html)
- [GracefulShutdownQuarantinedEvent](GracefulShutdownQuarantinedEvent.html)
- [QuarantinedEvent](QuarantinedEvent.html)
- RemoteInstrument
- [RemotingFlightRecorder](RemotingFlightRecorder$.html "INTERNAL API")
- [TestManagementCommands](TestManagementCommands$.html)
- [ThisActorSystemQuarantinedEvent](ThisActorSystemQuarantinedEvent.html)
c[akka](../../index.html).[remote](../index.html).[artery](index.html)

# RemoteInstrument[**](../../../akka/remote/artery/RemoteInstrument.html "Permalink")

### 

#### abstract  class RemoteInstrument extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

INTERNAL API

Part of the monitoring SPI which allows attaching metadata to outbound remote messages,
and reading in metadata from incoming messages.

Multiple instruments are automatically handled, however they MUST NOT overlap in their idenfitiers.

Instances of `RemoteInstrument` are created from configuration. A new instance of RemoteInstrument
will be created for each encoder and decoder. It's only called from the operator, so if it doesn't
delegate to any shared instance it doesn't have to be thread\-safe.

Source[RemoteInstrument.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-remote/src/main/scala/akka/remote/artery/RemoteInstrument.scala#L37)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. RemoteInstrument
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

1. [**](../../../akka/remote/artery/RemoteInstrument.html#<init>():akka.remote.artery.RemoteInstrument "Permalink")  new RemoteInstrument()
### Abstract Value Members

1. [**](../../../akka/remote/artery/RemoteInstrument.html#identifier:Byte "Permalink") abstract  def identifier: [Byte](https://www.scala-lang.org/api/2.13.17/scala/Byte.html#scala.Byte)Instrument identifier.

Instrument identifier.

MUST be \>\=1 and \<32\.

Values between 1 and 7 are reserved for Akka internal use.
2. [**](../../../akka/remote/artery/RemoteInstrument.html#remoteMessageReceived(recipient:akka.actor.ActorRef,message:Object,sender:akka.actor.ActorRef,size:Int,time:Long):Unit "Permalink") abstract  def remoteMessageReceived(recipient: [ActorRef](../../actor/ActorRef.html), message: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), sender: [ActorRef](../../actor/ActorRef.html), size: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), time: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Called when the message has been deserialized.

Called when the message has been deserialized.

The `size` is the total serialized size in bytes of the complete message including akka specific headers and any
`RemoteInstrument` metadata.
If `serializationTimingEnabled` returns true, then `time` will be the total time it took to deserialize all data
in the message in nanoseconds, otherwise it is 0\.
3. [**](../../../akka/remote/artery/RemoteInstrument.html#remoteMessageSent(recipient:akka.actor.ActorRef,message:Object,sender:akka.actor.ActorRef,size:Int,time:Long):Unit "Permalink") abstract  def remoteMessageSent(recipient: [ActorRef](../../actor/ActorRef.html), message: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), sender: [ActorRef](../../actor/ActorRef.html), size: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), time: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Called right before putting the message onto the wire.

Called right before putting the message onto the wire.
Parameters MAY be `null` (except `message` and `buffer`)!

The `size` is the total serialized size in bytes of the complete message including akka specific headers and any
`RemoteInstrument` metadata.
If `serializationTimingEnabled` returns true, then `time` will be the total time it took to serialize all data
in the message in nanoseconds, otherwise it is 0\.
4. [**](../../../akka/remote/artery/RemoteInstrument.html#remoteReadMetadata(recipient:akka.actor.ActorRef,message:Object,sender:akka.actor.ActorRef,buffer:java.nio.ByteBuffer):Unit "Permalink") abstract  def remoteReadMetadata(recipient: [ActorRef](../../actor/ActorRef.html), message: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), sender: [ActorRef](../../actor/ActorRef.html), buffer: [ByteBuffer](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/nio/ByteBuffer.html#java.nio.ByteBuffer)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Called while deserializing the message once a message (containing a metadata field designated for this instrument) is found.
5. [**](../../../akka/remote/artery/RemoteInstrument.html#remoteWriteMetadata(recipient:akka.actor.ActorRef,message:Object,sender:akka.actor.ActorRef,buffer:java.nio.ByteBuffer):Unit "Permalink") abstract  def remoteWriteMetadata(recipient: [ActorRef](../../actor/ActorRef.html), message: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), sender: [ActorRef](../../actor/ActorRef.html), buffer: [ByteBuffer](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/nio/ByteBuffer.html#java.nio.ByteBuffer)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Called while serializing the message.

Called while serializing the message.
Parameters MAY be `null` (except `message` and `buffer`)!
### Concrete Value Members

1. [**](../../../akka/remote/artery/RemoteInstrument.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/remote/artery/RemoteInstrument.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/remote/artery/RemoteInstrument.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from RemoteInstrument toany2stringadd\[RemoteInstrument] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../akka/remote/artery/RemoteInstrument.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (RemoteInstrument, B)ImplicitThis member is added by an implicit conversion from RemoteInstrument toArrowAssoc\[RemoteInstrument] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../akka/remote/artery/RemoteInstrument.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../akka/remote/artery/RemoteInstrument.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../akka/remote/artery/RemoteInstrument.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../akka/remote/artery/RemoteInstrument.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (RemoteInstrument) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): RemoteInstrumentImplicitThis member is added by an implicit conversion from RemoteInstrument toEnsuring\[RemoteInstrument] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../../akka/remote/artery/RemoteInstrument.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (RemoteInstrument) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): RemoteInstrumentImplicitThis member is added by an implicit conversion from RemoteInstrument toEnsuring\[RemoteInstrument] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../akka/remote/artery/RemoteInstrument.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): RemoteInstrumentImplicitThis member is added by an implicit conversion from RemoteInstrument toEnsuring\[RemoteInstrument] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../akka/remote/artery/RemoteInstrument.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): RemoteInstrumentImplicitThis member is added by an implicit conversion from RemoteInstrument toEnsuring\[RemoteInstrument] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../akka/remote/artery/RemoteInstrument.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../akka/remote/artery/RemoteInstrument.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
14. [**](../../../akka/remote/artery/RemoteInstrument.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../akka/remote/artery/RemoteInstrument.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../akka/remote/artery/RemoteInstrument.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
17. [**](../../../akka/remote/artery/RemoteInstrument.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
18. [**](../../../akka/remote/artery/RemoteInstrument.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../../akka/remote/artery/RemoteInstrument.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../akka/remote/artery/RemoteInstrument.html#serializationTimingEnabled:Boolean "Permalink")  def serializationTimingEnabled: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Should the serialization be timed? Otherwise times are always 0\.
21. [**](../../../akka/remote/artery/RemoteInstrument.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
22. [**](../../../akka/remote/artery/RemoteInstrument.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
23. [**](../../../akka/remote/artery/RemoteInstrument.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
24. [**](../../../akka/remote/artery/RemoteInstrument.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
25. [**](../../../akka/remote/artery/RemoteInstrument.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../akka/remote/artery/RemoteInstrument.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../akka/remote/artery/RemoteInstrument.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from RemoteInstrument toStringFormat\[RemoteInstrument] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../akka/remote/artery/RemoteInstrument.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (RemoteInstrument, B)ImplicitThis member is added by an implicit conversion from RemoteInstrument toArrowAssoc\[RemoteInstrument] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromRemoteInstrument to any2stringadd\[RemoteInstrument]

### Inherited by implicit conversion StringFormat fromRemoteInstrument to StringFormat\[RemoteInstrument]

### Inherited by implicit conversion Ensuring fromRemoteInstrument to Ensuring\[RemoteInstrument]

### Inherited by implicit conversion ArrowAssoc fromRemoteInstrument to ArrowAssoc\[RemoteInstrument]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10/akka/actor/ActorRef.html
- https://doc.akka.io/api/akka-core/2.10/akka/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/remote/artery/GracefulShutdownQuarantinedEvent.html
- https://doc.akka.io/api/akka-core/2.10/akka/remote/artery/QuarantinedEvent.html
- https://doc.akka.io/api/akka-core/2.10/akka/remote/artery/RemoteInstrument.html
- https://doc.akka.io/api/akka-core/2.10/akka/remote/artery/RemotingFlightRecorder$.html
- https://doc.akka.io/api/akka-core/2.10/akka/remote/artery/TestManagementCommands$.html
- https://doc.akka.io/api/akka-core/2.10/akka/remote/artery/ThisActorSystemQuarantinedEvent.html
- https://doc.akka.io/api/akka-core/2.10/akka/remote/artery/aeron/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/remote/artery/compress/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/remote/artery/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/remote/artery/jfr/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/remote/artery/tcp/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/remote/index.html
- https://doc.akka.io/api/akka-core/2.10/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10/akka/remote/artery/RemoteInstrument.html](https://doc.akka.io/api/akka-core/2.10/akka/remote/artery/RemoteInstrument.html)*