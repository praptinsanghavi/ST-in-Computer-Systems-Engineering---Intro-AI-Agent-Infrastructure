---
description: Akka 2.10.17 - akka.persistence.testkit.SnapshotStorage.SnapshotPolicies
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:49:50Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/persistence/testkit/SnapshotStorage$$SnapshotPolicies$.html
title: Akka 2.10.17 - akka.persistence.testkit.SnapshotStorage.SnapshotPolicies
---

# Akka 2.10.17 - akka.persistence.testkit.SnapshotStorage.SnapshotPolicies

> **Summary:** Akka 2.10.17 - akka.persistence.testkit.SnapshotStorage.SnapshotPolicies

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/persistence/index.html "Permalink")  package [persistence](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/persistence/testkit/index.html "Permalink")  package [testkit](index.html)Definition Classes[persistence](../index.html)
- [**](../../../akka/persistence/testkit/SnapshotStorage$.html "Permalink")  object [SnapshotStorage](SnapshotStorage$.html)Definition Classes[testkit](index.html)
- SnapshotPolicies
o[akka](../../index.html).[persistence](../index.html).[testkit](index.html).[SnapshotStorage](SnapshotStorage$.html)

# SnapshotPolicies[**](../../../akka/persistence/testkit/SnapshotStorage$$SnapshotPolicies$.html "Permalink")

### 

#### object SnapshotPolicies extends DefaultPolicies\[[SnapshotOperation](SnapshotOperation.html)]

Source[SnapshotStorage.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-persistence-testkit/src/main/scala/akka/persistence/testkit/SnapshotStorage.scala#L70)Linear SupertypesDefaultPolicies\[[SnapshotOperation](SnapshotOperation.html)], [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. SnapshotPolicies
2. DefaultPolicies
3. AnyRef
4. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Type Members

1. [**](../../../akka/persistence/testkit/SnapshotStorage$$SnapshotPolicies$.html#CountNextNCondextendsDefaultPolicies.this.ReturnAfterNextNCond "Permalink")  class CountNextNCond extends ReturnAfterNextNCondDefinition ClassesDefaultPolicies
2. [**](../../../akka/persistence/testkit/SnapshotStorage$$SnapshotPolicies$.html#FailNextNextendsDefaultPolicies.this.CountNextNCond "Permalink")  class FailNextN extends CountNextNCondDefinition ClassesDefaultPolicies
3. [**](../../../akka/persistence/testkit/SnapshotStorage$$SnapshotPolicies$.html#FailNextNCondextendsDefaultPolicies.this.CountNextNCond "Permalink")  class FailNextNCond extends CountNextNCondDefinition ClassesDefaultPolicies
4. [**](../../../akka/persistence/testkit/SnapshotStorage$$SnapshotPolicies$.html#PolicyType=akka.persistence.testkit.ProcessingPolicy[U] "Permalink")  type PolicyType \= [ProcessingPolicy](ProcessingPolicy.html)\[[SnapshotOperation](SnapshotOperation.html)]Definition ClassesDefaultPolicies
5. [**](../../../akka/persistence/testkit/SnapshotStorage$$SnapshotPolicies$.html#RejectNextNextendsDefaultPolicies.this.CountNextNCond "Permalink")  class RejectNextN extends CountNextNCondDefinition ClassesDefaultPolicies
6. [**](../../../akka/persistence/testkit/SnapshotStorage$$SnapshotPolicies$.html#RejectNextNCondextendsDefaultPolicies.this.CountNextNCond "Permalink")  class RejectNextNCond extends CountNextNCondDefinition ClassesDefaultPolicies
7. [**](../../../akka/persistence/testkit/SnapshotStorage$$SnapshotPolicies$.html#ReturnAfterNextNCondextendsDefaultPolicies.this.PolicyType "Permalink")  class ReturnAfterNextNCond extends PolicyTypeDefinition ClassesDefaultPolicies
### Value Members

1. [**](../../../akka/persistence/testkit/SnapshotStorage$$SnapshotPolicies$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/persistence/testkit/SnapshotStorage$$SnapshotPolicies$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/persistence/testkit/SnapshotStorage$$SnapshotPolicies$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../akka/persistence/testkit/SnapshotStorage$$SnapshotPolicies$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
5. [**](../../../akka/persistence/testkit/SnapshotStorage$$SnapshotPolicies$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
6. [**](../../../akka/persistence/testkit/SnapshotStorage$$SnapshotPolicies$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
7. [**](../../../akka/persistence/testkit/SnapshotStorage$$SnapshotPolicies$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
8. [**](../../../akka/persistence/testkit/SnapshotStorage$$SnapshotPolicies$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
9. [**](../../../akka/persistence/testkit/SnapshotStorage$$SnapshotPolicies$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
10. [**](../../../akka/persistence/testkit/SnapshotStorage$$SnapshotPolicies$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
11. [**](../../../akka/persistence/testkit/SnapshotStorage$$SnapshotPolicies$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
12. [**](../../../akka/persistence/testkit/SnapshotStorage$$SnapshotPolicies$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
13. [**](../../../akka/persistence/testkit/SnapshotStorage$$SnapshotPolicies$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
14. [**](../../../akka/persistence/testkit/SnapshotStorage$$SnapshotPolicies$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
15. [**](../../../akka/persistence/testkit/SnapshotStorage$$SnapshotPolicies$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
16. [**](../../../akka/persistence/testkit/SnapshotStorage$$SnapshotPolicies$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
17. [**](../../../akka/persistence/testkit/SnapshotStorage$$SnapshotPolicies$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
18. [**](../../../akka/persistence/testkit/SnapshotStorage$$SnapshotPolicies$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
19. [**](../../../akka/persistence/testkit/SnapshotStorage$$SnapshotPolicies$.html#PassAll "Permalink")  case object PassAll extends PolicyType with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableDefinition ClassesDefaultPolicies
### Deprecated Value Members

1. [**](../../../akka/persistence/testkit/SnapshotStorage$$SnapshotPolicies$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from DefaultPolicies\[[SnapshotOperation](SnapshotOperation.html)]

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10/akka/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/ProcessingPolicy.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/SnapshotOperation.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/SnapshotStorage$$SnapshotPolicies$.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/SnapshotStorage$.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/index.html
- https://doc.akka.io/api/akka-core/2.10/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/SnapshotStorage$$SnapshotPolicies$.html](https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/SnapshotStorage$$SnapshotPolicies$.html)*