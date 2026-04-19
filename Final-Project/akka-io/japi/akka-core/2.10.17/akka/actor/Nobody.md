---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:45:41Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/Nobody.html
title: Nobody
---

# Nobody

## Content

Package [akka.actor](package-summary.html)
## Class Nobody

- java.lang.Object
- - akka.actor.Nobody

- ---

```
public class Nobody
extends java.lang.Object
```

This is an internal look\-up failure token, not useful for anything else.
 
 INTERNAL API

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Nobody](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static void` | `[$bang](#$bang(java.lang.Object,akka.actor.ActorRef))​(java.lang.Object message,  [ActorRef](ActorRef.html "class in akka.actor") sender)` |  |
	| `static [ActorRef](ActorRef.html "class in akka.actor")` | `[$bang$default$2](#$bang$default$2(java.lang.Object))​(java.lang.Object message)` |  |
	| `static boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `static int` | `[compareTo](#compareTo(akka.actor.ActorRef))​([ActorRef](ActorRef.html "class in akka.actor") other)` |  |
	| `static boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object that)` |  |
	| `static void` | `[forward](#forward(java.lang.Object,akka.actor.ActorContext))​(java.lang.Object message,  [ActorContext](ActorContext.html "interface in akka.actor") context)` |  |
	| `static akka.actor.InternalActorRef` | `[getChild](#getChild(scala.collection.Iterator))​(scala.collection.Iterator<java.lang.String> names)` |  |
	| `static akka.actor.InternalActorRef` | `[getParent](#getParent())()` |  |
	| `static int` | `[hashCode](#hashCode())()` |  |
	| `abstract static boolean` | `[isLocal](#isLocal())()` |  |
	| `static [RootActorPath](RootActorPath.html "class in akka.actor")` | `[path](#path())()` |  |
	| `static int` | `[productArity](#productArity())()` |  |
	| `static java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `static java.lang.String` | `[productElementName](#productElementName(int))​(int n)` |  |
	| `static scala.collection.Iterator<java.lang.String>` | `[productElementNames](#productElementNames())()` |  |
	| `static scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `static java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `static scala.runtime.Nothing$` | `[provider](#provider())()` |  |
	| `static void` | `[restart](#restart(java.lang.Throwable))​(java.lang.Throwable cause)` |  |
	| `static void` | `[resume](#resume(java.lang.Throwable))​(java.lang.Throwable causedByFailure)` |  |
	| `static void` | `[sendSystemMessage](#sendSystemMessage(akka.dispatch.sysmsg.SystemMessage))​([SystemMessage](../dispatch/sysmsg/SystemMessage.html "interface in akka.dispatch.sysmsg") message)` |  |
	| `static void` | `[start](#start())()` |  |
	| `static void` | `[stop](#stop())()` |  |
	| `static void` | `[suspend](#suspend())()` |  |
	| `static void` | `[tell](#tell(java.lang.Object,akka.actor.ActorRef))​(java.lang.Object msg,  [ActorRef](ActorRef.html "class in akka.actor") sender)` |  |
	| `static java.lang.String` | `[toString](#toString())()` |  |
	| `protected static java.lang.Object` | `[writeReplace](#writeReplace())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### Nobody
		
		
		
		```
		public Nobody()
		```

	- ### Method Detail
	
	
	
		- #### path
		
		
		
		```
		public static [RootActorPath](RootActorPath.html "class in akka.actor") path()
		```
		- #### provider
		
		
		
		```
		public static scala.runtime.Nothing$ provider()
		```
		- #### writeReplace
		
		
		
		```
		protected static java.lang.Object writeReplace()
		                                        throws java.io.ObjectStreamException
		```
		
		
		Throws:
		`java.io.ObjectStreamException`
		- #### productPrefix
		
		
		
		```
		public static java.lang.String productPrefix()
		```
		- #### productArity
		
		
		
		```
		public static int productArity()
		```
		- #### productElement
		
		
		
		```
		public static java.lang.Object productElement​(int x$1)
		```
		- #### productIterator
		
		
		
		```
		public static scala.collection.Iterator<java.lang.Object> productIterator()
		```
		- #### canEqual
		
		
		
		```
		public static boolean canEqual​(java.lang.Object x$1)
		```
		- #### compareTo
		
		
		
		```
		public static final int compareTo​([ActorRef](ActorRef.html "class in akka.actor") other)
		```
		- #### tell
		
		
		
		```
		public static final void tell​(java.lang.Object msg,
		                              [ActorRef](ActorRef.html "class in akka.actor") sender)
		```
		- #### forward
		
		
		
		```
		public static void forward​(java.lang.Object message,
		                           [ActorContext](ActorContext.html "interface in akka.actor") context)
		```
		- #### hashCode
		
		
		
		```
		public static final int hashCode()
		```
		- #### equals
		
		
		
		```
		public static final boolean equals​(java.lang.Object that)
		```
		- #### toString
		
		
		
		```
		public static java.lang.String toString()
		```
		- #### isLocal
		
		
		
		```
		public abstract static boolean isLocal()
		```
		- #### getParent
		
		
		
		```
		public static akka.actor.InternalActorRef getParent()
		```
		- #### getChild
		
		
		
		```
		public static akka.actor.InternalActorRef getChild​(scala.collection.Iterator<java.lang.String> names)
		```
		- #### start
		
		
		
		```
		public static void start()
		```
		- #### suspend
		
		
		
		```
		public static void suspend()
		```
		- #### resume
		
		
		
		```
		public static void resume​(java.lang.Throwable causedByFailure)
		```
		- #### stop
		
		
		
		```
		public static void stop()
		```
		- #### $bang
		
		
		
		```
		public static void $bang​(java.lang.Object message,
		                         [ActorRef](ActorRef.html "class in akka.actor") sender)
		```
		- #### $bang$default$2
		
		
		
		```
		public static [ActorRef](ActorRef.html "class in akka.actor") $bang$default$2​(java.lang.Object message)
		```
		- #### sendSystemMessage
		
		
		
		```
		public static void sendSystemMessage​([SystemMessage](../dispatch/sysmsg/SystemMessage.html "interface in akka.dispatch.sysmsg") message)
		```
		- #### restart
		
		
		
		```
		public static void restart​(java.lang.Throwable cause)
		```
		- #### productElementName
		
		
		
		```
		public static java.lang.String productElementName​(int n)
		```
		- #### productElementNames
		
		
		
		```
		public static scala.collection.Iterator<java.lang.String> productElementNames()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/ActorContext.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/ActorRef.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/RootActorPath.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/dispatch/sysmsg/SystemMessage.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/Nobody.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/Nobody.html)*