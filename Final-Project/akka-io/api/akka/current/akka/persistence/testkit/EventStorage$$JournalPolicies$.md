---
description: Akka 2.10.17 - akka.persistence.testkit.EventStorage.JournalPolicies
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:52:33Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/persistence/testkit/EventStorage$$JournalPolicies$.html
title: Akka 2.10.17 - akka.persistence.testkit.EventStorage.JournalPolicies
---

# Akka 2.10.17 - akka.persistence.testkit.EventStorage.JournalPolicies

> **Summary:** Akka 2.10.17 - akka.persistence.testkit.EventStorage.JournalPolicies

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/persistence/index.html "Permalink")  package [persistence](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/persistence/testkit/index.html "Permalink")  package [testkit](index.html)Definition Classes[persistence](../index.html)
- [**](../../../akka/persistence/testkit/EventStorage$.html "Permalink")  object [EventStorage](EventStorage$.html)Definition Classes[testkit](index.html)
- JournalPolicies
o[akka](../../index.html).[persistence](../index.html).[testkit](index.html).[EventStorage](EventStorage$.html)

# JournalPolicies[**](../../../akka/persistence/testkit/EventStorage$$JournalPolicies$.html "Permalink")

### 

#### object JournalPolicies extends DefaultPolicies\[[JournalOperation](JournalOperation.html)]

Source[EventStorage.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-persistence-testkit/src/main/scala/akka/persistence/testkit/EventStorage.scala#L156)Linear SupertypesDefaultPolicies\[[JournalOperation](JournalOperation.html)], [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. JournalPolicies
2. DefaultPolicies
3. AnyRef
4. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Type Members

1. [**](../../../akka/persistence/testkit/EventStorage$$JournalPolicies$.html#CountNextNCondextendsDefaultPolicies.this.ReturnAfterNextNCond "Permalink")  class CountNextNCond extends ReturnAfterNextNCondDefinition ClassesDefaultPolicies
2. [**](../../../akka/persistence/testkit/EventStorage$$JournalPolicies$.html#FailNextNextendsDefaultPolicies.this.CountNextNCond "Permalink")  class FailNextN extends CountNextNCondDefinition ClassesDefaultPolicies
3. [**](../../../akka/persistence/testkit/EventStorage$$JournalPolicies$.html#FailNextNCondextendsDefaultPolicies.this.CountNextNCond "Permalink")  class FailNextNCond extends CountNextNCondDefinition ClassesDefaultPolicies
4. [**](../../../akka/persistence/testkit/EventStorage$$JournalPolicies$.html#PolicyType=akka.persistence.testkit.ProcessingPolicy[U] "Permalink")  type PolicyType \= [ProcessingPolicy](ProcessingPolicy.html)\[[JournalOperation](JournalOperation.html)]Definition ClassesDefaultPolicies
5. [**](../../../akka/persistence/testkit/EventStorage$$JournalPolicies$.html#RejectNextNextendsDefaultPolicies.this.CountNextNCond "Permalink")  class RejectNextN extends CountNextNCondDefinition ClassesDefaultPolicies
6. [**](../../../akka/persistence/testkit/EventStorage$$JournalPolicies$.html#RejectNextNCondextendsDefaultPolicies.this.CountNextNCond "Permalink")  class RejectNextNCond extends CountNextNCondDefinition ClassesDefaultPolicies
7. [**](../../../akka/persistence/testkit/EventStorage$$JournalPolicies$.html#ReturnAfterNextNCondextendsDefaultPolicies.this.PolicyType "Permalink")  class ReturnAfterNextNCond extends PolicyTypeDefinition ClassesDefaultPolicies
### Value Members

1. [**](../../../akka/persistence/testkit/EventStorage$$JournalPolicies$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/persistence/testkit/EventStorage$$JournalPolicies$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/persistence/testkit/EventStorage$$JournalPolicies$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../akka/persistence/testkit/EventStorage$$JournalPolicies$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
5. [**](../../../akka/persistence/testkit/EventStorage$$JournalPolicies$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
6. [**](../../../akka/persistence/testkit/EventStorage$$JournalPolicies$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
7. [**](../../../akka/persistence/testkit/EventStorage$$JournalPolicies$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
8. [**](../../../akka/persistence/testkit/EventStorage$$JournalPolicies$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
9. [**](../../../akka/persistence/testkit/EventStorage$$JournalPolicies$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
10. [**](../../../akka/persistence/testkit/EventStorage$$JournalPolicies$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
11. [**](../../../akka/persistence/testkit/EventStorage$$JournalPolicies$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
12. [**](../../../akka/persistence/testkit/EventStorage$$JournalPolicies$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
13. [**](../../../akka/persistence/testkit/EventStorage$$JournalPolicies$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
14. [**](../../../akka/persistence/testkit/EventStorage$$JournalPolicies$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
15. [**](../../../akka/persistence/testkit/EventStorage$$JournalPolicies$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
16. [**](../../../akka/persistence/testkit/EventStorage$$JournalPolicies$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
17. [**](../../../akka/persistence/testkit/EventStorage$$JournalPolicies$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
18. [**](../../../akka/persistence/testkit/EventStorage$$JournalPolicies$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
19. [**](../../../akka/persistence/testkit/EventStorage$$JournalPolicies$.html#PassAll "Permalink")  case object PassAll extends PolicyType with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableDefinition ClassesDefaultPolicies
### Deprecated Value Members

1. [**](../../../akka/persistence/testkit/EventStorage$$JournalPolicies$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from DefaultPolicies\[[JournalOperation](JournalOperation.html)]

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/index.html
- https://doc.akka.io/api/akka/current/akka/persistence/index.html
- https://doc.akka.io/api/akka/current/akka/persistence/testkit/EventStorage$$JournalPolicies$.html
- https://doc.akka.io/api/akka/current/akka/persistence/testkit/EventStorage$.html
- https://doc.akka.io/api/akka/current/akka/persistence/testkit/JournalOperation.html
- https://doc.akka.io/api/akka/current/akka/persistence/testkit/ProcessingPolicy.html
- https://doc.akka.io/api/akka/current/akka/persistence/testkit/index.html
- https://doc.akka.io/api/akka/current/index.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/persistence/testkit/EventStorage$$JournalPolicies$.html](https://doc.akka.io/api/akka/current/akka/persistence/testkit/EventStorage$$JournalPolicies$.html)*