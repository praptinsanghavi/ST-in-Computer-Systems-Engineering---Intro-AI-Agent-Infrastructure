---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:11:34Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/testkit/internal/NativeImageUtils.html
title: NativeImageUtils
---

# NativeImageUtils

## Content

Package [akka.testkit.internal](package-summary.html)
## Class NativeImageUtils

- java.lang.Object
- - akka.testkit.internal.NativeImageUtils

- ---

```
public class NativeImageUtils
extends java.lang.Object
```

INTERNAL API

- - ### Nested Class Summary
	
	
	
	Nested Classes 
	| Modifier and Type | Class | Description |
	| `static class` | `[NativeImageUtils.Condition](NativeImageUtils.Condition.html "class in akka.testkit.internal")` |  |
	| `static class` | `[NativeImageUtils.Condition$](NativeImageUtils.Condition$.html "class in akka.testkit.internal")` |  |
	| `static class` | `[NativeImageUtils.ReflectConfigEntry](NativeImageUtils.ReflectConfigEntry.html "class in akka.testkit.internal")` |  |
	| `static class` | `[NativeImageUtils.ReflectConfigEntry$](NativeImageUtils.ReflectConfigEntry$.html "class in akka.testkit.internal")` |  |
	| `static class` | `[NativeImageUtils.ReflectField](NativeImageUtils.ReflectField.html "class in akka.testkit.internal")` |  |
	| `static class` | `[NativeImageUtils.ReflectField$](NativeImageUtils.ReflectField$.html "class in akka.testkit.internal")` |  |
	| `static class` | `[NativeImageUtils.ReflectMethod](NativeImageUtils.ReflectMethod.html "class in akka.testkit.internal")` |  |
	| `static class` | `[NativeImageUtils.ReflectMethod$](NativeImageUtils.ReflectMethod$.html "class in akka.testkit.internal")` |  |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[NativeImageUtils](#%3Cinit%3E(java.lang.String,scala.collection.immutable.Seq,scala.collection.immutable.Seq))​(java.lang.String akkaModule,  scala.collection.immutable.Seq<[NativeImageUtils.ReflectConfigEntry](NativeImageUtils.ReflectConfigEntry.html "class in akka.testkit.internal")> additionalEntries,  scala.collection.immutable.Seq<java.lang.String> packageNames)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static java.lang.String` | `[Constructor](#Constructor())()` |  |
	| `java.lang.String` | `[generateMetadata](#generateMetadata())()` |  |
	| `java.nio.file.Path` | `[metadataDir](#metadataDir())()` |  |
	| `static [NativeImageUtils.ReflectField](NativeImageUtils.ReflectField.html "class in akka.testkit.internal")` | `[ModuleField](#ModuleField())()` |  |
	| `scala.Tuple2<java.lang.String,​java.lang.String>` | `[verifyMetadata](#verifyMetadata())()` | For use in tests, throws if existing metadata in given dir does exist, else returns the pre\-existing metadata and the  metadata scanned from current classpath for comparing with test library comparison utils. |
	| `void` | `[writeMetadata](#writeMetadata())()` | Generate GraalVM/NativeImage metadata by scanning the classpath for dynamically loaded extension points of Akka. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### NativeImageUtils
		
		
		
		```
		public NativeImageUtils​(java.lang.String akkaModule,
		                        scala.collection.immutable.Seq<[NativeImageUtils.ReflectConfigEntry](NativeImageUtils.ReflectConfigEntry.html "class in akka.testkit.internal")> additionalEntries,
		                        scala.collection.immutable.Seq<java.lang.String> packageNames)
		```

	- ### Method Detail
	
	
	
		- #### Constructor
		
		
		
		```
		public static java.lang.String Constructor()
		```
		- #### ModuleField
		
		
		
		```
		public static [NativeImageUtils.ReflectField](NativeImageUtils.ReflectField.html "class in akka.testkit.internal") ModuleField()
		```
		- #### metadataDir
		
		
		
		```
		public java.nio.file.Path metadataDir()
		```
		- #### writeMetadata
		
		
		
		```
		public void writeMetadata()
		```
		
		Generate GraalVM/NativeImage metadata by scanning the classpath for dynamically loaded extension points of Akka.
		
		Parameters:
		`metadataDir` \- The place to write metadata files (usually module resources `/META-INF/native-image/organization/artifactId/`
		`additionalEntries` \- Additional, up front known entries for the current module, to add
		`packageNames` \- The packages to scan
		- #### verifyMetadata
		
		
		
		```
		public scala.Tuple2<java.lang.String,​java.lang.String> verifyMetadata()
		```
		
		For use in tests, throws if existing metadata in given dir does exist, else returns the pre\-existing metadata and the
		 metadata scanned from current classpath for comparing with test library comparison utils.
		- #### generateMetadata
		
		
		
		```
		public java.lang.String generateMetadata()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/testkit/internal/NativeImageUtils.Condition$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/testkit/internal/NativeImageUtils.Condition.html
- https://doc.akka.io/japi/akka-core/2.10/akka/testkit/internal/NativeImageUtils.ReflectConfigEntry$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/testkit/internal/NativeImageUtils.ReflectConfigEntry.html
- https://doc.akka.io/japi/akka-core/2.10/akka/testkit/internal/NativeImageUtils.ReflectField$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/testkit/internal/NativeImageUtils.ReflectField.html
- https://doc.akka.io/japi/akka-core/2.10/akka/testkit/internal/NativeImageUtils.ReflectMethod$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/testkit/internal/NativeImageUtils.ReflectMethod.html
- https://doc.akka.io/japi/akka-core/2.10/akka/testkit/internal/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/testkit/internal/NativeImageUtils.html](https://doc.akka.io/japi/akka-core/2.10/akka/testkit/internal/NativeImageUtils.html)*