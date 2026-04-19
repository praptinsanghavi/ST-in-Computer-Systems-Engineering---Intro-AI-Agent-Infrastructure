---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:32:09Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/remote/artery/compress/CountMinSketch.html
title: CountMinSketch
---

# CountMinSketch

## Content

Package [akka.remote.artery.compress](package-summary.html)
## Class CountMinSketch

- java.lang.Object
- - akka.remote.artery.compress.CountMinSketch

- ---

```
public class CountMinSketch
extends java.lang.Object
```

INTERNAL API: Count\-Min Sketch datastructure.

 Not thread\-safe.

 

An Improved Data Stream Summary: The Count\-Min Sketch and its Applications
 https://web.archive.org/web/20060907232042/http://www.eecs.harvard.edu/\~michaelm/CS222/countmin.pdf
 This implementation is mostly taken and adjusted from the Apache V2 licensed project
 \`stream\-lib\`, located here:
 https://github.com/clearspring/stream\-lib/blob/master/src/main/java/com/clearspring/analytics/stream/frequency/CountMinSketch.java

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[CountMinSketch](#%3Cinit%3E(int,int,int))​(int depth,  int width,  int seed)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `long` | `[addObjectAndEstimateCount](#addObjectAndEstimateCount(java.lang.Object,long))​(java.lang.Object item,  long count)` | Similar to `add`, however we reuse the fact that the hask buckets have to be calculated  for `add` already, and a separate `estimateCount` operation would have to calculate  them again, so we do it all in one go. |
	| `double` | `[confidence](#confidence())()` |  |
	| `long` | `[estimateCount](#estimateCount(java.lang.Object))​(java.lang.Object item)` | The estimate is correct within `'epsilon' * (total item count)`, with probability `confidence`. |
	| `double` | `[relativeError](#relativeError())()` | Referred to as `epsilon` in the whitepaper |
	| `long` | `[size](#size())()` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### CountMinSketch
		
		
		
		```
		public CountMinSketch​(int depth,
		                      int width,
		                      int seed)
		```

	- ### Method Detail
	
	
	
		- #### relativeError
		
		
		
		```
		public double relativeError()
		```
		
		Referred to as `epsilon` in the whitepaper
		- #### confidence
		
		
		
		```
		public double confidence()
		```
		- #### addObjectAndEstimateCount
		
		
		
		```
		public long addObjectAndEstimateCount​(java.lang.Object item,
		                                      long count)
		```
		
		Similar to `add`, however we reuse the fact that the hask buckets have to be calculated
		 for `add` already, and a separate `estimateCount` operation would have to calculate
		 them again, so we do it all in one go.
		- #### size
		
		
		
		```
		public long size()
		```
		- #### estimateCount
		
		
		
		```
		public long estimateCount​(java.lang.Object item)
		```
		
		The estimate is correct within `'epsilon' * (total item count)`, with probability `confidence`.
		- #### toString
		
		
		
		```
		public java.lang.String toString()
		```
		
		
		Overrides:
		`toString` in class `java.lang.Object`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/remote/artery/compress/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/remote/artery/compress/CountMinSketch.html](https://doc.akka.io/japi/akka/current/akka/remote/artery/compress/CountMinSketch.html)*