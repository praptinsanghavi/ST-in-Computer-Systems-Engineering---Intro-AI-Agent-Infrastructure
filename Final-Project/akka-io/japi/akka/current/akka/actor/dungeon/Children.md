---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:48:33Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/actor/dungeon/Children.html
title: Children
---

# Children

## Content

Package [akka.actor.dungeon](package-summary.html)
## Interface Children

- ---

```
public interface Children
```

INTERNAL API

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `void` | `[_childrenRefsDoNotCallMeDirectly_$eq](#_childrenRefsDoNotCallMeDirectly_$eq(akka.actor.dungeon.ChildrenContainer))​([ChildrenContainer](ChildrenContainer.html "interface in akka.actor.dungeon") x$1)` |  |
	| `void` | `[_functionRefsDoNotCallMeDirectly_$eq](#_functionRefsDoNotCallMeDirectly_$eq(scala.collection.immutable.Map))​(scala.collection.immutable.Map<java.lang.String,​akka.actor.FunctionRef> x$1)` |  |
	| `void` | `[_nextNameDoNotCallMeDirectly_$eq](#_nextNameDoNotCallMeDirectly_$eq(long))​(long x$1)` |  |
	| `long` | `[_preventPrivateUnusedErasure](#_preventPrivateUnusedErasure())()` |  |
	| `[ActorRef](../ActorRef.html "class in akka.actor")` | `[actorOf](#actorOf(akka.actor.Props))​([Props](../Props.html "class in akka.actor") props)` |  |
	| `[ActorRef](../ActorRef.html "class in akka.actor")` | `[actorOf](#actorOf(akka.actor.Props,java.lang.String))​([Props](../Props.html "class in akka.actor") props,  java.lang.String name)` |  |
	| `akka.actor.FunctionRef` | `[addFunctionRef](#addFunctionRef(scala.Function2,java.lang.String))​(scala.Function2<[ActorRef](../ActorRef.html "class in akka.actor"),​java.lang.Object,​scala.runtime.BoxedUnit> f,  java.lang.String name)` |  |
	| `java.lang.String` | `[addFunctionRef$default$2](#addFunctionRef$default$2())()` |  |
	| `[ActorRef](../ActorRef.html "class in akka.actor")` | `[attachChild](#attachChild(akka.actor.Props,boolean))​([Props](../Props.html "class in akka.actor") props,  boolean systemService)` |  |
	| `[ActorRef](../ActorRef.html "class in akka.actor")` | `[attachChild](#attachChild(akka.actor.Props,java.lang.String,boolean))​([Props](../Props.html "class in akka.actor") props,  java.lang.String name,  boolean systemService)` |  |
	| `java.lang.String` | `[checkName](#checkName(java.lang.String))​(java.lang.String name)` |  |
	| `scala.Option<[ActorRef](../ActorRef.html "class in akka.actor")>` | `[child](#child(java.lang.String))​(java.lang.String name)` |  |
	| `scala.collection.immutable.Iterable<[ActorRef](../ActorRef.html "class in akka.actor")>` | `[children](#children())()` |  |
	| `[ChildrenContainer](ChildrenContainer.html "interface in akka.actor.dungeon")` | `[childrenRefs](#childrenRefs())()` |  |
	| `java.util.Optional<[ActorRef](../ActorRef.html "class in akka.actor")>` | `[findChild](#findChild(java.lang.String))​(java.lang.String name)` |  |
	| `scala.collection.immutable.Map<java.lang.String,​akka.actor.FunctionRef>` | `[functionRefs](#functionRefs())()` |  |
	| `scala.collection.immutable.Iterable<[ChildRestartStats](../ChildRestartStats.html "class in akka.actor")>` | `[getAllChildStats](#getAllChildStats())()` |  |
	| `[ActorRef](../ActorRef.html "class in akka.actor")` | `[getChild](#getChild(java.lang.String))​(java.lang.String name)` |  |
	| `scala.Option<[ChildStats](../ChildStats.html "interface in akka.actor")>` | `[getChildByName](#getChildByName(java.lang.String))​(java.lang.String name)` |  |
	| `scala.Option<[ChildRestartStats](../ChildRestartStats.html "class in akka.actor")>` | `[getChildByRef](#getChildByRef(akka.actor.ActorRef))​([ActorRef](../ActorRef.html "class in akka.actor") ref)` |  |
	| `java.lang.Iterable<[ActorRef](../ActorRef.html "class in akka.actor")>` | `[getChildren](#getChildren())()` |  |
	| `akka.actor.InternalActorRef` | `[getFunctionRefOrNobody](#getFunctionRefOrNobody(java.lang.String,int))​(java.lang.String name,  int uid)` |  |
	| `int` | `[getFunctionRefOrNobody$default$2](#getFunctionRefOrNobody$default$2())()` |  |
	| `akka.actor.InternalActorRef` | `[getSingleChild](#getSingleChild(java.lang.String))​(java.lang.String name)` |  |
	| `scala.Option<[ChildRestartStats](../ChildRestartStats.html "class in akka.actor")>` | `[initChild](#initChild(akka.actor.ActorRef))​([ActorRef](../ActorRef.html "class in akka.actor") ref)` |  |
	| `boolean` | `[isNormal](#isNormal())()` |  |
	| `boolean` | `[isTerminating](#isTerminating())()` |  |
	| `[ActorRef](../ActorRef.html "class in akka.actor")` | `[makeChild](#makeChild(akka.actor.ActorCell,akka.actor.Props,java.lang.String,boolean,boolean))​(akka.actor.ActorCell cell,  [Props](../Props.html "class in akka.actor") props,  java.lang.String name,  boolean async,  boolean systemService)` |  |
	| `java.lang.String` | `[randomName](#randomName())()` |  |
	| `java.lang.String` | `[randomName](#randomName(java.lang.StringBuilder))​(java.lang.StringBuilder sb)` |  |
	| `scala.Option<[ChildrenContainer.SuspendReason](ChildrenContainer.SuspendReason.html "interface in akka.actor.dungeon")>` | `[removeChildAndGetStateChange](#removeChildAndGetStateChange(akka.actor.ActorRef))​([ActorRef](../ActorRef.html "class in akka.actor") child)` |  |
	| `boolean` | `[removeFunctionRef](#removeFunctionRef(akka.actor.FunctionRef))​(akka.actor.FunctionRef ref)` |  |
	| `boolean` | `[reserveChild](#reserveChild(java.lang.String))​(java.lang.String name)` |  |
	| `void` | `[resumeChildren](#resumeChildren(java.lang.Throwable,akka.actor.ActorRef))​(java.lang.Throwable causedByFailure,  [ActorRef](../ActorRef.html "class in akka.actor") perp)` |  |
	| `boolean` | `[setChildrenTerminationReason](#setChildrenTerminationReason(akka.actor.dungeon.ChildrenContainer.SuspendReason))​([ChildrenContainer.SuspendReason](ChildrenContainer.SuspendReason.html "interface in akka.actor.dungeon") reason)` |  |
	| `void` | `[setTerminated](#setTerminated())()` |  |
	| `void` | `[stop](#stop(akka.actor.ActorRef))​([ActorRef](../ActorRef.html "class in akka.actor") actor)` |  |
	| `void` | `[stopFunctionRefs](#stopFunctionRefs())()` |  |
	| `void` | `[suspendChildren](#suspendChildren(scala.collection.immutable.Set))​(scala.collection.immutable.Set<[ActorRef](../ActorRef.html "class in akka.actor")> exceptFor)` |  |
	| `scala.collection.immutable.Set<[ActorRef](../ActorRef.html "class in akka.actor")>` | `[suspendChildren$default$1](#suspendChildren$default$1())()` |  |
	| `boolean` | `[swapChildrenRefs](#swapChildrenRefs(akka.actor.dungeon.ChildrenContainer,akka.actor.dungeon.ChildrenContainer))​([ChildrenContainer](ChildrenContainer.html "interface in akka.actor.dungeon") oldChildren,  [ChildrenContainer](ChildrenContainer.html "interface in akka.actor.dungeon") newChildren)` |  |
	| `boolean` | `[unreserveChild](#unreserveChild(java.lang.String))​(java.lang.String name)` |  |
	| `[ChildrenContainer.SuspendReason](ChildrenContainer.SuspendReason.html "interface in akka.actor.dungeon")` | `[waitingForChildrenOrNull](#waitingForChildrenOrNull())()` |  |

