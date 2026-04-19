---
description: Akka Persistence R2DBC 1.3.12 - akka.persistence.r2dbc.state.javadsl.AdditionalColumn
knowledge_type: official_documentation
scraped_at: '2026-04-06T03:09:50Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-persistence-r2dbc/1.3.12/akka/persistence/r2dbc/state/javadsl/AdditionalColumn$.html
title: Akka Persistence R2DBC 1.3.12 - akka.persistence.r2dbc.state.javadsl.AdditionalColumn
---

# Akka Persistence R2DBC 1.3.12 - akka.persistence.r2dbc.state.javadsl.AdditionalColumn

> **Summary:** Akka Persistence R2DBC 1.3.12 - akka.persistence.r2dbc.state.javadsl.AdditionalColumn

## Content

Akka Persistence R2DBC1\.3\.12 \< Back****# Packages

- [**](../../../../../index.html "Permalink")  package [root](../../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/index.html "Permalink")  package [akka](../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/persistence/index.html "Permalink")  package [persistence](../../../index.html)Definition Classes[akka](../../../../index.html)
- [**](../../../../../akka/persistence/r2dbc/index.html "Permalink")  package [r2dbc](../../index.html)Definition Classes[persistence](../../../index.html)
- [**](../../../../../akka/persistence/r2dbc/state/index.html "Permalink")  package [state](../index.html)Definition Classes[r2dbc](../../index.html)
- [**](../../../../../akka/persistence/r2dbc/state/javadsl/index.html "Permalink")  package [javadsl](index.html)Definition Classes[state](../index.html)
- [AdditionalColumn](AdditionalColumn.html)
- [ChangeHandler](ChangeHandler.html)
- [R2dbcDurableStateStore](R2dbcDurableStateStore.html)
[o](AdditionalColumn.html "See companion class")[akka](../../../../index.html).[persistence](../../../index.html).[r2dbc](../../index.html).[state](../index.html).[javadsl](index.html)

# [AdditionalColumn](AdditionalColumn.html "See companion class")[**](../../../../../akka/persistence/r2dbc/state/javadsl/AdditionalColumn$.html "Permalink")

### Companion [class AdditionalColumn](AdditionalColumn.html "See companion class")

#### object AdditionalColumn

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
### Type Members

1. [**](../../../../../akka/persistence/r2dbc/state/javadsl/AdditionalColumn$$Binding.html "Permalink") sealed  trait [Binding](AdditionalColumn$$Binding.html)\[\+B] extends AnyRef
2. [**](../../../../../akka/persistence/r2dbc/state/javadsl/AdditionalColumn$$Upsert.html "Permalink") final  case class [Upsert](AdditionalColumn$$Upsert.html)\[A](persistenceId: String, entityType: String, slice: Int, revision: Long, value: A) extends Product with Serializable
### Value Members

