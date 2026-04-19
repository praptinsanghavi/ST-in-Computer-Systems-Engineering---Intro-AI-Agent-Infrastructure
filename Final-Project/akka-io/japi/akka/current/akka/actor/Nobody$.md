---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:50:59Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/actor/Nobody$.html
title: Nobody$
---

# Nobody$

## Content

Package [akka.actor](package-summary.html)
## Class Nobody$

- java.lang.Object
- - [akka.actor.ActorRef](ActorRef.html "class in akka.actor")
	- - akka.actor.Nobody$

- All Implemented Interfaces:
`[ActorRefScope](ActorRefScope.html "interface in akka.actor")`, `[LocalRef](LocalRef.html "interface in akka.actor")`, `[MinimalActorRef](MinimalActorRef.html "interface in akka.actor")`, `[ScalaActorRef](ScalaActorRef.html "interface in akka.actor")`, `java.io.Serializable`, `java.lang.Comparable<[ActorRef](ActorRef.html "class in akka.actor")>`, `scala.Equals`, `scala.Product`

---

```
public class Nobody$
extends [ActorRef](ActorRef.html "class in akka.actor")
implements [MinimalActorRef](MinimalActorRef.html "interface in akka.actor"), scala.Product, java.io.Serializable
```

This is an internal look\-up failure token, not useful for anything else.
 
 INTERNAL API

