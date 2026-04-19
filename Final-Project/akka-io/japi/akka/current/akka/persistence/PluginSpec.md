---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:22:53Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/persistence/PluginSpec.html
title: PluginSpec
---

# PluginSpec

## Content

Package [akka.persistence](package-summary.html)
## Class PluginSpec

- java.lang.Object
- - akka.persistence.PluginSpec

- All Implemented Interfaces:
`[TestKitBase](../testkit/TestKitBase.html "interface in akka.testkit")`, `java.io.Serializable`, `org.scalactic.Explicitly`, `org.scalactic.Tolerance`, `org.scalactic.TripleEquals`, `org.scalactic.TripleEqualsSupport`, `org.scalatest.Alerting`, `org.scalatest.Assertions`, `org.scalatest.BeforeAndAfterAll`, `org.scalatest.BeforeAndAfterEach`, `org.scalatest.Documenting`, `org.scalatest.Informing`, `org.scalatest.matchers.dsl.MatcherWords`, `org.scalatest.matchers.should.Matchers`, `org.scalatest.Notifying`, `org.scalatest.Suite`, `org.scalatest.SuiteMixin`, `org.scalatest.TestRegistration`, `org.scalatest.TestSuite`, `org.scalatest.verbs.CanVerb`, `org.scalatest.verbs.MustVerb`, `org.scalatest.verbs.ShouldVerb`, `org.scalatest.wordspec.AnyWordSpecLike`

Direct Known Subclasses:
`[JournalSpec](journal/JournalSpec.html "class in akka.persistence.journal")`, `[SnapshotStoreSpec](snapshot/SnapshotStoreSpec.html "class in akka.persistence.snapshot")`

---

```
public abstract class PluginSpec
extends java.lang.Object
implements [TestKitBase](../testkit/TestKitBase.html "interface in akka.testkit"), org.scalatest.wordspec.AnyWordSpecLike, org.scalatest.matchers.should.Matchers, org.scalatest.BeforeAndAfterAll, org.scalatest.BeforeAndAfterEach
```

