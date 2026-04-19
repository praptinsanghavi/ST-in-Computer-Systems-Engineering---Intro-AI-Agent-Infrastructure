---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:46:08Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/stream/snapshot/InterpreterSnapshot.html
title: InterpreterSnapshot
---

# InterpreterSnapshot

## Content

Package [akka.stream.snapshot](package-summary.html)
## Interface InterpreterSnapshot

- All Known Subinterfaces:
`[RunningInterpreter](RunningInterpreter.html "interface in akka.stream.snapshot")`, `[UninitializedInterpreter](UninitializedInterpreter.html "interface in akka.stream.snapshot")`

---

```
public interface InterpreterSnapshot
```

A snapshot of one interpreter \- contains a set of logics running in the same underlying actor. Note that
 multiple interpreters may be running in the same actor (because of submaterialization)
 
 Not for user extension

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `scala.collection.immutable.Seq<[LogicSnapshot](LogicSnapshot.html "interface in akka.stream.snapshot")>` | `[logics](#logics())()` |  |

- - ### Method Detail
	
	
	
		- #### logics
		
		
		
		```
		scala.collection.immutable.Seq<[LogicSnapshot](LogicSnapshot.html "interface in akka.stream.snapshot")> logics()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/stream/snapshot/LogicSnapshot.html
- https://doc.akka.io/japi/akka/current/akka/stream/snapshot/RunningInterpreter.html
- https://doc.akka.io/japi/akka/current/akka/stream/snapshot/UninitializedInterpreter.html
- https://doc.akka.io/japi/akka/current/akka/stream/snapshot/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/stream/snapshot/InterpreterSnapshot.html](https://doc.akka.io/japi/akka/current/akka/stream/snapshot/InterpreterSnapshot.html)*