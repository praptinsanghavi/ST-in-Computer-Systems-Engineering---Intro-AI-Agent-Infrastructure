---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:25:56Z'
section: operations
site: akka-io
source_url: https://doc.akka.io/operations/projects/create-project.html
title: 'Create a new project :: Akka Documentation'
---

# Create a new project :: Akka Documentation

## Content

# Create a new project

When creating a new project in Akka, you’ll need to provide a **name**, an optional **description**, and select a **region**. The region determines both the cloud provider and geographical location where your project will be hosted.

## Project names

- Use a short but meaningful name that reflects the purpose of the project.
- Keep descriptions short and clear to help collaborators understand the project’s context.

Project Naming Requirements:

- Maximum 63 characters
- Can include: lowercase letters, numbers, hyphens (`-`)
- Must not: start or end with hyphens
- Cannot include: underscores, spaces, or non\-alphanumeric characters

## Selecting a region

Regions define the cloud provider and geographical location where your project will be deployed. Consider proximity to your users for lower latency and any compliance or performance requirements when selecting a region.

## How to create a new project

To create a new project, use either the Akka CLI or the [Akka Console](https://console.akka.io):

CLI

1. If you haven’t done so yet, [install the Akka CLI](../cli/installation.html) and log into your account:

```
akka auth login
```
2. To list available regions and organizations, use the following command:

```
akka regions list --organization=<org>
```
3. Create a project by substituting your project name and placing a short project description name in quotes, followed by the `region` flag and the `organization` flag.

```
akka projects new <project name> "<project description>" --region=<region> --organization=<org>
```

For example:

```
akka projects new my-akka-project "My Akka Project" --region=gcp-us-east1 --organization=my-organization
```

Example output:

```
NAME              DESCRIPTION   ID                                     OWNER                                       REGION
my-akka-project   "My ..        xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx   id:"xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx"   gcp-us-east1

'my-akka-project' is now the currently active project.
```

UI

1. Log in to [Akka Console](https://console.akka.io)
2. Navigate to the [Projects](https://console.akka.io/projects) section.
3. Click **Create a project** and fill in the required fields, including name, description, region, and organization.

![Create a project](../_images/console-create-project.png)
4. Review and click **Create Project** to finalize your project.

The new project will show as a card in the **Project** section.

You may now continue and [deploy a Service](../services/deploy-service.html) in the new Project.

## See also

- [Deploy and manage services](../services/deploy-service.html)
- [`akka projects new` commands](../../reference/cli/akka-cli/akka_projects_new.html#_see_also)
- [`akka projects get` commands](../../reference/cli/akka-cli/akka_projects_get.html#_see_also)

## Code Examples

### Example 1: How to create a new project

```command
akka auth login
```

### Example 2: How to create a new project

```command
akka regions list --organization=<org>
```

### Example 3: How to create a new project

```command
akka projects new <project name> "<project description>" --region=<region> --organization=<org>
```

### Example 4: How to create a new project

```command
akka projects new my-akka-project "My Akka Project" --region=gcp-us-east1 --organization=my-organization
```

### Example 5: How to create a new project

```none
NAME              DESCRIPTION   ID                                     OWNER                                       REGION
my-akka-project   "My ..        xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx   id:"xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx"   gcp-us-east1

'my-akka-project' is now the currently active project.
```

## Related Pages (Internal Links)

- https://doc.akka.io/operations/cli/installation.html
- https://doc.akka.io/operations/services/deploy-service.html
- https://doc.akka.io/reference/cli/akka-cli/akka_projects_get.html
- https://doc.akka.io/reference/cli/akka-cli/akka_projects_new.html

---
*Source: [https://doc.akka.io/operations/projects/create-project.html](https://doc.akka.io/operations/projects/create-project.html)*