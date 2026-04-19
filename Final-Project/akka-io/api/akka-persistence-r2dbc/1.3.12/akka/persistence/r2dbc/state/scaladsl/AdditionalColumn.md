---
description: Akka Persistence R2DBC 1.3.12 - akka.persistence.r2dbc.state.scaladsl.AdditionalColumn
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:18:05Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-persistence-r2dbc/1.3.12/akka/persistence/r2dbc/state/scaladsl/AdditionalColumn.html
title: Akka Persistence R2DBC 1.3.12 - akka.persistence.r2dbc.state.scaladsl.AdditionalColumn
---

# Akka Persistence R2DBC 1.3.12 - akka.persistence.r2dbc.state.scaladsl.AdditionalColumn

> **Summary:** Akka Persistence R2DBC 1.3.12 - akka.persistence.r2dbc.state.scaladsl.AdditionalColumn

## Content

Akka Persistence R2DBC1\.3\.12 \< Back****# Packages

- [**](../../../../../index.html "Permalink")  package [root](../../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/index.html "Permalink")  package [akka](../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/persistence/index.html "Permalink")  package [persistence](../../../index.html)Definition Classes[akka](../../../../index.html)
- [**](../../../../../akka/persistence/r2dbc/index.html "Permalink")  package [r2dbc](../../index.html)Definition Classes[persistence](../../../index.html)
- [**](../../../../../akka/persistence/r2dbc/state/index.html "Permalink")  package [state](../index.html)Definition Classes[r2dbc](../../index.html)
- [**](../../../../../akka/persistence/r2dbc/state/scaladsl/index.html "Permalink")  package [scaladsl](index.html)Definition Classes[state](../index.html)
- AdditionalColumn
- [ChangeHandler](ChangeHandler.html)
- [R2dbcDurableStateStore](R2dbcDurableStateStore.html)
[c](AdditionalColumn$.html "See companion object")[akka](../../../../index.html).[persistence](../../../index.html).[r2dbc](../../index.html).[state](../index.html).[scaladsl](index.html)

# [AdditionalColumn](AdditionalColumn$.html "See companion object")[**](../../../../../akka/persistence/r2dbc/state/scaladsl/AdditionalColumn.html "Permalink")

### Companion [object AdditionalColumn](AdditionalColumn$.html "See companion object")

#### abstract  class AdditionalColumn\[A, B] extends AnyRef

A
 The type of the durable state

B
 The type of the field stored in the additional column.

Annotations@ApiMayChange() Linear SupertypesAnyRef, Any****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. AdditionalColumn
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Instance Constructors

