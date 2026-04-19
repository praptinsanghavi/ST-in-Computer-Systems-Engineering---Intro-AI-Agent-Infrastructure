---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:55:03Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/snapshot/RunningInterpreter.html
title: RunningInterpreter
---

# RunningInterpreter

## Content

Package [akka.stream.snapshot](package-summary.html)
## Interface RunningInterpreter

- All Superinterfaces:
`[InterpreterSnapshot](InterpreterSnapshot.html "interface in akka.stream.snapshot")`

---

```
public interface RunningInterpreter
extends [InterpreterSnapshot](InterpreterSnapshot.html "interface in akka.stream.snapshot")
```

A stream interpreter that is running/has been started

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `scala.collection.immutable.Seq<[ConnectionSnapshot](ConnectionSnapshot.html "interface in akka.stream.snapshot")>` | `[connections](#connections())()` | Each connection between logics in the interpreter |
	| `scala.collection.immutable.Seq<[LogicSnapshot](LogicSnapshot.html "interface in akka.stream.snapshot")>` | `[logics](#logics())()` | Each of the materialized graph stage logics running inside the interpreter |
	| `int` | `[runningLogicsCount](#runningLogicsCount())()` | Total number of non\-stopped logics in the interpreter |
	| `scala.collection.immutable.Seq<[LogicSnapshot](LogicSnapshot.html "interface in akka.stream.snapshot")>` | `[stoppedLogics](#stoppedLogics())()` | All logics that has completed and is no longer executing |

- - ### Method Detail
	
	
	
		- #### connections
		
		
		
		```
		scala.collection.immutable.Seq<[ConnectionSnapshot](ConnectionSnapshot.html "interface in akka.stream.snapshot")> connections()
		```
		
		Each connection between logics in the interpreter
		- #### logics
		
		
		
		```
		scala.collection.immutable.Seq<[LogicSnapshot](LogicSnapshot.html "interface in akka.stream.snapshot")> logics()
		```
		
		Each of the materialized graph stage logics running inside the interpreter
		
		Specified by:
		`[logics](InterpreterSnapshot.html#logics())` in interface `[InterpreterSnapshot](InterpreterSnapshot.html "interface in akka.stream.snapshot")`
		- #### runningLogicsCount
		
		
		
		```
		int runningLogicsCount()
		```
		
		Total number of non\-stopped logics in the interpreter
		- #### stoppedLogics
		
		
		
		```
		scala.collection.immutable.Seq<[LogicSnapshot](LogicSnapshot.html "interface in akka.stream.snapshot")> stoppedLogics()
		```
		
		All logics that has completed and is no longer executing

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/snapshot/ConnectionSnapshot.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/snapshot/InterpreterSnapshot.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/snapshot/LogicSnapshot.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/snapshot/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/snapshot/RunningInterpreter.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/snapshot/RunningInterpreter.html)*