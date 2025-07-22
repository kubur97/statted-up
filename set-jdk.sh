#!/bin/zsh
# Set JDK to Oracle JDK 24 for this terminal session
# run command: "source set-jdk.sh" to update JDK
export JAVA_HOME="/Library/Java/JavaVirtualMachines/jdk-24.jdk/Contents/Home"
export PATH="$JAVA_HOME/bin:$PATH"
echo "JAVA_HOME set to $JAVA_HOME"
java -version
