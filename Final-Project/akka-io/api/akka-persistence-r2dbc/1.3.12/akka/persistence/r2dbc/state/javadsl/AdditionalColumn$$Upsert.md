---
description: Akka Persistence R2DBC 1.3.12 - akka.persistence.r2dbc.state.javadsl.AdditionalColumn.Upsert
knowledge_type: official_documentation
scraped_at: '2026-04-06T03:09:55Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-persistence-r2dbc/1.3.12/akka/persistence/r2dbc/state/javadsl/AdditionalColumn$$Upsert.html
title: Akka Persistence R2DBC 1.3.12 - akka.persistence.r2dbc.state.javadsl.AdditionalColumn.Upsert
---

# Akka Persistence R2DBC 1.3.12 - akka.persistence.r2dbc.state.javadsl.AdditionalColumn.Upsert

> **Summary:** Akka Persistence R2DBC 1.3.12 - akka.persistence.r2dbc.state.javadsl.AdditionalColumn.Upsert

## Content

Akka Persistence R2DBC1\.3\.12 \< Back****# Packages

- [**](../../../../../index.html "Permalink")  package [root](../../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/index.html "Permalink")  package [akka](../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/persistence/index.html "Permalink")  package [persistence](../../../index.html)Definition Classes[akka](../../../../index.html)
- [**](../../../../../akka/persistence/r2dbc/index.html "Permalink")  package [r2dbc](../../index.html)Definition Classes[persistence](../../../index.html)
- [**](../../../../../akka/persistence/r2dbc/state/index.html "Permalink")  package [state](../index.html)Definition Classes[r2dbc](../../index.html)
- [**](../../../../../akka/persistence/r2dbc/state/javadsl/index.html "Permalink")  package [javadsl](index.html)Definition Classes[state](../index.html)
- [**](../../../../../akka/persistence/r2dbc/state/javadsl/AdditionalColumn$.html "Permalink")  object [AdditionalColumn](AdditionalColumn$.html)Definition Classes[javadsl](index.html)Annotations@ApiMayChange()
- [Binding](AdditionalColumn$$Binding.html)
- Upsert
c[akka](../../../../index.html).[persistence](../../../index.html).[r2dbc](../../index.html).[state](../index.html).[javadsl](index.html).[AdditionalColumn](AdditionalColumn$.html)

# Upsert[**](../../../../../akka/persistence/r2dbc/state/javadsl/AdditionalColumn$$Upsert.html "Permalink")

### 

#### final  case class Upsert\[A](persistenceId: String, entityType: String, slice: Int, revision: Long, value: A) extends Product with Serializable

