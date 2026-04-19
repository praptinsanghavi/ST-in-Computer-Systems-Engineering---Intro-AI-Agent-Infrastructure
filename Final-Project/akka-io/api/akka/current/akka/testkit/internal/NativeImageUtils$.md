---
description: Akka 2.10.17 - akka.testkit.internal.NativeImageUtils
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:38:44Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/testkit/internal/NativeImageUtils$.html
title: Akka 2.10.17 - akka.testkit.internal.NativeImageUtils
---

# Akka 2.10.17 - akka.testkit.internal.NativeImageUtils

> **Summary:** Akka 2.10.17 - akka.testkit.internal.NativeImageUtils

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/testkit/index.html "Permalink")  package [testkit](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/testkit/internal/index.html "Permalink")  package [internal](index.html)Definition Classes[testkit](../index.html)
- [NativeImageUtils](NativeImageUtils.html "INTERNAL API")
[o](NativeImageUtils.html "See companion class")[akka](../../index.html).[testkit](../index.html).[internal](index.html)

# [NativeImageUtils](NativeImageUtils.html "See companion class")[**](../../../akka/testkit/internal/NativeImageUtils$.html "Permalink")

### Companion [class NativeImageUtils](NativeImageUtils.html "See companion class")

#### object NativeImageUtils

INTERNAL API

Annotations@[InternalApi](../../annotation/InternalApi.html)() Source[NativeImageUtils.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-testkit/src/main/scala/akka/testkit/internal/NativeImageUtils.scala#L38)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. NativeImageUtils
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Type Members

1. [**](../../../akka/testkit/internal/NativeImageUtils$$Condition.html "Permalink") final  case class [Condition](NativeImageUtils$$Condition.html)(typeReachable: String) extends [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable
2. [**](../../../akka/testkit/internal/NativeImageUtils$$ReflectConfigEntry.html "Permalink") final  case class [ReflectConfigEntry](NativeImageUtils$$ReflectConfigEntry.html)(name: String, methods: Seq\[[ReflectMethod](NativeImageUtils$$ReflectMethod.html)] \= Seq.empty, queriedMethods: Seq\[[ReflectMethod](NativeImageUtils$$ReflectMethod.html)] \= Seq.empty, fields: Seq\[[ReflectField](NativeImageUtils$$ReflectField.html)] \= Seq.empty, allDeclaredClasses: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean) \= false, allDeclaredMethods: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean) \= false, allDeclaredFields: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean) \= false, allDeclaredConstructors: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean) \= false, allPublicClasses: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean) \= false, allPublicMethods: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean) \= false, allPublicFields: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean) \= false, allPublicConstructors: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean) \= false, allRecordComponents: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean) \= false, allNestMembers: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean) \= false, allSigners: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean) \= false, allPermittedSubclasses: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean) \= false, queryAllDeclaredMethods: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean) \= false, queryAllDeclaredConstructors: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean) \= false, queryAllPublicMethods: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean) \= false, queryAllPublicConstructors: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean) \= false, unsafeAllocate: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean) \= false, condition: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Condition](NativeImageUtils$$Condition.html)] \= None) extends [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableAnnotations@JsonInclude()
3. [**](../../../akka/testkit/internal/NativeImageUtils$$ReflectField.html "Permalink") final  case class [ReflectField](NativeImageUtils$$ReflectField.html)(name: String) extends [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable
4. [**](../../../akka/testkit/internal/NativeImageUtils$$ReflectMethod.html "Permalink") final  case class [ReflectMethod](NativeImageUtils$$ReflectMethod.html)(name: String, parameterTypes: Seq\[String] \= Seq.empty) extends [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableAnnotations@JsonInclude()
### Value Members

1. [**](../../../akka/testkit/internal/NativeImageUtils$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/testkit/internal/NativeImageUtils$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/testkit/internal/NativeImageUtils$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../akka/testkit/internal/NativeImageUtils$.html#Constructor:String "Permalink")  val Constructor: [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)
5. [**](../../../akka/testkit/internal/NativeImageUtils$.html#ModuleField:akka.testkit.internal.NativeImageUtils.ReflectField "Permalink")  val ModuleField: [ReflectField](NativeImageUtils$$ReflectField.html)
6. [**](../../../akka/testkit/internal/NativeImageUtils$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../akka/testkit/internal/NativeImageUtils$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../akka/testkit/internal/NativeImageUtils$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
9. [**](../../../akka/testkit/internal/NativeImageUtils$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
10. [**](../../../akka/testkit/internal/NativeImageUtils$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
11. [**](../../../akka/testkit/internal/NativeImageUtils$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
12. [**](../../../akka/testkit/internal/NativeImageUtils$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
13. [**](../../../akka/testkit/internal/NativeImageUtils$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
14. [**](../../../akka/testkit/internal/NativeImageUtils$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../akka/testkit/internal/NativeImageUtils$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../akka/testkit/internal/NativeImageUtils$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
17. [**](../../../akka/testkit/internal/NativeImageUtils$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
18. [**](../../../akka/testkit/internal/NativeImageUtils$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
19. [**](../../../akka/testkit/internal/NativeImageUtils$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
20. [**](../../../akka/testkit/internal/NativeImageUtils$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../akka/testkit/internal/NativeImageUtils$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/annotation/InternalApi.html
- https://doc.akka.io/api/akka/current/akka/index.html
- https://doc.akka.io/api/akka/current/akka/testkit/index.html
- https://doc.akka.io/api/akka/current/akka/testkit/internal/NativeImageUtils$$Condition.html
- https://doc.akka.io/api/akka/current/akka/testkit/internal/NativeImageUtils$$ReflectConfigEntry.html
- https://doc.akka.io/api/akka/current/akka/testkit/internal/NativeImageUtils$$ReflectField.html
- https://doc.akka.io/api/akka/current/akka/testkit/internal/NativeImageUtils$$ReflectMethod.html
- https://doc.akka.io/api/akka/current/akka/testkit/internal/NativeImageUtils$.html
- https://doc.akka.io/api/akka/current/akka/testkit/internal/NativeImageUtils.html
- https://doc.akka.io/api/akka/current/akka/testkit/internal/index.html
- https://doc.akka.io/api/akka/current/index.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/testkit/internal/NativeImageUtils$.html](https://doc.akka.io/api/akka/current/akka/testkit/internal/NativeImageUtils$.html)*