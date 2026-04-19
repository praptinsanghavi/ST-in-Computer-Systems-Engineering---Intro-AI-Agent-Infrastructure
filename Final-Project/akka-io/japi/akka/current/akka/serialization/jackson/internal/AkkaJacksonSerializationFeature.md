---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:40:42Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/serialization/jackson/internal/AkkaJacksonSerializationFeature.html
title: AkkaJacksonSerializationFeature
---

# AkkaJacksonSerializationFeature

## Content

Package [akka.serialization.jackson.internal](package-summary.html)
## Class AkkaJacksonSerializationFeature

- java.lang.Object
- - akka.serialization.jackson.internal.AkkaJacksonSerializationFeature

- All Implemented Interfaces:
`org.graalvm.nativeimage.hosted.Feature`

---

```
public final class AkkaJacksonSerializationFeature
extends java.lang.Object
implements org.graalvm.nativeimage.hosted.Feature
```

Provides auto\-registration of user classes marked with the built in marker types.
 
 INTERNAL API

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from interface org.graalvm.nativeimage.hosted.Feature
		
		
		`org.graalvm.nativeimage.hosted.Feature.AfterAnalysisAccess, org.graalvm.nativeimage.hosted.Feature.AfterCompilationAccess, org.graalvm.nativeimage.hosted.Feature.AfterHeapLayoutAccess, org.graalvm.nativeimage.hosted.Feature.AfterImageWriteAccess, org.graalvm.nativeimage.hosted.Feature.AfterRegistrationAccess, org.graalvm.nativeimage.hosted.Feature.BeforeAnalysisAccess, org.graalvm.nativeimage.hosted.Feature.BeforeCompilationAccess, org.graalvm.nativeimage.hosted.Feature.BeforeHeapLayoutAccess, org.graalvm.nativeimage.hosted.Feature.BeforeImageWriteAccess, org.graalvm.nativeimage.hosted.Feature.BeforeUniverseBuildingAccess, org.graalvm.nativeimage.hosted.Feature.CompilationAccess, org.graalvm.nativeimage.hosted.Feature.DuringAnalysisAccess, org.graalvm.nativeimage.hosted.Feature.DuringSetupAccess, org.graalvm.nativeimage.hosted.Feature.FeatureAccess, org.graalvm.nativeimage.hosted.Feature.IsInConfigurationAccess, org.graalvm.nativeimage.hosted.Feature.OnAnalysisExitAccess, org.graalvm.nativeimage.hosted.Feature.QueryReachabilityAccess`

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[AkkaJacksonSerializationFeature](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `void` | `[beforeAnalysis](#beforeAnalysis(org.graalvm.nativeimage.hosted.Feature.BeforeAnalysisAccess))​(org.graalvm.nativeimage.hosted.Feature.BeforeAnalysisAccess access)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface org.graalvm.nativeimage.hosted.Feature
		
		
		`afterAnalysis, afterCompilation, afterHeapLayout, afterImageWrite, afterRegistration, beforeCompilation, beforeHeapLayout, beforeImageWrite, beforeUniverseBuilding, cleanup, duringAnalysis, duringSetup, getDescription, getRequiredFeatures, getURL, isInConfiguration, onAnalysisExit`

- - ### Constructor Detail
	
	
	
		- #### AkkaJacksonSerializationFeature
		
		
		
		```
		public AkkaJacksonSerializationFeature()
		```

	- ### Method Detail
	
	
	
		- #### beforeAnalysis
		
		
		
		```
		public void beforeAnalysis​(org.graalvm.nativeimage.hosted.Feature.BeforeAnalysisAccess access)
		```
		
		
		Specified by:
		`beforeAnalysis` in interface `org.graalvm.nativeimage.hosted.Feature`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/serialization/jackson/internal/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/serialization/jackson/internal/AkkaJacksonSerializationFeature.html](https://doc.akka.io/japi/akka/current/akka/serialization/jackson/internal/AkkaJacksonSerializationFeature.html)*