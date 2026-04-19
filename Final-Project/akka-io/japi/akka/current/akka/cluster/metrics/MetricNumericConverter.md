---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:02:24Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/cluster/metrics/MetricNumericConverter.html
title: MetricNumericConverter
---

# MetricNumericConverter

## Content

Package [akka.cluster.metrics](package-summary.html)
## Interface MetricNumericConverter

- All Known Implementing Classes:
`[Metric](Metric.html "class in akka.cluster.metrics")`, `[Metric$](Metric$.html "class in akka.cluster.metrics")`

---

```
public interface MetricNumericConverter
```

INTERNAL API
 
 Encapsulates evaluation of validity of metric values, conversion of an actual metric value to
 a [`Metric`](Metric.html "class in akka.cluster.metrics") for consumption by subscribed cluster entities.

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `scala.util.Either<java.lang.Object,​java.lang.Object>` | `[convertNumber](#convertNumber(java.lang.Object))​(java.lang.Object from)` | May involve rounding or truncation. |
	| `boolean` | `[defined](#defined(java.lang.Number))​(java.lang.Number value)` | An defined value is neither negative nor NaN/Infinite:  JMX system load average and max heap can be 'undefined' for certain OS, in which case a \-1 is returned  SIGAR combined CPU can occasionally return a NaN or Infinite (known bug) |

- - ### Method Detail
	
	
	
		- #### convertNumber
		
		
		
		```
		scala.util.Either<java.lang.Object,​java.lang.Object> convertNumber​(java.lang.Object from)
		```
		
		May involve rounding or truncation.
		- #### defined
		
		
		
		```
		boolean defined​(java.lang.Number value)
		```
		
		An defined value is neither negative nor NaN/Infinite:
		 
			- JMX system load average and max heap can be 'undefined' for certain OS, in which case a \-1 is returned
			- SIGAR combined CPU can occasionally return a NaN or Infinite (known bug)

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/cluster/metrics/Metric$.html
- https://doc.akka.io/japi/akka/current/akka/cluster/metrics/Metric.html
- https://doc.akka.io/japi/akka/current/akka/cluster/metrics/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/cluster/metrics/MetricNumericConverter.html](https://doc.akka.io/japi/akka/current/akka/cluster/metrics/MetricNumericConverter.html)*