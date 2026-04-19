---
description: Akka Persistence R2DBC 1.3.12 - akka.persistence.r2dbc.state.scaladsl.R2dbcDurableStateStore
knowledge_type: official_documentation
scraped_at: '2026-04-06T03:09:57Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-persistence-r2dbc/1.3.12/akka/persistence/r2dbc/state/scaladsl/R2dbcDurableStateStore$.html
title: Akka Persistence R2DBC 1.3.12 - akka.persistence.r2dbc.state.scaladsl.R2dbcDurableStateStore
---

# Akka Persistence R2DBC 1.3.12 - akka.persistence.r2dbc.state.scaladsl.R2dbcDurableStateStore

> **Summary:** Akka Persistence R2DBC 1.3.12 - akka.persistence.r2dbc.state.scaladsl.R2dbcDurableStateStore

## Content

Akka Persistence R2DBC1\.3\.12 \< Back****# Packages

- [**](../../../../../index.html "Permalink")  package [root](../../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/index.html "Permalink")  package [akka](../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/persistence/index.html "Permalink")  package [persistence](../../../index.html)Definition Classes[akka](../../../../index.html)
- [**](../../../../../akka/persistence/r2dbc/index.html "Permalink")  package [r2dbc](../../index.html)Definition Classes[persistence](../../../index.html)
- [**](../../../../../akka/persistence/r2dbc/state/index.html "Permalink")  package [state](../index.html)Definition Classes[r2dbc](../../index.html)
- [**](../../../../../akka/persistence/r2dbc/state/scaladsl/index.html "Permalink")  package [scaladsl](index.html)Definition Classes[state](../index.html)
- [AdditionalColumn](AdditionalColumn.html)
- [ChangeHandler](ChangeHandler.html)
- [R2dbcDurableStateStore](R2dbcDurableStateStore.html)
[o](R2dbcDurableStateStore.html "See companion class")[akka](../../../../index.html).[persistence](../../../index.html).[r2dbc](../../index.html).[state](../index.html).[scaladsl](index.html)

# [R2dbcDurableStateStore](R2dbcDurableStateStore.html "See companion class")[**](../../../../../akka/persistence/r2dbc/state/scaladsl/R2dbcDurableStateStore$.html "Permalink")

### Companion [class R2dbcDurableStateStore](R2dbcDurableStateStore.html "See companion class")

#### object R2dbcDurableStateStore

Linear SupertypesAnyRef, Any****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. R2dbcDurableStateStore
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Value Members