Linear Supertypes[Serializable](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/io/Serializable.html#java.io.Serializable), Product, Equals, AnyRef, Any****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. Upsert
2. Serializable
3. Product
4. Equals
5. AnyRef
6. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Instance Constructors

1. [**](../../../../../akka/persistence/r2dbc/state/javadsl/AdditionalColumn$$Upsert.html#<init>(persistenceId:String,entityType:String,slice:Int,revision:Long,value:A):akka.persistence.r2dbc.state.javadsl.AdditionalColumn.Upsert[A] "Permalink")  new Upsert(persistenceId: String, entityType: String, slice: Int, revision: Long, value: A)
### Value Members

1. [**](../../../../../akka/persistence/r2dbc/state/javadsl/AdditionalColumn$$Upsert.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: Any): BooleanDefinition ClassesAnyRef → Any
2. [**](../../../../../akka/persistence/r2dbc/state/javadsl/AdditionalColumn$$Upsert.html###:Int "Permalink") final  def \#\#: IntDefinition ClassesAnyRef → Any
3. [**](../../../../../akka/persistence/r2dbc/state/javadsl/AdditionalColumn$$Upsert.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: Any): BooleanDefinition ClassesAnyRef → Any
4. [**](../../../../../akka/persistence/r2dbc/state/javadsl/AdditionalColumn$$Upsert.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
5. [**](../../../../../akka/persistence/r2dbc/state/javadsl/AdditionalColumn$$Upsert.html#clone():Object "Permalink")  def clone(): AnyRefAttributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @IntrinsicCandidate() @native()
6. [**](../../../../../akka/persistence/r2dbc/state/javadsl/AdditionalColumn$$Upsert.html#entityType:String "Permalink")  val entityType: String
7. [**](../../../../../akka/persistence/r2dbc/state/javadsl/AdditionalColumn$$Upsert.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: AnyRef): BooleanDefinition ClassesAnyRef
8. [**](../../../../../akka/persistence/r2dbc/state/javadsl/AdditionalColumn$$Upsert.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: AnyRef]Definition ClassesAnyRef → AnyAnnotations@IntrinsicCandidate() @native()
9. [**](../../../../../akka/persistence/r2dbc/state/javadsl/AdditionalColumn$$Upsert.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: BooleanDefinition ClassesAny
10. [**](../../../../../akka/persistence/r2dbc/state/javadsl/AdditionalColumn$$Upsert.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: AnyRef): BooleanDefinition ClassesAnyRef
11. [**](../../../../../akka/persistence/r2dbc/state/javadsl/AdditionalColumn$$Upsert.html#notify():Unit "Permalink") final  def notify(): UnitDefinition ClassesAnyRefAnnotations@IntrinsicCandidate() @native()
12. [**](../../../../../akka/persistence/r2dbc/state/javadsl/AdditionalColumn$$Upsert.html#notifyAll():Unit "Permalink") final  def notifyAll(): UnitDefinition ClassesAnyRefAnnotations@IntrinsicCandidate() @native()
13. [**](../../../../../akka/persistence/r2dbc/state/javadsl/AdditionalColumn$$Upsert.html#persistenceId:String "Permalink")  val persistenceId: String
14. [**](../../../../../akka/persistence/r2dbc/state/javadsl/AdditionalColumn$$Upsert.html#productElementNames:Iterator[String] "Permalink")  def productElementNames: Iterator\[String]Definition ClassesProduct
15. [**](../../../../../akka/persistence/r2dbc/state/javadsl/AdditionalColumn$$Upsert.html#revision:Long "Permalink")  val revision: Long
16. [**](../../../../../akka/persistence/r2dbc/state/javadsl/AdditionalColumn$$Upsert.html#slice:Int "Permalink")  val slice: Int
17. [**](../../../../../akka/persistence/r2dbc/state/javadsl/AdditionalColumn$$Upsert.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
18. [**](../../../../../akka/persistence/r2dbc/state/javadsl/AdditionalColumn$$Upsert.html#value:A "Permalink")  val value: A
19. [**](../../../../../akka/persistence/r2dbc/state/javadsl/AdditionalColumn$$Upsert.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: Long, arg1: Int): UnitDefinition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
20. [**](../../../../../akka/persistence/r2dbc/state/javadsl/AdditionalColumn$$Upsert.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: Long): UnitDefinition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
21. [**](../../../../../akka/persistence/r2dbc/state/javadsl/AdditionalColumn$$Upsert.html#wait():Unit "Permalink") final  def wait(): UnitDefinition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../../akka/persistence/r2dbc/state/javadsl/AdditionalColumn$$Upsert.html#finalize():Unit "Permalink")  def finalize(): UnitAttributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [Serializable](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

### Inherited from Product

### Inherited from Equals

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
- https://doc.akka.io/api/akka-persistence-r2dbc/1.3.12/akka/persistence/r2dbc/state/javadsl/index.html
- https://doc.akka.io/api/akka-persistence-r2dbc/1.3.12/index.html

---
*Source: [https://doc.akka.io/api/akka-persistence-r2dbc/1.3.12/akka/persistence/r2dbc/state/javadsl/AdditionalColumn$$Upsert.html](https://doc.akka.io/api/akka-persistence-r2dbc/1.3.12/akka/persistence/r2dbc/state/javadsl/AdditionalColumn$$Upsert.html)*