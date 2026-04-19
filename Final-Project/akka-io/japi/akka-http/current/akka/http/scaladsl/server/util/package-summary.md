---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:58:53Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/util/package-summary.html
title: akka.http.scaladsl.server.util
---

# akka.http.scaladsl.server.util

## Content

# Package akka.http.scaladsl.server.util

- Interface Summary 
| Interface | Description |
| [BinaryPolyFunc](BinaryPolyFunc.html "interface in akka.http.scaladsl.server.util") | Allows the definition of binary poly\-functions (e.g. for folding over tuples). |
| --- | --- |
| [BinaryPolyFunc.Case](BinaryPolyFunc.Case.html "interface in akka.http.scaladsl.server.util")\<A,​B,​Op\> |  |
| [ClassMagnet](ClassMagnet.html "interface in akka.http.scaladsl.server.util")\<T\> | A magnet that wraps a ClassTag |
| [ConstructFromTuple](ConstructFromTuple.html "interface in akka.http.scaladsl.server.util")\<T,​R\> | Constructor for instances of type `R` which can be created from a tuple of type `T`. |
| [Tuple](Tuple.html "interface in akka.http.scaladsl.server.util")\<T\> | Phantom type providing implicit evidence that a given type is a Tuple or Unit. |
| [TupleOps.AppendOne](TupleOps.AppendOne.html "interface in akka.http.scaladsl.server.util")\<P,​S\> |  |
| [TupleOps.FoldLeft](TupleOps.FoldLeft.html "interface in akka.http.scaladsl.server.util")\<In,​T,​Op\> |  |
| [TupleOps.Join](TupleOps.Join.html "interface in akka.http.scaladsl.server.util")\<P,​S\> |  |
| [Tupler](Tupler.html "interface in akka.http.scaladsl.server.util")\<T\> | Provides a way to convert a value into an Tuple. |
- Class Summary 
| Class | Description |
| [ApplyConverter](ApplyConverter.html "class in akka.http.scaladsl.server.util")\<L\> | ApplyConverter allows generic conversion of functions of type `(T1, T2,` |
| --- | --- |
| [ApplyConverter$](ApplyConverter$.html "class in akka.http.scaladsl.server.util") |  |
| [ApplyConverterInstances](ApplyConverterInstances.html "class in akka.http.scaladsl.server.util") |  |
| [BinaryPolyFunc.CaseBuilder](BinaryPolyFunc.CaseBuilder.html "class in akka.http.scaladsl.server.util")\<A,​B\> |  |
| [BinaryPolyFunc$](BinaryPolyFunc$.html "class in akka.http.scaladsl.server.util") |  |
| [ClassMagnet$](ClassMagnet$.html "class in akka.http.scaladsl.server.util") |  |
| [ConstructFromTuple$](ConstructFromTuple$.html "class in akka.http.scaladsl.server.util") |  |
| [ConstructFromTupleInstances](ConstructFromTupleInstances.html "class in akka.http.scaladsl.server.util") |  |
| [LowerPriorityTupler](LowerPriorityTupler.html "class in akka.http.scaladsl.server.util") |  |
| [Tuple$](Tuple$.html "class in akka.http.scaladsl.server.util") |  |
| [TupleAppendOneInstances](TupleAppendOneInstances.html "class in akka.http.scaladsl.server.util") |  |
| [TupleFoldInstances](TupleFoldInstances.html "class in akka.http.scaladsl.server.util") |  |
| [TupleOps](TupleOps.html "class in akka.http.scaladsl.server.util")\<T\> |  |
| [TupleOps.AppendOne$](TupleOps.AppendOne$.html "class in akka.http.scaladsl.server.util") |  |
| [TupleOps.FoldLeft$](TupleOps.FoldLeft$.html "class in akka.http.scaladsl.server.util") |  |
| [TupleOps.Join$](TupleOps.Join$.html "class in akka.http.scaladsl.server.util") |  |
| [TupleOps.Join$.Fold$](TupleOps.Join$.Fold$.html "class in akka.http.scaladsl.server.util") |  |
| [TupleOps.LowLevelJoinImplicits](TupleOps.LowLevelJoinImplicits.html "class in akka.http.scaladsl.server.util") |  |
| [TupleOps$](TupleOps$.html "class in akka.http.scaladsl.server.util") |  |
| [Tupler$](Tupler$.html "class in akka.http.scaladsl.server.util") |  |

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/util/ApplyConverter$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/util/ApplyConverter.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/util/ApplyConverterInstances.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/util/BinaryPolyFunc$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/util/BinaryPolyFunc.Case.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/util/BinaryPolyFunc.CaseBuilder.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/util/BinaryPolyFunc.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/util/ClassMagnet$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/util/ClassMagnet.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/util/ConstructFromTuple$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/util/ConstructFromTuple.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/util/ConstructFromTupleInstances.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/util/LowerPriorityTupler.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/util/Tuple$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/util/Tuple.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/util/TupleAppendOneInstances.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/util/TupleFoldInstances.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/util/TupleOps$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/util/TupleOps.AppendOne$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/util/TupleOps.AppendOne.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/util/TupleOps.FoldLeft$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/util/TupleOps.FoldLeft.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/util/TupleOps.Join$.Fold$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/util/TupleOps.Join$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/util/TupleOps.Join.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/util/TupleOps.LowLevelJoinImplicits.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/util/TupleOps.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/util/Tupler$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/util/Tupler.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/util/package-summary.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/util/package-summary.html)*