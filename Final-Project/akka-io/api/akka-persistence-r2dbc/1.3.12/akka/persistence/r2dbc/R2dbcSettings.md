---
description: Akka Persistence R2DBC 1.3.12 - akka.persistence.r2dbc.R2dbcSettings
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:19:46Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-persistence-r2dbc/1.3.12/akka/persistence/r2dbc/R2dbcSettings.html
title: Akka Persistence R2DBC 1.3.12 - akka.persistence.r2dbc.R2dbcSettings
---

# Akka Persistence R2DBC 1.3.12 - akka.persistence.r2dbc.R2dbcSettings

> **Summary:** Akka Persistence R2DBC 1.3.12 - akka.persistence.r2dbc.R2dbcSettings

## Content

Akka Persistence R2DBC1\.3\.12 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/persistence/index.html "Permalink")  package [persistence](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/persistence/r2dbc/index.html "Permalink")  package [r2dbc](index.html)Definition Classes[persistence](../index.html)
- [**](../../../akka/persistence/r2dbc/cleanup/index.html "Permalink")  package [cleanup](cleanup/index.html)Definition Classes[r2dbc](index.html)
- [**](../../../akka/persistence/r2dbc/internal/index.html "Permalink")  package [internal](internal/index.html)Definition Classes[r2dbc](index.html)
- [**](../../../akka/persistence/r2dbc/migration/index.html "Permalink")  package [migration](migration/index.html)Definition Classes[r2dbc](index.html)
- [**](../../../akka/persistence/r2dbc/query/index.html "Permalink")  package [query](query/index.html)Definition Classes[r2dbc](index.html)
- [**](../../../akka/persistence/r2dbc/session/index.html "Permalink")  package [session](session/index.html)Definition Classes[r2dbc](index.html)
- [**](../../../akka/persistence/r2dbc/snapshot/index.html "Permalink")  package [snapshot](snapshot/index.html)Definition Classes[r2dbc](index.html)
- [**](../../../akka/persistence/r2dbc/state/index.html "Permalink")  package [state](state/index.html)Definition Classes[r2dbc](index.html)
- [CleanupSettings](CleanupSettings.html "INTERNAL API")
- [CodecSettings](CodecSettings.html "INTERNAL API")
- [ConnectionFactoryProvider](ConnectionFactoryProvider.html)
- [ConnectionPoolSettings](ConnectionPoolSettings.html "INTERNAL API")
- [PublishEventsDynamicSettings](PublishEventsDynamicSettings.html "INTERNAL API")
- [QuerySettings](QuerySettings.html "INTERNAL API")
- R2dbcSettings
[c](R2dbcSettings$.html "See companion object")[akka](../../index.html).[persistence](../index.html).[r2dbc](index.html)

# [R2dbcSettings](R2dbcSettings$.html "See companion object")[**](../../../akka/persistence/r2dbc/R2dbcSettings.html "Permalink")

### Companion [object R2dbcSettings](R2dbcSettings$.html "See companion object")

#### final  class R2dbcSettings extends AnyRef

INTERNAL API

Annotations@InternalStableApi() Linear SupertypesAnyRef, Any****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. R2dbcSettings
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Value Members

