---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:15:34Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/util/ManifestInfo.html
title: ManifestInfo
---

# ManifestInfo

## Content

Package [akka.util](package-summary.html)
## Class ManifestInfo

- java.lang.Object
- - akka.util.ManifestInfo

- All Implemented Interfaces:
`[Extension](../actor/Extension.html "interface in akka.actor")`

---

```
public final class ManifestInfo
extends java.lang.Object
implements [Extension](../actor/Extension.html "interface in akka.actor")
```

Utility that extracts `ManifestInfo#Version` information from META\-INF/MANIFEST.MF in jar files on the classpath.
 Note that versions can only be found in ordinary jar files, for example not in "fat jars' assembled from
 many jar files.

- - ### Nested Class Summary
	
	
	
	Nested Classes 
	| Modifier and Type | Class | Description |
	| `static class` | `[ManifestInfo.Version](ManifestInfo.Version.html "class in akka.util")` | Comparable version information |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ManifestInfo](#%3Cinit%3E(akka.actor.ExtendedActorSystem))​([ExtendedActorSystem](../actor/ExtendedActorSystem.html "class in akka.actor") system)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static T` | `[apply](#apply(akka.actor.ActorSystem))​([ActorSystem](../actor/ActorSystem.html "class in akka.actor") system)` |  |
	| `static T` | `[apply](#apply(akka.actor.ClassicActorSystemProvider))​([ClassicActorSystemProvider](../actor/ClassicActorSystemProvider.html "interface in akka.actor") system)` |  |
	| `boolean` | `[checkSameVersion](#checkSameVersion(java.lang.String,scala.collection.immutable.Seq,boolean))​(java.lang.String productName,  scala.collection.immutable.Seq<java.lang.String> dependencies,  boolean logWarning)` | Verify that the version is the same for all given artifacts. |
	| `boolean` | `[checkSameVersion](#checkSameVersion(java.lang.String,scala.collection.immutable.Seq,boolean,boolean))​(java.lang.String productName,  scala.collection.immutable.Seq<java.lang.String> dependencies,  boolean logWarning,  boolean throwException)` | Verify that the version is the same for all given artifacts. |
	| `static [ManifestInfo](ManifestInfo.html "class in akka.util")` | `[createExtension](#createExtension(akka.actor.ExtendedActorSystem))​([ExtendedActorSystem](../actor/ExtendedActorSystem.html "class in akka.actor") system)` |  |
	| `static boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object other)` |  |
	| `static [ManifestInfo](ManifestInfo.html "class in akka.util")` | `[get](#get(akka.actor.ActorSystem))​([ActorSystem](../actor/ActorSystem.html "class in akka.actor") system)` |  |
	| `static [ManifestInfo](ManifestInfo.html "class in akka.util")` | `[get](#get(akka.actor.ClassicActorSystemProvider))​([ClassicActorSystemProvider](../actor/ClassicActorSystemProvider.html "interface in akka.actor") system)` |  |
	| `static int` | `[hashCode](#hashCode())()` |  |
	| `static [ManifestInfo$](ManifestInfo$.html "class in akka.util")` | `[lookup](#lookup())()` |  |
	| `[ExtendedActorSystem](../actor/ExtendedActorSystem.html "class in akka.actor")` | `[system](#system())()` |  |
	| `scala.collection.immutable.Map<java.lang.String,​[ManifestInfo.Version](ManifestInfo.Version.html "class in akka.util")>` | `[versions](#versions())()` | Versions of artifacts from known vendors. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### ManifestInfo
		
		
		
		```
		public ManifestInfo​([ExtendedActorSystem](../actor/ExtendedActorSystem.html "class in akka.actor") system)
		```

	- ### Method Detail
	
	
	
		- #### get
		
		
		
		```
		public static [ManifestInfo](ManifestInfo.html "class in akka.util") get​([ActorSystem](../actor/ActorSystem.html "class in akka.actor") system)
		```
		- #### get
		
		
		
		```
		public static [ManifestInfo](ManifestInfo.html "class in akka.util") get​([ClassicActorSystemProvider](../actor/ClassicActorSystemProvider.html "interface in akka.actor") system)
		```
		- #### lookup
		
		
		
		```
		public static [ManifestInfo$](ManifestInfo$.html "class in akka.util") lookup()
		```
		- #### createExtension
		
		
		
		```
		public static [ManifestInfo](ManifestInfo.html "class in akka.util") createExtension​([ExtendedActorSystem](../actor/ExtendedActorSystem.html "class in akka.actor") system)
		```
		- #### apply
		
		
		
		```
		public static T apply​([ActorSystem](../actor/ActorSystem.html "class in akka.actor") system)
		```
		- #### apply
		
		
		
		```
		public static T apply​([ClassicActorSystemProvider](../actor/ClassicActorSystemProvider.html "interface in akka.actor") system)
		```
		- #### hashCode
		
		
		
		```
		public static final int hashCode()
		```
		- #### equals
		
		
		
		```
		public static final boolean equals​(java.lang.Object other)
		```
		- #### system
		
		
		
		```
		public [ExtendedActorSystem](../actor/ExtendedActorSystem.html "class in akka.actor") system()
		```
		- #### versions
		
		
		
		```
		public scala.collection.immutable.Map<java.lang.String,​[ManifestInfo.Version](ManifestInfo.Version.html "class in akka.util")> versions()
		```
		
		Versions of artifacts from known vendors.
		- #### checkSameVersion
		
		
		
		```
		public boolean checkSameVersion​(java.lang.String productName,
		                                scala.collection.immutable.Seq<java.lang.String> dependencies,
		                                boolean logWarning)
		```
		
		Verify that the version is the same for all given artifacts.
		 
		 If configuration `akka.fail-mixed-versions=on` it will throw an `IllegalStateException` if the
		 versions are not the same for all given artifacts.
		 
		
		
		
		Returns:
		`true` if versions are the same
		- #### checkSameVersion
		
		
		
		```
		public boolean checkSameVersion​(java.lang.String productName,
		                                scala.collection.immutable.Seq<java.lang.String> dependencies,
		                                boolean logWarning,
		                                boolean throwException)
		```
		
		Verify that the version is the same for all given artifacts.
		 
		 If `throwException` is `true` it will throw an `IllegalStateException` if the versions are not the same
		 for all given artifacts.
		 
		
		
		
		Returns:
		`true` if versions are the same

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/ActorSystem.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/ClassicActorSystemProvider.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/ExtendedActorSystem.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/Extension.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/util/ManifestInfo$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/util/ManifestInfo.Version.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/util/ManifestInfo.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/util/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/util/ManifestInfo.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/util/ManifestInfo.html)*