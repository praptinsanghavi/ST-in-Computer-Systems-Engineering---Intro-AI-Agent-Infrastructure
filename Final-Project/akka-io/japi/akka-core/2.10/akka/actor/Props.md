---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:29:24Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/actor/Props.html
title: Props
---

# Props

## Content

Package [akka.actor](package-summary.html)
## Class Props

- java.lang.Object
- - akka.actor.Props

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public final class Props
extends java.lang.Object
implements scala.Product, java.io.Serializable
```

See Also:
[Serialized Form](../../serialized-form.html#akka.actor.Props)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Props](#%3Cinit%3E(akka.actor.Deploy,java.lang.Class,scala.collection.immutable.Seq))​([Deploy](Deploy.html "class in akka.actor") deploy,  java.lang.Class<?> clazz,  scala.collection.immutable.Seq<java.lang.Object> args)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `java.lang.Class<? extends [Actor](Actor.html "interface in akka.actor")>` | `[actorClass](#actorClass())()` | Obtain an upper\-bound approximation of the actor class which is going to  be created by these Props. |
	| `static [Props](Props.html "class in akka.actor")` | `[apply](#apply(akka.actor.Deploy,java.lang.Class,scala.collection.immutable.Seq))​([Deploy](Deploy.html "class in akka.actor") deploy,  java.lang.Class<?> clazz,  scala.collection.immutable.Seq<java.lang.Object> args)` | Props is a configuration object using in creating an [`Actor`](Actor.html "interface in akka.actor"); it is  immutable, so it is thread\-safe and fully shareable. |
	| `static [Props](Props.html "class in akka.actor")` | `[apply](#apply(java.lang.Class,scala.collection.immutable.Seq))​(java.lang.Class<?> clazz,  scala.collection.immutable.Seq<java.lang.Object> args)` | Scala API: create a Props given a class and its constructor arguments. |
	| `static <T extends [Actor](Actor.html "interface in akka.actor")>[Props](Props.html "class in akka.actor")` | `[apply](#apply(scala.Function0,scala.reflect.ClassTag))​(scala.Function0<T> creator,  scala.reflect.ClassTag<T> evidence$2)` | Scala API: Returns a Props that has default values except for "creator" which will be a function that creates an instance  using the supplied thunk. |
	| `static <T extends [Actor](Actor.html "interface in akka.actor")>[Props](Props.html "class in akka.actor")` | `[apply](#apply(scala.reflect.ClassTag))​(scala.reflect.ClassTag<T> evidence$1)` | Scala API: Returns a Props that has default values except for "creator" which will be a function that creates an instance  of the supplied type using the default constructor. |
	| `scala.collection.immutable.Seq<java.lang.Object>` | `[args](#args())()` |  |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `java.lang.Class<?>` | `[clazz](#clazz())()` |  |
	| `[Props](Props.html "class in akka.actor")` | `[copy](#copy(akka.actor.Deploy,java.lang.Class,scala.collection.immutable.Seq))​([Deploy](Deploy.html "class in akka.actor") deploy,  java.lang.Class<?> clazz,  scala.collection.immutable.Seq<java.lang.Object> args)` |  |
	| `[Deploy](Deploy.html "class in akka.actor")` | `[copy$default$1](#copy$default$1())()` |  |
	| `java.lang.Class<?>` | `[copy$default$2](#copy$default$2())()` |  |
	| `scala.collection.immutable.Seq<java.lang.Object>` | `[copy$default$3](#copy$default$3())()` |  |
	| `static <T extends [Actor](Actor.html "interface in akka.actor")>[Props](Props.html "class in akka.actor")` | `[create](#create(akka.japi.Creator))​([Creator](../japi/Creator.html "interface in akka.japi")<T> creator)` |  |
	| `static [Props](Props.html "class in akka.actor")` | `[create](#create(java.lang.Class,java.lang.Object...))​(java.lang.Class<?> clazz,  java.lang.Object... args)` |  |
	| `static [Props](Props.html "class in akka.actor")` | `[create](#create(java.lang.Class,scala.collection.immutable.Seq))​(java.lang.Class<?> clazz,  scala.collection.immutable.Seq<java.lang.Object> args)` |  |
	| `static <T extends [Actor](Actor.html "interface in akka.actor")>[Props](Props.html "class in akka.actor")` | `[create](#create(java.lang.Class,akka.japi.Creator))​(java.lang.Class<T> actorClass,  [Creator](../japi/Creator.html "interface in akka.japi")<T> creator)` |  |
	| `static scala.Function0<[Actor](Actor.html "interface in akka.actor")>` | `[defaultCreator](#defaultCreator())()` | The defaultCreator, simply throws an UnsupportedOperationException when applied, which is used when creating a Props |
	| `static [Deploy](Deploy.html "class in akka.actor")` | `[defaultDeploy](#defaultDeploy())()` | The default Deploy instance which is used when creating a Props |
	| `static [RouterConfig](../routing/RouterConfig.html "interface in akka.routing")` | `[defaultRoutedProps](#defaultRoutedProps())()` | The defaultRoutedProps is NoRouter which is used when creating a Props |
	| `[Deploy](Deploy.html "class in akka.actor")` | `[deploy](#deploy())()` |  |
	| `java.lang.String` | `[dispatcher](#dispatcher())()` | Convenience method for extracting the dispatcher information from the  contained [`Deploy`](Deploy.html "class in akka.actor") instance. |
	| `static [Props](Props.html "class in akka.actor")` | `[empty](#empty())()` | A Props instance whose creator will create an actor that doesn't respond to any message |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `java.lang.String` | `[mailbox](#mailbox())()` | Convenience method for extracting the mailbox information from the  contained [`Deploy`](Deploy.html "class in akka.actor") instance. |
	| `int` | `[productArity](#productArity())()` |  |
	| `java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `java.lang.String` | `[productElementName](#productElementName(int))​(int x$1)` |  |
	| `scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `[RouterConfig](../routing/RouterConfig.html "interface in akka.routing")` | `[routerConfig](#routerConfig())()` | Convenience method for extracting the router configuration from the  contained [`Deploy`](Deploy.html "class in akka.actor") instance. |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `static scala.Option<scala.Tuple3<[Deploy](Deploy.html "class in akka.actor"),​java.lang.Class<?>,​scala.collection.immutable.Seq<java.lang.Object>>>` | `[unapply](#unapply(akka.actor.Props))​([Props](Props.html "class in akka.actor") x$0)` |  |
	| `[Props](Props.html "class in akka.actor")` | `[withActorTags](#withActorTags(java.lang.String...))​(java.lang.String... tags)` | Returns a new Props with the specified set of tags. |
	| `[Props](Props.html "class in akka.actor")` | `[withActorTags](#withActorTags(scala.collection.immutable.Seq))​(scala.collection.immutable.Seq<java.lang.String> tags)` | Returns a new Props with the specified set of tags. |
	| `[Props](Props.html "class in akka.actor")` | `[withActorTags](#withActorTags(scala.collection.immutable.Set))​(scala.collection.immutable.Set<java.lang.String> tags)` | Scala API: Returns a new Props with the specified set of tags. |
	| `[Props](Props.html "class in akka.actor")` | `[withDeploy](#withDeploy(akka.actor.Deploy))​([Deploy](Deploy.html "class in akka.actor") d)` | Returns a new Props with the specified deployment configuration. |
	| `[Props](Props.html "class in akka.actor")` | `[withDispatcher](#withDispatcher(java.lang.String))​(java.lang.String d)` | Returns a new Props with the specified dispatcher set. |
	| `[Props](Props.html "class in akka.actor")` | `[withMailbox](#withMailbox(java.lang.String))​(java.lang.String m)` | Returns a new Props with the specified mailbox set. |
	| `[Props](Props.html "class in akka.actor")` | `[withRouter](#withRouter(akka.routing.RouterConfig))​([RouterConfig](../routing/RouterConfig.html "interface in akka.routing") r)` | Returns a new Props with the specified router config set. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Product
		
		
		`productElementNames`

- - ### Constructor Detail
	
	
	
		- #### Props
		
		
		
		```
		public Props​([Deploy](Deploy.html "class in akka.actor") deploy,
		             java.lang.Class<?> clazz,
		             scala.collection.immutable.Seq<java.lang.Object> args)
		```

	- ### Method Detail
	
	
	
		- #### defaultCreator
		
		
		
		```
		public static final scala.Function0<[Actor](Actor.html "interface in akka.actor")> defaultCreator()
		```
		
		The defaultCreator, simply throws an UnsupportedOperationException when applied, which is used when creating a Props
		- #### defaultRoutedProps
		
		
		
		```
		public static final [RouterConfig](../routing/RouterConfig.html "interface in akka.routing") defaultRoutedProps()
		```
		
		The defaultRoutedProps is NoRouter which is used when creating a Props
		- #### defaultDeploy
		
		
		
		```
		public static final [Deploy](Deploy.html "class in akka.actor") defaultDeploy()
		```
		
		The default Deploy instance which is used when creating a Props
		- #### empty
		
		
		
		```
		public static final [Props](Props.html "class in akka.actor") empty()
		```
		
		A Props instance whose creator will create an actor that doesn't respond to any message
		- #### apply
		
		
		
		```
		public static <T extends [Actor](Actor.html "interface in akka.actor")> [Props](Props.html "class in akka.actor") apply​(scala.reflect.ClassTag<T> evidence$1)
		```
		
		Scala API: Returns a Props that has default values except for "creator" which will be a function that creates an instance
		 of the supplied type using the default constructor.
		- #### apply
		
		
		
		```
		public static <T extends [Actor](Actor.html "interface in akka.actor")> [Props](Props.html "class in akka.actor") apply​(scala.Function0<T> creator,
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
		public static [Props](Props.html "class in akka.actor") apply​(java.lang.Class<?> clazz,
		                          scala.collection.immutable.Seq<java.lang.Object> args)
		```
		
		Scala API: create a Props given a class and its constructor arguments.
		- #### apply
		
		
		
		```
		public static [Props](Props.html "class in akka.actor") apply​([Deploy](Deploy.html "class in akka.actor") deploy,
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
		public static scala.Option<scala.Tuple3<[Deploy](Deploy.html "class in akka.actor"),​java.lang.Class<?>,​scala.collection.immutable.Seq<java.lang.Object>>> unapply​([Props](Props.html "class in akka.actor") x$0)
		```
		- #### create
		
		
		
		```
		public static [Props](Props.html "class in akka.actor") create​(java.lang.Class<?> clazz,
		                           scala.collection.immutable.Seq<java.lang.Object> args)
		```
		- #### create
		
		
		
		```
		public static <T extends [Actor](Actor.html "interface in akka.actor")> [Props](Props.html "class in akka.actor") create​([Creator](../japi/Creator.html "interface in akka.japi")<T> creator)
		```
		- #### create
		
		
		
		```
		public static <T extends [Actor](Actor.html "interface in akka.actor")> [Props](Props.html "class in akka.actor") create​(java.lang.Class<T> actorClass,
		                                             [Creator](../japi/Creator.html "interface in akka.japi")<T> creator)
		```
		- #### create
		
		
		
		```
		public static [Props](Props.html "class in akka.actor") create​(java.lang.Class<?> clazz,
		                           java.lang.Object... args)
		```
		- #### withActorTags
		
		
		
		```
		public [Props](Props.html "class in akka.actor") withActorTags​(java.lang.String... tags)
		```
		
		Returns a new Props with the specified set of tags.
		- #### deploy
		
		
		
		```
		public [Deploy](Deploy.html "class in akka.actor") deploy()
		```
		- #### clazz
		
		
		
		```
		public java.lang.Class<?> clazz()
		```
		- #### args
		
		
		
		```
		public scala.collection.immutable.Seq<java.lang.Object> args()
		```
		- #### dispatcher
		
		
		
		```
		public java.lang.String dispatcher()
		```
		
		Convenience method for extracting the dispatcher information from the
		 contained [`Deploy`](Deploy.html "class in akka.actor") instance.
		- #### mailbox
		
		
		
		```
		public java.lang.String mailbox()
		```
		
		Convenience method for extracting the mailbox information from the
		 contained [`Deploy`](Deploy.html "class in akka.actor") instance.
		- #### routerConfig
		
		
		
		```
		public [RouterConfig](../routing/RouterConfig.html "interface in akka.routing") routerConfig()
		```
		
		Convenience method for extracting the router configuration from the
		 contained [`Deploy`](Deploy.html "class in akka.actor") instance.
		- #### withDispatcher
		
		
		
		```
		public [Props](Props.html "class in akka.actor") withDispatcher​(java.lang.String d)
		```
		
		Returns a new Props with the specified dispatcher set.
		- #### withMailbox
		
		
		
		```
		public [Props](Props.html "class in akka.actor") withMailbox​(java.lang.String m)
		```
		
		Returns a new Props with the specified mailbox set.
		- #### withRouter
		
		
		
		```
		public [Props](Props.html "class in akka.actor") withRouter​([RouterConfig](../routing/RouterConfig.html "interface in akka.routing") r)
		```
		
		Returns a new Props with the specified router config set.
		- #### withDeploy
		
		
		
		```
		public [Props](Props.html "class in akka.actor") withDeploy​([Deploy](Deploy.html "class in akka.actor") d)
		```
		
		Returns a new Props with the specified deployment configuration.
		- #### withActorTags
		
		
		
		```
		public [Props](Props.html "class in akka.actor") withActorTags​(scala.collection.immutable.Seq<java.lang.String> tags)
		```
		
		Returns a new Props with the specified set of tags.
		- #### withActorTags
		
		
		
		```
		public [Props](Props.html "class in akka.actor") withActorTags​(scala.collection.immutable.Set<java.lang.String> tags)
		```
		
		Scala API: Returns a new Props with the specified set of tags.
		- #### actorClass
		
		
		
		```
		public java.lang.Class<? extends [Actor](Actor.html "interface in akka.actor")> actorClass()
		```
		
		Obtain an upper\-bound approximation of the actor class which is going to
		 be created by these Props. In other words, the actor factory method will
		 produce an instance of this class or a subclass thereof. This is used by
		 the actor system to select special dispatchers or mailboxes in case
		 dependencies are encoded in the actor type.
		- #### copy
		
		
		
		```
		public [Props](Props.html "class in akka.actor") copy​([Deploy](Deploy.html "class in akka.actor") deploy,
		                  java.lang.Class<?> clazz,
		                  scala.collection.immutable.Seq<java.lang.Object> args)
		```
		- #### copy$default$1
		
		
		
		```
		public [Deploy](Deploy.html "class in akka.actor") copy$default$1()
		```
		- #### copy$default$2
		
		
		
		```
		public java.lang.Class<?> copy$default$2()
		```
		- #### copy$default$3
		
		
		
		```
		public scala.collection.immutable.Seq<java.lang.Object> copy$default$3()
		```
		- #### productPrefix
		
		
		
		```
		public java.lang.String productPrefix()
		```
		
		
		Specified by:
		`productPrefix` in interface `scala.Product`
		- #### productArity
		
		
		
		```
		public int productArity()
		```
		
		
		Specified by:
		`productArity` in interface `scala.Product`
		- #### productElement
		
		
		
		```
		public java.lang.Object productElement​(int x$1)
		```
		
		
		Specified by:
		`productElement` in interface `scala.Product`
		- #### productIterator
		
		
		
		```
		public scala.collection.Iterator<java.lang.Object> productIterator()
		```
		
		
		Specified by:
		`productIterator` in interface `scala.Product`
		- #### canEqual
		
		
		
		```
		public boolean canEqual​(java.lang.Object x$1)
		```
		
		
		Specified by:
		`canEqual` in interface `scala.Equals`
		- #### productElementName
		
		
		
		```
		public java.lang.String productElementName​(int x$1)
		```
		
		
		Specified by:
		`productElementName` in interface `scala.Product`
		- #### hashCode
		
		
		
		```
		public int hashCode()
		```
		
		
		Overrides:
		`hashCode` in class `java.lang.Object`
		- #### toString
		
		
		
		```
		public java.lang.String toString()
		```
		
		
		Overrides:
		`toString` in class `java.lang.Object`
		- #### equals
		
		
		
		```
		public boolean equals​(java.lang.Object x$1)
		```
		
		
		Specified by:
		`equals` in interface `scala.Equals`
		Overrides:
		`equals` in class `java.lang.Object`

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

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/Actor.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/Deploy.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/Props.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/akka/japi/Creator.html
- https://doc.akka.io/japi/akka-core/2.10/akka/routing/RouterConfig.html
- https://doc.akka.io/japi/akka-core/2.10/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/actor/Props.html](https://doc.akka.io/japi/akka-core/2.10/akka/actor/Props.html)*