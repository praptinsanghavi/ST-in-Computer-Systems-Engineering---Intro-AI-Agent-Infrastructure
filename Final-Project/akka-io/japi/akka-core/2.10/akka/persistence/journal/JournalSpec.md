---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:04:16Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/persistence/journal/JournalSpec.html
title: JournalSpec
---

# JournalSpec

## Content

Package [akka.persistence.journal](package-summary.html)
## Class JournalSpec

- java.lang.Object
- - [akka.persistence.PluginSpec](../PluginSpec.html "class in akka.persistence")
	- - akka.persistence.journal.JournalSpec

- All Implemented Interfaces:
`[CapabilityFlags](../CapabilityFlags.html "interface in akka.persistence")`, `[JournalCapabilityFlags](../JournalCapabilityFlags.html "interface in akka.persistence")`, `[MayVerb](../scalatest/MayVerb.html "interface in akka.persistence.scalatest")`, `[OptionalTests](../scalatest/OptionalTests.html "interface in akka.persistence.scalatest")`, `[TestKitBase](../../testkit/TestKitBase.html "interface in akka.testkit")`, `java.io.Serializable`, `org.scalactic.Explicitly`, `org.scalactic.Tolerance`, `org.scalactic.TripleEquals`, `org.scalactic.TripleEqualsSupport`, `org.scalatest.Alerting`, `org.scalatest.Assertions`, `org.scalatest.BeforeAndAfterAll`, `org.scalatest.BeforeAndAfterEach`, `org.scalatest.Documenting`, `org.scalatest.Informing`, `org.scalatest.matchers.dsl.MatcherWords`, `org.scalatest.matchers.should.Matchers`, `org.scalatest.Notifying`, `org.scalatest.Suite`, `org.scalatest.SuiteMixin`, `org.scalatest.TestRegistration`, `org.scalatest.TestSuite`, `org.scalatest.verbs.CanVerb`, `org.scalatest.verbs.MustVerb`, `org.scalatest.verbs.ShouldVerb`, `org.scalatest.wordspec.AnyWordSpecLike`

Direct Known Subclasses:
`[JavaJournalSpec](../japi/journal/JavaJournalSpec.html "class in akka.persistence.japi.journal")`, `[JournalPerfSpec](JournalPerfSpec.html "class in akka.persistence.journal")`

---

```
public abstract class JournalSpec
extends [PluginSpec](../PluginSpec.html "class in akka.persistence")
implements [MayVerb](../scalatest/MayVerb.html "interface in akka.persistence.scalatest"), [OptionalTests](../scalatest/OptionalTests.html "interface in akka.persistence.scalatest"), [JournalCapabilityFlags](../JournalCapabilityFlags.html "interface in akka.persistence")
```

