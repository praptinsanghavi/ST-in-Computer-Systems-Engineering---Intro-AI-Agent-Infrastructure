$ErrorActionPreference = "SilentlyContinue"

Write-Output "--- Chat Model ---"
Invoke-RestMethod "http://localhost:8080/chat?message=Tell me a joke"
Write-Output "`n--- Embedding Model ---"
$embed = Invoke-RestMethod "http://localhost:8080/embedding?text=Hello"
Write-Output "Dimensions: $($embed.embeddingLength)"
Write-Output "Preview: $($embed.embeddingPreview)"

Write-Output "`n--- Image Model ---"
Invoke-RestMethod "http://localhost:8080/image?message=Simple blue square"

Write-Output "`n--- Speech Model ---"
Invoke-RestMethod "http://localhost:8080/speech?message=Audio Test"
Write-Output "Speech generated (binary output not shown)"

Write-Output "`n--- Document Embedding Model ---"
try {
    Invoke-RestMethod "http://localhost:8080/document-embedding?text=Doc"
} catch {
    Write-Output "Error: $($_.Exception.Message)"
}

Write-Output "`n--- Moderation Model ---"
try {
    Invoke-RestMethod "http://localhost:8080/moderation?message=I love you"
} catch {
    Write-Output "Error: $($_.Exception.Message)"
}
