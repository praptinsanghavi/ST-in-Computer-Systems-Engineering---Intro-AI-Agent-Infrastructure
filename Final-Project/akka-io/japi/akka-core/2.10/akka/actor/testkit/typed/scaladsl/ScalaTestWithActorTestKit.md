---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:58:48Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/actor/testkit/typed/scaladsl/ScalaTestWithActorTestKit.html
title: ScalaTestWithActorTestKit
---

# ScalaTestWithActorTestKit

## Content

Package [akka.actor.testkit.typed.scaladsl](package-summary.html)
## Class ScalaTestWithActorTestKit

- java.lang.Object
- - [akka.actor.testkit.typed.scaladsl.ActorTestKitBase](ActorTestKitBase.html "class in akka.actor.testkit.typed.scaladsl")
	- - akka.actor.testkit.typed.scaladsl.ScalaTestWithActorTestKit

- All Implemented Interfaces:
`java.io.Serializable`, `org.scalactic.Explicitly`, `org.scalactic.Tolerance`, `org.scalactic.TripleEquals`, `org.scalactic.TripleEqualsSupport`, `org.scalatest.Assertions`, `org.scalatest.BeforeAndAfterAll`, `org.scalatest.concurrent.AbstractPatienceConfiguration`, `org.scalatest.concurrent.Eventually`, `org.scalatest.concurrent.Futures`, `org.scalatest.concurrent.PatienceConfiguration`, `org.scalatest.concurrent.ScalaFutures`, `org.scalatest.concurrent.ScaledTimeSpans`, `org.scalatest.matchers.dsl.MatcherWords`, `org.scalatest.matchers.should.Matchers`, `org.scalatest.Suite`, `org.scalatest.SuiteMixin`, `org.scalatest.TestSuite`, `org.scalatest.verbs.ShouldVerb`

---

```
public abstract class ScalaTestWithActorTestKit
extends [ActorTestKitBase](ActorTestKitBase.html "class in akka.actor.testkit.typed.scaladsl")
implements org.scalatest.TestSuite, org.scalatest.matchers.should.Matchers, org.scalatest.BeforeAndAfterAll, org.scalatest.concurrent.ScalaFutures, org.scalatest.concurrent.Eventually
```

A ScalaTest base class for the [`ActorTestKit`](ActorTestKit.html "class in akka.actor.testkit.typed.scaladsl"), making it possible to have ScalaTest manage the lifecycle of the testkit.
 The testkit will be automatically shut down when the test completes or fails using ScalaTest's BeforeAndAfterAll trait. If
 a spec overrides afterAll it must call super.afterAll.
 
 Note that ScalaTest is not provided as a transitive dependency of the testkit module but must be added explicitly
 to your project to use this.
 

 By default config is loaded from `application-test.conf` if that exists, otherwise
 using default configuration from the reference.conf resources that ship with the Akka libraries.
 The application.conf of your project is not used in this case.
 A specific configuration can be passed as constructor parameter.

