GRAMMAR=Solidity
START_RULE=sourceUnit
GEN_DIR=./parser

JAVAC=javac
.SUFFIXES:.java .class

.java.class:
	$(JAVAC) $*.java

all: generate

generate: $(GRAMMAR).g4 java-parser python3-parser

java-parser: antlr-java java_classes

antlr-java:
	antlr $(GRAMMAR).g4 -o $(GEN_DIR)/java

java_classes:
	$(JAVAC) $(wildcard $(GEN_DIR)/java/*.java)

python3-parser: antlr-python3

antlr-python3: 
	antlr -Dlanguage=Python3 -visitor $(GRAMMAR).g4 -o $(GEN_DIR)/python3 

.PHONY: all grun generate java-parser python3-parser antlr-java antlr-python3

grun:
	cd $(GEN_DIR)/java/; grun $(GRAMMAR) $(START_RULE) -gui

clean:
	rm -f *.class
