---
description: 'declaration: package: akka.javasdk.keyvalueentity, interface: ReplicationFilter,
  interface: Builder'
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:26:50Z'
section: sdk
site: akka-io
source_url: https://doc.akka.io/sdk/_attachments/api/akka/javasdk/keyvalueentity/ReplicationFilter.Builder.html
title: ReplicationFilter.Builder
---

# ReplicationFilter.Builder

> **Summary:** declaration: package: akka.javasdk.keyvalueentity, interface: ReplicationFilter, interface: Builder

## Content

Package [akka.javasdk.keyvalueentity](package-summary.html)
# Interface ReplicationFilter.Builder

Enclosing interface:
`[ReplicationFilter](ReplicationFilter.html "interface in akka.javasdk.keyvalueentity")`

---

@DoNotInherit
public static interface ReplicationFilter.Builder
Create the `Builder` with `ReplicationFilter.includeRegion` or the other factory
 methods in [ReplicationFilter](ReplicationFilter.html "interface in akka.javasdk.keyvalueentity").

 Not for user extension, implementation provided by the SDK.

- ## Method Summary

Modifier and Type
Method
Description
`[ReplicationFilter.Builder](ReplicationFilter.Builder.html "interface in akka.javasdk.keyvalueentity")`
`[excludeRegion](#excludeRegion(java.lang.String))([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") region)`

Removes a region from this replication filter.

`[ReplicationFilter.Builder](ReplicationFilter.Builder.html "interface in akka.javasdk.keyvalueentity")`
`[excludeRegions](#excludeRegions(java.util.Set))([Set](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/Set.html "class or interface in java.util")<[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang")> regions)`

Removes multiple regions from this replication filter.

`[ReplicationFilter.Builder](ReplicationFilter.Builder.html "interface in akka.javasdk.keyvalueentity")`
`[includeRegion](#includeRegion(java.lang.String))([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") region)`

Adds a region to this replication filter.

`[ReplicationFilter.Builder](ReplicationFilter.Builder.html "interface in akka.javasdk.keyvalueentity")`
`[includeRegions](#includeRegions(java.util.Set))([Set](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/Set.html "class or interface in java.util")<[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang")> regions)`

Adds multiple regions to this replication filter.

- ## Method Details

	- ### includeRegion
	
	
	[ReplicationFilter.Builder](ReplicationFilter.Builder.html "interface in akka.javasdk.keyvalueentity") includeRegion([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") region)
	Adds a region to this replication filter. The change is additive to any previously included
	 regions.
	
	Parameters:
	`region` \- the region to add
	Returns:
	a new replication filter with the region added
	- ### includeRegions
	
	
	[ReplicationFilter.Builder](ReplicationFilter.Builder.html "interface in akka.javasdk.keyvalueentity") includeRegions([Set](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/Set.html "class or interface in java.util")\<[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang")\> regions)
	Adds multiple regions to this replication filter. The changes are additive to any previously
	 included regions.
	
	Parameters:
	`regions` \- the regions to add
	Returns:
	a new replication filter with the regions added
	- ### excludeRegion
	
	
	[ReplicationFilter.Builder](ReplicationFilter.Builder.html "interface in akka.javasdk.keyvalueentity") excludeRegion([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") region)
	Removes a region from this replication filter.
	
	Parameters:
	`region` \- the region to remove
	Returns:
	a new replication filter with the region removed
	- ### excludeRegions
	
	
	[ReplicationFilter.Builder](ReplicationFilter.Builder.html "interface in akka.javasdk.keyvalueentity") excludeRegions([Set](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/Set.html "class or interface in java.util")\<[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang")\> regions)
	Removes multiple regions from this replication filter.
	
	Parameters:
	`regions` \- the regions to remove
	Returns:
	a new replication filter with the regions removed

## Related Pages (Internal Links)

- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/keyvalueentity/ReplicationFilter.Builder.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/keyvalueentity/ReplicationFilter.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/keyvalueentity/package-summary.html

---
*Source: [https://doc.akka.io/sdk/_attachments/api/akka/javasdk/keyvalueentity/ReplicationFilter.Builder.html](https://doc.akka.io/sdk/_attachments/api/akka/javasdk/keyvalueentity/ReplicationFilter.Builder.html)*