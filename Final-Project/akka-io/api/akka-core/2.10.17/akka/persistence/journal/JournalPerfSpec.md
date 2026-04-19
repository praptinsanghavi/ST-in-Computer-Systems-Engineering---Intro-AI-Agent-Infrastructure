---
description: Akka 2.10.17 - akka.persistence.journal.JournalPerfSpec
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:45:39Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/persistence/journal/JournalPerfSpec.html
title: Akka 2.10.17 - akka.persistence.journal.JournalPerfSpec
---

# Akka 2.10.17 - akka.persistence.journal.JournalPerfSpec

> **Summary:** Akka 2.10.17 - akka.persistence.journal.JournalPerfSpec

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/persistence/index.html "Permalink")  package [persistence](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/persistence/journal/index.html "Permalink")  package [journal](index.html)Definition Classes[persistence](../index.html)
- [**](../../../akka/persistence/journal/inmem/index.html "Permalink")  package [inmem](inmem/index.html)Definition Classes[journal](index.html)
- [**](../../../akka/persistence/journal/japi/index.html "Permalink")  package [japi](japi/index.html)Definition Classes[journal](index.html)
- [**](../../../akka/persistence/journal/leveldb/index.html "Permalink")  package [leveldb](leveldb/index.html)Definition Classes[journal](index.html)
- [AsyncRecovery](AsyncRecovery.html "Asynchronous message replay and sequence number recovery interface.")
- [AsyncReplay](AsyncReplay.html "A plugin may implement this trait as an optimization.")
- [AsyncReplayTimeoutException](AsyncReplayTimeoutException.html "Thrown if replay inactivity exceeds a specified timeout.")
- [AsyncWriteJournal](AsyncWriteJournal.html "Abstract journal, optimized for asynchronous, non-blocking writes.")
- [EmptyEventSeq](EmptyEventSeq.html)
- [EventAdapter](EventAdapter.html "An EventAdapter is both a WriteEventAdapter and a ReadEventAdapter.")
- [EventAdapters](EventAdapters.html "EventAdapters serves as a per-journal collection of bound event adapters.")
- [EventSeq](EventSeq.html)
- [EventsSeq](EventsSeq.html)
- [IdentityEventAdapter](IdentityEventAdapter$.html "No-op model adapter which passes through the incoming events as-is.")
- JournalPerfSpec
- [JournalSpec](JournalSpec.html "This spec aims to verify custom akka-persistence Journal implementations.")
- [PersistencePluginProxy](PersistencePluginProxy.html)
- [PersistencePluginProxyExtension](PersistencePluginProxyExtension$.html)
- [PersistencePluginProxyExtensionImpl](PersistencePluginProxyExtensionImpl.html "PersistencePluginProxyExtensionImpl is an Extension that enables initialization of the PersistencePluginProxy via configuration, without requiring any code changes or the creation of any actors.")
- [ReadEventAdapter](ReadEventAdapter.html "Facility to convert from and to specialised data models, as may be required by specialized persistence Journals.")
- [SingleEventSeq](SingleEventSeq.html)
- [Tagged](Tagged.html "The journal may support tagging of events that are used by the EventsByTag query and it may support specifying the tags via an akka.persistence.journal.EventAdapter that wraps the events in a Tagged with the given tags.")
- [WriteEventAdapter](WriteEventAdapter.html "Facility to convert to specialised data models, as may be required by specialized persistence Journals.")
[c](JournalPerfSpec$.html "See companion object")[akka](../../index.html).[persistence](../index.html).[journal](index.html)

# [JournalPerfSpec](JournalPerfSpec$.html "See companion object")[**](../../../akka/persistence/journal/JournalPerfSpec.html "Permalink")

### Companion [object JournalPerfSpec](JournalPerfSpec$.html "See companion object")

#### abstract  class JournalPerfSpec extends [JournalSpec](JournalSpec.html)

This spec measures execution times of the basic operations that an [akka.persistence.PersistentActor](../PersistentActor.html) provides,
using the provided Journal (plugin).

It is \*NOT\* meant to be a comprehensive benchmark, but rather aims to help plugin developers to easily determine
if their plugin's performance is roughly as expected. It also validates the plugin still works under "more messages" scenarios.

