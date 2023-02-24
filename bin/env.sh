export CLASSPATH=".:`pwd`/lib/antlr-4.9.2-complete.jar:`pwd`/ws/target/classes:${CLASSPATH}"
export PATH="/opt/homebrew/opt/openjdk/bin:$PATH"
alias antlr4="java -jar `pwd`/lib/antlr-4.9.2-complete.jar"
alias grun="java org.antlr.v4.gui.TestRig"