1. [**](../../../akka/persistence/r2dbc/R2dbcSettings.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: Any): BooleanDefinition ClassesAnyRef → Any
2. [**](../../../akka/persistence/r2dbc/R2dbcSettings.html###:Int "Permalink") final  def \#\#: IntDefinition ClassesAnyRef → Any
3. [**](../../../akka/persistence/r2dbc/R2dbcSettings.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: Any): BooleanDefinition ClassesAnyRef → Any
4. [**](../../../akka/persistence/r2dbc/R2dbcSettings.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
5. [**](../../../akka/persistence/r2dbc/R2dbcSettings.html#cleanupSettings:akka.persistence.r2dbc.CleanupSettings "Permalink")  val cleanupSettings: [CleanupSettings](CleanupSettings.html)
6. [**](../../../akka/persistence/r2dbc/R2dbcSettings.html#clone():Object "Permalink")  def clone(): AnyRefAttributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @IntrinsicCandidate() @native()
7. [**](../../../akka/persistence/r2dbc/R2dbcSettings.html#connectionFactorSliceRanges:IndexedSeq[Range] "Permalink")  val connectionFactorSliceRanges: IndexedSeq\[Range]
8. [**](../../../akka/persistence/r2dbc/R2dbcSettings.html#dataPartitionSliceRanges:IndexedSeq[Range] "Permalink")  val dataPartitionSliceRanges: IndexedSeq\[Range]
9. [**](../../../akka/persistence/r2dbc/R2dbcSettings.html#dbTimestampMonotonicIncreasing:Boolean "Permalink")  val dbTimestampMonotonicIncreasing: Boolean
10. [**](../../../akka/persistence/r2dbc/R2dbcSettings.html#dialectName:String "Permalink")  def dialectName: StringOne of the supported dialects 'postgres', 'yugabyte', 'sqlserver' or 'h2'
11. [**](../../../akka/persistence/r2dbc/R2dbcSettings.html#durableStateAssertSingleWriter:Boolean "Permalink")  val durableStateAssertSingleWriter: Boolean
12. [**](../../../akka/persistence/r2dbc/R2dbcSettings.html#durableStateTable:String "Permalink")  val durableStateTable: String
13. [**](../../../akka/persistence/r2dbc/R2dbcSettings.html#durableStateTableWithSchema(slice:Int):String "Permalink")  def durableStateTableWithSchema(slice: Int): StringThe durable state table and schema name with data partition suffix for the given slice.

The durable state table and schema name with data partition suffix for the given slice. When number\-of\-partitions
is 1 the table name is without suffix.
14. [**](../../../akka/persistence/r2dbc/R2dbcSettings.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: AnyRef): BooleanDefinition ClassesAnyRef
15. [**](../../../akka/persistence/r2dbc/R2dbcSettings.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: AnyRef): BooleanDefinition ClassesAnyRef → Any
16. [**](../../../akka/persistence/r2dbc/R2dbcSettings.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: AnyRef]Definition ClassesAnyRef → AnyAnnotations@IntrinsicCandidate() @native()
17. [**](../../../akka/persistence/r2dbc/R2dbcSettings.html#getDurableStateTable(entityType:String):String "Permalink")  def getDurableStateTable(entityType: String): String
18. [**](../../../akka/persistence/r2dbc/R2dbcSettings.html#getDurableStateTableWithSchema(entityType:String,slice:Int):String "Permalink")  def getDurableStateTableWithSchema(entityType: String, slice: Int): StringThe durable state table and schema name for the `entityType` with data partition suffix for the given slice.

The durable state table and schema name for the `entityType` with data partition suffix for the given slice. When
number\-of\-partitions is 1 the table name is without suffix.
19. [**](../../../akka/persistence/r2dbc/R2dbcSettings.html#hashCode():Int "Permalink")  def hashCode(): IntDefinition ClassesAnyRef → AnyAnnotations@IntrinsicCandidate() @native()
20. [**](../../../akka/persistence/r2dbc/R2dbcSettings.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: BooleanDefinition ClassesAny
21. [**](../../../akka/persistence/r2dbc/R2dbcSettings.html#journalPublishEvents:Boolean "Permalink")  val journalPublishEvents: Boolean
22. [**](../../../akka/persistence/r2dbc/R2dbcSettings.html#journalTable:String "Permalink")  val journalTable: String
23. [**](../../../akka/persistence/r2dbc/R2dbcSettings.html#journalTableWithSchema(slice:Int):String "Permalink")  def journalTableWithSchema(slice: Int): StringThe journal table and schema name with data partition suffix for the given slice.

The journal table and schema name with data partition suffix for the given slice. When number\-of\-partitions is 1
the table name is without suffix.
24. [**](../../../akka/persistence/r2dbc/R2dbcSettings.html#logDbCallsExceeding:scala.concurrent.duration.FiniteDuration "Permalink")  val logDbCallsExceeding: FiniteDuration
25. [**](../../../akka/persistence/r2dbc/R2dbcSettings.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: AnyRef): BooleanDefinition ClassesAnyRef
26. [**](../../../akka/persistence/r2dbc/R2dbcSettings.html#notify():Unit "Permalink") final  def notify(): UnitDefinition ClassesAnyRefAnnotations@IntrinsicCandidate() @native()
27. [**](../../../akka/persistence/r2dbc/R2dbcSettings.html#notifyAll():Unit "Permalink") final  def notifyAll(): UnitDefinition ClassesAnyRefAnnotations@IntrinsicCandidate() @native()
28. [**](../../../akka/persistence/r2dbc/R2dbcSettings.html#numberOfDataPartitions:Int "Permalink")  val numberOfDataPartitions: Int
29. [**](../../../akka/persistence/r2dbc/R2dbcSettings.html#numberOfDatabases:Int "Permalink")  val numberOfDatabases: Int
30. [**](../../../akka/persistence/r2dbc/R2dbcSettings.html#querySettings:akka.persistence.r2dbc.QuerySettings "Permalink")  val querySettings: [QuerySettings](QuerySettings.html)
31. [**](../../../akka/persistence/r2dbc/R2dbcSettings.html#schema:Option[String] "Permalink")  val schema: Option\[String]
32. [**](../../../akka/persistence/r2dbc/R2dbcSettings.html#snapshotTableWithSchema(slice:Int):String "Permalink")  def snapshotTableWithSchema(slice: Int): StringThe snapshot table and schema name with data partition suffix for the given slice.

The snapshot table and schema name with data partition suffix for the given slice. When number\-of\-partitions is 1
the table name is without suffix.
33. [**](../../../akka/persistence/r2dbc/R2dbcSettings.html#snapshotsTable:String "Permalink")  val snapshotsTable: String
34. [**](../../../akka/persistence/r2dbc/R2dbcSettings.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
35. [**](../../../akka/persistence/r2dbc/R2dbcSettings.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesR2dbcSettings → AnyRef → Any
36. [**](../../../akka/persistence/r2dbc/R2dbcSettings.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: Long, arg1: Int): UnitDefinition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
37. [**](../../../akka/persistence/r2dbc/R2dbcSettings.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: Long): UnitDefinition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
38. [**](../../../akka/persistence/r2dbc/R2dbcSettings.html#wait():Unit "Permalink") final  def wait(): UnitDefinition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../akka/persistence/r2dbc/R2dbcSettings.html#durableStateTableWithSchema:String "Permalink")  val durableStateTableWithSchema: StringThe durable state table and schema name without data partition suffix.

The durable state table and schema name without data partition suffix.

Annotations@deprecated Deprecated*(Since version 1\.2\.2\)* Use durableStateTableWithSchema(slice)
2. [**](../../../akka/persistence/r2dbc/R2dbcSettings.html#finalize():Unit "Permalink")  def finalize(): UnitAttributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
3. [**](../../../akka/persistence/r2dbc/R2dbcSettings.html#getDurableStateTableWithSchema(entityType:String):String "Permalink")  def getDurableStateTableWithSchema(entityType: String): StringThe durable state table and schema name for the `entityType` without data partition suffix.

The durable state table and schema name for the `entityType` without data partition suffix.

Annotations@deprecated Deprecated*(Since version 1\.2\.2\)* Use getDurableStateTableWithSchema(entityType, slice)
4. [**](../../../akka/persistence/r2dbc/R2dbcSettings.html#journalTableWithSchema:String "Permalink")  val journalTableWithSchema: StringThe journal table and schema name without data partition suffix.

The journal table and schema name without data partition suffix.

Annotations@deprecated Deprecated*(Since version 1\.2\.2\)* Use journalTableWithSchema(slice)
5. [**](../../../akka/persistence/r2dbc/R2dbcSettings.html#snapshotsTableWithSchema:String "Permalink")  val snapshotsTableWithSchema: StringThe snapshot table and schema name without data partition suffix.

The snapshot table and schema name without data partition suffix.

Annotations@deprecated Deprecated*(Since version 1\.2\.2\)* Use snapshotTableWithSchema(slice)
### Inherited from AnyRef

### Inherited from Any

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-persistence-r2dbc/1.3.12/akka/index.html
- https://doc.akka.io/api/akka-persistence-r2dbc/1.3.12/akka/persistence/index.html
- https://doc.akka.io/api/akka-persistence-r2dbc/1.3.12/akka/persistence/r2dbc/CleanupSettings.html
- https://doc.akka.io/api/akka-persistence-r2dbc/1.3.12/akka/persistence/r2dbc/CodecSettings.html
- https://doc.akka.io/api/akka-persistence-r2dbc/1.3.12/akka/persistence/r2dbc/ConnectionFactoryProvider$.html
- https://doc.akka.io/api/akka-persistence-r2dbc/1.3.12/akka/persistence/r2dbc/ConnectionFactoryProvider.html
- https://doc.akka.io/api/akka-persistence-r2dbc/1.3.12/akka/persistence/r2dbc/ConnectionPoolSettings.html
- https://doc.akka.io/api/akka-persistence-r2dbc/1.3.12/akka/persistence/r2dbc/PublishEventsDynamicSettings.html
- https://doc.akka.io/api/akka-persistence-r2dbc/1.3.12/akka/persistence/r2dbc/QuerySettings.html
- https://doc.akka.io/api/akka-persistence-r2dbc/1.3.12/akka/persistence/r2dbc/R2dbcSettings$.html
- https://doc.akka.io/api/akka-persistence-r2dbc/1.3.12/akka/persistence/r2dbc/R2dbcSettings.html
- https://doc.akka.io/api/akka-persistence-r2dbc/1.3.12/akka/persistence/r2dbc/cleanup/index.html
- https://doc.akka.io/api/akka-persistence-r2dbc/1.3.12/akka/persistence/r2dbc/index.html
- https://doc.akka.io/api/akka-persistence-r2dbc/1.3.12/akka/persistence/r2dbc/internal/index.html
- https://doc.akka.io/api/akka-persistence-r2dbc/1.3.12/akka/persistence/r2dbc/migration/index.html
- https://doc.akka.io/api/akka-persistence-r2dbc/1.3.12/akka/persistence/r2dbc/query/index.html
- https://doc.akka.io/api/akka-persistence-r2dbc/1.3.12/akka/persistence/r2dbc/session/index.html
- https://doc.akka.io/api/akka-persistence-r2dbc/1.3.12/akka/persistence/r2dbc/snapshot/index.html
- https://doc.akka.io/api/akka-persistence-r2dbc/1.3.12/akka/persistence/r2dbc/state/index.html
- https://doc.akka.io/api/akka-persistence-r2dbc/1.3.12/index.html

---
*Source: [https://doc.akka.io/api/akka-persistence-r2dbc/1.3.12/akka/persistence/r2dbc/R2dbcSettings.html](https://doc.akka.io/api/akka-persistence-r2dbc/1.3.12/akka/persistence/r2dbc/R2dbcSettings.html)*