See Also:
[Serialized Form](../../serialized-form.html#akka.persistence.PluginSpec)

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
	| `[PluginSpec](#%3Cinit%3E(com.typesafe.config.Config))​(com.typesafe.config.Config config)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) [Deprecated Methods](javascript:show(32);) 
	| Modifier and Type | Method | Description |
	| `org.scalatest.matchers.should.Matchers.AWord` | `[a](#a())()` |  |
	| `protected int` | `[actorInstanceId](#actorInstanceId())()` |  |
	| `org.scalactic.Explicitly.TheAfterWord` | `[after](#after())()` |  |
	| `protected void` | `[afterAll](#afterAll())()` |  |
	| `org.scalatest.matchers.should.Matchers.AnWord` | `[an](#an())()` |  |
	| `org.scalatest.matchers.dsl.BeWord` | `[be](#be())()` |  |
	| `protected void` | `[beforeAll](#beforeAll())()` |  |
	| `protected void` | `[beforeEach](#beforeEach())()` |  |
	| `protected org.scalatest.verbs.BehaveWord` | `[behave](#behave())()` |  |
	| `org.scalatest.verbs.CompileWord` | `[compile](#compile())()` |  |
	| `com.typesafe.config.Config` | `[config](#config())()` |  |
	| `org.scalatest.matchers.dsl.ContainWord` | `[contain](#contain())()` |  |
	| `org.scalactic.Explicitly.DecidedWord` | `[decided](#decided())()` |  |
	| `org.scalatest.matchers.dsl.DefinedWord` | `[defined](#defined())()` |  |
	| `org.scalactic.Explicitly.DeterminedWord` | `[determined](#determined())()` |  |
	| `org.scalatest.matchers.dsl.EmptyWord` | `[empty](#empty())()` |  |
	| `org.scalatest.matchers.dsl.EndWithWord` | `[endWith](#endWith())()` |  |
	| `org.scalatest.matchers.dsl.ExistWord` | `[exist](#exist())()` |  |
	| `[Persistence](Persistence.html "class in akka.persistence")` | `[extension](#extension())()` |  |
	| `org.scalatest.matchers.dsl.FullyMatchWord` | `[fullyMatch](#fullyMatch())()` |  |
	| `org.scalatest.matchers.dsl.HaveWord` | `[have](#have())()` |  |
	| `org.scalatest.matchers.dsl.IncludeWord` | `[include](#include())()` |  |
	| `boolean` | `[invokeBeforeAllAndAfterAllEvenIfNoTestsAreExpected](#invokeBeforeAllAndAfterAllEvenIfNoTestsAreExpected())()` |  |
	| `protected org.scalatest.wordspec.AnyWordSpecLike.ItWord` | `[it](#it())()` |  |
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
	| `protected void` | `[org$scalatest$wordspec$AnyWordSpecLike$_setter_$behave_$eq](#org$scalatest$wordspec$AnyWordSpecLike$_setter_$behave_$eq(org.scalatest.verbs.BehaveWord))​(org.scalatest.verbs.BehaveWord x$1)` |  |
	| `protected void` | `[org$scalatest$wordspec$AnyWordSpecLike$_setter_$it_$eq](#org$scalatest$wordspec$AnyWordSpecLike$_setter_$it_$eq(org.scalatest.wordspec.AnyWordSpecLike.ItWord))​(org.scalatest.wordspec.AnyWordSpecLike.ItWord x$1)` |  |
	| `protected void` | `[org$scalatest$wordspec$AnyWordSpecLike$_setter_$stackDepth_$eq](#org$scalatest$wordspec$AnyWordSpecLike$_setter_$stackDepth_$eq(int))​(int x$1)` |  |
	| `protected void` | `[org$scalatest$wordspec$AnyWordSpecLike$_setter_$styleName_$eq](#org$scalatest$wordspec$AnyWordSpecLike$_setter_$styleName_$eq(java.lang.String))​(java.lang.String x$1)` |  |
	| `protected void` | `[org$scalatest$wordspec$AnyWordSpecLike$_setter_$subjectRegistrationFunction_$eq](#org$scalatest$wordspec$AnyWordSpecLike$_setter_$subjectRegistrationFunction_$eq(org.scalatest.verbs.StringVerbBlockRegistration))​(org.scalatest.verbs.StringVerbBlockRegistration x$1)` |  |
	| `protected void` | `[org$scalatest$wordspec$AnyWordSpecLike$_setter_$subjectWithAfterWordRegistrationFunction_$eq](#org$scalatest$wordspec$AnyWordSpecLike$_setter_$subjectWithAfterWordRegistrationFunction_$eq(org.scalatest.verbs.SubjectWithAfterWordRegistration))​(org.scalatest.verbs.SubjectWithAfterWordRegistration x$1)` |  |
	| `protected void` | `[org$scalatest$wordspec$AnyWordSpecLike$_setter_$they_$eq](#org$scalatest$wordspec$AnyWordSpecLike$_setter_$they_$eq(org.scalatest.wordspec.AnyWordSpecLike.TheyWord))​(org.scalatest.wordspec.AnyWordSpecLike.TheyWord x$1)` |  |
	| `java.lang.String` | `[pid](#pid())()` |  |
	| `org.scalatest.matchers.dsl.ReadableWord` | `[readable](#readable())()` |  |
	| `org.scalatest.matchers.should.Matchers.RegexWord` | `[regex](#regex())()` |  |
	| `org.scalatest.matchers.dsl.SizeWord` | `[size](#size())()` |  |
	| `org.scalatest.matchers.dsl.SortedWord` | `[sorted](#sorted())()` |  |
	| `org.scalatest.matchers.dsl.StartWithWord` | `[startWith](#startWith())()` |  |
	| `java.lang.String` | `[styleName](#styleName())()` | Deprecated. The styleName lifecycle method has been deprecated and will be removed in a future version of ScalaTest with no replacement. |
	| `protected org.scalatest.verbs.StringVerbBlockRegistration` | `[subjectRegistrationFunction](#subjectRegistrationFunction())()` |  |
	| `protected org.scalatest.verbs.SubjectWithAfterWordRegistration` | `[subjectWithAfterWordRegistrationFunction](#subjectWithAfterWordRegistrationFunction())()` |  |
	| `<T> boolean` | `[subscribe](#subscribe(akka.actor.ActorRef,scala.reflect.ClassTag))​([ActorRef](../actor/ActorRef.html "class in akka.actor") subscriber,  scala.reflect.ClassTag<T> evidence$1)` |  |
	| `org.scalatest.compatible.Assertion` | `[succeed](#succeed())()` |  |
	| `[ActorRef](../actor/ActorRef.html "class in akka.actor")` | `[testActor](#testActor())()` | ActorRef of the test actor. |
	| `org.scalatest.matchers.should.Matchers.TheSameInstanceAsPhrase` | `[theSameInstanceAs](#theSameInstanceAs())()` |  |
	| `protected org.scalatest.wordspec.AnyWordSpecLike.TheyWord` | `[they](#they())()` |  |
	| `org.scalatest.verbs.TypeCheckWord` | `[typeCheck](#typeCheck())()` |  |
	| `org.scalatest.matchers.should.Matchers.ValueWord` | `[value](#value())()` |  |
	| `org.scalatest.matchers.dsl.WritableWord` | `[writable](#writable())()` |  |
	| `java.lang.String` | `[writerUuid](#writerUuid())()` |  |
	
	
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
		- ### Methods inherited from interface org.scalatest.matchers.should.Matchers
		
		
		`$greater, $greater$eq, $less, $less$eq, a, all, all, all, all, allElementsOf, allOf, an, atLeast, atLeast, atLeast, atLeast, atLeastOneElementOf, atLeastOneOf, atMost, atMost, atMost, atMost, atMostOneElementOf, atMostOneOf, between, between, between, convertSymbolToHavePropertyMatcherGenerator, convertToAnyShouldWrapper, convertToRegexWrapper, convertToStringShouldWrapper, definedAt, doCollected, equal, equal, every, every, every, every, exactly, exactly, exactly, exactly, inOrder, inOrderElementsOf, inOrderOnly, message, no, no, no, noElementsOf, noneOf, of, oneElementOf, oneOf, only, org$scalatest$matchers$should$Matchers$_setter_$org$scalatest$matchers$should$Matchers$$AllCollected_$eq, org$scalatest$matchers$should$Matchers$_setter_$org$scalatest$matchers$should$Matchers$$EveryCollected_$eq, org$scalatest$matchers$should$Matchers$_setter_$org$scalatest$matchers$should$Matchers$$NoCollected_$eq, org$scalatest$matchers$should$Matchers$_setter_$org$scalatest$matchers$should$Matchers$$ShouldMethodHelper_$eq, org$scalatest$matchers$should$Matchers$$AllCollected, org$scalatest$matchers$should$Matchers$$AtLeastCollected, org$scalatest$matchers$should$Matchers$$AtMostCollected, org$scalatest$matchers$should$Matchers$$BetweenCollected, org$scalatest$matchers$should$Matchers$$EveryCollected, org$scalatest$matchers$should$Matchers$$ExactlyCollected, org$scalatest$matchers$should$Matchers$$NoCollected, org$scalatest$matchers$should$Matchers$$ShouldMethodHelper, the, theSameElementsAs, theSameElementsInOrderAs, thrownBy`
		- ### Methods inherited from interface org.scalatest.matchers.dsl.MatcherWords
		
		
		`equal, noException`
		- ### Methods inherited from interface org.scalatest.verbs.MustVerb
		
		
		`convertToStringMustWrapperForVerb`
		- ### Methods inherited from interface org.scalatest.verbs.ShouldVerb
		
		
		`convertToStringShouldWrapperForVerb`
		- ### Methods inherited from interface org.scalatest.Suite
		
		
		`createCatchReporter, execute, execute$default$1, execute$default$2, execute$default$3, execute$default$4, execute$default$5, execute$default$6, execute$default$7, expectedTestCount, nestedSuites, rerunner, runNestedSuites, suiteId, suiteName`
		- ### Methods inherited from interface org.scalatest.SuiteMixin
		
		
		`expectedTestCount, nestedSuites, rerunner, runNestedSuites, runTests, suiteId, suiteName, tags, testDataFor, testNames`
		- ### Methods inherited from interface akka.testkit.[TestKitBase](../testkit/TestKitBase.html "interface in akka.testkit")
		
		
		`[assertForDuration](../testkit/TestKitBase.html#assertForDuration(scala.Function0,scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.Duration)), [assertForDuration$default$3](../testkit/TestKitBase.html#assertForDuration$default$3()), [awaitAssert](../testkit/TestKitBase.html#awaitAssert(scala.Function0,scala.concurrent.duration.Duration,scala.concurrent.duration.Duration)), [awaitAssert$default$2](../testkit/TestKitBase.html#awaitAssert$default$2()), [awaitAssert$default$3](../testkit/TestKitBase.html#awaitAssert$default$3()), [awaitCond](../testkit/TestKitBase.html#awaitCond(scala.Function0,scala.concurrent.duration.Duration,scala.concurrent.duration.Duration,java.lang.String)), [awaitCond$default$2](../testkit/TestKitBase.html#awaitCond$default$2()), [awaitCond$default$3](../testkit/TestKitBase.html#awaitCond$default$3()), [awaitCond$default$4](../testkit/TestKitBase.html#awaitCond$default$4()), [checkMissingAndUnexpected](../testkit/TestKitBase.html#checkMissingAndUnexpected(scala.collection.immutable.Seq,scala.collection.immutable.Seq,java.lang.String,java.lang.String)), [childActorOf](../testkit/TestKitBase.html#childActorOf(akka.actor.Props)), [childActorOf](../testkit/TestKitBase.html#childActorOf(akka.actor.Props,akka.actor.SupervisorStrategy)), [childActorOf](../testkit/TestKitBase.html#childActorOf(akka.actor.Props,java.lang.String)), [childActorOf](../testkit/TestKitBase.html#childActorOf(akka.actor.Props,java.lang.String,akka.actor.SupervisorStrategy)), [end_$eq](../testkit/TestKitBase.html#end_$eq(scala.concurrent.duration.Duration)), [expectMsg](../testkit/TestKitBase.html#expectMsg(scala.concurrent.duration.FiniteDuration,java.lang.String,T)), [expectMsg](../testkit/TestKitBase.html#expectMsg(scala.concurrent.duration.FiniteDuration,T)), [expectMsg](../testkit/TestKitBase.html#expectMsg(T)), [expectMsg_internal](../testkit/TestKitBase.html#expectMsg_internal(scala.concurrent.duration.Duration,T,scala.Option)), [expectMsg_internal$default$3](../testkit/TestKitBase.html#expectMsg_internal$default$3()), [expectMsgAllClassOf](../testkit/TestKitBase.html#expectMsgAllClassOf(scala.collection.immutable.Seq)), [expectMsgAllClassOf](../testkit/TestKitBase.html#expectMsgAllClassOf(scala.concurrent.duration.FiniteDuration,scala.collection.immutable.Seq)), [expectMsgAllConformingOf](../testkit/TestKitBase.html#expectMsgAllConformingOf(scala.collection.immutable.Seq)), [expectMsgAllConformingOf](../testkit/TestKitBase.html#expectMsgAllConformingOf(scala.concurrent.duration.FiniteDuration,scala.collection.immutable.Seq)), [expectMsgAllOf](../testkit/TestKitBase.html#expectMsgAllOf(scala.collection.immutable.Seq)), [expectMsgAllOf](../testkit/TestKitBase.html#expectMsgAllOf(scala.concurrent.duration.FiniteDuration,scala.collection.immutable.Seq)), [expectMsgAllOf_internal](../testkit/TestKitBase.html#expectMsgAllOf_internal(scala.concurrent.duration.FiniteDuration,scala.collection.immutable.Seq)), [expectMsgAnyClassOf](../testkit/TestKitBase.html#expectMsgAnyClassOf(scala.collection.immutable.Seq)), [expectMsgAnyClassOf](../testkit/TestKitBase.html#expectMsgAnyClassOf(scala.concurrent.duration.FiniteDuration,scala.collection.immutable.Seq)), [expectMsgAnyClassOf_internal](../testkit/TestKitBase.html#expectMsgAnyClassOf_internal(scala.concurrent.duration.FiniteDuration,scala.collection.immutable.Seq)), [expectMsgAnyOf](../testkit/TestKitBase.html#expectMsgAnyOf(scala.collection.immutable.Seq)), [expectMsgAnyOf](../testkit/TestKitBase.html#expectMsgAnyOf(scala.concurrent.duration.FiniteDuration,scala.collection.immutable.Seq)), [expectMsgAnyOf_internal](../testkit/TestKitBase.html#expectMsgAnyOf_internal(scala.concurrent.duration.FiniteDuration,scala.collection.immutable.Seq)), [expectMsgClass](../testkit/TestKitBase.html#expectMsgClass(java.lang.Class)), [expectMsgClass](../testkit/TestKitBase.html#expectMsgClass(scala.concurrent.duration.FiniteDuration,java.lang.Class)), [expectMsgClass_internal](../testkit/TestKitBase.html#expectMsgClass_internal(scala.concurrent.duration.FiniteDuration,java.lang.Class)), [expectMsgPF](../testkit/TestKitBase.html#expectMsgPF(scala.concurrent.duration.Duration,java.lang.String,scala.PartialFunction)), [expectMsgPF$default$1](../testkit/TestKitBase.html#expectMsgPF$default$1()), [expectMsgPF$default$2](../testkit/TestKitBase.html#expectMsgPF$default$2()), [expectMsgType](../testkit/TestKitBase.html#expectMsgType(scala.concurrent.duration.FiniteDuration,scala.reflect.ClassTag)), [expectMsgType](../testkit/TestKitBase.html#expectMsgType(scala.reflect.ClassTag)), [expectNoMessage](../testkit/TestKitBase.html#expectNoMessage()), [expectNoMessage](../testkit/TestKitBase.html#expectNoMessage(scala.concurrent.duration.FiniteDuration)), [expectNoMsg_internal](../testkit/TestKitBase.html#expectNoMsg_internal(scala.concurrent.duration.FiniteDuration)), [expectTerminated](../testkit/TestKitBase.html#expectTerminated(akka.actor.ActorRef,scala.concurrent.duration.Duration)), [expectTerminated$default$2](../testkit/TestKitBase.html#expectTerminated$default$2()), [fishForMessage](../testkit/TestKitBase.html#fishForMessage(scala.concurrent.duration.Duration,java.lang.String,scala.PartialFunction)), [fishForMessage$default$1](../testkit/TestKitBase.html#fishForMessage$default$1()), [fishForMessage$default$2](../testkit/TestKitBase.html#fishForMessage$default$2()), [fishForSpecificMessage](../testkit/TestKitBase.html#fishForSpecificMessage(scala.concurrent.duration.Duration,java.lang.String,scala.PartialFunction)), [fishForSpecificMessage$default$1](../testkit/TestKitBase.html#fishForSpecificMessage$default$1()), [fishForSpecificMessage$default$2](../testkit/TestKitBase.html#fishForSpecificMessage$default$2()), [format](../testkit/TestKitBase.html#format(java.util.concurrent.TimeUnit,scala.concurrent.duration.Duration)), [ignoreMsg](../testkit/TestKitBase.html#ignoreMsg(scala.PartialFunction)), [ignoreNoMsg](../testkit/TestKitBase.html#ignoreNoMsg()), [internalExpectMsgAllClassOf](../testkit/TestKitBase.html#internalExpectMsgAllClassOf(scala.concurrent.duration.FiniteDuration,scala.collection.immutable.Seq)), [internalExpectMsgAllConformingOf](../testkit/TestKitBase.html#internalExpectMsgAllConformingOf(scala.concurrent.duration.FiniteDuration,scala.collection.immutable.Seq)), [lastSender](../testkit/TestKitBase.html#lastSender()), [lastWasNoMsg_$eq](../testkit/TestKitBase.html#lastWasNoMsg_$eq(boolean)), [msgAvailable](../testkit/TestKitBase.html#msgAvailable()), [now](../testkit/TestKitBase.html#now()), [receiveN](../testkit/TestKitBase.html#receiveN(int)), [receiveN](../testkit/TestKitBase.html#receiveN(int,scala.concurrent.duration.FiniteDuration)), [receiveN_internal](../testkit/TestKitBase.html#receiveN_internal(int,scala.concurrent.duration.Duration)), [receiveOne](../testkit/TestKitBase.html#receiveOne(scala.concurrent.duration.Duration)), [receiveWhile](../testkit/TestKitBase.html#receiveWhile(scala.concurrent.duration.Duration,scala.concurrent.duration.Duration,int,scala.PartialFunction)), [receiveWhile$default$1](../testkit/TestKitBase.html#receiveWhile$default$1()), [receiveWhile$default$2](../testkit/TestKitBase.html#receiveWhile$default$2()), [receiveWhile$default$3](../testkit/TestKitBase.html#receiveWhile$default$3()), [remaining](../testkit/TestKitBase.html#remaining()), [remainingOr](../testkit/TestKitBase.html#remainingOr(scala.concurrent.duration.FiniteDuration)), [remainingOrDefault](../testkit/TestKitBase.html#remainingOrDefault()), [remainingOrDilated](../testkit/TestKitBase.html#remainingOrDilated(scala.concurrent.duration.Duration)), [setAutoPilot](../testkit/TestKitBase.html#setAutoPilot(akka.testkit.TestActor.AutoPilot)), [shutdown](../testkit/TestKitBase.html#shutdown(akka.actor.ActorSystem,scala.concurrent.duration.Duration,boolean)), [shutdown$default$1](../testkit/TestKitBase.html#shutdown$default$1()), [shutdown$default$2](../testkit/TestKitBase.html#shutdown$default$2()), [shutdown$default$3](../testkit/TestKitBase.html#shutdown$default$3()), [system](../testkit/TestKitBase.html#system()), [testActorName](../testkit/TestKitBase.html#testActorName()), [testKitSettings](../testkit/TestKitBase.html#testKitSettings()), [unwatch](../testkit/TestKitBase.html#unwatch(akka.actor.ActorRef)), [watch](../testkit/TestKitBase.html#watch(akka.actor.ActorRef)), [within](../testkit/TestKitBase.html#within(scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration,scala.Function0)), [within](../testkit/TestKitBase.html#within(scala.concurrent.duration.FiniteDuration,scala.Function0))`
		- ### Methods inherited from interface org.scalatest.TestSuite
		
		
		`withFixture`
		- ### Methods inherited from interface org.scalactic.Tolerance
		
		
		`convertNumericToPlusOrMinusWrapper`
		- ### Methods inherited from interface org.scalactic.TripleEquals
		
		
		`conversionCheckedConstraint, convertEquivalenceToAToBConstraint, convertEquivalenceToAToBConversionConstraint, convertEquivalenceToBToAConstraint, convertEquivalenceToBToAConversionConstraint, convertToCheckingEqualizer, convertToEqualizer, lowPriorityConversionCheckedConstraint, lowPriorityTypeCheckedConstraint, typeCheckedConstraint, unconstrainedEquality`
		- ### Methods inherited from interface org.scalactic.TripleEqualsSupport
		
		
		`$bang$eq$eq, $bang$eq$eq, $bang$eq$eq, $eq$eq$eq, $eq$eq$eq, $eq$eq$eq, defaultEquality`

- - ### Constructor Detail
	
	
	
		- #### PluginSpec
		
		
		
		```
		public PluginSpec​(com.typesafe.config.Config config)
		```

	- ### Method Detail
	
	
	
		- #### NoArgTest
		
		
		
		```
		public org.scalatest.TestSuite.NoArgTest$ NoArgTest()
		```
		
		
		Specified by:
		`NoArgTest` in interface `org.scalatest.TestSuite`
		- #### a
		
		
		
		```
		public org.scalatest.matchers.should.Matchers.AWord a()
		```
		
		
		Specified by:
		`a` in interface `org.scalatest.matchers.should.Matchers`
		- #### actorInstanceId
		
		
		
		```
		protected int actorInstanceId()
		```
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
		
		
		Specified by:
		`afterAll` in interface `org.scalatest.BeforeAndAfterAll`
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
		- #### beforeAll
		
		
		
		```
		protected void beforeAll()
		```
		
		
		Specified by:
		`beforeAll` in interface `org.scalatest.BeforeAndAfterAll`
		- #### beforeEach
		
		
		
		```
		protected void beforeEach()
		```
		
		
		Specified by:
		`beforeEach` in interface `org.scalatest.BeforeAndAfterEach`
		- #### behave
		
		
		
		```
		protected org.scalatest.verbs.BehaveWord behave()
		```
		
		
		Specified by:
		`behave` in interface `org.scalatest.wordspec.AnyWordSpecLike`
		- #### compile
		
		
		
		```
		public org.scalatest.verbs.CompileWord compile()
		```
		
		
		Specified by:
		`compile` in interface `org.scalatest.matchers.dsl.MatcherWords`
		- #### config
		
		
		
		```
		public com.typesafe.config.Config config()
		```
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
		- #### extension
		
		
		
		```
		public [Persistence](Persistence.html "class in akka.persistence") extension()
		```
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
		- #### it
		
		
		
		```
		protected org.scalatest.wordspec.AnyWordSpecLike.ItWord it()
		```
		
		
		Specified by:
		`it` in interface `org.scalatest.wordspec.AnyWordSpecLike`
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
		- #### org$scalatest$wordspec$AnyWordSpecLike$\_setter\_$behave\_$eq
		
		
		
		```
		protected void org$scalatest$wordspec$AnyWordSpecLike$_setter_$behave_$eq​(org.scalatest.verbs.BehaveWord x$1)
		```
		
		
		Specified by:
		`org$scalatest$wordspec$AnyWordSpecLike$_setter_$behave_$eq` in interface `org.scalatest.wordspec.AnyWordSpecLike`
		- #### org$scalatest$wordspec$AnyWordSpecLike$\_setter\_$it\_$eq
		
		
		
		```
		protected void org$scalatest$wordspec$AnyWordSpecLike$_setter_$it_$eq​(org.scalatest.wordspec.AnyWordSpecLike.ItWord x$1)
		```
		
		
		Specified by:
		`org$scalatest$wordspec$AnyWordSpecLike$_setter_$it_$eq` in interface `org.scalatest.wordspec.AnyWordSpecLike`
		- #### org$scalatest$wordspec$AnyWordSpecLike$\_setter\_$stackDepth\_$eq
		
		
		
		```
		protected void org$scalatest$wordspec$AnyWordSpecLike$_setter_$stackDepth_$eq​(int x$1)
		```
		
		
		Specified by:
		`org$scalatest$wordspec$AnyWordSpecLike$_setter_$stackDepth_$eq` in interface `org.scalatest.wordspec.AnyWordSpecLike`
		- #### org$scalatest$wordspec$AnyWordSpecLike$\_setter\_$styleName\_$eq
		
		
		
		```
		protected final void org$scalatest$wordspec$AnyWordSpecLike$_setter_$styleName_$eq​(java.lang.String x$1)
		```
		
		
		Specified by:
		`org$scalatest$wordspec$AnyWordSpecLike$_setter_$styleName_$eq` in interface `org.scalatest.wordspec.AnyWordSpecLike`
		- #### org$scalatest$wordspec$AnyWordSpecLike$\_setter\_$subjectRegistrationFunction\_$eq
		
		
		
		```
		protected void org$scalatest$wordspec$AnyWordSpecLike$_setter_$subjectRegistrationFunction_$eq​(org.scalatest.verbs.StringVerbBlockRegistration x$1)
		```
		
		
		Specified by:
		`org$scalatest$wordspec$AnyWordSpecLike$_setter_$subjectRegistrationFunction_$eq` in interface `org.scalatest.wordspec.AnyWordSpecLike`
		- #### org$scalatest$wordspec$AnyWordSpecLike$\_setter\_$subjectWithAfterWordRegistrationFunction\_$eq
		
		
		
		```
		protected void org$scalatest$wordspec$AnyWordSpecLike$_setter_$subjectWithAfterWordRegistrationFunction_$eq​(org.scalatest.verbs.SubjectWithAfterWordRegistration x$1)
		```
		
		
		Specified by:
		`org$scalatest$wordspec$AnyWordSpecLike$_setter_$subjectWithAfterWordRegistrationFunction_$eq` in interface `org.scalatest.wordspec.AnyWordSpecLike`
		- #### org$scalatest$wordspec$AnyWordSpecLike$\_setter\_$they\_$eq
		
		
		
		```
		protected void org$scalatest$wordspec$AnyWordSpecLike$_setter_$they_$eq​(org.scalatest.wordspec.AnyWordSpecLike.TheyWord x$1)
		```
		
		
		Specified by:
		`org$scalatest$wordspec$AnyWordSpecLike$_setter_$they_$eq` in interface `org.scalatest.wordspec.AnyWordSpecLike`
		- #### pid
		
		
		
		```
		public java.lang.String pid()
		```
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
		public final java.lang.String styleName()
		```
		
		Deprecated.
		The styleName lifecycle method has been deprecated and will be removed in a future version of ScalaTest with no replacement. Since 3\.1\.0\.
		
		
		Specified by:
		`styleName` in interface `org.scalatest.wordspec.AnyWordSpecLike`
		Specified by:
		`styleName` in interface `org.scalatest.Suite`
		Specified by:
		`styleName` in interface `org.scalatest.SuiteMixin`
		- #### subjectRegistrationFunction
		
		
		
		```
		protected org.scalatest.verbs.StringVerbBlockRegistration subjectRegistrationFunction()
		```
		
		
		Specified by:
		`subjectRegistrationFunction` in interface `org.scalatest.wordspec.AnyWordSpecLike`
		- #### subjectWithAfterWordRegistrationFunction
		
		
		
		```
		protected org.scalatest.verbs.SubjectWithAfterWordRegistration subjectWithAfterWordRegistrationFunction()
		```
		
		
		Specified by:
		`subjectWithAfterWordRegistrationFunction` in interface `org.scalatest.wordspec.AnyWordSpecLike`
		- #### subscribe
		
		
		
		```
		public <T> boolean subscribe​([ActorRef](../actor/ActorRef.html "class in akka.actor") subscriber,
		                             scala.reflect.ClassTag<T> evidence$1)
		```
		- #### succeed
		
		
		
		```
		public final org.scalatest.compatible.Assertion succeed()
		```
		
		
		Specified by:
		`succeed` in interface `org.scalatest.Assertions`
		- #### testActor
		
		
		
		```
		public [ActorRef](../actor/ActorRef.html "class in akka.actor") testActor()
		```
		
		Description copied from interface: `[TestKitBase](../testkit/TestKitBase.html#testActor())`
		ActorRef of the test actor. Access is provided to enable e.g.
		 registration as message target.
		
		Specified by:
		`[testActor](../testkit/TestKitBase.html#testActor())` in interface `[TestKitBase](../testkit/TestKitBase.html "interface in akka.testkit")`
		- #### theSameInstanceAs
		
		
		
		```
		public org.scalatest.matchers.should.Matchers.TheSameInstanceAsPhrase theSameInstanceAs()
		```
		
		
		Specified by:
		`theSameInstanceAs` in interface `org.scalatest.matchers.should.Matchers`
		- #### they
		
		
		
		```
		protected org.scalatest.wordspec.AnyWordSpecLike.TheyWord they()
		```
		
		
		Specified by:
		`they` in interface `org.scalatest.wordspec.AnyWordSpecLike`
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
		- #### writerUuid
		
		
		
		```
		public java.lang.String writerUuid()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/ActorRef.html
- https://doc.akka.io/japi/akka/current/akka/persistence/Persistence.html
- https://doc.akka.io/japi/akka/current/akka/persistence/journal/JournalSpec.html
- https://doc.akka.io/japi/akka/current/akka/persistence/package-summary.html
- https://doc.akka.io/japi/akka/current/akka/persistence/snapshot/SnapshotStoreSpec.html
- https://doc.akka.io/japi/akka/current/akka/testkit/TestKitBase.html
- https://doc.akka.io/japi/akka/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/persistence/PluginSpec.html](https://doc.akka.io/japi/akka/current/akka/persistence/PluginSpec.html)*