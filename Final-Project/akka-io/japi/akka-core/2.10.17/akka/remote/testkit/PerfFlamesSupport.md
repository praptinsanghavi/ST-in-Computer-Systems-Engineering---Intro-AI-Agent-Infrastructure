---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T13:12:03Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/remote/testkit/PerfFlamesSupport.html
title: PerfFlamesSupport
---

# PerfFlamesSupport

## Content

Package [akka.remote.testkit](package-summary.html)
## Interface PerfFlamesSupport

- ---

```
public interface PerfFlamesSupport
```

INTERNAL API: Support trait allowing trivially recording perf metrics from [`MultiNodeSpec`](MultiNodeSpec.html "class in akka.remote.testkit")s

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `boolean` | `[isPerfJavaFlamesAvailable](#isPerfJavaFlamesAvailable())()` |  |
	| `java.lang.String` | `[perfJavaFlamesPath](#perfJavaFlamesPath())()` |  |
	| `void` | `[runPerfFlames](#runPerfFlames(scala.collection.immutable.Seq,scala.concurrent.duration.FiniteDuration))​(scala.collection.immutable.Seq<[RoleName](../testconductor/RoleName.html "class in akka.remote.testconductor")> nodes,  scala.concurrent.duration.FiniteDuration delay)` | Runs `perf-java-flames` script on given node (JVM process). |

- - ### Method Detail
	
	
	
		- #### isPerfJavaFlamesAvailable
		
		
		
		```
		boolean isPerfJavaFlamesAvailable()
		```
		- #### perfJavaFlamesPath
		
		
		
		```
		java.lang.String perfJavaFlamesPath()
		```
		- #### runPerfFlames
		
		
		
		```
		void runPerfFlames​(scala.collection.immutable.Seq<[RoleName](../testconductor/RoleName.html "class in akka.remote.testconductor")> nodes,
		                   scala.concurrent.duration.FiniteDuration delay)
		```
		
		Runs `perf-java-flames` script on given node (JVM process).
		 Refer to https://github.com/jrudolph/perf\-map\-agent for options and manual.
		 
		 Options are currently to be passed in via `export PERF_MAP_OPTIONS` etc.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/remote/testconductor/RoleName.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/remote/testkit/MultiNodeSpec.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/remote/testkit/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/remote/testkit/PerfFlamesSupport.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/remote/testkit/PerfFlamesSupport.html)*