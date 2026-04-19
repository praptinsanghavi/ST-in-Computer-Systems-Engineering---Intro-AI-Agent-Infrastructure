---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:35:34Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/remote/artery/EnvelopeBuffer$.html
title: EnvelopeBuffer$
---

# EnvelopeBuffer$

## Content

Package [akka.remote.artery](package-summary.html)
## Class EnvelopeBuffer$

- java.lang.Object
- - akka.remote.artery.EnvelopeBuffer$

- ---

```
public class EnvelopeBuffer$
extends java.lang.Object
```

INTERNAL API
 
 The strategy if the header format must be changed in an incompatible way is:
 \- In the end we only want to support one header format, the latest, but during
 a rolling upgrade period we must support two versions in at least one Akka patch
 release.
 \- When supporting two version the outbound messages must still be encoded with old
 version. The Decoder on the receiving side must understand both versions.
 \- Create a new copy of the header encoding/decoding logic (issue \#24553: we should refactor to make that easier).
 \- Bump `ArteryTransport.HighestVersion` and keep `ArterySettings.Version` as the old version.
 \- Make sure `Decoder` picks the right parsing logic based on the version field in the incoming frame.
 \- Release Akka, e.g. 2\.5\.13
 \- Later, remove the old header parsing logic and bump the `ArterySettings.Version` to the same as
 `ArteryTransport.HighestVersion` again.
 \- Release Akka, e.g. 2\.5\.14, and announce that all nodes in the cluster must first be on version
 2\.5\.13 before upgrading to 2\.5\.14\. That means that it is not supported to do a rolling upgrade
 from 2\.5\.12 directly to 2\.5\.14\.

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [EnvelopeBuffer$](EnvelopeBuffer$.html "class in akka.remote.artery")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[EnvelopeBuffer$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `int` | `[ActorRefCompressionTableVersionOffset](#ActorRefCompressionTableVersionOffset())()` |  |
	| `int` | `[ClassManifestCompressionTableVersionOffset](#ClassManifestCompressionTableVersionOffset())()` |  |
	| `int` | `[ClassManifestTagOffset](#ClassManifestTagOffset())()` |  |
	| `int` | `[FlagsOffset](#FlagsOffset())()` |  |
	| `int` | `[MetadataContainerAndLiteralSectionOffset](#MetadataContainerAndLiteralSectionOffset())()` |  |
	| `akka.remote.artery.ByteFlag` | `[MetadataPresentFlag](#MetadataPresentFlag())()` |  |
	| `int` | `[RecipientActorRefTagOffset](#RecipientActorRefTagOffset())()` |  |
	| `int` | `[SenderActorRefTagOffset](#SenderActorRefTagOffset())()` |  |
	| `int` | `[SerializerOffset](#SerializerOffset())()` |  |
	| `int` | `[TagTypeMask](#TagTypeMask())()` |  |
	| `int` | `[TagValueMask](#TagValueMask())()` |  |
	| `int` | `[UidOffset](#UidOffset())()` |  |
	| `int` | `[VersionOffset](#VersionOffset())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [EnvelopeBuffer$](EnvelopeBuffer$.html "class in akka.remote.artery") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### EnvelopeBuffer$
		
		
		
		```
		public EnvelopeBuffer$()
		```

	- ### Method Detail
	
	
	
		- #### TagTypeMask
		
		
		
		```
		public int TagTypeMask()
		```
		- #### TagValueMask
		
		
		
		```
		public int TagValueMask()
		```
		- #### MetadataPresentFlag
		
		
		
		```
		public akka.remote.artery.ByteFlag MetadataPresentFlag()
		```
		- #### VersionOffset
		
		
		
		```
		public int VersionOffset()
		```
		- #### FlagsOffset
		
		
		
		```
		public int FlagsOffset()
		```
		- #### ActorRefCompressionTableVersionOffset
		
		
		
		```
		public int ActorRefCompressionTableVersionOffset()
		```
		- #### ClassManifestCompressionTableVersionOffset
		
		
		
		```
		public int ClassManifestCompressionTableVersionOffset()
		```
		- #### UidOffset
		
		
		
		```
		public int UidOffset()
		```
		- #### SerializerOffset
		
		
		
		```
		public int SerializerOffset()
		```
		- #### SenderActorRefTagOffset
		
		
		
		```
		public int SenderActorRefTagOffset()
		```
		- #### RecipientActorRefTagOffset
		
		
		
		```
		public int RecipientActorRefTagOffset()
		```
		- #### ClassManifestTagOffset
		
		
		
		```
		public int ClassManifestTagOffset()
		```
		- #### MetadataContainerAndLiteralSectionOffset
		
		
		
		```
		public int MetadataContainerAndLiteralSectionOffset()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/remote/artery/EnvelopeBuffer$.html
- https://doc.akka.io/japi/akka/current/akka/remote/artery/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/remote/artery/EnvelopeBuffer$.html](https://doc.akka.io/japi/akka/current/akka/remote/artery/EnvelopeBuffer$.html)*