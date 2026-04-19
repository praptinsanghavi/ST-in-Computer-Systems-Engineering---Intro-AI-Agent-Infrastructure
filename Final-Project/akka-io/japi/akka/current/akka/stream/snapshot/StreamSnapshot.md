---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:46:11Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/stream/snapshot/StreamSnapshot.html
title: StreamSnapshot
---

# StreamSnapshot

## Content

Package [akka.stream.snapshot](package-summary.html)
## Interface StreamSnapshot

- ---

```
public interface StreamSnapshot
```

A snapshot of one running stream
 
 Not for user extension

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `scala.collection.immutable.Seq<[RunningInterpreter](RunningInterpreter.html "interface in akka.stream.snapshot")>` | `[activeInterpreters](#activeInterpreters())()` | Running interpreters |
	| `scala.collection.immutable.Seq<[UninitializedInterpreter](UninitializedInterpreter.html "interface in akka.stream.snapshot")>` | `[newShells](#newShells())()` | Interpreters that has been created but not yet initialized \- the stream is not yet running |

- - ### Method Detail
	
	
	
		- #### activeInterpreters
		
		
		
		```
		scala.collection.immutable.Seq<[RunningInterpreter](RunningInterpreter.html "interface in akka.stream.snapshot")> activeInterpreters()
		```
		
		Running interpreters
		- #### newShells
		
		
		
		```
		scala.collection.immutable.Seq<[UninitializedInterpreter](UninitializedInterpreter.html "interface in akka.stream.snapshot")> newShells()
		```
		
		Interpreters that has been created but not yet initialized \- the stream is not yet running

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/stream/snapshot/RunningInterpreter.html
- https://doc.akka.io/japi/akka/current/akka/stream/snapshot/UninitializedInterpreter.html
- https://doc.akka.io/japi/akka/current/akka/stream/snapshot/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/stream/snapshot/StreamSnapshot.html](https://doc.akka.io/japi/akka/current/akka/stream/snapshot/StreamSnapshot.html)*