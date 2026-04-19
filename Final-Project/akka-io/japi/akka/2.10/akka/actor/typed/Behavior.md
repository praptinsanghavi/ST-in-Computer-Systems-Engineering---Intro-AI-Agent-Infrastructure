---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:41:28Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/2.10/akka/actor/typed/Behavior.BehaviorDecorators.html
title: Behavior.BehaviorDecorators
---

# Behavior.BehaviorDecorators

## Content

Package [akka.actor.typed](package-summary.html)
## Class Behavior.BehaviorDecorators\<Inner\>

- java.lang.Object
- - scala.AnyVal
	- - akka.actor.typed.Behavior.BehaviorDecorators\<Inner\>

- Enclosing class:
[Behavior](Behavior.html "class in akka.actor.typed")\<[T](Behavior.html "type parameter in Behavior")\>

---

```
public static final class Behavior.BehaviorDecorators<Inner>
extends scala.AnyVal
```

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[BehaviorDecorators](#%3Cinit%3E(akka.actor.typed.Behavior))​([Behavior](Behavior.html "class in akka.actor.typed")<[Inner](Behavior.BehaviorDecorators.html "type parameter in Behavior.BehaviorDecorators")> behavior)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[Behavior](Behavior.html "class in akka.actor.typed")<[Inner](Behavior.BehaviorDecorators.html "type parameter in Behavior.BehaviorDecorators")>` | `[behavior](#behavior())()` |  |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `<Outer> [Behavior](Behavior.html "class in akka.actor.typed")<Outer>` | `[transformMessages](#transformMessages(scala.PartialFunction,scala.reflect.ClassTag))​(scala.PartialFunction<Outer,​[Inner](Behavior.BehaviorDecorators.html "type parameter in Behavior.BehaviorDecorators")> matcher,  scala.reflect.ClassTag<Outer> evidence$1)` | Transform the incoming messages by placing a funnel in front of the wrapped `Behavior`: the supplied  PartialFunction decides which message to pull in (those that it is defined  at) and may transform the incoming message to place them into the wrapped  Behavior\&rsquo;s type hierarchy. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### BehaviorDecorators
		
		
		
		```
		public BehaviorDecorators​([Behavior](Behavior.html "class in akka.actor.typed")<[Inner](Behavior.BehaviorDecorators.html "type parameter in Behavior.BehaviorDecorators")> behavior)
		```

	- ### Method Detail
	
	
	
		- #### behavior
		
		
		
		```
		public [Behavior](Behavior.html "class in akka.actor.typed")<[Inner](Behavior.BehaviorDecorators.html "type parameter in Behavior.BehaviorDecorators")> behavior()
		```
		- #### transformMessages
		
		
		
		```
		public <Outer> [Behavior](Behavior.html "class in akka.actor.typed")<Outer> transformMessages​(scala.PartialFunction<Outer,​[Inner](Behavior.BehaviorDecorators.html "type parameter in Behavior.BehaviorDecorators")> matcher,
		                                                 scala.reflect.ClassTag<Outer> evidence$1)
		```
		
		Transform the incoming messages by placing a funnel in front of the wrapped `Behavior`: the supplied
		 PartialFunction decides which message to pull in (those that it is defined
		 at) and may transform the incoming message to place them into the wrapped
		 Behavior\&rsquo;s type hierarchy. Signals are not transformed.
		 
		 Example:
		 
		
		
		```
		
		   val b: Behavior[Number] =
		     Behaviors
		       .receive[String] { (ctx, msg) =>
		         println(msg)
		         Behaviors.same
		       }
		       .transformMessages[Number] {
		         case b: BigDecimal => s"BigDecimal(&dollar;b)"
		         case i: BigInt     => s"BigInteger(&dollar;i)"
		         // all other kinds of Number will be `unhandled`
		       }
		 
		```
		
		
		 The `ClassTag` for `Outer` ensures that only messages of this class or a subclass thereof will be
		 intercepted. Other message types (e.g. a private protocol) will bypass
		 the interceptor and be continue to the inner behavior untouched.
		- #### hashCode
		
		
		
		```
		public int hashCode()
		```
		
		
		Overrides:
		`hashCode` in class `java.lang.Object`
		- #### equals
		
		
		
		```
		public boolean equals​(java.lang.Object x$1)
		```
		
		
		Overrides:
		`equals` in class `java.lang.Object`

## Code Examples

### Example 1: transformMessages

```text
val b: Behavior[Number] =
     Behaviors
       .receive[String] { (ctx, msg) =>
         println(msg)
         Behaviors.same
       }
       .transformMessages[Number] {
         case b: BigDecimal => s"BigDecimal(&dollar;b)"
         case i: BigInt     => s"BigInteger(&dollar;i)"
         // all other kinds of Number will be `unhandled`
       }
```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/2.10/akka/actor/typed/Behavior.BehaviorDecorators.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/typed/Behavior.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/typed/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/2.10/akka/actor/typed/Behavior.BehaviorDecorators.html](https://doc.akka.io/japi/akka/2.10/akka/actor/typed/Behavior.BehaviorDecorators.html)*