---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:45:49Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/Props$.html
title: Props$
---

# Props$

## Content

Package [akka.actor](package-summary.html)
## Class Props$

- java.lang.Object
- - akka.actor.Props$

- All Implemented Interfaces:
`[AbstractProps](AbstractProps.html "interface in akka.actor")`, `java.io.Serializable`

---

```
public class Props$
extends java.lang.Object
implements [AbstractProps](AbstractProps.html "interface in akka.actor"), java.io.Serializable
```

Factory for Props instances.
 
 Props is a ActorRef configuration object, that is immutable, so it is thread safe and fully sharable.
 

 Used when creating new actors through `ActorSystem.actorOf` and `ActorContext.actorOf`.

See Also:
[Serialized Form](../../serialized-form.html#akka.actor.Props$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [Props$](Props$.html "class in akka.actor")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Props$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[Props](Props.html "class in akka.actor")` | `[apply](#apply(akka.actor.Deploy,java.lang.Class,scala.collection.immutable.Seq))​([Deploy](Deploy.html "class in akka.actor") deploy,  java.lang.Class<?> clazz,  scala.collection.immutable.Seq<java.lang.Object> args)` | Props is a configuration object using in creating an [`Actor`](Actor.html "interface in akka.actor"); it is  immutable, so it is thread\-safe and fully shareable. |
	| `[Props](Props.html "class in akka.actor")` | `[apply](#apply(java.lang.Class,scala.collection.immutable.Seq))​(java.lang.Class<?> clazz,  scala.collection.immutable.Seq<java.lang.Object> args)` | Scala API: create a Props given a class and its constructor arguments. |
	| `<T extends [Actor](Actor.html "interface in akka.actor")>[Props](Props.html "class in akka.actor")` | `[apply](#apply(scala.Function0,scala.reflect.ClassTag))​(scala.Function0<T> creator,  scala.reflect.ClassTag<T> evidence$2)` | Scala API: Returns a Props that has default values except for "creator" which will be a function that creates an instance  using the supplied thunk. |
	| `<T extends [Actor](Actor.html "interface in akka.actor")>[Props](Props.html "class in akka.actor")` | `[apply](#apply(scala.reflect.ClassTag))​(scala.reflect.ClassTag<T> evidence$1)` | Scala API: Returns a Props that has default values except for "creator" which will be a function that creates an instance  of the supplied type using the default constructor. |
	| `scala.Function0<[Actor](Actor.html "interface in akka.actor")>` | `[defaultCreator](#defaultCreator())()` | The defaultCreator, simply throws an UnsupportedOperationException when applied, which is used when creating a Props |
	| `[Deploy](Deploy.html "class in akka.actor")` | `[defaultDeploy](#defaultDeploy())()` | The default Deploy instance which is used when creating a Props |
	| `[RouterConfig](../routing/RouterConfig.html "interface in akka.routing")` | `[defaultRoutedProps](#defaultRoutedProps())()` | The defaultRoutedProps is NoRouter which is used when creating a Props |
	| `[Props](Props.html "class in akka.actor")` | `[empty](#empty())()` | A Props instance whose creator will create an actor that doesn't respond to any message |
	| `scala.Option<scala.Tuple3<[Deploy](Deploy.html "class in akka.actor"),​java.lang.Class<?>,​scala.collection.immutable.Seq<java.lang.Object>>>` | `[unapply](#unapply(akka.actor.Props))​([Props](Props.html "class in akka.actor") x$0)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface akka.actor.[AbstractProps](AbstractProps.html "interface in akka.actor")
		
		
		`[checkCreatorClosingOver](AbstractProps.html#checkCreatorClosingOver(java.lang.Class)), [create](AbstractProps.html#create(akka.japi.Creator)), [create](AbstractProps.html#create(java.lang.Class,java.lang.Object...)), [create](AbstractProps.html#create(java.lang.Class,scala.collection.immutable.Seq)), [create](AbstractProps.html#create(java.lang.Class,akka.japi.Creator)), [validate](AbstractProps.html#validate(java.lang.Class))`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [Props$](Props$.html "class in akka.actor") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### Props$
		
		
		
		```
		public Props$()
		```

	- ### Method Detail
	
	
	
		- #### defaultCreator
		
		
		
		```
		public final scala.Function0<[Actor](Actor.html "interface in akka.actor")> defaultCreator()
		```
		
		The defaultCreator, simply throws an UnsupportedOperationException when applied, which is used when creating a Props
		- #### defaultRoutedProps
		
		
		
		```
		public final [RouterConfig](../routing/RouterConfig.html "interface in akka.routing") defaultRoutedProps()
		```
		
		The defaultRoutedProps is NoRouter which is used when creating a Props
		- #### defaultDeploy
		
		
		
		```
		public final [Deploy](Deploy.html "class in akka.actor") defaultDeploy()
		```
		
		The default Deploy instance which is used when creating a Props
		- #### empty
		
		
		
		```
		public final [Props](Props.html "class in akka.actor") empty()
		```
		
		A Props instance whose creator will create an actor that doesn't respond to any message
		- #### apply
		
		
		
		```
		public <T extends [Actor](Actor.html "interface in akka.actor")> [Props](Props.html "class in akka.actor") apply​(scala.reflect.ClassTag<T> evidence$1)
		```
		
		Scala API: Returns a Props that has default values except for "creator" which will be a function that creates an instance
		 of the supplied type using the default constructor.
		- #### apply
		
		
		
		```
		public <T extends [Actor](Actor.html "interface in akka.actor")> [Props](Props.html "class in akka.actor") apply​(scala.Function0<T> creator,
		                                     scala.reflect.ClassTag<T> evidence$2)
		```
		
		Scala API: Returns a Props that has default values except for "creator" which will be a function that creates an instance
		 using the supplied thunk.
		 
		 CAVEAT: Required mailbox type cannot be detected when using anonymous mixin composition
		 when creating the instance. For example, the following will not detect the need for
		 `DequeBasedMessageQueueSemantics` as defined in `Stash`:
		 
		
		
		```
		
		 'Props(new Actor with Stash { ... })
		 
		```
		
		 Instead you must create a named class that mixin the trait,
		 e.g. `class MyActor extends Actor with Stash`.
		- #### apply
		
		
		
		```
		public [Props](Props.html "class in akka.actor") apply​(java.lang.Class<?> clazz,
		                   scala.collection.immutable.Seq<java.lang.Object> args)
		```
		
		Scala API: create a Props given a class and its constructor arguments.
		- #### apply
		
		
		
		```
		public [Props](Props.html "class in akka.actor") apply​([Deploy](Deploy.html "class in akka.actor") deploy,
		                   java.lang.Class<?> clazz,
		                   scala.collection.immutable.Seq<java.lang.Object> args)
		```
		
		Props is a configuration object using in creating an [`Actor`](Actor.html "interface in akka.actor"); it is
		 immutable, so it is thread\-safe and fully shareable.
		 
		 Examples on Scala API:
		 
		
		
		```
		
		  val props = Props.empty
		  val props = Props[MyActor]
		  val props = Props(classOf[MyActor], arg1, arg2)
		
		  val otherProps = props.withDispatcher("dispatcher-id")
		  val otherProps = props.withDeploy(<deployment info>)
		 
		```
		
		
		 Examples on Java API:
		 
		
		
		```
		
		  final Props props = Props.empty();
		  final Props props = Props.create(MyActor.class, arg1, arg2);
		
		  final Props otherProps = props.withDispatcher("dispatcher-id");
		  final Props otherProps = props.withDeploy(<deployment info>);
		 
		```
		- #### unapply
		
		
		
		```
		public scala.Option<scala.Tuple3<[Deploy](Deploy.html "class in akka.actor"),​java.lang.Class<?>,​scala.collection.immutable.Seq<java.lang.Object>>> unapply​([Props](Props.html "class in akka.actor") x$0)
		```

## Code Examples

### Example 1: apply

```text
'Props(new Actor with Stash { ... })
```

### Example 2: apply

```text
val props = Props.empty
  val props = Props[MyActor]
  val props = Props(classOf[MyActor], arg1, arg2)

  val otherProps = props.withDispatcher("dispatcher-id")
  val otherProps = props.withDeploy(<deployment info>)
```

### Example 3: apply

```text
final Props props = Props.empty();
  final Props props = Props.create(MyActor.class, arg1, arg2);

  final Props otherProps = props.withDispatcher("dispatcher-id");
  final Props otherProps = props.withDeploy(<deployment info>);
```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/AbstractProps.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/Actor.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/Deploy.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/Props$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/Props.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/routing/RouterConfig.html
- https://doc.akka.io/japi/akka-core/2.10.17/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/Props$.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/Props$.html)*