---
description: Akka 2.10.17 - akka.stream.SourceRef
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:54:31Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/stream/SourceRef.html
title: Akka 2.10.17 - akka.stream.SourceRef
---

# Akka 2.10.17 - akka.stream.SourceRef

> **Summary:** Akka 2.10.17 - akka.stream.SourceRef

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../index.html "Permalink")  package [root](../../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/index.html "Permalink")  package [akka](../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/stream/index.html "Permalink")  package [stream](index.html)Definition Classes[akka](../index.html)
- [**](../../akka/stream/impl/index.html "Permalink")  package [impl](impl/index.html "The architecture of Akka Streams internally consists of several distinct layers:")The architecture of Akka Streams internally consists of several distinct layers:

The architecture of Akka Streams internally consists of several distinct layers:

 \* The DSLs like [akka.stream.scaladsl.Flow](scaladsl/Flow.html), [akka.stream.scaladsl.Source](scaladsl/Source.html) etc. are the user facing API
 for composing streams. These DSLs are a thin wrappers around the internal akka.stream.impl.TraversalBuilder
 builder classes. There are Java alternatives of these DSLs in [javadsl](javadsl/index.html) which basically wrap their scala
 counterpart, delegating method calls.
 \* The [akka.stream.stage.GraphStage](stage/GraphStage.html) API is the user facing API for creating new stream operators. These
 classes are used by the akka.stream.impl.fusing.GraphInterpreter which executes islands (subgraphs) of these
 operators
 \* The high level DSLs use the akka.stream.impl.TraversalBuilder classes to build instances of
 akka.stream.impl.Traversal which are the representation of a materializable stream description. These builders
 are immutable and safely shareable. Unlike the top\-level DSLs, these are classic, i.e. elements are treated as
 Any.
 \* The akka.stream.impl.Traversal is the immutable, efficient representation of a stream processing graph that
 can be materialized. The builders exists solely for the purpose of producing a traversal in the end.
 \* The akka.stream.impl.PhasedFusingActorMaterializer is the class that is responsible for traversing and
 interpreting a akka.stream.impl.Traversal. It delegates the actual task of creating executable entities
 and Publishers/Producers to akka.stream.impl.PhaseIslands which are plugins that understand atomic operators
 in the graph and able to turn them into executable entities.
 \* The akka.stream.impl.fusing.GraphInterpreter and its actor backed wrapper akka.stream.impl.fusing.ActorGraphInterpreter
 are used to execute synchronous islands (subgraphs) of [akka.stream.stage.GraphStage](stage/GraphStage.html)s.

For the execution layer, refer to akka.stream.impl.fusing.GraphInterpreter.

#### Design goals

The central piece for both the DSLs and materialization is the akka.stream.impl.Traversal. This is the
representation of an Akka Stream, basically a [akka.stream.scaladsl.RunnableGraph](scaladsl/RunnableGraph.html). The design goals
for akka.stream.impl.Traversal are:

 \* Be able to materialize a graph in one pass over the traversal
 \* Unify materialization and fusing. The materializer should be able to construct all the necessary data structures
 for the interpreters and for connecting them in one go.
 \* Avoid allocations as much as possible.
 \* Biased implementation for the 90% case. Common cases should be as fast as possible:
 \* wiring linear chains should be very fast.
 \* assume that most graphs are mostly linear, with only a few generalized graph constructs thrown in.
 \* materialization should not pay the price of island tracking if there is only a single island
 \* assume that the number of islands is low in general
 \* avoid "copiedModule" i.e. wrappers that exist solely for the purpose of establishing new port identities
 for operators that are used multiple times in the same graph.
 \* Avoid hashmaps and prefer direct array lookup wherever possible

Semantically, a traversal is a list of commands that the materializer must execute to turn the description to a
running stream. In fact, the traversal is nothing more than an immutable list, that is expressed as a tree. A
tree is used to make immutable appends fast (immutable lists only have prepend as O(1\) operation, append is O(N)).
The materializer "recovers" the original sequence by using a local, mutable stack to properly traverse the tree
structure. This is way cheaper than to immutably append to the traversal at each addition.

The "tree\-ness" is expressed by explicit akka.stream.impl.Concat nodes that express that two traversals
need to be traversed in a certain sequence, stashing away the second on a local stack until the first is fully
traversed.

While traversing the traversal (basically following Concat nodes), the materializer will visit the following
command types:

 \* akka.stream.impl.MaterializeAtomic: An atomic module needs to be materialized. This node also contains
 wiring information which we discuss later.
 \* Materialized value computation. This is a stack based "sublanguage" to compute the final materialized value
 on a stack, maintained by the materializer
 \* akka.stream.impl.PushNotUsed push a NotUsed value on the stack
 \* akka.stream.impl.Pop pop the top of the stack and throw away
 \* akka.stream.impl.Transform take the top of the stack, transform it with the provided function and put
 the result back on the top of the stack
 \* akka.stream.impl.Compose take the top two values of the stack, invoke the provided function with these
 values as arguments, then put the calculated value on the top of the stack
 \* Materialized values of atomic operators when visiting a akka.stream.impl.MaterializeAtomic must be
 pushed to the stack automatically. There are no explicit PUSH commands for this
 \* Attributes calculation. These also are a stack language, although much simpler than the materialized value
 commands. For any materialized operator, the top of the attributes stack should be provided as the current
 effective attributes.
 \* akka.stream.impl.PushAttributes combines the attributes on the top of the stack with the given ones and
 puts the result on the attributes stack
 \* akka.stream.impl.PopAttributes removes the top of the attributes stack.
 \* Island tracking. Islands serve two purposes. First, they allow a large graph to be cut into parts that execute
 concurrently with each other, using asynchronous message passing between themselves. Second, they are an
 extension point where "plugins" (akka.stream.impl.PhaseIsland) can be used to specially handle subgraphs.
 Islands can be nested in each other. This makes "holes" in the parent island. Islands also need a stack
 as exiting a "hole" means returning to the parent, enclosing island and continuing where left.
 \* akka.stream.impl.EnterIsland instructs the materializer that the following commands will belong to
 the materialization of a new island (a subgraph). The akka.stream.impl.IslandTag signals to
 the materializer which akka.stream.impl.PhaseIsland should be used to turn operators of this island into
 executable entities.
 \* akka.stream.impl.ExitIsland instructs the materializer that the current island is done and the parent
 island is now the active one again.

 Please note that the stack based materialized value computation eliminates the issues present in the older
 materializer which expressed these computations as an AST. We had to use optimizations for this tree so that
 long Keep.left chains don't explode the stack visiting a large AST. The stack based language sidesteps this issue
 completely as the number of these commands don't increase the stack space required to execute them, unless the
 computation itself requires it (which is not the case in any sane stream combination).

