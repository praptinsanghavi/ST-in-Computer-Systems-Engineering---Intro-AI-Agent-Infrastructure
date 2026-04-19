---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:03:21Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/cluster/metrics/SigarProvider.html
title: SigarProvider
---

# SigarProvider

## Content

Package [akka.cluster.metrics](package-summary.html)
## Interface SigarProvider

- All Known Implementing Classes:
`[DefaultSigarProvider](DefaultSigarProvider.html "class in akka.cluster.metrics")`

---

```
public interface SigarProvider
```

Provide sigar instance as `SigarProxy`.
 
 User can provision sigar classes and native library in one of the following ways:
 

 1\) Use [Kamon sigar\-loader](https://github.com/kamon-io/sigar-loader) as a project dependency for the user project.
 Metrics extension will extract and load sigar library on demand with help of Kamon sigar provisioner.
 

 2\) Use [Kamon sigar\-loader](https://github.com/kamon-io/sigar-loader) as java agent: `java -javaagent:/path/to/sigar-loader.jar`
 Kamon sigar loader agent will extract and load sigar library during JVM start.
 

 3\) Place `sigar.jar` on the `classpath` and sigar native library for the o/s on the `java.library.path`
 User is required to manage both project dependency and library deployment manually.

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `org.hyperic.sigar.SigarProxy` | `[createSigarInstance](#createSigarInstance())()` | Create sigar instance with 2\-phase sigar library loading. |
	| `java.lang.String` | `[extractFolder](#extractFolder())()` | Library extract location. |
	| `boolean` | `[isNativeLoaded](#isNativeLoaded())()` | Verify if sigar native library is loaded and operational. |
	| `void` | `[provisionSigarLibrary](#provisionSigarLibrary())()` | Extract and load sigar native library. |
	| `org.hyperic.sigar.SigarProxy` | `[verifiedSigarInstance](#verifiedSigarInstance())()` | Create sigar and verify it works. |

- - ### Method Detail
	
	
	
		- #### extractFolder
		
		
		
		```
		java.lang.String extractFolder()
		```
		
		Library extract location.
		- #### isNativeLoaded
		
		
		
		```
		boolean isNativeLoaded()
		```
		
		Verify if sigar native library is loaded and operational.
		- #### verifiedSigarInstance
		
		
		
		```
		org.hyperic.sigar.SigarProxy verifiedSigarInstance()
		```
		
		Create sigar and verify it works.
		- #### provisionSigarLibrary
		
		
		
		```
		void provisionSigarLibrary()
		```
		
		Extract and load sigar native library.
		- #### createSigarInstance
		
		
		
		```
		org.hyperic.sigar.SigarProxy createSigarInstance()
		```
		
		Create sigar instance with 2\-phase sigar library loading.
		 1\) Assume that library is already provisioned.
		 2\) Attempt to provision library via sigar\-loader.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/metrics/DefaultSigarProvider.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/metrics/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/cluster/metrics/SigarProvider.html](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/metrics/SigarProvider.html)*