1. [**](../../../../../akka/persistence/r2dbc/state/javadsl/AdditionalColumn$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: Any): BooleanDefinition ClassesAnyRef → Any
2. [**](../../../../../akka/persistence/r2dbc/state/javadsl/AdditionalColumn$.html###:Int "Permalink") final  def \#\#: IntDefinition ClassesAnyRef → Any
3. [**](../../../../../akka/persistence/r2dbc/state/javadsl/AdditionalColumn$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: Any): BooleanDefinition ClassesAnyRef → Any
4. [**](../../../../../akka/persistence/r2dbc/state/javadsl/AdditionalColumn$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
5. [**](../../../../../akka/persistence/r2dbc/state/javadsl/AdditionalColumn$.html#bindNull[B]:akka.persistence.r2dbc.state.javadsl.AdditionalColumn.Binding[B] "Permalink")  def bindNull\[B]: [Binding](AdditionalColumn$$Binding.html)\[B]
6. [**](../../../../../akka/persistence/r2dbc/state/javadsl/AdditionalColumn$.html#bindValue[B](value:B):akka.persistence.r2dbc.state.javadsl.AdditionalColumn.Binding[B] "Permalink")  def bindValue\[B](value: B): [Binding](AdditionalColumn$$Binding.html)\[B]
7. [**](../../../../../akka/persistence/r2dbc/state/javadsl/AdditionalColumn$.html#clone():Object "Permalink")  def clone(): AnyRefAttributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @IntrinsicCandidate() @native()
8. [**](../../../../../akka/persistence/r2dbc/state/javadsl/AdditionalColumn$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: AnyRef): BooleanDefinition ClassesAnyRef
9. [**](../../../../../akka/persistence/r2dbc/state/javadsl/AdditionalColumn$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: AnyRef): BooleanDefinition ClassesAnyRef → Any
10. [**](../../../../../akka/persistence/r2dbc/state/javadsl/AdditionalColumn$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: AnyRef]Definition ClassesAnyRef → AnyAnnotations@IntrinsicCandidate() @native()
11. [**](../../../../../akka/persistence/r2dbc/state/javadsl/AdditionalColumn$.html#hashCode():Int "Permalink")  def hashCode(): IntDefinition ClassesAnyRef → AnyAnnotations@IntrinsicCandidate() @native()
12. [**](../../../../../akka/persistence/r2dbc/state/javadsl/AdditionalColumn$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: BooleanDefinition ClassesAny
13. [**](../../../../../akka/persistence/r2dbc/state/javadsl/AdditionalColumn$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: AnyRef): BooleanDefinition ClassesAnyRef
14. [**](../../../../../akka/persistence/r2dbc/state/javadsl/AdditionalColumn$.html#notify():Unit "Permalink") final  def notify(): UnitDefinition ClassesAnyRefAnnotations@IntrinsicCandidate() @native()
15. [**](../../../../../akka/persistence/r2dbc/state/javadsl/AdditionalColumn$.html#notifyAll():Unit "Permalink") final  def notifyAll(): UnitDefinition ClassesAnyRefAnnotations@IntrinsicCandidate() @native()
16. [**](../../../../../akka/persistence/r2dbc/state/javadsl/AdditionalColumn$.html#skip[B]:akka.persistence.r2dbc.state.javadsl.AdditionalColumn.Binding[B] "Permalink")  def skip\[B]: [Binding](AdditionalColumn$$Binding.html)\[B]
17. [**](../../../../../akka/persistence/r2dbc/state/javadsl/AdditionalColumn$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
18. [**](../../../../../akka/persistence/r2dbc/state/javadsl/AdditionalColumn$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
19. [**](../../../../../akka/persistence/r2dbc/state/javadsl/AdditionalColumn$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: Long, arg1: Int): UnitDefinition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
20. [**](../../../../../akka/persistence/r2dbc/state/javadsl/AdditionalColumn$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: Long): UnitDefinition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
21. [**](../../../../../akka/persistence/r2dbc/state/javadsl/AdditionalColumn$.html#wait():Unit "Permalink") final  def wait(): UnitDefinition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../../akka/persistence/r2dbc/state/javadsl/AdditionalColumn$.html#finalize():Unit "Permalink")  def finalize(): UnitAttributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from AnyRef

### Inherited from Any

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-persistence-r2dbc/1.3.12/akka/index.html
- https://doc.akka.io/api/akka-persistence-r2dbc/1.3.12/akka/persistence/index.html
- https://doc.akka.io/api/akka-persistence-r2dbc/1.3.12/akka/persistence/r2dbc/index.html
- https://doc.akka.io/api/akka-persistence-r2dbc/1.3.12/akka/persistence/r2dbc/state/index.html
- https://doc.akka.io/api/akka-persistence-r2dbc/1.3.12/akka/persistence/r2dbc/state/javadsl/AdditionalColumn$$Binding.html
- https://doc.akka.io/api/akka-persistence-r2dbc/1.3.12/akka/persistence/r2dbc/state/javadsl/AdditionalColumn$$Upsert.html
- https://doc.akka.io/api/akka-persistence-r2dbc/1.3.12/akka/persistence/r2dbc/state/javadsl/AdditionalColumn$.html
- https://doc.akka.io/api/akka-persistence-r2dbc/1.3.12/akka/persistence/r2dbc/state/javadsl/AdditionalColumn.html
- https://doc.akka.io/api/akka-persistence-r2dbc/1.3.12/akka/persistence/r2dbc/state/javadsl/ChangeHandler.html
- https://doc.akka.io/api/akka-persistence-r2dbc/1.3.12/akka/persistence/r2dbc/state/javadsl/R2dbcDurableStateStore$.html
- https://doc.akka.io/api/akka-persistence-r2dbc/1.3.12/akka/persistence/r2dbc/state/javadsl/R2dbcDurableStateStore.html
- https://doc.akka.io/api/akka-persistence-r2dbc/1.3.12/akka/persistence/r2dbc/state/javadsl/index.html
- https://doc.akka.io/api/akka-persistence-r2dbc/1.3.12/index.html

---
*Source: [https://doc.akka.io/api/akka-persistence-r2dbc/1.3.12/akka/persistence/r2dbc/state/javadsl/AdditionalColumn$.html](https://doc.akka.io/api/akka-persistence-r2dbc/1.3.12/akka/persistence/r2dbc/state/javadsl/AdditionalColumn$.html)*