See Also:
[Serialized Form](../../serialized-form.html#akka.actor.Nobody$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [Nobody$](Nobody$.html "class in akka.actor")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Nobody$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `abstract akka.actor.InternalActorRef` | `[getChild](#getChild(scala.collection.Iterator))​(scala.collection.Iterator<java.lang.String> name)` | Obtain ActorRef by possibly traversing the actor tree or looking it up at  some provider\-specific location. |
	| `abstract akka.actor.InternalActorRef` | `[getParent](#getParent())()` | Obtain parent of this ref; used by getChild for ".." paths. |
	| `abstract boolean` | `[isLocal](#isLocal())()` | Scope: if this ref points to an actor which resides within the same JVM,  i.e. |
	| `static boolean` | `[isTemporaryRef](#isTemporaryRef(akka.actor.ActorRef))​([ActorRef](ActorRef.html "class in akka.actor") ref)` |  |
	| `[RootActorPath](RootActorPath.html "class in akka.actor")` | `[path](#path())()` | Returns the path for this actor (from this actor up to the root actor). |
	| `int` | `[productArity](#productArity())()` |  |
	| `java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `scala.runtime.Nothing$` | `[provider](#provider())()` |  |
	| `abstract void` | `[restart](#restart(java.lang.Throwable))​(java.lang.Throwable cause)` |  |
	| `abstract void` | `[resume](#resume(java.lang.Throwable))​(java.lang.Throwable causedByFailure)` |  |
	| `abstract void` | `[sendSystemMessage](#sendSystemMessage(akka.dispatch.sysmsg.SystemMessage))​([SystemMessage](../dispatch/sysmsg/SystemMessage.html "interface in akka.dispatch.sysmsg") message)` |  |
	| `abstract void` | `[start](#start())()` |  |
	| `abstract void` | `[stop](#stop())()` |  |
	| `abstract void` | `[suspend](#suspend())()` |  |
	| `protected java.lang.Object` | `[writeReplace](#writeReplace())()` |  |
	
	
		- ### Methods inherited from class akka.actor.[ActorRef](ActorRef.html "class in akka.actor")
		
		
		`[$bang](ActorRef.html#$bang(java.lang.Object,akka.actor.ActorRef)), [$bang$default$2](ActorRef.html#$bang$default$2(java.lang.Object)), [compareTo](ActorRef.html#compareTo(akka.actor.ActorRef)), [equals](ActorRef.html#equals(java.lang.Object)), [forward](ActorRef.html#forward(java.lang.Object,akka.actor.ActorContext)), [hashCode](ActorRef.html#hashCode()), [noSender](ActorRef.html#noSender()), [tell](ActorRef.html#tell(java.lang.Object,akka.actor.ActorRef)), [toString](ActorRef.html#toString())`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Equals
		
		
		`equals`
		- ### Methods inherited from interface akka.actor.[LocalRef](LocalRef.html "interface in akka.actor")
		
		
		`[isLocal](LocalRef.html#isLocal())`
		- ### Methods inherited from interface akka.actor.[MinimalActorRef](MinimalActorRef.html "interface in akka.actor")
		
		
		`[$bang](MinimalActorRef.html#$bang(java.lang.Object,akka.actor.ActorRef)), [$bang$default$2](MinimalActorRef.html#$bang$default$2(java.lang.Object)), [getChild](MinimalActorRef.html#getChild(scala.collection.Iterator)), [getParent](MinimalActorRef.html#getParent()), [isTerminated](MinimalActorRef.html#isTerminated()), [restart](MinimalActorRef.html#restart(java.lang.Throwable)), [resume](MinimalActorRef.html#resume(java.lang.Throwable)), [sendSystemMessage](MinimalActorRef.html#sendSystemMessage(akka.dispatch.sysmsg.SystemMessage)), [start](MinimalActorRef.html#start()), [stop](MinimalActorRef.html#stop()), [suspend](MinimalActorRef.html#suspend())`
		- ### Methods inherited from interface scala.Product
		
		
		`productElementName, productElementNames`
		- ### Methods inherited from interface akka.actor.[ScalaActorRef](ScalaActorRef.html "interface in akka.actor")
		
		
		`[$bang](ScalaActorRef.html#$bang(java.lang.Object,akka.actor.ActorRef)), [$bang$default$2](ScalaActorRef.html#$bang$default$2(java.lang.Object))`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [Nobody$](Nobody$.html "class in akka.actor") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### Nobody$
		
		
		
		```
		public Nobody$()
		```

	- ### Method Detail
	
	
	
		- #### path
		
		
		
		```
		public [RootActorPath](RootActorPath.html "class in akka.actor") path()
		```
		
		Description copied from class: `[ActorRef](ActorRef.html#path())`
		Returns the path for this actor (from this actor up to the root actor).
		
		Specified by:
		`[path](ActorRef.html#path())` in class `[ActorRef](ActorRef.html "class in akka.actor")`
		- #### provider
		
		
		
		```
		public scala.runtime.Nothing$ provider()
		```
		- #### writeReplace
		
		
		
		```
		protected java.lang.Object writeReplace()
		                                 throws java.io.ObjectStreamException
		```
		
		
		Specified by:
		`[writeReplace](MinimalActorRef.html#writeReplace())` in interface `[MinimalActorRef](MinimalActorRef.html "interface in akka.actor")`
		Throws:
		`java.io.ObjectStreamException`
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
		- #### isTemporaryRef
		
		
		
		```
		public static boolean isTemporaryRef​([ActorRef](ActorRef.html "class in akka.actor") ref)
		```
		- #### start
		
		
		
		```
		public abstract void start()
		```
		- #### resume
		
		
		
		```
		public abstract void resume​(java.lang.Throwable causedByFailure)
		```
		- #### suspend
		
		
		
		```
		public abstract void suspend()
		```
		- #### restart
		
		
		
		```
		public abstract void restart​(java.lang.Throwable cause)
		```
		- #### stop
		
		
		
		```
		public abstract void stop()
		```
		- #### sendSystemMessage
		
		
		
		```
		public abstract void sendSystemMessage​([SystemMessage](../dispatch/sysmsg/SystemMessage.html "interface in akka.dispatch.sysmsg") message)
		```
		- #### getParent
		
		
		
		```
		public abstract akka.actor.InternalActorRef getParent()
		```
		
		Obtain parent of this ref; used by getChild for ".." paths.
		- #### getChild
		
		
		
		```
		public abstract akka.actor.InternalActorRef getChild​(scala.collection.Iterator<java.lang.String> name)
		```
		
		Obtain ActorRef by possibly traversing the actor tree or looking it up at
		 some provider\-specific location. This method shall return the end result,
		 i.e. not only the next step in the look\-up; this will typically involve
		 recursive invocation. A path element of ".." signifies the parent, a
		 trailing "" element must be disregarded. If the requested path does not
		 exist, return Nobody.
		- #### isLocal
		
		
		
		```
		public abstract boolean isLocal()
		```
		
		Scope: if this ref points to an actor which resides within the same JVM,
		 i.e. whose mailbox is directly reachable etc.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/ActorRef.html
- https://doc.akka.io/japi/akka/current/akka/actor/ActorRefScope.html
- https://doc.akka.io/japi/akka/current/akka/actor/LocalRef.html
- https://doc.akka.io/japi/akka/current/akka/actor/MinimalActorRef.html
- https://doc.akka.io/japi/akka/current/akka/actor/Nobody$.html
- https://doc.akka.io/japi/akka/current/akka/actor/RootActorPath.html
- https://doc.akka.io/japi/akka/current/akka/actor/ScalaActorRef.html
- https://doc.akka.io/japi/akka/current/akka/actor/package-summary.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/sysmsg/SystemMessage.html
- https://doc.akka.io/japi/akka/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/actor/Nobody$.html](https://doc.akka.io/japi/akka/current/akka/actor/Nobody$.html)*