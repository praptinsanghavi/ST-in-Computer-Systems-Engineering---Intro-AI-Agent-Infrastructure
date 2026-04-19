---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:19:40Z'
section: operations
site: akka-io
source_url: https://doc.akka.io/operations/cli/command-completion.html
title: 'Enable CLI command completion :: Akka Documentation'
---

# Enable CLI command completion :: Akka Documentation

## Content

# Enable CLI command completion

Completion allows you to hit \[TAB] on a partially entered `akka` command and have the shell complete the command, subcommand or flag for you.

bash

To load completion in the current bash shell run:

```
source <(akka completion)
```

Configure bash to load `akka` completions for each session by adding the following line to your `~/.bashrc` or `~/.profile` file:

```
# add to ~/.bashrc or ~/.profile
source <(akka completion)
```

|  | Using bash completions with `akka` requires you have bash completions enabled to begin with. Enable it in your `~/.bashrc` or `~/.profile` file with the following lines:     ``` if [ -f /etc/bash_completion ]; then   source /etc/bash_completion fi ```     For definitive details on setting up your shell with auto\-completion, see the shell documentation. |
| --- | --- |

zsh (e.g. macOS)

To set up `zsh` shell completion run:

```
akka completion zsh > "${fpath[1]}/_akka"
compinit
```

|  | If shell completion is not already enabled in your environment execute the following:     ``` echo "autoload -U compinit; compinit" >> ~/.zshrc ``` |
| --- | --- |

fish

To set up fish shell completion run:

```
akka completion fish > ~/.config/fish/completions/akka.fish
source ~/.config/fish/completions/akka.fish
```

PowerShell

To set up shell completion for PowerShell run:

```
akka completion powershell | Out-String | Invoke-Expression
```

## Related documentation

- [CLI command reference](../../reference/cli/akka-cli/index.html)

## Code Examples

### Example 1: Enable CLI command completion

```bash
source <(akka completion)
```

### Example 2: Enable CLI command completion

```bash
# add to ~/.bashrc or ~/.profile
source <(akka completion)
```

### Example 3: Enable CLI command completion

```bash
if [ -f /etc/bash_completion ]; then
  source /etc/bash_completion
fi
```

### Example 4: Enable CLI command completion

```zsh
akka completion zsh > "${fpath[1]}/_akka"
compinit
```

### Example 5: Enable CLI command completion

```zsh
echo "autoload -U compinit; compinit" >> ~/.zshrc
```

### Example 6: Enable CLI command completion

```fish
akka completion fish > ~/.config/fish/completions/akka.fish
source ~/.config/fish/completions/akka.fish
```

### Example 7: Enable CLI command completion

```powershell
akka completion powershell | Out-String | Invoke-Expression
```

## Related Pages (Internal Links)

- https://doc.akka.io/reference/cli/akka-cli/index.html

---
*Source: [https://doc.akka.io/operations/cli/command-completion.html](https://doc.akka.io/operations/cli/command-completion.html)*