1. [**](../../../../../akka/persistence/r2dbc/state/scaladsl/R2dbcDurableStateStore$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: Any): BooleanDefinition ClassesAnyRef → Any
2. [**](../../../../../akka/persistence/r2dbc/state/scaladsl/R2dbcDurableStateStore$.html###:Int "Permalink") final  def \#\#: IntDefinition ClassesAnyRef → Any
3. [**](../../../../../akka/persistence/r2dbc/state/scaladsl/R2dbcDurableStateStore$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: Any): BooleanDefinition ClassesAnyRef → Any
4. [**](../../../../../akka/persistence/r2dbc/state/scaladsl/R2dbcDurableStateStore$.html#Identifier:String "Permalink")  val Identifier: [String](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/String.html#java.lang.String)
5. [**](../../../../../akka/persistence/r2dbc/state/scaladsl/R2dbcDurableStateStore$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
6. [**](../../../../../akka/persistence/r2dbc/state/scaladsl/R2dbcDurableStateStore$.html#clone():Object "Permalink")  def clone(): AnyRefAttributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @IntrinsicCandidate() @native()
7. [**](../../../../../akka/persistence/r2dbc/state/scaladsl/R2dbcDurableStateStore$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: AnyRef): BooleanDefinition ClassesAnyRef
8. [**](../../../../../akka/persistence/r2dbc/state/scaladsl/R2dbcDurableStateStore$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: AnyRef): BooleanDefinition ClassesAnyRef → Any
9. [**](../../../../../akka/persistence/r2dbc/state/scaladsl/R2dbcDurableStateStore$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: AnyRef]Definition ClassesAnyRef → AnyAnnotations@IntrinsicCandidate() @native()
10. [**](../../../../../akka/persistence/r2dbc/state/scaladsl/R2dbcDurableStateStore$.html#hashCode():Int "Permalink")  def hashCode(): IntDefinition ClassesAnyRef → AnyAnnotations@IntrinsicCandidate() @native()
11. [**](../../../../../akka/persistence/r2dbc/state/scaladsl/R2dbcDurableStateStore$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: BooleanDefinition ClassesAny
12. [**](../../../../../akka/persistence/r2dbc/state/scaladsl/R2dbcDurableStateStore$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: AnyRef): BooleanDefinition ClassesAnyRef
13. [**](../../../../../akka/persistence/r2dbc/state/scaladsl/R2dbcDurableStateStore$.html#notify():Unit "Permalink") final  def notify(): UnitDefinition ClassesAnyRefAnnotations@IntrinsicCandidate() @native()
14. [**](../../../../../akka/persistence/r2dbc/state/scaladsl/R2dbcDurableStateStore$.html#notifyAll():Unit "Permalink") final  def notifyAll(): UnitDefinition ClassesAnyRefAnnotations@IntrinsicCandidate() @native()
15. [**](../../../../../akka/persistence/r2dbc/state/scaladsl/R2dbcDurableStateStore$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
16. [**](../../../../../akka/persistence/r2dbc/state/scaladsl/R2dbcDurableStateStore$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
17. [**](../../../../../akka/persistence/r2dbc/state/scaladsl/R2dbcDurableStateStore$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: Long, arg1: Int): UnitDefinition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
18. [**](../../../../../akka/persistence/r2dbc/state/scaladsl/R2dbcDurableStateStore$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: Long): UnitDefinition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
19. [**](../../../../../akka/persistence/r2dbc/state/scaladsl/R2dbcDurableStateStore$.html#wait():Unit "Permalink") final  def wait(): UnitDefinition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../../akka/persistence/r2dbc/state/scaladsl/R2dbcDurableStateStore$.html#finalize():Unit "Permalink")  def finalize(): UnitAttributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from AnyRef

### Inherited from Any

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-persistence-r2dbc/1.3.12/akka/index.html
- https://doc.akka.io/api/akka-persistence-r2dbc/1.3.12/akka/persistence/index.html
- https://doc.akka.io/api/akka-persistence-r2dbc/1.3.12/akka/persistence/r2dbc/index.html
- https://doc.akka.io/api/akka-persistence-r2dbc/1.3.12/akka/persistence/r2dbc/state/index.html
- https://doc.akka.io/api/akka-persistence-r2dbc/1.3.12/akka/persistence/r2dbc/state/scaladsl/AdditionalColumn$.html
- https://doc.akka.io/api/akka-persistence-r2dbc/1.3.12/akka/persistence/r2dbc/state/scaladsl/AdditionalColumn.html
- https://doc.akka.io/api/akka-persistence-r2dbc/1.3.12/akka/persistence/r2dbc/state/scaladsl/ChangeHandler.html
- https://doc.akka.io/api/akka-persistence-r2dbc/1.3.12/akka/persistence/r2dbc/state/scaladsl/R2dbcDurableStateStore$.html
- https://doc.akka.io/api/akka-persistence-r2dbc/1.3.12/akka/persistence/r2dbc/state/scaladsl/R2dbcDurableStateStore.html
- https://doc.akka.io/api/akka-persistence-r2dbc/1.3.12/akka/persistence/r2dbc/state/scaladsl/index.html
- https://doc.akka.io/api/akka-persistence-r2dbc/1.3.12/index.html

---
*Source: [https://doc.akka.io/api/akka-persistence-r2dbc/1.3.12/akka/persistence/r2dbc/state/scaladsl/R2dbcDurableStateStore$.html](https://doc.akka.io/api/akka-persistence-r2dbc/1.3.12/akka/persistence/r2dbc/state/scaladsl/R2dbcDurableStateStore$.html)*