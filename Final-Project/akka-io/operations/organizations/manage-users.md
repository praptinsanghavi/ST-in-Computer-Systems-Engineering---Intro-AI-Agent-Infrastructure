---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:28:12Z'
section: operations
site: akka-io
source_url: https://doc.akka.io/operations/organizations/manage-users.html
title: 'Managing organization users :: Akka Documentation'
---

# Managing organization users :: Akka Documentation

## Content

# Managing organization users

Access to an organization is controlled by assigning roles to users. The available roles are: **superuser**, **project\-admin**, **billing\-admin**, and **member**.

|  | Akka supports access management via Single Sign\-on (SSO) through the *OpenID Connect* standard. For details, check [OpenID Connect Setup](../../reference/security/oidc-setup.html). |
| --- | --- |

| Permission | superuser | project\-admin | billing\-admin | member |
| --- | --- | --- | --- | --- |
| View organization users | ✅ | ✅ | ✅ | ✅ |
| Manage organization users | ✅ | ❌ | ❌ | ❌ |
| Create projects | ✅ | ✅ | ❌ | ❌ |
| Assign regions to projects | ✅ | ✅ | ❌ | ❌ |
| View all projects | ✅ | ❌ | ❌ | ❌ |
| Manage project users | ✅ | ❌ | ❌ | ❌ |
| Delete projects | ✅ | ❌ | ❌ | ❌ |
| All other project/service operations | ❌ | ❌ | ❌ | ❌ |
| View organization billing data | ❌ | ❌ | ✅ | ❌ |

|  | Project\-level operations are accessed via project\-specific roles. A superuser has a subset of project permissions, including the ability to assign roles (including to themselves). When a user creates a project, they are automatically granted admin access to it. (see [granting project roles](../projects/manage-project-access.html)) |
| --- | --- |

The **member** role allows project admins to add users to their projects without needing to invite them to the organization.

## Listing role bindings

You can list role bindings within an organization using the following command:

```
akka organization users list-bindings --organization <organization name>
```

Example output:

```
ROLE BINDING ID                        ROLE        USERNAME       EMAIL                      NAME
fd21044c-b973-4220-8f65-0f7d317bb23b   superuser   jane.citizen   [[email protected]](/cdn-cgi/l/email-protection)   Jane Citizen
120b75b6-6b53-4ebb-b23b-2272be974966   member      john.smith     [[email protected]](/cdn-cgi/l/email-protection)     John Smith
```

## Granting a role

|  | When using *OpenID Connect* (OIDC), see [OIDC setup](../../reference/security/oidc-setup.html#assigning_organization_level_roles). |
| --- | --- |

You can grant a role to a user in two ways:

### 1\. Invite a User by Email

Send an email invitation with the following command:

```
akka organizations invitations create --organization <organization name> \
  --email <email address> --role <role>
```

The user will receive an email to join the organization. Once accepted, the role binding will be created.

### 2\. Add a Role Directly

If the user is already a member, you can assign roles directly:

- By e\-mail:

```
akka organization users add-binding --organization <organization name> \
  --email <email address> --role <role>
```

- By username:

```
akka organizations users add-binding --organization <organization name> \
  --username <username> --role <role>
```

## Deleting a role binding

To delete a role binding, first list the users to get the role binding ID. Then, use the following command:

```
akka organizations users delete-binding --organization <organization name> \
  --id <role binding id>
```

## Managing invitations

View outstanding invitations:

```
akka organizations invitations list --organization <organization name>
```

Example output:

```
EMAIL                      ROLE
[[email protected]](/cdn-cgi/l/email-protection)   member
```

Invitations expire after 7 days, but you can cancel them manually:

```
akka organizations invitations cancel --organization <organization name> \
  --email <email address>
```

To resend an invitation, cancel the previous one and reissue the invite.

## See also

- [Managing project users](../projects/manage-project-access.html)
- [OpenID Connect Setup](../../reference/security/oidc-setup.html)
- [`akka organizations users` commands](../../reference/cli/akka-cli/akka_organizations_users.html#_see_also)
- [`akka organizations invitations` commands](../../reference/cli/akka-cli/akka_organizations_invitations.html#_see_also)

## Code Examples

### Example 1: Listing role bindings

```command
akka organization users list-bindings --organization <organization name>
```

### Example 2: Listing role bindings

```none
ROLE BINDING ID                        ROLE        USERNAME       EMAIL                      NAME
fd21044c-b973-4220-8f65-0f7d317bb23b   superuser   jane.citizen   [email protected]   Jane Citizen
120b75b6-6b53-4ebb-b23b-2272be974966   member      john.smith     [email protected]     John Smith
```

### Example 3: 1. Invite a User by Email

```command
akka organizations invitations create --organization <organization name> \
  --email <email address> --role <role>
```

### Example 4: Deleting a role binding

```command
akka organizations users delete-binding --organization <organization name> \
  --id <role binding id>
```

### Example 5: Managing invitations

```command
akka organizations invitations list --organization <organization name>
```

### Example 6: Managing invitations

```none
EMAIL                      ROLE
[email protected]   member
```

### Example 7: Managing invitations

```command
akka organizations invitations cancel --organization <organization name> \
  --email <email address>
```

## Related Pages (Internal Links)

- https://doc.akka.io/cdn-cgi/l/email-protection
- https://doc.akka.io/operations/projects/manage-project-access.html
- https://doc.akka.io/reference/cli/akka-cli/akka_organizations_invitations.html
- https://doc.akka.io/reference/cli/akka-cli/akka_organizations_users.html
- https://doc.akka.io/reference/security/oidc-setup.html

---
*Source: [https://doc.akka.io/operations/organizations/manage-users.html](https://doc.akka.io/operations/organizations/manage-users.html)*