#### Graph model, offsets, slots

 As a mental model, the wiring part of the Traversal (i.e. excluding the stack based sub\-commands tracking
 materialized values, attributes, islands, i.e. things that don't contribute to the wiring structure of the graph)
 translates everything to a single, global, contiguous Array. Every input and output port of each operator is mapped
 to exactly one slot of this "mental array". Input and output ports that are considered wired together simply map
 to the same slot. (In practice, these slots might not be mapped to an actual global array, but multiple local arrays
 using some translation logic, but we will explain this later)

 Input ports are mapped simply to contiguous numbers in the order they are visited. Take for example a simple
 traversal:

 Operator1\[in1, in2, out] \- Operator2\[out] \- Operator3\[in]

 This results in the following slot assignments:

 \* Operator1\.in1 \-\> 0
 \* Operator1\.in2 \-\> 1
 \* Operator3\.in \-\> 2

 The materializer simply visits Stage1, Stage2, Stage3 in order, visiting the input ports of each operator in order.
 It then simply assigns numbers from a counter that is incremented after visiting an input port.
 (Please note that all akka.stream.impl.StreamLayout.AtomicModules maintain a stable order of their ports, so
 this global ordering is well defined)

 Before explaining how output wiring works, it is important to settle some terminology. When we talk about ports
 we refer to their location in the "mental array" as slots. However, there are other entities that needs to
 reference various positions in this "mental array", but in these cases we use the term \_offset\_ to signify that
 these are only used for bookkeeping, they have no "place" in the "array" themselves. In particular:

 \* offset of a module: The offset of an akka.stream.impl.StreamLayout.AtomicModule is defined as the value of
 the input port counter when visiting the akka.stream.impl.MaterializeAtomic node to materialize that module.
 In other words, the offset of a module is the slot of its first input port (if there is any). Since modules
 might not have any input ports it can be that different modules share the same offset, simply because the
 the first one visited does not increase the input port counter.
 \* offset of segments, islands: Defined similarly to module. The offset of an island or a segment is simply the
 value of the input port counter (or the first unallocated slot).

 For example:

 Module1\[in1 \= 0, in2 \= 1] \- Module2\[out] \- Module3\[in \= 2]

 The offset of Module1 is 0, while Module2 and Module3 share the same offset of 2\. Note that only input ports (slots)
 contribute to the offset of a module in a traversal.

 Output ports are wired relative to the offset of the module they are contained in. When the materializer visits
 a akka.stream.impl.MaterializeAtomic node, it contains an Array that maps ports to a relative offset. To
 calculate the slot that is assigned to an output port the following formula is used:

 slot \= offsetOfModule \+ outToSlots(out.id)

 Where outToSlots is the array contained in the akka.stream.impl.MaterializeAtomic node.

#### Relative addressing

 The power of this structure comes from the fact that slots are assigned in a relative manner:

 \* input ports are assigned in sequence so the slots assigned to the input ports of a subgraph depend on the
 subgraph's position in the traversal
 \* output ports are assigned relative to the offset of their owner module, which is in turn relative to its first
 (potential) input port (which is relative, too, because of the previous point)

 This setup allows combining subgraphs without touching their internal wirings as all their internal wirings will
 properly resolve due to everything being relative:

 \+\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\+ \+\-\-\-\-\+
 \| \| \| \|
 \|\-\-\-\-\-\-\-\-\-Graph1\-\-\-\-\-\-\-\-\-\|\-\-\- .... \-\-\-\|\-\-\-\-Graph2\-\-\-\-\|

 It is important to note that due to reusability, an Akka Stream graph may contain the same atomic or composite
 multiple times in the same graph. Since these must be distinguished from each other somehow, they need port mapping
 (i.e. a new set of ports) to ensure that the ports of one graph are distinguishable from another. Because how
 the traversal relative addressing works, these are \_temporary\_ though, once all internal wirings are ready, these
 mappings can be effectively dropped as the global slot assignments uniquely identify what is wired to what. For
 example since Graph1 is visited before Graph2 all of the slots or offsets it uses are different from Graph2 leaving
 no room for misinterpretation.

#### Port mapping

 Port mapping is the way how the DSL can distinguish between multiple instances of the same graph included multiple
 times. For example in the Graph DSL:

 val merge1 \= builder.add(Merge)
 val merge2 \= builder.add(Merge)

 the port merge1\.out must be different from merge2\.out.

 For efficiency reasons, the linear and graph DSLs use different akka.stream.impl.TraversalBuilder types to
 build the akka.stream.impl.Traversal (we will discuss these next). One of the differences between the two
 builders are their approach to port mapping.

 The simpler case is the akka.stream.impl.LinearTraversalBuilder. This builder only allows building linear
 chains of operators, hence, it can only have at most one [OutPort](OutPort.html) and [InPort](InPort.html) unwired. Since there is no
 possible ambiguity between these two port types, there is no need for port mapping for these. Conversely,
 for those internal ports that are already wired, there is no need for port mapping as their relative wiring
 is not ambiguous (see previous section). As a result, the akka.stream.impl.LinearTraversalBuilder does not
 use any port mapping.

 The generic graph builder class akka.stream.impl.CompositeTraversalBuilder needs port mapping as it allows
 adding any kind of builders in any order. When adding a module (encoded as another akka.stream.impl.TraversalBuilder)
 there are two entities in play:

 \* The module (builder) to be added. This builder has a few ports unwired which are usually packaged in a [Shape](Shape.html)
 which is stored alongside with the builder in the [Graph](Graph.html) of the DSL. When invoking methods on this builder
 these set of ports must be used.
 \* The module that we are growing. This module needs a new set of ports to be used as it might add this module
 multiple times and needs to disambiguate these ports.

 Adding to the akka.stream.impl.CompositeTraversalBuilder involves the following steps (pseudocode):

 val newShape \= shape.deepCopy() // Copy the shape of the module we want to add
 val newBuilder \= builder.add(submodule, newShape) // Add the module, and register it with the new shape
 newBuilder.wire(newShape.in, ...) // Use the new ports to wire

 What happens in the background is that [Shape.deepCopy](Shape.html#deepCopy():akka.stream.Shape) creates copies of the ports, and fills their
 mappedTo field to point to their original port counterpart. Whenever we call wire in the outer module, it
 delegates calls to the submodule, but using the original port (as the submodule builder has no knowledge of
 the external mapping):

 submodule.assign(port.mappedTo, ...) // enclosing module delegating to submodule, translating ports back

 Visualizing this relationship:

 \+\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\+
 \| in', in" \-\-\-\-\-\-\-\-\-\+ \| in' and in" both resolve to in
 \| \| .mappedTo v .mappedTo \| but they will be used on \_different\_ builders
 \| \+\-\-\-\-\-\-\-\-\-\-\-\-\-\+ \+\-\-\-\-\-\-\-\-\-\-\-\-\-\+ \|
 \| \| in \| \| in \| \| (delegation happens recursively in AddedModule)
 \| \| AddedModule \| \| AddedModule \| \|

 It is worth to note that the submodule might also continue this map\-and\-delegate chain to further submodules until
 a builder is reached that can directly perform the operation. In other words, the depth of nesting is equal to
 the length of mappedTo chaining.

 IMPORTANT: When wiring in the enclosing module the new ports/shape MUST be used, using the original ports/shape
 will lead to incorrect state.

#### TraversalBuilders

 In order to understand why builders are needed, consider wiring two ports together. Actually, we don't need to
 wire input ports anywhere. Their slot is implicitly assigned by their position in the traversal, there is no
 additional state we need to track. On the other hand, we cannot build a akka.stream.impl.MaterializeAtomic
 node until the mapping array outToSlots is fully calculated. In other words, in reality, we don't wire input ports
 anywhere, we only assign output ports to slots. The builders exist mainly to keep track all the necessary
 information to be able to assign output ports, build the outToSlots array and finally the akka.stream.impl.MaterializeAtomic
 node. The consequence of this that a akka.stream.impl.Traversal can be constructed as soon as all output ports
 are wired ("unwired" inputs don't matter).

 There is a specific builder that is used for the cases where all outputs have been wired:
 akka.stream.impl.CompletedTraversalBuilder. This builder type simply contains the completed traversal plus
 some additional data. The reason why this builder type exists is to keep auxiliary data structures required for
 output port mapping only while they are needed, and shed them as soon as they are not needed anymore. Since builders
 may recursively contain other builders, as soon as internals are completed those contained builders transition
 to completed state and drop all additional data structures. This is very GC friendly as many intermediate graphs
 exist only in a method call, and hence most of the additional data structures are dropped before method return and
 can be efficiently collected by the GC.

 The most generic builder is akka.stream.impl.CompositeTraversalBuilder. There are two main considerations
 this builder needs to consider:

 \* Enclosed modules (builders) must have a stable position in the final traversal for relative addressing to work.
 Since module offsets are calculated by traversal position, and outputs are wired relative to module offset, this
 is critical.
 \* Enclosed builders might not be complete yet (i.e. have unwired outputs) and hence they cannot immediately give
 a Traversal.

 The composite builder keeps a temporary list of traversal steps (in reverse order because of immutable lists)
 it needs to create once it is completed (all outputs wired). These steps refer to the traversal of submodules
 as a akka.stream.impl.BuilderKey which is just a placeholder where the traversal of the submodule will be
 stitched in. This akka.stream.impl.BuilderKey is also a key to a map which contains the evolving builder.
 The importance of this "preimage" traversal is that it keeps position of submodules stable, making relative
 addressing possible.

 Once the composite is completed, it takes these steps (now reversing it back to normal), and builds the traversal
 using the submodule traversals referred to by akka.stream.impl.BuilderKey. Note that at this point all the
 submodules are akka.stream.impl.CompletedTraversalBuilders because there are no unwired outputs and hence the
 Traversal can be assembled. As the builder evolves over time, more and more of its akka.stream.impl.BuilderKeys
 will refer to akka.stream.impl.CompletedTraversalBuilders, shedding much of the temporary data structures.

 Refer to akka.stream.impl.CompositeTraversalBuilder for more details.

 The akka.stream.impl.LinearTraversalBuilder is a much simpler beast. For efficiency, it tries to work as much
 as possible directly on the akka.stream.impl.Traversal avoiding auxiliary structures. The two main considerations
 for this builder are:

 \* [akka.stream.scaladsl.Source](scaladsl/Source.html) and [akka.stream.scaladsl.Flow](scaladsl/Flow.html) contain an unwired output port. Yet, we would
 like to build the traversal directly as much as possible, even though the builder is not yet completed
 \* akka.stream.impl.CompositeTraversalBuilders might be included in a linear chain. These cannot provide a
 traversal before they are fully completed.

 The linear builder, although it is one class, comes in basically two flavors:

 \* Purely linear builder: this contains only other linear builders, or all the composites that it includes
 have been fully wired before and hence their traversal is now fully incorporated. Basically this kind
 of builder only contains the akka.stream.impl.Traversal and only a couple of extra fields.
 \* Linear builder with an incomplete composite at the end (output): In this case, we have an incomplete composite.
 It can only be at the end, since this is the only position where an output port can be unwired. We need to
 carry this builder with us until the output port is finally wired, in which case we incorporate its traversal
 into the already complete one, and hopefully transition to a purely linear builder.

 If we consider the purely linear case, we still need to figure out how can we provide a traversal even though
 the last output port is unwired. The trick that is used is to wire this output port optimistically to the
 relative address \-1 which is almost always correct (why \-1? explained a bit later). If it turns out to be incorrect
 later, we fix it by the helper method akka.stream.impl.Traversal.rewireFirstTo which tears down the traversal
 until the wrong module is found, then fixes the port assignment. This is only possible on purely linear layouts though.
 Again, this is an example of the 90% rule. Most appends will not need this rewiring and hence be as fast as possible
 while the rarer cases suffering a minor penalty.

 In the case where the last module is a composite, the above trick would not work as nothing guarantees that the
 module that exposed its output port is at an expected position in the traversal. Instead, we simply keep around
 this composite and delay construction of its part of the traversal. For details see akka.stream.impl.LinearTraversalBuilder
 as these cases are heavily commented and explained in the code.

 There is another peculiarity of the linear builder we need to explain. Namely, it builds the traversal in reverse
 order, i.e. from Sinks towards Sources. THIS CAN BE SUPER CONFUSING AT TIMES SO PAY ATTENTION! There are two
 important reasons why this is needed:

 \* Prepending to immutable lists is more efficient. Even though we encode our traversal list as a tree, we would
 need stack space at materialization time as much as the length of the list if we would append to it instead of
 prepending.
 \* Prepending means that most output ports refer to slots visited before, i.e. output relative offsets are negative.
 This means that during materialization, output ports will be wired to slots that the materializer visited before
 which enables an efficient one\-pass materialization design. The importance of this is discussed later below.

 To visualize this, imagine a simple stream:

 \[Source.out] \-\> \[Map.in, Map.out] \-\> \[Sink.in]

 The traversal:

 offs \= 0 offs \= 1 offs \= 1
 \[Sink.in \= 0] \<\- \[Map.in \= 1, Map.out \= \-1] \<\- \[Source.out \= \-1]

 Since the traversal steps are reversed compared to the DSL order, it is important to reverse materialized value
 computation, too.

#### Islands and local slots

 All what we have discussed so far referred to the "mental array", the global address space in which slots
 are assigned to ports. This model describes the wiring of the graph perfectly, but it does not map to the local
 data structures needed by materialization when there are islands present. One of the important goals of this
 layout data structure is to be able to produce the data structures used by the akka.stream.impl.fusing.GraphInterpreter
 directly, without much translation. Unfortunately if there is an island inside a traversal, it might leave gaps
 in the address space:

 \|\-\-\-\-Island1\-\-\-\-\-\|\-\-\-\-Island2(enclosed)\-\-\-\-\|\-\-\-\-\-Island1\-\-\-\-\-\|

 Since we visit Island2 before returning to Island1, the naive approach would leave a large gap between the last
 input port visited before entering Island2 and the first input port visited when returning to Island1\. What
 we would like to have instead is a contiguous slot assignment from the viewpoint of Island1\. This is where
 akka.stream.impl.PhasedFusingActorMaterializer and its akka.stream.impl.IslandTracking helper comes into
 the picture. These classes do the heavy\-lifting of traversing the traversal and then mapping global slots to
 slots local to the island, delegating then the local wiring to akka.stream.impl.PhaseIsland implementations.
 For example the akka.stream.impl.GraphStageIsland sees only a contigous slot\-space and hence it can directly
 construct the array for the interpreter. It is not aware of the presence of other islands or how it is represented
 in the global slot\-space.

#### Materialization

 Materialzation is orchestrated by the akka.stream.impl.PhasedFusingActorMaterializer. It basically decodes the
 traversal and handles islands. This top\-level materializer does not really handle the wiring \_inside\_ an island,
 it only handles wiring of Publishers and Subscribers that connect islands. Instead it delegates in\-island wiring
 to akka.stream.impl.PhaseIslands. For example a default fused island will be actually wired by
 akka.stream.impl.GraphStageIsland.

 First, look at a traversal that has two islands:

 \|\-\-\-\-Island1\-\-\-\-\-\|\-\-\-\-Island2(enclosed)\-\-\-\-\|\-\-\-\-\-Island1\-\-\-\-\-\|

 In this traversal, we have two islands, and three, so called \_segments\_. Segments are simply contiguous range of
 slots between akka.stream.impl.EnterIsland or akka.stream.impl.ExitIsland tags (in any combination). When
 the materializer encounters either an enter or exit command, it saves various information about the segment it
 just completed (what is its offset, how long it is measured in input slots, etc.). This information is later
 used to figure out if a wiring crosses island boundaries or is it local to the island.

 It is important to note that the data structure for this is only allocated when there are islands. This is again
 the 90% rule in action. In addition, these data structures are [java.util.ArrayList](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/ArrayList.html) instances, where lookups
 according to some value are implemented as simple linear scans. Since in 90% of the cases these structures are
 very short, this is the most efficient approach. Cases where this can be a performance problem are very\-very special
 and likely not happen in practice (no graph should contain more than a dozen of islands for example).

 When it comes to deciding whether a wiring is cross\-island or local, there are two cases possible:

 \* we encountered an output port that is wired backwards (relative address is negative). In this case we already
 have all the data necessary to resolve the question.
 \* we encountered an output port that is wired forward (relative address is positive). In this case we have not
 yet visited that part of the traversal where the assignment points.

 If we want to keep the one\-pass design of the materializer, we need to delay forward wirings until we have all
 the information needed, i.e. we visit the target in port. The akka.stream.impl.PhasedFusingActorMaterializer
 has a data structure for tracking forward wires which it consults whenever it visits an input port. Again, this
 is only allocated if needed, and it is again an array with linear scan lookup. Once the target input port have
 been found, the rules of the wiring are the same as for backwards wiring.

 backward wire (to the visited part) \<\-\-\-\-\-\-\+ \+\-\-\-\-\-\-\> forward wire (into the unknown)
 \| \|
 \|\-\-\-\-Island1\-\-\-\-\-\|\-\-\-\-Island2(enclosed)\-\-\-\-\-\-\-\- ... (this is where we are now)

 Remember, the akka.stream.impl.LinearTraversalBuilder builds its akka.stream.impl.Traversal in backwards
 order, so since most of the graphs are constructed by the linear DSLs almost all wirings will be backwards
 (90% rule in action again).

##### Backward wirings

 When it comes to resolving wirings and calculating the local slots for all the islands involved there are three
 distinct cases.

 A wiring can be in\-segment:

 \+\-\-\-\-\-\-\-\-\-\-\-\-\-\-\+
 \| \|
 \|\-\-\-\-Island1\-\-\-\-\-\|\-\-\-\-Island2(enclosed)\-\-\-\-\|\-\-\-\-\-Island1\-\-\-\-\-\|

 This means that the slot assigned to the output port still belongs to the current segment. This is easy to detect
 as the akka.stream.impl.IslandTracking class tracks the offset of the current segment. If the target input
 slot is larger or equal than this offset, and the wiring is backwards, then the wiring is strictly local to the
 island. The materializer will simply delegate to the akka.stream.impl.PhaseIsland to do the internal wiring.
 Since we know the offset of the segment in the local space of this island, calculating the local slot for the
 akka.stream.impl.PhaseIsland is simple. (This is fully documented with diagrams
 in akka.stream.impl.IslandTracking)

 A wiring can be cross\-segment, in\-island:

 \+\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\+
 \| \|
 \|\-\-\-\-Island1\-\-\-\-\-\|\-\-\-\-Island2(enclosed)\-\-\-\-\|\-\-\-\-\-Island1\-\-\-\-\-\|

 In this case, the target slot is in another, but already visited segment. The akka.stream.impl.IslandTracking
 class needs to first find the segment in which the target slot is. Since each segment keeps a reference to its
 akka.stream.impl.PhaseIsland instance that handles the internal wiring a simple reference equality check
 will tell us if the target segment is in the same island or not. In this case it is, so all we need is to
 compensate for any possible holes (punched by enclosed islands) to calculate the local slot for the island
 and call the appropriate callback on the akka.stream.impl.PhaseIsland. (This is fully documented with diagrams
 in akka.stream.impl.IslandTracking)

 Finally a wiring can be cross\-segment, cross\-island:

 \+\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\+
 \| \|
 \|\-\-\-\-Island1\-\-\-\-\-\|\-\-\-\-Island2(enclosed)\-\-\-\-\|\-\-\-\-\-Island1\-\-\-\-\-\|

 This means, that the steps were similar as in the previous case until that point where we check the reference
 equality of the current akka.stream.impl.PhaseIsland with that of the target segment (we have already found
 the target segment). In this case, we need to calculate the local slot in the target island (similar to the
 previous case) and try to wire the two islands together. Now, instead of delegating the wiring to the phases, we
 ask the output akka.stream.impl.PhaseIsland to provide a Publisher and then we ask the target island to
 take this Publisher.

 Refer to akka.stream.impl.IslandTracking for all the nasty details of local slot resolution. It is also
 recommended to try out a few examples with akka.stream.impl.PhasedFusingActorMaterializer.Debug turned on, it
 will detail every step of the island tracking and slot resolution steps.

#### Utilities

 Useful utilities are:

 \* akka.stream.impl.PhasedFusingActorMaterializer.Debug: if this flag is turned on, the materializer will
 log the steps it takes
 \* akka.stream.impl.TraversalBuilder.printTraversal: Prints the Traversal in a readable format
 \* akka.stream.impl.TraversalBuilder.printWiring: Prints the calculated port assignments. Useful for
 debugging if everything is wired to the right thing.

Definition Classes[stream](index.html)
- [**](../../akka/stream/javadsl/index.html "Permalink")  package [javadsl](javadsl/index.html)Definition Classes[stream](index.html)
- [**](../../akka/stream/scaladsl/index.html "Permalink")  package [scaladsl](scaladsl/index.html "Scala API: The flow DSL allows the formulation of stream transformations based on some input.")Scala API: The flow DSL allows the formulation of stream transformations based on some
input.

Scala API: The flow DSL allows the formulation of stream transformations based on some
input. The starting point is called [Source](scaladsl/Source.html) and can be a collection, an iterator,
a block of code which is evaluated repeatedly or a org.reactivestreams.Publisher.
A flow with an attached input and open output is also a [Source](scaladsl/Source.html).

A flow may also be defined without an attached input or output and that is then
a [Flow](scaladsl/Flow.html). The `Flow` can be connected to the `Source` later by using [Source\#via](scaladsl/Source.html#via[T,Mat2](flow:akka.stream.Graph[akka.stream.FlowShape[Out,T],Mat2]):Source.this.Repr[T]) with
the flow as argument, and it remains a [Source](scaladsl/Source.html).

Transformations can be appended to `Source` and `Flow` with the operations
defined in [FlowOps](scaladsl/FlowOps.html). Each DSL element produces a new flow that can be further transformed,
building up a description of the complete transformation pipeline.

The termination point of a flow is called [Sink](scaladsl/Sink.html) and can for example be a `Future` or
org.reactivestreams.Subscriber. A flow with an attached output and open input
is also a [Sink](scaladsl/Sink.html).

If a flow has both an attached input and an attached output it becomes a [RunnableGraph](scaladsl/RunnableGraph.html).
In order to execute this pipeline the flow must be materialized by calling [RunnableGraph\#run](scaladsl/RunnableGraph.html#run()(implicitmaterializer:akka.stream.Materializer):Mat) on it.

You can create your `Source`, `Flow` and `Sink` in any order and then wire them together before
they are materialized by connecting them using [Flow\#via](scaladsl/Flow.html#via[T,Mat2](flow:akka.stream.Graph[akka.stream.FlowShape[Out,T],Mat2]):Flow.this.Repr[T]) and [Flow\#to](scaladsl/Flow.html#to[Mat2](sink:akka.stream.Graph[akka.stream.SinkShape[Out],Mat2]):akka.stream.scaladsl.Sink[In,Mat]), or connecting them into a
[GraphDSL](scaladsl/GraphDSL$.html) with fan\-in and fan\-out elements.

See [Reactive Streams](https://github.com/reactive-streams/reactive-streams/) for
details on org.reactivestreams.Publisher and org.reactivestreams.Subscriber.

It should be noted that the streams modeled by this library are “hot”,
meaning that they asynchronously flow through a series of processors without
detailed control by the user. In particular it is not predictable how many
elements a given transformation step might buffer before handing elements
downstream, which means that transformation functions may be invoked more
often than for corresponding transformations on strict collections like
List. \*An important consequence\* is that elements that were produced
into a stream may be discarded by later processors, e.g. when using the
\#take operator.

By default every operation is executed within its own [akka.actor.Actor](../actor/Actor.html)
to enable full pipelining of the chained set of computations. This behavior
is determined by the [akka.stream.Materializer](Materializer.html) which is required
by those methods that materialize the Flow into a series of
org.reactivestreams.Processor instances. The returned reactive stream
is fully started and active.

Definition Classes[stream](index.html)
- [**](../../akka/stream/snapshot/index.html "Permalink")  package [snapshot](snapshot/index.html)Definition Classes[stream](index.html)
- [**](../../akka/stream/stage/index.html "Permalink")  package [stage](stage/index.html)Definition Classes[stream](index.html)
- [**](../../akka/stream/testkit/index.html "Permalink")  package [testkit](testkit/index.html)Definition Classes[stream](index.html)
- [**](../../akka/stream/typed/index.html "Permalink")  package [typed](typed/index.html)Definition Classes[stream](index.html)
- [AbruptIOTerminationException](AbruptIOTerminationException.html "This exception signals that a stream has been completed by an onError signal while there was still IO operations in progress.")
- [AbruptStageTerminationException](AbruptStageTerminationException.html "Signal that the operator was abruptly terminated, usually seen as a call to postStop of the GraphStageLogic without any of the handler callbacks seeing completion or failure from upstream or cancellation from downstream.")
- [AbruptStreamTerminationException](AbruptStreamTerminationException.html "A base exception for abrupt stream termination.")
- [AbruptTerminationException](AbruptTerminationException.html "This exception signals that an actor implementing a Reactive Streams Subscriber, Publisher or Processor has been terminated without being notified by an onError, onComplete or cancel signal.")
- [AbstractShape](AbstractShape.html "Java API for creating custom Shape types.")
- [ActorAttributes](ActorAttributes$.html "Attributes for the Materializer.")
- [ActorMaterializer](ActorMaterializer.html "An ActorMaterializer takes a stream blueprint and turns it into a running stream.")
- [ActorMaterializerSettings](ActorMaterializerSettings.html "This class describes the configurable properties of the ActorMaterializer.")
- [AmorphousShape](AmorphousShape.html "This type of Shape can express any number of inputs and outputs at the expense of forgetting about their specific types.")
- [Attributes](Attributes.html "Holds attributes which can be used to alter akka.stream.scaladsl.Flow / akka.stream.javadsl.Flow or akka.stream.scaladsl.GraphDSL / akka.stream.javadsl.GraphDSL materialization.")
- [BackpressureTimeoutException](BackpressureTimeoutException.html)
- [BidiShape](BidiShape.html "A bidirectional flow of elements that consequently has two inputs and two outputs, arranged like this:")
- [BindFailedException](BindFailedException.html)
- [BoundedSourceQueue](BoundedSourceQueue.html "A queue of the given size that gives immediate feedback whether an element could be enqueued or not.")
- [BufferOverflowException](BufferOverflowException.html)
- [Client](Client.html "The client is usually the side that consumes the service provided by its interlocutor.")
- [ClosedShape](ClosedShape.html "This Shape is used for graphs that have neither open inputs nor open outputs.")
- [CompletionStrategy](CompletionStrategy.html)
- [CompletionTimeoutException](CompletionTimeoutException.html)
- [ConnectionException](ConnectionException.html)
- [DelayOverflowStrategy](DelayOverflowStrategy.html "Represents a strategy that decides how to deal with a buffer of time based operator that is full but is about to receive a new element.")
- [EagerClose](EagerClose.html "see TLSClosing")
- [FanInShape](FanInShape.html)
- [FanInShape10](FanInShape10.html)
- [FanInShape11](FanInShape11.html)
- [FanInShape12](FanInShape12.html)
- [FanInShape13](FanInShape13.html)
- [FanInShape14](FanInShape14.html)
- [FanInShape15](FanInShape15.html)
- [FanInShape16](FanInShape16.html)
- [FanInShape17](FanInShape17.html)
- [FanInShape18](FanInShape18.html)
- [FanInShape19](FanInShape19.html)
- [FanInShape2](FanInShape2.html)
- [FanInShape20](FanInShape20.html)
- [FanInShape21](FanInShape21.html)
- [FanInShape22](FanInShape22.html)
- [FanInShape3](FanInShape3.html)
- [FanInShape4](FanInShape4.html)
- [FanInShape5](FanInShape5.html)
- [FanInShape6](FanInShape6.html)
- [FanInShape7](FanInShape7.html)
- [FanInShape8](FanInShape8.html)
- [FanInShape9](FanInShape9.html)
- [FanOutShape](FanOutShape.html)
- [FanOutShape10](FanOutShape10.html)
- [FanOutShape11](FanOutShape11.html)
- [FanOutShape12](FanOutShape12.html)
- [FanOutShape13](FanOutShape13.html)
- [FanOutShape14](FanOutShape14.html)
- [FanOutShape15](FanOutShape15.html)
- [FanOutShape16](FanOutShape16.html)
- [FanOutShape17](FanOutShape17.html)
- [FanOutShape18](FanOutShape18.html)
- [FanOutShape19](FanOutShape19.html)
- [FanOutShape2](FanOutShape2.html)
- [FanOutShape20](FanOutShape20.html)
- [FanOutShape21](FanOutShape21.html)
- [FanOutShape22](FanOutShape22.html)
- [FanOutShape3](FanOutShape3.html)
- [FanOutShape4](FanOutShape4.html)
- [FanOutShape5](FanOutShape5.html)
- [FanOutShape6](FanOutShape6.html)
- [FanOutShape7](FanOutShape7.html)
- [FanOutShape8](FanOutShape8.html)
- [FanOutShape9](FanOutShape9.html)
- [FlowMonitor](FlowMonitor.html "Used to monitor the state of a stream")
- [FlowMonitorState](FlowMonitorState$.html)
- [FlowShape](FlowShape.html "A Flow Shape has exactly one input and one output, it looks from the outside like a pipe (but it can be a complex topology of streams within of course).")
- [Graph](Graph.html "Not intended to be directly extended by user classes")
- [IOOperationIncompleteException](IOOperationIncompleteException.html "This exception signals that a stream has been completed or has an error while there was still IO operations in progress")
- [IOResult](IOResult.html "Holds a result of an IO operation.")
- [IOSettings](IOSettings.html)
- [IgnoreBoth](IgnoreBoth.html "see TLSClosing")
- [IgnoreCancel](IgnoreCancel.html "see TLSClosing")
- [IgnoreComplete](IgnoreComplete.html "see TLSClosing")
- [InPort](InPort.html "An input port of a StreamLayout.Module.")
- [InitialTimeoutException](InitialTimeoutException.html)
- [Inlet](Inlet.html)
- [InvalidPartnerActorException](InvalidPartnerActorException.html "Stream refs establish a connection between a local and remote actor, representing the origin and remote sides of a stream.")
- [InvalidSequenceNumberException](InvalidSequenceNumberException.html)
- [KillSwitch](KillSwitch.html "A KillSwitch allows completion of Graphs from the outside by completing Graphs of FlowShape linked to the switch.")
- [KillSwitches](KillSwitches$.html "Creates shared or single kill switches which can be used to control completion of graphs from the outside.")
- [MaterializationException](MaterializationException.html "This exception or subtypes thereof should be used to signal materialization failures.")
- [Materializer](Materializer.html "The Materializer is the component responsible for turning a stream blueprint into a running stream.")
- [MaterializerLoggingProvider](MaterializerLoggingProvider.html "Not for user extension")
- [NeverMaterializedException](NeverMaterializedException.html)
- [OutPort](OutPort.html "An output port of a StreamLayout.Module.")
- [Outlet](Outlet.html)
- [OverflowStrategy](OverflowStrategy.html "Represents a strategy that decides how to deal with a buffer that is full but is about to receive a new element.")
- [QueueCompletionResult](QueueCompletionResult.html "Not for user extension")
- [QueueOfferResult](QueueOfferResult.html "Not for user extension")
- [RateExceededException](RateExceededException.html "Exception that is thrown when rated controlled by stream is exceeded")
- [RemoteStreamRefActorTerminatedException](RemoteStreamRefActorTerminatedException.html)
- [RestartSettings](RestartSettings.html)
- [Server](Server.html "The server is usually the side the provides the service to its interlocutor.")
- [Shape](Shape.html "A Shape describes the inlets and outlets of a Graph.")
- [SharedKillSwitch](SharedKillSwitch.html "A SharedKillSwitch is a provider for Graphs of FlowShape that can be completed or failed from the outside.")
- [SinkRef](SinkRef.html "A SinkRef allows sharing a \"reference\" to a Sink with others, with the main purpose of crossing a network boundary.")
- [SinkShape](SinkShape.html "A Sink Shape has exactly one input and no outputs, it models a data sink.")
- SourceRef
- [SourceShape](SourceShape.html "A Source Shape has exactly one output and no inputs, it models a source of data.")
- [StreamDetachedException](StreamDetachedException.html "This exception signals that materialized value is already detached from stream.")
- [StreamIdleTimeoutException](StreamIdleTimeoutException.html)
- [StreamLimitReachedException](StreamLimitReachedException.html)
- [StreamRefAttributes](StreamRefAttributes$.html "Attributes for stream refs (akka.stream.SourceRef and akka.stream.SinkRef).")
- [StreamRefMessages](StreamRefMessages.html)
- [StreamRefResolver](StreamRefResolver.html "The stream ref resolver provides a way to serialize and deserialize streamrefs in user serializers.")
- [StreamRefSettings](StreamRefSettings.html "Settings specific to SourceRef and SinkRef.")
- [StreamRefSubscriptionTimeoutException](StreamRefSubscriptionTimeoutException.html)
- [StreamSubscriptionTimeoutSettings](StreamSubscriptionTimeoutSettings.html "Leaked publishers and subscribers are cleaned up when they are not used within a given deadline, configured by StreamSubscriptionTimeoutSettings.")
- [StreamSubscriptionTimeoutTerminationMode](StreamSubscriptionTimeoutTerminationMode.html "This mode describes what shall happen when the subscription timeout expires for substream Publishers created by operations like prefixAndTail.")
- [StreamTcpException](StreamTcpException.html)
- [StreamTimeoutException](StreamTimeoutException.html "Base class for timeout exceptions specific to Akka Streams")
- [SubscriptionWithCancelException](SubscriptionWithCancelException.html "Extension of Subscription that allows to pass a cause when a subscription is cancelled.")
- [SubstreamCancelStrategy](SubstreamCancelStrategy.html "Represents a strategy that decides how to deal with substream events.")
- [Supervision](Supervision$.html)
- [SystemMaterializer](SystemMaterializer.html)
- [TLSClientAuth](TLSClientAuth.html "An SSLEngine can either demand, allow or ignore its peer’s authentication (via certificates), where Need will fail the handshake if the peer does not provide valid credentials, Want allows the peer to send credentials and verifies them if provided, and None disables peer certificate verification.")
- [TLSClosing](TLSClosing.html "All streams in Akka are unidirectional: while in a complex flow graph data may flow in multiple directions these individual flows are independent from each other.")
- [TLSProtocol](TLSProtocol$.html)
- [TLSRole](TLSRole.html)
- [TargetRefNotInitializedYetException](TargetRefNotInitializedYetException.html)
- [ThrottleMode](ThrottleMode.html "Represents a mode that decides how to deal exceed rate for Throttle operator")
- [TooManySubstreamsOpenException](TooManySubstreamsOpenException.html "This exception signals that the maximum number of substreams declared has been exceeded.")
- [UniformFanInShape](UniformFanInShape.html)
- [UniformFanOutShape](UniformFanOutShape.html)
- [UniqueKillSwitch](UniqueKillSwitch.html "A UniqueKillSwitch is always a result of a materialization (unlike SharedKillSwitch which is constructed before any materialization) and it always controls that graph and operator which yielded the materialized value.")
- [WatchedActorTerminatedException](WatchedActorTerminatedException.html "Used as failure exception by an ask operator if the target actor terminates.")
[t](SourceRef$.html "See companion object")[akka](../index.html).[stream](index.html)

# [SourceRef](SourceRef$.html "See companion object")[**](../../akka/stream/SourceRef.html "Permalink")

### Companion [object SourceRef](SourceRef$.html "See companion object")

#### trait SourceRef\[T] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

A SourceRef allows sharing a "reference" with others, with the main purpose of crossing a network boundary.
Usually obtaining a SourceRef would be done via Actor messaging, in which one system asks a remote one,
to share some data with it, and the remote one decides to do so in a back\-pressured streaming fashion \-\- using a stream ref.

To create a SourceRef you have to materialize the `Source` that you want to obtain a reference to by attaching it to a `Sink.sourceRef`.

Stream refs can be seen as Reactive Streams over network boundaries.
See also [akka.stream.SinkRef](SinkRef.html) which is the dual of a `SourceRef`.

For additional configuration see `reference.conf` as well as [akka.stream.StreamRefAttributes](StreamRefAttributes$.html).

Not for user extension.

Annotations@[DoNotInherit](../annotation/DoNotInherit.html)() Source[StreamRefs.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-stream/src/main/scala/akka/stream/StreamRefs.scala#L79)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. SourceRef
2. AnyRef
3. Any
Implicitly  
1. by convertRefToSource
2. by any2stringadd
3. by StringFormat
4. by Ensuring
5. by ArrowAssoc
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Abstract Value Members

1. [**](../../akka/stream/SourceRef.html#source:akka.stream.scaladsl.Source[T,akka.NotUsed] "Permalink") abstract  def source: [Source](scaladsl/Source.html)\[T, [NotUsed](../NotUsed.html)]Scala API: Get Source underlying to this source ref.
### Concrete Value Members

1. [**](../../akka/stream/SourceRef.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/stream/SourceRef.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/stream/SourceRef.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from SourceRef\[T] toany2stringadd\[SourceRef\[T]] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../akka/stream/SourceRef.html#++[U>:Out,M](that:akka.stream.Graph[akka.stream.SourceShape[U],M]):FlowOps.this.Repr[U] "Permalink")  def \+\+\[U \>: Out, M](that: [Graph](Graph.html)\[[SourceShape](SourceShape.html)\[U], M]): [Source](scaladsl/Source.html)\[U, [NotUsed](../NotUsed.html)]Concatenates this [Flow](scaladsl/Flow.html) with the given [Source](scaladsl/Source.html) so the first element
emitted by that source is emitted after the last element of this
flow.

Concatenates this [Flow](scaladsl/Flow.html) with the given [Source](scaladsl/Source.html) so the first element
emitted by that source is emitted after the last element of this
flow.

This is a shorthand for [concat](scaladsl/Source.html#concat[U>:Out,Mat2](that:akka.stream.Graph[akka.stream.SourceShape[U],Mat2]):FlowOps.this.Repr[U])

ImplicitThis member is added by an implicit conversion from SourceRef\[T] to[Source](scaladsl/Source.html)\[T, [NotUsed](../NotUsed.html)] performed by method convertRefToSource in [akka.stream.SourceRef](SourceRef$.html).Definition Classes[FlowOps](scaladsl/FlowOps.html)
5. [**](../../akka/stream/SourceRef.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (SourceRef\[T], B)ImplicitThis member is added by an implicit conversion from SourceRef\[T] toArrowAssoc\[SourceRef\[T]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
6. [**](../../akka/stream/SourceRef.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
7. [**](../../akka/stream/SourceRef.html#addAttributes(attr:akka.stream.Attributes):Source.this.Repr[Out] "Permalink")  def addAttributes(attr: [Attributes](Attributes.html)): [Source](scaladsl/Source.html)\[T, [NotUsed](../NotUsed.html)]Add the given attributes to this Source.

Add the given attributes to this Source. If the specific attribute was already on this source
it will replace the previous value. If this Source is a composite
of multiple graphs, the added attributes will be on the composite and therefore less specific than attributes
set directly on the individual graphs of the composite.

ImplicitThis member is added by an implicit conversion from SourceRef\[T] to[Source](scaladsl/Source.html)\[T, [NotUsed](../NotUsed.html)] performed by method convertRefToSource in [akka.stream.SourceRef](SourceRef$.html).Definition Classes[Source](scaladsl/Source.html) → [Graph](Graph.html) → [FlowOps](scaladsl/FlowOps.html)
8. [**](../../akka/stream/SourceRef.html#aggregateWithBoundary[Agg,Emit](allocate:()=>Agg)(aggregate:(Agg,Out)=>(Agg,Boolean),harvest:Agg=>Emit,emitOnTimer:Option[(Agg=>Boolean,scala.concurrent.duration.FiniteDuration)]):FlowOps.this.Repr[Emit] "Permalink")  def aggregateWithBoundary\[Agg, Emit](allocate: () \=\> Agg)(aggregate: (Agg, T) \=\> (Agg, [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)), harvest: (Agg) \=\> Emit, emitOnTimer: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[((Agg) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration))]): [Source](scaladsl/Source.html)\[Emit, [NotUsed](../NotUsed.html)]Aggregate input elements into an arbitrary data structure that can be completed and emitted downstream
when custom condition is met which can be triggered by aggregate or timer.

Aggregate input elements into an arbitrary data structure that can be completed and emitted downstream
when custom condition is met which can be triggered by aggregate or timer.
It can be thought of a more general [groupedWeightedWithin](scaladsl/Source.html#groupedWeightedWithin(maxWeight:Long,maxNumber:Int,d:scala.concurrent.duration.FiniteDuration)(costFn:Out=>Long):FlowOps.this.Repr[Seq[Out]]).

**Emits when** the aggregation function decides the aggregate is complete or the timer function returns true

**Backpressures when** downstream backpressures and the aggregate is complete

**Completes when** upstream completes and the last aggregate has been emitted downstream

**Cancels when** downstream cancels

allocateallocate the initial data structure for aggregated elements

aggregateupdate the aggregated elements, return true if ready to emit after update.

harvestthis is invoked before emit within the current stage/operator

emitOnTimerdecide whether the current aggregated elements can be emitted, the custom function is invoked on every interval

ImplicitThis member is added by an implicit conversion from SourceRef\[T] to[Source](scaladsl/Source.html)\[T, [NotUsed](../NotUsed.html)] performed by method convertRefToSource in [akka.stream.SourceRef](SourceRef$.html).Definition Classes[FlowOps](scaladsl/FlowOps.html)Annotations@[ApiMayChange](../annotation/ApiMayChange.html)()
9. [**](../../akka/stream/SourceRef.html#alsoTo(that:akka.stream.Graph[akka.stream.SinkShape[Out],_]):FlowOps.this.Repr[Out] "Permalink")  def alsoTo(that: [Graph](Graph.html)\[[SinkShape](SinkShape.html)\[T], \_]): [Source](scaladsl/Source.html)\[T, [NotUsed](../NotUsed.html)]Attaches the given [Sink](scaladsl/Sink.html) to this [Source](scaladsl/Source.html), meaning that elements that pass
through will also be sent to the [Sink](scaladsl/Sink.html).

Attaches the given [Sink](scaladsl/Sink.html) to this [Source](scaladsl/Source.html), meaning that elements that pass
through will also be sent to the [Sink](scaladsl/Sink.html).

It is similar to [\#wireTap](scaladsl/Source.html#wireTap(that:akka.stream.Graph[akka.stream.SinkShape[Out],_]):FlowOps.this.Repr[Out]) but will backpressure instead of dropping elements when the given [Sink](scaladsl/Sink.html) is not ready.

**Emits when** element is available and demand exists both from the Sink and the downstream.

**Backpressures when** downstream or Sink backpressures

**Completes when** upstream completes

**Cancels when** downstream or Sink cancels

ImplicitThis member is added by an implicit conversion from SourceRef\[T] to[Source](scaladsl/Source.html)\[T, [NotUsed](../NotUsed.html)] performed by method convertRefToSource in [akka.stream.SourceRef](SourceRef$.html).Definition Classes[FlowOps](scaladsl/FlowOps.html)
10. [**](../../akka/stream/SourceRef.html#alsoToAll(those:akka.stream.Graph[akka.stream.SinkShape[Out],_]*):FlowOps.this.Repr[Out] "Permalink")  def alsoToAll(those: [Graph](Graph.html)\[[SinkShape](SinkShape.html)\[T], \_]\*): [Source](scaladsl/Source.html)\[T, [NotUsed](../NotUsed.html)]Attaches the given [Sink](scaladsl/Sink.html)s to this [Source](scaladsl/Source.html), meaning that elements that pass
through will also be sent to the [Sink](scaladsl/Sink.html).

Attaches the given [Sink](scaladsl/Sink.html)s to this [Source](scaladsl/Source.html), meaning that elements that pass
through will also be sent to the [Sink](scaladsl/Sink.html).

It is similar to [\#wireTap](scaladsl/Source.html#wireTap(that:akka.stream.Graph[akka.stream.SinkShape[Out],_]):FlowOps.this.Repr[Out]) but will backpressure instead of dropping elements when the given [Sink](scaladsl/Sink.html)s is not ready.

**Emits when** element is available and demand exists both from the Sinks and the downstream.

**Backpressures when** downstream or any of the [Sink](scaladsl/Sink.html)s backpressures

**Completes when** upstream completes

**Cancels when** downstream or any of the [Sink](scaladsl/Sink.html)s cancels

ImplicitThis member is added by an implicit conversion from SourceRef\[T] to[Source](scaladsl/Source.html)\[T, [NotUsed](../NotUsed.html)] performed by method convertRefToSource in [akka.stream.SourceRef](SourceRef$.html).Definition Classes[FlowOps](scaladsl/FlowOps.html)
11. [**](../../akka/stream/SourceRef.html#alsoToMat[Mat2,Mat3](that:akka.stream.Graph[akka.stream.SinkShape[Out],Mat2])(matF:(Mat,Mat2)=>Mat3):FlowOpsMat.this.ReprMat[Out,Mat3] "Permalink")  def alsoToMat\[Mat2, Mat3](that: [Graph](Graph.html)\[[SinkShape](SinkShape.html)\[T], Mat2])(matF: ([NotUsed](../NotUsed.html), Mat2) \=\> Mat3): [Source](scaladsl/Source.html)\[T, Mat3]Attaches the given [Sink](scaladsl/Sink.html) to this [Flow](scaladsl/Flow.html), meaning that elements that pass
through will also be sent to the [Sink](scaladsl/Sink.html).

Attaches the given [Sink](scaladsl/Sink.html) to this [Flow](scaladsl/Flow.html), meaning that elements that pass
through will also be sent to the [Sink](scaladsl/Sink.html).

ImplicitThis member is added by an implicit conversion from SourceRef\[T] to[Source](scaladsl/Source.html)\[T, [NotUsed](../NotUsed.html)] performed by method convertRefToSource in [akka.stream.SourceRef](SourceRef$.html).Definition Classes[FlowOpsMat](scaladsl/FlowOpsMat.html)See also[\#alsoTo](scaladsl/Source.html#alsoTo(that:akka.stream.Graph[akka.stream.SinkShape[Out],_]):FlowOps.this.Repr[Out])
It is recommended to use the internally optimized `Keep.left` and `Keep.right` combiners
where appropriate instead of manually writing functions that pass through one of the values.
12. [**](../../akka/stream/SourceRef.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
13. [**](../../akka/stream/SourceRef.html#asJava:akka.stream.javadsl.Source[Out@scala.annotation.unchecked.uncheckedVariance,Mat@scala.annotation.unchecked.uncheckedVariance] "Permalink")  def asJava: [Source](javadsl/Source.html)\[T, [NotUsed](../NotUsed.html)]Converts this Scala DSL element to it's Java DSL counterpart.

Converts this Scala DSL element to it's Java DSL counterpart.

ImplicitThis member is added by an implicit conversion from SourceRef\[T] to[Source](scaladsl/Source.html)\[T, [NotUsed](../NotUsed.html)] performed by method convertRefToSource in [akka.stream.SourceRef](SourceRef$.html).Definition Classes[Source](scaladsl/Source.html)
14. [**](../../akka/stream/SourceRef.html#asSourceWithContext[Ctx](f:Out=>Ctx):akka.stream.scaladsl.SourceWithContext[Out,Ctx,Mat] "Permalink")  def asSourceWithContext\[Ctx](f: (T) \=\> Ctx): [SourceWithContext](scaladsl/SourceWithContext.html)\[T, Ctx, [NotUsed](../NotUsed.html)]Transform this source whose element is `e` into a source producing tuple `(e, f(e))`

Transform this source whose element is `e` into a source producing tuple `(e, f(e))`

ImplicitThis member is added by an implicit conversion from SourceRef\[T] to[Source](scaladsl/Source.html)\[T, [NotUsed](../NotUsed.html)] performed by method convertRefToSource in [akka.stream.SourceRef](SourceRef$.html).Definition Classes[Source](scaladsl/Source.html)
15. [**](../../akka/stream/SourceRef.html#ask[S](parallelism:Int)(ref:akka.actor.ActorRef)(implicittimeout:akka.util.Timeout,implicittag:scala.reflect.ClassTag[S]):FlowOps.this.Repr[S] "Permalink")  def ask\[S](parallelism: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int))(ref: [ActorRef](../actor/ActorRef.html))(implicit timeout: [Timeout](../util/Timeout.html), tag: [ClassTag](https://www.scala-lang.org/api/2.13.17/scala/reflect/ClassTag.html#scala.reflect.ClassTag)\[S]): [Source](scaladsl/Source.html)\[S, [NotUsed](../NotUsed.html)]Use the `ask` pattern to send a request\-reply message to the target `ref` actor.

Use the `ask` pattern to send a request\-reply message to the target `ref` actor.
If any of the asks times out it will fail the stream with a [akka.pattern.AskTimeoutException](../pattern/AskTimeoutException.html).

Do not forget to include the expected response type in the method call, like so:

```
flow.ask[ExpectedReply](parallelism = 4)(ref)
```
otherwise `Nothing` will be assumed, which is most likely not what you want.

Parallelism limits the number of how many asks can be "in flight" at the same time.
Please note that the elements emitted by this operator are in\-order with regards to the asks being issued
(i.e. same behaviour as mapAsync).

The operator fails with an [akka.stream.WatchedActorTerminatedException](WatchedActorTerminatedException.html) if the target actor is terminated,
or with an [java.util.concurrent.TimeoutException](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/TimeoutException.html) in case the ask exceeds the timeout passed in.

Adheres to the [ActorAttributes.SupervisionStrategy](ActorAttributes$$SupervisionStrategy.html) attribute.

**Emits when** the futures (in submission order) created by the ask pattern internally are completed

**Backpressures when** the number of futures reaches the configured parallelism and the downstream backpressures

**Completes when** upstream completes and all futures have been completed and all elements have been emitted

**Fails when** the passed in actor terminates, or a timeout is exceeded in any of the asks performed

**Cancels when** downstream cancels

ImplicitThis member is added by an implicit conversion from SourceRef\[T] to[Source](scaladsl/Source.html)\[T, [NotUsed](../NotUsed.html)] performed by method convertRefToSource in [akka.stream.SourceRef](SourceRef$.html).Definition Classes[FlowOps](scaladsl/FlowOps.html)Annotations@implicitNotFound()
16. [**](../../akka/stream/SourceRef.html#ask[S](ref:akka.actor.ActorRef)(implicittimeout:akka.util.Timeout,implicittag:scala.reflect.ClassTag[S]):FlowOps.this.Repr[S] "Permalink")  def ask\[S](ref: [ActorRef](../actor/ActorRef.html))(implicit timeout: [Timeout](../util/Timeout.html), tag: [ClassTag](https://www.scala-lang.org/api/2.13.17/scala/reflect/ClassTag.html#scala.reflect.ClassTag)\[S]): [Source](scaladsl/Source.html)\[S, [NotUsed](../NotUsed.html)]Use the `ask` pattern to send a request\-reply message to the target `ref` actor.

Use the `ask` pattern to send a request\-reply message to the target `ref` actor.
If any of the asks times out it will fail the stream with a [akka.pattern.AskTimeoutException](../pattern/AskTimeoutException.html).

Do not forget to include the expected response type in the method call, like so:

```
flow.ask[ExpectedReply](ref)
```
otherwise `Nothing` will be assumed, which is most likely not what you want.

Defaults to parallelism of 2 messages in flight, since while one ask message may be being worked on, the second one
still be in the mailbox, so defaulting to sending the second one a bit earlier than when first ask has replied maintains
a slightly healthier throughput.

Similar to the plain ask pattern, the target actor is allowed to reply with `akka.util.Status`.
An `akka.util.Status#Failure` will cause the operator to fail with the cause carried in the `Failure` message.

The operator fails with an [akka.stream.WatchedActorTerminatedException](WatchedActorTerminatedException.html) if the target actor is terminated.

Adheres to the [ActorAttributes.SupervisionStrategy](ActorAttributes$$SupervisionStrategy.html) attribute.

**Emits when** the futures (in submission order) created by the ask pattern internally are completed

**Backpressures when** the number of futures reaches the configured parallelism and the downstream backpressures

**Completes when** upstream completes and all futures have been completed and all elements have been emitted

**Fails when** the passed in actor terminates, or a timeout is exceeded in any of the asks performed

**Cancels when** downstream cancels

ImplicitThis member is added by an implicit conversion from SourceRef\[T] to[Source](scaladsl/Source.html)\[T, [NotUsed](../NotUsed.html)] performed by method convertRefToSource in [akka.stream.SourceRef](SourceRef$.html).Definition Classes[FlowOps](scaladsl/FlowOps.html)Annotations@implicitNotFound()
17. [**](../../akka/stream/SourceRef.html#async(dispatcher:String,inputBufferSize:Int):Source.this.Repr[Out] "Permalink")  def async(dispatcher: [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String), inputBufferSize: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Source](scaladsl/Source.html)\[T, [NotUsed](../NotUsed.html)]Put an asynchronous boundary around this `Graph`

Put an asynchronous boundary around this `Graph`

dispatcherRun the graph on this dispatcher

inputBufferSizeSet the input buffer to this size for the graph

ImplicitThis member is added by an implicit conversion from SourceRef\[T] to[Source](scaladsl/Source.html)\[T, [NotUsed](../NotUsed.html)] performed by method convertRefToSource in [akka.stream.SourceRef](SourceRef$.html).Definition Classes[Source](scaladsl/Source.html) → [Graph](Graph.html)
18. [**](../../akka/stream/SourceRef.html#async(dispatcher:String):Source.this.Repr[Out] "Permalink")  def async(dispatcher: [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)): [Source](scaladsl/Source.html)\[T, [NotUsed](../NotUsed.html)]Put an asynchronous boundary around this `Graph`

Put an asynchronous boundary around this `Graph`

dispatcherRun the graph on this dispatcher

ImplicitThis member is added by an implicit conversion from SourceRef\[T] to[Source](scaladsl/Source.html)\[T, [NotUsed](../NotUsed.html)] performed by method convertRefToSource in [akka.stream.SourceRef](SourceRef$.html).Definition Classes[Source](scaladsl/Source.html) → [Graph](Graph.html)
19. [**](../../akka/stream/SourceRef.html#async:Source.this.Repr[Out] "Permalink")  def async: [Source](scaladsl/Source.html)\[T, [NotUsed](../NotUsed.html)]Put an asynchronous boundary around this `Source`

Put an asynchronous boundary around this `Source`

ImplicitThis member is added by an implicit conversion from SourceRef\[T] to[Source](scaladsl/Source.html)\[T, [NotUsed](../NotUsed.html)] performed by method convertRefToSource in [akka.stream.SourceRef](SourceRef$.html).Definition Classes[Source](scaladsl/Source.html) → [Graph](Graph.html) → [FlowOps](scaladsl/FlowOps.html)
20. [**](../../akka/stream/SourceRef.html#backpressureTimeout(timeout:scala.concurrent.duration.FiniteDuration):FlowOps.this.Repr[Out] "Permalink")  def backpressureTimeout(timeout: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)): [Source](scaladsl/Source.html)\[T, [NotUsed](../NotUsed.html)]If the time between the emission of an element and the following downstream demand exceeds the provided timeout,
the stream is failed with a [akka.stream.BackpressureTimeoutException](BackpressureTimeoutException.html).

If the time between the emission of an element and the following downstream demand exceeds the provided timeout,
the stream is failed with a [akka.stream.BackpressureTimeoutException](BackpressureTimeoutException.html). The timeout is checked periodically,
so the resolution of the check is one period (equals to timeout value).

**Emits when** upstream emits an element

**Backpressures when** downstream backpressures

**Completes when** upstream completes or fails if timeout elapses between element emission and downstream demand.

**Cancels when** downstream cancels

ImplicitThis member is added by an implicit conversion from SourceRef\[T] to[Source](scaladsl/Source.html)\[T, [NotUsed](../NotUsed.html)] performed by method convertRefToSource in [akka.stream.SourceRef](SourceRef$.html).Definition Classes[FlowOps](scaladsl/FlowOps.html)
21. [**](../../akka/stream/SourceRef.html#batch[S](max:Long,seed:Out=>S)(aggregate:(S,Out)=>S):FlowOps.this.Repr[S] "Permalink")  def batch\[S](max: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), seed: (T) \=\> S)(aggregate: (S, T) \=\> S): [Source](scaladsl/Source.html)\[S, [NotUsed](../NotUsed.html)]Allows a faster upstream to progress independently of a slower subscriber by aggregating elements into batches
until the subscriber is ready to accept them.

Allows a faster upstream to progress independently of a slower subscriber by aggregating elements into batches
until the subscriber is ready to accept them. For example a batch step might store received elements in
an array up to the allowed max limit if the upstream publisher is faster.

This only rolls up elements if the upstream is faster, but if the downstream is faster it will not
duplicate elements.

Adheres to the [ActorAttributes.SupervisionStrategy](ActorAttributes$$SupervisionStrategy.html) attribute.

**Emits when** downstream stops backpressuring and there is an aggregated element available

**Backpressures when** there are `max` batched elements and 1 pending element and downstream backpressures

**Completes when** upstream completes and there is no batched/pending element waiting

**Cancels when** downstream cancels

See also [FlowOps.conflateWithSeed](scaladsl/FlowOps.html#conflateWithSeed[S](seed:Out=>S)(aggregate:(S,Out)=>S):FlowOps.this.Repr[S]), [FlowOps.batchWeighted](scaladsl/FlowOps.html#batchWeighted[S](max:Long,costFn:Out=>Long,seed:Out=>S)(aggregate:(S,Out)=>S):FlowOps.this.Repr[S])

maxmaximum number of elements to batch before backpressuring upstream (must be positive non\-zero)

seedProvides the first state for a batched value using the first unconsumed element as a start

aggregateTakes the currently batched value and the current pending element to produce a new aggregate

ImplicitThis member is added by an implicit conversion from SourceRef\[T] to[Source](scaladsl/Source.html)\[T, [NotUsed](../NotUsed.html)] performed by method convertRefToSource in [akka.stream.SourceRef](SourceRef$.html).Definition Classes[FlowOps](scaladsl/FlowOps.html)
22. [**](../../akka/stream/SourceRef.html#batchWeighted[S](max:Long,costFn:Out=>Long,seed:Out=>S)(aggregate:(S,Out)=>S):FlowOps.this.Repr[S] "Permalink")  def batchWeighted\[S](max: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), costFn: (T) \=\> [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), seed: (T) \=\> S)(aggregate: (S, T) \=\> S): [Source](scaladsl/Source.html)\[S, [NotUsed](../NotUsed.html)]Allows a faster upstream to progress independently of a slower subscriber by aggregating elements into batches
until the subscriber is ready to accept them.

Allows a faster upstream to progress independently of a slower subscriber by aggregating elements into batches
until the subscriber is ready to accept them. For example a batch step might concatenate `ByteString`
elements up to the allowed max limit if the upstream publisher is faster.

This element only rolls up elements if the upstream is faster, but if the downstream is faster it will not
duplicate elements.

Batching will apply for all elements, even if a single element cost is greater than the total allowed limit.
In this case, previous batched elements will be emitted, then the "heavy" element will be emitted (after
being applied with the `seed` function) without batching further elements with it, and then the rest of the
incoming elements are batched.

**Emits when** downstream stops backpressuring and there is a batched element available

**Backpressures when** there are `max` weighted batched elements \+ 1 pending element and downstream backpressures

**Completes when** upstream completes and there is no batched/pending element waiting

**Cancels when** downstream cancels

See also [FlowOps.conflateWithSeed](scaladsl/FlowOps.html#conflateWithSeed[S](seed:Out=>S)(aggregate:(S,Out)=>S):FlowOps.this.Repr[S]), [FlowOps.batch](scaladsl/FlowOps.html#batch[S](max:Long,seed:Out=>S)(aggregate:(S,Out)=>S):FlowOps.this.Repr[S])

maxmaximum weight of elements to batch before backpressuring upstream (must be positive non\-zero)

costFna function to compute a single element weight

seedProvides the first state for a batched value using the first unconsumed element as a start

aggregateTakes the currently batched value and the current pending element to produce a new batch

ImplicitThis member is added by an implicit conversion from SourceRef\[T] to[Source](scaladsl/Source.html)\[T, [NotUsed](../NotUsed.html)] performed by method convertRefToSource in [akka.stream.SourceRef](SourceRef$.html).Definition Classes[FlowOps](scaladsl/FlowOps.html)
23. [**](../../akka/stream/SourceRef.html#buffer(size:Int,overflowStrategy:akka.stream.OverflowStrategy):FlowOps.this.Repr[Out] "Permalink")  def buffer(size: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), overflowStrategy: [OverflowStrategy](OverflowStrategy.html)): [Source](scaladsl/Source.html)\[T, [NotUsed](../NotUsed.html)]Adds a fixed size buffer in the flow that allows to store elements from a faster upstream until it becomes full.

Adds a fixed size buffer in the flow that allows to store elements from a faster upstream until it becomes full.
Depending on the defined [akka.stream.OverflowStrategy](OverflowStrategy.html) it might drop elements or backpressure the upstream if
there is no space available

**Emits when** downstream stops backpressuring and there is a pending element in the buffer

**Backpressures when** downstream backpressures or depending on OverflowStrategy:

	- Backpressure \- backpressures when buffer is full
	- DropHead, DropTail, DropBuffer \- never backpressures
	- Fail \- fails the stream if buffer gets full**Completes when** upstream completes and buffered elements have been drained

**Cancels when** downstream cancels

sizeThe size of the buffer in element count

overflowStrategyStrategy that is used when incoming elements cannot fit inside the buffer

ImplicitThis member is added by an implicit conversion from SourceRef\[T] to[Source](scaladsl/Source.html)\[T, [NotUsed](../NotUsed.html)] performed by method convertRefToSource in [akka.stream.SourceRef](SourceRef$.html).Definition Classes[FlowOps](scaladsl/FlowOps.html)
24. [**](../../akka/stream/SourceRef.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
25. [**](../../akka/stream/SourceRef.html#collect[T](pf:PartialFunction[Out,T]):FlowOps.this.Repr[T] "Permalink")  def collect\[T](pf: [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[T, T]): [Source](scaladsl/Source.html)\[T, [NotUsed](../NotUsed.html)]Transform this stream by applying the given partial function to each of the elements
on which the function is defined as they pass through this processing step.

Transform this stream by applying the given partial function to each of the elements
on which the function is defined as they pass through this processing step.
Non\-matching elements are filtered out.

Adheres to the [ActorAttributes.SupervisionStrategy](ActorAttributes$$SupervisionStrategy.html) attribute.

**Emits when** the provided partial function is defined for the element

**Backpressures when** the partial function is defined for the element and downstream backpressures

**Completes when** upstream completes

**Cancels when** downstream cancels

ImplicitThis member is added by an implicit conversion from SourceRef\[T] to[Source](scaladsl/Source.html)\[T, [NotUsed](../NotUsed.html)] performed by method convertRefToSource in [akka.stream.SourceRef](SourceRef$.html).Definition Classes[FlowOps](scaladsl/FlowOps.html)
26. [**](../../akka/stream/SourceRef.html#collectType[T](implicittag:scala.reflect.ClassTag[T]):FlowOps.this.Repr[T] "Permalink")  def collectType\[T](implicit tag: [ClassTag](https://www.scala-lang.org/api/2.13.17/scala/reflect/ClassTag.html#scala.reflect.ClassTag)\[T]): [Source](scaladsl/Source.html)\[T, [NotUsed](../NotUsed.html)]Transform this stream by testing the type of each of the elements
on which the element is an instance of the provided type as they pass through this processing step.

Transform this stream by testing the type of each of the elements
on which the element is an instance of the provided type as they pass through this processing step.

Non\-matching elements are filtered out.

Adheres to the [ActorAttributes.SupervisionStrategy](ActorAttributes$$SupervisionStrategy.html) attribute.

**Emits when** the element is an instance of the provided type

**Backpressures when** the element is an instance of the provided type and downstream backpressures

**Completes when** upstream completes

**Cancels when** downstream cancels

ImplicitThis member is added by an implicit conversion from SourceRef\[T] to[Source](scaladsl/Source.html)\[T, [NotUsed](../NotUsed.html)] performed by method convertRefToSource in [akka.stream.SourceRef](SourceRef$.html).Definition Classes[FlowOps](scaladsl/FlowOps.html)
27. [**](../../akka/stream/SourceRef.html#completionTimeout(timeout:scala.concurrent.duration.FiniteDuration):FlowOps.this.Repr[Out] "Permalink")  def completionTimeout(timeout: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)): [Source](scaladsl/Source.html)\[T, [NotUsed](../NotUsed.html)]If the completion of the stream does not happen until the provided timeout, the stream is failed
with a [akka.stream.CompletionTimeoutException](CompletionTimeoutException.html).

If the completion of the stream does not happen until the provided timeout, the stream is failed
with a [akka.stream.CompletionTimeoutException](CompletionTimeoutException.html).

**Emits when** upstream emits an element

**Backpressures when** downstream backpressures

**Completes when** upstream completes or fails if timeout elapses before upstream completes

**Cancels when** downstream cancels

ImplicitThis member is added by an implicit conversion from SourceRef\[T] to[Source](scaladsl/Source.html)\[T, [NotUsed](../NotUsed.html)] performed by method convertRefToSource in [akka.stream.SourceRef](SourceRef$.html).Definition Classes[FlowOps](scaladsl/FlowOps.html)
28. [**](../../akka/stream/SourceRef.html#concat[U>:Out,Mat2](that:akka.stream.Graph[akka.stream.SourceShape[U],Mat2]):FlowOps.this.Repr[U] "Permalink")  def concat\[U \>: Out, Mat2](that: [Graph](Graph.html)\[[SourceShape](SourceShape.html)\[U], Mat2]): [Source](scaladsl/Source.html)\[U, [NotUsed](../NotUsed.html)]Concatenate the given [Source](scaladsl/Source.html) to this [Flow](scaladsl/Flow.html), meaning that once this
Flow’s input is exhausted and all result elements have been generated,
the Source’s elements will be produced.

Concatenate the given [Source](scaladsl/Source.html) to this [Flow](scaladsl/Flow.html), meaning that once this
Flow’s input is exhausted and all result elements have been generated,
the Source’s elements will be produced.

Note that the [Source](scaladsl/Source.html) is materialized together with this Flow and is "detached" meaning it will
in effect behave as a one element buffer in front of both the sources, that eagerly demands an element on start
(so it can not be combined with `Source.lazy` to defer materialization of `that`).

The second source is then kept from producing elements by asserting back\-pressure until its time comes.

When needing a concat operator that is not detached use [\#concatLazy](scaladsl/Source.html#concatLazy[U>:Out,Mat2](that:akka.stream.Graph[akka.stream.SourceShape[U],Mat2]):FlowOps.this.Repr[U])

If this [Flow](scaladsl/Flow.html) gets upstream error \- no elements from the given [Source](scaladsl/Source.html) will be pulled.

**Emits when** element is available from current stream or from the given [Source](scaladsl/Source.html) when current is completed

**Backpressures when** downstream backpressures

**Completes when** given [Source](scaladsl/Source.html) completes

**Cancels when** downstream cancels

ImplicitThis member is added by an implicit conversion from SourceRef\[T] to[Source](scaladsl/Source.html)\[T, [NotUsed](../NotUsed.html)] performed by method convertRefToSource in [akka.stream.SourceRef](SourceRef$.html).Definition Classes[FlowOps](scaladsl/FlowOps.html)
29. [**](../../akka/stream/SourceRef.html#concatAllLazy[U>:Out](those:akka.stream.Graph[akka.stream.SourceShape[U],_]*):FlowOps.this.Repr[U] "Permalink")  def concatAllLazy\[U \>: Out](those: [Graph](Graph.html)\[[SourceShape](SourceShape.html)\[U], \_]\*): [Source](scaladsl/Source.html)\[U, [NotUsed](../NotUsed.html)]Concatenate the given [Source](scaladsl/Source.html)s to this [Flow](scaladsl/Flow.html), meaning that once this
Flow’s input is exhausted and all result elements have been generated,
the [Source](scaladsl/Source.html)s' elements will be produced.

Concatenate the given [Source](scaladsl/Source.html)s to this [Flow](scaladsl/Flow.html), meaning that once this
Flow’s input is exhausted and all result elements have been generated,
the [Source](scaladsl/Source.html)s' elements will be produced.

Note that the [Source](scaladsl/Source.html)s are materialized together with this Flow. If `lazy` materialization is what is needed
the operator can be combined with for example `Source.lazySource` to defer materialization of `that` until the
time when this source completes.

The second source is then kept from producing elements by asserting back\-pressure until its time comes.

For a concat operator that is detached, use [\#concat](scaladsl/Source.html#concat[U>:Out,Mat2](that:akka.stream.Graph[akka.stream.SourceShape[U],Mat2]):FlowOps.this.Repr[U])

If this [Flow](scaladsl/Flow.html) gets upstream error \- no elements from the given [Source](scaladsl/Source.html)s will be pulled.

**Emits when** element is available from current stream or from the given [Source](scaladsl/Source.html)s when current is completed

**Backpressures when** downstream backpressures

**Completes when** given all those [Source](scaladsl/Source.html)s completes

**Cancels when** downstream cancels

ImplicitThis member is added by an implicit conversion from SourceRef\[T] to[Source](scaladsl/Source.html)\[T, [NotUsed](../NotUsed.html)] performed by method convertRefToSource in [akka.stream.SourceRef](SourceRef$.html).Definition Classes[FlowOps](scaladsl/FlowOps.html)
30. [**](../../akka/stream/SourceRef.html#concatLazy[U>:Out,Mat2](that:akka.stream.Graph[akka.stream.SourceShape[U],Mat2]):FlowOps.this.Repr[U] "Permalink")  def concatLazy\[U \>: Out, Mat2](that: [Graph](Graph.html)\[[SourceShape](SourceShape.html)\[U], Mat2]): [Source](scaladsl/Source.html)\[U, [NotUsed](../NotUsed.html)]Concatenate the given [Source](scaladsl/Source.html) to this [Flow](scaladsl/Flow.html), meaning that once this
Flow’s input is exhausted and all result elements have been generated,
the Source’s elements will be produced.

Concatenate the given [Source](scaladsl/Source.html) to this [Flow](scaladsl/Flow.html), meaning that once this
Flow’s input is exhausted and all result elements have been generated,
the Source’s elements will be produced.

Note that the [Source](scaladsl/Source.html) is materialized together with this Flow. If `lazy` materialization is what is needed
the operator can be combined with for example `Source.lazySource` to defer materialization of `that` until the
time when this source completes.

The second source is then kept from producing elements by asserting back\-pressure until its time comes.

For a concat operator that is detached, use [\#concat](scaladsl/Source.html#concat[U>:Out,Mat2](that:akka.stream.Graph[akka.stream.SourceShape[U],Mat2]):FlowOps.this.Repr[U])

If this [Flow](scaladsl/Flow.html) gets upstream error \- no elements from the given [Source](scaladsl/Source.html) will be pulled.

**Emits when** element is available from current stream or from the given [Source](scaladsl/Source.html) when current is completed

**Backpressures when** downstream backpressures

**Completes when** given [Source](scaladsl/Source.html) completes

**Cancels when** downstream cancels

ImplicitThis member is added by an implicit conversion from SourceRef\[T] to[Source](scaladsl/Source.html)\[T, [NotUsed](../NotUsed.html)] performed by method convertRefToSource in [akka.stream.SourceRef](SourceRef$.html).Definition Classes[FlowOps](scaladsl/FlowOps.html)
31. [**](../../akka/stream/SourceRef.html#concatLazyMat[U>:Out,Mat2,Mat3](that:akka.stream.Graph[akka.stream.SourceShape[U],Mat2])(matF:(Mat,Mat2)=>Mat3):FlowOpsMat.this.ReprMat[U,Mat3] "Permalink")  def concatLazyMat\[U \>: Out, Mat2, Mat3](that: [Graph](Graph.html)\[[SourceShape](SourceShape.html)\[U], Mat2])(matF: ([NotUsed](../NotUsed.html), Mat2) \=\> Mat3): [Source](scaladsl/Source.html)\[U, Mat3]Concatenate the given [Source](scaladsl/Source.html) to this [Flow](scaladsl/Flow.html), meaning that once this
Flow’s input is exhausted and all result elements have been generated,
the Source’s elements will be produced.

Concatenate the given [Source](scaladsl/Source.html) to this [Flow](scaladsl/Flow.html), meaning that once this
Flow’s input is exhausted and all result elements have been generated,
the Source’s elements will be produced.

Note that the [Source](scaladsl/Source.html) is materialized together with this Flow, if `lazy` materialization is what is needed
the operator can be combined with `Source.lazy` to defer materialization of `that`.

The second source is then kept from producing elements by asserting back\-pressure until its time comes.

For a concat operator that is detached, use [\#concatMat](scaladsl/Source.html#concatMat[U>:Out,Mat2,Mat3](that:akka.stream.Graph[akka.stream.SourceShape[U],Mat2])(matF:(Mat,Mat2)=>Mat3):FlowOpsMat.this.ReprMat[U,Mat3])

ImplicitThis member is added by an implicit conversion from SourceRef\[T] to[Source](scaladsl/Source.html)\[T, [NotUsed](../NotUsed.html)] performed by method convertRefToSource in [akka.stream.SourceRef](SourceRef$.html).Definition Classes[FlowOpsMat](scaladsl/FlowOpsMat.html)See also[\#concatLazy](scaladsl/Source.html#concatLazy[U>:Out,Mat2](that:akka.stream.Graph[akka.stream.SourceShape[U],Mat2]):FlowOps.this.Repr[U]).
It is recommended to use the internally optimized `Keep.left` and `Keep.right` combiners
where appropriate instead of manually writing functions that pass through one of the values.
32. [**](../../akka/stream/SourceRef.html#concatMat[U>:Out,Mat2,Mat3](that:akka.stream.Graph[akka.stream.SourceShape[U],Mat2])(matF:(Mat,Mat2)=>Mat3):FlowOpsMat.this.ReprMat[U,Mat3] "Permalink")  def concatMat\[U \>: Out, Mat2, Mat3](that: [Graph](Graph.html)\[[SourceShape](SourceShape.html)\[U], Mat2])(matF: ([NotUsed](../NotUsed.html), Mat2) \=\> Mat3): [Source](scaladsl/Source.html)\[U, Mat3]Concatenate the given [Source](scaladsl/Source.html) to this [Flow](scaladsl/Flow.html), meaning that once this
Flow’s input is exhausted and all result elements have been generated,
the Source’s elements will be produced.

Concatenate the given [Source](scaladsl/Source.html) to this [Flow](scaladsl/Flow.html), meaning that once this
Flow’s input is exhausted and all result elements have been generated,
the Source’s elements will be produced.

Note that the [Source](scaladsl/Source.html) is materialized together with this Flow and is "detached" meaning it will
in effect behave as a one element buffer in front of both the sources, that eagerly demands an element on start
(so it can not be combined with `Source.lazy` to defer materialization of `that`).

The second source is then kept from producing elements by asserting back\-pressure until its time comes.

When needing a concat operator that is not detached use [\#concatLazyMat](scaladsl/Source.html#concatLazyMat[U>:Out,Mat2,Mat3](that:akka.stream.Graph[akka.stream.SourceShape[U],Mat2])(matF:(Mat,Mat2)=>Mat3):FlowOpsMat.this.ReprMat[U,Mat3])

ImplicitThis member is added by an implicit conversion from SourceRef\[T] to[Source](scaladsl/Source.html)\[T, [NotUsed](../NotUsed.html)] performed by method convertRefToSource in [akka.stream.SourceRef](SourceRef$.html).Definition Classes[FlowOpsMat](scaladsl/FlowOpsMat.html)See also[\#concat](scaladsl/Source.html#concat[U>:Out,Mat2](that:akka.stream.Graph[akka.stream.SourceShape[U],Mat2]):FlowOps.this.Repr[U]).
It is recommended to use the internally optimized `Keep.left` and `Keep.right` combiners
where appropriate instead of manually writing functions that pass through one of the values.
33. [**](../../akka/stream/SourceRef.html#conflate[O2>:Out](aggregate:(O2,O2)=>O2):FlowOps.this.Repr[O2] "Permalink")  def conflate\[O2 \>: Out](aggregate: (O2, O2) \=\> O2): [Source](scaladsl/Source.html)\[O2, [NotUsed](../NotUsed.html)]Allows a faster upstream to progress independently of a slower subscriber by conflating elements into a summary
until the subscriber is ready to accept them.

Allows a faster upstream to progress independently of a slower subscriber by conflating elements into a summary
until the subscriber is ready to accept them. For example a conflate step might average incoming numbers if the
upstream publisher is faster.

This version of conflate does not change the output type of the stream. See [FlowOps.conflateWithSeed](scaladsl/FlowOps.html#conflateWithSeed[S](seed:Out=>S)(aggregate:(S,Out)=>S):FlowOps.this.Repr[S]) for a
more flexible version that can take a seed function and transform elements while rolling up.

This element only rolls up elements if the upstream is faster, but if the downstream is faster it will not
duplicate elements.

Adheres to the [ActorAttributes.SupervisionStrategy](ActorAttributes$$SupervisionStrategy.html) attribute.

**Emits when** downstream stops backpressuring and there is a conflated element available

**Backpressures when** never

**Completes when** upstream completes

**Cancels when** downstream cancels

aggregateTakes the currently aggregated value and the current pending element to produce a new aggregate
See also [FlowOps.conflate](scaladsl/FlowOps.html#conflate[O2>:Out](aggregate:(O2,O2)=>O2):FlowOps.this.Repr[O2]), [FlowOps.limit](scaladsl/FlowOps.html#limit(max:Long):FlowOps.this.Repr[Out]), [FlowOps.limitWeighted](scaladsl/FlowOps.html#limitWeighted[T](max:Long)(costFn:Out=>Long):FlowOps.this.Repr[Out]) [FlowOps.batch](scaladsl/FlowOps.html#batch[S](max:Long,seed:Out=>S)(aggregate:(S,Out)=>S):FlowOps.this.Repr[S]) [FlowOps.batchWeighted](scaladsl/FlowOps.html#batchWeighted[S](max:Long,costFn:Out=>Long,seed:Out=>S)(aggregate:(S,Out)=>S):FlowOps.this.Repr[S])

ImplicitThis member is added by an implicit conversion from SourceRef\[T] to[Source](scaladsl/Source.html)\[T, [NotUsed](../NotUsed.html)] performed by method convertRefToSource in [akka.stream.SourceRef](SourceRef$.html).Definition Classes[FlowOps](scaladsl/FlowOps.html)
34. [**](../../akka/stream/SourceRef.html#conflateWithSeed[S](seed:Out=>S)(aggregate:(S,Out)=>S):FlowOps.this.Repr[S] "Permalink")  def conflateWithSeed\[S](seed: (T) \=\> S)(aggregate: (S, T) \=\> S): [Source](scaladsl/Source.html)\[S, [NotUsed](../NotUsed.html)]Allows a faster upstream to progress independently of a slower subscriber by conflating elements into a summary
until the subscriber is ready to accept them.

Allows a faster upstream to progress independently of a slower subscriber by conflating elements into a summary
until the subscriber is ready to accept them. For example a conflate step might average incoming numbers if the
upstream publisher is faster.

This version of conflate allows to derive a seed from the first element and change the aggregated type to be
different than the input type. See [FlowOps.conflate](scaladsl/FlowOps.html#conflate[O2>:Out](aggregate:(O2,O2)=>O2):FlowOps.this.Repr[O2]) for a simpler version that does not change types.

This element only rolls up elements if the upstream is faster, but if the downstream is faster it will not
duplicate elements.

Adheres to the [ActorAttributes.SupervisionStrategy](ActorAttributes$$SupervisionStrategy.html) attribute.

**Emits when** downstream stops backpressuring and there is a conflated element available

**Backpressures when** never

**Completes when** upstream completes

**Cancels when** downstream cancels

seedProvides the first state for a conflated value using the first unconsumed element as a start

aggregateTakes the currently aggregated value and the current pending element to produce a new aggregate
See also [FlowOps.conflate](scaladsl/FlowOps.html#conflate[O2>:Out](aggregate:(O2,O2)=>O2):FlowOps.this.Repr[O2]), [FlowOps.limit](scaladsl/FlowOps.html#limit(max:Long):FlowOps.this.Repr[Out]), [FlowOps.limitWeighted](scaladsl/FlowOps.html#limitWeighted[T](max:Long)(costFn:Out=>Long):FlowOps.this.Repr[Out]) [FlowOps.batch](scaladsl/FlowOps.html#batch[S](max:Long,seed:Out=>S)(aggregate:(S,Out)=>S):FlowOps.this.Repr[S]) [FlowOps.batchWeighted](scaladsl/FlowOps.html#batchWeighted[S](max:Long,costFn:Out=>Long,seed:Out=>S)(aggregate:(S,Out)=>S):FlowOps.this.Repr[S])

ImplicitThis member is added by an implicit conversion from SourceRef\[T] to[Source](scaladsl/Source.html)\[T, [NotUsed](../NotUsed.html)] performed by method convertRefToSource in [akka.stream.SourceRef](SourceRef$.html).Definition Classes[FlowOps](scaladsl/FlowOps.html)
35. [**](../../akka/stream/SourceRef.html#delay(of:scala.concurrent.duration.FiniteDuration,strategy:akka.stream.DelayOverflowStrategy):FlowOps.this.Repr[Out] "Permalink")  def delay(of: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), strategy: [DelayOverflowStrategy](DelayOverflowStrategy.html) \= [DelayOverflowStrategy.dropTail](../index.html)): [Source](scaladsl/Source.html)\[T, [NotUsed](../NotUsed.html)]Shifts elements emission in time by a specified amount.

Shifts elements emission in time by a specified amount. It allows to store elements
in internal buffer while waiting for next element to be emitted. Depending on the defined
[akka.stream.DelayOverflowStrategy](DelayOverflowStrategy.html) it might drop elements or backpressure the upstream if
there is no space available in the buffer.

Delay precision is 10ms to avoid unnecessary timer scheduling cycles

Internal buffer has default capacity 16\. You can set buffer size by calling `addAttributes(inputBuffer)`

**Emits when** there is a pending element in the buffer and configured time for this element elapsed
 \* EmitEarly \- strategy do not wait to emit element if buffer is full

**Backpressures when** depending on OverflowStrategy
 \* Backpressure \- backpressures when buffer is full
 \* DropHead, DropTail, DropBuffer \- never backpressures
 \* Fail \- fails the stream if buffer gets full

**Completes when** upstream completes and buffered elements have been drained

**Cancels when** downstream cancels

oftime to shift all messages

strategyStrategy that is used when incoming elements cannot fit inside the buffer

ImplicitThis member is added by an implicit conversion from SourceRef\[T] to[Source](scaladsl/Source.html)\[T, [NotUsed](../NotUsed.html)] performed by method convertRefToSource in [akka.stream.SourceRef](SourceRef$.html).Definition Classes[FlowOps](scaladsl/FlowOps.html)
36. [**](../../akka/stream/SourceRef.html#delayWith(delayStrategySupplier:()=>akka.stream.scaladsl.DelayStrategy[Out],overFlowStrategy:akka.stream.DelayOverflowStrategy):FlowOps.this.Repr[Out] "Permalink")  def delayWith(delayStrategySupplier: () \=\> [DelayStrategy](scaladsl/DelayStrategy.html)\[T], overFlowStrategy: [DelayOverflowStrategy](DelayOverflowStrategy.html)): [Source](scaladsl/Source.html)\[T, [NotUsed](../NotUsed.html)]Shifts elements emission in time by an amount individually determined through delay strategy a specified amount.

Shifts elements emission in time by an amount individually determined through delay strategy a specified amount.
It allows to store elements in internal buffer while waiting for next element to be emitted. Depending on the defined
[akka.stream.DelayOverflowStrategy](DelayOverflowStrategy.html) it might drop elements or backpressure the upstream if
there is no space available in the buffer.

It determines delay for each ongoing element invoking `DelayStrategy.nextDelay(elem: T): FiniteDuration`.

Note that elements are not re\-ordered: if an element is given a delay much shorter than its predecessor,
it will still have to wait for the preceding element before being emitted.
It is also important to notice that [scaladsl.DelayStrategy](scaladsl/DelayStrategy.html) can be stateful.

Delay precision is 10ms to avoid unnecessary timer scheduling cycles.

Internal buffer has default capacity 16\. You can set buffer size by calling `addAttributes(inputBuffer)`

**Emits when** there is a pending element in the buffer and configured time for this element elapsed
 \* EmitEarly \- strategy do not wait to emit element if buffer is full

**Backpressures when** depending on OverflowStrategy
 \* Backpressure \- backpressures when buffer is full
 \* DropHead, DropTail, DropBuffer \- never backpressures
 \* Fail \- fails the stream if buffer gets full

**Completes when** upstream completes and buffered elements have been drained

**Cancels when** downstream cancels

delayStrategySuppliercreates new [DelayStrategy](scaladsl/DelayStrategy.html) object for each materialization

overFlowStrategyStrategy that is used when incoming elements cannot fit inside the buffer

ImplicitThis member is added by an implicit conversion from SourceRef\[T] to[Source](scaladsl/Source.html)\[T, [NotUsed](../NotUsed.html)] performed by method convertRefToSource in [akka.stream.SourceRef](SourceRef$.html).Definition Classes[FlowOps](scaladsl/FlowOps.html)
37. [**](../../akka/stream/SourceRef.html#detach:FlowOps.this.Repr[Out] "Permalink")  def detach: [Source](scaladsl/Source.html)\[T, [NotUsed](../NotUsed.html)]Detaches upstream demand from downstream demand without detaching the
stream rates; in other words acts like a buffer of size 1\.

Detaches upstream demand from downstream demand without detaching the
stream rates; in other words acts like a buffer of size 1\.

**Emits when** upstream emits an element

**Backpressures when** downstream backpressures

**Completes when** upstream completes

**Cancels when** downstream cancels

ImplicitThis member is added by an implicit conversion from SourceRef\[T] to[Source](scaladsl/Source.html)\[T, [NotUsed](../NotUsed.html)] performed by method convertRefToSource in [akka.stream.SourceRef](SourceRef$.html).Definition Classes[FlowOps](scaladsl/FlowOps.html)
38. [**](../../akka/stream/SourceRef.html#divertTo(that:akka.stream.Graph[akka.stream.SinkShape[Out],_],when:Out=>Boolean):FlowOps.this.Repr[Out] "Permalink")  def divertTo(that: [Graph](Graph.html)\[[SinkShape](SinkShape.html)\[T], \_], when: (T) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): [Source](scaladsl/Source.html)\[T, [NotUsed](../NotUsed.html)]Attaches the given [Sink](scaladsl/Sink.html) to this [Flow](scaladsl/Flow.html), meaning that elements will be sent to the [Sink](scaladsl/Sink.html)
instead of being passed through if the predicate `when` returns `true`.

Attaches the given [Sink](scaladsl/Sink.html) to this [Flow](scaladsl/Flow.html), meaning that elements will be sent to the [Sink](scaladsl/Sink.html)
instead of being passed through if the predicate `when` returns `true`.

**Emits when** emits when an element is available from the input and the chosen output has demand

**Backpressures when** the currently chosen output back\-pressures

**Completes when** upstream completes and no output is pending

**Cancels when** any of the downstreams cancel

ImplicitThis member is added by an implicit conversion from SourceRef\[T] to[Source](scaladsl/Source.html)\[T, [NotUsed](../NotUsed.html)] performed by method convertRefToSource in [akka.stream.SourceRef](SourceRef$.html).Definition Classes[FlowOps](scaladsl/FlowOps.html)
39. [**](../../akka/stream/SourceRef.html#divertToMat[Mat2,Mat3](that:akka.stream.Graph[akka.stream.SinkShape[Out],Mat2],when:Out=>Boolean)(matF:(Mat,Mat2)=>Mat3):FlowOpsMat.this.ReprMat[Out,Mat3] "Permalink")  def divertToMat\[Mat2, Mat3](that: [Graph](Graph.html)\[[SinkShape](SinkShape.html)\[T], Mat2], when: (T) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean))(matF: ([NotUsed](../NotUsed.html), Mat2) \=\> Mat3): [Source](scaladsl/Source.html)\[T, Mat3]Attaches the given [Sink](scaladsl/Sink.html) to this [Flow](scaladsl/Flow.html), meaning that elements will be sent to the [Sink](scaladsl/Sink.html)
instead of being passed through if the predicate `when` returns `true`.

Attaches the given [Sink](scaladsl/Sink.html) to this [Flow](scaladsl/Flow.html), meaning that elements will be sent to the [Sink](scaladsl/Sink.html)
instead of being passed through if the predicate `when` returns `true`.

ImplicitThis member is added by an implicit conversion from SourceRef\[T] to[Source](scaladsl/Source.html)\[T, [NotUsed](../NotUsed.html)] performed by method convertRefToSource in [akka.stream.SourceRef](SourceRef$.html).Definition Classes[FlowOpsMat](scaladsl/FlowOpsMat.html)See also[\#divertTo](scaladsl/Source.html#divertTo(that:akka.stream.Graph[akka.stream.SinkShape[Out],_],when:Out=>Boolean):FlowOps.this.Repr[Out])
It is recommended to use the internally optimized `Keep.left` and `Keep.right` combiners
where appropriate instead of manually writing functions that pass through one of the values.
40. [**](../../akka/stream/SourceRef.html#drop(n:Long):FlowOps.this.Repr[Out] "Permalink")  def drop(n: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Source](scaladsl/Source.html)\[T, [NotUsed](../NotUsed.html)]Discard the given number of elements at the beginning of the stream.

Discard the given number of elements at the beginning of the stream.
No elements will be dropped if `n` is zero or negative.

**Emits when** the specified number of elements has been dropped already

**Backpressures when** the specified number of elements has been dropped and downstream backpressures

**Completes when** upstream completes

**Cancels when** downstream cancels

ImplicitThis member is added by an implicit conversion from SourceRef\[T] to[Source](scaladsl/Source.html)\[T, [NotUsed](../NotUsed.html)] performed by method convertRefToSource in [akka.stream.SourceRef](SourceRef$.html).Definition Classes[FlowOps](scaladsl/FlowOps.html)
41. [**](../../akka/stream/SourceRef.html#dropWhile(p:Out=>Boolean):FlowOps.this.Repr[Out] "Permalink")  def dropWhile(p: (T) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): [Source](scaladsl/Source.html)\[T, [NotUsed](../NotUsed.html)]Discard elements at the beginning of the stream while predicate is true.

Discard elements at the beginning of the stream while predicate is true.
All elements will be taken after predicate returns false first time.

Adheres to the [ActorAttributes.SupervisionStrategy](ActorAttributes$$SupervisionStrategy.html) attribute.

**Emits when** predicate returned false and for all following stream elements

**Backpressures when** predicate returned false and downstream backpressures

**Completes when** upstream completes

**Cancels when** downstream cancels

ImplicitThis member is added by an implicit conversion from SourceRef\[T] to[Source](scaladsl/Source.html)\[T, [NotUsed](../NotUsed.html)] performed by method convertRefToSource in [akka.stream.SourceRef](SourceRef$.html).Definition Classes[FlowOps](scaladsl/FlowOps.html)
42. [**](../../akka/stream/SourceRef.html#dropWithin(d:scala.concurrent.duration.FiniteDuration):FlowOps.this.Repr[Out] "Permalink")  def dropWithin(d: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)): [Source](scaladsl/Source.html)\[T, [NotUsed](../NotUsed.html)]Discard the elements received within the given duration at beginning of the stream.

Discard the elements received within the given duration at beginning of the stream.

**Emits when** the specified time elapsed and a new upstream element arrives

**Backpressures when** downstream backpressures

**Completes when** upstream completes

**Cancels when** downstream cancels

ImplicitThis member is added by an implicit conversion from SourceRef\[T] to[Source](scaladsl/Source.html)\[T, [NotUsed](../NotUsed.html)] performed by method convertRefToSource in [akka.stream.SourceRef](SourceRef$.html).Definition Classes[FlowOps](scaladsl/FlowOps.html)
43. [**](../../akka/stream/SourceRef.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (SourceRef\[T]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): SourceRef\[T]ImplicitThis member is added by an implicit conversion from SourceRef\[T] toEnsuring\[SourceRef\[T]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
44. [**](../../akka/stream/SourceRef.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (SourceRef\[T]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): SourceRef\[T]ImplicitThis member is added by an implicit conversion from SourceRef\[T] toEnsuring\[SourceRef\[T]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
45. [**](../../akka/stream/SourceRef.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): SourceRef\[T]ImplicitThis member is added by an implicit conversion from SourceRef\[T] toEnsuring\[SourceRef\[T]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
46. [**](../../akka/stream/SourceRef.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): SourceRef\[T]ImplicitThis member is added by an implicit conversion from SourceRef\[T] toEnsuring\[SourceRef\[T]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
47. [**](../../akka/stream/SourceRef.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
48. [**](../../akka/stream/SourceRef.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
49. [**](../../akka/stream/SourceRef.html#expand[U](expander:Out=>Iterator[U]):FlowOps.this.Repr[U] "Permalink")  def expand\[U](expander: (T) \=\> [Iterator](https://www.scala-lang.org/api/2.13.17/scala/collection/Iterator.html#scala.collection.Iterator)\[U]): [Source](scaladsl/Source.html)\[U, [NotUsed](../NotUsed.html)]Allows a faster downstream to progress independently of a slower upstream by extrapolating elements from an older
element until new element comes from the upstream.

Allows a faster downstream to progress independently of a slower upstream by extrapolating elements from an older
element until new element comes from the upstream. For example an expand step might repeat the last element for
the subscriber until it receives an update from upstream.

This element will never "drop" upstream elements as all elements go through at least one extrapolation step.
This means that if the upstream is actually faster than the upstream it will be backpressured by the downstream
subscriber.

Expand does not support [akka.stream.Supervision.Restart](Supervision$$Restart$.html) and [akka.stream.Supervision.Resume](Supervision$$Resume$.html).
Exceptions from the `seed` function will complete the stream with failure.

**Emits when** downstream stops backpressuring

**Backpressures when** downstream backpressures or iterator runs empty

**Completes when** upstream completes

**Cancels when** downstream cancels

expanderTakes the current extrapolation state to produce an output element and the next extrapolation
 state.

ImplicitThis member is added by an implicit conversion from SourceRef\[T] to[Source](scaladsl/Source.html)\[T, [NotUsed](../NotUsed.html)] performed by method convertRefToSource in [akka.stream.SourceRef](SourceRef$.html).Definition Classes[FlowOps](scaladsl/FlowOps.html)See also[\#extrapolate](scaladsl/Source.html#extrapolate[U>:Out](extrapolator:U=>Iterator[U],initial:Option[U]):FlowOps.this.Repr[U]) for a version that always preserves the original element and allows for an initial "startup"
 element.
50. [**](../../akka/stream/SourceRef.html#extrapolate[U>:Out](extrapolator:U=>Iterator[U],initial:Option[U]):FlowOps.this.Repr[U] "Permalink")  def extrapolate\[U \>: Out](extrapolator: (U) \=\> [Iterator](https://www.scala-lang.org/api/2.13.17/scala/collection/Iterator.html#scala.collection.Iterator)\[U], initial: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[U] \= None): [Source](scaladsl/Source.html)\[U, [NotUsed](../NotUsed.html)]Allows a faster downstream to progress independent of a slower upstream.

Allows a faster downstream to progress independent of a slower upstream.

This is achieved by introducing "extrapolated" elements \- based on those from upstream \- whenever downstream
signals demand.

Extrapolate does not support [akka.stream.Supervision.Restart](Supervision$$Restart$.html) and [akka.stream.Supervision.Resume](Supervision$$Resume$.html).
Exceptions from the `extrapolate` function will complete the stream with failure.

**Emits when** downstream stops backpressuring, AND EITHER upstream emits OR initial element is present OR
`extrapolate` is non\-empty and applicable

**Backpressures when** downstream backpressures or current `extrapolate` runs empty

**Completes when** upstream completes and current `extrapolate` runs empty

**Cancels when** downstream cancels

extrapolatortakes the current upstream element and provides a sequence of "extrapolated" elements based
 on the original, to be emitted in case downstream signals demand.

initialthe initial element to be emitted, in case upstream is able to stall the entire stream.

ImplicitThis member is added by an implicit conversion from SourceRef\[T] to[Source](scaladsl/Source.html)\[T, [NotUsed](../NotUsed.html)] performed by method convertRefToSource in [akka.stream.SourceRef](SourceRef$.html).Definition Classes[FlowOps](scaladsl/FlowOps.html)See also[\#expand](scaladsl/Source.html#expand[U](expander:Out=>Iterator[U]):FlowOps.this.Repr[U]) for a version that can overwrite the original element.
51. [**](../../akka/stream/SourceRef.html#filter(p:Out=>Boolean):FlowOps.this.Repr[Out] "Permalink")  def filter(p: (T) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): [Source](scaladsl/Source.html)\[T, [NotUsed](../NotUsed.html)]Only pass on those elements that satisfy the given predicate.

Only pass on those elements that satisfy the given predicate.

Adheres to the [ActorAttributes.SupervisionStrategy](ActorAttributes$$SupervisionStrategy.html) attribute.

**Emits when** the given predicate returns true for the element

**Backpressures when** the given predicate returns true for the element and downstream backpressures

**Completes when** upstream completes

**Cancels when** downstream cancels

ImplicitThis member is added by an implicit conversion from SourceRef\[T] to[Source](scaladsl/Source.html)\[T, [NotUsed](../NotUsed.html)] performed by method convertRefToSource in [akka.stream.SourceRef](SourceRef$.html).Definition Classes[FlowOps](scaladsl/FlowOps.html)
52. [**](../../akka/stream/SourceRef.html#filterNot(p:Out=>Boolean):FlowOps.this.Repr[Out] "Permalink")  def filterNot(p: (T) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): [Source](scaladsl/Source.html)\[T, [NotUsed](../NotUsed.html)]Only pass on those elements that NOT satisfy the given predicate.

Only pass on those elements that NOT satisfy the given predicate.

Adheres to the [ActorAttributes.SupervisionStrategy](ActorAttributes$$SupervisionStrategy.html) attribute.

**Emits when** the given predicate returns false for the element

**Backpressures when** the given predicate returns false for the element and downstream backpressures

**Completes when** upstream completes

**Cancels when** downstream cancels

ImplicitThis member is added by an implicit conversion from SourceRef\[T] to[Source](scaladsl/Source.html)\[T, [NotUsed](../NotUsed.html)] performed by method convertRefToSource in [akka.stream.SourceRef](SourceRef$.html).Definition Classes[FlowOps](scaladsl/FlowOps.html)
53. [**](../../akka/stream/SourceRef.html#flatMapConcat[T,M](f:Out=>akka.stream.Graph[akka.stream.SourceShape[T],M]):FlowOps.this.Repr[T] "Permalink")  def flatMapConcat\[T, M](f: (T) \=\> [Graph](Graph.html)\[[SourceShape](SourceShape.html)\[T], M]): [Source](scaladsl/Source.html)\[T, [NotUsed](../NotUsed.html)]Transform each input element into a `Source` of output elements that is
then flattened into the output stream by concatenation,
fully consuming one Source after the other.

Transform each input element into a `Source` of output elements that is
then flattened into the output stream by concatenation,
fully consuming one Source after the other.

**Emits when** a currently consumed substream has an element available

**Backpressures when** downstream backpressures

**Completes when** upstream completes and all consumed substreams complete

**Cancels when** downstream cancels

ImplicitThis member is added by an implicit conversion from SourceRef\[T] to[Source](scaladsl/Source.html)\[T, [NotUsed](../NotUsed.html)] performed by method convertRefToSource in [akka.stream.SourceRef](SourceRef$.html).Definition Classes[FlowOps](scaladsl/FlowOps.html)
54. [**](../../akka/stream/SourceRef.html#flatMapMerge[T,M](breadth:Int,f:Out=>akka.stream.Graph[akka.stream.SourceShape[T],M]):FlowOps.this.Repr[T] "Permalink")  def flatMapMerge\[T, M](breadth: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), f: (T) \=\> [Graph](Graph.html)\[[SourceShape](SourceShape.html)\[T], M]): [Source](scaladsl/Source.html)\[T, [NotUsed](../NotUsed.html)]Transform each input element into a `Source` of output elements that is
then flattened into the output stream by merging, where at most `breadth`
substreams are being consumed at any given time.

Transform each input element into a `Source` of output elements that is
then flattened into the output stream by merging, where at most `breadth`
substreams are being consumed at any given time.

**Emits when** a currently consumed substream has an element available

**Backpressures when** downstream backpressures

**Completes when** upstream completes and all consumed substreams complete

**Cancels when** downstream cancels

ImplicitThis member is added by an implicit conversion from SourceRef\[T] to[Source](scaladsl/Source.html)\[T, [NotUsed](../NotUsed.html)] performed by method convertRefToSource in [akka.stream.SourceRef](SourceRef$.html).Definition Classes[FlowOps](scaladsl/FlowOps.html)
55. [**](../../akka/stream/SourceRef.html#flatMapPrefix[Out2,Mat2](n:Int)(f:Seq[Out]=>akka.stream.scaladsl.Flow[Out,Out2,Mat2]):FlowOps.this.Repr[Out2] "Permalink")  def flatMapPrefix\[Out2, Mat2](n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int))(f: ([Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[T]) \=\> [Flow](scaladsl/Flow.html)\[T, Out2, Mat2]): [Source](scaladsl/Source.html)\[Out2, [NotUsed](../NotUsed.html)]Takes up to `n` elements from the stream (less than `n` only if the upstream completes before emitting `n` elements),
then apply `f` on these elements in order to obtain a flow, this flow is then materialized and the rest of the input is processed by this flow (similar to via).

Takes up to `n` elements from the stream (less than `n` only if the upstream completes before emitting `n` elements),
then apply `f` on these elements in order to obtain a flow, this flow is then materialized and the rest of the input is processed by this flow (similar to via).
This method returns a flow consuming the rest of the stream producing the materialized flow's output.

**Emits when** the materialized flow emits.
 Notice the first `n` elements are buffered internally before materializing the flow and connecting it to the rest of the upstream \- producing elements at its own discretion (might 'swallow' or multiply elements).

**Backpressures when** the materialized flow backpressures

**Completes when** the materialized flow completes.
 If upstream completes before producing `n` elements, `f` will be applied with the provided elements,
 the resulting flow will be materialized and signalled for upstream completion, it can then complete or continue to emit elements at its own discretion.

**Cancels when** the materialized flow cancels.
 When downstream cancels before materialization of the nested flow, the operator's default behaviour is to cancel immediately,
 this behaviour can be controlled by setting the [akka.stream.Attributes.NestedMaterializationCancellationPolicy](Attributes$$NestedMaterializationCancellationPolicy.html) attribute on the flow.
 When this attribute is configured to true, downstream cancellation is delayed until the nested flow's materialization which is then immediately cancelled (with the original cancellation cause).

nthe number of elements to accumulate before materializing the downstream flow.

fa function that produces the downstream flow based on the upstream's prefix.

ImplicitThis member is added by an implicit conversion from SourceRef\[T] to[Source](scaladsl/Source.html)\[T, [NotUsed](../NotUsed.html)] performed by method convertRefToSource in [akka.stream.SourceRef](SourceRef$.html).Definition Classes[FlowOps](scaladsl/FlowOps.html)
56. [**](../../akka/stream/SourceRef.html#flatMapPrefixMat[Out2,Mat2,Mat3](n:Int)(f:Seq[Out]=>akka.stream.scaladsl.Flow[Out,Out2,Mat2])(matF:(Mat,scala.concurrent.Future[Mat2])=>Mat3):FlowOpsMat.this.ReprMat[Out2,Mat3] "Permalink")  def flatMapPrefixMat\[Out2, Mat2, Mat3](n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int))(f: ([Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[T]) \=\> [Flow](scaladsl/Flow.html)\[T, Out2, Mat2])(matF: ([NotUsed](../NotUsed.html), [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[Mat2]) \=\> Mat3): [Source](scaladsl/Source.html)\[Out2, Mat3]mat version of [\#flatMapPrefix](scaladsl/Source.html#flatMapPrefix[Out2,Mat2](n:Int)(f:Seq[Out]=>akka.stream.scaladsl.Flow[Out,Out2,Mat2]):FlowOps.this.Repr[Out2]), this method gives access to a future materialized value of the downstream flow.

mat version of [\#flatMapPrefix](scaladsl/Source.html#flatMapPrefix[Out2,Mat2](n:Int)(f:Seq[Out]=>akka.stream.scaladsl.Flow[Out,Out2,Mat2]):FlowOps.this.Repr[Out2]), this method gives access to a future materialized value of the downstream flow.
see [\#flatMapPrefix](scaladsl/Source.html#flatMapPrefix[Out2,Mat2](n:Int)(f:Seq[Out]=>akka.stream.scaladsl.Flow[Out,Out2,Mat2]):FlowOps.this.Repr[Out2]) for details.

ImplicitThis member is added by an implicit conversion from SourceRef\[T] to[Source](scaladsl/Source.html)\[T, [NotUsed](../NotUsed.html)] performed by method convertRefToSource in [akka.stream.SourceRef](SourceRef$.html).Definition Classes[FlowOpsMat](scaladsl/FlowOpsMat.html)
57. [**](../../akka/stream/SourceRef.html#fold[T](zero:T)(f:(T,Out)=>T):FlowOps.this.Repr[T] "Permalink")  def fold\[T](zero: T)(f: (T, T) \=\> T): [Source](scaladsl/Source.html)\[T, [NotUsed](../NotUsed.html)]Similar to `scan` but only emits its result when the upstream completes,
after which it also completes.

Similar to `scan` but only emits its result when the upstream completes,
after which it also completes. Applies the given function towards its current and next value,
yielding the next current value.

If the function `f` throws an exception and the supervision decision is
[akka.stream.Supervision.Restart](Supervision$$Restart$.html) current value starts at `zero` again
the stream will continue.

Adheres to the [ActorAttributes.SupervisionStrategy](ActorAttributes$$SupervisionStrategy.html) attribute.

Note that the `zero` value must be immutable.

**Emits when** upstream completes

**Backpressures when** downstream backpressures

**Completes when** upstream completes

**Cancels when** downstream cancels

See also [FlowOps.scan](scaladsl/FlowOps.html#scan[T](zero:T)(f:(T,Out)=>T):FlowOps.this.Repr[T])

ImplicitThis member is added by an implicit conversion from SourceRef\[T] to[Source](scaladsl/Source.html)\[T, [NotUsed](../NotUsed.html)] performed by method convertRefToSource in [akka.stream.SourceRef](SourceRef$.html).Definition Classes[FlowOps](scaladsl/FlowOps.html)
58. [**](../../akka/stream/SourceRef.html#foldAsync[T](zero:T)(f:(T,Out)=>scala.concurrent.Future[T]):FlowOps.this.Repr[T] "Permalink")  def foldAsync\[T](zero: T)(f: (T, T) \=\> [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[T]): [Source](scaladsl/Source.html)\[T, [NotUsed](../NotUsed.html)]Similar to `fold` but with an asynchronous function.

Similar to `fold` but with an asynchronous function.
Applies the given function towards its current and next value,
yielding the next current value.

Adheres to the [ActorAttributes.SupervisionStrategy](ActorAttributes$$SupervisionStrategy.html) attribute.

If the function `f` returns a failure and the supervision decision is
[akka.stream.Supervision.Restart](Supervision$$Restart$.html) current value starts at `zero` again
the stream will continue.

Note that the `zero` value must be immutable.

**Emits when** upstream completes

**Backpressures when** downstream backpressures

**Completes when** upstream completes

**Cancels when** downstream cancels

See also [FlowOps.fold](scaladsl/FlowOps.html#fold[T](zero:T)(f:(T,Out)=>T):FlowOps.this.Repr[T])

ImplicitThis member is added by an implicit conversion from SourceRef\[T] to[Source](scaladsl/Source.html)\[T, [NotUsed](../NotUsed.html)] performed by method convertRefToSource in [akka.stream.SourceRef](SourceRef$.html).Definition Classes[FlowOps](scaladsl/FlowOps.html)
59. [**](../../akka/stream/SourceRef.html#getAttributes:akka.stream.Attributes "Permalink")  def getAttributes: [Attributes](Attributes.html)ImplicitThis member is added by an implicit conversion from SourceRef\[T] to[Source](scaladsl/Source.html)\[T, [NotUsed](../NotUsed.html)] performed by method convertRefToSource in [akka.stream.SourceRef](SourceRef$.html).Definition Classes[Source](scaladsl/Source.html) → [Graph](Graph.html)
60. [**](../../akka/stream/SourceRef.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
61. [**](../../akka/stream/SourceRef.html#getSource:akka.stream.javadsl.Source[T,akka.NotUsed] "Permalink") final  def getSource: [Source](javadsl/Source.html)\[T, [NotUsed](../NotUsed.html)]Java API: Get [javadsl.Source](javadsl/Source.html) underlying to this source ref.
62. [**](../../akka/stream/SourceRef.html#groupBy[K](maxSubstreams:Int,f:Out=>K):akka.stream.scaladsl.SubFlow[Out,Mat,FlowOps.this.Repr,FlowOps.this.Closed] "Permalink")  def groupBy\[K](maxSubstreams: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), f: (T) \=\> K): [SubFlow](scaladsl/SubFlow.html)\[T, [NotUsed](../NotUsed.html), \[\+O][Source](scaladsl/Source.html)\[O, [NotUsed](../NotUsed.html)], [RunnableGraph](scaladsl/RunnableGraph.html)\[[NotUsed](../NotUsed.html)]]This operation demultiplexes the incoming stream into separate output
streams, one for each element key.

This operation demultiplexes the incoming stream into separate output
streams, one for each element key. The key is computed for each element
using the given function. When a new key is encountered for the first time
a new substream is opened and subsequently fed with all elements belonging to
that key.

WARNING: The operator keeps track of all keys of streams that have already been closed.
If you expect an infinite number of keys this can cause memory issues. Elements belonging
to those keys are drained directly and not send to the substream.

ImplicitThis member is added by an implicit conversion from SourceRef\[T] to[Source](scaladsl/Source.html)\[T, [NotUsed](../NotUsed.html)] performed by method convertRefToSource in [akka.stream.SourceRef](SourceRef$.html).Definition Classes[FlowOps](scaladsl/FlowOps.html)See also[\#groupBy](scaladsl/Source.html#groupBy[K](maxSubstreams:Int,f:Out=>K):akka.stream.scaladsl.SubFlow[Out,Mat,FlowOps.this.Repr,FlowOps.this.Closed])
63. [**](../../akka/stream/SourceRef.html#groupBy[K](maxSubstreams:Int,f:Out=>K,allowClosedSubstreamRecreation:Boolean):akka.stream.scaladsl.SubFlow[Out,Mat,FlowOps.this.Repr,FlowOps.this.Closed] "Permalink")  def groupBy\[K](maxSubstreams: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), f: (T) \=\> K, allowClosedSubstreamRecreation: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): [SubFlow](scaladsl/SubFlow.html)\[T, [NotUsed](../NotUsed.html), \[\+O][Source](scaladsl/Source.html)\[O, [NotUsed](../NotUsed.html)], [RunnableGraph](scaladsl/RunnableGraph.html)\[[NotUsed](../NotUsed.html)]]This operation demultiplexes the incoming stream into separate output
streams, one for each element key.

This operation demultiplexes the incoming stream into separate output
streams, one for each element key. The key is computed for each element
using the given function. When a new key is encountered for the first time
a new substream is opened and subsequently fed with all elements belonging to
that key.

WARNING: If `allowClosedSubstreamRecreation` is set to `false` (default behavior) the operator
keeps track of all keys of streams that have already been closed. If you expect an infinite
number of keys this can cause memory issues. Elements belonging to those keys are drained
directly and not send to the substream.

Note: If `allowClosedSubstreamRecreation` is set to `true` substream completion and incoming
elements are subject to race\-conditions. If elements arrive for a stream that is in the process
of closing these elements might get lost.

The object returned from this method is not a normal [Source](scaladsl/Source.html) or [Flow](scaladsl/Flow.html),
it is a [SubFlow](scaladsl/SubFlow.html). This means that after this operator all transformations
are applied to all encountered substreams in the same fashion. Substream mode
is exited either by closing the substream (i.e. connecting it to a [Sink](scaladsl/Sink.html))
or by merging the substreams back together; see the `to` and `mergeBack` methods
on [SubFlow](scaladsl/SubFlow.html) for more information.

It is important to note that the substreams also propagate back\-pressure as
any other stream, which means that blocking one substream will block the `groupBy`
operator itself—and thereby all substreams—once all internal or
explicit buffers are filled.

If the group by function `f` throws an exception and the supervision decision
is [akka.stream.Supervision.Stop](Supervision$$Stop$.html) the stream and substreams will be completed
with failure.

If the group by function `f` throws an exception and the supervision decision
is [akka.stream.Supervision.Resume](Supervision$$Resume$.html) or [akka.stream.Supervision.Restart](Supervision$$Restart$.html)
the element is dropped and the stream and substreams continue.

Function `f` MUST NOT return `null`. This will throw exception and trigger supervision decision mechanism.

Adheres to the [ActorAttributes.SupervisionStrategy](ActorAttributes$$SupervisionStrategy.html) attribute.

**Emits when** an element for which the grouping function returns a group that has not yet been created.
Emits the new group

**Backpressures when** there is an element pending for a group whose substream backpressures

**Completes when** upstream completes

**Cancels when** downstream cancels and all substreams cancel

maxSubstreamsconfigures the maximum number of substreams (keys)
 that are supported; if more distinct keys are encountered then the stream fails

fcomputes the key for each element

allowClosedSubstreamRecreationenables recreation of already closed substreams if elements with their
 corresponding keys arrive after completion

ImplicitThis member is added by an implicit conversion from SourceRef\[T] to[Source](scaladsl/Source.html)\[T, [NotUsed](../NotUsed.html)] performed by method convertRefToSource in [akka.stream.SourceRef](SourceRef$.html).Definition Classes[FlowOps](scaladsl/FlowOps.html)
64. [**](../../akka/stream/SourceRef.html#grouped(n:Int):FlowOps.this.Repr[Seq[Out]] "Permalink")  def grouped(n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Source](scaladsl/Source.html)\[[Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[T], [NotUsed](../NotUsed.html)]Chunk up this stream into groups of the given size, with the last group
possibly smaller than requested due to end\-of\-stream.

Chunk up this stream into groups of the given size, with the last group
possibly smaller than requested due to end\-of\-stream.

`n` must be positive, otherwise IllegalArgumentException is thrown.

**Emits when** the specified number of elements have been accumulated or upstream completed

**Backpressures when** a group has been assembled and downstream backpressures

**Completes when** upstream completes

**Cancels when** downstream cancels

ImplicitThis member is added by an implicit conversion from SourceRef\[T] to[Source](scaladsl/Source.html)\[T, [NotUsed](../NotUsed.html)] performed by method convertRefToSource in [akka.stream.SourceRef](SourceRef$.html).Definition Classes[FlowOps](scaladsl/FlowOps.html)
65. [**](../../akka/stream/SourceRef.html#groupedWeighted(minWeight:Long)(costFn:Out=>Long):FlowOps.this.Repr[Seq[Out]] "Permalink")  def groupedWeighted(minWeight: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long))(costFn: (T) \=\> [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Source](scaladsl/Source.html)\[[Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[T], [NotUsed](../NotUsed.html)]Chunk up this stream into groups of elements that have a cumulative weight greater than or equal to
the `minWeight`, with the last group possibly smaller than requested `minWeight` due to end\-of\-stream.

Chunk up this stream into groups of elements that have a cumulative weight greater than or equal to
the `minWeight`, with the last group possibly smaller than requested `minWeight` due to end\-of\-stream.

`minWeight` must be positive, otherwise IllegalArgumentException is thrown.
`costFn` must return a non\-negative result for all inputs, otherwise the stage will fail
with an IllegalArgumentException.

**Emits when** the cumulative weight of elements is greater than or equal to the `minWeight` or upstream completed

**Backpressures when** a buffered group weighs more than `minWeight` and downstream backpressures

**Completes when** upstream completes

**Cancels when** downstream cancels

ImplicitThis member is added by an implicit conversion from SourceRef\[T] to[Source](scaladsl/Source.html)\[T, [NotUsed](../NotUsed.html)] performed by method convertRefToSource in [akka.stream.SourceRef](SourceRef$.html).Definition Classes[FlowOps](scaladsl/FlowOps.html)
66. [**](../../akka/stream/SourceRef.html#groupedWeightedWithin(maxWeight:Long,maxNumber:Int,d:scala.concurrent.duration.FiniteDuration)(costFn:Out=>Long):FlowOps.this.Repr[Seq[Out]] "Permalink")  def groupedWeightedWithin(maxWeight: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), maxNumber: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), d: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration))(costFn: (T) \=\> [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Source](scaladsl/Source.html)\[[Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[T], [NotUsed](../NotUsed.html)]Chunk up this stream into groups of elements received within a time window,
or limited by the weight and number of the elements, whatever happens first.

Chunk up this stream into groups of elements received within a time window,
or limited by the weight and number of the elements, whatever happens first.
Empty groups will not be emitted if no elements are received from upstream.
The last group before end\-of\-stream will contain the buffered elements
since the previously emitted group.

`maxWeight` must be positive, `maxNumber` must be positive, and `d` must be greater than 0 seconds,
otherwise IllegalArgumentException is thrown.

**Emits when** the configured time elapses since the last group has been emitted or weight limit reached

**Backpressures when** downstream backpressures, and buffered group (\+ pending element) weighs more than
`maxWeight` or has more than `maxNumber` elements

**Completes when** upstream completes (emits last group)

**Cancels when** downstream completes

ImplicitThis member is added by an implicit conversion from SourceRef\[T] to[Source](scaladsl/Source.html)\[T, [NotUsed](../NotUsed.html)] performed by method convertRefToSource in [akka.stream.SourceRef](SourceRef$.html).Definition Classes[FlowOps](scaladsl/FlowOps.html)
67. [**](../../akka/stream/SourceRef.html#groupedWeightedWithin(maxWeight:Long,d:scala.concurrent.duration.FiniteDuration)(costFn:Out=>Long):FlowOps.this.Repr[Seq[Out]] "Permalink")  def groupedWeightedWithin(maxWeight: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), d: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration))(costFn: (T) \=\> [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Source](scaladsl/Source.html)\[[Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[T], [NotUsed](../NotUsed.html)]Chunk up this stream into groups of elements received within a time window,
or limited by the weight of the elements, whatever happens first.

Chunk up this stream into groups of elements received within a time window,
or limited by the weight of the elements, whatever happens first.
Empty groups will not be emitted if no elements are received from upstream.
The last group before end\-of\-stream will contain the buffered elements
since the previously emitted group.

`maxWeight` must be positive, and `d` must be greater than 0 seconds, otherwise
IllegalArgumentException is thrown.

**Emits when** the configured time elapses since the last group has been emitted or weight limit reached

**Backpressures when** downstream backpressures, and buffered group (\+ pending element) weighs more than `maxWeight`

**Completes when** upstream completes (emits last group)

**Cancels when** downstream completes

ImplicitThis member is added by an implicit conversion from SourceRef\[T] to[Source](scaladsl/Source.html)\[T, [NotUsed](../NotUsed.html)] performed by method convertRefToSource in [akka.stream.SourceRef](SourceRef$.html).Definition Classes[FlowOps](scaladsl/FlowOps.html)
68. [**](../../akka/stream/SourceRef.html#groupedWithin(n:Int,d:scala.concurrent.duration.FiniteDuration):FlowOps.this.Repr[Seq[Out]] "Permalink")  def groupedWithin(n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), d: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)): [Source](scaladsl/Source.html)\[[Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[T], [NotUsed](../NotUsed.html)]Chunk up this stream into groups of elements received within a time window,
or limited by the given number of elements, whatever happens first.

Chunk up this stream into groups of elements received within a time window,
or limited by the given number of elements, whatever happens first.
Empty groups will not be emitted if no elements are received from upstream.
The last group before end\-of\-stream will contain the buffered elements
since the previously emitted group.

`n` must be positive, and `d` must be greater than 0 seconds, otherwise
IllegalArgumentException is thrown.

**Emits when** the configured time elapses since the last group has been emitted or `n` elements is buffered

**Backpressures when** downstream backpressures, and there are `n+1` buffered elements

**Completes when** upstream completes (emits last group)

**Cancels when** downstream completes

ImplicitThis member is added by an implicit conversion from SourceRef\[T] to[Source](scaladsl/Source.html)\[T, [NotUsed](../NotUsed.html)] performed by method convertRefToSource in [akka.stream.SourceRef](SourceRef$.html).Definition Classes[FlowOps](scaladsl/FlowOps.html)
69. [**](../../akka/stream/SourceRef.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
70. [**](../../akka/stream/SourceRef.html#idleTimeout(timeout:scala.concurrent.duration.FiniteDuration):FlowOps.this.Repr[Out] "Permalink")  def idleTimeout(timeout: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)): [Source](scaladsl/Source.html)\[T, [NotUsed](../NotUsed.html)]If the time between two processed elements exceeds the provided timeout, the stream is failed
with a [akka.stream.StreamIdleTimeoutException](StreamIdleTimeoutException.html).

If the time between two processed elements exceeds the provided timeout, the stream is failed
with a [akka.stream.StreamIdleTimeoutException](StreamIdleTimeoutException.html). The timeout is checked periodically,
so the resolution of the check is one period (equals to timeout value).

**Emits when** upstream emits an element

**Backpressures when** downstream backpressures

**Completes when** upstream completes or fails if timeout elapses between two emitted elements

**Cancels when** downstream cancels

ImplicitThis member is added by an implicit conversion from SourceRef\[T] to[Source](scaladsl/Source.html)\[T, [NotUsed](../NotUsed.html)] performed by method convertRefToSource in [akka.stream.SourceRef](SourceRef$.html).Definition Classes[FlowOps](scaladsl/FlowOps.html)
71. [**](../../akka/stream/SourceRef.html#initialDelay(delay:scala.concurrent.duration.FiniteDuration):FlowOps.this.Repr[Out] "Permalink")  def initialDelay(delay: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)): [Source](scaladsl/Source.html)\[T, [NotUsed](../NotUsed.html)]Delays the initial element by the specified duration.

Delays the initial element by the specified duration.

**Emits when** upstream emits an element if the initial delay is already elapsed

**Backpressures when** downstream backpressures or initial delay is not yet elapsed

**Completes when** upstream completes

**Cancels when** downstream cancels

ImplicitThis member is added by an implicit conversion from SourceRef\[T] to[Source](scaladsl/Source.html)\[T, [NotUsed](../NotUsed.html)] performed by method convertRefToSource in [akka.stream.SourceRef](SourceRef$.html).Definition Classes[FlowOps](scaladsl/FlowOps.html)
72. [**](../../akka/stream/SourceRef.html#initialTimeout(timeout:scala.concurrent.duration.FiniteDuration):FlowOps.this.Repr[Out] "Permalink")  def initialTimeout(timeout: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)): [Source](scaladsl/Source.html)\[T, [NotUsed](../NotUsed.html)]If the first element has not passed through this operator before the provided timeout, the stream is failed
with a [akka.stream.InitialTimeoutException](InitialTimeoutException.html).

If the first element has not passed through this operator before the provided timeout, the stream is failed
with a [akka.stream.InitialTimeoutException](InitialTimeoutException.html).

**Emits when** upstream emits an element

**Backpressures when** downstream backpressures

**Completes when** upstream completes or fails if timeout elapses before first element arrives

**Cancels when** downstream cancels

ImplicitThis member is added by an implicit conversion from SourceRef\[T] to[Source](scaladsl/Source.html)\[T, [NotUsed](../NotUsed.html)] performed by method convertRefToSource in [akka.stream.SourceRef](SourceRef$.html).Definition Classes[FlowOps](scaladsl/FlowOps.html)
73. [**](../../akka/stream/SourceRef.html#interleave[U>:Out](that:akka.stream.Graph[akka.stream.SourceShape[U],_],segmentSize:Int,eagerClose:Boolean):FlowOps.this.Repr[U] "Permalink")  def interleave\[U \>: Out](that: [Graph](Graph.html)\[[SourceShape](SourceShape.html)\[U], \_], segmentSize: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), eagerClose: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): [Source](scaladsl/Source.html)\[U, [NotUsed](../NotUsed.html)]Interleave is a deterministic merge of the given [Source](scaladsl/Source.html) with elements of this [Flow](scaladsl/Flow.html).

Interleave is a deterministic merge of the given [Source](scaladsl/Source.html) with elements of this [Flow](scaladsl/Flow.html).
It first emits `segmentSize` number of elements from this flow to downstream, then \- same amount for `that`
source, then repeat process.

If eagerClose is false and one of the upstreams complete the elements from the other upstream will continue passing
through the interleave operator. If eagerClose is true and one of the upstream complete interleave will cancel the
other upstream and complete itself.

If it gets error from one of upstreams \- stream completes with failure.

**Emits when** element is available from the currently consumed upstream

**Backpressures when** downstream backpressures. Signal to current
upstream, switch to next upstream when received `segmentSize` elements

**Completes when** the [Flow](scaladsl/Flow.html) and given [Source](scaladsl/Source.html) completes

**Cancels when** downstream cancels

ImplicitThis member is added by an implicit conversion from SourceRef\[T] to[Source](scaladsl/Source.html)\[T, [NotUsed](../NotUsed.html)] performed by method convertRefToSource in [akka.stream.SourceRef](SourceRef$.html).Definition Classes[FlowOps](scaladsl/FlowOps.html)
74. [**](../../akka/stream/SourceRef.html#interleave[U>:Out](that:akka.stream.Graph[akka.stream.SourceShape[U],_],segmentSize:Int):FlowOps.this.Repr[U] "Permalink")  def interleave\[U \>: Out](that: [Graph](Graph.html)\[[SourceShape](SourceShape.html)\[U], \_], segmentSize: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Source](scaladsl/Source.html)\[U, [NotUsed](../NotUsed.html)]Interleave is a deterministic merge of the given [Source](scaladsl/Source.html) with elements of this [Flow](scaladsl/Flow.html).

Interleave is a deterministic merge of the given [Source](scaladsl/Source.html) with elements of this [Flow](scaladsl/Flow.html).
It first emits `segmentSize` number of elements from this flow to downstream, then \- same amount for `that`
source, then repeat process.

Example:

```
Source(List(1, 2, 3)).interleave(List(4, 5, 6, 7), 2) // 1, 2, 4, 5, 3, 6, 7
```
After one of upstreams is complete then all the rest elements will be emitted from the second one

If it gets error from one of upstreams \- stream completes with failure.

**Emits when** element is available from the currently consumed upstream

**Backpressures when** downstream backpressures. Signal to current
upstream, switch to next upstream when received `segmentSize` elements

**Completes when** the [Flow](scaladsl/Flow.html) and given [Source](scaladsl/Source.html) completes

**Cancels when** downstream cancels

ImplicitThis member is added by an implicit conversion from SourceRef\[T] to[Source](scaladsl/Source.html)\[T, [NotUsed](../NotUsed.html)] performed by method convertRefToSource in [akka.stream.SourceRef](SourceRef$.html).Definition Classes[FlowOps](scaladsl/FlowOps.html)
75. [**](../../akka/stream/SourceRef.html#interleaveAll[U>:Out](those:Seq[akka.stream.Graph[akka.stream.SourceShape[U],_]],segmentSize:Int,eagerClose:Boolean):FlowOps.this.Repr[U] "Permalink")  def interleaveAll\[U \>: Out](those: [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[[Graph](Graph.html)\[[SourceShape](SourceShape.html)\[U], \_]], segmentSize: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), eagerClose: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): [Source](scaladsl/Source.html)\[U, [NotUsed](../NotUsed.html)]Interleave is a deterministic merge of the given [Source](scaladsl/Source.html)s with elements of this [Flow](scaladsl/Flow.html).

Interleave is a deterministic merge of the given [Source](scaladsl/Source.html)s with elements of this [Flow](scaladsl/Flow.html).
It first emits `segmentSize` number of elements from this flow to downstream, then \- same amount for `that`
source, then repeat process.

If eagerClose is false and one of the upstreams complete the elements from the other upstream will continue passing
through the interleave operator. If eagerClose is true and one of the upstream complete interleave will cancel the
other upstream and complete itself.

If it gets error from one of upstreams \- stream completes with failure.

**Emits when** element is available from the currently consumed upstream

**Backpressures when** downstream backpressures. Signal to current
upstream, switch to next upstream when received `segmentSize` elements

**Completes when** the [Flow](scaladsl/Flow.html) and given [Source](scaladsl/Source.html) completes

**Cancels when** downstream cancels

ImplicitThis member is added by an implicit conversion from SourceRef\[T] to[Source](scaladsl/Source.html)\[T, [NotUsed](../NotUsed.html)] performed by method convertRefToSource in [akka.stream.SourceRef](SourceRef$.html).Definition Classes[FlowOps](scaladsl/FlowOps.html)
76. [**](../../akka/stream/SourceRef.html#interleaveMat[U>:Out,Mat2,Mat3](that:akka.stream.Graph[akka.stream.SourceShape[U],Mat2],segmentSize:Int,eagerClose:Boolean)(matF:(Mat,Mat2)=>Mat3):FlowOpsMat.this.ReprMat[U,Mat3] "Permalink")  def interleaveMat\[U \>: Out, Mat2, Mat3](that: [Graph](Graph.html)\[[SourceShape](SourceShape.html)\[U], Mat2], segmentSize: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), eagerClose: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean))(matF: ([NotUsed](../NotUsed.html), Mat2) \=\> Mat3): [Source](scaladsl/Source.html)\[U, Mat3]Interleave is a deterministic merge of the given [Source](scaladsl/Source.html) with elements of this [Flow](scaladsl/Flow.html).

Interleave is a deterministic merge of the given [Source](scaladsl/Source.html) with elements of this [Flow](scaladsl/Flow.html).
It first emits `segmentSize` number of elements from this flow to downstream, then \- same amount for `that` source,
then repeat process.

If eagerClose is false and one of the upstreams complete the elements from the other upstream will continue passing
through the interleave operator. If eagerClose is true and one of the upstream complete interleave will cancel the
other upstream and complete itself.

If it gets error from one of upstreams \- stream completes with failure.

ImplicitThis member is added by an implicit conversion from SourceRef\[T] to[Source](scaladsl/Source.html)\[T, [NotUsed](../NotUsed.html)] performed by method convertRefToSource in [akka.stream.SourceRef](SourceRef$.html).Definition Classes[FlowOpsMat](scaladsl/FlowOpsMat.html)Annotations@nowarn() See also[\#interleave](scaladsl/Source.html#interleave[U>:Out](that:akka.stream.Graph[akka.stream.SourceShape[U],_],segmentSize:Int,eagerClose:Boolean):FlowOps.this.Repr[U]).
It is recommended to use the internally optimized `Keep.left` and `Keep.right` combiners
where appropriate instead of manually writing functions that pass through one of the values.
77. [**](../../akka/stream/SourceRef.html#interleaveMat[U>:Out,Mat2,Mat3](that:akka.stream.Graph[akka.stream.SourceShape[U],Mat2],segmentSize:Int)(matF:(Mat,Mat2)=>Mat3):FlowOpsMat.this.ReprMat[U,Mat3] "Permalink")  def interleaveMat\[U \>: Out, Mat2, Mat3](that: [Graph](Graph.html)\[[SourceShape](SourceShape.html)\[U], Mat2], segmentSize: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int))(matF: ([NotUsed](../NotUsed.html), Mat2) \=\> Mat3): [Source](scaladsl/Source.html)\[U, Mat3]Interleave is a deterministic merge of the given [Source](scaladsl/Source.html) with elements of this [Flow](scaladsl/Flow.html).

Interleave is a deterministic merge of the given [Source](scaladsl/Source.html) with elements of this [Flow](scaladsl/Flow.html).
It first emits `segmentSize` number of elements from this flow to downstream, then \- same amount for `that` source,
then repeat process.

After one of upstreams is complete then all the rest elements will be emitted from the second one

If it gets error from one of upstreams \- stream completes with failure.

ImplicitThis member is added by an implicit conversion from SourceRef\[T] to[Source](scaladsl/Source.html)\[T, [NotUsed](../NotUsed.html)] performed by method convertRefToSource in [akka.stream.SourceRef](SourceRef$.html).Definition Classes[FlowOpsMat](scaladsl/FlowOpsMat.html)Annotations@nowarn() See also[\#interleave](scaladsl/Source.html#interleave[U>:Out](that:akka.stream.Graph[akka.stream.SourceShape[U],_],segmentSize:Int,eagerClose:Boolean):FlowOps.this.Repr[U]).
It is recommended to use the internally optimized `Keep.left` and `Keep.right` combiners
where appropriate instead of manually writing functions that pass through one of the values.
78. [**](../../akka/stream/SourceRef.html#intersperse[T>:Out](inject:T):FlowOps.this.Repr[T] "Permalink")  def intersperse\[T \>: Out](inject: T): [Source](scaladsl/Source.html)\[T, [NotUsed](../NotUsed.html)]Intersperses stream with provided element, similar to how [scala.collection.immutable.List.mkString](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/List.html#mkString:String)
injects a separator between a List's elements.

Intersperses stream with provided element, similar to how [scala.collection.immutable.List.mkString](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/List.html#mkString:String)
injects a separator between a List's elements.

Additionally can inject start and end marker elements to stream.

Examples:

```
val nums = Source(List(1,2,3)).map(_.toString)
nums.intersperse(",")            //   1 , 2 , 3
nums.intersperse("[", ",", "]")  // [ 1 , 2 , 3 ]
```
**Emits when** upstream emits (or before with the `start` element if provided)

**Backpressures when** downstream backpressures

**Completes when** upstream completes

**Cancels when** downstream cancels

ImplicitThis member is added by an implicit conversion from SourceRef\[T] to[Source](scaladsl/Source.html)\[T, [NotUsed](../NotUsed.html)] performed by method convertRefToSource in [akka.stream.SourceRef](SourceRef$.html).Definition Classes[FlowOps](scaladsl/FlowOps.html)
79. [**](../../akka/stream/SourceRef.html#intersperse[T>:Out](start:T,inject:T,end:T):FlowOps.this.Repr[T] "Permalink")  def intersperse\[T \>: Out](start: T, inject: T, end: T): [Source](scaladsl/Source.html)\[T, [NotUsed](../NotUsed.html)]Intersperses stream with provided element, similar to how [scala.collection.immutable.List.mkString](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/List.html#mkString:String)
injects a separator between a List's elements.

Intersperses stream with provided element, similar to how [scala.collection.immutable.List.mkString](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/List.html#mkString:String)
injects a separator between a List's elements.

Additionally can inject start and end marker elements to stream.

Examples:

```
val nums = Source(List(1,2,3)).map(_.toString)
nums.intersperse(",")            //   1 , 2 , 3
nums.intersperse("[", ",", "]")  // [ 1 , 2 , 3 ]
```
In case you want to only prepend or only append an element (yet still use the `intercept` feature
to inject a separator between elements, you may want to use the following pattern instead of the 3\-argument
version of intersperse (See [Source.concat](scaladsl/Source.html#concat[U>:Out,Mat2](that:akka.stream.Graph[akka.stream.SourceShape[U],Mat2]):FlowOps.this.Repr[U]) for semantics details):

```
Source.single(">> ") ++ Source(List("1", "2", "3")).intersperse(",")
Source(List("1", "2", "3")).intersperse(",") ++ Source.single("END")
```
**Emits when** upstream emits (or before with the `start` element if provided)

**Backpressures when** downstream backpressures

**Completes when** upstream completes

**Cancels when** downstream cancels

ImplicitThis member is added by an implicit conversion from SourceRef\[T] to[Source](scaladsl/Source.html)\[T, [NotUsed](../NotUsed.html)] performed by method convertRefToSource in [akka.stream.SourceRef](SourceRef$.html).Definition Classes[FlowOps](scaladsl/FlowOps.html)
80. [**](../../akka/stream/SourceRef.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
81. [**](../../akka/stream/SourceRef.html#keepAlive[U>:Out](maxIdle:scala.concurrent.duration.FiniteDuration,injectedElem:()=>U):FlowOps.this.Repr[U] "Permalink")  def keepAlive\[U \>: Out](maxIdle: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), injectedElem: () \=\> U): [Source](scaladsl/Source.html)\[U, [NotUsed](../NotUsed.html)]Injects additional elements if upstream does not emit for a configured amount of time.

Injects additional elements if upstream does not emit for a configured amount of time. In other words, this
operator attempts to maintains a base rate of emitted elements towards the downstream.

If the downstream backpressures then no element is injected until downstream demand arrives. Injected elements
do not accumulate during this period.

Upstream elements are always preferred over injected elements.

**Emits when** upstream emits an element or if the upstream was idle for the configured period

**Backpressures when** downstream backpressures

**Completes when** upstream completes

**Cancels when** downstream cancels

ImplicitThis member is added by an implicit conversion from SourceRef\[T] to[Source](scaladsl/Source.html)\[T, [NotUsed](../NotUsed.html)] performed by method convertRefToSource in [akka.stream.SourceRef](SourceRef$.html).Definition Classes[FlowOps](scaladsl/FlowOps.html)
82. [**](../../akka/stream/SourceRef.html#limit(max:Long):FlowOps.this.Repr[Out] "Permalink")  def limit(max: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Source](scaladsl/Source.html)\[T, [NotUsed](../NotUsed.html)]Ensure stream boundedness by limiting the number of elements from upstream.

Ensure stream boundedness by limiting the number of elements from upstream.
If the number of incoming elements exceeds max, it will signal
upstream failure `StreamLimitException` downstream.

Due to input buffering some elements may have been
requested from upstream publishers that will then not be processed downstream
of this step.

**Emits when** upstream emits and the number of emitted elements has not reached max

**Backpressures when** downstream backpressures

**Completes when** upstream completes and the number of emitted elements has not reached max

**Errors when** the total number of incoming element exceeds max

**Cancels when** downstream cancels

See also [FlowOps.take](scaladsl/FlowOps.html#take(n:Long):FlowOps.this.Repr[Out]), [FlowOps.takeWithin](scaladsl/FlowOps.html#takeWithin(d:scala.concurrent.duration.FiniteDuration):FlowOps.this.Repr[Out]), [FlowOps.takeWhile](scaladsl/FlowOps.html#takeWhile(p:Out=>Boolean,inclusive:Boolean):FlowOps.this.Repr[Out])

ImplicitThis member is added by an implicit conversion from SourceRef\[T] to[Source](scaladsl/Source.html)\[T, [NotUsed](../NotUsed.html)] performed by method convertRefToSource in [akka.stream.SourceRef](SourceRef$.html).Definition Classes[FlowOps](scaladsl/FlowOps.html)
83. [**](../../akka/stream/SourceRef.html#limitWeighted[T](max:Long)(costFn:Out=>Long):FlowOps.this.Repr[Out] "Permalink")  def limitWeighted\[T](max: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long))(costFn: (T) \=\> [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Source](scaladsl/Source.html)\[T, [NotUsed](../NotUsed.html)]Ensure stream boundedness by evaluating the cost of incoming elements
using a cost function.

Ensure stream boundedness by evaluating the cost of incoming elements
using a cost function. Exactly how many elements will be allowed to travel downstream depends on the
evaluated cost of each element. If the accumulated cost exceeds max, it will signal
upstream failure `StreamLimitException` downstream.

Due to input buffering some elements may have been
requested from upstream publishers that will then not be processed downstream
of this step.

Adheres to the [ActorAttributes.SupervisionStrategy](ActorAttributes$$SupervisionStrategy.html) attribute.

**Emits when** upstream emits and the accumulated cost has not reached max

**Backpressures when** downstream backpressures

**Completes when** upstream completes and the number of emitted elements has not reached max

**Errors when** when the accumulated cost exceeds max

**Cancels when** downstream cancels

See also [FlowOps.take](scaladsl/FlowOps.html#take(n:Long):FlowOps.this.Repr[Out]), [FlowOps.takeWithin](scaladsl/FlowOps.html#takeWithin(d:scala.concurrent.duration.FiniteDuration):FlowOps.this.Repr[Out]), [FlowOps.takeWhile](scaladsl/FlowOps.html#takeWhile(p:Out=>Boolean,inclusive:Boolean):FlowOps.this.Repr[Out])

ImplicitThis member is added by an implicit conversion from SourceRef\[T] to[Source](scaladsl/Source.html)\[T, [NotUsed](../NotUsed.html)] performed by method convertRefToSource in [akka.stream.SourceRef](SourceRef$.html).Definition Classes[FlowOps](scaladsl/FlowOps.html)
84. [**](../../akka/stream/SourceRef.html#log(name:String,extract:Out=>Any)(implicitlog:akka.event.LoggingAdapter):FlowOps.this.Repr[Out] "Permalink")  def log(name: [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String), extract: (T) \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any) \= [ConstantFun.scalaIdentityFunction](../index.html))(implicit log: [LoggingAdapter](../event/LoggingAdapter.html) \= null): [Source](scaladsl/Source.html)\[T, [NotUsed](../NotUsed.html)]Logs elements flowing through the stream as well as completion and erroring.

Logs elements flowing through the stream as well as completion and erroring.

By default element and completion signals are logged on debug level, and errors are logged on Error level.
This can be adjusted according to your needs by providing a custom [Attributes.LogLevels](Attributes$$LogLevels.html) attribute on the given Flow:

Uses implicit LoggingAdapter if available, otherwise uses an internally created one,
which uses `akka.event.Logging(materializer.system, materializer)` as its source (use this class to configure slf4j loggers).

Adheres to the [ActorAttributes.SupervisionStrategy](ActorAttributes$$SupervisionStrategy.html) attribute.

**Emits when** the mapping function returns an element

**Backpressures when** downstream backpressures

**Completes when** upstream completes

**Cancels when** downstream cancels

ImplicitThis member is added by an implicit conversion from SourceRef\[T] to[Source](scaladsl/Source.html)\[T, [NotUsed](../NotUsed.html)] performed by method convertRefToSource in [akka.stream.SourceRef](SourceRef$.html).Definition Classes[FlowOps](scaladsl/FlowOps.html)
85. [**](../../akka/stream/SourceRef.html#logWithMarker(name:String,marker:Out=>akka.event.LogMarker,extract:Out=>Any)(implicitlog:akka.event.MarkerLoggingAdapter):FlowOps.this.Repr[Out] "Permalink")  def logWithMarker(name: [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String), marker: (T) \=\> [LogMarker](../event/LogMarker.html), extract: (T) \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any) \= [ConstantFun.scalaIdentityFunction](../index.html))(implicit log: [MarkerLoggingAdapter](../event/MarkerLoggingAdapter.html) \= null): [Source](scaladsl/Source.html)\[T, [NotUsed](../NotUsed.html)]Logs elements flowing through the stream as well as completion and erroring.

Logs elements flowing through the stream as well as completion and erroring.

By default element and completion signals are logged on debug level, and errors are logged on Error level.
This can be adjusted according to your needs by providing a custom [Attributes.LogLevels](Attributes$$LogLevels.html) attribute on the given Flow:

Uses implicit MarkerLoggingAdapter if available, otherwise uses an internally created one,
which uses `akka.event.Logging.withMarker(materializer.system, materializer)` as its source (use this class to configure slf4j loggers).

Adheres to the [ActorAttributes.SupervisionStrategy](ActorAttributes$$SupervisionStrategy.html) attribute.

**Emits when** the mapping function returns an element

**Backpressures when** downstream backpressures

**Completes when** upstream completes

**Cancels when** downstream cancels

ImplicitThis member is added by an implicit conversion from SourceRef\[T] to[Source](scaladsl/Source.html)\[T, [NotUsed](../NotUsed.html)] performed by method convertRefToSource in [akka.stream.SourceRef](SourceRef$.html).Definition Classes[FlowOps](scaladsl/FlowOps.html)
86. [**](../../akka/stream/SourceRef.html#map[T](f:Out=>T):FlowOps.this.Repr[T] "Permalink")  def map\[T](f: (T) \=\> T): [Source](scaladsl/Source.html)\[T, [NotUsed](../NotUsed.html)]Transform this stream by applying the given function to each of the elements
as they pass through this processing step.

Transform this stream by applying the given function to each of the elements
as they pass through this processing step.

Adheres to the [ActorAttributes.SupervisionStrategy](ActorAttributes$$SupervisionStrategy.html) attribute.

**Emits when** the mapping function returns an element

**Backpressures when** downstream backpressures

**Completes when** upstream completes

**Cancels when** downstream cancels

ImplicitThis member is added by an implicit conversion from SourceRef\[T] to[Source](scaladsl/Source.html)\[T, [NotUsed](../NotUsed.html)] performed by method convertRefToSource in [akka.stream.SourceRef](SourceRef$.html).Definition Classes[FlowOps](scaladsl/FlowOps.html)
87. [**](../../akka/stream/SourceRef.html#mapAsync[T](parallelism:Int)(f:Out=>scala.concurrent.Future[T]):FlowOps.this.Repr[T] "Permalink")  def mapAsync\[T](parallelism: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int))(f: (T) \=\> [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[T]): [Source](scaladsl/Source.html)\[T, [NotUsed](../NotUsed.html)]Transform this stream by applying the given function to each of the elements
as they pass through this processing step.

Transform this stream by applying the given function to each of the elements
as they pass through this processing step. The function returns a `Future` and the
value of that future will be emitted downstream. The number of Futures
that shall run in parallel is given as the first argument to `mapAsync`.
These Futures may complete in any order, but the elements that
are emitted downstream are in the same order as received from upstream.

If the function `f` throws an exception or if the `Future` is completed
with failure and the supervision decision is [akka.stream.Supervision.Stop](Supervision$$Stop$.html)
the stream will be completed with failure.

If the function `f` throws an exception or if the `Future` is completed
with failure and the supervision decision is [akka.stream.Supervision.Resume](Supervision$$Resume$.html) or
[akka.stream.Supervision.Restart](Supervision$$Restart$.html) the element is dropped and the stream continues.

If the `Future` is completed with `null`, it is ignored and the next element is processed.

The function `f` is always invoked on the elements in the order they arrive.

Adheres to the [ActorAttributes.SupervisionStrategy](ActorAttributes$$SupervisionStrategy.html) attribute.

**Emits when** the Future returned by the provided function finishes for the next element in sequence

**Backpressures when** the number of futures reaches the configured parallelism and the downstream
backpressures or the first future is not completed

**Completes when** upstream completes and all futures have been completed and all elements have been emitted

**Cancels when** downstream cancels

ImplicitThis member is added by an implicit conversion from SourceRef\[T] to[Source](scaladsl/Source.html)\[T, [NotUsed](../NotUsed.html)] performed by method convertRefToSource in [akka.stream.SourceRef](SourceRef$.html).Definition Classes[FlowOps](scaladsl/FlowOps.html)See also[\#mapAsyncUnordered](scaladsl/Source.html#mapAsyncUnordered[T](parallelism:Int)(f:Out=>scala.concurrent.Future[T]):FlowOps.this.Repr[T]) and [\#mapAsyncPartitioned](scaladsl/Source.html#mapAsyncPartitioned[T,P](parallelism:Int,perPartition:Int)(partitioner:Out=>P)(f:(Out,P)=>scala.concurrent.Future[T]):FlowOps.this.Repr[T])
88. [**](../../akka/stream/SourceRef.html#mapAsyncPartitioned[T,P](parallelism:Int,perPartition:Int)(partitioner:Out=>P)(f:(Out,P)=>scala.concurrent.Future[T]):FlowOps.this.Repr[T] "Permalink")  def mapAsyncPartitioned\[T, P](parallelism: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), perPartition: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int))(partitioner: (T) \=\> P)(f: (T, P) \=\> [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[T]): [Source](scaladsl/Source.html)\[T, [NotUsed](../NotUsed.html)]Transform this stream by partitioning elements based on the provided partitioner as they
pass through this step and then applying a given `Future`\-returning function to each element
and its partition key.

Transform this stream by partitioning elements based on the provided partitioner as they
pass through this step and then applying a given `Future`\-returning function to each element
and its partition key. The value of the returned future, if successful, will be emitted
downstream.

The number of Futures running at any given time is bounded by the 'parallelism' and 'perPartition'
values. The futures may complete in any order, but the results are emitted in the same order
as the corresponding elements were received.

If the functions 'partitioner' or 'f' throw an exception, or the `Future` completes with failure,
supervision will be applied to determine a decision. If the decision is [akka.stream.Supervision.Stop](Supervision$$Stop$.html)
the stream will be stopped with failure; otherwise, the element will be dropped and the stream continues.

The function 'partitioner' is always invoked on the elements in the order they arrive.

The function 'f' is invoked on elements with the same partition key in the order they arrive. The order
of invocation of 'f' for elements with different partition keys is undefined and subject to factors
including, but not limited to, the distribution of partition keys within the stream.

Adheres to the [ActorAttributes.SupervisionStrategy](ActorAttributes$$SupervisionStrategy.html) attribute.

**Emits when** the Future returned by 'f' finishes for the next element in sequence

**Backpressures when** the number of elements for which no resulting future has completed reaches the
configured parallelism and the downstream backpressures

**Completes when** upstream completes and all futures have been completed and all results have been emitted

**Cancels when** downstream cancels

parallelismat most this many futures will be incomplete at any time

perPartitionat most this many futures will be incomplete for a given partition key at any time

partitionerfunction to generate a partition key

ffunction to generate a Future

ImplicitThis member is added by an implicit conversion from SourceRef\[T] to[Source](scaladsl/Source.html)\[T, [NotUsed](../NotUsed.html)] performed by method convertRefToSource in [akka.stream.SourceRef](SourceRef$.html).Definition Classes[FlowOps](scaladsl/FlowOps.html)See also[\#mapAsync](scaladsl/Source.html#mapAsync[T](parallelism:Int)(f:Out=>scala.concurrent.Future[T]):FlowOps.this.Repr[T]) and [\#mapAsyncUnordered](scaladsl/Source.html#mapAsyncUnordered[T](parallelism:Int)(f:Out=>scala.concurrent.Future[T]):FlowOps.this.Repr[T])
89. [**](../../akka/stream/SourceRef.html#mapAsyncUnordered[T](parallelism:Int)(f:Out=>scala.concurrent.Future[T]):FlowOps.this.Repr[T] "Permalink")  def mapAsyncUnordered\[T](parallelism: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int))(f: (T) \=\> [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[T]): [Source](scaladsl/Source.html)\[T, [NotUsed](../NotUsed.html)]Transform this stream by applying the given function to each of the elements
as they pass through this processing step.

Transform this stream by applying the given function to each of the elements
as they pass through this processing step. The function returns a `Future` and the
value of that future will be emitted downstream. The number of Futures
that shall run in parallel is given as the first argument to `mapAsyncUnordered`.
Each processed element will be emitted downstream as soon as it is ready, i.e. it is possible
that the elements are not emitted downstream in the same order as received from upstream.

If the function `f` throws an exception or if the `Future` is completed
with failure and the supervision decision is [akka.stream.Supervision.Stop](Supervision$$Stop$.html)
the stream will be completed with failure.

If the function `f` throws an exception or if the `Future` is completed
with failure and the supervision decision is [akka.stream.Supervision.Resume](Supervision$$Resume$.html) or
[akka.stream.Supervision.Restart](Supervision$$Restart$.html) the element is dropped and the stream continues.

If the `Future` is completed with `null`, it is ignored and the next element is processed.

The function `f` is always invoked on the elements in the order they arrive (even though the result of the futures
returned by `f` might be emitted in a different order).

Adheres to the [ActorAttributes.SupervisionStrategy](ActorAttributes$$SupervisionStrategy.html) attribute.

**Emits when** any of the Futures returned by the provided function complete

**Backpressures when** the number of futures reaches the configured parallelism and the downstream backpressures

**Completes when** upstream completes and all futures have been completed and all elements have been emitted

**Cancels when** downstream cancels

ImplicitThis member is added by an implicit conversion from SourceRef\[T] to[Source](scaladsl/Source.html)\[T, [NotUsed](../NotUsed.html)] performed by method convertRefToSource in [akka.stream.SourceRef](SourceRef$.html).Definition Classes[FlowOps](scaladsl/FlowOps.html)See also[\#mapAsync](scaladsl/Source.html#mapAsync[T](parallelism:Int)(f:Out=>scala.concurrent.Future[T]):FlowOps.this.Repr[T]) and [\#mapAsyncPartitioned](scaladsl/Source.html#mapAsyncPartitioned[T,P](parallelism:Int,perPartition:Int)(partitioner:Out=>P)(f:(Out,P)=>scala.concurrent.Future[T]):FlowOps.this.Repr[T])
90. [**](../../akka/stream/SourceRef.html#mapConcat[T](f:Out=>IterableOnce[T]):FlowOps.this.Repr[T] "Permalink")  def mapConcat\[T](f: (T) \=\> [IterableOnce](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnce.html#scala.collection.IterableOnce)\[T]): [Source](scaladsl/Source.html)\[T, [NotUsed](../NotUsed.html)]Transform each input element into an `Iterable` of output elements that is
then flattened into the output stream.

Transform each input element into an `Iterable` of output elements that is
then flattened into the output stream.

The returned `Iterable` MUST NOT contain `null` values,
as they are illegal as stream elements \- according to the Reactive Streams specification.

**Emits when** the mapping function returns an element or there are still remaining elements
from the previously calculated collection

**Backpressures when** downstream backpressures or there are still remaining elements from the
previously calculated collection

**Completes when** upstream completes and all remaining elements have been emitted

**Cancels when** downstream cancels

ImplicitThis member is added by an implicit conversion from SourceRef\[T] to[Source](scaladsl/Source.html)\[T, [NotUsed](../NotUsed.html)] performed by method convertRefToSource in [akka.stream.SourceRef](SourceRef$.html).Definition Classes[FlowOps](scaladsl/FlowOps.html)
91. [**](../../akka/stream/SourceRef.html#mapError(pf:PartialFunction[Throwable,Throwable]):FlowOps.this.Repr[Out] "Permalink")  def mapError(pf: [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[[Throwable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Throwable.html#java.lang.Throwable), [Throwable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Throwable.html#java.lang.Throwable)]): [Source](scaladsl/Source.html)\[T, [NotUsed](../NotUsed.html)]While similar to [recover](scaladsl/Source.html#recover[T>:Out](pf:PartialFunction[Throwable,T]):FlowOps.this.Repr[T]) this operator can be used to transform an error signal to a different one \*without\* logging
it as an error in the process.

While similar to [recover](scaladsl/Source.html#recover[T>:Out](pf:PartialFunction[Throwable,T]):FlowOps.this.Repr[T]) this operator can be used to transform an error signal to a different one \*without\* logging
it as an error in the process. So in that sense it is NOT exactly equivalent to `recover(t => throw t2)` since recover
would log the `t2` error.

Since the underlying failure signal onError arrives out\-of\-band, it might jump over existing elements.
This operator can recover the failure signal, but not the skipped elements, which will be dropped.

Similarly to [recover](scaladsl/Source.html#recover[T>:Out](pf:PartialFunction[Throwable,T]):FlowOps.this.Repr[T]) throwing an exception inside `mapError` \_will\_ be logged.

**Emits when** element is available from the upstream or upstream is failed and pf returns an element

**Backpressures when** downstream backpressures

**Completes when** upstream completes or upstream failed with exception pf can handle

**Cancels when** downstream cancels

ImplicitThis member is added by an implicit conversion from SourceRef\[T] to[Source](scaladsl/Source.html)\[T, [NotUsed](../NotUsed.html)] performed by method convertRefToSource in [akka.stream.SourceRef](SourceRef$.html).Definition Classes[FlowOps](scaladsl/FlowOps.html)
92. [**](../../akka/stream/SourceRef.html#mapMaterializedValue[Mat2](f:Mat=>Mat2):Source.this.ReprMat[Out,Mat2] "Permalink")  def mapMaterializedValue\[Mat2](f: ([NotUsed](../NotUsed.html)) \=\> Mat2): [Source](scaladsl/Source.html)\[T, Mat2]Transform only the materialized value of this Source, leaving all other properties as they were.

Transform only the materialized value of this Source, leaving all other properties as they were.

ImplicitThis member is added by an implicit conversion from SourceRef\[T] to[Source](scaladsl/Source.html)\[T, [NotUsed](../NotUsed.html)] performed by method convertRefToSource in [akka.stream.SourceRef](SourceRef$.html).Definition Classes[Source](scaladsl/Source.html) → [FlowOpsMat](scaladsl/FlowOpsMat.html)
93. [**](../../akka/stream/SourceRef.html#mapWithResource[R,T](create:()=>R)(f:(R,Out)=>T,close:R=>Option[T]):FlowOps.this.Repr[T] "Permalink")  def mapWithResource\[R, T](create: () \=\> R)(f: (R, T) \=\> T, close: (R) \=\> [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[T]): [Source](scaladsl/Source.html)\[T, [NotUsed](../NotUsed.html)]Transform each stream element with the help of a resource.

Transform each stream element with the help of a resource.

The resource creation function is invoked once when the stream is materialized and the returned resource is passed to
the mapping function for mapping the first element. The mapping function returns a mapped element to emit
downstream. The returned `T` MUST NOT be `null` as it is illegal as stream element \- according to the Reactive Streams specification.

The `close` function is called only once when the upstream or downstream finishes or fails. You can do some clean\-up here,
and if the returned value is not empty, it will be emitted to the downstream if available, otherwise the value will be dropped.

Early completion can be done with combination of the [takeWhile](scaladsl/Source.html#takeWhile(p:Out=>Boolean,inclusive:Boolean):FlowOps.this.Repr[Out]) operator.

Adheres to the [ActorAttributes.SupervisionStrategy](ActorAttributes$$SupervisionStrategy.html) attribute.

You can configure the default dispatcher for this Source by changing the `akka.stream.materializer.blocking-io-dispatcher` or
set it for a given Source by using [ActorAttributes](ActorAttributes$.html).

**Emits when** the mapping function returns an element and downstream is ready to consume it

**Backpressures when** downstream backpressures

**Completes when** upstream completes

**Cancels when** downstream cancels

Rthe type of the resource

Tthe type of the output elements

createfunction that creates the resource

ffunction that transforms the upstream element and the resource to output element

closefunction that closes the resource, optionally outputting a last element

ImplicitThis member is added by an implicit conversion from SourceRef\[T] to[Source](scaladsl/Source.html)\[T, [NotUsed](../NotUsed.html)] performed by method convertRefToSource in [akka.stream.SourceRef](SourceRef$.html).Definition Classes[FlowOps](scaladsl/FlowOps.html)
94. [**](../../akka/stream/SourceRef.html#merge[U>:Out,M](that:akka.stream.Graph[akka.stream.SourceShape[U],M],eagerComplete:Boolean):FlowOps.this.Repr[U] "Permalink")  def merge\[U \>: Out, M](that: [Graph](Graph.html)\[[SourceShape](SourceShape.html)\[U], M], eagerComplete: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean) \= false): [Source](scaladsl/Source.html)\[U, [NotUsed](../NotUsed.html)]Merge the given [Source](scaladsl/Source.html) to this [Flow](scaladsl/Flow.html), taking elements as they arrive from input streams,
picking randomly when several elements ready.

Merge the given [Source](scaladsl/Source.html) to this [Flow](scaladsl/Flow.html), taking elements as they arrive from input streams,
picking randomly when several elements ready.

**Emits when** one of the inputs has an element available

**Backpressures when** downstream backpressures

**Completes when** all upstreams complete (eagerComplete\=false) or one upstream completes (eagerComplete\=true), default value is `false`

**Cancels when** downstream cancels

ImplicitThis member is added by an implicit conversion from SourceRef\[T] to[Source](scaladsl/Source.html)\[T, [NotUsed](../NotUsed.html)] performed by method convertRefToSource in [akka.stream.SourceRef](SourceRef$.html).Definition Classes[FlowOps](scaladsl/FlowOps.html)
95. [**](../../akka/stream/SourceRef.html#mergeAll[U>:Out](those:Seq[akka.stream.Graph[akka.stream.SourceShape[U],_]],eagerComplete:Boolean):FlowOps.this.Repr[U] "Permalink")  def mergeAll\[U \>: Out](those: [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[[Graph](Graph.html)\[[SourceShape](SourceShape.html)\[U], \_]], eagerComplete: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): [Source](scaladsl/Source.html)\[U, [NotUsed](../NotUsed.html)]Merge the given [Source](scaladsl/Source.html)s to this [Flow](scaladsl/Flow.html), taking elements as they arrive from input streams,
picking randomly when several elements ready.

Merge the given [Source](scaladsl/Source.html)s to this [Flow](scaladsl/Flow.html), taking elements as they arrive from input streams,
picking randomly when several elements ready.

**Emits when** one of the inputs has an element available

**Backpressures when** downstream backpressures

**Completes when** all upstreams complete (eagerComplete\=false) or one upstream completes (eagerComplete\=true), default value is `false`

**Cancels when** downstream cancels

ImplicitThis member is added by an implicit conversion from SourceRef\[T] to[Source](scaladsl/Source.html)\[T, [NotUsed](../NotUsed.html)] performed by method convertRefToSource in [akka.stream.SourceRef](SourceRef$.html).Definition Classes[FlowOps](scaladsl/FlowOps.html)
96. [**](../../akka/stream/SourceRef.html#mergeLatest[U>:Out,M](that:akka.stream.Graph[akka.stream.SourceShape[U],M],eagerComplete:Boolean):FlowOps.this.Repr[Seq[U]] "Permalink")  def mergeLatest\[U \>: Out, M](that: [Graph](Graph.html)\[[SourceShape](SourceShape.html)\[U], M], eagerComplete: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean) \= false): [Source](scaladsl/Source.html)\[[Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[U], [NotUsed](../NotUsed.html)]MergeLatest joins elements from N input streams into stream of lists of size N.

MergeLatest joins elements from N input streams into stream of lists of size N.
i\-th element in list is the latest emitted element from i\-th input stream.
MergeLatest emits list for each element emitted from some input stream,
but only after each input stream emitted at least one element.

**Emits when** an element is available from some input and each input emits at least one element from stream start

**Completes when** all upstreams complete (eagerClose\=false) or one upstream completes (eagerClose\=true)

ImplicitThis member is added by an implicit conversion from SourceRef\[T] to[Source](scaladsl/Source.html)\[T, [NotUsed](../NotUsed.html)] performed by method convertRefToSource in [akka.stream.SourceRef](SourceRef$.html).Definition Classes[FlowOps](scaladsl/FlowOps.html)
97. [**](../../akka/stream/SourceRef.html#mergeLatestMat[U>:Out,Mat2,Mat3](that:akka.stream.Graph[akka.stream.SourceShape[U],Mat2],eagerClose:Boolean)(matF:(Mat,Mat2)=>Mat3):FlowOpsMat.this.ReprMat[Seq[U],Mat3] "Permalink")  def mergeLatestMat\[U \>: Out, Mat2, Mat3](that: [Graph](Graph.html)\[[SourceShape](SourceShape.html)\[U], Mat2], eagerClose: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean))(matF: ([NotUsed](../NotUsed.html), Mat2) \=\> Mat3): [Source](scaladsl/Source.html)\[[Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[U], Mat3]MergeLatest joins elements from N input streams into stream of lists of size N.

MergeLatest joins elements from N input streams into stream of lists of size N.
i\-th element in list is the latest emitted element from i\-th input stream.
MergeLatest emits list for each element emitted from some input stream,
but only after each input stream emitted at least one element.

ImplicitThis member is added by an implicit conversion from SourceRef\[T] to[Source](scaladsl/Source.html)\[T, [NotUsed](../NotUsed.html)] performed by method convertRefToSource in [akka.stream.SourceRef](SourceRef$.html).Definition Classes[FlowOpsMat](scaladsl/FlowOpsMat.html)See also[\#mergeLatest](scaladsl/Source.html#mergeLatest[U>:Out,M](that:akka.stream.Graph[akka.stream.SourceShape[U],M],eagerComplete:Boolean):FlowOps.this.Repr[Seq[U]]).
It is recommended to use the internally optimized `Keep.left` and `Keep.right` combiners
where appropriate instead of manually writing functions that pass through one of the values.
98. [**](../../akka/stream/SourceRef.html#mergeMat[U>:Out,Mat2,Mat3](that:akka.stream.Graph[akka.stream.SourceShape[U],Mat2],eagerComplete:Boolean)(matF:(Mat,Mat2)=>Mat3):FlowOpsMat.this.ReprMat[U,Mat3] "Permalink")  def mergeMat\[U \>: Out, Mat2, Mat3](that: [Graph](Graph.html)\[[SourceShape](SourceShape.html)\[U], Mat2], eagerComplete: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean) \= false)(matF: ([NotUsed](../NotUsed.html), Mat2) \=\> Mat3): [Source](scaladsl/Source.html)\[U, Mat3]Merge the given [Source](scaladsl/Source.html) to this [Flow](scaladsl/Flow.html), taking elements as they arrive from input streams,
picking randomly when several elements ready.

Merge the given [Source](scaladsl/Source.html) to this [Flow](scaladsl/Flow.html), taking elements as they arrive from input streams,
picking randomly when several elements ready.

ImplicitThis member is added by an implicit conversion from SourceRef\[T] to[Source](scaladsl/Source.html)\[T, [NotUsed](../NotUsed.html)] performed by method convertRefToSource in [akka.stream.SourceRef](SourceRef$.html).Definition Classes[FlowOpsMat](scaladsl/FlowOpsMat.html)See also[\#merge](scaladsl/Source.html#merge[U>:Out,M](that:akka.stream.Graph[akka.stream.SourceShape[U],M],eagerComplete:Boolean):FlowOps.this.Repr[U]).
It is recommended to use the internally optimized `Keep.left` and `Keep.right` combiners
where appropriate instead of manually writing functions that pass through one of the values.
99. [**](../../akka/stream/SourceRef.html#mergePreferred[U>:Out,M](that:akka.stream.Graph[akka.stream.SourceShape[U],M],preferred:Boolean,eagerComplete:Boolean):FlowOps.this.Repr[U] "Permalink")  def mergePreferred\[U \>: Out, M](that: [Graph](Graph.html)\[[SourceShape](SourceShape.html)\[U], M], preferred: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), eagerComplete: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean) \= false): [Source](scaladsl/Source.html)\[U, [NotUsed](../NotUsed.html)]Merge two sources.

Merge two sources. Prefer one source if both sources have elements ready.

**emits** when one of the inputs has an element available. If multiple have elements available, prefer the 'right' one when 'preferred' is 'true', or the 'left' one when 'preferred' is 'false'.

**backpressures** when downstream backpressures

**completes** when all upstreams complete (This behavior is changeable to completing when any upstream completes by setting `eagerComplete=true`.)

ImplicitThis member is added by an implicit conversion from SourceRef\[T] to[Source](scaladsl/Source.html)\[T, [NotUsed](../NotUsed.html)] performed by method convertRefToSource in [akka.stream.SourceRef](SourceRef$.html).Definition Classes[FlowOps](scaladsl/FlowOps.html)Annotations@nowarn()
100. [**](../../akka/stream/SourceRef.html#mergePreferredMat[U>:Out,Mat2,Mat3](that:akka.stream.Graph[akka.stream.SourceShape[U],Mat2],preferred:Boolean,eagerClose:Boolean)(matF:(Mat,Mat2)=>Mat3):FlowOpsMat.this.ReprMat[U,Mat3] "Permalink")  def mergePreferredMat\[U \>: Out, Mat2, Mat3](that: [Graph](Graph.html)\[[SourceShape](SourceShape.html)\[U], Mat2], preferred: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), eagerClose: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean))(matF: ([NotUsed](../NotUsed.html), Mat2) \=\> Mat3): [Source](scaladsl/Source.html)\[U, Mat3]Merge two sources.

Merge two sources. Prefer one source if both sources have elements ready.

ImplicitThis member is added by an implicit conversion from SourceRef\[T] to[Source](scaladsl/Source.html)\[T, [NotUsed](../NotUsed.html)] performed by method convertRefToSource in [akka.stream.SourceRef](SourceRef$.html).Definition Classes[FlowOpsMat](scaladsl/FlowOpsMat.html)See also[\#mergePreferred](scaladsl/Source.html#mergePreferred[U>:Out,M](that:akka.stream.Graph[akka.stream.SourceShape[U],M],preferred:Boolean,eagerComplete:Boolean):FlowOps.this.Repr[U])
It is recommended to use the internally optimized `Keep.left` and `Keep.right` combiners
where appropriate instead of manually writing functions that pass through one of the values.
101. [**](../../akka/stream/SourceRef.html#mergePrioritized[U>:Out,M](that:akka.stream.Graph[akka.stream.SourceShape[U],M],leftPriority:Int,rightPriority:Int,eagerComplete:Boolean):FlowOps.this.Repr[U] "Permalink")  def mergePrioritized\[U \>: Out, M](that: [Graph](Graph.html)\[[SourceShape](SourceShape.html)\[U], M], leftPriority: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), rightPriority: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), eagerComplete: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean) \= false): [Source](scaladsl/Source.html)\[U, [NotUsed](../NotUsed.html)]Merge two sources.

Merge two sources. Prefer the sources depending on the 'priority' parameters.

**emits** when one of the inputs has an element available, preferring inputs based on the 'priority' parameters if both have elements available

**backpressures** when downstream backpressures

**completes** when both upstreams complete (This behavior is changeable to completing when any upstream completes by setting `eagerComplete=true`.)

ImplicitThis member is added by an implicit conversion from SourceRef\[T] to[Source](scaladsl/Source.html)\[T, [NotUsed](../NotUsed.html)] performed by method convertRefToSource in [akka.stream.SourceRef](SourceRef$.html).Definition Classes[FlowOps](scaladsl/FlowOps.html)
102. [**](../../akka/stream/SourceRef.html#mergePrioritizedMat[U>:Out,Mat2,Mat3](that:akka.stream.Graph[akka.stream.SourceShape[U],Mat2],leftPriority:Int,rightPriority:Int,eagerClose:Boolean)(matF:(Mat,Mat2)=>Mat3):FlowOpsMat.this.ReprMat[U,Mat3] "Permalink")  def mergePrioritizedMat\[U \>: Out, Mat2, Mat3](that: [Graph](Graph.html)\[[SourceShape](SourceShape.html)\[U], Mat2], leftPriority: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), rightPriority: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), eagerClose: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean))(matF: ([NotUsed](../NotUsed.html), Mat2) \=\> Mat3): [Source](scaladsl/Source.html)\[U, Mat3]Merge two sources.

Merge two sources. Prefer the sources depending on the 'priority' parameters.

It is recommended to use the internally optimized `Keep.left` and `Keep.right` combiners
where appropriate instead of manually writing functions that pass through one of the values.

ImplicitThis member is added by an implicit conversion from SourceRef\[T] to[Source](scaladsl/Source.html)\[T, [NotUsed](../NotUsed.html)] performed by method convertRefToSource in [akka.stream.SourceRef](SourceRef$.html).Definition Classes[FlowOpsMat](scaladsl/FlowOpsMat.html)
103. [**](../../akka/stream/SourceRef.html#mergeSorted[U>:Out,M](that:akka.stream.Graph[akka.stream.SourceShape[U],M])(implicitord:Ordering[U]):FlowOps.this.Repr[U] "Permalink")  def mergeSorted\[U \>: Out, M](that: [Graph](Graph.html)\[[SourceShape](SourceShape.html)\[U], M])(implicit ord: [Ordering](https://www.scala-lang.org/api/2.13.17/scala/math/Ordering.html#scala.math.Ordering)\[U]): [Source](scaladsl/Source.html)\[U, [NotUsed](../NotUsed.html)]Merge the given [Source](scaladsl/Source.html) to this [Flow](scaladsl/Flow.html), taking elements as they arrive from input streams,
picking always the smallest of the available elements (waiting for one element from each side
to be available).

Merge the given [Source](scaladsl/Source.html) to this [Flow](scaladsl/Flow.html), taking elements as they arrive from input streams,
picking always the smallest of the available elements (waiting for one element from each side
to be available). This means that possible contiguity of the input streams is not exploited to avoid
waiting for elements, this merge will block when one of the inputs does not have more elements (and
does not complete).

**Emits when** all of the inputs have an element available

**Backpressures when** downstream backpressures

**Completes when** all upstreams complete

**Cancels when** downstream cancels

ImplicitThis member is added by an implicit conversion from SourceRef\[T] to[Source](scaladsl/Source.html)\[T, [NotUsed](../NotUsed.html)] performed by method convertRefToSource in [akka.stream.SourceRef](SourceRef$.html).Definition Classes[FlowOps](scaladsl/FlowOps.html)
104. [**](../../akka/stream/SourceRef.html#mergeSortedMat[U>:Out,Mat2,Mat3](that:akka.stream.Graph[akka.stream.SourceShape[U],Mat2])(matF:(Mat,Mat2)=>Mat3)(implicitord:Ordering[U]):FlowOpsMat.this.ReprMat[U,Mat3] "Permalink")  def mergeSortedMat\[U \>: Out, Mat2, Mat3](that: [Graph](Graph.html)\[[SourceShape](SourceShape.html)\[U], Mat2])(matF: ([NotUsed](../NotUsed.html), Mat2) \=\> Mat3)(implicit ord: [Ordering](https://www.scala-lang.org/api/2.13.17/scala/math/Ordering.html#scala.math.Ordering)\[U]): [Source](scaladsl/Source.html)\[U, Mat3]Merge the given [Source](scaladsl/Source.html) to this [Flow](scaladsl/Flow.html), taking elements as they arrive from input streams,
picking always the smallest of the available elements (waiting for one element from each side
to be available).

Merge the given [Source](scaladsl/Source.html) to this [Flow](scaladsl/Flow.html), taking elements as they arrive from input streams,
picking always the smallest of the available elements (waiting for one element from each side
to be available). This means that possible contiguity of the input streams is not exploited to avoid
waiting for elements, this merge will block when one of the inputs does not have more elements (and
does not complete).

ImplicitThis member is added by an implicit conversion from SourceRef\[T] to[Source](scaladsl/Source.html)\[T, [NotUsed](../NotUsed.html)] performed by method convertRefToSource in [akka.stream.SourceRef](SourceRef$.html).Definition Classes[FlowOpsMat](scaladsl/FlowOpsMat.html)See also[\#mergeSorted](scaladsl/Source.html#mergeSorted[U>:Out,M](that:akka.stream.Graph[akka.stream.SourceShape[U],M])(implicitord:Ordering[U]):FlowOps.this.Repr[U]).
It is recommended to use the internally optimized `Keep.left` and `Keep.right` combiners
where appropriate instead of manually writing functions that pass through one of the values.
105. [**](../../akka/stream/SourceRef.html#monitor:FlowOpsMat.this.ReprMat[Out,(Mat,akka.stream.FlowMonitor[Out])] "Permalink")  def monitor: [Source](scaladsl/Source.html)\[T, ([NotUsed](../NotUsed.html), [FlowMonitor](FlowMonitor.html)\[T])]Materializes to `(Mat, FlowMonitor[Out])`, which is unlike most other operators (!),
in which usually the default materialized value keeping semantics is to keep the left value
(by passing `Keep.left()` to a `*Mat` version of a method).

Materializes to `(Mat, FlowMonitor[Out])`, which is unlike most other operators (!),
in which usually the default materialized value keeping semantics is to keep the left value
(by passing `Keep.left()` to a `*Mat` version of a method). This operator is an exception from
that rule and keeps both values since dropping its sole purpose is to introduce that materialized value.

The `FlowMonitor[Out]` allows monitoring of the current flow. All events are propagated
by the monitor unchanged. Note that the monitor inserts a memory barrier every time it processes an
event, and may therefor affect performance.

ImplicitThis member is added by an implicit conversion from SourceRef\[T] to[Source](scaladsl/Source.html)\[T, [NotUsed](../NotUsed.html)] performed by method convertRefToSource in [akka.stream.SourceRef](SourceRef$.html).Definition Classes[FlowOpsMat](scaladsl/FlowOpsMat.html)
106. [**](../../akka/stream/SourceRef.html#monitorMat[Mat2](combine:(Mat,akka.stream.FlowMonitor[Out])=>Mat2):FlowOpsMat.this.ReprMat[Out,Mat2] "Permalink")  def monitorMat\[Mat2](combine: ([NotUsed](../NotUsed.html), [FlowMonitor](FlowMonitor.html)\[T]) \=\> Mat2): [Source](scaladsl/Source.html)\[T, Mat2]Materializes to `FlowMonitor[Out]` that allows monitoring of the current flow.

Materializes to `FlowMonitor[Out]` that allows monitoring of the current flow. All events are propagated
by the monitor unchanged. Note that the monitor inserts a memory barrier every time it processes an
event, and may therefor affect performance.

The `combine` function is used to combine the `FlowMonitor` with this flow's materialized value.

ImplicitThis member is added by an implicit conversion from SourceRef\[T] to[Source](scaladsl/Source.html)\[T, [NotUsed](../NotUsed.html)] performed by method convertRefToSource in [akka.stream.SourceRef](SourceRef$.html).Definition Classes[FlowOpsMat](scaladsl/FlowOpsMat.html)
107. [**](../../akka/stream/SourceRef.html#named(name:String):Source.this.Repr[Out] "Permalink")  def named(name: [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)): [Source](scaladsl/Source.html)\[T, [NotUsed](../NotUsed.html)]Add a `name` attribute to this Source.

Add a `name` attribute to this Source.

ImplicitThis member is added by an implicit conversion from SourceRef\[T] to[Source](scaladsl/Source.html)\[T, [NotUsed](../NotUsed.html)] performed by method convertRefToSource in [akka.stream.SourceRef](SourceRef$.html).Definition Classes[Source](scaladsl/Source.html) → [Graph](Graph.html) → [FlowOps](scaladsl/FlowOps.html)
108. [**](../../akka/stream/SourceRef.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
109. [**](../../akka/stream/SourceRef.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
110. [**](../../akka/stream/SourceRef.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
111. [**](../../akka/stream/SourceRef.html#onErrorComplete(pf:PartialFunction[Throwable,Boolean]):FlowOps.this.Repr[Out] "Permalink")  def onErrorComplete(pf: [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[[Throwable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Throwable.html#java.lang.Throwable), [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)]): [Source](scaladsl/Source.html)\[T, [NotUsed](../NotUsed.html)]onErrorComplete allows to complete the stream when an upstream error occurs.

onErrorComplete allows to complete the stream when an upstream error occurs.

Since the underlying failure signal onError arrives out\-of\-band, it might jump over existing elements.
This operator can recover the failure signal, but not the skipped elements, which will be dropped.

**Emits when** element is available from the upstream

**Backpressures when** downstream backpressures

**Completes when** upstream completes or failed with exception pf can handle

**Cancels when** downstream cancels

ImplicitThis member is added by an implicit conversion from SourceRef\[T] to[Source](scaladsl/Source.html)\[T, [NotUsed](../NotUsed.html)] performed by method convertRefToSource in [akka.stream.SourceRef](SourceRef$.html).Definition Classes[FlowOps](scaladsl/FlowOps.html)
112. [**](../../akka/stream/SourceRef.html#onErrorComplete[T<:Throwable]()(implicittag:scala.reflect.ClassTag[T]):FlowOps.this.Repr[Out] "Permalink")  def onErrorComplete\[T \<: Throwable]()(implicit tag: [ClassTag](https://www.scala-lang.org/api/2.13.17/scala/reflect/ClassTag.html#scala.reflect.ClassTag)\[T]): [Source](scaladsl/Source.html)\[T, [NotUsed](../NotUsed.html)]onErrorComplete allows to complete the stream when an upstream error occurs.

onErrorComplete allows to complete the stream when an upstream error occurs.

Since the underlying failure signal onError arrives out\-of\-band, it might jump over existing elements.
This operator can recover the failure signal, but not the skipped elements, which will be dropped.

**Emits when** element is available from the upstream

**Backpressures when** downstream backpressures

**Completes when** upstream completes or failed with exception is an instance of the provided type

**Cancels when** downstream cancels

ImplicitThis member is added by an implicit conversion from SourceRef\[T] to[Source](scaladsl/Source.html)\[T, [NotUsed](../NotUsed.html)] performed by method convertRefToSource in [akka.stream.SourceRef](SourceRef$.html).Definition Classes[FlowOps](scaladsl/FlowOps.html)
113. [**](../../akka/stream/SourceRef.html#orElse[U>:Out,Mat2](secondary:akka.stream.Graph[akka.stream.SourceShape[U],Mat2]):FlowOps.this.Repr[U] "Permalink")  def orElse\[U \>: Out, Mat2](secondary: [Graph](Graph.html)\[[SourceShape](SourceShape.html)\[U], Mat2]): [Source](scaladsl/Source.html)\[U, [NotUsed](../NotUsed.html)]Provides a secondary source that will be consumed if this stream completes without any
elements passing by.

Provides a secondary source that will be consumed if this stream completes without any
elements passing by. As soon as the first element comes through this stream, the alternative
will be cancelled.

Note that this Flow will be materialized together with the [Source](scaladsl/Source.html) and just kept
from producing elements by asserting back\-pressure until its time comes or it gets
cancelled.

On errors the operator is failed regardless of source of the error.

**Emits when** element is available from first stream or first stream closed without emitting any elements and an element
 is available from the second stream

**Backpressures when** downstream backpressures

**Completes when** the primary stream completes after emitting at least one element, when the primary stream completes
 without emitting and the secondary stream already has completed or when the secondary stream completes

**Cancels when** downstream cancels and additionally the alternative is cancelled as soon as an element passes
 by from this stream.

ImplicitThis member is added by an implicit conversion from SourceRef\[T] to[Source](scaladsl/Source.html)\[T, [NotUsed](../NotUsed.html)] performed by method convertRefToSource in [akka.stream.SourceRef](SourceRef$.html).Definition Classes[FlowOps](scaladsl/FlowOps.html)
114. [**](../../akka/stream/SourceRef.html#orElseMat[U>:Out,Mat2,Mat3](secondary:akka.stream.Graph[akka.stream.SourceShape[U],Mat2])(matF:(Mat,Mat2)=>Mat3):FlowOpsMat.this.ReprMat[U,Mat3] "Permalink")  def orElseMat\[U \>: Out, Mat2, Mat3](secondary: [Graph](Graph.html)\[[SourceShape](SourceShape.html)\[U], Mat2])(matF: ([NotUsed](../NotUsed.html), Mat2) \=\> Mat3): [Source](scaladsl/Source.html)\[U, Mat3]Provides a secondary source that will be consumed if this stream completes without any
elements passing by.

Provides a secondary source that will be consumed if this stream completes without any
elements passing by. As soon as the first element comes through this stream, the alternative
will be cancelled.

Note that this Flow will be materialized together with the [Source](scaladsl/Source.html) and just kept
from producing elements by asserting back\-pressure until its time comes or it gets
cancelled.

On errors the operator is failed regardless of source of the error.

**Emits when** element is available from first stream or first stream closed without emitting any elements and an element
 is available from the second stream

**Backpressures when** downstream backpressures

**Completes when** the primary stream completes after emitting at least one element, when the primary stream completes
 without emitting and the secondary stream already has completed or when the secondary stream completes

**Cancels when** downstream cancels and additionally the alternative is cancelled as soon as an element passes
 by from this stream.

ImplicitThis member is added by an implicit conversion from SourceRef\[T] to[Source](scaladsl/Source.html)\[T, [NotUsed](../NotUsed.html)] performed by method convertRefToSource in [akka.stream.SourceRef](SourceRef$.html).Definition Classes[FlowOpsMat](scaladsl/FlowOpsMat.html)
115. [**](../../akka/stream/SourceRef.html#preMaterialize()(implicitmaterializer:akka.stream.Materializer):(Mat,Source.this.ReprMat[Out,akka.NotUsed]) "Permalink")  def preMaterialize()(implicit materializer: [Materializer](Materializer.html)): ([NotUsed](../NotUsed.html), [Source](scaladsl/Source.html)\[T, [NotUsed](../NotUsed.html)])Materializes this Source, immediately returning (1\) its materialized value, and (2\) a new Source
that can be used to consume elements from the newly materialized Source.

Materializes this Source, immediately returning (1\) its materialized value, and (2\) a new Source
that can be used to consume elements from the newly materialized Source.

Note that `preMaterialize` is implemented through a reactive streams `Publisher` which means that
a buffer is introduced and that errors are not propagated upstream but are turned into cancellations without error details.

ImplicitThis member is added by an implicit conversion from SourceRef\[T] to[Source](scaladsl/Source.html)\[T, [NotUsed](../NotUsed.html)] performed by method convertRefToSource in [akka.stream.SourceRef](SourceRef$.html).Definition Classes[Source](scaladsl/Source.html)
116. [**](../../akka/stream/SourceRef.html#prefixAndTail[U>:Out](n:Int):FlowOps.this.Repr[(Seq[Out],akka.stream.scaladsl.Source[U,akka.NotUsed])] "Permalink")  def prefixAndTail\[U \>: Out](n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Source](scaladsl/Source.html)\[([Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[T], [Source](scaladsl/Source.html)\[U, [NotUsed](../NotUsed.html)]), [NotUsed](../NotUsed.html)]Takes up to `n` elements from the stream (less than `n` only if the upstream completes before emitting `n` elements)
and returns a pair containing a strict sequence of the taken element
and a stream representing the remaining elements.

Takes up to `n` elements from the stream (less than `n` only if the upstream completes before emitting `n` elements)
and returns a pair containing a strict sequence of the taken element
and a stream representing the remaining elements. If *n* is zero or negative, then this will return a pair
of an empty collection and a stream containing the whole upstream unchanged.

In case of an upstream error, depending on the current state

	- the master stream signals the error if less than `n` elements has been seen, and therefore the substream
	 has not yet been emitted
	- the tail substream signals the error after the prefix and tail has been emitted by the main stream
	 (at that point the main stream has already completed)**Emits when** the configured number of prefix elements are available. Emits this prefix, and the rest
as a substream

**Backpressures when** downstream backpressures or substream backpressures

**Completes when** prefix elements have been consumed and substream has been consumed

**Cancels when** downstream cancels or substream cancels

ImplicitThis member is added by an implicit conversion from SourceRef\[T] to[Source](scaladsl/Source.html)\[T, [NotUsed](../NotUsed.html)] performed by method convertRefToSource in [akka.stream.SourceRef](SourceRef$.html).Definition Classes[FlowOps](scaladsl/FlowOps.html)
117. [**](../../akka/stream/SourceRef.html#prepend[U>:Out,Mat2](that:akka.stream.Graph[akka.stream.SourceShape[U],Mat2]):FlowOps.this.Repr[U] "Permalink")  def prepend\[U \>: Out, Mat2](that: [Graph](Graph.html)\[[SourceShape](SourceShape.html)\[U], Mat2]): [Source](scaladsl/Source.html)\[U, [NotUsed](../NotUsed.html)]Prepend the given [Source](scaladsl/Source.html) to this [Flow](scaladsl/Flow.html), meaning that before elements
are generated from this Flow, the Source's elements will be produced until it
is exhausted, at which point Flow elements will start being produced.

Prepend the given [Source](scaladsl/Source.html) to this [Flow](scaladsl/Flow.html), meaning that before elements
are generated from this Flow, the Source's elements will be produced until it
is exhausted, at which point Flow elements will start being produced.

Note that the [Source](scaladsl/Source.html) is materialized together with this Flow and is "detached" meaning
in effect behave as a one element buffer in front of both the sources, that eagerly demands an element on start
(so it can not be combined with `Source.lazy` to defer materialization of `that`).

This flow will then be kept from producing elements by asserting back\-pressure until its time comes.

When needing a prepend operator that is not detached use [\#prependLazy](scaladsl/Source.html#prependLazy[U>:Out,Mat2](that:akka.stream.Graph[akka.stream.SourceShape[U],Mat2]):FlowOps.this.Repr[U])

**Emits when** element is available from the given [Source](scaladsl/Source.html) or from current stream when the [Source](scaladsl/Source.html) is completed

**Backpressures when** downstream backpressures

**Completes when** this [Flow](scaladsl/Flow.html) completes

**Cancels when** downstream cancels

ImplicitThis member is added by an implicit conversion from SourceRef\[T] to[Source](scaladsl/Source.html)\[T, [NotUsed](../NotUsed.html)] performed by method convertRefToSource in [akka.stream.SourceRef](SourceRef$.html).Definition Classes[FlowOps](scaladsl/FlowOps.html)
118. [**](../../akka/stream/SourceRef.html#prependLazy[U>:Out,Mat2](that:akka.stream.Graph[akka.stream.SourceShape[U],Mat2]):FlowOps.this.Repr[U] "Permalink")  def prependLazy\[U \>: Out, Mat2](that: [Graph](Graph.html)\[[SourceShape](SourceShape.html)\[U], Mat2]): [Source](scaladsl/Source.html)\[U, [NotUsed](../NotUsed.html)]Prepend the given [Source](scaladsl/Source.html) to this [Flow](scaladsl/Flow.html), meaning that before elements
are generated from this Flow, the Source's elements will be produced until it
is exhausted, at which point Flow elements will start being produced.

Prepend the given [Source](scaladsl/Source.html) to this [Flow](scaladsl/Flow.html), meaning that before elements
are generated from this Flow, the Source's elements will be produced until it
is exhausted, at which point Flow elements will start being produced.

Note that the [Source](scaladsl/Source.html) is materialized together with this Flow and will then be kept from producing elements
by asserting back\-pressure until its time comes.

When needing a prepend operator that is also detached use [\#prepend](scaladsl/Source.html#prepend[U>:Out,Mat2](that:akka.stream.Graph[akka.stream.SourceShape[U],Mat2]):FlowOps.this.Repr[U])

If the given [Source](scaladsl/Source.html) gets upstream error \- no elements from this [Flow](scaladsl/Flow.html) will be pulled.

**Emits when** element is available from the given [Source](scaladsl/Source.html) or from current stream when the [Source](scaladsl/Source.html) is completed

**Backpressures when** downstream backpressures

**Completes when** this [Flow](scaladsl/Flow.html) completes

**Cancels when** downstream cancels

ImplicitThis member is added by an implicit conversion from SourceRef\[T] to[Source](scaladsl/Source.html)\[T, [NotUsed](../NotUsed.html)] performed by method convertRefToSource in [akka.stream.SourceRef](SourceRef$.html).Definition Classes[FlowOps](scaladsl/FlowOps.html)
119. [**](../../akka/stream/SourceRef.html#prependLazyMat[U>:Out,Mat2,Mat3](that:akka.stream.Graph[akka.stream.SourceShape[U],Mat2])(matF:(Mat,Mat2)=>Mat3):FlowOpsMat.this.ReprMat[U,Mat3] "Permalink")  def prependLazyMat\[U \>: Out, Mat2, Mat3](that: [Graph](Graph.html)\[[SourceShape](SourceShape.html)\[U], Mat2])(matF: ([NotUsed](../NotUsed.html), Mat2) \=\> Mat3): [Source](scaladsl/Source.html)\[U, Mat3]Prepend the given [Source](scaladsl/Source.html) to this [Flow](scaladsl/Flow.html), meaning that before elements
are generated from this Flow, the Source's elements will be produced until it
is exhausted, at which point Flow elements will start being produced.

Prepend the given [Source](scaladsl/Source.html) to this [Flow](scaladsl/Flow.html), meaning that before elements
are generated from this Flow, the Source's elements will be produced until it
is exhausted, at which point Flow elements will start being produced.

Note that the [Source](scaladsl/Source.html) is materialized together with this Flow and is "detached" meaning
in effect behave as a one element buffer in front of both the sources, that eagerly demands an element on start
(so it can not be combined with `Source.lazy` to defer materialization of `that`).

This flow will then be kept from producing elements by asserting back\-pressure until its time comes.

When needing a prepend operator that is not detached use [\#prependLazyMat](scaladsl/Source.html#prependLazyMat[U>:Out,Mat2,Mat3](that:akka.stream.Graph[akka.stream.SourceShape[U],Mat2])(matF:(Mat,Mat2)=>Mat3):FlowOpsMat.this.ReprMat[U,Mat3])

ImplicitThis member is added by an implicit conversion from SourceRef\[T] to[Source](scaladsl/Source.html)\[T, [NotUsed](../NotUsed.html)] performed by method convertRefToSource in [akka.stream.SourceRef](SourceRef$.html).Definition Classes[FlowOpsMat](scaladsl/FlowOpsMat.html)See also[\#prependLazy](scaladsl/Source.html#prependLazy[U>:Out,Mat2](that:akka.stream.Graph[akka.stream.SourceShape[U],Mat2]):FlowOps.this.Repr[U]).
It is recommended to use the internally optimized `Keep.left` and `Keep.right` combiners
where appropriate instead of manually writing functions that pass through one of the values.
120. [**](../../akka/stream/SourceRef.html#prependMat[U>:Out,Mat2,Mat3](that:akka.stream.Graph[akka.stream.SourceShape[U],Mat2])(matF:(Mat,Mat2)=>Mat3):FlowOpsMat.this.ReprMat[U,Mat3] "Permalink")  def prependMat\[U \>: Out, Mat2, Mat3](that: [Graph](Graph.html)\[[SourceShape](SourceShape.html)\[U], Mat2])(matF: ([NotUsed](../NotUsed.html), Mat2) \=\> Mat3): [Source](scaladsl/Source.html)\[U, Mat3]Prepend the given [Source](scaladsl/Source.html) to this [Flow](scaladsl/Flow.html), meaning that before elements
are generated from this Flow, the Source's elements will be produced until it
is exhausted, at which point Flow elements will start being produced.

Prepend the given [Source](scaladsl/Source.html) to this [Flow](scaladsl/Flow.html), meaning that before elements
are generated from this Flow, the Source's elements will be produced until it
is exhausted, at which point Flow elements will start being produced.

Note that this Flow will be materialized together with the [Source](scaladsl/Source.html) and just kept
from producing elements by asserting back\-pressure until its time comes.

If the given [Source](scaladsl/Source.html) gets upstream error \- no elements from this [Flow](scaladsl/Flow.html) will be pulled.

When needing a concat operator that is not detached use [\#prependLazyMat](scaladsl/Source.html#prependLazyMat[U>:Out,Mat2,Mat3](that:akka.stream.Graph[akka.stream.SourceShape[U],Mat2])(matF:(Mat,Mat2)=>Mat3):FlowOpsMat.this.ReprMat[U,Mat3])

ImplicitThis member is added by an implicit conversion from SourceRef\[T] to[Source](scaladsl/Source.html)\[T, [NotUsed](../NotUsed.html)] performed by method convertRefToSource in [akka.stream.SourceRef](SourceRef$.html).Definition Classes[FlowOpsMat](scaladsl/FlowOpsMat.html)See also[\#prepend](scaladsl/Source.html#prepend[U>:Out,Mat2](that:akka.stream.Graph[akka.stream.SourceShape[U],Mat2]):FlowOps.this.Repr[U]).
It is recommended to use the internally optimized `Keep.left` and `Keep.right` combiners
where appropriate instead of manually writing functions that pass through one of the values.
121. [**](../../akka/stream/SourceRef.html#recover[T>:Out](pf:PartialFunction[Throwable,T]):FlowOps.this.Repr[T] "Permalink")  def recover\[T \>: Out](pf: [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[[Throwable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Throwable.html#java.lang.Throwable), T]): [Source](scaladsl/Source.html)\[T, [NotUsed](../NotUsed.html)]Recover allows to send last element on failure and gracefully complete the stream
Since the underlying failure signal onError arrives out\-of\-band, it might jump over existing elements.

Recover allows to send last element on failure and gracefully complete the stream
Since the underlying failure signal onError arrives out\-of\-band, it might jump over existing elements.
This operator can recover the failure signal, but not the skipped elements, which will be dropped.

Throwing an exception inside `recover` \_will\_ be logged on ERROR level automatically.

**Emits when** element is available from the upstream or upstream is failed and pf returns an element

**Backpressures when** downstream backpressures

**Completes when** upstream completes or upstream failed with exception pf can handle

**Cancels when** downstream cancels

ImplicitThis member is added by an implicit conversion from SourceRef\[T] to[Source](scaladsl/Source.html)\[T, [NotUsed](../NotUsed.html)] performed by method convertRefToSource in [akka.stream.SourceRef](SourceRef$.html).Definition Classes[FlowOps](scaladsl/FlowOps.html)
122. [**](../../akka/stream/SourceRef.html#recoverWith[T>:Out](pf:PartialFunction[Throwable,akka.stream.Graph[akka.stream.SourceShape[T],akka.NotUsed]]):FlowOps.this.Repr[T] "Permalink")  def recoverWith\[T \>: Out](pf: [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[[Throwable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Throwable.html#java.lang.Throwable), [Graph](Graph.html)\[[SourceShape](SourceShape.html)\[T], [NotUsed](../NotUsed.html)]]): [Source](scaladsl/Source.html)\[T, [NotUsed](../NotUsed.html)]RecoverWith allows to switch to alternative Source on flow failure.

RecoverWith allows to switch to alternative Source on flow failure. It will stay in effect after
a failure has been recovered so that each time there is a failure it is fed into the `pf` and a new
Source may be materialized.

Since the underlying failure signal onError arrives out\-of\-band, it might jump over existing elements.
This operator can recover the failure signal, but not the skipped elements, which will be dropped.

Throwing an exception inside `recoverWith` \_will\_ be logged on ERROR level automatically.

**Emits when** element is available from the upstream or upstream is failed and element is available
from alternative Source

**Backpressures when** downstream backpressures

**Completes when** upstream completes or upstream failed with exception pf can handle

**Cancels when** downstream cancels

ImplicitThis member is added by an implicit conversion from SourceRef\[T] to[Source](scaladsl/Source.html)\[T, [NotUsed](../NotUsed.html)] performed by method convertRefToSource in [akka.stream.SourceRef](SourceRef$.html).Definition Classes[FlowOps](scaladsl/FlowOps.html)
123. [**](../../akka/stream/SourceRef.html#recoverWithRetries[T>:Out](attempts:Int,pf:PartialFunction[Throwable,akka.stream.Graph[akka.stream.SourceShape[T],akka.NotUsed]]):FlowOps.this.Repr[T] "Permalink")  def recoverWithRetries\[T \>: Out](attempts: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), pf: [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[[Throwable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Throwable.html#java.lang.Throwable), [Graph](Graph.html)\[[SourceShape](SourceShape.html)\[T], [NotUsed](../NotUsed.html)]]): [Source](scaladsl/Source.html)\[T, [NotUsed](../NotUsed.html)]RecoverWithRetries allows to switch to alternative Source on flow failure.

RecoverWithRetries allows to switch to alternative Source on flow failure. It will stay in effect after
a failure has been recovered up to `attempts` number of times so that each time there is a failure
it is fed into the `pf` and a new Source may be materialized. Note that if you pass in 0, this won't
attempt to recover at all.

A negative `attempts` number is interpreted as "infinite", which results in the exact same behavior as `recoverWith`.

Since the underlying failure signal onError arrives out\-of\-band, it might jump over existing elements.
This operator can recover the failure signal, but not the skipped elements, which will be dropped.

Throwing an exception inside `recoverWithRetries` \_will\_ be logged on ERROR level automatically.

**Emits when** element is available from the upstream or upstream is failed and element is available
from alternative Source

**Backpressures when** downstream backpressures

**Completes when** upstream completes or upstream failed with exception pf can handle

**Cancels when** downstream cancels

attemptsMaximum number of retries or \-1 to retry indefinitely

pfReceives the failure cause and returns the new Source to be materialized if any

ImplicitThis member is added by an implicit conversion from SourceRef\[T] to[Source](scaladsl/Source.html)\[T, [NotUsed](../NotUsed.html)] performed by method convertRefToSource in [akka.stream.SourceRef](SourceRef$.html).Definition Classes[FlowOps](scaladsl/FlowOps.html)
124. [**](../../akka/stream/SourceRef.html#reduce[T>:Out](f:(T,T)=>T):FlowOps.this.Repr[T] "Permalink")  def reduce\[T \>: Out](f: (T, T) \=\> T): [Source](scaladsl/Source.html)\[T, [NotUsed](../NotUsed.html)]Similar to `fold` but uses first element as zero element.

Similar to `fold` but uses first element as zero element.
Applies the given function towards its current and next value,
yielding the next current value.

If the stream is empty (i.e. completes before signalling any elements),
the reduce operator will fail its downstream with a NoSuchElementException,
which is semantically in\-line with that Scala's standard library collections
do in such situations.

Adheres to the [ActorAttributes.SupervisionStrategy](ActorAttributes$$SupervisionStrategy.html) attribute.

**Emits when** upstream completes

**Backpressures when** downstream backpressures

**Completes when** upstream completes

**Cancels when** downstream cancels

See also [FlowOps.fold](scaladsl/FlowOps.html#fold[T](zero:T)(f:(T,Out)=>T):FlowOps.this.Repr[T])

ImplicitThis member is added by an implicit conversion from SourceRef\[T] to[Source](scaladsl/Source.html)\[T, [NotUsed](../NotUsed.html)] performed by method convertRefToSource in [akka.stream.SourceRef](SourceRef$.html).Definition Classes[FlowOps](scaladsl/FlowOps.html)
125. [**](../../akka/stream/SourceRef.html#run()(implicitmaterializer:akka.stream.Materializer):scala.concurrent.Future[akka.Done] "Permalink")  def run()(implicit materializer: [Materializer](Materializer.html)): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[Done](../Done.html)]Connect this `Source` to the `Sink.ignore` and run it.

Connect this `Source` to the `Sink.ignore` and run it. Elements from the stream will be consumed and discarded.

Note that the `ActorSystem` can be used as the implicit `materializer` parameter to use the
[akka.stream.SystemMaterializer](SystemMaterializer.html) for running the stream.

ImplicitThis member is added by an implicit conversion from SourceRef\[T] to[Source](scaladsl/Source.html)\[T, [NotUsed](../NotUsed.html)] performed by method convertRefToSource in [akka.stream.SourceRef](SourceRef$.html).Definition Classes[Source](scaladsl/Source.html)
126. [**](../../akka/stream/SourceRef.html#runFold[U](zero:U)(f:(U,Out)=>U)(implicitmaterializer:akka.stream.Materializer):scala.concurrent.Future[U] "Permalink")  def runFold\[U](zero: U)(f: (U, T) \=\> U)(implicit materializer: [Materializer](Materializer.html)): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[U]Shortcut for running this `Source` with a fold function.

Shortcut for running this `Source` with a fold function.
The given function is invoked for every received element, giving it its previous
output (or the given `zero` value) and the element as input.
The returned [scala.concurrent.Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html) will be completed with value of the final
function evaluation when the input stream ends, or completed with `Failure`
if there is a failure signaled in the stream.

Note that the `ActorSystem` can be used as the implicit `materializer` parameter to use the
[akka.stream.SystemMaterializer](SystemMaterializer.html) for running the stream.

ImplicitThis member is added by an implicit conversion from SourceRef\[T] to[Source](scaladsl/Source.html)\[T, [NotUsed](../NotUsed.html)] performed by method convertRefToSource in [akka.stream.SourceRef](SourceRef$.html).Definition Classes[Source](scaladsl/Source.html)
127. [**](../../akka/stream/SourceRef.html#runFoldAsync[U](zero:U)(f:(U,Out)=>scala.concurrent.Future[U])(implicitmaterializer:akka.stream.Materializer):scala.concurrent.Future[U] "Permalink")  def runFoldAsync\[U](zero: U)(f: (U, T) \=\> [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[U])(implicit materializer: [Materializer](Materializer.html)): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[U]Shortcut for running this `Source` with a foldAsync function.

Shortcut for running this `Source` with a foldAsync function.
The given function is invoked for every received element, giving it its previous
output (or the given `zero` value) and the element as input.
The returned [scala.concurrent.Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html) will be completed with value of the final
function evaluation when the input stream ends, or completed with `Failure`
if there is a failure signaled in the stream.

Note that the `ActorSystem` can be used as the implicit `materializer` parameter to use the
[akka.stream.SystemMaterializer](SystemMaterializer.html) for running the stream.

ImplicitThis member is added by an implicit conversion from SourceRef\[T] to[Source](scaladsl/Source.html)\[T, [NotUsed](../NotUsed.html)] performed by method convertRefToSource in [akka.stream.SourceRef](SourceRef$.html).Definition Classes[Source](scaladsl/Source.html)
128. [**](../../akka/stream/SourceRef.html#runForeach(f:Out=>Unit)(implicitmaterializer:akka.stream.Materializer):scala.concurrent.Future[akka.Done] "Permalink")  def runForeach(f: (T) \=\> [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit))(implicit materializer: [Materializer](Materializer.html)): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[Done](../Done.html)]Shortcut for running this `Source` with a foreach procedure.

Shortcut for running this `Source` with a foreach procedure. The given procedure is invoked
for each received element.
The returned [scala.concurrent.Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html) will be completed with `Success` when reaching the
normal end of the stream, or completed with `Failure` if there is a failure signaled in
the stream.

Note that the `ActorSystem` can be used as the implicit `materializer` parameter to use the
[akka.stream.SystemMaterializer](SystemMaterializer.html) for running the stream.

ImplicitThis member is added by an implicit conversion from SourceRef\[T] to[Source](scaladsl/Source.html)\[T, [NotUsed](../NotUsed.html)] performed by method convertRefToSource in [akka.stream.SourceRef](SourceRef$.html).Definition Classes[Source](scaladsl/Source.html)
129. [**](../../akka/stream/SourceRef.html#runReduce[U>:Out](f:(U,U)=>U)(implicitmaterializer:akka.stream.Materializer):scala.concurrent.Future[U] "Permalink")  def runReduce\[U \>: Out](f: (U, U) \=\> U)(implicit materializer: [Materializer](Materializer.html)): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[U]Shortcut for running this `Source` with a reduce function.

Shortcut for running this `Source` with a reduce function.
The given function is invoked for every received element, giving it its previous
output (from the second element) and the element as input.
The returned [scala.concurrent.Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html) will be completed with value of the final
function evaluation when the input stream ends, or completed with `Failure`
if there is a failure signaled in the stream.

If the stream is empty (i.e. completes before signalling any elements),
the reduce operator will fail its downstream with a NoSuchElementException,
which is semantically in\-line with that Scala's standard library collections
do in such situations.

Note that the `ActorSystem` can be used as the implicit `materializer` parameter to use the
[akka.stream.SystemMaterializer](SystemMaterializer.html) for running the stream.

ImplicitThis member is added by an implicit conversion from SourceRef\[T] to[Source](scaladsl/Source.html)\[T, [NotUsed](../NotUsed.html)] performed by method convertRefToSource in [akka.stream.SourceRef](SourceRef$.html).Definition Classes[Source](scaladsl/Source.html)
130. [**](../../akka/stream/SourceRef.html#runWith[Mat2](sink:akka.stream.Graph[akka.stream.SinkShape[Out],Mat2])(implicitmaterializer:akka.stream.Materializer):Mat2 "Permalink")  def runWith\[Mat2](sink: [Graph](Graph.html)\[[SinkShape](SinkShape.html)\[T], Mat2])(implicit materializer: [Materializer](Materializer.html)): Mat2Connect this `Source` to a `Sink` and run it.

Connect this `Source` to a `Sink` and run it. The returned value is the materialized value
of the `Sink`, e.g. the `Publisher` of a akka.stream.scaladsl.Sink\#publisher.

Note that the `ActorSystem` can be used as the implicit `materializer` parameter to use the
[akka.stream.SystemMaterializer](SystemMaterializer.html) for running the stream.

ImplicitThis member is added by an implicit conversion from SourceRef\[T] to[Source](scaladsl/Source.html)\[T, [NotUsed](../NotUsed.html)] performed by method convertRefToSource in [akka.stream.SourceRef](SourceRef$.html).Definition Classes[Source](scaladsl/Source.html)
131. [**](../../akka/stream/SourceRef.html#scan[T](zero:T)(f:(T,Out)=>T):FlowOps.this.Repr[T] "Permalink")  def scan\[T](zero: T)(f: (T, T) \=\> T): [Source](scaladsl/Source.html)\[T, [NotUsed](../NotUsed.html)]Similar to `fold` but is not a terminal operation,
emits its current value which starts at `zero` and then
applies the current and next value to the given function `f`,
emitting the next current value.

Similar to `fold` but is not a terminal operation,
emits its current value which starts at `zero` and then
applies the current and next value to the given function `f`,
emitting the next current value.

If the function `f` throws an exception and the supervision decision is
[akka.stream.Supervision.Restart](Supervision$$Restart$.html) current value starts at `zero` again
the stream will continue.

Adheres to the [ActorAttributes.SupervisionStrategy](ActorAttributes$$SupervisionStrategy.html) attribute.

Note that the `zero` value must be immutable.

**Emits when** the function scanning the element returns a new element

**Backpressures when** downstream backpressures

**Completes when** upstream completes

**Cancels when** downstream cancels

See also [FlowOps.scanAsync](scaladsl/FlowOps.html#scanAsync[T](zero:T)(f:(T,Out)=>scala.concurrent.Future[T]):FlowOps.this.Repr[T])

ImplicitThis member is added by an implicit conversion from SourceRef\[T] to[Source](scaladsl/Source.html)\[T, [NotUsed](../NotUsed.html)] performed by method convertRefToSource in [akka.stream.SourceRef](SourceRef$.html).Definition Classes[FlowOps](scaladsl/FlowOps.html)
132. [**](../../akka/stream/SourceRef.html#scanAsync[T](zero:T)(f:(T,Out)=>scala.concurrent.Future[T]):FlowOps.this.Repr[T] "Permalink")  def scanAsync\[T](zero: T)(f: (T, T) \=\> [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[T]): [Source](scaladsl/Source.html)\[T, [NotUsed](../NotUsed.html)]Similar to `scan` but with an asynchronous function,
emits its current value which starts at `zero` and then
applies the current and next value to the given function `f`,
emitting a `Future` that resolves to the next current value.

Similar to `scan` but with an asynchronous function,
emits its current value which starts at `zero` and then
applies the current and next value to the given function `f`,
emitting a `Future` that resolves to the next current value.

If the function `f` throws an exception and the supervision decision is
[akka.stream.Supervision.Restart](Supervision$$Restart$.html) current value starts at `zero` again
the stream will continue.

If the function `f` throws an exception and the supervision decision is
[akka.stream.Supervision.Resume](Supervision$$Resume$.html) current value starts at the previous
current value, or zero when it doesn't have one, and the stream will continue.

Adheres to the [ActorAttributes.SupervisionStrategy](ActorAttributes$$SupervisionStrategy.html) attribute.

Note that the `zero` value must be immutable.

**Emits when** the future returned by `f` completes

**Backpressures when** downstream backpressures

**Completes when** upstream completes and the last future returned by `f` completes

**Cancels when** downstream cancels

See also [FlowOps.scan](scaladsl/FlowOps.html#scan[T](zero:T)(f:(T,Out)=>T):FlowOps.this.Repr[T])

ImplicitThis member is added by an implicit conversion from SourceRef\[T] to[Source](scaladsl/Source.html)\[T, [NotUsed](../NotUsed.html)] performed by method convertRefToSource in [akka.stream.SourceRef](SourceRef$.html).Definition Classes[FlowOps](scaladsl/FlowOps.html)
133. [**](../../akka/stream/SourceRef.html#shape:akka.stream.SourceShape[Out] "Permalink")  val shape: [SourceShape](SourceShape.html)\[T]The shape of a graph is all that is externally visible: its inlets and outlets.

The shape of a graph is all that is externally visible: its inlets and outlets.

ImplicitThis member is added by an implicit conversion from SourceRef\[T] to[Source](scaladsl/Source.html)\[T, [NotUsed](../NotUsed.html)] performed by method convertRefToSource in [akka.stream.SourceRef](SourceRef$.html).Definition Classes[Source](scaladsl/Source.html) → [Graph](Graph.html)
134. [**](../../akka/stream/SourceRef.html#sliding(n:Int,step:Int):FlowOps.this.Repr[Seq[Out]] "Permalink")  def sliding(n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), step: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int) \= 1): [Source](scaladsl/Source.html)\[[Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[T], [NotUsed](../NotUsed.html)]Apply a sliding window over the stream and return the windows as groups of elements, with the last group
possibly smaller than requested due to end\-of\-stream.

Apply a sliding window over the stream and return the windows as groups of elements, with the last group
possibly smaller than requested due to end\-of\-stream.

`n` must be positive, otherwise IllegalArgumentException is thrown.
`step` must be positive, otherwise IllegalArgumentException is thrown.

**Emits when** enough elements have been collected within the window or upstream completed

**Backpressures when** a window has been assembled and downstream backpressures

**Completes when** upstream completes

**Cancels when** downstream cancels

ImplicitThis member is added by an implicit conversion from SourceRef\[T] to[Source](scaladsl/Source.html)\[T, [NotUsed](../NotUsed.html)] performed by method convertRefToSource in [akka.stream.SourceRef](SourceRef$.html).Definition Classes[FlowOps](scaladsl/FlowOps.html)
135. [**](../../akka/stream/SourceRef.html#splitAfter(p:Out=>Boolean):akka.stream.scaladsl.SubFlow[Out,Mat,FlowOps.this.Repr,FlowOps.this.Closed] "Permalink")  def splitAfter(p: (T) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): [SubFlow](scaladsl/SubFlow.html)\[T, [NotUsed](../NotUsed.html), \[\+O][Source](scaladsl/Source.html)\[O, [NotUsed](../NotUsed.html)], [RunnableGraph](scaladsl/RunnableGraph.html)\[[NotUsed](../NotUsed.html)]]This operation applies the given predicate to all incoming elements and
emits them to a stream of output streams.

This operation applies the given predicate to all incoming elements and
emits them to a stream of output streams. It \*ends\* the current substream when the
predicate is true.

ImplicitThis member is added by an implicit conversion from SourceRef\[T] to[Source](scaladsl/Source.html)\[T, [NotUsed](../NotUsed.html)] performed by method convertRefToSource in [akka.stream.SourceRef](SourceRef$.html).Definition Classes[FlowOps](scaladsl/FlowOps.html)See also[\#splitAfter](scaladsl/Source.html#splitAfter(p:Out=>Boolean):akka.stream.scaladsl.SubFlow[Out,Mat,FlowOps.this.Repr,FlowOps.this.Closed])
136. [**](../../akka/stream/SourceRef.html#splitAfter(substreamCancelStrategy:akka.stream.SubstreamCancelStrategy)(p:Out=>Boolean):akka.stream.scaladsl.SubFlow[Out,Mat,FlowOps.this.Repr,FlowOps.this.Closed] "Permalink")  def splitAfter(substreamCancelStrategy: [SubstreamCancelStrategy](SubstreamCancelStrategy.html))(p: (T) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): [SubFlow](scaladsl/SubFlow.html)\[T, [NotUsed](../NotUsed.html), \[\+O][Source](scaladsl/Source.html)\[O, [NotUsed](../NotUsed.html)], [RunnableGraph](scaladsl/RunnableGraph.html)\[[NotUsed](../NotUsed.html)]]This operation applies the given predicate to all incoming elements and
emits them to a stream of output streams.

This operation applies the given predicate to all incoming elements and
emits them to a stream of output streams. It \*ends\* the current substream when the
predicate is true. This means that for the following series of predicate values,
three substreams will be produced with lengths 2, 2, and 3:

```
false, true,        // elements go into first substream
false, true,        // elements go into second substream
false, false, true  // elements go into third substream
```
The object returned from this method is not a normal [Source](scaladsl/Source.html) or [Flow](scaladsl/Flow.html),
it is a [SubFlow](scaladsl/SubFlow.html). This means that after this operator all transformations
are applied to all encountered substreams in the same fashion. Substream mode
is exited either by closing the substream (i.e. connecting it to a [Sink](scaladsl/Sink.html))
or by merging the substreams back together; see the `to` and `mergeBack` methods
on [SubFlow](scaladsl/SubFlow.html) for more information.

It is important to note that the substreams also propagate back\-pressure as
any other stream, which means that blocking one substream will block the `splitAfter`
operator itself—and thereby all substreams—once all internal or
explicit buffers are filled.

If the split predicate `p` throws an exception and the supervision decision
is [akka.stream.Supervision.Stop](Supervision$$Stop$.html) the stream and substreams will be completed
with failure.

If the split predicate `p` throws an exception and the supervision decision
is [akka.stream.Supervision.Resume](Supervision$$Resume$.html) or [akka.stream.Supervision.Restart](Supervision$$Restart$.html)
the element is dropped and the stream and substreams continue.

**Emits when** an element passes through. When the provided predicate is true it emits the element
and opens a new substream for subsequent element

**Backpressures when** there is an element pending for the next substream, but the previous
is not fully consumed yet, or the substream backpressures

**Completes when** upstream completes

**Cancels when** downstream cancels and substreams cancel on `SubstreamCancelStrategy.drain`, downstream
cancels or any substream cancels on `SubstreamCancelStrategy.propagate`

See also [FlowOps.splitWhen](scaladsl/FlowOps.html#splitWhen(p:Out=>Boolean):akka.stream.scaladsl.SubFlow[Out,Mat,FlowOps.this.Repr,FlowOps.this.Closed]).

ImplicitThis member is added by an implicit conversion from SourceRef\[T] to[Source](scaladsl/Source.html)\[T, [NotUsed](../NotUsed.html)] performed by method convertRefToSource in [akka.stream.SourceRef](SourceRef$.html).Definition Classes[FlowOps](scaladsl/FlowOps.html)
137. [**](../../akka/stream/SourceRef.html#splitWhen(p:Out=>Boolean):akka.stream.scaladsl.SubFlow[Out,Mat,FlowOps.this.Repr,FlowOps.this.Closed] "Permalink")  def splitWhen(p: (T) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): [SubFlow](scaladsl/SubFlow.html)\[T, [NotUsed](../NotUsed.html), \[\+O][Source](scaladsl/Source.html)\[O, [NotUsed](../NotUsed.html)], [RunnableGraph](scaladsl/RunnableGraph.html)\[[NotUsed](../NotUsed.html)]]This operation applies the given predicate to all incoming elements and
emits them to a stream of output streams, always beginning a new one with
the current element if the given predicate returns true for it.

This operation applies the given predicate to all incoming elements and
emits them to a stream of output streams, always beginning a new one with
the current element if the given predicate returns true for it.

ImplicitThis member is added by an implicit conversion from SourceRef\[T] to[Source](scaladsl/Source.html)\[T, [NotUsed](../NotUsed.html)] performed by method convertRefToSource in [akka.stream.SourceRef](SourceRef$.html).Definition Classes[FlowOps](scaladsl/FlowOps.html)See also[\#splitWhen](scaladsl/Source.html#splitWhen(p:Out=>Boolean):akka.stream.scaladsl.SubFlow[Out,Mat,FlowOps.this.Repr,FlowOps.this.Closed])
138. [**](../../akka/stream/SourceRef.html#splitWhen(substreamCancelStrategy:akka.stream.SubstreamCancelStrategy)(p:Out=>Boolean):akka.stream.scaladsl.SubFlow[Out,Mat,FlowOps.this.Repr,FlowOps.this.Closed] "Permalink")  def splitWhen(substreamCancelStrategy: [SubstreamCancelStrategy](SubstreamCancelStrategy.html))(p: (T) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): [SubFlow](scaladsl/SubFlow.html)\[T, [NotUsed](../NotUsed.html), \[\+O][Source](scaladsl/Source.html)\[O, [NotUsed](../NotUsed.html)], [RunnableGraph](scaladsl/RunnableGraph.html)\[[NotUsed](../NotUsed.html)]]This operation applies the given predicate to all incoming elements and
emits them to a stream of output streams, always beginning a new one with
the current element if the given predicate returns true for it.

This operation applies the given predicate to all incoming elements and
emits them to a stream of output streams, always beginning a new one with
the current element if the given predicate returns true for it. This means
that for the following series of predicate values, three substreams will
be produced with lengths 1, 2, and 3:

```
false,             // element goes into first substream
true, false,       // elements go into second substream
true, false, false // elements go into third substream
```
In case the \*first\* element of the stream matches the predicate, the first
substream emitted by splitWhen will start from that element. For example:

```
true, false, false // first substream starts from the split-by element
true, false        // subsequent substreams operate the same way
```
The object returned from this method is not a normal [Source](scaladsl/Source.html) or [Flow](scaladsl/Flow.html),
it is a [SubFlow](scaladsl/SubFlow.html). This means that after this operator all transformations
are applied to all encountered substreams in the same fashion. Substream mode
is exited either by closing the substream (i.e. connecting it to a [Sink](scaladsl/Sink.html))
or by merging the substreams back together; see the `to` and `mergeBack` methods
on [SubFlow](scaladsl/SubFlow.html) for more information.

It is important to note that the substreams also propagate back\-pressure as
any other stream, which means that blocking one substream will block the `splitWhen`
operator itself—and thereby all substreams—once all internal or
explicit buffers are filled.

If the split predicate `p` throws an exception and the supervision decision
is [akka.stream.Supervision.Stop](Supervision$$Stop$.html) the stream and substreams will be completed
with failure.

If the split predicate `p` throws an exception and the supervision decision
is [akka.stream.Supervision.Resume](Supervision$$Resume$.html) or [akka.stream.Supervision.Restart](Supervision$$Restart$.html)
the element is dropped and the stream and substreams continue.

**Emits when** an element for which the provided predicate is true, opening and emitting
a new substream for subsequent element

**Backpressures when** there is an element pending for the next substream, but the previous
is not fully consumed yet, or the substream backpressures

**Completes when** upstream completes

**Cancels when** downstream cancels and substreams cancel on `SubstreamCancelStrategy.drain`, downstream
cancels or any substream cancels on `SubstreamCancelStrategy.propagate`

See also [FlowOps.splitAfter](scaladsl/FlowOps.html#splitAfter(p:Out=>Boolean):akka.stream.scaladsl.SubFlow[Out,Mat,FlowOps.this.Repr,FlowOps.this.Closed]).

ImplicitThis member is added by an implicit conversion from SourceRef\[T] to[Source](scaladsl/Source.html)\[T, [NotUsed](../NotUsed.html)] performed by method convertRefToSource in [akka.stream.SourceRef](SourceRef$.html).Definition Classes[FlowOps](scaladsl/FlowOps.html)
139. [**](../../akka/stream/SourceRef.html#statefulMap[S,T](create:()=>S)(f:(S,Out)=>(S,T),onComplete:S=>Option[T]):FlowOps.this.Repr[T] "Permalink")  def statefulMap\[S, T](create: () \=\> S)(f: (S, T) \=\> (S, T), onComplete: (S) \=\> [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[T]): [Source](scaladsl/Source.html)\[T, [NotUsed](../NotUsed.html)]Transform each stream element with the help of a state.

Transform each stream element with the help of a state.

The state creation function is invoked once when the stream is materialized and the returned state is passed to
the mapping function for mapping the first element. The mapping function returns a mapped element to emit
downstream and a state to pass to the next mapping function. The state can be the same for each mapping return,
be a new immutable state but it is also safe to use a mutable state. The returned `T` MUST NOT be `null` as it is
illegal as stream element \- according to the Reactive Streams specification. A `null` state is not allowed and will fail the stream.

For stateless variant see [FlowOps.map](scaladsl/FlowOps.html#map[T](f:Out=>T):FlowOps.this.Repr[T]).

The `onComplete` function is called only once when the upstream or downstream finished, You can do some clean\-up here,
and if the returned value is not empty, it will be emitted to the downstream if available, otherwise the value will be dropped.

Adheres to the [ActorAttributes.SupervisionStrategy](ActorAttributes$$SupervisionStrategy.html) attribute.

**Emits when** the mapping function returns an element and downstream is ready to consume it

**Backpressures when** downstream backpressures

**Completes when** upstream completes

**Cancels when** downstream cancels

Sthe type of the state

Tthe type of the output elements

createa function that creates the initial state

fa function that transforms the upstream element and the state into a pair of next state and output element

onCompletea function that transforms the ongoing state into an optional output element

ImplicitThis member is added by an implicit conversion from SourceRef\[T] to[Source](scaladsl/Source.html)\[T, [NotUsed](../NotUsed.html)] performed by method convertRefToSource in [akka.stream.SourceRef](SourceRef$.html).Definition Classes[FlowOps](scaladsl/FlowOps.html)
140. [**](../../akka/stream/SourceRef.html#statefulMapConcat[T](f:()=>Out=>IterableOnce[T]):FlowOps.this.Repr[T] "Permalink")  def statefulMapConcat\[T](f: () \=\> (T) \=\> [IterableOnce](https://www.scala-lang.org/api/2.13.17/scala/collection/IterableOnce.html#scala.collection.IterableOnce)\[T]): [Source](scaladsl/Source.html)\[T, [NotUsed](../NotUsed.html)]Transform each input element into an `Iterable` of output elements that is
then flattened into the output stream.

Transform each input element into an `Iterable` of output elements that is
then flattened into the output stream. The transformation is meant to be stateful,
which is enabled by creating the transformation function anew for every materialization —
the returned function will typically close over mutable objects to store state between
invocations. For the stateless variant see [FlowOps.mapConcat](scaladsl/FlowOps.html#mapConcat[T](f:Out=>IterableOnce[T]):FlowOps.this.Repr[T]).

The returned `Iterable` MUST NOT contain `null` values,
as they are illegal as stream elements \- according to the Reactive Streams specification.

Adheres to the [ActorAttributes.SupervisionStrategy](ActorAttributes$$SupervisionStrategy.html) attribute.

**Emits when** the mapping function returns an element or there are still remaining elements
from the previously calculated collection

**Backpressures when** downstream backpressures or there are still remaining elements from the
previously calculated collection

**Completes when** upstream completes and all remaining elements has been emitted

**Cancels when** downstream cancels

See also [FlowOps.mapConcat](scaladsl/FlowOps.html#mapConcat[T](f:Out=>IterableOnce[T]):FlowOps.this.Repr[T])

ImplicitThis member is added by an implicit conversion from SourceRef\[T] to[Source](scaladsl/Source.html)\[T, [NotUsed](../NotUsed.html)] performed by method convertRefToSource in [akka.stream.SourceRef](SourceRef$.html).Definition Classes[FlowOps](scaladsl/FlowOps.html)
141. [**](../../akka/stream/SourceRef.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
142. [**](../../akka/stream/SourceRef.html#take(n:Long):FlowOps.this.Repr[Out] "Permalink")  def take(n: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Source](scaladsl/Source.html)\[T, [NotUsed](../NotUsed.html)]Terminate processing (and cancel the upstream publisher) after the given
number of elements.

Terminate processing (and cancel the upstream publisher) after the given
number of elements. Due to input buffering some elements may have been
requested from upstream publishers that will then not be processed downstream
of this step.

The stream will be completed without producing any elements if `n` is zero
or negative.

**Emits when** the specified number of elements to take has not yet been reached

**Backpressures when** downstream backpressures

**Completes when** the defined number of elements has been taken or upstream completes

**Cancels when** the defined number of elements has been taken or downstream cancels

See also [FlowOps.limit](scaladsl/FlowOps.html#limit(max:Long):FlowOps.this.Repr[Out]), [FlowOps.limitWeighted](scaladsl/FlowOps.html#limitWeighted[T](max:Long)(costFn:Out=>Long):FlowOps.this.Repr[Out])

ImplicitThis member is added by an implicit conversion from SourceRef\[T] to[Source](scaladsl/Source.html)\[T, [NotUsed](../NotUsed.html)] performed by method convertRefToSource in [akka.stream.SourceRef](SourceRef$.html).Definition Classes[FlowOps](scaladsl/FlowOps.html)
143. [**](../../akka/stream/SourceRef.html#takeWhile(p:Out=>Boolean,inclusive:Boolean):FlowOps.this.Repr[Out] "Permalink")  def takeWhile(p: (T) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), inclusive: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): [Source](scaladsl/Source.html)\[T, [NotUsed](../NotUsed.html)]Terminate processing (and cancel the upstream publisher) after predicate
returns false for the first time, including the first failed element iff inclusive is true
Due to input buffering some elements may have been requested from upstream publishers
that will then not be processed downstream of this step.

Terminate processing (and cancel the upstream publisher) after predicate
returns false for the first time, including the first failed element iff inclusive is true
Due to input buffering some elements may have been requested from upstream publishers
that will then not be processed downstream of this step.

The stream will be completed without producing any elements if predicate is false for
the first stream element.

Adheres to the [ActorAttributes.SupervisionStrategy](ActorAttributes$$SupervisionStrategy.html) attribute.

**Emits when** the predicate is true

**Backpressures when** downstream backpressures

**Completes when** predicate returned false (or 1 after predicate returns false if `inclusive` or upstream completes

**Cancels when** predicate returned false or downstream cancels

See also [FlowOps.limit](scaladsl/FlowOps.html#limit(max:Long):FlowOps.this.Repr[Out]), [FlowOps.limitWeighted](scaladsl/FlowOps.html#limitWeighted[T](max:Long)(costFn:Out=>Long):FlowOps.this.Repr[Out])

ImplicitThis member is added by an implicit conversion from SourceRef\[T] to[Source](scaladsl/Source.html)\[T, [NotUsed](../NotUsed.html)] performed by method convertRefToSource in [akka.stream.SourceRef](SourceRef$.html).Definition Classes[FlowOps](scaladsl/FlowOps.html)
144. [**](../../akka/stream/SourceRef.html#takeWhile(p:Out=>Boolean):FlowOps.this.Repr[Out] "Permalink")  def takeWhile(p: (T) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): [Source](scaladsl/Source.html)\[T, [NotUsed](../NotUsed.html)]Terminate processing (and cancel the upstream publisher) after predicate
returns false for the first time,
Due to input buffering some elements may have been requested from upstream publishers
that will then not be processed downstream of this step.

Terminate processing (and cancel the upstream publisher) after predicate
returns false for the first time,
Due to input buffering some elements may have been requested from upstream publishers
that will then not be processed downstream of this step.

The stream will be completed without producing any elements if predicate is false for
the first stream element.

**Emits when** the predicate is true

**Backpressures when** downstream backpressures

**Completes when** predicate returned false (or 1 after predicate returns false if `inclusive` or upstream completes

**Cancels when** predicate returned false or downstream cancels

See also [FlowOps.limit](scaladsl/FlowOps.html#limit(max:Long):FlowOps.this.Repr[Out]), [FlowOps.limitWeighted](scaladsl/FlowOps.html#limitWeighted[T](max:Long)(costFn:Out=>Long):FlowOps.this.Repr[Out])

ImplicitThis member is added by an implicit conversion from SourceRef\[T] to[Source](scaladsl/Source.html)\[T, [NotUsed](../NotUsed.html)] performed by method convertRefToSource in [akka.stream.SourceRef](SourceRef$.html).Definition Classes[FlowOps](scaladsl/FlowOps.html)
145. [**](../../akka/stream/SourceRef.html#takeWithin(d:scala.concurrent.duration.FiniteDuration):FlowOps.this.Repr[Out] "Permalink")  def takeWithin(d: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)): [Source](scaladsl/Source.html)\[T, [NotUsed](../NotUsed.html)]Terminate processing (and cancel the upstream publisher) after the given
duration.

Terminate processing (and cancel the upstream publisher) after the given
duration. Due to input buffering some elements may have been
requested from upstream publishers that will then not be processed downstream
of this step.

Note that this can be combined with [\#take](scaladsl/Source.html#take(n:Long):FlowOps.this.Repr[Out]) to limit the number of elements
within the duration.

**Emits when** an upstream element arrives

**Backpressures when** downstream backpressures

**Completes when** upstream completes or timer fires

**Cancels when** downstream cancels or timer fires

ImplicitThis member is added by an implicit conversion from SourceRef\[T] to[Source](scaladsl/Source.html)\[T, [NotUsed](../NotUsed.html)] performed by method convertRefToSource in [akka.stream.SourceRef](SourceRef$.html).Definition Classes[FlowOps](scaladsl/FlowOps.html)
146. [**](../../akka/stream/SourceRef.html#throttle(control:akka.stream.scaladsl.ThrottleControl,costCalculation:Out=>Int):FlowOps.this.Repr[Out] "Permalink")  def throttle(control: [ThrottleControl](scaladsl/ThrottleControl.html), costCalculation: (T) \=\> [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Source](scaladsl/Source.html)\[T, [NotUsed](../NotUsed.html)]The `ThrottleControl` can be updated to change the throttle rate from the outside of the stream
and share a total rate limit between several streams.

The `ThrottleControl` can be updated to change the throttle rate from the outside of the stream
and share a total rate limit between several streams.
Sends elements downstream with speed limited to `cost/per` as defined in the `ThrottleControl`. Cost is
calculating for each element individually by calling `calculateCost` function.
This operator works for streams when elements have different cost(length).
Streams of `ByteString` for example.

Throttle implements the token bucket model. There is a bucket with a given token capacity (burst size or maximumBurst).
Tokens drop into the bucket at a given rate and can be kept for later use up to bucket capacity
to allow some burstiness. Whenever the stream wants to send an element, it takes as many
tokens from the bucket as the element costs. If there isn't any, throttle waits until the
bucket accumulates enough tokens. Elements that cost more than the allowed burst will be delayed proportionally
to their cost minus available tokens, meeting the target rate. Bucket is full when the stream is first materialized and started.

Parameter `mode` manages behavior when upstream is faster than throttle rate:

	- [akka.stream.ThrottleMode.Shaping](ThrottleMode$$Shaping$.html) makes pauses before emitting messages to meet the throttle rate
	- [akka.stream.ThrottleMode.Enforcing](ThrottleMode$$Enforcing$.html) fails with exception when upstream is faster than throttle rate. Enforcing
	 cannot emit elements that cost more than the maximumBurstIt is recommended to use non\-zero burst sizes as they improve both performance and throttling precision by allowing
the implementation to avoid using the scheduler when input rates fall below the enforced limit and to reduce
most of the inaccuracy caused by the scheduler resolution (which is in the range of milliseconds).

 WARNING: Be aware that throttle is using scheduler to slow down the stream. This scheduler has minimal time of triggering
 next push. Consequently it will slow down the stream as it has minimal pause for emitting. This can happen in
 case burst is 0 and speed is higher than 30 events per second. You need to increase the `maximumBurst` if
 elements arrive with small interval (30 milliseconds or less). Use the overloaded `throttle` method without
 `maximumBurst` parameter to automatically calculate the `maximumBurst` based on the given rate (`cost/per`).
 In other words the throttler always enforces the rate limit when `maximumBurst` parameter is given, but in
 certain cases (mostly due to limited scheduler resolution) it enforces a tighter bound than what was prescribed.

**Emits when** upstream emits an element and configured time per each element elapsed

**Backpressures when** downstream backpressures or the incoming rate is higher than the speed limit

**Completes when** upstream completes

**Cancels when** downstream cancels

ImplicitThis member is added by an implicit conversion from SourceRef\[T] to[Source](scaladsl/Source.html)\[T, [NotUsed](../NotUsed.html)] performed by method convertRefToSource in [akka.stream.SourceRef](SourceRef$.html).Definition Classes[FlowOps](scaladsl/FlowOps.html)
147. [**](../../akka/stream/SourceRef.html#throttle(control:akka.stream.scaladsl.ThrottleControl):FlowOps.this.Repr[Out] "Permalink")  def throttle(control: [ThrottleControl](scaladsl/ThrottleControl.html)): [Source](scaladsl/Source.html)\[T, [NotUsed](../NotUsed.html)]The `ThrottleControl` can be updated to change the throttle rate from the outside of the stream
and share a total rate limit between several streams.

The `ThrottleControl` can be updated to change the throttle rate from the outside of the stream
and share a total rate limit between several streams.
Sends elements downstream with speed limited to `elements/per` as defined in the `ThrottleControl`.
In other words, this operator sets the maximum rate for emitting messages. This operator works for streams
where all elements have the same cost or length.

Throttle implements the token bucket model. There is a bucket with a given token capacity (burst size).
Tokens drop into the bucket at a given rate and can be kept for later use up to bucket capacity
to allow some burstiness. Whenever the stream wants to send an element, it takes as many
tokens from the bucket as the element costs. If there isn't any, throttle waits until the
bucket accumulates enough tokens. Elements that cost more than the allowed burst will be delayed proportionally
to their cost minus available tokens, meeting the target rate. Bucket is full when the stream is first materialized and
started.

The burst size is calculated based on the given rate (`cost/per`) as 0\.1 \* rate, for example:
\- rate \< 20/second \=\> burst size 1
\- rate 20/second \=\> burst size 2
\- rate 100/second \=\> burst size 10
\- rate 200/second \=\> burst size 20

The throttle `mode` is [akka.stream.ThrottleMode.Shaping](ThrottleMode$$Shaping$.html), which pauses before emitting messages to
meet the throttle rate.

**Emits when** upstream emits an element and configured time per each element elapsed

**Backpressures when** downstream backpressures or the incoming rate is higher than the speed limit

**Completes when** upstream completes

**Cancels when** downstream cancels

ImplicitThis member is added by an implicit conversion from SourceRef\[T] to[Source](scaladsl/Source.html)\[T, [NotUsed](../NotUsed.html)] performed by method convertRefToSource in [akka.stream.SourceRef](SourceRef$.html).Definition Classes[FlowOps](scaladsl/FlowOps.html)
148. [**](../../akka/stream/SourceRef.html#throttle(cost:Int,per:scala.concurrent.duration.FiniteDuration,maximumBurst:Int,costCalculation:Out=>Int,mode:akka.stream.ThrottleMode):FlowOps.this.Repr[Out] "Permalink")  def throttle(cost: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), per: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), maximumBurst: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), costCalculation: (T) \=\> [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), mode: [ThrottleMode](ThrottleMode.html)): [Source](scaladsl/Source.html)\[T, [NotUsed](../NotUsed.html)]Sends elements downstream with speed limited to `cost/per`.

Sends elements downstream with speed limited to `cost/per`. Cost is
calculating for each element individually by calling `calculateCost` function.
This operator works for streams when elements have different cost(length).
Streams of `ByteString` for example.

Throttle implements the token bucket model. There is a bucket with a given token capacity (burst size or maximumBurst).
Tokens drop into the bucket at a given rate and can be kept for later use up to bucket capacity
to allow some burstiness. Whenever the stream wants to send an element, it takes as many
tokens from the bucket as the element costs. If there isn't any, throttle waits until the
bucket accumulates enough tokens. Elements that cost more than the allowed burst will be delayed proportionally
to their cost minus available tokens, meeting the target rate. Bucket is full when the stream is first materialized and started.

Parameter `mode` manages behavior when upstream is faster than throttle rate:

	- [akka.stream.ThrottleMode.Shaping](ThrottleMode$$Shaping$.html) makes pauses before emitting messages to meet the throttle rate
	- [akka.stream.ThrottleMode.Enforcing](ThrottleMode$$Enforcing$.html) fails with exception when upstream is faster than throttle rate. Enforcing
	 cannot emit elements that cost more than the maximumBurstIt is recommended to use non\-zero burst sizes as they improve both performance and throttling precision by allowing
the implementation to avoid using the scheduler when input rates fall below the enforced limit and to reduce
most of the inaccuracy caused by the scheduler resolution (which is in the range of milliseconds).

 WARNING: Be aware that throttle is using scheduler to slow down the stream. This scheduler has minimal time of triggering
 next push. Consequently it will slow down the stream as it has minimal pause for emitting. This can happen in
 case burst is 0 and speed is higher than 30 events per second. You need to increase the `maximumBurst` if
 elements arrive with small interval (30 milliseconds or less). Use the overloaded `throttle` method without
 `maximumBurst` parameter to automatically calculate the `maximumBurst` based on the given rate (`cost/per`).
 In other words the throttler always enforces the rate limit when `maximumBurst` parameter is given, but in
 certain cases (mostly due to limited scheduler resolution) it enforces a tighter bound than what was prescribed.

**Emits when** upstream emits an element and configured time per each element elapsed

**Backpressures when** downstream backpressures or the incoming rate is higher than the speed limit

**Completes when** upstream completes

**Cancels when** downstream cancels

ImplicitThis member is added by an implicit conversion from SourceRef\[T] to[Source](scaladsl/Source.html)\[T, [NotUsed](../NotUsed.html)] performed by method convertRefToSource in [akka.stream.SourceRef](SourceRef$.html).Definition Classes[FlowOps](scaladsl/FlowOps.html)
149. [**](../../akka/stream/SourceRef.html#throttle(cost:Int,per:scala.concurrent.duration.FiniteDuration,costCalculation:Out=>Int):FlowOps.this.Repr[Out] "Permalink")  def throttle(cost: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), per: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), costCalculation: (T) \=\> [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Source](scaladsl/Source.html)\[T, [NotUsed](../NotUsed.html)]Sends elements downstream with speed limited to `cost/per`.

Sends elements downstream with speed limited to `cost/per`. Cost is
calculating for each element individually by calling `calculateCost` function.
This operator works for streams when elements have different cost(length).
Streams of `ByteString` for example.

Throttle implements the token bucket model. There is a bucket with a given token capacity (burst size).
Tokens drop into the bucket at a given rate and can be kept for later use up to bucket capacity
to allow some burstiness. Whenever the stream wants to send an element, it takes as many
tokens from the bucket as the element costs. If there isn't any, throttle waits until the
bucket accumulates enough tokens. Elements that cost more than the allowed burst will be delayed proportionally
to their cost minus available tokens, meeting the target rate. Bucket is full when the stream is first materialized and
started.

The burst size is calculated based on the given rate (`cost/per`) as 0\.1 \* rate, for example:
\- rate \< 20/second \=\> burst size 1
\- rate 20/second \=\> burst size 2
\- rate 100/second \=\> burst size 10
\- rate 200/second \=\> burst size 20

The throttle `mode` is [akka.stream.ThrottleMode.Shaping](ThrottleMode$$Shaping$.html), which pauses before emitting messages to
meet the throttle rate.

**Emits when** upstream emits an element and configured time per each element elapsed

**Backpressures when** downstream backpressures or the incoming rate is higher than the speed limit

**Completes when** upstream completes

**Cancels when** downstream cancels

ImplicitThis member is added by an implicit conversion from SourceRef\[T] to[Source](scaladsl/Source.html)\[T, [NotUsed](../NotUsed.html)] performed by method convertRefToSource in [akka.stream.SourceRef](SourceRef$.html).Definition Classes[FlowOps](scaladsl/FlowOps.html)
150. [**](../../akka/stream/SourceRef.html#throttle(elements:Int,per:scala.concurrent.duration.FiniteDuration,maximumBurst:Int,mode:akka.stream.ThrottleMode):FlowOps.this.Repr[Out] "Permalink")  def throttle(elements: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), per: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), maximumBurst: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), mode: [ThrottleMode](ThrottleMode.html)): [Source](scaladsl/Source.html)\[T, [NotUsed](../NotUsed.html)]Sends elements downstream with speed limited to `elements/per`.

Sends elements downstream with speed limited to `elements/per`. In other words, this operator sets the maximum rate
for emitting messages. This operator works for streams where all elements have the same cost or length.

Throttle implements the token bucket model. There is a bucket with a given token capacity (burst size or maximumBurst).
Tokens drop into the bucket at a given rate and can be kept for later use up to bucket capacity
to allow some burstiness. Whenever the stream wants to send an element, it takes as many
tokens from the bucket as the element costs. If there isn't any, throttle waits until the
bucket accumulates enough tokens. Elements that cost more than the allowed burst will be delayed proportionally
to their cost minus available tokens, meeting the target rate. Bucket is full when the stream is first materialized and started.

Parameter `mode` manages behavior when upstream is faster than throttle rate:

	- [akka.stream.ThrottleMode.Shaping](ThrottleMode$$Shaping$.html) makes pauses before emitting messages to meet the throttle rate
	- [akka.stream.ThrottleMode.Enforcing](ThrottleMode$$Enforcing$.html) fails with exception when upstream is faster than throttle rate. Enforcing
	 cannot emit elements that cost more than the maximumBurstIt is recommended to use non\-zero burst sizes as they improve both performance and throttling precision by allowing
the implementation to avoid using the scheduler when input rates fall below the enforced limit and to reduce
most of the inaccuracy caused by the scheduler resolution (which is in the range of milliseconds).

 WARNING: Be aware that throttle is using scheduler to slow down the stream. This scheduler has minimal time of triggering
 next push. Consequently it will slow down the stream as it has minimal pause for emitting. This can happen in
 case burst is 0 and speed is higher than 30 events per second. You need to increase the `maximumBurst` if
 elements arrive with small interval (30 milliseconds or less). Use the overloaded `throttle` method without
 `maximumBurst` parameter to automatically calculate the `maximumBurst` based on the given rate (`cost/per`).
 In other words the throttler always enforces the rate limit when `maximumBurst` parameter is given, but in
 certain cases (mostly due to limited scheduler resolution) it enforces a tighter bound than what was prescribed.

**Emits when** upstream emits an element and configured time per each element elapsed

**Backpressures when** downstream backpressures or the incoming rate is higher than the speed limit

**Completes when** upstream completes

**Cancels when** downstream cancels

ImplicitThis member is added by an implicit conversion from SourceRef\[T] to[Source](scaladsl/Source.html)\[T, [NotUsed](../NotUsed.html)] performed by method convertRefToSource in [akka.stream.SourceRef](SourceRef$.html).Definition Classes[FlowOps](scaladsl/FlowOps.html)
151. [**](../../akka/stream/SourceRef.html#throttle(elements:Int,per:scala.concurrent.duration.FiniteDuration):FlowOps.this.Repr[Out] "Permalink")  def throttle(elements: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), per: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)): [Source](scaladsl/Source.html)\[T, [NotUsed](../NotUsed.html)]Sends elements downstream with speed limited to `elements/per`.

Sends elements downstream with speed limited to `elements/per`. In other words, this operator sets the maximum rate
for emitting messages. This operator works for streams where all elements have the same cost or length.

Throttle implements the token bucket model. There is a bucket with a given token capacity (burst size).
Tokens drop into the bucket at a given rate and can be kept for later use up to bucket capacity
to allow some burstiness. Whenever the stream wants to send an element, it takes as many
tokens from the bucket as the element costs. If there isn't any, throttle waits until the
bucket accumulates enough tokens. Elements that cost more than the allowed burst will be delayed proportionally
to their cost minus available tokens, meeting the target rate. Bucket is full when the stream is first materialized and
started.

The burst size is calculated based on the given rate (`cost/per`) as 0\.1 \* rate, for example:
\- rate \< 20/second \=\> burst size 1
\- rate 20/second \=\> burst size 2
\- rate 100/second \=\> burst size 10
\- rate 200/second \=\> burst size 20

The throttle `mode` is [akka.stream.ThrottleMode.Shaping](ThrottleMode$$Shaping$.html), which pauses before emitting messages to
meet the throttle rate.

**Emits when** upstream emits an element and configured time per each element elapsed

**Backpressures when** downstream backpressures or the incoming rate is higher than the speed limit

**Completes when** upstream completes

**Cancels when** downstream cancels

ImplicitThis member is added by an implicit conversion from SourceRef\[T] to[Source](scaladsl/Source.html)\[T, [NotUsed](../NotUsed.html)] performed by method convertRefToSource in [akka.stream.SourceRef](SourceRef$.html).Definition Classes[FlowOps](scaladsl/FlowOps.html)
152. [**](../../akka/stream/SourceRef.html#to[Mat2](sink:akka.stream.Graph[akka.stream.SinkShape[Out],Mat2]):akka.stream.scaladsl.RunnableGraph[Mat] "Permalink")  def to\[Mat2](sink: [Graph](Graph.html)\[[SinkShape](SinkShape.html)\[T], Mat2]): [RunnableGraph](scaladsl/RunnableGraph.html)\[[NotUsed](../NotUsed.html)]Connect this [akka.stream.scaladsl.Source](scaladsl/Source.html) to a [akka.stream.scaladsl.Sink](scaladsl/Sink.html),
concatenating the processing steps of both.

Connect this [akka.stream.scaladsl.Source](scaladsl/Source.html) to a [akka.stream.scaladsl.Sink](scaladsl/Sink.html),
concatenating the processing steps of both.

ImplicitThis member is added by an implicit conversion from SourceRef\[T] to[Source](scaladsl/Source.html)\[T, [NotUsed](../NotUsed.html)] performed by method convertRefToSource in [akka.stream.SourceRef](SourceRef$.html).Definition Classes[Source](scaladsl/Source.html) → [FlowOps](scaladsl/FlowOps.html)
153. [**](../../akka/stream/SourceRef.html#toMat[Mat2,Mat3](sink:akka.stream.Graph[akka.stream.SinkShape[Out],Mat2])(combine:(Mat,Mat2)=>Mat3):akka.stream.scaladsl.RunnableGraph[Mat3] "Permalink")  def toMat\[Mat2, Mat3](sink: [Graph](Graph.html)\[[SinkShape](SinkShape.html)\[T], Mat2])(combine: ([NotUsed](../NotUsed.html), Mat2) \=\> Mat3): [RunnableGraph](scaladsl/RunnableGraph.html)\[Mat3]Connect this [akka.stream.scaladsl.Source](scaladsl/Source.html) to a [akka.stream.scaladsl.Sink](scaladsl/Sink.html),
concatenating the processing steps of both.

Connect this [akka.stream.scaladsl.Source](scaladsl/Source.html) to a [akka.stream.scaladsl.Sink](scaladsl/Sink.html),
concatenating the processing steps of both.

ImplicitThis member is added by an implicit conversion from SourceRef\[T] to[Source](scaladsl/Source.html)\[T, [NotUsed](../NotUsed.html)] performed by method convertRefToSource in [akka.stream.SourceRef](SourceRef$.html).Definition Classes[Source](scaladsl/Source.html) → [FlowOpsMat](scaladsl/FlowOpsMat.html)
154. [**](../../akka/stream/SourceRef.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
155. [**](../../akka/stream/SourceRef.html#traversalBuilder:akka.stream.impl.LinearTraversalBuilder "Permalink")  val traversalBuilder: LinearTraversalBuilderINTERNAL API.

INTERNAL API.

Every materializable element must be backed by a stream layout module

ImplicitThis member is added by an implicit conversion from SourceRef\[T] to[Source](scaladsl/Source.html)\[T, [NotUsed](../NotUsed.html)] performed by method convertRefToSource in [akka.stream.SourceRef](SourceRef$.html).Definition Classes[Source](scaladsl/Source.html) → [Graph](Graph.html)
156. [**](../../akka/stream/SourceRef.html#via[T,Mat2](flow:akka.stream.Graph[akka.stream.FlowShape[Out,T],Mat2]):Source.this.Repr[T] "Permalink")  def via\[T, Mat2](flow: [Graph](Graph.html)\[[FlowShape](FlowShape.html)\[T, T], Mat2]): [Source](scaladsl/Source.html)\[T, [NotUsed](../NotUsed.html)]Transform this [Flow](scaladsl/Flow.html) by appending the given processing steps.

Transform this [Flow](scaladsl/Flow.html) by appending the given processing steps.

```
    +---------------------------------+
    | Resulting Flow[In, T, Mat]  |
    |                                 |
    |  +------+             +------+  |
    |  |      |             |      |  |
In ~~> | this |  ~~Out~~>   | flow | ~~> T
    |  |   Mat|             |     M|  |
    |  +------+             +------+  |
    +---------------------------------+
```
The materialized value of the combined [Flow](scaladsl/Flow.html) will be the materialized
value of the current flow (ignoring the other Flow’s value), use
[viaMat](scaladsl/Flow.html#viaMat[T,Mat2,Mat3](flow:akka.stream.Graph[akka.stream.FlowShape[Out,T],Mat2])(combine:(Mat,Mat2)=>Mat3):akka.stream.scaladsl.Flow[In,T,Mat3]) if a different strategy is needed.

See also [FlowOpsMat.viaMat](scaladsl/FlowOpsMat.html#viaMat[T,Mat2,Mat3](flow:akka.stream.Graph[akka.stream.FlowShape[Out,T],Mat2])(combine:(Mat,Mat2)=>Mat3):FlowOpsMat.this.ReprMat[T,Mat3]) when access to materialized values of the parameter is needed.

ImplicitThis member is added by an implicit conversion from SourceRef\[T] to[Source](scaladsl/Source.html)\[T, [NotUsed](../NotUsed.html)] performed by method convertRefToSource in [akka.stream.SourceRef](SourceRef$.html).Definition Classes[Source](scaladsl/Source.html) → [FlowOps](scaladsl/FlowOps.html)
157. [**](../../akka/stream/SourceRef.html#viaMat[T,Mat2,Mat3](flow:akka.stream.Graph[akka.stream.FlowShape[Out,T],Mat2])(combine:(Mat,Mat2)=>Mat3):akka.stream.scaladsl.Source[T,Mat3] "Permalink")  def viaMat\[T, Mat2, Mat3](flow: [Graph](Graph.html)\[[FlowShape](FlowShape.html)\[T, T], Mat2])(combine: ([NotUsed](../NotUsed.html), Mat2) \=\> Mat3): [Source](scaladsl/Source.html)\[T, Mat3]Transform this [Flow](scaladsl/Flow.html) by appending the given processing steps.

Transform this [Flow](scaladsl/Flow.html) by appending the given processing steps.

```
    +---------------------------------+
    | Resulting Flow[In, T, M2]       |
    |                                 |
    |  +------+            +------+   |
    |  |      |            |      |   |
In ~~> | this |  ~~Out~~>  | flow |  ~~> T
    |  |   Mat|            |     M|   |
    |  +------+            +------+   |
    +---------------------------------+
```
The `combine` function is used to compose the materialized values of this flow and that
flow into the materialized value of the resulting Flow.

It is recommended to use the internally optimized `Keep.left` and `Keep.right` combiners
where appropriate instead of manually writing functions that pass through one of the values.

ImplicitThis member is added by an implicit conversion from SourceRef\[T] to[Source](scaladsl/Source.html)\[T, [NotUsed](../NotUsed.html)] performed by method convertRefToSource in [akka.stream.SourceRef](SourceRef$.html).Definition Classes[Source](scaladsl/Source.html) → [FlowOpsMat](scaladsl/FlowOpsMat.html)
158. [**](../../akka/stream/SourceRef.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
159. [**](../../akka/stream/SourceRef.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
160. [**](../../akka/stream/SourceRef.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
161. [**](../../akka/stream/SourceRef.html#watch(ref:akka.actor.ActorRef):FlowOps.this.Repr[Out] "Permalink")  def watch(ref: [ActorRef](../actor/ActorRef.html)): [Source](scaladsl/Source.html)\[T, [NotUsed](../NotUsed.html)]The operator fails with an [akka.stream.WatchedActorTerminatedException](WatchedActorTerminatedException.html) if the target actor is terminated.

The operator fails with an [akka.stream.WatchedActorTerminatedException](WatchedActorTerminatedException.html) if the target actor is terminated.

**Emits when** upstream emits

**Backpressures when** downstream backpressures

**Completes when** upstream completes

**Fails when** the watched actor terminates

**Cancels when** downstream cancels

ImplicitThis member is added by an implicit conversion from SourceRef\[T] to[Source](scaladsl/Source.html)\[T, [NotUsed](../NotUsed.html)] performed by method convertRefToSource in [akka.stream.SourceRef](SourceRef$.html).Definition Classes[FlowOps](scaladsl/FlowOps.html)
162. [**](../../akka/stream/SourceRef.html#watchTermination[Mat2]()(matF:(Mat,scala.concurrent.Future[akka.Done])=>Mat2):FlowOpsMat.this.ReprMat[Out,Mat2] "Permalink")  def watchTermination\[Mat2]()(matF: ([NotUsed](../NotUsed.html), [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[Done](../Done.html)]) \=\> Mat2): [Source](scaladsl/Source.html)\[T, Mat2]Materializes to `Future[Done]` that completes on getting termination message.

Materializes to `Future[Done]` that completes on getting termination message.
The Future completes with success when received complete message from upstream or cancel
from downstream. It fails with the propagated error when received error message from
upstream or downstream.

It is recommended to use the internally optimized `Keep.left` and `Keep.right` combiners
where appropriate instead of manually writing functions that pass through one of the values.

ImplicitThis member is added by an implicit conversion from SourceRef\[T] to[Source](scaladsl/Source.html)\[T, [NotUsed](../NotUsed.html)] performed by method convertRefToSource in [akka.stream.SourceRef](SourceRef$.html).Definition Classes[FlowOpsMat](scaladsl/FlowOpsMat.html)
163. [**](../../akka/stream/SourceRef.html#wireTap(that:akka.stream.Graph[akka.stream.SinkShape[Out],_]):FlowOps.this.Repr[Out] "Permalink")  def wireTap(that: [Graph](Graph.html)\[[SinkShape](SinkShape.html)\[T], \_]): [Source](scaladsl/Source.html)\[T, [NotUsed](../NotUsed.html)]Attaches the given [Sink](scaladsl/Sink.html) to this [Flow](scaladsl/Flow.html) as a wire tap, meaning that elements that pass
through will also be sent to the wire\-tap Sink, without the latter affecting the mainline flow.

Attaches the given [Sink](scaladsl/Sink.html) to this [Flow](scaladsl/Flow.html) as a wire tap, meaning that elements that pass
through will also be sent to the wire\-tap Sink, without the latter affecting the mainline flow.
If the wire\-tap Sink backpressures, elements that would've been sent to it will be dropped instead.

It is similar to [\#alsoTo](scaladsl/Source.html#alsoTo(that:akka.stream.Graph[akka.stream.SinkShape[Out],_]):FlowOps.this.Repr[Out]) which does backpressure instead of dropping elements.

**Emits when** element is available and demand exists from the downstream; the element will
also be sent to the wire\-tap Sink if there is demand.

**Backpressures when** downstream backpressures

**Completes when** upstream completes

**Cancels when** downstream cancels

ImplicitThis member is added by an implicit conversion from SourceRef\[T] to[Source](scaladsl/Source.html)\[T, [NotUsed](../NotUsed.html)] performed by method convertRefToSource in [akka.stream.SourceRef](SourceRef$.html).Definition Classes[FlowOps](scaladsl/FlowOps.html)
164. [**](../../akka/stream/SourceRef.html#wireTap(f:Out=>Unit):FlowOps.this.Repr[Out] "Permalink")  def wireTap(f: (T) \=\> [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)): [Source](scaladsl/Source.html)\[T, [NotUsed](../NotUsed.html)]This is a simplified version of `wireTap(Sink)` that takes only a simple function.

This is a simplified version of `wireTap(Sink)` that takes only a simple function.
Elements will be passed into this "side channel" function, and any of its results will be ignored.

If the wire\-tap operation is slow (it backpressures), elements that would've been sent to it will be dropped instead.
It is similar to [\#alsoTo](scaladsl/Source.html#alsoTo(that:akka.stream.Graph[akka.stream.SinkShape[Out],_]):FlowOps.this.Repr[Out]) which does backpressure instead of dropping elements.

This operation is useful for inspecting the passed through element, usually by means of side\-effecting
operations (such as `println`, or emitting metrics), for each element without having to modify it.

For logging signals (elements, completion, error) consider using the [log](scaladsl/Source.html#log(name:String,extract:Out=>Any)(implicitlog:akka.event.LoggingAdapter):FlowOps.this.Repr[Out]) operator instead,
along with appropriate `ActorAttributes.logLevels`.

**Emits when** upstream emits an element; the same element will be passed to the attached function,
 as well as to the downstream operator

**Backpressures when** downstream backpressures

**Completes when** upstream completes

**Cancels when** downstream cancels

ImplicitThis member is added by an implicit conversion from SourceRef\[T] to[Source](scaladsl/Source.html)\[T, [NotUsed](../NotUsed.html)] performed by method convertRefToSource in [akka.stream.SourceRef](SourceRef$.html).Definition Classes[FlowOps](scaladsl/FlowOps.html)
165. [**](../../akka/stream/SourceRef.html#wireTapMat[Mat2,Mat3](that:akka.stream.Graph[akka.stream.SinkShape[Out],Mat2])(matF:(Mat,Mat2)=>Mat3):FlowOpsMat.this.ReprMat[Out,Mat3] "Permalink")  def wireTapMat\[Mat2, Mat3](that: [Graph](Graph.html)\[[SinkShape](SinkShape.html)\[T], Mat2])(matF: ([NotUsed](../NotUsed.html), Mat2) \=\> Mat3): [Source](scaladsl/Source.html)\[T, Mat3]Attaches the given [Sink](scaladsl/Sink.html) to this [Flow](scaladsl/Flow.html) as a wire tap, meaning that elements that pass
through will also be sent to the wire\-tap Sink, without the latter affecting the mainline flow.

Attaches the given [Sink](scaladsl/Sink.html) to this [Flow](scaladsl/Flow.html) as a wire tap, meaning that elements that pass
through will also be sent to the wire\-tap Sink, without the latter affecting the mainline flow.
If the wire\-tap Sink backpressures, elements that would've been sent to it will be dropped instead.

It is similar to [\#alsoToMat](scaladsl/Source.html#alsoToMat[Mat2,Mat3](that:akka.stream.Graph[akka.stream.SinkShape[Out],Mat2])(matF:(Mat,Mat2)=>Mat3):FlowOpsMat.this.ReprMat[Out,Mat3]) which does backpressure instead of dropping elements.

ImplicitThis member is added by an implicit conversion from SourceRef\[T] to[Source](scaladsl/Source.html)\[T, [NotUsed](../NotUsed.html)] performed by method convertRefToSource in [akka.stream.SourceRef](SourceRef$.html).Definition Classes[FlowOpsMat](scaladsl/FlowOpsMat.html)See also[\#wireTap](scaladsl/Source.html#wireTap(that:akka.stream.Graph[akka.stream.SinkShape[Out],_]):FlowOps.this.Repr[Out])
It is recommended to use the internally optimized `Keep.left` and `Keep.right` combiners
where appropriate instead of manually writing functions that pass through one of the values.
166. [**](../../akka/stream/SourceRef.html#withAttributes(attr:akka.stream.Attributes):Source.this.Repr[Out] "Permalink")  def withAttributes(attr: [Attributes](Attributes.html)): [Source](scaladsl/Source.html)\[T, [NotUsed](../NotUsed.html)]Replace the attributes of this [Source](scaladsl/Source.html) with the given ones.

Replace the attributes of this [Source](scaladsl/Source.html) with the given ones. If this Source is a composite
of multiple graphs, new attributes on the composite will be less specific than attributes
set directly on the individual graphs of the composite.

ImplicitThis member is added by an implicit conversion from SourceRef\[T] to[Source](scaladsl/Source.html)\[T, [NotUsed](../NotUsed.html)] performed by method convertRefToSource in [akka.stream.SourceRef](SourceRef$.html).Definition Classes[Source](scaladsl/Source.html) → [Graph](Graph.html) → [FlowOps](scaladsl/FlowOps.html)
167. [**](../../akka/stream/SourceRef.html#zip[U](that:akka.stream.Graph[akka.stream.SourceShape[U],_]):FlowOps.this.Repr[(Out,U)] "Permalink")  def zip\[U](that: [Graph](Graph.html)\[[SourceShape](SourceShape.html)\[U], \_]): [Source](scaladsl/Source.html)\[(T, U), [NotUsed](../NotUsed.html)]Combine the elements of current flow and the given [Source](scaladsl/Source.html) into a stream of tuples.

Combine the elements of current flow and the given [Source](scaladsl/Source.html) into a stream of tuples.

**Emits when** all of the inputs have an element available

**Backpressures when** downstream backpressures

**Completes when** any upstream completes

**Cancels when** downstream cancels

ImplicitThis member is added by an implicit conversion from SourceRef\[T] to[Source](scaladsl/Source.html)\[T, [NotUsed](../NotUsed.html)] performed by method convertRefToSource in [akka.stream.SourceRef](SourceRef$.html).Definition Classes[FlowOps](scaladsl/FlowOps.html)
168. [**](../../akka/stream/SourceRef.html#zipAll[U,A>:Out](that:akka.stream.Graph[akka.stream.SourceShape[U],_],thisElem:A,thatElem:U):FlowOps.this.Repr[(A,U)] "Permalink")  def zipAll\[U, A \>: Out](that: [Graph](Graph.html)\[[SourceShape](SourceShape.html)\[U], \_], thisElem: A, thatElem: U): [Source](scaladsl/Source.html)\[(A, U), [NotUsed](../NotUsed.html)]Combine the elements of current flow and the given [Source](scaladsl/Source.html) into a stream of tuples.

Combine the elements of current flow and the given [Source](scaladsl/Source.html) into a stream of tuples.

**Emits when** at first emits when both inputs emit, and then as long as any input emits (coupled to the default value of the completed input).

**Backpressures when** downstream backpressures

**Completes when** all upstream completes

**Cancels when** downstream cancels

ImplicitThis member is added by an implicit conversion from SourceRef\[T] to[Source](scaladsl/Source.html)\[T, [NotUsed](../NotUsed.html)] performed by method convertRefToSource in [akka.stream.SourceRef](SourceRef$.html).Definition Classes[FlowOps](scaladsl/FlowOps.html)
169. [**](../../akka/stream/SourceRef.html#zipAllMat[U,Mat2,Mat3,A>:Out](that:akka.stream.Graph[akka.stream.SourceShape[U],Mat2],thisElem:A,thatElem:U)(matF:(Mat,Mat2)=>Mat3):FlowOpsMat.this.ReprMat[(A,U),Mat3] "Permalink")  def zipAllMat\[U, Mat2, Mat3, A \>: Out](that: [Graph](Graph.html)\[[SourceShape](SourceShape.html)\[U], Mat2], thisElem: A, thatElem: U)(matF: ([NotUsed](../NotUsed.html), Mat2) \=\> Mat3): [Source](scaladsl/Source.html)\[(A, U), Mat3]Combine the elements of current flow and the given [Source](scaladsl/Source.html) into a stream of tuples.

Combine the elements of current flow and the given [Source](scaladsl/Source.html) into a stream of tuples.

ImplicitThis member is added by an implicit conversion from SourceRef\[T] to[Source](scaladsl/Source.html)\[T, [NotUsed](../NotUsed.html)] performed by method convertRefToSource in [akka.stream.SourceRef](SourceRef$.html).Definition Classes[FlowOpsMat](scaladsl/FlowOpsMat.html)See also[\#zipAll](scaladsl/Source.html#zipAll[U,A>:Out](that:akka.stream.Graph[akka.stream.SourceShape[U],_],thisElem:A,thatElem:U):FlowOps.this.Repr[(A,U)])
**Emits when** at first emits when both inputs emit, and then as long as any input emits (coupled to the default value of the completed input).
**Backpressures when** downstream backpressures
**Completes when** all upstream completes
**Cancels when** downstream cancels
170. [**](../../akka/stream/SourceRef.html#zipLatest[U](that:akka.stream.Graph[akka.stream.SourceShape[U],_]):FlowOps.this.Repr[(Out,U)] "Permalink")  def zipLatest\[U](that: [Graph](Graph.html)\[[SourceShape](SourceShape.html)\[U], \_]): [Source](scaladsl/Source.html)\[(T, U), [NotUsed](../NotUsed.html)]Combine the elements of 2 streams into a stream of tuples, picking always the latest element of each.

Combine the elements of 2 streams into a stream of tuples, picking always the latest element of each.

A `ZipLatest` has a `left` and a `right` input port and one `out` port.

No element is emitted until at least one element from each Source becomes available.

**Emits when** all of the inputs have at least an element available, and then each time an element becomes
 available on either of the inputs

**Backpressures when** downstream backpressures

**Completes when** any upstream completes

**Cancels when** downstream cancels

ImplicitThis member is added by an implicit conversion from SourceRef\[T] to[Source](scaladsl/Source.html)\[T, [NotUsed](../NotUsed.html)] performed by method convertRefToSource in [akka.stream.SourceRef](SourceRef$.html).Definition Classes[FlowOps](scaladsl/FlowOps.html)
171. [**](../../akka/stream/SourceRef.html#zipLatestMat[U,Mat2,Mat3](that:akka.stream.Graph[akka.stream.SourceShape[U],Mat2])(matF:(Mat,Mat2)=>Mat3):FlowOpsMat.this.ReprMat[(Out,U),Mat3] "Permalink")  def zipLatestMat\[U, Mat2, Mat3](that: [Graph](Graph.html)\[[SourceShape](SourceShape.html)\[U], Mat2])(matF: ([NotUsed](../NotUsed.html), Mat2) \=\> Mat3): [Source](scaladsl/Source.html)\[(T, U), Mat3]Combine the elements of current flow and the given [Source](scaladsl/Source.html) into a stream of tuples,
picking always the latest of the elements of each source.

Combine the elements of current flow and the given [Source](scaladsl/Source.html) into a stream of tuples,
picking always the latest of the elements of each source.

ImplicitThis member is added by an implicit conversion from SourceRef\[T] to[Source](scaladsl/Source.html)\[T, [NotUsed](../NotUsed.html)] performed by method convertRefToSource in [akka.stream.SourceRef](SourceRef$.html).Definition Classes[FlowOpsMat](scaladsl/FlowOpsMat.html)See also[\#zipLatest](scaladsl/Source.html#zipLatest[U](that:akka.stream.Graph[akka.stream.SourceShape[U],_]):FlowOps.this.Repr[(Out,U)]).
It is recommended to use the internally optimized `Keep.left` and `Keep.right` combiners
where appropriate instead of manually writing functions that pass through one of the values.
172. [**](../../akka/stream/SourceRef.html#zipLatestWith[Out2,Out3](that:akka.stream.Graph[akka.stream.SourceShape[Out2],_],eagerComplete:Boolean)(combine:(Out,Out2)=>Out3):FlowOps.this.Repr[Out3] "Permalink")  def zipLatestWith\[Out2, Out3](that: [Graph](Graph.html)\[[SourceShape](SourceShape.html)\[Out2], \_], eagerComplete: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean))(combine: (T, Out2) \=\> Out3): [Source](scaladsl/Source.html)\[Out3, [NotUsed](../NotUsed.html)]Combine the elements of multiple streams into a stream of combined elements using a combiner function,
picking always the latest of the elements of each source.

Combine the elements of multiple streams into a stream of combined elements using a combiner function,
picking always the latest of the elements of each source.

No element is emitted until at least one element from each Source becomes available. Whenever a new
element appears, the zipping function is invoked with a tuple containing the new element
and the other last seen elements.

 **Emits when** all of the inputs have at least an element available, and then each time an element becomes
 available on either of the inputs

 **Backpressures when** downstream backpressures

 **Completes when** any upstream completes if `eagerComplete` is enabled or wait for all upstreams to complete

 **Cancels when** downstream cancels

ImplicitThis member is added by an implicit conversion from SourceRef\[T] to[Source](scaladsl/Source.html)\[T, [NotUsed](../NotUsed.html)] performed by method convertRefToSource in [akka.stream.SourceRef](SourceRef$.html).Definition Classes[FlowOps](scaladsl/FlowOps.html)
173. [**](../../akka/stream/SourceRef.html#zipLatestWith[Out2,Out3](that:akka.stream.Graph[akka.stream.SourceShape[Out2],_])(combine:(Out,Out2)=>Out3):FlowOps.this.Repr[Out3] "Permalink")  def zipLatestWith\[Out2, Out3](that: [Graph](Graph.html)\[[SourceShape](SourceShape.html)\[Out2], \_])(combine: (T, Out2) \=\> Out3): [Source](scaladsl/Source.html)\[Out3, [NotUsed](../NotUsed.html)]Combine the elements of multiple streams into a stream of combined elements using a combiner function,
picking always the latest of the elements of each source.

Combine the elements of multiple streams into a stream of combined elements using a combiner function,
picking always the latest of the elements of each source.

No element is emitted until at least one element from each Source becomes available. Whenever a new
element appears, the zipping function is invoked with a tuple containing the new element
and the other last seen elements.

 **Emits when** all of the inputs have at least an element available, and then each time an element becomes
 available on either of the inputs

 **Backpressures when** downstream backpressures

 **Completes when** any of the upstreams completes

 **Cancels when** downstream cancels

ImplicitThis member is added by an implicit conversion from SourceRef\[T] to[Source](scaladsl/Source.html)\[T, [NotUsed](../NotUsed.html)] performed by method convertRefToSource in [akka.stream.SourceRef](SourceRef$.html).Definition Classes[FlowOps](scaladsl/FlowOps.html)
174. [**](../../akka/stream/SourceRef.html#zipLatestWithMat[Out2,Out3,Mat2,Mat3](that:akka.stream.Graph[akka.stream.SourceShape[Out2],Mat2],eagerComplete:Boolean)(combine:(Out,Out2)=>Out3)(matF:(Mat,Mat2)=>Mat3):FlowOpsMat.this.ReprMat[Out3,Mat3] "Permalink")  def zipLatestWithMat\[Out2, Out3, Mat2, Mat3](that: [Graph](Graph.html)\[[SourceShape](SourceShape.html)\[Out2], Mat2], eagerComplete: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean))(combine: (T, Out2) \=\> Out3)(matF: ([NotUsed](../NotUsed.html), Mat2) \=\> Mat3): [Source](scaladsl/Source.html)\[Out3, Mat3]Put together the elements of current flow and the given [Source](scaladsl/Source.html)
into a stream of combined elements using a combiner function, picking always the latest of the elements of each source.

Put together the elements of current flow and the given [Source](scaladsl/Source.html)
into a stream of combined elements using a combiner function, picking always the latest of the elements of each source.

ImplicitThis member is added by an implicit conversion from SourceRef\[T] to[Source](scaladsl/Source.html)\[T, [NotUsed](../NotUsed.html)] performed by method convertRefToSource in [akka.stream.SourceRef](SourceRef$.html).Definition Classes[FlowOpsMat](scaladsl/FlowOpsMat.html)See also[\#zipLatestWith](scaladsl/Source.html#zipLatestWith[Out2,Out3](that:akka.stream.Graph[akka.stream.SourceShape[Out2],_],eagerComplete:Boolean)(combine:(Out,Out2)=>Out3):FlowOps.this.Repr[Out3]).
It is recommended to use the internally optimized `Keep.left` and `Keep.right` combiners
where appropriate instead of manually writing functions that pass through one of the values.
175. [**](../../akka/stream/SourceRef.html#zipLatestWithMat[Out2,Out3,Mat2,Mat3](that:akka.stream.Graph[akka.stream.SourceShape[Out2],Mat2])(combine:(Out,Out2)=>Out3)(matF:(Mat,Mat2)=>Mat3):FlowOpsMat.this.ReprMat[Out3,Mat3] "Permalink")  def zipLatestWithMat\[Out2, Out3, Mat2, Mat3](that: [Graph](Graph.html)\[[SourceShape](SourceShape.html)\[Out2], Mat2])(combine: (T, Out2) \=\> Out3)(matF: ([NotUsed](../NotUsed.html), Mat2) \=\> Mat3): [Source](scaladsl/Source.html)\[Out3, Mat3]Put together the elements of current flow and the given [Source](scaladsl/Source.html)
into a stream of combined elements using a combiner function, picking always the latest of the elements of each source.

Put together the elements of current flow and the given [Source](scaladsl/Source.html)
into a stream of combined elements using a combiner function, picking always the latest of the elements of each source.

ImplicitThis member is added by an implicit conversion from SourceRef\[T] to[Source](scaladsl/Source.html)\[T, [NotUsed](../NotUsed.html)] performed by method convertRefToSource in [akka.stream.SourceRef](SourceRef$.html).Definition Classes[FlowOpsMat](scaladsl/FlowOpsMat.html)See also[\#zipLatestWith](scaladsl/Source.html#zipLatestWith[Out2,Out3](that:akka.stream.Graph[akka.stream.SourceShape[Out2],_],eagerComplete:Boolean)(combine:(Out,Out2)=>Out3):FlowOps.this.Repr[Out3]).
It is recommended to use the internally optimized `Keep.left` and `Keep.right` combiners
where appropriate instead of manually writing functions that pass through one of the values.
176. [**](../../akka/stream/SourceRef.html#zipMat[U,Mat2,Mat3](that:akka.stream.Graph[akka.stream.SourceShape[U],Mat2])(matF:(Mat,Mat2)=>Mat3):FlowOpsMat.this.ReprMat[(Out,U),Mat3] "Permalink")  def zipMat\[U, Mat2, Mat3](that: [Graph](Graph.html)\[[SourceShape](SourceShape.html)\[U], Mat2])(matF: ([NotUsed](../NotUsed.html), Mat2) \=\> Mat3): [Source](scaladsl/Source.html)\[(T, U), Mat3]Combine the elements of current flow and the given [Source](scaladsl/Source.html) into a stream of tuples.

Combine the elements of current flow and the given [Source](scaladsl/Source.html) into a stream of tuples.

ImplicitThis member is added by an implicit conversion from SourceRef\[T] to[Source](scaladsl/Source.html)\[T, [NotUsed](../NotUsed.html)] performed by method convertRefToSource in [akka.stream.SourceRef](SourceRef$.html).Definition Classes[FlowOpsMat](scaladsl/FlowOpsMat.html)See also[\#zip](scaladsl/Source.html#zip[U](that:akka.stream.Graph[akka.stream.SourceShape[U],_]):FlowOps.this.Repr[(Out,U)]).
It is recommended to use the internally optimized `Keep.left` and `Keep.right` combiners
where appropriate instead of manually writing functions that pass through one of the values.
177. [**](../../akka/stream/SourceRef.html#zipWith[Out2,Out3](that:akka.stream.Graph[akka.stream.SourceShape[Out2],_])(combine:(Out,Out2)=>Out3):FlowOps.this.Repr[Out3] "Permalink")  def zipWith\[Out2, Out3](that: [Graph](Graph.html)\[[SourceShape](SourceShape.html)\[Out2], \_])(combine: (T, Out2) \=\> Out3): [Source](scaladsl/Source.html)\[Out3, [NotUsed](../NotUsed.html)]Put together the elements of current flow and the given [Source](scaladsl/Source.html)
into a stream of combined elements using a combiner function.

Put together the elements of current flow and the given [Source](scaladsl/Source.html)
into a stream of combined elements using a combiner function.

**Emits when** all of the inputs have an element available

**Backpressures when** downstream backpressures

**Completes when** any upstream completes

**Cancels when** downstream cancels

ImplicitThis member is added by an implicit conversion from SourceRef\[T] to[Source](scaladsl/Source.html)\[T, [NotUsed](../NotUsed.html)] performed by method convertRefToSource in [akka.stream.SourceRef](SourceRef$.html).Definition Classes[FlowOps](scaladsl/FlowOps.html)
178. [**](../../akka/stream/SourceRef.html#zipWithIndex:FlowOps.this.Repr[(Out,Long)] "Permalink")  def zipWithIndex: [Source](scaladsl/Source.html)\[(T, [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)), [NotUsed](../NotUsed.html)]Combine the elements of current flow into a stream of tuples consisting
of all elements paired with their index.

Combine the elements of current flow into a stream of tuples consisting
of all elements paired with their index. Indices start at 0\.

**Emits when** upstream emits an element and is paired with their index

**Backpressures when** downstream backpressures

**Completes when** upstream completes

**Cancels when** downstream cancels

ImplicitThis member is added by an implicit conversion from SourceRef\[T] to[Source](scaladsl/Source.html)\[T, [NotUsed](../NotUsed.html)] performed by method convertRefToSource in [akka.stream.SourceRef](SourceRef$.html).Definition Classes[FlowOps](scaladsl/FlowOps.html)
179. [**](../../akka/stream/SourceRef.html#zipWithMat[Out2,Out3,Mat2,Mat3](that:akka.stream.Graph[akka.stream.SourceShape[Out2],Mat2])(combine:(Out,Out2)=>Out3)(matF:(Mat,Mat2)=>Mat3):FlowOpsMat.this.ReprMat[Out3,Mat3] "Permalink")  def zipWithMat\[Out2, Out3, Mat2, Mat3](that: [Graph](Graph.html)\[[SourceShape](SourceShape.html)\[Out2], Mat2])(combine: (T, Out2) \=\> Out3)(matF: ([NotUsed](../NotUsed.html), Mat2) \=\> Mat3): [Source](scaladsl/Source.html)\[Out3, Mat3]Put together the elements of current flow and the given [Source](scaladsl/Source.html)
into a stream of combined elements using a combiner function.

Put together the elements of current flow and the given [Source](scaladsl/Source.html)
into a stream of combined elements using a combiner function.

ImplicitThis member is added by an implicit conversion from SourceRef\[T] to[Source](scaladsl/Source.html)\[T, [NotUsed](../NotUsed.html)] performed by method convertRefToSource in [akka.stream.SourceRef](SourceRef$.html).Definition Classes[FlowOpsMat](scaladsl/FlowOpsMat.html)See also[\#zipWith](scaladsl/Source.html#zipWith[Out2,Out3](that:akka.stream.Graph[akka.stream.SourceShape[Out2],_])(combine:(Out,Out2)=>Out3):FlowOps.this.Repr[Out3]).
It is recommended to use the internally optimized `Keep.left` and `Keep.right` combiners
where appropriate instead of manually writing functions that pass through one of the values.
### Shadowed Implicit Value Members

1. [**](../../akka/stream/SourceRef.html#toString():String "Permalink")  def toString(): StringImplicitThis member is added by an implicit conversion from SourceRef\[T] to[Source](scaladsl/Source.html)\[T, [NotUsed](../NotUsed.html)] performed by method convertRefToSource in [akka.stream.SourceRef](SourceRef$.html).ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(sourceRef: Source[T, NotUsed]).toString()
```
Definition Classes[Source](scaladsl/Source.html) → AnyRef → Any
### Deprecated Value Members

1. [**](../../akka/stream/SourceRef.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../akka/stream/SourceRef.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from SourceRef\[T] toStringFormat\[SourceRef\[T]] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../akka/stream/SourceRef.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (SourceRef\[T], B)ImplicitThis member is added by an implicit conversion from SourceRef\[T] toArrowAssoc\[SourceRef\[T]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion convertRefToSource fromSourceRef\[T] to [Source](scaladsl/Source.html)\[T, [NotUsed](../NotUsed.html)]

### Inherited by implicit conversion any2stringadd fromSourceRef\[T] to any2stringadd\[SourceRef\[T]]

### Inherited by implicit conversion StringFormat fromSourceRef\[T] to StringFormat\[SourceRef\[T]]

### Inherited by implicit conversion Ensuring fromSourceRef\[T] to Ensuring\[SourceRef\[T]]

### Inherited by implicit conversion ArrowAssoc fromSourceRef\[T] to ArrowAssoc\[SourceRef\[T]]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/Done.html
- https://doc.akka.io/api/akka/current/akka/NotUsed.html
- https://doc.akka.io/api/akka/current/akka/actor/Actor.html
- https://doc.akka.io/api/akka/current/akka/actor/ActorRef.html
- https://doc.akka.io/api/akka/current/akka/annotation/ApiMayChange.html
- https://doc.akka.io/api/akka/current/akka/annotation/DoNotInherit.html
- https://doc.akka.io/api/akka/current/akka/event/LogMarker.html
- https://doc.akka.io/api/akka/current/akka/event/LoggingAdapter.html
- https://doc.akka.io/api/akka/current/akka/event/MarkerLoggingAdapter.html
- https://doc.akka.io/api/akka/current/akka/index.html
- https://doc.akka.io/api/akka/current/akka/pattern/AskTimeoutException.html
- https://doc.akka.io/api/akka/current/akka/stream/AbruptIOTerminationException.html
- https://doc.akka.io/api/akka/current/akka/stream/AbruptStageTerminationException.html
- https://doc.akka.io/api/akka/current/akka/stream/AbruptStreamTerminationException.html
- https://doc.akka.io/api/akka/current/akka/stream/AbruptTerminationException.html
- https://doc.akka.io/api/akka/current/akka/stream/AbstractShape.html
- https://doc.akka.io/api/akka/current/akka/stream/ActorAttributes$$SupervisionStrategy.html
- https://doc.akka.io/api/akka/current/akka/stream/ActorAttributes$.html
- https://doc.akka.io/api/akka/current/akka/stream/ActorMaterializer$.html
- https://doc.akka.io/api/akka/current/akka/stream/ActorMaterializer.html
- https://doc.akka.io/api/akka/current/akka/stream/ActorMaterializerSettings$.html
- https://doc.akka.io/api/akka/current/akka/stream/ActorMaterializerSettings.html
- https://doc.akka.io/api/akka/current/akka/stream/AmorphousShape.html
- https://doc.akka.io/api/akka/current/akka/stream/Attributes$$LogLevels.html
- https://doc.akka.io/api/akka/current/akka/stream/Attributes$$NestedMaterializationCancellationPolicy.html
- https://doc.akka.io/api/akka/current/akka/stream/Attributes$.html
- https://doc.akka.io/api/akka/current/akka/stream/Attributes.html
- https://doc.akka.io/api/akka/current/akka/stream/BackpressureTimeoutException.html
- https://doc.akka.io/api/akka/current/akka/stream/BidiShape$.html
- https://doc.akka.io/api/akka/current/akka/stream/BidiShape.html
- https://doc.akka.io/api/akka/current/akka/stream/BindFailedException$.html
- https://doc.akka.io/api/akka/current/akka/stream/BindFailedException.html
- https://doc.akka.io/api/akka/current/akka/stream/BoundedSourceQueue.html
- https://doc.akka.io/api/akka/current/akka/stream/BufferOverflowException.html
- https://doc.akka.io/api/akka/current/akka/stream/Client$.html
- https://doc.akka.io/api/akka/current/akka/stream/Client.html
- https://doc.akka.io/api/akka/current/akka/stream/ClosedShape$.html
- https://doc.akka.io/api/akka/current/akka/stream/ClosedShape.html
- https://doc.akka.io/api/akka/current/akka/stream/CompletionStrategy$.html
- https://doc.akka.io/api/akka/current/akka/stream/CompletionStrategy.html
- https://doc.akka.io/api/akka/current/akka/stream/CompletionTimeoutException.html
- https://doc.akka.io/api/akka/current/akka/stream/ConnectionException.html
- https://doc.akka.io/api/akka/current/akka/stream/DelayOverflowStrategy$.html
- https://doc.akka.io/api/akka/current/akka/stream/DelayOverflowStrategy.html
- https://doc.akka.io/api/akka/current/akka/stream/EagerClose$.html
- https://doc.akka.io/api/akka/current/akka/stream/EagerClose.html
- https://doc.akka.io/api/akka/current/akka/stream/FanInShape$.html
- https://doc.akka.io/api/akka/current/akka/stream/FanInShape.html
- https://doc.akka.io/api/akka/current/akka/stream/FanInShape10.html
- https://doc.akka.io/api/akka/current/akka/stream/FanInShape11.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/stream/SourceRef.html](https://doc.akka.io/api/akka/current/akka/stream/SourceRef.html)*