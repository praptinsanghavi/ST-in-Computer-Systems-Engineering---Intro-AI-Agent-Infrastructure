---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:20:02Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/persistence/journal/leveldb/CompactionSegmentManagement.html
title: CompactionSegmentManagement
---

# CompactionSegmentManagement

## Content

Package [akka.persistence.journal.leveldb](package-summary.html)
## Interface CompactionSegmentManagement

- All Known Subinterfaces:
`[LeveldbCompaction](LeveldbCompaction.html "interface in akka.persistence.journal.leveldb")`, `[LeveldbStore](LeveldbStore.html "interface in akka.persistence.journal.leveldb")`

All Known Implementing Classes:
`[SharedLeveldbStore](SharedLeveldbStore.html "class in akka.persistence.journal.leveldb")`

---

```
public interface CompactionSegmentManagement
```

INTERNAL API.
 
 Calculates and stores info of compacted "segments" per persistence id.
 

 Assuming a compaction interval N for a given persistence id, then compaction is to be performed
 for segments of message sequence numbers according to the following pattern:
 

 \[0, N), \[N, 2\*N), ... , \[m\*N, (m \+ 1\)\*N)
 

 Once deletion is performed up to a sequence number 'toSeqNr', then 'toSeqNr' will be used to determine the
 rightmost segment up to which compaction will be performed. Eligible segments for compaction are only
 considered to be those which include sequence numbers up to 'toSeqNr' AND whose size is equal to N (the compaction
 interval). This rule implies that if 'toSeqNr' spans an incomplete portion of a rightmost segment, then
 that segment will be omitted from the pending compaction, and will be included into the next one.

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `long` | `[compactionInterval](#compactionInterval(java.lang.String))​(java.lang.String persistenceId)` |  |
	| `scala.collection.immutable.Map<java.lang.String,​java.lang.Object>` | `[compactionIntervals](#compactionIntervals())()` |  |
	| `long` | `[compactionLimit](#compactionLimit(java.lang.String,long))​(java.lang.String persistenceId,  long toSeqNr)` |  |
	| `long` | `[compactionSegment](#compactionSegment(java.lang.String,long))​(java.lang.String persistenceId,  long toSeqNr)` |  |
	| `boolean` | `[isCompactionEnabled](#isCompactionEnabled(java.lang.String))​(java.lang.String persistenceId)` |  |
	| `boolean` | `[isCompactionRequired](#isCompactionRequired(java.lang.String,long))​(java.lang.String persistenceId,  long toSeqNr)` |  |
	| `long` | `[latestCompactionSegment](#latestCompactionSegment(java.lang.String))​(java.lang.String persistenceId)` |  |
	| `void` | `[latestCompactionSegments_$eq](#latestCompactionSegments_$eq(scala.collection.immutable.Map))​(scala.collection.immutable.Map<java.lang.String,​java.lang.Object> x$1)` |  |
	| `boolean` | `[mustCompact](#mustCompact(java.lang.String,long))​(java.lang.String persistenceId,  long toSeqNr)` |  |
	| `void` | `[updateCompactionSegment](#updateCompactionSegment(java.lang.String,long))​(java.lang.String persistenceId,  long compactionSegment)` |  |

- - ### Method Detail
	
	
	
		- #### latestCompactionSegments\_$eq
		
		
		
		```
		void latestCompactionSegments_$eq​(scala.collection.immutable.Map<java.lang.String,​java.lang.Object> x$1)
		```
		- #### compactionIntervals
		
		
		
		```
		scala.collection.immutable.Map<java.lang.String,​java.lang.Object> compactionIntervals()
		```
		- #### updateCompactionSegment
		
		
		
		```
		void updateCompactionSegment​(java.lang.String persistenceId,
		                             long compactionSegment)
		```
		- #### compactionLimit
		
		
		
		```
		long compactionLimit​(java.lang.String persistenceId,
		                     long toSeqNr)
		```
		- #### compactionSegment
		
		
		
		```
		long compactionSegment​(java.lang.String persistenceId,
		                       long toSeqNr)
		```
		- #### mustCompact
		
		
		
		```
		boolean mustCompact​(java.lang.String persistenceId,
		                    long toSeqNr)
		```
		- #### isCompactionEnabled
		
		
		
		```
		boolean isCompactionEnabled​(java.lang.String persistenceId)
		```
		- #### isCompactionRequired
		
		
		
		```
		boolean isCompactionRequired​(java.lang.String persistenceId,
		                             long toSeqNr)
		```
		- #### latestCompactionSegment
		
		
		
		```
		long latestCompactionSegment​(java.lang.String persistenceId)
		```
		- #### compactionInterval
		
		
		
		```
		long compactionInterval​(java.lang.String persistenceId)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/journal/leveldb/LeveldbCompaction.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/journal/leveldb/LeveldbStore.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/journal/leveldb/SharedLeveldbStore.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/journal/leveldb/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/persistence/journal/leveldb/CompactionSegmentManagement.html](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/journal/leveldb/CompactionSegmentManagement.html)*