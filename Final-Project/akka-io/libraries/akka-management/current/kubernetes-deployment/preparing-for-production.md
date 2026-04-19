---
description: Akka Management is a suite of tools for operating Akka Clusters.
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:28:08Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-management/current/kubernetes-deployment/preparing-for-production.html
title: Preparing for production • Akka Management
---

# Preparing for production • Akka Management

> **Summary:** Akka Management is a suite of tools for operating Akka Clusters.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Preparing for production

In preparation for production, we need to do two main things:

1. Write a Kubernetes deployment spec
2. Configure our Akka cluster application

The final configuration file and deployment spec are in the sample application. In this guide we will show snippets. Locations of the samples:

- [Java](../attachments/akka-sample-cluster-kubernetes-java.zip)
- [Scala](../attachments/akka-sample-cluster-kubernetes-scala.zip)

## Deployment Spec

Create a deployment spec in `kubernetes/akka-cluster.yaml`. The following configuration uses:

- Application name / Actor system name: `appka`
- Namespace: `appka-1`

Change these for your application.

```
apiVersion: apps/v1
kind: Deployment
metadata:
  labels:
    app: appka
  name: appka
  namespace: appka-1
spec:
  replicas: 2
  selector:
    matchLabels:
      app: appka
  template:
    metadata:
      labels:
        app: appka
    spec:
      containers:
      - name: appka
        image: akka-sample-cluster-kubernetes-scala:latest
        readinessProbe:
          httpGet:
            path: /ready
            port: management
        livenessProbe:
          httpGet:
            path: /alive
            port: management
        ports:
        - name: management
          containerPort: 8558
          protocol: TCP
        - name: http
          containerPort: 8080
          protocol: TCP
        resources:
          limits:
            memory: 1024Mi
          requests:
            cpu: 2
            memory: 1024Mi

```

Here are a few things to note:

- We’re using a Kubernetes deployment. Deployments are logical groupings of pods that represent a single service using the same template. They support configurable rolling updates, meaning the cluster will be gradually upgraded, rather than upgrading every node at once and incurring an outage. Be sure to consult [Kubernetes Rolling Updates](../rolling-updates.html#kubernetes-rolling-updates) for recommendations.
- We label the pod in the `template` with `app: appka`. This must match the ActorSystem name so that [Akka Bootstrap](../bootstrap/index.html) finds the other nodes in the cluster.
- The image we’re using is `akka-sample-cluster-kubernetes:latest`. This corresponds to the name and version of the service in our build. We will discuss how to select an appropriate version number below.
- We’ve only requested minimal CPU to the pods for this service. This is suitable for a local deployment, but you may wish to increase it if you’re deploying to a real deployment. Note that we also haven’t set a CPU limit, this is because it’s [recommended that JVMs do not set a CPU limit](https://doc.akka.io/libraries/akka-core/current/additional/deploying.html#resource-limits).
- We’ve configured a liveness probe and readiness probe. These are provided out of the box by Akka Management and are discussed later.

## Image version number

We use a version tag of `latest` for the image. Not specifying a tag is the same as using the `latest` tag. We could have just specify `akka-sample-cluster-kubernetes`, and this would mean the same thing as `akka-sample-cluster-kubernetes:latest`.

For production, the use of the `latest` tag is bad practice. For development, it’s convenient and usually fine. We recommend if you’re deploying to production, that you replace this with an actual version number that is updated each time you deploy. In the [Building your application](building.html) section of this guide we will describe how to configure your build to base its version number off the current git commit hash, which is great especially for continuous deployment scenarios as it means a human doesn’t need to be involved in selecting a unique version number. After building the image, you can take the version number generated in that step and update the image referenced in the spec accordingly.

## Code Examples

### Example 1: Deployment Spec

```yaml
apiVersion: apps/v1
kind: Deployment
metadata:
  labels:
    app: appka
  name: appka
  namespace: appka-1
spec:
  replicas: 2
  selector:
    matchLabels:
      app: appka
  template:
    metadata:
      labels:
        app: appka
    spec:
      containers:
      - name: appka
        image: akka-sample-cluster-kubernetes-scala:latest
        readinessProbe:
          httpGet:
            path: /ready
            port: management
        livenessProbe:
          httpGet:
            path: /alive
            port: management
        ports:
        - name: management
          containerPort: 8558
          protocol: TCP
        - name: http
          containerPort: 8080
          protocol: TCP
        resources:
          limits:
            memory: 1024Mi
          requests:
            cpu: 2
            memory: 1024Mi
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/libraries/akka-core/current/additional/deploying.html
- https://doc.akka.io/libraries/akka-management/current/attachments/akka-sample-cluster-kubernetes-java.zip
- https://doc.akka.io/libraries/akka-management/current/attachments/akka-sample-cluster-kubernetes-scala.zip
- https://doc.akka.io/libraries/akka-management/current/bootstrap/index.html
- https://doc.akka.io/libraries/akka-management/current/kubernetes-deployment/building.html
- https://doc.akka.io/libraries/akka-management/current/kubernetes-deployment/forming-a-cluster.html
- https://doc.akka.io/libraries/akka-management/current/kubernetes-deployment/index.html
- https://doc.akka.io/libraries/akka-management/current/rolling-updates.html

---
*Source: [https://doc.akka.io/libraries/akka-management/current/kubernetes-deployment/preparing-for-production.html](https://doc.akka.io/libraries/akka-management/current/kubernetes-deployment/preparing-for-production.html)*