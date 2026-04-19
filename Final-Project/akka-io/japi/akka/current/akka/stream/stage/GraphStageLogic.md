---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T22:05:54Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/stream/stage/GraphStageLogic.SubSourceOutlet.html
title: GraphStageLogic.SubSourceOutlet
---

# GraphStageLogic.SubSourceOutlet

## Content

Package [akka.stream.stage](package-summary.html)
## Class GraphStageLogic.SubSourceOutlet\<T\>

- java.lang.Object
- - akka.stream.stage.GraphStageLogic.SubSourceOutlet\<T\>

- Enclosing class:
[GraphStageLogic](GraphStageLogic.html "class in akka.stream.stage")

---

```
public class GraphStageLogic.SubSourceOutlet<T>
extends java.lang.Object
```

INTERNAL API
 
 This allows the dynamic creation of an Outlet for a GraphStage which is
 connected to a Source that is available for materialization (e.g. using
 the `subFusingMaterializer`). Completion, cancellation and failure of the
 parent operator is automatically delegated to instances of `SubSourceOutlet`
 to avoid resource leaks.
 

 Even so it is good practice to use the `timeout` method to cancel this
 Outlet in case the corresponding Source is not materialized within a
 given time limit, see e.g. ActorMaterializerSettings.
 

 To be thread safe this method must only be called from either the constructor of the graph operator during
 materialization or one of the methods invoked by the graph operator machinery, such as `onPush` and `onPull`.

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[SubSourceOutlet](#%3Cinit%3E(java.lang.String))​(java.lang.String name)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `void` | `[complete](#complete())()` | Complete this output port. |
	| `void` | `[fail](#fail(java.lang.Throwable))​(java.lang.Throwable ex)` | Fail this output port. |
	| `boolean` | `[isAvailable](#isAvailable())()` | Returns `true` if this output port can be pushed. |
	| `boolean` | `[isClosed](#isClosed())()` | Returns `true` if this output port is closed, but caution  THIS WORKS DIFFERENTLY THAN THE NORMAL isClosed(out). |
	| `void` | `[push](#push(T))​([T](GraphStageLogic.SubSourceOutlet.html "type parameter in GraphStageLogic.SubSourceOutlet") elem)` | Push to this output port. |
	| `void` | `[setHandler](#setHandler(akka.stream.stage.OutHandler))​([OutHandler](OutHandler.html "interface in akka.stream.stage") handler)` | Set OutHandler for this dynamic output port; this needs to be done before  the first substream callback can arrive. |
	| `[Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<[T](GraphStageLogic.SubSourceOutlet.html "type parameter in GraphStageLogic.SubSourceOutlet")>,​[NotUsed](../../NotUsed.html "class in akka")>` | `[source](#source())()` | Get the Source for this dynamic output port. |
	| `void` | `[timeout](#timeout(scala.concurrent.duration.FiniteDuration))​(scala.concurrent.duration.FiniteDuration d)` | Set the source into timed\-out mode if it has not yet been materialized. |
	| `java.lang.String` | `[toString](#toString())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### SubSourceOutlet
		
		
		
		```
		public SubSourceOutlet​(java.lang.String name)
		```

	- ### Method Detail
	
	
	
		- #### complete
		
		
		
		```
		public void complete()
		```
		
		Complete this output port.
		- #### fail
		
		
		
		```
		public void fail​(java.lang.Throwable ex)
		```
		
		Fail this output port.
		- #### isAvailable
		
		
		
		```
		public boolean isAvailable()
		```
		
		Returns `true` if this output port can be pushed.
		- #### isClosed
		
		
		
		```
		public boolean isClosed()
		```
		
		Returns `true` if this output port is closed, but caution
		 THIS WORKS DIFFERENTLY THAN THE NORMAL isClosed(out).
		 Due to possibly asynchronous shutdown it may not return
		 `true` immediately after `complete()` or `fail()` have returned.
		- #### push
		
		
		
		```
		public void push​([T](GraphStageLogic.SubSourceOutlet.html "type parameter in GraphStageLogic.SubSourceOutlet") elem)
		```
		
		Push to this output port.
		- #### setHandler
		
		
		
		```
		public void setHandler​([OutHandler](OutHandler.html "interface in akka.stream.stage") handler)
		```
		
		Set OutHandler for this dynamic output port; this needs to be done before
		 the first substream callback can arrive.
		- #### source
		
		
		
		```
		public [Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<[T](GraphStageLogic.SubSourceOutlet.html "type parameter in GraphStageLogic.SubSourceOutlet")>,​[NotUsed](../../NotUsed.html "class in akka")> source()
		```
		
		Get the Source for this dynamic output port.
		- #### timeout
		
		
		
		```
		public void timeout​(scala.concurrent.duration.FiniteDuration d)
		```
		
		Set the source into timed\-out mode if it has not yet been materialized.
		- #### toString
		
		
		
		```
		public java.lang.String toString()
		```
		
		
		Overrides:
		`toString` in class `java.lang.Object`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/NotUsed.html
- https://doc.akka.io/japi/akka/current/akka/stream/Graph.html
- https://doc.akka.io/japi/akka/current/akka/stream/SourceShape.html
- https://doc.akka.io/japi/akka/current/akka/stream/stage/GraphStageLogic.SubSourceOutlet.html
- https://doc.akka.io/japi/akka/current/akka/stream/stage/GraphStageLogic.html
- https://doc.akka.io/japi/akka/current/akka/stream/stage/OutHandler.html
- https://doc.akka.io/japi/akka/current/akka/stream/stage/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/stream/stage/GraphStageLogic.SubSourceOutlet.html](https://doc.akka.io/japi/akka/current/akka/stream/stage/GraphStageLogic.SubSourceOutlet.html)*