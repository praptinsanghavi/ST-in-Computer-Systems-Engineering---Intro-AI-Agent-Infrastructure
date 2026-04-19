---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:26:42Z'
section: operations
site: akka-io
source_url: https://doc.akka.io/operations/organizations/index.html
title: 'Organizations :: Akka Documentation'
---

# Organizations :: Akka Documentation

## Content

# Organizations

An *Organization* in Akka is the root of the management hierarchy and serves as a container for all *Projects* where *Services* are deployed. It provides the context in which users operate, both in the *Akka Console* and *Akka CLI*.

To switch between organizations, you must specify the target organization’s context.

## Key Concepts

- [**User Membership**](manage-users.html): A user can belong to multiple organizations, but membership does not automatically grant access to the organization’s projects.
- [**Regions**](regions.html): Each organization has access to specific regions. Projects created within the organization are located in one or more of these regions.
- [**Billing**](billing.html): Billing is handled at the organization level, with all costs collected and paid per organization.
- [**Role\-Based Access**](../projects/manage-project-access.html): Membership and project access within an organization are managed through role bindings.

## Details

- **Organization Administrator**: The first user of an organization is an Organization Administrator, who can invite or add users with different roles.
- **Project Ownership**: Each project is owned by a single organization. Users must ensure that their projects are associated with the correct organization.
- **Region Assignment**: Projects created for an organization are assigned to one or more of the organization’s available regions.

## Usage

You can determine which organizations the current user is a member of using the following command:

```
akka organizations list
```

Example output:

```
NAME        ID                                     ROLES
acme        1a4a9d5d-1234-5678-910a-9c8fb3700da7   superuser
```

|  | You can refer to the organization in `akka` commands using either the "friendly name" or the "ID" with the `--organization` flag. See the page on [managing organization users](manage-users.html) to find more, including the use of organization roles. |
| --- | --- |

## Topics

- [Managing organization users](manage-users.html)
- [Regions](regions.html)
- [Billing](billing.html)

## Code Examples

### Example 1: Usage

```command
akka organizations list
```

### Example 2: Usage

```none
NAME        ID                                     ROLES
acme        1a4a9d5d-1234-5678-910a-9c8fb3700da7   superuser
```

## Related Pages (Internal Links)

- https://doc.akka.io/operations/organizations/billing.html
- https://doc.akka.io/operations/organizations/manage-users.html
- https://doc.akka.io/operations/organizations/regions.html
- https://doc.akka.io/operations/projects/manage-project-access.html

---
*Source: [https://doc.akka.io/operations/organizations/index.html](https://doc.akka.io/operations/organizations/index.html)*