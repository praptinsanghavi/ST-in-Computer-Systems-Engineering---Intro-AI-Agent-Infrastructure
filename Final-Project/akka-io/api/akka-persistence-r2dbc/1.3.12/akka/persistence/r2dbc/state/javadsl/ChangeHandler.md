---
description: Akka Persistence R2DBC 1.3.12 - akka.persistence.r2dbc.state.javadsl.ChangeHandler
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:18:05Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-persistence-r2dbc/1.3.12/akka/persistence/r2dbc/state/javadsl/ChangeHandler.html
title: Akka Persistence R2DBC 1.3.12 - akka.persistence.r2dbc.state.javadsl.ChangeHandler
---

# Akka Persistence R2DBC 1.3.12 - akka.persistence.r2dbc.state.javadsl.ChangeHandler

> **Summary:** Akka Persistence R2DBC 1.3.12 - akka.persistence.r2dbc.state.javadsl.ChangeHandler

## Content

Akka Persistence R2DBC1\.3\.12 \< Back****# Packages

- [**](../../../../../index.html "Permalink")  package [root](../../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/index.html "Permalink")  package [akka](../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/persistence/index.html "Permalink")  package [persistence](../../../index.html)Definition Classes[akka](../../../../index.html)
- [**](../../../../../akka/persistence/r2dbc/index.html "Permalink")  package [r2dbc](../../index.html)Definition Classes[persistence](../../../index.html)
- [**](../../../../../akka/persistence/r2dbc/state/index.html "Permalink")  package [state](../index.html)Definition Classes[r2dbc](../../index.html)
- [**](../../../../../akka/persistence/r2dbc/state/javadsl/index.html "Permalink")  package [javadsl](index.html)Definition Classes[state](../index.html)
- [AdditionalColumn](AdditionalColumn.html)
- ChangeHandler
- [R2dbcDurableStateStore](R2dbcDurableStateStore.html)
t[akka](../../../../index.html).[persistence](../../../index.html).[r2dbc](../../index.html).[state](../index.html).[javadsl](index.html)

# ChangeHandler[**](../../../../../akka/persistence/r2dbc/state/javadsl/ChangeHandler.html "Permalink")

### 

#### trait ChangeHandler\[A] extends AnyRef

Annotations@ApiMayChange() Linear SupertypesAnyRef, Any****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. ChangeHandler
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Abstract Value Members

