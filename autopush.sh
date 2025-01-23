#!/bin/bash

# Define the directory to monitor
WATCHED_DIR="/Users/amir/Desktop/GHAcademy/ComputerSystemsandIndustrialProgramming"

# Navigate to the watched directory
cd "$WATCHED_DIR" || exit

# Function to add, commit, and push new files
git_push() {
    FILE="$1"
    echo "New file detected: $FILE"
    git add "$FILE"
    git commit -m "Add new file: $(basename "$FILE")"
    git push
    echo "Successfully pushed $FILE to the repository."
}

# Monitor the directory for new files
fswatch -0 "$WATCHED_DIR" | while read -d "" event
do
    FILE=$(echo "$event" | xargs -0)
    if [ -f "$FILE" ]; then
        git_push "$FILE"
    fi
done