This spec aims to verify custom akka\-persistence Journal implementations.
 Plugin authors are highly encouraged to include it in their plugin's test suites.
 
 In case your journal plugin needs some kind of setup or teardown, override the `beforeAll` or `afterAll`
 methods (don't forget to call `super` in your overridden methods).
 

 For a Java and JUnit consumable version of the TCK please refer to [`JavaJournalSpec`](../japi/journal/JavaJournalSpec.html "class in akka.persistence.japi.journal").
 

See Also:
[`JournalPerfSpec`](JournalPerfSpec.html "class in akka.persistence.journal"), 
[`JavaJournalPerfSpec`](../japi/journal/JavaJournalPerfSpec.html "class in akka.persistence.japi.journal"), 
[Serialized Form](../../../serialized-form.html#akka.persistence.journal.JournalSpec)

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from interface org.scalatest.wordspec.AnyWordSpecLike
		
		
		`org.scalatest.wordspec.AnyWordSpecLike.AfterWord, org.scalatest.wordspec.AnyWordSpecLike.ItWord, org.scalatest.wordspec.AnyWordSpecLike.ResultOfTaggedAsInvocationOnString, org.scalatest.wordspec.AnyWordSpecLike.TheyWord, org.scalatest.wordspec.AnyWordSpecLike.WordSpecStringWrapper`
		- ### Nested classes/interfaces inherited from interface org.scalatest.Assertions
		
		
		`org.scalatest.Assertions.AssertionsHelper`
		- ### Nested classes/interfaces inherited from interface org.scalatest.verbs.CanVerb
		
		
		`org.scalatest.verbs.CanVerb.StringCanWrapperForVerb`
		- ### Nested classes/interfaces inherited from interface org.scalactic.Explicitly
		
		
		`org.scalactic.Explicitly.DecidedByEquality<A extends java.lang.Object>, org.scalactic.Explicitly.DecidedWord, org.scalactic.Explicitly.DeterminedByEquivalence<T extends java.lang.Object>, org.scalactic.Explicitly.DeterminedWord, org.scalactic.Explicitly.TheAfterWord`
		- ### Nested classes/interfaces inherited from interface org.scalatest.matchers.should.Matchers
		
		
		`org.scalatest.matchers.should.Matchers.AnWord, org.scalatest.matchers.should.Matchers.AnyShouldWrapper<T extends java.lang.Object>, org.scalatest.matchers.should.Matchers.AWord, org.scalatest.matchers.should.Matchers.Collected, org.scalatest.matchers.should.Matchers.HavePropertyMatcherGenerator, org.scalatest.matchers.should.Matchers.KeyWord, org.scalatest.matchers.should.Matchers.RegexWord, org.scalatest.matchers.should.Matchers.RegexWrapper, org.scalatest.matchers.should.Matchers.ResultOfBeWordForAny<T extends java.lang.Object>, org.scalatest.matchers.should.Matchers.ResultOfBeWordForCollectedAny<T extends java.lang.Object>, org.scalatest.matchers.should.Matchers.ResultOfBeWordForCollectedArray<T extends java.lang.Object>, org.scalatest.matchers.should.Matchers.ResultOfCollectedAny<T extends java.lang.Object>, org.scalatest.matchers.should.Matchers.ResultOfContainWordForCollectedAny<T extends java.lang.Object>, org.scalatest.matchers.should.Matchers.ResultOfEndWithWordForCollectedString, org.scalatest.matchers.should.Matchers.ResultOfEndWithWordForString, org.scalatest.matchers.should.Matchers.ResultOfFullyMatchWordForCollectedString, org.scalatest.matchers.should.Matchers.ResultOfFullyMatchWordForString, org.scalatest.matchers.should.Matchers.ResultOfHaveWordForCollectedExtent<A extends java.lang.Object>, org.scalatest.matchers.should.Matchers.ResultOfHaveWordForExtent<A extends java.lang.Object>, org.scalatest.matchers.should.Matchers.ResultOfIncludeWordForCollectedString, org.scalatest.matchers.should.Matchers.ResultOfIncludeWordForString, org.scalatest.matchers.should.Matchers.ResultOfNotWordForCollectedAny<T extends java.lang.Object>, org.scalatest.matchers.should.Matchers.ResultOfStartWithWordForCollectedString, org.scalatest.matchers.should.Matchers.ResultOfStartWithWordForString, org.scalatest.matchers.should.Matchers.StringShouldWrapper, org.scalatest.matchers.should.Matchers.TheSameInstanceAsPhrase, org.scalatest.matchers.should.Matchers.ValueWord`
		- ### Nested classes/interfaces inherited from interface akka.persistence.scalatest.[MayVerb](../scalatest/MayVerb.html "interface in akka.persistence.scalatest")
		
		
		`[MayVerb.StringMayWrapperForVerb](../scalatest/MayVerb.StringMayWrapperForVerb.html "interface in akka.persistence.scalatest"), [MayVerb.TestCanceledByFailure](../scalatest/MayVerb.TestCanceledByFailure.html "class in akka.persistence.scalatest"), [MayVerb.TestCanceledByFailure$](../scalatest/MayVerb.TestCanceledByFailure$.html "class in akka.persistence.scalatest")`
		- ### Nested classes/interfaces inherited from interface org.scalatest.verbs.MustVerb
		
		
		`org.scalatest.verbs.MustVerb.StringMustWrapperForVerb`
		- ### Nested classes/interfaces inherited from interface org.scalatest.verbs.ShouldVerb
		
		
		`org.scalatest.verbs.ShouldVerb.StringShouldWrapperForVerb`
		- ### Nested classes/interfaces inherited from interface org.scalatest.TestSuite
		
		
		`org.scalatest.TestSuite.NoArgTest, org.scalatest.TestSuite.NoArgTest$`
		- ### Nested classes/interfaces inherited from interface org.scalactic.Tolerance
		
		
		`org.scalactic.Tolerance.PlusOrMinusWrapper<T extends java.lang.Object>`
		- ### Nested classes/interfaces inherited from interface org.scalactic.TripleEqualsSupport
		
		
		`org.scalactic.TripleEqualsSupport.AToBEquivalenceConstraint<A extends java.lang.Object,​B extends java.lang.Object>, org.scalactic.TripleEqualsSupport.BToAEquivalenceConstraint<A extends java.lang.Object,​B extends java.lang.Object>, org.scalactic.TripleEqualsSupport.CheckingEqualizer<L extends java.lang.Object>, org.scalactic.TripleEqualsSupport.EqualityConstraint<A extends java.lang.Object,​B extends java.lang.Object>, org.scalactic.TripleEqualsSupport.Equalizer<L extends java.lang.Object>, org.scalactic.TripleEqualsSupport.Spread<T extends java.lang.Object>, org.scalactic.TripleEqualsSupport.Spread$, org.scalactic.TripleEqualsSupport.TripleEqualsInvocation<T extends java.lang.Object>, org.scalactic.TripleEqualsSupport.TripleEqualsInvocation$, org.scalactic.TripleEqualsSupport.TripleEqualsInvocationOnSpread<T extends java.lang.Object>, org.scalactic.TripleEqualsSupport.TripleEqualsInvocationOnSpread$`

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[JournalSpec](#%3Cinit%3E(com.typesafe.config.Config))​(com.typesafe.config.Config config)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `protected void` | `[beforeEach](#beforeEach())()` |  |
	| `static com.typesafe.config.Config` | `[config](#config())()` |  |
	| `[ActorRef](../../actor/ActorRef.html "class in akka.actor")` | `[journal](#journal())()` |  |
	| `void` | `[preparePersistenceId](#preparePersistenceId(java.lang.String))​(java.lang.String pid)` | Overridable hook that is called before populating the journal for the next  test case. |
	| `[JournalProtocol.ReplayedMessage](../JournalProtocol.ReplayedMessage.html "class in akka.persistence")` | `[replayedMessage](#replayedMessage(long,boolean))​(long snr,  boolean deleted)` |  |
	| `boolean` | `[replayedMessage$default$2](#replayedMessage$default$2())()` |  |
	| `boolean` | `[supportsAtomicPersistAllOfSeveralEvents](#supportsAtomicPersistAllOfSeveralEvents())()` | Implementation may override and return false if it does not  support atomic writes of several events, as emitted by `persistAll`. |
	| `protected [CapabilityFlag](../CapabilityFlag.html "class in akka.persistence")` | `[supportsMetadata](#supportsMetadata())()` | When `true` enables tests which check if the Journal stores and returns  metadata for an event |
	| `protected [CapabilityFlag](../CapabilityFlag.html "class in akka.persistence")` | `[supportsReplayOnlyLast](#supportsReplayOnlyLast())()` | When `true` enables tests which check if the Journal can replay only the last event. |
	| `protected [CapabilityFlag](../CapabilityFlag.html "class in akka.persistence")` | `[supportsSerialization](#supportsSerialization())()` | When `true` enables tests which check if the Journal properly serialize and  deserialize events. |
	| `[ActorSystem](../../actor/ActorSystem.html "class in akka.actor")` | `[system](#system())()` |  |
	| `void` | `[writeMessages](#writeMessages(int,int,java.lang.String,akka.actor.ActorRef,java.lang.String))​(int fromSnr,  int toSnr,  java.lang.String pid,  [ActorRef](../../actor/ActorRef.html "class in akka.actor") sender,  java.lang.String writerUuid)` |  |
	
	
		- ### Methods inherited from class akka.persistence.[PluginSpec](../PluginSpec.html "class in akka.persistence")
		
		
		`[a](../PluginSpec.html#a()), [actorInstanceId](../PluginSpec.html#actorInstanceId()), [after](../PluginSpec.html#after()), [afterAll](../PluginSpec.html#afterAll()), [an](../PluginSpec.html#an()), [be](../PluginSpec.html#be()), [beforeAll](../PluginSpec.html#beforeAll()), [behave](../PluginSpec.html#behave()), [compile](../PluginSpec.html#compile()), [config](../PluginSpec.html#config()), [contain](../PluginSpec.html#contain()), [decided](../PluginSpec.html#decided()), [defined](../PluginSpec.html#defined()), [determined](../PluginSpec.html#determined()), [empty](../PluginSpec.html#empty()), [endWith](../PluginSpec.html#endWith()), [exist](../PluginSpec.html#exist()), [extension](../PluginSpec.html#extension()), [fullyMatch](../PluginSpec.html#fullyMatch()), [have](../PluginSpec.html#have()), [include](../PluginSpec.html#include()), [invokeBeforeAllAndAfterAllEvenIfNoTestsAreExpected](../PluginSpec.html#invokeBeforeAllAndAfterAllEvenIfNoTestsAreExpected()), [it](../PluginSpec.html#it()), [key](../PluginSpec.html#key()), [length](../PluginSpec.html#length()), [matchPattern](../PluginSpec.html#matchPattern()), [NoArgTest](../PluginSpec.html#NoArgTest()), [not](../PluginSpec.html#not()), [org$scalactic$Explicitly$_setter_$after_$eq](../PluginSpec.html#org$scalactic$Explicitly$_setter_$after_$eq(org.scalactic.Explicitly.TheAfterWord)), [org$scalactic$Explicitly$_setter_$decided_$eq](../PluginSpec.html#org$scalactic$Explicitly$_setter_$decided_$eq(org.scalactic.Explicitly.DecidedWord)), [org$scalactic$Explicitly$_setter_$determined_$eq](../PluginSpec.html#org$scalactic$Explicitly$_setter_$determined_$eq(org.scalactic.Explicitly.DeterminedWord)), [org$scalatest$Assertions$_setter_$succeed_$eq](../PluginSpec.html#org$scalatest$Assertions$_setter_$succeed_$eq(org.scalatest.compatible.Assertion)), [org$scalatest$BeforeAndAfterAll$_setter_$invokeBeforeAllAndAfterAllEvenIfNoTestsAreExpected_$eq](../PluginSpec.html#org$scalatest$BeforeAndAfterAll$_setter_$invokeBeforeAllAndAfterAllEvenIfNoTestsAreExpected_$eq(boolean)), [org$scalatest$matchers$dsl$MatcherWords$_setter_$be_$eq](../PluginSpec.html#org$scalatest$matchers$dsl$MatcherWords$_setter_$be_$eq(org.scalatest.matchers.dsl.BeWord)), [org$scalatest$matchers$dsl$MatcherWords$_setter_$compile_$eq](../PluginSpec.html#org$scalatest$matchers$dsl$MatcherWords$_setter_$compile_$eq(org.scalatest.verbs.CompileWord)), [org$scalatest$matchers$dsl$MatcherWords$_setter_$contain_$eq](../PluginSpec.html#org$scalatest$matchers$dsl$MatcherWords$_setter_$contain_$eq(org.scalatest.matchers.dsl.ContainWord)), [org$scalatest$matchers$dsl$MatcherWords$_setter_$defined_$eq](../PluginSpec.html#org$scalatest$matchers$dsl$MatcherWords$_setter_$defined_$eq(org.scalatest.matchers.dsl.DefinedWord)), [org$scalatest$matchers$dsl$MatcherWords$_setter_$empty_$eq](../PluginSpec.html#org$scalatest$matchers$dsl$MatcherWords$_setter_$empty_$eq(org.scalatest.matchers.dsl.EmptyWord)), [org$scalatest$matchers$dsl$MatcherWords$_setter_$endWith_$eq](../PluginSpec.html#org$scalatest$matchers$dsl$MatcherWords$_setter_$endWith_$eq(org.scalatest.matchers.dsl.EndWithWord)), [org$scalatest$matchers$dsl$MatcherWords$_setter_$exist_$eq](../PluginSpec.html#org$scalatest$matchers$dsl$MatcherWords$_setter_$exist_$eq(org.scalatest.matchers.dsl.ExistWord)), [org$scalatest$matchers$dsl$MatcherWords$_setter_$fullyMatch_$eq](../PluginSpec.html#org$scalatest$matchers$dsl$MatcherWords$_setter_$fullyMatch_$eq(org.scalatest.matchers.dsl.FullyMatchWord)), [org$scalatest$matchers$dsl$MatcherWords$_setter_$have_$eq](../PluginSpec.html#org$scalatest$matchers$dsl$MatcherWords$_setter_$have_$eq(org.scalatest.matchers.dsl.HaveWord)), [org$scalatest$matchers$dsl$MatcherWords$_setter_$include_$eq](../PluginSpec.html#org$scalatest$matchers$dsl$MatcherWords$_setter_$include_$eq(org.scalatest.matchers.dsl.IncludeWord)), [org$scalatest$matchers$dsl$MatcherWords$_setter_$length_$eq](../PluginSpec.html#org$scalatest$matchers$dsl$MatcherWords$_setter_$length_$eq(org.scalatest.matchers.dsl.LengthWord)), [org$scalatest$matchers$dsl$MatcherWords$_setter_$matchPattern_$eq](../PluginSpec.html#org$scalatest$matchers$dsl$MatcherWords$_setter_$matchPattern_$eq(org.scalatest.matchers.dsl.MatchPatternWord)), [org$scalatest$matchers$dsl$MatcherWords$_setter_$not_$eq](../PluginSpec.html#org$scalatest$matchers$dsl$MatcherWords$_setter_$not_$eq(org.scalatest.matchers.dsl.NotWord)), [org$scalatest$matchers$dsl$MatcherWords$_setter_$readable_$eq](../PluginSpec.html#org$scalatest$matchers$dsl$MatcherWords$_setter_$readable_$eq(org.scalatest.matchers.dsl.ReadableWord)), [org$scalatest$matchers$dsl$MatcherWords$_setter_$size_$eq](../PluginSpec.html#org$scalatest$matchers$dsl$MatcherWords$_setter_$size_$eq(org.scalatest.matchers.dsl.SizeWord)), [org$scalatest$matchers$dsl$MatcherWords$_setter_$sorted_$eq](../PluginSpec.html#org$scalatest$matchers$dsl$MatcherWords$_setter_$sorted_$eq(org.scalatest.matchers.dsl.SortedWord)), [org$scalatest$matchers$dsl$MatcherWords$_setter_$startWith_$eq](../PluginSpec.html#org$scalatest$matchers$dsl$MatcherWords$_setter_$startWith_$eq(org.scalatest.matchers.dsl.StartWithWord)), [org$scalatest$matchers$dsl$MatcherWords$_setter_$typeCheck_$eq](../PluginSpec.html#org$scalatest$matchers$dsl$MatcherWords$_setter_$typeCheck_$eq(org.scalatest.verbs.TypeCheckWord)), [org$scalatest$matchers$dsl$MatcherWords$_setter_$writable_$eq](../PluginSpec.html#org$scalatest$matchers$dsl$MatcherWords$_setter_$writable_$eq(org.scalatest.matchers.dsl.WritableWord)), [org$scalatest$matchers$should$Matchers$_setter_$a_$eq](../PluginSpec.html#org$scalatest$matchers$should$Matchers$_setter_$a_$eq(org.scalatest.matchers.should.Matchers.AWord)), [org$scalatest$matchers$should$Matchers$_setter_$an_$eq](../PluginSpec.html#org$scalatest$matchers$should$Matchers$_setter_$an_$eq(org.scalatest.matchers.should.Matchers.AnWord)), [org$scalatest$matchers$should$Matchers$_setter_$key_$eq](../PluginSpec.html#org$scalatest$matchers$should$Matchers$_setter_$key_$eq(org.scalatest.matchers.should.Matchers.KeyWord)), [org$scalatest$matchers$should$Matchers$_setter_$regex_$eq](../PluginSpec.html#org$scalatest$matchers$should$Matchers$_setter_$regex_$eq(org.scalatest.matchers.should.Matchers.RegexWord)), [org$scalatest$matchers$should$Matchers$_setter_$theSameInstanceAs_$eq](../PluginSpec.html#org$scalatest$matchers$should$Matchers$_setter_$theSameInstanceAs_$eq(org.scalatest.matchers.should.Matchers.TheSameInstanceAsPhrase)), [org$scalatest$matchers$should$Matchers$_setter_$value_$eq](../PluginSpec.html#org$scalatest$matchers$should$Matchers$_setter_$value_$eq(org.scalatest.matchers.should.Matchers.ValueWord)), [org$scalatest$Suite$_setter_$styleName_$eq](../PluginSpec.html#org$scalatest$Suite$_setter_$styleName_$eq(java.lang.String)), [org$scalatest$wordspec$AnyWordSpecLike$_setter_$behave_$eq](../PluginSpec.html#org$scalatest$wordspec$AnyWordSpecLike$_setter_$behave_$eq(org.scalatest.verbs.BehaveWord)), [org$scalatest$wordspec$AnyWordSpecLike$_setter_$it_$eq](../PluginSpec.html#org$scalatest$wordspec$AnyWordSpecLike$_setter_$it_$eq(org.scalatest.wordspec.AnyWordSpecLike.ItWord)), [org$scalatest$wordspec$AnyWordSpecLike$_setter_$stackDepth_$eq](../PluginSpec.html#org$scalatest$wordspec$AnyWordSpecLike$_setter_$stackDepth_$eq(int)), [org$scalatest$wordspec$AnyWordSpecLike$_setter_$styleName_$eq](../PluginSpec.html#org$scalatest$wordspec$AnyWordSpecLike$_setter_$styleName_$eq(java.lang.String)), [org$scalatest$wordspec$AnyWordSpecLike$_setter_$subjectRegistrationFunction_$eq](../PluginSpec.html#org$scalatest$wordspec$AnyWordSpecLike$_setter_$subjectRegistrationFunction_$eq(org.scalatest.verbs.StringVerbBlockRegistration)), [org$scalatest$wordspec$AnyWordSpecLike$_setter_$subjectWithAfterWordRegistrationFunction_$eq](../PluginSpec.html#org$scalatest$wordspec$AnyWordSpecLike$_setter_$subjectWithAfterWordRegistrationFunction_$eq(org.scalatest.verbs.SubjectWithAfterWordRegistration)), [org$scalatest$wordspec$AnyWordSpecLike$_setter_$they_$eq](../PluginSpec.html#org$scalatest$wordspec$AnyWordSpecLike$_setter_$they_$eq(org.scalatest.wordspec.AnyWordSpecLike.TheyWord)), [pid](../PluginSpec.html#pid()), [readable](../PluginSpec.html#readable()), [regex](../PluginSpec.html#regex()), [size](../PluginSpec.html#size()), [sorted](../PluginSpec.html#sorted()), [startWith](../PluginSpec.html#startWith()), [styleName](../PluginSpec.html#styleName()), [subjectRegistrationFunction](../PluginSpec.html#subjectRegistrationFunction()), [subjectWithAfterWordRegistrationFunction](../PluginSpec.html#subjectWithAfterWordRegistrationFunction()), [subscribe](../PluginSpec.html#subscribe(akka.actor.ActorRef,scala.reflect.ClassTag)), [succeed](../PluginSpec.html#succeed()), [testActor](../PluginSpec.html#testActor()), [theSameInstanceAs](../PluginSpec.html#theSameInstanceAs()), [they](../PluginSpec.html#they()), [typeCheck](../PluginSpec.html#typeCheck()), [value](../PluginSpec.html#value()), [writable](../PluginSpec.html#writable()), [writerUuid](../PluginSpec.html#writerUuid())`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface org.scalatest.wordspec.AnyWordSpecLike
		
		
		`afterWord, alert, convertToWordSpecStringWrapper, info, markup, note, org$scalatest$wordspec$AnyWordSpecLike$_setter_$org$scalatest$wordspec$AnyWordSpecLike$$engine_$eq, org$scalatest$wordspec$AnyWordSpecLike$$engine, org$scalatest$wordspec$AnyWordSpecLike$$registerBranch, org$scalatest$wordspec$AnyWordSpecLike$$registerShorthandBranch, org$scalatest$wordspec$AnyWordSpecLike$$registerTestToIgnore, org$scalatest$wordspec$AnyWordSpecLike$$registerTestToRun, registerIgnoredTest, registerTest, run, runTest, runTests, tags, testDataFor, testDataFor$default$2, testNames`
		- ### Methods inherited from interface org.scalatest.Assertions
		
		
		`assertResult, assertResult, assertThrows, cancel, cancel, cancel, cancel, fail, fail, fail, fail, intercept, newAssertionFailedException, newTestCanceledException, pending, pendingUntilFixed, withClue`
		- ### Methods inherited from interface org.scalatest.BeforeAndAfterAll
		
		
		`run`
		- ### Methods inherited from interface org.scalatest.BeforeAndAfterEach
		
		
		`afterEach, runTest`
		- ### Methods inherited from interface org.scalatest.verbs.CanVerb
		
		
		`convertToStringCanWrapper`
		- ### Methods inherited from interface akka.persistence.[JournalCapabilityFlags](../JournalCapabilityFlags.html "interface in akka.persistence")
		
		
		`[supportsRejectingNonSerializableObjects](../JournalCapabilityFlags.html#supportsRejectingNonSerializableObjects())`
		- ### Methods inherited from interface org.scalatest.matchers.should.Matchers
		
		
		`$greater, $greater$eq, $less, $less$eq, a, all, all, all, all, allElementsOf, allOf, an, atLeast, atLeast, atLeast, atLeast, atLeastOneElementOf, atLeastOneOf, atMost, atMost, atMost, atMost, atMostOneElementOf, atMostOneOf, between, between, between, convertSymbolToHavePropertyMatcherGenerator, convertToAnyShouldWrapper, convertToRegexWrapper, convertToStringShouldWrapper, definedAt, doCollected, equal, equal, every, every, every, every, exactly, exactly, exactly, exactly, inOrder, inOrderElementsOf, inOrderOnly, message, no, no, no, noElementsOf, noneOf, of, oneElementOf, oneOf, only, org$scalatest$matchers$should$Matchers$_setter_$org$scalatest$matchers$should$Matchers$$AllCollected_$eq, org$scalatest$matchers$should$Matchers$_setter_$org$scalatest$matchers$should$Matchers$$EveryCollected_$eq, org$scalatest$matchers$should$Matchers$_setter_$org$scalatest$matchers$should$Matchers$$NoCollected_$eq, org$scalatest$matchers$should$Matchers$_setter_$org$scalatest$matchers$should$Matchers$$ShouldMethodHelper_$eq, org$scalatest$matchers$should$Matchers$$AllCollected, org$scalatest$matchers$should$Matchers$$AtLeastCollected, org$scalatest$matchers$should$Matchers$$AtMostCollected, org$scalatest$matchers$should$Matchers$$BetweenCollected, org$scalatest$matchers$should$Matchers$$EveryCollected, org$scalatest$matchers$should$Matchers$$ExactlyCollected, org$scalatest$matchers$should$Matchers$$NoCollected, org$scalatest$matchers$should$Matchers$$ShouldMethodHelper, the, theSameElementsAs, theSameElementsInOrderAs, thrownBy`
		- ### Methods inherited from interface org.scalatest.matchers.dsl.MatcherWords
		
		
		`equal, noException`
		- ### Methods inherited from interface akka.persistence.scalatest.[MayVerb](../scalatest/MayVerb.html "interface in akka.persistence.scalatest")
		
		
		`[convertToStringMayWrapper](../scalatest/MayVerb.html#convertToStringMayWrapper(java.lang.String)), [mayVerbStacktraceContextFrames](../scalatest/MayVerb.html#mayVerbStacktraceContextFrames()), [optional](../scalatest/MayVerb.html#optional(java.lang.String,scala.Function0))`
		- ### Methods inherited from interface org.scalatest.verbs.MustVerb
		
		
		`convertToStringMustWrapperForVerb`
		- ### Methods inherited from interface akka.persistence.scalatest.[OptionalTests](../scalatest/OptionalTests.html "interface in akka.persistence.scalatest")
		
		
		`[optional](../scalatest/OptionalTests.html#optional(akka.persistence.CapabilityFlag,scala.Function0))`
		- ### Methods inherited from interface org.scalatest.verbs.ShouldVerb
		
		
		`convertToStringShouldWrapperForVerb`
		- ### Methods inherited from interface org.scalatest.Suite
		
		
		`createCatchReporter, execute, execute$default$1, execute$default$2, execute$default$3, execute$default$4, execute$default$5, execute$default$6, execute$default$7, expectedTestCount, nestedSuites, rerunner, runNestedSuites, suiteId, suiteName`
		- ### Methods inherited from interface org.scalatest.SuiteMixin
		
		
		`expectedTestCount, nestedSuites, rerunner, runNestedSuites, runTests, suiteId, suiteName, tags, testDataFor, testNames`
		- ### Methods inherited from interface akka.testkit.[TestKitBase](../../testkit/TestKitBase.html "interface in akka.testkit")
		
		
		`[assertForDuration](../../testkit/TestKitBase.html#assertForDuration(scala.Function0,scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.Duration)), [assertForDuration$default$3](../../testkit/TestKitBase.html#assertForDuration$default$3()), [awaitAssert](../../testkit/TestKitBase.html#awaitAssert(scala.Function0,scala.concurrent.duration.Duration,scala.concurrent.duration.Duration)), [awaitAssert$default$2](../../testkit/TestKitBase.html#awaitAssert$default$2()), [awaitAssert$default$3](../../testkit/TestKitBase.html#awaitAssert$default$3()), [awaitCond](../../testkit/TestKitBase.html#awaitCond(scala.Function0,scala.concurrent.duration.Duration,scala.concurrent.duration.Duration,java.lang.String)), [awaitCond$default$2](../../testkit/TestKitBase.html#awaitCond$default$2()), [awaitCond$default$3](../../testkit/TestKitBase.html#awaitCond$default$3()), [awaitCond$default$4](../../testkit/TestKitBase.html#awaitCond$default$4()), [checkMissingAndUnexpected](../../testkit/TestKitBase.html#checkMissingAndUnexpected(scala.collection.immutable.Seq,scala.collection.immutable.Seq,java.lang.String,java.lang.String)), [childActorOf](../../testkit/TestKitBase.html#childActorOf(akka.actor.Props)), [childActorOf](../../testkit/TestKitBase.html#childActorOf(akka.actor.Props,akka.actor.SupervisorStrategy)), [childActorOf](../../testkit/TestKitBase.html#childActorOf(akka.actor.Props,java.lang.String)), [childActorOf](../../testkit/TestKitBase.html#childActorOf(akka.actor.Props,java.lang.String,akka.actor.SupervisorStrategy)), [end_$eq](../../testkit/TestKitBase.html#end_$eq(scala.concurrent.duration.Duration)), [expectMsg](../../testkit/TestKitBase.html#expectMsg(scala.concurrent.duration.FiniteDuration,java.lang.String,T)), [expectMsg](../../testkit/TestKitBase.html#expectMsg(scala.concurrent.duration.FiniteDuration,T)), [expectMsg](../../testkit/TestKitBase.html#expectMsg(T)), [expectMsg_internal](../../testkit/TestKitBase.html#expectMsg_internal(scala.concurrent.duration.Duration,T,scala.Option)), [expectMsg_internal$default$3](../../testkit/TestKitBase.html#expectMsg_internal$default$3()), [expectMsgAllClassOf](../../testkit/TestKitBase.html#expectMsgAllClassOf(scala.collection.immutable.Seq)), [expectMsgAllClassOf](../../testkit/TestKitBase.html#expectMsgAllClassOf(scala.concurrent.duration.FiniteDuration,scala.collection.immutable.Seq)), [expectMsgAllConformingOf](../../testkit/TestKitBase.html#expectMsgAllConformingOf(scala.collection.immutable.Seq)), [expectMsgAllConformingOf](../../testkit/TestKitBase.html#expectMsgAllConformingOf(scala.concurrent.duration.FiniteDuration,scala.collection.immutable.Seq)), [expectMsgAllOf](../../testkit/TestKitBase.html#expectMsgAllOf(scala.collection.immutable.Seq)), [expectMsgAllOf](../../testkit/TestKitBase.html#expectMsgAllOf(scala.concurrent.duration.FiniteDuration,scala.collection.immutable.Seq)), [expectMsgAllOf_internal](../../testkit/TestKitBase.html#expectMsgAllOf_internal(scala.concurrent.duration.FiniteDuration,scala.collection.immutable.Seq)), [expectMsgAnyClassOf](../../testkit/TestKitBase.html#expectMsgAnyClassOf(scala.collection.immutable.Seq)), [expectMsgAnyClassOf](../../testkit/TestKitBase.html#expectMsgAnyClassOf(scala.concurrent.duration.FiniteDuration,scala.collection.immutable.Seq)), [expectMsgAnyClassOf_internal](../../testkit/TestKitBase.html#expectMsgAnyClassOf_internal(scala.concurrent.duration.FiniteDuration,scala.collection.immutable.Seq)), [expectMsgAnyOf](../../testkit/TestKitBase.html#expectMsgAnyOf(scala.collection.immutable.Seq)), [expectMsgAnyOf](../../testkit/TestKitBase.html#expectMsgAnyOf(scala.concurrent.duration.FiniteDuration,scala.collection.immutable.Seq)), [expectMsgAnyOf_internal](../../testkit/TestKitBase.html#expectMsgAnyOf_internal(scala.concurrent.duration.FiniteDuration,scala.collection.immutable.Seq)), [expectMsgClass](../../testkit/TestKitBase.html#expectMsgClass(java.lang.Class)), [expectMsgClass](../../testkit/TestKitBase.html#expectMsgClass(scala.concurrent.duration.FiniteDuration,java.lang.Class)), [expectMsgClass_internal](../../testkit/TestKitBase.html#expectMsgClass_internal(scala.concurrent.duration.FiniteDuration,java.lang.Class)), [expectMsgPF](../../testkit/TestKitBase.html#expectMsgPF(scala.concurrent.duration.Duration,java.lang.String,scala.PartialFunction)), [expectMsgPF$default$1](../../testkit/TestKitBase.html#expectMsgPF$default$1()), [expectMsgPF$default$2](../../testkit/TestKitBase.html#expectMsgPF$default$2()), [expectMsgType](../../testkit/TestKitBase.html#expectMsgType(scala.concurrent.duration.FiniteDuration,scala.reflect.ClassTag)), [expectMsgType](../../testkit/TestKitBase.html#expectMsgType(scala.reflect.ClassTag)), [expectNoMessage](../../testkit/TestKitBase.html#expectNoMessage()), [expectNoMessage](../../testkit/TestKitBase.html#expectNoMessage(scala.concurrent.duration.FiniteDuration)), [expectNoMsg_internal](../../testkit/TestKitBase.html#expectNoMsg_internal(scala.concurrent.duration.FiniteDuration)), [expectTerminated](../../testkit/TestKitBase.html#expectTerminated(akka.actor.ActorRef,scala.concurrent.duration.Duration)), [expectTerminated$default$2](../../testkit/TestKitBase.html#expectTerminated$default$2()), [fishForMessage](../../testkit/TestKitBase.html#fishForMessage(scala.concurrent.duration.Duration,java.lang.String,scala.PartialFunction)), [fishForMessage$default$1](../../testkit/TestKitBase.html#fishForMessage$default$1()), [fishForMessage$default$2](../../testkit/TestKitBase.html#fishForMessage$default$2()), [fishForSpecificMessage](../../testkit/TestKitBase.html#fishForSpecificMessage(scala.concurrent.duration.Duration,java.lang.String,scala.PartialFunction)), [fishForSpecificMessage$default$1](../../testkit/TestKitBase.html#fishForSpecificMessage$default$1()), [fishForSpecificMessage$default$2](../../testkit/TestKitBase.html#fishForSpecificMessage$default$2()), [format](../../testkit/TestKitBase.html#format(java.util.concurrent.TimeUnit,scala.concurrent.duration.Duration)), [ignoreMsg](../../testkit/TestKitBase.html#ignoreMsg(scala.PartialFunction)), [ignoreNoMsg](../../testkit/TestKitBase.html#ignoreNoMsg()), [internalExpectMsgAllClassOf](../../testkit/TestKitBase.html#internalExpectMsgAllClassOf(scala.concurrent.duration.FiniteDuration,scala.collection.immutable.Seq)), [internalExpectMsgAllConformingOf](../../testkit/TestKitBase.html#internalExpectMsgAllConformingOf(scala.concurrent.duration.FiniteDuration,scala.collection.immutable.Seq)), [lastSender](../../testkit/TestKitBase.html#lastSender()), [lastWasNoMsg_$eq](../../testkit/TestKitBase.html#lastWasNoMsg_$eq(boolean)), [msgAvailable](../../testkit/TestKitBase.html#msgAvailable()), [now](../../testkit/TestKitBase.html#now()), [receiveN](../../testkit/TestKitBase.html#receiveN(int)), [receiveN](../../testkit/TestKitBase.html#receiveN(int,scala.concurrent.duration.FiniteDuration)), [receiveN_internal](../../testkit/TestKitBase.html#receiveN_internal(int,scala.concurrent.duration.Duration)), [receiveOne](../../testkit/TestKitBase.html#receiveOne(scala.concurrent.duration.Duration)), [receiveWhile](../../testkit/TestKitBase.html#receiveWhile(scala.concurrent.duration.Duration,scala.concurrent.duration.Duration,int,scala.PartialFunction)), [receiveWhile$default$1](../../testkit/TestKitBase.html#receiveWhile$default$1()), [receiveWhile$default$2](../../testkit/TestKitBase.html#receiveWhile$default$2()), [receiveWhile$default$3](../../testkit/TestKitBase.html#receiveWhile$default$3()), [remaining](../../testkit/TestKitBase.html#remaining()), [remainingOr](../../testkit/TestKitBase.html#remainingOr(scala.concurrent.duration.FiniteDuration)), [remainingOrDefault](../../testkit/TestKitBase.html#remainingOrDefault()), [remainingOrDilated](../../testkit/TestKitBase.html#remainingOrDilated(scala.concurrent.duration.Duration)), [setAutoPilot](../../testkit/TestKitBase.html#setAutoPilot(akka.testkit.TestActor.AutoPilot)), [shutdown](../../testkit/TestKitBase.html#shutdown(akka.actor.ActorSystem,scala.concurrent.duration.Duration,boolean)), [shutdown$default$1](../../testkit/TestKitBase.html#shutdown$default$1()), [shutdown$default$2](../../testkit/TestKitBase.html#shutdown$default$2()), [shutdown$default$3](../../testkit/TestKitBase.html#shutdown$default$3()), [testActorName](../../testkit/TestKitBase.html#testActorName()), [testKitSettings](../../testkit/TestKitBase.html#testKitSettings()), [unwatch](../../testkit/TestKitBase.html#unwatch(akka.actor.ActorRef)), [watch](../../testkit/TestKitBase.html#watch(akka.actor.ActorRef)), [within](../../testkit/TestKitBase.html#within(scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration,scala.Function0)), [within](../../testkit/TestKitBase.html#within(scala.concurrent.duration.FiniteDuration,scala.Function0))`
		- ### Methods inherited from interface org.scalatest.TestSuite
		
		
		`withFixture`
		- ### Methods inherited from interface org.scalactic.Tolerance
		
		
		`convertNumericToPlusOrMinusWrapper`
		- ### Methods inherited from interface org.scalactic.TripleEquals
		
		
		`conversionCheckedConstraint, convertEquivalenceToAToBConstraint, convertEquivalenceToAToBConversionConstraint, convertEquivalenceToBToAConstraint, convertEquivalenceToBToAConversionConstraint, convertToCheckingEqualizer, convertToEqualizer, lowPriorityConversionCheckedConstraint, lowPriorityTypeCheckedConstraint, typeCheckedConstraint, unconstrainedEquality`
		- ### Methods inherited from interface org.scalactic.TripleEqualsSupport
		
		
		`$bang$eq$eq, $bang$eq$eq, $bang$eq$eq, $eq$eq$eq, $eq$eq$eq, $eq$eq$eq, defaultEquality`

- - ### Constructor Detail
	
	
	
		- #### JournalSpec
		
		
		
		```
		public JournalSpec​(com.typesafe.config.Config config)
		```

	- ### Method Detail
	
	
	
		- #### config
		
		
		
		```
		public static com.typesafe.config.Config config()
		```
		- #### system
		
		
		
		```
		public [ActorSystem](../../actor/ActorSystem.html "class in akka.actor") system()
		```
		
		
		Specified by:
		`[system](../../testkit/TestKitBase.html#system())` in interface `[TestKitBase](../../testkit/TestKitBase.html "interface in akka.testkit")`
		- #### supportsSerialization
		
		
		
		```
		protected [CapabilityFlag](../CapabilityFlag.html "class in akka.persistence") supportsSerialization()
		```
		
		Description copied from interface: `[JournalCapabilityFlags](../JournalCapabilityFlags.html#supportsSerialization())`
		When `true` enables tests which check if the Journal properly serialize and
		 deserialize events.
		
		Specified by:
		`[supportsSerialization](../JournalCapabilityFlags.html#supportsSerialization())` in interface `[JournalCapabilityFlags](../JournalCapabilityFlags.html "interface in akka.persistence")`
		- #### supportsMetadata
		
		
		
		```
		protected [CapabilityFlag](../CapabilityFlag.html "class in akka.persistence") supportsMetadata()
		```
		
		Description copied from interface: `[JournalCapabilityFlags](../JournalCapabilityFlags.html#supportsMetadata())`
		When `true` enables tests which check if the Journal stores and returns
		 metadata for an event
		
		Specified by:
		`[supportsMetadata](../JournalCapabilityFlags.html#supportsMetadata())` in interface `[JournalCapabilityFlags](../JournalCapabilityFlags.html "interface in akka.persistence")`
		- #### supportsReplayOnlyLast
		
		
		
		```
		protected [CapabilityFlag](../CapabilityFlag.html "class in akka.persistence") supportsReplayOnlyLast()
		```
		
		Description copied from interface: `[JournalCapabilityFlags](../JournalCapabilityFlags.html#supportsReplayOnlyLast())`
		When `true` enables tests which check if the Journal can replay only the last event.
		
		Specified by:
		`[supportsReplayOnlyLast](../JournalCapabilityFlags.html#supportsReplayOnlyLast())` in interface `[JournalCapabilityFlags](../JournalCapabilityFlags.html "interface in akka.persistence")`
		- #### beforeEach
		
		
		
		```
		protected void beforeEach()
		```
		
		
		Specified by:
		`beforeEach` in interface `org.scalatest.BeforeAndAfterEach`
		Overrides:
		`[beforeEach](../PluginSpec.html#beforeEach())` in class `[PluginSpec](../PluginSpec.html "class in akka.persistence")`
		- #### preparePersistenceId
		
		
		
		```
		public void preparePersistenceId​(java.lang.String pid)
		```
		
		Overridable hook that is called before populating the journal for the next
		 test case. `pid` is the `persistenceId` that will be used in the test.
		 This method may be needed to clean pre\-existing events from the log.
		- #### supportsAtomicPersistAllOfSeveralEvents
		
		
		
		```
		public boolean supportsAtomicPersistAllOfSeveralEvents()
		```
		
		Implementation may override and return false if it does not
		 support atomic writes of several events, as emitted by `persistAll`.
		- #### journal
		
		
		
		```
		public [ActorRef](../../actor/ActorRef.html "class in akka.actor") journal()
		```
		- #### replayedMessage
		
		
		
		```
		public [JournalProtocol.ReplayedMessage](../JournalProtocol.ReplayedMessage.html "class in akka.persistence") replayedMessage​(long snr,
		                                                       boolean deleted)
		```
		- #### replayedMessage$default$2
		
		
		
		```
		public boolean replayedMessage$default$2()
		```
		- #### writeMessages
		
		
		
		```
		public void writeMessages​(int fromSnr,
		                          int toSnr,
		                          java.lang.String pid,
		                          [ActorRef](../../actor/ActorRef.html "class in akka.actor") sender,
		                          java.lang.String writerUuid)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorRef.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorSystem.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/CapabilityFlag.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/CapabilityFlags.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/JournalCapabilityFlags.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/JournalProtocol.ReplayedMessage.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/PluginSpec.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/japi/journal/JavaJournalPerfSpec.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/japi/journal/JavaJournalSpec.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/journal/JournalPerfSpec.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/journal/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/scalatest/MayVerb.StringMayWrapperForVerb.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/scalatest/MayVerb.TestCanceledByFailure$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/scalatest/MayVerb.TestCanceledByFailure.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/scalatest/MayVerb.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/scalatest/OptionalTests.html
- https://doc.akka.io/japi/akka-core/2.10/akka/testkit/TestKitBase.html
- https://doc.akka.io/japi/akka-core/2.10/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/persistence/journal/JournalSpec.html](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/journal/JournalSpec.html)*