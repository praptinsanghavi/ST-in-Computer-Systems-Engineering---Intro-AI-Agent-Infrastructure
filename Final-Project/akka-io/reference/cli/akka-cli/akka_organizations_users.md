---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:19:57Z'
section: reference
site: akka-io
source_url: https://doc.akka.io/reference/cli/akka-cli/akka_organizations_users.html
title: 'akka organizations users :: Akka Documentation'
---

# akka organizations users :: Akka Documentation

## Content

# akka organizations users

Manage organization users.

## Synopsis

The `akka organizations users` commands manage organization users.

## Options

```
  -h, --help   help for users
```

## Options inherited from parent commands

```
      --cache-file string   location of cache file (default "~/.akka/cache.yaml")
      --config string       location of config file (default "~/.akka/config.yaml")
      --context string      configuration context to use
      --disable-prompt      Disable all interactive prompts when running akka commands. If input is required, defaults will be used, or an error will be raised.
                            This is equivalent to setting the environment variable AKKA_DISABLE_PROMPTS to true.
  -o, --output string       set output format to one of [text,json,json-compact,go-template=] (default "text")
      --page-mode string    the mode for paging, either paged, buffered or auto. (default "auto")
  -q, --quiet               set quiet output (helpful when used as part of a script)
      --timeout duration    client command timeout (default 10s)
      --use-grpc-web        use grpc-web when talking to Akka APIs. This is useful when behind corporate firewalls that decrypt traffic but don't support HTTP/2.
  -v, --verbose             set verbose output
```

## SEE ALSO

- [akka organizations](akka_organizations.html) \- Manage your organizations on Akka
- [akka organizations users add\-binding](akka_organizations_users_add-binding.html) \- Add a role binding
- [akka organizations users delete\-binding](akka_organizations_users_delete-binding.html) \- Delete a role binding
- [akka organizations users list\-bindings](akka_organizations_users_list-bindings.html) \- List all users in the organization.
To view users with pending invitations run `akka org invitations list`

## Related Pages (Internal Links)

- https://doc.akka.io/reference/cli/akka-cli/akka_organizations.html
- https://doc.akka.io/reference/cli/akka-cli/akka_organizations_users_add-binding.html
- https://doc.akka.io/reference/cli/akka-cli/akka_organizations_users_delete-binding.html
- https://doc.akka.io/reference/cli/akka-cli/akka_organizations_users_list-bindings.html

---
*Source: [https://doc.akka.io/reference/cli/akka-cli/akka_organizations_users.html](https://doc.akka.io/reference/cli/akka-cli/akka_organizations_users.html)*