1. [**](../../../../../akka/persistence/r2dbc/state/javadsl/ChangeHandler.html#process(session:akka.persistence.r2dbc.session.javadsl.R2dbcSession,change:akka.persistence.query.DurableStateChange[A]):java.util.concurrent.CompletionStage[akka.Done] "Permalink") abstract  def process(session: [R2dbcSession](../../session/javadsl/R2dbcSession.html), change: DurableStateChange\[A]): [CompletionStage](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[Done]Implement this method to perform additional processing in the same transaction as the Durable State upsert or
delete.

Implement this method to perform additional processing in the same transaction as the Durable State upsert or
delete.

The `process` method is invoked for each `DurableStateChange`. Each time a new `Connection` is passed with a new
open transaction. You can use `createStatement`, `update` and other methods provided by the R2dbcSession. The
results of several statements can be combined with `CompletionStage` composition (e.g. `thenCompose`). The
transaction will be automatically committed or rolled back when the returned `CompletionStage` is completed. Note
that an exception here will abort the transaction and fail the upsert or delete.

The `ChangeHandler` should be implemented as a stateless function without mutable state because the same
`ChangeHandler` instance may be invoked concurrently for different entities. For a specific entity (persistenceId)
one change is processed at a time and this `process` method will not be invoked with the next change for that
entity until after the returned `CompletionStage` is completed.
### Concrete Value Members

1. [**](../../../../../akka/persistence/r2dbc/state/javadsl/ChangeHandler.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: Any): BooleanDefinition ClassesAnyRef → Any
2. [**](../../../../../akka/persistence/r2dbc/state/javadsl/ChangeHandler.html###:Int "Permalink") final  def \#\#: IntDefinition ClassesAnyRef → Any
3. [**](../../../../../akka/persistence/r2dbc/state/javadsl/ChangeHandler.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: Any): BooleanDefinition ClassesAnyRef → Any
4. [**](../../../../../akka/persistence/r2dbc/state/javadsl/ChangeHandler.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
5. [**](../../../../../akka/persistence/r2dbc/state/javadsl/ChangeHandler.html#clone():Object "Permalink")  def clone(): AnyRefAttributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @IntrinsicCandidate() @native()
6. [**](../../../../../akka/persistence/r2dbc/state/javadsl/ChangeHandler.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: AnyRef): BooleanDefinition ClassesAnyRef
7. [**](../../../../../akka/persistence/r2dbc/state/javadsl/ChangeHandler.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: AnyRef): BooleanDefinition ClassesAnyRef → Any
8. [**](../../../../../akka/persistence/r2dbc/state/javadsl/ChangeHandler.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: AnyRef]Definition ClassesAnyRef → AnyAnnotations@IntrinsicCandidate() @native()
9. [**](../../../../../akka/persistence/r2dbc/state/javadsl/ChangeHandler.html#hashCode():Int "Permalink")  def hashCode(): IntDefinition ClassesAnyRef → AnyAnnotations@IntrinsicCandidate() @native()
10. [**](../../../../../akka/persistence/r2dbc/state/javadsl/ChangeHandler.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: BooleanDefinition ClassesAny
11. [**](../../../../../akka/persistence/r2dbc/state/javadsl/ChangeHandler.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: AnyRef): BooleanDefinition ClassesAnyRef
12. [**](../../../../../akka/persistence/r2dbc/state/javadsl/ChangeHandler.html#notify():Unit "Permalink") final  def notify(): UnitDefinition ClassesAnyRefAnnotations@IntrinsicCandidate() @native()
13. [**](../../../../../akka/persistence/r2dbc/state/javadsl/ChangeHandler.html#notifyAll():Unit "Permalink") final  def notifyAll(): UnitDefinition ClassesAnyRefAnnotations@IntrinsicCandidate() @native()
14. [**](../../../../../akka/persistence/r2dbc/state/javadsl/ChangeHandler.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
15. [**](../../../../../akka/persistence/r2dbc/state/javadsl/ChangeHandler.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
16. [**](../../../../../akka/persistence/r2dbc/state/javadsl/ChangeHandler.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: Long, arg1: Int): UnitDefinition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
17. [**](../../../../../akka/persistence/r2dbc/state/javadsl/ChangeHandler.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: Long): UnitDefinition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
18. [**](../../../../../akka/persistence/r2dbc/state/javadsl/ChangeHandler.html#wait():Unit "Permalink") final  def wait(): UnitDefinition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../../akka/persistence/r2dbc/state/javadsl/ChangeHandler.html#finalize():Unit "Permalink")  def finalize(): UnitAttributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from AnyRef

### Inherited from Any

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-persistence-r2dbc/1.3.12/akka/index.html
- https://doc.akka.io/api/akka-persistence-r2dbc/1.3.12/akka/persistence/index.html
- https://doc.akka.io/api/akka-persistence-r2dbc/1.3.12/akka/persistence/r2dbc/index.html
- https://doc.akka.io/api/akka-persistence-r2dbc/1.3.12/akka/persistence/r2dbc/session/javadsl/R2dbcSession.html
- https://doc.akka.io/api/akka-persistence-r2dbc/1.3.12/akka/persistence/r2dbc/state/index.html
- https://doc.akka.io/api/akka-persistence-r2dbc/1.3.12/akka/persistence/r2dbc/state/javadsl/AdditionalColumn$.html
- https://doc.akka.io/api/akka-persistence-r2dbc/1.3.12/akka/persistence/r2dbc/state/javadsl/AdditionalColumn.html
- https://doc.akka.io/api/akka-persistence-r2dbc/1.3.12/akka/persistence/r2dbc/state/javadsl/ChangeHandler.html
- https://doc.akka.io/api/akka-persistence-r2dbc/1.3.12/akka/persistence/r2dbc/state/javadsl/R2dbcDurableStateStore$.html
- https://doc.akka.io/api/akka-persistence-r2dbc/1.3.12/akka/persistence/r2dbc/state/javadsl/R2dbcDurableStateStore.html
- https://doc.akka.io/api/akka-persistence-r2dbc/1.3.12/akka/persistence/r2dbc/state/javadsl/index.html
- https://doc.akka.io/api/akka-persistence-r2dbc/1.3.12/index.html

---
*Source: [https://doc.akka.io/api/akka-persistence-r2dbc/1.3.12/akka/persistence/r2dbc/state/javadsl/ChangeHandler.html](https://doc.akka.io/api/akka-persistence-r2dbc/1.3.12/akka/persistence/r2dbc/state/javadsl/ChangeHandler.html)*