See Also:
[Serialized Form](../../../../../serialized-form.html#akka.actor.testkit.typed.scaladsl.ScalaTestWithActorTestKit)

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from interface org.scalatest.concurrent.AbstractPatienceConfiguration
		
		
		`org.scalatest.concurrent.AbstractPatienceConfiguration.PatienceConfig, org.scalatest.concurrent.AbstractPatienceConfiguration.PatienceConfig$`
		- ### Nested classes/interfaces inherited from interface org.scalatest.Assertions
		
		
		`org.scalatest.Assertions.AssertionsHelper`
		- ### Nested classes/interfaces inherited from interface org.scalactic.Explicitly
		
		
		`org.scalactic.Explicitly.DecidedByEquality<A extends java.lang.Object>, org.scalactic.Explicitly.DecidedWord, org.scalactic.Explicitly.DeterminedByEquivalence<T extends java.lang.Object>, org.scalactic.Explicitly.DeterminedWord, org.scalactic.Explicitly.TheAfterWord`
		- ### Nested classes/interfaces inherited from interface org.scalatest.concurrent.Futures
		
		
		`org.scalatest.concurrent.Futures.FutureConcept<T extends java.lang.Object>`
		- ### Nested classes/interfaces inherited from interface org.scalatest.matchers.should.Matchers
		
		
		`org.scalatest.matchers.should.Matchers.AnWord, org.scalatest.matchers.should.Matchers.AnyShouldWrapper<T extends java.lang.Object>, org.scalatest.matchers.should.Matchers.AWord, org.scalatest.matchers.should.Matchers.Collected, org.scalatest.matchers.should.Matchers.HavePropertyMatcherGenerator, org.scalatest.matchers.should.Matchers.KeyWord, org.scalatest.matchers.should.Matchers.RegexWord, org.scalatest.matchers.should.Matchers.RegexWrapper, org.scalatest.matchers.should.Matchers.ResultOfBeWordForAny<T extends java.lang.Object>, org.scalatest.matchers.should.Matchers.ResultOfBeWordForCollectedAny<T extends java.lang.Object>, org.scalatest.matchers.should.Matchers.ResultOfBeWordForCollectedArray<T extends java.lang.Object>, org.scalatest.matchers.should.Matchers.ResultOfCollectedAny<T extends java.lang.Object>, org.scalatest.matchers.should.Matchers.ResultOfContainWordForCollectedAny<T extends java.lang.Object>, org.scalatest.matchers.should.Matchers.ResultOfEndWithWordForCollectedString, org.scalatest.matchers.should.Matchers.ResultOfEndWithWordForString, org.scalatest.matchers.should.Matchers.ResultOfFullyMatchWordForCollectedString, org.scalatest.matchers.should.Matchers.ResultOfFullyMatchWordForString, org.scalatest.matchers.should.Matchers.ResultOfHaveWordForCollectedExtent<A extends java.lang.Object>, org.scalatest.matchers.should.Matchers.ResultOfHaveWordForExtent<A extends java.lang.Object>, org.scalatest.matchers.should.Matchers.ResultOfIncludeWordForCollectedString, org.scalatest.matchers.should.Matchers.ResultOfIncludeWordForString, org.scalatest.matchers.should.Matchers.ResultOfNotWordForCollectedAny<T extends java.lang.Object>, org.scalatest.matchers.should.Matchers.ResultOfStartWithWordForCollectedString, org.scalatest.matchers.should.Matchers.ResultOfStartWithWordForString, org.scalatest.matchers.should.Matchers.StringShouldWrapper, org.scalatest.matchers.should.Matchers.TheSameInstanceAsPhrase, org.scalatest.matchers.should.Matchers.ValueWord`
		- ### Nested classes/interfaces inherited from interface org.scalatest.concurrent.PatienceConfiguration
		
		
		`org.scalatest.concurrent.PatienceConfiguration.Interval, org.scalatest.concurrent.PatienceConfiguration.Interval$, org.scalatest.concurrent.PatienceConfiguration.PatienceConfigParam, org.scalatest.concurrent.PatienceConfiguration.Timeout, org.scalatest.concurrent.PatienceConfiguration.Timeout$`
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
	| `[ScalaTestWithActorTestKit](#%3Cinit%3E())()` | Config loaded from `application-test.conf` if that exists, otherwise  using default configuration from the reference.conf resources that ship with the Akka libraries. |
	| `[ScalaTestWithActorTestKit](#%3Cinit%3E(akka.actor.testkit.typed.scaladsl.ActorTestKit))​([ActorTestKit](ActorTestKit.html "class in akka.actor.testkit.typed.scaladsl") testKit)` |  |
	| `[ScalaTestWithActorTestKit](#%3Cinit%3E(akka.actor.typed.ActorSystem))​([ActorSystem](../../../typed/ActorSystem.html "class in akka.actor.typed")<?> system)` | Use a custom [`ActorSystem`](../../../typed/ActorSystem.html "class in akka.actor.typed") for the actor system. |
	| `[ScalaTestWithActorTestKit](#%3Cinit%3E(com.typesafe.config.Config))​(com.typesafe.config.Config config)` | Use a custom config for the actor system. |
	| `[ScalaTestWithActorTestKit](#%3Cinit%3E(com.typesafe.config.Config,akka.actor.testkit.typed.TestKitSettings))​(com.typesafe.config.Config config,  [TestKitSettings](../TestKitSettings.html "class in akka.actor.testkit.typed") settings)` | Use a custom config for the actor system, and a custom [`TestKitSettings`](../TestKitSettings.html "class in akka.actor.testkit.typed"). |
	| `[ScalaTestWithActorTestKit](#%3Cinit%3E(java.lang.String))​(java.lang.String config)` | Use a custom config for the actor system. |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) [Deprecated Methods](javascript:show(32);) 
	| Modifier and Type | Method | Description |
	| `org.scalatest.matchers.should.Matchers.AWord` | `[a](#a())()` |  |
	| `org.scalactic.Explicitly.TheAfterWord` | `[after](#after())()` |  |
	| `protected void` | `[afterAll](#afterAll())()` | Shuts down the ActorTestKit. |
	| `org.scalatest.matchers.should.Matchers.AnWord` | `[an](#an())()` |  |
	| `org.scalatest.matchers.dsl.BeWord` | `[be](#be())()` |  |
	| `org.scalatest.verbs.CompileWord` | `[compile](#compile())()` |  |
	| `org.scalatest.matchers.dsl.ContainWord` | `[contain](#contain())()` |  |
	| `org.scalactic.Explicitly.DecidedWord` | `[decided](#decided())()` |  |
	| `org.scalatest.matchers.dsl.DefinedWord` | `[defined](#defined())()` |  |
	| `org.scalactic.Explicitly.DeterminedWord` | `[determined](#determined())()` |  |
	| `org.scalatest.matchers.dsl.EmptyWord` | `[empty](#empty())()` |  |
	| `org.scalatest.matchers.dsl.EndWithWord` | `[endWith](#endWith())()` |  |
	| `org.scalatest.matchers.dsl.ExistWord` | `[exist](#exist())()` |  |
	| `org.scalatest.matchers.dsl.FullyMatchWord` | `[fullyMatch](#fullyMatch())()` |  |
	| `org.scalatest.matchers.dsl.HaveWord` | `[have](#have())()` |  |
	| `org.scalatest.matchers.dsl.IncludeWord` | `[include](#include())()` |  |
	| `boolean` | `[invokeBeforeAllAndAfterAllEvenIfNoTestsAreExpected](#invokeBeforeAllAndAfterAllEvenIfNoTestsAreExpected())()` |  |
	| `org.scalatest.matchers.should.Matchers.KeyWord` | `[key](#key())()` |  |
	| `org.scalatest.matchers.dsl.LengthWord` | `[length](#length())()` |  |
	| `org.scalatest.matchers.dsl.MatchPatternWord` | `[matchPattern](#matchPattern())()` |  |
	| `org.scalatest.TestSuite.NoArgTest$` | `[NoArgTest](#NoArgTest())()` |  |
	| `org.scalatest.matchers.dsl.NotWord` | `[not](#not())()` |  |
	| `protected void` | `[org$scalactic$Explicitly$_setter_$after_$eq](#org$scalactic$Explicitly$_setter_$after_$eq(org.scalactic.Explicitly.TheAfterWord))​(org.scalactic.Explicitly.TheAfterWord x$1)` |  |
	| `protected void` | `[org$scalactic$Explicitly$_setter_$decided_$eq](#org$scalactic$Explicitly$_setter_$decided_$eq(org.scalactic.Explicitly.DecidedWord))​(org.scalactic.Explicitly.DecidedWord x$1)` |  |
	| `protected void` | `[org$scalactic$Explicitly$_setter_$determined_$eq](#org$scalactic$Explicitly$_setter_$determined_$eq(org.scalactic.Explicitly.DeterminedWord))​(org.scalactic.Explicitly.DeterminedWord x$1)` |  |
	| `protected void` | `[org$scalatest$Assertions$_setter_$succeed_$eq](#org$scalatest$Assertions$_setter_$succeed_$eq(org.scalatest.compatible.Assertion))​(org.scalatest.compatible.Assertion x$1)` |  |
	| `protected void` | `[org$scalatest$BeforeAndAfterAll$_setter_$invokeBeforeAllAndAfterAllEvenIfNoTestsAreExpected_$eq](#org$scalatest$BeforeAndAfterAll$_setter_$invokeBeforeAllAndAfterAllEvenIfNoTestsAreExpected_$eq(boolean))​(boolean x$1)` |  |
	| `protected void` | `[org$scalatest$concurrent$Futures$_setter_$jsAdjustment_$eq](#org$scalatest$concurrent$Futures$_setter_$jsAdjustment_$eq(int))​(int x$1)` |  |
	| `protected void` | `[org$scalatest$matchers$dsl$MatcherWords$_setter_$be_$eq](#org$scalatest$matchers$dsl$MatcherWords$_setter_$be_$eq(org.scalatest.matchers.dsl.BeWord))​(org.scalatest.matchers.dsl.BeWord x$1)` |  |
	| `protected void` | `[org$scalatest$matchers$dsl$MatcherWords$_setter_$compile_$eq](#org$scalatest$matchers$dsl$MatcherWords$_setter_$compile_$eq(org.scalatest.verbs.CompileWord))​(org.scalatest.verbs.CompileWord x$1)` |  |
	| `protected void` | `[org$scalatest$matchers$dsl$MatcherWords$_setter_$contain_$eq](#org$scalatest$matchers$dsl$MatcherWords$_setter_$contain_$eq(org.scalatest.matchers.dsl.ContainWord))​(org.scalatest.matchers.dsl.ContainWord x$1)` |  |
	| `protected void` | `[org$scalatest$matchers$dsl$MatcherWords$_setter_$defined_$eq](#org$scalatest$matchers$dsl$MatcherWords$_setter_$defined_$eq(org.scalatest.matchers.dsl.DefinedWord))​(org.scalatest.matchers.dsl.DefinedWord x$1)` |  |
	| `protected void` | `[org$scalatest$matchers$dsl$MatcherWords$_setter_$empty_$eq](#org$scalatest$matchers$dsl$MatcherWords$_setter_$empty_$eq(org.scalatest.matchers.dsl.EmptyWord))​(org.scalatest.matchers.dsl.EmptyWord x$1)` |  |
	| `protected void` | `[org$scalatest$matchers$dsl$MatcherWords$_setter_$endWith_$eq](#org$scalatest$matchers$dsl$MatcherWords$_setter_$endWith_$eq(org.scalatest.matchers.dsl.EndWithWord))​(org.scalatest.matchers.dsl.EndWithWord x$1)` |  |
	| `protected void` | `[org$scalatest$matchers$dsl$MatcherWords$_setter_$exist_$eq](#org$scalatest$matchers$dsl$MatcherWords$_setter_$exist_$eq(org.scalatest.matchers.dsl.ExistWord))​(org.scalatest.matchers.dsl.ExistWord x$1)` |  |
	| `protected void` | `[org$scalatest$matchers$dsl$MatcherWords$_setter_$fullyMatch_$eq](#org$scalatest$matchers$dsl$MatcherWords$_setter_$fullyMatch_$eq(org.scalatest.matchers.dsl.FullyMatchWord))​(org.scalatest.matchers.dsl.FullyMatchWord x$1)` |  |
	| `protected void` | `[org$scalatest$matchers$dsl$MatcherWords$_setter_$have_$eq](#org$scalatest$matchers$dsl$MatcherWords$_setter_$have_$eq(org.scalatest.matchers.dsl.HaveWord))​(org.scalatest.matchers.dsl.HaveWord x$1)` |  |
	| `protected void` | `[org$scalatest$matchers$dsl$MatcherWords$_setter_$include_$eq](#org$scalatest$matchers$dsl$MatcherWords$_setter_$include_$eq(org.scalatest.matchers.dsl.IncludeWord))​(org.scalatest.matchers.dsl.IncludeWord x$1)` |  |
	| `protected void` | `[org$scalatest$matchers$dsl$MatcherWords$_setter_$length_$eq](#org$scalatest$matchers$dsl$MatcherWords$_setter_$length_$eq(org.scalatest.matchers.dsl.LengthWord))​(org.scalatest.matchers.dsl.LengthWord x$1)` |  |
	| `protected void` | `[org$scalatest$matchers$dsl$MatcherWords$_setter_$matchPattern_$eq](#org$scalatest$matchers$dsl$MatcherWords$_setter_$matchPattern_$eq(org.scalatest.matchers.dsl.MatchPatternWord))​(org.scalatest.matchers.dsl.MatchPatternWord x$1)` |  |
	| `protected void` | `[org$scalatest$matchers$dsl$MatcherWords$_setter_$not_$eq](#org$scalatest$matchers$dsl$MatcherWords$_setter_$not_$eq(org.scalatest.matchers.dsl.NotWord))​(org.scalatest.matchers.dsl.NotWord x$1)` |  |
	| `protected void` | `[org$scalatest$matchers$dsl$MatcherWords$_setter_$readable_$eq](#org$scalatest$matchers$dsl$MatcherWords$_setter_$readable_$eq(org.scalatest.matchers.dsl.ReadableWord))​(org.scalatest.matchers.dsl.ReadableWord x$1)` |  |
	| `protected void` | `[org$scalatest$matchers$dsl$MatcherWords$_setter_$size_$eq](#org$scalatest$matchers$dsl$MatcherWords$_setter_$size_$eq(org.scalatest.matchers.dsl.SizeWord))​(org.scalatest.matchers.dsl.SizeWord x$1)` |  |
	| `protected void` | `[org$scalatest$matchers$dsl$MatcherWords$_setter_$sorted_$eq](#org$scalatest$matchers$dsl$MatcherWords$_setter_$sorted_$eq(org.scalatest.matchers.dsl.SortedWord))​(org.scalatest.matchers.dsl.SortedWord x$1)` |  |
	| `protected void` | `[org$scalatest$matchers$dsl$MatcherWords$_setter_$startWith_$eq](#org$scalatest$matchers$dsl$MatcherWords$_setter_$startWith_$eq(org.scalatest.matchers.dsl.StartWithWord))​(org.scalatest.matchers.dsl.StartWithWord x$1)` |  |
	| `protected void` | `[org$scalatest$matchers$dsl$MatcherWords$_setter_$typeCheck_$eq](#org$scalatest$matchers$dsl$MatcherWords$_setter_$typeCheck_$eq(org.scalatest.verbs.TypeCheckWord))​(org.scalatest.verbs.TypeCheckWord x$1)` |  |
	| `protected void` | `[org$scalatest$matchers$dsl$MatcherWords$_setter_$writable_$eq](#org$scalatest$matchers$dsl$MatcherWords$_setter_$writable_$eq(org.scalatest.matchers.dsl.WritableWord))​(org.scalatest.matchers.dsl.WritableWord x$1)` |  |
	| `protected void` | `[org$scalatest$matchers$should$Matchers$_setter_$a_$eq](#org$scalatest$matchers$should$Matchers$_setter_$a_$eq(org.scalatest.matchers.should.Matchers.AWord))​(org.scalatest.matchers.should.Matchers.AWord x$1)` |  |
	| `protected void` | `[org$scalatest$matchers$should$Matchers$_setter_$an_$eq](#org$scalatest$matchers$should$Matchers$_setter_$an_$eq(org.scalatest.matchers.should.Matchers.AnWord))​(org.scalatest.matchers.should.Matchers.AnWord x$1)` |  |
	| `protected void` | `[org$scalatest$matchers$should$Matchers$_setter_$key_$eq](#org$scalatest$matchers$should$Matchers$_setter_$key_$eq(org.scalatest.matchers.should.Matchers.KeyWord))​(org.scalatest.matchers.should.Matchers.KeyWord x$1)` |  |
	| `protected void` | `[org$scalatest$matchers$should$Matchers$_setter_$regex_$eq](#org$scalatest$matchers$should$Matchers$_setter_$regex_$eq(org.scalatest.matchers.should.Matchers.RegexWord))​(org.scalatest.matchers.should.Matchers.RegexWord x$1)` |  |
	| `protected void` | `[org$scalatest$matchers$should$Matchers$_setter_$theSameInstanceAs_$eq](#org$scalatest$matchers$should$Matchers$_setter_$theSameInstanceAs_$eq(org.scalatest.matchers.should.Matchers.TheSameInstanceAsPhrase))​(org.scalatest.matchers.should.Matchers.TheSameInstanceAsPhrase x$1)` |  |
	| `protected void` | `[org$scalatest$matchers$should$Matchers$_setter_$value_$eq](#org$scalatest$matchers$should$Matchers$_setter_$value_$eq(org.scalatest.matchers.should.Matchers.ValueWord))​(org.scalatest.matchers.should.Matchers.ValueWord x$1)` |  |
	| `protected void` | `[org$scalatest$Suite$_setter_$styleName_$eq](#org$scalatest$Suite$_setter_$styleName_$eq(java.lang.String))​(java.lang.String x$1)` |  |
	| `org.scalatest.concurrent.AbstractPatienceConfiguration.PatienceConfig` | `[patience](#patience())()` | `PatienceConfig` from [`TestKitSettings.DefaultTimeout()`](../TestKitSettings.html#DefaultTimeout()). |
	| `org.scalatest.concurrent.AbstractPatienceConfiguration.PatienceConfig$` | `[PatienceConfig](#PatienceConfig())()` |  |
	| `org.scalatest.matchers.dsl.ReadableWord` | `[readable](#readable())()` |  |
	| `org.scalatest.matchers.should.Matchers.RegexWord` | `[regex](#regex())()` |  |
	| `org.scalatest.matchers.dsl.SizeWord` | `[size](#size())()` |  |
	| `org.scalatest.matchers.dsl.SortedWord` | `[sorted](#sorted())()` |  |
	| `org.scalatest.matchers.dsl.StartWithWord` | `[startWith](#startWith())()` |  |
	| `java.lang.String` | `[styleName](#styleName())()` | Deprecated. The styleName lifecycle method has been deprecated and will be removed in a future version of ScalaTest with no replacement. |
	| `org.scalatest.compatible.Assertion` | `[succeed](#succeed())()` |  |
	| `org.scalatest.matchers.should.Matchers.TheSameInstanceAsPhrase` | `[theSameInstanceAs](#theSameInstanceAs())()` |  |
	| `org.scalatest.verbs.TypeCheckWord` | `[typeCheck](#typeCheck())()` |  |
	| `org.scalatest.matchers.should.Matchers.ValueWord` | `[value](#value())()` |  |
	| `org.scalatest.matchers.dsl.WritableWord` | `[writable](#writable())()` |  |
	
	
		- ### Methods inherited from class akka.actor.testkit.typed.scaladsl.[ActorTestKitBase](ActorTestKitBase.html "class in akka.actor.testkit.typed.scaladsl")
		
		
		`[createDeadLetterProbe](ActorTestKitBase.html#createDeadLetterProbe()), [createDroppedMessageProbe](ActorTestKitBase.html#createDroppedMessageProbe()), [createTestProbe](ActorTestKitBase.html#createTestProbe()), [createTestProbe](ActorTestKitBase.html#createTestProbe(java.lang.String)), [createUnhandledMessageProbe](ActorTestKitBase.html#createUnhandledMessageProbe()), [serializationTestKit](ActorTestKitBase.html#serializationTestKit()), [spawn](ActorTestKitBase.html#spawn(akka.actor.typed.Behavior)), [spawn](ActorTestKitBase.html#spawn(akka.actor.typed.Behavior,akka.actor.typed.Props)), [spawn](ActorTestKitBase.html#spawn(akka.actor.typed.Behavior,java.lang.String)), [spawn](ActorTestKitBase.html#spawn(akka.actor.typed.Behavior,java.lang.String,akka.actor.typed.Props)), [system](ActorTestKitBase.html#system()), [testKit](ActorTestKitBase.html#testKit()), [testKitSettings](ActorTestKitBase.html#testKitSettings()), [testNameFromCallStack](ActorTestKitBase.html#testNameFromCallStack()), [timeout](ActorTestKitBase.html#timeout())`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface org.scalatest.Assertions
		
		
		`assertResult, assertResult, assertThrows, cancel, cancel, cancel, cancel, fail, fail, fail, fail, intercept, newAssertionFailedException, newTestCanceledException, pending, pendingUntilFixed, withClue`
		- ### Methods inherited from interface org.scalatest.BeforeAndAfterAll
		
		
		`beforeAll, run`
		- ### Methods inherited from interface org.scalatest.concurrent.Eventually
		
		
		`eventually, eventually, eventually, eventually`
		- ### Methods inherited from interface org.scalatest.concurrent.Futures
		
		
		`whenReady, whenReady, whenReady, whenReady`
		- ### Methods inherited from interface org.scalatest.matchers.should.Matchers
		
		
		`$greater, $greater$eq, $less, $less$eq, a, all, all, all, all, allElementsOf, allOf, an, atLeast, atLeast, atLeast, atLeast, atLeastOneElementOf, atLeastOneOf, atMost, atMost, atMost, atMost, atMostOneElementOf, atMostOneOf, between, between, between, convertSymbolToHavePropertyMatcherGenerator, convertToAnyShouldWrapper, convertToRegexWrapper, convertToStringShouldWrapper, definedAt, doCollected, equal, equal, every, every, every, every, exactly, exactly, exactly, exactly, inOrder, inOrderElementsOf, inOrderOnly, message, no, no, no, noElementsOf, noneOf, of, oneElementOf, oneOf, only, org$scalatest$matchers$should$Matchers$_setter_$org$scalatest$matchers$should$Matchers$$AllCollected_$eq, org$scalatest$matchers$should$Matchers$_setter_$org$scalatest$matchers$should$Matchers$$EveryCollected_$eq, org$scalatest$matchers$should$Matchers$_setter_$org$scalatest$matchers$should$Matchers$$NoCollected_$eq, org$scalatest$matchers$should$Matchers$_setter_$org$scalatest$matchers$should$Matchers$$ShouldMethodHelper_$eq, org$scalatest$matchers$should$Matchers$$AllCollected, org$scalatest$matchers$should$Matchers$$AtLeastCollected, org$scalatest$matchers$should$Matchers$$AtMostCollected, org$scalatest$matchers$should$Matchers$$BetweenCollected, org$scalatest$matchers$should$Matchers$$EveryCollected, org$scalatest$matchers$should$Matchers$$ExactlyCollected, org$scalatest$matchers$should$Matchers$$NoCollected, org$scalatest$matchers$should$Matchers$$ShouldMethodHelper, the, theSameElementsAs, theSameElementsInOrderAs, thrownBy`
		- ### Methods inherited from interface org.scalatest.matchers.dsl.MatcherWords
		
		
		`equal, noException`
		- ### Methods inherited from interface org.scalatest.concurrent.PatienceConfiguration
		
		
		`interval, org$scalatest$concurrent$PatienceConfiguration$_setter_$org$scalatest$concurrent$PatienceConfiguration$$defaultPatienceConfig_$eq, org$scalatest$concurrent$PatienceConfiguration$$defaultPatienceConfig, patienceConfig, timeout`
		- ### Methods inherited from interface org.scalatest.concurrent.ScalaFutures
		
		
		`convertScalaFuture`
		- ### Methods inherited from interface org.scalatest.concurrent.ScaledTimeSpans
		
		
		`scaled, spanScaleFactor`
		- ### Methods inherited from interface org.scalatest.verbs.ShouldVerb
		
		
		`convertToStringShouldWrapperForVerb`
		- ### Methods inherited from interface org.scalatest.Suite
		
		
		`createCatchReporter, execute, execute$default$1, execute$default$2, execute$default$3, execute$default$4, execute$default$5, execute$default$6, execute$default$7, expectedTestCount, nestedSuites, rerunner, run, runNestedSuites, runTests, suiteId, suiteName, tags, testDataFor, testDataFor$default$2, testNames`
		- ### Methods inherited from interface org.scalatest.SuiteMixin
		
		
		`expectedTestCount, nestedSuites, rerunner, runNestedSuites, runTest, runTests, suiteId, suiteName, tags, testDataFor, testNames`
		- ### Methods inherited from interface org.scalatest.TestSuite
		
		
		`runTest, withFixture`
		- ### Methods inherited from interface org.scalactic.Tolerance
		
		
		`convertNumericToPlusOrMinusWrapper`
		- ### Methods inherited from interface org.scalactic.TripleEquals
		
		
		`conversionCheckedConstraint, convertEquivalenceToAToBConstraint, convertEquivalenceToAToBConversionConstraint, convertEquivalenceToBToAConstraint, convertEquivalenceToBToAConversionConstraint, convertToCheckingEqualizer, convertToEqualizer, lowPriorityConversionCheckedConstraint, lowPriorityTypeCheckedConstraint, typeCheckedConstraint, unconstrainedEquality`
		- ### Methods inherited from interface org.scalactic.TripleEqualsSupport
		
		
		`$bang$eq$eq, $bang$eq$eq, $bang$eq$eq, $eq$eq$eq, $eq$eq$eq, $eq$eq$eq, defaultEquality`

- - ### Constructor Detail
	
	
	
		- #### ScalaTestWithActorTestKit
		
		
		
		```
		public ScalaTestWithActorTestKit​([ActorTestKit](ActorTestKit.html "class in akka.actor.testkit.typed.scaladsl") testKit)
		```
		- #### ScalaTestWithActorTestKit
		
		
		
		```
		public ScalaTestWithActorTestKit()
		```
		
		Config loaded from `application-test.conf` if that exists, otherwise
		 using default configuration from the reference.conf resources that ship with the Akka libraries.
		 The application.conf of your project is not used in this case.
		- #### ScalaTestWithActorTestKit
		
		
		
		```
		public ScalaTestWithActorTestKit​([ActorSystem](../../../typed/ActorSystem.html "class in akka.actor.typed")<?> system)
		```
		
		Use a custom [`ActorSystem`](../../../typed/ActorSystem.html "class in akka.actor.typed") for the actor system.
		- #### ScalaTestWithActorTestKit
		
		
		
		```
		public ScalaTestWithActorTestKit​(java.lang.String config)
		```
		
		Use a custom config for the actor system.
		- #### ScalaTestWithActorTestKit
		
		
		
		```
		public ScalaTestWithActorTestKit​(com.typesafe.config.Config config)
		```
		
		Use a custom config for the actor system.
		- #### ScalaTestWithActorTestKit
		
		
		
		```
		public ScalaTestWithActorTestKit​(com.typesafe.config.Config config,
		                                 [TestKitSettings](../TestKitSettings.html "class in akka.actor.testkit.typed") settings)
		```
		
		Use a custom config for the actor system, and a custom [`TestKitSettings`](../TestKitSettings.html "class in akka.actor.testkit.typed").

	- ### Method Detail
	
	
	
		- #### NoArgTest
		
		
		
		```
		public org.scalatest.TestSuite.NoArgTest$ NoArgTest()
		```
		
		
		Specified by:
		`NoArgTest` in interface `org.scalatest.TestSuite`
		- #### PatienceConfig
		
		
		
		```
		public org.scalatest.concurrent.AbstractPatienceConfiguration.PatienceConfig$ PatienceConfig()
		```
		
		
		Specified by:
		`PatienceConfig` in interface `org.scalatest.concurrent.AbstractPatienceConfiguration`
		- #### a
		
		
		
		```
		public org.scalatest.matchers.should.Matchers.AWord a()
		```
		
		
		Specified by:
		`a` in interface `org.scalatest.matchers.should.Matchers`
		- #### after
		
		
		
		```
		public org.scalactic.Explicitly.TheAfterWord after()
		```
		
		
		Specified by:
		`after` in interface `org.scalactic.Explicitly`
		- #### afterAll
		
		
		
		```
		protected void afterAll()
		```
		
		Shuts down the ActorTestKit. If override be sure to call super.afterAll
		 or shut down the testkit explicitly with `testKit.shutdownTestKit()`.
		
		Specified by:
		`afterAll` in interface `org.scalatest.BeforeAndAfterAll`
		Specified by:
		`[afterAll](ActorTestKitBase.html#afterAll())` in class `[ActorTestKitBase](ActorTestKitBase.html "class in akka.actor.testkit.typed.scaladsl")`
		- #### an
		
		
		
		```
		public org.scalatest.matchers.should.Matchers.AnWord an()
		```
		
		
		Specified by:
		`an` in interface `org.scalatest.matchers.should.Matchers`
		- #### be
		
		
		
		```
		public org.scalatest.matchers.dsl.BeWord be()
		```
		
		
		Specified by:
		`be` in interface `org.scalatest.matchers.dsl.MatcherWords`
		- #### compile
		
		
		
		```
		public org.scalatest.verbs.CompileWord compile()
		```
		
		
		Specified by:
		`compile` in interface `org.scalatest.matchers.dsl.MatcherWords`
		- #### contain
		
		
		
		```
		public org.scalatest.matchers.dsl.ContainWord contain()
		```
		
		
		Specified by:
		`contain` in interface `org.scalatest.matchers.dsl.MatcherWords`
		- #### decided
		
		
		
		```
		public org.scalactic.Explicitly.DecidedWord decided()
		```
		
		
		Specified by:
		`decided` in interface `org.scalactic.Explicitly`
		- #### defined
		
		
		
		```
		public org.scalatest.matchers.dsl.DefinedWord defined()
		```
		
		
		Specified by:
		`defined` in interface `org.scalatest.matchers.dsl.MatcherWords`
		- #### determined
		
		
		
		```
		public org.scalactic.Explicitly.DeterminedWord determined()
		```
		
		
		Specified by:
		`determined` in interface `org.scalactic.Explicitly`
		- #### empty
		
		
		
		```
		public org.scalatest.matchers.dsl.EmptyWord empty()
		```
		
		
		Specified by:
		`empty` in interface `org.scalatest.matchers.dsl.MatcherWords`
		- #### endWith
		
		
		
		```
		public org.scalatest.matchers.dsl.EndWithWord endWith()
		```
		
		
		Specified by:
		`endWith` in interface `org.scalatest.matchers.dsl.MatcherWords`
		- #### exist
		
		
		
		```
		public org.scalatest.matchers.dsl.ExistWord exist()
		```
		
		
		Specified by:
		`exist` in interface `org.scalatest.matchers.dsl.MatcherWords`
		- #### fullyMatch
		
		
		
		```
		public org.scalatest.matchers.dsl.FullyMatchWord fullyMatch()
		```
		
		
		Specified by:
		`fullyMatch` in interface `org.scalatest.matchers.dsl.MatcherWords`
		- #### have
		
		
		
		```
		public org.scalatest.matchers.dsl.HaveWord have()
		```
		
		
		Specified by:
		`have` in interface `org.scalatest.matchers.dsl.MatcherWords`
		- #### include
		
		
		
		```
		public org.scalatest.matchers.dsl.IncludeWord include()
		```
		
		
		Specified by:
		`include` in interface `org.scalatest.matchers.dsl.MatcherWords`
		- #### invokeBeforeAllAndAfterAllEvenIfNoTestsAreExpected
		
		
		
		```
		public boolean invokeBeforeAllAndAfterAllEvenIfNoTestsAreExpected()
		```
		
		
		Specified by:
		`invokeBeforeAllAndAfterAllEvenIfNoTestsAreExpected` in interface `org.scalatest.BeforeAndAfterAll`
		- #### key
		
		
		
		```
		public org.scalatest.matchers.should.Matchers.KeyWord key()
		```
		
		
		Specified by:
		`key` in interface `org.scalatest.matchers.should.Matchers`
		- #### length
		
		
		
		```
		public org.scalatest.matchers.dsl.LengthWord length()
		```
		
		
		Specified by:
		`length` in interface `org.scalatest.matchers.dsl.MatcherWords`
		- #### matchPattern
		
		
		
		```
		public org.scalatest.matchers.dsl.MatchPatternWord matchPattern()
		```
		
		
		Specified by:
		`matchPattern` in interface `org.scalatest.matchers.dsl.MatcherWords`
		- #### not
		
		
		
		```
		public org.scalatest.matchers.dsl.NotWord not()
		```
		
		
		Specified by:
		`not` in interface `org.scalatest.matchers.dsl.MatcherWords`
		- #### org$scalactic$Explicitly$\_setter\_$after\_$eq
		
		
		
		```
		protected void org$scalactic$Explicitly$_setter_$after_$eq​(org.scalactic.Explicitly.TheAfterWord x$1)
		```
		
		
		Specified by:
		`org$scalactic$Explicitly$_setter_$after_$eq` in interface `org.scalactic.Explicitly`
		- #### org$scalactic$Explicitly$\_setter\_$decided\_$eq
		
		
		
		```
		protected void org$scalactic$Explicitly$_setter_$decided_$eq​(org.scalactic.Explicitly.DecidedWord x$1)
		```
		
		
		Specified by:
		`org$scalactic$Explicitly$_setter_$decided_$eq` in interface `org.scalactic.Explicitly`
		- #### org$scalactic$Explicitly$\_setter\_$determined\_$eq
		
		
		
		```
		protected void org$scalactic$Explicitly$_setter_$determined_$eq​(org.scalactic.Explicitly.DeterminedWord x$1)
		```
		
		
		Specified by:
		`org$scalactic$Explicitly$_setter_$determined_$eq` in interface `org.scalactic.Explicitly`
		- #### org$scalatest$Assertions$\_setter\_$succeed\_$eq
		
		
		
		```
		protected final void org$scalatest$Assertions$_setter_$succeed_$eq​(org.scalatest.compatible.Assertion x$1)
		```
		
		
		Specified by:
		`org$scalatest$Assertions$_setter_$succeed_$eq` in interface `org.scalatest.Assertions`
		- #### org$scalatest$BeforeAndAfterAll$\_setter\_$invokeBeforeAllAndAfterAllEvenIfNoTestsAreExpected\_$eq
		
		
		
		```
		protected void org$scalatest$BeforeAndAfterAll$_setter_$invokeBeforeAllAndAfterAllEvenIfNoTestsAreExpected_$eq​(boolean x$1)
		```
		
		
		Specified by:
		`org$scalatest$BeforeAndAfterAll$_setter_$invokeBeforeAllAndAfterAllEvenIfNoTestsAreExpected_$eq` in interface `org.scalatest.BeforeAndAfterAll`
		- #### org$scalatest$Suite$\_setter\_$styleName\_$eq
		
		
		
		```
		protected void org$scalatest$Suite$_setter_$styleName_$eq​(java.lang.String x$1)
		```
		
		
		Specified by:
		`org$scalatest$Suite$_setter_$styleName_$eq` in interface `org.scalatest.Suite`
		- #### org$scalatest$concurrent$Futures$\_setter\_$jsAdjustment\_$eq
		
		
		
		```
		protected void org$scalatest$concurrent$Futures$_setter_$jsAdjustment_$eq​(int x$1)
		```
		
		
		Specified by:
		`org$scalatest$concurrent$Futures$_setter_$jsAdjustment_$eq` in interface `org.scalatest.concurrent.Futures`
		- #### org$scalatest$matchers$dsl$MatcherWords$\_setter\_$be\_$eq
		
		
		
		```
		protected void org$scalatest$matchers$dsl$MatcherWords$_setter_$be_$eq​(org.scalatest.matchers.dsl.BeWord x$1)
		```
		
		
		Specified by:
		`org$scalatest$matchers$dsl$MatcherWords$_setter_$be_$eq` in interface `org.scalatest.matchers.dsl.MatcherWords`
		- #### org$scalatest$matchers$dsl$MatcherWords$\_setter\_$compile\_$eq
		
		
		
		```
		protected void org$scalatest$matchers$dsl$MatcherWords$_setter_$compile_$eq​(org.scalatest.verbs.CompileWord x$1)
		```
		
		
		Specified by:
		`org$scalatest$matchers$dsl$MatcherWords$_setter_$compile_$eq` in interface `org.scalatest.matchers.dsl.MatcherWords`
		- #### org$scalatest$matchers$dsl$MatcherWords$\_setter\_$contain\_$eq
		
		
		
		```
		protected void org$scalatest$matchers$dsl$MatcherWords$_setter_$contain_$eq​(org.scalatest.matchers.dsl.ContainWord x$1)
		```
		
		
		Specified by:
		`org$scalatest$matchers$dsl$MatcherWords$_setter_$contain_$eq` in interface `org.scalatest.matchers.dsl.MatcherWords`
		- #### org$scalatest$matchers$dsl$MatcherWords$\_setter\_$defined\_$eq
		
		
		
		```
		protected void org$scalatest$matchers$dsl$MatcherWords$_setter_$defined_$eq​(org.scalatest.matchers.dsl.DefinedWord x$1)
		```
		
		
		Specified by:
		`org$scalatest$matchers$dsl$MatcherWords$_setter_$defined_$eq` in interface `org.scalatest.matchers.dsl.MatcherWords`
		- #### org$scalatest$matchers$dsl$MatcherWords$\_setter\_$empty\_$eq
		
		
		
		```
		protected void org$scalatest$matchers$dsl$MatcherWords$_setter_$empty_$eq​(org.scalatest.matchers.dsl.EmptyWord x$1)
		```
		
		
		Specified by:
		`org$scalatest$matchers$dsl$MatcherWords$_setter_$empty_$eq` in interface `org.scalatest.matchers.dsl.MatcherWords`
		- #### org$scalatest$matchers$dsl$MatcherWords$\_setter\_$endWith\_$eq
		
		
		
		```
		protected void org$scalatest$matchers$dsl$MatcherWords$_setter_$endWith_$eq​(org.scalatest.matchers.dsl.EndWithWord x$1)
		```
		
		
		Specified by:
		`org$scalatest$matchers$dsl$MatcherWords$_setter_$endWith_$eq` in interface `org.scalatest.matchers.dsl.MatcherWords`
		- #### org$scalatest$matchers$dsl$MatcherWords$\_setter\_$exist\_$eq
		
		
		
		```
		protected void org$scalatest$matchers$dsl$MatcherWords$_setter_$exist_$eq​(org.scalatest.matchers.dsl.ExistWord x$1)
		```
		
		
		Specified by:
		`org$scalatest$matchers$dsl$MatcherWords$_setter_$exist_$eq` in interface `org.scalatest.matchers.dsl.MatcherWords`
		- #### org$scalatest$matchers$dsl$MatcherWords$\_setter\_$fullyMatch\_$eq
		
		
		
		```
		protected void org$scalatest$matchers$dsl$MatcherWords$_setter_$fullyMatch_$eq​(org.scalatest.matchers.dsl.FullyMatchWord x$1)
		```
		
		
		Specified by:
		`org$scalatest$matchers$dsl$MatcherWords$_setter_$fullyMatch_$eq` in interface `org.scalatest.matchers.dsl.MatcherWords`
		- #### org$scalatest$matchers$dsl$MatcherWords$\_setter\_$have\_$eq
		
		
		
		```
		protected void org$scalatest$matchers$dsl$MatcherWords$_setter_$have_$eq​(org.scalatest.matchers.dsl.HaveWord x$1)
		```
		
		
		Specified by:
		`org$scalatest$matchers$dsl$MatcherWords$_setter_$have_$eq` in interface `org.scalatest.matchers.dsl.MatcherWords`
		- #### org$scalatest$matchers$dsl$MatcherWords$\_setter\_$include\_$eq
		
		
		
		```
		protected void org$scalatest$matchers$dsl$MatcherWords$_setter_$include_$eq​(org.scalatest.matchers.dsl.IncludeWord x$1)
		```
		
		
		Specified by:
		`org$scalatest$matchers$dsl$MatcherWords$_setter_$include_$eq` in interface `org.scalatest.matchers.dsl.MatcherWords`
		- #### org$scalatest$matchers$dsl$MatcherWords$\_setter\_$length\_$eq
		
		
		
		```
		protected void org$scalatest$matchers$dsl$MatcherWords$_setter_$length_$eq​(org.scalatest.matchers.dsl.LengthWord x$1)
		```
		
		
		Specified by:
		`org$scalatest$matchers$dsl$MatcherWords$_setter_$length_$eq` in interface `org.scalatest.matchers.dsl.MatcherWords`
		- #### org$scalatest$matchers$dsl$MatcherWords$\_setter\_$matchPattern\_$eq
		
		
		
		```
		protected void org$scalatest$matchers$dsl$MatcherWords$_setter_$matchPattern_$eq​(org.scalatest.matchers.dsl.MatchPatternWord x$1)
		```
		
		
		Specified by:
		`org$scalatest$matchers$dsl$MatcherWords$_setter_$matchPattern_$eq` in interface `org.scalatest.matchers.dsl.MatcherWords`
		- #### org$scalatest$matchers$dsl$MatcherWords$\_setter\_$not\_$eq
		
		
		
		```
		protected void org$scalatest$matchers$dsl$MatcherWords$_setter_$not_$eq​(org.scalatest.matchers.dsl.NotWord x$1)
		```
		
		
		Specified by:
		`org$scalatest$matchers$dsl$MatcherWords$_setter_$not_$eq` in interface `org.scalatest.matchers.dsl.MatcherWords`
		- #### org$scalatest$matchers$dsl$MatcherWords$\_setter\_$readable\_$eq
		
		
		
		```
		protected void org$scalatest$matchers$dsl$MatcherWords$_setter_$readable_$eq​(org.scalatest.matchers.dsl.ReadableWord x$1)
		```
		
		
		Specified by:
		`org$scalatest$matchers$dsl$MatcherWords$_setter_$readable_$eq` in interface `org.scalatest.matchers.dsl.MatcherWords`
		- #### org$scalatest$matchers$dsl$MatcherWords$\_setter\_$size\_$eq
		
		
		
		```
		protected void org$scalatest$matchers$dsl$MatcherWords$_setter_$size_$eq​(org.scalatest.matchers.dsl.SizeWord x$1)
		```
		
		
		Specified by:
		`org$scalatest$matchers$dsl$MatcherWords$_setter_$size_$eq` in interface `org.scalatest.matchers.dsl.MatcherWords`
		- #### org$scalatest$matchers$dsl$MatcherWords$\_setter\_$sorted\_$eq
		
		
		
		```
		protected void org$scalatest$matchers$dsl$MatcherWords$_setter_$sorted_$eq​(org.scalatest.matchers.dsl.SortedWord x$1)
		```
		
		
		Specified by:
		`org$scalatest$matchers$dsl$MatcherWords$_setter_$sorted_$eq` in interface `org.scalatest.matchers.dsl.MatcherWords`
		- #### org$scalatest$matchers$dsl$MatcherWords$\_setter\_$startWith\_$eq
		
		
		
		```
		protected void org$scalatest$matchers$dsl$MatcherWords$_setter_$startWith_$eq​(org.scalatest.matchers.dsl.StartWithWord x$1)
		```
		
		
		Specified by:
		`org$scalatest$matchers$dsl$MatcherWords$_setter_$startWith_$eq` in interface `org.scalatest.matchers.dsl.MatcherWords`
		- #### org$scalatest$matchers$dsl$MatcherWords$\_setter\_$typeCheck\_$eq
		
		
		
		```
		protected void org$scalatest$matchers$dsl$MatcherWords$_setter_$typeCheck_$eq​(org.scalatest.verbs.TypeCheckWord x$1)
		```
		
		
		Specified by:
		`org$scalatest$matchers$dsl$MatcherWords$_setter_$typeCheck_$eq` in interface `org.scalatest.matchers.dsl.MatcherWords`
		- #### org$scalatest$matchers$dsl$MatcherWords$\_setter\_$writable\_$eq
		
		
		
		```
		protected void org$scalatest$matchers$dsl$MatcherWords$_setter_$writable_$eq​(org.scalatest.matchers.dsl.WritableWord x$1)
		```
		
		
		Specified by:
		`org$scalatest$matchers$dsl$MatcherWords$_setter_$writable_$eq` in interface `org.scalatest.matchers.dsl.MatcherWords`
		- #### org$scalatest$matchers$should$Matchers$\_setter\_$a\_$eq
		
		
		
		```
		protected void org$scalatest$matchers$should$Matchers$_setter_$a_$eq​(org.scalatest.matchers.should.Matchers.AWord x$1)
		```
		
		
		Specified by:
		`org$scalatest$matchers$should$Matchers$_setter_$a_$eq` in interface `org.scalatest.matchers.should.Matchers`
		- #### org$scalatest$matchers$should$Matchers$\_setter\_$an\_$eq
		
		
		
		```
		protected void org$scalatest$matchers$should$Matchers$_setter_$an_$eq​(org.scalatest.matchers.should.Matchers.AnWord x$1)
		```
		
		
		Specified by:
		`org$scalatest$matchers$should$Matchers$_setter_$an_$eq` in interface `org.scalatest.matchers.should.Matchers`
		- #### org$scalatest$matchers$should$Matchers$\_setter\_$key\_$eq
		
		
		
		```
		protected void org$scalatest$matchers$should$Matchers$_setter_$key_$eq​(org.scalatest.matchers.should.Matchers.KeyWord x$1)
		```
		
		
		Specified by:
		`org$scalatest$matchers$should$Matchers$_setter_$key_$eq` in interface `org.scalatest.matchers.should.Matchers`
		- #### org$scalatest$matchers$should$Matchers$\_setter\_$regex\_$eq
		
		
		
		```
		protected void org$scalatest$matchers$should$Matchers$_setter_$regex_$eq​(org.scalatest.matchers.should.Matchers.RegexWord x$1)
		```
		
		
		Specified by:
		`org$scalatest$matchers$should$Matchers$_setter_$regex_$eq` in interface `org.scalatest.matchers.should.Matchers`
		- #### org$scalatest$matchers$should$Matchers$\_setter\_$theSameInstanceAs\_$eq
		
		
		
		```
		protected void org$scalatest$matchers$should$Matchers$_setter_$theSameInstanceAs_$eq​(org.scalatest.matchers.should.Matchers.TheSameInstanceAsPhrase x$1)
		```
		
		
		Specified by:
		`org$scalatest$matchers$should$Matchers$_setter_$theSameInstanceAs_$eq` in interface `org.scalatest.matchers.should.Matchers`
		- #### org$scalatest$matchers$should$Matchers$\_setter\_$value\_$eq
		
		
		
		```
		protected void org$scalatest$matchers$should$Matchers$_setter_$value_$eq​(org.scalatest.matchers.should.Matchers.ValueWord x$1)
		```
		
		
		Specified by:
		`org$scalatest$matchers$should$Matchers$_setter_$value_$eq` in interface `org.scalatest.matchers.should.Matchers`
		- #### patience
		
		
		
		```
		public org.scalatest.concurrent.AbstractPatienceConfiguration.PatienceConfig patience()
		```
		
		`PatienceConfig` from [`TestKitSettings.DefaultTimeout()`](../TestKitSettings.html#DefaultTimeout()).
		 `DefaultTimeout` is dilated with [`TestKitSettings.TestTimeFactor()`](../TestKitSettings.html#TestTimeFactor()),
		 which means that the patience is also dilated.
		- #### readable
		
		
		
		```
		public org.scalatest.matchers.dsl.ReadableWord readable()
		```
		
		
		Specified by:
		`readable` in interface `org.scalatest.matchers.dsl.MatcherWords`
		- #### regex
		
		
		
		```
		public org.scalatest.matchers.should.Matchers.RegexWord regex()
		```
		
		
		Specified by:
		`regex` in interface `org.scalatest.matchers.should.Matchers`
		- #### size
		
		
		
		```
		public org.scalatest.matchers.dsl.SizeWord size()
		```
		
		
		Specified by:
		`size` in interface `org.scalatest.matchers.dsl.MatcherWords`
		- #### sorted
		
		
		
		```
		public org.scalatest.matchers.dsl.SortedWord sorted()
		```
		
		
		Specified by:
		`sorted` in interface `org.scalatest.matchers.dsl.MatcherWords`
		- #### startWith
		
		
		
		```
		public org.scalatest.matchers.dsl.StartWithWord startWith()
		```
		
		
		Specified by:
		`startWith` in interface `org.scalatest.matchers.dsl.MatcherWords`
		- #### styleName
		
		
		
		```
		public java.lang.String styleName()
		```
		
		Deprecated.
		The styleName lifecycle method has been deprecated and will be removed in a future version of ScalaTest with no replacement. Since 3\.1\.0\.
		
		
		Specified by:
		`styleName` in interface `org.scalatest.Suite`
		Specified by:
		`styleName` in interface `org.scalatest.SuiteMixin`
		- #### succeed
		
		
		
		```
		public final org.scalatest.compatible.Assertion succeed()
		```
		
		
		Specified by:
		`succeed` in interface `org.scalatest.Assertions`
		- #### theSameInstanceAs
		
		
		
		```
		public org.scalatest.matchers.should.Matchers.TheSameInstanceAsPhrase theSameInstanceAs()
		```
		
		
		Specified by:
		`theSameInstanceAs` in interface `org.scalatest.matchers.should.Matchers`
		- #### typeCheck
		
		
		
		```
		public org.scalatest.verbs.TypeCheckWord typeCheck()
		```
		
		
		Specified by:
		`typeCheck` in interface `org.scalatest.matchers.dsl.MatcherWords`
		- #### value
		
		
		
		```
		public org.scalatest.matchers.should.Matchers.ValueWord value()
		```
		
		
		Specified by:
		`value` in interface `org.scalatest.matchers.should.Matchers`
		- #### writable
		
		
		
		```
		public org.scalatest.matchers.dsl.WritableWord writable()
		```
		
		
		Specified by:
		`writable` in interface `org.scalatest.matchers.dsl.MatcherWords`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/testkit/typed/TestKitSettings.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/testkit/typed/scaladsl/ActorTestKit.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/testkit/typed/scaladsl/ActorTestKitBase.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/testkit/typed/scaladsl/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/ActorSystem.html
- https://doc.akka.io/japi/akka-core/2.10/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/actor/testkit/typed/scaladsl/ScalaTestWithActorTestKit.html](https://doc.akka.io/japi/akka-core/2.10/akka/actor/testkit/typed/scaladsl/ScalaTestWithActorTestKit.html)*