- - ### Method Detail
	
	
	
		- #### \_childrenRefsDoNotCallMeDirectly\_$eq
		
		
		
		```
		void _childrenRefsDoNotCallMeDirectly_$eq​([ChildrenContainer](ChildrenContainer.html "interface in akka.actor.dungeon") x$1)
		```
		- #### childrenRefs
		
		
		
		```
		[ChildrenContainer](ChildrenContainer.html "interface in akka.actor.dungeon") childrenRefs()
		```
		- #### children
		
		
		
		```
		scala.collection.immutable.Iterable<[ActorRef](../ActorRef.html "class in akka.actor")> children()
		```
		- #### getChildren
		
		
		
		```
		java.lang.Iterable<[ActorRef](../ActorRef.html "class in akka.actor")> getChildren()
		```
		- #### child
		
		
		
		```
		scala.Option<[ActorRef](../ActorRef.html "class in akka.actor")> child​(java.lang.String name)
		```
		- #### getChild
		
		
		
		```
		[ActorRef](../ActorRef.html "class in akka.actor") getChild​(java.lang.String name)
		```
		- #### findChild
		
		
		
		```
		java.util.Optional<[ActorRef](../ActorRef.html "class in akka.actor")> findChild​(java.lang.String name)
		```
		- #### actorOf
		
		
		
		```
		[ActorRef](../ActorRef.html "class in akka.actor") actorOf​([Props](../Props.html "class in akka.actor") props)
		```
		- #### actorOf
		
		
		
		```
		[ActorRef](../ActorRef.html "class in akka.actor") actorOf​([Props](../Props.html "class in akka.actor") props,
		                 java.lang.String name)
		```
		- #### attachChild
		
		
		
		```
		[ActorRef](../ActorRef.html "class in akka.actor") attachChild​([Props](../Props.html "class in akka.actor") props,
		                     boolean systemService)
		```
		- #### attachChild
		
		
		
		```
		[ActorRef](../ActorRef.html "class in akka.actor") attachChild​([Props](../Props.html "class in akka.actor") props,
		                     java.lang.String name,
		                     boolean systemService)
		```
		- #### \_functionRefsDoNotCallMeDirectly\_$eq
		
		
		
		```
		void _functionRefsDoNotCallMeDirectly_$eq​(scala.collection.immutable.Map<java.lang.String,​akka.actor.FunctionRef> x$1)
		```
		- #### functionRefs
		
		
		
		```
		scala.collection.immutable.Map<java.lang.String,​akka.actor.FunctionRef> functionRefs()
		```
		- #### getFunctionRefOrNobody
		
		
		
		```
		akka.actor.InternalActorRef getFunctionRefOrNobody​(java.lang.String name,
		                                                   int uid)
		```
		- #### getFunctionRefOrNobody$default$2
		
		
		
		```
		int getFunctionRefOrNobody$default$2()
		```
		- #### addFunctionRef
		
		
		
		```
		akka.actor.FunctionRef addFunctionRef​(scala.Function2<[ActorRef](../ActorRef.html "class in akka.actor"),​java.lang.Object,​scala.runtime.BoxedUnit> f,
		                                      java.lang.String name)
		```
		- #### addFunctionRef$default$2
		
		
		
		```
		java.lang.String addFunctionRef$default$2()
		```
		- #### removeFunctionRef
		
		
		
		```
		boolean removeFunctionRef​(akka.actor.FunctionRef ref)
		```
		- #### stopFunctionRefs
		
		
		
		```
		void stopFunctionRefs()
		```
		- #### \_nextNameDoNotCallMeDirectly\_$eq
		
		
		
		```
		void _nextNameDoNotCallMeDirectly_$eq​(long x$1)
		```
		- #### randomName
		
		
		
		```
		java.lang.String randomName​(java.lang.StringBuilder sb)
		```
		- #### randomName
		
		
		
		```
		java.lang.String randomName()
		```
		- #### stop
		
		
		
		```
		void stop​([ActorRef](../ActorRef.html "class in akka.actor") actor)
		```
		- #### \_preventPrivateUnusedErasure
		
		
		
		```
		long _preventPrivateUnusedErasure()
		```
		- #### swapChildrenRefs
		
		
		
		```
		boolean swapChildrenRefs​([ChildrenContainer](ChildrenContainer.html "interface in akka.actor.dungeon") oldChildren,
		                         [ChildrenContainer](ChildrenContainer.html "interface in akka.actor.dungeon") newChildren)
		```
		- #### reserveChild
		
		
		
		```
		boolean reserveChild​(java.lang.String name)
		```
		- #### unreserveChild
		
		
		
		```
		boolean unreserveChild​(java.lang.String name)
		```
		- #### initChild
		
		
		
		```
		scala.Option<[ChildRestartStats](../ChildRestartStats.html "class in akka.actor")> initChild​([ActorRef](../ActorRef.html "class in akka.actor") ref)
		```
		- #### setChildrenTerminationReason
		
		
		
		```
		boolean setChildrenTerminationReason​([ChildrenContainer.SuspendReason](ChildrenContainer.SuspendReason.html "interface in akka.actor.dungeon") reason)
		```
		- #### setTerminated
		
		
		
		```
		void setTerminated()
		```
		- #### isNormal
		
		
		
		```
		boolean isNormal()
		```
		- #### isTerminating
		
		
		
		```
		boolean isTerminating()
		```
		- #### waitingForChildrenOrNull
		
		
		
		```
		[ChildrenContainer.SuspendReason](ChildrenContainer.SuspendReason.html "interface in akka.actor.dungeon") waitingForChildrenOrNull()
		```
		- #### suspendChildren
		
		
		
		```
		void suspendChildren​(scala.collection.immutable.Set<[ActorRef](../ActorRef.html "class in akka.actor")> exceptFor)
		```
		- #### suspendChildren$default$1
		
		
		
		```
		scala.collection.immutable.Set<[ActorRef](../ActorRef.html "class in akka.actor")> suspendChildren$default$1()
		```
		- #### resumeChildren
		
		
		
		```
		void resumeChildren​(java.lang.Throwable causedByFailure,
		                    [ActorRef](../ActorRef.html "class in akka.actor") perp)
		```
		- #### getChildByName
		
		
		
		```
		scala.Option<[ChildStats](../ChildStats.html "interface in akka.actor")> getChildByName​(java.lang.String name)
		```
		- #### getChildByRef
		
		
		
		```
		scala.Option<[ChildRestartStats](../ChildRestartStats.html "class in akka.actor")> getChildByRef​([ActorRef](../ActorRef.html "class in akka.actor") ref)
		```
		- #### getAllChildStats
		
		
		
		```
		scala.collection.immutable.Iterable<[ChildRestartStats](../ChildRestartStats.html "class in akka.actor")> getAllChildStats()
		```
		- #### getSingleChild
		
		
		
		```
		akka.actor.InternalActorRef getSingleChild​(java.lang.String name)
		```
		- #### removeChildAndGetStateChange
		
		
		
		```
		scala.Option<[ChildrenContainer.SuspendReason](ChildrenContainer.SuspendReason.html "interface in akka.actor.dungeon")> removeChildAndGetStateChange​([ActorRef](../ActorRef.html "class in akka.actor") child)
		```
		- #### checkName
		
		
		
		```
		java.lang.String checkName​(java.lang.String name)
		```
		- #### makeChild
		
		
		
		```
		[ActorRef](../ActorRef.html "class in akka.actor") makeChild​(akka.actor.ActorCell cell,
		                   [Props](../Props.html "class in akka.actor") props,
		                   java.lang.String name,
		                   boolean async,
		                   boolean systemService)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/ActorRef.html
- https://doc.akka.io/japi/akka/current/akka/actor/ChildRestartStats.html
- https://doc.akka.io/japi/akka/current/akka/actor/ChildStats.html
- https://doc.akka.io/japi/akka/current/akka/actor/Props.html
- https://doc.akka.io/japi/akka/current/akka/actor/dungeon/ChildrenContainer.SuspendReason.html
- https://doc.akka.io/japi/akka/current/akka/actor/dungeon/ChildrenContainer.html
- https://doc.akka.io/japi/akka/current/akka/actor/dungeon/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/actor/dungeon/Children.html](https://doc.akka.io/japi/akka/current/akka/actor/dungeon/Children.html)*