1. [**](../../../../../akka/persistence/r2dbc/state/scaladsl/AdditionalColumn.html#<init>()(implicitevidence$1:scala.reflect.ClassTag[B]):akka.persistence.r2dbc.state.scaladsl.AdditionalColumn[A,B] "Permalink")  new AdditionalColumn()(implicit arg0: ClassTag\[B])
### Abstract Value Members

1. [**](../../../../../akka/persistence/r2dbc/state/scaladsl/AdditionalColumn.html#bind(upsert:akka.persistence.r2dbc.state.scaladsl.AdditionalColumn.Upsert[A]):akka.persistence.r2dbc.state.scaladsl.AdditionalColumn.Binding[B] "Permalink") abstract  def bind(upsert: [Upsert](AdditionalColumn$$Upsert.html)\[A]): [Binding](AdditionalColumn$$Binding.html)\[B]
2. [**](../../../../../akka/persistence/r2dbc/state/scaladsl/AdditionalColumn.html#columnName:String "Permalink") abstract  def columnName: String
### Concrete Value Members

1. [**](../../../../../akka/persistence/r2dbc/state/scaladsl/AdditionalColumn.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: Any): BooleanDefinition ClassesAnyRef → Any
2. [**](../../../../../akka/persistence/r2dbc/state/scaladsl/AdditionalColumn.html###:Int "Permalink") final  def \#\#: IntDefinition ClassesAnyRef → Any
3. [**](../../../../../akka/persistence/r2dbc/state/scaladsl/AdditionalColumn.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: Any): BooleanDefinition ClassesAnyRef → Any
4. [**](../../../../../akka/persistence/r2dbc/state/scaladsl/AdditionalColumn.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
5. [**](../../../../../akka/persistence/r2dbc/state/scaladsl/AdditionalColumn.html#clone():Object "Permalink")  def clone(): AnyRefAttributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @IntrinsicCandidate() @native()
6. [**](../../../../../akka/persistence/r2dbc/state/scaladsl/AdditionalColumn.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: AnyRef): BooleanDefinition ClassesAnyRef
7. [**](../../../../../akka/persistence/r2dbc/state/scaladsl/AdditionalColumn.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: AnyRef): BooleanDefinition ClassesAnyRef → Any
8. [**](../../../../../akka/persistence/r2dbc/state/scaladsl/AdditionalColumn.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: AnyRef]Definition ClassesAnyRef → AnyAnnotations@IntrinsicCandidate() @native()
9. [**](../../../../../akka/persistence/r2dbc/state/scaladsl/AdditionalColumn.html#hashCode():Int "Permalink")  def hashCode(): IntDefinition ClassesAnyRef → AnyAnnotations@IntrinsicCandidate() @native()
10. [**](../../../../../akka/persistence/r2dbc/state/scaladsl/AdditionalColumn.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: BooleanDefinition ClassesAny
11. [**](../../../../../akka/persistence/r2dbc/state/scaladsl/AdditionalColumn.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: AnyRef): BooleanDefinition ClassesAnyRef
12. [**](../../../../../akka/persistence/r2dbc/state/scaladsl/AdditionalColumn.html#notify():Unit "Permalink") final  def notify(): UnitDefinition ClassesAnyRefAnnotations@IntrinsicCandidate() @native()
13. [**](../../../../../akka/persistence/r2dbc/state/scaladsl/AdditionalColumn.html#notifyAll():Unit "Permalink") final  def notifyAll(): UnitDefinition ClassesAnyRefAnnotations@IntrinsicCandidate() @native()
14. [**](../../../../../akka/persistence/r2dbc/state/scaladsl/AdditionalColumn.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
15. [**](../../../../../akka/persistence/r2dbc/state/scaladsl/AdditionalColumn.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
16. [**](../../../../../akka/persistence/r2dbc/state/scaladsl/AdditionalColumn.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: Long, arg1: Int): UnitDefinition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
17. [**](../../../../../akka/persistence/r2dbc/state/scaladsl/AdditionalColumn.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: Long): UnitDefinition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
18. [**](../../../../../akka/persistence/r2dbc/state/scaladsl/AdditionalColumn.html#wait():Unit "Permalink") final  def wait(): UnitDefinition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../../akka/persistence/r2dbc/state/scaladsl/AdditionalColumn.html#finalize():Unit "Permalink")  def finalize(): UnitAttributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from AnyRef

### Inherited from Any

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-persistence-r2dbc/1.3.12/akka/index.html
- https://doc.akka.io/api/akka-persistence-r2dbc/1.3.12/akka/persistence/index.html
- https://doc.akka.io/api/akka-persistence-r2dbc/1.3.12/akka/persistence/r2dbc/index.html
- https://doc.akka.io/api/akka-persistence-r2dbc/1.3.12/akka/persistence/r2dbc/state/index.html
- https://doc.akka.io/api/akka-persistence-r2dbc/1.3.12/akka/persistence/r2dbc/state/scaladsl/AdditionalColumn$$Binding.html
- https://doc.akka.io/api/akka-persistence-r2dbc/1.3.12/akka/persistence/r2dbc/state/scaladsl/AdditionalColumn$$Upsert.html
- https://doc.akka.io/api/akka-persistence-r2dbc/1.3.12/akka/persistence/r2dbc/state/scaladsl/AdditionalColumn$.html
- https://doc.akka.io/api/akka-persistence-r2dbc/1.3.12/akka/persistence/r2dbc/state/scaladsl/AdditionalColumn.html
- https://doc.akka.io/api/akka-persistence-r2dbc/1.3.12/akka/persistence/r2dbc/state/scaladsl/ChangeHandler.html
- https://doc.akka.io/api/akka-persistence-r2dbc/1.3.12/akka/persistence/r2dbc/state/scaladsl/R2dbcDurableStateStore$.html
- https://doc.akka.io/api/akka-persistence-r2dbc/1.3.12/akka/persistence/r2dbc/state/scaladsl/R2dbcDurableStateStore.html
- https://doc.akka.io/api/akka-persistence-r2dbc/1.3.12/akka/persistence/r2dbc/state/scaladsl/index.html
- https://doc.akka.io/api/akka-persistence-r2dbc/1.3.12/index.html

---
*Source: [https://doc.akka.io/api/akka-persistence-r2dbc/1.3.12/akka/persistence/r2dbc/state/scaladsl/AdditionalColumn.html](https://doc.akka.io/api/akka-persistence-r2dbc/1.3.12/akka/persistence/r2dbc/state/scaladsl/AdditionalColumn.html)*