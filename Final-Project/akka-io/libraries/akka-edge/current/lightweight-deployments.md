---
description: Akka Projection.
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:30:07Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-edge/current/lightweight-deployments.html
title: Lightweight deployments • Akka Edge
---

# Lightweight deployments • Akka Edge

> **Summary:** Akka Projection.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Lightweight deployments

Deployments at the edge of the cloud may need to minimize resource usage and be capable of running in resource\-constrained environments. Akka Edge applications can be configured and built to run with low resource usage and adapt to changing resource needs.

Some approaches to running lightweight deployments for Akka Edge applications include:

- [Using lightweight Kubernetes distributions](lightweight-deployments.html#lightweight-kubernetes)
- [Using cloud\-optimized JVMs](lightweight-deployments.html#cloud-optimized-jvms)
- [Building GraalVM Native Image executables](lightweight-deployments.html#graalvm-native-image)
- [Configuring adaptive resource usage with multidimensional autoscaling](lightweight-deployments.html#multidimensional-autoscaling)

These approaches are useful when running applications in edge environments that are on\-premise or in 5G edge computing infrastructure, including cloud provider products such as [AWS Wavelength](https://aws.amazon.com/wavelength/), [AWS Outposts](https://aws.amazon.com/outposts/), [Google Distributed Cloud Edge](https://cloud.google.com/distributed-cloud-edge), or [Azure Stack Edge](https://azure.microsoft.com/en-us/products/azure-stack/edge/).

## Lightweight Kubernetes

Kubernetes has become the standard orchestration tool for deploying containers and there are lightweight Kubernetes distributions that are specifically designed for edge computing environments. [K3s](https://k3s.io) and [MicroK8s](https://microk8s.io) are lightweight Kubernetes distributions that are suitable for deploying containerized Akka Edge applications.

## Cloud\-optimized JVMs

The Java Virtual Machine (JVM) can be configured to run with lower resource usage. OpenJDK’s [Project Leyden](https://openjdk.org/projects/leyden/) is not released yet, but is looking to improve the startup time, time to peak performance, and the footprint of Java programs.

### OpenJ9

[OpenJ9](https://eclipse.dev/openj9/) is a JVM that is optimized for running in cloud environments and configured for lower resource usage. Options include [tuning for virtualized environments](https://eclipse.dev/openj9/docs/xtunevirtualized/), [class data sharing](https://eclipse.dev/openj9/docs/shrc/), and [ahead\-of\-time (AOT) compilation](https://eclipse.dev/openj9/docs/aot/) for faster starts and warmup.

## GraalVM Native Image

[GraalVM Native Image](https://www.graalvm.org/latest/reference-manual/native-image/) compiles Java or Scala code ahead\-of\-time to a native executable. A native image executable provides lower resource usage compared with the JVM, smaller deployments, faster starts, and immediate peak performance — making it ideal for Akka Edge deployments in resource\-constrained environments and for responsiveness under autoscaling.

Native Image builds can be integrated into your application using build tool plugins:

- [Maven plugin for GraalVM Native Image](https://graalvm.github.io/native-build-tools/latest/maven-plugin.html)
- [Gradle plugin for GraalVM Native Image](https://graalvm.github.io/native-build-tools/latest/gradle-plugin.html)
- [sbt plugin for GraalVM Native Image](https://github.com/scalameta/sbt-native-image)

Native Image builds need to be configured in various ways. See the build tool plugins and the [Native Image build configuration](https://www.graalvm.org/latest/reference-manual/native-image/overview/BuildConfiguration/) reference documentation for more information on how to do this. 

An important part of the configuration is the *reachability metadata*, which covers dynamic features used at runtime and which can’t be discovered statically at build time. Akka provides Native Image metadata for many of the modules, and can detect and register user messages when using Akka Serialization Jackson, so a client application may not need to define any additional reachability metadata.

For more details on what support Akka provides see the [Akka documentation on Native Image](https://doc.akka.io/libraries/akka-core/2.10/additional/native-image.html).

### GraalVM tracing agent

If an application uses special features or libraries not supported out of the box with Akka it is possible to automatically gather metadata and create configuration files using the GraalVM [tracing agent](https://www.graalvm.org/latest/reference-manual/native-image/metadata/AutomaticMetadataCollection/). The tracing agent tracks usage of dynamic features during regular running of the application in a JVM, and outputs Native Image configuration based on the code paths that were exercised. The build tool plugins for Native Image provide ways to run locally with the tracing agent enabled. It can also be useful to deploy your application to a testing environment with the GraalVM tracing agent enabled, to capture usage in an actual deployment environment and exercising all the Akka Edge features that are being used.

Note
The GraalVM Native Image tracing agent can only generate configuration for code paths that were observed during the running of an application. When using this approach for generating configuration, make sure that tests exercise all possible code paths. In particular, check dynamic serialization of classes used for persistence or cross\-node communication.

### GraalVM Native Image build examples

The Local Drone Control service from the [Akka Edge guide](guide.html) has been configured for GraalVM Native Image as an example:

- [Native Image build for Local Drone Control service in Java](https://github.com/akka/akka-projection/blob/main/samples/grpc/local-drone-control-java/native-image/README.md)
- [Native Image build for Local Drone Control service in Scala](https://github.com/akka/akka-projection/blob/main/samples/grpc/local-drone-control-scala/native-image/README.md)

## Multidimensional autoscaling

An application using Akka Edge features, such as event sourcing and projections over gRPC, cannot scale to zero when idle. It’s possible, however, for the application to be scaled to and from “near zero” — scaling down to a state of minimal resource usage when idle, scaling up and out when load is increased. Multidimensional autoscaling is scaling both vertically (lower or higher resource allocation) and horizontally (fewer or more instances) and can be used to align resource usage with the actual demand given dynamic workloads.

In Kubernetes, the [horizontal pod autoscaler (HPA)](https://kubernetes.io/docs/tasks/run-application/horizontal-pod-autoscale/) and the [vertical pod autoscaler (VPA)](https://github.com/kubernetes/autoscaler/tree/master/vertical-pod-autoscaler) can be combined, so that when the service is idle it is both *scaled down* with minimal resource requests, and *scaled in* to a minimal number of pods.

A multidimensional autoscaling configuration for an Akka Edge application in Kubernetes can be set up with:

- Custom VPA recommender for vertical autoscaling configured to respond quickly, to “activate” the application. The default vertical pod autoscaler bases its recommendations for resource requests over long time frames (over days). A custom VPA recommender is needed to go from minimal resource allocation to higher requests more quickly.
- HPA configured to horizontally autoscale based on [custom metrics](https://kubernetes.io/docs/tasks/run-application/horizontal-pod-autoscale/#scaling-on-custom-metrics) — such as the number of active event sourced entities in an Akka Cluster. Custom metrics need to be exposed by the application and configured for the Kubernetes custom metrics API with an “adapter”, such as the [Prometheus adapter](https://github.com/kubernetes-sigs/prometheus-adapter).
- Application availability ensured by having a minimum of 2 replicas, and configuring a [pod disruption budget (PDB)](https://kubernetes.io/docs/tasks/run-application/configure-pdb/) so that no more than one pod is unavailable at a time. When the vertical autoscaler makes changes, pods are evicted and restarted with updated resource requests. In\-place changes are not currently supported by Kubernetes.

Note
The Kubernetes horizontal and vertical pod autoscalers should not be triggered using the same metrics. As the default vertical autoscaler is currently designed for resource metrics (CPU and memory), the horizontal autoscaler should be configured to use custom metrics.

### Multidimensional autoscaling examples

The Local Drone Control service from the [Akka Edge guide](guide.html) has been configured for multidimensional autoscaling. The example uses GraalVM Native Image builds for low resource usage, combines the vertical and horizontal pod autoscalers, and runs in k3s (lightweight Kubernetes).

- [Multidimensional autoscaling example for Local Drone Control service in Java](https://github.com/akka/akka-projection/blob/main/samples/grpc/local-drone-control-java/autoscaling/README.md)
- [Multidimensional autoscaling example for Local Drone Control service in Scala](https://github.com/akka/akka-projection/blob/main/samples/grpc/local-drone-control-scala/autoscaling/README.md)

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/libraries/akka-core/2.10/additional/native-image.html
- https://doc.akka.io/libraries/akka-edge/current/guide-rs/8-main.html
- https://doc.akka.io/libraries/akka-edge/current/guide.html
- https://doc.akka.io/libraries/akka-edge/current/lightweight-deployments.html

---
*Source: [https://doc.akka.io/libraries/akka-edge/current/lightweight-deployments.html](https://doc.akka.io/libraries/akka-edge/current/lightweight-deployments.html)*