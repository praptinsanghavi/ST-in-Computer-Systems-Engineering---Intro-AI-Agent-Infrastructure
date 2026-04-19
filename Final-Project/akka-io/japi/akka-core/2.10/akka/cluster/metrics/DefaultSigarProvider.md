---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:03:51Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/cluster/metrics/DefaultSigarProvider.html
title: DefaultSigarProvider
---

# DefaultSigarProvider

## Content

Package [akka.cluster.metrics](package-summary.html)
## Class DefaultSigarProvider

- java.lang.Object
- - akka.cluster.metrics.DefaultSigarProvider

- All Implemented Interfaces:
`[SigarProvider](SigarProvider.html "interface in akka.cluster.metrics")`, `java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public class DefaultSigarProvider
extends java.lang.Object
implements [SigarProvider](SigarProvider.html "interface in akka.cluster.metrics"), scala.Product, java.io.Serializable
```

Provide sigar instance as `SigarProxy` with configured location via [`ClusterMetricsSettings`](ClusterMetricsSettings.html "class in akka.cluster.metrics").

See Also:
[Serialized Form](../../../serialized-form.html#akka.cluster.metrics.DefaultSigarProvider)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[DefaultSigarProvider](#%3Cinit%3E(akka.cluster.metrics.ClusterMetricsSettings))​([ClusterMetricsSettings](ClusterMetricsSettings.html "class in akka.cluster.metrics") settings)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [DefaultSigarProvider](DefaultSigarProvider.html "class in akka.cluster.metrics")` | `[apply](#apply(akka.cluster.metrics.ClusterMetricsSettings))​([ClusterMetricsSettings](ClusterMetricsSettings.html "class in akka.cluster.metrics") settings)` |  |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `[DefaultSigarProvider](DefaultSigarProvider.html "class in akka.cluster.metrics")` | `[copy](#copy(akka.cluster.metrics.ClusterMetricsSettings))​([ClusterMetricsSettings](ClusterMetricsSettings.html "class in akka.cluster.metrics") settings)` |  |
	| `[ClusterMetricsSettings](ClusterMetricsSettings.html "class in akka.cluster.metrics")` | `[copy$default$1](#copy$default$1())()` |  |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `java.lang.String` | `[extractFolder](#extractFolder())()` | Library extract location. |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `int` | `[productArity](#productArity())()` |  |
	| `java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `java.lang.String` | `[productElementName](#productElementName(int))​(int x$1)` |  |
	| `scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `[ClusterMetricsSettings](ClusterMetricsSettings.html "class in akka.cluster.metrics")` | `[settings](#settings())()` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `static scala.Option<[ClusterMetricsSettings](ClusterMetricsSettings.html "class in akka.cluster.metrics")>` | `[unapply](#unapply(akka.cluster.metrics.DefaultSigarProvider))​([DefaultSigarProvider](DefaultSigarProvider.html "class in akka.cluster.metrics") x$0)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Product
		
		
		`productElementNames`
		- ### Methods inherited from interface akka.cluster.metrics.[SigarProvider](SigarProvider.html "interface in akka.cluster.metrics")
		
		
		`[createSigarInstance](SigarProvider.html#createSigarInstance()), [isNativeLoaded](SigarProvider.html#isNativeLoaded()), [provisionSigarLibrary](SigarProvider.html#provisionSigarLibrary()), [verifiedSigarInstance](SigarProvider.html#verifiedSigarInstance())`

- - ### Constructor Detail
	
	
	
		- #### DefaultSigarProvider
		
		
		
		```
		public DefaultSigarProvider​([ClusterMetricsSettings](ClusterMetricsSettings.html "class in akka.cluster.metrics") settings)
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public static [DefaultSigarProvider](DefaultSigarProvider.html "class in akka.cluster.metrics") apply​([ClusterMetricsSettings](ClusterMetricsSettings.html "class in akka.cluster.metrics") settings)
		```
		- #### unapply
		
		
		
		```
		public static scala.Option<[ClusterMetricsSettings](ClusterMetricsSettings.html "class in akka.cluster.metrics")> unapply​([DefaultSigarProvider](DefaultSigarProvider.html "class in akka.cluster.metrics") x$0)
		```
		- #### settings
		
		
		
		```
		public [ClusterMetricsSettings](ClusterMetricsSettings.html "class in akka.cluster.metrics") settings()
		```
		- #### extractFolder
		
		
		
		```
		public java.lang.String extractFolder()
		```
		
		Description copied from interface: `[SigarProvider](SigarProvider.html#extractFolder())`
		Library extract location.
		
		Specified by:
		`[extractFolder](SigarProvider.html#extractFolder())` in interface `[SigarProvider](SigarProvider.html "interface in akka.cluster.metrics")`
		- #### copy
		
		
		
		```
		public [DefaultSigarProvider](DefaultSigarProvider.html "class in akka.cluster.metrics") copy​([ClusterMetricsSettings](ClusterMetricsSettings.html "class in akka.cluster.metrics") settings)
		```
		- #### copy$default$1
		
		
		
		```
		public [ClusterMetricsSettings](ClusterMetricsSettings.html "class in akka.cluster.metrics") copy$default$1()
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

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/metrics/ClusterMetricsSettings.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/metrics/DefaultSigarProvider.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/metrics/SigarProvider.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/metrics/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/cluster/metrics/DefaultSigarProvider.html](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/metrics/DefaultSigarProvider.html)*