In case your journal plugin needs some kind of setup or teardown, override the `beforeAll` or `afterAll`
methods (don't forget to call `super` in your overridden methods).

For a Java and JUnit consumable version of the TCK please refer to [akka.persistence.japi.journal.JavaJournalPerfSpec](../japi/journal/JavaJournalPerfSpec.html).

Source[JournalPerfSpec.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-persistence-tck/src/main/scala/akka/persistence/journal/JournalPerfSpec.scala#L125)See also[akka.persistence.journal.JournalSpec](JournalSpec.html)

Linear Supertypes[JournalSpec](JournalSpec.html), [JournalCapabilityFlags](../JournalCapabilityFlags.html), [CapabilityFlags](../CapabilityFlags.html), [OptionalTests](../scalatest/OptionalTests.html), [MayVerb](../scalatest/MayVerb.html), [PluginSpec](../PluginSpec.html), BeforeAndAfterEach, BeforeAndAfterAll, SuiteMixin, Matchers, Explicitly, MatcherWords, Tolerance, AnyWordSpecLike, Documenting, Alerting, Notifying, Informing, CanVerb, MustVerb, ShouldVerb, TestRegistration, TestSuite, Suite, [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable), Assertions, TripleEquals, TripleEqualsSupport, [TestKitBase](../../testkit/TestKitBase.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Known Subclasses[JavaJournalPerfSpec](../japi/journal/JavaJournalPerfSpec.html)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. JournalPerfSpec
2. JournalSpec
3. JournalCapabilityFlags
4. CapabilityFlags
5. OptionalTests
6. MayVerb
7. PluginSpec
8. BeforeAndAfterEach
9. BeforeAndAfterAll
10. SuiteMixin
11. Matchers
12. Explicitly
13. MatcherWords
14. Tolerance
15. AnyWordSpecLike
16. Documenting
17. Alerting
18. Notifying
19. Informing
20. CanVerb
21. MustVerb
22. ShouldVerb
23. TestRegistration
24. TestSuite
25. Suite
26. Serializable
27. Assertions
28. TripleEquals
29. TripleEqualsSupport
30. TestKitBase
31. AnyRef
32. Any
Implicitly  
1. by convertToEqualizer
2. by convertToEqualizer
3. by convertToAnyShouldWrapper
4. by convertToEqualizer
5. by any2stringadd
6. by StringFormat
7. by Ensuring
8. by ArrowAssoc
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Instance Constructors

1. [**](../../../akka/persistence/journal/JournalPerfSpec.html#<init>(config:com.typesafe.config.Config):akka.persistence.journal.JournalPerfSpec "Permalink")  new JournalPerfSpec(config: Config)
### Type Members

1. [**](../../../akka/persistence/journal/JournalPerfSpec.html#AWordextendsAnyRef "Permalink") final  class AWord extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Definition ClassesMatchers
2. [**](../../../akka/persistence/journal/JournalPerfSpec.html#AfterWordextendsAnyRef "Permalink") final  class AfterWord extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected Definition ClassesAnyWordSpecLike
3. [**](../../../akka/persistence/journal/JournalPerfSpec.html#AnWordextendsAnyRef "Permalink") final  class AnWord extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Definition ClassesMatchers
4. [**](../../../akka/persistence/journal/JournalPerfSpec.html#AnyShouldWrapper[T]extendsAnyRef "Permalink") sealed  class AnyShouldWrapper\[T] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Definition ClassesMatchers
5. [**](../../../akka/persistence/journal/JournalPerfSpec.html#CheckingEqualizer[L]extendsAnyRef "Permalink")  class CheckingEqualizer\[L] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Definition ClassesTripleEqualsSupport
6. [**](../../../akka/persistence/journal/JournalPerfSpec.html#CollectedextendsSerializable "Permalink") sealed  class Collected extends SerializableAttributesprotected Definition ClassesMatchers
7. [**](../../../akka/persistence/journal/JournalPerfSpec.html#DecidedByEquality[A]extendsEquality[A] "Permalink")  class DecidedByEquality\[A] extends Equality\[A]Definition ClassesExplicitly
8. [**](../../../akka/persistence/journal/JournalPerfSpec.html#DecidedWordextendsAnyRef "Permalink")  class DecidedWord extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Definition ClassesExplicitly
9. [**](../../../akka/persistence/journal/JournalPerfSpec.html#DeterminedByEquivalence[T]extendsEquivalence[T] "Permalink")  class DeterminedByEquivalence\[T] extends Equivalence\[T]Definition ClassesExplicitly
10. [**](../../../akka/persistence/journal/JournalPerfSpec.html#DeterminedWordextendsAnyRef "Permalink")  class DeterminedWord extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Definition ClassesExplicitly
11. [**](../../../akka/persistence/journal/JournalPerfSpec.html#Equalizer[L]extendsAnyRef "Permalink")  class Equalizer\[L] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Definition ClassesTripleEqualsSupport
12. [**](../../../akka/persistence/journal/JournalPerfSpec.html#HavePropertyMatcherGeneratorextendsAnyRef "Permalink") final  class HavePropertyMatcherGenerator extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Definition ClassesMatchers
13. [**](../../../akka/persistence/journal/JournalPerfSpec.html#ItWordextendsAnyRef "Permalink") final  class ItWord extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected Definition ClassesAnyWordSpecLike
14. [**](../../../akka/persistence/journal/JournalPerfSpec.html#KeyWordextendsAnyRef "Permalink") final  class KeyWord extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Definition ClassesMatchers
15. [**](../../../akka/persistence/journal/JournalPerfSpec.html#NoArgTestextends()=>org.scalatest.OutcomewithTestData "Permalink")  trait NoArgTest extends () \=\> Outcome with TestDataAttributesprotected Definition ClassesTestSuite
16. [**](../../../akka/persistence/journal/JournalPerfSpec.html#PlusOrMinusWrapper[T]extendsAnyRef "Permalink") final  class PlusOrMinusWrapper\[T] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Definition ClassesTolerance
17. [**](../../../akka/persistence/journal/JournalPerfSpec.html#RegexWordextendsAnyRef "Permalink") final  class RegexWord extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Definition ClassesMatchers
18. [**](../../../akka/persistence/journal/JournalPerfSpec.html#RegexWrapperextendsAnyRef "Permalink") final  class RegexWrapper extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Definition ClassesMatchers
19. [**](../../../akka/persistence/journal/JournalPerfSpec.html#ResultOfBeWordForAny[T]extendsAnyRef "Permalink")  class ResultOfBeWordForAny\[T] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Definition ClassesMatchers
20. [**](../../../akka/persistence/journal/JournalPerfSpec.html#ResultOfBeWordForCollectedAny[T]extendsAnyRef "Permalink") sealed  class ResultOfBeWordForCollectedAny\[T] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Definition ClassesMatchers
21. [**](../../../akka/persistence/journal/JournalPerfSpec.html#ResultOfBeWordForCollectedArray[T]extendsMatchers.this.ResultOfBeWordForCollectedAny[Array[T]] "Permalink") final  class ResultOfBeWordForCollectedArray\[T] extends ResultOfBeWordForCollectedAny\[[Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[T]]Definition ClassesMatchers
22. [**](../../../akka/persistence/journal/JournalPerfSpec.html#ResultOfCollectedAny[T]extendsAnyRef "Permalink") final  class ResultOfCollectedAny\[T] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Definition ClassesMatchers
23. [**](../../../akka/persistence/journal/JournalPerfSpec.html#ResultOfContainWordForCollectedAny[T]extendsAnyRef "Permalink") final  class ResultOfContainWordForCollectedAny\[T] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Definition ClassesMatchers
24. [**](../../../akka/persistence/journal/JournalPerfSpec.html#ResultOfEndWithWordForCollectedStringextendsAnyRef "Permalink") final  class ResultOfEndWithWordForCollectedString extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Definition ClassesMatchers
25. [**](../../../akka/persistence/journal/JournalPerfSpec.html#ResultOfEndWithWordForStringextendsAnyRef "Permalink") final  class ResultOfEndWithWordForString extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Definition ClassesMatchers
26. [**](../../../akka/persistence/journal/JournalPerfSpec.html#ResultOfFullyMatchWordForCollectedStringextendsAnyRef "Permalink") final  class ResultOfFullyMatchWordForCollectedString extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Definition ClassesMatchers
27. [**](../../../akka/persistence/journal/JournalPerfSpec.html#ResultOfFullyMatchWordForStringextendsAnyRef "Permalink") final  class ResultOfFullyMatchWordForString extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Definition ClassesMatchers
28. [**](../../../akka/persistence/journal/JournalPerfSpec.html#ResultOfHaveWordForCollectedExtent[A]extendsAnyRef "Permalink") final  class ResultOfHaveWordForCollectedExtent\[A] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Definition ClassesMatchers
29. [**](../../../akka/persistence/journal/JournalPerfSpec.html#ResultOfHaveWordForExtent[A]extendsAnyRef "Permalink") final  class ResultOfHaveWordForExtent\[A] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Definition ClassesMatchers
30. [**](../../../akka/persistence/journal/JournalPerfSpec.html#ResultOfIncludeWordForCollectedStringextendsAnyRef "Permalink") final  class ResultOfIncludeWordForCollectedString extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Definition ClassesMatchers
31. [**](../../../akka/persistence/journal/JournalPerfSpec.html#ResultOfIncludeWordForStringextendsAnyRef "Permalink") final  class ResultOfIncludeWordForString extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Definition ClassesMatchers
32. [**](../../../akka/persistence/journal/JournalPerfSpec.html#ResultOfNotWordForCollectedAny[T]extendsAnyRef "Permalink") final  class ResultOfNotWordForCollectedAny\[T] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Definition ClassesMatchers
33. [**](../../../akka/persistence/journal/JournalPerfSpec.html#ResultOfStartWithWordForCollectedStringextendsAnyRef "Permalink") final  class ResultOfStartWithWordForCollectedString extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Definition ClassesMatchers
34. [**](../../../akka/persistence/journal/JournalPerfSpec.html#ResultOfStartWithWordForStringextendsAnyRef "Permalink") final  class ResultOfStartWithWordForString extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Definition ClassesMatchers
35. [**](../../../akka/persistence/journal/JournalPerfSpec.html#ResultOfTaggedAsInvocationOnStringextendsAnyRef "Permalink") final  class ResultOfTaggedAsInvocationOnString extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected Definition ClassesAnyWordSpecLike
36. [**](../../../akka/persistence/journal/JournalPerfSpec.html#StringCanWrapperForVerbextendsAnyRef "Permalink")  trait StringCanWrapperForVerb extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Definition ClassesCanVerb
37. [**](../../../akka/persistence/journal/JournalPerfSpec.html#StringMustWrapperForVerbextendsAnyRef "Permalink")  trait StringMustWrapperForVerb extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Definition ClassesMustVerb
38. [**](../../../akka/persistence/journal/JournalPerfSpec.html#StringShouldWrapperextendsMatchers.this.AnyShouldWrapper[String]withMatchers.this.StringShouldWrapperForVerb "Permalink") final  class StringShouldWrapper extends AnyShouldWrapper\[String] with org.scalatest.matchers.should.Matchers.StringShouldWrapperForVerbDefinition ClassesMatchers
39. [**](../../../akka/persistence/journal/JournalPerfSpec.html#StringShouldWrapperForVerbextendsAnyRef "Permalink")  trait StringShouldWrapperForVerb extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Definition ClassesShouldVerb
40. [**](../../../akka/persistence/journal/JournalPerfSpec.html#TheAfterWordextendsAnyRef "Permalink")  class TheAfterWord extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Definition ClassesExplicitly
41. [**](../../../akka/persistence/journal/JournalPerfSpec.html#TheSameInstanceAsPhraseextendsAnyRef "Permalink") final  class TheSameInstanceAsPhrase extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Definition ClassesMatchers
42. [**](../../../akka/persistence/journal/JournalPerfSpec.html#TheyWordextendsAnyRef "Permalink") final  class TheyWord extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected Definition ClassesAnyWordSpecLike
43. [**](../../../akka/persistence/journal/JournalPerfSpec.html#ValueWordextendsAnyRef "Permalink") final  class ValueWord extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Definition ClassesMatchers
44. [**](../../../akka/persistence/journal/JournalPerfSpec.html#WordSpecStringWrapperextendsAnyRef "Permalink") final  class WordSpecStringWrapper extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected Definition ClassesAnyWordSpecLike
45. [**](../../../akka/persistence/scalatest/MayVerb$StringMayWrapperForVerb.html "Permalink")  trait [StringMayWrapperForVerb](../scalatest/MayVerb$StringMayWrapperForVerb.html) extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Definition Classes[MayVerb](../scalatest/MayVerb.html)
### Abstract Value Members

1. [**](../../../akka/persistence/journal/JournalPerfSpec.html#supportsRejectingNonSerializableObjects:akka.persistence.CapabilityFlag "Permalink") abstract  def supportsRejectingNonSerializableObjects: [CapabilityFlag](../CapabilityFlag.html)When `true` enables tests which check if the Journal properly rejects
writes of objects which are not `java.lang.Serializable`.

When `true` enables tests which check if the Journal properly rejects
writes of objects which are not `java.lang.Serializable`.

Attributesprotected Definition Classes[JournalCapabilityFlags](../JournalCapabilityFlags.html)
### Concrete Value Members

1. [**](../../../akka/persistence/journal/JournalPerfSpec.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/persistence/journal/JournalPerfSpec.html#!==[T](right:org.scalactic.TripleEqualsSupport.Spread[T]):org.scalactic.TripleEqualsSupport.TripleEqualsInvocationOnSpread[T] "Permalink")  def !\=\=\[T](right: Spread\[T]): TripleEqualsInvocationOnSpread\[T]Definition ClassesTripleEqualsSupport
3. [**](../../../akka/persistence/journal/JournalPerfSpec.html#!==(right:Null):org.scalactic.TripleEqualsSupport.TripleEqualsInvocation[Null] "Permalink")  def !\=\=(right: Null): TripleEqualsInvocation\[Null]Definition ClassesTripleEqualsSupport
4. [**](../../../akka/persistence/journal/JournalPerfSpec.html#!==[T](right:T):org.scalactic.TripleEqualsSupport.TripleEqualsInvocation[T] "Permalink")  def !\=\=\[T](right: T): TripleEqualsInvocation\[T]Definition ClassesTripleEqualsSupport
5. [**](../../../akka/persistence/journal/JournalPerfSpec.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
6. [**](../../../akka/persistence/journal/JournalPerfSpec.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from JournalPerfSpec toany2stringadd\[JournalPerfSpec] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
7. [**](../../../akka/persistence/journal/JournalPerfSpec.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (JournalPerfSpec, B)ImplicitThis member is added by an implicit conversion from JournalPerfSpec toArrowAssoc\[JournalPerfSpec] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
8. [**](../../../akka/persistence/journal/JournalPerfSpec.html#<[T](right:T)(implicitevidence$1:Ordering[T]):org.scalatest.matchers.dsl.ResultOfLessThanComparison[T] "Permalink")  def \<\[T](right: T)(implicit arg0: Ordering\[T]): ResultOfLessThanComparison\[T]Definition ClassesMatchers
9. [**](../../../akka/persistence/journal/JournalPerfSpec.html#<=[T](right:T)(implicitevidence$3:Ordering[T]):org.scalatest.matchers.dsl.ResultOfLessThanOrEqualToComparison[T] "Permalink")  def \<\=\[T](right: T)(implicit arg0: Ordering\[T]): ResultOfLessThanOrEqualToComparison\[T]Definition ClassesMatchers
10. [**](../../../akka/persistence/journal/JournalPerfSpec.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
11. [**](../../../akka/persistence/journal/JournalPerfSpec.html#===[T](right:org.scalactic.TripleEqualsSupport.Spread[T]):org.scalactic.TripleEqualsSupport.TripleEqualsInvocationOnSpread[T] "Permalink")  def \=\=\=\[T](right: Spread\[T]): TripleEqualsInvocationOnSpread\[T]Definition ClassesTripleEqualsSupport
12. [**](../../../akka/persistence/journal/JournalPerfSpec.html#===(right:Null):org.scalactic.TripleEqualsSupport.TripleEqualsInvocation[Null] "Permalink")  def \=\=\=(right: Null): TripleEqualsInvocation\[Null]Definition ClassesTripleEqualsSupport
13. [**](../../../akka/persistence/journal/JournalPerfSpec.html#===[T](right:T):org.scalactic.TripleEqualsSupport.TripleEqualsInvocation[T] "Permalink")  def \=\=\=\[T](right: T): TripleEqualsInvocation\[T]Definition ClassesTripleEqualsSupport
14. [**](../../../akka/persistence/journal/JournalPerfSpec.html#>[T](right:T)(implicitevidence$2:Ordering[T]):org.scalatest.matchers.dsl.ResultOfGreaterThanComparison[T] "Permalink")  def \>\[T](right: T)(implicit arg0: Ordering\[T]): ResultOfGreaterThanComparison\[T]Definition ClassesMatchers
15. [**](../../../akka/persistence/journal/JournalPerfSpec.html#>=[T](right:T)(implicitevidence$4:Ordering[T]):org.scalatest.matchers.dsl.ResultOfGreaterThanOrEqualToComparison[T] "Permalink")  def \>\=\[T](right: T)(implicit arg0: Ordering\[T]): ResultOfGreaterThanOrEqualToComparison\[T]Definition ClassesMatchers
16. [**](../../../akka/persistence/journal/JournalPerfSpec.html#a[T](implicitevidence$5:scala.reflect.ClassTag[T]):org.scalatest.matchers.dsl.ResultOfATypeInvocation[T] "Permalink")  def a\[T](implicit arg0: [ClassTag](https://www.scala-lang.org/api/2.13.17/scala/reflect/ClassTag.html#scala.reflect.ClassTag)\[T]): ResultOfATypeInvocation\[T]Definition ClassesMatchers
17. [**](../../../akka/persistence/journal/JournalPerfSpec.html#a:Matchers.this.AWord "Permalink")  val a: [AWord](#AWordextendsAnyRef)Definition ClassesMatchers
18. [**](../../../akka/persistence/journal/JournalPerfSpec.html#actorInstanceId:Int "Permalink")  val actorInstanceId: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Attributesprotected Definition Classes[PluginSpec](../PluginSpec.html)
19. [**](../../../akka/persistence/journal/JournalPerfSpec.html#after:Explicitly.this.TheAfterWord "Permalink")  val after: [TheAfterWord](#TheAfterWordextendsAnyRef)Definition ClassesExplicitly
20. [**](../../../akka/persistence/journal/JournalPerfSpec.html#afterAll():Unit "Permalink")  def afterAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected Definition Classes[PluginSpec](../PluginSpec.html) → BeforeAndAfterAll
21. [**](../../../akka/persistence/journal/JournalPerfSpec.html#afterEach():Unit "Permalink")  def afterEach(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected Definition ClassesBeforeAndAfterEach
22. [**](../../../akka/persistence/journal/JournalPerfSpec.html#afterWord(text:String):AnyWordSpecLike.this.AfterWord "Permalink")  def afterWord(text: String): [AfterWord](#AfterWordextendsAnyRef)Attributesprotected Definition ClassesAnyWordSpecLike
23. [**](../../../akka/persistence/journal/JournalPerfSpec.html#alert:org.scalatest.Alerter "Permalink")  def alert: AlerterAttributesprotected Definition ClassesAnyWordSpecLike → Alerting
24. [**](../../../akka/persistence/journal/JournalPerfSpec.html#all(xs:String)(implicitcollecting:org.scalatest.enablers.Collecting[Char,String],implicitprettifier:org.scalactic.Prettifier,implicitpos:org.scalactic.source.Position):Matchers.this.ResultOfCollectedAny[Char] "Permalink")  def all(xs: String)(implicit collecting: Collecting\[[Char](https://www.scala-lang.org/api/2.13.17/scala/Char.html#scala.Char), String], prettifier: Prettifier, pos: Position): [ResultOfCollectedAny](#ResultOfCollectedAny[T]extendsAnyRef)\[[Char](https://www.scala-lang.org/api/2.13.17/scala/Char.html#scala.Char)]Definition ClassesMatchers
25. [**](../../../akka/persistence/journal/JournalPerfSpec.html#all[K,V,JMAP[k,v]<:java.util.Map[k,v]](xs:JMAP[K,V])(implicitcollecting:org.scalatest.enablers.Collecting[org.scalatest.Entry[K,V],JMAP[K,V]],implicitprettifier:org.scalactic.Prettifier,implicitpos:org.scalactic.source.Position):Matchers.this.ResultOfCollectedAny[org.scalatest.Entry[K,V]] "Permalink")  def all\[K, V, JMAP\[k, v] \<: [Map](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Map.html#java.util.Map)\[k, v]](xs: JMAP\[K, V])(implicit collecting: Collecting\[Entry\[K, V], JMAP\[K, V]], prettifier: Prettifier, pos: Position): [ResultOfCollectedAny](#ResultOfCollectedAny[T]extendsAnyRef)\[Entry\[K, V]]Definition ClassesMatchers
26. [**](../../../akka/persistence/journal/JournalPerfSpec.html#all[K,V,MAP[k,v]<:collection.GenMap[k,v]](xs:MAP[K,V])(implicitcollecting:org.scalatest.enablers.Collecting[(K,V),collection.GenTraversable[(K,V)]],implicitprettifier:org.scalactic.Prettifier,implicitpos:org.scalactic.source.Position):Matchers.this.ResultOfCollectedAny[(K,V)] "Permalink")  def all\[K, V, MAP\[k, v] \<: GenMap\[k, v]](xs: MAP\[K, V])(implicit collecting: Collecting\[(K, V), GenTraversable\[(K, V)]], prettifier: Prettifier, pos: Position): [ResultOfCollectedAny](#ResultOfCollectedAny[T]extendsAnyRef)\[(K, V)]Definition ClassesMatchers
27. [**](../../../akka/persistence/journal/JournalPerfSpec.html#all[E,C[_]](xs:C[E])(implicitcollecting:org.scalatest.enablers.Collecting[E,C[E]],implicitprettifier:org.scalactic.Prettifier,implicitpos:org.scalactic.source.Position):Matchers.this.ResultOfCollectedAny[E] "Permalink")  def all\[E, C\[\_]](xs: C\[E])(implicit collecting: Collecting\[E, C\[E]], prettifier: Prettifier, pos: Position): [ResultOfCollectedAny](#ResultOfCollectedAny[T]extendsAnyRef)\[E]Definition ClassesMatchers
28. [**](../../../akka/persistence/journal/JournalPerfSpec.html#allElementsOf[R](elements:collection.GenTraversable[R]):org.scalatest.matchers.dsl.ResultOfAllElementsOfApplication "Permalink")  def allElementsOf\[R](elements: GenTraversable\[R]): ResultOfAllElementsOfApplicationDefinition ClassesMatchers
29. [**](../../../akka/persistence/journal/JournalPerfSpec.html#allOf(firstEle:Any,secondEle:Any,remainingEles:Any*)(implicitpos:org.scalactic.source.Position):org.scalatest.matchers.dsl.ResultOfAllOfApplication "Permalink")  def allOf(firstEle: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), secondEle: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), remainingEles: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)\*)(implicit pos: Position): ResultOfAllOfApplicationDefinition ClassesMatchers
30. [**](../../../akka/persistence/journal/JournalPerfSpec.html#an[T](implicitevidence$6:scala.reflect.ClassTag[T]):org.scalatest.matchers.dsl.ResultOfAnTypeInvocation[T] "Permalink")  def an\[T](implicit arg0: [ClassTag](https://www.scala-lang.org/api/2.13.17/scala/reflect/ClassTag.html#scala.reflect.ClassTag)\[T]): ResultOfAnTypeInvocation\[T]Definition ClassesMatchers
31. [**](../../../akka/persistence/journal/JournalPerfSpec.html#an:Matchers.this.AnWord "Permalink")  val an: [AnWord](#AnWordextendsAnyRef)Definition ClassesMatchers
32. [**](../../../akka/persistence/journal/JournalPerfSpec.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
33. [**](../../../akka/persistence/journal/JournalPerfSpec.html#assert(condition:Boolean,clue:Any)(implicitprettifier:org.scalactic.Prettifier,implicitpos:org.scalactic.source.Position):org.scalatest.Assertion "Permalink") macro  def assert(condition: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), clue: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any))(implicit prettifier: Prettifier, pos: Position): AssertionDefinition ClassesAssertions
34. [**](../../../akka/persistence/journal/JournalPerfSpec.html#assert(condition:Boolean)(implicitprettifier:org.scalactic.Prettifier,implicitpos:org.scalactic.source.Position):org.scalatest.Assertion "Permalink") macro  def assert(condition: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean))(implicit prettifier: Prettifier, pos: Position): AssertionDefinition ClassesAssertions
35. [**](../../../akka/persistence/journal/JournalPerfSpec.html#assertCompiles(code:String)(implicitpos:org.scalactic.source.Position):org.scalatest.Assertion "Permalink") macro  def assertCompiles(code: String)(implicit pos: Position): AssertionDefinition ClassesAssertions
36. [**](../../../akka/persistence/journal/JournalPerfSpec.html#assertDoesNotCompile(code:String)(implicitpos:org.scalactic.source.Position):org.scalatest.Assertion "Permalink") macro  def assertDoesNotCompile(code: String)(implicit pos: Position): AssertionDefinition ClassesAssertions
37. [**](../../../akka/persistence/journal/JournalPerfSpec.html#assertForDuration[A](a:=>A,max:scala.concurrent.duration.FiniteDuration,interval:scala.concurrent.duration.Duration):A "Permalink")  def assertForDuration\[A](a: \=\> A, max: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), interval: [Duration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/Duration.html#scala.concurrent.duration.Duration) \= 100\.millis): AEvaluate the given assert every `interval` until exception is thrown or `max` timeout is expired.

Evaluate the given assert every `interval` until exception is thrown or `max` timeout is expired.

Returns the result of last evaluation of the assertion.

If no timeout is given, take it from the innermost enclosing `within`
block.

Note that the timeout is scaled using Duration.dilated,
which uses the configuration entry "akka.test.timefactor".

Definition Classes[TestKitBase](../../testkit/TestKitBase.html)
38. [**](../../../akka/persistence/journal/JournalPerfSpec.html#assertResult(expected:Any)(actual:Any)(implicitprettifier:org.scalactic.Prettifier,implicitpos:org.scalactic.source.Position):org.scalatest.Assertion "Permalink")  def assertResult(expected: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any))(actual: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any))(implicit prettifier: Prettifier, pos: Position): AssertionDefinition ClassesAssertions
39. [**](../../../akka/persistence/journal/JournalPerfSpec.html#assertResult(expected:Any,clue:Any)(actual:Any)(implicitprettifier:org.scalactic.Prettifier,implicitpos:org.scalactic.source.Position):org.scalatest.Assertion "Permalink")  def assertResult(expected: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), clue: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any))(actual: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any))(implicit prettifier: Prettifier, pos: Position): AssertionDefinition ClassesAssertions
40. [**](../../../akka/persistence/journal/JournalPerfSpec.html#assertThrows[T<:AnyRef](f:=>Any)(implicitclassTag:scala.reflect.ClassTag[T],implicitpos:org.scalactic.source.Position):org.scalatest.Assertion "Permalink")  def assertThrows\[T \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)](f: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any))(implicit classTag: [ClassTag](https://www.scala-lang.org/api/2.13.17/scala/reflect/ClassTag.html#scala.reflect.ClassTag)\[T], pos: Position): AssertionDefinition ClassesAssertions
41. [**](../../../akka/persistence/journal/JournalPerfSpec.html#assertTypeError(code:String)(implicitpos:org.scalactic.source.Position):org.scalatest.Assertion "Permalink") macro  def assertTypeError(code: String)(implicit pos: Position): AssertionDefinition ClassesAssertions
42. [**](../../../akka/persistence/journal/JournalPerfSpec.html#assume(condition:Boolean,clue:Any)(implicitprettifier:org.scalactic.Prettifier,implicitpos:org.scalactic.source.Position):org.scalatest.Assertion "Permalink") macro  def assume(condition: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), clue: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any))(implicit prettifier: Prettifier, pos: Position): AssertionDefinition ClassesAssertions
43. [**](../../../akka/persistence/journal/JournalPerfSpec.html#assume(condition:Boolean)(implicitprettifier:org.scalactic.Prettifier,implicitpos:org.scalactic.source.Position):org.scalatest.Assertion "Permalink") macro  def assume(condition: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean))(implicit prettifier: Prettifier, pos: Position): AssertionDefinition ClassesAssertions
44. [**](../../../akka/persistence/journal/JournalPerfSpec.html#atLeast(num:Int,xs:String)(implicitcollecting:org.scalatest.enablers.Collecting[Char,String],implicitprettifier:org.scalactic.Prettifier,implicitpos:org.scalactic.source.Position):Matchers.this.ResultOfCollectedAny[Char] "Permalink")  def atLeast(num: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), xs: String)(implicit collecting: Collecting\[[Char](https://www.scala-lang.org/api/2.13.17/scala/Char.html#scala.Char), String], prettifier: Prettifier, pos: Position): [ResultOfCollectedAny](#ResultOfCollectedAny[T]extendsAnyRef)\[[Char](https://www.scala-lang.org/api/2.13.17/scala/Char.html#scala.Char)]Definition ClassesMatchers
45. [**](../../../akka/persistence/journal/JournalPerfSpec.html#atLeast[K,V,JMAP[k,v]<:java.util.Map[k,v]](num:Int,xs:JMAP[K,V])(implicitcollecting:org.scalatest.enablers.Collecting[org.scalatest.Entry[K,V],JMAP[K,V]],implicitprettifier:org.scalactic.Prettifier,implicitpos:org.scalactic.source.Position):Matchers.this.ResultOfCollectedAny[org.scalatest.Entry[K,V]] "Permalink")  def atLeast\[K, V, JMAP\[k, v] \<: [Map](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Map.html#java.util.Map)\[k, v]](num: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), xs: JMAP\[K, V])(implicit collecting: Collecting\[Entry\[K, V], JMAP\[K, V]], prettifier: Prettifier, pos: Position): [ResultOfCollectedAny](#ResultOfCollectedAny[T]extendsAnyRef)\[Entry\[K, V]]Definition ClassesMatchers
46. [**](../../../akka/persistence/journal/JournalPerfSpec.html#atLeast[K,V,MAP[k,v]<:collection.GenMap[k,v]](num:Int,xs:MAP[K,V])(implicitcollecting:org.scalatest.enablers.Collecting[(K,V),collection.GenTraversable[(K,V)]],implicitprettifier:org.scalactic.Prettifier,implicitpos:org.scalactic.source.Position):Matchers.this.ResultOfCollectedAny[(K,V)] "Permalink")  def atLeast\[K, V, MAP\[k, v] \<: GenMap\[k, v]](num: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), xs: MAP\[K, V])(implicit collecting: Collecting\[(K, V), GenTraversable\[(K, V)]], prettifier: Prettifier, pos: Position): [ResultOfCollectedAny](#ResultOfCollectedAny[T]extendsAnyRef)\[(K, V)]Definition ClassesMatchers
47. [**](../../../akka/persistence/journal/JournalPerfSpec.html#atLeast[E,C[_]](num:Int,xs:C[E])(implicitcollecting:org.scalatest.enablers.Collecting[E,C[E]],implicitprettifier:org.scalactic.Prettifier,implicitpos:org.scalactic.source.Position):Matchers.this.ResultOfCollectedAny[E] "Permalink")  def atLeast\[E, C\[\_]](num: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), xs: C\[E])(implicit collecting: Collecting\[E, C\[E]], prettifier: Prettifier, pos: Position): [ResultOfCollectedAny](#ResultOfCollectedAny[T]extendsAnyRef)\[E]Definition ClassesMatchers
48. [**](../../../akka/persistence/journal/JournalPerfSpec.html#atLeastOneElementOf(elements:collection.GenTraversable[Any]):org.scalatest.matchers.dsl.ResultOfAtLeastOneElementOfApplication "Permalink")  def atLeastOneElementOf(elements: GenTraversable\[[Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)]): ResultOfAtLeastOneElementOfApplicationDefinition ClassesMatchers
49. [**](../../../akka/persistence/journal/JournalPerfSpec.html#atLeastOneOf(firstEle:Any,secondEle:Any,remainingEles:Any*)(implicitpos:org.scalactic.source.Position):org.scalatest.matchers.dsl.ResultOfAtLeastOneOfApplication "Permalink")  def atLeastOneOf(firstEle: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), secondEle: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), remainingEles: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)\*)(implicit pos: Position): ResultOfAtLeastOneOfApplicationDefinition ClassesMatchers
50. [**](../../../akka/persistence/journal/JournalPerfSpec.html#atMost(num:Int,xs:String)(implicitcollecting:org.scalatest.enablers.Collecting[Char,String],implicitprettifier:org.scalactic.Prettifier,implicitpos:org.scalactic.source.Position):Matchers.this.ResultOfCollectedAny[Char] "Permalink")  def atMost(num: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), xs: String)(implicit collecting: Collecting\[[Char](https://www.scala-lang.org/api/2.13.17/scala/Char.html#scala.Char), String], prettifier: Prettifier, pos: Position): [ResultOfCollectedAny](#ResultOfCollectedAny[T]extendsAnyRef)\[[Char](https://www.scala-lang.org/api/2.13.17/scala/Char.html#scala.Char)]Definition ClassesMatchers
51. [**](../../../akka/persistence/journal/JournalPerfSpec.html#atMost[K,V,JMAP[k,v]<:java.util.Map[k,v]](num:Int,xs:JMAP[K,V])(implicitcollecting:org.scalatest.enablers.Collecting[org.scalatest.Entry[K,V],JMAP[K,V]],implicitprettifier:org.scalactic.Prettifier,implicitpos:org.scalactic.source.Position):Matchers.this.ResultOfCollectedAny[org.scalatest.Entry[K,V]] "Permalink")  def atMost\[K, V, JMAP\[k, v] \<: [Map](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Map.html#java.util.Map)\[k, v]](num: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), xs: JMAP\[K, V])(implicit collecting: Collecting\[Entry\[K, V], JMAP\[K, V]], prettifier: Prettifier, pos: Position): [ResultOfCollectedAny](#ResultOfCollectedAny[T]extendsAnyRef)\[Entry\[K, V]]Definition ClassesMatchers
52. [**](../../../akka/persistence/journal/JournalPerfSpec.html#atMost[K,V,MAP[k,v]<:collection.GenMap[k,v]](num:Int,xs:MAP[K,V])(implicitcollecting:org.scalatest.enablers.Collecting[(K,V),collection.GenTraversable[(K,V)]],implicitprettifier:org.scalactic.Prettifier,implicitpos:org.scalactic.source.Position):Matchers.this.ResultOfCollectedAny[(K,V)] "Permalink")  def atMost\[K, V, MAP\[k, v] \<: GenMap\[k, v]](num: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), xs: MAP\[K, V])(implicit collecting: Collecting\[(K, V), GenTraversable\[(K, V)]], prettifier: Prettifier, pos: Position): [ResultOfCollectedAny](#ResultOfCollectedAny[T]extendsAnyRef)\[(K, V)]Definition ClassesMatchers
53. [**](../../../akka/persistence/journal/JournalPerfSpec.html#atMost[E,C[_]](num:Int,xs:C[E])(implicitcollecting:org.scalatest.enablers.Collecting[E,C[E]],implicitprettifier:org.scalactic.Prettifier,implicitpos:org.scalactic.source.Position):Matchers.this.ResultOfCollectedAny[E] "Permalink")  def atMost\[E, C\[\_]](num: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), xs: C\[E])(implicit collecting: Collecting\[E, C\[E]], prettifier: Prettifier, pos: Position): [ResultOfCollectedAny](#ResultOfCollectedAny[T]extendsAnyRef)\[E]Definition ClassesMatchers
54. [**](../../../akka/persistence/journal/JournalPerfSpec.html#atMostOneElementOf[R](elements:collection.GenTraversable[R]):org.scalatest.matchers.dsl.ResultOfAtMostOneElementOfApplication "Permalink")  def atMostOneElementOf\[R](elements: GenTraversable\[R]): ResultOfAtMostOneElementOfApplicationDefinition ClassesMatchers
55. [**](../../../akka/persistence/journal/JournalPerfSpec.html#atMostOneOf(firstEle:Any,secondEle:Any,remainingEles:Any*)(implicitpos:org.scalactic.source.Position):org.scalatest.matchers.dsl.ResultOfAtMostOneOfApplication "Permalink")  def atMostOneOf(firstEle: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), secondEle: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), remainingEles: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)\*)(implicit pos: Position): ResultOfAtMostOneOfApplicationDefinition ClassesMatchers
56. [**](../../../akka/persistence/journal/JournalPerfSpec.html#awaitAssert[A](a:=>A,max:scala.concurrent.duration.Duration,interval:scala.concurrent.duration.Duration):A "Permalink")  def awaitAssert\[A](a: \=\> A, max: [Duration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/Duration.html#scala.concurrent.duration.Duration) \= Duration.Undefined, interval: [Duration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/Duration.html#scala.concurrent.duration.Duration) \= 100\.millis): AEvaluate the given assert every `interval` until it does not throw an exception and return the
result.

Evaluate the given assert every `interval` until it does not throw an exception and return the
result.

If the `max` timeout expires the last exception is thrown.

If no timeout is given, take it from the innermost enclosing `within`
block.

Note that the timeout is scaled using Duration.dilated,
which uses the configuration entry "akka.test.timefactor".

Definition Classes[TestKitBase](../../testkit/TestKitBase.html)
57. [**](../../../akka/persistence/journal/JournalPerfSpec.html#awaitCond(p:=>Boolean,max:scala.concurrent.duration.Duration,interval:scala.concurrent.duration.Duration,message:String):Unit "Permalink")  def awaitCond(p: \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), max: [Duration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/Duration.html#scala.concurrent.duration.Duration) \= Duration.Undefined, interval: [Duration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/Duration.html#scala.concurrent.duration.Duration) \= 100\.millis, message: String \= ""): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Await until the given condition evaluates to `true` or the timeout
expires, whichever comes first.

Await until the given condition evaluates to `true` or the timeout
expires, whichever comes first.

If no timeout is given, take it from the innermost enclosing `within`
block.

Note that the timeout is scaled using Duration.dilated,
which uses the configuration entry "akka.test.timefactor".

Definition Classes[TestKitBase](../../testkit/TestKitBase.html)
58. [**](../../../akka/persistence/journal/JournalPerfSpec.html#awaitDurationMillis:Long "Permalink")  def awaitDurationMillis: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)Override in order to customize timeouts used for expectMsg, in order to tune the awaits to your journal's perf
59. [**](../../../akka/persistence/journal/JournalPerfSpec.html#be:org.scalatest.matchers.dsl.BeWord "Permalink")  val be: BeWordDefinition ClassesMatcherWords
60. [**](../../../akka/persistence/journal/JournalPerfSpec.html#beforeAll():Unit "Permalink")  def beforeAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected Definition Classes[PluginSpec](../PluginSpec.html) → BeforeAndAfterAll
61. [**](../../../akka/persistence/journal/JournalPerfSpec.html#beforeEach():Unit "Permalink")  def beforeEach(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected Definition Classes[JournalSpec](JournalSpec.html) → [PluginSpec](../PluginSpec.html) → BeforeAndAfterEach
62. [**](../../../akka/persistence/journal/JournalPerfSpec.html#behave:org.scalatest.verbs.BehaveWord "Permalink")  val behave: BehaveWordAttributesprotected Definition ClassesAnyWordSpecLike
63. [**](../../../akka/persistence/journal/JournalPerfSpec.html#benchActor(replyAfter:Int):akka.actor.ActorRef "Permalink")  def benchActor(replyAfter: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [ActorRef](../../actor/ActorRef.html)
64. [**](../../../akka/persistence/journal/JournalPerfSpec.html#between(from:Int,upTo:Int,xs:String)(implicitcollecting:org.scalatest.enablers.Collecting[Char,String],implicitprettifier:org.scalactic.Prettifier,implicitpos:org.scalactic.source.Position):Matchers.this.ResultOfCollectedAny[Char] "Permalink")  def between(from: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), upTo: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), xs: String)(implicit collecting: Collecting\[[Char](https://www.scala-lang.org/api/2.13.17/scala/Char.html#scala.Char), String], prettifier: Prettifier, pos: Position): [ResultOfCollectedAny](#ResultOfCollectedAny[T]extendsAnyRef)\[[Char](https://www.scala-lang.org/api/2.13.17/scala/Char.html#scala.Char)]Definition ClassesMatchers
65. [**](../../../akka/persistence/journal/JournalPerfSpec.html#between[K,V,JMAP[k,v]<:java.util.Map[k,v]](from:Int,upTo:Int,xs:JMAP[K,V])(implicitcollecting:org.scalatest.enablers.Collecting[org.scalatest.Entry[K,V],JMAP[K,V]],implicitprettifier:org.scalactic.Prettifier,implicitpos:org.scalactic.source.Position):Matchers.this.ResultOfCollectedAny[org.scalatest.Entry[K,V]] "Permalink")  def between\[K, V, JMAP\[k, v] \<: [Map](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Map.html#java.util.Map)\[k, v]](from: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), upTo: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), xs: JMAP\[K, V])(implicit collecting: Collecting\[Entry\[K, V], JMAP\[K, V]], prettifier: Prettifier, pos: Position): [ResultOfCollectedAny](#ResultOfCollectedAny[T]extendsAnyRef)\[Entry\[K, V]]Definition ClassesMatchers
66. [**](../../../akka/persistence/journal/JournalPerfSpec.html#between[E,C[_]](from:Int,upTo:Int,xs:C[E])(implicitcollecting:org.scalatest.enablers.Collecting[E,C[E]],implicitprettifier:org.scalactic.Prettifier,implicitpos:org.scalactic.source.Position):Matchers.this.ResultOfCollectedAny[E] "Permalink")  def between\[E, C\[\_]](from: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), upTo: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), xs: C\[E])(implicit collecting: Collecting\[E, C\[E]], prettifier: Prettifier, pos: Position): [ResultOfCollectedAny](#ResultOfCollectedAny[T]extendsAnyRef)\[E]Definition ClassesMatchers
67. [**](../../../akka/persistence/journal/JournalPerfSpec.html#cancel(cause:Throwable)(implicitpos:org.scalactic.source.Position):Nothing "Permalink")  def cancel(cause: Throwable)(implicit pos: Position): [Nothing](https://www.scala-lang.org/api/2.13.17/scala/Nothing.html#scala.Nothing)Definition ClassesAssertions
68. [**](../../../akka/persistence/journal/JournalPerfSpec.html#cancel(message:String,cause:Throwable)(implicitpos:org.scalactic.source.Position):Nothing "Permalink")  def cancel(message: String, cause: Throwable)(implicit pos: Position): [Nothing](https://www.scala-lang.org/api/2.13.17/scala/Nothing.html#scala.Nothing)Definition ClassesAssertions
69. [**](../../../akka/persistence/journal/JournalPerfSpec.html#cancel(message:String)(implicitpos:org.scalactic.source.Position):Nothing "Permalink")  def cancel(message: String)(implicit pos: Position): [Nothing](https://www.scala-lang.org/api/2.13.17/scala/Nothing.html#scala.Nothing)Definition ClassesAssertions
70. [**](../../../akka/persistence/journal/JournalPerfSpec.html#cancel()(implicitpos:org.scalactic.source.Position):Nothing "Permalink")  def cancel()(implicit pos: Position): [Nothing](https://www.scala-lang.org/api/2.13.17/scala/Nothing.html#scala.Nothing)Definition ClassesAssertions
71. [**](../../../akka/persistence/journal/JournalPerfSpec.html#childActorOf(props:akka.actor.Props):akka.actor.ActorRef "Permalink")  def childActorOf(props: [Props](../../actor/Props.html)): [ActorRef](../../actor/ActorRef.html)Spawns an actor as a child of this test actor with an auto\-generated name and stopping supervisor strategy, returning the child's ActorRef.

Spawns an actor as a child of this test actor with an auto\-generated name and stopping supervisor strategy, returning the child's ActorRef.

propsProps to create the child actor

Definition Classes[TestKitBase](../../testkit/TestKitBase.html)
72. [**](../../../akka/persistence/journal/JournalPerfSpec.html#childActorOf(props:akka.actor.Props,name:String):akka.actor.ActorRef "Permalink")  def childActorOf(props: [Props](../../actor/Props.html), name: String): [ActorRef](../../actor/ActorRef.html)Spawns an actor as a child of this test actor with a stopping supervisor strategy, and returns the child's ActorRef.

Spawns an actor as a child of this test actor with a stopping supervisor strategy, and returns the child's ActorRef.

propsProps to create the child actor

nameActor name for the child actor

Definition Classes[TestKitBase](../../testkit/TestKitBase.html)
73. [**](../../../akka/persistence/journal/JournalPerfSpec.html#childActorOf(props:akka.actor.Props,supervisorStrategy:akka.actor.SupervisorStrategy):akka.actor.ActorRef "Permalink")  def childActorOf(props: [Props](../../actor/Props.html), supervisorStrategy: [SupervisorStrategy](../../actor/SupervisorStrategy.html)): [ActorRef](../../actor/ActorRef.html)Spawns an actor as a child of this test actor with an auto\-generated name, and returns the child's ActorRef.

Spawns an actor as a child of this test actor with an auto\-generated name, and returns the child's ActorRef.

propsProps to create the child actor

supervisorStrategyStrategy should decide what to do with failures in the actor.

Definition Classes[TestKitBase](../../testkit/TestKitBase.html)
74. [**](../../../akka/persistence/journal/JournalPerfSpec.html#childActorOf(props:akka.actor.Props,name:String,supervisorStrategy:akka.actor.SupervisorStrategy):akka.actor.ActorRef "Permalink")  def childActorOf(props: [Props](../../actor/Props.html), name: String, supervisorStrategy: [SupervisorStrategy](../../actor/SupervisorStrategy.html)): [ActorRef](../../actor/ActorRef.html)Spawns an actor as a child of this test actor, and returns the child's ActorRef.

Spawns an actor as a child of this test actor, and returns the child's ActorRef.

propsProps to create the child actor

nameActor name for the child actor

supervisorStrategyStrategy should decide what to do with failures in the actor.

Definition Classes[TestKitBase](../../testkit/TestKitBase.html)
75. [**](../../../akka/persistence/journal/JournalPerfSpec.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
76. [**](../../../akka/persistence/journal/JournalPerfSpec.html#compile:org.scalatest.verbs.CompileWord "Permalink")  val compile: CompileWordDefinition ClassesMatcherWords
77. [**](../../../akka/persistence/journal/JournalPerfSpec.html#config:com.typesafe.config.Config "Permalink")  val config: ConfigDefinition Classes[PluginSpec](../PluginSpec.html)
78. [**](../../../akka/persistence/journal/JournalPerfSpec.html#contain:org.scalatest.matchers.dsl.ContainWord "Permalink")  val contain: ContainWordDefinition ClassesMatcherWords
79. [**](../../../akka/persistence/journal/JournalPerfSpec.html#convertEquivalenceToAToBConstraint[A,B](equivalenceOfB:org.scalactic.Equivalence[B])(implicitev:A<:<B):org.scalactic.CanEqual[A,B] "Permalink")  def convertEquivalenceToAToBConstraint\[A, B](equivalenceOfB: Equivalence\[B])(implicit ev: [\<:\<](https://www.scala-lang.org/api/2.13.17/scala/$less$colon$less.html#scala.%3C:%3C)\[A, B]): CanEqual\[A, B]Definition ClassesTripleEquals → TripleEqualsSupport
80. [**](../../../akka/persistence/journal/JournalPerfSpec.html#convertEquivalenceToBToAConstraint[A,B](equivalenceOfA:org.scalactic.Equivalence[A])(implicitev:B<:<A):org.scalactic.CanEqual[A,B] "Permalink")  def convertEquivalenceToBToAConstraint\[A, B](equivalenceOfA: Equivalence\[A])(implicit ev: [\<:\<](https://www.scala-lang.org/api/2.13.17/scala/$less$colon$less.html#scala.%3C:%3C)\[B, A]): CanEqual\[A, B]Definition ClassesTripleEquals → TripleEqualsSupport
81. [**](../../../akka/persistence/journal/JournalPerfSpec.html#convertNumericToPlusOrMinusWrapper[T](pivot:T)(implicitevidence$2:Numeric[T]):Tolerance.this.PlusOrMinusWrapper[T] "Permalink") implicit  def convertNumericToPlusOrMinusWrapper\[T](pivot: T)(implicit arg0: Numeric\[T]): [PlusOrMinusWrapper](#PlusOrMinusWrapper[T]extendsAnyRef)\[T]Definition ClassesTolerance
82. [**](../../../akka/persistence/journal/JournalPerfSpec.html#convertSymbolToHavePropertyMatcherGenerator(symbol:Symbol)(implicitprettifier:org.scalactic.Prettifier,implicitpos:org.scalactic.source.Position):Matchers.this.HavePropertyMatcherGenerator "Permalink") implicit  def convertSymbolToHavePropertyMatcherGenerator(symbol: [Symbol](https://www.scala-lang.org/api/2.13.17/scala/Symbol.html#scala.Symbol))(implicit prettifier: Prettifier, pos: Position): [HavePropertyMatcherGenerator](#HavePropertyMatcherGeneratorextendsAnyRef)Definition ClassesMatchers
83. [**](../../../akka/persistence/journal/JournalPerfSpec.html#convertToAnyShouldWrapper[T](o:T)(implicitpos:org.scalactic.source.Position,implicitprettifier:org.scalactic.Prettifier):Matchers.this.AnyShouldWrapper[T] "Permalink") implicit  def convertToAnyShouldWrapper\[T](o: T)(implicit pos: Position, prettifier: Prettifier): [AnyShouldWrapper](#AnyShouldWrapper[T]extendsAnyRef)\[T]Definition ClassesMatchers
84. [**](../../../akka/persistence/journal/JournalPerfSpec.html#convertToCheckingEqualizer[T](left:T):TripleEquals.this.CheckingEqualizer[T] "Permalink")  def convertToCheckingEqualizer\[T](left: T): [CheckingEqualizer](#CheckingEqualizer[L]extendsAnyRef)\[T]Definition ClassesTripleEquals → TripleEqualsSupport
85. [**](../../../akka/persistence/journal/JournalPerfSpec.html#convertToEqualizer[T](left:T):TripleEquals.this.Equalizer[T] "Permalink") implicit  def convertToEqualizer\[T](left: T): [Equalizer](#Equalizer[L]extendsAnyRef)\[T]Definition ClassesTripleEquals → TripleEqualsSupport
86. [**](../../../akka/persistence/journal/JournalPerfSpec.html#convertToRegexWrapper(o:scala.util.matching.Regex):Matchers.this.RegexWrapper "Permalink") implicit  def convertToRegexWrapper(o: [Regex](https://www.scala-lang.org/api/2.13.17/scala/util/matching/Regex.html#scala.util.matching.Regex)): [RegexWrapper](#RegexWrapperextendsAnyRef)Definition ClassesMatchers
87. [**](../../../akka/persistence/journal/JournalPerfSpec.html#convertToStringCanWrapper(o:String)(implicitposition:org.scalactic.source.Position):CanVerb.this.StringCanWrapperForVerb "Permalink") implicit  def convertToStringCanWrapper(o: String)(implicit position: Position): [StringCanWrapperForVerb](#StringCanWrapperForVerbextendsAnyRef)Definition ClassesCanVerb
88. [**](../../../akka/persistence/journal/JournalPerfSpec.html#convertToStringMayWrapper(o:String):MayVerb.this.StringMayWrapperForVerb "Permalink") implicit  def convertToStringMayWrapper(o: String): [StringMayWrapperForVerb](#StringMayWrapperForVerbextendsAnyRef)Implicitly converts an object of type `String` to a `StringMayWrapper`,
to enable `may` methods to be invokable on that object.

Implicitly converts an object of type `String` to a `StringMayWrapper`,
to enable `may` methods to be invokable on that object.

Definition Classes[MayVerb](../scalatest/MayVerb.html)
89. [**](../../../akka/persistence/journal/JournalPerfSpec.html#convertToStringMustWrapperForVerb(o:String)(implicitposition:org.scalactic.source.Position):MustVerb.this.StringMustWrapperForVerb "Permalink") implicit  def convertToStringMustWrapperForVerb(o: String)(implicit position: Position): [StringMustWrapperForVerb](#StringMustWrapperForVerbextendsAnyRef)Definition ClassesMustVerb
90. [**](../../../akka/persistence/journal/JournalPerfSpec.html#convertToStringShouldWrapper(o:String)(implicitpos:org.scalactic.source.Position,implicitprettifier:org.scalactic.Prettifier):Matchers.this.StringShouldWrapper "Permalink") implicit  def convertToStringShouldWrapper(o: String)(implicit pos: Position, prettifier: Prettifier): [StringShouldWrapper](#StringShouldWrapperextendsMatchers.this.AnyShouldWrapper[String]withMatchers.this.StringShouldWrapperForVerb)Definition ClassesMatchers
91. [**](../../../akka/persistence/journal/JournalPerfSpec.html#convertToStringShouldWrapperForVerb(o:String)(implicitposition:org.scalactic.source.Position):ShouldVerb.this.StringShouldWrapperForVerb "Permalink") implicit  def convertToStringShouldWrapperForVerb(o: String)(implicit position: Position): [StringShouldWrapperForVerb](#StringShouldWrapperForVerbextendsAnyRef)Definition ClassesShouldVerb
92. [**](../../../akka/persistence/journal/JournalPerfSpec.html#convertToWordSpecStringWrapper(s:String):AnyWordSpecLike.this.WordSpecStringWrapper "Permalink") implicit  def convertToWordSpecStringWrapper(s: String): [WordSpecStringWrapper](#WordSpecStringWrapperextendsAnyRef)Attributesprotected Definition ClassesAnyWordSpecLike
93. [**](../../../akka/persistence/journal/JournalPerfSpec.html#decided:Explicitly.this.DecidedWord "Permalink")  val decided: [DecidedWord](#DecidedWordextendsAnyRef)Definition ClassesExplicitly
94. [**](../../../akka/persistence/journal/JournalPerfSpec.html#defaultEquality[A]:org.scalactic.Equality[A] "Permalink")  def defaultEquality\[A]: Equality\[A]Definition ClassesTripleEqualsSupport
95. [**](../../../akka/persistence/journal/JournalPerfSpec.html#defined:org.scalatest.matchers.dsl.DefinedWord "Permalink")  val defined: DefinedWordDefinition ClassesMatcherWords
96. [**](../../../akka/persistence/journal/JournalPerfSpec.html#definedAt[T](right:T):org.scalatest.matchers.dsl.ResultOfDefinedAt[T] "Permalink")  def definedAt\[T](right: T): ResultOfDefinedAt\[T]Definition ClassesMatchers
97. [**](../../../akka/persistence/journal/JournalPerfSpec.html#determined:Explicitly.this.DeterminedWord "Permalink")  val determined: [DeterminedWord](#DeterminedWordextendsAnyRef)Definition ClassesExplicitly
98. [**](../../../akka/persistence/journal/JournalPerfSpec.html#empty:org.scalatest.matchers.dsl.EmptyWord "Permalink")  val empty: EmptyWordDefinition ClassesMatcherWords
99. [**](../../../akka/persistence/journal/JournalPerfSpec.html#endWith:org.scalatest.matchers.dsl.EndWithWord "Permalink")  val endWith: EndWithWordDefinition ClassesMatcherWords
100. [**](../../../akka/persistence/journal/JournalPerfSpec.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (JournalPerfSpec) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): JournalPerfSpecImplicitThis member is added by an implicit conversion from JournalPerfSpec toEnsuring\[JournalPerfSpec] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
101. [**](../../../akka/persistence/journal/JournalPerfSpec.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (JournalPerfSpec) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): JournalPerfSpecImplicitThis member is added by an implicit conversion from JournalPerfSpec toEnsuring\[JournalPerfSpec] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
102. [**](../../../akka/persistence/journal/JournalPerfSpec.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): JournalPerfSpecImplicitThis member is added by an implicit conversion from JournalPerfSpec toEnsuring\[JournalPerfSpec] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
103. [**](../../../akka/persistence/journal/JournalPerfSpec.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): JournalPerfSpecImplicitThis member is added by an implicit conversion from JournalPerfSpec toEnsuring\[JournalPerfSpec] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
104. [**](../../../akka/persistence/journal/JournalPerfSpec.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
105. [**](../../../akka/persistence/journal/JournalPerfSpec.html#equal(o:Null):org.scalatest.matchers.Matcher[AnyRef] "Permalink")  def equal(o: Null): Matcher\[[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesMatchers
106. [**](../../../akka/persistence/journal/JournalPerfSpec.html#equal[T](spread:org.scalactic.TripleEqualsSupport.Spread[T]):org.scalatest.matchers.Matcher[T] "Permalink")  def equal\[T](spread: Spread\[T]): Matcher\[T]Definition ClassesMatchers
107. [**](../../../akka/persistence/journal/JournalPerfSpec.html#equal(right:Any):org.scalatest.matchers.dsl.MatcherFactory1[Any,org.scalactic.Equality] "Permalink")  def equal(right: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): MatcherFactory1\[[Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), Equality]Definition ClassesMatcherWords
108. [**](../../../akka/persistence/journal/JournalPerfSpec.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
109. [**](../../../akka/persistence/journal/JournalPerfSpec.html#eventsCount:Int "Permalink")  def eventsCount: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Number of messages sent to the PersistentActor under test for each test iteration
110. [**](../../../akka/persistence/journal/JournalPerfSpec.html#every(xs:String)(implicitcollecting:org.scalatest.enablers.Collecting[Char,String],implicitprettifier:org.scalactic.Prettifier,implicitpos:org.scalactic.source.Position):Matchers.this.ResultOfCollectedAny[Char] "Permalink")  def every(xs: String)(implicit collecting: Collecting\[[Char](https://www.scala-lang.org/api/2.13.17/scala/Char.html#scala.Char), String], prettifier: Prettifier, pos: Position): [ResultOfCollectedAny](#ResultOfCollectedAny[T]extendsAnyRef)\[[Char](https://www.scala-lang.org/api/2.13.17/scala/Char.html#scala.Char)]Definition ClassesMatchers
111. [**](../../../akka/persistence/journal/JournalPerfSpec.html#every[K,V,JMAP[k,v]<:java.util.Map[k,v]](xs:JMAP[K,V])(implicitcollecting:org.scalatest.enablers.Collecting[org.scalatest.Entry[K,V],JMAP[K,V]],implicitprettifier:org.scalactic.Prettifier,implicitpos:org.scalactic.source.Position):Matchers.this.ResultOfCollectedAny[org.scalatest.Entry[K,V]] "Permalink")  def every\[K, V, JMAP\[k, v] \<: [Map](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Map.html#java.util.Map)\[k, v]](xs: JMAP\[K, V])(implicit collecting: Collecting\[Entry\[K, V], JMAP\[K, V]], prettifier: Prettifier, pos: Position): [ResultOfCollectedAny](#ResultOfCollectedAny[T]extendsAnyRef)\[Entry\[K, V]]Definition ClassesMatchers
112. [**](../../../akka/persistence/journal/JournalPerfSpec.html#every[K,V,MAP[k,v]<:scala.collection.Map[k,v]](xs:MAP[K,V])(implicitcollecting:org.scalatest.enablers.Collecting[(K,V),collection.GenTraversable[(K,V)]],implicitprettifier:org.scalactic.Prettifier,implicitpos:org.scalactic.source.Position):Matchers.this.ResultOfCollectedAny[(K,V)] "Permalink")  def every\[K, V, MAP\[k, v] \<: [Map](https://www.scala-lang.org/api/2.13.17/scala/collection/Map.html#scala.collection.Map)\[k, v]](xs: MAP\[K, V])(implicit collecting: Collecting\[(K, V), GenTraversable\[(K, V)]], prettifier: Prettifier, pos: Position): [ResultOfCollectedAny](#ResultOfCollectedAny[T]extendsAnyRef)\[(K, V)]Definition ClassesMatchers
113. [**](../../../akka/persistence/journal/JournalPerfSpec.html#every[E,C[_]](xs:C[E])(implicitcollecting:org.scalatest.enablers.Collecting[E,C[E]],implicitprettifier:org.scalactic.Prettifier,implicitpos:org.scalactic.source.Position):Matchers.this.ResultOfCollectedAny[E] "Permalink")  def every\[E, C\[\_]](xs: C\[E])(implicit collecting: Collecting\[E, C\[E]], prettifier: Prettifier, pos: Position): [ResultOfCollectedAny](#ResultOfCollectedAny[T]extendsAnyRef)\[E]Definition ClassesMatchers
114. [**](../../../akka/persistence/journal/JournalPerfSpec.html#exactly(num:Int,xs:String)(implicitcollecting:org.scalatest.enablers.Collecting[Char,String],implicitprettifier:org.scalactic.Prettifier,implicitpos:org.scalactic.source.Position):Matchers.this.ResultOfCollectedAny[Char] "Permalink")  def exactly(num: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), xs: String)(implicit collecting: Collecting\[[Char](https://www.scala-lang.org/api/2.13.17/scala/Char.html#scala.Char), String], prettifier: Prettifier, pos: Position): [ResultOfCollectedAny](#ResultOfCollectedAny[T]extendsAnyRef)\[[Char](https://www.scala-lang.org/api/2.13.17/scala/Char.html#scala.Char)]Definition ClassesMatchers
115. [**](../../../akka/persistence/journal/JournalPerfSpec.html#exactly[K,V,JMAP[k,v]<:java.util.Map[k,v]](num:Int,xs:JMAP[K,V])(implicitcollecting:org.scalatest.enablers.Collecting[org.scalatest.Entry[K,V],JMAP[K,V]],implicitprettifier:org.scalactic.Prettifier,implicitpos:org.scalactic.source.Position):Matchers.this.ResultOfCollectedAny[org.scalatest.Entry[K,V]] "Permalink")  def exactly\[K, V, JMAP\[k, v] \<: [Map](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Map.html#java.util.Map)\[k, v]](num: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), xs: JMAP\[K, V])(implicit collecting: Collecting\[Entry\[K, V], JMAP\[K, V]], prettifier: Prettifier, pos: Position): [ResultOfCollectedAny](#ResultOfCollectedAny[T]extendsAnyRef)\[Entry\[K, V]]Definition ClassesMatchers
116. [**](../../../akka/persistence/journal/JournalPerfSpec.html#exactly[K,V,MAP[k,v]<:collection.GenMap[k,v]](num:Int,xs:MAP[K,V])(implicitcollecting:org.scalatest.enablers.Collecting[(K,V),collection.GenTraversable[(K,V)]],implicitprettifier:org.scalactic.Prettifier,implicitpos:org.scalactic.source.Position):Matchers.this.ResultOfCollectedAny[(K,V)] "Permalink")  def exactly\[K, V, MAP\[k, v] \<: GenMap\[k, v]](num: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), xs: MAP\[K, V])(implicit collecting: Collecting\[(K, V), GenTraversable\[(K, V)]], prettifier: Prettifier, pos: Position): [ResultOfCollectedAny](#ResultOfCollectedAny[T]extendsAnyRef)\[(K, V)]Definition ClassesMatchers
117. [**](../../../akka/persistence/journal/JournalPerfSpec.html#exactly[E,C[_]](num:Int,xs:C[E])(implicitcollecting:org.scalatest.enablers.Collecting[E,C[E]],implicitprettifier:org.scalactic.Prettifier,implicitpos:org.scalactic.source.Position):Matchers.this.ResultOfCollectedAny[E] "Permalink")  def exactly\[E, C\[\_]](num: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), xs: C\[E])(implicit collecting: Collecting\[E, C\[E]], prettifier: Prettifier, pos: Position): [ResultOfCollectedAny](#ResultOfCollectedAny[T]extendsAnyRef)\[E]Definition ClassesMatchers
118. [**](../../../akka/persistence/journal/JournalPerfSpec.html#execute(testName:String,configMap:org.scalatest.ConfigMap,color:Boolean,durations:Boolean,shortstacks:Boolean,fullstacks:Boolean,stats:Boolean):Unit "Permalink") final  def execute(testName: String, configMap: ConfigMap, color: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), durations: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), shortstacks: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), fullstacks: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), stats: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesSuite
119. [**](../../../akka/persistence/journal/JournalPerfSpec.html#exist:org.scalatest.matchers.dsl.ExistWord "Permalink")  val exist: ExistWordDefinition ClassesMatcherWords
120. [**](../../../akka/persistence/journal/JournalPerfSpec.html#expectMsg[T](max:scala.concurrent.duration.FiniteDuration,hint:String,obj:T):T "Permalink")  def expectMsg\[T](max: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), hint: String, obj: T): TReceive one message from the test actor and assert that it equals the
given object.

Receive one message from the test actor and assert that it equals the
given object. Wait time is bounded by the given duration, with an
AssertionFailure being thrown in case of timeout.

returnsthe received object

Definition Classes[TestKitBase](../../testkit/TestKitBase.html)
121. [**](../../../akka/persistence/journal/JournalPerfSpec.html#expectMsg[T](max:scala.concurrent.duration.FiniteDuration,obj:T):T "Permalink")  def expectMsg\[T](max: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), obj: T): TReceive one message from the test actor and assert that it equals the
given object.

Receive one message from the test actor and assert that it equals the
given object. Wait time is bounded by the given duration, with an
AssertionFailure being thrown in case of timeout.

returnsthe received object

Definition Classes[TestKitBase](../../testkit/TestKitBase.html)
122. [**](../../../akka/persistence/journal/JournalPerfSpec.html#expectMsg[T](obj:T):T "Permalink")  def expectMsg\[T](obj: T): TSame as `expectMsg(remainingOrDefault, obj)`, but correctly treating the timeFactor.

Same as `expectMsg(remainingOrDefault, obj)`, but correctly treating the timeFactor.

Definition Classes[TestKitBase](../../testkit/TestKitBase.html)
123. [**](../../../akka/persistence/journal/JournalPerfSpec.html#expectMsgAllClassOf[T](max:scala.concurrent.duration.FiniteDuration,obj:Class[_<:T]*):Seq[T] "Permalink")  def expectMsgAllClassOf\[T](max: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), obj: Class\[\_ \<: T]\*): [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[T]Receive a number of messages from the test actor matching the given
number of classes and assert that for each given class one is received
which is of that class (equality, not conformance).

Receive a number of messages from the test actor matching the given
number of classes and assert that for each given class one is received
which is of that class (equality, not conformance). This construct is
useful when the order in which the objects are received is not fixed.
Wait time is bounded by the given duration, with an AssertionFailure
being thrown in case of timeout.

Definition Classes[TestKitBase](../../testkit/TestKitBase.html)
124. [**](../../../akka/persistence/journal/JournalPerfSpec.html#expectMsgAllClassOf[T](obj:Class[_<:T]*):Seq[T] "Permalink")  def expectMsgAllClassOf\[T](obj: Class\[\_ \<: T]\*): [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[T]Same as `expectMsgAllClassOf(remainingOrDefault, obj...)`, but correctly treating the timeFactor.

Same as `expectMsgAllClassOf(remainingOrDefault, obj...)`, but correctly treating the timeFactor.

Definition Classes[TestKitBase](../../testkit/TestKitBase.html)
125. [**](../../../akka/persistence/journal/JournalPerfSpec.html#expectMsgAllConformingOf[T](max:scala.concurrent.duration.FiniteDuration,obj:Class[_<:T]*):Seq[T] "Permalink")  def expectMsgAllConformingOf\[T](max: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), obj: Class\[\_ \<: T]\*): [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[T]Receive a number of messages from the test actor matching the given
number of classes and assert that for each given class one is received
which conforms to that class (and vice versa).

Receive a number of messages from the test actor matching the given
number of classes and assert that for each given class one is received
which conforms to that class (and vice versa). This construct is useful
when the order in which the objects are received is not fixed. Wait time
is bounded by the given duration, with an AssertionFailure being thrown in
case of timeout.

Beware that one object may satisfy all given class constraints, which
may be counter\-intuitive.

Definition Classes[TestKitBase](../../testkit/TestKitBase.html)
126. [**](../../../akka/persistence/journal/JournalPerfSpec.html#expectMsgAllConformingOf[T](obj:Class[_<:T]*):Seq[T] "Permalink")  def expectMsgAllConformingOf\[T](obj: Class\[\_ \<: T]\*): [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[T]Same as `expectMsgAllConformingOf(remainingOrDefault, obj...)`, but correctly treating the timeFactor.

Same as `expectMsgAllConformingOf(remainingOrDefault, obj...)`, but correctly treating the timeFactor.

Definition Classes[TestKitBase](../../testkit/TestKitBase.html)
127. [**](../../../akka/persistence/journal/JournalPerfSpec.html#expectMsgAllOf[T](max:scala.concurrent.duration.FiniteDuration,obj:T*):Seq[T] "Permalink")  def expectMsgAllOf\[T](max: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), obj: T\*): [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[T]Receive a number of messages from the test actor matching the given
number of objects and assert that for each given object one is received
which equals it and vice versa.

Receive a number of messages from the test actor matching the given
number of objects and assert that for each given object one is received
which equals it and vice versa. This construct is useful when the order in
which the objects are received is not fixed. Wait time is bounded by the
given duration, with an AssertionFailure being thrown in case of timeout.

```

  dispatcher ! SomeWork1()
  dispatcher ! SomeWork2()
  expectMsgAllOf(1 second, Result1(), Result2())

```

Definition Classes[TestKitBase](../../testkit/TestKitBase.html)
128. [**](../../../akka/persistence/journal/JournalPerfSpec.html#expectMsgAllOf[T](obj:T*):Seq[T] "Permalink")  def expectMsgAllOf\[T](obj: T\*): [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[T]Same as `expectMsgAllOf(remainingOrDefault, obj...)`, but correctly treating the timeFactor.

Same as `expectMsgAllOf(remainingOrDefault, obj...)`, but correctly treating the timeFactor.

Definition Classes[TestKitBase](../../testkit/TestKitBase.html)
129. [**](../../../akka/persistence/journal/JournalPerfSpec.html#expectMsgAnyClassOf[C](max:scala.concurrent.duration.FiniteDuration,obj:Class[_<:C]*):C "Permalink")  def expectMsgAnyClassOf\[C](max: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), obj: Class\[\_ \<: C]\*): CReceive one message from the test actor and assert that it conforms to
one of the given classes.

Receive one message from the test actor and assert that it conforms to
one of the given classes. Wait time is bounded by the given duration,
with an AssertionFailure being thrown in case of timeout.

returnsthe received object

Definition Classes[TestKitBase](../../testkit/TestKitBase.html)
130. [**](../../../akka/persistence/journal/JournalPerfSpec.html#expectMsgAnyClassOf[C](obj:Class[_<:C]*):C "Permalink")  def expectMsgAnyClassOf\[C](obj: Class\[\_ \<: C]\*): CSame as `expectMsgAnyClassOf(remainingOrDefault, obj...)`, but correctly treating the timeFactor.

Same as `expectMsgAnyClassOf(remainingOrDefault, obj...)`, but correctly treating the timeFactor.

Definition Classes[TestKitBase](../../testkit/TestKitBase.html)
131. [**](../../../akka/persistence/journal/JournalPerfSpec.html#expectMsgAnyOf[T](max:scala.concurrent.duration.FiniteDuration,obj:T*):T "Permalink")  def expectMsgAnyOf\[T](max: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), obj: T\*): TReceive one message from the test actor and assert that it equals one of
the given objects.

Receive one message from the test actor and assert that it equals one of
the given objects. Wait time is bounded by the given duration, with an
AssertionFailure being thrown in case of timeout.

returnsthe received object

Definition Classes[TestKitBase](../../testkit/TestKitBase.html)
132. [**](../../../akka/persistence/journal/JournalPerfSpec.html#expectMsgAnyOf[T](obj:T*):T "Permalink")  def expectMsgAnyOf\[T](obj: T\*): TSame as `expectMsgAnyOf(remainingOrDefault, obj...)`, but correctly treating the timeFactor.

Same as `expectMsgAnyOf(remainingOrDefault, obj...)`, but correctly treating the timeFactor.

Definition Classes[TestKitBase](../../testkit/TestKitBase.html)
133. [**](../../../akka/persistence/journal/JournalPerfSpec.html#expectMsgClass[C](max:scala.concurrent.duration.FiniteDuration,c:Class[C]):C "Permalink")  def expectMsgClass\[C](max: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), c: Class\[C]): CReceive one message from the test actor and assert that it conforms to
the given class.

Receive one message from the test actor and assert that it conforms to
the given class. Wait time is bounded by the given duration, with an
AssertionFailure being thrown in case of timeout.

returnsthe received object

Definition Classes[TestKitBase](../../testkit/TestKitBase.html)
134. [**](../../../akka/persistence/journal/JournalPerfSpec.html#expectMsgClass[C](c:Class[C]):C "Permalink")  def expectMsgClass\[C](c: Class\[C]): CSame as `expectMsgClass(remainingOrDefault, c)`, but correctly treating the timeFactor.

Same as `expectMsgClass(remainingOrDefault, c)`, but correctly treating the timeFactor.

Definition Classes[TestKitBase](../../testkit/TestKitBase.html)
135. [**](../../../akka/persistence/journal/JournalPerfSpec.html#expectMsgPF[T](max:scala.concurrent.duration.Duration,hint:String)(f:PartialFunction[Any,T]):T "Permalink")  def expectMsgPF\[T](max: [Duration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/Duration.html#scala.concurrent.duration.Duration) \= Duration.Undefined, hint: String \= "")(f: [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[[Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), T]): TReceive one message from the test actor and assert that the given
partial function accepts it.

Receive one message from the test actor and assert that the given
partial function accepts it. Wait time is bounded by the given duration,
with an AssertionFailure being thrown in case of timeout.

Use this variant to implement more complicated or conditional
processing.

returnsthe received object as transformed by the partial function

Definition Classes[TestKitBase](../../testkit/TestKitBase.html)
136. [**](../../../akka/persistence/journal/JournalPerfSpec.html#expectMsgType[T](max:scala.concurrent.duration.FiniteDuration)(implicitt:scala.reflect.ClassTag[T]):T "Permalink")  def expectMsgType\[T](max: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration))(implicit t: [ClassTag](https://www.scala-lang.org/api/2.13.17/scala/reflect/ClassTag.html#scala.reflect.ClassTag)\[T]): TReceive one message from the test actor and assert that it conforms to the
given type (after erasure).

Receive one message from the test actor and assert that it conforms to the
given type (after erasure). Wait time is bounded by the given duration,
with an AssertionFailure being thrown in case of timeout.

returnsthe received object

Definition Classes[TestKitBase](../../testkit/TestKitBase.html)
137. [**](../../../akka/persistence/journal/JournalPerfSpec.html#expectMsgType[T](implicitt:scala.reflect.ClassTag[T]):T "Permalink")  def expectMsgType\[T](implicit t: [ClassTag](https://www.scala-lang.org/api/2.13.17/scala/reflect/ClassTag.html#scala.reflect.ClassTag)\[T]): TSame as `expectMsgType[T](remainingOrDefault)`, but correctly treating the timeFactor.

Same as `expectMsgType[T](remainingOrDefault)`, but correctly treating the timeFactor.

Definition Classes[TestKitBase](../../testkit/TestKitBase.html)
138. [**](../../../akka/persistence/journal/JournalPerfSpec.html#expectNoMessage():Unit "Permalink")  def expectNoMessage(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Assert that no message is received.

Assert that no message is received. Waits for the default period configured as
`akka.test.expect-no-message-default`.
That timeout is scaled using the configuration entry "akka.test.timefactor".

Definition Classes[TestKitBase](../../testkit/TestKitBase.html)
139. [**](../../../akka/persistence/journal/JournalPerfSpec.html#expectNoMessage(max:scala.concurrent.duration.FiniteDuration):Unit "Permalink")  def expectNoMessage(max: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Assert that no message is received for the specified time.

Assert that no message is received for the specified time.
Supplied value is not dilated.

Definition Classes[TestKitBase](../../testkit/TestKitBase.html)
140. [**](../../../akka/persistence/journal/JournalPerfSpec.html#expectTerminated(target:akka.actor.ActorRef,max:scala.concurrent.duration.Duration):akka.actor.Terminated "Permalink")  def expectTerminated(target: [ActorRef](../../actor/ActorRef.html), max: [Duration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/Duration.html#scala.concurrent.duration.Duration) \= Duration.Undefined): [Terminated](../../actor/Terminated.html)Receive one message from the test actor and assert that it is the Terminated message of the given ActorRef.

Receive one message from the test actor and assert that it is the Terminated message of the given ActorRef.
Before calling this method, you have to `watch` the target actor ref.
Wait time is bounded by the given duration, with an AssertionFailure being thrown in case of timeout.

targetthe actor ref expected to be Terminated

maxwait no more than max time, otherwise throw AssertionFailure

returnsthe received Terminated message

Definition Classes[TestKitBase](../../testkit/TestKitBase.html)
141. [**](../../../akka/persistence/journal/JournalPerfSpec.html#expectedTestCount(filter:org.scalatest.Filter):Int "Permalink")  def expectedTestCount(filter: Filter): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesSuite
142. [**](../../../akka/persistence/journal/JournalPerfSpec.html#extension:akka.persistence.Persistence "Permalink")  def extension: [Persistence](../Persistence.html)Definition Classes[PluginSpec](../PluginSpec.html)
143. [**](../../../akka/persistence/journal/JournalPerfSpec.html#fail(cause:Throwable)(implicitpos:org.scalactic.source.Position):Nothing "Permalink")  def fail(cause: Throwable)(implicit pos: Position): [Nothing](https://www.scala-lang.org/api/2.13.17/scala/Nothing.html#scala.Nothing)Definition ClassesAssertions
144. [**](../../../akka/persistence/journal/JournalPerfSpec.html#fail(message:String,cause:Throwable)(implicitpos:org.scalactic.source.Position):Nothing "Permalink")  def fail(message: String, cause: Throwable)(implicit pos: Position): [Nothing](https://www.scala-lang.org/api/2.13.17/scala/Nothing.html#scala.Nothing)Definition ClassesAssertions
145. [**](../../../akka/persistence/journal/JournalPerfSpec.html#fail(message:String)(implicitpos:org.scalactic.source.Position):Nothing "Permalink")  def fail(message: String)(implicit pos: Position): [Nothing](https://www.scala-lang.org/api/2.13.17/scala/Nothing.html#scala.Nothing)Definition ClassesAssertions
146. [**](../../../akka/persistence/journal/JournalPerfSpec.html#fail()(implicitpos:org.scalactic.source.Position):Nothing "Permalink")  def fail()(implicit pos: Position): [Nothing](https://www.scala-lang.org/api/2.13.17/scala/Nothing.html#scala.Nothing)Definition ClassesAssertions
147. [**](../../../akka/persistence/journal/JournalPerfSpec.html#feedAndExpectLast(actor:akka.actor.ActorRef,mode:String,cmnds:Seq[Int]):Unit "Permalink")  def feedAndExpectLast(actor: [ActorRef](../../actor/ActorRef.html), mode: String, cmnds: [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[[Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)]): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)
148. [**](../../../akka/persistence/journal/JournalPerfSpec.html#fishForMessage(max:scala.concurrent.duration.Duration,hint:String)(f:PartialFunction[Any,Boolean]):Any "Permalink")  def fishForMessage(max: [Duration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/Duration.html#scala.concurrent.duration.Duration) \= Duration.Undefined, hint: String \= "")(f: [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[[Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)]): [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Hybrid of expectMsgPF and receiveWhile: receive messages while the
partial function matches and returns false.

Hybrid of expectMsgPF and receiveWhile: receive messages while the
partial function matches and returns false. Use it to ignore certain
messages while waiting for a specific message.

returnsthe last received message, i.e. the first one for which the
 partial function returned true

Definition Classes[TestKitBase](../../testkit/TestKitBase.html)
149. [**](../../../akka/persistence/journal/JournalPerfSpec.html#fishForSpecificMessage[T](max:scala.concurrent.duration.Duration,hint:String)(f:PartialFunction[Any,T]):T "Permalink")  def fishForSpecificMessage\[T](max: [Duration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/Duration.html#scala.concurrent.duration.Duration) \= Duration.Undefined, hint: String \= "")(f: [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[[Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), T]): TWaits for specific message that partial function matches while ignoring all other messages coming in the meantime.

Waits for specific message that partial function matches while ignoring all other messages coming in the meantime.
Use it to ignore any number of messages while waiting for a specific one.

returnsresult of applying partial function to the last received message,
 i.e. the first one for which the partial function is defined

Definition Classes[TestKitBase](../../testkit/TestKitBase.html)
150. [**](../../../akka/persistence/journal/JournalPerfSpec.html#fullyMatch:org.scalatest.matchers.dsl.FullyMatchWord "Permalink")  val fullyMatch: FullyMatchWordDefinition ClassesMatcherWords
151. [**](../../../akka/persistence/journal/JournalPerfSpec.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
152. [**](../../../akka/persistence/journal/JournalPerfSpec.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
153. [**](../../../akka/persistence/journal/JournalPerfSpec.html#have:org.scalatest.matchers.dsl.HaveWord "Permalink")  val have: HaveWordDefinition ClassesMatcherWords
154. [**](../../../akka/persistence/journal/JournalPerfSpec.html#ignoreMsg(f:PartialFunction[Any,Boolean]):Unit "Permalink")  def ignoreMsg(f: [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[[Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)]): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Ignore all messages in the test actor for which the given partial
function returns true.

Ignore all messages in the test actor for which the given partial
function returns true.

Definition Classes[TestKitBase](../../testkit/TestKitBase.html)
155. [**](../../../akka/persistence/journal/JournalPerfSpec.html#ignoreNoMsg():Unit "Permalink")  def ignoreNoMsg(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Stop ignoring messages in the test actor.

Stop ignoring messages in the test actor.

Definition Classes[TestKitBase](../../testkit/TestKitBase.html)
156. [**](../../../akka/persistence/journal/JournalPerfSpec.html#inOrder(firstEle:Any,secondEle:Any,remainingEles:Any*)(implicitpos:org.scalactic.source.Position):org.scalatest.matchers.dsl.ResultOfInOrderApplication "Permalink")  def inOrder(firstEle: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), secondEle: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), remainingEles: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)\*)(implicit pos: Position): ResultOfInOrderApplicationDefinition ClassesMatchers
157. [**](../../../akka/persistence/journal/JournalPerfSpec.html#inOrderElementsOf[R](elements:collection.GenTraversable[R]):org.scalatest.matchers.dsl.ResultOfInOrderElementsOfApplication "Permalink")  def inOrderElementsOf\[R](elements: GenTraversable\[R]): ResultOfInOrderElementsOfApplicationDefinition ClassesMatchers
158. [**](../../../akka/persistence/journal/JournalPerfSpec.html#inOrderOnly[T](firstEle:Any,secondEle:Any,remainingEles:Any*)(implicitpos:org.scalactic.source.Position):org.scalatest.matchers.dsl.ResultOfInOrderOnlyApplication "Permalink")  def inOrderOnly\[T](firstEle: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), secondEle: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), remainingEles: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)\*)(implicit pos: Position): ResultOfInOrderOnlyApplicationDefinition ClassesMatchers
159. [**](../../../akka/persistence/journal/JournalPerfSpec.html#include:org.scalatest.matchers.dsl.IncludeWord "Permalink")  val include: IncludeWordDefinition ClassesMatcherWords
160. [**](../../../akka/persistence/journal/JournalPerfSpec.html#info:org.scalatest.Informer "Permalink")  def info: InformerAttributesprotected Definition ClassesAnyWordSpecLike → Informing
161. [**](../../../akka/persistence/journal/JournalPerfSpec.html#intercept[T<:AnyRef](f:=>Any)(implicitclassTag:scala.reflect.ClassTag[T],implicitpos:org.scalactic.source.Position):T "Permalink")  def intercept\[T \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)](f: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any))(implicit classTag: [ClassTag](https://www.scala-lang.org/api/2.13.17/scala/reflect/ClassTag.html#scala.reflect.ClassTag)\[T], pos: Position): TDefinition ClassesAssertions
162. [**](../../../akka/persistence/journal/JournalPerfSpec.html#invokeBeforeAllAndAfterAllEvenIfNoTestsAreExpected:Boolean "Permalink")  val invokeBeforeAllAndAfterAllEvenIfNoTestsAreExpected: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesBeforeAndAfterAll
163. [**](../../../akka/persistence/journal/JournalPerfSpec.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
164. [**](../../../akka/persistence/journal/JournalPerfSpec.html#it:AnyWordSpecLike.this.ItWord "Permalink")  val it: [ItWord](#ItWordextendsAnyRef)Attributesprotected Definition ClassesAnyWordSpecLike
165. [**](../../../akka/persistence/journal/JournalPerfSpec.html#journal:akka.actor.ActorRef "Permalink")  def journal: [ActorRef](../../actor/ActorRef.html)Definition Classes[JournalSpec](JournalSpec.html)
166. [**](../../../akka/persistence/journal/JournalPerfSpec.html#key:Matchers.this.KeyWord "Permalink")  val key: [KeyWord](#KeyWordextendsAnyRef)Definition ClassesMatchers
167. [**](../../../akka/persistence/journal/JournalPerfSpec.html#lastSender:akka.actor.ActorRef "Permalink")  def lastSender: [ActorRef](../../actor/ActorRef.html)Definition Classes[TestKitBase](../../testkit/TestKitBase.html)
168. [**](../../../akka/persistence/journal/JournalPerfSpec.html#leftSideValue:T "Permalink")  val leftSideValue: JournalPerfSpecImplicitThis member is added by an implicit conversion from JournalPerfSpec toorg.scalatest.matchers.should.Matchers.AnyShouldWrapper\[JournalPerfSpec] performed by method convertToAnyShouldWrapper in org.scalatest.matchers.should.Matchers.Definition ClassesAnyShouldWrapper
169. [**](../../../akka/persistence/journal/JournalPerfSpec.html#length:org.scalatest.matchers.dsl.LengthWord "Permalink")  val length: LengthWordDefinition ClassesMatcherWords
170. [**](../../../akka/persistence/journal/JournalPerfSpec.html#lowPriorityTypeCheckedConstraint[A,B](implicitequivalenceOfB:org.scalactic.Equivalence[B],implicitev:A<:<B):org.scalactic.CanEqual[A,B] "Permalink")  def lowPriorityTypeCheckedConstraint\[A, B](implicit equivalenceOfB: Equivalence\[B], ev: [\<:\<](https://www.scala-lang.org/api/2.13.17/scala/$less$colon$less.html#scala.%3C:%3C)\[A, B]): CanEqual\[A, B]Definition ClassesTripleEquals → TripleEqualsSupport
171. [**](../../../akka/persistence/journal/JournalPerfSpec.html#markup:org.scalatest.Documenter "Permalink")  def markup: DocumenterAttributesprotected Definition ClassesAnyWordSpecLike → Documenting
172. [**](../../../akka/persistence/journal/JournalPerfSpec.html#matchPattern:org.scalatest.matchers.dsl.MatchPatternWord "Permalink")  val matchPattern: MatchPatternWordDefinition ClassesMatcherWords
173. [**](../../../akka/persistence/journal/JournalPerfSpec.html#mayVerbStacktraceContextFrames:Int "Permalink")  def mayVerbStacktraceContextFrames: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Configurable number of frames to be shown when a MAY test fails (is canceled).

Configurable number of frames to be shown when a MAY test fails (is canceled).

Defaults to `3`.
Must be greater than `0`.

Definition Classes[MayVerb](../scalatest/MayVerb.html)
174. [**](../../../akka/persistence/journal/JournalPerfSpec.html#measure(msg:scala.concurrent.duration.Duration=>String)(block:=>Unit):Unit "Permalink")  def measure(msg: ([Duration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/Duration.html#scala.concurrent.duration.Duration)) \=\> String)(block: \=\> [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Executes a block of code multiple times (no warm\-up)
175. [**](../../../akka/persistence/journal/JournalPerfSpec.html#measurementIterations:Int "Permalink")  def measurementIterations: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Number of measurement iterations each test will be run.
176. [**](../../../akka/persistence/journal/JournalPerfSpec.html#message(expectedMessage:String):org.scalatest.matchers.dsl.ResultOfMessageWordApplication "Permalink")  def message(expectedMessage: String): ResultOfMessageWordApplicationDefinition ClassesMatchers
177. [**](../../../akka/persistence/journal/JournalPerfSpec.html#msgAvailable:Boolean "Permalink")  def msgAvailable: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Query queue status.

Query queue status.

Definition Classes[TestKitBase](../../testkit/TestKitBase.html)
178. [**](../../../akka/persistence/journal/JournalPerfSpec.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
179. [**](../../../akka/persistence/journal/JournalPerfSpec.html#nestedSuites:IndexedSeq[org.scalatest.Suite] "Permalink")  def nestedSuites: [IndexedSeq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/IndexedSeq.html#scala.collection.immutable.IndexedSeq)\[Suite]Definition ClassesSuite
180. [**](../../../akka/persistence/journal/JournalPerfSpec.html#no(xs:String)(implicitcollecting:org.scalatest.enablers.Collecting[Char,String],implicitprettifier:org.scalactic.Prettifier,implicitpos:org.scalactic.source.Position):Matchers.this.ResultOfCollectedAny[Char] "Permalink")  def no(xs: String)(implicit collecting: Collecting\[[Char](https://www.scala-lang.org/api/2.13.17/scala/Char.html#scala.Char), String], prettifier: Prettifier, pos: Position): [ResultOfCollectedAny](#ResultOfCollectedAny[T]extendsAnyRef)\[[Char](https://www.scala-lang.org/api/2.13.17/scala/Char.html#scala.Char)]Definition ClassesMatchers
181. [**](../../../akka/persistence/journal/JournalPerfSpec.html#no[K,V,JMAP[k,v]<:java.util.Map[k,v]](xs:JMAP[K,V])(implicitcollecting:org.scalatest.enablers.Collecting[org.scalatest.Entry[K,V],JMAP[K,V]],implicitprettifier:org.scalactic.Prettifier,implicitpos:org.scalactic.source.Position):Matchers.this.ResultOfCollectedAny[org.scalatest.Entry[K,V]] "Permalink")  def no\[K, V, JMAP\[k, v] \<: [Map](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Map.html#java.util.Map)\[k, v]](xs: JMAP\[K, V])(implicit collecting: Collecting\[Entry\[K, V], JMAP\[K, V]], prettifier: Prettifier, pos: Position): [ResultOfCollectedAny](#ResultOfCollectedAny[T]extendsAnyRef)\[Entry\[K, V]]Definition ClassesMatchers
182. [**](../../../akka/persistence/journal/JournalPerfSpec.html#no[E,C[_]](xs:C[E])(implicitcollecting:org.scalatest.enablers.Collecting[E,C[E]],implicitprettifier:org.scalactic.Prettifier,implicitpos:org.scalactic.source.Position):Matchers.this.ResultOfCollectedAny[E] "Permalink")  def no\[E, C\[\_]](xs: C\[E])(implicit collecting: Collecting\[E, C\[E]], prettifier: Prettifier, pos: Position): [ResultOfCollectedAny](#ResultOfCollectedAny[T]extendsAnyRef)\[E]Definition ClassesMatchers
183. [**](../../../akka/persistence/journal/JournalPerfSpec.html#noElementsOf(elements:collection.GenTraversable[Any]):org.scalatest.matchers.dsl.ResultOfNoElementsOfApplication "Permalink")  def noElementsOf(elements: GenTraversable\[[Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)]): ResultOfNoElementsOfApplicationDefinition ClassesMatchers
184. [**](../../../akka/persistence/journal/JournalPerfSpec.html#noException(implicitpos:org.scalactic.source.Position):org.scalatest.matchers.dsl.NoExceptionWord "Permalink")  def noException(implicit pos: Position): NoExceptionWordDefinition ClassesMatcherWords
185. [**](../../../akka/persistence/journal/JournalPerfSpec.html#noneOf(firstEle:Any,secondEle:Any,remainingEles:Any*)(implicitpos:org.scalactic.source.Position):org.scalatest.matchers.dsl.ResultOfNoneOfApplication "Permalink")  def noneOf(firstEle: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), secondEle: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), remainingEles: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)\*)(implicit pos: Position): ResultOfNoneOfApplicationDefinition ClassesMatchers
186. [**](../../../akka/persistence/journal/JournalPerfSpec.html#not:org.scalatest.matchers.dsl.NotWord "Permalink")  val not: NotWordDefinition ClassesMatcherWords
187. [**](../../../akka/persistence/journal/JournalPerfSpec.html#note:org.scalatest.Notifier "Permalink")  def note: NotifierAttributesprotected Definition ClassesAnyWordSpecLike → Notifying
188. [**](../../../akka/persistence/journal/JournalPerfSpec.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
189. [**](../../../akka/persistence/journal/JournalPerfSpec.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
190. [**](../../../akka/persistence/journal/JournalPerfSpec.html#now:scala.concurrent.duration.FiniteDuration "Permalink")  def now: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)Obtain current time (`System.nanoTime`) as Duration.

Obtain current time (`System.nanoTime`) as Duration.

Definition Classes[TestKitBase](../../testkit/TestKitBase.html)
191. [**](../../../akka/persistence/journal/JournalPerfSpec.html#of[T](implicitev:scala.reflect.ClassTag[T]):org.scalatest.matchers.dsl.ResultOfOfTypeInvocation[T] "Permalink")  def of\[T](implicit ev: [ClassTag](https://www.scala-lang.org/api/2.13.17/scala/reflect/ClassTag.html#scala.reflect.ClassTag)\[T]): ResultOfOfTypeInvocation\[T]Definition ClassesMatchers
192. [**](../../../akka/persistence/journal/JournalPerfSpec.html#oneElementOf(elements:collection.GenTraversable[Any]):org.scalatest.matchers.dsl.ResultOfOneElementOfApplication "Permalink")  def oneElementOf(elements: GenTraversable\[[Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)]): ResultOfOneElementOfApplicationDefinition ClassesMatchers
193. [**](../../../akka/persistence/journal/JournalPerfSpec.html#oneOf(firstEle:Any,secondEle:Any,remainingEles:Any*)(implicitpos:org.scalactic.source.Position):org.scalatest.matchers.dsl.ResultOfOneOfApplication "Permalink")  def oneOf(firstEle: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), secondEle: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), remainingEles: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)\*)(implicit pos: Position): ResultOfOneOfApplicationDefinition ClassesMatchers
194. [**](../../../akka/persistence/journal/JournalPerfSpec.html#only(xs:Any*)(implicitpos:org.scalactic.source.Position):org.scalatest.matchers.dsl.ResultOfOnlyApplication "Permalink")  def only(xs: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)\*)(implicit pos: Position): ResultOfOnlyApplicationDefinition ClassesMatchers
195. [**](../../../akka/persistence/journal/JournalPerfSpec.html#optional(flag:akka.persistence.CapabilityFlag)(test:=>Unit):Unit "Permalink")  def optional(flag: [CapabilityFlag](../CapabilityFlag.html))(test: \=\> [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition Classes[OptionalTests](../scalatest/OptionalTests.html)
196. [**](../../../akka/persistence/journal/JournalPerfSpec.html#optional(whenSkippedMessage:String)(body:=>Unit):Unit "Permalink")  def optional(whenSkippedMessage: String)(body: \=\> [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition Classes[MayVerb](../scalatest/MayVerb.html)
197. [**](../../../akka/persistence/journal/JournalPerfSpec.html#pending:org.scalatest.Assertionwithorg.scalatest.PendingStatement "Permalink")  def pending: Assertion with PendingStatementDefinition ClassesAssertions
198. [**](../../../akka/persistence/journal/JournalPerfSpec.html#pendingUntilFixed(f:=>Unit)(implicitpos:org.scalactic.source.Position):org.scalatest.Assertionwithorg.scalatest.PendingStatement "Permalink")  def pendingUntilFixed(f: \=\> [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit))(implicit pos: Position): Assertion with PendingStatementDefinition ClassesAssertions
199. [**](../../../akka/persistence/journal/JournalPerfSpec.html#pid:String "Permalink")  def pid: StringDefinition Classes[PluginSpec](../PluginSpec.html)
200. [**](../../../akka/persistence/journal/JournalPerfSpec.html#pos:org.scalactic.source.Position "Permalink")  val pos: PositionImplicitThis member is added by an implicit conversion from JournalPerfSpec toorg.scalatest.matchers.should.Matchers.AnyShouldWrapper\[JournalPerfSpec] performed by method convertToAnyShouldWrapper in org.scalatest.matchers.should.Matchers.Definition ClassesAnyShouldWrapper
201. [**](../../../akka/persistence/journal/JournalPerfSpec.html#preparePersistenceId(pid:String):Unit "Permalink")  def preparePersistenceId(pid: String): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Overridable hook that is called before populating the journal for the next
test case.

Overridable hook that is called before populating the journal for the next
test case. `pid` is the `persistenceId` that will be used in the test.
This method may be needed to clean pre\-existing events from the log.

Definition Classes[JournalSpec](JournalSpec.html)
202. [**](../../../akka/persistence/journal/JournalPerfSpec.html#prettifier:org.scalactic.Prettifier "Permalink")  val prettifier: PrettifierImplicitThis member is added by an implicit conversion from JournalPerfSpec toorg.scalatest.matchers.should.Matchers.AnyShouldWrapper\[JournalPerfSpec] performed by method convertToAnyShouldWrapper in org.scalatest.matchers.should.Matchers.Definition ClassesAnyShouldWrapper
203. [**](../../../akka/persistence/journal/JournalPerfSpec.html#readable:org.scalatest.matchers.dsl.ReadableWord "Permalink")  val readable: ReadableWordDefinition ClassesMatcherWords
204. [**](../../../akka/persistence/journal/JournalPerfSpec.html#receiveN(n:Int,max:scala.concurrent.duration.FiniteDuration):Seq[AnyRef] "Permalink")  def receiveN(n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), max: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)): [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Receive N messages in a row before the given deadline.

Receive N messages in a row before the given deadline.

Definition Classes[TestKitBase](../../testkit/TestKitBase.html)
205. [**](../../../akka/persistence/journal/JournalPerfSpec.html#receiveN(n:Int):Seq[AnyRef] "Permalink")  def receiveN(n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Same as `receiveN(n, remaining)` but correctly taking into account
Duration.timeFactor.

Same as `receiveN(n, remaining)` but correctly taking into account
Duration.timeFactor.

Definition Classes[TestKitBase](../../testkit/TestKitBase.html)
206. [**](../../../akka/persistence/journal/JournalPerfSpec.html#receiveOne(max:scala.concurrent.duration.Duration):AnyRef "Permalink")  def receiveOne(max: [Duration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/Duration.html#scala.concurrent.duration.Duration)): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Receive one message from the internal queue of the TestActor.

Receive one message from the internal queue of the TestActor. If the given
duration is zero, the queue is polled (non\-blocking).

This method does NOT automatically scale its Duration parameter!

Definition Classes[TestKitBase](../../testkit/TestKitBase.html)
207. [**](../../../akka/persistence/journal/JournalPerfSpec.html#receiveWhile[T](max:scala.concurrent.duration.Duration,idle:scala.concurrent.duration.Duration,messages:Int)(f:PartialFunction[AnyRef,T]):Seq[T] "Permalink")  def receiveWhile\[T](max: [Duration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/Duration.html#scala.concurrent.duration.Duration) \= Duration.Undefined, idle: [Duration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/Duration.html#scala.concurrent.duration.Duration) \= Duration.Inf, messages: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int) \= Int.MaxValue)(f: [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), T]): [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[T]Receive a series of messages until one does not match the given partial
function or the idle timeout is met (disabled by default) or the overall
maximum duration is elapsed or expected messages count is reached.

Receive a series of messages until one does not match the given partial
function or the idle timeout is met (disabled by default) or the overall
maximum duration is elapsed or expected messages count is reached.
Returns the sequence of messages.

Note that it is not an error to hit the `max` duration in this case.

One possible use of this method is for testing whether messages of
certain characteristics are generated at a certain rate:

```
test ! ScheduleTicks(100 millis)
val series = receiveWhile(750 millis) {
    case Tick(count) => count
}
assert(series == (1 to 7).toList)
```
Definition Classes[TestKitBase](../../testkit/TestKitBase.html)
208. [**](../../../akka/persistence/journal/JournalPerfSpec.html#regex:Matchers.this.RegexWord "Permalink")  val regex: [RegexWord](#RegexWordextendsAnyRef)Definition ClassesMatchers
209. [**](../../../akka/persistence/journal/JournalPerfSpec.html#registerIgnoredTest(testText:String,testTags:org.scalatest.Tag*)(testFun:=>Any)(implicitpos:org.scalactic.source.Position):Unit "Permalink") final  def registerIgnoredTest(testText: String, testTags: Tag\*)(testFun: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any))(implicit pos: Position): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyWordSpecLike → TestRegistration
210. [**](../../../akka/persistence/journal/JournalPerfSpec.html#registerTest(testText:String,testTags:org.scalatest.Tag*)(testFun:=>Any)(implicitpos:org.scalactic.source.Position):Unit "Permalink") final  def registerTest(testText: String, testTags: Tag\*)(testFun: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any))(implicit pos: Position): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyWordSpecLike → TestRegistration
211. [**](../../../akka/persistence/journal/JournalPerfSpec.html#remaining:scala.concurrent.duration.FiniteDuration "Permalink")  def remaining: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)Obtain time remaining for execution of the innermost enclosing `within`
block or throw an AssertionError if no `within` block surrounds this
call.

Obtain time remaining for execution of the innermost enclosing `within`
block or throw an AssertionError if no `within` block surrounds this
call.

Definition Classes[TestKitBase](../../testkit/TestKitBase.html)
212. [**](../../../akka/persistence/journal/JournalPerfSpec.html#remainingOr(duration:scala.concurrent.duration.FiniteDuration):scala.concurrent.duration.FiniteDuration "Permalink")  def remainingOr(duration: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)): [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)Obtain time remaining for execution of the innermost enclosing `within`
block or missing that it returns the given duration.

Obtain time remaining for execution of the innermost enclosing `within`
block or missing that it returns the given duration.

Definition Classes[TestKitBase](../../testkit/TestKitBase.html)
213. [**](../../../akka/persistence/journal/JournalPerfSpec.html#remainingOrDefault:scala.concurrent.duration.FiniteDuration "Permalink")  def remainingOrDefault: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)Obtain time remaining for execution of the innermost enclosing `within`
block or missing that it returns the properly dilated default for this
case from settings (key "akka.test.single\-expect\-default").

Obtain time remaining for execution of the innermost enclosing `within`
block or missing that it returns the properly dilated default for this
case from settings (key "akka.test.single\-expect\-default").

Definition Classes[TestKitBase](../../testkit/TestKitBase.html)
214. [**](../../../akka/persistence/journal/JournalPerfSpec.html#replayedMessage(snr:Long,deleted:Boolean):akka.persistence.JournalProtocol.ReplayedMessage "Permalink")  def replayedMessage(snr: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), deleted: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean) \= false): ReplayedMessageDefinition Classes[JournalSpec](JournalSpec.html)
215. [**](../../../akka/persistence/journal/JournalPerfSpec.html#rerunner:Option[String] "Permalink")  def rerunner: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[String]Definition ClassesSuite
216. [**](../../../akka/persistence/journal/JournalPerfSpec.html#run(testName:Option[String],args:org.scalatest.Args):org.scalatest.Status "Permalink")  def run(testName: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[String], args: Args): StatusDefinition ClassesBeforeAndAfterAll → SuiteMixin
217. [**](../../../akka/persistence/journal/JournalPerfSpec.html#runNestedSuites(args:org.scalatest.Args):org.scalatest.Status "Permalink")  def runNestedSuites(args: Args): StatusAttributesprotected Definition ClassesSuite
218. [**](../../../akka/persistence/journal/JournalPerfSpec.html#runTest(testName:String,args:org.scalatest.Args):org.scalatest.Status "Permalink")  def runTest(testName: String, args: Args): StatusAttributesprotected Definition ClassesBeforeAndAfterEach → SuiteMixin
219. [**](../../../akka/persistence/journal/JournalPerfSpec.html#runTests(testName:Option[String],args:org.scalatest.Args):org.scalatest.Status "Permalink")  def runTests(testName: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[String], args: Args): StatusAttributesprotected Definition ClassesAnyWordSpecLike → Suite
220. [**](../../../akka/persistence/journal/JournalPerfSpec.html#setAutoPilot(pilot:akka.testkit.TestActor.AutoPilot):Unit "Permalink")  def setAutoPilot(pilot: [AutoPilot](../../testkit/TestActor$$AutoPilot.html)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Install an AutoPilot to drive the testActor: the AutoPilot will be run
for each received message and can be used to send or forward messages,
etc.

Install an AutoPilot to drive the testActor: the AutoPilot will be run
for each received message and can be used to send or forward messages,
etc. Each invocation must return the AutoPilot for the next round.

Definition Classes[TestKitBase](../../testkit/TestKitBase.html)
221. [**](../../../akka/persistence/journal/JournalPerfSpec.html#should(endWithWord:org.scalatest.matchers.dsl.EndWithWord)(implicitev:T<:<String):Matchers.this.ResultOfEndWithWordForString "Permalink")  def should(endWithWord: EndWithWord)(implicit ev: [\<:\<](https://www.scala-lang.org/api/2.13.17/scala/$less$colon$less.html#scala.%3C:%3C)\[JournalPerfSpec, String]): org.scalatest.matchers.should.Matchers.ResultOfEndWithWordForStringImplicitThis member is added by an implicit conversion from JournalPerfSpec toorg.scalatest.matchers.should.Matchers.AnyShouldWrapper\[JournalPerfSpec] performed by method convertToAnyShouldWrapper in org.scalatest.matchers.should.Matchers.Definition ClassesAnyShouldWrapper
222. [**](../../../akka/persistence/journal/JournalPerfSpec.html#should(startWithWord:org.scalatest.matchers.dsl.StartWithWord)(implicitev:T<:<String):Matchers.this.ResultOfStartWithWordForString "Permalink")  def should(startWithWord: StartWithWord)(implicit ev: [\<:\<](https://www.scala-lang.org/api/2.13.17/scala/$less$colon$less.html#scala.%3C:%3C)\[JournalPerfSpec, String]): org.scalatest.matchers.should.Matchers.ResultOfStartWithWordForStringImplicitThis member is added by an implicit conversion from JournalPerfSpec toorg.scalatest.matchers.should.Matchers.AnyShouldWrapper\[JournalPerfSpec] performed by method convertToAnyShouldWrapper in org.scalatest.matchers.should.Matchers.Definition ClassesAnyShouldWrapper
223. [**](../../../akka/persistence/journal/JournalPerfSpec.html#should(includeWord:org.scalatest.matchers.dsl.IncludeWord)(implicitev:T<:<String):Matchers.this.ResultOfIncludeWordForString "Permalink")  def should(includeWord: IncludeWord)(implicit ev: [\<:\<](https://www.scala-lang.org/api/2.13.17/scala/$less$colon$less.html#scala.%3C:%3C)\[JournalPerfSpec, String]): org.scalatest.matchers.should.Matchers.ResultOfIncludeWordForStringImplicitThis member is added by an implicit conversion from JournalPerfSpec toorg.scalatest.matchers.should.Matchers.AnyShouldWrapper\[JournalPerfSpec] performed by method convertToAnyShouldWrapper in org.scalatest.matchers.should.Matchers.Definition ClassesAnyShouldWrapper
224. [**](../../../akka/persistence/journal/JournalPerfSpec.html#should(notExist:org.scalatest.matchers.dsl.ResultOfNotExist)(implicitexistence:org.scalatest.enablers.Existence[T]):org.scalatest.Assertion "Permalink")  def should(notExist: ResultOfNotExist)(implicit existence: Existence\[JournalPerfSpec]): AssertionImplicitThis member is added by an implicit conversion from JournalPerfSpec toorg.scalatest.matchers.should.Matchers.AnyShouldWrapper\[JournalPerfSpec] performed by method convertToAnyShouldWrapper in org.scalatest.matchers.should.Matchers.Definition ClassesAnyShouldWrapper
225. [**](../../../akka/persistence/journal/JournalPerfSpec.html#should(existWord:org.scalatest.matchers.dsl.ExistWord)(implicitexistence:org.scalatest.enablers.Existence[T]):org.scalatest.Assertion "Permalink")  def should(existWord: ExistWord)(implicit existence: Existence\[JournalPerfSpec]): AssertionImplicitThis member is added by an implicit conversion from JournalPerfSpec toorg.scalatest.matchers.should.Matchers.AnyShouldWrapper\[JournalPerfSpec] performed by method convertToAnyShouldWrapper in org.scalatest.matchers.should.Matchers.Definition ClassesAnyShouldWrapper
226. [**](../../../akka/persistence/journal/JournalPerfSpec.html#should(containWord:org.scalatest.matchers.dsl.ContainWord):org.scalatest.matchers.dsl.ResultOfContainWord[T] "Permalink")  def should(containWord: ContainWord): ResultOfContainWord\[JournalPerfSpec]ImplicitThis member is added by an implicit conversion from JournalPerfSpec toorg.scalatest.matchers.should.Matchers.AnyShouldWrapper\[JournalPerfSpec] performed by method convertToAnyShouldWrapper in org.scalatest.matchers.should.Matchers.Definition ClassesAnyShouldWrapper
227. [**](../../../akka/persistence/journal/JournalPerfSpec.html#should(haveWord:org.scalatest.matchers.dsl.HaveWord):Matchers.this.ResultOfHaveWordForExtent[T] "Permalink")  def should(haveWord: HaveWord): org.scalatest.matchers.should.Matchers.ResultOfHaveWordForExtent\[JournalPerfSpec]ImplicitThis member is added by an implicit conversion from JournalPerfSpec toorg.scalatest.matchers.should.Matchers.AnyShouldWrapper\[JournalPerfSpec] performed by method convertToAnyShouldWrapper in org.scalatest.matchers.should.Matchers.Definition ClassesAnyShouldWrapper
228. [**](../../../akka/persistence/journal/JournalPerfSpec.html#should(beWord:org.scalatest.matchers.dsl.BeWord):Matchers.this.ResultOfBeWordForAny[T] "Permalink")  def should(beWord: BeWord): org.scalatest.matchers.should.Matchers.ResultOfBeWordForAny\[JournalPerfSpec]ImplicitThis member is added by an implicit conversion from JournalPerfSpec toorg.scalatest.matchers.should.Matchers.AnyShouldWrapper\[JournalPerfSpec] performed by method convertToAnyShouldWrapper in org.scalatest.matchers.should.Matchers.Definition ClassesAnyShouldWrapper
229. [**](../../../akka/persistence/journal/JournalPerfSpec.html#should(inv:org.scalactic.TripleEqualsSupport.TripleEqualsInvocationOnSpread[T])(implicitev:Numeric[T]):org.scalatest.Assertion "Permalink")  def should(inv: TripleEqualsInvocationOnSpread\[JournalPerfSpec])(implicit ev: Numeric\[JournalPerfSpec]): AssertionImplicitThis member is added by an implicit conversion from JournalPerfSpec toorg.scalatest.matchers.should.Matchers.AnyShouldWrapper\[JournalPerfSpec] performed by method convertToAnyShouldWrapper in org.scalatest.matchers.should.Matchers.Definition ClassesAnyShouldWrapper
230. [**](../../../akka/persistence/journal/JournalPerfSpec.html#should[U](inv:org.scalactic.TripleEqualsSupport.TripleEqualsInvocation[U])(implicitconstraint:org.scalactic.CanEqual[T,U]):org.scalatest.Assertion "Permalink")  def should\[U](inv: TripleEqualsInvocation\[U])(implicit constraint: CanEqual\[JournalPerfSpec, U]): AssertionImplicitThis member is added by an implicit conversion from JournalPerfSpec toorg.scalatest.matchers.should.Matchers.AnyShouldWrapper\[JournalPerfSpec] performed by method convertToAnyShouldWrapper in org.scalatest.matchers.should.Matchers.Definition ClassesAnyShouldWrapper
231. [**](../../../akka/persistence/journal/JournalPerfSpec.html#should(notWord:org.scalatest.matchers.dsl.NotWord):org.scalatest.matchers.dsl.ResultOfNotWordForAny[T] "Permalink")  def should(notWord: NotWord): ResultOfNotWordForAny\[JournalPerfSpec]ImplicitThis member is added by an implicit conversion from JournalPerfSpec toorg.scalatest.matchers.should.Matchers.AnyShouldWrapper\[JournalPerfSpec] performed by method convertToAnyShouldWrapper in org.scalatest.matchers.should.Matchers.Definition ClassesAnyShouldWrapper
232. [**](../../../akka/persistence/journal/JournalPerfSpec.html#should[TYPECLASS1[_],TYPECLASS2[_]](rightMatcherFactory2:org.scalatest.matchers.dsl.MatcherFactory2[T,TYPECLASS1,TYPECLASS2])(implicittypeClass1:TYPECLASS1[T],implicittypeClass2:TYPECLASS2[T]):org.scalatest.Assertion "Permalink")  def should\[TYPECLASS1\[\_], TYPECLASS2\[\_]](rightMatcherFactory2: MatcherFactory2\[JournalPerfSpec, TYPECLASS1, TYPECLASS2])(implicit typeClass1: TYPECLASS1\[JournalPerfSpec], typeClass2: TYPECLASS2\[JournalPerfSpec]): AssertionImplicitThis member is added by an implicit conversion from JournalPerfSpec toorg.scalatest.matchers.should.Matchers.AnyShouldWrapper\[JournalPerfSpec] performed by method convertToAnyShouldWrapper in org.scalatest.matchers.should.Matchers.Definition ClassesAnyShouldWrapper
233. [**](../../../akka/persistence/journal/JournalPerfSpec.html#should[TYPECLASS1[_]](rightMatcherFactory1:org.scalatest.matchers.dsl.MatcherFactory1[T,TYPECLASS1])(implicittypeClass1:TYPECLASS1[T]):org.scalatest.Assertion "Permalink")  def should\[TYPECLASS1\[\_]](rightMatcherFactory1: MatcherFactory1\[JournalPerfSpec, TYPECLASS1])(implicit typeClass1: TYPECLASS1\[JournalPerfSpec]): AssertionImplicitThis member is added by an implicit conversion from JournalPerfSpec toorg.scalatest.matchers.should.Matchers.AnyShouldWrapper\[JournalPerfSpec] performed by method convertToAnyShouldWrapper in org.scalatest.matchers.should.Matchers.Definition ClassesAnyShouldWrapper
234. [**](../../../akka/persistence/journal/JournalPerfSpec.html#should(rightMatcherX1:org.scalatest.matchers.Matcher[T]):org.scalatest.Assertion "Permalink")  def should(rightMatcherX1: Matcher\[JournalPerfSpec]): AssertionImplicitThis member is added by an implicit conversion from JournalPerfSpec toorg.scalatest.matchers.should.Matchers.AnyShouldWrapper\[JournalPerfSpec] performed by method convertToAnyShouldWrapper in org.scalatest.matchers.should.Matchers.Definition ClassesAnyShouldWrapper
235. [**](../../../akka/persistence/journal/JournalPerfSpec.html#shouldBe[U>:T](resultOfAnWordApplication:org.scalatest.matchers.dsl.ResultOfAnWordToBePropertyMatcherApplication[U])(implicitev:T<:<AnyRef):org.scalatest.Assertion "Permalink")  def shouldBe\[U \>: T](resultOfAnWordApplication: ResultOfAnWordToBePropertyMatcherApplication\[U])(implicit ev: [\<:\<](https://www.scala-lang.org/api/2.13.17/scala/$less$colon$less.html#scala.%3C:%3C)\[JournalPerfSpec, [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]): AssertionImplicitThis member is added by an implicit conversion from JournalPerfSpec toorg.scalatest.matchers.should.Matchers.AnyShouldWrapper\[JournalPerfSpec] performed by method convertToAnyShouldWrapper in org.scalatest.matchers.should.Matchers.Definition ClassesAnyShouldWrapper
236. [**](../../../akka/persistence/journal/JournalPerfSpec.html#shouldBe[U>:T](resultOfAWordApplication:org.scalatest.matchers.dsl.ResultOfAWordToBePropertyMatcherApplication[U])(implicitev:T<:<AnyRef):org.scalatest.Assertion "Permalink")  def shouldBe\[U \>: T](resultOfAWordApplication: ResultOfAWordToBePropertyMatcherApplication\[U])(implicit ev: [\<:\<](https://www.scala-lang.org/api/2.13.17/scala/$less$colon$less.html#scala.%3C:%3C)\[JournalPerfSpec, [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]): AssertionImplicitThis member is added by an implicit conversion from JournalPerfSpec toorg.scalatest.matchers.should.Matchers.AnyShouldWrapper\[JournalPerfSpec] performed by method convertToAnyShouldWrapper in org.scalatest.matchers.should.Matchers.Definition ClassesAnyShouldWrapper
237. [**](../../../akka/persistence/journal/JournalPerfSpec.html#shouldBe(bePropertyMatcher:org.scalatest.matchers.BePropertyMatcher[T])(implicitev:T<:<AnyRef):org.scalatest.Assertion "Permalink")  def shouldBe(bePropertyMatcher: BePropertyMatcher\[JournalPerfSpec])(implicit ev: [\<:\<](https://www.scala-lang.org/api/2.13.17/scala/$less$colon$less.html#scala.%3C:%3C)\[JournalPerfSpec, [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]): AssertionImplicitThis member is added by an implicit conversion from JournalPerfSpec toorg.scalatest.matchers.should.Matchers.AnyShouldWrapper\[JournalPerfSpec] performed by method convertToAnyShouldWrapper in org.scalatest.matchers.should.Matchers.Definition ClassesAnyShouldWrapper
238. [**](../../../akka/persistence/journal/JournalPerfSpec.html#shouldBe(resultOfAnWordApplication:org.scalatest.matchers.dsl.ResultOfAnWordToSymbolApplication)(implicittoAnyRef:T<:<AnyRef):org.scalatest.Assertion "Permalink")  def shouldBe(resultOfAnWordApplication: ResultOfAnWordToSymbolApplication)(implicit toAnyRef: [\<:\<](https://www.scala-lang.org/api/2.13.17/scala/$less$colon$less.html#scala.%3C:%3C)\[JournalPerfSpec, [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]): AssertionImplicitThis member is added by an implicit conversion from JournalPerfSpec toorg.scalatest.matchers.should.Matchers.AnyShouldWrapper\[JournalPerfSpec] performed by method convertToAnyShouldWrapper in org.scalatest.matchers.should.Matchers.Definition ClassesAnyShouldWrapper
239. [**](../../../akka/persistence/journal/JournalPerfSpec.html#shouldBe(resultOfAWordApplication:org.scalatest.matchers.dsl.ResultOfAWordToSymbolApplication)(implicittoAnyRef:T<:<AnyRef):org.scalatest.Assertion "Permalink")  def shouldBe(resultOfAWordApplication: ResultOfAWordToSymbolApplication)(implicit toAnyRef: [\<:\<](https://www.scala-lang.org/api/2.13.17/scala/$less$colon$less.html#scala.%3C:%3C)\[JournalPerfSpec, [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]): AssertionImplicitThis member is added by an implicit conversion from JournalPerfSpec toorg.scalatest.matchers.should.Matchers.AnyShouldWrapper\[JournalPerfSpec] performed by method convertToAnyShouldWrapper in org.scalatest.matchers.should.Matchers.Definition ClassesAnyShouldWrapper
240. [**](../../../akka/persistence/journal/JournalPerfSpec.html#shouldBe(symbol:Symbol)(implicittoAnyRef:T<:<AnyRef):org.scalatest.Assertion "Permalink")  def shouldBe(symbol: [Symbol](https://www.scala-lang.org/api/2.13.17/scala/Symbol.html#scala.Symbol))(implicit toAnyRef: [\<:\<](https://www.scala-lang.org/api/2.13.17/scala/$less$colon$less.html#scala.%3C:%3C)\[JournalPerfSpec, [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]): AssertionImplicitThis member is added by an implicit conversion from JournalPerfSpec toorg.scalatest.matchers.should.Matchers.AnyShouldWrapper\[JournalPerfSpec] performed by method convertToAnyShouldWrapper in org.scalatest.matchers.should.Matchers.Definition ClassesAnyShouldWrapper
241. [**](../../../akka/persistence/journal/JournalPerfSpec.html#shouldBe(resultOfSameInstanceAsApplication:org.scalatest.matchers.dsl.ResultOfTheSameInstanceAsApplication)(implicittoAnyRef:T<:<AnyRef):org.scalatest.Assertion "Permalink")  def shouldBe(resultOfSameInstanceAsApplication: ResultOfTheSameInstanceAsApplication)(implicit toAnyRef: [\<:\<](https://www.scala-lang.org/api/2.13.17/scala/$less$colon$less.html#scala.%3C:%3C)\[JournalPerfSpec, [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]): AssertionImplicitThis member is added by an implicit conversion from JournalPerfSpec toorg.scalatest.matchers.should.Matchers.AnyShouldWrapper\[JournalPerfSpec] performed by method convertToAnyShouldWrapper in org.scalatest.matchers.should.Matchers.Definition ClassesAnyShouldWrapper
242. [**](../../../akka/persistence/journal/JournalPerfSpec.html#shouldBe(right:Null)(implicitev:T<:<AnyRef):org.scalatest.Assertion "Permalink")  def shouldBe(right: Null)(implicit ev: [\<:\<](https://www.scala-lang.org/api/2.13.17/scala/$less$colon$less.html#scala.%3C:%3C)\[JournalPerfSpec, [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]): AssertionImplicitThis member is added by an implicit conversion from JournalPerfSpec toorg.scalatest.matchers.should.Matchers.AnyShouldWrapper\[JournalPerfSpec] performed by method convertToAnyShouldWrapper in org.scalatest.matchers.should.Matchers.Definition ClassesAnyShouldWrapper
243. [**](../../../akka/persistence/journal/JournalPerfSpec.html#shouldBe(right:org.scalatest.matchers.dsl.DefinedWord)(implicitdefinition:org.scalatest.enablers.Definition[T]):org.scalatest.Assertion "Permalink")  def shouldBe(right: DefinedWord)(implicit definition: Definition\[JournalPerfSpec]): AssertionImplicitThis member is added by an implicit conversion from JournalPerfSpec toorg.scalatest.matchers.should.Matchers.AnyShouldWrapper\[JournalPerfSpec] performed by method convertToAnyShouldWrapper in org.scalatest.matchers.should.Matchers.Definition ClassesAnyShouldWrapper
244. [**](../../../akka/persistence/journal/JournalPerfSpec.html#shouldBe(right:org.scalatest.matchers.dsl.EmptyWord)(implicitemptiness:org.scalatest.enablers.Emptiness[T]):org.scalatest.Assertion "Permalink")  def shouldBe(right: EmptyWord)(implicit emptiness: Emptiness\[JournalPerfSpec]): AssertionImplicitThis member is added by an implicit conversion from JournalPerfSpec toorg.scalatest.matchers.should.Matchers.AnyShouldWrapper\[JournalPerfSpec] performed by method convertToAnyShouldWrapper in org.scalatest.matchers.should.Matchers.Definition ClassesAnyShouldWrapper
245. [**](../../../akka/persistence/journal/JournalPerfSpec.html#shouldBe(right:org.scalatest.matchers.dsl.WritableWord)(implicitwritability:org.scalatest.enablers.Writability[T]):org.scalatest.Assertion "Permalink")  def shouldBe(right: WritableWord)(implicit writability: Writability\[JournalPerfSpec]): AssertionImplicitThis member is added by an implicit conversion from JournalPerfSpec toorg.scalatest.matchers.should.Matchers.AnyShouldWrapper\[JournalPerfSpec] performed by method convertToAnyShouldWrapper in org.scalatest.matchers.should.Matchers.Definition ClassesAnyShouldWrapper
246. [**](../../../akka/persistence/journal/JournalPerfSpec.html#shouldBe(right:org.scalatest.matchers.dsl.ReadableWord)(implicitreadability:org.scalatest.enablers.Readability[T]):org.scalatest.Assertion "Permalink")  def shouldBe(right: ReadableWord)(implicit readability: Readability\[JournalPerfSpec]): AssertionImplicitThis member is added by an implicit conversion from JournalPerfSpec toorg.scalatest.matchers.should.Matchers.AnyShouldWrapper\[JournalPerfSpec] performed by method convertToAnyShouldWrapper in org.scalatest.matchers.should.Matchers.Definition ClassesAnyShouldWrapper
247. [**](../../../akka/persistence/journal/JournalPerfSpec.html#shouldBe(anType:org.scalatest.matchers.dsl.ResultOfAnTypeInvocation[_]):org.scalatest.Assertion "Permalink") macro  def shouldBe(anType: ResultOfAnTypeInvocation\[\_]): AssertionImplicitThis member is added by an implicit conversion from JournalPerfSpec toorg.scalatest.matchers.should.Matchers.AnyShouldWrapper\[JournalPerfSpec] performed by method convertToAnyShouldWrapper in org.scalatest.matchers.should.Matchers.Definition ClassesAnyShouldWrapper
248. [**](../../../akka/persistence/journal/JournalPerfSpec.html#shouldBe(aType:org.scalatest.matchers.dsl.ResultOfATypeInvocation[_]):org.scalatest.Assertion "Permalink") macro  def shouldBe(aType: ResultOfATypeInvocation\[\_]): AssertionImplicitThis member is added by an implicit conversion from JournalPerfSpec toorg.scalatest.matchers.should.Matchers.AnyShouldWrapper\[JournalPerfSpec] performed by method convertToAnyShouldWrapper in org.scalatest.matchers.should.Matchers.Definition ClassesAnyShouldWrapper
249. [**](../../../akka/persistence/journal/JournalPerfSpec.html#shouldBe(right:org.scalatest.matchers.dsl.SortedWord)(implicitsortable:org.scalatest.enablers.Sortable[T]):org.scalatest.Assertion "Permalink")  def shouldBe(right: SortedWord)(implicit sortable: Sortable\[JournalPerfSpec]): AssertionImplicitThis member is added by an implicit conversion from JournalPerfSpec toorg.scalatest.matchers.should.Matchers.AnyShouldWrapper\[JournalPerfSpec] performed by method convertToAnyShouldWrapper in org.scalatest.matchers.should.Matchers.Definition ClassesAnyShouldWrapper
250. [**](../../../akka/persistence/journal/JournalPerfSpec.html#shouldBe(spread:org.scalactic.TripleEqualsSupport.Spread[T]):org.scalatest.Assertion "Permalink")  def shouldBe(spread: Spread\[JournalPerfSpec]): AssertionImplicitThis member is added by an implicit conversion from JournalPerfSpec toorg.scalatest.matchers.should.Matchers.AnyShouldWrapper\[JournalPerfSpec] performed by method convertToAnyShouldWrapper in org.scalatest.matchers.should.Matchers.Definition ClassesAnyShouldWrapper
251. [**](../../../akka/persistence/journal/JournalPerfSpec.html#shouldBe(beMatcher:org.scalatest.matchers.BeMatcher[T]):org.scalatest.Assertion "Permalink")  def shouldBe(beMatcher: BeMatcher\[JournalPerfSpec]): AssertionImplicitThis member is added by an implicit conversion from JournalPerfSpec toorg.scalatest.matchers.should.Matchers.AnyShouldWrapper\[JournalPerfSpec] performed by method convertToAnyShouldWrapper in org.scalatest.matchers.should.Matchers.Definition ClassesAnyShouldWrapper
252. [**](../../../akka/persistence/journal/JournalPerfSpec.html#shouldBe(comparison:org.scalatest.matchers.dsl.ResultOfGreaterThanOrEqualToComparison[T]):org.scalatest.Assertion "Permalink")  def shouldBe(comparison: ResultOfGreaterThanOrEqualToComparison\[JournalPerfSpec]): AssertionImplicitThis member is added by an implicit conversion from JournalPerfSpec toorg.scalatest.matchers.should.Matchers.AnyShouldWrapper\[JournalPerfSpec] performed by method convertToAnyShouldWrapper in org.scalatest.matchers.should.Matchers.Definition ClassesAnyShouldWrapper
253. [**](../../../akka/persistence/journal/JournalPerfSpec.html#shouldBe(comparison:org.scalatest.matchers.dsl.ResultOfLessThanOrEqualToComparison[T]):org.scalatest.Assertion "Permalink")  def shouldBe(comparison: ResultOfLessThanOrEqualToComparison\[JournalPerfSpec]): AssertionImplicitThis member is added by an implicit conversion from JournalPerfSpec toorg.scalatest.matchers.should.Matchers.AnyShouldWrapper\[JournalPerfSpec] performed by method convertToAnyShouldWrapper in org.scalatest.matchers.should.Matchers.Definition ClassesAnyShouldWrapper
254. [**](../../../akka/persistence/journal/JournalPerfSpec.html#shouldBe(comparison:org.scalatest.matchers.dsl.ResultOfGreaterThanComparison[T]):org.scalatest.Assertion "Permalink")  def shouldBe(comparison: ResultOfGreaterThanComparison\[JournalPerfSpec]): AssertionImplicitThis member is added by an implicit conversion from JournalPerfSpec toorg.scalatest.matchers.should.Matchers.AnyShouldWrapper\[JournalPerfSpec] performed by method convertToAnyShouldWrapper in org.scalatest.matchers.should.Matchers.Definition ClassesAnyShouldWrapper
255. [**](../../../akka/persistence/journal/JournalPerfSpec.html#shouldBe(comparison:org.scalatest.matchers.dsl.ResultOfLessThanComparison[T]):org.scalatest.Assertion "Permalink")  def shouldBe(comparison: ResultOfLessThanComparison\[JournalPerfSpec]): AssertionImplicitThis member is added by an implicit conversion from JournalPerfSpec toorg.scalatest.matchers.should.Matchers.AnyShouldWrapper\[JournalPerfSpec] performed by method convertToAnyShouldWrapper in org.scalatest.matchers.should.Matchers.Definition ClassesAnyShouldWrapper
256. [**](../../../akka/persistence/journal/JournalPerfSpec.html#shouldBe(right:Any):org.scalatest.Assertion "Permalink")  def shouldBe(right: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): AssertionImplicitThis member is added by an implicit conversion from JournalPerfSpec toorg.scalatest.matchers.should.Matchers.AnyShouldWrapper\[JournalPerfSpec] performed by method convertToAnyShouldWrapper in org.scalatest.matchers.should.Matchers.Definition ClassesAnyShouldWrapper
257. [**](../../../akka/persistence/journal/JournalPerfSpec.html#shouldEqual(right:Null)(implicitev:T<:<AnyRef):org.scalatest.Assertion "Permalink")  def shouldEqual(right: Null)(implicit ev: [\<:\<](https://www.scala-lang.org/api/2.13.17/scala/$less$colon$less.html#scala.%3C:%3C)\[JournalPerfSpec, [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]): AssertionImplicitThis member is added by an implicit conversion from JournalPerfSpec toorg.scalatest.matchers.should.Matchers.AnyShouldWrapper\[JournalPerfSpec] performed by method convertToAnyShouldWrapper in org.scalatest.matchers.should.Matchers.Definition ClassesAnyShouldWrapper
258. [**](../../../akka/persistence/journal/JournalPerfSpec.html#shouldEqual(spread:org.scalactic.TripleEqualsSupport.Spread[T]):org.scalatest.Assertion "Permalink")  def shouldEqual(spread: Spread\[JournalPerfSpec]): AssertionImplicitThis member is added by an implicit conversion from JournalPerfSpec toorg.scalatest.matchers.should.Matchers.AnyShouldWrapper\[JournalPerfSpec] performed by method convertToAnyShouldWrapper in org.scalatest.matchers.should.Matchers.Definition ClassesAnyShouldWrapper
259. [**](../../../akka/persistence/journal/JournalPerfSpec.html#shouldEqual(right:Any)(implicitequality:org.scalactic.Equality[T]):org.scalatest.Assertion "Permalink")  def shouldEqual(right: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any))(implicit equality: Equality\[JournalPerfSpec]): AssertionImplicitThis member is added by an implicit conversion from JournalPerfSpec toorg.scalatest.matchers.should.Matchers.AnyShouldWrapper\[JournalPerfSpec] performed by method convertToAnyShouldWrapper in org.scalatest.matchers.should.Matchers.Definition ClassesAnyShouldWrapper
260. [**](../../../akka/persistence/journal/JournalPerfSpec.html#shouldNot(includeWord:org.scalatest.matchers.dsl.IncludeWord)(implicitev:T<:<String):Matchers.this.ResultOfIncludeWordForString "Permalink")  def shouldNot(includeWord: IncludeWord)(implicit ev: [\<:\<](https://www.scala-lang.org/api/2.13.17/scala/$less$colon$less.html#scala.%3C:%3C)\[JournalPerfSpec, String]): org.scalatest.matchers.should.Matchers.ResultOfIncludeWordForStringImplicitThis member is added by an implicit conversion from JournalPerfSpec toorg.scalatest.matchers.should.Matchers.AnyShouldWrapper\[JournalPerfSpec] performed by method convertToAnyShouldWrapper in org.scalatest.matchers.should.Matchers.Definition ClassesAnyShouldWrapper
261. [**](../../../akka/persistence/journal/JournalPerfSpec.html#shouldNot(endWithWord:org.scalatest.matchers.dsl.EndWithWord)(implicitev:T<:<String):Matchers.this.ResultOfEndWithWordForString "Permalink")  def shouldNot(endWithWord: EndWithWord)(implicit ev: [\<:\<](https://www.scala-lang.org/api/2.13.17/scala/$less$colon$less.html#scala.%3C:%3C)\[JournalPerfSpec, String]): org.scalatest.matchers.should.Matchers.ResultOfEndWithWordForStringImplicitThis member is added by an implicit conversion from JournalPerfSpec toorg.scalatest.matchers.should.Matchers.AnyShouldWrapper\[JournalPerfSpec] performed by method convertToAnyShouldWrapper in org.scalatest.matchers.should.Matchers.Definition ClassesAnyShouldWrapper
262. [**](../../../akka/persistence/journal/JournalPerfSpec.html#shouldNot(startWithWord:org.scalatest.matchers.dsl.StartWithWord)(implicitev:T<:<String):Matchers.this.ResultOfStartWithWordForString "Permalink")  def shouldNot(startWithWord: StartWithWord)(implicit ev: [\<:\<](https://www.scala-lang.org/api/2.13.17/scala/$less$colon$less.html#scala.%3C:%3C)\[JournalPerfSpec, String]): org.scalatest.matchers.should.Matchers.ResultOfStartWithWordForStringImplicitThis member is added by an implicit conversion from JournalPerfSpec toorg.scalatest.matchers.should.Matchers.AnyShouldWrapper\[JournalPerfSpec] performed by method convertToAnyShouldWrapper in org.scalatest.matchers.should.Matchers.Definition ClassesAnyShouldWrapper
263. [**](../../../akka/persistence/journal/JournalPerfSpec.html#shouldNot(existWord:org.scalatest.matchers.dsl.ExistWord)(implicitexistence:org.scalatest.enablers.Existence[T]):org.scalatest.Assertion "Permalink")  def shouldNot(existWord: ExistWord)(implicit existence: Existence\[JournalPerfSpec]): AssertionImplicitThis member is added by an implicit conversion from JournalPerfSpec toorg.scalatest.matchers.should.Matchers.AnyShouldWrapper\[JournalPerfSpec] performed by method convertToAnyShouldWrapper in org.scalatest.matchers.should.Matchers.Definition ClassesAnyShouldWrapper
264. [**](../../../akka/persistence/journal/JournalPerfSpec.html#shouldNot(contain:org.scalatest.matchers.dsl.ContainWord):org.scalatest.matchers.dsl.ResultOfContainWord[T] "Permalink")  def shouldNot(contain: ContainWord): ResultOfContainWord\[JournalPerfSpec]ImplicitThis member is added by an implicit conversion from JournalPerfSpec toorg.scalatest.matchers.should.Matchers.AnyShouldWrapper\[JournalPerfSpec] performed by method convertToAnyShouldWrapper in org.scalatest.matchers.should.Matchers.Definition ClassesAnyShouldWrapper
265. [**](../../../akka/persistence/journal/JournalPerfSpec.html#shouldNot(haveWord:org.scalatest.matchers.dsl.HaveWord):Matchers.this.ResultOfHaveWordForExtent[T] "Permalink")  def shouldNot(haveWord: HaveWord): org.scalatest.matchers.should.Matchers.ResultOfHaveWordForExtent\[JournalPerfSpec]ImplicitThis member is added by an implicit conversion from JournalPerfSpec toorg.scalatest.matchers.should.Matchers.AnyShouldWrapper\[JournalPerfSpec] performed by method convertToAnyShouldWrapper in org.scalatest.matchers.should.Matchers.Definition ClassesAnyShouldWrapper
266. [**](../../../akka/persistence/journal/JournalPerfSpec.html#shouldNot[TYPECLASS1[_]](rightMatcherFactory1:org.scalatest.matchers.dsl.MatcherFactory1[T,TYPECLASS1])(implicittypeClass1:TYPECLASS1[T]):org.scalatest.Assertion "Permalink")  def shouldNot\[TYPECLASS1\[\_]](rightMatcherFactory1: MatcherFactory1\[JournalPerfSpec, TYPECLASS1])(implicit typeClass1: TYPECLASS1\[JournalPerfSpec]): AssertionImplicitThis member is added by an implicit conversion from JournalPerfSpec toorg.scalatest.matchers.should.Matchers.AnyShouldWrapper\[JournalPerfSpec] performed by method convertToAnyShouldWrapper in org.scalatest.matchers.should.Matchers.Definition ClassesAnyShouldWrapper
267. [**](../../../akka/persistence/journal/JournalPerfSpec.html#shouldNot(rightMatcherX1:org.scalatest.matchers.Matcher[T]):org.scalatest.Assertion "Permalink")  def shouldNot(rightMatcherX1: Matcher\[JournalPerfSpec]): AssertionImplicitThis member is added by an implicit conversion from JournalPerfSpec toorg.scalatest.matchers.should.Matchers.AnyShouldWrapper\[JournalPerfSpec] performed by method convertToAnyShouldWrapper in org.scalatest.matchers.should.Matchers.Definition ClassesAnyShouldWrapper
268. [**](../../../akka/persistence/journal/JournalPerfSpec.html#shouldNot(beWord:org.scalatest.matchers.dsl.BeWord):Matchers.this.ResultOfBeWordForAny[T] "Permalink")  def shouldNot(beWord: BeWord): org.scalatest.matchers.should.Matchers.ResultOfBeWordForAny\[JournalPerfSpec]ImplicitThis member is added by an implicit conversion from JournalPerfSpec toorg.scalatest.matchers.should.Matchers.AnyShouldWrapper\[JournalPerfSpec] performed by method convertToAnyShouldWrapper in org.scalatest.matchers.should.Matchers.Definition ClassesAnyShouldWrapper
269. [**](../../../akka/persistence/journal/JournalPerfSpec.html#shutdown(actorSystem:akka.actor.ActorSystem,duration:scala.concurrent.duration.Duration,verifySystemShutdown:Boolean):Unit "Permalink")  def shutdown(actorSystem: [ActorSystem](../../actor/ActorSystem.html) \= [system](../../testkit/TestKitBase.html#system:akka.actor.ActorSystem), duration: [Duration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/Duration.html#scala.concurrent.duration.Duration) \= Duration.Undefined, verifySystemShutdown: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean) \= false): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Shut down an actor system and wait for termination.

Shut down an actor system and wait for termination.
On failure debug output will be logged about the remaining actors in the system.

If verifySystemShutdown is true, then an exception will be thrown on failure.

Definition Classes[TestKitBase](../../testkit/TestKitBase.html)
270. [**](../../../akka/persistence/journal/JournalPerfSpec.html#size:org.scalatest.matchers.dsl.SizeWord "Permalink")  val size: SizeWordDefinition ClassesMatcherWords
271. [**](../../../akka/persistence/journal/JournalPerfSpec.html#sorted:org.scalatest.matchers.dsl.SortedWord "Permalink")  val sorted: SortedWordDefinition ClassesMatcherWords
272. [**](../../../akka/persistence/journal/JournalPerfSpec.html#startWith:org.scalatest.matchers.dsl.StartWithWord "Permalink")  val startWith: StartWithWordDefinition ClassesMatcherWords
273. [**](../../../akka/persistence/journal/JournalPerfSpec.html#subjectRegistrationFunction:org.scalatest.verbs.StringVerbBlockRegistration "Permalink") implicit  val subjectRegistrationFunction: StringVerbBlockRegistrationAttributesprotected Definition ClassesAnyWordSpecLike
274. [**](../../../akka/persistence/journal/JournalPerfSpec.html#subjectWithAfterWordRegistrationFunction:org.scalatest.verbs.SubjectWithAfterWordRegistration "Permalink") implicit  val subjectWithAfterWordRegistrationFunction: SubjectWithAfterWordRegistrationAttributesprotected Definition ClassesAnyWordSpecLike
275. [**](../../../akka/persistence/journal/JournalPerfSpec.html#subscribe[T](subscriber:akka.actor.ActorRef)(implicitevidence$1:scala.reflect.ClassTag[T]):Boolean "Permalink")  def subscribe\[T](subscriber: [ActorRef](../../actor/ActorRef.html))(implicit arg0: [ClassTag](https://www.scala-lang.org/api/2.13.17/scala/reflect/ClassTag.html#scala.reflect.ClassTag)\[T]): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition Classes[PluginSpec](../PluginSpec.html)
276. [**](../../../akka/persistence/journal/JournalPerfSpec.html#succeed:org.scalatest.Assertion "Permalink") final  val succeed: AssertionDefinition ClassesAssertions
277. [**](../../../akka/persistence/journal/JournalPerfSpec.html#suiteId:String "Permalink")  def suiteId: StringDefinition ClassesSuite
278. [**](../../../akka/persistence/journal/JournalPerfSpec.html#suiteName:String "Permalink")  def suiteName: StringDefinition ClassesSuite
279. [**](../../../akka/persistence/journal/JournalPerfSpec.html#supportsAtomicPersistAllOfSeveralEvents:Boolean "Permalink")  def supportsAtomicPersistAllOfSeveralEvents: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Implementation may override and return false if it does not
support atomic writes of several events, as emitted by `persistAll`.

Implementation may override and return false if it does not
support atomic writes of several events, as emitted by `persistAll`.

Definition Classes[JournalSpec](JournalSpec.html)
280. [**](../../../akka/persistence/journal/JournalPerfSpec.html#supportsMetadata:akka.persistence.CapabilityFlag "Permalink")  def supportsMetadata: [CapabilityFlag](../CapabilityFlag.html)When `true` enables tests which check if the Journal stores and returns
metadata for an event

When `true` enables tests which check if the Journal stores and returns
metadata for an event

Attributesprotected Definition Classes[JournalSpec](JournalSpec.html) → [JournalCapabilityFlags](../JournalCapabilityFlags.html)
281. [**](../../../akka/persistence/journal/JournalPerfSpec.html#supportsReplayOnlyLast:akka.persistence.CapabilityFlag "Permalink")  def supportsReplayOnlyLast: [CapabilityFlag](../CapabilityFlag.html)When `true` enables tests which check if the Journal can replay only the last event.

When `true` enables tests which check if the Journal can replay only the last event.

Attributesprotected Definition Classes[JournalSpec](JournalSpec.html) → [JournalCapabilityFlags](../JournalCapabilityFlags.html)
282. [**](../../../akka/persistence/journal/JournalPerfSpec.html#supportsSerialization:akka.persistence.CapabilityFlag "Permalink")  def supportsSerialization: [CapabilityFlag](../CapabilityFlag.html)When `true` enables tests which check if the Journal properly serialize and
deserialize events.

When `true` enables tests which check if the Journal properly serialize and
deserialize events.

Attributesprotected Definition Classes[JournalSpec](JournalSpec.html) → [JournalCapabilityFlags](../JournalCapabilityFlags.html)
283. [**](../../../akka/persistence/journal/JournalPerfSpec.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
284. [**](../../../akka/persistence/journal/JournalPerfSpec.html#system:akka.actor.ActorSystem "Permalink") implicit  lazy val system: [ActorSystem](../../actor/ActorSystem.html)Definition Classes[JournalSpec](JournalSpec.html) → [TestKitBase](../../testkit/TestKitBase.html)
285. [**](../../../akka/persistence/journal/JournalPerfSpec.html#tags:Map[String,Set[String]] "Permalink")  def tags: Map\[String, Set\[String]]Definition ClassesAnyWordSpecLike → Suite
286. [**](../../../akka/persistence/journal/JournalPerfSpec.html#testActor:akka.actor.ActorRef "Permalink")  lazy val testActor: [ActorRef](../../actor/ActorRef.html)ActorRef of the test actor.

ActorRef of the test actor. Access is provided to enable e.g.
registration as message target.

Definition Classes[TestKitBase](../../testkit/TestKitBase.html)
287. [**](../../../akka/persistence/journal/JournalPerfSpec.html#testActorName:String "Permalink")  def testActorName: StringDefines the testActor name.

Defines the testActor name.

Attributesprotected Definition Classes[TestKitBase](../../testkit/TestKitBase.html)
288. [**](../../../akka/persistence/journal/JournalPerfSpec.html#testDataFor(testName:String,theConfigMap:org.scalatest.ConfigMap):org.scalatest.TestData "Permalink")  def testDataFor(testName: String, theConfigMap: ConfigMap): TestDataDefinition ClassesAnyWordSpecLike → Suite
289. [**](../../../akka/persistence/journal/JournalPerfSpec.html#testKitSettings:akka.testkit.TestKitSettings "Permalink")  def testKitSettings: [TestKitSettings](../../testkit/TestKitSettings.html)Definition Classes[TestKitBase](../../testkit/TestKitBase.html)
290. [**](../../../akka/persistence/journal/JournalPerfSpec.html#testNames:Set[String] "Permalink")  def testNames: Set\[String]Definition ClassesAnyWordSpecLike → Suite
291. [**](../../../akka/persistence/journal/JournalPerfSpec.html#the[T](implicitevidence$7:scala.reflect.ClassTag[T],implicitpos:org.scalactic.source.Position):org.scalatest.matchers.dsl.ResultOfTheTypeInvocation[T] "Permalink")  def the\[T](implicit arg0: [ClassTag](https://www.scala-lang.org/api/2.13.17/scala/reflect/ClassTag.html#scala.reflect.ClassTag)\[T], pos: Position): ResultOfTheTypeInvocation\[T]Definition ClassesMatchers
292. [**](../../../akka/persistence/journal/JournalPerfSpec.html#theSameElementsAs(xs:collection.GenTraversable[_]):org.scalatest.matchers.dsl.ResultOfTheSameElementsAsApplication "Permalink")  def theSameElementsAs(xs: GenTraversable\[\_]): ResultOfTheSameElementsAsApplicationDefinition ClassesMatchers
293. [**](../../../akka/persistence/journal/JournalPerfSpec.html#theSameElementsInOrderAs(xs:collection.GenTraversable[_]):org.scalatest.matchers.dsl.ResultOfTheSameElementsInOrderAsApplication "Permalink")  def theSameElementsInOrderAs(xs: GenTraversable\[\_]): ResultOfTheSameElementsInOrderAsApplicationDefinition ClassesMatchers
294. [**](../../../akka/persistence/journal/JournalPerfSpec.html#theSameInstanceAs:Matchers.this.TheSameInstanceAsPhrase "Permalink")  val theSameInstanceAs: [TheSameInstanceAsPhrase](#TheSameInstanceAsPhraseextendsAnyRef)Definition ClassesMatchers
295. [**](../../../akka/persistence/journal/JournalPerfSpec.html#they:AnyWordSpecLike.this.TheyWord "Permalink")  val they: [TheyWord](#TheyWordextendsAnyRef)Attributesprotected Definition ClassesAnyWordSpecLike
296. [**](../../../akka/persistence/journal/JournalPerfSpec.html#thrownBy(fun:=>Any):org.scalatest.matchers.dsl.ResultOfThrownByApplication "Permalink")  def thrownBy(fun: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ResultOfThrownByApplicationDefinition ClassesMatchers
297. [**](../../../akka/persistence/journal/JournalPerfSpec.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
298. [**](../../../akka/persistence/journal/JournalPerfSpec.html#typeCheck:org.scalatest.verbs.TypeCheckWord "Permalink")  val typeCheck: TypeCheckWordDefinition ClassesMatcherWords
299. [**](../../../akka/persistence/journal/JournalPerfSpec.html#typeCheckedConstraint[A,B](implicitequivalenceOfA:org.scalactic.Equivalence[A],implicitev:B<:<A):org.scalactic.CanEqual[A,B] "Permalink")  def typeCheckedConstraint\[A, B](implicit equivalenceOfA: Equivalence\[A], ev: [\<:\<](https://www.scala-lang.org/api/2.13.17/scala/$less$colon$less.html#scala.%3C:%3C)\[B, A]): CanEqual\[A, B]Definition ClassesTripleEquals → TripleEqualsSupport
300. [**](../../../akka/persistence/journal/JournalPerfSpec.html#unconstrainedEquality[A,B](implicitequalityOfA:org.scalactic.Equality[A]):org.scalactic.CanEqual[A,B] "Permalink") implicit  def unconstrainedEquality\[A, B](implicit equalityOfA: Equality\[A]): CanEqual\[A, B]Definition ClassesTripleEquals → TripleEqualsSupport
301. [**](../../../akka/persistence/journal/JournalPerfSpec.html#unwatch(ref:akka.actor.ActorRef):akka.actor.ActorRef "Permalink")  def unwatch(ref: [ActorRef](../../actor/ActorRef.html)): [ActorRef](../../actor/ActorRef.html)Have the testActor stop watching someone (i.e.

Have the testActor stop watching someone (i.e. `context.unwatch(...)`).

Definition Classes[TestKitBase](../../testkit/TestKitBase.html)
302. [**](../../../akka/persistence/journal/JournalPerfSpec.html#value:Matchers.this.ValueWord "Permalink")  val value: [ValueWord](#ValueWordextendsAnyRef)Definition ClassesMatchers
303. [**](../../../akka/persistence/journal/JournalPerfSpec.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
304. [**](../../../akka/persistence/journal/JournalPerfSpec.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
305. [**](../../../akka/persistence/journal/JournalPerfSpec.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
306. [**](../../../akka/persistence/journal/JournalPerfSpec.html#watch(ref:akka.actor.ActorRef):akka.actor.ActorRef "Permalink")  def watch(ref: [ActorRef](../../actor/ActorRef.html)): [ActorRef](../../actor/ActorRef.html)Have the testActor watch someone (i.e.

Have the testActor watch someone (i.e. `context.watch(...)`).

Definition Classes[TestKitBase](../../testkit/TestKitBase.html)
307. [**](../../../akka/persistence/journal/JournalPerfSpec.html#withClue[T](clue:Any)(fun:=>T):T "Permalink")  def withClue\[T](clue: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any))(fun: \=\> T): TDefinition ClassesAssertions
308. [**](../../../akka/persistence/journal/JournalPerfSpec.html#withFixture(test:TestSuite.this.NoArgTest):org.scalatest.Outcome "Permalink")  def withFixture(test: [NoArgTest](#NoArgTestextends()=>org.scalatest.OutcomewithTestData)): OutcomeAttributesprotected Definition ClassesTestSuite
309. [**](../../../akka/persistence/journal/JournalPerfSpec.html#within[T](max:scala.concurrent.duration.FiniteDuration)(f:=>T):T "Permalink")  def within\[T](max: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration))(f: \=\> T): TSame as calling `within(0 seconds, max)(f)`.

Same as calling `within(0 seconds, max)(f)`.

Definition Classes[TestKitBase](../../testkit/TestKitBase.html)
310. [**](../../../akka/persistence/journal/JournalPerfSpec.html#within[T](min:scala.concurrent.duration.FiniteDuration,max:scala.concurrent.duration.FiniteDuration)(f:=>T):T "Permalink")  def within\[T](min: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), max: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration))(f: \=\> T): TExecute code block while bounding its execution time between `min` and
`max`.

Execute code block while bounding its execution time between `min` and
`max`. `within` blocks may be nested. All methods in this trait which
take maximum wait times are available in a version which implicitly uses
the remaining time governed by the innermost enclosing `within` block.

Note that the timeout is scaled using Duration.dilated, which uses the
configuration entry "akka.test.timefactor", while the min Duration is not.

```
val ret = within(50 millis) {
  test ! "ping"
  expectMsgClass(classOf[String])
}
```
Definition Classes[TestKitBase](../../testkit/TestKitBase.html)
311. [**](../../../akka/persistence/journal/JournalPerfSpec.html#writable:org.scalatest.matchers.dsl.WritableWord "Permalink")  val writable: WritableWordDefinition ClassesMatcherWords
312. [**](../../../akka/persistence/journal/JournalPerfSpec.html#writeMessages(fromSnr:Int,toSnr:Int,pid:String,sender:akka.actor.ActorRef,writerUuid:String):Unit "Permalink")  def writeMessages(fromSnr: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), toSnr: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), pid: String, sender: [ActorRef](../../actor/ActorRef.html), writerUuid: String): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition Classes[JournalSpec](JournalSpec.html)
313. [**](../../../akka/persistence/journal/JournalPerfSpec.html#writerUuid:String "Permalink")  def writerUuid: StringDefinition Classes[PluginSpec](../PluginSpec.html)
### Shadowed Implicit Value Members

1. [**](../../../akka/persistence/journal/JournalPerfSpec.html#!==(literalNull:Null):Boolean "Permalink")  def !\=\=(literalNull: Null): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)ImplicitThis member is added by an implicit conversion from JournalPerfSpec toorg.scalatest.Assertions.Equalizer\[JournalPerfSpec] performed by method convertToEqualizer in org.scalactic.TripleEquals.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(journalPerfSpec: org.scalatest.Assertions.Equalizer[JournalPerfSpec]).!==(literalNull)
```
Definition ClassesEqualizer
2. [**](../../../akka/persistence/journal/JournalPerfSpec.html#!==(spread:org.scalactic.TripleEqualsSupport.Spread[L]):Boolean "Permalink")  def !\=\=(spread: Spread\[JournalPerfSpec]): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)ImplicitThis member is added by an implicit conversion from JournalPerfSpec toorg.scalatest.Assertions.Equalizer\[JournalPerfSpec] performed by method convertToEqualizer in org.scalactic.TripleEquals.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(journalPerfSpec: org.scalatest.Assertions.Equalizer[JournalPerfSpec]).!==(spread)
```
Definition ClassesEqualizer
3. [**](../../../akka/persistence/journal/JournalPerfSpec.html#!==(rightSide:Any)(implicitequality:org.scalactic.Equality[L]):Boolean "Permalink")  def !\=\=(rightSide: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any))(implicit equality: Equality\[JournalPerfSpec]): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)ImplicitThis member is added by an implicit conversion from JournalPerfSpec toorg.scalatest.Assertions.Equalizer\[JournalPerfSpec] performed by method convertToEqualizer in org.scalactic.TripleEquals.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(journalPerfSpec: org.scalatest.Assertions.Equalizer[JournalPerfSpec]).!==(rightSide)(equality)
```
Definition ClassesEqualizer
4. [**](../../../akka/persistence/journal/JournalPerfSpec.html#!==(literalNull:Null):Boolean "Permalink")  def !\=\=(literalNull: Null): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)ImplicitThis member is added by an implicit conversion from JournalPerfSpec toorg.scalactic.TripleEquals.Equalizer\[JournalPerfSpec] performed by method convertToEqualizer in org.scalactic.TripleEquals.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(journalPerfSpec: org.scalactic.TripleEquals.Equalizer[JournalPerfSpec]).!==(literalNull)
```
Definition ClassesEqualizer
5. [**](../../../akka/persistence/journal/JournalPerfSpec.html#!==(spread:org.scalactic.TripleEqualsSupport.Spread[L]):Boolean "Permalink")  def !\=\=(spread: Spread\[JournalPerfSpec]): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)ImplicitThis member is added by an implicit conversion from JournalPerfSpec toorg.scalactic.TripleEquals.Equalizer\[JournalPerfSpec] performed by method convertToEqualizer in org.scalactic.TripleEquals.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(journalPerfSpec: org.scalactic.TripleEquals.Equalizer[JournalPerfSpec]).!==(spread)
```
Definition ClassesEqualizer
6. [**](../../../akka/persistence/journal/JournalPerfSpec.html#!==(rightSide:Any)(implicitequality:org.scalactic.Equality[L]):Boolean "Permalink")  def !\=\=(rightSide: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any))(implicit equality: Equality\[JournalPerfSpec]): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)ImplicitThis member is added by an implicit conversion from JournalPerfSpec toorg.scalactic.TripleEquals.Equalizer\[JournalPerfSpec] performed by method convertToEqualizer in org.scalactic.TripleEquals.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(journalPerfSpec: org.scalactic.TripleEquals.Equalizer[JournalPerfSpec]).!==(rightSide)(equality)
```
Definition ClassesEqualizer
7. [**](../../../akka/persistence/journal/JournalPerfSpec.html#!==(literalNull:Null):Boolean "Permalink")  def !\=\=(literalNull: Null): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)ImplicitThis member is added by an implicit conversion from JournalPerfSpec toorg.scalatest.matchers.should.Matchers.Equalizer\[JournalPerfSpec] performed by method convertToEqualizer in org.scalactic.TripleEquals.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(journalPerfSpec: org.scalatest.matchers.should.Matchers.Equalizer[JournalPerfSpec]).!==(literalNull)
```
Definition ClassesEqualizer
8. [**](../../../akka/persistence/journal/JournalPerfSpec.html#!==(spread:org.scalactic.TripleEqualsSupport.Spread[L]):Boolean "Permalink")  def !\=\=(spread: Spread\[JournalPerfSpec]): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)ImplicitThis member is added by an implicit conversion from JournalPerfSpec toorg.scalatest.matchers.should.Matchers.Equalizer\[JournalPerfSpec] performed by method convertToEqualizer in org.scalactic.TripleEquals.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(journalPerfSpec: org.scalatest.matchers.should.Matchers.Equalizer[JournalPerfSpec]).!==(spread)
```
Definition ClassesEqualizer
9. [**](../../../akka/persistence/journal/JournalPerfSpec.html#!==(rightSide:Any)(implicitequality:org.scalactic.Equality[L]):Boolean "Permalink")  def !\=\=(rightSide: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any))(implicit equality: Equality\[JournalPerfSpec]): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)ImplicitThis member is added by an implicit conversion from JournalPerfSpec toorg.scalatest.matchers.should.Matchers.Equalizer\[JournalPerfSpec] performed by method convertToEqualizer in org.scalactic.TripleEquals.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(journalPerfSpec: org.scalatest.matchers.should.Matchers.Equalizer[JournalPerfSpec]).!==(rightSide)(equality)
```
Definition ClassesEqualizer
10. [**](../../../akka/persistence/journal/JournalPerfSpec.html#===(literalNull:Null):Boolean "Permalink")  def \=\=\=(literalNull: Null): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)ImplicitThis member is added by an implicit conversion from JournalPerfSpec toorg.scalatest.Assertions.Equalizer\[JournalPerfSpec] performed by method convertToEqualizer in org.scalactic.TripleEquals.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(journalPerfSpec: org.scalatest.Assertions.Equalizer[JournalPerfSpec]).===(literalNull)
```
Definition ClassesEqualizer
11. [**](../../../akka/persistence/journal/JournalPerfSpec.html#===(spread:org.scalactic.TripleEqualsSupport.Spread[L]):Boolean "Permalink")  def \=\=\=(spread: Spread\[JournalPerfSpec]): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)ImplicitThis member is added by an implicit conversion from JournalPerfSpec toorg.scalatest.Assertions.Equalizer\[JournalPerfSpec] performed by method convertToEqualizer in org.scalactic.TripleEquals.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(journalPerfSpec: org.scalatest.Assertions.Equalizer[JournalPerfSpec]).===(spread)
```
Definition ClassesEqualizer
12. [**](../../../akka/persistence/journal/JournalPerfSpec.html#===(rightSide:Any)(implicitequality:org.scalactic.Equality[L]):Boolean "Permalink")  def \=\=\=(rightSide: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any))(implicit equality: Equality\[JournalPerfSpec]): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)ImplicitThis member is added by an implicit conversion from JournalPerfSpec toorg.scalatest.Assertions.Equalizer\[JournalPerfSpec] performed by method convertToEqualizer in org.scalactic.TripleEquals.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(journalPerfSpec: org.scalatest.Assertions.Equalizer[JournalPerfSpec]).===(rightSide)(equality)
```
Definition ClassesEqualizer
13. [**](../../../akka/persistence/journal/JournalPerfSpec.html#===(literalNull:Null):Boolean "Permalink")  def \=\=\=(literalNull: Null): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)ImplicitThis member is added by an implicit conversion from JournalPerfSpec toorg.scalactic.TripleEquals.Equalizer\[JournalPerfSpec] performed by method convertToEqualizer in org.scalactic.TripleEquals.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(journalPerfSpec: org.scalactic.TripleEquals.Equalizer[JournalPerfSpec]).===(literalNull)
```
Definition ClassesEqualizer
14. [**](../../../akka/persistence/journal/JournalPerfSpec.html#===(spread:org.scalactic.TripleEqualsSupport.Spread[L]):Boolean "Permalink")  def \=\=\=(spread: Spread\[JournalPerfSpec]): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)ImplicitThis member is added by an implicit conversion from JournalPerfSpec toorg.scalactic.TripleEquals.Equalizer\[JournalPerfSpec] performed by method convertToEqualizer in org.scalactic.TripleEquals.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(journalPerfSpec: org.scalactic.TripleEquals.Equalizer[JournalPerfSpec]).===(spread)
```
Definition ClassesEqualizer
15. [**](../../../akka/persistence/journal/JournalPerfSpec.html#===(rightSide:Any)(implicitequality:org.scalactic.Equality[L]):Boolean "Permalink")  def \=\=\=(rightSide: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any))(implicit equality: Equality\[JournalPerfSpec]): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)ImplicitThis member is added by an implicit conversion from JournalPerfSpec toorg.scalactic.TripleEquals.Equalizer\[JournalPerfSpec] performed by method convertToEqualizer in org.scalactic.TripleEquals.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(journalPerfSpec: org.scalactic.TripleEquals.Equalizer[JournalPerfSpec]).===(rightSide)(equality)
```
Definition ClassesEqualizer
16. [**](../../../akka/persistence/journal/JournalPerfSpec.html#===(literalNull:Null):Boolean "Permalink")  def \=\=\=(literalNull: Null): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)ImplicitThis member is added by an implicit conversion from JournalPerfSpec toorg.scalatest.matchers.should.Matchers.Equalizer\[JournalPerfSpec] performed by method convertToEqualizer in org.scalactic.TripleEquals.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(journalPerfSpec: org.scalatest.matchers.should.Matchers.Equalizer[JournalPerfSpec]).===(literalNull)
```
Definition ClassesEqualizer
17. [**](../../../akka/persistence/journal/JournalPerfSpec.html#===(spread:org.scalactic.TripleEqualsSupport.Spread[L]):Boolean "Permalink")  def \=\=\=(spread: Spread\[JournalPerfSpec]): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)ImplicitThis member is added by an implicit conversion from JournalPerfSpec toorg.scalatest.matchers.should.Matchers.Equalizer\[JournalPerfSpec] performed by method convertToEqualizer in org.scalactic.TripleEquals.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(journalPerfSpec: org.scalatest.matchers.should.Matchers.Equalizer[JournalPerfSpec]).===(spread)
```
Definition ClassesEqualizer
18. [**](../../../akka/persistence/journal/JournalPerfSpec.html#===(rightSide:Any)(implicitequality:org.scalactic.Equality[L]):Boolean "Permalink")  def \=\=\=(rightSide: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any))(implicit equality: Equality\[JournalPerfSpec]): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)ImplicitThis member is added by an implicit conversion from JournalPerfSpec toorg.scalatest.matchers.should.Matchers.Equalizer\[JournalPerfSpec] performed by method convertToEqualizer in org.scalactic.TripleEquals.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(journalPerfSpec: org.scalatest.matchers.should.Matchers.Equalizer[JournalPerfSpec]).===(rightSide)(equality)
```
Definition ClassesEqualizer
19. [**](../../../akka/persistence/journal/JournalPerfSpec.html#leftSide:L "Permalink")  val leftSide: JournalPerfSpecImplicitThis member is added by an implicit conversion from JournalPerfSpec toorg.scalatest.Assertions.Equalizer\[JournalPerfSpec] performed by method convertToEqualizer in org.scalactic.TripleEquals.ShadowingThis implicitly inherited member is ambiguous. One or more implicitly inherited members have similar signatures, so calling this member may produce an ambiguous implicit conversion compiler error.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(journalPerfSpec: org.scalatest.Assertions.Equalizer[JournalPerfSpec]).leftSide
```
Definition ClassesEqualizer
20. [**](../../../akka/persistence/journal/JournalPerfSpec.html#leftSide:L "Permalink")  val leftSide: JournalPerfSpecImplicitThis member is added by an implicit conversion from JournalPerfSpec toorg.scalactic.TripleEquals.Equalizer\[JournalPerfSpec] performed by method convertToEqualizer in org.scalactic.TripleEquals.ShadowingThis implicitly inherited member is ambiguous. One or more implicitly inherited members have similar signatures, so calling this member may produce an ambiguous implicit conversion compiler error.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(journalPerfSpec: org.scalactic.TripleEquals.Equalizer[JournalPerfSpec]).leftSide
```
Definition ClassesEqualizer
21. [**](../../../akka/persistence/journal/JournalPerfSpec.html#leftSide:L "Permalink")  val leftSide: JournalPerfSpecImplicitThis member is added by an implicit conversion from JournalPerfSpec toorg.scalatest.matchers.should.Matchers.Equalizer\[JournalPerfSpec] performed by method convertToEqualizer in org.scalactic.TripleEquals.ShadowingThis implicitly inherited member is ambiguous. One or more implicitly inherited members have similar signatures, so calling this member may produce an ambiguous implicit conversion compiler error.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(journalPerfSpec: org.scalatest.matchers.should.Matchers.Equalizer[JournalPerfSpec]).leftSide
```
Definition ClassesEqualizer
### Deprecated Value Members

1. [**](../../../akka/persistence/journal/JournalPerfSpec.html#conversionCheckedConstraint[A,B](implicitequivalenceOfA:org.scalactic.Equivalence[A],implicitcnv:B=>A):org.scalactic.CanEqual[A,B] "Permalink")  def conversionCheckedConstraint\[A, B](implicit equivalenceOfA: Equivalence\[A], cnv: (B) \=\> A): CanEqual\[A, B]Definition ClassesTripleEquals → TripleEqualsSupportAnnotations@deprecated Deprecated*(Since version 3\.1\.0\)* The conversionCheckedConstraint method has been deprecated and will be removed in a future version of ScalaTest. It is no longer needed now that the deprecation period of ConversionCheckedTripleEquals has expired. It will not be replaced.
2. [**](../../../akka/persistence/journal/JournalPerfSpec.html#convertEquivalenceToAToBConversionConstraint[A,B](equivalenceOfB:org.scalactic.Equivalence[B])(implicitev:A=>B):org.scalactic.CanEqual[A,B] "Permalink")  def convertEquivalenceToAToBConversionConstraint\[A, B](equivalenceOfB: Equivalence\[B])(implicit ev: (A) \=\> B): CanEqual\[A, B]Definition ClassesTripleEquals → TripleEqualsSupportAnnotations@deprecated Deprecated*(Since version 3\.1\.0\)* The convertEquivalenceToAToBConversionConstraint method has been deprecated and will be removed in a future version of ScalaTest. It is no longer needed now that the deprecation period of ConversionCheckedTripleEquals has expired. It will not be replaced.
3. [**](../../../akka/persistence/journal/JournalPerfSpec.html#convertEquivalenceToBToAConversionConstraint[A,B](equivalenceOfA:org.scalactic.Equivalence[A])(implicitev:B=>A):org.scalactic.CanEqual[A,B] "Permalink")  def convertEquivalenceToBToAConversionConstraint\[A, B](equivalenceOfA: Equivalence\[A])(implicit ev: (B) \=\> A): CanEqual\[A, B]Definition ClassesTripleEquals → TripleEqualsSupportAnnotations@deprecated Deprecated*(Since version 3\.1\.0\)* The convertEquivalenceToBToAConversionConstraint method has been deprecated and will be removed in a future version of ScalaTest. It is no longer needed now that the deprecation period of ConversionCheckedTripleEquals has expired. It will not be replaced.
4. [**](../../../akka/persistence/journal/JournalPerfSpec.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
5. [**](../../../akka/persistence/journal/JournalPerfSpec.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from JournalPerfSpec toStringFormat\[JournalPerfSpec] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
6. [**](../../../akka/persistence/journal/JournalPerfSpec.html#lowPriorityConversionCheckedConstraint[A,B](implicitequivalenceOfB:org.scalactic.Equivalence[B],implicitcnv:A=>B):org.scalactic.CanEqual[A,B] "Permalink")  def lowPriorityConversionCheckedConstraint\[A, B](implicit equivalenceOfB: Equivalence\[B], cnv: (A) \=\> B): CanEqual\[A, B]Definition ClassesTripleEquals → TripleEqualsSupportAnnotations@deprecated Deprecated*(Since version 3\.1\.0\)* The lowPriorityConversionCheckedConstraint method has been deprecated and will be removed in a future version of ScalaTest. It is no longer needed now that the deprecation period of ConversionCheckedTripleEquals has expired. It will not be replaced.
7. [**](../../../akka/persistence/journal/JournalPerfSpec.html#styleName:String "Permalink") final  val styleName: StringDefinition ClassesAnyWordSpecLike → SuiteAnnotations@deprecated Deprecated*(Since version 3\.1\.0\)* The styleName lifecycle method has been deprecated and will be removed in a future version of ScalaTest with no replacement.
8. [**](../../../akka/persistence/journal/JournalPerfSpec.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (JournalPerfSpec, B)ImplicitThis member is added by an implicit conversion from JournalPerfSpec toArrowAssoc\[JournalPerfSpec] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [JournalSpec](JournalSpec.html)

### Inherited from [JournalCapabilityFlags](../JournalCapabilityFlags.html)

### Inherited from [CapabilityFlags](../CapabilityFlags.html)

### Inherited from [OptionalTests](../scalatest/OptionalTests.html)

### Inherited from [MayVerb](../scalatest/MayVerb.html)

### Inherited from [PluginSpec](../PluginSpec.html)

### Inherited from BeforeAndAfterEach

### Inherited from BeforeAndAfterAll

### Inherited from SuiteMixin

### Inherited from Matchers

### Inherited from Explicitly

### Inherited from MatcherWords

### Inherited from Tolerance

### Inherited from AnyWordSpecLike

### Inherited from Documenting

### Inherited from Alerting

### Inherited from Notifying

### Inherited from Informing

### Inherited from CanVerb

### Inherited from MustVerb

### Inherited from ShouldVerb

### Inherited from TestRegistration

### Inherited from TestSuite

### Inherited from Suite

### Inherited from [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

### Inherited from Assertions

### Inherited from TripleEquals

### Inherited from TripleEqualsSupport

### Inherited from [TestKitBase](../../testkit/TestKitBase.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion convertToEqualizer fromJournalPerfSpec to org.scalatest.Assertions.Equalizer\[JournalPerfSpec]

### Inherited by implicit conversion convertToEqualizer fromJournalPerfSpec to org.scalactic.TripleEquals.Equalizer\[JournalPerfSpec]

### Inherited by implicit conversion convertToAnyShouldWrapper fromJournalPerfSpec to org.scalatest.matchers.should.Matchers.AnyShouldWrapper\[JournalPerfSpec]

### Inherited by implicit conversion convertToEqualizer fromJournalPerfSpec to org.scalatest.matchers.should.Matchers.Equalizer\[JournalPerfSpec]

### Inherited by implicit conversion any2stringadd fromJournalPerfSpec to any2stringadd\[JournalPerfSpec]

### Inherited by implicit conversion StringFormat fromJournalPerfSpec to StringFormat\[JournalPerfSpec]

### Inherited by implicit conversion Ensuring fromJournalPerfSpec to Ensuring\[JournalPerfSpec]

### Inherited by implicit conversion ArrowAssoc fromJournalPerfSpec to ArrowAssoc\[JournalPerfSpec]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/ActorRef.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/ActorSystem.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/Props.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/SupervisorStrategy.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/Terminated.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/CapabilityFlag.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/CapabilityFlags.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/JournalCapabilityFlags.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/Persistence.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/PersistentActor.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/PluginSpec.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/japi/journal/JavaJournalPerfSpec.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/journal/AsyncRecovery.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/journal/AsyncReplay.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/journal/AsyncReplayTimeoutException.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/journal/AsyncWriteJournal.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/journal/EmptyEventSeq$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/journal/EmptyEventSeq.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/journal/EventAdapter.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/journal/EventAdapters.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/journal/EventSeq$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/journal/EventSeq.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/journal/EventsSeq.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/journal/IdentityEventAdapter$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/journal/JournalPerfSpec$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/journal/JournalPerfSpec.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/journal/JournalSpec$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/journal/JournalSpec.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/journal/PersistencePluginProxy$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/journal/PersistencePluginProxy.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/journal/PersistencePluginProxyExtension$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/journal/PersistencePluginProxyExtensionImpl.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/journal/ReadEventAdapter.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/journal/SingleEventSeq.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/journal/Tagged.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/journal/WriteEventAdapter.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/journal/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/journal/inmem/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/journal/japi/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/journal/leveldb/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/scalatest/MayVerb$StringMayWrapperForVerb.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/scalatest/MayVerb.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/scalatest/OptionalTests.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/testkit/TestActor$$AutoPilot.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/testkit/TestKitBase.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/testkit/TestKitSettings.html
- https://doc.akka.io/api/akka-core/2.10.17/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/journal/JournalPerfSpec.html](https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/journal/JournalPerfSpec.html)*